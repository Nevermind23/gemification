package p227r;

import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import p175n.C7174d;
import p214q.C7803d;
import p214q.C7806e;
import p214q.C7809f;
import p214q.C7810g;
import p214q.C7812h;
import p214q.C7814j;

/* renamed from: r.b */
public class C8006b {

    /* renamed from: a */
    private final ArrayList f23071a = new ArrayList();

    /* renamed from: b */
    private C8007a f23072b = new C8007a();

    /* renamed from: c */
    private C7809f f23073c;

    /* renamed from: r.b$a */
    public static class C8007a {

        /* renamed from: k */
        public static int f23074k = 0;

        /* renamed from: l */
        public static int f23075l = 1;

        /* renamed from: m */
        public static int f23076m = 2;

        /* renamed from: a */
        public C7806e.C7808b f23077a;

        /* renamed from: b */
        public C7806e.C7808b f23078b;

        /* renamed from: c */
        public int f23079c;

        /* renamed from: d */
        public int f23080d;

        /* renamed from: e */
        public int f23081e;

        /* renamed from: f */
        public int f23082f;

        /* renamed from: g */
        public int f23083g;

        /* renamed from: h */
        public boolean f23084h;

        /* renamed from: i */
        public boolean f23085i;

        /* renamed from: j */
        public int f23086j;
    }

    /* renamed from: r.b$b */
    public interface C8008b {
        /* renamed from: a */
        void mo2896a();

        /* renamed from: b */
        void mo2897b(C7806e eVar, C8007a aVar);
    }

    public C8006b(C7809f fVar) {
        this.f23073c = fVar;
    }

    /* renamed from: a */
    private boolean m30403a(C8008b bVar, C7806e eVar, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        this.f23072b.f23077a = eVar.mo22687y();
        this.f23072b.f23078b = eVar.mo22621R();
        this.f23072b.f23079c = eVar.mo22627U();
        this.f23072b.f23080d = eVar.mo22683v();
        C8007a aVar = this.f23072b;
        aVar.f23085i = false;
        aVar.f23086j = i;
        C7806e.C7808b bVar2 = aVar.f23077a;
        C7806e.C7808b bVar3 = C7806e.C7808b.MATCH_CONSTRAINT;
        if (bVar2 == bVar3) {
            z = true;
        } else {
            z = false;
        }
        if (aVar.f23078b == bVar3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || eVar.f22619d0 <= Utils.FLOAT_EPSILON) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z2 || eVar.f22619d0 <= Utils.FLOAT_EPSILON) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z3 && eVar.f22660y[0] == 4) {
            aVar.f23077a = C7806e.C7808b.FIXED;
        }
        if (z4 && eVar.f22660y[1] == 4) {
            aVar.f23078b = C7806e.C7808b.FIXED;
        }
        bVar.mo2897b(eVar, aVar);
        eVar.mo22653g1(this.f23072b.f23081e);
        eVar.mo22606I0(this.f23072b.f23082f);
        eVar.mo22604H0(this.f23072b.f23084h);
        eVar.mo22686x0(this.f23072b.f23083g);
        C8007a aVar2 = this.f23072b;
        aVar2.f23086j = C8007a.f23074k;
        return aVar2.f23085i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0089, code lost:
        if (r8 != r9) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0090, code lost:
        if (r5.f22619d0 <= com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON) goto L_0x0093;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m30404b(p214q.C7809f r13) {
        /*
            r12 = this;
            java.util.ArrayList r0 = r13.f22713L0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.mo22705P1(r1)
            r.b$b r2 = r13.mo22696F1()
            r3 = 0
            r4 = r3
        L_0x0012:
            if (r4 >= r0) goto L_0x00a0
            java.util.ArrayList r5 = r13.f22713L0
            java.lang.Object r5 = r5.get(r4)
            q.e r5 = (p214q.C7806e) r5
            boolean r6 = r5 instanceof p214q.C7810g
            if (r6 == 0) goto L_0x0022
            goto L_0x009c
        L_0x0022:
            boolean r6 = r5 instanceof p214q.C7800a
            if (r6 == 0) goto L_0x0028
            goto L_0x009c
        L_0x0028:
            boolean r6 = r5.mo22659j0()
            if (r6 == 0) goto L_0x0030
            goto L_0x009c
        L_0x0030:
            if (r1 == 0) goto L_0x0047
            r.l r6 = r5.f22620e
            if (r6 == 0) goto L_0x0047
            r.n r7 = r5.f22622f
            if (r7 == 0) goto L_0x0047
            r.g r6 = r6.f23155e
            boolean r6 = r6.f23107j
            if (r6 == 0) goto L_0x0047
            r.g r6 = r7.f23155e
            boolean r6 = r6.f23107j
            if (r6 == 0) goto L_0x0047
            goto L_0x009c
        L_0x0047:
            q.e$b r6 = r5.mo22678s(r3)
            r7 = 1
            q.e$b r8 = r5.mo22678s(r7)
            q.e$b r9 = p214q.C7806e.C7808b.MATCH_CONSTRAINT
            if (r6 != r9) goto L_0x0060
            int r10 = r5.f22656w
            if (r10 == r7) goto L_0x0060
            if (r8 != r9) goto L_0x0060
            int r10 = r5.f22658x
            if (r10 == r7) goto L_0x0060
            r10 = r7
            goto L_0x0061
        L_0x0060:
            r10 = r3
        L_0x0061:
            if (r10 != 0) goto L_0x0093
            boolean r11 = r13.mo22705P1(r7)
            if (r11 == 0) goto L_0x0093
            if (r6 != r9) goto L_0x0078
            int r11 = r5.f22656w
            if (r11 != 0) goto L_0x0078
            if (r8 == r9) goto L_0x0078
            boolean r11 = r5.mo22652g0()
            if (r11 != 0) goto L_0x0078
            r10 = r7
        L_0x0078:
            if (r8 != r9) goto L_0x0087
            int r11 = r5.f22658x
            if (r11 != 0) goto L_0x0087
            if (r6 == r9) goto L_0x0087
            boolean r11 = r5.mo22652g0()
            if (r11 != 0) goto L_0x0087
            r10 = r7
        L_0x0087:
            if (r6 == r9) goto L_0x008b
            if (r8 != r9) goto L_0x0093
        L_0x008b:
            float r6 = r5.f22619d0
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0093
            goto L_0x0094
        L_0x0093:
            r7 = r10
        L_0x0094:
            if (r7 == 0) goto L_0x0097
            goto L_0x009c
        L_0x0097:
            int r6 = p227r.C8006b.C8007a.f23074k
            r12.m30403a(r2, r5, r6)
        L_0x009c:
            int r4 = r4 + 1
            goto L_0x0012
        L_0x00a0:
            r2.mo2896a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p227r.C8006b.m30404b(q.f):void");
    }

    /* renamed from: c */
    private void m30405c(C7809f fVar, String str, int i, int i2, int i3) {
        int G = fVar.mo22601G();
        int F = fVar.mo22599F();
        fVar.mo22632W0(0);
        fVar.mo22630V0(0);
        fVar.mo22653g1(i2);
        fVar.mo22606I0(i3);
        fVar.mo22632W0(G);
        fVar.mo22630V0(F);
        this.f23073c.mo22708T1(i);
        this.f23073c.mo22712o1();
    }

    /* renamed from: d */
    public long mo23157d(C7809f fVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean z;
        boolean z2;
        int i12;
        boolean z3;
        int i13;
        C7809f fVar2;
        boolean z4;
        boolean z5;
        int i14;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z12;
        boolean z13;
        C8006b bVar = this;
        C7809f fVar3 = fVar;
        int i15 = i;
        int i16 = i4;
        int i17 = i6;
        C8008b F1 = fVar.mo22696F1();
        int size = fVar3.f22713L0.size();
        int U = fVar.mo22627U();
        int v = fVar.mo22683v();
        boolean b = C7814j.m29727b(i15, 128);
        int i18 = 0;
        if (b || C7814j.m29727b(i15, 64)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i19 = 0;
            while (true) {
                if (i19 >= size) {
                    break;
                }
                C7806e eVar = (C7806e) fVar3.f22713L0.get(i19);
                C7806e.C7808b y = eVar.mo22687y();
                C7806e.C7808b bVar2 = C7806e.C7808b.MATCH_CONSTRAINT;
                if (y == bVar2) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (eVar.mo22621R() == bVar2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z9 || !z12 || eVar.mo22680t() <= Utils.FLOAT_EPSILON) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if ((!eVar.mo22652g0() || !z13) && ((!eVar.mo22656i0() || !z13) && !eVar.mo22652g0() && !eVar.mo22656i0())) {
                    i19++;
                }
            }
            z = false;
        }
        if (z) {
            boolean z14 = C7174d.f21247r;
        }
        if (!(i16 == 1073741824 && i17 == 1073741824) && !b) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z15 = z & z2;
        int i22 = 2;
        if (z15) {
            int min = Math.min(fVar.mo22597E(), i5);
            int min2 = Math.min(fVar.mo22595D(), i7);
            if (i16 == 1073741824 && fVar.mo22627U() != min) {
                fVar3.mo22653g1(min);
                fVar.mo22699I1();
            }
            if (i17 == 1073741824 && fVar.mo22683v() != min2) {
                fVar3.mo22606I0(min2);
                fVar.mo22699I1();
            }
            if (i16 == 1073741824 && i17 == 1073741824) {
                z3 = fVar3.mo22692B1(b);
                i12 = 2;
            } else {
                boolean C1 = fVar3.mo22693C1(b);
                if (i16 == 1073741824) {
                    C1 &= fVar3.mo22694D1(b, 0);
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                if (i17 == 1073741824) {
                    z3 = fVar3.mo22694D1(b, 1) & C1;
                    i12++;
                } else {
                    z3 = C1;
                }
            }
            if (z3) {
                if (i16 == 1073741824) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (i17 == 1073741824) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                fVar3.mo22665l1(z7, z8);
            }
        } else {
            z3 = false;
            i12 = 0;
        }
        if (z3 && i12 == 2) {
            return 0;
        }
        int G1 = fVar.mo22697G1();
        if (size > 0) {
            m30404b(fVar);
        }
        mo23158e(fVar);
        int size2 = bVar.f23071a.size();
        if (size > 0) {
            m30405c(fVar, "First pass", 0, U, v);
        }
        if (size2 > 0) {
            C7806e.C7808b y2 = fVar.mo22687y();
            C7806e.C7808b bVar3 = C7806e.C7808b.WRAP_CONTENT;
            if (y2 == bVar3) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (fVar.mo22621R() == bVar3) {
                z5 = true;
            } else {
                z5 = false;
            }
            int max = Math.max(fVar.mo22627U(), bVar.f23073c.mo22601G());
            int max2 = Math.max(fVar.mo22683v(), bVar.f23073c.mo22599F());
            for (int i23 = 0; i23 < size2; i23++) {
                C7806e eVar2 = (C7806e) bVar.f23071a.get(i23);
            }
            int i24 = 0;
            while (true) {
                if (i24 >= i22) {
                    break;
                }
                boolean z16 = i18;
                while (i18 < size2) {
                    C7806e eVar3 = (C7806e) bVar.f23071a.get(i18);
                    int i25 = size2;
                    if (!(eVar3 instanceof C7812h) && !(eVar3 instanceof C7810g) && eVar3.mo22625T() != 8 && (!z15 || !eVar3.f22620e.f23155e.f23107j || !eVar3.f22622f.f23155e.f23107j)) {
                        int U2 = eVar3.mo22627U();
                        int v2 = eVar3.mo22683v();
                        z6 = z15;
                        int n = eVar3.mo22668n();
                        int i26 = C8007a.f23075l;
                        i14 = G1;
                        if (i24 == 1) {
                            i26 = C8007a.f23076m;
                        }
                        boolean a = bVar.m30403a(F1, eVar3, i26) | z16;
                        int U3 = eVar3.mo22627U();
                        int v3 = eVar3.mo22683v();
                        if (U3 != U2) {
                            eVar3.mo22653g1(U3);
                            if (z4 && eVar3.mo22609K() > max) {
                                max = Math.max(max, eVar3.mo22609K() + eVar3.mo22666m(C7803d.C7805b.RIGHT).mo22573e());
                            }
                            a = true;
                        }
                        if (v3 != v2) {
                            eVar3.mo22606I0(v3);
                            if (z5 && eVar3.mo22672p() > max2) {
                                max2 = Math.max(max2, eVar3.mo22672p() + eVar3.mo22666m(C7803d.C7805b.BOTTOM).mo22573e());
                            }
                            a = true;
                        }
                        if (!eVar3.mo22633X() || n == eVar3.mo22668n()) {
                            z16 = a;
                        } else {
                            z16 = 1;
                        }
                    } else {
                        z6 = z15;
                        i14 = G1;
                    }
                    i18++;
                    bVar = this;
                    C7809f fVar4 = fVar;
                    size2 = i25;
                    z15 = z6;
                    G1 = i14;
                }
                boolean z17 = z15;
                int i27 = G1;
                int i28 = size2;
                if (z16 == 0) {
                    fVar2 = fVar;
                    i13 = i27;
                    break;
                }
                i24++;
                m30405c(fVar, "intermediate pass", i24, U, v);
                bVar = this;
                C7809f fVar5 = fVar;
                size2 = i28;
                z15 = z17;
                G1 = i27;
                i18 = 0;
                i22 = 2;
            }
            fVar2.mo22707S1(i13);
            return 0;
        }
        fVar2 = fVar;
        i13 = G1;
        fVar2.mo22707S1(i13);
        return 0;
    }

    /* renamed from: e */
    public void mo23158e(C7809f fVar) {
        this.f23071a.clear();
        int size = fVar.f22713L0.size();
        for (int i = 0; i < size; i++) {
            C7806e eVar = (C7806e) fVar.f22713L0.get(i);
            C7806e.C7808b y = eVar.mo22687y();
            C7806e.C7808b bVar = C7806e.C7808b.MATCH_CONSTRAINT;
            if (y == bVar || eVar.mo22621R() == bVar) {
                this.f23071a.add(eVar);
            }
        }
        fVar.mo22699I1();
    }
}
