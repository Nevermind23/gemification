package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.q4 */
public final class C4363q4 {

    /* renamed from: a */
    public final C4363q4 f13609a;

    /* renamed from: b */
    final C4492y f13610b;

    /* renamed from: c */
    final Map f13611c = new HashMap();

    /* renamed from: d */
    final Map f13612d = new HashMap();

    public C4363q4(C4363q4 q4Var, C4492y yVar) {
        this.f13609a = q4Var;
        this.f13610b = yVar;
    }

    /* renamed from: a */
    public final C4363q4 mo13483a() {
        return new C4363q4(this, this.f13610b);
    }

    /* renamed from: b */
    public final C4358q mo13484b(C4358q qVar) {
        return this.f13610b.mo13815a(this, qVar);
    }

    /* renamed from: c */
    public final C4358q mo13485c(C4171f fVar) {
        C4358q qVar = C4358q.f13593U2;
        Iterator r = fVar.mo13089r();
        while (r.hasNext()) {
            qVar = this.f13610b.mo13815a(this, fVar.mo13087n(((Integer) r.next()).intValue()));
            if (qVar instanceof C4205h) {
                break;
            }
        }
        return qVar;
    }

    /* renamed from: d */
    public final C4358q mo13486d(String str) {
        if (this.f13611c.containsKey(str)) {
            return (C4358q) this.f13611c.get(str);
        }
        C4363q4 q4Var = this.f13609a;
        if (q4Var != null) {
            return q4Var.mo13486d(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", new Object[]{str}));
    }

    /* renamed from: e */
    public final void mo13487e(String str, C4358q qVar) {
        if (!this.f13612d.containsKey(str)) {
            if (qVar == null) {
                this.f13611c.remove(str);
            } else {
                this.f13611c.put(str, qVar);
            }
        }
    }

    /* renamed from: f */
    public final void mo13488f(String str, C4358q qVar) {
        mo13487e(str, qVar);
        this.f13612d.put(str, Boolean.TRUE);
    }

    /* renamed from: g */
    public final void mo13489g(String str, C4358q qVar) {
        C4363q4 q4Var;
        if (!this.f13611c.containsKey(str) && (q4Var = this.f13609a) != null && q4Var.mo13490h(str)) {
            this.f13609a.mo13489g(str, qVar);
        } else if (!this.f13612d.containsKey(str)) {
            if (qVar == null) {
                this.f13611c.remove(str);
            } else {
                this.f13611c.put(str, qVar);
            }
        }
    }

    /* renamed from: h */
    public final boolean mo13490h(String str) {
        if (this.f13611c.containsKey(str)) {
            return true;
        }
        C4363q4 q4Var = this.f13609a;
        if (q4Var != null) {
            return q4Var.mo13490h(str);
        }
        return false;
    }
}
