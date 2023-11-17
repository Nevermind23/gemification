package kr0;

import kotlin.jvm.internal.C41536l;

/* renamed from: kr0.e */
final class C36938e {

    /* renamed from: a */
    private final String f89054a;

    /* renamed from: b */
    private final String f89055b;

    /* renamed from: c */
    private final int f89056c;

    public C36938e(String str, String str2, int i) {
        C41536l.m120489i(str, "productType");
        C41536l.m120489i(str2, "productCode");
        this.f89054a = str;
        this.f89055b = str2;
        this.f89056c = i;
    }

    /* renamed from: a */
    public final String mo89879a() {
        return this.f89055b;
    }

    /* renamed from: b */
    public final String mo89880b() {
        return this.f89054a;
    }

    /* renamed from: c */
    public final int mo89881c() {
        return this.f89056c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36938e)) {
            return false;
        }
        C36938e eVar = (C36938e) obj;
        return C41536l.m120484d(this.f89054a, eVar.f89054a) && C41536l.m120484d(this.f89055b, eVar.f89055b) && this.f89056c == eVar.f89056c;
    }

    public int hashCode() {
        return (((this.f89054a.hashCode() * 31) + this.f89055b.hashCode()) * 31) + this.f89056c;
    }

    public String toString() {
        String str = this.f89054a;
        String str2 = this.f89055b;
        int i = this.f89056c;
        return "OfferInfoRequest(productType=" + str + ", productCode=" + str2 + ", requestCode=" + i + ")";
    }
}
