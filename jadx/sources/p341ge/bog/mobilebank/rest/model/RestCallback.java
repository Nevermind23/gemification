package p341ge.bog.mobilebank.rest.model;

import hd1.C41205b;
import zh1.C43443b;

/* renamed from: ge.bog.mobilebank.rest.model.RestCallback */
public abstract class RestCallback<ContentType> {
    private C43443b mCall;

    public void cancel() {
        this.mCall.cancel();
    }

    public void onEnqueue(C41205b bVar) {
    }

    public void onFailure(Throwable th) {
    }

    public void onResponse(ContentType contenttype) {
    }

    public void setCall(C43443b bVar) {
        this.mCall = bVar;
        onEnqueue(new RestCallbackDisposable(bVar));
    }
}
