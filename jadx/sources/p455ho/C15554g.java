package p455ho;

import kotlin.jvm.internal.C41536l;

/* renamed from: ho.g */
public final class C15554g {

    /* renamed from: a */
    private final Boolean f44155a;

    /* renamed from: b */
    private final Boolean f44156b;

    /* renamed from: c */
    private final Boolean f44157c;

    /* renamed from: d */
    private final String f44158d;

    /* renamed from: e */
    private final Boolean f44159e;

    /* renamed from: f */
    private final String f44160f;

    /* renamed from: g */
    private final Long f44161g;

    public C15554g(Boolean bool, Boolean bool2, Boolean bool3, String str, Boolean bool4, String str2, Long l) {
        this.f44155a = bool;
        this.f44156b = bool2;
        this.f44157c = bool3;
        this.f44158d = str;
        this.f44159e = bool4;
        this.f44160f = str2;
        this.f44161g = l;
    }

    /* renamed from: a */
    public final boolean mo42741a() {
        return C41536l.m120484d(this.f44160f, "downgrade");
    }

    /* renamed from: b */
    public final Boolean mo42742b() {
        return this.f44156b;
    }

    /* renamed from: c */
    public final Boolean mo42743c() {
        return this.f44155a;
    }

    /* renamed from: d */
    public final Long mo42744d() {
        return this.f44161g;
    }

    /* renamed from: e */
    public final Boolean mo42745e() {
        return this.f44157c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15554g)) {
            return false;
        }
        C15554g gVar = (C15554g) obj;
        return C41536l.m120484d(this.f44155a, gVar.f44155a) && C41536l.m120484d(this.f44156b, gVar.f44156b) && C41536l.m120484d(this.f44157c, gVar.f44157c) && C41536l.m120484d(this.f44158d, gVar.f44158d) && C41536l.m120484d(this.f44159e, gVar.f44159e) && C41536l.m120484d(this.f44160f, gVar.f44160f) && C41536l.m120484d(this.f44161g, gVar.f44161g);
    }

    /* renamed from: f */
    public final Boolean mo42747f() {
        return this.f44159e;
    }

    public int hashCode() {
        Boolean bool = this.f44155a;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f44156b;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f44157c;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.f44158d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool4 = this.f44159e;
        int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str2 = this.f44160f;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f44161g;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        Boolean bool = this.f44155a;
        Boolean bool2 = this.f44156b;
        Boolean bool3 = this.f44157c;
        String str = this.f44158d;
        Boolean bool4 = this.f44159e;
        String str2 = this.f44160f;
        Long l = this.f44161g;
        return "PackageActivateResponse(genesysActivityRegistered=" + bool + ", digitalSoloPackageActivated=" + bool2 + ", rbPackageActivated=" + bool3 + ", newPackageName=" + str + ", soloPackageActivated=" + bool4 + ", status=" + str2 + ", packageActivationDate=" + l + ")";
    }
}
