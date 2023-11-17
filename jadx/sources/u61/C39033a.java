package u61;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: u61.a */
public final class C39033a {

    /* renamed from: a */
    private final String f93155a;

    /* renamed from: b */
    private final long f93156b;

    /* renamed from: c */
    private final String f93157c;

    /* renamed from: d */
    private final String f93158d;

    /* renamed from: e */
    private final String f93159e;

    /* renamed from: f */
    private final List f93160f;

    /* renamed from: g */
    private final String f93161g;

    /* renamed from: h */
    private final String f93162h;

    public C39033a(String str, long j, String str2, String str3, String str4, List list, String str5, String str6) {
        this.f93155a = str;
        this.f93156b = j;
        this.f93157c = str2;
        this.f93158d = str3;
        this.f93159e = str4;
        this.f93160f = list;
        this.f93161g = str5;
        this.f93162h = str6;
    }

    /* renamed from: a */
    public final String mo92697a() {
        return this.f93161g;
    }

    /* renamed from: b */
    public final String mo92698b() {
        return this.f93162h;
    }

    /* renamed from: c */
    public final long mo92699c() {
        return this.f93156b;
    }

    /* renamed from: d */
    public final String mo92700d() {
        return this.f93155a;
    }

    /* renamed from: e */
    public final String mo92701e() {
        return this.f93159e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39033a)) {
            return false;
        }
        C39033a aVar = (C39033a) obj;
        return C41536l.m120484d(this.f93155a, aVar.f93155a) && this.f93156b == aVar.f93156b && C41536l.m120484d(this.f93157c, aVar.f93157c) && C41536l.m120484d(this.f93158d, aVar.f93158d) && C41536l.m120484d(this.f93159e, aVar.f93159e) && C41536l.m120484d(this.f93160f, aVar.f93160f) && C41536l.m120484d(this.f93161g, aVar.f93161g) && C41536l.m120484d(this.f93162h, aVar.f93162h);
    }

    /* renamed from: f */
    public final String mo92703f() {
        return this.f93158d;
    }

    /* renamed from: g */
    public final String mo92704g() {
        return this.f93157c;
    }

    /* renamed from: h */
    public final List mo92705h() {
        return this.f93160f;
    }

    public int hashCode() {
        String str = this.f93155a;
        int i = 0;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + C7397t.m28148a(this.f93156b)) * 31;
        String str2 = this.f93157c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f93158d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f93159e;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.f93160f;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.f93161g;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f93162h;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        String str = this.f93155a;
        long j = this.f93156b;
        String str2 = this.f93157c;
        String str3 = this.f93158d;
        String str4 = this.f93159e;
        List list = this.f93160f;
        String str5 = this.f93161g;
        String str6 = this.f93162h;
        return "Template(logo=" + str + ", id=" + j + ", templateName=" + str2 + ", templateImage=" + str3 + ", serviceId=" + str4 + ", templateParameters=" + list + ", configLogo=" + str5 + ", configName=" + str6 + ")";
    }
}
