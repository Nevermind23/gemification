package com.facetec.sdk;

public interface FaceTecFaceScanResultCallback {
    void cancel();

    boolean proceedToNextStep(String str);

    boolean proceedToNextStep(String str, FaceTecIDScanNextStep faceTecIDScanNextStep);

    @Deprecated
    void retry();

    @Deprecated
    void succeed();

    @Deprecated
    void succeed(FaceTecIDScanNextStep faceTecIDScanNextStep);

    void uploadMessageOverride(String str);

    void uploadProgress(float f);
}
