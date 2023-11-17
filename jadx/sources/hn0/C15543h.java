package hn0;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: hn0.h */
public final class C15543h {

    /* renamed from: a */
    private final Integer f44117a;

    /* renamed from: b */
    private final String f44118b;

    /* renamed from: c */
    private final C15541f f44119c;

    /* renamed from: d */
    private final List f44120d;

    public C15543h(Integer num, String str, C15541f fVar, List list) {
        C41536l.m120489i(list, "occupations");
        this.f44117a = num;
        this.f44118b = str;
        this.f44119c = fVar;
        this.f44120d = list;
    }

    /* renamed from: a */
    public final C15541f mo42693a() {
        return this.f44119c;
    }

    /* renamed from: b */
    public final List mo42694b() {
        return this.f44120d;
    }

    /* renamed from: c */
    public final String mo42695c() {
        return this.f44118b;
    }

    /* renamed from: d */
    public final Integer mo42696d() {
        return this.f44117a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15543h)) {
            return false;
        }
        C15543h hVar = (C15543h) obj;
        return C41536l.m120484d(this.f44117a, hVar.f44117a) && C41536l.m120484d(this.f44118b, hVar.f44118b) && C41536l.m120484d(this.f44119c, hVar.f44119c) && C41536l.m120484d(this.f44120d, hVar.f44120d);
    }

    public int hashCode() {
        Integer num = this.f44117a;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f44118b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        C15541f fVar = this.f44119c;
        if (fVar != null) {
            i = fVar.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.f44120d.hashCode();
    }

    public String toString() {
        Integer num = this.f44117a;
        String str = this.f44118b;
        C15541f fVar = this.f44119c;
        List list = this.f44120d;
        return "OccupationData(selectedOccupationId=" + num + ", organizationName=" + str + ", jobPosition=" + fVar + ", occupations=" + list + ")";
    }
}
