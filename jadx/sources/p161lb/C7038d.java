package p161lb;

import com.salesforce.marketingcloud.C11398b;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: lb.d */
public final class C7038d {

    /* renamed from: b */
    static final String[] f20953b = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* renamed from: c */
    static final int[][] f20954c = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* renamed from: d */
    private static final int[][] f20955d;

    /* renamed from: e */
    static final int[][] f20956e;

    /* renamed from: a */
    private final byte[] f20957a;

    /* renamed from: lb.d$a */
    class C7039a implements Comparator {
        C7039a() {
        }

        /* renamed from: a */
        public int compare(C7041f fVar, C7041f fVar2) {
            return fVar.mo21260e() - fVar2.mo21260e();
        }
    }

    static {
        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, new int[]{5, C11398b.f33139r});
        f20955d = iArr;
        iArr[0][32] = 1;
        for (int i = 65; i <= 90; i++) {
            f20955d[0][i] = (i - 65) + 2;
        }
        f20955d[1][32] = 1;
        for (int i2 = 97; i2 <= 122; i2++) {
            f20955d[1][i2] = (i2 - 97) + 2;
        }
        f20955d[2][32] = 1;
        for (int i3 = 48; i3 <= 57; i3++) {
            f20955d[2][i3] = (i3 - 48) + 2;
        }
        int[] iArr2 = f20955d[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, C11051p3.f31760d};
        for (int i4 = 0; i4 < 28; i4++) {
            f20955d[3][iArr3[i4]] = i4;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i5 = 0; i5 < 31; i5++) {
            int i6 = iArr4[i5];
            if (i6 > 0) {
                f20955d[4][i6] = i5;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance(Integer.TYPE, new int[]{6, 6});
        f20956e = iArr5;
        for (int[] fill : iArr5) {
            Arrays.fill(fill, -1);
        }
        int[][] iArr6 = f20956e;
        iArr6[0][4] = 0;
        int[] iArr7 = iArr6[1];
        iArr7[4] = 0;
        iArr7[0] = 28;
        iArr6[3][4] = 0;
        int[] iArr8 = iArr6[2];
        iArr8[4] = 0;
        iArr8[0] = 15;
    }

    public C7038d(byte[] bArr) {
        this.f20957a = bArr;
    }

    /* renamed from: b */
    private static Collection m27259b(Iterable iterable) {
        boolean z;
        LinkedList linkedList = new LinkedList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C7041f fVar = (C7041f) it.next();
            Iterator it2 = linkedList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = true;
                    break;
                }
                C7041f fVar2 = (C7041f) it2.next();
                if (fVar2.mo21262g(fVar)) {
                    z = false;
                    break;
                } else if (fVar.mo21262g(fVar2)) {
                    it2.remove();
                }
            }
            if (z) {
                linkedList.add(fVar);
            }
        }
        return linkedList;
    }

    /* renamed from: c */
    private void m27260c(C7041f fVar, int i, Collection collection) {
        boolean z;
        char c = (char) (this.f20957a[i] & 255);
        if (f20955d[fVar.mo21261f()][c] > 0) {
            z = true;
        } else {
            z = false;
        }
        C7041f fVar2 = null;
        for (int i2 = 0; i2 <= 4; i2++) {
            int i3 = f20955d[i2][c];
            if (i3 > 0) {
                if (fVar2 == null) {
                    fVar2 = fVar.mo21258c(i);
                }
                if (!z || i2 == fVar.mo21261f() || i2 == 2) {
                    collection.add(fVar2.mo21263h(i2, i3));
                }
                if (!z && f20956e[fVar.mo21261f()][i2] >= 0) {
                    collection.add(fVar2.mo21264i(i2, i3));
                }
            }
        }
        if (fVar.mo21259d() > 0 || f20955d[fVar.mo21261f()][c] == 0) {
            collection.add(fVar.mo21257a(i));
        }
    }

    /* renamed from: d */
    private static void m27261d(C7041f fVar, int i, int i2, Collection collection) {
        C7041f c = fVar.mo21258c(i);
        collection.add(c.mo21263h(4, i2));
        if (fVar.mo21261f() != 4) {
            collection.add(c.mo21264i(4, i2));
        }
        if (i2 == 3 || i2 == 4) {
            collection.add(c.mo21263h(2, 16 - i2).mo21263h(2, 1));
        }
        if (fVar.mo21259d() > 0) {
            collection.add(fVar.mo21257a(i).mo21257a(i + 1));
        }
    }

    /* renamed from: e */
    private Collection m27262e(Iterable iterable, int i) {
        LinkedList linkedList = new LinkedList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            m27260c((C7041f) it.next(), i, linkedList);
        }
        return m27259b(linkedList);
    }

    /* renamed from: f */
    private static Collection m27263f(Iterable iterable, int i, int i2) {
        LinkedList linkedList = new LinkedList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            m27261d((C7041f) it.next(), i, i2, linkedList);
        }
        return m27259b(linkedList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p200ob.C7507a mo21253a() {
        /*
            r8 = this;
            lb.f r0 = p161lb.C7041f.f20961e
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1 = 0
            r2 = r1
        L_0x0008:
            byte[] r3 = r8.f20957a
            int r4 = r3.length
            if (r2 >= r4) goto L_0x004c
            int r4 = r2 + 1
            int r5 = r3.length
            if (r4 >= r5) goto L_0x0015
            byte r5 = r3[r4]
            goto L_0x0016
        L_0x0015:
            r5 = r1
        L_0x0016:
            byte r3 = r3[r2]
            r6 = 13
            if (r3 == r6) goto L_0x0038
            r6 = 44
            r7 = 32
            if (r3 == r6) goto L_0x0034
            r6 = 46
            if (r3 == r6) goto L_0x0030
            r6 = 58
            if (r3 == r6) goto L_0x002c
        L_0x002a:
            r3 = r1
            goto L_0x003d
        L_0x002c:
            if (r5 != r7) goto L_0x002a
            r3 = 5
            goto L_0x003d
        L_0x0030:
            if (r5 != r7) goto L_0x002a
            r3 = 3
            goto L_0x003d
        L_0x0034:
            if (r5 != r7) goto L_0x002a
            r3 = 4
            goto L_0x003d
        L_0x0038:
            r3 = 10
            if (r5 != r3) goto L_0x002a
            r3 = 2
        L_0x003d:
            if (r3 <= 0) goto L_0x0045
            java.util.Collection r0 = m27263f(r0, r2, r3)
            r2 = r4
            goto L_0x0049
        L_0x0045:
            java.util.Collection r0 = r8.m27262e(r0, r2)
        L_0x0049:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x004c:
            lb.d$a r1 = new lb.d$a
            r1.<init>()
            java.lang.Object r0 = java.util.Collections.min(r0, r1)
            lb.f r0 = (p161lb.C7041f) r0
            byte[] r1 = r8.f20957a
            ob.a r0 = r0.mo21265j(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p161lb.C7038d.mo21253a():ob.a");
    }
}
