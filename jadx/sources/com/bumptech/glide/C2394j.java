package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import p035c4.C2247a;
import p035c4.C2248b;
import p035c4.C2249c;
import p035c4.C2250d;
import p035c4.C2251e;
import p035c4.C2253f;
import p035c4.C2255g;
import p035c4.C2256h;
import p035c4.C2258j;
import p035c4.C2260k;
import p050d4.C5825i;
import p050d4.C5826j;
import p076f4.C6153a;
import p089g4.C6212e;
import p089g4.C6223k;
import p089g4.C6224l;
import p192o3.C7423a;

/* renamed from: com.bumptech.glide.j */
public class C2394j extends C2247a {

    /* renamed from: R */
    protected static final C2256h f7593R = ((C2256h) ((C2256h) ((C2256h) new C2256h().mo7228g(C7423a.f21688c)).mo7225e0(C2390g.LOW)).mo7242o0(true));

    /* renamed from: D */
    private final Context f7594D;

    /* renamed from: E */
    private final C2396k f7595E;

    /* renamed from: F */
    private final Class f7596F;

    /* renamed from: G */
    private final C2379b f7597G;

    /* renamed from: H */
    private final C2386d f7598H;

    /* renamed from: I */
    private C2400l f7599I;

    /* renamed from: J */
    private Object f7600J;

    /* renamed from: K */
    private List f7601K;

    /* renamed from: L */
    private C2394j f7602L;

    /* renamed from: M */
    private C2394j f7603M;

    /* renamed from: N */
    private Float f7604N;

    /* renamed from: O */
    private boolean f7605O = true;

    /* renamed from: P */
    private boolean f7606P;

    /* renamed from: Q */
    private boolean f7607Q;

    /* renamed from: com.bumptech.glide.j$a */
    static /* synthetic */ class C2395a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7608a;

        /* renamed from: b */
        static final /* synthetic */ int[] f7609b;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        static {
            /*
                com.bumptech.glide.g[] r0 = com.bumptech.glide.C2390g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7609b = r0
                r1 = 1
                com.bumptech.glide.g r2 = com.bumptech.glide.C2390g.LOW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f7609b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bumptech.glide.g r3 = com.bumptech.glide.C2390g.NORMAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f7609b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bumptech.glide.g r4 = com.bumptech.glide.C2390g.HIGH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f7609b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bumptech.glide.g r5 = com.bumptech.glide.C2390g.IMMEDIATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                android.widget.ImageView$ScaleType[] r4 = android.widget.ImageView.ScaleType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f7608a = r4
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f7608a     // Catch:{ NoSuchFieldError -> 0x004e }
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f7608a     // Catch:{ NoSuchFieldError -> 0x0058 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f7608a     // Catch:{ NoSuchFieldError -> 0x0062 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f7608a     // Catch:{ NoSuchFieldError -> 0x006d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f7608a     // Catch:{ NoSuchFieldError -> 0x0078 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f7608a     // Catch:{ NoSuchFieldError -> 0x0083 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f7608a     // Catch:{ NoSuchFieldError -> 0x008f }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C2394j.C2395a.<clinit>():void");
        }
    }

    protected C2394j(C2379b bVar, C2396k kVar, Class cls, Context context) {
        this.f7597G = bVar;
        this.f7595E = kVar;
        this.f7596F = cls;
        this.f7594D = context;
        this.f7599I = kVar.mo7749r(cls);
        this.f7598H = bVar.mo7688i();
        m9252H0(kVar.mo7747p());
        mo7215a(kVar.mo7748q());
    }

    /* renamed from: B0 */
    private C2394j m9247B0(C2394j jVar) {
        return (C2394j) ((C2394j) jVar.mo7244p0(this.f7594D.getTheme())).mo7238m0(C6153a.m24565c(this.f7594D));
    }

    /* renamed from: C0 */
    private C2250d m9248C0(C5825i iVar, C2255g gVar, C2247a aVar, Executor executor) {
        return m9249D0(new Object(), iVar, gVar, (C2251e) null, this.f7599I, aVar.mo7193A(), aVar.mo7251u(), aVar.mo7249t(), aVar, executor);
    }

    /* renamed from: D0 */
    private C2250d m9249D0(Object obj, C5825i iVar, C2255g gVar, C2251e eVar, C2400l lVar, C2390g gVar2, int i, int i2, C2247a aVar, Executor executor) {
        C2248b bVar;
        C2248b bVar2;
        if (this.f7603M != null) {
            bVar2 = new C2248b(obj, eVar);
            bVar = bVar2;
        } else {
            Object obj2 = obj;
            bVar = null;
            bVar2 = eVar;
        }
        C2250d E0 = m9250E0(obj, iVar, gVar, bVar2, lVar, gVar2, i, i2, aVar, executor);
        if (bVar == null) {
            return E0;
        }
        int u = this.f7603M.mo7251u();
        int t = this.f7603M.mo7249t();
        if (C6224l.m24752u(i, i2) && !this.f7603M.mo7210U()) {
            u = aVar.mo7251u();
            t = aVar.mo7249t();
        }
        C2394j jVar = this.f7603M;
        C2248b bVar3 = bVar;
        bVar3.mo7273q(E0, jVar.m9249D0(obj, iVar, gVar, bVar3, jVar.f7599I, jVar.mo7193A(), u, t, this.f7603M, executor));
        return bVar3;
    }

    /* renamed from: E0 */
    private C2250d m9250E0(Object obj, C5825i iVar, C2255g gVar, C2251e eVar, C2400l lVar, C2390g gVar2, int i, int i2, C2247a aVar, Executor executor) {
        C2400l lVar2;
        C2390g gVar3;
        Object obj2 = obj;
        C2251e eVar2 = eVar;
        C2390g gVar4 = gVar2;
        C2394j jVar = this.f7602L;
        if (jVar != null) {
            if (!this.f7607Q) {
                C2400l lVar3 = jVar.f7599I;
                if (jVar.f7605O) {
                    lVar2 = lVar;
                } else {
                    lVar2 = lVar3;
                }
                if (jVar.mo7204L()) {
                    gVar3 = this.f7602L.mo7193A();
                } else {
                    gVar3 = m9251G0(gVar4);
                }
                C2390g gVar5 = gVar3;
                int u = this.f7602L.mo7251u();
                int t = this.f7602L.mo7249t();
                if (C6224l.m24752u(i, i2) && !this.f7602L.mo7210U()) {
                    u = aVar.mo7251u();
                    t = aVar.mo7249t();
                }
                int i3 = t;
                C2260k kVar = new C2260k(obj2, eVar2);
                Object obj3 = obj;
                C5825i iVar2 = iVar;
                C2255g gVar6 = gVar;
                C2260k kVar2 = kVar;
                C2250d Y0 = m9257Y0(obj3, iVar2, gVar6, aVar, kVar, lVar, gVar2, i, i2, executor);
                this.f7607Q = true;
                C2394j jVar2 = this.f7602L;
                C2250d D0 = jVar2.m9249D0(obj3, iVar2, gVar6, kVar2, lVar2, gVar5, u, i3, jVar2, executor);
                this.f7607Q = false;
                kVar2.mo7301p(Y0, D0);
                return kVar2;
            }
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        } else if (this.f7604N == null) {
            return m9257Y0(obj, iVar, gVar, aVar, eVar, lVar, gVar2, i, i2, executor);
        } else {
            C2260k kVar3 = new C2260k(obj2, eVar2);
            C5825i iVar3 = iVar;
            C2255g gVar7 = gVar;
            C2260k kVar4 = kVar3;
            C2400l lVar4 = lVar;
            int i4 = i;
            int i5 = i2;
            Executor executor2 = executor;
            kVar3.mo7301p(m9257Y0(obj, iVar3, gVar7, aVar, kVar4, lVar4, gVar2, i4, i5, executor2), m9257Y0(obj, iVar3, gVar7, aVar.clone().mo7240n0(this.f7604N.floatValue()), kVar4, lVar4, m9251G0(gVar4), i4, i5, executor2));
            return kVar3;
        }
    }

    /* renamed from: G0 */
    private C2390g m9251G0(C2390g gVar) {
        int i = C2395a.f7609b[gVar.ordinal()];
        if (i == 1) {
            return C2390g.NORMAL;
        }
        if (i == 2) {
            return C2390g.HIGH;
        }
        if (i == 3 || i == 4) {
            return C2390g.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + mo7193A());
    }

    /* renamed from: H0 */
    private void m9252H0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mo7732z0((C2255g) it.next());
        }
    }

    /* renamed from: J0 */
    private C5825i m9253J0(C5825i iVar, C2255g gVar, C2247a aVar, Executor executor) {
        C6223k.m24730d(iVar);
        if (this.f7606P) {
            C2250d C0 = m9248C0(iVar, gVar, aVar, executor);
            C2250d h = iVar.mo7283h();
            if (!C0.mo7265f(h) || m9254M0(aVar, h)) {
                this.f7595E.mo7743n(iVar);
                iVar.mo7287j(C0);
                this.f7595E.mo7737E(iVar, C0);
                return iVar;
            }
            if (!((C2250d) C6223k.m24730d(h)).isRunning()) {
                h.mo7272l();
            }
            return iVar;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    /* renamed from: M0 */
    private boolean m9254M0(C2247a aVar, C2250d dVar) {
        return !aVar.mo7203K() && dVar.mo7268i();
    }

    /* renamed from: W0 */
    private C2394j m9255W0(Object obj) {
        if (mo7201I()) {
            return mo7224e().m9255W0(obj);
        }
        this.f7600J = obj;
        this.f7606P = true;
        return (C2394j) mo7234k0();
    }

    /* renamed from: X0 */
    private C2394j m9256X0(Uri uri, C2394j jVar) {
        if (uri == null || !"android.resource".equals(uri.getScheme())) {
            return jVar;
        }
        return m9247B0(jVar);
    }

    /* renamed from: Y0 */
    private C2250d m9257Y0(Object obj, C5825i iVar, C2255g gVar, C2247a aVar, C2251e eVar, C2400l lVar, C2390g gVar2, int i, int i2, Executor executor) {
        Context context = this.f7594D;
        C2386d dVar = this.f7598H;
        return C2258j.m8698z(context, dVar, obj, this.f7600J, this.f7596F, aVar, i, i2, gVar2, iVar, gVar, this.f7601K, eVar, dVar.mo7706f(), lVar.mo7763b(), executor);
    }

    /* renamed from: A0 */
    public C2394j mo7215a(C2247a aVar) {
        C6223k.m24730d(aVar);
        return (C2394j) super.mo7215a(aVar);
    }

    /* renamed from: F0 */
    public C2394j mo7224e() {
        C2394j jVar = (C2394j) super.clone();
        jVar.f7599I = jVar.f7599I.clone();
        if (jVar.f7601K != null) {
            jVar.f7601K = new ArrayList(jVar.f7601K);
        }
        C2394j jVar2 = jVar.f7602L;
        if (jVar2 != null) {
            jVar.f7602L = jVar2.mo7224e();
        }
        C2394j jVar3 = jVar.f7603M;
        if (jVar3 != null) {
            jVar.f7603M = jVar3.mo7224e();
        }
        return jVar;
    }

    /* renamed from: I0 */
    public C5825i mo7716I0(C5825i iVar) {
        return mo7717K0(iVar, (C2255g) null, C6212e.m24711b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K0 */
    public C5825i mo7717K0(C5825i iVar, C2255g gVar, Executor executor) {
        return m9253J0(iVar, gVar, this, executor);
    }

    /* renamed from: L0 */
    public C5826j mo7718L0(ImageView imageView) {
        C2247a aVar;
        C6224l.m24733b();
        C6223k.m24730d(imageView);
        if (!mo7209T() && mo7207Q() && imageView.getScaleType() != null) {
            switch (C2395a.f7608a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVar = clone().mo7212W();
                    break;
                case 2:
                    aVar = clone().mo7213X();
                    break;
                case 3:
                case 4:
                case 5:
                    aVar = clone().mo7214Y();
                    break;
                case 6:
                    aVar = clone().mo7213X();
                    break;
            }
        }
        aVar = this;
        return (C5826j) m9253J0(this.f7598H.mo7701a(imageView, this.f7596F), (C2255g) null, aVar, C6212e.m24711b());
    }

    /* renamed from: N0 */
    public C2394j mo7719N0(C2255g gVar) {
        if (mo7201I()) {
            return mo7224e().mo7719N0(gVar);
        }
        this.f7601K = null;
        return mo7732z0(gVar);
    }

    /* renamed from: O0 */
    public C2394j mo7720O0(Bitmap bitmap) {
        return m9255W0(bitmap).mo7215a(C2256h.m8673A0(C7423a.f21687b));
    }

    /* renamed from: P0 */
    public C2394j mo7721P0(Drawable drawable) {
        return m9255W0(drawable).mo7215a(C2256h.m8673A0(C7423a.f21687b));
    }

    /* renamed from: Q0 */
    public C2394j mo7722Q0(Uri uri) {
        return m9256X0(uri, m9255W0(uri));
    }

    /* renamed from: R0 */
    public C2394j mo7723R0(File file) {
        return m9255W0(file);
    }

    /* renamed from: S0 */
    public C2394j mo7724S0(Integer num) {
        return m9247B0(m9255W0(num));
    }

    /* renamed from: T0 */
    public C2394j mo7725T0(Object obj) {
        return m9255W0(obj);
    }

    /* renamed from: U0 */
    public C2394j mo7726U0(String str) {
        return m9255W0(str);
    }

    /* renamed from: V0 */
    public C2394j mo7727V0(byte[] bArr) {
        C2394j W0 = m9255W0(bArr);
        if (!W0.mo7202J()) {
            W0 = W0.mo7215a(C2256h.m8673A0(C7423a.f21687b));
        }
        if (!W0.mo7206P()) {
            return W0.mo7215a(C2256h.m8675C0(true));
        }
        return W0;
    }

    /* renamed from: Z0 */
    public C2249c mo7728Z0() {
        return mo7729a1(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: a1 */
    public C2249c mo7729a1(int i, int i2) {
        C2253f fVar = new C2253f(i, i2);
        return (C2249c) mo7717K0(fVar, fVar, C6212e.m24710a());
    }

    /* renamed from: b1 */
    public C2394j mo7730b1(C2394j jVar) {
        if (mo7201I()) {
            return mo7224e().mo7730b1(jVar);
        }
        this.f7602L = jVar;
        return (C2394j) mo7234k0();
    }

    /* renamed from: c1 */
    public C2394j mo7731c1(C2400l lVar) {
        if (mo7201I()) {
            return mo7224e().mo7731c1(lVar);
        }
        this.f7599I = (C2400l) C6223k.m24730d(lVar);
        this.f7605O = false;
        return (C2394j) mo7234k0();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2394j)) {
            return false;
        }
        C2394j jVar = (C2394j) obj;
        if (!super.equals(jVar) || !Objects.equals(this.f7596F, jVar.f7596F) || !this.f7599I.equals(jVar.f7599I) || !Objects.equals(this.f7600J, jVar.f7600J) || !Objects.equals(this.f7601K, jVar.f7601K) || !Objects.equals(this.f7602L, jVar.f7602L) || !Objects.equals(this.f7603M, jVar.f7603M) || !Objects.equals(this.f7604N, jVar.f7604N) || this.f7605O != jVar.f7605O || this.f7606P != jVar.f7606P) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C6224l.m24748q(this.f7606P, C6224l.m24748q(this.f7605O, C6224l.m24747p(this.f7604N, C6224l.m24747p(this.f7603M, C6224l.m24747p(this.f7602L, C6224l.m24747p(this.f7601K, C6224l.m24747p(this.f7600J, C6224l.m24747p(this.f7599I, C6224l.m24747p(this.f7596F, super.hashCode())))))))));
    }

    /* renamed from: z0 */
    public C2394j mo7732z0(C2255g gVar) {
        if (mo7201I()) {
            return mo7224e().mo7732z0(gVar);
        }
        if (gVar != null) {
            if (this.f7601K == null) {
                this.f7601K = new ArrayList();
            }
            this.f7601K.add(gVar);
        }
        return (C2394j) mo7234k0();
    }
}
