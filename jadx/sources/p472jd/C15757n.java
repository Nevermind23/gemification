package p472jd;

/* renamed from: jd.n */
public enum C15757n implements C15746c {
    AUTO(0),
    INCANDESCENT(1),
    FLUORESCENT(2),
    DAYLIGHT(3),
    CLOUDY(4);
    

    /* renamed from: j */
    static final C15757n f44711j = null;

    /* renamed from: d */
    private int f44713d;

    static {
        C15757n nVar;
        f44711j = nVar;
    }

    private C15757n(int i) {
        this.f44713d = i;
    }

    /* renamed from: a */
    static C15757n m56761a(int i) {
        for (C15757n nVar : values()) {
            if (nVar.mo43156b() == i) {
                return nVar;
            }
        }
        return f44711j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo43156b() {
        return this.f44713d;
    }
}
