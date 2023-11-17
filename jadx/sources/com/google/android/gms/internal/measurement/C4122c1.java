package com.google.android.gms.internal.measurement;

import com.github.mikephil.charting.utils.Utils;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.c1 */
public final class C4122c1 {

    /* renamed from: a */
    final C4345p3 f13174a;

    /* renamed from: b */
    C4363q4 f13175b;

    /* renamed from: c */
    final C4120c f13176c = new C4120c();

    /* renamed from: d */
    private final C4459vf f13177d = new C4459vf();

    public C4122c1() {
        C4345p3 p3Var = new C4345p3();
        this.f13174a = p3Var;
        this.f13175b = p3Var.f13577b.mo13483a();
        p3Var.f13579d.mo13536a("internal.registerCallback", new C4086a(this));
        p3Var.f13579d.mo13536a("internal.eventLogger", new C4104b0(this));
    }

    /* renamed from: a */
    public final C4120c mo12966a() {
        return this.f13176c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ C4239j mo12967b() {
        return new C4391rf(this.f13177d);
    }

    /* renamed from: c */
    public final void mo12968c(C4262k5 k5Var) {
        C4239j jVar;
        try {
            this.f13175b = this.f13174a.f13577b.mo13483a();
            if (!(this.f13174a.mo13441a(this.f13175b, (C4347p5[]) k5Var.mo13296C().toArray(new C4347p5[0])) instanceof C4205h)) {
                for (C4228i5 i5Var : k5Var.mo13295A().mo13147D()) {
                    List C = i5Var.mo13252C();
                    String B = i5Var.mo13251B();
                    Iterator it = C.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            C4358q a = this.f13174a.mo13441a(this.f13175b, (C4347p5) it.next());
                            if (a instanceof C4307n) {
                                C4363q4 q4Var = this.f13175b;
                                if (!q4Var.mo13490h(B)) {
                                    jVar = null;
                                } else {
                                    C4358q d = q4Var.mo13486d(B);
                                    if (d instanceof C4239j) {
                                        jVar = (C4239j) d;
                                    } else {
                                        throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(B)));
                                    }
                                }
                                if (jVar != null) {
                                    jVar.mo13126a(this.f13175b, Collections.singletonList(a));
                                } else {
                                    throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(B)));
                                }
                            } else {
                                throw new IllegalArgumentException("Invalid rule definition");
                            }
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    /* renamed from: d */
    public final void mo12969d(String str, Callable callable) {
        this.f13174a.f13579d.mo13536a(str, callable);
    }

    /* renamed from: e */
    public final boolean mo12970e(C4103b bVar) {
        try {
            this.f13176c.mo12962d(bVar);
            this.f13174a.f13578c.mo13489g("runtime.counter", new C4222i(Double.valueOf(Utils.DOUBLE_EPSILON)));
            this.f13177d.mo13784b(this.f13175b.mo13483a(), this.f13176c);
            if (mo12972g() || mo12971f()) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    /* renamed from: f */
    public final boolean mo12971f() {
        return !this.f13176c.mo12960c().isEmpty();
    }

    /* renamed from: g */
    public final boolean mo12972g() {
        C4120c cVar = this.f13176c;
        return !cVar.mo12959b().equals(cVar.mo12958a());
    }
}
