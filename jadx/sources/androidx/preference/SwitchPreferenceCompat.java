package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.res.C0820l;

public class SwitchPreferenceCompat extends TwoStatePreference {

    /* renamed from: L */
    private final C1673a f4793L;

    /* renamed from: M */
    private CharSequence f4794M;

    /* renamed from: N */
    private CharSequence f4795N;

    /* renamed from: androidx.preference.SwitchPreferenceCompat$a */
    private class C1673a implements CompoundButton.OnCheckedChangeListener {
        C1673a() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!SwitchPreferenceCompat.this.mo5055a(Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                SwitchPreferenceCompat.this.mo5109L(z);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f4793L = new C1673a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1681g.f4844U0, i, i2);
        mo5112O(C0820l.m3072o(obtainStyledAttributes, C1681g.f4863c1, C1681g.f4846V0));
        mo5111N(C0820l.m3072o(obtainStyledAttributes, C1681g.f4860b1, C1681g.f4848W0));
        mo5106R(C0820l.m3072o(obtainStyledAttributes, C1681g.f4869e1, C1681g.f4852Y0));
        mo5105Q(C0820l.m3072o(obtainStyledAttributes, C1681g.f4866d1, C1681g.f4854Z0));
        mo5110M(C0820l.m3059b(obtainStyledAttributes, C1681g.f4857a1, C1681g.f4850X0, false));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: S */
    private void m5867S(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f4797G);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f4794M);
            switchCompat.setTextOff(this.f4795N);
            switchCompat.setOnCheckedChangeListener(this.f4793L);
        }
    }

    /* renamed from: T */
    private void m5868T(View view) {
        if (((AccessibilityManager) mo5057c().getSystemService("accessibility")).isEnabled()) {
            m5867S(view.findViewById(C1678d.switchWidget));
            mo5113P(view.findViewById(16908304));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo5013D(View view) {
        super.mo5013D(view);
        m5868T(view);
    }

    /* renamed from: Q */
    public void mo5105Q(CharSequence charSequence) {
        this.f4795N = charSequence;
        mo5017w();
    }

    /* renamed from: R */
    public void mo5106R(CharSequence charSequence) {
        this.f4794M = charSequence;
        mo5017w();
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1677c.switchPreferenceCompatStyle);
    }
}
