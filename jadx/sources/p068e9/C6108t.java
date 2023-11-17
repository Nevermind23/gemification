package p068e9;

/* renamed from: e9.t */
public enum C6108t {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    

    /* renamed from: d */
    private final int f18987d;

    private C6108t(int i) {
        this.f18987d = i;
    }

    /* renamed from: a */
    public static C6108t m24429a(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    /* renamed from: b */
    public int mo19640b() {
        return this.f18987d;
    }

    public String toString() {
        return Integer.toString(this.f18987d);
    }
}
