package p863pw;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;

/* renamed from: pw.k */
public final class C27633k {

    /* renamed from: a */
    private final C27632j f70646a;

    /* renamed from: b */
    private final List f70647b;

    /* renamed from: c */
    private final List f70648c;

    /* renamed from: d */
    private final Map f70649d;

    public C27633k(C27632j jVar, List list, List list2, Map map) {
        C41536l.m120489i(jVar, "accounts");
        C41536l.m120489i(list, "details");
        C41536l.m120489i(list2, "overdraftParams");
        C41536l.m120489i(map, "cards");
        this.f70646a = jVar;
        this.f70647b = list;
        this.f70648c = list2;
        this.f70649d = map;
    }

    /* renamed from: a */
    public final C27632j mo67087a() {
        return this.f70646a;
    }

    /* renamed from: b */
    public final Map mo67088b() {
        return this.f70649d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27633k)) {
            return false;
        }
        C27633k kVar = (C27633k) obj;
        return C41536l.m120484d(this.f70646a, kVar.f70646a) && C41536l.m120484d(this.f70647b, kVar.f70647b) && C41536l.m120484d(this.f70648c, kVar.f70648c) && C41536l.m120484d(this.f70649d, kVar.f70649d);
    }

    public int hashCode() {
        return (((((this.f70646a.hashCode() * 31) + this.f70647b.hashCode()) * 31) + this.f70648c.hashCode()) * 31) + this.f70649d.hashCode();
    }

    public String toString() {
        C27632j jVar = this.f70646a;
        List list = this.f70647b;
        List list2 = this.f70648c;
        Map map = this.f70649d;
        return "AccountsWithCards(accounts=" + jVar + ", details=" + list + ", overdraftParams=" + list2 + ", cards=" + map + ")";
    }
}
