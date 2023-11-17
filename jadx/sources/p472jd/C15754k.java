package p472jd;

/* renamed from: jd.k */
public enum C15754k implements C15746c {
    JPEG(0),
    DNG(1);
    

    /* renamed from: g */
    static final C15754k f44691g = null;

    /* renamed from: d */
    private int f44693d;

    static {
        C15754k kVar;
        f44691g = kVar;
    }

    private C15754k(int i) {
        this.f44693d = i;
    }

    /* renamed from: a */
    static C15754k m56755a(int i) {
        for (C15754k kVar : values()) {
            if (kVar.mo43153b() == i) {
                return kVar;
            }
        }
        return f44691g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo43153b() {
        return this.f44693d;
    }
}
