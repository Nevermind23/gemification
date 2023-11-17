package p294w1;

import android.graphics.PointF;

/* renamed from: w1.a */
public class C8733a {

    /* renamed from: a */
    private final PointF f24562a;

    /* renamed from: b */
    private final PointF f24563b;

    /* renamed from: c */
    private final PointF f24564c;

    public C8733a() {
        this.f24562a = new PointF();
        this.f24563b = new PointF();
        this.f24564c = new PointF();
    }

    /* renamed from: a */
    public PointF mo24118a() {
        return this.f24562a;
    }

    /* renamed from: b */
    public PointF mo24119b() {
        return this.f24563b;
    }

    /* renamed from: c */
    public PointF mo24120c() {
        return this.f24564c;
    }

    /* renamed from: d */
    public void mo24121d(float f, float f2) {
        this.f24562a.set(f, f2);
    }

    /* renamed from: e */
    public void mo24122e(float f, float f2) {
        this.f24563b.set(f, f2);
    }

    /* renamed from: f */
    public void mo24123f(float f, float f2) {
        this.f24564c.set(f, f2);
    }

    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", new Object[]{Float.valueOf(this.f24564c.x), Float.valueOf(this.f24564c.y), Float.valueOf(this.f24562a.x), Float.valueOf(this.f24562a.y), Float.valueOf(this.f24563b.x), Float.valueOf(this.f24563b.y)});
    }

    public C8733a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f24562a = pointF;
        this.f24563b = pointF2;
        this.f24564c = pointF3;
    }
}
