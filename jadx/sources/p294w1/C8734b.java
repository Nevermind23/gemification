package p294w1;

import android.graphics.PointF;

/* renamed from: w1.b */
public class C8734b {

    /* renamed from: a */
    public String f24565a;

    /* renamed from: b */
    public String f24566b;

    /* renamed from: c */
    public float f24567c;

    /* renamed from: d */
    public C8735a f24568d;

    /* renamed from: e */
    public int f24569e;

    /* renamed from: f */
    public float f24570f;

    /* renamed from: g */
    public float f24571g;

    /* renamed from: h */
    public int f24572h;

    /* renamed from: i */
    public int f24573i;

    /* renamed from: j */
    public float f24574j;

    /* renamed from: k */
    public boolean f24575k;

    /* renamed from: l */
    public PointF f24576l;

    /* renamed from: m */
    public PointF f24577m;

    /* renamed from: w1.b$a */
    public enum C8735a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public C8734b(String str, String str2, float f, C8735a aVar, int i, float f2, float f3, int i2, int i3, float f4, boolean z, PointF pointF, PointF pointF2) {
        mo24125a(str, str2, f, aVar, i, f2, f3, i2, i3, f4, z, pointF, pointF2);
    }

    /* renamed from: a */
    public void mo24125a(String str, String str2, float f, C8735a aVar, int i, float f2, float f3, int i2, int i3, float f4, boolean z, PointF pointF, PointF pointF2) {
        this.f24565a = str;
        this.f24566b = str2;
        this.f24567c = f;
        this.f24568d = aVar;
        this.f24569e = i;
        this.f24570f = f2;
        this.f24571g = f3;
        this.f24572h = i2;
        this.f24573i = i3;
        this.f24574j = f4;
        this.f24575k = z;
        this.f24576l = pointF;
        this.f24577m = pointF2;
    }

    public int hashCode() {
        int hashCode = (((((int) (((float) (((this.f24565a.hashCode() * 31) + this.f24566b.hashCode()) * 31)) + this.f24567c)) * 31) + this.f24568d.ordinal()) * 31) + this.f24569e;
        long floatToRawIntBits = (long) Float.floatToRawIntBits(this.f24570f);
        return (((hashCode * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f24572h;
    }

    public C8734b() {
    }
}
