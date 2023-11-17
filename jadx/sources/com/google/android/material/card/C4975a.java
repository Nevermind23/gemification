package com.google.android.material.card;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.C0836a;
import androidx.core.view.ViewCompat;
import com.github.mikephil.charting.utils.Utils;
import p009a8.C0072b;
import p009a8.C0076f;
import p009a8.C0081k;
import p009a8.C0082l;
import p080f8.C6170a;
import p184n8.C7343c;
import p197o8.C7492b;
import p223q8.C7919d;
import p223q8.C7920e;
import p223q8.C7922g;
import p223q8.C7928j;
import p223q8.C7929k;

/* renamed from: com.google.android.material.card.a */
class C4975a {

    /* renamed from: u */
    private static final double f15763u = Math.cos(Math.toRadians(45.0d));

    /* renamed from: v */
    private static final Drawable f15764v;

    /* renamed from: a */
    private final MaterialCardView f15765a;

    /* renamed from: b */
    private final Rect f15766b = new Rect();

    /* renamed from: c */
    private final C7922g f15767c;

    /* renamed from: d */
    private final C7922g f15768d;

    /* renamed from: e */
    private int f15769e;

    /* renamed from: f */
    private int f15770f;

    /* renamed from: g */
    private int f15771g;

    /* renamed from: h */
    private int f15772h;

    /* renamed from: i */
    private Drawable f15773i;

    /* renamed from: j */
    private Drawable f15774j;

    /* renamed from: k */
    private ColorStateList f15775k;

    /* renamed from: l */
    private ColorStateList f15776l;

    /* renamed from: m */
    private C7929k f15777m;

    /* renamed from: n */
    private ColorStateList f15778n;

    /* renamed from: o */
    private Drawable f15779o;

    /* renamed from: p */
    private LayerDrawable f15780p;

    /* renamed from: q */
    private C7922g f15781q;

    /* renamed from: r */
    private C7922g f15782r;

    /* renamed from: s */
    private boolean f15783s = false;

    /* renamed from: t */
    private boolean f15784t;

    /* renamed from: com.google.android.material.card.a$a */
    class C4976a extends InsetDrawable {
        C4976a(Drawable drawable, int i, int i2, int i3, int i4) {
            super(drawable, i, i2, i3, i4);
        }

        public int getMinimumHeight() {
            return -1;
        }

        public int getMinimumWidth() {
            return -1;
        }

        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    static {
        ColorDrawable colorDrawable;
        if (Build.VERSION.SDK_INT <= 28) {
            colorDrawable = new ColorDrawable();
        } else {
            colorDrawable = null;
        }
        f15764v = colorDrawable;
    }

    public C4975a(MaterialCardView materialCardView, AttributeSet attributeSet, int i, int i2) {
        this.f15765a = materialCardView;
        C7922g gVar = new C7922g(materialCardView.getContext(), attributeSet, i, i2);
        this.f15767c = gVar;
        gVar.mo22934M(materialCardView.getContext());
        gVar.mo22946c0(-12303292);
        C7929k.C7931b v = gVar.mo22929D().mo22988v();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, C0082l.f400C0, i, C0081k.f353a);
        int i3 = C0082l.f410D0;
        if (obtainStyledAttributes.hasValue(i3)) {
            v.mo22999o(obtainStyledAttributes.getDimension(i3, Utils.FLOAT_EPSILON));
        }
        this.f15768d = new C7922g();
        mo15800V(v.mo22998m());
        obtainStyledAttributes.recycle();
    }

    /* renamed from: B */
    private Drawable m19110B(Drawable drawable) {
        int i;
        int i2;
        if (this.f15765a.getUseCompatPadding()) {
            i = (int) Math.ceil((double) m19118d());
            i2 = (int) Math.ceil((double) m19117c());
        } else {
            i2 = 0;
            i = 0;
        }
        return new C4976a(drawable, i2, i, i2, i);
    }

    /* renamed from: E */
    private boolean m19111E() {
        return (this.f15771g & 80) == 80;
    }

    /* renamed from: F */
    private boolean m19112F() {
        return (this.f15771g & 8388613) == 8388613;
    }

    /* renamed from: Z */
    private boolean m19113Z() {
        return this.f15765a.getPreventCornerOverlap() && !m19119e();
    }

    /* renamed from: a */
    private float m19114a() {
        return Math.max(Math.max(m19116b(this.f15777m.mo22983q(), this.f15767c.mo22930F()), m19116b(this.f15777m.mo22985s(), this.f15767c.mo22931G())), Math.max(m19116b(this.f15777m.mo22978k(), this.f15767c.mo22962t()), m19116b(this.f15777m.mo22976i(), this.f15767c.mo22960s())));
    }

    /* renamed from: a0 */
    private boolean m19115a0() {
        if (!this.f15765a.getPreventCornerOverlap() || !m19119e() || !this.f15765a.getUseCompatPadding()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private float m19116b(C7919d dVar, float f) {
        if (dVar instanceof C7928j) {
            return (float) ((1.0d - f15763u) * ((double) f));
        }
        if (dVar instanceof C7920e) {
            return f / 2.0f;
        }
        return Utils.FLOAT_EPSILON;
    }

    /* renamed from: c */
    private float m19117c() {
        float f;
        float maxCardElevation = this.f15765a.getMaxCardElevation();
        if (m19115a0()) {
            f = m19114a();
        } else {
            f = Utils.FLOAT_EPSILON;
        }
        return maxCardElevation + f;
    }

    /* renamed from: d */
    private float m19118d() {
        float f;
        float maxCardElevation = this.f15765a.getMaxCardElevation() * 1.5f;
        if (m19115a0()) {
            f = m19114a();
        } else {
            f = Utils.FLOAT_EPSILON;
        }
        return maxCardElevation + f;
    }

    /* renamed from: e */
    private boolean m19119e() {
        return this.f15767c.mo22936P();
    }

    /* renamed from: e0 */
    private void m19120e0(Drawable drawable) {
        if (this.f15765a.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.f15765a.getForeground()).setDrawable(drawable);
        } else {
            this.f15765a.setForeground(m19110B(drawable));
        }
    }

    /* renamed from: f */
    private Drawable m19121f() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        C7922g h = m19124h();
        this.f15781q = h;
        h.mo22941X(this.f15775k);
        stateListDrawable.addState(new int[]{16842919}, this.f15781q);
        return stateListDrawable;
    }

    /* renamed from: g */
    private Drawable m19122g() {
        if (!C7492b.f21801a) {
            return m19121f();
        }
        this.f15782r = m19124h();
        return new RippleDrawable(this.f15775k, (Drawable) null, this.f15782r);
    }

    /* renamed from: g0 */
    private void m19123g0() {
        Drawable drawable;
        if (!C7492b.f21801a || (drawable = this.f15779o) == null) {
            C7922g gVar = this.f15781q;
            if (gVar != null) {
                gVar.mo22941X(this.f15775k);
                return;
            }
            return;
        }
        ((RippleDrawable) drawable).setColor(this.f15775k);
    }

    /* renamed from: h */
    private C7922g m19124h() {
        return new C7922g(this.f15777m);
    }

    /* renamed from: r */
    private Drawable m19125r() {
        if (this.f15779o == null) {
            this.f15779o = m19122g();
        }
        if (this.f15780p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f15779o, this.f15768d, this.f15774j});
            this.f15780p = layerDrawable;
            layerDrawable.setId(2, C0076f.f244E);
        }
        return this.f15780p;
    }

    /* renamed from: t */
    private float m19126t() {
        if (!this.f15765a.getPreventCornerOverlap() || !this.f15765a.getUseCompatPadding()) {
            return Utils.FLOAT_EPSILON;
        }
        return (float) ((1.0d - f15763u) * ((double) this.f15765a.getCardViewRadius()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public Rect mo15782A() {
        return this.f15766b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean mo15783C() {
        return this.f15783s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean mo15784D() {
        return this.f15784t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo15785G(TypedArray typedArray) {
        Drawable drawable;
        ColorStateList a = C7343c.m28003a(this.f15765a.getContext(), typedArray, C0082l.f807r4);
        this.f15778n = a;
        if (a == null) {
            this.f15778n = ColorStateList.valueOf(-1);
        }
        this.f15772h = typedArray.getDimensionPixelSize(C0082l.f817s4, 0);
        boolean z = typedArray.getBoolean(C0082l.f727j4, false);
        this.f15784t = z;
        this.f15765a.setLongClickable(z);
        this.f15776l = C7343c.m28003a(this.f15765a.getContext(), typedArray, C0082l.f787p4);
        mo15792N(C7343c.m28007e(this.f15765a.getContext(), typedArray, C0082l.f747l4));
        mo15795Q(typedArray.getDimensionPixelSize(C0082l.f777o4, 0));
        mo15794P(typedArray.getDimensionPixelSize(C0082l.f767n4, 0));
        this.f15771g = typedArray.getInteger(C0082l.f757m4, 8388661);
        ColorStateList a2 = C7343c.m28003a(this.f15765a.getContext(), typedArray, C0082l.f797q4);
        this.f15775k = a2;
        if (a2 == null) {
            this.f15775k = ColorStateList.valueOf(C6170a.m24583d(this.f15765a, C0072b.f154m));
        }
        mo15789K(C7343c.m28003a(this.f15765a.getContext(), typedArray, C0082l.f737k4));
        m19123g0();
        mo15806d0();
        mo15808h0();
        this.f15765a.setBackgroundInternal(m19110B(this.f15767c));
        if (this.f15765a.isClickable()) {
            drawable = m19125r();
        } else {
            drawable = this.f15768d;
        }
        this.f15773i = drawable;
        this.f15765a.setForeground(m19110B(drawable));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo15786H(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i12;
        if (this.f15780p != null) {
            if (this.f15765a.getUseCompatPadding()) {
                i4 = (int) Math.ceil((double) (m19118d() * 2.0f));
                i3 = (int) Math.ceil((double) (m19117c() * 2.0f));
            } else {
                i4 = 0;
                i3 = 0;
            }
            if (m19112F()) {
                i5 = ((i - this.f15769e) - this.f15770f) - i3;
            } else {
                i5 = this.f15769e;
            }
            if (m19111E()) {
                i6 = this.f15769e;
            } else {
                i6 = ((i2 - this.f15769e) - this.f15770f) - i4;
            }
            int i13 = i6;
            if (m19112F()) {
                i7 = this.f15769e;
            } else {
                i7 = ((i - this.f15769e) - this.f15770f) - i3;
            }
            if (m19111E()) {
                i8 = ((i2 - this.f15769e) - this.f15770f) - i4;
            } else {
                i8 = this.f15769e;
            }
            int i14 = i8;
            if (ViewCompat.m3541B(this.f15765a) == 1) {
                i12 = i7;
                i9 = i5;
            } else {
                i9 = i7;
                i12 = i5;
            }
            this.f15780p.setLayerInset(2, i12, i14, i9, i13);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo15787I(boolean z) {
        this.f15783s = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo15788J(ColorStateList colorStateList) {
        this.f15767c.mo22941X(colorStateList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo15789K(ColorStateList colorStateList) {
        C7922g gVar = this.f15768d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        gVar.mo22941X(colorStateList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo15790L(boolean z) {
        this.f15784t = z;
    }

    /* renamed from: M */
    public void mo15791M(boolean z) {
        int i;
        Drawable drawable = this.f15774j;
        if (drawable != null) {
            if (z) {
                i = C11051p3.f31759c;
            } else {
                i = 0;
            }
            drawable.setAlpha(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo15792N(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = C0836a.m3156r(drawable).mutate();
            this.f15774j = mutate;
            C0836a.m3153o(mutate, this.f15776l);
            mo15791M(this.f15765a.isChecked());
        } else {
            this.f15774j = f15764v;
        }
        LayerDrawable layerDrawable = this.f15780p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(C0076f.f244E, this.f15774j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo15793O(int i) {
        this.f15771g = i;
        mo15786H(this.f15765a.getMeasuredWidth(), this.f15765a.getMeasuredHeight());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo15794P(int i) {
        this.f15769e = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo15795Q(int i) {
        this.f15770f = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo15796R(ColorStateList colorStateList) {
        this.f15776l = colorStateList;
        Drawable drawable = this.f15774j;
        if (drawable != null) {
            C0836a.m3153o(drawable, colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo15797S(float f) {
        mo15800V(this.f15777m.mo22989w(f));
        this.f15773i.invalidateSelf();
        if (m19115a0() || m19113Z()) {
            mo15805c0();
        }
        if (m19115a0()) {
            mo15807f0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo15798T(float f) {
        this.f15767c.mo22942Y(f);
        C7922g gVar = this.f15768d;
        if (gVar != null) {
            gVar.mo22942Y(f);
        }
        C7922g gVar2 = this.f15782r;
        if (gVar2 != null) {
            gVar2.mo22942Y(f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo15799U(ColorStateList colorStateList) {
        this.f15775k = colorStateList;
        m19123g0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo15800V(C7929k kVar) {
        this.f15777m = kVar;
        this.f15767c.setShapeAppearanceModel(kVar);
        C7922g gVar = this.f15767c;
        gVar.mo22945b0(!gVar.mo22936P());
        C7922g gVar2 = this.f15768d;
        if (gVar2 != null) {
            gVar2.setShapeAppearanceModel(kVar);
        }
        C7922g gVar3 = this.f15782r;
        if (gVar3 != null) {
            gVar3.setShapeAppearanceModel(kVar);
        }
        C7922g gVar4 = this.f15781q;
        if (gVar4 != null) {
            gVar4.setShapeAppearanceModel(kVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo15801W(ColorStateList colorStateList) {
        if (this.f15778n != colorStateList) {
            this.f15778n = colorStateList;
            mo15808h0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public void mo15802X(int i) {
        if (i != this.f15772h) {
            this.f15772h = i;
            mo15808h0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo15803Y(int i, int i2, int i3, int i4) {
        this.f15766b.set(i, i2, i3, i4);
        mo15805c0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public void mo15804b0() {
        Drawable drawable;
        Drawable drawable2 = this.f15773i;
        if (this.f15765a.isClickable()) {
            drawable = m19125r();
        } else {
            drawable = this.f15768d;
        }
        this.f15773i = drawable;
        if (drawable2 != drawable) {
            m19120e0(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void mo15805c0() {
        boolean z;
        float f;
        if (m19113Z() || m19115a0()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = m19114a();
        } else {
            f = Utils.FLOAT_EPSILON;
        }
        int t = (int) (f - m19126t());
        MaterialCardView materialCardView = this.f15765a;
        Rect rect = this.f15766b;
        materialCardView.mo15739g(rect.left + t, rect.top + t, rect.right + t, rect.bottom + t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public void mo15806d0() {
        this.f15767c.mo22940W(this.f15765a.getCardElevation());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public void mo15807f0() {
        if (!mo15783C()) {
            this.f15765a.setBackgroundInternal(m19110B(this.f15767c));
        }
        this.f15765a.setForeground(m19110B(this.f15773i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public void mo15808h0() {
        this.f15768d.mo22948e0((float) this.f15772h, this.f15778n);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo15809i() {
        Drawable drawable = this.f15779o;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i = bounds.bottom;
            this.f15779o.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            this.f15779o.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C7922g mo15810j() {
        return this.f15767c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public ColorStateList mo15811k() {
        return this.f15767c.mo22965x();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public ColorStateList mo15812l() {
        return this.f15768d.mo22965x();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public Drawable mo15813m() {
        return this.f15774j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public int mo15814n() {
        return this.f15771g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public int mo15815o() {
        return this.f15769e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public int mo15816p() {
        return this.f15770f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public ColorStateList mo15817q() {
        return this.f15776l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public float mo15818s() {
        return this.f15767c.mo22930F();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public float mo15819u() {
        return this.f15767c.mo22966y();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public ColorStateList mo15820v() {
        return this.f15775k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public C7929k mo15821w() {
        return this.f15777m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public int mo15822x() {
        ColorStateList colorStateList = this.f15778n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public ColorStateList mo15823y() {
        return this.f15778n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public int mo15824z() {
        return this.f15772h;
    }
}
