package com.facetec.sdk;

import android.renderscript.Allocation;

/* renamed from: com.facetec.sdk.nj */
public final /* synthetic */ class C3469nj implements Allocation.OnBufferAvailableListener {

    /* renamed from: a */
    public final /* synthetic */ C2959dp f11324a;

    public /* synthetic */ C3469nj(C2959dp dpVar) {
        this.f11324a = dpVar;
    }

    public final void onBufferAvailable(Allocation allocation) {
        this.f11324a.m12508c(allocation);
    }
}
