package lc0;

import kotlin.jvm.internal.C41536l;
import py0.C38049c;

/* renamed from: lc0.m */
public final class C25928m {

    /* renamed from: a */
    private final C38049c f65957a;

    /* renamed from: b */
    private final int f65958b;

    public C25928m(C38049c cVar, int i) {
        C41536l.m120489i(cVar, "period");
        this.f65957a = cVar;
        this.f65958b = i;
    }

    /* renamed from: a */
    public final int mo64789a() {
        return this.f65958b;
    }

    /* renamed from: b */
    public final C38049c mo64790b() {
        return this.f65957a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25928m)) {
            return false;
        }
        C25928m mVar = (C25928m) obj;
        return C41536l.m120484d(this.f65957a, mVar.f65957a) && this.f65958b == mVar.f65958b;
    }

    public int hashCode() {
        return (this.f65957a.hashCode() * 31) + this.f65958b;
    }

    public String toString() {
        C38049c cVar = this.f65957a;
        int i = this.f65958b;
        return "DepositPeriodUiModel(period=" + cVar + ", initialDepositPeriod=" + i + ")";
    }
}
