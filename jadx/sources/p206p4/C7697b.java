package p206p4;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import p206p4.C7700c;
import p334z4.C9207a;

/* renamed from: p4.b */
public final class C7697b {

    /* renamed from: a */
    private C7696a f22369a;

    /* renamed from: b */
    private C7696a f22370b;

    /* renamed from: c */
    private C7696a f22371c;

    /* renamed from: d */
    private C7696a f22372d;

    /* renamed from: e */
    private C7696a f22373e;

    /* renamed from: f */
    private C7696a f22374f;

    /* renamed from: g */
    private C7696a f22375g;

    /* renamed from: h */
    private C7696a f22376h;

    /* renamed from: i */
    private C7696a f22377i;

    /* renamed from: j */
    private C7696a f22378j;

    /* renamed from: k */
    private C7696a f22379k;

    /* renamed from: l */
    private final Map f22380l = new HashMap();

    /* renamed from: p4.b$a */
    class C7698a extends HashSet {
        C7698a() {
            add(C7700c.C7705e.MTML_INTEGRITY_DETECT.mo22439a());
            add(C7700c.C7705e.MTML_APP_EVENT_PREDICTION.mo22439a());
        }
    }

    /* renamed from: p4.b$b */
    static class C7699b extends HashMap {
        C7699b() {
            put("embedding.weight", "embed.weight");
            put("dense1.weight", "fc1.weight");
            put("dense2.weight", "fc2.weight");
            put("dense3.weight", "fc3.weight");
            put("dense1.bias", "fc1.bias");
            put("dense2.bias", "fc2.bias");
            put("dense3.bias", "fc3.bias");
        }
    }

    private C7697b(Map map) {
        this.f22369a = (C7696a) map.get("embed.weight");
        this.f22370b = C7709d.m29282l((C7696a) map.get("convs.0.weight"));
        this.f22371c = C7709d.m29282l((C7696a) map.get("convs.1.weight"));
        this.f22372d = C7709d.m29282l((C7696a) map.get("convs.2.weight"));
        this.f22373e = (C7696a) map.get("convs.0.bias");
        this.f22374f = (C7696a) map.get("convs.1.bias");
        this.f22375g = (C7696a) map.get("convs.2.bias");
        this.f22376h = C7709d.m29281k((C7696a) map.get("fc1.weight"));
        this.f22377i = C7709d.m29281k((C7696a) map.get("fc2.weight"));
        this.f22378j = (C7696a) map.get("fc1.bias");
        this.f22379k = (C7696a) map.get("fc2.bias");
        for (String str : new C7698a()) {
            String str2 = str + ".weight";
            String str3 = str + ".bias";
            C7696a aVar = (C7696a) map.get(str2);
            C7696a aVar2 = (C7696a) map.get(str3);
            if (aVar != null) {
                this.f22380l.put(str2, C7709d.m29281k(aVar));
            }
            if (aVar2 != null) {
                this.f22380l.put(str3, aVar2);
            }
        }
    }

    /* renamed from: a */
    public static C7697b m29239a(File file) {
        Class<C7697b> cls = C7697b.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            try {
                return new C7697b(m29241c(file));
            } catch (Exception unused) {
                return null;
            }
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    private static Map m29240b() {
        Class<C7697b> cls = C7697b.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return new C7699b();
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c2, code lost:
        p334z4.C9207a.m34023b(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c6, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c1 A[ExcHandler: all (r0v1 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:3:0x000a] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.Map m29241c(java.io.File r18) {
        /*
            java.lang.Class<p4.b> r1 = p206p4.C7697b.class
            boolean r0 = p334z4.C9207a.m34024c(r1)
            r2 = 0
            if (r0 == 0) goto L_0x000a
            return r2
        L_0x000a:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00c7, all -> 0x00c1 }
            r3 = r18
            r0.<init>(r3)     // Catch:{ Exception -> 0x00c7, all -> 0x00c1 }
            int r3 = r0.available()     // Catch:{ Exception -> 0x00c7, all -> 0x00c1 }
            java.io.DataInputStream r4 = new java.io.DataInputStream     // Catch:{ Exception -> 0x00c7, all -> 0x00c1 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x00c7, all -> 0x00c1 }
            byte[] r0 = new byte[r3]     // Catch:{ Exception -> 0x00c7, all -> 0x00c1 }
            r4.readFully(r0)     // Catch:{ Exception -> 0x00c7, all -> 0x00c1 }
            r4.close()     // Catch:{ Exception -> 0x00c7, all -> 0x00c1 }
            r4 = 4
            if (r3 >= r4) goto L_0x0026
            return r2
        L_0x0026:
            r5 = 0
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r0, r5, r4)     // Catch:{ Exception -> 0x00c7, all -> 0x00c1 }
            java.nio.ByteOrder r7 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ Exception -> 0x00c7, all -> 0x00c1 }
            r6.order(r7)     // Catch:{ Exception -> 0x00c7, all -> 0x00c1 }
            int r6 = r6.getInt()     // Catch:{ Exception -> 0x00c7, all -> 0x00c1 }
            int r7 = r6 + 4
            if (r3 >= r7) goto L_0x0039
            return r2
        L_0x0039:
            java.lang.String r8 = new java.lang.String     // Catch:{ Exception -> 0x00c7, all -> 0x00c1 }
            r8.<init>(r0, r4, r6)     // Catch:{ Exception -> 0x00c7, all -> 0x00c1 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x00c7, all -> 0x00c1 }
            r4.<init>(r8)     // Catch:{ Exception -> 0x00c7, all -> 0x00c1 }
            org.json.JSONArray r6 = r4.names()     // Catch:{ Exception -> 0x00c7, all -> 0x00c1 }
            int r8 = r6.length()     // Catch:{ Exception -> 0x00c7, all -> 0x00c1 }
            java.lang.String[] r9 = new java.lang.String[r8]     // Catch:{ Exception -> 0x00c7, all -> 0x00c1 }
            r10 = r5
        L_0x004e:
            if (r10 >= r8) goto L_0x0059
            java.lang.String r11 = r6.getString(r10)     // Catch:{ Exception -> 0x00c7, all -> 0x00c1 }
            r9[r10] = r11     // Catch:{ Exception -> 0x00c7, all -> 0x00c1 }
            int r10 = r10 + 1
            goto L_0x004e
        L_0x0059:
            java.util.Arrays.sort(r9)     // Catch:{ Exception -> 0x00c7, all -> 0x00c1 }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ Exception -> 0x00c7, all -> 0x00c1 }
            r6.<init>()     // Catch:{ Exception -> 0x00c7, all -> 0x00c1 }
            java.util.Map r10 = m29240b()     // Catch:{ Exception -> 0x00c7, all -> 0x00c1 }
            r11 = r5
        L_0x0066:
            if (r11 >= r8) goto L_0x00c0
            r12 = r9[r11]     // Catch:{ Exception -> 0x00c7, all -> 0x00c1 }
            org.json.JSONArray r13 = r4.getJSONArray(r12)     // Catch:{ Exception -> 0x00c7, all -> 0x00c1 }
            int r14 = r13.length()     // Catch:{ Exception -> 0x00c7, all -> 0x00c1 }
            int[] r15 = new int[r14]     // Catch:{ Exception -> 0x00c7, all -> 0x00c1 }
            r16 = 1
            r2 = r5
            r5 = r16
        L_0x0079:
            if (r2 >= r14) goto L_0x0088
            int r17 = r13.getInt(r2)     // Catch:{ Exception -> 0x0086, all -> 0x00c1 }
            r15[r2] = r17     // Catch:{ Exception -> 0x0086, all -> 0x00c1 }
            int r5 = r5 * r17
            int r2 = r2 + 1
            goto L_0x0079
        L_0x0086:
            r1 = 0
            goto L_0x00c8
        L_0x0088:
            int r2 = r5 * 4
            int r13 = r7 + r2
            if (r13 <= r3) goto L_0x0090
            r14 = 0
            return r14
        L_0x0090:
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r0, r7, r2)     // Catch:{ Exception -> 0x0086, all -> 0x00c1 }
            java.nio.ByteOrder r7 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ Exception -> 0x0086, all -> 0x00c1 }
            r2.order(r7)     // Catch:{ Exception -> 0x0086, all -> 0x00c1 }
            p4.a r7 = new p4.a     // Catch:{ Exception -> 0x0086, all -> 0x00c1 }
            r7.<init>(r15)     // Catch:{ Exception -> 0x0086, all -> 0x00c1 }
            java.nio.FloatBuffer r2 = r2.asFloatBuffer()     // Catch:{ Exception -> 0x0086, all -> 0x00c1 }
            float[] r14 = r7.mo22431b()     // Catch:{ Exception -> 0x0086, all -> 0x00c1 }
            r15 = 0
            r2.get(r14, r15, r5)     // Catch:{ Exception -> 0x0086, all -> 0x00c1 }
            boolean r2 = r10.containsKey(r12)     // Catch:{ Exception -> 0x0086, all -> 0x00c1 }
            if (r2 == 0) goto L_0x00b7
            java.lang.Object r2 = r10.get(r12)     // Catch:{ Exception -> 0x0086, all -> 0x00c1 }
            r12 = r2
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0086, all -> 0x00c1 }
        L_0x00b7:
            r6.put(r12, r7)     // Catch:{ Exception -> 0x0086, all -> 0x00c1 }
            int r11 = r11 + 1
            r7 = r13
            r5 = r15
            r2 = 0
            goto L_0x0066
        L_0x00c0:
            return r6
        L_0x00c1:
            r0 = move-exception
            p334z4.C9207a.m34023b(r0, r1)
            r1 = 0
            return r1
        L_0x00c7:
            r1 = r2
        L_0x00c8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p206p4.C7697b.m29241c(java.io.File):java.util.Map");
    }

    /* renamed from: d */
    public C7696a mo22435d(C7696a aVar, String[] strArr, String str) {
        if (C9207a.m34024c(this)) {
            return null;
        }
        try {
            C7696a c = C7709d.m29273c(C7709d.m29275e(strArr, 128, this.f22369a), this.f22370b);
            C7709d.m29271a(c, this.f22373e);
            C7709d.m29279i(c);
            C7696a c2 = C7709d.m29273c(c, this.f22371c);
            C7709d.m29271a(c2, this.f22374f);
            C7709d.m29279i(c2);
            C7696a g = C7709d.m29277g(c2, 2);
            C7696a c3 = C7709d.m29273c(g, this.f22372d);
            C7709d.m29271a(c3, this.f22375g);
            C7709d.m29279i(c3);
            C7696a g2 = C7709d.m29277g(c, c.mo22432c(1));
            C7696a g3 = C7709d.m29277g(g, g.mo22432c(1));
            C7696a g4 = C7709d.m29277g(c3, c3.mo22432c(1));
            C7709d.m29276f(g2, 1);
            C7709d.m29276f(g3, 1);
            C7709d.m29276f(g4, 1);
            C7696a d = C7709d.m29274d(C7709d.m29272b(new C7696a[]{g2, g3, g4, aVar}), this.f22376h, this.f22378j);
            C7709d.m29279i(d);
            C7696a d2 = C7709d.m29274d(d, this.f22377i, this.f22379k);
            C7709d.m29279i(d2);
            Map map = this.f22380l;
            C7696a aVar2 = (C7696a) map.get(str + ".weight");
            Map map2 = this.f22380l;
            C7696a aVar3 = (C7696a) map2.get(str + ".bias");
            if (aVar2 != null) {
                if (aVar3 != null) {
                    C7696a d3 = C7709d.m29274d(d2, aVar2, aVar3);
                    C7709d.m29280j(d3);
                    return d3;
                }
            }
            return null;
        } catch (Throwable th) {
            C9207a.m34023b(th, this);
            return null;
        }
    }
}
