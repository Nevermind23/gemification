package p893sw;

import kotlin.jvm.internal.C41536l;

/* renamed from: sw.a */
public final class C28278a {

    /* renamed from: a */
    private final Boolean f71769a;

    /* renamed from: b */
    private final Boolean f71770b;

    /* renamed from: c */
    private final String f71771c;

    /* renamed from: d */
    private final String f71772d;

    public C28278a(Boolean bool, Boolean bool2, String str, String str2) {
        this.f71769a = bool;
        this.f71770b = bool2;
        this.f71771c = str;
        this.f71772d = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28278a)) {
            return false;
        }
        C28278a aVar = (C28278a) obj;
        return C41536l.m120484d(this.f71769a, aVar.f71769a) && C41536l.m120484d(this.f71770b, aVar.f71770b) && C41536l.m120484d(this.f71771c, aVar.f71771c) && C41536l.m120484d(this.f71772d, aVar.f71772d);
    }

    public int hashCode() {
        Boolean bool = this.f71769a;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f71770b;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.f71771c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f71772d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        Boolean bool = this.f71769a;
        Boolean bool2 = this.f71770b;
        String str = this.f71771c;
        String str2 = this.f71772d;
        return "ReferalBannerInfo(isActiveClient=" + bool + ", isReferralProgramActive=" + bool2 + ", myActivatedPromoCode=" + str + ", bannerText=" + str2 + ")";
    }
}
