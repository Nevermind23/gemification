package p472jd;

/* renamed from: jd.i */
public enum C15752i implements C15746c {
    OFF(0),
    ON(1);
    

    /* renamed from: g */
    static final C15752i f44681g = null;

    /* renamed from: d */
    private int f44683d;

    static {
        C15752i iVar;
        f44681g = iVar;
    }

    private C15752i(int i) {
        this.f44683d = i;
    }

    /* renamed from: a */
    static C15752i m56751a(int i) {
        for (C15752i iVar : values()) {
            if (iVar.mo43151b() == i) {
                return iVar;
            }
        }
        return f44681g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo43151b() {
        return this.f44683d;
    }
}
