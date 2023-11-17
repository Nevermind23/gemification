package p537nm;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: nm.w */
public final class C17106w {

    /* renamed from: a */
    private final long f47899a;

    /* renamed from: b */
    private final String f47900b;

    /* renamed from: c */
    private final String f47901c;

    /* renamed from: d */
    private final Long f47902d;

    /* renamed from: e */
    private final boolean f47903e;

    public C17106w(long j, String str, String str2, Long l, boolean z) {
        C41536l.m120489i(str, "orgNameGe");
        C41536l.m120489i(str2, "orgNameEn");
        this.f47899a = j;
        this.f47900b = str;
        this.f47901c = str2;
        this.f47902d = l;
        this.f47903e = z;
    }

    /* renamed from: a */
    public final Long mo44501a() {
        return this.f47902d;
    }

    /* renamed from: b */
    public final long mo44502b() {
        return this.f47899a;
    }

    /* renamed from: c */
    public final String mo44503c() {
        return this.f47901c;
    }

    /* renamed from: d */
    public final String mo44504d() {
        return this.f47900b;
    }

    /* renamed from: e */
    public final boolean mo44505e() {
        return this.f47903e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17106w)) {
            return false;
        }
        C17106w wVar = (C17106w) obj;
        return this.f47899a == wVar.f47899a && C41536l.m120484d(this.f47900b, wVar.f47900b) && C41536l.m120484d(this.f47901c, wVar.f47901c) && C41536l.m120484d(this.f47902d, wVar.f47902d) && this.f47903e == wVar.f47903e;
    }

    public int hashCode() {
        int a = ((((C7397t.m28148a(this.f47899a) * 31) + this.f47900b.hashCode()) * 31) + this.f47901c.hashCode()) * 31;
        Long l = this.f47902d;
        int hashCode = (a + (l == null ? 0 : l.hashCode())) * 31;
        boolean z = this.f47903e;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        long j = this.f47899a;
        String str = this.f47900b;
        String str2 = this.f47901c;
        Long l = this.f47902d;
        boolean z = this.f47903e;
        return "DebitCardPayrollInfo(orgId=" + j + ", orgNameGe=" + str + ", orgNameEn=" + str2 + ", acctKey=" + l + ", isArmyCard=" + z + ")";
    }
}
