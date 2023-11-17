package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import g91.C32290b1;
import g91.C32335t0;
import p366bk.C10330s;

@Deprecated
/* renamed from: ge.bog.mobilebank.ui.views.widgets.BogImageView */
public class BogImageView extends AppCompatImageView {
    public BogImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public void applyAccentTint() {
        applyTint(C32335t0.m95359d(getContext(), true));
    }

    public void applyAccentTintSafe() {
        if (C32335t0.m95361f() != 0) {
            applyAccentTint();
        }
    }

    public void applyPrimaryTint() {
        applyTint(C32335t0.m95367l(getContext(), true));
    }

    public void applyPrimaryTintSafe() {
        if (C32335t0.m95361f() != 0) {
            applyPrimaryTint();
        }
    }

    public void applyTint(int i) {
        if (getDrawable() != null && C32335t0.m95361f() != 0) {
            setImageDrawable(C32290b1.m95122l(getContext(), getDrawable(), i));
        }
    }

    public void applyTintColor(int i) {
        if (getDrawable() != null && C32335t0.m95361f() != 0) {
            setImageDrawable(C32290b1.m95123m(getDrawable(), i));
        }
    }

    public void setTint(int i) {
        if (C32335t0.m95361f() == 0) {
            return;
        }
        if (i == 0) {
            applyAccentTint();
        } else if (i == 1) {
            applyPrimaryTint();
        }
    }

    public BogImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BogImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        int i3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10330s.f29283e0);
        if (obtainStyledAttributes != null) {
            i2 = obtainStyledAttributes.getInt(C10330s.f29303g0, -1);
            i3 = obtainStyledAttributes.getColor(C10330s.f29293f0, -1);
            obtainStyledAttributes.recycle();
        } else {
            i2 = -1;
            i3 = -1;
        }
        setTint(i2);
        if (i3 != -1) {
            applyTintColor(i3);
        }
    }
}
