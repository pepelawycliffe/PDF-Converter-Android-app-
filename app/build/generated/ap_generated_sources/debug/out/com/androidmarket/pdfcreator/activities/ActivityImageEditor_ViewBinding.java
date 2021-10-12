// Generated code from Butter Knife. Do not modify!
package com.androidmarket.pdfcreator.activities;

import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidmarket.R;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import ja.burhanrashid52.photoeditor.PhotoEditorView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ActivityImageEditor_ViewBinding implements Unbinder {
  private ActivityImageEditor target;

  private View view7f0a01da;

  private View view7f0a0214;

  private View view7f0a0249;

  private View view7f0a0237;

  @UiThread
  public ActivityImageEditor_ViewBinding(ActivityImageEditor target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ActivityImageEditor_ViewBinding(final ActivityImageEditor target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.nextimageButton, "field 'nextButton' and method 'nextImg'");
    target.nextButton = Utils.castView(view, R.id.nextimageButton, "field 'nextButton'", ImageView.class);
    view7f0a01da = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.nextImg();
      }
    });
    target.imageCount = Utils.findRequiredViewAsType(source, R.id.imagecount, "field 'imageCount'", TextView.class);
    view = Utils.findRequiredView(source, R.id.previousImageButton, "field 'previousButton' and method 'previousImg'");
    target.previousButton = Utils.castView(view, R.id.previousImageButton, "field 'previousButton'", ImageView.class);
    view7f0a0214 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.previousImg();
      }
    });
    target.doodleSeekBar = Utils.findRequiredViewAsType(source, R.id.doodleSeekBar, "field 'doodleSeekBar'", SeekBar.class);
    target.photoEditorView = Utils.findRequiredViewAsType(source, R.id.photoEditorView, "field 'photoEditorView'", PhotoEditorView.class);
    target.brushColorsView = Utils.findRequiredViewAsType(source, R.id.doodle_colors, "field 'brushColorsView'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.savecurrent, "method 'saveC'");
    view7f0a0249 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.saveC();
      }
    });
    view = Utils.findRequiredView(source, R.id.resetCurrent, "method 'resetCurrent'");
    view7f0a0237 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.resetCurrent();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    ActivityImageEditor target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.nextButton = null;
    target.imageCount = null;
    target.previousButton = null;
    target.doodleSeekBar = null;
    target.photoEditorView = null;
    target.brushColorsView = null;

    view7f0a01da.setOnClickListener(null);
    view7f0a01da = null;
    view7f0a0214.setOnClickListener(null);
    view7f0a0214 = null;
    view7f0a0249.setOnClickListener(null);
    view7f0a0249 = null;
    view7f0a0237.setOnClickListener(null);
    view7f0a0237 = null;
  }
}
