package ec0;

import j31.C36725a;
import kotlin.jvm.internal.C41536l;
import p394dj.C12132a;

/* renamed from: ec0.d */
public final class C20212d {

    /* renamed from: a */
    private final C12132a f54907a;

    /* renamed from: b */
    private final C36725a f54908b;

    public C20212d(C12132a aVar, C36725a aVar2) {
        C41536l.m120489i(aVar, "data");
        this.f54907a = aVar;
        this.f54908b = aVar2;
    }

    /* renamed from: a */
    public final C36725a mo48631a() {
        return this.f54908b;
    }

    /* renamed from: b */
    public final C12132a mo48632b() {
        return this.f54907a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20212d)) {
            return false;
        }
        C20212d dVar = (C20212d) obj;
        return C41536l.m120484d(this.f54907a, dVar.f54907a) && C41536l.m120484d(this.f54908b, dVar.f54908b);
    }

    public int hashCode() {
        int hashCode = this.f54907a.hashCode() * 31;
        C36725a aVar = this.f54908b;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        C12132a aVar = this.f54907a;
        C36725a aVar2 = this.f54908b;
        return "DepositDetailsHeaderItem(data=" + aVar + ", background=" + aVar2 + ")";
    }
}
