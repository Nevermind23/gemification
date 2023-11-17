package hd1;

/* renamed from: hd1.e */
final class C41208e extends C41207d {
    private static final long serialVersionUID = -8219729196779211169L;

    C41208e(Runnable runnable) {
        super(runnable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo95665a(Runnable runnable) {
        runnable.run();
    }

    public String toString() {
        return "RunnableDisposable(disposed=" + isDisposed() + ", " + get() + ")";
    }
}
