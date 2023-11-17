package p472jd;

/* renamed from: jd.j */
public enum C15753j implements C15746c {
    PICTURE(0),
    VIDEO(1);
    

    /* renamed from: g */
    static final C15753j f44686g = null;

    /* renamed from: d */
    private int f44688d;

    static {
        C15753j jVar;
        f44686g = jVar;
    }

    private C15753j(int i) {
        this.f44688d = i;
    }

    /* renamed from: a */
    static C15753j m56753a(int i) {
        for (C15753j jVar : values()) {
            if (jVar.mo43152b() == i) {
                return jVar;
            }
        }
        return f44686g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo43152b() {
        return this.f44688d;
    }
}
