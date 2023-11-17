package p337z7;

/* renamed from: z7.s */
final class C9242s implements Runnable {

    /* renamed from: d */
    final /* synthetic */ C9243t f25683d;

    C9242s(C9243t tVar) {
        this.f25683d = tVar;
    }

    public final void run() {
        synchronized (this.f25683d.f25685b) {
            C9243t tVar = this.f25683d;
            if (tVar.f25686c != null) {
                tVar.f25686c.mo18086b();
            }
        }
    }
}
