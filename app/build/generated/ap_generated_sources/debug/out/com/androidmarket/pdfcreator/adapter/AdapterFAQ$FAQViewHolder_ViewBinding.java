// Generated code from Butter Knife. Do not modify!
package com.androidmarket.pdfcreator.adapter;

import android.view.View;
import android.widget.TextView;
import androidmarket.R;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AdapterFAQ$FAQViewHolder_ViewBinding implements Unbinder {
  private AdapterFAQ.FAQViewHolder target;

  @UiThread
  public AdapterFAQ$FAQViewHolder_ViewBinding(AdapterFAQ.FAQViewHolder target, View source) {
    this.target = target;

    target.question = Utils.findRequiredViewAsType(source, R.id.question, "field 'question'", TextView.class);
    target.answer = Utils.findRequiredViewAsType(source, R.id.answer, "field 'answer'", TextView.class);
    target.expandableView = Utils.findRequiredViewAsType(source, R.id.expandable_view, "field 'expandableView'", ConstraintLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AdapterFAQ.FAQViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.question = null;
    target.answer = null;
    target.expandableView = null;
  }
}
