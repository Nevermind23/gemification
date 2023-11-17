package p337z7;

/* renamed from: z7.y */
final class C9248y implements Runnable {

    /* renamed from: d */
    final /* synthetic */ Task f25697d;

    /* renamed from: e */
    final /* synthetic */ C9249z f25698e;

    C9248y(C9249z zVar, Task task) {
        this.f25698e = zVar;
        this.f25697d = task;
    }

    public final void run() {
        synchronized (this.f25698e.f25700b) {
            C9249z zVar = this.f25698e;
            if (zVar.f25701c != null) {
                zVar.f25701c.mo17635a(this.f25697d.mo24869n());
            }
        }
    }
}
