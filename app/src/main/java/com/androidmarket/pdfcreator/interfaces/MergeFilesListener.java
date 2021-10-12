package com.androidmarket.pdfcreator.interfaces;

public interface MergeFilesListener {
    void resetValues(boolean isPDFMerged, String path);
    void mergeStarted();
}
