// Generated code from Butter Knife. Do not modify!
package com.androidmarket.pdfcreator.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidmarket.R;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AdapterExtractImages$ViewMergeFilesHolder_ViewBinding implements Unbinder {
  private AdapterExtractImages.ViewMergeFilesHolder target;

  @UiThread
  public AdapterExtractImages$ViewMergeFilesHolder_ViewBinding(
      AdapterExtractImages.ViewMergeFilesHolder target, View source) {
    this.target = target;

    target.mFileName = Utils.findRequiredViewAsType(source, R.id.fileName, "field 'mFileName'", TextView.class);
    target.mImagePreview = Utils.findRequiredViewAsType(source, R.id.imagePreview, "field 'mImagePreview'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AdapterExtractImages.ViewMergeFilesHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mFileName = null;
    target.mImagePreview = null;
  }
}
