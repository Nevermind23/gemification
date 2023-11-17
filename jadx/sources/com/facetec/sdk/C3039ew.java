package com.facetec.sdk;

import java.math.BigDecimal;

/* renamed from: com.facetec.sdk.ew */
public final class C3039ew extends Number {

    /* renamed from: b */
    private final String f10182b;

    public C3039ew(String str) {
        this.f10182b = str;
    }

    private Object writeReplace() {
        return new BigDecimal(this.f10182b);
    }

    public final double doubleValue() {
        return Double.parseDouble(this.f10182b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3039ew)) {
            return false;
        }
        String str = this.f10182b;
        String str2 = ((C3039ew) obj).f10182b;
        if (str == str2 || str.equals(str2)) {
            return true;
        }
        return false;
    }

    public final float floatValue() {
        return Float.parseFloat(this.f10182b);
    }

    public final int hashCode() {
        return this.f10182b.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return (int) java.lang.Long.parseLong(r2.f10182b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        return new java.math.BigDecimal(r2.f10182b).intValue();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int intValue() {
        /*
            r2 = this;
            java.lang.String r0 = r2.f10182b     // Catch:{ NumberFormatException -> 0x0007 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0007 }
            return r0
        L_0x0007:
            java.lang.String r0 = r2.f10182b     // Catch:{ NumberFormatException -> 0x000f }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x000f }
            int r0 = (int) r0
            return r0
        L_0x000f:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = r2.f10182b
            r0.<init>(r1)
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3039ew.intValue():int");
    }

    public final long longValue() {
        try {
            return Long.parseLong(this.f10182b);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f10182b).longValue();
        }
    }

    public final String toString() {
        return this.f10182b;
    }
}
