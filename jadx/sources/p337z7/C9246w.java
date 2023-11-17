package p337z7;

import p182n6.C7264i;

/* renamed from: z7.w */
final class C9246w implements Runnable {

    /* renamed from: d */
    final /* synthetic */ Task f25692d;

    /* renamed from: e */
    final /* synthetic */ C9247x f25693e;

    C9246w(C9247x xVar, Task task) {
        this.f25693e = xVar;
        this.f25692d = task;
    }

    public final void run() {
        synchronized (this.f25693e.f25695b) {
            C9247x xVar = this.f25693e;
            if (xVar.f25696c != null) {
                xVar.f25696c.onFailure((Exception) C7264i.m27902k(this.f25692d.mo24868m()));
            }
        }
    }
}
