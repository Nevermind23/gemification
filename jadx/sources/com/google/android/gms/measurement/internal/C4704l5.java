package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.C3943d;
import com.google.android.gms.common.C3948e;
import com.google.android.gms.internal.measurement.C4103b;
import com.google.android.gms.internal.measurement.C4122c1;
import com.google.android.gms.internal.measurement.zzd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import p182n6.C7264i;
import p248s7.C8251e;
import p248s7.C8263q;
import p260t6.C8416r;

/* renamed from: com.google.android.gms.measurement.internal.l5 */
public final class C4704l5 extends C8251e {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C4719m9 f14588b;

    /* renamed from: c */
    private Boolean f14589c;

    /* renamed from: d */
    private String f14590d = null;

    public C4704l5(C4719m9 m9Var, String str) {
        C7264i.m27902k(m9Var);
        this.f14588b = m9Var;
    }

    /* renamed from: D2 */
    private final void m17876D2(zzq zzq, boolean z) {
        C7264i.m27902k(zzq);
        C7264i.m27898g(zzq.f15117d);
        m17877E2(zzq.f15117d, false);
        this.f14588b.mo14589h0().mo14805M(zzq.f15118e, zzq.f15133t);
    }

    /* renamed from: E2 */
    private final void m17877E2(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.f14589c == null) {
                        if (!"com.google.android.gms".equals(this.f14590d) && !C8416r.m31577a(this.f14588b.mo14550c(), Binder.getCallingUid())) {
                            if (!C3948e.m14975a(this.f14588b.mo14550c()).mo12172c(Binder.getCallingUid())) {
                                z2 = false;
                                this.f14589c = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.f14589c = Boolean.valueOf(z2);
                    }
                    if (this.f14589c.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.f14588b.mo14551d().mo14675r().mo14616b("Measurement Service called with invalid calling package. appId", C4746p3.m18094z(str));
                    throw e;
                }
            }
            if (this.f14590d == null && C3943d.m14969l(this.f14588b.mo14550c(), Binder.getCallingUid(), str)) {
                this.f14590d = str;
            }
            if (!str.equals(this.f14590d)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.f14588b.mo14551d().mo14675r().mo14615a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    /* renamed from: x */
    private final void m17879x(zzaw zzaw, zzq zzq) {
        this.f14588b.mo14584e();
        this.f14588b.mo14592j(zzaw, zzq);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A2 */
    public final void mo14536A2(zzaw zzaw, zzq zzq) {
        C4122c1 c1Var;
        if (!this.f14588b.mo14581a0().mo14621C(zzq.f15117d)) {
            m17879x(zzaw, zzq);
            return;
        }
        this.f14588b.mo14551d().mo14679v().mo14616b("EES config found for", zzq.f15117d);
        C4725n4 a0 = this.f14588b.mo14581a0();
        String str = zzq.f15117d;
        if (TextUtils.isEmpty(str)) {
            c1Var = null;
        } else {
            c1Var = (C4122c1) a0.f14668j.get(str);
        }
        if (c1Var != null) {
            try {
                Map I = this.f14588b.mo14587g0().mo14662I(zzaw.f15104e.mo14991x(), true);
                String a = C8263q.m31094a(zzaw.f15103d);
                if (a == null) {
                    a = zzaw.f15103d;
                }
                if (c1Var.mo12970e(new C4103b(a, zzaw.f15106g, I))) {
                    if (c1Var.mo12972g()) {
                        this.f14588b.mo14551d().mo14679v().mo14616b("EES edited event", zzaw.f15103d);
                        m17879x(this.f14588b.mo14587g0().mo14656A(c1Var.mo12966a().mo12959b()), zzq);
                    } else {
                        m17879x(zzaw, zzq);
                    }
                    if (c1Var.mo12971f()) {
                        for (C4103b bVar : c1Var.mo12966a().mo12960c()) {
                            this.f14588b.mo14551d().mo14679v().mo14616b("EES logging created event", bVar.mo12883d());
                            m17879x(this.f14588b.mo14587g0().mo14656A(bVar), zzq);
                        }
                        return;
                    }
                    return;
                }
            } catch (zzd unused) {
                this.f14588b.mo14551d().mo14675r().mo14617c("EES error. appId, eventName", zzq.f15118e, zzaw.f15103d);
            }
            this.f14588b.mo14551d().mo14679v().mo14616b("EES was not applied to event", zzaw.f15103d);
            m17879x(zzaw, zzq);
            return;
        }
        this.f14588b.mo14551d().mo14679v().mo14616b("EES not loaded for", zzq.f15117d);
        m17879x(zzaw, zzq);
    }

    /* renamed from: B1 */
    public final List mo14421B1(String str, String str2, String str3) {
        m17877E2(str, true);
        try {
            return (List) this.f14588b.mo14552f().mo14773s(new C4579a5(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f14588b.mo14551d().mo14675r().mo14616b("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B2 */
    public final /* synthetic */ void mo14537B2(String str, Bundle bundle) {
        C4687k W = this.f14588b.mo14577W();
        W.mo14554h();
        W.mo14301i();
        byte[] g = W.f15082b.mo14587g0().mo14657B(new C4742p(W.f14613a, "", str, "dep", 0, 0, bundle)).mo13041g();
        W.f14613a.mo14551d().mo14679v().mo14617c("Saving default event parameters, appId, data size", W.f14613a.mo14847D().mo14528d(str), Integer.valueOf(g.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", g);
        try {
            if (W.mo14495P().insertWithOnConflict("default_event_params", (String) null, contentValues, 5) == -1) {
                W.f14613a.mo14551d().mo14675r().mo14616b("Failed to insert default event parameters (got -1). appId", C4746p3.m18094z(str));
            }
        } catch (SQLiteException e) {
            W.f14613a.mo14551d().mo14675r().mo14617c("Error storing default event parameters. appId", C4746p3.m18094z(str), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C2 */
    public final void mo14538C2(Runnable runnable) {
        C7264i.m27902k(runnable);
        if (this.f14588b.mo14552f().mo14771C()) {
            runnable.run();
        } else {
            this.f14588b.mo14552f().mo14776z(runnable);
        }
    }

    /* renamed from: D0 */
    public final void mo14422D0(zzq zzq) {
        C7264i.m27898g(zzq.f15117d);
        C7264i.m27902k(zzq.f15138y);
        C4615d5 d5Var = new C4615d5(this, zzq);
        C7264i.m27902k(d5Var);
        if (this.f14588b.mo14552f().mo14771C()) {
            d5Var.run();
        } else {
            this.f14588b.mo14552f().mo14770A(d5Var);
        }
    }

    /* renamed from: F */
    public final void mo14423F(zzlj zzlj, zzq zzq) {
        C7264i.m27902k(zzlj);
        m17876D2(zzq, false);
        mo14538C2(new C4660h5(this, zzlj, zzq));
    }

    /* renamed from: I0 */
    public final List mo14424I0(String str, String str2, boolean z, zzq zzq) {
        m17876D2(zzq, false);
        String str3 = zzq.f15117d;
        C7264i.m27902k(str3);
        try {
            List<C4763q9> list = (List) this.f14588b.mo14552f().mo14773s(new C4835x4(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C4763q9 q9Var : list) {
                if (z || !C4785s9.m18219Y(q9Var.f14804c)) {
                    arrayList.add(new zzlj(q9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f14588b.mo14551d().mo14675r().mo14617c("Failed to query user properties. appId", C4746p3.m18094z(zzq.f15117d), e);
            return Collections.emptyList();
        }
    }

    /* renamed from: J */
    public final void mo14539J(zzac zzac) {
        C7264i.m27902k(zzac);
        C7264i.m27902k(zzac.f15093f);
        C7264i.m27898g(zzac.f15091d);
        m17877E2(zzac.f15091d, true);
        mo14538C2(new C4824w4(this, new zzac(zzac)));
    }

    /* renamed from: L */
    public final List mo14540L(zzq zzq, boolean z) {
        m17876D2(zzq, false);
        String str = zzq.f15117d;
        C7264i.m27902k(str);
        try {
            List<C4763q9> list = (List) this.f14588b.mo14552f().mo14773s(new C4671i5(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C4763q9 q9Var : list) {
                if (z || !C4785s9.m18219Y(q9Var.f14804c)) {
                    arrayList.add(new zzlj(q9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f14588b.mo14551d().mo14675r().mo14617c("Failed to get user properties. appId", C4746p3.m18094z(zzq.f15117d), e);
            return null;
        }
    }

    /* renamed from: N0 */
    public final void mo14425N0(zzq zzq) {
        C7264i.m27898g(zzq.f15117d);
        m17877E2(zzq.f15117d, false);
        mo14538C2(new C4591b5(this, zzq));
    }

    /* renamed from: W1 */
    public final List mo14426W1(String str, String str2, zzq zzq) {
        m17876D2(zzq, false);
        String str3 = zzq.f15117d;
        C7264i.m27902k(str3);
        try {
            return (List) this.f14588b.mo14552f().mo14773s(new C4857z4(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f14588b.mo14551d().mo14675r().mo14616b("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    /* renamed from: c2 */
    public final void mo14541c2(zzaw zzaw, String str, String str2) {
        C7264i.m27902k(zzaw);
        C7264i.m27898g(str);
        m17877E2(str, true);
        mo14538C2(new C4638f5(this, zzaw, str));
    }

    /* renamed from: i1 */
    public final void mo14427i1(zzq zzq) {
        m17876D2(zzq, false);
        mo14538C2(new C4603c5(this, zzq));
    }

    /* renamed from: l1 */
    public final void mo14428l1(Bundle bundle, zzq zzq) {
        m17876D2(zzq, false);
        String str = zzq.f15117d;
        C7264i.m27902k(str);
        mo14538C2(new C4802u4(this, str, bundle));
    }

    /* renamed from: o0 */
    public final void mo14429o0(zzaw zzaw, zzq zzq) {
        C7264i.m27902k(zzaw);
        m17876D2(zzq, false);
        mo14538C2(new C4627e5(this, zzaw, zzq));
    }

    /* renamed from: o1 */
    public final List mo14430o1(String str, String str2, String str3, boolean z) {
        m17877E2(str, true);
        try {
            List<C4763q9> list = (List) this.f14588b.mo14552f().mo14773s(new C4846y4(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C4763q9 q9Var : list) {
                if (z || !C4785s9.m18219Y(q9Var.f14804c)) {
                    arrayList.add(new zzlj(q9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f14588b.mo14551d().mo14675r().mo14617c("Failed to get user properties as. appId", C4746p3.m18094z(str), e);
            return Collections.emptyList();
        }
    }

    /* renamed from: q0 */
    public final void mo14431q0(zzq zzq) {
        m17876D2(zzq, false);
        mo14538C2(new C4682j5(this, zzq));
    }

    /* renamed from: q2 */
    public final void mo14432q2(zzac zzac, zzq zzq) {
        C7264i.m27902k(zzac);
        C7264i.m27902k(zzac.f15093f);
        m17876D2(zzq, false);
        zzac zzac2 = new zzac(zzac);
        zzac2.f15091d = zzq.f15117d;
        mo14538C2(new C4813v4(this, zzac2, zzq));
    }

    /* renamed from: t1 */
    public final byte[] mo14433t1(zzaw zzaw, String str) {
        C7264i.m27898g(str);
        C7264i.m27902k(zzaw);
        m17877E2(str, true);
        this.f14588b.mo14551d().mo14674q().mo14616b("Log and bundle. event", this.f14588b.mo14578X().mo14528d(zzaw.f15103d));
        long b = this.f14588b.mo14548a().mo23595b() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f14588b.mo14552f().mo14774t(new C4649g5(this, zzaw, str)).get();
            if (bArr == null) {
                this.f14588b.mo14551d().mo14675r().mo14616b("Log and bundle returned null. appId", C4746p3.m18094z(str));
                bArr = new byte[0];
            }
            this.f14588b.mo14551d().mo14674q().mo14618d("Log and bundle processed. event, size, time_ms", this.f14588b.mo14578X().mo14528d(zzaw.f15103d), Integer.valueOf(bArr.length), Long.valueOf((this.f14588b.mo14548a().mo23595b() / 1000000) - b));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.f14588b.mo14551d().mo14675r().mo14618d("Failed to log and bundle. appId, event, error", C4746p3.m18094z(str), this.f14588b.mo14578X().mo14528d(zzaw.f15103d), e);
            return null;
        }
    }

    /* renamed from: v0 */
    public final void mo14434v0(long j, String str, String str2, String str3) {
        mo14538C2(new C4693k5(this, str2, str3, str, j));
    }

    /* renamed from: w1 */
    public final String mo14435w1(zzq zzq) {
        m17876D2(zzq, false);
        return this.f14588b.mo14593j0(zzq);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final zzaw mo14542y(zzaw zzaw, zzq zzq) {
        zzau zzau;
        if (!(!"_cmp".equals(zzaw.f15103d) || (zzau = zzaw.f15104e) == null || zzau.mo14989v() == 0)) {
            String s0 = zzaw.f15104e.mo14987s0("_cis");
            if ("referrer broadcast".equals(s0) || "referrer API".equals(s0)) {
                this.f14588b.mo14551d().mo14678u().mo14616b("Event has been filtered ", zzaw.toString());
                return new zzaw("_cmpx", zzaw.f15104e, zzaw.f15105f, zzaw.f15106g);
            }
        }
        return zzaw;
    }
}
