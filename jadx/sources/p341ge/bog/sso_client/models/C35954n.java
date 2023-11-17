package p341ge.bog.sso_client.models;

import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.sso_client.models.n */
public final class C35954n {

    /* renamed from: a */
    private final String f86986a;

    /* renamed from: b */
    private final String f86987b;

    /* renamed from: c */
    private final Boolean f86988c;

    /* renamed from: d */
    private final String f86989d;

    public C35954n(String str, String str2, Boolean bool, String str3) {
        C41536l.m120489i(str3, "operationId");
        this.f86986a = str;
        this.f86987b = str2;
        this.f86988c = bool;
        this.f86989d = str3;
    }

    /* renamed from: a */
    public final String mo88526a() {
        return this.f86989d;
    }

    /* renamed from: b */
    public final String mo88527b() {
        return this.f86986a;
    }

    /* renamed from: c */
    public final Boolean mo88528c() {
        return this.f86988c;
    }

    /* renamed from: d */
    public final String mo88529d() {
        return this.f86987b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35954n)) {
            return false;
        }
        C35954n nVar = (C35954n) obj;
        return C41536l.m120484d(this.f86986a, nVar.f86986a) && C41536l.m120484d(this.f86987b, nVar.f86987b) && C41536l.m120484d(this.f86988c, nVar.f86988c) && C41536l.m120484d(this.f86989d, nVar.f86989d);
    }

    public int hashCode() {
        String str = this.f86986a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f86987b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f86988c;
        if (bool != null) {
            i = bool.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.f86989d.hashCode();
    }

    public String toString() {
        return "ScaVerificationResponse(operationReference=" + this.f86986a + ", scaAuthCode=" + this.f86987b + ", requireSCA=" + this.f86988c + ", operationId=" + this.f86989d + ')';
    }
}
