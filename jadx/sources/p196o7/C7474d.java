package p196o7;

import android.content.Context;

/* renamed from: o7.d */
public abstract class C7474d {

    /* renamed from: a */
    private static final String f21755a = "d";

    /* renamed from: b */
    private static boolean f21756b = false;

    /* renamed from: c */
    private static C7475a f21757c = C7475a.LEGACY;

    /* renamed from: o7.d$a */
    public enum C7475a {
        LEGACY,
        LATEST
    }

    /* renamed from: a */
    public static synchronized int m28433a(Context context) {
        int b;
        synchronized (C7474d.class) {
            b = m28434b(context, (C7475a) null, (C7477f) null);
        }
        return b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007c, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        return 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f A[Catch:{ RemoteException -> 0x007d, RemoteException -> 0x005b }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0076 A[Catch:{ RemoteException -> 0x007d, RemoteException -> 0x005b }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized int m28434b(android.content.Context r5, p196o7.C7474d.C7475a r6, p196o7.C7477f r7) {
        /*
            java.lang.Class<o7.d> r0 = p196o7.C7474d.class
            monitor-enter(r0)
            java.lang.String r1 = "Context is null"
            p182n6.C7264i.m27903l(r5, r1)     // Catch:{ all -> 0x0089 }
            java.lang.String r1 = f21755a     // Catch:{ all -> 0x0089 }
            java.lang.String r2 = "preferredRenderer: "
            java.lang.String r3 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0089 }
            java.lang.String r2 = r2.concat(r3)     // Catch:{ all -> 0x0089 }
            android.util.Log.d(r1, r2)     // Catch:{ all -> 0x0089 }
            boolean r1 = f21756b     // Catch:{ all -> 0x0089 }
            r2 = 0
            if (r1 == 0) goto L_0x0025
            if (r7 == 0) goto L_0x0023
            o7.d$a r5 = f21757c     // Catch:{ all -> 0x0089 }
            r7.mo21895j(r5)     // Catch:{ all -> 0x0089 }
        L_0x0023:
            monitor-exit(r0)
            return r2
        L_0x0025:
            p7.w r1 = p209p7.C7756u.m29412a(r5, r6)     // Catch:{ GooglePlayServicesNotAvailableException -> 0x0084 }
            p7.a r3 = r1.mo22519t()     // Catch:{ RemoteException -> 0x007d }
            p196o7.C7464b.m28400c(r3)     // Catch:{ RemoteException -> 0x007d }
            j7.m r3 = r1.mo22516d()     // Catch:{ RemoteException -> 0x007d }
            p222q7.C7897b.m29877c(r3)     // Catch:{ RemoteException -> 0x007d }
            r3 = 1
            f21756b = r3     // Catch:{ all -> 0x0089 }
            r4 = 2
            if (r6 == 0) goto L_0x0048
            int r6 = r6.ordinal()     // Catch:{ all -> 0x0089 }
            if (r6 == 0) goto L_0x0049
            if (r6 == r3) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            r3 = r4
            goto L_0x0049
        L_0x0048:
            r3 = r2
        L_0x0049:
            int r6 = r1.mo22515b()     // Catch:{ RemoteException -> 0x005b }
            if (r6 != r4) goto L_0x0053
            o7.d$a r6 = p196o7.C7474d.C7475a.LATEST     // Catch:{ RemoteException -> 0x005b }
            f21757c = r6     // Catch:{ RemoteException -> 0x005b }
        L_0x0053:
            w6.b r5 = p299w6.C8862d.m32984T1(r5)     // Catch:{ RemoteException -> 0x005b }
            r1.mo22518i0(r5, r3)     // Catch:{ RemoteException -> 0x005b }
            goto L_0x0063
        L_0x005b:
            r5 = move-exception
            java.lang.String r6 = f21755a     // Catch:{ all -> 0x0089 }
            java.lang.String r1 = "Failed to retrieve renderer type or log initialization."
            android.util.Log.e(r6, r1, r5)     // Catch:{ all -> 0x0089 }
        L_0x0063:
            java.lang.String r5 = f21755a     // Catch:{ all -> 0x0089 }
            java.lang.String r6 = "loadedRenderer: "
            o7.d$a r1 = f21757c     // Catch:{ all -> 0x0089 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0089 }
            java.lang.String r6 = r6.concat(r1)     // Catch:{ all -> 0x0089 }
            android.util.Log.d(r5, r6)     // Catch:{ all -> 0x0089 }
            if (r7 == 0) goto L_0x007b
            o7.d$a r5 = f21757c     // Catch:{ all -> 0x0089 }
            r7.mo21895j(r5)     // Catch:{ all -> 0x0089 }
        L_0x007b:
            monitor-exit(r0)
            return r2
        L_0x007d:
            r5 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r6 = new com.google.android.gms.maps.model.RuntimeRemoteException     // Catch:{ all -> 0x0089 }
            r6.<init>(r5)     // Catch:{ all -> 0x0089 }
            throw r6     // Catch:{ all -> 0x0089 }
        L_0x0084:
            r5 = move-exception
            int r5 = r5.f12239d     // Catch:{ all -> 0x0089 }
            monitor-exit(r0)
            return r5
        L_0x0089:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p196o7.C7474d.m28434b(android.content.Context, o7.d$a, o7.f):int");
    }
}
