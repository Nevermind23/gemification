package l50;

import kotlin.jvm.internal.C41536l;

/* renamed from: l50.p */
public final class C25836p {

    /* renamed from: a */
    private final C25835o f65735a;

    public C25836p(C25835o oVar) {
        C41536l.m120489i(oVar, "accounts");
        this.f65735a = oVar;
    }

    /* renamed from: a */
    public final C25835o mo64561a() {
        return this.f65735a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25836p) && C41536l.m120484d(this.f65735a, ((C25836p) obj).f65735a);
    }

    public int hashCode() {
        return this.f65735a.hashCode();
    }

    public String toString() {
        C25835o oVar = this.f65735a;
        return "AccountsWithCardsAndDetailsUIModel(accounts=" + oVar + ")";
    }
}
