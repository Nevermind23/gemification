package s31;

import kotlin.jvm.internal.C41536l;

/* renamed from: s31.c */
public final class C38423c {

    /* renamed from: a */
    private final String f92051a;

    /* renamed from: b */
    private final String f92052b;

    /* renamed from: c */
    private final String f92053c;

    /* renamed from: d */
    private final Double f92054d;

    /* renamed from: e */
    private final Boolean f92055e;

    public C38423c(String str, String str2, String str3, Double d, Boolean bool) {
        C41536l.m120489i(str, "id");
        this.f92051a = str;
        this.f92052b = str2;
        this.f92053c = str3;
        this.f92054d = d;
        this.f92055e = bool;
    }

    /* renamed from: a */
    public final String mo91974a() {
        return this.f92051a;
    }

    /* renamed from: b */
    public final String mo91975b() {
        return this.f92052b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38423c)) {
            return false;
        }
        C38423c cVar = (C38423c) obj;
        return C41536l.m120484d(this.f92051a, cVar.f92051a) && C41536l.m120484d(this.f92052b, cVar.f92052b) && C41536l.m120484d(this.f92053c, cVar.f92053c) && C41536l.m120484d(this.f92054d, cVar.f92054d) && C41536l.m120484d(this.f92055e, cVar.f92055e);
    }

    public int hashCode() {
        int hashCode = this.f92051a.hashCode() * 31;
        String str = this.f92052b;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f92053c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.f92054d;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Boolean bool = this.f92055e;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        String str = this.f92051a;
        String str2 = this.f92052b;
        String str3 = this.f92053c;
        Double d = this.f92054d;
        Boolean bool = this.f92055e;
        return "PaymentServiceConfigInputOption(id=" + str + ", value=" + str2 + ", service=" + str3 + ", amount=" + d + ", isJnr=" + bool + ")";
    }
}
