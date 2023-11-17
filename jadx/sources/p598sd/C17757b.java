package p598sd;

/* renamed from: sd.b */
public enum C17757b {
    OFF(0),
    ENGINE(1),
    BIND(2),
    PREVIEW(3);
    

    /* renamed from: d */
    private int f49549d;

    private C17757b(int i) {
        this.f49549d = i;
    }

    /* renamed from: a */
    public boolean mo45341a(C17757b bVar) {
        return this.f49549d >= bVar.f49549d;
    }
}
