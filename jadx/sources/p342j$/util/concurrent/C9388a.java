package p342j$.util.concurrent;

/* renamed from: j$.util.concurrent.a */
abstract class C9388a extends C9403p {

    /* renamed from: i */
    final ConcurrentHashMap f25999i;

    /* renamed from: j */
    C9399l f26000j;

    C9388a(C9399l[] lVarArr, int i, int i2, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i, 0, i2);
        this.f25999i = concurrentHashMap;
        mo25406b();
    }

    public final boolean hasMoreElements() {
        return this.f26020b != null;
    }

    public final boolean hasNext() {
        return this.f26020b != null;
    }

    public final void remove() {
        C9399l lVar = this.f26000j;
        if (lVar != null) {
            this.f26000j = null;
            this.f25999i.mo25321i(lVar.f26012b, (Object) null, (Object) null);
            return;
        }
        throw new IllegalStateException();
    }
}
