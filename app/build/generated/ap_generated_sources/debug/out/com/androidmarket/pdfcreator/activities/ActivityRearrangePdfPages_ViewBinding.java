// Generated code from Butter Knife. Do not modify!
package com.androidmarket.pdfcreator.activities;

import android.view.View;
import android.widget.Button;
import androidmarket.R;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ActivityRearrangePdfPages_ViewBinding implements Unbinder {
  private ActivityRearrangePdfPages target;

  @UiThread
  public ActivityRearrangePdfPages_ViewBinding(ActivityRearrangePdfPages target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ActivityRearrangePdfPages_ViewBinding(ActivityRearrangePdfPages target, View source) {
    this.target = target;

    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerView, "field 'mRecyclerView'", RecyclerView.class);
    target.sortButton = Utils.findRequiredViewAsType(source, R.id.sort, "field 'sortButton'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ActivityRearrangePdfPages target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecyclerView = null;
    target.sortButton = null;
  }
}
