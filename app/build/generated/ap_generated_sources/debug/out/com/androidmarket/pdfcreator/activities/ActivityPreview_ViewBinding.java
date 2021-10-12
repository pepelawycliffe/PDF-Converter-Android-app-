// Generated code from Butter Knife. Do not modify!
package com.androidmarket.pdfcreator.activities;

import android.view.View;
import androidmarket.R;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ActivityPreview_ViewBinding implements Unbinder {
  private ActivityPreview target;

  @UiThread
  public ActivityPreview_ViewBinding(ActivityPreview target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ActivityPreview_ViewBinding(ActivityPreview target, View source) {
    this.target = target;

    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerView, "field 'mRecyclerView'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ActivityPreview target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecyclerView = null;
  }
}
