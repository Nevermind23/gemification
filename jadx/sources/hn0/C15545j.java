package hn0;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C41536l;

/* renamed from: hn0.j */
public final class C15545j {

    /* renamed from: a */
    private final Set f44124a;

    /* renamed from: b */
    private final String f44125b;

    /* renamed from: c */
    private final List f44126c;

    public C15545j(Set set, String str, List list) {
        C41536l.m120489i(set, "selectedSources");
        C41536l.m120489i(str, "note");
        C41536l.m120489i(list, "propertySources");
        this.f44124a = set;
        this.f44125b = str;
        this.f44126c = list;
    }

    /* renamed from: a */
    public final String mo42707a() {
        return this.f44125b;
    }

    /* renamed from: b */
    public final List mo42708b() {
        return this.f44126c;
    }

    /* renamed from: c */
    public final Set mo42709c() {
        return this.f44124a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15545j)) {
            return false;
        }
        C15545j jVar = (C15545j) obj;
        return C41536l.m120484d(this.f44124a, jVar.f44124a) && C41536l.m120484d(this.f44125b, jVar.f44125b) && C41536l.m120484d(this.f44126c, jVar.f44126c);
    }

    public int hashCode() {
        return (((this.f44124a.hashCode() * 31) + this.f44125b.hashCode()) * 31) + this.f44126c.hashCode();
    }

    public String toString() {
        Set set = this.f44124a;
        String str = this.f44125b;
        List list = this.f44126c;
        return "PropertySourceData(selectedSources=" + set + ", note=" + str + ", propertySources=" + list + ")";
    }
}
