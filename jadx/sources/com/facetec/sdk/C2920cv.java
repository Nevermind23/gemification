package com.facetec.sdk;

import android.os.AsyncTask;

/* renamed from: com.facetec.sdk.cv */
final class C2920cv extends AsyncTask<Void, Void, Void> {

    /* renamed from: b */
    private final Runnable f9802b;

    /* renamed from: d */
    private Runnable f9803d = null;

    private C2920cv(Runnable runnable) {
        this.f9802b = runnable;
    }

    /* renamed from: c */
    static C2920cv m12195c(Runnable runnable) {
        C2920cv cvVar = new C2920cv(runnable);
        cvVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        return cvVar;
    }

    /* renamed from: e */
    static C2920cv m12196e(Runnable runnable) {
        C2920cv cvVar = new C2920cv(runnable);
        cvVar.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        return cvVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C2920cv mo9078d(Runnable runnable) {
        this.f9803d = runnable;
        return this;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        this.f9802b.run();
        return null;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        super.onPostExecute((Void) obj);
        Runnable runnable = this.f9803d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
