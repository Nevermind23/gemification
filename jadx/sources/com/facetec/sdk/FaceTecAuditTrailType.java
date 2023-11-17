package com.facetec.sdk;

public enum FaceTecAuditTrailType {
    DISABLED("Audit trail images will not be returned"),
    FULL_RESOLUTION("The full resolution image will be returned for the audit trail"),
    HEIGHT_640("An image of height 640 will be returned for the audit trail");
    

    /* renamed from: b */
    private final String f8591b;

    private FaceTecAuditTrailType(String str) {
        this.f8591b = str;
    }

    public final String toString() {
        return this.f8591b;
    }
}
