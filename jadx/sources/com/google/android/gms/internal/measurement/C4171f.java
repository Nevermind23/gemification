package com.google.android.gms.internal.measurement;

import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.f */
public final class C4171f implements Iterable, C4358q, C4290m {

    /* renamed from: d */
    final SortedMap f13223d;

    /* renamed from: e */
    final Map f13224e;

    public C4171f() {
        this.f13223d = new TreeMap();
        this.f13224e = new TreeMap();
    }

    /* renamed from: A */
    public final void mo13072A() {
        this.f13223d.clear();
    }

    /* renamed from: B */
    public final void mo13073B(int i, C4358q qVar) {
        if (i < 0) {
            throw new IllegalArgumentException("Invalid value index: " + i);
        } else if (i >= mo13086l()) {
            mo13075D(i, qVar);
        } else {
            for (int intValue = ((Integer) this.f13223d.lastKey()).intValue(); intValue >= i; intValue--) {
                SortedMap sortedMap = this.f13223d;
                Integer valueOf = Integer.valueOf(intValue);
                C4358q qVar2 = (C4358q) sortedMap.get(valueOf);
                if (qVar2 != null) {
                    mo13075D(intValue + 1, qVar2);
                    this.f13223d.remove(valueOf);
                }
            }
            mo13075D(i, qVar);
        }
    }

    /* renamed from: C */
    public final void mo13074C(int i) {
        int intValue = ((Integer) this.f13223d.lastKey()).intValue();
        if (i <= intValue && i >= 0) {
            this.f13223d.remove(Integer.valueOf(i));
            if (i == intValue) {
                SortedMap sortedMap = this.f13223d;
                int i2 = i - 1;
                Integer valueOf = Integer.valueOf(i2);
                if (!sortedMap.containsKey(valueOf) && i2 >= 0) {
                    this.f13223d.put(valueOf, C4358q.f13593U2);
                    return;
                }
                return;
            }
            while (true) {
                i++;
                if (i <= ((Integer) this.f13223d.lastKey()).intValue()) {
                    SortedMap sortedMap2 = this.f13223d;
                    Integer valueOf2 = Integer.valueOf(i);
                    C4358q qVar = (C4358q) sortedMap2.get(valueOf2);
                    if (qVar != null) {
                        this.f13223d.put(Integer.valueOf(i - 1), qVar);
                        this.f13223d.remove(valueOf2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: D */
    public final void mo13075D(int i, C4358q qVar) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        } else if (i < 0) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + i);
        } else if (qVar == null) {
            this.f13223d.remove(Integer.valueOf(i));
        } else {
            this.f13223d.put(Integer.valueOf(i), qVar);
        }
    }

    /* renamed from: E */
    public final boolean mo13076E(int i) {
        if (i >= 0 && i <= ((Integer) this.f13223d.lastKey()).intValue()) {
            return this.f13223d.containsKey(Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + i);
    }

    /* renamed from: b */
    public final C4358q mo13077b() {
        C4171f fVar = new C4171f();
        for (Map.Entry entry : this.f13223d.entrySet()) {
            if (entry.getValue() instanceof C4290m) {
                fVar.f13223d.put((Integer) entry.getKey(), (C4358q) entry.getValue());
            } else {
                fVar.f13223d.put((Integer) entry.getKey(), ((C4358q) entry.getValue()).mo13077b());
            }
        }
        return fVar;
    }

    /* renamed from: c */
    public final String mo13078c() {
        return mo13088o(",");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4171f)) {
            return false;
        }
        C4171f fVar = (C4171f) obj;
        if (mo13086l() != fVar.mo13086l()) {
            return false;
        }
        if (this.f13223d.isEmpty()) {
            return fVar.f13223d.isEmpty();
        }
        for (int intValue = ((Integer) this.f13223d.firstKey()).intValue(); intValue <= ((Integer) this.f13223d.lastKey()).intValue(); intValue++) {
            if (!mo13087n(intValue).equals(fVar.mo13087n(intValue))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final boolean mo13080g(String str) {
        if ("length".equals(str) || this.f13224e.containsKey(str)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13223d.hashCode() * 31;
    }

    /* renamed from: i */
    public final void mo13082i(String str, C4358q qVar) {
        if (qVar == null) {
            this.f13224e.remove(str);
        } else {
            this.f13224e.put(str, qVar);
        }
    }

    public final Iterator iterator() {
        return new C4154e(this);
    }

    /* renamed from: j */
    public final C4358q mo13084j(String str) {
        C4358q qVar;
        if ("length".equals(str)) {
            return new C4222i(Double.valueOf((double) mo13086l()));
        }
        if (!mo13080g(str) || (qVar = (C4358q) this.f13224e.get(str)) == null) {
            return C4358q.f13593U2;
        }
        return qVar;
    }

    /* renamed from: k */
    public final int mo13085k() {
        return this.f13223d.size();
    }

    /* renamed from: l */
    public final int mo13086l() {
        if (this.f13223d.isEmpty()) {
            return 0;
        }
        return ((Integer) this.f13223d.lastKey()).intValue() + 1;
    }

    /* renamed from: n */
    public final C4358q mo13087n(int i) {
        C4358q qVar;
        if (i >= mo13086l()) {
            throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
        } else if (!mo13076E(i) || (qVar = (C4358q) this.f13223d.get(Integer.valueOf(i))) == null) {
            return C4358q.f13593U2;
        } else {
            return qVar;
        }
    }

    /* renamed from: o */
    public final String mo13088o(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.f13223d.isEmpty()) {
            int i = 0;
            while (true) {
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i >= mo13086l()) {
                    break;
                }
                C4358q n = mo13087n(i);
                sb.append(str2);
                if (!(n instanceof C4443v) && !(n instanceof C4324o)) {
                    sb.append(n.mo13078c());
                }
                i++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    /* renamed from: r */
    public final Iterator mo13089r() {
        return this.f13223d.keySet().iterator();
    }

    public final String toString() {
        return mo13088o(",");
    }

    /* renamed from: u */
    public final Double mo13091u() {
        if (this.f13223d.size() == 1) {
            return mo13087n(0).mo13091u();
        }
        if (this.f13223d.size() <= 0) {
            return Double.valueOf(Utils.DOUBLE_EPSILON);
        }
        return Double.valueOf(Double.NaN);
    }

    /* renamed from: v */
    public final Boolean mo13092v() {
        return Boolean.TRUE;
    }

    /* renamed from: w */
    public final Iterator mo13093w() {
        return new C4137d(this, this.f13223d.keySet().iterator(), this.f13224e.keySet().iterator());
    }

    /* renamed from: x */
    public final C4358q mo13094x(String str, C4363q4 q4Var, List list) {
        if ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) {
            return C4138d0.m15661a(str, this, q4Var, list);
        }
        return C4256k.m16188a(this, new C4426u(str), q4Var, list);
    }

    /* renamed from: z */
    public final List mo13095z() {
        ArrayList arrayList = new ArrayList(mo13086l());
        for (int i = 0; i < mo13086l(); i++) {
            arrayList.add(mo13087n(i));
        }
        return arrayList;
    }

    public C4171f(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                mo13075D(i, (C4358q) list.get(i));
            }
        }
    }
}
