package p341ge.bog.sso_client.models;

import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.sso_client.models.a */
public final class C35933a {

    /* renamed from: a */
    private String f86917a;

    /* renamed from: b */
    private String f86918b;

    public C35933a(String str, String str2) {
        this.f86917a = str;
        this.f86918b = str2;
    }

    /* renamed from: a */
    public final String mo88458a() {
        return this.f86917a;
    }

    /* renamed from: b */
    public final String mo88459b() {
        return this.f86918b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35933a)) {
            return false;
        }
        C35933a aVar = (C35933a) obj;
        return C41536l.m120484d(this.f86917a, aVar.f86917a) && C41536l.m120484d(this.f86918b, aVar.f86918b);
    }

    public int hashCode() {
        String str = this.f86917a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f86918b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "AccessToken(refreshToken=" + this.f86917a + ", token=" + this.f86918b + ')';
    }
}
