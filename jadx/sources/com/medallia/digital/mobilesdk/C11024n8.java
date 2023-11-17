package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C10785e0;

/* renamed from: com.medallia.digital.mobilesdk.n8 */
class C11024n8 extends C10785e0 {

    /* renamed from: c */
    private static final int f31683c = 31;

    /* renamed from: a */
    private final String f31684a;

    /* renamed from: b */
    private final String f31685b;

    public C11024n8(String str, String str2) {
        this.f31684a = str;
        this.f31685b = str2;
    }

    /* renamed from: a */
    public String mo28842a() {
        return this.f31684a;
    }

    /* renamed from: b */
    public String mo28843b() {
        return this.f31685b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C11024n8 n8Var = (C11024n8) obj;
        String str = this.f31685b;
        if (str == null ? n8Var.f31685b != null : !str.equals(n8Var.f31684a)) {
            return false;
        }
        String str2 = this.f31684a;
        String str3 = n8Var.f31684a;
        if (str2 != null) {
            if (!str2.equals(str3)) {
                return true;
            }
        } else if (str3 != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public C10785e0.C10786a getDataTableObjectType() {
        return C10785e0.C10786a.WorkerManager;
    }

    public int hashCode() {
        String str = this.f31684a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f31685b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    /* access modifiers changed from: package-private */
    public String toJsonString() {
        try {
            return "{\"mediaCaptureClientCorrelationId\":" + C11051p3.m40518c(this.f31684a) + "\"requestId\":" + C11051p3.m40518c(this.f31685b) + "}";
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }
}
