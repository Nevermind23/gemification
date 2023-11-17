package nd1;

/* renamed from: nd1.f */
public final class C41779f extends C41778e {
    public void onError(Throwable th) {
        if (this.f98085d == null) {
            this.f98086e = th;
        }
        countDown();
    }

    public void onNext(Object obj) {
        if (this.f98085d == null) {
            this.f98085d = obj;
            this.f98087f.dispose();
            countDown();
        }
    }
}
