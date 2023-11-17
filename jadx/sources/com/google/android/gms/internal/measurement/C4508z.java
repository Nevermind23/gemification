package com.google.android.gms.internal.measurement;

import com.github.mikephil.charting.utils.Utils;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.z */
public final class C4508z extends C4476x {
    public C4508z() {
        this.f13791a.add(C4308n0.EQUALS);
        this.f13791a.add(C4308n0.GREATER_THAN);
        this.f13791a.add(C4308n0.GREATER_THAN_EQUALS);
        this.f13791a.add(C4308n0.IDENTITY_EQUALS);
        this.f13791a.add(C4308n0.IDENTITY_NOT_EQUALS);
        this.f13791a.add(C4308n0.LESS_THAN);
        this.f13791a.add(C4308n0.LESS_THAN_EQUALS);
        this.f13791a.add(C4308n0.NOT_EQUALS);
    }

    /* renamed from: c */
    private static boolean m17255c(C4358q qVar, C4358q qVar2) {
        if (qVar.getClass().equals(qVar2.getClass())) {
            if ((qVar instanceof C4443v) || (qVar instanceof C4324o)) {
                return true;
            }
            if (qVar instanceof C4222i) {
                if (Double.isNaN(qVar.mo13091u().doubleValue()) || Double.isNaN(qVar2.mo13091u().doubleValue()) || qVar.mo13091u().doubleValue() != qVar2.mo13091u().doubleValue()) {
                    return false;
                }
                return true;
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
        } else if (((qVar instanceof C4443v) || (qVar instanceof C4324o)) && ((qVar2 instanceof C4443v) || (qVar2 instanceof C4324o))) {
            return true;
        } else {
            boolean z = qVar instanceof C4222i;
            if (z && (qVar2 instanceof C4426u)) {
                return m17255c(qVar, new C4222i(qVar2.mo13091u()));
            }
            boolean z2 = qVar instanceof C4426u;
            if (z2 && (qVar2 instanceof C4222i)) {
                return m17255c(new C4222i(qVar.mo13091u()), qVar2);
            }
            if (qVar instanceof C4188g) {
                return m17255c(new C4222i(qVar.mo13091u()), qVar2);
            }
            if (qVar2 instanceof C4188g) {
                return m17255c(qVar, new C4222i(qVar2.mo13091u()));
            }
            if ((z2 || z) && (qVar2 instanceof C4290m)) {
                return m17255c(qVar, new C4426u(qVar2.mo13078c()));
            }
            if (!(qVar instanceof C4290m) || (!(qVar2 instanceof C4426u) && !(qVar2 instanceof C4222i))) {
                return false;
            }
            return m17255c(new C4426u(qVar.mo13078c()), qVar2);
        }
    }

    /* renamed from: d */
    private static boolean m17256d(C4358q qVar, C4358q qVar2) {
        int i;
        if (qVar instanceof C4290m) {
            qVar = new C4426u(qVar.mo13078c());
        }
        if (qVar2 instanceof C4290m) {
            qVar2 = new C4426u(qVar2.mo13078c());
        }
        if (!(qVar instanceof C4426u) || !(qVar2 instanceof C4426u)) {
            double doubleValue = qVar.mo13091u().doubleValue();
            double doubleValue2 = qVar2.mo13091u().doubleValue();
            if (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2) || ((doubleValue == Utils.DOUBLE_EPSILON && doubleValue2 == Utils.DOUBLE_EPSILON) || ((i == 0 && doubleValue2 == Utils.DOUBLE_EPSILON) || Double.compare(doubleValue, doubleValue2) >= 0))) {
                return false;
            }
            return true;
        } else if (qVar.mo13078c().compareTo(qVar2.mo13078c()) < 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: e */
    private static boolean m17257e(C4358q qVar, C4358q qVar2) {
        if (qVar instanceof C4290m) {
            qVar = new C4426u(qVar.mo13078c());
        }
        if (qVar2 instanceof C4290m) {
            qVar2 = new C4426u(qVar2.mo13078c());
        }
        if (((!(qVar instanceof C4426u) || !(qVar2 instanceof C4426u)) && (Double.isNaN(qVar.mo13091u().doubleValue()) || Double.isNaN(qVar2.mo13091u().doubleValue()))) || m17256d(qVar2, qVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final C4358q mo12835a(String str, C4363q4 q4Var, List list) {
        boolean z;
        boolean c;
        C4381r5.m16555h(C4381r5.m16552e(str).name(), 2, list);
        C4358q b = q4Var.mo13484b((C4358q) list.get(0));
        C4358q b2 = q4Var.mo13484b((C4358q) list.get(1));
        int ordinal = C4381r5.m16552e(str).ordinal();
        if (ordinal != 23) {
            if (ordinal == 48) {
                c = m17255c(b, b2);
            } else if (ordinal == 42) {
                z = m17256d(b, b2);
            } else if (ordinal != 43) {
                switch (ordinal) {
                    case 37:
                        z = m17256d(b2, b);
                        break;
                    case 38:
                        z = m17257e(b2, b);
                        break;
                    case 39:
                        z = C4381r5.m16559l(b, b2);
                        break;
                    case 40:
                        c = C4381r5.m16559l(b, b2);
                        break;
                    default:
                        return super.mo13799b(str);
                }
            } else {
                z = m17257e(b, b2);
            }
            z = !c;
        } else {
            z = m17255c(b, b2);
        }
        if (z) {
            return C4358q.f13598Z2;
        }
        return C4358q.f13599a3;
    }
}
