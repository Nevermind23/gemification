package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.core.graphics.drawable.C0836a;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.C5089m;
import p009a8.C0072b;
import p009a8.C0082l;
import p080f8.C6170a;
import p184n8.C7343c;
import p197o8.C7489a;
import p197o8.C7492b;
import p223q8.C7922g;
import p223q8.C7929k;
import p223q8.C7945n;

/* renamed from: com.google.android.material.button.a */
class C4973a {

    /* renamed from: u */
    private static final boolean f15733u = true;

    /* renamed from: v */
    private static final boolean f15734v = false;

    /* renamed from: a */
    private final MaterialButton f15735a;

    /* renamed from: b */
    private C7929k f15736b;

    /* renamed from: c */
    private int f15737c;

    /* renamed from: d */
    private int f15738d;

    /* renamed from: e */
    private int f15739e;

    /* renamed from: f */
    private int f15740f;

    /* renamed from: g */
    private int f15741g;

    /* renamed from: h */
    private int f15742h;

    /* renamed from: i */
    private PorterDuff.Mode f15743i;

    /* renamed from: j */
    private ColorStateList f15744j;

    /* renamed from: k */
    private ColorStateList f15745k;

    /* renamed from: l */
    private ColorStateList f15746l;

    /* renamed from: m */
    private Drawable f15747m;

    /* renamed from: n */
    private boolean f15748n = false;

    /* renamed from: o */
    private boolean f15749o = false;

    /* renamed from: p */
    private boolean f15750p = false;

    /* renamed from: q */
    private boolean f15751q;

    /* renamed from: r */
    private boolean f15752r = true;

    /* renamed from: s */
    private LayerDrawable f15753s;

    /* renamed from: t */
    private int f15754t;

    C4973a(MaterialButton materialButton, C7929k kVar) {
        this.f15735a = materialButton;
        this.f15736b = kVar;
    }

    /* renamed from: G */
    private void m19068G(int i, int i2) {
        int G = ViewCompat.m3551G(this.f15735a);
        int paddingTop = this.f15735a.getPaddingTop();
        int F = ViewCompat.m3549F(this.f15735a);
        int paddingBottom = this.f15735a.getPaddingBottom();
        int i3 = this.f15739e;
        int i4 = this.f15740f;
        this.f15740f = i2;
        this.f15739e = i;
        if (!this.f15749o) {
            m19069H();
        }
        ViewCompat.m3552G0(this.f15735a, G, (paddingTop + i) - i3, F, (paddingBottom + i2) - i4);
    }

    /* renamed from: H */
    private void m19069H() {
        this.f15735a.setInternalBackground(m19073a());
        C7922g f = mo15718f();
        if (f != null) {
            f.mo22940W((float) this.f15754t);
            f.setState(this.f15735a.getDrawableState());
        }
    }

    /* renamed from: I */
    private void m19070I(C7929k kVar) {
        if (!f15734v || this.f15749o) {
            if (mo15718f() != null) {
                mo15718f().setShapeAppearanceModel(kVar);
            }
            if (m19075n() != null) {
                m19075n().setShapeAppearanceModel(kVar);
            }
            if (mo15717e() != null) {
                mo15717e().setShapeAppearanceModel(kVar);
                return;
            }
            return;
        }
        int G = ViewCompat.m3551G(this.f15735a);
        int paddingTop = this.f15735a.getPaddingTop();
        int F = ViewCompat.m3549F(this.f15735a);
        int paddingBottom = this.f15735a.getPaddingBottom();
        m19069H();
        ViewCompat.m3552G0(this.f15735a, G, paddingTop, F, paddingBottom);
    }

    /* renamed from: J */
    private void m19071J() {
        int i;
        C7922g f = mo15718f();
        C7922g n = m19075n();
        if (f != null) {
            f.mo22948e0((float) this.f15742h, this.f15745k);
            if (n != null) {
                float f2 = (float) this.f15742h;
                if (this.f15748n) {
                    i = C6170a.m24583d(this.f15735a, C0072b.f159r);
                } else {
                    i = 0;
                }
                n.mo22947d0(f2, i);
            }
        }
    }

    /* renamed from: K */
    private InsetDrawable m19072K(Drawable drawable) {
        return new InsetDrawable(drawable, this.f15737c, this.f15739e, this.f15738d, this.f15740f);
    }

    /* renamed from: a */
    private Drawable m19073a() {
        int i;
        C7922g gVar = new C7922g(this.f15736b);
        gVar.mo22934M(this.f15735a.getContext());
        C0836a.m3153o(gVar, this.f15744j);
        PorterDuff.Mode mode = this.f15743i;
        if (mode != null) {
            C0836a.m3154p(gVar, mode);
        }
        gVar.mo22948e0((float) this.f15742h, this.f15745k);
        C7922g gVar2 = new C7922g(this.f15736b);
        gVar2.setTint(0);
        float f = (float) this.f15742h;
        if (this.f15748n) {
            i = C6170a.m24583d(this.f15735a, C0072b.f159r);
        } else {
            i = 0;
        }
        gVar2.mo22947d0(f, i);
        if (f15733u) {
            C7922g gVar3 = new C7922g(this.f15736b);
            this.f15747m = gVar3;
            C0836a.m3152n(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(C7492b.m28457d(this.f15746l), m19072K(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f15747m);
            this.f15753s = rippleDrawable;
            return rippleDrawable;
        }
        C7489a aVar = new C7489a(this.f15736b);
        this.f15747m = aVar;
        C0836a.m3153o(aVar, C7492b.m28457d(this.f15746l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f15747m});
        this.f15753s = layerDrawable;
        return m19072K(layerDrawable);
    }

    /* renamed from: g */
    private C7922g m19074g(boolean z) {
        LayerDrawable layerDrawable = this.f15753s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (f15733u) {
            return (C7922g) ((LayerDrawable) ((InsetDrawable) this.f15753s.getDrawable(0)).getDrawable()).getDrawable(z ^ true ? 1 : 0);
        }
        return (C7922g) this.f15753s.getDrawable(z ^ true ? 1 : 0);
    }

    /* renamed from: n */
    private C7922g m19075n() {
        return m19074g(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo15708A(boolean z) {
        this.f15748n = z;
        m19071J();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo15709B(ColorStateList colorStateList) {
        if (this.f15745k != colorStateList) {
            this.f15745k = colorStateList;
            m19071J();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo15710C(int i) {
        if (this.f15742h != i) {
            this.f15742h = i;
            m19071J();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo15711D(ColorStateList colorStateList) {
        if (this.f15744j != colorStateList) {
            this.f15744j = colorStateList;
            if (mo15718f() != null) {
                C0836a.m3153o(mo15718f(), this.f15744j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo15712E(PorterDuff.Mode mode) {
        if (this.f15743i != mode) {
            this.f15743i = mode;
            if (mo15718f() != null && this.f15743i != null) {
                C0836a.m3154p(mo15718f(), this.f15743i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo15713F(boolean z) {
        this.f15752r = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo15714b() {
        return this.f15741g;
    }

    /* renamed from: c */
    public int mo15715c() {
        return this.f15740f;
    }

    /* renamed from: d */
    public int mo15716d() {
        return this.f15739e;
    }

    /* renamed from: e */
    public C7945n mo15717e() {
        LayerDrawable layerDrawable = this.f15753s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.f15753s.getNumberOfLayers() > 2) {
            return (C7945n) this.f15753s.getDrawable(2);
        }
        return (C7945n) this.f15753s.getDrawable(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C7922g mo15718f() {
        return m19074g(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public ColorStateList mo15719h() {
        return this.f15746l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C7929k mo15720i() {
        return this.f15736b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public ColorStateList mo15721j() {
        return this.f15745k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo15722k() {
        return this.f15742h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public ColorStateList mo15723l() {
        return this.f15744j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public PorterDuff.Mode mo15724m() {
        return this.f15743i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo15725o() {
        return this.f15749o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo15726p() {
        return this.f15751q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo15727q() {
        return this.f15752r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo15728r(TypedArray typedArray) {
        this.f15737c = typedArray.getDimensionPixelOffset(C0082l.f806r3, 0);
        this.f15738d = typedArray.getDimensionPixelOffset(C0082l.f816s3, 0);
        this.f15739e = typedArray.getDimensionPixelOffset(C0082l.f826t3, 0);
        this.f15740f = typedArray.getDimensionPixelOffset(C0082l.f836u3, 0);
        int i = C0082l.f876y3;
        if (typedArray.hasValue(i)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i, -1);
            this.f15741g = dimensionPixelSize;
            mo15736z(this.f15736b.mo22989w((float) dimensionPixelSize));
            this.f15750p = true;
        }
        this.f15742h = typedArray.getDimensionPixelSize(C0082l.f463I3, 0);
        this.f15743i = C5089m.m19906g(typedArray.getInt(C0082l.f866x3, -1), PorterDuff.Mode.SRC_IN);
        this.f15744j = C7343c.m28003a(this.f15735a.getContext(), typedArray, C0082l.f856w3);
        this.f15745k = C7343c.m28003a(this.f15735a.getContext(), typedArray, C0082l.f453H3);
        this.f15746l = C7343c.m28003a(this.f15735a.getContext(), typedArray, C0082l.f443G3);
        this.f15751q = typedArray.getBoolean(C0082l.f846v3, false);
        this.f15754t = typedArray.getDimensionPixelSize(C0082l.f886z3, 0);
        this.f15752r = typedArray.getBoolean(C0082l.f473J3, true);
        int G = ViewCompat.m3551G(this.f15735a);
        int paddingTop = this.f15735a.getPaddingTop();
        int F = ViewCompat.m3549F(this.f15735a);
        int paddingBottom = this.f15735a.getPaddingBottom();
        if (typedArray.hasValue(C0082l.f796q3)) {
            mo15730t();
        } else {
            m19069H();
        }
        ViewCompat.m3552G0(this.f15735a, G + this.f15737c, paddingTop + this.f15739e, F + this.f15738d, paddingBottom + this.f15740f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo15729s(int i) {
        if (mo15718f() != null) {
            mo15718f().setTint(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo15730t() {
        this.f15749o = true;
        this.f15735a.setSupportBackgroundTintList(this.f15744j);
        this.f15735a.setSupportBackgroundTintMode(this.f15743i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo15731u(boolean z) {
        this.f15751q = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo15732v(int i) {
        if (!this.f15750p || this.f15741g != i) {
            this.f15741g = i;
            this.f15750p = true;
            mo15736z(this.f15736b.mo22989w((float) i));
        }
    }

    /* renamed from: w */
    public void mo15733w(int i) {
        m19068G(this.f15739e, i);
    }

    /* renamed from: x */
    public void mo15734x(int i) {
        m19068G(i, this.f15740f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo15735y(ColorStateList colorStateList) {
        if (this.f15746l != colorStateList) {
            this.f15746l = colorStateList;
            boolean z = f15733u;
            if (z && (this.f15735a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f15735a.getBackground()).setColor(C7492b.m28457d(colorStateList));
            } else if (!z && (this.f15735a.getBackground() instanceof C7489a)) {
                ((C7489a) this.f15735a.getBackground()).setTintList(C7492b.m28457d(colorStateList));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo15736z(C7929k kVar) {
        this.f15736b = kVar;
        m19070I(kVar);
    }
}
