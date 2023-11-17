package z11;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.designsystem.components.accountselector.AccountSelectorItemView;

/* renamed from: z11.b */
public final class C40140b {

    /* renamed from: a */
    private final long f95390a;

    /* renamed from: b */
    private final AccountSelectorItemView.C13140a f95391b;

    public C40140b(long j, AccountSelectorItemView.C13140a aVar) {
        C41536l.m120489i(aVar, "data");
        this.f95390a = j;
        this.f95391b = aVar;
    }

    /* renamed from: a */
    public final AccountSelectorItemView.C13140a mo94069a() {
        return this.f95391b;
    }

    /* renamed from: b */
    public final long mo94070b() {
        return this.f95390a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40140b)) {
            return false;
        }
        C40140b bVar = (C40140b) obj;
        return this.f95390a == bVar.f95390a && C41536l.m120484d(this.f95391b, bVar.f95391b);
    }

    public int hashCode() {
        return (C7397t.m28148a(this.f95390a) * 31) + this.f95391b.hashCode();
    }

    public String toString() {
        long j = this.f95390a;
        AccountSelectorItemView.C13140a aVar = this.f95391b;
        return "SelectorAccountData(id=" + j + ", data=" + aVar + ")";
    }
}
