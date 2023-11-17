package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.collection.ArrayMap;
import java.util.Map;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.measurement.internal.x1 */
public final class C4832x1 extends C4844y2 {

    /* renamed from: b */
    private final Map f15002b = new ArrayMap();

    /* renamed from: c */
    private final Map f15003c = new ArrayMap();

    /* renamed from: d */
    private long f15004d;

    public C4832x1(C4791t4 t4Var) {
        super(t4Var);
    }

    /* renamed from: i */
    static /* synthetic */ void m18418i(C4832x1 x1Var, String str, long j) {
        x1Var.mo14554h();
        C7264i.m27898g(str);
        if (x1Var.f15003c.isEmpty()) {
            x1Var.f15004d = j;
        }
        Integer num = (Integer) x1Var.f15003c.get(str);
        if (num != null) {
            x1Var.f15003c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (x1Var.f15003c.size() >= 100) {
            x1Var.f14613a.mo14551d().mo14680w().mo14615a("Too many ads visible");
        } else {
            x1Var.f15003c.put(str, 1);
            x1Var.f15002b.put(str, Long.valueOf(j));
        }
    }

    /* renamed from: j */
    static /* synthetic */ void m18419j(C4832x1 x1Var, String str, long j) {
        x1Var.mo14554h();
        C7264i.m27898g(str);
        Integer num = (Integer) x1Var.f15003c.get(str);
        if (num != null) {
            C4848y6 s = x1Var.f14613a.mo14853K().mo14369s(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                x1Var.f15003c.remove(str);
                Long l = (Long) x1Var.f15002b.get(str);
                if (l == null) {
                    x1Var.f14613a.mo14551d().mo14675r().mo14615a("First ad unit exposure time was never set");
                } else {
                    x1Var.f15002b.remove(str);
                    x1Var.m18422p(str, j - l.longValue(), s);
                }
                if (x1Var.f15003c.isEmpty()) {
                    long j2 = x1Var.f15004d;
                    if (j2 == 0) {
                        x1Var.f14613a.mo14551d().mo14675r().mo14615a("First ad exposure time was never set");
                        return;
                    }
                    x1Var.m18421o(j - j2, s);
                    x1Var.f15004d = 0;
                    return;
                }
                return;
            }
            x1Var.f15003c.put(str, Integer.valueOf(intValue));
            return;
        }
        x1Var.f14613a.mo14551d().mo14675r().mo14616b("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    /* renamed from: o */
    private final void m18421o(long j, C4848y6 y6Var) {
        if (y6Var == null) {
            this.f14613a.mo14551d().mo14679v().mo14615a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            this.f14613a.mo14551d().mo14679v().mo14616b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            C4785s9.m18233y(y6Var, bundle, true);
            this.f14613a.mo14851I().mo14910u("am", "_xa", bundle);
        }
    }

    /* renamed from: p */
    private final void m18422p(String str, long j, C4848y6 y6Var) {
        if (y6Var == null) {
            this.f14613a.mo14551d().mo14679v().mo14615a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            this.f14613a.mo14551d().mo14679v().mo14616b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            C4785s9.m18233y(y6Var, bundle, true);
            this.f14613a.mo14851I().mo14910u("am", "_xu", bundle);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final void m18423q(long j) {
        for (String put : this.f15002b.keySet()) {
            this.f15002b.put(put, Long.valueOf(j));
        }
        if (!this.f15002b.isEmpty()) {
            this.f15004d = j;
        }
    }

    /* renamed from: l */
    public final void mo14951l(String str, long j) {
        if (str == null || str.length() == 0) {
            this.f14613a.mo14551d().mo14675r().mo14615a("Ad unit id must be a non-empty string");
        } else {
            this.f14613a.mo14552f().mo14776z(new C4573a(this, str, j));
        }
    }

    /* renamed from: m */
    public final void mo14952m(String str, long j) {
        if (str == null || str.length() == 0) {
            this.f14613a.mo14551d().mo14675r().mo14615a("Ad unit id must be a non-empty string");
        } else {
            this.f14613a.mo14552f().mo14776z(new C4808v(this, str, j));
        }
    }

    /* renamed from: n */
    public final void mo14953n(long j) {
        C4848y6 s = this.f14613a.mo14853K().mo14369s(false);
        for (String str : this.f15002b.keySet()) {
            m18422p(str, j - ((Long) this.f15002b.get(str)).longValue(), s);
        }
        if (!this.f15002b.isEmpty()) {
            m18421o(j - this.f15004d, s);
        }
        m18423q(j);
    }
}
