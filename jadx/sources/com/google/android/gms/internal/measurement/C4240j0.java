package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.j0 */
public final class C4240j0 extends C4476x {
    protected C4240j0() {
        this.f13791a.add(C4308n0.FOR_IN);
        this.f13791a.add(C4308n0.FOR_IN_CONST);
        this.f13791a.add(C4308n0.FOR_IN_LET);
        this.f13791a.add(C4308n0.FOR_LET);
        this.f13791a.add(C4308n0.FOR_OF);
        this.f13791a.add(C4308n0.FOR_OF_CONST);
        this.f13791a.add(C4308n0.FOR_OF_LET);
        this.f13791a.add(C4308n0.WHILE);
    }

    /* renamed from: c */
    private static C4358q m16135c(C4206h0 h0Var, Iterator it, C4358q qVar) {
        if (it != null) {
            while (it.hasNext()) {
                C4358q c = h0Var.mo13096a((C4358q) it.next()).mo13485c((C4171f) qVar);
                if (c instanceof C4205h) {
                    C4205h hVar = (C4205h) c;
                    if ("break".equals(hVar.mo13200d())) {
                        return C4358q.f13593U2;
                    }
                    if ("return".equals(hVar.mo13200d())) {
                        return hVar;
                    }
                }
            }
        }
        return C4358q.f13593U2;
    }

    /* renamed from: d */
    private static C4358q m16136d(C4206h0 h0Var, C4358q qVar, C4358q qVar2) {
        return m16135c(h0Var, qVar.mo13093w(), qVar2);
    }

    /* renamed from: e */
    private static C4358q m16137e(C4206h0 h0Var, C4358q qVar, C4358q qVar2) {
        if (qVar instanceof Iterable) {
            return m16135c(h0Var, ((Iterable) qVar).iterator(), qVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    /* renamed from: a */
    public final C4358q mo12835a(String str, C4363q4 q4Var, List list) {
        C4308n0 n0Var = C4308n0.ADD;
        int ordinal = C4381r5.m16552e(str).ordinal();
        if (ordinal != 65) {
            switch (ordinal) {
                case 26:
                    C4381r5.m16555h(C4308n0.FOR_IN.name(), 3, list);
                    if (list.get(0) instanceof C4426u) {
                        return m16136d(new C4223i0(q4Var, ((C4358q) list.get(0)).mo13078c()), q4Var.mo13484b((C4358q) list.get(1)), q4Var.mo13484b((C4358q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                case 27:
                    C4381r5.m16555h(C4308n0.FOR_IN_CONST.name(), 3, list);
                    if (list.get(0) instanceof C4426u) {
                        return m16136d(new C4172f0(q4Var, ((C4358q) list.get(0)).mo13078c()), q4Var.mo13484b((C4358q) list.get(1)), q4Var.mo13484b((C4358q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                case 28:
                    C4381r5.m16555h(C4308n0.FOR_IN_LET.name(), 3, list);
                    if (list.get(0) instanceof C4426u) {
                        return m16136d(new C4189g0(q4Var, ((C4358q) list.get(0)).mo13078c()), q4Var.mo13484b((C4358q) list.get(1)), q4Var.mo13484b((C4358q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                case 29:
                    C4381r5.m16555h(C4308n0.FOR_LET.name(), 4, list);
                    C4358q b = q4Var.mo13484b((C4358q) list.get(0));
                    if (b instanceof C4171f) {
                        C4171f fVar = (C4171f) b;
                        C4358q qVar = (C4358q) list.get(1);
                        C4358q qVar2 = (C4358q) list.get(2);
                        C4358q b2 = q4Var.mo13484b((C4358q) list.get(3));
                        C4363q4 a = q4Var.mo13483a();
                        for (int i = 0; i < fVar.mo13086l(); i++) {
                            String c = fVar.mo13087n(i).mo13078c();
                            a.mo13489g(c, q4Var.mo13486d(c));
                        }
                        while (q4Var.mo13484b(qVar).mo13092v().booleanValue()) {
                            C4358q c2 = q4Var.mo13485c((C4171f) b2);
                            if (c2 instanceof C4205h) {
                                C4205h hVar = (C4205h) c2;
                                if ("break".equals(hVar.mo13200d())) {
                                    return C4358q.f13593U2;
                                }
                                if ("return".equals(hVar.mo13200d())) {
                                    return hVar;
                                }
                            }
                            C4363q4 a2 = q4Var.mo13483a();
                            for (int i2 = 0; i2 < fVar.mo13086l(); i2++) {
                                String c3 = fVar.mo13087n(i2).mo13078c();
                                a2.mo13489g(c3, a.mo13486d(c3));
                            }
                            a2.mo13484b(qVar2);
                            a = a2;
                        }
                        return C4358q.f13593U2;
                    }
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                case 30:
                    C4381r5.m16555h(C4308n0.FOR_OF.name(), 3, list);
                    if (list.get(0) instanceof C4426u) {
                        return m16137e(new C4223i0(q4Var, ((C4358q) list.get(0)).mo13078c()), q4Var.mo13484b((C4358q) list.get(1)), q4Var.mo13484b((C4358q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                case 31:
                    C4381r5.m16555h(C4308n0.FOR_OF_CONST.name(), 3, list);
                    if (list.get(0) instanceof C4426u) {
                        return m16137e(new C4172f0(q4Var, ((C4358q) list.get(0)).mo13078c()), q4Var.mo13484b((C4358q) list.get(1)), q4Var.mo13484b((C4358q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                case 32:
                    C4381r5.m16555h(C4308n0.FOR_OF_LET.name(), 3, list);
                    if (list.get(0) instanceof C4426u) {
                        return m16137e(new C4189g0(q4Var, ((C4358q) list.get(0)).mo13078c()), q4Var.mo13484b((C4358q) list.get(1)), q4Var.mo13484b((C4358q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                default:
                    return super.mo13799b(str);
            }
        } else {
            C4381r5.m16555h(C4308n0.WHILE.name(), 4, list);
            C4358q qVar3 = (C4358q) list.get(0);
            C4358q qVar4 = (C4358q) list.get(1);
            C4358q b3 = q4Var.mo13484b((C4358q) list.get(3));
            if (q4Var.mo13484b((C4358q) list.get(2)).mo13092v().booleanValue()) {
                C4358q c4 = q4Var.mo13485c((C4171f) b3);
                if (c4 instanceof C4205h) {
                    C4205h hVar2 = (C4205h) c4;
                    if ("break".equals(hVar2.mo13200d())) {
                        return C4358q.f13593U2;
                    }
                    if ("return".equals(hVar2.mo13200d())) {
                        return hVar2;
                    }
                }
            }
            while (q4Var.mo13484b(qVar3).mo13092v().booleanValue()) {
                C4358q c5 = q4Var.mo13485c((C4171f) b3);
                if (c5 instanceof C4205h) {
                    C4205h hVar3 = (C4205h) c5;
                    if ("break".equals(hVar3.mo13200d())) {
                        return C4358q.f13593U2;
                    }
                    if ("return".equals(hVar3.mo13200d())) {
                        return hVar3;
                    }
                }
                q4Var.mo13484b(qVar4);
            }
            return C4358q.f13593U2;
        }
    }
}
