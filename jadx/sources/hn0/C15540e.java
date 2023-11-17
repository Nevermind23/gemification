package hn0;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C41536l;

/* renamed from: hn0.e */
public final class C15540e {

    /* renamed from: a */
    private final Set f44109a;

    /* renamed from: b */
    private final String f44110b;

    /* renamed from: c */
    private final List f44111c;

    public C15540e(Set set, String str, List list) {
        C41536l.m120489i(set, "selectedSources");
        C41536l.m120489i(str, "note");
        C41536l.m120489i(list, "incomeSources");
        this.f44109a = set;
        this.f44110b = str;
        this.f44111c = list;
    }

    /* renamed from: a */
    public final List mo42675a() {
        return this.f44111c;
    }

    /* renamed from: b */
    public final String mo42676b() {
        return this.f44110b;
    }

    /* renamed from: c */
    public final Set mo42677c() {
        return this.f44109a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15540e)) {
            return false;
        }
        C15540e eVar = (C15540e) obj;
        return C41536l.m120484d(this.f44109a, eVar.f44109a) && C41536l.m120484d(this.f44110b, eVar.f44110b) && C41536l.m120484d(this.f44111c, eVar.f44111c);
    }

    public int hashCode() {
        return (((this.f44109a.hashCode() * 31) + this.f44110b.hashCode()) * 31) + this.f44111c.hashCode();
    }

    public String toString() {
        Set set = this.f44109a;
        String str = this.f44110b;
        List list = this.f44111c;
        return "IncomeSourceData(selectedSources=" + set + ", note=" + str + ", incomeSources=" + list + ")";
    }
}
