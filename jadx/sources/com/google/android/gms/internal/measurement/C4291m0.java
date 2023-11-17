package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.m0 */
public final class C4291m0 extends C4476x {
    protected C4291m0() {
        this.f13791a.add(C4308n0.ASSIGN);
        this.f13791a.add(C4308n0.CONST);
        this.f13791a.add(C4308n0.CREATE_ARRAY);
        this.f13791a.add(C4308n0.CREATE_OBJECT);
        this.f13791a.add(C4308n0.EXPRESSION_LIST);
        this.f13791a.add(C4308n0.GET);
        this.f13791a.add(C4308n0.GET_INDEX);
        this.f13791a.add(C4308n0.GET_PROPERTY);
        this.f13791a.add(C4308n0.NULL);
        this.f13791a.add(C4308n0.SET_PROPERTY);
        this.f13791a.add(C4308n0.TYPEOF);
        this.f13791a.add(C4308n0.UNDEFINED);
        this.f13791a.add(C4308n0.VAR);
    }

    /* renamed from: a */
    public final C4358q mo12835a(String str, C4363q4 q4Var, List list) {
        String str2;
        C4308n0 n0Var = C4308n0.ADD;
        int ordinal = C4381r5.m16552e(str).ordinal();
        int i = 0;
        if (ordinal == 3) {
            C4381r5.m16555h(C4308n0.ASSIGN.name(), 2, list);
            C4358q b = q4Var.mo13484b((C4358q) list.get(0));
            if (!(b instanceof C4426u)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", new Object[]{b.getClass().getCanonicalName()}));
            } else if (q4Var.mo13490h(b.mo13078c())) {
                C4358q b2 = q4Var.mo13484b((C4358q) list.get(1));
                q4Var.mo13489g(b.mo13078c(), b2);
                return b2;
            } else {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", new Object[]{b.mo13078c()}));
            }
        } else if (ordinal == 14) {
            C4381r5.m16556i(C4308n0.CONST.name(), 2, list);
            if (list.size() % 2 == 0) {
                int i2 = 0;
                while (i2 < list.size() - 1) {
                    C4358q b3 = q4Var.mo13484b((C4358q) list.get(i2));
                    if (b3 instanceof C4426u) {
                        q4Var.mo13488f(b3.mo13078c(), q4Var.mo13484b((C4358q) list.get(i2 + 1)));
                        i2 += 2;
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", new Object[]{b3.getClass().getCanonicalName()}));
                    }
                }
                return C4358q.f13593U2;
            }
            throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())}));
        } else if (ordinal == 24) {
            C4381r5.m16556i(C4308n0.EXPRESSION_LIST.name(), 1, list);
            C4358q qVar = C4358q.f13593U2;
            while (i < list.size()) {
                qVar = q4Var.mo13484b((C4358q) list.get(i));
                if (!(qVar instanceof C4205h)) {
                    i++;
                } else {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
            }
            return qVar;
        } else if (ordinal == 33) {
            C4381r5.m16555h(C4308n0.GET.name(), 1, list);
            C4358q b4 = q4Var.mo13484b((C4358q) list.get(0));
            if (b4 instanceof C4426u) {
                return q4Var.mo13486d(b4.mo13078c());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", new Object[]{b4.getClass().getCanonicalName()}));
        } else if (ordinal == 49) {
            C4381r5.m16555h(C4308n0.NULL.name(), 0, list);
            return C4358q.f13594V2;
        } else if (ordinal == 58) {
            C4381r5.m16555h(C4308n0.SET_PROPERTY.name(), 3, list);
            C4358q b5 = q4Var.mo13484b((C4358q) list.get(0));
            C4358q b6 = q4Var.mo13484b((C4358q) list.get(1));
            C4358q b7 = q4Var.mo13484b((C4358q) list.get(2));
            if (b5 == C4358q.f13593U2 || b5 == C4358q.f13594V2) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", new Object[]{b6.mo13078c(), b5.mo13078c()}));
            }
            if ((b5 instanceof C4171f) && (b6 instanceof C4222i)) {
                ((C4171f) b5).mo13075D(b6.mo13091u().intValue(), b7);
            } else if (b5 instanceof C4290m) {
                ((C4290m) b5).mo13082i(b6.mo13078c(), b7);
            }
            return b7;
        } else if (ordinal != 17) {
            if (ordinal != 18) {
                if (ordinal == 35 || ordinal == 36) {
                    C4381r5.m16555h(C4308n0.GET_PROPERTY.name(), 2, list);
                    C4358q b8 = q4Var.mo13484b((C4358q) list.get(0));
                    C4358q b9 = q4Var.mo13484b((C4358q) list.get(1));
                    if ((b8 instanceof C4171f) && C4381r5.m16558k(b9)) {
                        return ((C4171f) b8).mo13087n(b9.mo13091u().intValue());
                    }
                    if (b8 instanceof C4290m) {
                        return ((C4290m) b8).mo13084j(b9.mo13078c());
                    }
                    if (b8 instanceof C4426u) {
                        if ("length".equals(b9.mo13078c())) {
                            return new C4222i(Double.valueOf((double) b8.mo13078c().length()));
                        }
                        if (C4381r5.m16558k(b9) && b9.mo13091u().doubleValue() < ((double) b8.mo13078c().length())) {
                            return new C4426u(String.valueOf(b8.mo13078c().charAt(b9.mo13091u().intValue())));
                        }
                    }
                    return C4358q.f13593U2;
                }
                switch (ordinal) {
                    case 62:
                        C4381r5.m16555h(C4308n0.TYPEOF.name(), 1, list);
                        C4358q b12 = q4Var.mo13484b((C4358q) list.get(0));
                        if (b12 instanceof C4443v) {
                            str2 = "undefined";
                        } else if (b12 instanceof C4188g) {
                            str2 = "boolean";
                        } else if (b12 instanceof C4222i) {
                            str2 = "number";
                        } else if (b12 instanceof C4426u) {
                            str2 = "string";
                        } else if (b12 instanceof C4341p) {
                            str2 = "function";
                        } else if ((b12 instanceof C4375r) || (b12 instanceof C4205h)) {
                            throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", new Object[]{b12}));
                        } else {
                            str2 = "object";
                        }
                        return new C4426u(str2);
                    case 63:
                        C4381r5.m16555h(C4308n0.UNDEFINED.name(), 0, list);
                        return C4358q.f13593U2;
                    case 64:
                        C4381r5.m16556i(C4308n0.VAR.name(), 1, list);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            C4358q b13 = q4Var.mo13484b((C4358q) it.next());
                            if (b13 instanceof C4426u) {
                                q4Var.mo13487e(b13.mo13078c(), C4358q.f13593U2);
                            } else {
                                throw new IllegalArgumentException(String.format("Expected string for var name. got %s", new Object[]{b13.getClass().getCanonicalName()}));
                            }
                        }
                        return C4358q.f13593U2;
                    default:
                        return super.mo13799b(str);
                }
            } else if (list.isEmpty()) {
                return new C4307n();
            } else {
                if (list.size() % 2 == 0) {
                    C4307n nVar = new C4307n();
                    while (i < list.size() - 1) {
                        C4358q b14 = q4Var.mo13484b((C4358q) list.get(i));
                        C4358q b15 = q4Var.mo13484b((C4358q) list.get(i + 1));
                        if ((b14 instanceof C4205h) || (b15 instanceof C4205h)) {
                            throw new IllegalStateException("Failed to evaluate map entry");
                        }
                        nVar.mo13082i(b14.mo13078c(), b15);
                        i += 2;
                    }
                    return nVar;
                }
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())}));
            }
        } else if (list.isEmpty()) {
            return new C4171f();
        } else {
            C4171f fVar = new C4171f();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C4358q b16 = q4Var.mo13484b((C4358q) it2.next());
                if (!(b16 instanceof C4205h)) {
                    fVar.mo13075D(i, b16);
                    i++;
                } else {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
            }
            return fVar;
        }
    }
}
