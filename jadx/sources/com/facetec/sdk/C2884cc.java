package com.facetec.sdk;

/* renamed from: com.facetec.sdk.cc */
enum C2884cc {
    ZOOM_CLOSE,
    ZOOM_FAR,
    PROCESSING_COMPLETE_TIMED_OUT,
    PROCESSING_COMPLETE_SUCCESS,
    PROCESSING_COMPLETE_RETRY,
    PROCESSING_COMPLETE_STILL_COMPUTING;

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo9007e() {
        return this == PROCESSING_COMPLETE_RETRY || this == PROCESSING_COMPLETE_SUCCESS;
    }
}
