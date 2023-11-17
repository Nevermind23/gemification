package p227r;

import java.util.ArrayList;
import p214q.C7803d;
import p214q.C7806e;
import p214q.C7810g;
import p214q.C7813i;

/* renamed from: r.i */
public abstract class C8016i {
    /* renamed from: a */
    public static C8024o m30448a(C7806e eVar, int i, ArrayList arrayList, C8024o oVar) {
        int i2;
        int o1;
        if (i == 0) {
            i2 = eVar.f22593I0;
        } else {
            i2 = eVar.f22595J0;
        }
        int i3 = 0;
        if (i2 != -1 && (oVar == null || i2 != oVar.f23138b)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                C8024o oVar2 = (C8024o) arrayList.get(i4);
                if (oVar2.mo23187c() == i2) {
                    if (oVar != null) {
                        oVar.mo23190g(i, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i4++;
                }
            }
        } else if (i2 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((eVar instanceof C7813i) && (o1 = ((C7813i) eVar).mo22732o1(i)) != -1) {
                int i5 = 0;
                while (true) {
                    if (i5 >= arrayList.size()) {
                        break;
                    }
                    C8024o oVar3 = (C8024o) arrayList.get(i5);
                    if (oVar3.mo23187c() == o1) {
                        oVar = oVar3;
                        break;
                    }
                    i5++;
                }
            }
            if (oVar == null) {
                oVar = new C8024o(i);
            }
            arrayList.add(oVar);
        }
        if (oVar.mo23185a(eVar)) {
            if (eVar instanceof C7810g) {
                C7810g gVar = (C7810g) eVar;
                C7803d n1 = gVar.mo22718n1();
                if (gVar.mo22719o1() == 0) {
                    i3 = 1;
                }
                n1.mo22570b(i3, arrayList, oVar);
            }
            if (i == 0) {
                eVar.f22593I0 = oVar.mo23187c();
                eVar.f22600O.mo22570b(i, arrayList, oVar);
                eVar.f22602Q.mo22570b(i, arrayList, oVar);
            } else {
                eVar.f22595J0 = oVar.mo23187c();
                eVar.f22601P.mo22570b(i, arrayList, oVar);
                eVar.f22604S.mo22570b(i, arrayList, oVar);
                eVar.f22603R.mo22570b(i, arrayList, oVar);
            }
            eVar.f22607V.mo22570b(i, arrayList, oVar);
        }
        return oVar;
    }

    /* renamed from: b */
    private static C8024o m30449b(ArrayList arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C8024o oVar = (C8024o) arrayList.get(i2);
            if (i == oVar.f23138b) {
                return oVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:172:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x038b  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0390 A[ADDED_TO_REGION] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m30450c(p214q.C7809f r16, p227r.C8006b.C8008b r17) {
        /*
            r0 = r16
            java.util.ArrayList r1 = r16.mo22734n1()
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        L_0x000c:
            if (r4 >= r2) goto L_0x002e
            java.lang.Object r5 = r1.get(r4)
            q.e r5 = (p214q.C7806e) r5
            q.e$b r6 = r16.mo22687y()
            q.e$b r7 = r16.mo22621R()
            q.e$b r8 = r5.mo22687y()
            q.e$b r5 = r5.mo22621R()
            boolean r5 = m30451d(r6, r7, r8, r5)
            if (r5 != 0) goto L_0x002b
            return r3
        L_0x002b:
            int r4 = r4 + 1
            goto L_0x000c
        L_0x002e:
            r5 = r3
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0035:
            if (r5 >= r2) goto L_0x0111
            java.lang.Object r13 = r1.get(r5)
            q.e r13 = (p214q.C7806e) r13
            q.e$b r14 = r16.mo22687y()
            q.e$b r15 = r16.mo22621R()
            q.e$b r4 = r13.mo22687y()
            q.e$b r12 = r13.mo22621R()
            boolean r4 = m30451d(r14, r15, r4, r12)
            if (r4 != 0) goto L_0x005d
            r.b$a r4 = r0.f22700p1
            int r12 = p227r.C8006b.C8007a.f23074k
            r14 = r17
            p214q.C7809f.m29666O1(r3, r13, r14, r4, r12)
            goto L_0x005f
        L_0x005d:
            r14 = r17
        L_0x005f:
            boolean r4 = r13 instanceof p214q.C7810g
            if (r4 == 0) goto L_0x0088
            r12 = r13
            q.g r12 = (p214q.C7810g) r12
            int r15 = r12.mo22719o1()
            if (r15 != 0) goto L_0x0076
            if (r8 != 0) goto L_0x0073
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x0073:
            r8.add(r12)
        L_0x0076:
            int r15 = r12.mo22719o1()
            r3 = 1
            if (r15 != r3) goto L_0x0088
            if (r6 != 0) goto L_0x0085
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r6 = r3
        L_0x0085:
            r6.add(r12)
        L_0x0088:
            boolean r3 = r13 instanceof p214q.C7813i
            if (r3 == 0) goto L_0x00cc
            boolean r3 = r13 instanceof p214q.C7800a
            if (r3 == 0) goto L_0x00b5
            r3 = r13
            q.a r3 = (p214q.C7800a) r3
            int r12 = r3.mo22562t1()
            if (r12 != 0) goto L_0x00a3
            if (r7 != 0) goto L_0x00a0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x00a0:
            r7.add(r3)
        L_0x00a3:
            int r12 = r3.mo22562t1()
            r15 = 1
            if (r12 != r15) goto L_0x00cc
            if (r9 != 0) goto L_0x00b1
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x00b1:
            r9.add(r3)
            goto L_0x00cc
        L_0x00b5:
            r3 = r13
            q.i r3 = (p214q.C7813i) r3
            if (r7 != 0) goto L_0x00bf
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x00bf:
            r7.add(r3)
            if (r9 != 0) goto L_0x00c9
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x00c9:
            r9.add(r3)
        L_0x00cc:
            q.d r3 = r13.f22600O
            q.d r3 = r3.f22560f
            if (r3 != 0) goto L_0x00e9
            q.d r3 = r13.f22602Q
            q.d r3 = r3.f22560f
            if (r3 != 0) goto L_0x00e9
            if (r4 != 0) goto L_0x00e9
            boolean r3 = r13 instanceof p214q.C7800a
            if (r3 != 0) goto L_0x00e9
            if (r10 != 0) goto L_0x00e6
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r10 = r3
        L_0x00e6:
            r10.add(r13)
        L_0x00e9:
            q.d r3 = r13.f22601P
            q.d r3 = r3.f22560f
            if (r3 != 0) goto L_0x010c
            q.d r3 = r13.f22603R
            q.d r3 = r3.f22560f
            if (r3 != 0) goto L_0x010c
            q.d r3 = r13.f22604S
            q.d r3 = r3.f22560f
            if (r3 != 0) goto L_0x010c
            if (r4 != 0) goto L_0x010c
            boolean r3 = r13 instanceof p214q.C7800a
            if (r3 != 0) goto L_0x010c
            if (r11 != 0) goto L_0x0109
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r11 = r3
        L_0x0109:
            r11.add(r13)
        L_0x010c:
            int r5 = r5 + 1
            r3 = 0
            goto L_0x0035
        L_0x0111:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r6 == 0) goto L_0x012e
            java.util.Iterator r4 = r6.iterator()
        L_0x011c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x012e
            java.lang.Object r5 = r4.next()
            q.g r5 = (p214q.C7810g) r5
            r6 = 0
            r12 = 0
            m30448a(r5, r12, r3, r6)
            goto L_0x011c
        L_0x012e:
            r6 = 0
            r12 = 0
            if (r7 == 0) goto L_0x014f
            java.util.Iterator r4 = r7.iterator()
        L_0x0136:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x014f
            java.lang.Object r5 = r4.next()
            q.i r5 = (p214q.C7813i) r5
            r.o r7 = m30448a(r5, r12, r3, r6)
            r5.mo22731n1(r3, r12, r7)
            r7.mo23186b(r3)
            r6 = 0
            r12 = 0
            goto L_0x0136
        L_0x014f:
            q.d$b r4 = p214q.C7803d.C7805b.LEFT
            q.d r4 = r0.mo22666m(r4)
            java.util.HashSet r5 = r4.mo22571c()
            if (r5 == 0) goto L_0x0177
            java.util.HashSet r4 = r4.mo22571c()
            java.util.Iterator r4 = r4.iterator()
        L_0x0163:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0177
            java.lang.Object r5 = r4.next()
            q.d r5 = (p214q.C7803d) r5
            q.e r5 = r5.f22558d
            r6 = 0
            r7 = 0
            m30448a(r5, r7, r3, r6)
            goto L_0x0163
        L_0x0177:
            q.d$b r4 = p214q.C7803d.C7805b.RIGHT
            q.d r4 = r0.mo22666m(r4)
            java.util.HashSet r5 = r4.mo22571c()
            if (r5 == 0) goto L_0x019f
            java.util.HashSet r4 = r4.mo22571c()
            java.util.Iterator r4 = r4.iterator()
        L_0x018b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x019f
            java.lang.Object r5 = r4.next()
            q.d r5 = (p214q.C7803d) r5
            q.e r5 = r5.f22558d
            r6 = 0
            r7 = 0
            m30448a(r5, r7, r3, r6)
            goto L_0x018b
        L_0x019f:
            q.d$b r4 = p214q.C7803d.C7805b.CENTER
            q.d r4 = r0.mo22666m(r4)
            java.util.HashSet r5 = r4.mo22571c()
            if (r5 == 0) goto L_0x01c7
            java.util.HashSet r4 = r4.mo22571c()
            java.util.Iterator r4 = r4.iterator()
        L_0x01b3:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01c7
            java.lang.Object r5 = r4.next()
            q.d r5 = (p214q.C7803d) r5
            q.e r5 = r5.f22558d
            r6 = 0
            r7 = 0
            m30448a(r5, r7, r3, r6)
            goto L_0x01b3
        L_0x01c7:
            r6 = 0
            r7 = 0
            if (r10 == 0) goto L_0x01df
            java.util.Iterator r4 = r10.iterator()
        L_0x01cf:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01df
            java.lang.Object r5 = r4.next()
            q.e r5 = (p214q.C7806e) r5
            m30448a(r5, r7, r3, r6)
            goto L_0x01cf
        L_0x01df:
            if (r8 == 0) goto L_0x01f6
            java.util.Iterator r4 = r8.iterator()
        L_0x01e5:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01f6
            java.lang.Object r5 = r4.next()
            q.g r5 = (p214q.C7810g) r5
            r7 = 1
            m30448a(r5, r7, r3, r6)
            goto L_0x01e5
        L_0x01f6:
            r7 = 1
            if (r9 == 0) goto L_0x0216
            java.util.Iterator r4 = r9.iterator()
        L_0x01fd:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0216
            java.lang.Object r5 = r4.next()
            q.i r5 = (p214q.C7813i) r5
            r.o r8 = m30448a(r5, r7, r3, r6)
            r5.mo22731n1(r3, r7, r8)
            r8.mo23186b(r3)
            r6 = 0
            r7 = 1
            goto L_0x01fd
        L_0x0216:
            q.d$b r4 = p214q.C7803d.C7805b.TOP
            q.d r4 = r0.mo22666m(r4)
            java.util.HashSet r5 = r4.mo22571c()
            if (r5 == 0) goto L_0x023e
            java.util.HashSet r4 = r4.mo22571c()
            java.util.Iterator r4 = r4.iterator()
        L_0x022a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x023e
            java.lang.Object r5 = r4.next()
            q.d r5 = (p214q.C7803d) r5
            q.e r5 = r5.f22558d
            r6 = 1
            r7 = 0
            m30448a(r5, r6, r3, r7)
            goto L_0x022a
        L_0x023e:
            q.d$b r4 = p214q.C7803d.C7805b.BASELINE
            q.d r4 = r0.mo22666m(r4)
            java.util.HashSet r5 = r4.mo22571c()
            if (r5 == 0) goto L_0x0266
            java.util.HashSet r4 = r4.mo22571c()
            java.util.Iterator r4 = r4.iterator()
        L_0x0252:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0266
            java.lang.Object r5 = r4.next()
            q.d r5 = (p214q.C7803d) r5
            q.e r5 = r5.f22558d
            r6 = 1
            r7 = 0
            m30448a(r5, r6, r3, r7)
            goto L_0x0252
        L_0x0266:
            q.d$b r4 = p214q.C7803d.C7805b.BOTTOM
            q.d r4 = r0.mo22666m(r4)
            java.util.HashSet r5 = r4.mo22571c()
            if (r5 == 0) goto L_0x028e
            java.util.HashSet r4 = r4.mo22571c()
            java.util.Iterator r4 = r4.iterator()
        L_0x027a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x028e
            java.lang.Object r5 = r4.next()
            q.d r5 = (p214q.C7803d) r5
            q.e r5 = r5.f22558d
            r6 = 1
            r7 = 0
            m30448a(r5, r6, r3, r7)
            goto L_0x027a
        L_0x028e:
            q.d$b r4 = p214q.C7803d.C7805b.CENTER
            q.d r4 = r0.mo22666m(r4)
            java.util.HashSet r5 = r4.mo22571c()
            if (r5 == 0) goto L_0x02b6
            java.util.HashSet r4 = r4.mo22571c()
            java.util.Iterator r4 = r4.iterator()
        L_0x02a2:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02b6
            java.lang.Object r5 = r4.next()
            q.d r5 = (p214q.C7803d) r5
            q.e r5 = r5.f22558d
            r6 = 0
            r7 = 1
            m30448a(r5, r7, r3, r6)
            goto L_0x02a2
        L_0x02b6:
            r6 = 0
            r7 = 1
            if (r11 == 0) goto L_0x02ce
            java.util.Iterator r4 = r11.iterator()
        L_0x02be:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02ce
            java.lang.Object r5 = r4.next()
            q.e r5 = (p214q.C7806e) r5
            m30448a(r5, r7, r3, r6)
            goto L_0x02be
        L_0x02ce:
            r4 = 0
        L_0x02cf:
            if (r4 >= r2) goto L_0x02fb
            java.lang.Object r5 = r1.get(r4)
            q.e r5 = (p214q.C7806e) r5
            boolean r7 = r5.mo22675q0()
            if (r7 == 0) goto L_0x02f8
            int r7 = r5.f22593I0
            r.o r7 = m30449b(r3, r7)
            int r5 = r5.f22595J0
            r.o r5 = m30449b(r3, r5)
            if (r7 == 0) goto L_0x02f8
            if (r5 == 0) goto L_0x02f8
            r8 = 0
            r7.mo23190g(r8, r5)
            r8 = 2
            r5.mo23192i(r8)
            r3.remove(r7)
        L_0x02f8:
            int r4 = r4 + 1
            goto L_0x02cf
        L_0x02fb:
            int r1 = r3.size()
            r2 = 1
            if (r1 > r2) goto L_0x0304
            r1 = 0
            return r1
        L_0x0304:
            q.e$b r1 = r16.mo22687y()
            q.e$b r2 = p214q.C7806e.C7808b.WRAP_CONTENT
            if (r1 != r2) goto L_0x0346
            java.util.Iterator r1 = r3.iterator()
            r2 = r6
            r12 = 0
        L_0x0312:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0337
            java.lang.Object r4 = r1.next()
            r.o r4 = (p227r.C8024o) r4
            int r5 = r4.mo23188d()
            r7 = 1
            if (r5 != r7) goto L_0x0326
            goto L_0x0312
        L_0x0326:
            r5 = 0
            r4.mo23191h(r5)
            n.d r7 = r16.mo22698H1()
            int r7 = r4.mo23189f(r7, r5)
            if (r7 <= r12) goto L_0x0312
            r2 = r4
            r12 = r7
            goto L_0x0312
        L_0x0337:
            if (r2 == 0) goto L_0x0346
            q.e$b r1 = p214q.C7806e.C7808b.FIXED
            r0.mo22614M0(r1)
            r0.mo22653g1(r12)
            r1 = 1
            r2.mo23191h(r1)
            goto L_0x0347
        L_0x0346:
            r2 = r6
        L_0x0347:
            q.e$b r1 = r16.mo22621R()
            q.e$b r4 = p214q.C7806e.C7808b.WRAP_CONTENT
            if (r1 != r4) goto L_0x038b
            java.util.Iterator r1 = r3.iterator()
            r3 = r6
            r12 = 0
        L_0x0355:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x037a
            java.lang.Object r4 = r1.next()
            r.o r4 = (p227r.C8024o) r4
            int r5 = r4.mo23188d()
            if (r5 != 0) goto L_0x0368
            goto L_0x0355
        L_0x0368:
            r5 = 0
            r4.mo23191h(r5)
            n.d r7 = r16.mo22698H1()
            r8 = 1
            int r7 = r4.mo23189f(r7, r8)
            if (r7 <= r12) goto L_0x0355
            r3 = r4
            r12 = r7
            goto L_0x0355
        L_0x037a:
            r5 = 0
            r8 = 1
            if (r3 == 0) goto L_0x038d
            q.e$b r1 = p214q.C7806e.C7808b.FIXED
            r0.mo22644c1(r1)
            r0.mo22606I0(r12)
            r3.mo23191h(r8)
            r4 = r3
            goto L_0x038e
        L_0x038b:
            r5 = 0
            r8 = 1
        L_0x038d:
            r4 = r6
        L_0x038e:
            if (r2 != 0) goto L_0x0395
            if (r4 == 0) goto L_0x0393
            goto L_0x0395
        L_0x0393:
            r3 = r5
            goto L_0x0396
        L_0x0395:
            r3 = r8
        L_0x0396:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p227r.C8016i.m30450c(q.f, r.b$b):boolean");
    }

    /* renamed from: d */
    public static boolean m30451d(C7806e.C7808b bVar, C7806e.C7808b bVar2, C7806e.C7808b bVar3, C7806e.C7808b bVar4) {
        boolean z;
        boolean z2;
        C7806e.C7808b bVar5;
        C7806e.C7808b bVar6;
        C7806e.C7808b bVar7 = C7806e.C7808b.FIXED;
        if (bVar3 == bVar7 || bVar3 == (bVar6 = C7806e.C7808b.WRAP_CONTENT) || (bVar3 == C7806e.C7808b.MATCH_PARENT && bVar != bVar6)) {
            z = true;
        } else {
            z = false;
        }
        if (bVar4 == bVar7 || bVar4 == (bVar5 = C7806e.C7808b.WRAP_CONTENT) || (bVar4 == C7806e.C7808b.MATCH_PARENT && bVar2 != bVar5)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }
}
