// Generated code from Butter Knife. Do not modify!
package com.androidmarket.pdfcreator.fragment;

import android.view.View;
import android.widget.RelativeLayout;
import androidmarket.R;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HistoryFragment_ViewBinding implements Unbinder {
  private HistoryFragment target;

  @UiThread
  public HistoryFragment_ViewBinding(HistoryFragment target, View source) {
    this.target = target;

    target.mEmptyStatusLayout = Utils.findRequiredViewAsType(source, R.id.emptyStatusView, "field 'mEmptyStatusLayout'", RelativeLayout.class);
    target.mHistoryRecyclerView = Utils.findRequiredViewAsType(source, R.id.historyRecyclerView, "field 'mHistoryRecyclerView'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HistoryFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mEmptyStatusLayout = null;
    target.mHistoryRecyclerView = null;
  }
}
