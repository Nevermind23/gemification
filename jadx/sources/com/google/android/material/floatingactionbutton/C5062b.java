package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import androidx.core.util.C1008h;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import p026b8.C2170a;
import p026b8.C2171b;
import p026b8.C2173d;

/* renamed from: com.google.android.material.floatingactionbutton.b */
abstract class C5062b implements C5064c {

    /* renamed from: a */
    private final Context f16122a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ExtendedFloatingActionButton f16123b;

    /* renamed from: c */
    private final ArrayList f16124c = new ArrayList();

    /* renamed from: d */
    private final C5061a f16125d;

    /* renamed from: e */
    private C2173d f16126e;

    /* renamed from: f */
    private C2173d f16127f;

    /* renamed from: com.google.android.material.floatingactionbutton.b$a */
    class C5063a extends Property {
        C5063a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
            return Float.valueOf(C2170a.m8290a(Utils.FLOAT_EPSILON, 1.0f, (((float) Color.alpha(extendedFloatingActionButton.getCurrentTextColor())) / 255.0f) / ((float) Color.alpha(extendedFloatingActionButton.f16104U.getColorForState(extendedFloatingActionButton.getDrawableState(), C5062b.this.f16123b.f16104U.getDefaultColor())))));
        }

        /* renamed from: b */
        public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f) {
            int colorForState = extendedFloatingActionButton.f16104U.getColorForState(extendedFloatingActionButton.getDrawableState(), C5062b.this.f16123b.f16104U.getDefaultColor());
            ColorStateList valueOf = ColorStateList.valueOf(Color.argb((int) (C2170a.m8290a(Utils.FLOAT_EPSILON, ((float) Color.alpha(colorForState)) / 255.0f, f.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f.floatValue() == 1.0f) {
                extendedFloatingActionButton.mo16316L(extendedFloatingActionButton.f16104U);
            } else {
                extendedFloatingActionButton.mo16316L(valueOf);
            }
        }
    }

    C5062b(ExtendedFloatingActionButton extendedFloatingActionButton, C5061a aVar) {
        this.f16123b = extendedFloatingActionButton;
        this.f16122a = extendedFloatingActionButton.getContext();
        this.f16125d = aVar;
    }

    /* renamed from: b */
    public C2173d mo16380b() {
        return this.f16127f;
    }

    /* renamed from: c */
    public final void mo16381c(C2173d dVar) {
        this.f16127f = dVar;
    }

    /* renamed from: e */
    public void mo16373e() {
        this.f16125d.mo16378b();
    }

    /* renamed from: g */
    public void mo16369g() {
        this.f16125d.mo16378b();
    }

    /* renamed from: h */
    public AnimatorSet mo16370h() {
        return mo16383l(mo16384m());
    }

    /* renamed from: i */
    public final List mo16382i() {
        return this.f16124c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public AnimatorSet mo16383l(C2173d dVar) {
        ArrayList arrayList = new ArrayList();
        if (dVar.mo7062i("opacity")) {
            arrayList.add(dVar.mo7058f("opacity", this.f16123b, View.ALPHA));
        }
        if (dVar.mo7062i("scale")) {
            arrayList.add(dVar.mo7058f("scale", this.f16123b, View.SCALE_Y));
            arrayList.add(dVar.mo7058f("scale", this.f16123b, View.SCALE_X));
        }
        if (dVar.mo7062i("width")) {
            arrayList.add(dVar.mo7058f("width", this.f16123b, ExtendedFloatingActionButton.f16087W));
        }
        if (dVar.mo7062i("height")) {
            arrayList.add(dVar.mo7058f("height", this.f16123b, ExtendedFloatingActionButton.f16088a0));
        }
        if (dVar.mo7062i("paddingStart")) {
            arrayList.add(dVar.mo7058f("paddingStart", this.f16123b, ExtendedFloatingActionButton.f16089b0));
        }
        if (dVar.mo7062i("paddingEnd")) {
            arrayList.add(dVar.mo7058f("paddingEnd", this.f16123b, ExtendedFloatingActionButton.f16090c0));
        }
        if (dVar.mo7062i("labelOpacity")) {
            arrayList.add(dVar.mo7058f("labelOpacity", this.f16123b, new C5063a(Float.class, "LABEL_OPACITY_PROPERTY")));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        C2171b.m8293a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: m */
    public final C2173d mo16384m() {
        C2173d dVar = this.f16127f;
        if (dVar != null) {
            return dVar;
        }
        if (this.f16126e == null) {
            this.f16126e = C2173d.m8299d(this.f16122a, mo16368f());
        }
        return (C2173d) C1008h.m3530g(this.f16126e);
    }

    public void onAnimationStart(Animator animator) {
        this.f16125d.mo16379c(animator);
    }
}
