// Generated code from Butter Knife. Do not modify!
package com.androidmarket.pdfcreator.fragment;

import android.view.View;
import androidmarket.R;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SettingsFragment_ViewBinding implements Unbinder {
  private SettingsFragment target;

  @UiThread
  public SettingsFragment_ViewBinding(SettingsFragment target, View source) {
    this.target = target;

    target.mEnhancementOptionsRecycleView = Utils.findRequiredViewAsType(source, R.id.settings_list, "field 'mEnhancementOptionsRecycleView'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SettingsFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mEnhancementOptionsRecycleView = null;
  }
}
