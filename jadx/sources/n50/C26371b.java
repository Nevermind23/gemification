package n50;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l50.C25832l;
import l50.C25835o;
import l50.C25836p;
import l50.C25838r;

/* renamed from: n50.b */
public abstract class C26371b {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: l50.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: l50.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: l50.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: l50.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final l50.C25832l m82431a(l50.C25836p r4, long r5) {
        /*
            r0 = 0
            if (r4 == 0) goto L_0x0030
            l50.o r4 = r4.mo64561a()
            if (r4 == 0) goto L_0x0030
            java.util.List r4 = r4.mo64555a()
            if (r4 == 0) goto L_0x0030
            java.util.Iterator r4 = r4.iterator()
        L_0x0013:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x002e
            java.lang.Object r1 = r4.next()
            r2 = r1
            l50.l r2 = (l50.C25832l) r2
            long r2 = r2.mo64529g()
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x002a
            r2 = 1
            goto L_0x002b
        L_0x002a:
            r2 = 0
        L_0x002b:
            if (r2 == 0) goto L_0x0013
            r0 = r1
        L_0x002e:
            l50.l r0 = (l50.C25832l) r0
        L_0x0030:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n50.C26371b.m82431a(l50.p, long):l50.l");
    }

    /* renamed from: b */
    public static final C25832l m82432b(C25836p pVar, int i) {
        C25835o a;
        List a2;
        if (pVar == null || (a = pVar.mo64561a()) == null || (a2 = a.mo64555a()) == null) {
            return null;
        }
        return (C25832l) C41358y.m120010Z(a2, i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: l50.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: l50.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: l50.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: l50.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: l50.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: l50.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: l50.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long m82433c(l50.C25836p r8, long r9) {
        /*
            if (r8 == 0) goto L_0x0055
            l50.o r8 = r8.mo64561a()
            if (r8 == 0) goto L_0x0055
            java.util.List r8 = r8.mo64555a()
            if (r8 == 0) goto L_0x0055
            java.util.Iterator r8 = r8.iterator()
        L_0x0012:
            boolean r0 = r8.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x004c
            java.lang.Object r0 = r8.next()
            r2 = r0
            l50.l r2 = (l50.C25832l) r2
            java.util.List r2 = r2.mo64522a()
            java.util.Iterator r2 = r2.iterator()
        L_0x0028:
            boolean r3 = r2.hasNext()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0045
            java.lang.Object r3 = r2.next()
            r6 = r3
            l50.r r6 = (l50.C25838r) r6
            long r6 = r6.mo64582h()
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 != 0) goto L_0x0041
            r6 = r4
            goto L_0x0042
        L_0x0041:
            r6 = r5
        L_0x0042:
            if (r6 == 0) goto L_0x0028
            r1 = r3
        L_0x0045:
            if (r1 == 0) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r4 = r5
        L_0x0049:
            if (r4 == 0) goto L_0x0012
            r1 = r0
        L_0x004c:
            l50.l r1 = (l50.C25832l) r1
            if (r1 == 0) goto L_0x0055
            long r8 = r1.mo64529g()
            goto L_0x0057
        L_0x0055:
            r8 = -1
        L_0x0057:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n50.C26371b.m82433c(l50.p, long):long");
    }

    /* renamed from: d */
    public static final int m82434d(C25836p pVar, int i) {
        C25835o a;
        List<C25832l> a2;
        if (!(pVar == null || (a = pVar.mo64561a()) == null || (a2 = a.mo64555a()) == null)) {
            int i2 = 0;
            int i3 = 0;
            for (C25832l u : a2) {
                if (u.mo64545u()) {
                    i3++;
                } else if (i2 == i) {
                    return i2 + i3;
                } else {
                    i2++;
                }
            }
        }
        return 0;
    }

    /* renamed from: e */
    public static final int m82435e(C25836p pVar, long j) {
        C25835o a;
        List<C25832l> a2;
        int i = 0;
        if (!(pVar == null || (a = pVar.mo64561a()) == null || (a2 = a.mo64555a()) == null)) {
            for (C25832l lVar : a2) {
                if (lVar.mo64529g() == j) {
                    return i;
                }
                if (!lVar.mo64545u()) {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: f */
    public static final int m82436f(C25836p pVar, long j) {
        C25835o a;
        List<C25832l> a2;
        if (pVar == null || (a = pVar.mo64561a()) == null || (a2 = a.mo64555a()) == null) {
            return -1;
        }
        for (C25832l a3 : a2) {
            Iterator it = a3.mo64522a().iterator();
            int i = 0;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        C41341q.m119917t();
                    }
                    if (((C25838r) next).mo64582h() == j) {
                        return i;
                    }
                    i = i2;
                }
            }
        }
        return -1;
    }

    /* renamed from: g */
    public static final List m82437g(C25836p pVar) {
        C25835o a;
        List<C25832l> a2;
        if (!(pVar == null || (a = pVar.mo64561a()) == null || (a2 = a.mo64555a()) == null)) {
            ArrayList arrayList = new ArrayList(C41343r.m119925u(a2, 10));
            for (C25832l a3 : a2) {
                arrayList.add(a3.mo64522a());
            }
            List w = C41343r.m119927w(arrayList);
            if (w != null) {
                return w;
            }
        }
        return C41341q.m119907j();
    }
}
