package p606sl;

import kotlin.jvm.internal.C41536l;

/* renamed from: sl.h */
public final class C17842h {

    /* renamed from: a */
    private final Long f50791a;

    /* renamed from: b */
    private final Long f50792b;

    /* renamed from: c */
    private final String f50793c;

    /* renamed from: d */
    private final String f50794d;

    /* renamed from: e */
    private final String f50795e;

    /* renamed from: f */
    private final Double f50796f;

    /* renamed from: g */
    private final String f50797g;

    public C17842h(Long l, Long l2, String str, String str2, String str3, Double d, String str4) {
        this.f50791a = l;
        this.f50792b = l2;
        this.f50793c = str;
        this.f50794d = str2;
        this.f50795e = str3;
        this.f50796f = d;
        this.f50797g = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17842h)) {
            return false;
        }
        C17842h hVar = (C17842h) obj;
        return C41536l.m120484d(this.f50791a, hVar.f50791a) && C41536l.m120484d(this.f50792b, hVar.f50792b) && C41536l.m120484d(this.f50793c, hVar.f50793c) && C41536l.m120484d(this.f50794d, hVar.f50794d) && C41536l.m120484d(this.f50795e, hVar.f50795e) && C41536l.m120484d(this.f50796f, hVar.f50796f) && C41536l.m120484d(this.f50797g, hVar.f50797g);
    }

    public int hashCode() {
        Long l = this.f50791a;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.f50792b;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.f50793c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f50794d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f50795e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d = this.f50796f;
        int hashCode6 = (hashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        String str4 = this.f50797g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        Long l = this.f50791a;
        Long l2 = this.f50792b;
        String str = this.f50793c;
        String str2 = this.f50794d;
        String str3 = this.f50795e;
        Double d = this.f50796f;
        String str4 = this.f50797g;
        return "BnplInvoiceItem(loanKey=" + l + ", paymentDate=" + l2 + ", invoiceType=" + str + ", feeType=" + str2 + ", ccy=" + str3 + ", amount=" + d + ", invoiceTypeDictionaryKey=" + str4 + ")";
    }
}
