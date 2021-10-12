package com.androidmarket.pdfcreator.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.preference.PreferenceManager;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.afollestad.materialdialogs.MaterialDialog;

import java.util.ArrayList;
import java.util.Objects;

import androidmarket.R;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.androidmarket.pdfcreator.adapter.AdapterRearrangePdf;
import com.androidmarket.pdfcreator.Constants;
import com.androidmarket.pdfcreator.util.DialogUtils;
import com.androidmarket.pdfcreator.util.ThemeUtils;

import static com.androidmarket.pdfcreator.Constants.CHOICE_REMOVE_IMAGE;
import static com.androidmarket.pdfcreator.Constants.RESULT;
import static com.androidmarket.pdfcreator.Constants.SAME_FILE;

public class ActivityRearrangePdfPages extends AppCompatActivity implements AdapterRearrangePdf.OnClickListener {

    @BindView(R.id.recyclerView)
    RecyclerView mRecyclerView;
    @BindView(R.id.sort)
    Button sortButton;

    public static ArrayList<Bitmap> mImages;
    private AdapterRearrangePdf mRearrangeImagesAdapter;
    private SharedPreferences mSharedPreferences;
    private ArrayList<Integer> mSequence, mInitialSequence;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        ThemeUtils.getInstance().setThemeApp(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rearrange_images);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ButterKnife.bind(this);

        mSequence = new ArrayList<>();
        mInitialSequence = new ArrayList<>();
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        sortButton.setVisibility(View.GONE);
        if (mImages == null || mImages.size() < 1) {
            finish();
        } else
            initRecyclerView(mImages);
    }

    private void initRecyclerView(ArrayList<Bitmap> images) {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(layoutManager);
        mRearrangeImagesAdapter = new AdapterRearrangePdf(this, images, this);
        recyclerView.setAdapter(mRearrangeImagesAdapter);
        mSequence = new ArrayList<>();
        for ( int i = 0; i < images.size(); i++) {
            mSequence.add(i + 1);
        }
        mInitialSequence.addAll(mSequence);
    }

    /**
     * Swaps values at given positions
     * @param pos1 - first value
     * @param pos2 - second value
     */
    private void swap(int pos1, int pos2) {
        if (pos1 >= mSequence.size())
            return;
        int val = mSequence.get(pos1);
        mSequence.set(pos1, mSequence.get(pos2));
        mSequence.set(pos2, val);
    }

    @Override
    public void onUpClick(int position) {
        mImages.add(position - 1, mImages.remove(position));
        mRearrangeImagesAdapter.positionChanged(mImages);
        swap(position, position - 1);
    }

    @Override
    public void onDownClick(int position) {
        mImages.add(position + 1, mImages.remove(position));
        mRearrangeImagesAdapter.positionChanged(mImages);
        swap(position, position + 1);
    }

    @Override
    public void onRemoveClick(int position) {
        if (mSharedPreferences.getBoolean(Constants.CHOICE_REMOVE_IMAGE, false)) {
            mImages.remove(position);
            mRearrangeImagesAdapter.positionChanged(mImages);
            mSequence.remove(position);
        } else {
            MaterialDialog.Builder builder = DialogUtils.getInstance().createWarningDialog(this,
                    R.string.remove_page_message);
            builder.checkBoxPrompt(getString(R.string.dont_show_again), false, null)
                    .onPositive((dialog, which) -> {
                        if (dialog.isPromptCheckBoxChecked()) {
                            SharedPreferences.Editor editor = mSharedPreferences.edit();
                            editor.putBoolean(CHOICE_REMOVE_IMAGE, true);
                            editor.apply();
                        }
                        mImages.remove(position);
                        mRearrangeImagesAdapter.positionChanged(mImages);
                        mSequence.remove(position);
                    })
                    .show();
        }
    }

    private void passUris() {
        Intent returnIntent = new Intent();
        StringBuilder result = new StringBuilder();
        for ( int x : mSequence)
            result.append(x).append(",");
        returnIntent.putExtra(RESULT, result.toString());
        boolean sameFile = mInitialSequence.equals(mSequence);
        returnIntent.putExtra(SAME_FILE, sameFile);
        setResult(Activity.RESULT_OK, returnIntent);
        finish();
    }

    @Override
    public void onBackPressed() {
        passUris();
        super.onBackPressed();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            passUris();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public static Intent getStartIntent(Context context) {
        return new Intent(context, ActivityRearrangePdfPages.class);
    }
}

