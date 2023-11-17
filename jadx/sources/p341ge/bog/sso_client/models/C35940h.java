package p341ge.bog.sso_client.models;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.sso_client.models.h */
public final class C35940h {

    /* renamed from: f */
    public static final C35941a f86954f = new C35941a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final String f86955a;

    /* renamed from: b */
    private final String f86956b;

    /* renamed from: c */
    private final String f86957c;

    /* renamed from: d */
    private final Boolean f86958d;

    /* renamed from: e */
    private final Boolean f86959e;

    /* renamed from: ge.bog.sso_client.models.h$a */
    public static final class C35941a {
        private C35941a() {
        }

        public /* synthetic */ C35941a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C35940h(String str, String str2, String str3, Boolean bool, Boolean bool2) {
        this.f86955a = str;
        this.f86956b = str2;
        this.f86957c = str3;
        this.f86958d = bool;
        this.f86959e = bool2;
    }

    /* renamed from: a */
    public final String mo88505a() {
        return this.f86956b;
    }

    /* renamed from: b */
    public final String mo88506b() {
        return this.f86955a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35940h)) {
            return false;
        }
        C35940h hVar = (C35940h) obj;
        return C41536l.m120484d(this.f86955a, hVar.f86955a) && C41536l.m120484d(this.f86956b, hVar.f86956b) && C41536l.m120484d(this.f86957c, hVar.f86957c) && C41536l.m120484d(this.f86958d, hVar.f86958d) && C41536l.m120484d(this.f86959e, hVar.f86959e);
    }

    public int hashCode() {
        String str = this.f86955a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f86956b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f86957c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f86958d;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f86959e;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "LoginUserInfo(userId=" + this.f86955a + ", clientKey=" + this.f86956b + ", username=" + this.f86957c + ", mustSetUsername=" + this.f86958d + ", mustUpdatePassword=" + this.f86959e + ')';
    }
}
