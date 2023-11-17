package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import androidx.core.content.res.C0820l;

public class SwitchPreference extends TwoStatePreference {

    /* renamed from: L */
    private final C1672a f4789L;

    /* renamed from: M */
    private CharSequence f4790M;

    /* renamed from: N */
    private CharSequence f4791N;

    /* renamed from: androidx.preference.SwitchPreference$a */
    private class C1672a implements CompoundButton.OnCheckedChangeListener {
        C1672a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!SwitchPreference.this.mo5055a(Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                SwitchPreference.this.mo5109L(z);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f4789L = new C1672a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1681g.f4822J0, i, i2);
        mo5112O(C0820l.m3072o(obtainStyledAttributes, C1681g.f4838R0, C1681g.f4824K0));
        mo5111N(C0820l.m3072o(obtainStyledAttributes, C1681g.f4836Q0, C1681g.f4826L0));
        mo5103R(C0820l.m3072o(obtainStyledAttributes, C1681g.f4842T0, C1681g.f4830N0));
        mo5102Q(C0820l.m3072o(obtainStyledAttributes, C1681g.f4840S0, C1681g.f4832O0));
        mo5110M(C0820l.m3059b(obtainStyledAttributes, C1681g.f4834P0, C1681g.f4828M0, false));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: S */
    private void m5862S(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f4797G);
        }
        if (z) {
            Switch switchR = (Switch) view;
            switchR.setTextOn(this.f4790M);
            switchR.setTextOff(this.f4791N);
            switchR.setOnCheckedChangeListener(this.f4789L);
        }
    }

    /* renamed from: T */
    private void m5863T(View view) {
        if (((AccessibilityManager) mo5057c().getSystemService("accessibility")).isEnabled()) {
            m5862S(view.findViewById(16908352));
            mo5113P(view.findViewById(16908304));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo5013D(View view) {
        super.mo5013D(view);
        m5863T(view);
    }

    /* renamed from: Q */
    public void mo5102Q(CharSequence charSequence) {
        this.f4791N = charSequence;
        mo5017w();
    }

    /* renamed from: R */
    public void mo5103R(CharSequence charSequence) {
        this.f4790M = charSequence;
        mo5017w();
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0820l.m3058a(context, C1677c.switchPreferenceStyle, 16843629));
    }
}
