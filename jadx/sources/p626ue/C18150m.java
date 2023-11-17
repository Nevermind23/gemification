package p626ue;

/* renamed from: ue.m */
public final class C18150m {

    /* renamed from: a */
    private final String f51463a;

    /* renamed from: b */
    private final int f51464b;

    /* renamed from: c */
    private int f51465c;

    public C18150m(String str) {
        this.f51463a = str;
        this.f51464b = str.length();
    }

    /* renamed from: a */
    public boolean mo45818a() {
        return this.f51465c < this.f51464b;
    }

    /* renamed from: b */
    public int mo45819b() {
        char charAt = this.f51463a.charAt(this.f51465c);
        this.f51465c++;
        return charAt & 65535;
    }
}
