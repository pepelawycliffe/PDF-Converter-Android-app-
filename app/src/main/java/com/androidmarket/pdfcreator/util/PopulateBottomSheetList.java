package com.androidmarket.pdfcreator.util;

import android.os.AsyncTask;

import java.util.ArrayList;

import com.androidmarket.pdfcreator.interfaces.BottomSheetPopulate;

/**
 * AsyncTask used to populate the list of elements in the background
 */
class PopulateBottomSheetList extends AsyncTask<Void, Void, ArrayList<String>> {

    private final BottomSheetPopulate mOnLoadListener;
    private final DirectoryUtils mDirectoryUtils;

    PopulateBottomSheetList(BottomSheetPopulate listener,
                                   DirectoryUtils directoryUtils) {
        mOnLoadListener = listener;
        mDirectoryUtils = directoryUtils;
    }

    @Override
    protected ArrayList<String> doInBackground(Void... voids) {
        return mDirectoryUtils.getAllPDFsOnDevice();
    }

    @Override
    protected void onPostExecute(ArrayList<String> paths) {
        super.onPostExecute(paths);
        mOnLoadListener.onPopulate(paths);
    }

}