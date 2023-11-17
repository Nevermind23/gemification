package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.g6 */
public abstract class C4195g6 {

    /* renamed from: a */
    static volatile C4094a7 f13249a = C4094a7.m15474c();

    /* renamed from: b */
    private static final Object f13250b = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0075, code lost:
        if ("com.google.android.gms".equals(r0.packageName) != false) goto L_0x0077;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m15900a(android.content.Context r5, android.net.Uri r6) {
        /*
            java.lang.String r0 = "com.google.android.gms.phenotype"
            java.lang.String r6 = r6.getAuthority()
            boolean r0 = r0.equals(r6)
            r1 = 0
            if (r0 != 0) goto L_0x001d
            java.lang.String r5 = java.lang.String.valueOf(r6)
            java.lang.String r6 = " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."
            java.lang.String r0 = "PhenotypeClientHelper"
            java.lang.String r5 = r5.concat(r6)
            android.util.Log.e(r0, r5)
            return r1
        L_0x001d:
            com.google.android.gms.internal.measurement.a7 r6 = f13249a
            boolean r6 = r6.mo12843b()
            if (r6 == 0) goto L_0x0032
            com.google.android.gms.internal.measurement.a7 r5 = f13249a
            java.lang.Object r5 = r5.mo12842a()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L_0x0032:
            java.lang.Object r6 = f13250b
            monitor-enter(r6)
            com.google.android.gms.internal.measurement.a7 r0 = f13249a     // Catch:{ all -> 0x00a0 }
            boolean r0 = r0.mo12843b()     // Catch:{ all -> 0x00a0 }
            if (r0 == 0) goto L_0x004b
            com.google.android.gms.internal.measurement.a7 r5 = f13249a     // Catch:{ all -> 0x00a0 }
            java.lang.Object r5 = r5.mo12842a()     // Catch:{ all -> 0x00a0 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x00a0 }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x00a0 }
            monitor-exit(r6)     // Catch:{ all -> 0x00a0 }
            return r5
        L_0x004b:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r2 = r5.getPackageName()     // Catch:{ all -> 0x00a0 }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x00a0 }
            if (r0 != 0) goto L_0x0077
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch:{ all -> 0x00a0 }
            java.lang.String r2 = "com.google.android.gms.phenotype"
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00a0 }
            r4 = 29
            if (r3 >= r4) goto L_0x0065
            r3 = r1
            goto L_0x0067
        L_0x0065:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0067:
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r2, r3)     // Catch:{ all -> 0x00a0 }
            if (r0 == 0) goto L_0x0088
            java.lang.String r2 = "com.google.android.gms"
            java.lang.String r0 = r0.packageName     // Catch:{ all -> 0x00a0 }
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x00a0 }
            if (r0 == 0) goto L_0x0088
        L_0x0077:
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch:{ all -> 0x00a0 }
            java.lang.String r0 = "com.google.android.gms"
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo(r0, r1)     // Catch:{ NameNotFoundException -> 0x0088 }
            int r5 = r5.flags     // Catch:{ all -> 0x00a0 }
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L_0x0088
            r1 = 1
        L_0x0088:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x00a0 }
            com.google.android.gms.internal.measurement.a7 r5 = com.google.android.gms.internal.measurement.C4094a7.m15475d(r5)     // Catch:{ all -> 0x00a0 }
            f13249a = r5     // Catch:{ all -> 0x00a0 }
            monitor-exit(r6)     // Catch:{ all -> 0x00a0 }
            com.google.android.gms.internal.measurement.a7 r5 = f13249a
            java.lang.Object r5 = r5.mo12842a()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L_0x00a0:
            r5 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00a0 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4195g6.m15900a(android.content.Context, android.net.Uri):boolean");
    }
}
