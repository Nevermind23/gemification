package p101h3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p021b3.C2153a;
import p049d3.C5813a;
import p217q2.C7830c;
import p217q2.C7836g;
import p217q2.C7851m;
import p243s2.C8120m;
import p256t2.C8343g;
import p295w2.C8744b;

/* renamed from: h3.a */
public final class C6422a {

    /* renamed from: a */
    final C7836g f19693a;

    /* renamed from: b */
    final C8120m f19694b;

    /* renamed from: c */
    final C7851m f19695c;

    /* renamed from: d */
    final C8744b f19696d;

    /* renamed from: h3.a$a */
    class C6423a implements C8343g.C8345b {
        C6423a() {
        }

        /* renamed from: a */
        public Object mo20301a(C8343g gVar) {
            Map q = gVar.mo23548q();
            C7836g.C7839c variables = C6422a.this.f19693a.variables();
            C2153a aVar = new C2153a();
            C6422a aVar2 = C6422a.this;
            return C6422a.this.f19694b.map(new C5813a(variables, q, aVar, aVar2.f19695c, aVar2.f19696d));
        }
    }

    /* renamed from: h3.a$b */
    class C6424b implements C8343g.C8345b {
        C6424b() {
        }

        /* renamed from: b */
        public Map mo20301a(C8343g gVar) {
            return gVar.mo23548q();
        }
    }

    /* renamed from: h3.a$c */
    class C6425c implements C8343g.C8344a {

        /* renamed from: h3.a$c$a */
        class C6426a implements C8343g.C8345b {
            C6426a() {
            }

            /* renamed from: b */
            public C7830c mo20301a(C8343g gVar) {
                return C6422a.m25500b(gVar.mo23548q());
            }
        }

        C6425c() {
        }

        /* renamed from: b */
        public C7830c mo20303a(C8343g gVar) {
            return (C7830c) gVar.mo23542k(true, new C6426a());
        }
    }

    public C6422a(C7836g gVar, C8120m mVar, C7851m mVar2, C8744b bVar) {
        this.f19693a = gVar;
        this.f19694b = mVar;
        this.f19695c = mVar2;
        this.f19696d = bVar;
    }

    /* renamed from: b */
    public static C7830c m25500b(Map map) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        Iterator it = map.entrySet().iterator();
        while (true) {
            String str = "";
            while (true) {
                if (!it.hasNext()) {
                    return new C7830c(str, arrayList, hashMap);
                }
                Map.Entry entry = (Map.Entry) it.next();
                if ("message".equals(entry.getKey())) {
                    Object value = entry.getValue();
                    if (value != null) {
                        str = value.toString();
                    }
                } else if ("locations".equals(entry.getKey())) {
                    List<Map> list = (List) entry.getValue();
                    if (list != null) {
                        for (Map c : list) {
                            arrayList.add(m25501c(c));
                        }
                    }
                } else if (entry.getValue() != null) {
                    hashMap.put((String) entry.getKey(), entry.getValue());
                }
            }
        }
    }

    /* renamed from: c */
    private static C7830c.C7831a m25501c(Map map) {
        long j;
        long j2 = -1;
        if (map != null) {
            j = -1;
            for (Map.Entry entry : map.entrySet()) {
                if ("line".equals(entry.getKey())) {
                    j2 = ((Number) entry.getValue()).longValue();
                } else if ("column".equals(entry.getKey())) {
                    j = ((Number) entry.getValue()).longValue();
                }
            }
        } else {
            j = -1;
        }
        return new C7830c.C7831a(j2, j);
    }

    /* renamed from: d */
    private List m25502d(C8343g gVar) {
        return gVar.mo23540i(true, new C6425c());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: t2.a} */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v4, types: [q2.g$b] */
    /* JADX WARNING: type inference failed for: r0v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p217q2.C7843j mo20300a(dg1.C40679d r8) {
        /*
            r7 = this;
            w2.b r0 = r7.f19696d
            q2.g r1 = r7.f19693a
            r0.mo24155l(r1)
            r0 = 0
            t2.a r1 = new t2.a     // Catch:{ all -> 0x008b }
            r1.<init>(r8)     // Catch:{ all -> 0x008b }
            r1.mo23501v0()     // Catch:{ all -> 0x0088 }
            t2.g r8 = new t2.g     // Catch:{ all -> 0x0088 }
            r8.<init>(r1)     // Catch:{ all -> 0x0088 }
            r2 = r0
            r3 = r2
        L_0x0017:
            boolean r4 = r8.mo23536b()     // Catch:{ all -> 0x0088 }
            if (r4 == 0) goto L_0x005b
            java.lang.String r4 = r8.mo23541j()     // Catch:{ all -> 0x0088 }
            java.lang.String r5 = "data"
            boolean r5 = r5.equals(r4)     // Catch:{ all -> 0x0088 }
            r6 = 1
            if (r5 == 0) goto L_0x0036
            h3.a$a r0 = new h3.a$a     // Catch:{ all -> 0x0088 }
            r0.<init>()     // Catch:{ all -> 0x0088 }
            java.lang.Object r0 = r8.mo23542k(r6, r0)     // Catch:{ all -> 0x0088 }
            q2.g$b r0 = (p217q2.C7836g.C7838b) r0     // Catch:{ all -> 0x0088 }
            goto L_0x0017
        L_0x0036:
            java.lang.String r5 = "errors"
            boolean r5 = r5.equals(r4)     // Catch:{ all -> 0x0088 }
            if (r5 == 0) goto L_0x0043
            java.util.List r2 = r7.m25502d(r8)     // Catch:{ all -> 0x0088 }
            goto L_0x0017
        L_0x0043:
            java.lang.String r5 = "extensions"
            boolean r4 = r5.equals(r4)     // Catch:{ all -> 0x0088 }
            if (r4 == 0) goto L_0x0057
            h3.a$b r3 = new h3.a$b     // Catch:{ all -> 0x0088 }
            r3.<init>()     // Catch:{ all -> 0x0088 }
            java.lang.Object r3 = r8.mo23542k(r6, r3)     // Catch:{ all -> 0x0088 }
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ all -> 0x0088 }
            goto L_0x0017
        L_0x0057:
            r8.mo23547p()     // Catch:{ all -> 0x0088 }
            goto L_0x0017
        L_0x005b:
            r1.mo23495c1()     // Catch:{ all -> 0x0088 }
            q2.g r8 = r7.f19693a     // Catch:{ all -> 0x0088 }
            q2.j$a r8 = p217q2.C7843j.m29754a(r8)     // Catch:{ all -> 0x0088 }
            q2.g r4 = r7.f19693a     // Catch:{ all -> 0x0088 }
            java.lang.Object r0 = r4.wrapData(r0)     // Catch:{ all -> 0x0088 }
            q2.j$a r8 = r8.mo22791b(r0)     // Catch:{ all -> 0x0088 }
            q2.j$a r8 = r8.mo22793d(r2)     // Catch:{ all -> 0x0088 }
            w2.b r0 = r7.f19696d     // Catch:{ all -> 0x0088 }
            java.util.Set r0 = r0.mo24153j()     // Catch:{ all -> 0x0088 }
            q2.j$a r8 = r8.mo22792c(r0)     // Catch:{ all -> 0x0088 }
            q2.j$a r8 = r8.mo22794e(r3)     // Catch:{ all -> 0x0088 }
            q2.j r8 = r8.mo22790a()     // Catch:{ all -> 0x0088 }
            r1.close()
            return r8
        L_0x0088:
            r8 = move-exception
            r0 = r1
            goto L_0x008c
        L_0x008b:
            r8 = move-exception
        L_0x008c:
            if (r0 == 0) goto L_0x0091
            r0.close()
        L_0x0091:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p101h3.C6422a.mo20300a(dg1.d):q2.j");
    }
}
