package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.C0767a;
import g91.C32355x0;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10330s;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.BogButton */
public class BogButton extends AppCompatButton {
    protected boolean activated;
    protected boolean dark;
    protected boolean flat;

    public BogButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public boolean isDark() {
        return this.dark;
    }

    public boolean isFlat() {
        return this.flat;
    }

    public boolean isOrange() {
        return this.activated;
    }

    public void setFlat(boolean z) {
        setClickable(true);
        this.flat = true;
        this.dark = z;
        if (!z) {
            setBackgroundResource(C10320i.bog_button_rounded_white_selector);
            setTextColor(C32355x0.m95515f(C10318g.bog_button_rounded_white_text_selector, getContext()));
            return;
        }
        setBackgroundResource(C10320i.bog_button_rounded_selector);
        setTextColor(C32355x0.m95515f(C10318g.bog_button_rounded_dark_text_selector, getContext()));
    }

    public void setOrange(boolean z, boolean z2) {
        setOrange(z, z2, false);
    }

    public void setRed(String str) {
        setBackgroundResource(C10320i.bog_button_red_selector);
        setTextColor(C0767a.m2893c(getContext(), C10318g.bog_button_active_text_selector));
        setText(str);
        setClickable(true);
        this.activated = true;
    }

    public BogButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setOrange(boolean z, boolean z2, boolean z3) {
        setClickable(z2);
        this.flat = false;
        if (!z && (this.activated || z3)) {
            setBackgroundResource(C10320i.bog_button_normal_selector);
            setTextColor(-16777216);
        } else if (z && (!this.activated || z3)) {
            setBackgroundResource(C10320i.bog_button_activated_selector);
            setTextColor(C0767a.m2893c(getContext(), C10318g.bog_button_active_text_selector));
        }
        this.activated = z;
    }

    public BogButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10330s.f29158S);
        if (obtainStyledAttributes != null) {
            this.flat = obtainStyledAttributes.getBoolean(C10330s.f29188V, false);
            this.dark = obtainStyledAttributes.getBoolean(C10330s.f29178U, false);
            z = obtainStyledAttributes.getBoolean(C10330s.f29168T, false);
            obtainStyledAttributes.recycle();
        } else {
            z = false;
        }
        if (this.flat) {
            setFlat(this.dark);
        }
        int i2 = 1;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{16843091});
        setMaxLines(obtainStyledAttributes2 != null ? obtainStyledAttributes2.getInt(0, 1) : i2);
        setEllipsize(TextUtils.TruncateAt.END);
        setOrange(z);
    }

    public void setOrange(boolean z) {
        setOrange(z, true);
    }
}
