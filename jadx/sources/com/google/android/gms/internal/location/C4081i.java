package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3877d;
import com.google.android.gms.common.internal.C3964c;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p118i7.C6594e;
import p118i7.C6597h;
import p118i7.C6599j;
import p156l6.C6933c;
import p156l6.C6935d;
import p156l6.C6937e;
import p156l6.C6946i;
import p182n6.C7249c;
import p182n6.C7264i;
import p183n7.C7331r0;

/* renamed from: com.google.android.gms.internal.location.i */
public final class C4081i extends C3964c {

    /* renamed from: I */
    private final Map f13091I = new HashMap();

    /* renamed from: J */
    private final Map f13092J = new HashMap();

    /* renamed from: K */
    private final Map f13093K = new HashMap();

    /* renamed from: L */
    private final String f13094L;

    /* renamed from: M */
    private boolean f13095M;

    public C4081i(Context context, Looper looper, C7249c cVar, C6935d dVar, C6946i iVar, String str) {
        super(context, looper, 23, cVar, dVar, iVar);
        this.f13094L = str;
    }

    /* renamed from: u0 */
    private final boolean m15444u0(Feature feature) {
        Feature feature2;
        Feature[] r = mo12249r();
        if (r == null) {
            return false;
        }
        int length = r.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                feature2 = null;
                break;
            }
            feature2 = r[i];
            if (feature.mo11865v().equals(feature2.mo11865v())) {
                break;
            }
            i++;
        }
        if (feature2 != null && feature2.mo11866w() >= feature.mo11866w()) {
            return true;
        }
        return false;
    }

    /* renamed from: A */
    public final Feature[] mo12216A() {
        return C7331r0.f21531j;
    }

    /* renamed from: A0 */
    public final void mo12801A0(C3877d.C3878a aVar, C6594e eVar) {
        C7264i.m27903l(aVar, "Invalid null listener key");
        synchronized (this.f13092J) {
            C4078f fVar = (C4078f) this.f13092J.remove(aVar);
            if (fVar != null) {
                fVar.mo12796s();
                ((C6597h) mo12223I()).mo12788b0(zzbh.m15463v(fVar, eVar));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final Bundle mo7048F() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f13094L);
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo7049J() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final String mo7050K() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    /* renamed from: X */
    public final boolean mo7051X() {
        return true;
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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: b */
    public final void mo12236b() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.mo12237c()     // Catch:{ all -> 0x00b7 }
            if (r0 == 0) goto L_0x00b2
            java.util.Map r0 = r6.f13091I     // Catch:{ Exception -> 0x00aa }
            monitor-enter(r0)     // Catch:{ Exception -> 0x00aa }
            java.util.Map r1 = r6.f13091I     // Catch:{ all -> 0x00a7 }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x00a7 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00a7 }
        L_0x0014:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00a7 }
            r3 = 0
            if (r2 == 0) goto L_0x0030
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00a7 }
            android.support.p013v4.media.session.C0125b.m366a(r2)     // Catch:{ all -> 0x00a7 }
            android.os.IInterface r2 = r6.mo12223I()     // Catch:{ all -> 0x00a7 }
            i7.h r2 = (p118i7.C6597h) r2     // Catch:{ all -> 0x00a7 }
            com.google.android.gms.internal.location.zzbh r3 = com.google.android.gms.internal.location.zzbh.m15464w(r3, r3)     // Catch:{ all -> 0x00a7 }
            r2.mo12788b0(r3)     // Catch:{ all -> 0x00a7 }
            goto L_0x0014
        L_0x0030:
            java.util.Map r1 = r6.f13091I     // Catch:{ all -> 0x00a7 }
            r1.clear()     // Catch:{ all -> 0x00a7 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a7 }
            java.util.Map r0 = r6.f13092J     // Catch:{ Exception -> 0x00aa }
            monitor-enter(r0)     // Catch:{ Exception -> 0x00aa }
            java.util.Map r1 = r6.f13092J     // Catch:{ all -> 0x00a4 }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x00a4 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00a4 }
        L_0x0043:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00a4 }
            if (r2 == 0) goto L_0x005d
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00a4 }
            com.google.android.gms.internal.location.f r2 = (com.google.android.gms.internal.location.C4078f) r2     // Catch:{ all -> 0x00a4 }
            android.os.IInterface r4 = r6.mo12223I()     // Catch:{ all -> 0x00a4 }
            i7.h r4 = (p118i7.C6597h) r4     // Catch:{ all -> 0x00a4 }
            com.google.android.gms.internal.location.zzbh r2 = com.google.android.gms.internal.location.zzbh.m15463v(r2, r3)     // Catch:{ all -> 0x00a4 }
            r4.mo12788b0(r2)     // Catch:{ all -> 0x00a4 }
            goto L_0x0043
        L_0x005d:
            java.util.Map r1 = r6.f13092J     // Catch:{ all -> 0x00a4 }
            r1.clear()     // Catch:{ all -> 0x00a4 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a4 }
            java.util.Map r0 = r6.f13093K     // Catch:{ Exception -> 0x00aa }
            monitor-enter(r0)     // Catch:{ Exception -> 0x00aa }
            java.util.Map r1 = r6.f13093K     // Catch:{ all -> 0x00a1 }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x00a1 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00a1 }
        L_0x0070:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00a1 }
            if (r2 == 0) goto L_0x008d
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00a1 }
            android.support.p013v4.media.session.C0125b.m366a(r2)     // Catch:{ all -> 0x00a1 }
            android.os.IInterface r2 = r6.mo12223I()     // Catch:{ all -> 0x00a1 }
            i7.h r2 = (p118i7.C6597h) r2     // Catch:{ all -> 0x00a1 }
            com.google.android.gms.internal.location.zzj r4 = new com.google.android.gms.internal.location.zzj     // Catch:{ all -> 0x00a1 }
            r5 = 2
            r4.<init>(r5, r3, r3, r3)     // Catch:{ all -> 0x00a1 }
            r2.mo12786U(r4)     // Catch:{ all -> 0x00a1 }
            goto L_0x0070
        L_0x008d:
            java.util.Map r1 = r6.f13093K     // Catch:{ all -> 0x00a1 }
            r1.clear()     // Catch:{ all -> 0x00a1 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a1 }
            boolean r0 = r6.f13095M     // Catch:{ Exception -> 0x00aa }
            if (r0 == 0) goto L_0x00b2
            com.google.android.gms.internal.location.c r0 = new com.google.android.gms.internal.location.c     // Catch:{ Exception -> 0x00aa }
            r0.<init>(r6)     // Catch:{ Exception -> 0x00aa }
            r1 = 0
            r6.mo12804t0(r1, r0)     // Catch:{ Exception -> 0x00aa }
            goto L_0x00b2
        L_0x00a1:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a1 }
            throw r1     // Catch:{ Exception -> 0x00aa }
        L_0x00a4:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a4 }
            throw r1     // Catch:{ Exception -> 0x00aa }
        L_0x00a7:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a7 }
            throw r1     // Catch:{ Exception -> 0x00aa }
        L_0x00aa:
            r0 = move-exception
            java.lang.String r1 = "LocationClientImpl"
            java.lang.String r2 = "Client disconnected before listeners could be cleaned up"
            android.util.Log.e(r1, r2, r0)     // Catch:{ all -> 0x00b7 }
        L_0x00b2:
            super.mo12236b()     // Catch:{ all -> 0x00b7 }
            monitor-exit(r6)     // Catch:{ all -> 0x00b7 }
            return
        L_0x00b7:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00b7 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.C4081i.mo12236b():void");
    }

    /* renamed from: q */
    public final int mo7053q() {
        return 11717000;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: r0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12802r0(com.google.android.gms.internal.location.zzbf r11, com.google.android.gms.common.api.internal.C3877d r12, p118i7.C6594e r13) {
        /*
            r10 = this;
            com.google.android.gms.common.api.internal.d$a r0 = r12.mo12042b()
            if (r0 != 0) goto L_0x0013
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            r11.<init>()
            java.lang.String r12 = "LocationClientImpl"
            java.lang.String r13 = "requested location updates on dead listener"
            android.util.Log.e(r12, r13, r11)
            return
        L_0x0013:
            r10.mo12219D()
            monitor-enter(r10)
            java.util.Map r1 = r10.f13092J     // Catch:{ all -> 0x004d }
            monitor-enter(r1)     // Catch:{ all -> 0x004d }
            java.util.Map r2 = r10.f13092J     // Catch:{ all -> 0x004a }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x004a }
            com.google.android.gms.internal.location.f r2 = (com.google.android.gms.internal.location.C4078f) r2     // Catch:{ all -> 0x004a }
            if (r2 != 0) goto L_0x002e
            com.google.android.gms.internal.location.f r2 = new com.google.android.gms.internal.location.f     // Catch:{ all -> 0x004a }
            r2.<init>(r12)     // Catch:{ all -> 0x004a }
            java.util.Map r12 = r10.f13092J     // Catch:{ all -> 0x004a }
            r12.put(r0, r2)     // Catch:{ all -> 0x004a }
        L_0x002e:
            r6 = r2
            monitor-exit(r1)     // Catch:{ all -> 0x004a }
            android.os.IInterface r12 = r10.mo12223I()     // Catch:{ all -> 0x004d }
            i7.h r12 = (p118i7.C6597h) r12     // Catch:{ all -> 0x004d }
            java.lang.String r9 = r0.mo12045a()     // Catch:{ all -> 0x004d }
            com.google.android.gms.internal.location.zzbh r0 = new com.google.android.gms.internal.location.zzbh     // Catch:{ all -> 0x004d }
            r3 = 1
            r5 = 0
            r7 = 0
            r2 = r0
            r4 = r11
            r8 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x004d }
            r12.mo12788b0(r0)     // Catch:{ all -> 0x004d }
            monitor-exit(r10)     // Catch:{ all -> 0x004d }
            return
        L_0x004a:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x004a }
            throw r11     // Catch:{ all -> 0x004d }
        L_0x004d:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x004d }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.C4081i.mo12802r0(com.google.android.gms.internal.location.zzbf, com.google.android.gms.common.api.internal.d, i7.e):void");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: s0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12803s0(com.google.android.gms.internal.location.zzbf r11, android.app.PendingIntent r12, p118i7.C6594e r13) {
        /*
            r10 = this;
            r10.mo12219D()
            android.os.IInterface r0 = r10.mo12223I()
            i7.h r0 = (p118i7.C6597h) r0
            com.google.android.gms.internal.location.zzbh r9 = new com.google.android.gms.internal.location.zzbh
            int r1 = r12.hashCode()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 25
            r2.<init>(r3)
            java.lang.String r3 = "PendingIntent@"
            r2.append(r3)
            r2.append(r1)
            r3 = 1
            r4 = 0
            r5 = 0
            java.lang.String r8 = r2.toString()
            r1 = r9
            r2 = r3
            r3 = r11
            r6 = r12
            r7 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0.mo12788b0(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.C4081i.mo12803s0(com.google.android.gms.internal.location.zzbf, android.app.PendingIntent, i7.e):void");
    }

    /* renamed from: t0 */
    public final void mo12804t0(boolean z, C6937e eVar) {
        if (m15444u0(C7331r0.f21528g)) {
            ((C6597h) mo12223I()).mo12789l2(z, eVar);
        } else {
            ((C6597h) mo12223I()).mo12785Q0(z);
            eVar.mo12793D1(Status.f12252j);
        }
        this.f13095M = z;
    }

    /* renamed from: v0 */
    public final void mo12805v0(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, C6933c cVar) {
        C7264i.m27903l(geofencingRequest, "geofencingRequest can't be null.");
        C7264i.m27903l(pendingIntent, "PendingIntent must be specified.");
        C7264i.m27903l(cVar, "ResultHolder not provided.");
        ((C6597h) mo12223I()).mo12792w0(geofencingRequest, pendingIntent, new C4079g(cVar));
    }

    /* renamed from: w0 */
    public final void mo12806w0(LocationSettingsRequest locationSettingsRequest, C6933c cVar, String str) {
        boolean z;
        boolean z2 = true;
        if (locationSettingsRequest != null) {
            z = true;
        } else {
            z = false;
        }
        C7264i.m27893b(z, "locationSettingsRequest can't be null nor empty.");
        if (cVar == null) {
            z2 = false;
        }
        C7264i.m27893b(z2, "listener can't be null.");
        ((C6597h) mo12223I()).mo12791q1(locationSettingsRequest, new C4080h(cVar), (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final /* synthetic */ IInterface mo7054x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (queryLocalInterface instanceof C6597h) {
            return (C6597h) queryLocalInterface;
        }
        return new C4074b(iBinder);
    }

    /* renamed from: x0 */
    public final void mo12807x0(LastLocationRequest lastLocationRequest, C6599j jVar) {
        if (m15444u0(C7331r0.f21527f)) {
            ((C6597h) mo12223I()).mo12783B(lastLocationRequest, jVar);
        } else {
            jVar.mo20590O(Status.f12252j, ((C6597h) mo12223I()).mo12787b());
        }
    }

    /* renamed from: y0 */
    public final void mo12808y0(PendingIntent pendingIntent, C6933c cVar) {
        C7264i.m27903l(pendingIntent, "PendingIntent must be specified.");
        C7264i.m27903l(cVar, "ResultHolder not provided.");
        ((C6597h) mo12223I()).mo12784F1(pendingIntent, new C4079g(cVar), mo12219D().getPackageName());
    }

    /* renamed from: z0 */
    public final void mo12809z0(List list, C6933c cVar) {
        boolean z;
        if (list == null || list.size() <= 0) {
            z = false;
        } else {
            z = true;
        }
        C7264i.m27893b(z, "geofenceRequestIds can't be null nor empty.");
        C7264i.m27903l(cVar, "ResultHolder not provided.");
        ((C6597h) mo12223I()).mo12790o2((String[]) list.toArray(new String[0]), new C4079g(cVar), mo12219D().getPackageName());
    }
}
