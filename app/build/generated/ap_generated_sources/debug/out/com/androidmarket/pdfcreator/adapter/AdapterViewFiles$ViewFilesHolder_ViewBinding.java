// Generated code from Butter Knife. Do not modify!
package com.androidmarket.pdfcreator.adapter;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidmarket.R;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.balysv.materialripple.MaterialRippleLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AdapterViewFiles$ViewFilesHolder_ViewBinding implements Unbinder {
  private AdapterViewFiles.ViewFilesHolder target;

  @UiThread
  public AdapterViewFiles$ViewFilesHolder_ViewBinding(AdapterViewFiles.ViewFilesHolder target,
      View source) {
    this.target = target;

    target.ripple = Utils.findRequiredViewAsType(source, R.id.fileRipple, "field 'ripple'", MaterialRippleLayout.class);
    target.fileName = Utils.findRequiredViewAsType(source, R.id.fileName, "field 'fileName'", TextView.class);
    target.checkBox = Utils.findRequiredViewAsType(source, R.id.checkbox, "field 'checkBox'", CheckBox.class);
    target.fileDate = Utils.findRequiredViewAsType(source, R.id.fileDate, "field 'fileDate'", TextView.class);
    target.fileSize = Utils.findRequiredViewAsType(source, R.id.fileSize, "field 'fileSize'", TextView.class);
    target.encryptionImage = Utils.findRequiredViewAsType(source, R.id.encryptionImage, "field 'encryptionImage'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AdapterViewFiles.ViewFilesHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ripple = null;
    target.fileName = null;
    target.checkBox = null;
    target.fileDate = null;
    target.fileSize = null;
    target.encryptionImage = null;
  }
}
