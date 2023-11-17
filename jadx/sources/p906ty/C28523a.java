package p906ty;

import kotlin.jvm.internal.C41536l;

/* renamed from: ty.a */
public final class C28523a {

    /* renamed from: a */
    private final Long f72340a;

    /* renamed from: b */
    private final String f72341b;

    /* renamed from: c */
    private final Double f72342c;

    /* renamed from: d */
    private final String f72343d;

    /* renamed from: e */
    private final String f72344e;

    public C28523a(Long l, String str, Double d, String str2, String str3) {
        this.f72340a = l;
        this.f72341b = str;
        this.f72342c = d;
        this.f72343d = str2;
        this.f72344e = str3;
    }

    /* renamed from: a */
    public final Long mo68135a() {
        return this.f72340a;
    }

    /* renamed from: b */
    public final String mo68136b() {
        return this.f72341b;
    }

    /* renamed from: c */
    public final String mo68137c() {
        return this.f72344e;
    }

    /* renamed from: d */
    public final Double mo68138d() {
        return this.f72342c;
    }

    /* renamed from: e */
    public final String mo68139e() {
        return this.f72343d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28523a)) {
            return false;
        }
        C28523a aVar = (C28523a) obj;
        return C41536l.m120484d(this.f72340a, aVar.f72340a) && C41536l.m120484d(this.f72341b, aVar.f72341b) && C41536l.m120484d(this.f72342c, aVar.f72342c) && C41536l.m120484d(this.f72343d, aVar.f72343d) && C41536l.m120484d(this.f72344e, aVar.f72344e);
    }

    public int hashCode() {
        Long l = this.f72340a;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.f72341b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.f72342c;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.f72343d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f72344e;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        Long l = this.f72340a;
        String str = this.f72341b;
        Double d = this.f72342c;
        String str2 = this.f72343d;
        String str3 = this.f72344e;
        return "BonusAccount(acctKey=" + l + ", acctName=" + str + ", availableAmount=" + d + ", ccy=" + str2 + ", acctNo=" + str3 + ")";
    }
}
