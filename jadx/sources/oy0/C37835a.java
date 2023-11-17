package oy0;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: oy0.a */
public final class C37835a {

    /* renamed from: a */
    private final long f90864a;

    /* renamed from: b */
    private final long f90865b;

    /* renamed from: c */
    private final String f90866c;

    /* renamed from: d */
    private final String f90867d;

    /* renamed from: e */
    private final String f90868e;

    public C37835a(long j, long j2, String str, String str2, String str3) {
        C41536l.m120489i(str, "ccy");
        C41536l.m120489i(str2, "acctNo");
        C41536l.m120489i(str3, "acctDesc");
        this.f90864a = j;
        this.f90865b = j2;
        this.f90866c = str;
        this.f90867d = str2;
        this.f90868e = str3;
    }

    /* renamed from: a */
    public final String mo91165a() {
        return this.f90868e;
    }

    /* renamed from: b */
    public final long mo91166b() {
        return this.f90865b;
    }

    /* renamed from: c */
    public final String mo91167c() {
        return this.f90867d;
    }

    /* renamed from: d */
    public final String mo91168d() {
        return this.f90866c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37835a)) {
            return false;
        }
        C37835a aVar = (C37835a) obj;
        return this.f90864a == aVar.f90864a && this.f90865b == aVar.f90865b && C41536l.m120484d(this.f90866c, aVar.f90866c) && C41536l.m120484d(this.f90867d, aVar.f90867d) && C41536l.m120484d(this.f90868e, aVar.f90868e);
    }

    public int hashCode() {
        return (((((((C7397t.m28148a(this.f90864a) * 31) + C7397t.m28148a(this.f90865b)) * 31) + this.f90866c.hashCode()) * 31) + this.f90867d.hashCode()) * 31) + this.f90868e.hashCode();
    }

    public String toString() {
        long j = this.f90864a;
        long j2 = this.f90865b;
        String str = this.f90866c;
        String str2 = this.f90867d;
        String str3 = this.f90868e;
        return "DepositBreakDestinationAccount(clientKey=" + j + ", acctKey=" + j2 + ", ccy=" + str + ", acctNo=" + str2 + ", acctDesc=" + str3 + ")";
    }
}
