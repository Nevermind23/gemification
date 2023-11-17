package l50;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: l50.o */
public final class C25835o {

    /* renamed from: a */
    private final C25826f f65732a;

    /* renamed from: b */
    private final List f65733b;

    /* renamed from: c */
    private final List f65734c;

    public C25835o(C25826f fVar, List list, List list2) {
        C41536l.m120489i(fVar, "summary");
        C41536l.m120489i(list, "subAccountRealAmountSums");
        C41536l.m120489i(list2, "accounts");
        this.f65732a = fVar;
        this.f65733b = list;
        this.f65734c = list2;
    }

    /* renamed from: a */
    public final List mo64555a() {
        return this.f65734c;
    }

    /* renamed from: b */
    public final List mo64556b() {
        return this.f65733b;
    }

    /* renamed from: c */
    public final C25826f mo64557c() {
        return this.f65732a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25835o)) {
            return false;
        }
        C25835o oVar = (C25835o) obj;
        return C41536l.m120484d(this.f65732a, oVar.f65732a) && C41536l.m120484d(this.f65733b, oVar.f65733b) && C41536l.m120484d(this.f65734c, oVar.f65734c);
    }

    public int hashCode() {
        return (((this.f65732a.hashCode() * 31) + this.f65733b.hashCode()) * 31) + this.f65734c.hashCode();
    }

    public String toString() {
        C25826f fVar = this.f65732a;
        List list = this.f65733b;
        List list2 = this.f65734c;
        return "AccountsWitchCardsAccountsUIModel(summary=" + fVar + ", subAccountRealAmountSums=" + list + ", accounts=" + list2 + ")";
    }
}
