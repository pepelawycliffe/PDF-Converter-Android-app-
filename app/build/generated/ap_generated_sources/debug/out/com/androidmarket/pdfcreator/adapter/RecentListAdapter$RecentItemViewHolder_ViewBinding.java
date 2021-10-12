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

public class RecentListAdapter$RecentItemViewHolder_ViewBinding implements Unbinder {
  private RecentListAdapter.RecentItemViewHolder target;

  @UiThread
  public RecentListAdapter$RecentItemViewHolder_ViewBinding(
      RecentListAdapter.RecentItemViewHolder target, View source) {
    this.target = target;

    target.icon = Utils.findRequiredViewAsType(source, R.id.option_image, "field 'icon'", ImageView.class);
    target.name = Utils.findRequiredViewAsType(source, R.id.option_name, "field 'name'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RecentListAdapter.RecentItemViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.icon = null;
    target.name = null;
  }
}
