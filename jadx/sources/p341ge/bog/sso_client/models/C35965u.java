package p341ge.bog.sso_client.models;

import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.sso_client.models.u */
public final class C35965u {

    /* renamed from: a */
    private final Long f87018a;

    /* renamed from: b */
    private final String f87019b;

    /* renamed from: c */
    private final String f87020c;

    /* renamed from: d */
    private final String f87021d;

    public C35965u(Long l, String str, String str2, String str3) {
        this.f87018a = l;
        this.f87019b = str;
        this.f87020c = str2;
        this.f87021d = str3;
    }

    /* renamed from: a */
    public final String mo88570a() {
        return this.f87019b;
    }

    /* renamed from: b */
    public final String mo88571b() {
        return this.f87020c;
    }

    /* renamed from: c */
    public final Long mo88572c() {
        return this.f87018a;
    }

    /* renamed from: d */
    public final String mo88573d() {
        return this.f87021d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35965u)) {
            return false;
        }
        C35965u uVar = (C35965u) obj;
        return C41536l.m120484d(this.f87018a, uVar.f87018a) && C41536l.m120484d(this.f87019b, uVar.f87019b) && C41536l.m120484d(this.f87020c, uVar.f87020c) && C41536l.m120484d(this.f87021d, uVar.f87021d);
    }

    public int hashCode() {
        Long l = this.f87018a;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.f87019b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f87020c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f87021d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "TurnoverTypes(id=" + this.f87018a + ", code=" + this.f87019b + ", description=" + this.f87020c + ", type=" + this.f87021d + ')';
    }
}
