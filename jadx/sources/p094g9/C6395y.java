package p094g9;

import p027b9.C2181e;
import p094g9.C6335d0;

/* renamed from: g9.y */
final class C6395y extends C6335d0.C6336a {

    /* renamed from: a */
    private final String f19619a;

    /* renamed from: b */
    private final String f19620b;

    /* renamed from: c */
    private final String f19621c;

    /* renamed from: d */
    private final String f19622d;

    /* renamed from: e */
    private final int f19623e;

    /* renamed from: f */
    private final C2181e f19624f;

    C6395y(String str, String str2, String str3, String str4, int i, C2181e eVar) {
        if (str != null) {
            this.f19619a = str;
            if (str2 != null) {
                this.f19620b = str2;
                if (str3 != null) {
                    this.f19621c = str3;
                    if (str4 != null) {
                        this.f19622d = str4;
                        this.f19623e = i;
                        if (eVar != null) {
                            this.f19624f = eVar;
                            return;
                        }
                        throw new NullPointerException("Null developmentPlatformProvider");
                    }
                    throw new NullPointerException("Null installUuid");
                }
                throw new NullPointerException("Null versionName");
            }
            throw new NullPointerException("Null versionCode");
        }
        throw new NullPointerException("Null appIdentifier");
    }

    /* renamed from: a */
    public String mo20205a() {
        return this.f19619a;
    }

    /* renamed from: c */
    public int mo20206c() {
        return this.f19623e;
    }

    /* renamed from: d */
    public C2181e mo20207d() {
        return this.f19624f;
    }

    /* renamed from: e */
    public String mo20208e() {
        return this.f19622d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6335d0.C6336a)) {
            return false;
        }
        C6335d0.C6336a aVar = (C6335d0.C6336a) obj;
        if (!this.f19619a.equals(aVar.mo20205a()) || !this.f19620b.equals(aVar.mo20209f()) || !this.f19621c.equals(aVar.mo20210g()) || !this.f19622d.equals(aVar.mo20208e()) || this.f19623e != aVar.mo20206c() || !this.f19624f.equals(aVar.mo20207d())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public String mo20209f() {
        return this.f19620b;
    }

    /* renamed from: g */
    public String mo20210g() {
        return this.f19621c;
    }

    public int hashCode() {
        return ((((((((((this.f19619a.hashCode() ^ 1000003) * 1000003) ^ this.f19620b.hashCode()) * 1000003) ^ this.f19621c.hashCode()) * 1000003) ^ this.f19622d.hashCode()) * 1000003) ^ this.f19623e) * 1000003) ^ this.f19624f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f19619a + ", versionCode=" + this.f19620b + ", versionName=" + this.f19621c + ", installUuid=" + this.f19622d + ", deliveryMechanism=" + this.f19623e + ", developmentPlatformProvider=" + this.f19624f + "}";
    }
}
