package com.facetec.sdk;

/* renamed from: com.facetec.sdk.ll */
public enum C3361ll {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);
    

    /* renamed from: f */
    public final int f11050f;

    private C3361ll(int i) {
        this.f11050f = i;
    }

    /* renamed from: a */
    public static C3361ll m13419a(int i) {
        for (C3361ll llVar : values()) {
            if (llVar.f11050f == i) {
                return llVar;
            }
        }
        return null;
    }
}
