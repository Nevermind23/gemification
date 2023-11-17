package com.facetec.sdk;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facetec.sdk.ao */
abstract class C2792ao extends Fragment {

    /* renamed from: com.facetec.sdk.ao$e */
    class C2793e implements Runnable {

        /* renamed from: a */
        private final Runnable f8933a;

        C2793e(Runnable runnable) {
            this.f8933a = runnable;
        }

        public final void run() {
            Activity activity;
            C2792ao aoVar = C2792ao.this;
            if (aoVar != null && aoVar.isAdded() && (activity = aoVar.getActivity()) != null && !activity.isFinishing()) {
                this.f8933a.run();
            }
        }
    }

    C2792ao() {
    }

    /* renamed from: a */
    static void m10856a(C2793e eVar, long j) {
        new Handler(Looper.getMainLooper()).postDelayed(eVar, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo8843b(Runnable runnable, long j) {
        m10856a(new C2793e(runnable), j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo8844e(Runnable runnable) {
        if (getActivity() != null) {
            new Handler(Looper.getMainLooper()).post(new C2793e(runnable));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo8845e(Runnable runnable, long j) {
        new Handler().postDelayed(new C2793e(runnable), j);
    }
}
