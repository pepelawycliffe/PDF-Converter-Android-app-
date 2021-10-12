// Generated code from Butter Knife. Do not modify!
package com.androidmarket.pdfcreator.fragment.texttopdf;

import android.view.View;
import androidmarket.R;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class TextToPdfFragment_ViewBinding implements Unbinder {
  private TextToPdfFragment target;

  private View view7f0a0262;

  private View view7f0a00c7;

  @UiThread
  public TextToPdfFragment_ViewBinding(final TextToPdfFragment target, View source) {
    this.target = target;

    View view;
    target.mTextEnhancementOptionsRecycleView = Utils.findRequiredViewAsType(source, R.id.enhancement_options_recycle_view_text, "field 'mTextEnhancementOptionsRecycleView'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.selectFile, "field 'mSelectFile' and method 'selectTextFile'");
    target.mSelectFile = Utils.castView(view, R.id.selectFile, "field 'mSelectFile'", CardView.class);
    view7f0a0262 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.selectTextFile();
      }
    });
    view = Utils.findRequiredView(source, R.id.createtextpdf, "field 'mCreateTextPdf' and method 'openCreateTextPdf'");
    target.mCreateTextPdf = Utils.castView(view, R.id.createtextpdf, "field 'mCreateTextPdf'", CardView.class);
    view7f0a00c7 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.openCreateTextPdf();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    TextToPdfFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mTextEnhancementOptionsRecycleView = null;
    target.mSelectFile = null;
    target.mCreateTextPdf = null;

    view7f0a0262.setOnClickListener(null);
    view7f0a0262 = null;
    view7f0a00c7.setOnClickListener(null);
    view7f0a00c7 = null;
  }
}
