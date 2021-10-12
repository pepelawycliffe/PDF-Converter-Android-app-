package com.androidmarket.pdfcreator.util;

import android.app.Activity;

import com.androidmarket.pdfcreator.adapter.AdapterExtractImages;
import com.androidmarket.pdfcreator.adapter.AdapterMergeFiles;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import androidmarket.R;

import com.androidmarket.pdfcreator.pdfModel.HomePageItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static androidmarket.R.drawable.baseline_crop_rotate_24;
import static androidmarket.R.drawable.ic_add_black_24dp;
import static androidmarket.R.drawable.ic_branding_watermark_black_24dp;
import static androidmarket.R.drawable.ic_broken_image_black_24dp;
import static androidmarket.R.drawable.ic_call_split_black_24dp;
import static androidmarket.R.drawable.ic_compress_image;
import static androidmarket.R.drawable.ic_excel;
import static androidmarket.R.drawable.ic_history_black_24dp;
import static androidmarket.R.drawable.ic_image_black_24dp;
import static androidmarket.R.drawable.ic_invert_color_24dp;
import static androidmarket.R.drawable.ic_lock_black_24dp;
import static androidmarket.R.drawable.ic_lock_open_black_24dp;
import static androidmarket.R.drawable.ic_menu_camera;
import static androidmarket.R.drawable.ic_menu_gallery;
import static androidmarket.R.drawable.ic_merge_type_black_24dp;
import static androidmarket.R.drawable.ic_qrcode_24dp;
import static androidmarket.R.drawable.ic_rearrange;
import static androidmarket.R.drawable.ic_remove_circle_black_24dp;
import static androidmarket.R.drawable.ic_text_format_black_24dp;
import static androidmarket.R.drawable.ic_zip_to_pdf;
import static androidmarket.R.id.add_images;
import static androidmarket.R.id.add_images_fav;
import static androidmarket.R.id.add_password;
import static androidmarket.R.id.add_password_fav;
import static androidmarket.R.id.add_text_fav;
import static androidmarket.R.id.add_watermark;
import static androidmarket.R.id.add_watermark_fav;
import static androidmarket.R.id.compress_pdf;
import static androidmarket.R.id.compress_pdf_fav;
import static androidmarket.R.id.excel_to_pdf;
import static androidmarket.R.id.excel_to_pdf_fav;
import static androidmarket.R.id.extract_images;
import static androidmarket.R.id.extract_images_fav;
import static androidmarket.R.id.extract_text;
import static androidmarket.R.id.extract_text_fav;
import static androidmarket.R.id.images_to_pdf_fav;
import static androidmarket.R.id.invert_pdf_fav;
import static androidmarket.R.id.merge_pdf;
import static androidmarket.R.id.merge_pdf_fav;
import static androidmarket.R.id.pdf_to_images;
import static androidmarket.R.id.pdf_to_images_fav;
import static androidmarket.R.id.qr_barcode_to_pdf;
import static androidmarket.R.id.qr_barcode_to_pdf_fav;
import static androidmarket.R.id.rearrange_pages;
import static androidmarket.R.id.rearrange_pages_fav;
import static androidmarket.R.id.remove_duplicates_pages_pdf;
import static androidmarket.R.id.remove_duplicates_pages_pdf_fav;
import static androidmarket.R.id.remove_pages;
import static androidmarket.R.id.remove_pages_fav;
import static androidmarket.R.id.remove_password;
import static androidmarket.R.id.remove_password_fav;
import static androidmarket.R.id.rotate_pages;
import static androidmarket.R.id.rotate_pages_fav;
import static androidmarket.R.id.split_pdf;
import static androidmarket.R.id.split_pdf_fav;
import static androidmarket.R.id.text_to_pdf;
import static androidmarket.R.id.text_to_pdf_fav;
import static androidmarket.R.id.view_files;
import static androidmarket.R.id.view_files_fav;
import static androidmarket.R.id.view_history;
import static androidmarket.R.id.view_history_fav;
import static androidmarket.R.id.zip_to_pdf_fav;
import static androidmarket.R.string.qr_barcode_pdf;


public class CommonCodeUtils {

    Map<Integer, HomePageItem> mFragmentPositionMap;

    /**
     * updates the output recycler view if paths.size > 0
     * else give the main view
     */
    public void populateUtil(Activity mActivity, ArrayList<String> paths,
                             AdapterMergeFiles.OnClickListener onClickListener,
                             RelativeLayout layout, LottieAnimationView animationView,
                             RecyclerView recyclerView) {

        if (paths == null || paths.size() == 0) {
            layout.setVisibility(View.GONE);
        } else {
            // Init recycler view
            recyclerView.setVisibility(View.VISIBLE);
            AdapterMergeFiles adapterMergeFiles = new AdapterMergeFiles(mActivity,
                    paths, false, onClickListener);
            RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(mActivity);
            recyclerView.setLayoutManager(mLayoutManager);
            recyclerView.setAdapter(adapterMergeFiles);
            recyclerView.addItemDecoration(new ViewFilesDividerItemDecoration(mActivity));
        }
        animationView.setVisibility(View.GONE);
    }

    /**
     * sets the appropriate text to success Text View & display images in adapter
     */
    public void updateView(Activity mActivity, int imageCount, ArrayList<String> outputFilePaths,
                           TextView successTextView, LinearLayout options, RecyclerView mCreatedImages,
                           AdapterExtractImages.OnFileItemClickedListener listener) {

        if (imageCount == 0) {
            StringUtils.getInstance().showSnackbar(mActivity, R.string.extract_images_failed);
            return;
        }

        String text = String.format(mActivity.getString(R.string.extract_images_success), imageCount);
        StringUtils.getInstance().showSnackbar(mActivity, text);
        successTextView.setVisibility(View.VISIBLE);
        options.setVisibility(View.VISIBLE);
        AdapterExtractImages adapterExtractImages = new AdapterExtractImages(mActivity, outputFilePaths, listener);
        // init recycler view for displaying generated image list
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(mActivity);
        successTextView.setText(text);
        mCreatedImages.setVisibility(View.VISIBLE);
        mCreatedImages.setLayoutManager(mLayoutManager);
        // set up adapter
        mCreatedImages.setAdapter(adapterExtractImages);
        mCreatedImages.addItemDecoration(new ViewFilesDividerItemDecoration(mActivity));
    }

    public void closeBottomSheetUtil(BottomSheetBehavior sheetBehavior) {
        if (checkSheetBehaviourUtil(sheetBehavior))
            sheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
    }

    public boolean checkSheetBehaviourUtil(BottomSheetBehavior sheetBehavior) {
        return sheetBehavior.getState() == BottomSheetBehavior.STATE_EXPANDED;
    }

    private void addFragmentPosition(boolean homePageItems, int iconA, int iconB,
                                     int iconId, int drawableId, int titleString) {
        mFragmentPositionMap.put(homePageItems ? iconA : iconB, new HomePageItem(iconId, drawableId, titleString));
    }
    

    private static class SingletonHolder {
        static final CommonCodeUtils INSTANCE = new CommonCodeUtils();
    }

    public static CommonCodeUtils getInstance() {
        return CommonCodeUtils.SingletonHolder.INSTANCE;
    }
}
