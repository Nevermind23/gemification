package dx0;

import cx0.C31453a;
import cx0.C31456c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;

/* renamed from: dx0.a */
public final class C31613a {
    /* renamed from: a */
    private final C31456c m93720a(C31453a aVar, Map map) {
        return m93722c(map, aVar, (C31456c) null, 4, (Object) null);
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final cx0.C31456c m93721b(java.util.Map r5, cx0.C31453a r6, cx0.C31456c r7) {
        /*
            cx0.c r0 = new cx0.c
            r0.<init>(r6, r7)
            java.lang.String r6 = r6.mo71836s()
            java.lang.Object r6 = r5.get(r6)
            java.util.List r6 = (java.util.List) r6
            r7 = 0
            if (r6 == 0) goto L_0x0085
            r1 = 10
            int r1 = ie1.C41343r.m119925u(r6, r1)
            int r1 = ie1.C41342q0.m119921f(r1)
            r2 = 16
            int r1 = ze1.C43429k.m124585d(r1, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L_0x002b:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0053
            java.lang.Object r1 = r6.next()
            cx0.a r1 = (cx0.C31453a) r1
            long r3 = r1.mo71827j()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            cx0.c r1 = m93721b(r5, r1, r0)
            he1.m r1 = he1.C41233s.m119492a(r3, r1)
            java.lang.Object r3 = r1.mo95678e()
            java.lang.Object r1 = r1.mo95680f()
            r2.put(r3, r1)
            goto L_0x002b
        L_0x0053:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.Set r6 = r2.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x0060:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0086
            java.lang.Object r1 = r6.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            cx0.c r2 = (cx0.C31456c) r2
            if (r2 == 0) goto L_0x0076
            r2 = 1
            goto L_0x0077
        L_0x0076:
            r2 = 0
        L_0x0077:
            if (r2 == 0) goto L_0x0060
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r5.put(r2, r1)
            goto L_0x0060
        L_0x0085:
            r5 = r7
        L_0x0086:
            if (r5 != 0) goto L_0x008c
            java.util.Map r5 = ie1.C41344r0.m119928j()
        L_0x008c:
            r0.mo71850a(r5)
            boolean r5 = r0.mo71854e()
            if (r5 != 0) goto L_0x009f
            cx0.a r5 = r0.mo71852c()
            boolean r5 = r5.mo71823g()
            if (r5 == 0) goto L_0x00af
        L_0x009f:
            boolean r5 = r0.mo71854e()
            if (r5 == 0) goto L_0x00b0
            java.util.Map r5 = r0.mo71851b()
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x00b0
        L_0x00af:
            return r7
        L_0x00b0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dx0.C31613a.m93721b(java.util.Map, cx0.a, cx0.c):cx0.c");
    }

    /* renamed from: c */
    static /* synthetic */ C31456c m93722c(Map map, C31453a aVar, C31456c cVar, int i, Object obj) {
        if ((i & 4) != 0) {
            cVar = null;
        }
        return m93721b(map, aVar, cVar);
    }

    /* renamed from: d */
    public final C31456c mo72026d(List list) {
        C41536l.m120489i(list, "data");
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        C31453a aVar = null;
        while (it.hasNext()) {
            C31453a aVar2 = (C31453a) it.next();
            if (aVar2.mo71835r() != null) {
                String r = aVar2.mo71835r();
                Object obj = hashMap.get(r);
                if (obj == null) {
                    obj = new ArrayList();
                    hashMap.put(r, obj);
                }
                ((List) obj).add(aVar2);
            } else if (aVar == null) {
                aVar = aVar2;
            } else {
                throw new IllegalStateException("Given DD tree has more than one root");
            }
        }
        if (aVar != null) {
            C31456c a = m93720a(aVar, hashMap);
            if (a != null) {
                return a;
            }
            throw new IllegalStateException("Given DD tree was empty");
        }
        throw new IllegalStateException("Given DD tree doesn't have a root");
    }
}
