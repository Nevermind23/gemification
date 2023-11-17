package db1;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: db1.d */
public final class C31554d {

    /* renamed from: a */
    private final String f78115a;

    /* renamed from: b */
    private final String f78116b;

    /* renamed from: c */
    private final String f78117c;

    /* renamed from: d */
    private final String f78118d;

    /* renamed from: e */
    private final boolean f78119e;

    /* renamed from: f */
    private final List f78120f;

    /* renamed from: g */
    private final List f78121g;

    /* renamed from: h */
    private final String f78122h;

    /* renamed from: i */
    private final boolean f78123i;

    /* renamed from: j */
    private final String f78124j;

    public C31554d(String str, String str2, String str3, String str4, boolean z, List list, List list2, String str5, boolean z2) {
        C41536l.m120489i(str, "userId");
        C41536l.m120489i(str2, "firstName");
        C41536l.m120489i(str3, "lastName");
        C41536l.m120489i(list, "contactNumbers");
        C41536l.m120489i(list2, "emails");
        C41536l.m120489i(str5, "address");
        this.f78115a = str;
        this.f78116b = str2;
        this.f78117c = str3;
        this.f78118d = str4;
        this.f78119e = z;
        this.f78120f = list;
        this.f78121g = list2;
        this.f78122h = str5;
        this.f78123i = z2;
        this.f78124j = str2 + ' ' + str3;
    }

    /* renamed from: a */
    public final String mo71974a() {
        return this.f78122h;
    }

    /* renamed from: b */
    public final List mo71975b() {
        return this.f78120f;
    }

    /* renamed from: c */
    public final List mo71976c() {
        return this.f78121g;
    }

    /* renamed from: d */
    public final String mo71977d() {
        return this.f78124j;
    }

    /* renamed from: e */
    public final boolean mo71978e() {
        return this.f78119e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31554d)) {
            return false;
        }
        C31554d dVar = (C31554d) obj;
        return C41536l.m120484d(this.f78115a, dVar.f78115a) && C41536l.m120484d(this.f78116b, dVar.f78116b) && C41536l.m120484d(this.f78117c, dVar.f78117c) && C41536l.m120484d(this.f78118d, dVar.f78118d) && this.f78119e == dVar.f78119e && C41536l.m120484d(this.f78120f, dVar.f78120f) && C41536l.m120484d(this.f78121g, dVar.f78121g) && C41536l.m120484d(this.f78122h, dVar.f78122h) && this.f78123i == dVar.f78123i;
    }

    /* renamed from: f */
    public final String mo71980f() {
        return this.f78118d;
    }

    /* renamed from: g */
    public final String mo71981g() {
        return this.f78115a;
    }

    /* renamed from: h */
    public final boolean mo71982h() {
        return this.f78123i;
    }

    public int hashCode() {
        int hashCode = ((((this.f78115a.hashCode() * 31) + this.f78116b.hashCode()) * 31) + this.f78117c.hashCode()) * 31;
        String str = this.f78118d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.f78119e;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode3 = (((((((hashCode2 + (z ? 1 : 0)) * 31) + this.f78120f.hashCode()) * 31) + this.f78121g.hashCode()) * 31) + this.f78122h.hashCode()) * 31;
        boolean z3 = this.f78123i;
        if (!z3) {
            z2 = z3;
        }
        return hashCode3 + (z2 ? 1 : 0);
    }

    public String toString() {
        return "UserInfoUiModel(userId=" + this.f78115a + ", firstName=" + this.f78116b + ", lastName=" + this.f78117c + ", profilePictureUrl=" + this.f78118d + ", hasPublicProfilePicture=" + this.f78119e + ", contactNumbers=" + this.f78120f + ", emails=" + this.f78121g + ", address=" + this.f78122h + ", isDefaultImage=" + this.f78123i + ')';
    }
}
