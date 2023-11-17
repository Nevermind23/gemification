package qb0;

import java.util.ArrayList;
import ka0.C25695d;
import kotlin.jvm.internal.C41536l;

/* renamed from: qb0.a */
public final class C27766a {

    /* renamed from: a */
    private final ArrayList f70862a;

    /* renamed from: b */
    private final C25695d f70863b;

    /* renamed from: c */
    private final boolean f70864c;

    public C27766a(ArrayList arrayList, C25695d dVar, boolean z) {
        C41536l.m120489i(arrayList, "deposits");
        C41536l.m120489i(dVar, "selectedDepositType");
        this.f70862a = arrayList;
        this.f70863b = dVar;
        this.f70864c = z;
    }

    /* renamed from: a */
    public final ArrayList mo67312a() {
        return this.f70862a;
    }

    /* renamed from: b */
    public final boolean mo67313b() {
        return this.f70864c;
    }

    /* renamed from: c */
    public final C25695d mo67314c() {
        return this.f70863b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27766a)) {
            return false;
        }
        C27766a aVar = (C27766a) obj;
        return C41536l.m120484d(this.f70862a, aVar.f70862a) && this.f70863b == aVar.f70863b && this.f70864c == aVar.f70864c;
    }

    public int hashCode() {
        int hashCode = ((this.f70862a.hashCode() * 31) + this.f70863b.hashCode()) * 31;
        boolean z = this.f70864c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        ArrayList arrayList = this.f70862a;
        C25695d dVar = this.f70863b;
        boolean z = this.f70864c;
        return "DepositApplicationNavConfig(deposits=" + arrayList + ", selectedDepositType=" + dVar + ", finishActivity=" + z + ")";
    }
}
