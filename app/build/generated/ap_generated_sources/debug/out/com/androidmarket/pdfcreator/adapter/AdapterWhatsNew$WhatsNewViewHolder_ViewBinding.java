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

public class AdapterWhatsNew$WhatsNewViewHolder_ViewBinding implements Unbinder {
  private AdapterWhatsNew.WhatsNewViewHolder target;

  @UiThread
  public AdapterWhatsNew$WhatsNewViewHolder_ViewBinding(AdapterWhatsNew.WhatsNewViewHolder target,
      View source) {
    this.target = target;

    target.tvHeading = Utils.findRequiredViewAsType(source, R.id.title, "field 'tvHeading'", TextView.class);
    target.tvDescription = Utils.findRequiredViewAsType(source, R.id.description, "field 'tvDescription'", TextView.class);
    target.icon = Utils.findRequiredViewAsType(source, R.id.icon, "field 'icon'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AdapterWhatsNew.WhatsNewViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvHeading = null;
    target.tvDescription = null;
    target.icon = null;
  }
}
