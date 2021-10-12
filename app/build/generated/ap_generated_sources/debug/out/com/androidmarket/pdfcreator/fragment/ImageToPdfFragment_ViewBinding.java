// Generated code from Butter Knife. Do not modify!
package com.androidmarket.pdfcreator.fragment;

import android.view.View;
import android.widget.TextView;
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

public class ImageToPdfFragment_ViewBinding implements Unbinder {
  private ImageToPdfFragment target;

  private View view7f0a0209;

  private View view7f0a020a;

  private View view7f0a0057;

  @UiThread
  public ImageToPdfFragment_ViewBinding(final ImageToPdfFragment target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.pdfCreate, "field 'mCreatePdf' and method 'pdfCreateClicked'");
    target.mCreatePdf = Utils.castView(view, R.id.pdfCreate, "field 'mCreatePdf'", CardView.class);
    view7f0a0209 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.pdfCreateClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.pdfOpen, "field 'mOpenPdf' and method 'openPdf'");
    target.mOpenPdf = Utils.castView(view, R.id.pdfOpen, "field 'mOpenPdf'", CardView.class);
    view7f0a020a = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.openPdf();
      }
    });
    target.mEnhancementOptionsRecycleView = Utils.findRequiredViewAsType(source, R.id.enhancement_options_recycle_view, "field 'mEnhancementOptionsRecycleView'", RecyclerView.class);
    target.mNoOfImages = Utils.findRequiredViewAsType(source, R.id.tvNoOfImages, "field 'mNoOfImages'", TextView.class);
    view = Utils.findRequiredView(source, R.id.addImages, "method 'startAddingImages'");
    view7f0a0057 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.startAddingImages();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    ImageToPdfFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mCreatePdf = null;
    target.mOpenPdf = null;
    target.mEnhancementOptionsRecycleView = null;
    target.mNoOfImages = null;

    view7f0a0209.setOnClickListener(null);
    view7f0a0209 = null;
    view7f0a020a.setOnClickListener(null);
    view7f0a020a = null;
    view7f0a0057.setOnClickListener(null);
    view7f0a0057 = null;
  }
}
