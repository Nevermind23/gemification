package p337z7;

/* renamed from: z7.u */
final class C9244u implements Runnable {

    /* renamed from: d */
    final /* synthetic */ Task f25687d;

    /* renamed from: e */
    final /* synthetic */ C9245v f25688e;

    C9244u(C9245v vVar, Task task) {
        this.f25688e = vVar;
        this.f25687d = task;
    }

    public final void run() {
        synchronized (this.f25688e.f25690b) {
            C9245v vVar = this.f25688e;
            if (vVar.f25691c != null) {
                vVar.f25691c.onComplete(this.f25687d);
            }
        }
    }
}
