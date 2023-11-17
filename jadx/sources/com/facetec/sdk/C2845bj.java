package com.facetec.sdk;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* renamed from: com.facetec.sdk.bj */
final class C2845bj implements FaceTecIDScanResultCallback {

    /* renamed from: e */
    private final WeakReference<C2831bd> f9227e;

    C2845bj(C2831bd bdVar) {
        this.f9227e = new WeakReference<>(bdVar);
    }

    public final void cancel() {
        C2831bd bdVar = this.f9227e.get();
        if (C2810ax.m10987a((Activity) bdVar)) {
            this.f9227e.clear();
            bdVar.mo8932A();
        }
    }

    public final boolean proceedToNextStep(String str) {
        C2831bd bdVar = this.f9227e.get();
        if (C2810ax.m10987a((Activity) bdVar)) {
            return bdVar.mo8944c(str);
        }
        return false;
    }

    public final void uploadMessageOverride(String str) {
        C2831bd bdVar = this.f9227e.get();
        if (C2810ax.m10987a((Activity) bdVar)) {
            bdVar.mo8948e(str);
        }
    }

    public final void uploadProgress(float f) {
        C2831bd bdVar = this.f9227e.get();
        if (C2810ax.m10987a((Activity) bdVar)) {
            bdVar.mo8947e(f);
        }
    }
}
