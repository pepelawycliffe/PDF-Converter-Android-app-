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

public class AdapterFilesList$ViewMergeFilesHolder_ViewBinding implements Unbinder {
  private AdapterFilesList.ViewMergeFilesHolder target;

  @UiThread
  public AdapterFilesList$ViewMergeFilesHolder_ViewBinding(
      AdapterFilesList.ViewMergeFilesHolder target, View source) {
    this.target = target;

    target.mFileName = Utils.findRequiredViewAsType(source, R.id.fileName, "field 'mFileName'", TextView.class);
    target.mEncryptionImage = Utils.findRequiredViewAsType(source, R.id.encryptionImage, "field 'mEncryptionImage'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AdapterFilesList.ViewMergeFilesHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mFileName = null;
    target.mEncryptionImage = null;
  }
}
