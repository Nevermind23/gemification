package p091g6;

/* renamed from: g6.a */
public class C6228a {

    /* renamed from: b */
    static int f19252b = 31;

    /* renamed from: a */
    private int f19253a = 1;

    /* renamed from: a */
    public C6228a mo19835a(Object obj) {
        this.f19253a = (f19252b * this.f19253a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    /* renamed from: b */
    public int mo19836b() {
        return this.f19253a;
    }

    /* renamed from: c */
    public final C6228a mo19837c(boolean z) {
        this.f19253a = (f19252b * this.f19253a) + (z ? 1 : 0);
        return this;
    }
}
