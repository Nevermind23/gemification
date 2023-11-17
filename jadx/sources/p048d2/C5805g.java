package p048d2;

import android.view.Choreographer;
import com.airbnb.lottie.C2311c;
import com.airbnb.lottie.C2325h;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: d2.g */
public class C5805g extends C5801c implements Choreographer.FrameCallback {

    /* renamed from: g */
    private float f18279g = 1.0f;

    /* renamed from: h */
    private boolean f18280h = false;

    /* renamed from: i */
    private long f18281i = 0;

    /* renamed from: j */
    private float f18282j = Utils.FLOAT_EPSILON;

    /* renamed from: k */
    private float f18283k = Utils.FLOAT_EPSILON;

    /* renamed from: l */
    private int f18284l = 0;

    /* renamed from: m */
    private float f18285m = -2.14748365E9f;

    /* renamed from: n */
    private float f18286n = 2.14748365E9f;

    /* renamed from: o */
    private C2325h f18287o;

    /* renamed from: p */
    protected boolean f18288p = false;

    /* renamed from: q */
    private boolean f18289q = false;

    /* renamed from: I */
    private void m23336I() {
        if (this.f18287o != null) {
            float f = this.f18283k;
            if (f < this.f18285m || f > this.f18286n) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", new Object[]{Float.valueOf(this.f18285m), Float.valueOf(this.f18286n), Float.valueOf(this.f18283k)}));
            }
        }
    }

    /* renamed from: m */
    private float m23337m() {
        C2325h hVar = this.f18287o;
        if (hVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / hVar.mo7550i()) / Math.abs(this.f18279g);
    }

    /* renamed from: q */
    private boolean m23338q() {
        return mo19001p() < Utils.FLOAT_EPSILON;
    }

    /* renamed from: A */
    public void mo18981A() {
        mo18987G(-mo19001p());
    }

    /* renamed from: B */
    public void mo18982B(C2325h hVar) {
        boolean z;
        if (this.f18287o == null) {
            z = true;
        } else {
            z = false;
        }
        this.f18287o = hVar;
        if (z) {
            mo18985E(Math.max(this.f18285m, hVar.mo7557p()), Math.min(this.f18286n, hVar.mo7547f()));
        } else {
            mo18985E((float) ((int) hVar.mo7557p()), (float) ((int) hVar.mo7547f()));
        }
        float f = this.f18283k;
        this.f18283k = Utils.FLOAT_EPSILON;
        this.f18282j = Utils.FLOAT_EPSILON;
        mo18983C((float) ((int) f));
        mo18970g();
    }

    /* renamed from: C */
    public void mo18983C(float f) {
        if (this.f18282j != f) {
            float b = C5807i.m23363b(f, mo19000o(), mo18999n());
            this.f18282j = b;
            if (this.f18289q) {
                b = (float) Math.floor((double) b);
            }
            this.f18283k = b;
            this.f18281i = 0;
            mo18970g();
        }
    }

    /* renamed from: D */
    public void mo18984D(float f) {
        mo18985E(this.f18285m, f);
    }

    /* renamed from: E */
    public void mo18985E(float f, float f2) {
        float f3;
        float f4;
        if (f <= f2) {
            C2325h hVar = this.f18287o;
            if (hVar == null) {
                f3 = -3.4028235E38f;
            } else {
                f3 = hVar.mo7557p();
            }
            C2325h hVar2 = this.f18287o;
            if (hVar2 == null) {
                f4 = Float.MAX_VALUE;
            } else {
                f4 = hVar2.mo7547f();
            }
            float b = C5807i.m23363b(f, f3, f4);
            float b2 = C5807i.m23363b(f2, f3, f4);
            if (b != this.f18285m || b2 != this.f18286n) {
                this.f18285m = b;
                this.f18286n = b2;
                mo18983C((float) ((int) C5807i.m23363b(this.f18283k, b, b2)));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", new Object[]{Float.valueOf(f), Float.valueOf(f2)}));
    }

    /* renamed from: F */
    public void mo18986F(int i) {
        mo18985E((float) i, (float) ((int) this.f18286n));
    }

    /* renamed from: G */
    public void mo18987G(float f) {
        this.f18279g = f;
    }

    /* renamed from: H */
    public void mo18988H(boolean z) {
        this.f18289q = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo18961a() {
        super.mo18961a();
        mo18965b(m23338q());
    }

    public void cancel() {
        mo18961a();
        mo19006u();
    }

    public void doFrame(long j) {
        float f;
        float f2;
        mo19005t();
        if (this.f18287o != null && isRunning()) {
            C2311c.m8884a("LottieValueAnimator#doFrame");
            long j2 = this.f18281i;
            long j3 = 0;
            if (j2 != 0) {
                j3 = j - j2;
            }
            float m = ((float) j3) / m23337m();
            float f3 = this.f18282j;
            if (m23338q()) {
                m = -m;
            }
            float f4 = f3 + m;
            boolean z = !C5807i.m23365d(f4, mo19000o(), mo18999n());
            float f5 = this.f18282j;
            float b = C5807i.m23363b(f4, mo19000o(), mo18999n());
            this.f18282j = b;
            if (this.f18289q) {
                b = (float) Math.floor((double) b);
            }
            this.f18283k = b;
            this.f18281i = j;
            if (!this.f18289q || this.f18282j != f5) {
                mo18970g();
            }
            if (z) {
                if (getRepeatCount() == -1 || this.f18284l < getRepeatCount()) {
                    mo18967d();
                    this.f18284l++;
                    if (getRepeatMode() == 2) {
                        this.f18280h = !this.f18280h;
                        mo18981A();
                    } else {
                        if (m23338q()) {
                            f = mo18999n();
                        } else {
                            f = mo19000o();
                        }
                        this.f18282j = f;
                        this.f18283k = f;
                    }
                    this.f18281i = j;
                } else {
                    if (this.f18279g < Utils.FLOAT_EPSILON) {
                        f2 = mo19000o();
                    } else {
                        f2 = mo18999n();
                    }
                    this.f18282j = f2;
                    this.f18283k = f2;
                    mo19006u();
                    mo18965b(m23338q());
                }
            }
            m23336I();
            C2311c.m8885b("LottieValueAnimator#doFrame");
        }
    }

    public float getAnimatedFraction() {
        float o;
        float n;
        float o2;
        if (this.f18287o == null) {
            return Utils.FLOAT_EPSILON;
        }
        if (m23338q()) {
            o = mo18999n() - this.f18283k;
            n = mo18999n();
            o2 = mo19000o();
        } else {
            o = this.f18283k - mo19000o();
            n = mo18999n();
            o2 = mo19000o();
        }
        return o / (n - o2);
    }

    public Object getAnimatedValue() {
        return Float.valueOf(mo18997k());
    }

    public long getDuration() {
        C2325h hVar = this.f18287o;
        if (hVar == null) {
            return 0;
        }
        return (long) hVar.mo7545d();
    }

    /* renamed from: h */
    public void mo18994h() {
        this.f18287o = null;
        this.f18285m = -2.14748365E9f;
        this.f18286n = 2.14748365E9f;
    }

    public boolean isRunning() {
        return this.f18288p;
    }

    /* renamed from: j */
    public void mo18996j() {
        mo19006u();
        mo18965b(m23338q());
    }

    /* renamed from: k */
    public float mo18997k() {
        C2325h hVar = this.f18287o;
        if (hVar == null) {
            return Utils.FLOAT_EPSILON;
        }
        return (this.f18283k - hVar.mo7557p()) / (this.f18287o.mo7547f() - this.f18287o.mo7557p());
    }

    /* renamed from: l */
    public float mo18998l() {
        return this.f18283k;
    }

    /* renamed from: n */
    public float mo18999n() {
        C2325h hVar = this.f18287o;
        if (hVar == null) {
            return Utils.FLOAT_EPSILON;
        }
        float f = this.f18286n;
        if (f == 2.14748365E9f) {
            return hVar.mo7547f();
        }
        return f;
    }

    /* renamed from: o */
    public float mo19000o() {
        C2325h hVar = this.f18287o;
        if (hVar == null) {
            return Utils.FLOAT_EPSILON;
        }
        float f = this.f18285m;
        if (f == -2.14748365E9f) {
            return hVar.mo7557p();
        }
        return f;
    }

    /* renamed from: p */
    public float mo19001p() {
        return this.f18279g;
    }

    /* renamed from: r */
    public void mo19002r() {
        mo19006u();
        mo18966c();
    }

    /* renamed from: s */
    public void mo19003s() {
        float f;
        this.f18288p = true;
        mo18969f(m23338q());
        if (m23338q()) {
            f = mo18999n();
        } else {
            f = mo19000o();
        }
        mo18983C((float) ((int) f));
        this.f18281i = 0;
        this.f18284l = 0;
        mo19005t();
    }

    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.f18280h) {
            this.f18280h = false;
            mo18981A();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo19005t() {
        if (isRunning()) {
            mo19007y(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo19006u() {
        mo19007y(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo19007y(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f18288p = false;
        }
    }

    /* renamed from: z */
    public void mo19008z() {
        this.f18288p = true;
        mo19005t();
        this.f18281i = 0;
        if (m23338q() && mo18998l() == mo19000o()) {
            mo18983C(mo18999n());
        } else if (!m23338q() && mo18998l() == mo18999n()) {
            mo18983C(mo19000o());
        }
        mo18968e();
    }
}
