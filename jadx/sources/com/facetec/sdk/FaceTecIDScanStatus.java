package com.facetec.sdk;

public enum FaceTecIDScanStatus {
    SUCCESS("The ID Scan was performed successfully and identity document data was generated."),
    UNSUCCESS("The ID Scan was not performed successfully and identity document data was not generated."),
    USER_CANCELED("The user pressed the cancel button and did not complete the ID Scan process."),
    TIMED_OUT("ID Scan cancelled due to timeout."),
    CONTEXT_SWITCH("ID Scan cancelled because a Context Switch occurred."),
    CAMERA_ERROR("ID Scan cancelled due to camera error."),
    NETWORK_ERROR("ID Scan cancelled because a network connection is required."),
    LANDSCAPE_MODE_NOT_ALLOWED("ID Scan cancelled because device is in landscape mode."),
    REVERSE_PORTRAIT_NOT_ALLOWED("ID Scan cancelled because device is in reverse portrait mode."),
    SKIPPED("ID Scan was skipped."),
    CAMERA_PERMISSION_DENIED("Camera is required but access prevented by user settings.");
    

    /* renamed from: d */
    private final String f8626d;

    private FaceTecIDScanStatus(String str) {
        this.f8626d = str;
    }

    public final String toString() {
        return this.f8626d;
    }
}
