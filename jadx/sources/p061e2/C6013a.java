package p061e2;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.C2325h;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: e2.a */
public class C6013a {

    /* renamed from: a */
    private final C2325h f18758a;

    /* renamed from: b */
    public final Object f18759b;

    /* renamed from: c */
    public Object f18760c;

    /* renamed from: d */
    public final Interpolator f18761d;

    /* renamed from: e */
    public final Interpolator f18762e;

    /* renamed from: f */
    public final Interpolator f18763f;

    /* renamed from: g */
    public final float f18764g;

    /* renamed from: h */
    public Float f18765h;

    /* renamed from: i */
    private float f18766i;

    /* renamed from: j */
    private float f18767j;

    /* renamed from: k */
    private int f18768k;

    /* renamed from: l */
    private int f18769l;

    /* renamed from: m */
    private float f18770m;

    /* renamed from: n */
    private float f18771n;

    /* renamed from: o */
    public PointF f18772o;

    /* renamed from: p */
    public PointF f18773p;

    public C6013a(C2325h hVar, Object obj, Object obj2, Interpolator interpolator, float f, Float f2) {
        this.f18766i = -3987645.8f;
        this.f18767j = -3987645.8f;
        this.f18768k = 784923401;
        this.f18769l = 784923401;
        this.f18770m = Float.MIN_VALUE;
        this.f18771n = Float.MIN_VALUE;
        this.f18772o = null;
        this.f18773p = null;
        this.f18758a = hVar;
        this.f18759b = obj;
        this.f18760c = obj2;
        this.f18761d = interpolator;
        this.f18762e = null;
        this.f18763f = null;
        this.f18764g = f;
        this.f18765h = f2;
    }

    /* renamed from: a */
    public boolean mo19485a(float f) {
        return f >= mo19490f() && f < mo19487c();
    }

    /* renamed from: b */
    public C6013a mo19486b(Object obj, Object obj2) {
        return new C6013a(obj, obj2);
    }

    /* renamed from: c */
    public float mo19487c() {
        if (this.f18758a == null) {
            return 1.0f;
        }
        if (this.f18771n == Float.MIN_VALUE) {
            if (this.f18765h == null) {
                this.f18771n = 1.0f;
            } else {
                this.f18771n = mo19490f() + ((this.f18765h.floatValue() - this.f18764g) / this.f18758a.mo7546e());
            }
        }
        return this.f18771n;
    }

    /* renamed from: d */
    public float mo19488d() {
        if (this.f18767j == -3987645.8f) {
            this.f18767j = ((Float) this.f18760c).floatValue();
        }
        return this.f18767j;
    }

    /* renamed from: e */
    public int mo19489e() {
        if (this.f18769l == 784923401) {
            this.f18769l = ((Integer) this.f18760c).intValue();
        }
        return this.f18769l;
    }

    /* renamed from: f */
    public float mo19490f() {
        C2325h hVar = this.f18758a;
        if (hVar == null) {
            return Utils.FLOAT_EPSILON;
        }
        if (this.f18770m == Float.MIN_VALUE) {
            this.f18770m = (this.f18764g - hVar.mo7557p()) / this.f18758a.mo7546e();
        }
        return this.f18770m;
    }

    /* renamed from: g */
    public float mo19491g() {
        if (this.f18766i == -3987645.8f) {
            this.f18766i = ((Float) this.f18759b).floatValue();
        }
        return this.f18766i;
    }

    /* renamed from: h */
    public int mo19492h() {
        if (this.f18768k == 784923401) {
            this.f18768k = ((Integer) this.f18759b).intValue();
        }
        return this.f18768k;
    }

    /* renamed from: i */
    public boolean mo19493i() {
        return this.f18761d == null && this.f18762e == null && this.f18763f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f18759b + ", endValue=" + this.f18760c + ", startFrame=" + this.f18764g + ", endFrame=" + this.f18765h + ", interpolator=" + this.f18761d + '}';
    }

    public C6013a(C2325h hVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f, Float f2) {
        this.f18766i = -3987645.8f;
        this.f18767j = -3987645.8f;
        this.f18768k = 784923401;
        this.f18769l = 784923401;
        this.f18770m = Float.MIN_VALUE;
        this.f18771n = Float.MIN_VALUE;
        this.f18772o = null;
        this.f18773p = null;
        this.f18758a = hVar;
        this.f18759b = obj;
        this.f18760c = obj2;
        this.f18761d = null;
        this.f18762e = interpolator;
        this.f18763f = interpolator2;
        this.f18764g = f;
        this.f18765h = f2;
    }

    protected C6013a(C2325h hVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.f18766i = -3987645.8f;
        this.f18767j = -3987645.8f;
        this.f18768k = 784923401;
        this.f18769l = 784923401;
        this.f18770m = Float.MIN_VALUE;
        this.f18771n = Float.MIN_VALUE;
        this.f18772o = null;
        this.f18773p = null;
        this.f18758a = hVar;
        this.f18759b = obj;
        this.f18760c = obj2;
        this.f18761d = interpolator;
        this.f18762e = interpolator2;
        this.f18763f = interpolator3;
        this.f18764g = f;
        this.f18765h = f2;
    }

    public C6013a(Object obj) {
        this.f18766i = -3987645.8f;
        this.f18767j = -3987645.8f;
        this.f18768k = 784923401;
        this.f18769l = 784923401;
        this.f18770m = Float.MIN_VALUE;
        this.f18771n = Float.MIN_VALUE;
        this.f18772o = null;
        this.f18773p = null;
        this.f18758a = null;
        this.f18759b = obj;
        this.f18760c = obj;
        this.f18761d = null;
        this.f18762e = null;
        this.f18763f = null;
        this.f18764g = Float.MIN_VALUE;
        this.f18765h = Float.valueOf(Float.MAX_VALUE);
    }

    private C6013a(Object obj, Object obj2) {
        this.f18766i = -3987645.8f;
        this.f18767j = -3987645.8f;
        this.f18768k = 784923401;
        this.f18769l = 784923401;
        this.f18770m = Float.MIN_VALUE;
        this.f18771n = Float.MIN_VALUE;
        this.f18772o = null;
        this.f18773p = null;
        this.f18758a = null;
        this.f18759b = obj;
        this.f18760c = obj2;
        this.f18761d = null;
        this.f18762e = null;
        this.f18763f = null;
        this.f18764g = Float.MIN_VALUE;
        this.f18765h = Float.valueOf(Float.MAX_VALUE);
    }
}
