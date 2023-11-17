package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p020b2.C2147v;
import p048d2.C5804f;
import p048d2.C5805g;
import p048d2.C5807i;
import p061e2.C6015c;
import p242s1.C8100a;
import p281v1.C8685a;
import p281v1.C8686b;
import p294w1.C8736c;
import p294w1.C8738e;
import p294w1.C8741h;
import p331z1.C9171c;

/* renamed from: com.airbnb.lottie.d0 */
public class C2315d0 extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: A */
    private final Matrix f7202A;

    /* renamed from: B */
    private Bitmap f7203B;

    /* renamed from: C */
    private Canvas f7204C;

    /* renamed from: D */
    private Rect f7205D;

    /* renamed from: E */
    private RectF f7206E;

    /* renamed from: F */
    private Paint f7207F;

    /* renamed from: G */
    private Rect f7208G;

    /* renamed from: H */
    private Rect f7209H;

    /* renamed from: I */
    private RectF f7210I;

    /* renamed from: J */
    private RectF f7211J;

    /* renamed from: K */
    private Matrix f7212K;

    /* renamed from: L */
    private Matrix f7213L;

    /* renamed from: M */
    private boolean f7214M;

    /* renamed from: d */
    private C2325h f7215d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C5805g f7216e;

    /* renamed from: f */
    private boolean f7217f = true;

    /* renamed from: g */
    private boolean f7218g = false;

    /* renamed from: h */
    private boolean f7219h = false;

    /* renamed from: i */
    private C2318c f7220i = C2318c.NONE;

    /* renamed from: j */
    private final ArrayList f7221j = new ArrayList();

    /* renamed from: k */
    private final ValueAnimator.AnimatorUpdateListener f7222k;

    /* renamed from: l */
    private C8686b f7223l;

    /* renamed from: m */
    private String f7224m;

    /* renamed from: n */
    private C8685a f7225n;

    /* renamed from: o */
    private Map f7226o;

    /* renamed from: p */
    String f7227p;

    /* renamed from: q */
    private boolean f7228q;

    /* renamed from: r */
    private boolean f7229r;

    /* renamed from: s */
    private boolean f7230s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C9171c f7231t;

    /* renamed from: u */
    private int f7232u;

    /* renamed from: v */
    private boolean f7233v;

    /* renamed from: w */
    private boolean f7234w;

    /* renamed from: x */
    private boolean f7235x;

    /* renamed from: y */
    private C2342o0 f7236y;

    /* renamed from: z */
    private boolean f7237z;

    /* renamed from: com.airbnb.lottie.d0$a */
    class C2316a implements ValueAnimator.AnimatorUpdateListener {
        C2316a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (C2315d0.this.f7231t != null) {
                C2315d0.this.f7231t.mo24752M(C2315d0.this.f7216e.mo18997k());
            }
        }
    }

    /* renamed from: com.airbnb.lottie.d0$b */
    private interface C2317b {
        /* renamed from: a */
        void mo7449a(C2325h hVar);
    }

    /* renamed from: com.airbnb.lottie.d0$c */
    private enum C2318c {
        NONE,
        PLAY,
        RESUME
    }

    public C2315d0() {
        C5805g gVar = new C5805g();
        this.f7216e = gVar;
        C2316a aVar = new C2316a();
        this.f7222k = aVar;
        this.f7229r = false;
        this.f7230s = true;
        this.f7232u = C11051p3.f31759c;
        this.f7236y = C2342o0.AUTOMATIC;
        this.f7237z = false;
        this.f7202A = new Matrix();
        this.f7214M = false;
        gVar.addUpdateListener(aVar);
    }

    /* renamed from: C */
    private void m8891C(int i, int i2) {
        Bitmap bitmap = this.f7203B;
        if (bitmap == null || bitmap.getWidth() < i || this.f7203B.getHeight() < i2) {
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.f7203B = createBitmap;
            this.f7204C.setBitmap(createBitmap);
            this.f7214M = true;
        } else if (this.f7203B.getWidth() > i || this.f7203B.getHeight() > i2) {
            Bitmap createBitmap2 = Bitmap.createBitmap(this.f7203B, 0, 0, i, i2);
            this.f7203B = createBitmap2;
            this.f7204C.setBitmap(createBitmap2);
            this.f7214M = true;
        }
    }

    /* renamed from: D */
    private void m8892D() {
        if (this.f7204C == null) {
            this.f7204C = new Canvas();
            this.f7211J = new RectF();
            this.f7212K = new Matrix();
            this.f7213L = new Matrix();
            this.f7205D = new Rect();
            this.f7206E = new RectF();
            this.f7207F = new C8100a();
            this.f7208G = new Rect();
            this.f7209H = new Rect();
            this.f7210I = new RectF();
        }
    }

    /* renamed from: H */
    private Context m8893H() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    /* renamed from: I */
    private C8685a m8894I() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f7225n == null) {
            C8685a aVar = new C8685a(getCallback(), (C2307a) null);
            this.f7225n = aVar;
            String str = this.f7227p;
            if (str != null) {
                aVar.mo24059c(str);
            }
        }
        return this.f7225n;
    }

    /* renamed from: K */
    private C8686b m8895K() {
        C8686b bVar = this.f7223l;
        if (bVar != null && !bVar.mo24062b(m8893H())) {
            this.f7223l = null;
        }
        if (this.f7223l == null) {
            this.f7223l = new C8686b(getCallback(), this.f7224m, (C2309b) null, this.f7215d.mo7551j());
        }
        return this.f7223l;
    }

    /* renamed from: Y */
    private boolean m8896Y() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        if (parent instanceof ViewGroup) {
            return !((ViewGroup) parent).getClipChildren();
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public /* synthetic */ void m8900c0(C8738e eVar, Object obj, C6015c cVar, C2325h hVar) {
        mo7511q(eVar, obj, cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public /* synthetic */ void m8902d0(C2325h hVar) {
        mo7512q0();
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public /* synthetic */ void m8904e0(C2325h hVar) {
        mo7525v0();
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public /* synthetic */ void m8906f0(int i, C2325h hVar) {
        mo7456D0(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public /* synthetic */ void m8908g0(int i, C2325h hVar) {
        mo7464I0(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public /* synthetic */ void m8910h0(String str, C2325h hVar) {
        mo7466J0(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public /* synthetic */ void m8912i0(float f, C2325h hVar) {
        mo7467K0(f);
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public /* synthetic */ void m8914j0(int i, int i2, C2325h hVar) {
        mo7469L0(i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public /* synthetic */ void m8916k0(String str, C2325h hVar) {
        mo7471M0(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public /* synthetic */ void m8918l0(int i, C2325h hVar) {
        mo7473N0(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public /* synthetic */ void m8920m0(String str, C2325h hVar) {
        mo7475O0(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public /* synthetic */ void m8922n0(float f, C2325h hVar) {
        mo7477P0(f);
    }

    /* access modifiers changed from: private */
    /* renamed from: o0 */
    public /* synthetic */ void m8924o0(float f, C2325h hVar) {
        mo7483S0(f);
    }

    /* renamed from: r */
    private boolean m8925r() {
        return this.f7217f || this.f7218g;
    }

    /* renamed from: s */
    private void m8926s() {
        C2325h hVar = this.f7215d;
        if (hVar != null) {
            C9171c cVar = new C9171c(this, C2147v.m8250b(hVar), hVar.mo7552k(), hVar);
            this.f7231t = cVar;
            if (this.f7234w) {
                cVar.mo24750K(true);
            }
            this.f7231t.mo24759P(this.f7230s);
        }
    }

    /* renamed from: t0 */
    private void m8927t0(Canvas canvas, C9171c cVar) {
        if (this.f7215d != null && cVar != null) {
            m8892D();
            canvas.getMatrix(this.f7212K);
            canvas.getClipBounds(this.f7205D);
            m8929w(this.f7205D, this.f7206E);
            this.f7212K.mapRect(this.f7206E);
            m8931x(this.f7206E, this.f7205D);
            if (this.f7230s) {
                this.f7211J.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) getIntrinsicWidth(), (float) getIntrinsicHeight());
            } else {
                cVar.mo23471e(this.f7211J, (Matrix) null, false);
            }
            this.f7212K.mapRect(this.f7211J);
            Rect bounds = getBounds();
            float width = ((float) bounds.width()) / ((float) getIntrinsicWidth());
            float height = ((float) bounds.height()) / ((float) getIntrinsicHeight());
            m8930w0(this.f7211J, width, height);
            if (!m8896Y()) {
                RectF rectF = this.f7211J;
                Rect rect = this.f7205D;
                rectF.intersect((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
            }
            int ceil = (int) Math.ceil((double) this.f7211J.width());
            int ceil2 = (int) Math.ceil((double) this.f7211J.height());
            if (ceil != 0 && ceil2 != 0) {
                m8891C(ceil, ceil2);
                if (this.f7214M) {
                    this.f7202A.set(this.f7212K);
                    this.f7202A.preScale(width, height);
                    Matrix matrix = this.f7202A;
                    RectF rectF2 = this.f7211J;
                    matrix.postTranslate(-rectF2.left, -rectF2.top);
                    this.f7203B.eraseColor(0);
                    cVar.mo23473h(this.f7204C, this.f7202A, this.f7232u);
                    this.f7212K.invert(this.f7213L);
                    this.f7213L.mapRect(this.f7210I, this.f7211J);
                    m8931x(this.f7210I, this.f7209H);
                }
                this.f7208G.set(0, 0, ceil, ceil2);
                canvas.drawBitmap(this.f7203B, this.f7208G, this.f7209H, this.f7207F);
            }
        }
    }

    /* renamed from: v */
    private void m8928v() {
        C2325h hVar = this.f7215d;
        if (hVar != null) {
            this.f7237z = this.f7236y.mo7584b(Build.VERSION.SDK_INT, hVar.mo7558q(), hVar.mo7554m());
        }
    }

    /* renamed from: w */
    private void m8929w(Rect rect, RectF rectF) {
        rectF.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
    }

    /* renamed from: w0 */
    private void m8930w0(RectF rectF, float f, float f2) {
        rectF.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
    }

    /* renamed from: x */
    private void m8931x(RectF rectF, Rect rect) {
        rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
    }

    /* renamed from: y */
    private void m8932y(Canvas canvas) {
        C9171c cVar = this.f7231t;
        C2325h hVar = this.f7215d;
        if (cVar != null && hVar != null) {
            this.f7202A.reset();
            Rect bounds = getBounds();
            if (!bounds.isEmpty()) {
                this.f7202A.preScale(((float) bounds.width()) / ((float) hVar.mo7543b().width()), ((float) bounds.height()) / ((float) hVar.mo7543b().height()));
                this.f7202A.preTranslate((float) bounds.left, (float) bounds.top);
            }
            cVar.mo23473h(canvas, this.f7202A, this.f7232u);
        }
    }

    /* renamed from: A */
    public boolean mo7451A() {
        return this.f7228q;
    }

    /* renamed from: A0 */
    public void mo7452A0(String str) {
        this.f7227p = str;
        C8685a I = m8894I();
        if (I != null) {
            I.mo24059c(str);
        }
    }

    /* renamed from: B */
    public void mo7453B() {
        this.f7221j.clear();
        this.f7216e.mo18996j();
        if (!isVisible()) {
            this.f7220i = C2318c.NONE;
        }
    }

    /* renamed from: B0 */
    public void mo7454B0(C2307a aVar) {
        C8685a aVar2 = this.f7225n;
        if (aVar2 != null) {
            aVar2.mo24060d(aVar);
        }
    }

    /* renamed from: C0 */
    public void mo7455C0(Map map) {
        if (map != this.f7226o) {
            this.f7226o = map;
            invalidateSelf();
        }
    }

    /* renamed from: D0 */
    public void mo7456D0(int i) {
        if (this.f7215d == null) {
            this.f7221j.add(new C2348r(this, i));
        } else {
            this.f7216e.mo18983C((float) i);
        }
    }

    /* renamed from: E */
    public Bitmap mo7457E(String str) {
        C8686b K = m8895K();
        if (K != null) {
            return K.mo24061a(str);
        }
        return null;
    }

    /* renamed from: E0 */
    public void mo7458E0(boolean z) {
        this.f7218g = z;
    }

    /* renamed from: F */
    public boolean mo7459F() {
        return this.f7230s;
    }

    /* renamed from: F0 */
    public void mo7460F0(C2309b bVar) {
        C8686b bVar2 = this.f7223l;
        if (bVar2 != null) {
            bVar2.mo24063d(bVar);
        }
    }

    /* renamed from: G */
    public C2325h mo7461G() {
        return this.f7215d;
    }

    /* renamed from: G0 */
    public void mo7462G0(String str) {
        this.f7224m = str;
    }

    /* renamed from: H0 */
    public void mo7463H0(boolean z) {
        this.f7229r = z;
    }

    /* renamed from: I0 */
    public void mo7464I0(int i) {
        if (this.f7215d == null) {
            this.f7221j.add(new C2353w(this, i));
        } else {
            this.f7216e.mo18984D(((float) i) + 0.99f);
        }
    }

    /* renamed from: J */
    public int mo7465J() {
        return (int) this.f7216e.mo18998l();
    }

    /* renamed from: J0 */
    public void mo7466J0(String str) {
        C2325h hVar = this.f7215d;
        if (hVar == null) {
            this.f7221j.add(new C2355y(this, str));
            return;
        }
        C8741h l = hVar.mo7553l(str);
        if (l != null) {
            mo7464I0((int) (l.f24599b + l.f24600c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    /* renamed from: K0 */
    public void mo7467K0(float f) {
        C2325h hVar = this.f7215d;
        if (hVar == null) {
            this.f7221j.add(new C2310b0(this, f));
        } else {
            this.f7216e.mo18984D(C5807i.m23370i(hVar.mo7557p(), this.f7215d.mo7547f(), f));
        }
    }

    /* renamed from: L */
    public String mo7468L() {
        return this.f7224m;
    }

    /* renamed from: L0 */
    public void mo7469L0(int i, int i2) {
        if (this.f7215d == null) {
            this.f7221j.add(new C2350t(this, i, i2));
        } else {
            this.f7216e.mo18985E((float) i, ((float) i2) + 0.99f);
        }
    }

    /* renamed from: M */
    public C2320e0 mo7470M(String str) {
        C2325h hVar = this.f7215d;
        if (hVar == null) {
            return null;
        }
        return (C2320e0) hVar.mo7551j().get(str);
    }

    /* renamed from: M0 */
    public void mo7471M0(String str) {
        C2325h hVar = this.f7215d;
        if (hVar == null) {
            this.f7221j.add(new C2349s(this, str));
            return;
        }
        C8741h l = hVar.mo7553l(str);
        if (l != null) {
            int i = (int) l.f24599b;
            mo7469L0(i, ((int) l.f24600c) + i);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    /* renamed from: N */
    public boolean mo7472N() {
        return this.f7229r;
    }

    /* renamed from: N0 */
    public void mo7473N0(int i) {
        if (this.f7215d == null) {
            this.f7221j.add(new C2351u(this, i));
        } else {
            this.f7216e.mo18986F(i);
        }
    }

    /* renamed from: O */
    public float mo7474O() {
        return this.f7216e.mo18999n();
    }

    /* renamed from: O0 */
    public void mo7475O0(String str) {
        C2325h hVar = this.f7215d;
        if (hVar == null) {
            this.f7221j.add(new C2356z(this, str));
            return;
        }
        C8741h l = hVar.mo7553l(str);
        if (l != null) {
            mo7473N0((int) l.f24599b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    /* renamed from: P */
    public float mo7476P() {
        return this.f7216e.mo19000o();
    }

    /* renamed from: P0 */
    public void mo7477P0(float f) {
        C2325h hVar = this.f7215d;
        if (hVar == null) {
            this.f7221j.add(new C2352v(this, f));
        } else {
            mo7473N0((int) C5807i.m23370i(hVar.mo7557p(), this.f7215d.mo7547f(), f));
        }
    }

    /* renamed from: Q */
    public C2335l0 mo7478Q() {
        C2325h hVar = this.f7215d;
        if (hVar != null) {
            return hVar.mo7555n();
        }
        return null;
    }

    /* renamed from: Q0 */
    public void mo7479Q0(boolean z) {
        if (this.f7234w != z) {
            this.f7234w = z;
            C9171c cVar = this.f7231t;
            if (cVar != null) {
                cVar.mo24750K(z);
            }
        }
    }

    /* renamed from: R */
    public float mo7480R() {
        return this.f7216e.mo18997k();
    }

    /* renamed from: R0 */
    public void mo7481R0(boolean z) {
        this.f7233v = z;
        C2325h hVar = this.f7215d;
        if (hVar != null) {
            hVar.mo7564v(z);
        }
    }

    /* renamed from: S */
    public C2342o0 mo7482S() {
        return this.f7237z ? C2342o0.SOFTWARE : C2342o0.HARDWARE;
    }

    /* renamed from: S0 */
    public void mo7483S0(float f) {
        if (this.f7215d == null) {
            this.f7221j.add(new C2346q(this, f));
            return;
        }
        C2311c.m8884a("Drawable#setProgress");
        this.f7216e.mo18983C(this.f7215d.mo7549h(f));
        C2311c.m8885b("Drawable#setProgress");
    }

    /* renamed from: T */
    public int mo7484T() {
        return this.f7216e.getRepeatCount();
    }

    /* renamed from: T0 */
    public void mo7485T0(C2342o0 o0Var) {
        this.f7236y = o0Var;
        m8928v();
    }

    /* renamed from: U */
    public int mo7486U() {
        return this.f7216e.getRepeatMode();
    }

    /* renamed from: U0 */
    public void mo7487U0(int i) {
        this.f7216e.setRepeatCount(i);
    }

    /* renamed from: V */
    public float mo7488V() {
        return this.f7216e.mo19001p();
    }

    /* renamed from: V0 */
    public void mo7489V0(int i) {
        this.f7216e.setRepeatMode(i);
    }

    /* renamed from: W */
    public C2347q0 mo7490W() {
        return null;
    }

    /* renamed from: W0 */
    public void mo7491W0(boolean z) {
        this.f7219h = z;
    }

    /* renamed from: X */
    public Typeface mo7492X(C8736c cVar) {
        Map map = this.f7226o;
        if (map != null) {
            String a = cVar.mo24127a();
            if (map.containsKey(a)) {
                return (Typeface) map.get(a);
            }
            String b = cVar.mo24128b();
            if (map.containsKey(b)) {
                return (Typeface) map.get(b);
            }
            String str = cVar.mo24127a() + "-" + cVar.mo24129c();
            if (map.containsKey(str)) {
                return (Typeface) map.get(str);
            }
        }
        C8685a I = m8894I();
        if (I != null) {
            return I.mo24058b(cVar);
        }
        return null;
    }

    /* renamed from: X0 */
    public void mo7493X0(float f) {
        this.f7216e.mo18987G(f);
    }

    /* renamed from: Y0 */
    public void mo7494Y0(Boolean bool) {
        this.f7217f = bool.booleanValue();
    }

    /* renamed from: Z */
    public boolean mo7495Z() {
        C5805g gVar = this.f7216e;
        if (gVar == null) {
            return false;
        }
        return gVar.isRunning();
    }

    /* renamed from: Z0 */
    public void mo7496Z0(C2347q0 q0Var) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public boolean mo7497a0() {
        if (isVisible()) {
            return this.f7216e.isRunning();
        }
        C2318c cVar = this.f7220i;
        if (cVar == C2318c.PLAY || cVar == C2318c.RESUME) {
            return true;
        }
        return false;
    }

    /* renamed from: a1 */
    public void mo7498a1(boolean z) {
        this.f7216e.mo18988H(z);
    }

    /* renamed from: b0 */
    public boolean mo7499b0() {
        return this.f7235x;
    }

    /* renamed from: b1 */
    public boolean mo7500b1() {
        return this.f7226o == null && this.f7215d.mo7544c().size() > 0;
    }

    public void draw(Canvas canvas) {
        C2311c.m8884a("Drawable#draw");
        if (this.f7219h) {
            try {
                if (this.f7237z) {
                    m8927t0(canvas, this.f7231t);
                } else {
                    m8932y(canvas);
                }
            } catch (Throwable th) {
                C5804f.m23333b("Lottie crashed in draw!", th);
            }
        } else if (this.f7237z) {
            m8927t0(canvas, this.f7231t);
        } else {
            m8932y(canvas);
        }
        this.f7214M = false;
        C2311c.m8885b("Drawable#draw");
    }

    public int getAlpha() {
        return this.f7232u;
    }

    public int getIntrinsicHeight() {
        C2325h hVar = this.f7215d;
        if (hVar == null) {
            return -1;
        }
        return hVar.mo7543b().height();
    }

    public int getIntrinsicWidth() {
        C2325h hVar = this.f7215d;
        if (hVar == null) {
            return -1;
        }
        return hVar.mo7543b().width();
    }

    public int getOpacity() {
        return -3;
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public void invalidateSelf() {
        if (!this.f7214M) {
            this.f7214M = true;
            Drawable.Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public boolean isRunning() {
        return mo7495Z();
    }

    /* renamed from: p */
    public void mo7509p(Animator.AnimatorListener animatorListener) {
        this.f7216e.addListener(animatorListener);
    }

    /* renamed from: p0 */
    public void mo7510p0() {
        this.f7221j.clear();
        this.f7216e.mo19002r();
        if (!isVisible()) {
            this.f7220i = C2318c.NONE;
        }
    }

    /* renamed from: q */
    public void mo7511q(C8738e eVar, Object obj, C6015c cVar) {
        C9171c cVar2 = this.f7231t;
        if (cVar2 == null) {
            this.f7221j.add(new C2308a0(this, eVar, obj, cVar));
            return;
        }
        boolean z = true;
        if (eVar == C8738e.f24593c) {
            cVar2.mo23470c(obj, cVar);
        } else if (eVar.mo24137d() != null) {
            eVar.mo24137d().mo23470c(obj, cVar);
        } else {
            List u0 = mo7523u0(eVar);
            for (int i = 0; i < u0.size(); i++) {
                ((C8738e) u0.get(i)).mo24137d().mo23470c(obj, cVar);
            }
            z = true ^ u0.isEmpty();
        }
        if (z) {
            invalidateSelf();
            if (obj == C2326h0.f7271E) {
                mo7483S0(mo7480R());
            }
        }
    }

    /* renamed from: q0 */
    public void mo7512q0() {
        float f;
        if (this.f7231t == null) {
            this.f7221j.add(new C2313c0(this));
            return;
        }
        m8928v();
        if (m8925r() || mo7484T() == 0) {
            if (isVisible()) {
                this.f7216e.mo19003s();
                this.f7220i = C2318c.NONE;
            } else {
                this.f7220i = C2318c.PLAY;
            }
        }
        if (!m8925r()) {
            if (mo7488V() < Utils.FLOAT_EPSILON) {
                f = mo7476P();
            } else {
                f = mo7474O();
            }
            mo7456D0((int) f);
            this.f7216e.mo18996j();
            if (!isVisible()) {
                this.f7220i = C2318c.NONE;
            }
        }
    }

    /* renamed from: r0 */
    public void mo7513r0() {
        this.f7216e.removeAllListeners();
    }

    /* renamed from: s0 */
    public void mo7514s0(Animator.AnimatorListener animatorListener) {
        this.f7216e.removeListener(animatorListener);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        this.f7232u = i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        C5804f.m23334c("Use addColorFilter instead.");
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean z3 = !isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            C2318c cVar = this.f7220i;
            if (cVar == C2318c.PLAY) {
                mo7512q0();
            } else if (cVar == C2318c.RESUME) {
                mo7525v0();
            }
        } else if (this.f7216e.isRunning()) {
            mo7510p0();
            this.f7220i = C2318c.RESUME;
        } else if (!z3) {
            this.f7220i = C2318c.NONE;
        }
        return visible;
    }

    public void start() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View) || !((View) callback).isInEditMode()) {
            mo7512q0();
        }
    }

    public void stop() {
        mo7453B();
    }

    /* renamed from: t */
    public void mo7521t() {
        this.f7221j.clear();
        this.f7216e.cancel();
        if (!isVisible()) {
            this.f7220i = C2318c.NONE;
        }
    }

    /* renamed from: u */
    public void mo7522u() {
        if (this.f7216e.isRunning()) {
            this.f7216e.cancel();
            if (!isVisible()) {
                this.f7220i = C2318c.NONE;
            }
        }
        this.f7215d = null;
        this.f7231t = null;
        this.f7223l = null;
        this.f7216e.mo18994h();
        invalidateSelf();
    }

    /* renamed from: u0 */
    public List mo7523u0(C8738e eVar) {
        if (this.f7231t == null) {
            C5804f.m23334c("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f7231t.mo23472f(eVar, 0, arrayList, new C8738e(new String[0]));
        return arrayList;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: v0 */
    public void mo7525v0() {
        float f;
        if (this.f7231t == null) {
            this.f7221j.add(new C2354x(this));
            return;
        }
        m8928v();
        if (m8925r() || mo7484T() == 0) {
            if (isVisible()) {
                this.f7216e.mo19008z();
                this.f7220i = C2318c.NONE;
            } else {
                this.f7220i = C2318c.RESUME;
            }
        }
        if (!m8925r()) {
            if (mo7488V() < Utils.FLOAT_EPSILON) {
                f = mo7476P();
            } else {
                f = mo7474O();
            }
            mo7456D0((int) f);
            this.f7216e.mo18996j();
            if (!isVisible()) {
                this.f7220i = C2318c.NONE;
            }
        }
    }

    /* renamed from: x0 */
    public void mo7526x0(boolean z) {
        this.f7235x = z;
    }

    /* renamed from: y0 */
    public void mo7527y0(boolean z) {
        if (z != this.f7230s) {
            this.f7230s = z;
            C9171c cVar = this.f7231t;
            if (cVar != null) {
                cVar.mo24759P(z);
            }
            invalidateSelf();
        }
    }

    /* renamed from: z */
    public void mo7528z(boolean z) {
        if (this.f7228q != z) {
            this.f7228q = z;
            if (this.f7215d != null) {
                m8926s();
            }
        }
    }

    /* renamed from: z0 */
    public boolean mo7529z0(C2325h hVar) {
        if (this.f7215d == hVar) {
            return false;
        }
        this.f7214M = true;
        mo7522u();
        this.f7215d = hVar;
        m8926s();
        this.f7216e.mo18982B(hVar);
        mo7483S0(this.f7216e.getAnimatedFraction());
        Iterator it = new ArrayList(this.f7221j).iterator();
        while (it.hasNext()) {
            C2317b bVar = (C2317b) it.next();
            if (bVar != null) {
                bVar.mo7449a(hVar);
            }
            it.remove();
        }
        this.f7221j.clear();
        hVar.mo7564v(this.f7233v);
        m8928v();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable((Drawable) null);
            imageView.setImageDrawable(this);
        }
        return true;
    }
}
