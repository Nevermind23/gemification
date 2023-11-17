package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.t6 */
public abstract class C4416t6 {

    /* renamed from: f */
    private static final Object f13686f = new Object();

    /* renamed from: g */
    private static volatile C4365q6 f13687g;

    /* renamed from: h */
    private static final AtomicReference f13688h = new AtomicReference();

    /* renamed from: i */
    private static final C4450v6 f13689i = new C4450v6(C4263k6.f13430a);

    /* renamed from: j */
    private static final AtomicInteger f13690j = new AtomicInteger();

    /* renamed from: k */
    public static final /* synthetic */ int f13691k = 0;

    /* renamed from: a */
    final C4348p6 f13692a;

    /* renamed from: b */
    final String f13693b;

    /* renamed from: c */
    private final Object f13694c;

    /* renamed from: d */
    private volatile int f13695d = -1;

    /* renamed from: e */
    private volatile Object f13696e;

    /* synthetic */ C4416t6(C4348p6 p6Var, String str, Object obj, boolean z, C4399s6 s6Var) {
        if (p6Var.f13580a != null) {
            this.f13692a = p6Var;
            this.f13693b = str;
            this.f13694c = obj;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    /* renamed from: c */
    public static void m16738c() {
        f13690j.incrementAndGet();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: d */
    public static void m16739d(android.content.Context r3) {
        /*
            com.google.android.gms.internal.measurement.q6 r0 = f13687g
            if (r0 != 0) goto L_0x0048
            if (r3 != 0) goto L_0x0007
            goto L_0x0048
        L_0x0007:
            java.lang.Object r0 = f13686f
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.q6 r1 = f13687g     // Catch:{ all -> 0x0045 }
            if (r1 != 0) goto L_0x0043
            monitor-enter(r0)     // Catch:{ all -> 0x0045 }
            com.google.android.gms.internal.measurement.q6 r1 = f13687g     // Catch:{ all -> 0x0040 }
            android.content.Context r2 = r3.getApplicationContext()     // Catch:{ all -> 0x0040 }
            if (r2 == 0) goto L_0x0018
            r3 = r2
        L_0x0018:
            if (r1 == 0) goto L_0x0020
            android.content.Context r1 = r1.mo13492a()     // Catch:{ all -> 0x0040 }
            if (r1 == r3) goto L_0x003e
        L_0x0020:
            com.google.android.gms.internal.measurement.C4482x5.m17138e()     // Catch:{ all -> 0x0040 }
            com.google.android.gms.internal.measurement.C4433u6.m16957c()     // Catch:{ all -> 0x0040 }
            com.google.android.gms.internal.measurement.C4161e6.m15709e()     // Catch:{ all -> 0x0040 }
            com.google.android.gms.internal.measurement.j6 r1 = new com.google.android.gms.internal.measurement.j6     // Catch:{ all -> 0x0040 }
            r1.<init>(r3)     // Catch:{ all -> 0x0040 }
            com.google.android.gms.internal.measurement.e7 r1 = com.google.android.gms.internal.measurement.C4247j7.m16166a(r1)     // Catch:{ all -> 0x0040 }
            com.google.android.gms.internal.measurement.u5 r2 = new com.google.android.gms.internal.measurement.u5     // Catch:{ all -> 0x0040 }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x0040 }
            f13687g = r2     // Catch:{ all -> 0x0040 }
            java.util.concurrent.atomic.AtomicInteger r3 = f13690j     // Catch:{ all -> 0x0040 }
            r3.incrementAndGet()     // Catch:{ all -> 0x0040 }
        L_0x003e:
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            goto L_0x0043
        L_0x0040:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            throw r3     // Catch:{ all -> 0x0045 }
        L_0x0043:
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            return
        L_0x0045:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            throw r3
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4416t6.m16739d(android.content.Context):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract Object mo13319a(Object obj);

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040 A[Catch:{ all -> 0x00bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0077 A[Catch:{ all -> 0x00bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007c A[Catch:{ all -> 0x00bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007f A[Catch:{ all -> 0x00bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ad A[Catch:{ all -> 0x00bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bd A[Catch:{ all -> 0x00bb }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo13631b() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = f13690j
            int r0 = r0.get()
            int r1 = r8.f13695d
            if (r1 >= r0) goto L_0x00c7
            monitor-enter(r8)
            int r1 = r8.f13695d     // Catch:{ all -> 0x00bb }
            if (r1 >= r0) goto L_0x00c3
            com.google.android.gms.internal.measurement.q6 r1 = f13687g     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.measurement.a7 r2 = com.google.android.gms.internal.measurement.C4094a7.m15474c()     // Catch:{ all -> 0x00bb }
            r3 = 0
            if (r1 == 0) goto L_0x003b
            com.google.android.gms.internal.measurement.e7 r2 = r1.mo13493b()     // Catch:{ all -> 0x00bb }
            java.lang.Object r2 = r2.mo12874a()     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.measurement.a7 r2 = (com.google.android.gms.internal.measurement.C4094a7) r2     // Catch:{ all -> 0x00bb }
            boolean r4 = r2.mo12843b()     // Catch:{ all -> 0x00bb }
            if (r4 == 0) goto L_0x003b
            java.lang.Object r4 = r2.mo12842a()     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.measurement.y5 r4 = (com.google.android.gms.internal.measurement.C4498y5) r4     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.measurement.p6 r5 = r8.f13692a     // Catch:{ all -> 0x00bb }
            android.net.Uri r6 = r5.f13580a     // Catch:{ all -> 0x00bb }
            java.lang.String r5 = r5.f13582c     // Catch:{ all -> 0x00bb }
            java.lang.String r7 = r8.f13693b     // Catch:{ all -> 0x00bb }
            java.lang.String r4 = r4.mo13830a(r6, r3, r5, r7)     // Catch:{ all -> 0x00bb }
            goto L_0x003c
        L_0x003b:
            r4 = r3
        L_0x003c:
            java.lang.String r5 = "Must call PhenotypeFlag.init() first"
            if (r1 == 0) goto L_0x00bd
            com.google.android.gms.internal.measurement.p6 r5 = r8.f13692a     // Catch:{ all -> 0x00bb }
            android.net.Uri r5 = r5.f13580a     // Catch:{ all -> 0x00bb }
            if (r5 == 0) goto L_0x0063
            android.content.Context r6 = r1.mo13492a()     // Catch:{ all -> 0x00bb }
            boolean r5 = com.google.android.gms.internal.measurement.C4195g6.m15900a(r6, r5)     // Catch:{ all -> 0x00bb }
            if (r5 == 0) goto L_0x006c
            android.content.Context r5 = r1.mo13492a()     // Catch:{ all -> 0x00bb }
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.measurement.p6 r6 = r8.f13692a     // Catch:{ all -> 0x00bb }
            android.net.Uri r6 = r6.f13580a     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.measurement.i6 r7 = com.google.android.gms.internal.measurement.C4229i6.f13332d     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.measurement.x5 r5 = com.google.android.gms.internal.measurement.C4482x5.m17137b(r5, r6, r7)     // Catch:{ all -> 0x00bb }
            goto L_0x006d
        L_0x0063:
            android.content.Context r5 = r1.mo13492a()     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.measurement.i6 r6 = com.google.android.gms.internal.measurement.C4229i6.f13332d     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.measurement.C4433u6.m16956b(r5, r3, r6)     // Catch:{ all -> 0x00bb }
        L_0x006c:
            r5 = r3
        L_0x006d:
            if (r5 == 0) goto L_0x007c
            java.lang.String r6 = r8.f13693b     // Catch:{ all -> 0x00bb }
            java.lang.Object r5 = r5.mo12910a(r6)     // Catch:{ all -> 0x00bb }
            if (r5 == 0) goto L_0x007c
            java.lang.Object r5 = r8.mo13319a(r5)     // Catch:{ all -> 0x00bb }
            goto L_0x007d
        L_0x007c:
            r5 = r3
        L_0x007d:
            if (r5 != 0) goto L_0x00a7
            com.google.android.gms.internal.measurement.p6 r5 = r8.f13692a     // Catch:{ all -> 0x00bb }
            boolean r5 = r5.f13583d     // Catch:{ all -> 0x00bb }
            if (r5 != 0) goto L_0x00a1
            android.content.Context r1 = r1.mo13492a()     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.measurement.e6 r1 = com.google.android.gms.internal.measurement.C4161e6.m15708b(r1)     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.measurement.p6 r5 = r8.f13692a     // Catch:{ all -> 0x00bb }
            boolean r5 = r5.f13583d     // Catch:{ all -> 0x00bb }
            if (r5 == 0) goto L_0x0095
            r5 = r3
            goto L_0x0097
        L_0x0095:
            java.lang.String r5 = r8.f13693b     // Catch:{ all -> 0x00bb }
        L_0x0097:
            java.lang.String r1 = r1.mo12910a(r5)     // Catch:{ all -> 0x00bb }
            if (r1 == 0) goto L_0x00a1
            java.lang.Object r3 = r8.mo13319a(r1)     // Catch:{ all -> 0x00bb }
        L_0x00a1:
            if (r3 != 0) goto L_0x00a6
            java.lang.Object r5 = r8.f13694c     // Catch:{ all -> 0x00bb }
            goto L_0x00a7
        L_0x00a6:
            r5 = r3
        L_0x00a7:
            boolean r1 = r2.mo12843b()     // Catch:{ all -> 0x00bb }
            if (r1 == 0) goto L_0x00b6
            if (r4 != 0) goto L_0x00b2
            java.lang.Object r5 = r8.f13694c     // Catch:{ all -> 0x00bb }
            goto L_0x00b6
        L_0x00b2:
            java.lang.Object r5 = r8.mo13319a(r4)     // Catch:{ all -> 0x00bb }
        L_0x00b6:
            r8.f13696e = r5     // Catch:{ all -> 0x00bb }
            r8.f13695d = r0     // Catch:{ all -> 0x00bb }
            goto L_0x00c3
        L_0x00bb:
            r0 = move-exception
            goto L_0x00c5
        L_0x00bd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00bb }
            r0.<init>(r5)     // Catch:{ all -> 0x00bb }
            throw r0     // Catch:{ all -> 0x00bb }
        L_0x00c3:
            monitor-exit(r8)     // Catch:{ all -> 0x00bb }
            goto L_0x00c7
        L_0x00c5:
            monitor-exit(r8)     // Catch:{ all -> 0x00bb }
            throw r0
        L_0x00c7:
            java.lang.Object r0 = r8.f13696e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4416t6.mo13631b():java.lang.Object");
    }
}
