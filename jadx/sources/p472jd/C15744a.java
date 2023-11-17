package p472jd;

/* renamed from: jd.a */
public enum C15744a implements C15746c {
    OFF(0),
    ON(1),
    MONO(2),
    STEREO(3);
    

    /* renamed from: i */
    static final C15744a f44634i = null;

    /* renamed from: d */
    private int f44636d;

    static {
        C15744a aVar;
        f44634i = aVar;
    }

    private C15744a(int i) {
        this.f44636d = i;
    }

    /* renamed from: a */
    static C15744a m56726a(int i) {
        for (C15744a aVar : values()) {
            if (aVar.mo43133b() == i) {
                return aVar;
            }
        }
        return f44634i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo43133b() {
        return this.f44636d;
    }
}
