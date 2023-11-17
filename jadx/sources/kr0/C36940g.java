package kr0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jr0.C36783a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: kr0.g */
public final class C36940g {

    /* renamed from: a */
    private final int f89057a;

    /* renamed from: b */
    private final ArrayList f89058b;

    /* renamed from: c */
    private final ArrayList f89059c;

    public C36940g(int i, ArrayList arrayList, ArrayList arrayList2) {
        C41536l.m120489i(arrayList, "myRealEstates");
        C41536l.m120489i(arrayList2, "otherRealEstates");
        this.f89057a = i;
        this.f89058b = arrayList;
        this.f89059c = arrayList2;
    }

    /* renamed from: b */
    public static /* synthetic */ C36940g m109393b(C36940g gVar, int i, ArrayList arrayList, ArrayList arrayList2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = gVar.f89057a;
        }
        if ((i2 & 2) != 0) {
            arrayList = gVar.f89058b;
        }
        if ((i2 & 4) != 0) {
            arrayList2 = gVar.f89059c;
        }
        return gVar.mo89896a(i, arrayList, arrayList2);
    }

    /* renamed from: a */
    public final C36940g mo89896a(int i, ArrayList arrayList, ArrayList arrayList2) {
        C41536l.m120489i(arrayList, "myRealEstates");
        C41536l.m120489i(arrayList2, "otherRealEstates");
        return new C36940g(i, arrayList, arrayList2);
    }

    /* renamed from: c */
    public final ArrayList mo89897c() {
        return this.f89058b;
    }

    /* renamed from: d */
    public final ArrayList mo89898d() {
        return this.f89059c;
    }

    /* renamed from: e */
    public final int mo89899e() {
        return this.f89057a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36940g)) {
            return false;
        }
        C36940g gVar = (C36940g) obj;
        return this.f89057a == gVar.f89057a && C41536l.m120484d(this.f89058b, gVar.f89058b) && C41536l.m120484d(this.f89059c, gVar.f89059c);
    }

    /* renamed from: f */
    public final List mo89901f() {
        boolean z;
        List m0 = C41358y.m120023m0(this.f89058b, this.f89059c);
        ArrayList arrayList = new ArrayList();
        for (Object next : m0) {
            C36783a aVar = (C36783a) next;
            if (!aVar.mo89664d() || (aVar instanceof C36783a.C36784a)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public final boolean mo89902g() {
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList arrayList = this.f89058b;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C36783a) it.next()).mo89664d()) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        if (z) {
            return true;
        }
        ArrayList arrayList2 = this.f89059c;
        if (!(arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C36783a aVar = (C36783a) it2.next();
                if (!aVar.mo89664d() || (aVar instanceof C36783a.C36784a)) {
                    z3 = false;
                    continue;
                } else {
                    z3 = true;
                    continue;
                }
                if (z3) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        if (z2) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo89903h() {
        return this.f89057a != -1;
    }

    public int hashCode() {
        return (((this.f89057a * 31) + this.f89058b.hashCode()) * 31) + this.f89059c.hashCode();
    }

    public String toString() {
        int i = this.f89057a;
        ArrayList arrayList = this.f89058b;
        ArrayList arrayList2 = this.f89059c;
        return "SecuredLoanInput(selectedPurpose=" + i + ", myRealEstates=" + arrayList + ", otherRealEstates=" + arrayList2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C36940g(int i, ArrayList arrayList, ArrayList arrayList2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? new ArrayList() : arrayList, (i2 & 4) != 0 ? C41341q.m119903f(new C36783a.C36784a(false, 1, (DefaultConstructorMarker) null)) : arrayList2);
    }
}
