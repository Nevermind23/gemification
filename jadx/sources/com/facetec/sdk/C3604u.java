package com.facetec.sdk;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facetec.sdk.u */
final class C3604u {

    /* renamed from: a */
    private C2768ab f11558a = C2768ab.INITIALIZED;

    /* renamed from: b */
    private C2764aa f11559b = null;

    /* renamed from: c */
    private Context f11560c;

    /* renamed from: d */
    private List<C3534r> f11561d = new ArrayList();

    /* renamed from: e */
    private C3534r f11562e = new C3534r();

    /* renamed from: f */
    private boolean f11563f = false;

    /* renamed from: g */
    private int f11564g = -1;

    /* renamed from: h */
    private List<C3534r> f11565h = new ArrayList();

    /* renamed from: i */
    private int f11566i = 0;

    /* renamed from: j */
    private boolean f11567j = false;

    /* renamed from: l */
    private boolean f11568l = false;

    C3604u(Context context) {
        this.f11560c = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public synchronized void m13929j() {
        if (this.f11568l) {
            C3555s.m13898c(this.f11560c, C2867c.F2F_ERROR, "Error 4472");
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f11561d.size() > 0) {
            List<C3534r> list = this.f11561d;
            arrayList = new ArrayList(Arrays.asList(new C3534r[]{list.get(list.size() - 1)}));
        }
        arrayList.add(this.f11562e);
        ArrayList arrayList2 = new ArrayList(Arrays.asList(new C3534r[]{C3711z.m13951c((List<C3534r>) arrayList)}));
        arrayList2.addAll(this.f11565h);
        C2764aa a = C2764aa.m10703a(this.f11560c, (List<C3534r>) arrayList2);
        a.mo8806c();
        this.f11559b = a;
        C2750a.m10685c(this.f11560c, a);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x015f, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo10065b() {
        /*
            r9 = this;
            monitor-enter(r9)
            com.facetec.sdk.ab r0 = r9.f11558a     // Catch:{ all -> 0x0160 }
            com.facetec.sdk.ab r1 = com.facetec.sdk.C2768ab.ENDED     // Catch:{ all -> 0x0160 }
            if (r0 == r1) goto L_0x015e
            boolean r0 = r9.f11568l     // Catch:{ all -> 0x0160 }
            if (r0 == 0) goto L_0x000d
            goto L_0x015e
        L_0x000d:
            r9.f11558a = r1     // Catch:{ all -> 0x0160 }
            r0 = 0
            r9.m13926a((int) r0)     // Catch:{ all -> 0x0160 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0160 }
            r1.<init>()     // Catch:{ all -> 0x0160 }
            r2 = -1
            r3 = r0
            r4 = r2
        L_0x001b:
            com.facetec.sdk.r r5 = r9.f11562e     // Catch:{ all -> 0x0160 }
            java.util.List<com.facetec.sdk.ac> r5 = r5.f11430b     // Catch:{ all -> 0x0160 }
            int r5 = r5.size()     // Catch:{ all -> 0x0160 }
            if (r3 >= r5) goto L_0x0076
            com.facetec.sdk.r r5 = r9.f11562e     // Catch:{ all -> 0x0160 }
            java.util.List<com.facetec.sdk.ac> r5 = r5.f11430b     // Catch:{ all -> 0x0160 }
            java.lang.Object r5 = r5.get(r3)     // Catch:{ all -> 0x0160 }
            com.facetec.sdk.ac r5 = (com.facetec.sdk.C2769ac) r5     // Catch:{ all -> 0x0160 }
            if (r4 == r2) goto L_0x0035
            int r6 = r5.f8773a     // Catch:{ all -> 0x0160 }
            if (r4 == r6) goto L_0x0073
        L_0x0035:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0160 }
            r4.<init>()     // Catch:{ all -> 0x0160 }
            int r5 = r5.f8773a     // Catch:{ all -> 0x0160 }
            r6 = r3
        L_0x003d:
            com.facetec.sdk.r r7 = r9.f11562e     // Catch:{ all -> 0x0160 }
            java.util.List<com.facetec.sdk.ac> r7 = r7.f11430b     // Catch:{ all -> 0x0160 }
            int r7 = r7.size()     // Catch:{ all -> 0x0160 }
            if (r3 >= r7) goto L_0x006e
            com.facetec.sdk.r r7 = r9.f11562e     // Catch:{ all -> 0x0160 }
            java.util.List<com.facetec.sdk.ac> r7 = r7.f11430b     // Catch:{ all -> 0x0160 }
            java.lang.Object r7 = r7.get(r3)     // Catch:{ all -> 0x0160 }
            com.facetec.sdk.ac r7 = (com.facetec.sdk.C2769ac) r7     // Catch:{ all -> 0x0160 }
            int r7 = r7.f8773a     // Catch:{ all -> 0x0160 }
            if (r7 != r5) goto L_0x006e
            com.facetec.sdk.r r6 = r9.f11562e     // Catch:{ all -> 0x0160 }
            java.util.List<com.facetec.sdk.ac> r6 = r6.f11430b     // Catch:{ all -> 0x0160 }
            java.lang.Object r6 = r6.get(r3)     // Catch:{ all -> 0x0160 }
            com.facetec.sdk.ac r6 = (com.facetec.sdk.C2769ac) r6     // Catch:{ all -> 0x0160 }
            int r6 = r6.f8777e     // Catch:{ all -> 0x0160 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0160 }
            r4.add(r6)     // Catch:{ all -> 0x0160 }
            int r6 = r3 + 1
            r8 = r6
            r6 = r3
            r3 = r8
            goto L_0x003d
        L_0x006e:
            r1.add(r4)     // Catch:{ all -> 0x0160 }
            r4 = r5
            r3 = r6
        L_0x0073:
            int r3 = r3 + 1
            goto L_0x001b
        L_0x0076:
            com.facetec.sdk.r r2 = r9.f11562e     // Catch:{ all -> 0x0160 }
            r2.f11432d = r1     // Catch:{ all -> 0x0160 }
            com.facetec.sdk.x r1 = new com.facetec.sdk.x     // Catch:{ all -> 0x0160 }
            r1.<init>()     // Catch:{ all -> 0x0160 }
            com.facetec.sdk.r r2 = r9.f11562e     // Catch:{ all -> 0x0160 }
            java.util.List<com.facetec.sdk.r> r3 = r9.f11561d     // Catch:{ all -> 0x0160 }
            java.util.List<com.facetec.sdk.r> r4 = r9.f11565h     // Catch:{ all -> 0x0160 }
            r1.f11696a = r2     // Catch:{ all -> 0x0160 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0160 }
            r5.<init>(r4)     // Catch:{ all -> 0x0160 }
            r1.f11700e = r5     // Catch:{ all -> 0x0160 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0160 }
            r5.<init>(r3)     // Catch:{ all -> 0x0160 }
            r1.f11697b = r5     // Catch:{ all -> 0x0160 }
            r5.add(r2)     // Catch:{ all -> 0x0160 }
            java.util.List<com.facetec.sdk.r> r2 = r1.f11697b     // Catch:{ all -> 0x0160 }
            java.util.List r2 = com.facetec.sdk.C3669x.m13945e(r2)     // Catch:{ all -> 0x0160 }
            r1.f11699d = r2     // Catch:{ all -> 0x0160 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0160 }
            com.facetec.sdk.r r5 = r1.f11696a     // Catch:{ all -> 0x0160 }
            java.util.List<java.util.List<java.lang.Integer>> r5 = r5.f11432d     // Catch:{ all -> 0x0160 }
            r2.<init>(r5)     // Catch:{ all -> 0x0160 }
            java.util.List r3 = com.facetec.sdk.C3669x.m13945e(r3)     // Catch:{ all -> 0x0160 }
            int r3 = r3.size()     // Catch:{ all -> 0x0160 }
            r1.f11701f = r3     // Catch:{ all -> 0x0160 }
            com.facetec.sdk.y r3 = com.facetec.sdk.C3690y.INTRA_SESSION     // Catch:{ all -> 0x0160 }
            boolean r2 = r1.mo10129b(r2, r0, r3)     // Catch:{ all -> 0x0160 }
            r1.f11703i = r2     // Catch:{ all -> 0x0160 }
            java.util.List<java.util.List<java.lang.Integer>> r2 = r1.f11699d     // Catch:{ all -> 0x0160 }
            int r3 = r1.f11701f     // Catch:{ all -> 0x0160 }
            com.facetec.sdk.y r5 = com.facetec.sdk.C3690y.INTRA_FACETEC_SESSION     // Catch:{ all -> 0x0160 }
            boolean r2 = r1.mo10129b(r2, r3, r5)     // Catch:{ all -> 0x0160 }
            r1.f11704j = r2     // Catch:{ all -> 0x0160 }
            com.facetec.sdk.r r3 = r1.f11696a     // Catch:{ all -> 0x0160 }
            boolean r5 = r1.f11703i     // Catch:{ all -> 0x0160 }
            if (r5 == 0) goto L_0x00d0
            com.facetec.sdk.w r5 = com.facetec.sdk.C3648w.DETECTED     // Catch:{ all -> 0x0160 }
            goto L_0x00d2
        L_0x00d0:
            com.facetec.sdk.w r5 = com.facetec.sdk.C3648w.NOT_DETECTED     // Catch:{ all -> 0x0160 }
        L_0x00d2:
            r3.f11434f = r5     // Catch:{ all -> 0x0160 }
            if (r2 == 0) goto L_0x00d9
            com.facetec.sdk.w r2 = com.facetec.sdk.C3648w.DETECTED     // Catch:{ all -> 0x0160 }
            goto L_0x00db
        L_0x00d9:
            com.facetec.sdk.w r2 = com.facetec.sdk.C3648w.NOT_DETECTED     // Catch:{ all -> 0x0160 }
        L_0x00db:
            r3.f11438j = r2     // Catch:{ all -> 0x0160 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0160 }
            r2.<init>()     // Catch:{ all -> 0x0160 }
            r1.f11698c = r2     // Catch:{ all -> 0x0160 }
            java.util.List<java.util.List<java.lang.Integer>> r3 = r1.f11699d     // Catch:{ all -> 0x0160 }
            r2.add(r3)     // Catch:{ all -> 0x0160 }
            r2 = r0
        L_0x00ea:
            int r3 = r4.size()     // Catch:{ all -> 0x0160 }
            if (r2 >= r3) goto L_0x0100
            java.util.List<java.util.List<java.util.List<java.lang.Integer>>> r3 = r1.f11698c     // Catch:{ all -> 0x0160 }
            java.lang.Object r5 = r4.get(r2)     // Catch:{ all -> 0x0160 }
            com.facetec.sdk.r r5 = (com.facetec.sdk.C3534r) r5     // Catch:{ all -> 0x0160 }
            java.util.List<java.util.List<java.lang.Integer>> r5 = r5.f11432d     // Catch:{ all -> 0x0160 }
            r3.add(r5)     // Catch:{ all -> 0x0160 }
            int r2 = r2 + 1
            goto L_0x00ea
        L_0x0100:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0160 }
            r2.<init>()     // Catch:{ all -> 0x0160 }
        L_0x0105:
            java.util.List<java.util.List<java.util.List<java.lang.Integer>>> r3 = r1.f11698c     // Catch:{ all -> 0x0160 }
            int r3 = r3.size()     // Catch:{ all -> 0x0160 }
            if (r0 >= r3) goto L_0x011b
            java.util.List<java.util.List<java.util.List<java.lang.Integer>>> r3 = r1.f11698c     // Catch:{ all -> 0x0160 }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ all -> 0x0160 }
            java.util.Collection r3 = (java.util.Collection) r3     // Catch:{ all -> 0x0160 }
            r2.addAll(r3)     // Catch:{ all -> 0x0160 }
            int r0 = r0 + 1
            goto L_0x0105
        L_0x011b:
            java.util.List<java.util.List<java.lang.Integer>> r0 = r1.f11699d     // Catch:{ all -> 0x0160 }
            int r0 = r0.size()     // Catch:{ all -> 0x0160 }
            com.facetec.sdk.y r3 = com.facetec.sdk.C3690y.INTER_FACETEC_SESSION     // Catch:{ all -> 0x0160 }
            boolean r0 = r1.mo10129b(r2, r0, r3)     // Catch:{ all -> 0x0160 }
            r1.f11702g = r0     // Catch:{ all -> 0x0160 }
            com.facetec.sdk.r r2 = r1.f11696a     // Catch:{ all -> 0x0160 }
            if (r0 == 0) goto L_0x0130
            com.facetec.sdk.w r0 = com.facetec.sdk.C3648w.DETECTED     // Catch:{ all -> 0x0160 }
            goto L_0x0132
        L_0x0130:
            com.facetec.sdk.w r0 = com.facetec.sdk.C3648w.NOT_DETECTED     // Catch:{ all -> 0x0160 }
        L_0x0132:
            r2.f11436h = r0     // Catch:{ all -> 0x0160 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0160 }
            r0.<init>()     // Catch:{ all -> 0x0160 }
            r1.f11697b = r0     // Catch:{ all -> 0x0160 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0160 }
            r0.<init>()     // Catch:{ all -> 0x0160 }
            r1.f11699d = r0     // Catch:{ all -> 0x0160 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0160 }
            r0.<init>()     // Catch:{ all -> 0x0160 }
            r1.f11700e = r0     // Catch:{ all -> 0x0160 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0160 }
            r0.<init>()     // Catch:{ all -> 0x0160 }
            r1.f11698c = r0     // Catch:{ all -> 0x0160 }
            com.facetec.sdk.r r0 = r1.f11696a     // Catch:{ all -> 0x0160 }
            r9.f11562e = r0     // Catch:{ all -> 0x0160 }
            com.facetec.sdk.nk r0 = new com.facetec.sdk.nk     // Catch:{ all -> 0x0160 }
            r0.<init>(r9)     // Catch:{ all -> 0x0160 }
            com.facetec.sdk.C2920cv.m12195c(r0)     // Catch:{ all -> 0x0160 }
            monitor-exit(r9)
            return
        L_0x015e:
            monitor-exit(r9)
            return
        L_0x0160:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3604u.mo10065b():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized C3534r mo10066c() {
        return this.f11562e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo10068d() {
        this.f11561d = null;
        this.f11565h = null;
        this.f11559b = null;
        this.f11568l = true;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        return false;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo10069e() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.facetec.sdk.ab r0 = r2.f11558a     // Catch:{ all -> 0x0011 }
            com.facetec.sdk.ab r1 = com.facetec.sdk.C2768ab.STARTED     // Catch:{ all -> 0x0011 }
            if (r0 != r1) goto L_0x000e
            boolean r0 = r2.f11568l     // Catch:{ all -> 0x0011 }
            if (r0 != 0) goto L_0x000e
            monitor-exit(r2)
            r0 = 1
            return r0
        L_0x000e:
            monitor-exit(r2)
            r0 = 0
            return r0
        L_0x0011:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3604u.mo10069e():boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ce, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d0, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo10063a(boolean r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.facetec.sdk.ab r0 = r9.f11558a     // Catch:{ all -> 0x00d1 }
            com.facetec.sdk.ab r1 = com.facetec.sdk.C2768ab.STARTED     // Catch:{ all -> 0x00d1 }
            if (r0 == r1) goto L_0x00cf
            boolean r0 = r9.f11568l     // Catch:{ all -> 0x00d1 }
            if (r0 == 0) goto L_0x000d
            goto L_0x00cf
        L_0x000d:
            r9.f11558a = r1     // Catch:{ all -> 0x00d1 }
            r0 = 0
            r9.f11567j = r0     // Catch:{ all -> 0x00d1 }
            r9.f11563f = r0     // Catch:{ all -> 0x00d1 }
            int r1 = r9.f11564g     // Catch:{ all -> 0x00d1 }
            int r1 = r1 + 1
            r9.f11564g = r1     // Catch:{ all -> 0x00d1 }
            if (r1 != 0) goto L_0x00b0
            com.facetec.sdk.aa r10 = r9.f11559b     // Catch:{ all -> 0x00d1 }
            if (r10 != 0) goto L_0x0028
            android.content.Context r10 = r9.f11560c     // Catch:{ all -> 0x00d1 }
            com.facetec.sdk.aa r10 = com.facetec.sdk.C2750a.m10684c(r10)     // Catch:{ all -> 0x00d1 }
            r9.f11559b = r10     // Catch:{ all -> 0x00d1 }
        L_0x0028:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x00d1 }
            r10.<init>()     // Catch:{ all -> 0x00d1 }
            com.facetec.sdk.aa r1 = r9.f11559b     // Catch:{ all -> 0x00d1 }
            java.util.List<com.facetec.sdk.v> r1 = r1.f8744a     // Catch:{ all -> 0x00d1 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00d1 }
        L_0x0035:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00d1 }
            if (r2 == 0) goto L_0x0047
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00d1 }
            com.facetec.sdk.v r2 = (com.facetec.sdk.C3625v) r2     // Catch:{ all -> 0x00d1 }
            java.util.List<java.util.List<java.lang.Integer>> r2 = r2.f11610d     // Catch:{ all -> 0x00d1 }
            r10.add(r2)     // Catch:{ all -> 0x00d1 }
            goto L_0x0035
        L_0x0047:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00d1 }
            r1.<init>()     // Catch:{ all -> 0x00d1 }
            r2 = r0
        L_0x004d:
            int r3 = r10.size()     // Catch:{ all -> 0x00d1 }
            if (r2 >= r3) goto L_0x00a9
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x00d1 }
            r3.<init>()     // Catch:{ all -> 0x00d1 }
            com.facetec.sdk.r r4 = new com.facetec.sdk.r     // Catch:{ all -> 0x00d1 }
            r4.<init>()     // Catch:{ all -> 0x00d1 }
            java.lang.Object r5 = r10.get(r2)     // Catch:{ all -> 0x00d1 }
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x00d1 }
            r4.f11432d = r5     // Catch:{ all -> 0x00d1 }
            r5 = r0
        L_0x0066:
            java.util.List<java.util.List<java.lang.Integer>> r6 = r4.f11432d     // Catch:{ all -> 0x00d1 }
            int r6 = r6.size()     // Catch:{ all -> 0x00d1 }
            if (r5 >= r6) goto L_0x00a1
            r6 = r0
        L_0x006f:
            java.util.List<java.util.List<java.lang.Integer>> r7 = r4.f11432d     // Catch:{ all -> 0x00d1 }
            java.lang.Object r7 = r7.get(r5)     // Catch:{ all -> 0x00d1 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x00d1 }
            int r7 = r7.size()     // Catch:{ all -> 0x00d1 }
            if (r6 >= r7) goto L_0x009e
            com.facetec.sdk.ac r7 = new com.facetec.sdk.ac     // Catch:{ all -> 0x00d1 }
            r7.<init>()     // Catch:{ all -> 0x00d1 }
            r7.f8773a = r5     // Catch:{ all -> 0x00d1 }
            java.util.List<java.util.List<java.lang.Integer>> r8 = r4.f11432d     // Catch:{ all -> 0x00d1 }
            java.lang.Object r8 = r8.get(r5)     // Catch:{ all -> 0x00d1 }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x00d1 }
            java.lang.Object r8 = r8.get(r6)     // Catch:{ all -> 0x00d1 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x00d1 }
            int r8 = r8.intValue()     // Catch:{ all -> 0x00d1 }
            r7.f8777e = r8     // Catch:{ all -> 0x00d1 }
            r3.add(r7)     // Catch:{ all -> 0x00d1 }
            int r6 = r6 + 1
            goto L_0x006f
        L_0x009e:
            int r5 = r5 + 1
            goto L_0x0066
        L_0x00a1:
            r4.f11430b = r3     // Catch:{ all -> 0x00d1 }
            r1.add(r4)     // Catch:{ all -> 0x00d1 }
            int r2 = r2 + 1
            goto L_0x004d
        L_0x00a9:
            java.util.List<com.facetec.sdk.r> r10 = r9.f11565h     // Catch:{ all -> 0x00d1 }
            r10.addAll(r1)     // Catch:{ all -> 0x00d1 }
            monitor-exit(r9)
            return
        L_0x00b0:
            if (r10 != 0) goto L_0x00cd
            if (r1 <= 0) goto L_0x00cd
            r9.f11566i = r0     // Catch:{ all -> 0x00d1 }
            com.facetec.sdk.r r10 = r9.f11562e     // Catch:{ all -> 0x00d1 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x00d1 }
            r0.<init>()     // Catch:{ all -> 0x00d1 }
            r10.f11431c = r0     // Catch:{ all -> 0x00d1 }
            java.util.List<com.facetec.sdk.r> r10 = r9.f11561d     // Catch:{ all -> 0x00d1 }
            com.facetec.sdk.r r0 = r9.f11562e     // Catch:{ all -> 0x00d1 }
            r10.add(r0)     // Catch:{ all -> 0x00d1 }
            com.facetec.sdk.r r10 = new com.facetec.sdk.r     // Catch:{ all -> 0x00d1 }
            r10.<init>()     // Catch:{ all -> 0x00d1 }
            r9.f11562e = r10     // Catch:{ all -> 0x00d1 }
        L_0x00cd:
            monitor-exit(r9)
            return
        L_0x00cf:
            monitor-exit(r9)
            return
        L_0x00d1:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3604u.mo10063a(boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo10067c(byte[] r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.mo10069e()     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0045
            int r0 = r2.length     // Catch:{ all -> 0x0047 }
            if (r0 != 0) goto L_0x000b
            goto L_0x0045
        L_0x000b:
            com.facetec.sdk.ac r0 = new com.facetec.sdk.ac     // Catch:{ all -> 0x0047 }
            r0.<init>()     // Catch:{ all -> 0x0047 }
            r0.f8775c = r2     // Catch:{ all -> 0x0047 }
            com.facetec.sdk.r r2 = r1.f11562e     // Catch:{ all -> 0x0047 }
            java.util.List<com.facetec.sdk.ac> r2 = r2.f11430b     // Catch:{ all -> 0x0047 }
            int r2 = r2.size()     // Catch:{ all -> 0x0047 }
            r0.f8774b = r2     // Catch:{ all -> 0x0047 }
            int r2 = r1.f11564g     // Catch:{ all -> 0x0047 }
            r0.f8773a = r2     // Catch:{ all -> 0x0047 }
            com.facetec.sdk.r r2 = r1.f11562e     // Catch:{ all -> 0x0047 }
            java.util.List<com.facetec.sdk.ac> r2 = r2.f11430b     // Catch:{ all -> 0x0047 }
            r2.add(r0)     // Catch:{ all -> 0x0047 }
            com.facetec.sdk.r r2 = r1.f11562e     // Catch:{ all -> 0x0047 }
            java.util.List<com.facetec.sdk.ac> r2 = r2.f11430b     // Catch:{ all -> 0x0047 }
            int r2 = r2.size()     // Catch:{ all -> 0x0047 }
            int r2 = r2 % 20
            if (r2 != 0) goto L_0x0036
            r2 = 1
            r1.f11563f = r2     // Catch:{ all -> 0x0047 }
        L_0x0036:
            boolean r2 = r1.f11563f     // Catch:{ all -> 0x0047 }
            if (r2 == 0) goto L_0x0043
            boolean r2 = r1.f11567j     // Catch:{ all -> 0x0047 }
            if (r2 != 0) goto L_0x0043
            int r2 = r1.f11566i     // Catch:{ all -> 0x0047 }
            r1.m13926a((int) r2)     // Catch:{ all -> 0x0047 }
        L_0x0043:
            monitor-exit(r1)
            return
        L_0x0045:
            monitor-exit(r1)
            return
        L_0x0047:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3604u.mo10067c(byte[]):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized boolean mo10064a() {
        return this.f11558a == C2768ab.STARTED;
    }

    /* renamed from: a */
    private void m13926a(int i) {
        if (i == 0 || (!this.f11567j && this.f11563f)) {
            this.f11567j = true;
            this.f11563f = false;
            while (i < this.f11562e.f11430b.size()) {
                if (this.f11562e.f11430b.get(i).f8775c.length != 0) {
                    this.f11562e.f11430b.get(i).f8777e = Arrays.hashCode(this.f11562e.f11430b.get(i).f8775c);
                    this.f11562e.f11430b.get(i).f8775c = new byte[0];
                    this.f11566i = i + 1;
                }
                i++;
            }
            this.f11567j = false;
        }
    }
}
