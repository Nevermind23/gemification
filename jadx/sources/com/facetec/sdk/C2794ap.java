package com.facetec.sdk;

/* renamed from: com.facetec.sdk.ap */
enum C2794ap {
    FT_EVENT_ENROLL_SESSION_START,
    FT_EVENT_MID_ENROLL_SESSION_GLASSES_SUCCESS,
    FT_EVENT_ENROLL_SESSION_SUCCESS,
    FT_EVENT_ENROLL_SESSION_FAIL,
    FT_EVENT_ENROLL_SESSION_CANCEL,
    FT_EVENT_VERIFY_SESSION_START,
    FT_EVENT_VERIFY_SESSION_SUCCESS,
    FT_EVENT_VERIFY_SESSION_FAIL,
    FT_EVENT_VERIFY_SESSION_CANCEL,
    FT_EVENT_AUTH_SESSION_START,
    FT_EVENT_AUTH_SESSION_SUCCESS,
    FT_EVENT_AUTH_SESSION_FAIL,
    FT_EVENT_AUTH_SESSION_CANCEL,
    FT_EVENT_DIAGNOSTIC_UPLOAD_FAIL,
    FT_EVENT_FACESCAN_SESSION_SUCCESS,
    FT_EVENT_PHOENIX_SESSION_FAIL,
    FT_EVENT_FACESCAN_SESSION_FAIL;

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo8847e() {
        return this == FT_EVENT_FACESCAN_SESSION_SUCCESS || this == FT_EVENT_FACESCAN_SESSION_FAIL;
    }
}
