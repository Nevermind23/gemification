package ys0;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ys0.c */
public final class C40059c {

    /* renamed from: a */
    private final List f95194a;

    /* renamed from: b */
    private final List f95195b;

    public C40059c(List list, List list2) {
        C41536l.m120489i(list, "accounts");
        C41536l.m120489i(list2, "tariffs");
        this.f95194a = list;
        this.f95195b = list2;
    }

    /* renamed from: a */
    public final List mo93940a() {
        return this.f95194a;
    }

    /* renamed from: b */
    public final List mo93941b() {
        return this.f95195b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40059c)) {
            return false;
        }
        C40059c cVar = (C40059c) obj;
        return C41536l.m120484d(this.f95194a, cVar.f95194a) && C41536l.m120484d(this.f95195b, cVar.f95195b);
    }

    public int hashCode() {
        return (this.f95194a.hashCode() * 31) + this.f95195b.hashCode();
    }

    public String toString() {
        List list = this.f95194a;
        List list2 = this.f95195b;
        return "PiggyBankResources(accounts=" + list + ", tariffs=" + list2 + ")";
    }
}
