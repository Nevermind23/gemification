package p342j$.util.stream;

/* renamed from: j$.util.stream.D3 */
final class C9532D3 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Runnable f26185a;

    /* renamed from: b */
    final /* synthetic */ Runnable f26186b;

    C9532D3(Runnable runnable, Runnable runnable2) {
        this.f26185a = runnable;
        this.f26186b = runnable2;
    }

    public final void run() {
        try {
            this.f26185a.run();
            this.f26186b.run();
            return;
        } catch (Throwable th) {
            try {
                th.addSuppressed(th);
            } catch (Throwable unused) {
            }
        }
        throw th;
    }
}
