package p341ge.bog.mobilebank.rest.model;

import retrofit2.HttpException;
import zh1.C43443b;
import zh1.C43446d;
import zh1.C43510v;

/* renamed from: ge.bog.mobilebank.rest.model.RetrofitCallback */
public class RetrofitCallback<ContentType> implements C43446d {
    private final RestCallback<ContentType> mCallback;

    public RetrofitCallback(RestCallback<ContentType> restCallback) {
        this.mCallback = restCallback;
    }

    public void onFailure(C43443b<ContentType> bVar, Throwable th) {
        RestCallback<ContentType> restCallback = this.mCallback;
        if (restCallback != null) {
            restCallback.onFailure(th);
        }
    }

    public void onResponse(C43443b<ContentType> bVar, C43510v vVar) {
        if (vVar.mo102216d()) {
            this.mCallback.onResponse(vVar.mo102214a());
        } else {
            this.mCallback.onFailure(new HttpException(vVar));
        }
    }
}
