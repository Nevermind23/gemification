package p337z7;

import java.util.concurrent.Callable;

/* renamed from: z7.i0 */
final class C9232i0 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ C9230h0 f25661d;

    /* renamed from: e */
    final /* synthetic */ Callable f25662e;

    C9232i0(C9230h0 h0Var, Callable callable) {
        this.f25661d = h0Var;
        this.f25662e = callable;
    }

    public final void run() {
        try {
            this.f25661d.mo24890v(this.f25662e.call());
        } catch (Exception e) {
            this.f25661d.mo24889u(e);
        } catch (Throwable th) {
            this.f25661d.mo24889u(new RuntimeException(th));
        }
    }
}
