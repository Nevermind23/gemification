package p046d0;

import com.github.mikephil.charting.utils.Utils;
import p046d0.C5776b;

/* renamed from: d0.e */
public final class C5795e {

    /* renamed from: a */
    double f18262a = Math.sqrt(1500.0d);

    /* renamed from: b */
    double f18263b = 0.5d;

    /* renamed from: c */
    private boolean f18264c = false;

    /* renamed from: d */
    private double f18265d;

    /* renamed from: e */
    private double f18266e;

    /* renamed from: f */
    private double f18267f;

    /* renamed from: g */
    private double f18268g;

    /* renamed from: h */
    private double f18269h;

    /* renamed from: i */
    private double f18270i = Double.MAX_VALUE;

    /* renamed from: j */
    private final C5776b.C5791o f18271j = new C5776b.C5791o();

    public C5795e() {
    }

    /* renamed from: b */
    private void m23299b() {
        if (!this.f18264c) {
            if (this.f18270i != Double.MAX_VALUE) {
                double d = this.f18263b;
                if (d > 1.0d) {
                    double d2 = this.f18262a;
                    this.f18267f = ((-d) * d2) + (d2 * Math.sqrt((d * d) - 1.0d));
                    double d3 = this.f18263b;
                    double d4 = this.f18262a;
                    this.f18268g = ((-d3) * d4) - (d4 * Math.sqrt((d3 * d3) - 1.0d));
                } else if (d >= Utils.DOUBLE_EPSILON && d < 1.0d) {
                    this.f18269h = this.f18262a * Math.sqrt(1.0d - (d * d));
                }
                this.f18264c = true;
                return;
            }
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
    }

    /* renamed from: a */
    public float mo18954a() {
        return (float) this.f18270i;
    }

    /* renamed from: c */
    public boolean mo18955c(float f, float f2) {
        if (((double) Math.abs(f2)) >= this.f18266e || ((double) Math.abs(f - mo18954a())) >= this.f18265d) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public C5795e mo18956d(float f) {
        if (f >= Utils.FLOAT_EPSILON) {
            this.f18263b = (double) f;
            this.f18264c = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    /* renamed from: e */
    public C5795e mo18957e(float f) {
        this.f18270i = (double) f;
        return this;
    }

    /* renamed from: f */
    public C5795e mo18958f(float f) {
        if (f > Utils.FLOAT_EPSILON) {
            this.f18262a = Math.sqrt((double) f);
            this.f18264c = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo18959g(double d) {
        double abs = Math.abs(d);
        this.f18265d = abs;
        this.f18266e = abs * 62.5d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C5776b.C5791o mo18960h(double d, double d2, long j) {
        double d3;
        double d4;
        m23299b();
        double d5 = ((double) j) / 1000.0d;
        double d6 = d - this.f18270i;
        double d7 = this.f18263b;
        if (d7 > 1.0d) {
            double d8 = this.f18268g;
            double d9 = this.f18267f;
            double d12 = d6 - (((d8 * d6) - d2) / (d8 - d9));
            double d13 = ((d6 * d8) - d2) / (d8 - d9);
            d4 = (Math.pow(2.718281828459045d, d8 * d5) * d12) + (Math.pow(2.718281828459045d, this.f18267f * d5) * d13);
            double d14 = this.f18268g;
            double pow = d12 * d14 * Math.pow(2.718281828459045d, d14 * d5);
            double d15 = this.f18267f;
            d3 = pow + (d13 * d15 * Math.pow(2.718281828459045d, d15 * d5));
        } else if (d7 == 1.0d) {
            double d16 = this.f18262a;
            double d17 = d2 + (d16 * d6);
            double d18 = d6 + (d17 * d5);
            d4 = Math.pow(2.718281828459045d, (-d16) * d5) * d18;
            double pow2 = d18 * Math.pow(2.718281828459045d, (-this.f18262a) * d5);
            double d19 = this.f18262a;
            d3 = (d17 * Math.pow(2.718281828459045d, (-d19) * d5)) + (pow2 * (-d19));
        } else {
            double d22 = 1.0d / this.f18269h;
            double d23 = this.f18262a;
            double d24 = d22 * ((d7 * d23 * d6) + d2);
            double pow3 = Math.pow(2.718281828459045d, (-d7) * d23 * d5) * ((Math.cos(this.f18269h * d5) * d6) + (Math.sin(this.f18269h * d5) * d24));
            double d25 = this.f18262a;
            double d26 = this.f18263b;
            double pow4 = Math.pow(2.718281828459045d, (-d26) * d25 * d5);
            double d27 = this.f18269h;
            double d28 = pow3;
            double sin = (-d27) * d6 * Math.sin(d27 * d5);
            double d29 = this.f18269h;
            d3 = ((-d25) * pow3 * d26) + (pow4 * (sin + (d24 * d29 * Math.cos(d29 * d5))));
            d4 = d28;
        }
        C5776b.C5791o oVar = this.f18271j;
        oVar.f18256a = (float) (d4 + this.f18270i);
        oVar.f18257b = (float) d3;
        return oVar;
    }

    public C5795e(float f) {
        this.f18270i = (double) f;
    }
}
