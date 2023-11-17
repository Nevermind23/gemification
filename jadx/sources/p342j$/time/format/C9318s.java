package p342j$.time.format;

import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.format.s */
final class C9318s extends C9317r {

    /* renamed from: d */
    private static final ConcurrentHashMap f25818d = new ConcurrentHashMap();

    /* renamed from: c */
    private final TextStyle f25819c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C9318s(p342j$.time.format.TextStyle r4) {
        /*
            r3 = this;
            j$.time.temporal.j r0 = p342j$.time.temporal.C9343k.m34504f()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "ZoneText("
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r2 = ")"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r3.<init>(r0, r1)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            if (r4 == 0) goto L_0x0029
            r3.f25819c = r4
            return
        L_0x0029:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r0 = "textStyle"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p342j$.time.format.C9318s.<init>(j$.time.format.TextStyle):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: j$.util.concurrent.ConcurrentHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: j$.util.concurrent.ConcurrentHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        if (r8 == null) goto L_0x005f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo25039a(p342j$.time.format.C9321v r14, java.lang.StringBuilder r15) {
        /*
            r13 = this;
            j$.time.temporal.j r0 = p342j$.time.temporal.C9343k.m34505g()
            java.lang.Object r0 = r14.mo25081f(r0)
            j$.time.ZoneId r0 = (p342j$.time.ZoneId) r0
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            java.lang.String r2 = r0.mo25004l()
            boolean r3 = r0 instanceof p342j$.time.ZoneOffset
            r4 = 1
            if (r3 != 0) goto L_0x00af
            j$.time.temporal.TemporalAccessor r3 = r14.mo25079d()
            j$.time.temporal.a r5 = p342j$.time.temporal.C9333a.INSTANT_SECONDS
            boolean r5 = r3.mo24916b(r5)
            r6 = 2
            if (r5 == 0) goto L_0x0036
            j$.time.zone.c r0 = r0.mo25005m()
            j$.time.Instant r3 = p342j$.time.Instant.m34198m(r3)
            boolean r0 = r0.mo25161h(r3)
            if (r0 == 0) goto L_0x0034
            r0 = r4
            goto L_0x0037
        L_0x0034:
            r0 = r1
            goto L_0x0037
        L_0x0036:
            r0 = r6
        L_0x0037:
            java.util.Locale r14 = r14.mo25078c()
            j$.time.format.TextStyle r3 = p342j$.time.format.TextStyle.NARROW
            r5 = 0
            j$.time.format.TextStyle r7 = r13.f25819c
            if (r7 != r3) goto L_0x0043
            goto L_0x00ac
        L_0x0043:
            j$.util.concurrent.ConcurrentHashMap r3 = f25818d
            java.lang.Object r8 = r3.get(r2)
            java.lang.ref.SoftReference r8 = (java.lang.ref.SoftReference) r8
            r9 = 5
            r10 = 3
            if (r8 == 0) goto L_0x005f
            java.lang.Object r5 = r8.get()
            java.util.Map r5 = (java.util.Map) r5
            if (r5 == 0) goto L_0x005f
            java.lang.Object r8 = r5.get(r14)
            java.lang.String[] r8 = (java.lang.String[]) r8
            if (r8 != 0) goto L_0x0099
        L_0x005f:
            java.util.TimeZone r8 = java.util.TimeZone.getTimeZone(r2)
            r11 = 7
            java.lang.String[] r11 = new java.lang.String[r11]
            r11[r1] = r2
            java.lang.String r12 = r8.getDisplayName(r1, r4, r14)
            r11[r4] = r12
            java.lang.String r12 = r8.getDisplayName(r1, r1, r14)
            r11[r6] = r12
            java.lang.String r6 = r8.getDisplayName(r4, r4, r14)
            r11[r10] = r6
            r6 = 4
            java.lang.String r1 = r8.getDisplayName(r4, r1, r14)
            r11[r6] = r1
            r11[r9] = r2
            r1 = 6
            r11[r1] = r2
            if (r5 != 0) goto L_0x008d
            j$.util.concurrent.ConcurrentHashMap r5 = new j$.util.concurrent.ConcurrentHashMap
            r5.<init>()
        L_0x008d:
            r5.put(r14, r11)
            java.lang.ref.SoftReference r14 = new java.lang.ref.SoftReference
            r14.<init>(r5)
            r3.put(r2, r14)
            r8 = r11
        L_0x0099:
            int r14 = r7.mo25035a()
            if (r0 == 0) goto L_0x00a9
            if (r0 == r4) goto L_0x00a5
            int r14 = r14 + r9
            r5 = r8[r14]
            goto L_0x00ac
        L_0x00a5:
            int r14 = r14 + r10
            r5 = r8[r14]
            goto L_0x00ac
        L_0x00a9:
            int r14 = r14 + r4
            r5 = r8[r14]
        L_0x00ac:
            if (r5 == 0) goto L_0x00af
            r2 = r5
        L_0x00af:
            r15.append(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p342j$.time.format.C9318s.mo25039a(j$.time.format.v, java.lang.StringBuilder):boolean");
    }
}
