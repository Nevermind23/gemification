package com.facetec.sdk;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: com.facetec.sdk.az */
final class C2815az implements FaceTecFaceScanResultCallback {

    /* renamed from: c */
    private final WeakReference<C2831bd> f9061c;

    C2815az(C2831bd bdVar) {
        this.f9061c = new WeakReference<>(bdVar);
    }

    /* renamed from: e */
    private C2831bd m11054e(boolean z) {
        C2831bd bdVar = this.f9061c.get();
        if (z) {
            this.f9061c.clear();
        }
        return bdVar;
    }

    public final void cancel() {
        C2831bd e = m11054e(true);
        if (C2810ax.m10987a((Activity) e)) {
            C3555s.m13898c((Context) e, C2867c.DEVELOPER_USED_FACESCAN_CALLBACK, "cancel");
            e.mo8945d(e.f9169t.getStatus());
        }
    }

    public final boolean proceedToNextStep(String str) {
        return proceedToNextStep(str, FaceTecIDScanNextStep.SELECTION_SCREEN);
    }

    public final void retry() {
        C2831bd e = m11054e(true);
        if (C2810ax.m10987a((Activity) e)) {
            e.mo8934C();
        }
    }

    public final void succeed() {
        succeed(FaceTecIDScanNextStep.SELECTION_SCREEN);
    }

    public final void uploadMessageOverride(String str) {
        C2831bd e = m11054e(false);
        if (C2810ax.m10987a((Activity) e)) {
            e.mo8948e(str);
        }
    }

    public final void uploadProgress(float f) {
        C2831bd e = m11054e(false);
        if (C2810ax.m10987a((Activity) e)) {
            e.mo8947e(f);
        }
    }

    public final boolean proceedToNextStep(String str, FaceTecIDScanNextStep faceTecIDScanNextStep) {
        C2831bd e = m11054e(true);
        if (C2810ax.m10987a((Activity) e)) {
            return e.mo8949e(str, faceTecIDScanNextStep);
        }
        return false;
    }

    public final void succeed(FaceTecIDScanNextStep faceTecIDScanNextStep) {
        C2831bd e = m11054e(true);
        if (C2810ax.m10987a((Activity) e)) {
            e.mo8939a(faceTecIDScanNextStep);
        }
    }
}
