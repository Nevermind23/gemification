package p710av;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: av.a */
public final class C19278a {

    /* renamed from: a */
    private final long f53486a;

    /* renamed from: b */
    private final long f53487b;

    /* renamed from: c */
    private final String f53488c;

    /* renamed from: d */
    private final String f53489d;

    /* renamed from: e */
    private final long f53490e;

    /* renamed from: f */
    private final String f53491f;

    public C19278a(long j, long j2, String str, String str2, long j3, String str3) {
        C41536l.m120489i(str, "contractText");
        C41536l.m120489i(str2, "languageCode");
        this.f53486a = j;
        this.f53487b = j2;
        this.f53488c = str;
        this.f53489d = str2;
        this.f53490e = j3;
        this.f53491f = str3;
    }

    /* renamed from: a */
    public final String mo47499a() {
        return this.f53488c;
    }

    /* renamed from: b */
    public final String mo47500b() {
        return this.f53491f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19278a)) {
            return false;
        }
        C19278a aVar = (C19278a) obj;
        return this.f53486a == aVar.f53486a && this.f53487b == aVar.f53487b && C41536l.m120484d(this.f53488c, aVar.f53488c) && C41536l.m120484d(this.f53489d, aVar.f53489d) && this.f53490e == aVar.f53490e && C41536l.m120484d(this.f53491f, aVar.f53491f);
    }

    public int hashCode() {
        int a = ((((((((C7397t.m28148a(this.f53486a) * 31) + C7397t.m28148a(this.f53487b)) * 31) + this.f53488c.hashCode()) * 31) + this.f53489d.hashCode()) * 31) + C7397t.m28148a(this.f53490e)) * 31;
        String str = this.f53491f;
        return a + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        long j = this.f53486a;
        long j2 = this.f53487b;
        String str = this.f53488c;
        String str2 = this.f53489d;
        long j3 = this.f53490e;
        String str3 = this.f53491f;
        return "CreditInfoContract(id=" + j + ", contractTypeId=" + j2 + ", contractText=" + str + ", languageCode=" + str2 + ", inpSysdate=" + j3 + ", templateVersionId=" + str3 + ")";
    }
}
