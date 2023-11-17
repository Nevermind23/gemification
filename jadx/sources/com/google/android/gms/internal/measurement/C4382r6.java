package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.r6 */
public abstract class C4382r6 {
    /* renamed from: a */
    public static C4358q m16560a(C4347p5 p5Var) {
        if (p5Var == null) {
            return C4358q.f13593U2;
        }
        int J = p5Var.mo13450J() - 1;
        if (J != 1) {
            if (J != 2) {
                if (J != 3) {
                    if (J == 4) {
                        List<C4347p5> E = p5Var.mo13445E();
                        ArrayList arrayList = new ArrayList();
                        for (C4347p5 a : E) {
                            arrayList.add(m16560a(a));
                        }
                        return new C4375r(p5Var.mo13443C(), arrayList);
                    }
                    throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
                } else if (p5Var.mo13447G()) {
                    return new C4188g(Boolean.valueOf(p5Var.mo13446F()));
                } else {
                    return new C4188g((Boolean) null);
                }
            } else if (p5Var.mo13448H()) {
                return new C4222i(Double.valueOf(p5Var.mo13442A()));
            } else {
                return new C4222i((Double) null);
            }
        } else if (p5Var.mo13449I()) {
            return new C4426u(p5Var.mo13444D());
        } else {
            return C4358q.f13600b3;
        }
    }

    /* renamed from: b */
    public static C4358q m16561b(Object obj) {
        if (obj == null) {
            return C4358q.f13594V2;
        }
        if (obj instanceof String) {
            return new C4426u((String) obj);
        }
        if (obj instanceof Double) {
            return new C4222i((Double) obj);
        }
        if (obj instanceof Long) {
            return new C4222i(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C4222i(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C4188g((Boolean) obj);
        }
        if (obj instanceof Map) {
            C4307n nVar = new C4307n();
            Map map = (Map) obj;
            for (Object next : map.keySet()) {
                C4358q b = m16561b(map.get(next));
                if (next != null) {
                    if (!(next instanceof String)) {
                        next = next.toString();
                    }
                    nVar.mo13082i((String) next, b);
                }
            }
            return nVar;
        } else if (obj instanceof List) {
            C4171f fVar = new C4171f();
            for (Object b2 : (List) obj) {
                fVar.mo13075D(fVar.mo13086l(), m16561b(b2));
            }
            return fVar;
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }
}
