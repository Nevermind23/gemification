package p472jd;

/* renamed from: jd.h */
public enum C15751h implements C15746c {
    OFF(0),
    DRAW_3X3(1),
    DRAW_4X4(2),
    DRAW_PHI(3);
    

    /* renamed from: i */
    static final C15751h f44676i = null;

    /* renamed from: d */
    private int f44678d;

    static {
        C15751h hVar;
        f44676i = hVar;
    }

    private C15751h(int i) {
        this.f44678d = i;
    }

    /* renamed from: a */
    static C15751h m56749a(int i) {
        for (C15751h hVar : values()) {
            if (hVar.mo43150b() == i) {
                return hVar;
            }
        }
        return f44676i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo43150b() {
        return this.f44678d;
    }
}
