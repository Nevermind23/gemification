package p341ge.bog.chatkit.messages;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.C0836a;
import p545og.C17191b;
import p545og.C17192c;
import p545og.C17193d;
import p545og.C17196g;
import p559pg.C17346b;

/* renamed from: ge.bog.chatkit.messages.a */
class C13117a extends C17346b {

    /* renamed from: A */
    private int f38555A;

    /* renamed from: B */
    private int f38556B;

    /* renamed from: C */
    private int f38557C;

    /* renamed from: D */
    private int f38558D;

    /* renamed from: E */
    private int f38559E;

    /* renamed from: F */
    private int f38560F;

    /* renamed from: G */
    private int f38561G;

    /* renamed from: H */
    private int f38562H;

    /* renamed from: I */
    private int f38563I;

    /* renamed from: J */
    private int f38564J;

    /* renamed from: K */
    private int f38565K;

    /* renamed from: L */
    private int f38566L;

    /* renamed from: M */
    private int f38567M;

    /* renamed from: N */
    private int f38568N;

    /* renamed from: O */
    private int f38569O;

    /* renamed from: P */
    private int f38570P;

    /* renamed from: Q */
    private int f38571Q;

    /* renamed from: R */
    private int f38572R;

    /* renamed from: S */
    private int f38573S;

    /* renamed from: T */
    private int f38574T;

    /* renamed from: U */
    private int f38575U;

    /* renamed from: V */
    private int f38576V;

    /* renamed from: W */
    private int f38577W;

    /* renamed from: X */
    private String f38578X;

    /* renamed from: Y */
    private int f38579Y;

    /* renamed from: Z */
    private int f38580Z;

    /* renamed from: a0 */
    private int f38581a0;

    /* renamed from: d */
    private int f38582d;

    /* renamed from: e */
    private int f38583e;

    /* renamed from: f */
    private int f38584f;

    /* renamed from: g */
    private int f38585g;

    /* renamed from: h */
    private int f38586h;

    /* renamed from: i */
    private int f38587i;

    /* renamed from: j */
    private int f38588j;

    /* renamed from: k */
    private int f38589k;

    /* renamed from: l */
    private int f38590l;

    /* renamed from: m */
    private int f38591m;

    /* renamed from: n */
    private int f38592n;

    /* renamed from: o */
    private int f38593o;

    /* renamed from: p */
    private int f38594p;

    /* renamed from: q */
    private int f38595q;

    /* renamed from: r */
    private int f38596r;

    /* renamed from: s */
    private int f38597s;

    /* renamed from: t */
    private int f38598t;

    /* renamed from: u */
    private int f38599u;

    /* renamed from: v */
    private int f38600v;

    /* renamed from: w */
    private int f38601w;

    /* renamed from: x */
    private int f38602x;

    /* renamed from: y */
    private int f38603y;

    /* renamed from: z */
    private int f38604z;

    private C13117a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: D */
    private Drawable m49357D(int i, int i2, int i3, int i4) {
        Drawable mutate = C0836a.m3156r(mo44758f(i4)).mutate();
        C0836a.m3153o(mutate, new ColorStateList(new int[][]{new int[]{16842913}, new int[]{16842919}, new int[]{-16842919, -16842913}}, new int[]{i2, i3, i}));
        return mutate;
    }

    /* renamed from: V */
    static C13117a m49358V(Context context, AttributeSet attributeSet) {
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        C13117a aVar = new C13117a(context2, attributeSet2);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, C17196g.f48254I0);
        aVar.f38582d = obtainStyledAttributes.getInt(C17196g.f48249G1, 0);
        aVar.f38583e = obtainStyledAttributes.getColor(C17196g.f48329f1, aVar.mo44756d());
        aVar.f38584f = obtainStyledAttributes.getColor(C17196g.f48228A1, aVar.mo44756d());
        aVar.f38585g = obtainStyledAttributes.getDimensionPixelSize(C17196g.f48275P0, aVar.mo44754b(C17192c.message_avatar_width));
        aVar.f38586h = obtainStyledAttributes.getDimensionPixelSize(C17196g.f48272O0, aVar.mo44754b(C17192c.message_avatar_height));
        aVar.f38587i = obtainStyledAttributes.getResourceId(C17196g.f48278Q0, -1);
        int i = C17196g.f48293V0;
        int i2 = C17191b.white_two;
        aVar.f38588j = obtainStyledAttributes.getColor(i, aVar.mo44753a(i2));
        aVar.f38589k = obtainStyledAttributes.getColor(C17196g.f48296W0, aVar.mo44753a(i2));
        int i3 = C17196g.f48299X0;
        int i4 = C17191b.cornflower_blue_two_24;
        aVar.f38590l = obtainStyledAttributes.getColor(i3, aVar.mo44753a(i4));
        aVar.f38591m = obtainStyledAttributes.getResourceId(C17196g.f48309a1, -1);
        int i5 = C17196g.f48302Y0;
        int i6 = C17191b.f48220e;
        aVar.f38592n = obtainStyledAttributes.getColor(i5, aVar.mo44753a(i6));
        int i7 = C17196g.f48305Z0;
        int i8 = C17191b.cornflower_blue_light_40;
        aVar.f38593o = obtainStyledAttributes.getColor(i7, aVar.mo44753a(i8));
        int i9 = C17196g.f48284S0;
        int i12 = C17192c.message_padding_left;
        aVar.f38594p = obtainStyledAttributes.getDimensionPixelSize(i9, aVar.mo44754b(i12));
        int i13 = C17196g.f48287T0;
        int i14 = C17192c.message_padding_right;
        aVar.f38595q = obtainStyledAttributes.getDimensionPixelSize(i13, aVar.mo44754b(i14));
        int i15 = C17196g.f48290U0;
        int i16 = C17192c.message_padding_top;
        aVar.f38596r = obtainStyledAttributes.getDimensionPixelSize(i15, aVar.mo44754b(i16));
        int i17 = C17196g.f48281R0;
        int i18 = C17192c.message_padding_bottom;
        aVar.f38597s = obtainStyledAttributes.getDimensionPixelSize(i17, aVar.mo44754b(i18));
        aVar.f38598t = obtainStyledAttributes.getColor(C17196g.f48325e1, aVar.mo44753a(C17191b.dark_grey_two));
        int i19 = C17196g.f48333g1;
        int i22 = C17192c.message_text_size;
        aVar.f38599u = obtainStyledAttributes.getDimensionPixelSize(i19, aVar.mo44754b(i22));
        aVar.f38600v = obtainStyledAttributes.getInt(C17196g.f48337h1, 0);
        int i23 = C17196g.f48341i1;
        int i24 = C17191b.warm_grey_four;
        aVar.f38601w = obtainStyledAttributes.getColor(i23, aVar.mo44753a(i24));
        int i25 = C17196g.f48345j1;
        int i26 = C17192c.message_time_text_size;
        aVar.f38602x = obtainStyledAttributes.getDimensionPixelSize(i25, aVar.mo44754b(i26));
        aVar.f38603y = obtainStyledAttributes.getInt(C17196g.f48349k1, 0);
        aVar.f38604z = obtainStyledAttributes.getColor(C17196g.f48313b1, aVar.mo44753a(i24));
        aVar.f38555A = obtainStyledAttributes.getDimensionPixelSize(C17196g.f48317c1, aVar.mo44754b(i26));
        aVar.f38556B = obtainStyledAttributes.getInt(C17196g.f48321d1, 0);
        aVar.f38557C = obtainStyledAttributes.getResourceId(C17196g.f48353l1, -1);
        int i27 = C17196g.f48373q1;
        int i28 = C17191b.cornflower_blue_two;
        aVar.f38558D = obtainStyledAttributes.getColor(i27, aVar.mo44753a(i28));
        aVar.f38559E = obtainStyledAttributes.getColor(C17196g.f48377r1, aVar.mo44753a(i28));
        aVar.f38560F = obtainStyledAttributes.getColor(C17196g.f48381s1, aVar.mo44753a(i4));
        aVar.f38561G = obtainStyledAttributes.getResourceId(C17196g.f48393v1, -1);
        aVar.f38562H = obtainStyledAttributes.getColor(C17196g.f48385t1, aVar.mo44753a(i6));
        aVar.f38563I = obtainStyledAttributes.getColor(C17196g.f48389u1, aVar.mo44753a(i8));
        aVar.f38564J = obtainStyledAttributes.getDimensionPixelSize(C17196g.f48361n1, aVar.mo44754b(i12));
        aVar.f38565K = obtainStyledAttributes.getDimensionPixelSize(C17196g.f48365o1, aVar.mo44754b(i14));
        aVar.f38566L = obtainStyledAttributes.getDimensionPixelSize(C17196g.f48369p1, aVar.mo44754b(i16));
        aVar.f38567M = obtainStyledAttributes.getDimensionPixelSize(C17196g.f48357m1, aVar.mo44754b(i18));
        aVar.f38568N = obtainStyledAttributes.getColor(C17196g.f48409z1, aVar.mo44753a(C17191b.f48221h));
        aVar.f38569O = obtainStyledAttributes.getDimensionPixelSize(C17196g.f48232B1, aVar.mo44754b(i22));
        aVar.f38570P = obtainStyledAttributes.getInt(C17196g.f48236C1, 0);
        aVar.f38571Q = obtainStyledAttributes.getColor(C17196g.f48240D1, aVar.mo44753a(C17191b.white60));
        aVar.f38572R = obtainStyledAttributes.getDimensionPixelSize(C17196g.f48243E1, aVar.mo44754b(i26));
        aVar.f38573S = obtainStyledAttributes.getInt(C17196g.f48246F1, 0);
        aVar.f38574T = obtainStyledAttributes.getColor(C17196g.f48397w1, aVar.mo44753a(i24));
        aVar.f38575U = obtainStyledAttributes.getDimensionPixelSize(C17196g.f48401x1, aVar.mo44754b(i26));
        aVar.f38576V = obtainStyledAttributes.getInt(C17196g.f48405y1, 0);
        aVar.f38577W = obtainStyledAttributes.getDimensionPixelSize(C17196g.f48260K0, aVar.mo44754b(C17192c.message_date_header_padding));
        aVar.f38578X = obtainStyledAttributes.getString(C17196g.f48257J0);
        aVar.f38579Y = obtainStyledAttributes.getColor(C17196g.f48263L0, aVar.mo44753a(C17191b.warm_grey_two));
        aVar.f38580Z = obtainStyledAttributes.getDimensionPixelSize(C17196g.f48266M0, aVar.mo44754b(C17192c.message_date_header_text_size));
        aVar.f38581a0 = obtainStyledAttributes.getInt(C17196g.f48269N0, 0);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public int mo34535A() {
        return this.f38601w;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public int mo34536B() {
        return this.f38602x;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public int mo34537C() {
        return this.f38603y;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public Drawable mo34538E() {
        int i = this.f38557C;
        if (i == -1) {
            return m49357D(this.f38558D, this.f38560F, this.f38559E, C17193d.shape_outcoming_message);
        }
        return mo44755c(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public int mo34539F() {
        return this.f38567M;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public int mo34540G() {
        return this.f38564J;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public int mo34541H() {
        return this.f38565K;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public int mo34542I() {
        return this.f38566L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public Drawable mo34543J() {
        int i = this.f38561G;
        if (i == -1) {
            return m49357D(0, this.f38563I, this.f38562H, C17193d.shape_outcoming_message);
        }
        return mo44755c(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public int mo34544K() {
        return this.f38574T;
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public int mo34545L() {
        return this.f38575U;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public int mo34546M() {
        return this.f38576V;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public int mo34547N() {
        return this.f38568N;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public int mo34548O() {
        return this.f38584f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public int mo34549P() {
        return this.f38569O;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public int mo34550Q() {
        return this.f38570P;
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public int mo34551R() {
        return this.f38571Q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public int mo34552S() {
        return this.f38572R;
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public int mo34553T() {
        return this.f38573S;
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public int mo34554U() {
        return this.f38582d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public String mo34555g() {
        return this.f38578X;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo34556h() {
        return this.f38577W;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo34557i() {
        return this.f38579Y;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo34558j() {
        return this.f38580Z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public int mo34559k() {
        return this.f38581a0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public int mo34560l() {
        return this.f38586h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public int mo34561m() {
        return this.f38585g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public Drawable mo34562n() {
        int i = this.f38587i;
        if (i == -1) {
            return m49357D(this.f38588j, this.f38590l, this.f38589k, C17193d.shape_incoming_message);
        }
        return mo44755c(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public int mo34563o() {
        return this.f38597s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public int mo34564p() {
        return this.f38594p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public int mo34565q() {
        return this.f38595q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public int mo34566r() {
        return this.f38596r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public Drawable mo34567s() {
        int i = this.f38591m;
        if (i == -1) {
            return m49357D(0, this.f38593o, this.f38592n, C17193d.shape_incoming_message);
        }
        return mo44755c(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public int mo34568t() {
        return this.f38604z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public int mo34569u() {
        return this.f38555A;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public int mo34570v() {
        return this.f38556B;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public int mo34571w() {
        return this.f38598t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public int mo34572x() {
        return this.f38583e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public int mo34573y() {
        return this.f38599u;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public int mo34574z() {
        return this.f38600v;
    }
}
