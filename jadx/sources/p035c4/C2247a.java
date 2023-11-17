package p035c4;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.C2390g;
import com.bumptech.glide.load.resource.bitmap.C2520l;
import com.bumptech.glide.load.resource.bitmap.C2522m;
import com.bumptech.glide.load.resource.bitmap.C2524n;
import com.bumptech.glide.load.resource.bitmap.C2535o;
import com.bumptech.glide.load.resource.bitmap.C2553w;
import com.bumptech.glide.load.resource.bitmap.C2555y;
import com.github.mikephil.charting.utils.Utils;
import com.salesforce.marketingcloud.C11398b;
import java.util.Map;
import p076f4.C6155c;
import p089g4.C6209b;
import p089g4.C6223k;
import p089g4.C6224l;
import p166m3.C7083e;
import p166m3.C7084f;
import p166m3.C7085g;
import p166m3.C7088h;
import p166m3.C7092l;
import p192o3.C7423a;
import p296w3.C8763m;
import p321y3.C9046c;
import p321y3.C9050f;

/* renamed from: c4.a */
public abstract class C2247a implements Cloneable {

    /* renamed from: A */
    private boolean f6979A;

    /* renamed from: B */
    private boolean f6980B = true;

    /* renamed from: C */
    private boolean f6981C;

    /* renamed from: d */
    private int f6982d;

    /* renamed from: e */
    private float f6983e = 1.0f;

    /* renamed from: f */
    private C7423a f6984f = C7423a.f21690e;

    /* renamed from: g */
    private C2390g f6985g = C2390g.NORMAL;

    /* renamed from: h */
    private Drawable f6986h;

    /* renamed from: i */
    private int f6987i;

    /* renamed from: j */
    private Drawable f6988j;

    /* renamed from: k */
    private int f6989k;

    /* renamed from: l */
    private boolean f6990l = true;

    /* renamed from: m */
    private int f6991m = -1;

    /* renamed from: n */
    private int f6992n = -1;

    /* renamed from: o */
    private C7083e f6993o = C6155c.m24571c();

    /* renamed from: p */
    private boolean f6994p;

    /* renamed from: q */
    private boolean f6995q = true;

    /* renamed from: r */
    private Drawable f6996r;

    /* renamed from: s */
    private int f6997s;

    /* renamed from: t */
    private C7088h f6998t = new C7088h();

    /* renamed from: u */
    private Map f6999u = new C6209b();

    /* renamed from: v */
    private Class f7000v = Object.class;

    /* renamed from: w */
    private boolean f7001w;

    /* renamed from: x */
    private Resources.Theme f7002x;

    /* renamed from: y */
    private boolean f7003y;

    /* renamed from: z */
    private boolean f7004z;

    /* renamed from: N */
    private boolean m8560N(int i) {
        return m8561O(this.f6982d, i);
    }

    /* renamed from: O */
    private static boolean m8561O(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: Z */
    private C2247a m8562Z(C2535o oVar, C7092l lVar) {
        return m8564i0(oVar, lVar, false);
    }

    /* renamed from: h0 */
    private C2247a m8563h0(C2535o oVar, C7092l lVar) {
        return m8564i0(oVar, lVar, true);
    }

    /* renamed from: i0 */
    private C2247a m8564i0(C2535o oVar, C7092l lVar, boolean z) {
        C2247a aVar;
        if (z) {
            aVar = mo7247r0(oVar, lVar);
        } else {
            aVar = mo7216a0(oVar, lVar);
        }
        aVar.f6980B = true;
        return aVar;
    }

    /* renamed from: j0 */
    private C2247a m8565j0() {
        return this;
    }

    /* renamed from: A */
    public final C2390g mo7193A() {
        return this.f6985g;
    }

    /* renamed from: B */
    public final Class mo7194B() {
        return this.f7000v;
    }

    /* renamed from: C */
    public final C7083e mo7195C() {
        return this.f6993o;
    }

    /* renamed from: D */
    public final float mo7196D() {
        return this.f6983e;
    }

    /* renamed from: E */
    public final Resources.Theme mo7197E() {
        return this.f7002x;
    }

    /* renamed from: F */
    public final Map mo7198F() {
        return this.f6999u;
    }

    /* renamed from: G */
    public final boolean mo7199G() {
        return this.f6981C;
    }

    /* renamed from: H */
    public final boolean mo7200H() {
        return this.f7004z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final boolean mo7201I() {
        return this.f7003y;
    }

    /* renamed from: J */
    public final boolean mo7202J() {
        return m8560N(4);
    }

    /* renamed from: K */
    public final boolean mo7203K() {
        return this.f6990l;
    }

    /* renamed from: L */
    public final boolean mo7204L() {
        return m8560N(8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public boolean mo7205M() {
        return this.f6980B;
    }

    /* renamed from: P */
    public final boolean mo7206P() {
        return m8560N(C11398b.f33139r);
    }

    /* renamed from: Q */
    public final boolean mo7207Q() {
        return this.f6995q;
    }

    /* renamed from: S */
    public final boolean mo7208S() {
        return this.f6994p;
    }

    /* renamed from: T */
    public final boolean mo7209T() {
        return m8560N(C11398b.f33142u);
    }

    /* renamed from: U */
    public final boolean mo7210U() {
        return C6224l.m24752u(this.f6992n, this.f6991m);
    }

    /* renamed from: V */
    public C2247a mo7211V() {
        this.f7001w = true;
        return m8565j0();
    }

    /* renamed from: W */
    public C2247a mo7212W() {
        return mo7216a0(C2535o.f7983e, new C2520l());
    }

    /* renamed from: X */
    public C2247a mo7213X() {
        return m8562Z(C2535o.f7982d, new C2522m());
    }

    /* renamed from: Y */
    public C2247a mo7214Y() {
        return m8562Z(C2535o.f7981c, new C2555y());
    }

    /* renamed from: a */
    public C2247a mo7215a(C2247a aVar) {
        if (this.f7003y) {
            return clone().mo7215a(aVar);
        }
        if (m8561O(aVar.f6982d, 2)) {
            this.f6983e = aVar.f6983e;
        }
        if (m8561O(aVar.f6982d, 262144)) {
            this.f7004z = aVar.f7004z;
        }
        if (m8561O(aVar.f6982d, 1048576)) {
            this.f6981C = aVar.f6981C;
        }
        if (m8561O(aVar.f6982d, 4)) {
            this.f6984f = aVar.f6984f;
        }
        if (m8561O(aVar.f6982d, 8)) {
            this.f6985g = aVar.f6985g;
        }
        if (m8561O(aVar.f6982d, 16)) {
            this.f6986h = aVar.f6986h;
            this.f6987i = 0;
            this.f6982d &= -33;
        }
        if (m8561O(aVar.f6982d, 32)) {
            this.f6987i = aVar.f6987i;
            this.f6986h = null;
            this.f6982d &= -17;
        }
        if (m8561O(aVar.f6982d, 64)) {
            this.f6988j = aVar.f6988j;
            this.f6989k = 0;
            this.f6982d &= -129;
        }
        if (m8561O(aVar.f6982d, 128)) {
            this.f6989k = aVar.f6989k;
            this.f6988j = null;
            this.f6982d &= -65;
        }
        if (m8561O(aVar.f6982d, C11398b.f33139r)) {
            this.f6990l = aVar.f6990l;
        }
        if (m8561O(aVar.f6982d, C11398b.f33140s)) {
            this.f6992n = aVar.f6992n;
            this.f6991m = aVar.f6991m;
        }
        if (m8561O(aVar.f6982d, C11398b.f33141t)) {
            this.f6993o = aVar.f6993o;
        }
        if (m8561O(aVar.f6982d, C11398b.f33143v)) {
            this.f7000v = aVar.f7000v;
        }
        if (m8561O(aVar.f6982d, 8192)) {
            this.f6996r = aVar.f6996r;
            this.f6997s = 0;
            this.f6982d &= -16385;
        }
        if (m8561O(aVar.f6982d, 16384)) {
            this.f6997s = aVar.f6997s;
            this.f6996r = null;
            this.f6982d &= -8193;
        }
        if (m8561O(aVar.f6982d, 32768)) {
            this.f7002x = aVar.f7002x;
        }
        if (m8561O(aVar.f6982d, 65536)) {
            this.f6995q = aVar.f6995q;
        }
        if (m8561O(aVar.f6982d, 131072)) {
            this.f6994p = aVar.f6994p;
        }
        if (m8561O(aVar.f6982d, C11398b.f33142u)) {
            this.f6999u.putAll(aVar.f6999u);
            this.f6980B = aVar.f6980B;
        }
        if (m8561O(aVar.f6982d, 524288)) {
            this.f6979A = aVar.f6979A;
        }
        if (!this.f6995q) {
            this.f6999u.clear();
            this.f6994p = false;
            this.f6982d = this.f6982d & -2049 & -131073;
            this.f6980B = true;
        }
        this.f6982d |= aVar.f6982d;
        this.f6998t.mo21313d(aVar.f6998t);
        return mo7234k0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public final C2247a mo7216a0(C2535o oVar, C7092l lVar) {
        if (this.f7003y) {
            return clone().mo7216a0(oVar, lVar);
        }
        mo7230h(oVar);
        return mo7253v0(lVar, false);
    }

    /* renamed from: b */
    public C2247a mo7217b() {
        if (!this.f7001w || this.f7003y) {
            this.f7003y = true;
            return mo7211V();
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    /* renamed from: b0 */
    public C2247a mo7218b0(int i, int i2) {
        if (this.f7003y) {
            return clone().mo7218b0(i, i2);
        }
        this.f6992n = i;
        this.f6991m = i2;
        this.f6982d |= C11398b.f33140s;
        return mo7234k0();
    }

    /* renamed from: c */
    public C2247a mo7219c() {
        return mo7247r0(C2535o.f7983e, new C2520l());
    }

    /* renamed from: c0 */
    public C2247a mo7220c0(int i) {
        if (this.f7003y) {
            return clone().mo7220c0(i);
        }
        this.f6989k = i;
        this.f6988j = null;
        this.f6982d = (this.f6982d | 128) & -65;
        return mo7234k0();
    }

    /* renamed from: d */
    public C2247a mo7222d() {
        return mo7247r0(C2535o.f7982d, new C2524n());
    }

    /* renamed from: d0 */
    public C2247a mo7223d0(Drawable drawable) {
        if (this.f7003y) {
            return clone().mo7223d0(drawable);
        }
        this.f6988j = drawable;
        this.f6989k = 0;
        this.f6982d = (this.f6982d | 64) & -129;
        return mo7234k0();
    }

    /* renamed from: e */
    public C2247a clone() {
        try {
            C2247a aVar = (C2247a) super.clone();
            C7088h hVar = new C7088h();
            aVar.f6998t = hVar;
            hVar.mo21313d(this.f6998t);
            C6209b bVar = new C6209b();
            aVar.f6999u = bVar;
            bVar.putAll(this.f6999u);
            aVar.f7001w = false;
            aVar.f7003y = false;
            return aVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: e0 */
    public C2247a mo7225e0(C2390g gVar) {
        if (this.f7003y) {
            return clone().mo7225e0(gVar);
        }
        this.f6985g = (C2390g) C6223k.m24730d(gVar);
        this.f6982d |= 8;
        return mo7234k0();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2247a)) {
            return false;
        }
        C2247a aVar = (C2247a) obj;
        if (Float.compare(aVar.f6983e, this.f6983e) == 0 && this.f6987i == aVar.f6987i && C6224l.m24735d(this.f6986h, aVar.f6986h) && this.f6989k == aVar.f6989k && C6224l.m24735d(this.f6988j, aVar.f6988j) && this.f6997s == aVar.f6997s && C6224l.m24735d(this.f6996r, aVar.f6996r) && this.f6990l == aVar.f6990l && this.f6991m == aVar.f6991m && this.f6992n == aVar.f6992n && this.f6994p == aVar.f6994p && this.f6995q == aVar.f6995q && this.f7004z == aVar.f7004z && this.f6979A == aVar.f6979A && this.f6984f.equals(aVar.f6984f) && this.f6985g == aVar.f6985g && this.f6998t.equals(aVar.f6998t) && this.f6999u.equals(aVar.f6999u) && this.f7000v.equals(aVar.f7000v) && C6224l.m24735d(this.f6993o, aVar.f6993o) && C6224l.m24735d(this.f7002x, aVar.f7002x)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public C2247a mo7227f(Class cls) {
        if (this.f7003y) {
            return clone().mo7227f(cls);
        }
        this.f7000v = (Class) C6223k.m24730d(cls);
        this.f6982d |= C11398b.f33143v;
        return mo7234k0();
    }

    /* renamed from: g */
    public C2247a mo7228g(C7423a aVar) {
        if (this.f7003y) {
            return clone().mo7228g(aVar);
        }
        this.f6984f = (C7423a) C6223k.m24730d(aVar);
        this.f6982d |= 4;
        return mo7234k0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public C2247a mo7229g0(C7085g gVar) {
        if (this.f7003y) {
            return clone().mo7229g0(gVar);
        }
        this.f6998t.mo21314e(gVar);
        return mo7234k0();
    }

    /* renamed from: h */
    public C2247a mo7230h(C2535o oVar) {
        return mo7236l0(C2535o.f7986h, C6223k.m24730d(oVar));
    }

    public int hashCode() {
        return C6224l.m24747p(this.f7002x, C6224l.m24747p(this.f6993o, C6224l.m24747p(this.f7000v, C6224l.m24747p(this.f6999u, C6224l.m24747p(this.f6998t, C6224l.m24747p(this.f6985g, C6224l.m24747p(this.f6984f, C6224l.m24748q(this.f6979A, C6224l.m24748q(this.f7004z, C6224l.m24748q(this.f6995q, C6224l.m24748q(this.f6994p, C6224l.m24746o(this.f6992n, C6224l.m24746o(this.f6991m, C6224l.m24748q(this.f6990l, C6224l.m24747p(this.f6996r, C6224l.m24746o(this.f6997s, C6224l.m24747p(this.f6988j, C6224l.m24746o(this.f6989k, C6224l.m24747p(this.f6986h, C6224l.m24746o(this.f6987i, C6224l.m24743l(this.f6983e)))))))))))))))))))));
    }

    /* renamed from: j */
    public C2247a mo7232j(int i) {
        if (this.f7003y) {
            return clone().mo7232j(i);
        }
        this.f6987i = i;
        this.f6986h = null;
        this.f6982d = (this.f6982d | 32) & -17;
        return mo7234k0();
    }

    /* renamed from: k */
    public C2247a mo7233k(Drawable drawable) {
        if (this.f7003y) {
            return clone().mo7233k(drawable);
        }
        this.f6986h = drawable;
        this.f6987i = 0;
        this.f6982d = (this.f6982d | 16) & -33;
        return mo7234k0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k0 */
    public final C2247a mo7234k0() {
        if (!this.f7001w) {
            return m8565j0();
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    /* renamed from: l */
    public C2247a mo7235l() {
        return m8563h0(C2535o.f7981c, new C2555y());
    }

    /* renamed from: l0 */
    public C2247a mo7236l0(C7085g gVar, Object obj) {
        if (this.f7003y) {
            return clone().mo7236l0(gVar, obj);
        }
        C6223k.m24730d(gVar);
        C6223k.m24730d(obj);
        this.f6998t.mo21315f(gVar, obj);
        return mo7234k0();
    }

    /* renamed from: m */
    public final C7423a mo7237m() {
        return this.f6984f;
    }

    /* renamed from: m0 */
    public C2247a mo7238m0(C7083e eVar) {
        if (this.f7003y) {
            return clone().mo7238m0(eVar);
        }
        this.f6993o = (C7083e) C6223k.m24730d(eVar);
        this.f6982d |= C11398b.f33141t;
        return mo7234k0();
    }

    /* renamed from: n */
    public final int mo7239n() {
        return this.f6987i;
    }

    /* renamed from: n0 */
    public C2247a mo7240n0(float f) {
        if (this.f7003y) {
            return clone().mo7240n0(f);
        }
        if (f < Utils.FLOAT_EPSILON || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f6983e = f;
        this.f6982d |= 2;
        return mo7234k0();
    }

    /* renamed from: o */
    public final Drawable mo7241o() {
        return this.f6986h;
    }

    /* renamed from: o0 */
    public C2247a mo7242o0(boolean z) {
        if (this.f7003y) {
            return clone().mo7242o0(true);
        }
        this.f6990l = !z;
        this.f6982d |= C11398b.f33139r;
        return mo7234k0();
    }

    /* renamed from: p */
    public final Drawable mo7243p() {
        return this.f6996r;
    }

    /* renamed from: p0 */
    public C2247a mo7244p0(Resources.Theme theme) {
        if (this.f7003y) {
            return clone().mo7244p0(theme);
        }
        this.f7002x = theme;
        if (theme != null) {
            this.f6982d |= 32768;
            return mo7236l0(C8763m.f24613b, theme);
        }
        this.f6982d &= -32769;
        return mo7229g0(C8763m.f24613b);
    }

    /* renamed from: q */
    public final int mo7245q() {
        return this.f6997s;
    }

    /* renamed from: r */
    public final boolean mo7246r() {
        return this.f6979A;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r0 */
    public final C2247a mo7247r0(C2535o oVar, C7092l lVar) {
        if (this.f7003y) {
            return clone().mo7247r0(oVar, lVar);
        }
        mo7230h(oVar);
        return mo7252u0(lVar);
    }

    /* renamed from: s */
    public final C7088h mo7248s() {
        return this.f6998t;
    }

    /* renamed from: t */
    public final int mo7249t() {
        return this.f6991m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public C2247a mo7250t0(Class cls, C7092l lVar, boolean z) {
        if (this.f7003y) {
            return clone().mo7250t0(cls, lVar, z);
        }
        C6223k.m24730d(cls);
        C6223k.m24730d(lVar);
        this.f6999u.put(cls, lVar);
        int i = this.f6982d | C11398b.f33142u;
        this.f6995q = true;
        int i2 = i | 65536;
        this.f6982d = i2;
        this.f6980B = false;
        if (z) {
            this.f6982d = i2 | 131072;
            this.f6994p = true;
        }
        return mo7234k0();
    }

    /* renamed from: u */
    public final int mo7251u() {
        return this.f6992n;
    }

    /* renamed from: u0 */
    public C2247a mo7252u0(C7092l lVar) {
        return mo7253v0(lVar, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public C2247a mo7253v0(C7092l lVar, boolean z) {
        if (this.f7003y) {
            return clone().mo7253v0(lVar, z);
        }
        C2553w wVar = new C2553w(lVar, z);
        mo7250t0(Bitmap.class, lVar, z);
        mo7250t0(Drawable.class, wVar, z);
        mo7250t0(BitmapDrawable.class, wVar.mo8048c(), z);
        mo7250t0(C9046c.class, new C9050f(lVar), z);
        return mo7234k0();
    }

    /* renamed from: w0 */
    public C2247a mo7254w0(C7092l... lVarArr) {
        if (lVarArr.length > 1) {
            return mo7253v0(new C7084f(lVarArr), true);
        }
        if (lVarArr.length == 1) {
            return mo7252u0(lVarArr[0]);
        }
        return mo7234k0();
    }

    /* renamed from: x0 */
    public C2247a mo7255x0(C7092l... lVarArr) {
        return mo7253v0(new C7084f(lVarArr), true);
    }

    /* renamed from: y */
    public final Drawable mo7256y() {
        return this.f6988j;
    }

    /* renamed from: y0 */
    public C2247a mo7257y0(boolean z) {
        if (this.f7003y) {
            return clone().mo7257y0(z);
        }
        this.f6981C = z;
        this.f6982d |= 1048576;
        return mo7234k0();
    }

    /* renamed from: z */
    public final int mo7258z() {
        return this.f6989k;
    }
}
