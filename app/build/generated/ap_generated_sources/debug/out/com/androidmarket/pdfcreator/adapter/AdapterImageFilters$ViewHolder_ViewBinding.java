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

public class AdapterImageFilters$ViewHolder_ViewBinding implements Unbinder {
  private AdapterImageFilters.ViewHolder target;

  @UiThread
  public AdapterImageFilters$ViewHolder_ViewBinding(AdapterImageFilters.ViewHolder target,
      View source) {
    this.target = target;

    target.img = Utils.findRequiredViewAsType(source, R.id.filter_preview, "field 'img'", ImageView.class);
    target.name = Utils.findRequiredViewAsType(source, R.id.filter_Name, "field 'name'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AdapterImageFilters.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.img = null;
    target.name = null;
  }
}
