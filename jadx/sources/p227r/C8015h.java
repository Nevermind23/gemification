package p227r;

import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import p214q.C7800a;
import p214q.C7803d;
import p214q.C7806e;
import p214q.C7809f;
import p214q.C7810g;
import p227r.C8006b;

/* renamed from: r.h */
public abstract class C8015h {

    /* renamed from: a */
    private static C8006b.C8007a f23120a = new C8006b.C8007a();

    /* renamed from: b */
    private static int f23121b = 0;

    /* renamed from: c */
    private static int f23122c = 0;

    /* renamed from: a */
    private static boolean m30439a(int i, C7806e eVar) {
        C7809f fVar;
        boolean z;
        boolean z2;
        C7806e.C7808b bVar;
        C7806e.C7808b bVar2;
        C7806e.C7808b y = eVar.mo22687y();
        C7806e.C7808b R = eVar.mo22621R();
        if (eVar.mo22605I() != null) {
            fVar = (C7809f) eVar.mo22605I();
        } else {
            fVar = null;
        }
        if (fVar != null) {
            C7806e.C7808b y2 = fVar.mo22687y();
            C7806e.C7808b bVar3 = C7806e.C7808b.FIXED;
        }
        if (fVar != null) {
            C7806e.C7808b R2 = fVar.mo22621R();
            C7806e.C7808b bVar4 = C7806e.C7808b.FIXED;
        }
        C7806e.C7808b bVar5 = C7806e.C7808b.FIXED;
        if (y == bVar5 || eVar.mo22556l0() || y == C7806e.C7808b.WRAP_CONTENT || ((y == (bVar2 = C7806e.C7808b.MATCH_CONSTRAINT) && eVar.f22656w == 0 && eVar.f22619d0 == Utils.FLOAT_EPSILON && eVar.mo22635Y(0)) || (y == bVar2 && eVar.f22656w == 1 && eVar.mo22641b0(0, eVar.mo22627U())))) {
            z = true;
        } else {
            z = false;
        }
        if (R == bVar5 || eVar.mo22557m0() || R == C7806e.C7808b.WRAP_CONTENT || ((R == (bVar = C7806e.C7808b.MATCH_CONSTRAINT) && eVar.f22658x == 0 && eVar.f22619d0 == Utils.FLOAT_EPSILON && eVar.mo22635Y(1)) || (R == bVar && eVar.f22658x == 1 && eVar.mo22641b0(1, eVar.mo22683v())))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (eVar.f22619d0 > Utils.FLOAT_EPSILON && (z || z2)) {
            return true;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static void m30440b(int i, C7806e eVar, C8006b.C8008b bVar, boolean z) {
        boolean z2;
        C7803d dVar;
        C7803d dVar2;
        boolean z3;
        C7803d dVar3;
        C7803d dVar4;
        C7806e eVar2 = eVar;
        C8006b.C8008b bVar2 = bVar;
        boolean z4 = z;
        if (!eVar.mo22647e0()) {
            boolean z5 = true;
            f23121b++;
            if (!(eVar2 instanceof C7809f) && eVar.mo22662k0()) {
                int i2 = i + 1;
                if (m30439a(i2, eVar2)) {
                    C7809f.m29666O1(i2, eVar2, bVar2, new C8006b.C8007a(), C8006b.C8007a.f23074k);
                }
            }
            C7803d m = eVar2.mo22666m(C7803d.C7805b.LEFT);
            C7803d m2 = eVar2.mo22666m(C7803d.C7805b.RIGHT);
            int d = m.mo22572d();
            int d2 = m2.mo22572d();
            if (m.mo22571c() != null && m.mo22581m()) {
                Iterator it = m.mo22571c().iterator();
                while (it.hasNext()) {
                    C7803d dVar5 = (C7803d) it.next();
                    C7806e eVar3 = dVar5.f22558d;
                    int i3 = i + 1;
                    boolean a = m30439a(i3, eVar3);
                    if (eVar3.mo22662k0() && a) {
                        C7809f.m29666O1(i3, eVar3, bVar2, new C8006b.C8007a(), C8006b.C8007a.f23074k);
                    }
                    if ((dVar5 != eVar3.f22600O || (dVar4 = eVar3.f22602Q.f22560f) == null || !dVar4.mo22581m()) && (dVar5 != eVar3.f22602Q || (dVar3 = eVar3.f22600O.f22560f) == null || !dVar3.mo22581m())) {
                        z3 = false;
                    } else {
                        z3 = z5;
                    }
                    C7806e.C7808b y = eVar3.mo22687y();
                    C7806e.C7808b bVar3 = C7806e.C7808b.MATCH_CONSTRAINT;
                    if (y != bVar3 || a) {
                        if (!eVar3.mo22662k0()) {
                            C7803d dVar6 = eVar3.f22600O;
                            if (dVar5 == dVar6 && eVar3.f22602Q.f22560f == null) {
                                int e = dVar6.mo22573e() + d;
                                eVar3.mo22594C0(e, eVar3.mo22627U() + e);
                                m30440b(i3, eVar3, bVar2, z4);
                            } else {
                                C7803d dVar7 = eVar3.f22602Q;
                                if (dVar5 == dVar7 && dVar6.f22560f == null) {
                                    int e2 = d - dVar7.mo22573e();
                                    eVar3.mo22594C0(e2 - eVar3.mo22627U(), e2);
                                    m30440b(i3, eVar3, bVar2, z4);
                                } else if (z3 && !eVar3.mo22652g0()) {
                                    m30442d(i3, bVar2, eVar3, z4);
                                }
                            }
                        }
                    } else if (eVar3.mo22687y() == bVar3 && eVar3.f22576A >= 0 && eVar3.f22662z >= 0 && ((eVar3.mo22625T() == 8 || (eVar3.f22656w == 0 && eVar3.mo22680t() == Utils.FLOAT_EPSILON)) && !eVar3.mo22652g0() && !eVar3.mo22659j0() && z3 && !eVar3.mo22652g0())) {
                        m30443e(i3, eVar2, bVar2, eVar3, z4);
                    }
                    z5 = true;
                }
            }
            if (!(eVar2 instanceof C7810g)) {
                if (m2.mo22571c() != null && m2.mo22581m()) {
                    Iterator it2 = m2.mo22571c().iterator();
                    while (it2.hasNext()) {
                        C7803d dVar8 = (C7803d) it2.next();
                        C7806e eVar4 = dVar8.f22558d;
                        int i4 = i + 1;
                        boolean a2 = m30439a(i4, eVar4);
                        if (eVar4.mo22662k0() && a2) {
                            C7809f.m29666O1(i4, eVar4, bVar2, new C8006b.C8007a(), C8006b.C8007a.f23074k);
                        }
                        if ((dVar8 != eVar4.f22600O || (dVar2 = eVar4.f22602Q.f22560f) == null || !dVar2.mo22581m()) && (dVar8 != eVar4.f22602Q || (dVar = eVar4.f22600O.f22560f) == null || !dVar.mo22581m())) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        C7806e.C7808b y2 = eVar4.mo22687y();
                        C7806e.C7808b bVar4 = C7806e.C7808b.MATCH_CONSTRAINT;
                        if (y2 != bVar4 || a2) {
                            if (!eVar4.mo22662k0()) {
                                C7803d dVar9 = eVar4.f22600O;
                                if (dVar8 == dVar9 && eVar4.f22602Q.f22560f == null) {
                                    int e3 = dVar9.mo22573e() + d2;
                                    eVar4.mo22594C0(e3, eVar4.mo22627U() + e3);
                                    m30440b(i4, eVar4, bVar2, z4);
                                } else {
                                    C7803d dVar10 = eVar4.f22602Q;
                                    if (dVar8 == dVar10 && dVar9.f22560f == null) {
                                        int e4 = d2 - dVar10.mo22573e();
                                        eVar4.mo22594C0(e4 - eVar4.mo22627U(), e4);
                                        m30440b(i4, eVar4, bVar2, z4);
                                    } else if (z2 && !eVar4.mo22652g0()) {
                                        m30442d(i4, bVar2, eVar4, z4);
                                    }
                                }
                            }
                        } else if (eVar4.mo22687y() == bVar4 && eVar4.f22576A >= 0 && eVar4.f22662z >= 0) {
                            if ((eVar4.mo22625T() == 8 || (eVar4.f22656w == 0 && eVar4.mo22680t() == Utils.FLOAT_EPSILON)) && !eVar4.mo22652g0() && !eVar4.mo22659j0() && z2 && !eVar4.mo22652g0()) {
                                m30443e(i4, eVar2, bVar2, eVar4, z4);
                            }
                        }
                    }
                }
                eVar.mo22671o0();
            }
        }
    }

    /* renamed from: c */
    private static void m30441c(int i, C7800a aVar, C8006b.C8008b bVar, int i2, boolean z) {
        if (!aVar.mo22558p1()) {
            return;
        }
        if (i2 == 0) {
            m30440b(i + 1, aVar, bVar, z);
        } else {
            m30447i(i + 1, aVar, bVar);
        }
    }

    /* renamed from: d */
    private static void m30442d(int i, C8006b.C8008b bVar, C7806e eVar, boolean z) {
        float f;
        float w = eVar.mo22684w();
        int d = eVar.f22600O.f22560f.mo22572d();
        int d2 = eVar.f22602Q.f22560f.mo22572d();
        int e = eVar.f22600O.mo22573e() + d;
        int e2 = d2 - eVar.f22602Q.mo22573e();
        if (d == d2) {
            w = 0.5f;
        } else {
            d = e;
            d2 = e2;
        }
        int U = eVar.mo22627U();
        int i2 = (d2 - d) - U;
        if (d > d2) {
            i2 = (d - d2) - U;
        }
        if (i2 > 0) {
            f = (w * ((float) i2)) + 0.5f;
        } else {
            f = w * ((float) i2);
        }
        int i3 = ((int) f) + d;
        int i4 = i3 + U;
        if (d > d2) {
            i4 = i3 - U;
        }
        eVar.mo22594C0(i3, i4);
        m30440b(i + 1, eVar, bVar, z);
    }

    /* renamed from: e */
    private static void m30443e(int i, C7806e eVar, C8006b.C8008b bVar, C7806e eVar2, boolean z) {
        int i2;
        float w = eVar2.mo22684w();
        int d = eVar2.f22600O.f22560f.mo22572d() + eVar2.f22600O.mo22573e();
        int d2 = eVar2.f22602Q.f22560f.mo22572d() - eVar2.f22602Q.mo22573e();
        if (d2 >= d) {
            int U = eVar2.mo22627U();
            if (eVar2.mo22625T() != 8) {
                int i3 = eVar2.f22656w;
                if (i3 == 2) {
                    if (eVar instanceof C7809f) {
                        i2 = eVar.mo22627U();
                    } else {
                        i2 = eVar.mo22605I().mo22627U();
                    }
                    U = (int) (eVar2.mo22684w() * 0.5f * ((float) i2));
                } else if (i3 == 0) {
                    U = d2 - d;
                }
                U = Math.max(eVar2.f22662z, U);
                int i4 = eVar2.f22576A;
                if (i4 > 0) {
                    U = Math.min(i4, U);
                }
            }
            int i5 = d + ((int) ((w * ((float) ((d2 - d) - U))) + 0.5f));
            eVar2.mo22594C0(i5, U + i5);
            m30440b(i + 1, eVar2, bVar, z);
        }
    }

    /* renamed from: f */
    private static void m30444f(int i, C8006b.C8008b bVar, C7806e eVar) {
        float f;
        float P = eVar.mo22617P();
        int d = eVar.f22601P.f22560f.mo22572d();
        int d2 = eVar.f22603R.f22560f.mo22572d();
        int e = eVar.f22601P.mo22573e() + d;
        int e2 = d2 - eVar.f22603R.mo22573e();
        if (d == d2) {
            P = 0.5f;
        } else {
            d = e;
            d2 = e2;
        }
        int v = eVar.mo22683v();
        int i2 = (d2 - d) - v;
        if (d > d2) {
            i2 = (d - d2) - v;
        }
        if (i2 > 0) {
            f = (P * ((float) i2)) + 0.5f;
        } else {
            f = P * ((float) i2);
        }
        int i3 = (int) f;
        int i4 = d + i3;
        int i5 = i4 + v;
        if (d > d2) {
            i4 = d - i3;
            i5 = i4 - v;
        }
        eVar.mo22600F0(i4, i5);
        m30447i(i + 1, eVar, bVar);
    }

    /* renamed from: g */
    private static void m30445g(int i, C7806e eVar, C8006b.C8008b bVar, C7806e eVar2) {
        int i2;
        float P = eVar2.mo22617P();
        int d = eVar2.f22601P.f22560f.mo22572d() + eVar2.f22601P.mo22573e();
        int d2 = eVar2.f22603R.f22560f.mo22572d() - eVar2.f22603R.mo22573e();
        if (d2 >= d) {
            int v = eVar2.mo22683v();
            if (eVar2.mo22625T() != 8) {
                int i3 = eVar2.f22658x;
                if (i3 == 2) {
                    if (eVar instanceof C7809f) {
                        i2 = eVar.mo22683v();
                    } else {
                        i2 = eVar.mo22605I().mo22683v();
                    }
                    v = (int) (P * 0.5f * ((float) i2));
                } else if (i3 == 0) {
                    v = d2 - d;
                }
                v = Math.max(eVar2.f22580C, v);
                int i4 = eVar2.f22582D;
                if (i4 > 0) {
                    v = Math.min(i4, v);
                }
            }
            int i5 = d + ((int) ((P * ((float) ((d2 - d) - v))) + 0.5f));
            eVar2.mo22600F0(i5, v + i5);
            m30447i(i + 1, eVar2, bVar);
        }
    }

    /* renamed from: h */
    public static void m30446h(C7809f fVar, C8006b.C8008b bVar) {
        C7806e.C7808b y = fVar.mo22687y();
        C7806e.C7808b R = fVar.mo22621R();
        f23121b = 0;
        f23122c = 0;
        fVar.mo22679s0();
        ArrayList n1 = fVar.mo22734n1();
        int size = n1.size();
        for (int i = 0; i < size; i++) {
            ((C7806e) n1.get(i)).mo22679s0();
        }
        boolean L1 = fVar.mo22702L1();
        if (y == C7806e.C7808b.FIXED) {
            fVar.mo22594C0(0, fVar.mo22627U());
        } else {
            fVar.mo22596D0(0);
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C7806e eVar = (C7806e) n1.get(i2);
            if (eVar instanceof C7810g) {
                C7810g gVar = (C7810g) eVar;
                if (gVar.mo22719o1() == 1) {
                    if (gVar.mo22720p1() != -1) {
                        gVar.mo22723s1(gVar.mo22720p1());
                    } else if (gVar.mo22721q1() != -1 && fVar.mo22556l0()) {
                        gVar.mo22723s1(fVar.mo22627U() - gVar.mo22721q1());
                    } else if (fVar.mo22556l0()) {
                        gVar.mo22723s1((int) ((gVar.mo22722r1() * ((float) fVar.mo22627U())) + 0.5f));
                    }
                    z = true;
                }
            } else if ((eVar instanceof C7800a) && ((C7800a) eVar).mo22562t1() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                C7806e eVar2 = (C7806e) n1.get(i3);
                if (eVar2 instanceof C7810g) {
                    C7810g gVar2 = (C7810g) eVar2;
                    if (gVar2.mo22719o1() == 1) {
                        m30440b(0, gVar2, bVar, L1);
                    }
                }
            }
        }
        m30440b(0, fVar, bVar, L1);
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                C7806e eVar3 = (C7806e) n1.get(i4);
                if (eVar3 instanceof C7800a) {
                    C7800a aVar = (C7800a) eVar3;
                    if (aVar.mo22562t1() == 0) {
                        m30441c(0, aVar, bVar, 0, L1);
                    }
                }
            }
        }
        if (R == C7806e.C7808b.FIXED) {
            fVar.mo22600F0(0, fVar.mo22683v());
        } else {
            fVar.mo22598E0(0);
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            C7806e eVar4 = (C7806e) n1.get(i5);
            if (eVar4 instanceof C7810g) {
                C7810g gVar3 = (C7810g) eVar4;
                if (gVar3.mo22719o1() == 0) {
                    if (gVar3.mo22720p1() != -1) {
                        gVar3.mo22723s1(gVar3.mo22720p1());
                    } else if (gVar3.mo22721q1() != -1 && fVar.mo22557m0()) {
                        gVar3.mo22723s1(fVar.mo22683v() - gVar3.mo22721q1());
                    } else if (fVar.mo22557m0()) {
                        gVar3.mo22723s1((int) ((gVar3.mo22722r1() * ((float) fVar.mo22683v())) + 0.5f));
                    }
                    z3 = true;
                }
            } else if ((eVar4 instanceof C7800a) && ((C7800a) eVar4).mo22562t1() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                C7806e eVar5 = (C7806e) n1.get(i6);
                if (eVar5 instanceof C7810g) {
                    C7810g gVar4 = (C7810g) eVar5;
                    if (gVar4.mo22719o1() == 0) {
                        m30447i(1, gVar4, bVar);
                    }
                }
            }
        }
        m30447i(0, fVar, bVar);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                C7806e eVar6 = (C7806e) n1.get(i7);
                if (eVar6 instanceof C7800a) {
                    C7800a aVar2 = (C7800a) eVar6;
                    if (aVar2.mo22562t1() == 1) {
                        m30441c(0, aVar2, bVar, 1, L1);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            C7806e eVar7 = (C7806e) n1.get(i8);
            if (eVar7.mo22662k0() && m30439a(0, eVar7)) {
                C7809f.m29666O1(0, eVar7, bVar, f23120a, C8006b.C8007a.f23074k);
                if (!(eVar7 instanceof C7810g)) {
                    m30440b(0, eVar7, bVar, L1);
                    m30447i(0, eVar7, bVar);
                } else if (((C7810g) eVar7).mo22719o1() == 0) {
                    m30447i(0, eVar7, bVar);
                } else {
                    m30440b(0, eVar7, bVar, L1);
                }
            }
        }
    }

    /* renamed from: i */
    private static void m30447i(int i, C7806e eVar, C8006b.C8008b bVar) {
        boolean z;
        C7803d dVar;
        C7803d dVar2;
        boolean z2;
        C7803d dVar3;
        C7803d dVar4;
        C7806e eVar2 = eVar;
        C8006b.C8008b bVar2 = bVar;
        if (!eVar.mo22669n0()) {
            f23122c++;
            if (!(eVar2 instanceof C7809f) && eVar.mo22662k0()) {
                int i2 = i + 1;
                if (m30439a(i2, eVar2)) {
                    C7809f.m29666O1(i2, eVar2, bVar2, new C8006b.C8007a(), C8006b.C8007a.f23074k);
                }
            }
            C7803d m = eVar2.mo22666m(C7803d.C7805b.TOP);
            C7803d m2 = eVar2.mo22666m(C7803d.C7805b.BOTTOM);
            int d = m.mo22572d();
            int d2 = m2.mo22572d();
            if (m.mo22571c() != null && m.mo22581m()) {
                Iterator it = m.mo22571c().iterator();
                while (it.hasNext()) {
                    C7803d dVar5 = (C7803d) it.next();
                    C7806e eVar3 = dVar5.f22558d;
                    int i3 = i + 1;
                    boolean a = m30439a(i3, eVar3);
                    if (eVar3.mo22662k0() && a) {
                        C7809f.m29666O1(i3, eVar3, bVar2, new C8006b.C8007a(), C8006b.C8007a.f23074k);
                    }
                    if ((dVar5 != eVar3.f22601P || (dVar4 = eVar3.f22603R.f22560f) == null || !dVar4.mo22581m()) && (dVar5 != eVar3.f22603R || (dVar3 = eVar3.f22601P.f22560f) == null || !dVar3.mo22581m())) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    C7806e.C7808b R = eVar3.mo22621R();
                    C7806e.C7808b bVar3 = C7806e.C7808b.MATCH_CONSTRAINT;
                    if (R != bVar3 || a) {
                        if (!eVar3.mo22662k0()) {
                            C7803d dVar6 = eVar3.f22601P;
                            if (dVar5 == dVar6 && eVar3.f22603R.f22560f == null) {
                                int e = dVar6.mo22573e() + d;
                                eVar3.mo22600F0(e, eVar3.mo22683v() + e);
                                m30447i(i3, eVar3, bVar2);
                            } else {
                                C7803d dVar7 = eVar3.f22603R;
                                if (dVar5 == dVar7 && dVar6.f22560f == null) {
                                    int e2 = d - dVar7.mo22573e();
                                    eVar3.mo22600F0(e2 - eVar3.mo22683v(), e2);
                                    m30447i(i3, eVar3, bVar2);
                                } else if (z2 && !eVar3.mo22656i0()) {
                                    m30444f(i3, bVar2, eVar3);
                                }
                            }
                        }
                    } else if (eVar3.mo22621R() == bVar3 && eVar3.f22582D >= 0 && eVar3.f22580C >= 0) {
                        if ((eVar3.mo22625T() == 8 || (eVar3.f22658x == 0 && eVar3.mo22680t() == Utils.FLOAT_EPSILON)) && !eVar3.mo22656i0() && !eVar3.mo22659j0() && z2 && !eVar3.mo22656i0()) {
                            m30445g(i3, eVar2, bVar2, eVar3);
                        }
                    }
                }
            }
            if (!(eVar2 instanceof C7810g)) {
                if (m2.mo22571c() != null && m2.mo22581m()) {
                    Iterator it2 = m2.mo22571c().iterator();
                    while (it2.hasNext()) {
                        C7803d dVar8 = (C7803d) it2.next();
                        C7806e eVar4 = dVar8.f22558d;
                        int i4 = i + 1;
                        boolean a2 = m30439a(i4, eVar4);
                        if (eVar4.mo22662k0() && a2) {
                            C7809f.m29666O1(i4, eVar4, bVar2, new C8006b.C8007a(), C8006b.C8007a.f23074k);
                        }
                        if ((dVar8 != eVar4.f22601P || (dVar2 = eVar4.f22603R.f22560f) == null || !dVar2.mo22581m()) && (dVar8 != eVar4.f22603R || (dVar = eVar4.f22601P.f22560f) == null || !dVar.mo22581m())) {
                            z = false;
                        } else {
                            z = true;
                        }
                        C7806e.C7808b R2 = eVar4.mo22621R();
                        C7806e.C7808b bVar4 = C7806e.C7808b.MATCH_CONSTRAINT;
                        if (R2 != bVar4 || a2) {
                            if (!eVar4.mo22662k0()) {
                                C7803d dVar9 = eVar4.f22601P;
                                if (dVar8 == dVar9 && eVar4.f22603R.f22560f == null) {
                                    int e3 = dVar9.mo22573e() + d2;
                                    eVar4.mo22600F0(e3, eVar4.mo22683v() + e3);
                                    m30447i(i4, eVar4, bVar2);
                                } else {
                                    C7803d dVar10 = eVar4.f22603R;
                                    if (dVar8 == dVar10 && dVar9.f22560f == null) {
                                        int e4 = d2 - dVar10.mo22573e();
                                        eVar4.mo22600F0(e4 - eVar4.mo22683v(), e4);
                                        m30447i(i4, eVar4, bVar2);
                                    } else if (z && !eVar4.mo22656i0()) {
                                        m30444f(i4, bVar2, eVar4);
                                    }
                                }
                            }
                        } else if (eVar4.mo22621R() == bVar4 && eVar4.f22582D >= 0 && eVar4.f22580C >= 0) {
                            if ((eVar4.mo22625T() == 8 || (eVar4.f22658x == 0 && eVar4.mo22680t() == Utils.FLOAT_EPSILON)) && !eVar4.mo22656i0() && !eVar4.mo22659j0() && z && !eVar4.mo22656i0()) {
                                m30445g(i4, eVar2, bVar2, eVar4);
                            }
                        }
                    }
                }
                C7803d m3 = eVar2.mo22666m(C7803d.C7805b.BASELINE);
                if (m3.mo22571c() != null && m3.mo22581m()) {
                    int d3 = m3.mo22572d();
                    Iterator it3 = m3.mo22571c().iterator();
                    while (it3.hasNext()) {
                        C7803d dVar11 = (C7803d) it3.next();
                        C7806e eVar5 = dVar11.f22558d;
                        int i5 = i + 1;
                        boolean a3 = m30439a(i5, eVar5);
                        if (eVar5.mo22662k0() && a3) {
                            C7809f.m29666O1(i5, eVar5, bVar2, new C8006b.C8007a(), C8006b.C8007a.f23074k);
                        }
                        if ((eVar5.mo22621R() != C7806e.C7808b.MATCH_CONSTRAINT || a3) && !eVar5.mo22662k0() && dVar11 == eVar5.f22604S) {
                            eVar5.mo22592B0(dVar11.mo22573e() + d3);
                            try {
                                m30447i(i5, eVar5, bVar2);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }
                eVar.mo22673p0();
            }
        }
    }
}
