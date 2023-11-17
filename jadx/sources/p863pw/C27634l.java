package p863pw;

import kotlin.jvm.internal.C41536l;

/* renamed from: pw.l */
public final class C27634l {

    /* renamed from: a */
    private final boolean f70650a;

    /* renamed from: b */
    private final String f70651b;

    /* renamed from: c */
    private final String f70652c;

    /* renamed from: d */
    private final String f70653d;

    /* renamed from: e */
    private final Boolean f70654e;

    /* renamed from: f */
    private final String f70655f;

    /* renamed from: g */
    private final String f70656g;

    public C27634l(boolean z, String str, String str2, String str3, Boolean bool, String str4, String str5) {
        this.f70650a = z;
        this.f70651b = str;
        this.f70652c = str2;
        this.f70653d = str3;
        this.f70654e = bool;
        this.f70655f = str4;
        this.f70656g = str5;
    }

    /* renamed from: a */
    public final String mo67092a() {
        return this.f70653d;
    }

    /* renamed from: b */
    public final String mo67093b() {
        return this.f70651b;
    }

    /* renamed from: c */
    public final String mo67094c() {
        return this.f70656g;
    }

    /* renamed from: d */
    public final String mo67095d() {
        return this.f70652c;
    }

    /* renamed from: e */
    public final boolean mo67096e() {
        return this.f70650a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27634l)) {
            return false;
        }
        C27634l lVar = (C27634l) obj;
        return this.f70650a == lVar.f70650a && C41536l.m120484d(this.f70651b, lVar.f70651b) && C41536l.m120484d(this.f70652c, lVar.f70652c) && C41536l.m120484d(this.f70653d, lVar.f70653d) && C41536l.m120484d(this.f70654e, lVar.f70654e) && C41536l.m120484d(this.f70655f, lVar.f70655f) && C41536l.m120484d(this.f70656g, lVar.f70656g);
    }

    /* renamed from: f */
    public final Boolean mo67098f() {
        return this.f70654e;
    }

    public int hashCode() {
        boolean z = this.f70650a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.f70651b;
        int i2 = 0;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f70652c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f70653d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f70654e;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.f70655f;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f70656g;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode5 + i2;
    }

    public String toString() {
        boolean z = this.f70650a;
        String str = this.f70651b;
        String str2 = this.f70652c;
        String str3 = this.f70653d;
        Boolean bool = this.f70654e;
        String str4 = this.f70655f;
        String str5 = this.f70656g;
        return "AmexOfferInfo(isActive=" + z + ", imageUrl=" + str + ", title=" + str2 + ", description=" + str3 + ", isPayroll=" + bool + ", product=" + str4 + ", subProductCode=" + str5 + ")";
    }
}
