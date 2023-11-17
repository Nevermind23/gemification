package p070eb;

/* renamed from: eb.a */
public class C6125a {

    /* renamed from: a */
    public final double f19059a;

    /* renamed from: b */
    public final double f19060b;

    /* renamed from: c */
    public final double f19061c;

    /* renamed from: d */
    public final double f19062d;

    /* renamed from: e */
    public final double f19063e;

    /* renamed from: f */
    public final double f19064f;

    public C6125a(double d, double d2, double d3, double d4) {
        this.f19059a = d;
        this.f19060b = d3;
        this.f19061c = d2;
        this.f19062d = d4;
        this.f19063e = (d + d2) / 2.0d;
        this.f19064f = (d3 + d4) / 2.0d;
    }

    /* renamed from: a */
    public boolean mo19683a(double d, double d2) {
        return this.f19059a <= d && d <= this.f19061c && this.f19060b <= d2 && d2 <= this.f19062d;
    }

    /* renamed from: b */
    public boolean mo19684b(C6125a aVar) {
        return aVar.f19059a >= this.f19059a && aVar.f19061c <= this.f19061c && aVar.f19060b >= this.f19060b && aVar.f19062d <= this.f19062d;
    }

    /* renamed from: c */
    public boolean mo19685c(C6126b bVar) {
        return mo19683a(bVar.f19065a, bVar.f19066b);
    }

    /* renamed from: d */
    public boolean mo19686d(double d, double d2, double d3, double d4) {
        return d < this.f19061c && this.f19059a < d2 && d3 < this.f19062d && this.f19060b < d4;
    }

    /* renamed from: e */
    public boolean mo19687e(C6125a aVar) {
        return mo19686d(aVar.f19059a, aVar.f19061c, aVar.f19060b, aVar.f19062d);
    }
}
