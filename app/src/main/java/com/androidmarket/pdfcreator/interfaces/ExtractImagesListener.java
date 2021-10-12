package com.androidmarket.pdfcreator.interfaces;

import java.util.ArrayList;

public interface ExtractImagesListener {
    void resetView();
    void extractionStarted();
    void updateView(int imageCount, ArrayList<String> outputFilePaths);
}