// Generated code from Butter Knife. Do not modify!
package com.androidmarket.pdfcreator.adapter;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidmarket.R;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AdapterRearrangeImages$ViewHolder_ViewBinding implements Unbinder {
  private AdapterRearrangeImages.ViewHolder target;

  @UiThread
  public AdapterRearrangeImages$ViewHolder_ViewBinding(AdapterRearrangeImages.ViewHolder target,
      View source) {
    this.target = target;

    target.imageView = Utils.findRequiredViewAsType(source, R.id.image, "field 'imageView'", ImageView.class);
    target.buttonUp = Utils.findRequiredViewAsType(source, R.id.buttonUp, "field 'buttonUp'", ImageButton.class);
    target.buttonDown = Utils.findRequiredViewAsType(source, R.id.buttonDown, "field 'buttonDown'", ImageButton.class);
    target.pageNumber = Utils.findRequiredViewAsType(source, R.id.pageNumber, "field 'pageNumber'", TextView.class);
    target.mRemoveImage = Utils.findRequiredViewAsType(source, R.id.removeImage, "field 'mRemoveImage'", ImageButton.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AdapterRearrangeImages.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.imageView = null;
    target.buttonUp = null;
    target.buttonDown = null;
    target.pageNumber = null;
    target.mRemoveImage = null;
  }
}
