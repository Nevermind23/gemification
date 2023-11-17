package m01;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: m01.b */
public final class C37188b {

    /* renamed from: a */
    private final String f89561a;

    /* renamed from: b */
    private final String f89562b;

    /* renamed from: c */
    private final Long f89563c;

    /* renamed from: d */
    private final String f89564d;

    /* renamed from: e */
    private final String f89565e;

    /* renamed from: f */
    private final List f89566f;

    public C37188b(String str, String str2, Long l, String str3, String str4, List list) {
        C41536l.m120489i(str, "acctNo");
        C41536l.m120489i(str3, "ccy");
        C41536l.m120489i(str4, "productCode");
        C41536l.m120489i(list, "subAccounts");
        this.f89561a = str;
        this.f89562b = str2;
        this.f89563c = l;
        this.f89564d = str3;
        this.f89565e = str4;
        this.f89566f = list;
    }

    /* renamed from: a */
    public final Long mo90210a() {
        return this.f89563c;
    }

    /* renamed from: b */
    public final String mo90211b() {
        return this.f89561a;
    }

    /* renamed from: c */
    public final List mo90212c() {
        return this.f89566f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37188b)) {
            return false;
        }
        C37188b bVar = (C37188b) obj;
        return C41536l.m120484d(this.f89561a, bVar.f89561a) && C41536l.m120484d(this.f89562b, bVar.f89562b) && C41536l.m120484d(this.f89563c, bVar.f89563c) && C41536l.m120484d(this.f89564d, bVar.f89564d) && C41536l.m120484d(this.f89565e, bVar.f89565e) && C41536l.m120484d(this.f89566f, bVar.f89566f);
    }

    public int hashCode() {
        int hashCode = this.f89561a.hashCode() * 31;
        String str = this.f89562b;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.f89563c;
        if (l != null) {
            i = l.hashCode();
        }
        return ((((((hashCode2 + i) * 31) + this.f89564d.hashCode()) * 31) + this.f89565e.hashCode()) * 31) + this.f89566f.hashCode();
    }

    public String toString() {
        String str = this.f89561a;
        String str2 = this.f89562b;
        Long l = this.f89563c;
        String str3 = this.f89564d;
        String str4 = this.f89565e;
        List list = this.f89566f;
        return "AccountDetailsData(acctNo=" + str + ", acctName=" + str2 + ", acctKey=" + l + ", ccy=" + str3 + ", productCode=" + str4 + ", subAccounts=" + list + ")";
    }
}
