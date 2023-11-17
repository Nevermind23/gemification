package p638vd;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: vd.c */
public abstract class C18300c {

    /* renamed from: a */
    private boolean f51721a;

    /* renamed from: b */
    C18298a f51722b;

    /* renamed from: c */
    private PointF[] f51723c;

    /* renamed from: d */
    private C18301a f51724d;

    /* renamed from: vd.c$a */
    public interface C18301a {
        /* renamed from: b */
        Context mo29435b();

        int getHeight();

        int getWidth();
    }

    C18300c(C18301a aVar, int i) {
        this.f51724d = aVar;
        this.f51723c = new PointF[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f51723c[i2] = new PointF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
        }
    }

    /* renamed from: a */
    private static float m62593a(float f, float f2, float f3, float f4) {
        if (f2 < f3) {
            f2 = f3;
        }
        if (f2 > f4) {
            f2 = f4;
        }
        float f5 = ((f4 - f3) / 50.0f) / 2.0f;
        return (f2 < f - f5 || f2 > f5 + f) ? f2 : f;
    }

    /* renamed from: b */
    public final float mo46037b(float f, float f2, float f3) {
        return m62593a(f, mo46041f(f, f2, f3), f2, f3);
    }

    /* renamed from: c */
    public final C18298a mo46038c() {
        return this.f51722b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final PointF mo46039d(int i) {
        return this.f51723c[i];
    }

    /* renamed from: e */
    public final PointF[] mo46040e() {
        return this.f51723c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract float mo46041f(float f, float f2, float f3);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract boolean mo46042g(MotionEvent motionEvent);

    /* renamed from: h */
    public final boolean mo46043h(MotionEvent motionEvent) {
        if (!this.f51721a) {
            return false;
        }
        return mo46042g(motionEvent);
    }

    /* renamed from: i */
    public void mo46044i(boolean z) {
        this.f51721a = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo46045j(C18298a aVar) {
        this.f51722b = aVar;
    }
}
