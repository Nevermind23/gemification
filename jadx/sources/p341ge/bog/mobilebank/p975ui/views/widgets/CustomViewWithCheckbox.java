package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0767a;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p366bk.C10318g;
import p366bk.C10320i;
import p90.C27312g8;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.CustomViewWithCheckbox */
public final class CustomViewWithCheckbox extends ConstraintLayout {
    private String amountText;
    private final C27312g8 binding;
    private boolean isActive;
    private boolean isChecked;
    private C43075l onCheckedListener;
    private String subTitleText;
    private String titleText;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CustomViewWithCheckbox(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    public static final void binding$lambda$1$lambda$0(CustomViewWithCheckbox customViewWithCheckbox, View view) {
        C41536l.m120489i(customViewWithCheckbox, "this$0");
        if (customViewWithCheckbox.isActive) {
            customViewWithCheckbox.setChecked(!customViewWithCheckbox.isChecked);
        }
    }

    public final String getAmountText() {
        return this.amountText;
    }

    public final C27312g8 getBinding() {
        return this.binding;
    }

    public final C43075l getOnCheckedListener() {
        return this.onCheckedListener;
    }

    public final String getSubTitleText() {
        return this.subTitleText;
    }

    public final String getTitleText() {
        return this.titleText;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final boolean isChecked() {
        return this.isChecked;
    }

    public final void setActive(boolean z) {
        int i;
        int i2;
        this.isActive = z;
        if (this.isChecked) {
            ImageView imageView = this.binding.f68836f;
            Context context = getContext();
            if (z) {
                i2 = C10320i.ic_checkbox_active;
            } else {
                i2 = C10320i.ic_checkbox_active_unclickable;
            }
            imageView.setImageDrawable(C0767a.m2895e(context, i2));
        }
        C27312g8 g8Var = this.binding;
        for (BogTextView bogTextView : C41341q.m119910m(g8Var.f68837g, g8Var.f68838h)) {
            Context context2 = getContext();
            if (z) {
                i = C10318g.dark_text_color_333;
            } else {
                i = C10318g.disabled_color;
            }
            bogTextView.setTextColor(C0767a.m2893c(context2, i));
        }
    }

    public final void setAmountText(String str) {
        C41536l.m120489i(str, C11755a.C11756a.f34100b);
        this.amountText = str;
        this.binding.f68838h.setText(str);
    }

    public final void setChecked(boolean z) {
        int i;
        C43075l lVar = this.onCheckedListener;
        boolean z2 = false;
        if (lVar != null && !((Boolean) lVar.invoke(Boolean.valueOf(z))).booleanValue()) {
            z2 = true;
        }
        if (!z2) {
            this.isChecked = z;
            ImageView imageView = this.binding.f68836f;
            Context context = getContext();
            if (this.isActive && z) {
                i = C10320i.ic_checkbox_active;
            } else if (!z) {
                i = C10320i.ic_checkbox_inactive;
            } else {
                i = C10320i.ic_checkbox_active_unclickable;
            }
            imageView.setImageDrawable(C0767a.m2895e(context, i));
        }
    }

    public final void setDividerVisibility(boolean z) {
        this.binding.f68835e.setVisibility(z ? 0 : 4);
    }

    public final void setOnCheckedListener(C43075l lVar) {
        this.onCheckedListener = lVar;
    }

    public final void setSubTitleText(String str) {
        int i;
        C41536l.m120489i(str, C11755a.C11756a.f34100b);
        this.subTitleText = str;
        this.binding.f68839i.setText(str);
        BogTextView bogTextView = this.binding.f68839i;
        if (C40439w.m117118v(str)) {
            i = 8;
        } else {
            i = 0;
        }
        bogTextView.setVisibility(i);
    }

    public final void setTitleText(String str) {
        C41536l.m120489i(str, C11755a.C11756a.f34100b);
        this.titleText = str;
        this.binding.f68837g.setText(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CustomViewWithCheckbox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CustomViewWithCheckbox(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomViewWithCheckbox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C27312g8 c = C27312g8.m84556c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(LayoutInflater.from(context), this)");
        c.mo3946b().setOnClickListener(new C35813l(this));
        this.binding = c;
        this.isActive = true;
        this.titleText = "";
        this.subTitleText = "";
        this.amountText = "";
    }
}
