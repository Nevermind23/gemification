package k30;

import kotlin.jvm.internal.C41536l;

/* renamed from: k30.b */
public final class C25628b {

    /* renamed from: a */
    private final String f65358a;

    /* renamed from: b */
    private final String f65359b;

    public C25628b(String str, String str2) {
        C41536l.m120489i(str, "productCode");
        this.f65358a = str;
        this.f65359b = str2;
    }

    /* renamed from: a */
    public final String mo64164a() {
        String str = this.f65358a;
        return str == null ? "" : str;
    }

    /* renamed from: b */
    public final boolean mo64165b() {
        return C41536l.m120484d(this.f65358a, "BECOME_SOLO");
    }

    /* renamed from: c */
    public final boolean mo64166c() {
        return C41536l.m120484d(this.f65358a, "DEPOSIT_CAMPAIGN_03_2021");
    }

    /* renamed from: d */
    public final boolean mo64167d() {
        return C41536l.m120484d(this.f65358a, "DIGITAL_CARD");
    }

    /* renamed from: e */
    public final boolean mo64168e() {
        return C41536l.m120484d(this.f65358a, "UMTS_RECEIVE_TRANSFER_CAMPAIGN_052020");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25628b)) {
            return false;
        }
        C25628b bVar = (C25628b) obj;
        return C41536l.m120484d(this.f65358a, bVar.f65358a) && C41536l.m120484d(this.f65359b, bVar.f65359b);
    }

    /* renamed from: f */
    public final boolean mo64170f() {
        return C41536l.m120484d(this.f65358a, "SOLO_CARD");
    }

    /* renamed from: g */
    public final boolean mo64171g() {
        return C41536l.m120484d(this.f65358a, "UMTS_CAMPAIGN_2021_FEB");
    }

    public int hashCode() {
        int hashCode = this.f65358a.hashCode() * 31;
        String str = this.f65359b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f65358a;
        String str2 = this.f65359b;
        return "OfferProductUIDataModel(productCode=" + str + ", offerDtl=" + str2 + ")";
    }
}
