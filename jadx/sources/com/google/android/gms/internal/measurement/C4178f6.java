package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.f6 */
public abstract class C4178f6 {

    /* renamed from: a */
    private static volatile C4094a7 f13231a;

    /* JADX WARNING: Can't wrap try/catch for region: R(2:69|70) */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        throw r14;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x015c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.C4094a7 m15814a(android.content.Context r14) {
        /*
            java.lang.Class<com.google.android.gms.internal.measurement.f6> r0 = com.google.android.gms.internal.measurement.C4178f6.class
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.a7 r1 = f13231a     // Catch:{ all -> 0x0177 }
            if (r1 != 0) goto L_0x0175
            java.lang.String r1 = android.os.Build.TYPE     // Catch:{ all -> 0x0177 }
            java.lang.String r2 = android.os.Build.TAGS     // Catch:{ all -> 0x0177 }
            java.lang.String r3 = "eng"
            boolean r3 = r1.equals(r3)     // Catch:{ all -> 0x0177 }
            if (r3 != 0) goto L_0x001b
            java.lang.String r3 = "userdebug"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0177 }
            if (r1 == 0) goto L_0x002c
        L_0x001b:
            java.lang.String r1 = "dev-keys"
            boolean r1 = r2.contains(r1)     // Catch:{ all -> 0x0177 }
            if (r1 != 0) goto L_0x0033
            java.lang.String r1 = "test-keys"
            boolean r1 = r2.contains(r1)     // Catch:{ all -> 0x0177 }
            if (r1 == 0) goto L_0x002c
            goto L_0x0033
        L_0x002c:
            com.google.android.gms.internal.measurement.a7 r14 = com.google.android.gms.internal.measurement.C4094a7.m15474c()     // Catch:{ all -> 0x0177 }
        L_0x0030:
            r1 = r14
            goto L_0x016d
        L_0x0033:
            boolean r1 = com.google.android.gms.internal.measurement.C4415t5.m16737b()     // Catch:{ all -> 0x0177 }
            if (r1 == 0) goto L_0x0043
            boolean r1 = r14.isDeviceProtectedStorage()     // Catch:{ all -> 0x0177 }
            if (r1 != 0) goto L_0x0043
            android.content.Context r14 = r14.createDeviceProtectedStorageContext()     // Catch:{ all -> 0x0177 }
        L_0x0043:
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ all -> 0x0177 }
            android.os.StrictMode.allowThreadDiskWrites()     // Catch:{ all -> 0x0170 }
            r2 = 0
            java.io.File r3 = new java.io.File     // Catch:{ RuntimeException -> 0x0068 }
            java.lang.String r4 = "phenotype_hermetic"
            java.io.File r4 = r14.getDir(r4, r2)     // Catch:{ RuntimeException -> 0x0068 }
            java.lang.String r5 = "overrides.txt"
            r3.<init>(r4, r5)     // Catch:{ RuntimeException -> 0x0068 }
            boolean r4 = r3.exists()     // Catch:{ all -> 0x0170 }
            if (r4 == 0) goto L_0x0063
            com.google.android.gms.internal.measurement.a7 r3 = com.google.android.gms.internal.measurement.C4094a7.m15475d(r3)     // Catch:{ all -> 0x0170 }
            goto L_0x0074
        L_0x0063:
            com.google.android.gms.internal.measurement.a7 r3 = com.google.android.gms.internal.measurement.C4094a7.m15474c()     // Catch:{ all -> 0x0170 }
            goto L_0x0074
        L_0x0068:
            r3 = move-exception
            java.lang.String r4 = "HermeticFileOverrides"
            java.lang.String r5 = "no data dir"
            android.util.Log.e(r4, r5, r3)     // Catch:{ all -> 0x0170 }
            com.google.android.gms.internal.measurement.a7 r3 = com.google.android.gms.internal.measurement.C4094a7.m15474c()     // Catch:{ all -> 0x0170 }
        L_0x0074:
            boolean r4 = r3.mo12843b()     // Catch:{ all -> 0x0170 }
            if (r4 == 0) goto L_0x0164
            java.lang.Object r3 = r3.mo12842a()     // Catch:{ all -> 0x0170 }
            java.io.File r3 = (java.io.File) r3     // Catch:{ all -> 0x0170 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException -> 0x015d }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x015d }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ IOException -> 0x015d }
            r6.<init>(r3)     // Catch:{ IOException -> 0x015d }
            r5.<init>(r6)     // Catch:{ IOException -> 0x015d }
            r4.<init>(r5)     // Catch:{ IOException -> 0x015d }
            r5 = 1
            androidx.collection.SimpleArrayMap r6 = new androidx.collection.SimpleArrayMap     // Catch:{ all -> 0x0141 }
            r6.<init>()     // Catch:{ all -> 0x0141 }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x0141 }
            r7.<init>()     // Catch:{ all -> 0x0141 }
        L_0x009a:
            java.lang.String r8 = r4.readLine()     // Catch:{ all -> 0x0141 }
            if (r8 == 0) goto L_0x010e
            java.lang.String r9 = " "
            r10 = 3
            java.lang.String[] r9 = r8.split(r9, r10)     // Catch:{ all -> 0x0141 }
            int r11 = r9.length     // Catch:{ all -> 0x0141 }
            if (r11 == r10) goto L_0x00c1
            java.lang.String r9 = "HermeticFileOverrides"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0141 }
            r10.<init>()     // Catch:{ all -> 0x0141 }
            java.lang.String r11 = "Invalid: "
            r10.append(r11)     // Catch:{ all -> 0x0141 }
            r10.append(r8)     // Catch:{ all -> 0x0141 }
            java.lang.String r8 = r10.toString()     // Catch:{ all -> 0x0141 }
            android.util.Log.e(r9, r8)     // Catch:{ all -> 0x0141 }
            goto L_0x009a
        L_0x00c1:
            r8 = r9[r2]     // Catch:{ all -> 0x0141 }
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x0141 }
            r10.<init>(r8)     // Catch:{ all -> 0x0141 }
            r8 = r9[r5]     // Catch:{ all -> 0x0141 }
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x0141 }
            r11.<init>(r8)     // Catch:{ all -> 0x0141 }
            java.lang.String r8 = android.net.Uri.decode(r11)     // Catch:{ all -> 0x0141 }
            r11 = 2
            r12 = r9[r11]     // Catch:{ all -> 0x0141 }
            java.lang.Object r12 = r7.get(r12)     // Catch:{ all -> 0x0141 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0141 }
            if (r12 != 0) goto L_0x00f6
            r9 = r9[r11]     // Catch:{ all -> 0x0141 }
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x0141 }
            r11.<init>(r9)     // Catch:{ all -> 0x0141 }
            java.lang.String r12 = android.net.Uri.decode(r11)     // Catch:{ all -> 0x0141 }
            int r9 = r12.length()     // Catch:{ all -> 0x0141 }
            r13 = 1024(0x400, float:1.435E-42)
            if (r9 < r13) goto L_0x00f3
            if (r12 != r11) goto L_0x00f6
        L_0x00f3:
            r7.put(r11, r12)     // Catch:{ all -> 0x0141 }
        L_0x00f6:
            boolean r9 = r6.containsKey(r10)     // Catch:{ all -> 0x0141 }
            if (r9 != 0) goto L_0x0104
            androidx.collection.SimpleArrayMap r9 = new androidx.collection.SimpleArrayMap     // Catch:{ all -> 0x0141 }
            r9.<init>()     // Catch:{ all -> 0x0141 }
            r6.put(r10, r9)     // Catch:{ all -> 0x0141 }
        L_0x0104:
            java.lang.Object r9 = r6.get(r10)     // Catch:{ all -> 0x0141 }
            androidx.collection.SimpleArrayMap r9 = (androidx.collection.SimpleArrayMap) r9     // Catch:{ all -> 0x0141 }
            r9.put(r8, r12)     // Catch:{ all -> 0x0141 }
            goto L_0x009a
        L_0x010e:
            java.lang.String r7 = "HermeticFileOverrides"
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0141 }
            java.lang.String r14 = r14.getPackageName()     // Catch:{ all -> 0x0141 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0141 }
            r8.<init>()     // Catch:{ all -> 0x0141 }
            java.lang.String r9 = "Parsed "
            r8.append(r9)     // Catch:{ all -> 0x0141 }
            r8.append(r3)     // Catch:{ all -> 0x0141 }
            java.lang.String r3 = " for Android package "
            r8.append(r3)     // Catch:{ all -> 0x0141 }
            r8.append(r14)     // Catch:{ all -> 0x0141 }
            java.lang.String r14 = r8.toString()     // Catch:{ all -> 0x0141 }
            android.util.Log.w(r7, r14)     // Catch:{ all -> 0x0141 }
            com.google.android.gms.internal.measurement.y5 r14 = new com.google.android.gms.internal.measurement.y5     // Catch:{ all -> 0x0141 }
            r14.<init>(r6)     // Catch:{ all -> 0x0141 }
            r4.close()     // Catch:{ IOException -> 0x015d }
            com.google.android.gms.internal.measurement.a7 r14 = com.google.android.gms.internal.measurement.C4094a7.m15475d(r14)     // Catch:{ all -> 0x0170 }
            goto L_0x0168
        L_0x0141:
            r14 = move-exception
            r4.close()     // Catch:{ all -> 0x0146 }
            goto L_0x015c
        L_0x0146:
            r3 = move-exception
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x015c }
            java.lang.Class<java.lang.Throwable> r8 = java.lang.Throwable.class
            r7[r2] = r8     // Catch:{ Exception -> 0x015c }
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r6, r7)     // Catch:{ Exception -> 0x015c }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x015c }
            r5[r2] = r3     // Catch:{ Exception -> 0x015c }
            r4.invoke(r14, r5)     // Catch:{ Exception -> 0x015c }
        L_0x015c:
            throw r14     // Catch:{ IOException -> 0x015d }
        L_0x015d:
            r14 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0170 }
            r2.<init>(r14)     // Catch:{ all -> 0x0170 }
            throw r2     // Catch:{ all -> 0x0170 }
        L_0x0164:
            com.google.android.gms.internal.measurement.a7 r14 = com.google.android.gms.internal.measurement.C4094a7.m15474c()     // Catch:{ all -> 0x0170 }
        L_0x0168:
            android.os.StrictMode.setThreadPolicy(r1)     // Catch:{ all -> 0x0177 }
            goto L_0x0030
        L_0x016d:
            f13231a = r1     // Catch:{ all -> 0x0177 }
            goto L_0x0175
        L_0x0170:
            r14 = move-exception
            android.os.StrictMode.setThreadPolicy(r1)     // Catch:{ all -> 0x0177 }
            throw r14     // Catch:{ all -> 0x0177 }
        L_0x0175:
            monitor-exit(r0)     // Catch:{ all -> 0x0177 }
            return r1
        L_0x0177:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0177 }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4178f6.m15814a(android.content.Context):com.google.android.gms.internal.measurement.a7");
    }
}
