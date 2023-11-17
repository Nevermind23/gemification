package p565pm;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: pm.d */
public final class C17389d {

    /* renamed from: a */
    private final long f48786a;

    /* renamed from: b */
    private final String f48787b;

    /* renamed from: c */
    private final String f48788c;

    /* renamed from: d */
    private final C17390e f48789d;

    /* renamed from: e */
    private final String f48790e;

    /* renamed from: f */
    private final String f48791f;

    /* renamed from: g */
    private final List f48792g;

    public C17389d(long j, String str, String str2, C17390e eVar, String str3, String str4, List list) {
        C41536l.m120489i(str, "parentId");
        C41536l.m120489i(str2, "langCode");
        C41536l.m120489i(str3, "pointValue");
        C41536l.m120489i(str4, "pointDesc");
        this.f48786a = j;
        this.f48787b = str;
        this.f48788c = str2;
        this.f48789d = eVar;
        this.f48790e = str3;
        this.f48791f = str4;
        this.f48792g = list;
    }

    /* renamed from: a */
    public final long mo44907a() {
        return this.f48786a;
    }

    /* renamed from: b */
    public final String mo44908b() {
        return this.f48791f;
    }

    /* renamed from: c */
    public final C17390e mo44909c() {
        return this.f48789d;
    }

    /* renamed from: d */
    public final String mo44910d() {
        return this.f48790e;
    }

    /* renamed from: e */
    public final List mo44911e() {
        return this.f48792g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17389d)) {
            return false;
        }
        C17389d dVar = (C17389d) obj;
        return this.f48786a == dVar.f48786a && C41536l.m120484d(this.f48787b, dVar.f48787b) && C41536l.m120484d(this.f48788c, dVar.f48788c) && this.f48789d == dVar.f48789d && C41536l.m120484d(this.f48790e, dVar.f48790e) && C41536l.m120484d(this.f48791f, dVar.f48791f) && C41536l.m120484d(this.f48792g, dVar.f48792g);
    }

    public int hashCode() {
        int a = ((((C7397t.m28148a(this.f48786a) * 31) + this.f48787b.hashCode()) * 31) + this.f48788c.hashCode()) * 31;
        C17390e eVar = this.f48789d;
        int i = 0;
        int hashCode = (((((a + (eVar == null ? 0 : eVar.hashCode())) * 31) + this.f48790e.hashCode()) * 31) + this.f48791f.hashCode()) * 31;
        List list = this.f48792g;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        long j = this.f48786a;
        String str = this.f48787b;
        String str2 = this.f48788c;
        C17390e eVar = this.f48789d;
        String str3 = this.f48790e;
        String str4 = this.f48791f;
        List list = this.f48792g;
        return "InstantDeliveryPoint(id=" + j + ", parentId=" + str + ", langCode=" + str2 + ", pointType=" + eVar + ", pointValue=" + str3 + ", pointDesc=" + str4 + ", points=" + list + ")";
    }
}
