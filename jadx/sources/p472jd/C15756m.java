package p472jd;

/* renamed from: jd.m */
public enum C15756m implements C15746c {
    DEVICE_DEFAULT(0),
    H_263(1),
    H_264(2);
    

    /* renamed from: h */
    static final C15756m f44703h = null;

    /* renamed from: d */
    private int f44705d;

    static {
        C15756m mVar;
        f44703h = mVar;
    }

    private C15756m(int i) {
        this.f44705d = i;
    }

    /* renamed from: a */
    static C15756m m56759a(int i) {
        for (C15756m mVar : values()) {
            if (mVar.mo43155b() == i) {
                return mVar;
            }
        }
        return f44703h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo43155b() {
        return this.f44705d;
    }
}
