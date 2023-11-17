package p046d0;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import com.github.mikephil.charting.utils.Utils;
import p046d0.C5776b;

/* renamed from: d0.d */
public final class C5794d extends C5776b {

    /* renamed from: A */
    private C5795e f18259A = null;

    /* renamed from: B */
    private float f18260B = Float.MAX_VALUE;

    /* renamed from: C */
    private boolean f18261C = false;

    public C5794d(Object obj, C5793c cVar) {
        super(obj, cVar);
    }

    /* renamed from: o */
    private void m23291o() {
        C5795e eVar = this.f18259A;
        if (eVar != null) {
            double a = (double) eVar.mo18954a();
            if (a > ((double) this.f18250g)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
            } else if (a < ((double) this.f18251h)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
        } else {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
    }

    /* renamed from: i */
    public void mo18919i() {
        m23291o();
        this.f18259A.mo18959g((double) mo18915d());
        super.mo18919i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo18920k(long j) {
        if (this.f18261C) {
            float f = this.f18260B;
            if (f != Float.MAX_VALUE) {
                this.f18259A.mo18957e(f);
                this.f18260B = Float.MAX_VALUE;
            }
            this.f18245b = this.f18259A.mo18954a();
            this.f18244a = Utils.FLOAT_EPSILON;
            this.f18261C = false;
            return true;
        }
        if (this.f18260B != Float.MAX_VALUE) {
            this.f18259A.mo18954a();
            long j2 = j / 2;
            C5776b.C5791o h = this.f18259A.mo18960h((double) this.f18245b, (double) this.f18244a, j2);
            this.f18259A.mo18957e(this.f18260B);
            this.f18260B = Float.MAX_VALUE;
            C5776b.C5791o h2 = this.f18259A.mo18960h((double) h.f18256a, (double) h.f18257b, j2);
            this.f18245b = h2.f18256a;
            this.f18244a = h2.f18257b;
        } else {
            C5776b.C5791o h3 = this.f18259A.mo18960h((double) this.f18245b, (double) this.f18244a, j);
            this.f18245b = h3.f18256a;
            this.f18244a = h3.f18257b;
        }
        float max = Math.max(this.f18245b, this.f18251h);
        this.f18245b = max;
        float min = Math.min(max, this.f18250g);
        this.f18245b = min;
        if (!mo18951n(min, this.f18244a)) {
            return false;
        }
        this.f18245b = this.f18259A.mo18954a();
        this.f18244a = Utils.FLOAT_EPSILON;
        return true;
    }

    /* renamed from: l */
    public void mo18949l(float f) {
        if (mo18916e()) {
            this.f18260B = f;
            return;
        }
        if (this.f18259A == null) {
            this.f18259A = new C5795e(f);
        }
        this.f18259A.mo18957e(f);
        mo18919i();
    }

    /* renamed from: m */
    public boolean mo18950m() {
        return this.f18259A.f18263b > Utils.DOUBLE_EPSILON;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo18951n(float f, float f2) {
        return this.f18259A.mo18955c(f, f2);
    }

    /* renamed from: p */
    public C5794d mo18952p(C5795e eVar) {
        this.f18259A = eVar;
        return this;
    }

    /* renamed from: q */
    public void mo18953q() {
        if (!mo18950m()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        } else if (this.f18249f) {
            this.f18261C = true;
        }
    }
}
