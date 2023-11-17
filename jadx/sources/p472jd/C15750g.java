package p472jd;

/* renamed from: jd.g */
public enum C15750g implements C15746c {
    OFF(0),
    ON(1),
    AUTO(2),
    TORCH(3);
    

    /* renamed from: i */
    static final C15750g f44669i = null;

    /* renamed from: d */
    private int f44671d;

    static {
        C15750g gVar;
        f44669i = gVar;
    }

    private C15750g(int i) {
        this.f44671d = i;
    }

    /* renamed from: a */
    static C15750g m56747a(int i) {
        for (C15750g gVar : values()) {
            if (gVar.mo43149b() == i) {
                return gVar;
            }
        }
        return f44669i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo43149b() {
        return this.f44671d;
    }
}
