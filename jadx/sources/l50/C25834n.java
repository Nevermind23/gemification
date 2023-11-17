package l50;

import kotlin.jvm.internal.C41536l;

/* renamed from: l50.n */
public final class C25834n {

    /* renamed from: a */
    private final C25833m f65731a;

    public C25834n(C25833m mVar) {
        C41536l.m120489i(mVar, "accounts");
        this.f65731a = mVar;
    }

    /* renamed from: a */
    public final C25833m mo64551a() {
        return this.f65731a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25834n) && C41536l.m120484d(this.f65731a, ((C25834n) obj).f65731a);
    }

    public int hashCode() {
        return this.f65731a.hashCode();
    }

    public String toString() {
        C25833m mVar = this.f65731a;
        return "AccountsUIModel(accounts=" + mVar + ")";
    }
}
