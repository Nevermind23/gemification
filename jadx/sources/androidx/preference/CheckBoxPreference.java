package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.core.content.res.C0820l;

public class CheckBoxPreference extends TwoStatePreference {

    /* renamed from: L */
    private final C1657a f4704L;

    /* renamed from: androidx.preference.CheckBoxPreference$a */
    private class C1657a implements CompoundButton.OnCheckedChangeListener {
        C1657a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!CheckBoxPreference.this.mo5055a(Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                CheckBoxPreference.this.mo5109L(z);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* renamed from: Q */
    private void m5778Q(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f4797G);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f4704L);
        }
    }

    /* renamed from: R */
    private void m5779R(View view) {
        if (((AccessibilityManager) mo5057c().getSystemService("accessibility")).isEnabled()) {
            m5778Q(view.findViewById(16908289));
            mo5113P(view.findViewById(16908304));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo5013D(View view) {
        super.mo5013D(view);
        m5779R(view);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f4704L = new C1657a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1681g.f4858b, i, i2);
        mo5112O(C0820l.m3072o(obtainStyledAttributes, C1681g.f4874h, C1681g.f4861c));
        mo5111N(C0820l.m3072o(obtainStyledAttributes, C1681g.f4872g, C1681g.f4864d));
        mo5110M(C0820l.m3059b(obtainStyledAttributes, C1681g.f4870f, C1681g.f4867e, false));
        obtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0820l.m3058a(context, C1677c.checkBoxPreferenceStyle, 16842895));
    }
}
