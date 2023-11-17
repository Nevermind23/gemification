package p638vd;

/* renamed from: vd.b */
public enum C18299b {
    NONE(0, r1),
    AUTO_FOCUS(1, r1),
    TAKE_PICTURE(2, r1),
    TAKE_PICTURE_SNAPSHOT(3, r1),
    ZOOM(4, r8),
    EXPOSURE_CORRECTION(5, r8),
    FILTER_CONTROL_1(6, r8),
    FILTER_CONTROL_2(7, r8);
    

    /* renamed from: n */
    static final C18299b f51713n = null;

    /* renamed from: o */
    static final C18299b f51714o = null;

    /* renamed from: p */
    static final C18299b f51715p = null;

    /* renamed from: q */
    static final C18299b f51716q = null;

    /* renamed from: r */
    static final C18299b f51717r = null;

    /* renamed from: d */
    private int f51719d;

    /* renamed from: e */
    private C18303e f51720e;

    static {
        C18299b bVar;
        f51713n = bVar;
        f51714o = bVar;
        f51715p = bVar;
        f51716q = bVar;
        f51717r = bVar;
    }

    private C18299b(int i, C18303e eVar) {
        this.f51719d = i;
        this.f51720e = eVar;
    }

    /* renamed from: a */
    static C18299b m62590a(int i) {
        for (C18299b bVar : values()) {
            if (bVar.mo46036c() == i) {
                return bVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C18303e mo46035b() {
        return this.f51720e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo46036c() {
        return this.f51719d;
    }
}
