package p243s2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p217q2.C7830c;
import p217q2.C7836g;
import p217q2.C7843j;
import p217q2.C7851m;

/* renamed from: s2.q */
public final class C8137q {

    /* renamed from: a */
    public static final C8137q f23281a = new C8137q();

    private C8137q() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        throw r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p217q2.C7843j m30730a(dg1.C40679d r2, p217q2.C7836g r3, p217q2.C7851m r4) {
        /*
            java.lang.String r0 = "source"
            kotlin.jvm.internal.C41536l.m120490j(r2, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.C41536l.m120490j(r3, r0)
            java.lang.String r0 = "scalarTypeAdapters"
            kotlin.jvm.internal.C41536l.m120490j(r4, r0)
            t2.a r0 = new t2.a
            r0.<init>(r2)
            r0.mo23501v0()     // Catch:{ all -> 0x0031 }
            t2.g r2 = new t2.g     // Catch:{ all -> 0x0031 }
            r2.<init>(r0)     // Catch:{ all -> 0x0031 }
            java.util.Map r2 = r2.mo23548q()     // Catch:{ all -> 0x0031 }
            if (r2 == 0) goto L_0x0023
            goto L_0x0027
        L_0x0023:
            java.util.Map r2 = ie1.C41344r0.m119928j()     // Catch:{ all -> 0x0031 }
        L_0x0027:
            s2.q r1 = f23281a     // Catch:{ all -> 0x0031 }
            q2.j r2 = r1.m30731b(r2, r3, r4)     // Catch:{ all -> 0x0031 }
            r0.close()
            return r2
        L_0x0031:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x0037 }
        L_0x0037:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p243s2.C8137q.m30730a(dg1.d, q2.g, q2.m):q2.j");
    }

    /* renamed from: b */
    private final C7843j m30731b(Map map, C7836g gVar, C7851m mVar) {
        C7836g.C7838b bVar;
        ArrayList arrayList;
        C7836g gVar2;
        Map map2;
        Map map3 = map;
        Object obj = map3.get("data");
        Map map4 = null;
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map5 = (Map) obj;
        if (map5 != null) {
            bVar = (C7836g.C7838b) gVar.responseFieldMapper().map(new C8138r(map5, gVar.variables(), mVar));
        } else {
            bVar = null;
        }
        Object obj2 = map3.get("errors");
        if (!(obj2 instanceof List)) {
            obj2 = null;
        }
        List<Map> list = (List) obj2;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(list, 10));
            for (Map c : list) {
                arrayList2.add(f23281a.m30732c(c));
            }
            gVar2 = gVar;
            arrayList = arrayList2;
        } else {
            gVar2 = gVar;
            arrayList = null;
        }
        Object wrapData = gVar2.wrapData(bVar);
        Object obj3 = map3.get("extensions");
        if (obj3 instanceof Map) {
            map4 = obj3;
        }
        Map map6 = map4;
        if (map6 != null) {
            map2 = map6;
        } else {
            map2 = C41344r0.m119928j();
        }
        return new C7843j(gVar, wrapData, arrayList, (Set) null, false, map2, 24, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    private final C7830c m30732c(Map map) {
        List j = C41341q.m119907j();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (true) {
            String str = "";
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                int hashCode = str2.hashCode();
                if (hashCode != -1197189282) {
                    if (hashCode == 954925063 && str2.equals("message")) {
                        if (value == null || (str = value.toString()) == null) {
                        }
                    }
                } else if (str2.equals("locations")) {
                    if (!(value instanceof List)) {
                        value = null;
                    }
                    List<Map> list = (List) value;
                    if (list != null) {
                        j = new ArrayList(C41343r.m119925u(list, 10));
                        for (Map d : list) {
                            j.add(f23281a.m30733d(d));
                        }
                    } else {
                        j = C41341q.m119907j();
                    }
                }
                linkedHashMap.put(str2, value);
            }
            return new C7830c(str, j, linkedHashMap);
        }
    }

    /* renamed from: d */
    private final C7830c.C7831a m30733d(Map map) {
        long j;
        long j2 = -1;
        if (map != null) {
            j = -1;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                int hashCode = str.hashCode();
                if (hashCode != -1354837162) {
                    if (hashCode == 3321844 && str.equals("line")) {
                        if (value != null) {
                            j2 = ((Number) value).longValue();
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.Number");
                        }
                    }
                } else if (!str.equals("column")) {
                    continue;
                } else if (value != null) {
                    j = ((Number) value).longValue();
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Number");
                }
            }
        } else {
            j = -1;
        }
        return new C7830c.C7831a(j2, j);
    }
}
