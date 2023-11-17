package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.measurement.s5 */
public abstract class C4398s5 {

    /* renamed from: a */
    public static final Uri f13655a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    public static final Uri f13656b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c */
    public static final Pattern f13657c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d */
    public static final Pattern f13658d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final AtomicBoolean f13659e = new AtomicBoolean();

    /* renamed from: f */
    static HashMap f13660f;

    /* renamed from: g */
    static final HashMap f13661g = new HashMap(16, 1.0f);

    /* renamed from: h */
    static final HashMap f13662h = new HashMap(16, 1.0f);

    /* renamed from: i */
    static final HashMap f13663i = new HashMap(16, 1.0f);

    /* renamed from: j */
    static final HashMap f13664j = new HashMap(16, 1.0f);

    /* renamed from: k */
    private static Object f13665k;

    /* renamed from: l */
    static boolean f13666l;

    /* renamed from: m */
    static final String[] f13667m = new String[0];

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006f, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0074, code lost:
        r11 = r11.query(f13655a, (java.lang.String[]) null, (java.lang.String) null, new java.lang.String[]{r12}, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0082, code lost:
        if (r11 != null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0084, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0089, code lost:
        if (r11.moveToFirst() != false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008b, code lost:
        m16632c(r0, r12, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0091, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r13 = r11.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0096, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0099, code lost:
        if (r13 == null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009f, code lost:
        if (r13.equals((java.lang.Object) null) == false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a1, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a2, code lost:
        m16632c(r0, r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a5, code lost:
        if (r13 == null) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a7, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a8, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a9, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00aa, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ad, code lost:
        throw r12;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m16630a(android.content.ContentResolver r11, java.lang.String r12, java.lang.String r13) {
        /*
            java.lang.Class<com.google.android.gms.internal.measurement.s5> r13 = com.google.android.gms.internal.measurement.C4398s5.class
            monitor-enter(r13)
            java.util.HashMap r0 = f13660f     // Catch:{ all -> 0x00ae }
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L_0x002e
            java.util.concurrent.atomic.AtomicBoolean r0 = f13659e     // Catch:{ all -> 0x00ae }
            r0.set(r2)     // Catch:{ all -> 0x00ae }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x00ae }
            r4 = 16
            r5 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r4, r5)     // Catch:{ all -> 0x00ae }
            f13660f = r0     // Catch:{ all -> 0x00ae }
            java.lang.Object r0 = new java.lang.Object     // Catch:{ all -> 0x00ae }
            r0.<init>()     // Catch:{ all -> 0x00ae }
            f13665k = r0     // Catch:{ all -> 0x00ae }
            f13666l = r2     // Catch:{ all -> 0x00ae }
            android.net.Uri r0 = f13655a     // Catch:{ all -> 0x00ae }
            com.google.android.gms.internal.measurement.q5 r4 = new com.google.android.gms.internal.measurement.q5     // Catch:{ all -> 0x00ae }
            r4.<init>(r3)     // Catch:{ all -> 0x00ae }
            r11.registerContentObserver(r0, r1, r4)     // Catch:{ all -> 0x00ae }
            goto L_0x0058
        L_0x002e:
            java.util.concurrent.atomic.AtomicBoolean r0 = f13659e     // Catch:{ all -> 0x00ae }
            boolean r0 = r0.getAndSet(r2)     // Catch:{ all -> 0x00ae }
            if (r0 == 0) goto L_0x0058
            java.util.HashMap r0 = f13660f     // Catch:{ all -> 0x00ae }
            r0.clear()     // Catch:{ all -> 0x00ae }
            java.util.HashMap r0 = f13661g     // Catch:{ all -> 0x00ae }
            r0.clear()     // Catch:{ all -> 0x00ae }
            java.util.HashMap r0 = f13662h     // Catch:{ all -> 0x00ae }
            r0.clear()     // Catch:{ all -> 0x00ae }
            java.util.HashMap r0 = f13663i     // Catch:{ all -> 0x00ae }
            r0.clear()     // Catch:{ all -> 0x00ae }
            java.util.HashMap r0 = f13664j     // Catch:{ all -> 0x00ae }
            r0.clear()     // Catch:{ all -> 0x00ae }
            java.lang.Object r0 = new java.lang.Object     // Catch:{ all -> 0x00ae }
            r0.<init>()     // Catch:{ all -> 0x00ae }
            f13665k = r0     // Catch:{ all -> 0x00ae }
            f13666l = r2     // Catch:{ all -> 0x00ae }
        L_0x0058:
            java.lang.Object r0 = f13665k     // Catch:{ all -> 0x00ae }
            java.util.HashMap r4 = f13660f     // Catch:{ all -> 0x00ae }
            boolean r4 = r4.containsKey(r12)     // Catch:{ all -> 0x00ae }
            if (r4 == 0) goto L_0x0070
            java.util.HashMap r11 = f13660f     // Catch:{ all -> 0x00ae }
            java.lang.Object r11 = r11.get(r12)     // Catch:{ all -> 0x00ae }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x00ae }
            if (r11 != 0) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r3 = r11
        L_0x006e:
            monitor-exit(r13)     // Catch:{ all -> 0x00ae }
            return r3
        L_0x0070:
            java.lang.String[] r4 = f13667m     // Catch:{ all -> 0x00ae }
            int r4 = r4.length     // Catch:{ all -> 0x00ae }
            monitor-exit(r13)     // Catch:{ all -> 0x00ae }
            android.net.Uri r6 = f13655a
            r7 = 0
            r8 = 0
            java.lang.String[] r9 = new java.lang.String[r1]
            r9[r2] = r12
            r10 = 0
            r5 = r11
            android.database.Cursor r11 = r5.query(r6, r7, r8, r9, r10)
            if (r11 != 0) goto L_0x0085
            return r3
        L_0x0085:
            boolean r13 = r11.moveToFirst()     // Catch:{ all -> 0x00a9 }
            if (r13 != 0) goto L_0x0092
            m16632c(r0, r12, r3)     // Catch:{ all -> 0x00a9 }
            r11.close()
            return r3
        L_0x0092:
            java.lang.String r13 = r11.getString(r1)     // Catch:{ all -> 0x00a9 }
            r11.close()
            if (r13 == 0) goto L_0x00a2
            boolean r11 = r13.equals(r3)
            if (r11 == 0) goto L_0x00a2
            r13 = r3
        L_0x00a2:
            m16632c(r0, r12, r13)
            if (r13 == 0) goto L_0x00a8
            return r13
        L_0x00a8:
            return r3
        L_0x00a9:
            r12 = move-exception
            r11.close()
            throw r12
        L_0x00ae:
            r11 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x00ae }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4398s5.m16630a(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    private static void m16632c(Object obj, String str, String str2) {
        synchronized (C4398s5.class) {
            if (obj == f13665k) {
                f13660f.put(str, str2);
            }
        }
    }
}
