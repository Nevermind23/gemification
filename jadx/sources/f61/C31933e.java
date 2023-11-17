package f61;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: f61.e */
public final class C31933e {

    /* renamed from: a */
    private final long f78708a;

    /* renamed from: b */
    private final String f78709b;

    /* renamed from: c */
    private final String f78710c;

    /* renamed from: d */
    private final C31934f f78711d;

    /* renamed from: e */
    private final String f78712e;

    /* renamed from: f */
    private final int f78713f;

    /* renamed from: g */
    private final String f78714g;

    /* renamed from: h */
    private final String f78715h;

    public C31933e(long j, String str, String str2, C31934f fVar, String str3, int i, String str4, String str5) {
        C41536l.m120489i(fVar, "storyType");
        this.f78708a = j;
        this.f78709b = str;
        this.f78710c = str2;
        this.f78711d = fVar;
        this.f78712e = str3;
        this.f78713f = i;
        this.f78714g = str4;
        this.f78715h = str5;
    }

    /* renamed from: a */
    public final String mo72408a() {
        return this.f78710c;
    }

    /* renamed from: b */
    public final String mo72409b() {
        return this.f78709b;
    }

    /* renamed from: c */
    public final String mo72410c() {
        return this.f78712e;
    }

    /* renamed from: d */
    public final String mo72411d() {
        return this.f78714g;
    }

    /* renamed from: e */
    public final long mo72412e() {
        return this.f78708a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31933e)) {
            return false;
        }
        C31933e eVar = (C31933e) obj;
        return this.f78708a == eVar.f78708a && C41536l.m120484d(this.f78709b, eVar.f78709b) && C41536l.m120484d(this.f78710c, eVar.f78710c) && C41536l.m120484d(this.f78711d, eVar.f78711d) && C41536l.m120484d(this.f78712e, eVar.f78712e) && this.f78713f == eVar.f78713f && C41536l.m120484d(this.f78714g, eVar.f78714g) && C41536l.m120484d(this.f78715h, eVar.f78715h);
    }

    /* renamed from: f */
    public final String mo72414f() {
        return this.f78715h;
    }

    /* renamed from: g */
    public final int mo72415g() {
        return this.f78713f;
    }

    /* renamed from: h */
    public final C31934f mo72416h() {
        return this.f78711d;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f78708a) * 31;
        String str = this.f78709b;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f78710c;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f78711d.hashCode()) * 31;
        String str3 = this.f78712e;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f78713f) * 31;
        String str4 = this.f78714g;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f78715h;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        long j = this.f78708a;
        String str = this.f78709b;
        String str2 = this.f78710c;
        C31934f fVar = this.f78711d;
        String str3 = this.f78712e;
        int i = this.f78713f;
        String str4 = this.f78714g;
        String str5 = this.f78715h;
        return "StoryGroupDetails(id=" + j + ", coverTitleGe=" + str + ", coverTitleEn=" + str2 + ", storyType=" + fVar + ", eventClickName=" + str3 + ", storyDuration=" + i + ", geoFileObjectId=" + str4 + ", intFileObjectId=" + str5 + ")";
    }
}
