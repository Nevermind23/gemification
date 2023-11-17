package p606sl;

import kotlin.jvm.internal.C41536l;

/* renamed from: sl.q */
public final class C17851q {

    /* renamed from: a */
    private final Long f50857a;

    /* renamed from: b */
    private final String f50858b;

    /* renamed from: c */
    private final String f50859c;

    /* renamed from: d */
    private final String f50860d;

    /* renamed from: e */
    private final Integer f50861e;

    /* renamed from: f */
    private final String f50862f;

    /* renamed from: g */
    private final String f50863g;

    /* renamed from: h */
    private final String f50864h;

    public C17851q(Long l, String str, String str2, String str3, Integer num, String str4, String str5, String str6) {
        this.f50857a = l;
        this.f50858b = str;
        this.f50859c = str2;
        this.f50860d = str3;
        this.f50861e = num;
        this.f50862f = str4;
        this.f50863g = str5;
        this.f50864h = str6;
    }

    /* renamed from: a */
    public final String mo45538a() {
        return this.f50864h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17851q)) {
            return false;
        }
        C17851q qVar = (C17851q) obj;
        return C41536l.m120484d(this.f50857a, qVar.f50857a) && C41536l.m120484d(this.f50858b, qVar.f50858b) && C41536l.m120484d(this.f50859c, qVar.f50859c) && C41536l.m120484d(this.f50860d, qVar.f50860d) && C41536l.m120484d(this.f50861e, qVar.f50861e) && C41536l.m120484d(this.f50862f, qVar.f50862f) && C41536l.m120484d(this.f50863g, qVar.f50863g) && C41536l.m120484d(this.f50864h, qVar.f50864h);
    }

    public int hashCode() {
        Long l = this.f50857a;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.f50858b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f50859c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f50860d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f50861e;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.f50862f;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f50863g;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f50864h;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        Long l = this.f50857a;
        String str = this.f50858b;
        String str2 = this.f50859c;
        String str3 = this.f50860d;
        Integer num = this.f50861e;
        String str4 = this.f50862f;
        String str5 = this.f50863g;
        String str6 = this.f50864h;
        return "MmmsDetails(clientKey=" + l + ", merchantName=" + str + ", merchantId=" + str2 + ", merchantPhoneNumber=" + str3 + ", reversalExpireDays=" + num + ", merchantLogoStorageId=" + str4 + ", merChantSourceType=" + str5 + ", merchantLogoURL=" + str6 + ")";
    }
}
