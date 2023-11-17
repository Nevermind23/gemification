package p472jd;

/* renamed from: jd.e */
public enum C15748e implements C15746c {
    CAMERA1(0),
    CAMERA2(1);
    

    /* renamed from: g */
    static final C15748e f44658g = null;

    /* renamed from: d */
    private int f44660d;

    static {
        C15748e eVar;
        f44658g = eVar;
    }

    private C15748e(int i) {
        this.f44660d = i;
    }

    /* renamed from: a */
    static C15748e m56742a(int i) {
        for (C15748e eVar : values()) {
            if (eVar.mo43147b() == i) {
                return eVar;
            }
        }
        return f44658g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo43147b() {
        return this.f44660d;
    }
}
