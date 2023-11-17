package p227r;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p214q.C7806e;
import p214q.C7809f;
import p214q.C7810g;
import p214q.C7813i;
import p227r.C8006b;

/* renamed from: r.e */
public class C8011e {

    /* renamed from: a */
    private C7809f f23089a;

    /* renamed from: b */
    private boolean f23090b = true;

    /* renamed from: c */
    private boolean f23091c = true;

    /* renamed from: d */
    private C7809f f23092d;

    /* renamed from: e */
    private ArrayList f23093e = new ArrayList();

    /* renamed from: f */
    private ArrayList f23094f = new ArrayList();

    /* renamed from: g */
    private C8006b.C8008b f23095g = null;

    /* renamed from: h */
    private C8006b.C8007a f23096h = new C8006b.C8007a();

    /* renamed from: i */
    ArrayList f23097i = new ArrayList();

    public C8011e(C7809f fVar) {
        this.f23089a = fVar;
        this.f23092d = fVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: r.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: r.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m30420a(p227r.C8012f r9, int r10, int r11, p227r.C8012f r12, java.util.ArrayList r13, p227r.C8021m r14) {
        /*
            r8 = this;
            r.p r9 = r9.f23101d
            r.m r0 = r9.f23153c
            if (r0 != 0) goto L_0x0107
            q.f r0 = r8.f23089a
            r.l r1 = r0.f22620e
            if (r9 == r1) goto L_0x0107
            r.n r0 = r0.f22622f
            if (r9 != r0) goto L_0x0012
            goto L_0x0107
        L_0x0012:
            if (r14 != 0) goto L_0x001c
            r.m r14 = new r.m
            r14.<init>(r9, r11)
            r13.add(r14)
        L_0x001c:
            r9.f23153c = r14
            r14.mo23181a(r9)
            r.f r11 = r9.f23158h
            java.util.List r11 = r11.f23108k
            java.util.Iterator r11 = r11.iterator()
        L_0x0029:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0046
            java.lang.Object r0 = r11.next()
            r.d r0 = (p227r.C8010d) r0
            boolean r1 = r0 instanceof p227r.C8012f
            if (r1 == 0) goto L_0x0029
            r1 = r0
            r.f r1 = (p227r.C8012f) r1
            r3 = 0
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.m30420a(r1, r2, r3, r4, r5, r6)
            goto L_0x0029
        L_0x0046:
            r.f r11 = r9.f23159i
            java.util.List r11 = r11.f23108k
            java.util.Iterator r11 = r11.iterator()
        L_0x004e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x006b
            java.lang.Object r0 = r11.next()
            r.d r0 = (p227r.C8010d) r0
            boolean r1 = r0 instanceof p227r.C8012f
            if (r1 == 0) goto L_0x004e
            r1 = r0
            r.f r1 = (p227r.C8012f) r1
            r3 = 1
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.m30420a(r1, r2, r3, r4, r5, r6)
            goto L_0x004e
        L_0x006b:
            r11 = 1
            if (r10 != r11) goto L_0x009a
            boolean r0 = r9 instanceof p227r.C8022n
            if (r0 == 0) goto L_0x009a
            r0 = r9
            r.n r0 = (p227r.C8022n) r0
            r.f r0 = r0.f23133k
            java.util.List r0 = r0.f23108k
            java.util.Iterator r7 = r0.iterator()
        L_0x007d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x009a
            java.lang.Object r0 = r7.next()
            r.d r0 = (p227r.C8010d) r0
            boolean r1 = r0 instanceof p227r.C8012f
            if (r1 == 0) goto L_0x007d
            r1 = r0
            r.f r1 = (p227r.C8012f) r1
            r3 = 2
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.m30420a(r1, r2, r3, r4, r5, r6)
            goto L_0x007d
        L_0x009a:
            r.f r0 = r9.f23158h
            java.util.List r0 = r0.f23109l
            java.util.Iterator r7 = r0.iterator()
        L_0x00a2:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00bd
            java.lang.Object r0 = r7.next()
            r1 = r0
            r.f r1 = (p227r.C8012f) r1
            if (r1 != r12) goto L_0x00b3
            r14.f23127b = r11
        L_0x00b3:
            r3 = 0
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.m30420a(r1, r2, r3, r4, r5, r6)
            goto L_0x00a2
        L_0x00bd:
            r.f r0 = r9.f23159i
            java.util.List r0 = r0.f23109l
            java.util.Iterator r7 = r0.iterator()
        L_0x00c5:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00e0
            java.lang.Object r0 = r7.next()
            r1 = r0
            r.f r1 = (p227r.C8012f) r1
            if (r1 != r12) goto L_0x00d6
            r14.f23127b = r11
        L_0x00d6:
            r3 = 1
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.m30420a(r1, r2, r3, r4, r5, r6)
            goto L_0x00c5
        L_0x00e0:
            if (r10 != r11) goto L_0x0107
            boolean r11 = r9 instanceof p227r.C8022n
            if (r11 == 0) goto L_0x0107
            r.n r9 = (p227r.C8022n) r9
            r.f r9 = r9.f23133k
            java.util.List r9 = r9.f23109l
            java.util.Iterator r9 = r9.iterator()
        L_0x00f0:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x0107
            java.lang.Object r11 = r9.next()
            r1 = r11
            r.f r1 = (p227r.C8012f) r1
            r3 = 2
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.m30420a(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0108 }
            goto L_0x00f0
        L_0x0107:
            return
        L_0x0108:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p227r.C8011e.m30420a(r.f, int, int, r.f, java.util.ArrayList, r.m):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0280, code lost:
        r4 = r0.f22611Z;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m30421b(p214q.C7809f r17) {
        /*
            r16 = this;
            r0 = r17
            java.util.ArrayList r1 = r0.f22713L0
            java.util.Iterator r1 = r1.iterator()
        L_0x0008:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0338
            java.lang.Object r2 = r1.next()
            q.e r2 = (p214q.C7806e) r2
            q.e$b[] r4 = r2.f22611Z
            r5 = r4[r3]
            r10 = 1
            r4 = r4[r10]
            int r6 = r2.mo22625T()
            r7 = 8
            if (r6 != r7) goto L_0x0027
            r2.f22612a = r10
            goto L_0x0008
        L_0x0027:
            float r6 = r2.f22578B
            r11 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            r7 = 2
            if (r6 >= 0) goto L_0x0036
            q.e$b r6 = p214q.C7806e.C7808b.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x0036
            r2.f22656w = r7
        L_0x0036:
            float r6 = r2.f22584E
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x0042
            q.e$b r6 = p214q.C7806e.C7808b.MATCH_CONSTRAINT
            if (r4 != r6) goto L_0x0042
            r2.f22658x = r7
        L_0x0042:
            float r6 = r2.mo22680t()
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r8 = 3
            if (r6 <= 0) goto L_0x0078
            q.e$b r6 = p214q.C7806e.C7808b.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x005b
            q.e$b r9 = p214q.C7806e.C7808b.WRAP_CONTENT
            if (r4 == r9) goto L_0x0058
            q.e$b r9 = p214q.C7806e.C7808b.FIXED
            if (r4 != r9) goto L_0x005b
        L_0x0058:
            r2.f22656w = r8
            goto L_0x0078
        L_0x005b:
            if (r4 != r6) goto L_0x0068
            q.e$b r9 = p214q.C7806e.C7808b.WRAP_CONTENT
            if (r5 == r9) goto L_0x0065
            q.e$b r9 = p214q.C7806e.C7808b.FIXED
            if (r5 != r9) goto L_0x0068
        L_0x0065:
            r2.f22658x = r8
            goto L_0x0078
        L_0x0068:
            if (r5 != r6) goto L_0x0078
            if (r4 != r6) goto L_0x0078
            int r6 = r2.f22656w
            if (r6 != 0) goto L_0x0072
            r2.f22656w = r8
        L_0x0072:
            int r6 = r2.f22658x
            if (r6 != 0) goto L_0x0078
            r2.f22658x = r8
        L_0x0078:
            q.e$b r6 = p214q.C7806e.C7808b.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x008e
            int r9 = r2.f22656w
            if (r9 != r10) goto L_0x008e
            q.d r9 = r2.f22600O
            q.d r9 = r9.f22560f
            if (r9 == 0) goto L_0x008c
            q.d r9 = r2.f22602Q
            q.d r9 = r9.f22560f
            if (r9 != 0) goto L_0x008e
        L_0x008c:
            q.e$b r5 = p214q.C7806e.C7808b.WRAP_CONTENT
        L_0x008e:
            r9 = r5
            if (r4 != r6) goto L_0x00a3
            int r5 = r2.f22658x
            if (r5 != r10) goto L_0x00a3
            q.d r5 = r2.f22601P
            q.d r5 = r5.f22560f
            if (r5 == 0) goto L_0x00a1
            q.d r5 = r2.f22603R
            q.d r5 = r5.f22560f
            if (r5 != 0) goto L_0x00a3
        L_0x00a1:
            q.e$b r4 = p214q.C7806e.C7808b.WRAP_CONTENT
        L_0x00a3:
            r12 = r4
            r.l r4 = r2.f22620e
            r4.f23154d = r9
            int r5 = r2.f22656w
            r4.f23151a = r5
            r.n r4 = r2.f22622f
            r4.f23154d = r12
            int r13 = r2.f22658x
            r4.f23151a = r13
            q.e$b r4 = p214q.C7806e.C7808b.MATCH_PARENT
            if (r9 == r4) goto L_0x00c0
            q.e$b r14 = p214q.C7806e.C7808b.FIXED
            if (r9 == r14) goto L_0x00c0
            q.e$b r14 = p214q.C7806e.C7808b.WRAP_CONTENT
            if (r9 != r14) goto L_0x00cc
        L_0x00c0:
            if (r12 == r4) goto L_0x02e2
            q.e$b r14 = p214q.C7806e.C7808b.FIXED
            if (r12 == r14) goto L_0x02e2
            q.e$b r14 = p214q.C7806e.C7808b.WRAP_CONTENT
            if (r12 != r14) goto L_0x00cc
            goto L_0x02e2
        L_0x00cc:
            r14 = 1056964608(0x3f000000, float:0.5)
            if (r9 != r6) goto L_0x0199
            q.e$b r15 = p214q.C7806e.C7808b.WRAP_CONTENT
            if (r12 == r15) goto L_0x00d8
            q.e$b r11 = p214q.C7806e.C7808b.FIXED
            if (r12 != r11) goto L_0x0199
        L_0x00d8:
            if (r5 != r8) goto L_0x0113
            if (r12 != r15) goto L_0x00e6
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r15
            r4.m30424l(r5, r6, r7, r8, r9)
        L_0x00e6:
            int r9 = r2.mo22683v()
            float r3 = (float) r9
            float r4 = r2.f22619d0
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r7 = (int) r3
            q.e$b r8 = p214q.C7806e.C7808b.FIXED
            r4 = r16
            r5 = r2
            r6 = r8
            r4.m30424l(r5, r6, r7, r8, r9)
            r.l r3 = r2.f22620e
            r.g r3 = r3.f23155e
            int r4 = r2.mo22627U()
            r3.mo23177d(r4)
            r.n r3 = r2.f22622f
            r.g r3 = r3.f23155e
            int r4 = r2.mo22683v()
            r3.mo23177d(r4)
            r2.f22612a = r10
            goto L_0x0008
        L_0x0113:
            if (r5 != r10) goto L_0x012b
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r12
            r4.m30424l(r5, r6, r7, r8, r9)
            r.l r3 = r2.f22620e
            r.g r3 = r3.f23155e
            int r2 = r2.mo22627U()
            r3.f23119m = r2
            goto L_0x0008
        L_0x012b:
            if (r5 != r7) goto L_0x0167
            q.e$b[] r11 = r0.f22611Z
            r11 = r11[r3]
            q.e$b r15 = p214q.C7806e.C7808b.FIXED
            if (r11 == r15) goto L_0x0137
            if (r11 != r4) goto L_0x0199
        L_0x0137:
            float r3 = r2.f22578B
            int r4 = r17.mo22627U()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r7 = (int) r3
            int r9 = r2.mo22683v()
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r12
            r4.m30424l(r5, r6, r7, r8, r9)
            r.l r3 = r2.f22620e
            r.g r3 = r3.f23155e
            int r4 = r2.mo22627U()
            r3.mo23177d(r4)
            r.n r3 = r2.f22622f
            r.g r3 = r3.f23155e
            int r4 = r2.mo22683v()
            r3.mo23177d(r4)
            r2.f22612a = r10
            goto L_0x0008
        L_0x0167:
            q.d[] r11 = r2.f22608W
            r7 = r11[r3]
            q.d r7 = r7.f22560f
            if (r7 == 0) goto L_0x0175
            r7 = r11[r10]
            q.d r7 = r7.f22560f
            if (r7 != 0) goto L_0x0199
        L_0x0175:
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r12
            r4.m30424l(r5, r6, r7, r8, r9)
            r.l r3 = r2.f22620e
            r.g r3 = r3.f23155e
            int r4 = r2.mo22627U()
            r3.mo23177d(r4)
            r.n r3 = r2.f22622f
            r.g r3 = r3.f23155e
            int r4 = r2.mo22683v()
            r3.mo23177d(r4)
            r2.f22612a = r10
            goto L_0x0008
        L_0x0199:
            if (r12 != r6) goto L_0x0272
            q.e$b r11 = p214q.C7806e.C7808b.WRAP_CONTENT
            if (r9 == r11) goto L_0x01a3
            q.e$b r7 = p214q.C7806e.C7808b.FIXED
            if (r9 != r7) goto L_0x0272
        L_0x01a3:
            if (r13 != r8) goto L_0x01e9
            if (r9 != r11) goto L_0x01b1
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r11
            r8 = r11
            r4.m30424l(r5, r6, r7, r8, r9)
        L_0x01b1:
            int r7 = r2.mo22627U()
            float r3 = r2.f22619d0
            int r4 = r2.mo22682u()
            r5 = -1
            if (r4 != r5) goto L_0x01c2
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r4 / r3
        L_0x01c2:
            float r4 = (float) r7
            float r4 = r4 * r3
            float r4 = r4 + r14
            int r9 = (int) r4
            q.e$b r8 = p214q.C7806e.C7808b.FIXED
            r4 = r16
            r5 = r2
            r6 = r8
            r4.m30424l(r5, r6, r7, r8, r9)
            r.l r3 = r2.f22620e
            r.g r3 = r3.f23155e
            int r4 = r2.mo22627U()
            r3.mo23177d(r4)
            r.n r3 = r2.f22622f
            r.g r3 = r3.f23155e
            int r4 = r2.mo22683v()
            r3.mo23177d(r4)
            r2.f22612a = r10
            goto L_0x0008
        L_0x01e9:
            if (r13 != r10) goto L_0x0202
            r7 = 0
            r3 = 0
            r4 = r16
            r5 = r2
            r6 = r9
            r8 = r11
            r9 = r3
            r4.m30424l(r5, r6, r7, r8, r9)
            r.n r3 = r2.f22622f
            r.g r3 = r3.f23155e
            int r2 = r2.mo22683v()
            r3.f23119m = r2
            goto L_0x0008
        L_0x0202:
            r7 = 2
            if (r13 != r7) goto L_0x023f
            q.e$b[] r7 = r0.f22611Z
            r7 = r7[r10]
            q.e$b r8 = p214q.C7806e.C7808b.FIXED
            if (r7 == r8) goto L_0x020f
            if (r7 != r4) goto L_0x0272
        L_0x020f:
            float r3 = r2.f22584E
            int r7 = r2.mo22627U()
            int r4 = r17.mo22683v()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r3 = (int) r3
            r4 = r16
            r5 = r2
            r6 = r9
            r9 = r3
            r4.m30424l(r5, r6, r7, r8, r9)
            r.l r3 = r2.f22620e
            r.g r3 = r3.f23155e
            int r4 = r2.mo22627U()
            r3.mo23177d(r4)
            r.n r3 = r2.f22622f
            r.g r3 = r3.f23155e
            int r4 = r2.mo22683v()
            r3.mo23177d(r4)
            r2.f22612a = r10
            goto L_0x0008
        L_0x023f:
            q.d[] r4 = r2.f22608W
            r7 = 2
            r15 = r4[r7]
            q.d r7 = r15.f22560f
            if (r7 == 0) goto L_0x024e
            r4 = r4[r8]
            q.d r4 = r4.f22560f
            if (r4 != 0) goto L_0x0272
        L_0x024e:
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r11
            r8 = r12
            r4.m30424l(r5, r6, r7, r8, r9)
            r.l r3 = r2.f22620e
            r.g r3 = r3.f23155e
            int r4 = r2.mo22627U()
            r3.mo23177d(r4)
            r.n r3 = r2.f22622f
            r.g r3 = r3.f23155e
            int r4 = r2.mo22683v()
            r3.mo23177d(r4)
            r2.f22612a = r10
            goto L_0x0008
        L_0x0272:
            if (r9 != r6) goto L_0x0008
            if (r12 != r6) goto L_0x0008
            if (r5 == r10) goto L_0x02c1
            if (r13 != r10) goto L_0x027b
            goto L_0x02c1
        L_0x027b:
            r4 = 2
            if (r13 != r4) goto L_0x0008
            if (r5 != r4) goto L_0x0008
            q.e$b[] r4 = r0.f22611Z
            r3 = r4[r3]
            q.e$b r8 = p214q.C7806e.C7808b.FIXED
            if (r3 != r8) goto L_0x0008
            r3 = r4[r10]
            if (r3 != r8) goto L_0x0008
            float r3 = r2.f22578B
            float r4 = r2.f22584E
            int r5 = r17.mo22627U()
            float r5 = (float) r5
            float r3 = r3 * r5
            float r3 = r3 + r14
            int r7 = (int) r3
            int r3 = r17.mo22683v()
            float r3 = (float) r3
            float r4 = r4 * r3
            float r4 = r4 + r14
            int r9 = (int) r4
            r4 = r16
            r5 = r2
            r6 = r8
            r4.m30424l(r5, r6, r7, r8, r9)
            r.l r3 = r2.f22620e
            r.g r3 = r3.f23155e
            int r4 = r2.mo22627U()
            r3.mo23177d(r4)
            r.n r3 = r2.f22622f
            r.g r3 = r3.f23155e
            int r4 = r2.mo22683v()
            r3.mo23177d(r4)
            r2.f22612a = r10
            goto L_0x0008
        L_0x02c1:
            q.e$b r8 = p214q.C7806e.C7808b.WRAP_CONTENT
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r8
            r4.m30424l(r5, r6, r7, r8, r9)
            r.l r3 = r2.f22620e
            r.g r3 = r3.f23155e
            int r4 = r2.mo22627U()
            r3.f23119m = r4
            r.n r3 = r2.f22622f
            r.g r3 = r3.f23155e
            int r2 = r2.mo22683v()
            r3.f23119m = r2
            goto L_0x0008
        L_0x02e2:
            int r3 = r2.mo22627U()
            if (r9 != r4) goto L_0x02fb
            int r3 = r17.mo22627U()
            q.d r5 = r2.f22600O
            int r5 = r5.f22561g
            int r3 = r3 - r5
            q.d r5 = r2.f22602Q
            int r5 = r5.f22561g
            int r3 = r3 - r5
            q.e$b r5 = p214q.C7806e.C7808b.FIXED
            r7 = r3
            r6 = r5
            goto L_0x02fd
        L_0x02fb:
            r7 = r3
            r6 = r9
        L_0x02fd:
            int r3 = r2.mo22683v()
            if (r12 != r4) goto L_0x0316
            int r3 = r17.mo22683v()
            q.d r4 = r2.f22601P
            int r4 = r4.f22561g
            int r3 = r3 - r4
            q.d r4 = r2.f22603R
            int r4 = r4.f22561g
            int r3 = r3 - r4
            q.e$b r4 = p214q.C7806e.C7808b.FIXED
            r9 = r3
            r8 = r4
            goto L_0x0318
        L_0x0316:
            r9 = r3
            r8 = r12
        L_0x0318:
            r4 = r16
            r5 = r2
            r4.m30424l(r5, r6, r7, r8, r9)
            r.l r3 = r2.f22620e
            r.g r3 = r3.f23155e
            int r4 = r2.mo22627U()
            r3.mo23177d(r4)
            r.n r3 = r2.f22622f
            r.g r3 = r3.f23155e
            int r4 = r2.mo22683v()
            r3.mo23177d(r4)
            r2.f22612a = r10
            goto L_0x0008
        L_0x0338:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p227r.C8011e.m30421b(q.f):boolean");
    }

    /* renamed from: e */
    private int m30422e(C7809f fVar, int i) {
        int size = this.f23097i.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, ((C8021m) this.f23097i.get(i2)).mo23182b(fVar, i));
        }
        return (int) j;
    }

    /* renamed from: i */
    private void m30423i(C8026p pVar, int i, ArrayList arrayList) {
        for (C8010d dVar : pVar.f23158h.f23108k) {
            if (dVar instanceof C8012f) {
                m30420a((C8012f) dVar, i, 0, pVar.f23159i, arrayList, (C8021m) null);
            } else if (dVar instanceof C8026p) {
                m30420a(((C8026p) dVar).f23158h, i, 0, pVar.f23159i, arrayList, (C8021m) null);
            }
        }
        for (C8010d dVar2 : pVar.f23159i.f23108k) {
            if (dVar2 instanceof C8012f) {
                m30420a((C8012f) dVar2, i, 1, pVar.f23158h, arrayList, (C8021m) null);
            } else if (dVar2 instanceof C8026p) {
                m30420a(((C8026p) dVar2).f23159i, i, 1, pVar.f23158h, arrayList, (C8021m) null);
            }
        }
        if (i == 1) {
            for (C8010d dVar3 : ((C8022n) pVar).f23133k.f23108k) {
                if (dVar3 instanceof C8012f) {
                    m30420a((C8012f) dVar3, i, 2, (C8012f) null, arrayList, (C8021m) null);
                }
            }
        }
    }

    /* renamed from: l */
    private void m30424l(C7806e eVar, C7806e.C7808b bVar, int i, C7806e.C7808b bVar2, int i2) {
        C8006b.C8007a aVar = this.f23096h;
        aVar.f23077a = bVar;
        aVar.f23078b = bVar2;
        aVar.f23079c = i;
        aVar.f23080d = i2;
        this.f23095g.mo2897b(eVar, aVar);
        eVar.mo22653g1(this.f23096h.f23081e);
        eVar.mo22606I0(this.f23096h.f23082f);
        eVar.mo22604H0(this.f23096h.f23084h);
        eVar.mo22686x0(this.f23096h.f23083g);
    }

    /* renamed from: c */
    public void mo23166c() {
        mo23167d(this.f23093e);
        this.f23097i.clear();
        C8021m.f23125h = 0;
        m30423i(this.f23089a.f22620e, 0, this.f23097i);
        m30423i(this.f23089a.f22622f, 1, this.f23097i);
        this.f23090b = false;
    }

    /* renamed from: d */
    public void mo23167d(ArrayList arrayList) {
        arrayList.clear();
        this.f23092d.f22620e.mo23162f();
        this.f23092d.f22622f.mo23162f();
        arrayList.add(this.f23092d.f22620e);
        arrayList.add(this.f23092d.f22622f);
        Iterator it = this.f23092d.f22713L0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C7806e eVar = (C7806e) it.next();
            if (eVar instanceof C7810g) {
                arrayList.add(new C8017j(eVar));
            } else {
                if (eVar.mo22652g0()) {
                    if (eVar.f22616c == null) {
                        eVar.f22616c = new C8009c(eVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f22616c);
                } else {
                    arrayList.add(eVar.f22620e);
                }
                if (eVar.mo22656i0()) {
                    if (eVar.f22618d == null) {
                        eVar.f22618d = new C8009c(eVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f22618d);
                } else {
                    arrayList.add(eVar.f22622f);
                }
                if (eVar instanceof C7813i) {
                    arrayList.add(new C8018k(eVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C8026p) it2.next()).mo23162f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C8026p pVar = (C8026p) it3.next();
            if (pVar.f23152b != this.f23092d) {
                pVar.mo23160d();
            }
        }
    }

    /* renamed from: f */
    public boolean mo23168f(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.f23090b || this.f23091c) {
            Iterator it = this.f23089a.f22713L0.iterator();
            while (it.hasNext()) {
                C7806e eVar = (C7806e) it.next();
                eVar.mo22664l();
                eVar.f22612a = false;
                eVar.f22620e.mo23179r();
                eVar.f22622f.mo23183q();
            }
            this.f23089a.mo22664l();
            C7809f fVar = this.f23089a;
            fVar.f22612a = false;
            fVar.f22620e.mo23179r();
            this.f23089a.f22622f.mo23183q();
            this.f23091c = false;
        }
        if (m30421b(this.f23092d)) {
            return false;
        }
        this.f23089a.mo22657i1(0);
        this.f23089a.mo22660j1(0);
        C7806e.C7808b s = this.f23089a.mo22678s(0);
        C7806e.C7808b s2 = this.f23089a.mo22678s(1);
        if (this.f23090b) {
            mo23166c();
        }
        int V = this.f23089a.mo22629V();
        int W = this.f23089a.mo22631W();
        this.f23089a.f22620e.f23158h.mo23177d(V);
        this.f23089a.f22622f.f23158h.mo23177d(W);
        mo23173m();
        C7806e.C7808b bVar = C7806e.C7808b.WRAP_CONTENT;
        if (s == bVar || s2 == bVar) {
            if (z4) {
                Iterator it2 = this.f23093e.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!((C8026p) it2.next()).mo23164m()) {
                            z4 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z4 && s == C7806e.C7808b.WRAP_CONTENT) {
                this.f23089a.mo22614M0(C7806e.C7808b.FIXED);
                C7809f fVar2 = this.f23089a;
                fVar2.mo22653g1(m30422e(fVar2, 0));
                C7809f fVar3 = this.f23089a;
                fVar3.f22620e.f23155e.mo23177d(fVar3.mo22627U());
            }
            if (z4 && s2 == C7806e.C7808b.WRAP_CONTENT) {
                this.f23089a.mo22644c1(C7806e.C7808b.FIXED);
                C7809f fVar4 = this.f23089a;
                fVar4.mo22606I0(m30422e(fVar4, 1));
                C7809f fVar5 = this.f23089a;
                fVar5.f22622f.f23155e.mo23177d(fVar5.mo22683v());
            }
        }
        C7809f fVar6 = this.f23089a;
        C7806e.C7808b bVar2 = fVar6.f22611Z[0];
        C7806e.C7808b bVar3 = C7806e.C7808b.FIXED;
        if (bVar2 == bVar3 || bVar2 == C7806e.C7808b.MATCH_PARENT) {
            int U = fVar6.mo22627U() + V;
            this.f23089a.f22620e.f23159i.mo23177d(U);
            this.f23089a.f22620e.f23155e.mo23177d(U - V);
            mo23173m();
            C7809f fVar7 = this.f23089a;
            C7806e.C7808b bVar4 = fVar7.f22611Z[1];
            if (bVar4 == bVar3 || bVar4 == C7806e.C7808b.MATCH_PARENT) {
                int v = fVar7.mo22683v() + W;
                this.f23089a.f22622f.f23159i.mo23177d(v);
                this.f23089a.f22622f.f23155e.mo23177d(v - W);
            }
            mo23173m();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator it3 = this.f23093e.iterator();
        while (it3.hasNext()) {
            C8026p pVar = (C8026p) it3.next();
            if (pVar.f23152b != this.f23089a || pVar.f23157g) {
                pVar.mo23161e();
            }
        }
        Iterator it4 = this.f23093e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            C8026p pVar2 = (C8026p) it4.next();
            if ((z2 || pVar2.f23152b != this.f23089a) && (!pVar2.f23158h.f23107j || ((!pVar2.f23159i.f23107j && !(pVar2 instanceof C8017j)) || (!pVar2.f23155e.f23107j && !(pVar2 instanceof C8009c) && !(pVar2 instanceof C8017j))))) {
                z3 = false;
            }
        }
        z3 = false;
        this.f23089a.mo22614M0(s);
        this.f23089a.mo22644c1(s2);
        return z3;
    }

    /* renamed from: g */
    public boolean mo23169g(boolean z) {
        if (this.f23090b) {
            Iterator it = this.f23089a.f22713L0.iterator();
            while (it.hasNext()) {
                C7806e eVar = (C7806e) it.next();
                eVar.mo22664l();
                eVar.f22612a = false;
                C8019l lVar = eVar.f22620e;
                lVar.f23155e.f23107j = false;
                lVar.f23157g = false;
                lVar.mo23179r();
                C8022n nVar = eVar.f22622f;
                nVar.f23155e.f23107j = false;
                nVar.f23157g = false;
                nVar.mo23183q();
            }
            this.f23089a.mo22664l();
            C7809f fVar = this.f23089a;
            fVar.f22612a = false;
            C8019l lVar2 = fVar.f22620e;
            lVar2.f23155e.f23107j = false;
            lVar2.f23157g = false;
            lVar2.mo23179r();
            C8022n nVar2 = this.f23089a.f22622f;
            nVar2.f23155e.f23107j = false;
            nVar2.f23157g = false;
            nVar2.mo23183q();
            mo23166c();
        }
        if (m30421b(this.f23092d)) {
            return false;
        }
        this.f23089a.mo22657i1(0);
        this.f23089a.mo22660j1(0);
        this.f23089a.f22620e.f23158h.mo23177d(0);
        this.f23089a.f22622f.f23158h.mo23177d(0);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x013f A[EDGE_INSN: B:76:0x013f->B:62:0x013f ?: BREAK  , SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo23170h(boolean r10, int r11) {
        /*
            r9 = this;
            r0 = 1
            r10 = r10 & r0
            q.f r1 = r9.f23089a
            r2 = 0
            q.e$b r1 = r1.mo22678s(r2)
            q.f r3 = r9.f23089a
            q.e$b r3 = r3.mo22678s(r0)
            q.f r4 = r9.f23089a
            int r4 = r4.mo22629V()
            q.f r5 = r9.f23089a
            int r5 = r5.mo22631W()
            if (r10 == 0) goto L_0x0089
            q.e$b r6 = p214q.C7806e.C7808b.WRAP_CONTENT
            if (r1 == r6) goto L_0x0023
            if (r3 != r6) goto L_0x0089
        L_0x0023:
            java.util.ArrayList r6 = r9.f23093e
            java.util.Iterator r6 = r6.iterator()
        L_0x0029:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0040
            java.lang.Object r7 = r6.next()
            r.p r7 = (p227r.C8026p) r7
            int r8 = r7.f23156f
            if (r8 != r11) goto L_0x0029
            boolean r7 = r7.mo23164m()
            if (r7 != 0) goto L_0x0029
            r10 = r2
        L_0x0040:
            if (r11 != 0) goto L_0x0066
            if (r10 == 0) goto L_0x0089
            q.e$b r10 = p214q.C7806e.C7808b.WRAP_CONTENT
            if (r1 != r10) goto L_0x0089
            q.f r10 = r9.f23089a
            q.e$b r6 = p214q.C7806e.C7808b.FIXED
            r10.mo22614M0(r6)
            q.f r10 = r9.f23089a
            int r6 = r9.m30422e(r10, r2)
            r10.mo22653g1(r6)
            q.f r10 = r9.f23089a
            r.l r6 = r10.f22620e
            r.g r6 = r6.f23155e
            int r10 = r10.mo22627U()
            r6.mo23177d(r10)
            goto L_0x0089
        L_0x0066:
            if (r10 == 0) goto L_0x0089
            q.e$b r10 = p214q.C7806e.C7808b.WRAP_CONTENT
            if (r3 != r10) goto L_0x0089
            q.f r10 = r9.f23089a
            q.e$b r6 = p214q.C7806e.C7808b.FIXED
            r10.mo22644c1(r6)
            q.f r10 = r9.f23089a
            int r6 = r9.m30422e(r10, r0)
            r10.mo22606I0(r6)
            q.f r10 = r9.f23089a
            r.n r6 = r10.f22622f
            r.g r6 = r6.f23155e
            int r10 = r10.mo22683v()
            r6.mo23177d(r10)
        L_0x0089:
            if (r11 != 0) goto L_0x00b2
            q.f r10 = r9.f23089a
            q.e$b[] r5 = r10.f22611Z
            r5 = r5[r2]
            q.e$b r6 = p214q.C7806e.C7808b.FIXED
            if (r5 == r6) goto L_0x0099
            q.e$b r6 = p214q.C7806e.C7808b.MATCH_PARENT
            if (r5 != r6) goto L_0x00c1
        L_0x0099:
            int r10 = r10.mo22627U()
            int r10 = r10 + r4
            q.f r5 = r9.f23089a
            r.l r5 = r5.f22620e
            r.f r5 = r5.f23159i
            r5.mo23177d(r10)
            q.f r5 = r9.f23089a
            r.l r5 = r5.f22620e
            r.g r5 = r5.f23155e
            int r10 = r10 - r4
            r5.mo23177d(r10)
            goto L_0x00db
        L_0x00b2:
            q.f r10 = r9.f23089a
            q.e$b[] r4 = r10.f22611Z
            r4 = r4[r0]
            q.e$b r6 = p214q.C7806e.C7808b.FIXED
            if (r4 == r6) goto L_0x00c3
            q.e$b r6 = p214q.C7806e.C7808b.MATCH_PARENT
            if (r4 != r6) goto L_0x00c1
            goto L_0x00c3
        L_0x00c1:
            r10 = r2
            goto L_0x00dc
        L_0x00c3:
            int r10 = r10.mo22683v()
            int r10 = r10 + r5
            q.f r4 = r9.f23089a
            r.n r4 = r4.f22622f
            r.f r4 = r4.f23159i
            r4.mo23177d(r10)
            q.f r4 = r9.f23089a
            r.n r4 = r4.f22622f
            r.g r4 = r4.f23155e
            int r10 = r10 - r5
            r4.mo23177d(r10)
        L_0x00db:
            r10 = r0
        L_0x00dc:
            r9.mo23173m()
            java.util.ArrayList r4 = r9.f23093e
            java.util.Iterator r4 = r4.iterator()
        L_0x00e5:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0105
            java.lang.Object r5 = r4.next()
            r.p r5 = (p227r.C8026p) r5
            int r6 = r5.f23156f
            if (r6 == r11) goto L_0x00f6
            goto L_0x00e5
        L_0x00f6:
            q.e r6 = r5.f23152b
            q.f r7 = r9.f23089a
            if (r6 != r7) goto L_0x0101
            boolean r6 = r5.f23157g
            if (r6 != 0) goto L_0x0101
            goto L_0x00e5
        L_0x0101:
            r5.mo23161e()
            goto L_0x00e5
        L_0x0105:
            java.util.ArrayList r4 = r9.f23093e
            java.util.Iterator r4 = r4.iterator()
        L_0x010b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x013f
            java.lang.Object r5 = r4.next()
            r.p r5 = (p227r.C8026p) r5
            int r6 = r5.f23156f
            if (r6 == r11) goto L_0x011c
            goto L_0x010b
        L_0x011c:
            if (r10 != 0) goto L_0x0125
            q.e r6 = r5.f23152b
            q.f r7 = r9.f23089a
            if (r6 != r7) goto L_0x0125
            goto L_0x010b
        L_0x0125:
            r.f r6 = r5.f23158h
            boolean r6 = r6.f23107j
            if (r6 != 0) goto L_0x012d
        L_0x012b:
            r0 = r2
            goto L_0x013f
        L_0x012d:
            r.f r6 = r5.f23159i
            boolean r6 = r6.f23107j
            if (r6 != 0) goto L_0x0134
            goto L_0x012b
        L_0x0134:
            boolean r6 = r5 instanceof p227r.C8009c
            if (r6 != 0) goto L_0x010b
            r.g r5 = r5.f23155e
            boolean r5 = r5.f23107j
            if (r5 != 0) goto L_0x010b
            goto L_0x012b
        L_0x013f:
            q.f r10 = r9.f23089a
            r10.mo22614M0(r1)
            q.f r10 = r9.f23089a
            r10.mo22644c1(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p227r.C8011e.mo23170h(boolean, int):boolean");
    }

    /* renamed from: j */
    public void mo23171j() {
        this.f23090b = true;
    }

    /* renamed from: k */
    public void mo23172k() {
        this.f23091c = true;
    }

    /* renamed from: m */
    public void mo23173m() {
        boolean z;
        C8014g gVar;
        Iterator it = this.f23089a.f22713L0.iterator();
        while (it.hasNext()) {
            C7806e eVar = (C7806e) it.next();
            if (!eVar.f22612a) {
                C7806e.C7808b[] bVarArr = eVar.f22611Z;
                boolean z2 = false;
                C7806e.C7808b bVar = bVarArr[0];
                C7806e.C7808b bVar2 = bVarArr[1];
                int i = eVar.f22656w;
                int i2 = eVar.f22658x;
                C7806e.C7808b bVar3 = C7806e.C7808b.WRAP_CONTENT;
                if (bVar == bVar3 || (bVar == C7806e.C7808b.MATCH_CONSTRAINT && i == 1)) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVar2 == bVar3 || (bVar2 == C7806e.C7808b.MATCH_CONSTRAINT && i2 == 1)) {
                    z2 = true;
                }
                C8014g gVar2 = eVar.f22620e.f23155e;
                boolean z3 = gVar2.f23107j;
                C8014g gVar3 = eVar.f22622f.f23155e;
                boolean z4 = gVar3.f23107j;
                if (z3 && z4) {
                    C7806e.C7808b bVar4 = C7806e.C7808b.FIXED;
                    m30424l(eVar, bVar4, gVar2.f23104g, bVar4, gVar3.f23104g);
                    eVar.f22612a = true;
                } else if (z3 && z2) {
                    m30424l(eVar, C7806e.C7808b.FIXED, gVar2.f23104g, bVar3, gVar3.f23104g);
                    if (bVar2 == C7806e.C7808b.MATCH_CONSTRAINT) {
                        eVar.f22622f.f23155e.f23119m = eVar.mo22683v();
                    } else {
                        eVar.f22622f.f23155e.mo23177d(eVar.mo22683v());
                        eVar.f22612a = true;
                    }
                } else if (z4 && z) {
                    m30424l(eVar, bVar3, gVar2.f23104g, C7806e.C7808b.FIXED, gVar3.f23104g);
                    if (bVar == C7806e.C7808b.MATCH_CONSTRAINT) {
                        eVar.f22620e.f23155e.f23119m = eVar.mo22627U();
                    } else {
                        eVar.f22620e.f23155e.mo23177d(eVar.mo22627U());
                        eVar.f22612a = true;
                    }
                }
                if (eVar.f22612a && (gVar = eVar.f22622f.f23134l) != null) {
                    gVar.mo23177d(eVar.mo22668n());
                }
            }
        }
    }

    /* renamed from: n */
    public void mo23174n(C8006b.C8008b bVar) {
        this.f23095g = bVar;
    }
}
