// Generated code from Butter Knife. Do not modify!
package com.androidmarket.pdfcreator.adapter;

import android.view.View;
import android.widget.Button;
import androidmarket.R;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AdapterBrushItem$BrushItemViewHolder_ViewBinding implements Unbinder {
  private AdapterBrushItem.BrushItemViewHolder target;

  @UiThread
  public AdapterBrushItem$BrushItemViewHolder_ViewBinding(
      AdapterBrushItem.BrushItemViewHolder target, View source) {
    this.target = target;

    target.doodleButton = Utils.findRequiredViewAsType(source, R.id.doodle_color, "field 'doodleButton'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AdapterBrushItem.BrushItemViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.doodleButton = null;
  }
}
