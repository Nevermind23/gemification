package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.n */
public class C4307n implements C4358q, C4290m {

    /* renamed from: d */
    final Map f13476d = new HashMap();

    /* renamed from: a */
    public final List mo13378a() {
        return new ArrayList(this.f13476d.keySet());
    }

    /* renamed from: b */
    public final C4358q mo13077b() {
        C4307n nVar = new C4307n();
        for (Map.Entry entry : this.f13476d.entrySet()) {
            if (entry.getValue() instanceof C4290m) {
                nVar.f13476d.put((String) entry.getKey(), (C4358q) entry.getValue());
            } else {
                nVar.f13476d.put((String) entry.getKey(), ((C4358q) entry.getValue()).mo13077b());
            }
        }
        return nVar;
    }

    /* renamed from: c */
    public final String mo13078c() {
        return "[object Object]";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4307n)) {
            return false;
        }
        return this.f13476d.equals(((C4307n) obj).f13476d);
    }

    /* renamed from: g */
    public final boolean mo13080g(String str) {
        return this.f13476d.containsKey(str);
    }

    public final int hashCode() {
        return this.f13476d.hashCode();
    }

    /* renamed from: i */
    public final void mo13082i(String str, C4358q qVar) {
        if (qVar == null) {
            this.f13476d.remove(str);
        } else {
            this.f13476d.put(str, qVar);
        }
    }

    /* renamed from: j */
    public final C4358q mo13084j(String str) {
        if (this.f13476d.containsKey(str)) {
            return (C4358q) this.f13476d.get(str);
        }
        return C4358q.f13593U2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.f13476d.isEmpty()) {
            for (String str : this.f13476d.keySet()) {
                sb.append(String.format("%s: %s,", new Object[]{str, this.f13476d.get(str)}));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: u */
    public final Double mo13091u() {
        return Double.valueOf(Double.NaN);
    }

    /* renamed from: v */
    public final Boolean mo13092v() {
        return Boolean.TRUE;
    }

    /* renamed from: w */
    public final Iterator mo13093w() {
        return C4256k.m16189b(this.f13476d);
    }

    /* renamed from: x */
    public C4358q mo13094x(String str, C4363q4 q4Var, List list) {
        if ("toString".equals(str)) {
            return new C4426u(toString());
        }
        return C4256k.m16188a(this, new C4426u(str), q4Var, list);
    }
}
