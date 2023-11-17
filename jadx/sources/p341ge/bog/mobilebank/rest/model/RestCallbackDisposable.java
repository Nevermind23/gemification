package p341ge.bog.mobilebank.rest.model;

import hd1.C41205b;
import zh1.C43443b;

/* renamed from: ge.bog.mobilebank.rest.model.RestCallbackDisposable */
public final class RestCallbackDisposable implements C41205b {
    private final C43443b<?> call;

    public RestCallbackDisposable(C43443b<?> bVar) {
        this.call = bVar;
    }

    public void dispose() {
        this.call.cancel();
    }

    public boolean isDisposed() {
        return this.call.mo102161x();
    }
}
