package jg1;

/* renamed from: jg1.j */
final class C41450j {

    /* renamed from: a */
    private C41449i f97563a;

    /* renamed from: b */
    private C41449i f97564b;

    C41450j() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo96197a(C41449i iVar) {
        if (iVar != null) {
            try {
                C41449i iVar2 = this.f97564b;
                if (iVar2 != null) {
                    iVar2.f97562c = iVar;
                    this.f97564b = iVar;
                } else if (this.f97563a == null) {
                    this.f97564b = iVar;
                    this.f97563a = iVar;
                } else {
                    throw new IllegalStateException("Head present, but no tail");
                }
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new NullPointerException("null cannot be enqueued");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized C41449i mo96198b() {
        C41449i iVar;
        iVar = this.f97563a;
        if (iVar != null) {
            C41449i iVar2 = iVar.f97562c;
            this.f97563a = iVar2;
            if (iVar2 == null) {
                this.f97564b = null;
            }
        }
        return iVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized C41449i mo96199c(int i) {
        if (this.f97563a == null) {
            wait((long) i);
        }
        return mo96198b();
    }
}
