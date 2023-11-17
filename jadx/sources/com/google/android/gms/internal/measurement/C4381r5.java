package com.google.android.gms.internal.measurement;

import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.r5 */
public abstract class C4381r5 {
    /* renamed from: a */
    public static double m16548a(double d) {
        int i;
        int i2;
        if (Double.isNaN(d)) {
            return Utils.DOUBLE_EPSILON;
        }
        if (Double.isInfinite(d) || d == Utils.DOUBLE_EPSILON || i == 0) {
            return d;
        }
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        return ((double) i2) * Math.floor(Math.abs(d));
    }

    /* renamed from: b */
    public static int m16549b(double d) {
        int i;
        int i2;
        if (Double.isNaN(d) || Double.isInfinite(d) || d == Utils.DOUBLE_EPSILON) {
            return 0;
        }
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        return (int) ((long) ((((double) i2) * Math.floor(Math.abs(d))) % 4.294967296E9d));
    }

    /* renamed from: c */
    public static int m16550c(C4363q4 q4Var) {
        int b = m16549b(q4Var.mo13486d("runtime.counter").mo13091u().doubleValue() + 1.0d);
        if (b <= 1000000) {
            q4Var.mo13489g("runtime.counter", new C4222i(Double.valueOf((double) b)));
            return b;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    /* renamed from: d */
    public static long m16551d(double d) {
        return ((long) m16549b(d)) & 4294967295L;
    }

    /* renamed from: e */
    public static C4308n0 m16552e(String str) {
        C4308n0 n0Var = null;
        if (str != null && !str.isEmpty()) {
            n0Var = C4308n0.m16309a(Integer.parseInt(str));
        }
        if (n0Var != null) {
            return n0Var;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", new Object[]{str}));
    }

    /* renamed from: f */
    public static Object m16553f(C4358q qVar) {
        if (C4358q.f13594V2.equals(qVar)) {
            return null;
        }
        if (C4358q.f13593U2.equals(qVar)) {
            return "";
        }
        if (qVar instanceof C4307n) {
            return m16554g((C4307n) qVar);
        }
        if (qVar instanceof C4171f) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((C4171f) qVar).iterator();
            while (it.hasNext()) {
                Object f = m16553f((C4358q) it.next());
                if (f != null) {
                    arrayList.add(f);
                }
            }
            return arrayList;
        } else if (!qVar.mo13091u().isNaN()) {
            return qVar.mo13091u();
        } else {
            return qVar.mo13078c();
        }
    }

    /* renamed from: g */
    public static Map m16554g(C4307n nVar) {
        HashMap hashMap = new HashMap();
        for (String str : nVar.mo13378a()) {
            Object f = m16553f(nVar.mo13084j(str));
            if (f != null) {
                hashMap.put(str, f);
            }
        }
        return hashMap;
    }

    /* renamed from: h */
    public static void m16555h(String str, int i, List list) {
        if (list.size() != i) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: i */
    public static void m16556i(String str, int i, List list) {
        if (list.size() < i) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: j */
    public static void m16557j(String str, int i, List list) {
        if (list.size() > i) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: k */
    public static boolean m16558k(C4358q qVar) {
        if (qVar == null) {
            return false;
        }
        Double u = qVar.mo13091u();
        if (u.isNaN() || u.doubleValue() < Utils.DOUBLE_EPSILON || !u.equals(Double.valueOf(Math.floor(u.doubleValue())))) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static boolean m16559l(C4358q qVar, C4358q qVar2) {
        if (!qVar.getClass().equals(qVar2.getClass())) {
            return false;
        }
        if ((qVar instanceof C4443v) || (qVar instanceof C4324o)) {
            return true;
        }
        if (qVar instanceof C4222i) {
            if (Double.isNaN(qVar.mo13091u().doubleValue()) || Double.isNaN(qVar2.mo13091u().doubleValue())) {
                return false;
            }
            return qVar.mo13091u().equals(qVar2.mo13091u());
        } else if (qVar instanceof C4426u) {
            return qVar.mo13078c().equals(qVar2.mo13078c());
        } else {
            if (qVar instanceof C4188g) {
                return qVar.mo13092v().equals(qVar2.mo13092v());
            }
            if (qVar == qVar2) {
                return true;
            }
            return false;
        }
    }
}
