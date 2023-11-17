package com.facetec.sdk;

public interface FaceTecIDScanResultCallback {
    void cancel();

    boolean proceedToNextStep(String str);

    void uploadMessageOverride(String str);

    void uploadProgress(float f);
}
