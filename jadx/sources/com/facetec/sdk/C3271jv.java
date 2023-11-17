package com.facetec.sdk;

import java.io.IOException;

/* renamed from: com.facetec.sdk.jv */
public enum C3271jv {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    

    /* renamed from: f */
    private final String f10729f;

    private C3271jv(String str) {
        this.f10729f = str;
    }

    /* renamed from: a */
    public static C3271jv m13102a(String str) {
        C3271jv jvVar = HTTP_1_0;
        if (str.equals(jvVar.f10729f)) {
            return jvVar;
        }
        C3271jv jvVar2 = HTTP_1_1;
        if (str.equals(jvVar2.f10729f)) {
            return jvVar2;
        }
        C3271jv jvVar3 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(jvVar3.f10729f)) {
            return jvVar3;
        }
        C3271jv jvVar4 = HTTP_2;
        if (str.equals(jvVar4.f10729f)) {
            return jvVar4;
        }
        if (str.equals(SPDY_3.f10729f)) {
            return SPDY_3;
        }
        if (str.equals(QUIC.f10729f)) {
            return QUIC;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    public final String toString() {
        return this.f10729f;
    }
}
