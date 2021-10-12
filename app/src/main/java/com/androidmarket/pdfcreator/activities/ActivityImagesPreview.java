package com.androidmarket.pdfcreator.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import com.eftimoff.viewpagertransformers.DepthPageTransformer;

import java.util.ArrayList;

import androidmarket.R;
import butterknife.ButterKnife;
import com.androidmarket.pdfcreator.adapter.AdapterPreview;
import com.androidmarket.pdfcreator.util.ThemeUtils;

import static com.androidmarket.pdfcreator.Constants.PREVIEW_IMAGES;

public class ActivityImagesPreview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ThemeUtils.getInstance().setThemeApp(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview_images);

        ButterKnife.bind(this);
        // Extract mImagesArrayList uri array from the intent
        Intent intent = getIntent();
        ArrayList<String> mImagesArrayList = intent.getStringArrayListExtra(PREVIEW_IMAGES);

        ViewPager mViewPager = findViewById(R.id.viewpager);
        AdapterPreview mAdapterPreview = new AdapterPreview(this, mImagesArrayList);
        mViewPager.setAdapter(mAdapterPreview);
        mViewPager.setPageTransformer(true, new DepthPageTransformer());
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }

    /**
     * get start intent for this activities
     * @param context - context to start activities from
     * @param uris - extra images uri
     * @return - start intent
     */
    public static Intent getStartIntent(Context context, ArrayList<String>  uris) {
        Intent intent = new Intent(context, ActivityImagesPreview.class);
        intent.putExtra(PREVIEW_IMAGES, uris);
        return intent;
    }
}