package p227r;

import java.util.ArrayList;
import java.util.Iterator;
import p214q.C7803d;
import p214q.C7806e;
import p214q.C7809f;

/* renamed from: r.c */
public class C8009c extends C8026p {

    /* renamed from: k */
    ArrayList f23087k = new ArrayList();

    /* renamed from: l */
    private int f23088l;

    public C8009c(C7806e eVar, int i) {
        super(eVar);
        this.f23156f = i;
        m30410q();
    }

    /* renamed from: q */
    private void m30410q() {
        C7806e eVar;
        boolean z;
        int i;
        C7806e eVar2 = this.f23152b;
        C7806e J = eVar2.mo22607J(this.f23156f);
        while (true) {
            C7806e eVar3 = J;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            }
            J = eVar2.mo22607J(this.f23156f);
        }
        this.f23152b = eVar;
        this.f23087k.add(eVar.mo22611L(this.f23156f));
        C7806e H = eVar.mo22603H(this.f23156f);
        while (H != null) {
            this.f23087k.add(H.mo22611L(this.f23156f));
            H = H.mo22603H(this.f23156f);
        }
        Iterator it = this.f23087k.iterator();
        while (it.hasNext()) {
            C8026p pVar = (C8026p) it.next();
            int i2 = this.f23156f;
            if (i2 == 0) {
                pVar.f23152b.f22616c = this;
            } else if (i2 == 1) {
                pVar.f23152b.f22618d = this;
            }
        }
        if (this.f23156f != 0 || !((C7809f) this.f23152b.mo22605I()).mo22702L1()) {
            z = false;
        } else {
            z = true;
        }
        if (z && this.f23087k.size() > 1) {
            ArrayList arrayList = this.f23087k;
            this.f23152b = ((C8026p) arrayList.get(arrayList.size() - 1)).f23152b;
        }
        if (this.f23156f == 0) {
            i = this.f23152b.mo22685x();
        } else {
            i = this.f23152b.mo22619Q();
        }
        this.f23088l = i;
    }

    /* renamed from: r */
    private C7806e m30411r() {
        for (int i = 0; i < this.f23087k.size(); i++) {
            C8026p pVar = (C8026p) this.f23087k.get(i);
            if (pVar.f23152b.mo22625T() != 8) {
                return pVar.f23152b;
            }
        }
        return null;
    }

    /* renamed from: s */
    private C7806e m30412s() {
        for (int size = this.f23087k.size() - 1; size >= 0; size--) {
            C8026p pVar = (C8026p) this.f23087k.get(size);
            if (pVar.f23152b.mo22625T() != 8) {
                return pVar.f23152b;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23159a(p227r.C8010d r27) {
        /*
            r26 = this;
            r0 = r26
            r.f r1 = r0.f23158h
            boolean r1 = r1.f23107j
            if (r1 == 0) goto L_0x0427
            r.f r1 = r0.f23159i
            boolean r1 = r1.f23107j
            if (r1 != 0) goto L_0x0010
            goto L_0x0427
        L_0x0010:
            q.e r1 = r0.f23152b
            q.e r1 = r1.mo22605I()
            boolean r2 = r1 instanceof p214q.C7809f
            if (r2 == 0) goto L_0x0021
            q.f r1 = (p214q.C7809f) r1
            boolean r1 = r1.mo22702L1()
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            r.f r2 = r0.f23159i
            int r2 = r2.f23104g
            r.f r4 = r0.f23158h
            int r4 = r4.f23104g
            int r2 = r2 - r4
            java.util.ArrayList r4 = r0.f23087k
            int r4 = r4.size()
            r5 = 0
        L_0x0032:
            r6 = -1
            r7 = 8
            if (r5 >= r4) goto L_0x004a
            java.util.ArrayList r8 = r0.f23087k
            java.lang.Object r8 = r8.get(r5)
            r.p r8 = (p227r.C8026p) r8
            q.e r8 = r8.f23152b
            int r8 = r8.mo22625T()
            if (r8 != r7) goto L_0x004b
            int r5 = r5 + 1
            goto L_0x0032
        L_0x004a:
            r5 = r6
        L_0x004b:
            int r8 = r4 + -1
            r9 = r8
        L_0x004e:
            if (r9 < 0) goto L_0x0064
            java.util.ArrayList r10 = r0.f23087k
            java.lang.Object r10 = r10.get(r9)
            r.p r10 = (p227r.C8026p) r10
            q.e r10 = r10.f23152b
            int r10 = r10.mo22625T()
            if (r10 != r7) goto L_0x0063
            int r9 = r9 + -1
            goto L_0x004e
        L_0x0063:
            r6 = r9
        L_0x0064:
            r9 = 0
        L_0x0065:
            r11 = 2
            if (r9 >= r11) goto L_0x0109
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x006f:
            if (r13 >= r4) goto L_0x00fb
            java.util.ArrayList r3 = r0.f23087k
            java.lang.Object r3 = r3.get(r13)
            r.p r3 = (p227r.C8026p) r3
            q.e r11 = r3.f23152b
            int r11 = r11.mo22625T()
            if (r11 != r7) goto L_0x0083
            goto L_0x00f4
        L_0x0083:
            int r16 = r16 + 1
            if (r13 <= 0) goto L_0x008e
            if (r13 < r5) goto L_0x008e
            r.f r11 = r3.f23158h
            int r11 = r11.f23103f
            int r14 = r14 + r11
        L_0x008e:
            r.g r11 = r3.f23155e
            int r7 = r11.f23104g
            q.e$b r10 = r3.f23154d
            q.e$b r12 = p214q.C7806e.C7808b.MATCH_CONSTRAINT
            if (r10 == r12) goto L_0x009a
            r10 = 1
            goto L_0x009b
        L_0x009a:
            r10 = 0
        L_0x009b:
            if (r10 == 0) goto L_0x00bd
            int r11 = r0.f23156f
            if (r11 != 0) goto L_0x00ac
            q.e r12 = r3.f23152b
            r.l r12 = r12.f22620e
            r.g r12 = r12.f23155e
            boolean r12 = r12.f23107j
            if (r12 != 0) goto L_0x00ac
            return
        L_0x00ac:
            r12 = 1
            if (r11 != r12) goto L_0x00ba
            q.e r11 = r3.f23152b
            r.n r11 = r11.f22622f
            r.g r11 = r11.f23155e
            boolean r11 = r11.f23107j
            if (r11 != 0) goto L_0x00ba
            return
        L_0x00ba:
            r19 = r7
            goto L_0x00d3
        L_0x00bd:
            r19 = r7
            r12 = 1
            int r7 = r3.f23151a
            if (r7 != r12) goto L_0x00cb
            if (r9 != 0) goto L_0x00cb
            int r7 = r11.f23119m
            int r15 = r15 + 1
            goto L_0x00d1
        L_0x00cb:
            boolean r7 = r11.f23107j
            if (r7 == 0) goto L_0x00d3
            r7 = r19
        L_0x00d1:
            r10 = 1
            goto L_0x00d5
        L_0x00d3:
            r7 = r19
        L_0x00d5:
            if (r10 != 0) goto L_0x00e9
            int r15 = r15 + 1
            q.e r7 = r3.f23152b
            float[] r7 = r7.f22583D0
            int r10 = r0.f23156f
            r7 = r7[r10]
            r10 = 0
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 < 0) goto L_0x00ea
            float r17 = r17 + r7
            goto L_0x00ea
        L_0x00e9:
            int r14 = r14 + r7
        L_0x00ea:
            if (r13 >= r8) goto L_0x00f4
            if (r13 >= r6) goto L_0x00f4
            r.f r3 = r3.f23159i
            int r3 = r3.f23103f
            int r3 = -r3
            int r14 = r14 + r3
        L_0x00f4:
            int r13 = r13 + 1
            r7 = 8
            r11 = 2
            goto L_0x006f
        L_0x00fb:
            if (r14 < r2) goto L_0x0106
            if (r15 != 0) goto L_0x0100
            goto L_0x0106
        L_0x0100:
            int r9 = r9 + 1
            r7 = 8
            goto L_0x0065
        L_0x0106:
            r3 = r16
            goto L_0x010e
        L_0x0109:
            r3 = 0
            r14 = 0
            r15 = 0
            r17 = 0
        L_0x010e:
            r.f r7 = r0.f23158h
            int r7 = r7.f23104g
            if (r1 == 0) goto L_0x0118
            r.f r7 = r0.f23159i
            int r7 = r7.f23104g
        L_0x0118:
            r9 = 1056964608(0x3f000000, float:0.5)
            if (r14 <= r2) goto L_0x012f
            r10 = 1073741824(0x40000000, float:2.0)
            if (r1 == 0) goto L_0x0128
            int r11 = r14 - r2
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 + r10
            goto L_0x012f
        L_0x0128:
            int r11 = r14 - r2
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 - r10
        L_0x012f:
            if (r15 <= 0) goto L_0x0226
            int r10 = r2 - r14
            float r10 = (float) r10
            float r11 = (float) r15
            float r11 = r10 / r11
            float r11 = r11 + r9
            int r11 = (int) r11
            r12 = 0
            r13 = 0
        L_0x013b:
            if (r12 >= r4) goto L_0x01d8
            java.util.ArrayList r9 = r0.f23087k
            java.lang.Object r9 = r9.get(r12)
            r.p r9 = (p227r.C8026p) r9
            r19 = r11
            q.e r11 = r9.f23152b
            int r11 = r11.mo22625T()
            r20 = r14
            r14 = 8
            if (r11 != r14) goto L_0x0155
            goto L_0x01be
        L_0x0155:
            q.e$b r11 = r9.f23154d
            q.e$b r14 = p214q.C7806e.C7808b.MATCH_CONSTRAINT
            if (r11 != r14) goto L_0x01be
            r.g r11 = r9.f23155e
            boolean r14 = r11.f23107j
            if (r14 != 0) goto L_0x01be
            r14 = 0
            int r18 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r18 <= 0) goto L_0x0178
            q.e r14 = r9.f23152b
            float[] r14 = r14.f22583D0
            r21 = r7
            int r7 = r0.f23156f
            r7 = r14[r7]
            float r7 = r7 * r10
            float r7 = r7 / r17
            r14 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r14
            int r7 = (int) r7
            goto L_0x017c
        L_0x0178:
            r21 = r7
            r7 = r19
        L_0x017c:
            int r14 = r0.f23156f
            if (r14 != 0) goto L_0x018b
            q.e r14 = r9.f23152b
            r22 = r10
            int r10 = r14.f22576A
            int r14 = r14.f22662z
            r23 = r1
            goto L_0x019a
        L_0x018b:
            r22 = r10
            q.e r10 = r9.f23152b
            int r14 = r10.f22582D
            int r10 = r10.f22580C
            r23 = r1
            r25 = r14
            r14 = r10
            r10 = r25
        L_0x019a:
            int r1 = r9.f23151a
            r24 = r3
            r3 = 1
            if (r1 != r3) goto L_0x01a8
            int r1 = r11.f23119m
            int r1 = java.lang.Math.min(r7, r1)
            goto L_0x01a9
        L_0x01a8:
            r1 = r7
        L_0x01a9:
            int r1 = java.lang.Math.max(r14, r1)
            if (r10 <= 0) goto L_0x01b3
            int r1 = java.lang.Math.min(r10, r1)
        L_0x01b3:
            if (r1 == r7) goto L_0x01b8
            int r13 = r13 + 1
            r7 = r1
        L_0x01b8:
            r.g r1 = r9.f23155e
            r1.mo23177d(r7)
            goto L_0x01c6
        L_0x01be:
            r23 = r1
            r24 = r3
            r21 = r7
            r22 = r10
        L_0x01c6:
            int r12 = r12 + 1
            r11 = r19
            r14 = r20
            r7 = r21
            r10 = r22
            r1 = r23
            r3 = r24
            r9 = 1056964608(0x3f000000, float:0.5)
            goto L_0x013b
        L_0x01d8:
            r23 = r1
            r24 = r3
            r21 = r7
            r20 = r14
            if (r13 <= 0) goto L_0x0217
            int r15 = r15 - r13
            r1 = 0
            r3 = 0
        L_0x01e5:
            if (r1 >= r4) goto L_0x0215
            java.util.ArrayList r7 = r0.f23087k
            java.lang.Object r7 = r7.get(r1)
            r.p r7 = (p227r.C8026p) r7
            q.e r9 = r7.f23152b
            int r9 = r9.mo22625T()
            r10 = 8
            if (r9 != r10) goto L_0x01fa
            goto L_0x0212
        L_0x01fa:
            if (r1 <= 0) goto L_0x0203
            if (r1 < r5) goto L_0x0203
            r.f r9 = r7.f23158h
            int r9 = r9.f23103f
            int r3 = r3 + r9
        L_0x0203:
            r.g r9 = r7.f23155e
            int r9 = r9.f23104g
            int r3 = r3 + r9
            if (r1 >= r8) goto L_0x0212
            if (r1 >= r6) goto L_0x0212
            r.f r7 = r7.f23159i
            int r7 = r7.f23103f
            int r7 = -r7
            int r3 = r3 + r7
        L_0x0212:
            int r1 = r1 + 1
            goto L_0x01e5
        L_0x0215:
            r14 = r3
            goto L_0x0219
        L_0x0217:
            r14 = r20
        L_0x0219:
            int r1 = r0.f23088l
            r3 = 2
            if (r1 != r3) goto L_0x0224
            if (r13 != 0) goto L_0x0224
            r1 = 0
            r0.f23088l = r1
            goto L_0x0230
        L_0x0224:
            r1 = 0
            goto L_0x0230
        L_0x0226:
            r23 = r1
            r24 = r3
            r21 = r7
            r20 = r14
            r1 = 0
            r3 = 2
        L_0x0230:
            if (r14 <= r2) goto L_0x0234
            r0.f23088l = r3
        L_0x0234:
            if (r24 <= 0) goto L_0x023c
            if (r15 != 0) goto L_0x023c
            if (r5 != r6) goto L_0x023c
            r0.f23088l = r3
        L_0x023c:
            int r3 = r0.f23088l
            r7 = 1
            if (r3 != r7) goto L_0x02e0
            r9 = r24
            if (r9 <= r7) goto L_0x024a
            int r2 = r2 - r14
            int r3 = r9 + -1
            int r2 = r2 / r3
            goto L_0x0251
        L_0x024a:
            if (r9 != r7) goto L_0x0250
            int r2 = r2 - r14
            r3 = 2
            int r2 = r2 / r3
            goto L_0x0251
        L_0x0250:
            r2 = r1
        L_0x0251:
            if (r15 <= 0) goto L_0x0254
            r2 = r1
        L_0x0254:
            r3 = r1
            r7 = r21
        L_0x0257:
            if (r3 >= r4) goto L_0x0427
            if (r23 == 0) goto L_0x0260
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L_0x0261
        L_0x0260:
            r1 = r3
        L_0x0261:
            java.util.ArrayList r9 = r0.f23087k
            java.lang.Object r1 = r9.get(r1)
            r.p r1 = (p227r.C8026p) r1
            q.e r9 = r1.f23152b
            int r9 = r9.mo22625T()
            r10 = 8
            if (r9 != r10) goto L_0x027e
            r.f r9 = r1.f23158h
            r9.mo23177d(r7)
            r.f r1 = r1.f23159i
            r1.mo23177d(r7)
            goto L_0x02dc
        L_0x027e:
            if (r3 <= 0) goto L_0x0285
            if (r23 == 0) goto L_0x0284
            int r7 = r7 - r2
            goto L_0x0285
        L_0x0284:
            int r7 = r7 + r2
        L_0x0285:
            if (r3 <= 0) goto L_0x0296
            if (r3 < r5) goto L_0x0296
            if (r23 == 0) goto L_0x0291
            r.f r9 = r1.f23158h
            int r9 = r9.f23103f
            int r7 = r7 - r9
            goto L_0x0296
        L_0x0291:
            r.f r9 = r1.f23158h
            int r9 = r9.f23103f
            int r7 = r7 + r9
        L_0x0296:
            if (r23 == 0) goto L_0x029e
            r.f r9 = r1.f23159i
            r9.mo23177d(r7)
            goto L_0x02a3
        L_0x029e:
            r.f r9 = r1.f23158h
            r9.mo23177d(r7)
        L_0x02a3:
            r.g r9 = r1.f23155e
            int r10 = r9.f23104g
            q.e$b r11 = r1.f23154d
            q.e$b r12 = p214q.C7806e.C7808b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x02b4
            int r11 = r1.f23151a
            r12 = 1
            if (r11 != r12) goto L_0x02b4
            int r10 = r9.f23119m
        L_0x02b4:
            if (r23 == 0) goto L_0x02b8
            int r7 = r7 - r10
            goto L_0x02b9
        L_0x02b8:
            int r7 = r7 + r10
        L_0x02b9:
            if (r23 == 0) goto L_0x02c1
            r.f r9 = r1.f23158h
            r9.mo23177d(r7)
            goto L_0x02c6
        L_0x02c1:
            r.f r9 = r1.f23159i
            r9.mo23177d(r7)
        L_0x02c6:
            r9 = 1
            r1.f23157g = r9
            if (r3 >= r8) goto L_0x02dc
            if (r3 >= r6) goto L_0x02dc
            if (r23 == 0) goto L_0x02d6
            r.f r1 = r1.f23159i
            int r1 = r1.f23103f
            int r1 = -r1
            int r7 = r7 - r1
            goto L_0x02dc
        L_0x02d6:
            r.f r1 = r1.f23159i
            int r1 = r1.f23103f
            int r1 = -r1
            int r7 = r7 + r1
        L_0x02dc:
            int r3 = r3 + 1
            goto L_0x0257
        L_0x02e0:
            r9 = r24
            if (r3 != 0) goto L_0x0377
            int r2 = r2 - r14
            r3 = 1
            int r7 = r9 + 1
            int r2 = r2 / r7
            if (r15 <= 0) goto L_0x02ec
            r2 = r1
        L_0x02ec:
            r3 = r1
            r7 = r21
        L_0x02ef:
            if (r3 >= r4) goto L_0x0427
            if (r23 == 0) goto L_0x02f8
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L_0x02f9
        L_0x02f8:
            r1 = r3
        L_0x02f9:
            java.util.ArrayList r9 = r0.f23087k
            java.lang.Object r1 = r9.get(r1)
            r.p r1 = (p227r.C8026p) r1
            q.e r9 = r1.f23152b
            int r9 = r9.mo22625T()
            r10 = 8
            if (r9 != r10) goto L_0x0316
            r.f r9 = r1.f23158h
            r9.mo23177d(r7)
            r.f r1 = r1.f23159i
            r1.mo23177d(r7)
            goto L_0x0373
        L_0x0316:
            if (r23 == 0) goto L_0x031a
            int r7 = r7 - r2
            goto L_0x031b
        L_0x031a:
            int r7 = r7 + r2
        L_0x031b:
            if (r3 <= 0) goto L_0x032c
            if (r3 < r5) goto L_0x032c
            if (r23 == 0) goto L_0x0327
            r.f r9 = r1.f23158h
            int r9 = r9.f23103f
            int r7 = r7 - r9
            goto L_0x032c
        L_0x0327:
            r.f r9 = r1.f23158h
            int r9 = r9.f23103f
            int r7 = r7 + r9
        L_0x032c:
            if (r23 == 0) goto L_0x0334
            r.f r9 = r1.f23159i
            r9.mo23177d(r7)
            goto L_0x0339
        L_0x0334:
            r.f r9 = r1.f23158h
            r9.mo23177d(r7)
        L_0x0339:
            r.g r9 = r1.f23155e
            int r10 = r9.f23104g
            q.e$b r11 = r1.f23154d
            q.e$b r12 = p214q.C7806e.C7808b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x034e
            int r11 = r1.f23151a
            r12 = 1
            if (r11 != r12) goto L_0x034e
            int r9 = r9.f23119m
            int r10 = java.lang.Math.min(r10, r9)
        L_0x034e:
            if (r23 == 0) goto L_0x0352
            int r7 = r7 - r10
            goto L_0x0353
        L_0x0352:
            int r7 = r7 + r10
        L_0x0353:
            if (r23 == 0) goto L_0x035b
            r.f r9 = r1.f23158h
            r9.mo23177d(r7)
            goto L_0x0360
        L_0x035b:
            r.f r9 = r1.f23159i
            r9.mo23177d(r7)
        L_0x0360:
            if (r3 >= r8) goto L_0x0373
            if (r3 >= r6) goto L_0x0373
            if (r23 == 0) goto L_0x036d
            r.f r1 = r1.f23159i
            int r1 = r1.f23103f
            int r1 = -r1
            int r7 = r7 - r1
            goto L_0x0373
        L_0x036d:
            r.f r1 = r1.f23159i
            int r1 = r1.f23103f
            int r1 = -r1
            int r7 = r7 + r1
        L_0x0373:
            int r3 = r3 + 1
            goto L_0x02ef
        L_0x0377:
            r7 = 2
            if (r3 != r7) goto L_0x0427
            int r3 = r0.f23156f
            if (r3 != 0) goto L_0x0385
            q.e r3 = r0.f23152b
            float r3 = r3.mo22684w()
            goto L_0x038b
        L_0x0385:
            q.e r3 = r0.f23152b
            float r3 = r3.mo22617P()
        L_0x038b:
            if (r23 == 0) goto L_0x0391
            r7 = 1065353216(0x3f800000, float:1.0)
            float r3 = r7 - r3
        L_0x0391:
            int r2 = r2 - r14
            float r2 = (float) r2
            float r2 = r2 * r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            int r2 = (int) r2
            if (r2 < 0) goto L_0x039c
            if (r15 <= 0) goto L_0x039d
        L_0x039c:
            r2 = r1
        L_0x039d:
            if (r23 == 0) goto L_0x03a2
            int r7 = r21 - r2
            goto L_0x03a4
        L_0x03a2:
            int r7 = r21 + r2
        L_0x03a4:
            r3 = r1
        L_0x03a5:
            if (r3 >= r4) goto L_0x0427
            if (r23 == 0) goto L_0x03ae
            int r1 = r3 + 1
            int r1 = r4 - r1
            goto L_0x03af
        L_0x03ae:
            r1 = r3
        L_0x03af:
            java.util.ArrayList r2 = r0.f23087k
            java.lang.Object r1 = r2.get(r1)
            r.p r1 = (p227r.C8026p) r1
            q.e r2 = r1.f23152b
            int r2 = r2.mo22625T()
            r9 = 8
            if (r2 != r9) goto L_0x03cd
            r.f r2 = r1.f23158h
            r2.mo23177d(r7)
            r.f r1 = r1.f23159i
            r1.mo23177d(r7)
            r12 = 1
            goto L_0x0423
        L_0x03cd:
            if (r3 <= 0) goto L_0x03de
            if (r3 < r5) goto L_0x03de
            if (r23 == 0) goto L_0x03d9
            r.f r2 = r1.f23158h
            int r2 = r2.f23103f
            int r7 = r7 - r2
            goto L_0x03de
        L_0x03d9:
            r.f r2 = r1.f23158h
            int r2 = r2.f23103f
            int r7 = r7 + r2
        L_0x03de:
            if (r23 == 0) goto L_0x03e6
            r.f r2 = r1.f23159i
            r2.mo23177d(r7)
            goto L_0x03eb
        L_0x03e6:
            r.f r2 = r1.f23158h
            r2.mo23177d(r7)
        L_0x03eb:
            r.g r2 = r1.f23155e
            int r10 = r2.f23104g
            q.e$b r11 = r1.f23154d
            q.e$b r12 = p214q.C7806e.C7808b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x03fd
            int r11 = r1.f23151a
            r12 = 1
            if (r11 != r12) goto L_0x03fe
            int r10 = r2.f23119m
            goto L_0x03fe
        L_0x03fd:
            r12 = 1
        L_0x03fe:
            if (r23 == 0) goto L_0x0402
            int r7 = r7 - r10
            goto L_0x0403
        L_0x0402:
            int r7 = r7 + r10
        L_0x0403:
            if (r23 == 0) goto L_0x040b
            r.f r2 = r1.f23158h
            r2.mo23177d(r7)
            goto L_0x0410
        L_0x040b:
            r.f r2 = r1.f23159i
            r2.mo23177d(r7)
        L_0x0410:
            if (r3 >= r8) goto L_0x0423
            if (r3 >= r6) goto L_0x0423
            if (r23 == 0) goto L_0x041d
            r.f r1 = r1.f23159i
            int r1 = r1.f23103f
            int r1 = -r1
            int r7 = r7 - r1
            goto L_0x0423
        L_0x041d:
            r.f r1 = r1.f23159i
            int r1 = r1.f23103f
            int r1 = -r1
            int r7 = r7 + r1
        L_0x0423:
            int r3 = r3 + 1
            goto L_0x03a5
        L_0x0427:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p227r.C8009c.mo23159a(r.d):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo23160d() {
        Iterator it = this.f23087k.iterator();
        while (it.hasNext()) {
            ((C8026p) it.next()).mo23160d();
        }
        int size = this.f23087k.size();
        if (size >= 1) {
            C7806e eVar = ((C8026p) this.f23087k.get(0)).f23152b;
            C7806e eVar2 = ((C8026p) this.f23087k.get(size - 1)).f23152b;
            if (this.f23156f == 0) {
                C7803d dVar = eVar.f22600O;
                C7803d dVar2 = eVar2.f22602Q;
                C8012f i = mo23198i(dVar, 0);
                int e = dVar.mo22573e();
                C7806e r = m30411r();
                if (r != null) {
                    e = r.f22600O.mo22573e();
                }
                if (i != null) {
                    mo23194b(this.f23158h, i, e);
                }
                C8012f i2 = mo23198i(dVar2, 0);
                int e2 = dVar2.mo22573e();
                C7806e s = m30412s();
                if (s != null) {
                    e2 = s.f22602Q.mo22573e();
                }
                if (i2 != null) {
                    mo23194b(this.f23159i, i2, -e2);
                }
            } else {
                C7803d dVar3 = eVar.f22601P;
                C7803d dVar4 = eVar2.f22603R;
                C8012f i3 = mo23198i(dVar3, 1);
                int e3 = dVar3.mo22573e();
                C7806e r2 = m30411r();
                if (r2 != null) {
                    e3 = r2.f22601P.mo22573e();
                }
                if (i3 != null) {
                    mo23194b(this.f23158h, i3, e3);
                }
                C8012f i4 = mo23198i(dVar4, 1);
                int e4 = dVar4.mo22573e();
                C7806e s2 = m30412s();
                if (s2 != null) {
                    e4 = s2.f22603R.mo22573e();
                }
                if (i4 != null) {
                    mo23194b(this.f23159i, i4, -e4);
                }
            }
            this.f23158h.f23098a = this;
            this.f23159i.f23098a = this;
        }
    }

    /* renamed from: e */
    public void mo23161e() {
        for (int i = 0; i < this.f23087k.size(); i++) {
            ((C8026p) this.f23087k.get(i)).mo23161e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo23162f() {
        this.f23153c = null;
        Iterator it = this.f23087k.iterator();
        while (it.hasNext()) {
            ((C8026p) it.next()).mo23162f();
        }
    }

    /* renamed from: j */
    public long mo23163j() {
        int size = this.f23087k.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C8026p pVar = (C8026p) this.f23087k.get(i);
            j = j + ((long) pVar.f23158h.f23103f) + pVar.mo23163j() + ((long) pVar.f23159i.f23103f);
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo23164m() {
        int size = this.f23087k.size();
        for (int i = 0; i < size; i++) {
            if (!((C8026p) this.f23087k.get(i)).mo23164m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ChainRun ");
        if (this.f23156f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb.append(str);
        Iterator it = this.f23087k.iterator();
        while (it.hasNext()) {
            sb.append("<");
            sb.append((C8026p) it.next());
            sb.append("> ");
        }
        return sb.toString();
    }
}
