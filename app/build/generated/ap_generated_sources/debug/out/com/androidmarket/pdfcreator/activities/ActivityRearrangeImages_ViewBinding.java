// Generated code from Butter Knife. Do not modify!
package com.androidmarket.pdfcreator.activities;

import android.view.View;
import androidmarket.R;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ActivityRearrangeImages_ViewBinding implements Unbinder {
  private ActivityRearrangeImages target;

  private View view7f0a027d;

  @UiThread
  public ActivityRearrangeImages_ViewBinding(ActivityRearrangeImages target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ActivityRearrangeImages_ViewBinding(final ActivityRearrangeImages target, View source) {
    this.target = target;

    View view;
    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerView, "field 'mRecyclerView'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.sort, "method 'sortImg'");
    view7f0a027d = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.sortImg();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    ActivityRearrangeImages target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecyclerView = null;

    view7f0a027d.setOnClickListener(null);
    view7f0a027d = null;
  }
}
