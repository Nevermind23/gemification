package x80;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: x80.c */
public final class C29659c {

    /* renamed from: a */
    private final BigDecimal f74839a;

    /* renamed from: b */
    private final String f74840b;

    /* renamed from: c */
    private final String f74841c;

    /* renamed from: d */
    private final String f74842d;

    /* renamed from: e */
    private final String f74843e;

    public C29659c(BigDecimal bigDecimal, String str, String str2, String str3, String str4) {
        C41536l.m120489i(str3, "applicationStatus");
        this.f74839a = bigDecimal;
        this.f74840b = str;
        this.f74841c = str2;
        this.f74842d = str3;
        this.f74843e = str4;
    }

    /* renamed from: a */
    public final String mo69592a() {
        return this.f74843e;
    }

    /* renamed from: b */
    public final String mo69593b() {
        return this.f74842d;
    }

    /* renamed from: c */
    public final String mo69594c() {
        return this.f74841c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29659c)) {
            return false;
        }
        C29659c cVar = (C29659c) obj;
        return C41536l.m120484d(this.f74839a, cVar.f74839a) && C41536l.m120484d(this.f74840b, cVar.f74840b) && C41536l.m120484d(this.f74841c, cVar.f74841c) && C41536l.m120484d(this.f74842d, cVar.f74842d) && C41536l.m120484d(this.f74843e, cVar.f74843e);
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.f74839a;
        int i = 0;
        int hashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        String str = this.f74840b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f74841c;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f74842d.hashCode()) * 31;
        String str3 = this.f74843e;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        BigDecimal bigDecimal = this.f74839a;
        String str = this.f74840b;
        String str2 = this.f74841c;
        String str3 = this.f74842d;
        String str4 = this.f74843e;
        return "ClLoanDetails(amount=" + bigDecimal + ", currency=" + str + ", resultCodeDictionaryKey=" + str2 + ", applicationStatus=" + str3 + ", applicationId=" + str4 + ")";
    }
}
