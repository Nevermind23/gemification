package ny0;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ny0.i */
public final class C37508i {

    /* renamed from: a */
    private final C37503e f90213a;

    /* renamed from: b */
    private final List f90214b;

    /* renamed from: c */
    private final C37503e f90215c;

    /* renamed from: d */
    private final List f90216d;

    /* renamed from: e */
    private final List f90217e;

    /* renamed from: f */
    private final List f90218f;

    public C37508i(C37503e eVar, List list, C37503e eVar2, List list2) {
        C41536l.m120489i(eVar, "summary");
        C41536l.m120489i(list, "amountSums");
        C41536l.m120489i(list2, "depositsAndBonds");
        this.f90213a = eVar;
        this.f90214b = list;
        this.f90215c = eVar2;
        this.f90216d = list2;
        this.f90217e = C41356x.m119982J(list2, C37500b.class);
        this.f90218f = C41356x.m119982J(list2, C37499a.class);
    }

    /* renamed from: a */
    public final C37499a mo90720a(long j) {
        Object obj;
        boolean z;
        Iterator it = this.f90218f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C37499a) obj).mo90644g() == j) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return (C37499a) obj;
    }

    /* renamed from: b */
    public final C37500b mo90721b(long j) {
        Object obj;
        boolean z;
        Iterator it = this.f90217e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C37500b) obj).mo90668d() == j) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return (C37500b) obj;
    }

    /* renamed from: c */
    public final List mo90722c() {
        return this.f90218f;
    }

    /* renamed from: d */
    public final List mo90723d() {
        return this.f90217e;
    }

    /* renamed from: e */
    public final List mo90724e() {
        return this.f90216d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37508i)) {
            return false;
        }
        C37508i iVar = (C37508i) obj;
        return C41536l.m120484d(this.f90213a, iVar.f90213a) && C41536l.m120484d(this.f90214b, iVar.f90214b) && C41536l.m120484d(this.f90215c, iVar.f90215c) && C41536l.m120484d(this.f90216d, iVar.f90216d);
    }

    /* renamed from: f */
    public final C37503e mo90726f() {
        return this.f90213a;
    }

    public int hashCode() {
        int hashCode = ((this.f90213a.hashCode() * 31) + this.f90214b.hashCode()) * 31;
        C37503e eVar = this.f90215c;
        return ((hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31) + this.f90216d.hashCode();
    }

    public String toString() {
        C37503e eVar = this.f90213a;
        List list = this.f90214b;
        C37503e eVar2 = this.f90215c;
        List list2 = this.f90216d;
        return "DepositsAndBonds(summary=" + eVar + ", amountSums=" + list + ", depositsAndBondsSummary=" + eVar2 + ", depositsAndBonds=" + list2 + ")";
    }
}
