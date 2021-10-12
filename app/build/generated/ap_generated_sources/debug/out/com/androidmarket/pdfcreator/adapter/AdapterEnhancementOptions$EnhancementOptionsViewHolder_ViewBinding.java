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

public class AdapterEnhancementOptions$EnhancementOptionsViewHolder_ViewBinding implements Unbinder {
  private AdapterEnhancementOptions.EnhancementOptionsViewHolder target;

  @UiThread
  public AdapterEnhancementOptions$EnhancementOptionsViewHolder_ViewBinding(
      AdapterEnhancementOptions.EnhancementOptionsViewHolder target, View source) {
    this.target = target;

    target.optionImage = Utils.findRequiredViewAsType(source, R.id.option_image, "field 'optionImage'", ImageView.class);
    target.optionName = Utils.findRequiredViewAsType(source, R.id.option_name, "field 'optionName'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AdapterEnhancementOptions.EnhancementOptionsViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.optionImage = null;
    target.optionName = null;
  }
}
