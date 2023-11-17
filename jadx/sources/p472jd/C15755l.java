package p472jd;

/* renamed from: jd.l */
public enum C15755l implements C15746c {
    SURFACE(0),
    TEXTURE(1),
    GL_SURFACE(2);
    

    /* renamed from: h */
    static final C15755l f44697h = null;

    /* renamed from: d */
    private int f44699d;

    static {
        C15755l lVar;
        f44697h = lVar;
    }

    private C15755l(int i) {
        this.f44699d = i;
    }

    /* renamed from: a */
    static C15755l m56757a(int i) {
        for (C15755l lVar : values()) {
            if (lVar.mo43154b() == i) {
                return lVar;
            }
        }
        return f44697h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo43154b() {
        return this.f44699d;
    }
}
