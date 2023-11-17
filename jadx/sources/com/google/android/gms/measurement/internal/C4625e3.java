package com.google.android.gms.measurement.internal;

import p248s7.C8249d;

/* renamed from: com.google.android.gms.measurement.internal.e3 */
public final class C4625e3 {

    /* renamed from: h */
    private static final Object f14299h = new Object();

    /* renamed from: a */
    private final String f14300a;

    /* renamed from: b */
    private final C4601c3 f14301b;

    /* renamed from: c */
    private final Object f14302c;

    /* renamed from: d */
    private final Object f14303d;

    /* renamed from: e */
    private final Object f14304e = new Object();

    /* renamed from: f */
    private volatile Object f14305f = null;

    /* renamed from: g */
    private volatile Object f14306g = null;

    /* synthetic */ C4625e3(String str, Object obj, Object obj2, C4601c3 c3Var, C8249d dVar) {
        this.f14300a = str;
        this.f14302c = obj;
        this.f14303d = obj2;
        this.f14301b = c3Var;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0046 */
    /* renamed from: a */
    public final java.lang.Object mo14346a(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f14304e
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            if (r4 == 0) goto L_0x0007
            return r4
        L_0x0007:
            com.google.android.gms.measurement.internal.c r4 = com.google.android.gms.measurement.internal.C4613d3.f14257a
            if (r4 != 0) goto L_0x000e
            java.lang.Object r4 = r3.f14302c
            return r4
        L_0x000e:
            java.lang.Object r4 = f14299h
            monitor-enter(r4)
            boolean r0 = com.google.android.gms.measurement.internal.C4597c.m17607a()     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = r3.f14306g     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x001e
            java.lang.Object r0 = r3.f14302c     // Catch:{ all -> 0x006a }
            goto L_0x0020
        L_0x001e:
            java.lang.Object r0 = r3.f14306g     // Catch:{ all -> 0x006a }
        L_0x0020:
            monitor-exit(r4)     // Catch:{ all -> 0x006a }
            return r0
        L_0x0022:
            monitor-exit(r4)     // Catch:{ all -> 0x006a }
            java.util.List r4 = com.google.android.gms.measurement.internal.C4636f3.f14360a     // Catch:{ SecurityException -> 0x0058 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ SecurityException -> 0x0058 }
        L_0x002b:
            boolean r0 = r4.hasNext()     // Catch:{ SecurityException -> 0x0058 }
            if (r0 == 0) goto L_0x0058
            java.lang.Object r0 = r4.next()     // Catch:{ SecurityException -> 0x0058 }
            com.google.android.gms.measurement.internal.e3 r0 = (com.google.android.gms.measurement.internal.C4625e3) r0     // Catch:{ SecurityException -> 0x0058 }
            boolean r1 = com.google.android.gms.measurement.internal.C4597c.m17607a()     // Catch:{ SecurityException -> 0x0058 }
            if (r1 != 0) goto L_0x0050
            r1 = 0
            com.google.android.gms.measurement.internal.c3 r2 = r0.f14301b     // Catch:{ IllegalStateException -> 0x0046 }
            if (r2 == 0) goto L_0x0046
            java.lang.Object r1 = r2.mo14294a()     // Catch:{ IllegalStateException -> 0x0046 }
        L_0x0046:
            java.lang.Object r2 = f14299h     // Catch:{ SecurityException -> 0x0058 }
            monitor-enter(r2)     // Catch:{ SecurityException -> 0x0058 }
            r0.f14306g = r1     // Catch:{ all -> 0x004d }
            monitor-exit(r2)     // Catch:{ all -> 0x004d }
            goto L_0x002b
        L_0x004d:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004d }
            throw r4     // Catch:{ SecurityException -> 0x0058 }
        L_0x0050:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ SecurityException -> 0x0058 }
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch:{ SecurityException -> 0x0058 }
            throw r4     // Catch:{ SecurityException -> 0x0058 }
        L_0x0058:
            com.google.android.gms.measurement.internal.c3 r4 = r3.f14301b
            if (r4 != 0) goto L_0x005f
            java.lang.Object r4 = r3.f14302c
            return r4
        L_0x005f:
            java.lang.Object r4 = r4.mo14294a()     // Catch:{ SecurityException -> 0x0067, IllegalStateException -> 0x0064 }
            return r4
        L_0x0064:
            java.lang.Object r4 = r3.f14302c
            return r4
        L_0x0067:
            java.lang.Object r4 = r3.f14302c
            return r4
        L_0x006a:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006a }
            throw r0
        L_0x006d:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4625e3.mo14346a(java.lang.Object):java.lang.Object");
    }

    /* renamed from: b */
    public final String mo14347b() {
        return this.f14300a;
    }
}
