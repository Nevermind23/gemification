package h10;

import kotlin.jvm.internal.C41536l;

/* renamed from: h10.a */
public final class C24850a {

    /* renamed from: a */
    private final String f63843a;

    /* renamed from: b */
    private final String f63844b;

    /* renamed from: c */
    private final String f63845c;

    /* renamed from: d */
    private final String f63846d;

    /* renamed from: e */
    private final String f63847e;

    /* renamed from: f */
    private final String f63848f;

    public C24850a(String str, String str2, String str3, String str4, String str5, String str6) {
        C41536l.m120489i(str, "contractText");
        C41536l.m120489i(str2, "id");
        C41536l.m120489i(str3, "languageCode");
        C41536l.m120489i(str4, "inpSysdate");
        C41536l.m120489i(str5, "contractTypeId");
        C41536l.m120489i(str6, "templateVersionId");
        this.f63843a = str;
        this.f63844b = str2;
        this.f63845c = str3;
        this.f63846d = str4;
        this.f63847e = str5;
        this.f63848f = str6;
    }

    /* renamed from: a */
    public final String mo63293a() {
        return this.f63843a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24850a)) {
            return false;
        }
        C24850a aVar = (C24850a) obj;
        return C41536l.m120484d(this.f63843a, aVar.f63843a) && C41536l.m120484d(this.f63844b, aVar.f63844b) && C41536l.m120484d(this.f63845c, aVar.f63845c) && C41536l.m120484d(this.f63846d, aVar.f63846d) && C41536l.m120484d(this.f63847e, aVar.f63847e) && C41536l.m120484d(this.f63848f, aVar.f63848f);
    }

    public int hashCode() {
        return (((((((((this.f63843a.hashCode() * 31) + this.f63844b.hashCode()) * 31) + this.f63845c.hashCode()) * 31) + this.f63846d.hashCode()) * 31) + this.f63847e.hashCode()) * 31) + this.f63848f.hashCode();
    }

    public String toString() {
        String str = this.f63843a;
        String str2 = this.f63844b;
        String str3 = this.f63845c;
        String str4 = this.f63846d;
        String str5 = this.f63847e;
        String str6 = this.f63848f;
        return "ContractUiModel(contractText=" + str + ", id=" + str2 + ", languageCode=" + str3 + ", inpSysdate=" + str4 + ", contractTypeId=" + str5 + ", templateVersionId=" + str6 + ")";
    }
}
