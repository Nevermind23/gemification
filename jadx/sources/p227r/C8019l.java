package p227r;

import p214q.C7803d;
import p214q.C7806e;
import p214q.C7812h;
import p227r.C8012f;
import p227r.C8026p;

/* renamed from: r.l */
public class C8019l extends C8026p {

    /* renamed from: k */
    private static int[] f23123k = new int[2];

    /* renamed from: r.l$a */
    static /* synthetic */ class C8020a {

        /* renamed from: a */
        static final /* synthetic */ int[] f23124a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                r.p$b[] r0 = p227r.C8026p.C8028b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23124a = r0
                r.p$b r1 = p227r.C8026p.C8028b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f23124a     // Catch:{ NoSuchFieldError -> 0x001d }
                r.p$b r1 = p227r.C8026p.C8028b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f23124a     // Catch:{ NoSuchFieldError -> 0x0028 }
                r.p$b r1 = p227r.C8026p.C8028b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p227r.C8019l.C8020a.<clinit>():void");
        }
    }

    public C8019l(C7806e eVar) {
        super(eVar);
        this.f23158h.f23102e = C8012f.C8013a.LEFT;
        this.f23159i.f23102e = C8012f.C8013a.RIGHT;
        this.f23156f = 0;
    }

    /* renamed from: q */
    private void m30464q(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 == -1) {
            int i8 = (int) ((((float) i7) * f) + 0.5f);
            int i9 = (int) ((((float) i6) / f) + 0.5f);
            if (i8 <= i6) {
                iArr[0] = i8;
                iArr[1] = i7;
            } else if (i9 <= i7) {
                iArr[0] = i6;
                iArr[1] = i9;
            }
        } else if (i5 == 0) {
            iArr[0] = (int) ((((float) i7) * f) + 0.5f);
            iArr[1] = i7;
        } else if (i5 == 1) {
            iArr[0] = i6;
            iArr[1] = (int) ((((float) i6) * f) + 0.5f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02b9, code lost:
        if (r14 != 1) goto L_0x031e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23159a(p227r.C8010d r17) {
        /*
            r16 = this;
            r8 = r16
            int[] r0 = p227r.C8019l.C8020a.f23124a
            r.p$b r1 = r8.f23160j
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 3
            r9 = 1
            r10 = 0
            if (r0 == r9) goto L_0x0029
            if (r0 == r1) goto L_0x0023
            if (r0 == r2) goto L_0x0017
            goto L_0x002e
        L_0x0017:
            q.e r0 = r8.f23152b
            q.d r1 = r0.f22600O
            q.d r0 = r0.f22602Q
            r3 = r17
            r8.mo23200n(r3, r1, r0, r10)
            return
        L_0x0023:
            r3 = r17
            r16.mo23201o(r17)
            goto L_0x002e
        L_0x0029:
            r3 = r17
            r16.mo23202p(r17)
        L_0x002e:
            r.g r0 = r8.f23155e
            boolean r0 = r0.f23107j
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r0 != 0) goto L_0x031e
            q.e$b r0 = r8.f23154d
            q.e$b r3 = p214q.C7806e.C7808b.MATCH_CONSTRAINT
            if (r0 != r3) goto L_0x031e
            q.e r0 = r8.f23152b
            int r3 = r0.f22656w
            if (r3 == r1) goto L_0x0301
            if (r3 == r2) goto L_0x0046
            goto L_0x031e
        L_0x0046:
            int r1 = r0.f22658x
            r3 = -1
            if (r1 == 0) goto L_0x008e
            if (r1 != r2) goto L_0x004e
            goto L_0x008e
        L_0x004e:
            int r0 = r0.mo22682u()
            if (r0 == r3) goto L_0x0077
            if (r0 == 0) goto L_0x0068
            if (r0 == r9) goto L_0x005a
            r0 = r10
            goto L_0x0087
        L_0x005a:
            q.e r0 = r8.f23152b
            r.n r1 = r0.f22622f
            r.g r1 = r1.f23155e
            int r1 = r1.f23104g
            float r1 = (float) r1
            float r0 = r0.mo22680t()
            goto L_0x0084
        L_0x0068:
            q.e r0 = r8.f23152b
            r.n r1 = r0.f22622f
            r.g r1 = r1.f23155e
            int r1 = r1.f23104g
            float r1 = (float) r1
            float r0 = r0.mo22680t()
            float r1 = r1 / r0
            goto L_0x0085
        L_0x0077:
            q.e r0 = r8.f23152b
            r.n r1 = r0.f22622f
            r.g r1 = r1.f23155e
            int r1 = r1.f23104g
            float r1 = (float) r1
            float r0 = r0.mo22680t()
        L_0x0084:
            float r1 = r1 * r0
        L_0x0085:
            float r1 = r1 + r11
            int r0 = (int) r1
        L_0x0087:
            r.g r1 = r8.f23155e
            r1.mo23177d(r0)
            goto L_0x031e
        L_0x008e:
            r.n r1 = r0.f22622f
            r.f r12 = r1.f23158h
            r.f r13 = r1.f23159i
            q.d r1 = r0.f22600O
            q.d r1 = r1.f22560f
            if (r1 == 0) goto L_0x009c
            r1 = r9
            goto L_0x009d
        L_0x009c:
            r1 = r10
        L_0x009d:
            q.d r2 = r0.f22601P
            q.d r2 = r2.f22560f
            if (r2 == 0) goto L_0x00a5
            r2 = r9
            goto L_0x00a6
        L_0x00a5:
            r2 = r10
        L_0x00a6:
            q.d r4 = r0.f22602Q
            q.d r4 = r4.f22560f
            if (r4 == 0) goto L_0x00ae
            r4 = r9
            goto L_0x00af
        L_0x00ae:
            r4 = r10
        L_0x00af:
            q.d r5 = r0.f22603R
            q.d r5 = r5.f22560f
            if (r5 == 0) goto L_0x00b7
            r5 = r9
            goto L_0x00b8
        L_0x00b7:
            r5 = r10
        L_0x00b8:
            int r14 = r0.mo22682u()
            if (r1 == 0) goto L_0x01ff
            if (r2 == 0) goto L_0x01ff
            if (r4 == 0) goto L_0x01ff
            if (r5 == 0) goto L_0x01ff
            q.e r0 = r8.f23152b
            float r15 = r0.mo22680t()
            boolean r0 = r12.f23107j
            if (r0 == 0) goto L_0x012d
            boolean r0 = r13.f23107j
            if (r0 == 0) goto L_0x012d
            r.f r0 = r8.f23158h
            boolean r1 = r0.f23100c
            if (r1 == 0) goto L_0x012c
            r.f r1 = r8.f23159i
            boolean r1 = r1.f23100c
            if (r1 != 0) goto L_0x00df
            goto L_0x012c
        L_0x00df:
            java.util.List r0 = r0.f23109l
            java.lang.Object r0 = r0.get(r10)
            r.f r0 = (p227r.C8012f) r0
            int r0 = r0.f23104g
            r.f r1 = r8.f23158h
            int r1 = r1.f23103f
            int r2 = r0 + r1
            r.f r0 = r8.f23159i
            java.util.List r0 = r0.f23109l
            java.lang.Object r0 = r0.get(r10)
            r.f r0 = (p227r.C8012f) r0
            int r0 = r0.f23104g
            r.f r1 = r8.f23159i
            int r1 = r1.f23103f
            int r3 = r0 - r1
            int r0 = r12.f23104g
            int r1 = r12.f23103f
            int r4 = r0 + r1
            int r0 = r13.f23104g
            int r1 = r13.f23103f
            int r5 = r0 - r1
            int[] r1 = f23123k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.m30464q(r1, r2, r3, r4, r5, r6, r7)
            r.g r0 = r8.f23155e
            int[] r1 = f23123k
            r1 = r1[r10]
            r0.mo23177d(r1)
            q.e r0 = r8.f23152b
            r.n r0 = r0.f22622f
            r.g r0 = r0.f23155e
            int[] r1 = f23123k
            r1 = r1[r9]
            r0.mo23177d(r1)
        L_0x012c:
            return
        L_0x012d:
            r.f r0 = r8.f23158h
            boolean r1 = r0.f23107j
            if (r1 == 0) goto L_0x018a
            r.f r1 = r8.f23159i
            boolean r2 = r1.f23107j
            if (r2 == 0) goto L_0x018a
            boolean r2 = r12.f23100c
            if (r2 == 0) goto L_0x0189
            boolean r2 = r13.f23100c
            if (r2 != 0) goto L_0x0142
            goto L_0x0189
        L_0x0142:
            int r2 = r0.f23104g
            int r0 = r0.f23103f
            int r2 = r2 + r0
            int r0 = r1.f23104g
            int r1 = r1.f23103f
            int r3 = r0 - r1
            java.util.List r0 = r12.f23109l
            java.lang.Object r0 = r0.get(r10)
            r.f r0 = (p227r.C8012f) r0
            int r0 = r0.f23104g
            int r1 = r12.f23103f
            int r4 = r0 + r1
            java.util.List r0 = r13.f23109l
            java.lang.Object r0 = r0.get(r10)
            r.f r0 = (p227r.C8012f) r0
            int r0 = r0.f23104g
            int r1 = r13.f23103f
            int r5 = r0 - r1
            int[] r1 = f23123k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.m30464q(r1, r2, r3, r4, r5, r6, r7)
            r.g r0 = r8.f23155e
            int[] r1 = f23123k
            r1 = r1[r10]
            r0.mo23177d(r1)
            q.e r0 = r8.f23152b
            r.n r0 = r0.f22622f
            r.g r0 = r0.f23155e
            int[] r1 = f23123k
            r1 = r1[r9]
            r0.mo23177d(r1)
            goto L_0x018a
        L_0x0189:
            return
        L_0x018a:
            r.f r0 = r8.f23158h
            boolean r1 = r0.f23100c
            if (r1 == 0) goto L_0x01fe
            r.f r1 = r8.f23159i
            boolean r1 = r1.f23100c
            if (r1 == 0) goto L_0x01fe
            boolean r1 = r12.f23100c
            if (r1 == 0) goto L_0x01fe
            boolean r1 = r13.f23100c
            if (r1 != 0) goto L_0x019f
            goto L_0x01fe
        L_0x019f:
            java.util.List r0 = r0.f23109l
            java.lang.Object r0 = r0.get(r10)
            r.f r0 = (p227r.C8012f) r0
            int r0 = r0.f23104g
            r.f r1 = r8.f23158h
            int r1 = r1.f23103f
            int r2 = r0 + r1
            r.f r0 = r8.f23159i
            java.util.List r0 = r0.f23109l
            java.lang.Object r0 = r0.get(r10)
            r.f r0 = (p227r.C8012f) r0
            int r0 = r0.f23104g
            r.f r1 = r8.f23159i
            int r1 = r1.f23103f
            int r3 = r0 - r1
            java.util.List r0 = r12.f23109l
            java.lang.Object r0 = r0.get(r10)
            r.f r0 = (p227r.C8012f) r0
            int r0 = r0.f23104g
            int r1 = r12.f23103f
            int r4 = r0 + r1
            java.util.List r0 = r13.f23109l
            java.lang.Object r0 = r0.get(r10)
            r.f r0 = (p227r.C8012f) r0
            int r0 = r0.f23104g
            int r1 = r13.f23103f
            int r5 = r0 - r1
            int[] r1 = f23123k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.m30464q(r1, r2, r3, r4, r5, r6, r7)
            r.g r0 = r8.f23155e
            int[] r1 = f23123k
            r1 = r1[r10]
            r0.mo23177d(r1)
            q.e r0 = r8.f23152b
            r.n r0 = r0.f22622f
            r.g r0 = r0.f23155e
            int[] r1 = f23123k
            r1 = r1[r9]
            r0.mo23177d(r1)
            goto L_0x031e
        L_0x01fe:
            return
        L_0x01ff:
            if (r1 == 0) goto L_0x0288
            if (r4 == 0) goto L_0x0288
            r.f r0 = r8.f23158h
            boolean r0 = r0.f23100c
            if (r0 == 0) goto L_0x0287
            r.f r0 = r8.f23159i
            boolean r0 = r0.f23100c
            if (r0 != 0) goto L_0x0211
            goto L_0x0287
        L_0x0211:
            q.e r0 = r8.f23152b
            float r0 = r0.mo22680t()
            r.f r1 = r8.f23158h
            java.util.List r1 = r1.f23109l
            java.lang.Object r1 = r1.get(r10)
            r.f r1 = (p227r.C8012f) r1
            int r1 = r1.f23104g
            r.f r2 = r8.f23158h
            int r2 = r2.f23103f
            int r1 = r1 + r2
            r.f r2 = r8.f23159i
            java.util.List r2 = r2.f23109l
            java.lang.Object r2 = r2.get(r10)
            r.f r2 = (p227r.C8012f) r2
            int r2 = r2.f23104g
            r.f r4 = r8.f23159i
            int r4 = r4.f23103f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x0264
            if (r14 == 0) goto L_0x0264
            if (r14 == r9) goto L_0x0241
            goto L_0x031e
        L_0x0241:
            int r2 = r2 - r1
            int r1 = r8.mo23196g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo23196g(r2, r9)
            if (r2 == r3) goto L_0x0254
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x0254:
            r.g r0 = r8.f23155e
            r0.mo23177d(r1)
            q.e r0 = r8.f23152b
            r.n r0 = r0.f22622f
            r.g r0 = r0.f23155e
            r0.mo23177d(r3)
            goto L_0x031e
        L_0x0264:
            int r2 = r2 - r1
            int r1 = r8.mo23196g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo23196g(r2, r9)
            if (r2 == r3) goto L_0x0277
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x0277:
            r.g r0 = r8.f23155e
            r0.mo23177d(r1)
            q.e r0 = r8.f23152b
            r.n r0 = r0.f22622f
            r.g r0 = r0.f23155e
            r0.mo23177d(r3)
            goto L_0x031e
        L_0x0287:
            return
        L_0x0288:
            if (r2 == 0) goto L_0x031e
            if (r5 == 0) goto L_0x031e
            boolean r0 = r12.f23100c
            if (r0 == 0) goto L_0x0300
            boolean r0 = r13.f23100c
            if (r0 != 0) goto L_0x0295
            goto L_0x0300
        L_0x0295:
            q.e r0 = r8.f23152b
            float r0 = r0.mo22680t()
            java.util.List r1 = r12.f23109l
            java.lang.Object r1 = r1.get(r10)
            r.f r1 = (p227r.C8012f) r1
            int r1 = r1.f23104g
            int r2 = r12.f23103f
            int r1 = r1 + r2
            java.util.List r2 = r13.f23109l
            java.lang.Object r2 = r2.get(r10)
            r.f r2 = (p227r.C8012f) r2
            int r2 = r2.f23104g
            int r4 = r13.f23103f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x02de
            if (r14 == 0) goto L_0x02bc
            if (r14 == r9) goto L_0x02de
            goto L_0x031e
        L_0x02bc:
            int r2 = r2 - r1
            int r1 = r8.mo23196g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo23196g(r2, r10)
            if (r2 == r3) goto L_0x02cf
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02cf:
            r.g r0 = r8.f23155e
            r0.mo23177d(r3)
            q.e r0 = r8.f23152b
            r.n r0 = r0.f22622f
            r.g r0 = r0.f23155e
            r0.mo23177d(r1)
            goto L_0x031e
        L_0x02de:
            int r2 = r2 - r1
            int r1 = r8.mo23196g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo23196g(r2, r10)
            if (r2 == r3) goto L_0x02f1
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02f1:
            r.g r0 = r8.f23155e
            r0.mo23177d(r3)
            q.e r0 = r8.f23152b
            r.n r0 = r0.f22622f
            r.g r0 = r0.f23155e
            r0.mo23177d(r1)
            goto L_0x031e
        L_0x0300:
            return
        L_0x0301:
            q.e r0 = r0.mo22605I()
            if (r0 == 0) goto L_0x031e
            r.l r0 = r0.f22620e
            r.g r0 = r0.f23155e
            boolean r1 = r0.f23107j
            if (r1 == 0) goto L_0x031e
            q.e r1 = r8.f23152b
            float r1 = r1.f22578B
            int r0 = r0.f23104g
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r11
            int r0 = (int) r0
            r.g r1 = r8.f23155e
            r1.mo23177d(r0)
        L_0x031e:
            r.f r0 = r8.f23158h
            boolean r1 = r0.f23100c
            if (r1 == 0) goto L_0x043e
            r.f r1 = r8.f23159i
            boolean r2 = r1.f23100c
            if (r2 != 0) goto L_0x032c
            goto L_0x043e
        L_0x032c:
            boolean r0 = r0.f23107j
            if (r0 == 0) goto L_0x033b
            boolean r0 = r1.f23107j
            if (r0 == 0) goto L_0x033b
            r.g r0 = r8.f23155e
            boolean r0 = r0.f23107j
            if (r0 == 0) goto L_0x033b
            return
        L_0x033b:
            r.g r0 = r8.f23155e
            boolean r0 = r0.f23107j
            if (r0 != 0) goto L_0x0385
            q.e$b r0 = r8.f23154d
            q.e$b r1 = p214q.C7806e.C7808b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x0385
            q.e r0 = r8.f23152b
            int r1 = r0.f22656w
            if (r1 != 0) goto L_0x0385
            boolean r0 = r0.mo22652g0()
            if (r0 != 0) goto L_0x0385
            r.f r0 = r8.f23158h
            java.util.List r0 = r0.f23109l
            java.lang.Object r0 = r0.get(r10)
            r.f r0 = (p227r.C8012f) r0
            r.f r1 = r8.f23159i
            java.util.List r1 = r1.f23109l
            java.lang.Object r1 = r1.get(r10)
            r.f r1 = (p227r.C8012f) r1
            int r0 = r0.f23104g
            r.f r2 = r8.f23158h
            int r3 = r2.f23103f
            int r0 = r0 + r3
            int r1 = r1.f23104g
            r.f r3 = r8.f23159i
            int r3 = r3.f23103f
            int r1 = r1 + r3
            int r3 = r1 - r0
            r2.mo23177d(r0)
            r.f r0 = r8.f23159i
            r0.mo23177d(r1)
            r.g r0 = r8.f23155e
            r0.mo23177d(r3)
            return
        L_0x0385:
            r.g r0 = r8.f23155e
            boolean r0 = r0.f23107j
            if (r0 != 0) goto L_0x03e9
            q.e$b r0 = r8.f23154d
            q.e$b r1 = p214q.C7806e.C7808b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x03e9
            int r0 = r8.f23151a
            if (r0 != r9) goto L_0x03e9
            r.f r0 = r8.f23158h
            java.util.List r0 = r0.f23109l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03e9
            r.f r0 = r8.f23159i
            java.util.List r0 = r0.f23109l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03e9
            r.f r0 = r8.f23158h
            java.util.List r0 = r0.f23109l
            java.lang.Object r0 = r0.get(r10)
            r.f r0 = (p227r.C8012f) r0
            r.f r1 = r8.f23159i
            java.util.List r1 = r1.f23109l
            java.lang.Object r1 = r1.get(r10)
            r.f r1 = (p227r.C8012f) r1
            int r0 = r0.f23104g
            r.f r2 = r8.f23158h
            int r2 = r2.f23103f
            int r0 = r0 + r2
            int r1 = r1.f23104g
            r.f r2 = r8.f23159i
            int r2 = r2.f23103f
            int r1 = r1 + r2
            int r1 = r1 - r0
            r.g r0 = r8.f23155e
            int r0 = r0.f23119m
            int r0 = java.lang.Math.min(r1, r0)
            q.e r1 = r8.f23152b
            int r2 = r1.f22576A
            int r1 = r1.f22662z
            int r0 = java.lang.Math.max(r1, r0)
            if (r2 <= 0) goto L_0x03e4
            int r0 = java.lang.Math.min(r2, r0)
        L_0x03e4:
            r.g r1 = r8.f23155e
            r1.mo23177d(r0)
        L_0x03e9:
            r.g r0 = r8.f23155e
            boolean r0 = r0.f23107j
            if (r0 != 0) goto L_0x03f0
            return
        L_0x03f0:
            r.f r0 = r8.f23158h
            java.util.List r0 = r0.f23109l
            java.lang.Object r0 = r0.get(r10)
            r.f r0 = (p227r.C8012f) r0
            r.f r1 = r8.f23159i
            java.util.List r1 = r1.f23109l
            java.lang.Object r1 = r1.get(r10)
            r.f r1 = (p227r.C8012f) r1
            int r2 = r0.f23104g
            r.f r3 = r8.f23158h
            int r3 = r3.f23103f
            int r2 = r2 + r3
            int r3 = r1.f23104g
            r.f r4 = r8.f23159i
            int r4 = r4.f23103f
            int r3 = r3 + r4
            q.e r4 = r8.f23152b
            float r4 = r4.mo22684w()
            if (r0 != r1) goto L_0x041f
            int r2 = r0.f23104g
            int r3 = r1.f23104g
            r4 = r11
        L_0x041f:
            int r3 = r3 - r2
            r.g r0 = r8.f23155e
            int r0 = r0.f23104g
            int r3 = r3 - r0
            r.f r0 = r8.f23158h
            float r1 = (float) r2
            float r1 = r1 + r11
            float r2 = (float) r3
            float r2 = r2 * r4
            float r1 = r1 + r2
            int r1 = (int) r1
            r0.mo23177d(r1)
            r.f r0 = r8.f23159i
            r.f r1 = r8.f23158h
            int r1 = r1.f23104g
            r.g r2 = r8.f23155e
            int r2 = r2.f23104g
            int r1 = r1 + r2
            r0.mo23177d(r1)
        L_0x043e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p227r.C8019l.mo23159a(r.d):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo23160d() {
        C7806e I;
        C7806e I2;
        C7806e eVar = this.f23152b;
        if (eVar.f22612a) {
            this.f23155e.mo23177d(eVar.mo22627U());
        }
        if (!this.f23155e.f23107j) {
            C7806e.C7808b y = this.f23152b.mo22687y();
            this.f23154d = y;
            if (y != C7806e.C7808b.MATCH_CONSTRAINT) {
                C7806e.C7808b bVar = C7806e.C7808b.MATCH_PARENT;
                if (y == bVar && (I2 = this.f23152b.mo22605I()) != null && (I2.mo22687y() == C7806e.C7808b.FIXED || I2.mo22687y() == bVar)) {
                    int U = (I2.mo22627U() - this.f23152b.f22600O.mo22573e()) - this.f23152b.f22602Q.mo22573e();
                    mo23194b(this.f23158h, I2.f22620e.f23158h, this.f23152b.f22600O.mo22573e());
                    mo23194b(this.f23159i, I2.f22620e.f23159i, -this.f23152b.f22602Q.mo22573e());
                    this.f23155e.mo23177d(U);
                    return;
                } else if (this.f23154d == C7806e.C7808b.FIXED) {
                    this.f23155e.mo23177d(this.f23152b.mo22627U());
                }
            }
        } else {
            C7806e.C7808b bVar2 = this.f23154d;
            C7806e.C7808b bVar3 = C7806e.C7808b.MATCH_PARENT;
            if (bVar2 == bVar3 && (I = this.f23152b.mo22605I()) != null && (I.mo22687y() == C7806e.C7808b.FIXED || I.mo22687y() == bVar3)) {
                mo23194b(this.f23158h, I.f22620e.f23158h, this.f23152b.f22600O.mo22573e());
                mo23194b(this.f23159i, I.f22620e.f23159i, -this.f23152b.f22602Q.mo22573e());
                return;
            }
        }
        C8014g gVar = this.f23155e;
        if (gVar.f23107j) {
            C7806e eVar2 = this.f23152b;
            if (eVar2.f22612a) {
                C7803d[] dVarArr = eVar2.f22608W;
                C7803d dVar = dVarArr[0];
                C7803d dVar2 = dVar.f22560f;
                if (dVar2 == null || dVarArr[1].f22560f == null) {
                    if (dVar2 != null) {
                        C8012f h = mo23197h(dVar);
                        if (h != null) {
                            mo23194b(this.f23158h, h, this.f23152b.f22608W[0].mo22573e());
                            mo23194b(this.f23159i, this.f23158h, this.f23155e.f23104g);
                            return;
                        }
                        return;
                    }
                    C7803d dVar3 = dVarArr[1];
                    if (dVar3.f22560f != null) {
                        C8012f h2 = mo23197h(dVar3);
                        if (h2 != null) {
                            mo23194b(this.f23159i, h2, -this.f23152b.f22608W[1].mo22573e());
                            mo23194b(this.f23158h, this.f23159i, -this.f23155e.f23104g);
                            return;
                        }
                        return;
                    } else if (!(eVar2 instanceof C7812h) && eVar2.mo22605I() != null && this.f23152b.mo22666m(C7803d.C7805b.CENTER).f22560f == null) {
                        mo23194b(this.f23158h, this.f23152b.mo22605I().f22620e.f23158h, this.f23152b.mo22629V());
                        mo23194b(this.f23159i, this.f23158h, this.f23155e.f23104g);
                        return;
                    } else {
                        return;
                    }
                } else if (eVar2.mo22652g0()) {
                    this.f23158h.f23103f = this.f23152b.f22608W[0].mo22573e();
                    this.f23159i.f23103f = -this.f23152b.f22608W[1].mo22573e();
                    return;
                } else {
                    C8012f h3 = mo23197h(this.f23152b.f22608W[0]);
                    if (h3 != null) {
                        mo23194b(this.f23158h, h3, this.f23152b.f22608W[0].mo22573e());
                    }
                    C8012f h4 = mo23197h(this.f23152b.f22608W[1]);
                    if (h4 != null) {
                        mo23194b(this.f23159i, h4, -this.f23152b.f22608W[1].mo22573e());
                    }
                    this.f23158h.f23099b = true;
                    this.f23159i.f23099b = true;
                    return;
                }
            }
        }
        if (this.f23154d == C7806e.C7808b.MATCH_CONSTRAINT) {
            C7806e eVar3 = this.f23152b;
            int i = eVar3.f22656w;
            if (i == 2) {
                C7806e I3 = eVar3.mo22605I();
                if (I3 != null) {
                    C8014g gVar2 = I3.f22622f.f23155e;
                    this.f23155e.f23109l.add(gVar2);
                    gVar2.f23108k.add(this.f23155e);
                    C8014g gVar3 = this.f23155e;
                    gVar3.f23099b = true;
                    gVar3.f23108k.add(this.f23158h);
                    this.f23155e.f23108k.add(this.f23159i);
                }
            } else if (i == 3) {
                if (eVar3.f22658x == 3) {
                    this.f23158h.f23098a = this;
                    this.f23159i.f23098a = this;
                    C8022n nVar = eVar3.f22622f;
                    nVar.f23158h.f23098a = this;
                    nVar.f23159i.f23098a = this;
                    gVar.f23098a = this;
                    if (eVar3.mo22656i0()) {
                        this.f23155e.f23109l.add(this.f23152b.f22622f.f23155e);
                        this.f23152b.f22622f.f23155e.f23108k.add(this.f23155e);
                        C8022n nVar2 = this.f23152b.f22622f;
                        nVar2.f23155e.f23098a = this;
                        this.f23155e.f23109l.add(nVar2.f23158h);
                        this.f23155e.f23109l.add(this.f23152b.f22622f.f23159i);
                        this.f23152b.f22622f.f23158h.f23108k.add(this.f23155e);
                        this.f23152b.f22622f.f23159i.f23108k.add(this.f23155e);
                    } else if (this.f23152b.mo22652g0()) {
                        this.f23152b.f22622f.f23155e.f23109l.add(this.f23155e);
                        this.f23155e.f23108k.add(this.f23152b.f22622f.f23155e);
                    } else {
                        this.f23152b.f22622f.f23155e.f23109l.add(this.f23155e);
                    }
                } else {
                    C8014g gVar4 = eVar3.f22622f.f23155e;
                    gVar.f23109l.add(gVar4);
                    gVar4.f23108k.add(this.f23155e);
                    this.f23152b.f22622f.f23158h.f23108k.add(this.f23155e);
                    this.f23152b.f22622f.f23159i.f23108k.add(this.f23155e);
                    C8014g gVar5 = this.f23155e;
                    gVar5.f23099b = true;
                    gVar5.f23108k.add(this.f23158h);
                    this.f23155e.f23108k.add(this.f23159i);
                    this.f23158h.f23109l.add(this.f23155e);
                    this.f23159i.f23109l.add(this.f23155e);
                }
            }
        }
        C7806e eVar4 = this.f23152b;
        C7803d[] dVarArr2 = eVar4.f22608W;
        C7803d dVar4 = dVarArr2[0];
        C7803d dVar5 = dVar4.f22560f;
        if (dVar5 == null || dVarArr2[1].f22560f == null) {
            if (dVar5 != null) {
                C8012f h5 = mo23197h(dVar4);
                if (h5 != null) {
                    mo23194b(this.f23158h, h5, this.f23152b.f22608W[0].mo22573e());
                    mo23195c(this.f23159i, this.f23158h, 1, this.f23155e);
                    return;
                }
                return;
            }
            C7803d dVar6 = dVarArr2[1];
            if (dVar6.f22560f != null) {
                C8012f h6 = mo23197h(dVar6);
                if (h6 != null) {
                    mo23194b(this.f23159i, h6, -this.f23152b.f22608W[1].mo22573e());
                    mo23195c(this.f23158h, this.f23159i, -1, this.f23155e);
                }
            } else if (!(eVar4 instanceof C7812h) && eVar4.mo22605I() != null) {
                mo23194b(this.f23158h, this.f23152b.mo22605I().f22620e.f23158h, this.f23152b.mo22629V());
                mo23195c(this.f23159i, this.f23158h, 1, this.f23155e);
            }
        } else if (eVar4.mo22652g0()) {
            this.f23158h.f23103f = this.f23152b.f22608W[0].mo22573e();
            this.f23159i.f23103f = -this.f23152b.f22608W[1].mo22573e();
        } else {
            C8012f h7 = mo23197h(this.f23152b.f22608W[0]);
            C8012f h8 = mo23197h(this.f23152b.f22608W[1]);
            if (h7 != null) {
                h7.mo23175b(this);
            }
            if (h8 != null) {
                h8.mo23175b(this);
            }
            this.f23160j = C8026p.C8028b.CENTER;
        }
    }

    /* renamed from: e */
    public void mo23161e() {
        C8012f fVar = this.f23158h;
        if (fVar.f23107j) {
            this.f23152b.mo22657i1(fVar.f23104g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo23162f() {
        this.f23153c = null;
        this.f23158h.mo23176c();
        this.f23159i.mo23176c();
        this.f23155e.mo23176c();
        this.f23157g = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo23164m() {
        if (this.f23154d != C7806e.C7808b.MATCH_CONSTRAINT || this.f23152b.f22656w == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo23179r() {
        this.f23157g = false;
        this.f23158h.mo23176c();
        this.f23158h.f23107j = false;
        this.f23159i.mo23176c();
        this.f23159i.f23107j = false;
        this.f23155e.f23107j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f23152b.mo22676r();
    }
}
