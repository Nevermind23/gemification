package p341ge.bog.sso_client.models;

import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.sso_client.models.g */
public final class C35939g {

    /* renamed from: a */
    private Boolean f86949a;

    /* renamed from: b */
    private Boolean f86950b;

    /* renamed from: c */
    private Boolean f86951c;

    /* renamed from: d */
    private Boolean f86952d;

    /* renamed from: e */
    private String f86953e;

    public C35939g(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str) {
        this.f86949a = bool;
        this.f86950b = bool2;
        this.f86951c = bool3;
        this.f86952d = bool4;
        this.f86953e = str;
    }

    /* renamed from: a */
    public final String mo88497a() {
        return this.f86953e;
    }

    /* renamed from: b */
    public final Boolean mo88498b() {
        return this.f86949a;
    }

    /* renamed from: c */
    public final Boolean mo88499c() {
        return this.f86952d;
    }

    /* renamed from: d */
    public final Boolean mo88500d() {
        return this.f86950b;
    }

    /* renamed from: e */
    public final Boolean mo88501e() {
        return this.f86951c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35939g)) {
            return false;
        }
        C35939g gVar = (C35939g) obj;
        return C41536l.m120484d(this.f86949a, gVar.f86949a) && C41536l.m120484d(this.f86950b, gVar.f86950b) && C41536l.m120484d(this.f86951c, gVar.f86951c) && C41536l.m120484d(this.f86952d, gVar.f86952d) && C41536l.m120484d(this.f86953e, gVar.f86953e);
    }

    public int hashCode() {
        Boolean bool = this.f86949a;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f86950b;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f86951c;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f86952d;
        int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str = this.f86953e;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "LogInInfo(isChannelActive=" + this.f86949a + ", isPasswordExpired=" + this.f86950b + ", isUserNameChangeRequired=" + this.f86951c + ", isPasswordChangeRequired=" + this.f86952d + ", processReference=" + this.f86953e + ')';
    }
}
