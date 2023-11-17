package p472jd;

/* renamed from: jd.b */
public enum C15745b implements C15746c {
    DEVICE_DEFAULT(0),
    AAC(1),
    HE_AAC(2),
    AAC_ELD(3);
    

    /* renamed from: i */
    static final C15745b f44641i = null;

    /* renamed from: d */
    private int f44643d;

    static {
        C15745b bVar;
        f44641i = bVar;
    }

    private C15745b(int i) {
        this.f44643d = i;
    }

    /* renamed from: a */
    static C15745b m56728a(int i) {
        for (C15745b bVar : values()) {
            if (bVar.mo43134b() == i) {
                return bVar;
            }
        }
        return f44641i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo43134b() {
        return this.f44643d;
    }
}
