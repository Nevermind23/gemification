package p863pw;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: pw.i */
public final class C27631i {

    /* renamed from: a */
    private final C27632j f70640a;

    /* renamed from: b */
    private final List f70641b;

    /* renamed from: c */
    private final List f70642c;

    public C27631i(C27632j jVar, List list, List list2) {
        C41536l.m120489i(jVar, "accounts");
        C41536l.m120489i(list, "details");
        C41536l.m120489i(list2, "overdraftParams");
        this.f70640a = jVar;
        this.f70641b = list;
        this.f70642c = list2;
    }

    /* renamed from: a */
    public final C27632j mo67075a() {
        return this.f70640a;
    }

    /* renamed from: b */
    public final List mo67076b() {
        return this.f70641b;
    }

    /* renamed from: c */
    public final List mo67077c() {
        return this.f70642c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27631i)) {
            return false;
        }
        C27631i iVar = (C27631i) obj;
        return C41536l.m120484d(this.f70640a, iVar.f70640a) && C41536l.m120484d(this.f70641b, iVar.f70641b) && C41536l.m120484d(this.f70642c, iVar.f70642c);
    }

    public int hashCode() {
        return (((this.f70640a.hashCode() * 31) + this.f70641b.hashCode()) * 31) + this.f70642c.hashCode();
    }

    public String toString() {
        C27632j jVar = this.f70640a;
        List list = this.f70641b;
        List list2 = this.f70642c;
        return "Accounts(accounts=" + jVar + ", details=" + list + ", overdraftParams=" + list2 + ")";
    }
}
