package ef0;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ef0.a */
public final class C20226a {

    /* renamed from: a */
    private final C20231f f55087a;

    /* renamed from: b */
    private final List f55088b;

    /* renamed from: c */
    private final String f55089c;

    /* renamed from: d */
    private final C20231f f55090d;

    /* renamed from: e */
    private final List f55091e;

    /* renamed from: f */
    private final C20231f f55092f;

    /* renamed from: g */
    private final List f55093g;

    /* renamed from: h */
    private final boolean f55094h;

    /* renamed from: i */
    private final String f55095i;

    /* renamed from: j */
    private final String f55096j;

    public C20226a(C20231f fVar, List list, String str, C20231f fVar2, List list2, C20231f fVar3, List list3, boolean z, String str2, String str3) {
        C41536l.m120489i(list, "occupationStatusList");
        C41536l.m120489i(list2, "sectorList");
        C41536l.m120489i(list3, "positionList");
        this.f55087a = fVar;
        this.f55088b = list;
        this.f55089c = str;
        this.f55090d = fVar2;
        this.f55091e = list2;
        this.f55092f = fVar3;
        this.f55093g = list3;
        this.f55094h = z;
        this.f55095i = str2;
        this.f55096j = str3;
    }

    /* renamed from: b */
    private final C20231f m66205b(List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C20231f) obj).mo48698c()) {
                break;
            }
        }
        return (C20231f) obj;
    }

    /* renamed from: a */
    public final boolean mo48653a() {
        return this.f55094h;
    }

    /* renamed from: c */
    public final C20231f mo48654c() {
        return m66205b(this.f55088b);
    }

    /* renamed from: d */
    public final C20231f mo48655d() {
        return m66205b(this.f55093g);
    }

    /* renamed from: e */
    public final C20231f mo48656e() {
        return m66205b(this.f55091e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20226a)) {
            return false;
        }
        C20226a aVar = (C20226a) obj;
        return C41536l.m120484d(this.f55087a, aVar.f55087a) && C41536l.m120484d(this.f55088b, aVar.f55088b) && C41536l.m120484d(this.f55089c, aVar.f55089c) && C41536l.m120484d(this.f55090d, aVar.f55090d) && C41536l.m120484d(this.f55091e, aVar.f55091e) && C41536l.m120484d(this.f55092f, aVar.f55092f) && C41536l.m120484d(this.f55093g, aVar.f55093g) && this.f55094h == aVar.f55094h && C41536l.m120484d(this.f55095i, aVar.f55095i) && C41536l.m120484d(this.f55096j, aVar.f55096j);
    }

    /* renamed from: f */
    public final String mo48658f() {
        return this.f55095i;
    }

    /* renamed from: g */
    public final String mo48659g() {
        return this.f55096j;
    }

    /* renamed from: h */
    public final String mo48660h() {
        return this.f55089c;
    }

    public int hashCode() {
        C20231f fVar = this.f55087a;
        int i = 0;
        int hashCode = (((fVar == null ? 0 : fVar.hashCode()) * 31) + this.f55088b.hashCode()) * 31;
        String str = this.f55089c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        C20231f fVar2 = this.f55090d;
        int hashCode3 = (((hashCode2 + (fVar2 == null ? 0 : fVar2.hashCode())) * 31) + this.f55091e.hashCode()) * 31;
        C20231f fVar3 = this.f55092f;
        int hashCode4 = (((hashCode3 + (fVar3 == null ? 0 : fVar3.hashCode())) * 31) + this.f55093g.hashCode()) * 31;
        boolean z = this.f55094h;
        if (z) {
            z = true;
        }
        int i2 = (hashCode4 + (z ? 1 : 0)) * 31;
        String str2 = this.f55095i;
        int hashCode5 = (i2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f55096j;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode5 + i;
    }

    /* renamed from: i */
    public final C20231f mo48662i() {
        return this.f55087a;
    }

    /* renamed from: j */
    public final List mo48663j() {
        return this.f55088b;
    }

    /* renamed from: k */
    public final C20231f mo48664k() {
        return this.f55092f;
    }

    /* renamed from: l */
    public final List mo48665l() {
        return this.f55093g;
    }

    /* renamed from: m */
    public final C20231f mo48666m() {
        return this.f55090d;
    }

    /* renamed from: n */
    public final List mo48667n() {
        return this.f55091e;
    }

    public String toString() {
        C20231f fVar = this.f55087a;
        List list = this.f55088b;
        String str = this.f55089c;
        C20231f fVar2 = this.f55090d;
        List list2 = this.f55091e;
        C20231f fVar3 = this.f55092f;
        List list3 = this.f55093g;
        boolean z = this.f55094h;
        String str2 = this.f55095i;
        String str3 = this.f55096j;
        return "EmploymentInfoModel(occupationStatus=" + fVar + ", occupationStatusList=" + list + ", employerName=" + str + ", sector=" + fVar2 + ", sectorList=" + list2 + ", position=" + fVar3 + ", positionList=" + list3 + ", broker=" + z + ", directorOfName=" + str2 + ", directorOfSymbol=" + str3 + ")";
    }
}
