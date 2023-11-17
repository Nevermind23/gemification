package p606sl;

import kotlin.jvm.internal.C41536l;

/* renamed from: sl.k */
public final class C17845k {

    /* renamed from: a */
    private final Long f50818a;

    /* renamed from: b */
    private final Long f50819b;

    /* renamed from: c */
    private final String f50820c;

    /* renamed from: d */
    private final String f50821d;

    /* renamed from: e */
    private final Integer f50822e;

    /* renamed from: f */
    private final String f50823f;

    /* renamed from: g */
    private final String f50824g;

    /* renamed from: h */
    private final String f50825h;

    /* renamed from: i */
    private final String f50826i;

    public C17845k(Long l, Long l2, String str, String str2, Integer num, String str3, String str4, String str5, String str6) {
        this.f50818a = l;
        this.f50819b = l2;
        this.f50820c = str;
        this.f50821d = str2;
        this.f50822e = num;
        this.f50823f = str3;
        this.f50824g = str4;
        this.f50825h = str5;
        this.f50826i = str6;
    }

    /* renamed from: a */
    public final String mo45491a() {
        return this.f50821d;
    }

    /* renamed from: b */
    public final String mo45492b() {
        return this.f50820c;
    }

    /* renamed from: c */
    public final String mo45493c() {
        return this.f50823f;
    }

    /* renamed from: d */
    public final String mo45494d() {
        return this.f50826i;
    }

    /* renamed from: e */
    public final String mo45495e() {
        return this.f50824g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17845k)) {
            return false;
        }
        C17845k kVar = (C17845k) obj;
        return C41536l.m120484d(this.f50818a, kVar.f50818a) && C41536l.m120484d(this.f50819b, kVar.f50819b) && C41536l.m120484d(this.f50820c, kVar.f50820c) && C41536l.m120484d(this.f50821d, kVar.f50821d) && C41536l.m120484d(this.f50822e, kVar.f50822e) && C41536l.m120484d(this.f50823f, kVar.f50823f) && C41536l.m120484d(this.f50824g, kVar.f50824g) && C41536l.m120484d(this.f50825h, kVar.f50825h) && C41536l.m120484d(this.f50826i, kVar.f50826i);
    }

    public int hashCode() {
        Long l = this.f50818a;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.f50819b;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.f50820c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f50821d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f50822e;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f50823f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f50824g;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f50825h;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f50826i;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode8 + i;
    }

    public String toString() {
        Long l = this.f50818a;
        Long l2 = this.f50819b;
        String str = this.f50820c;
        String str2 = this.f50821d;
        Integer num = this.f50822e;
        String str3 = this.f50823f;
        String str4 = this.f50824g;
        String str5 = this.f50825h;
        String str6 = this.f50826i;
        return "BnplMerchantDetails(merchantId=" + l + ", clientId=" + l2 + ", brandNameGE=" + str + ", brandNameEN=" + str2 + ", actionLoanTerm=" + num + ", installmentType=" + str3 + ", webPageUrl=" + str4 + ", logoFileId=" + str5 + ", logoFileUrl=" + str6 + ")";
    }
}
