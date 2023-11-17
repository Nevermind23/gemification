package l70;

import kotlin.jvm.internal.C41536l;
import m70.C26156i;
import o70.C26766e;

/* renamed from: l70.a */
public final class C25846a {

    /* renamed from: a */
    private final C26156i f65814a;

    /* renamed from: b */
    private final C26766e f65815b;

    public C25846a(C26156i iVar, C26766e eVar) {
        C41536l.m120489i(iVar, "accounts");
        C41536l.m120489i(eVar, "cards");
        this.f65814a = iVar;
        this.f65815b = eVar;
    }

    /* renamed from: a */
    public final C26156i mo64628a() {
        return this.f65814a;
    }

    /* renamed from: b */
    public final C26766e mo64629b() {
        return this.f65815b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25846a)) {
            return false;
        }
        C25846a aVar = (C25846a) obj;
        return C41536l.m120484d(this.f65814a, aVar.f65814a) && C41536l.m120484d(this.f65815b, aVar.f65815b);
    }

    public int hashCode() {
        return (this.f65814a.hashCode() * 31) + this.f65815b.hashCode();
    }

    public String toString() {
        C26156i iVar = this.f65814a;
        C26766e eVar = this.f65815b;
        return "AccountsAndCards(accounts=" + iVar + ", cards=" + eVar + ")";
    }
}
