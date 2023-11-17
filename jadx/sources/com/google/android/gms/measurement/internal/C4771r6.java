package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* renamed from: com.google.android.gms.measurement.internal.r6 */
final class C4771r6 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ boolean f14832d;

    /* renamed from: e */
    final /* synthetic */ Uri f14833e;

    /* renamed from: f */
    final /* synthetic */ String f14834f;

    /* renamed from: g */
    final /* synthetic */ String f14835g;

    /* renamed from: h */
    final /* synthetic */ C4782s6 f14836h;

    C4771r6(C4782s6 s6Var, boolean z, Uri uri, String str, String str2) {
        this.f14836h = s6Var;
        this.f14832d = z;
        this.f14833e = uri;
        this.f14834f = str;
        this.f14835g = str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a3 A[SYNTHETIC, Splitter:B:32:0x00a3] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fb A[Catch:{ RuntimeException -> 0x0190 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fd A[Catch:{ RuntimeException -> 0x0190 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r16 = this;
            r1 = r16
            com.google.android.gms.measurement.internal.s6 r2 = r1.f14836h
            boolean r0 = r1.f14832d
            android.net.Uri r3 = r1.f14833e
            java.lang.String r4 = r1.f14834f
            java.lang.String r5 = r1.f14835g
            com.google.android.gms.measurement.internal.t6 r6 = r2.f14854d
            r6.mo14554h()
            com.google.android.gms.measurement.internal.t6 r6 = r2.f14854d     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.t4 r6 = r6.f14613a     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.s9 r6 = r6.mo14856N()     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.internal.measurement.C4458ve.m17074c()     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.t6 r7 = r2.f14854d     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.t4 r7 = r7.f14613a     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.g r7 = r7.mo14876z()     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.e3 r8 = com.google.android.gms.measurement.internal.C4636f3.f14407x0     // Catch:{ RuntimeException -> 0x0190 }
            r9 = 0
            boolean r7 = r7.mo14398B(r9, r8)     // Catch:{ RuntimeException -> 0x0190 }
            boolean r10 = android.text.TextUtils.isEmpty(r5)     // Catch:{ RuntimeException -> 0x0190 }
            java.lang.String r11 = "Activity created with data 'referrer' without required params"
            java.lang.String r12 = "utm_medium"
            java.lang.String r13 = "_cis"
            java.lang.String r14 = "utm_source"
            java.lang.String r15 = "utm_campaign"
            java.lang.String r9 = "gclid"
            if (r10 == 0) goto L_0x003f
        L_0x003d:
            r6 = 0
            goto L_0x009f
        L_0x003f:
            boolean r10 = r5.contains(r9)     // Catch:{ RuntimeException -> 0x0190 }
            if (r10 != 0) goto L_0x008a
            boolean r10 = r5.contains(r15)     // Catch:{ RuntimeException -> 0x0190 }
            if (r10 != 0) goto L_0x008a
            boolean r10 = r5.contains(r14)     // Catch:{ RuntimeException -> 0x0190 }
            if (r10 != 0) goto L_0x008a
            boolean r10 = r5.contains(r12)     // Catch:{ RuntimeException -> 0x0190 }
            if (r10 != 0) goto L_0x008a
            java.lang.String r10 = "utm_id"
            boolean r10 = r5.contains(r10)     // Catch:{ RuntimeException -> 0x0190 }
            if (r10 != 0) goto L_0x008a
            java.lang.String r10 = "dclid"
            boolean r10 = r5.contains(r10)     // Catch:{ RuntimeException -> 0x0190 }
            if (r10 != 0) goto L_0x008a
            java.lang.String r10 = "srsltid"
            boolean r10 = r5.contains(r10)     // Catch:{ RuntimeException -> 0x0190 }
            if (r10 != 0) goto L_0x008a
            if (r7 == 0) goto L_0x007c
            java.lang.String r7 = "sfmc_id"
            boolean r7 = r5.contains(r7)     // Catch:{ RuntimeException -> 0x0190 }
            if (r7 != 0) goto L_0x007a
            goto L_0x007c
        L_0x007a:
            r7 = 1
            goto L_0x008a
        L_0x007c:
            com.google.android.gms.measurement.internal.t4 r6 = r6.f14613a     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.p3 r6 = r6.mo14551d()     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.n3 r6 = r6.mo14674q()     // Catch:{ RuntimeException -> 0x0190 }
            r6.mo14615a(r11)     // Catch:{ RuntimeException -> 0x0190 }
            goto L_0x003d
        L_0x008a:
            java.lang.String r10 = "https://google.com/search?"
            java.lang.String r10 = r10.concat(r5)     // Catch:{ RuntimeException -> 0x0190 }
            android.net.Uri r10 = android.net.Uri.parse(r10)     // Catch:{ RuntimeException -> 0x0190 }
            android.os.Bundle r6 = r6.mo14834v0(r10, r7)     // Catch:{ RuntimeException -> 0x0190 }
            if (r6 == 0) goto L_0x009f
            java.lang.String r7 = "referrer"
            r6.putString(r13, r7)     // Catch:{ RuntimeException -> 0x0190 }
        L_0x009f:
            java.lang.String r7 = "_cmp"
            if (r0 == 0) goto L_0x00f5
            com.google.android.gms.measurement.internal.t6 r0 = r2.f14854d     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.t4 r0 = r0.f14613a     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.s9 r0 = r0.mo14856N()     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.internal.measurement.C4458ve.m17074c()     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.t6 r10 = r2.f14854d     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.t4 r10 = r10.f14613a     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.g r10 = r10.mo14876z()     // Catch:{ RuntimeException -> 0x0190 }
            r1 = 0
            boolean r8 = r10.mo14398B(r1, r8)     // Catch:{ RuntimeException -> 0x0190 }
            android.os.Bundle r0 = r0.mo14834v0(r3, r8)     // Catch:{ RuntimeException -> 0x0190 }
            if (r0 == 0) goto L_0x00f5
            java.lang.String r1 = "intent"
            r0.putString(r13, r1)     // Catch:{ RuntimeException -> 0x0190 }
            boolean r1 = r0.containsKey(r9)     // Catch:{ RuntimeException -> 0x0190 }
            if (r1 != 0) goto L_0x00e9
            if (r6 == 0) goto L_0x00e9
            boolean r1 = r6.containsKey(r9)     // Catch:{ RuntimeException -> 0x0190 }
            if (r1 == 0) goto L_0x00e9
            java.lang.String r1 = "_cer"
            java.lang.String r3 = "gclid=%s"
            r8 = 1
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch:{ RuntimeException -> 0x0190 }
            java.lang.String r8 = r6.getString(r9)     // Catch:{ RuntimeException -> 0x0190 }
            r13 = 0
            r10[r13] = r8     // Catch:{ RuntimeException -> 0x0190 }
            java.lang.String r3 = java.lang.String.format(r3, r10)     // Catch:{ RuntimeException -> 0x0190 }
            r0.putString(r1, r3)     // Catch:{ RuntimeException -> 0x0190 }
        L_0x00e9:
            com.google.android.gms.measurement.internal.t6 r1 = r2.f14854d     // Catch:{ RuntimeException -> 0x0190 }
            r1.mo14910u(r4, r7, r0)     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.t6 r1 = r2.f14854d     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.y9 r1 = r1.f14920n     // Catch:{ RuntimeException -> 0x0190 }
            r1.mo14969a(r4, r0)     // Catch:{ RuntimeException -> 0x0190 }
        L_0x00f5:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ RuntimeException -> 0x0190 }
            if (r0 == 0) goto L_0x00fd
            goto L_0x017f
        L_0x00fd:
            com.google.android.gms.measurement.internal.t6 r0 = r2.f14854d     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.t4 r0 = r0.f14613a     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14674q()     // Catch:{ RuntimeException -> 0x0190 }
            java.lang.String r1 = "Activity created with referrer"
            r0.mo14616b(r1, r5)     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.t6 r0 = r2.f14854d     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.t4 r0 = r0.f14613a     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.g r0 = r0.mo14876z()     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.e3 r1 = com.google.android.gms.measurement.internal.C4636f3.f14365c0     // Catch:{ RuntimeException -> 0x0190 }
            r3 = 0
            boolean r0 = r0.mo14398B(r3, r1)     // Catch:{ RuntimeException -> 0x0190 }
            java.lang.String r1 = "_ldl"
            java.lang.String r3 = "auto"
            if (r0 == 0) goto L_0x014b
            if (r6 == 0) goto L_0x0132
            com.google.android.gms.measurement.internal.t6 r0 = r2.f14854d     // Catch:{ RuntimeException -> 0x0190 }
            r0.mo14910u(r4, r7, r6)     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.t6 r0 = r2.f14854d     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.y9 r0 = r0.f14920n     // Catch:{ RuntimeException -> 0x0190 }
            r0.mo14969a(r4, r6)     // Catch:{ RuntimeException -> 0x0190 }
            goto L_0x0143
        L_0x0132:
            com.google.android.gms.measurement.internal.t6 r0 = r2.f14854d     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.t4 r0 = r0.f14613a     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14674q()     // Catch:{ RuntimeException -> 0x0190 }
            java.lang.String r4 = "Referrer does not contain valid parameters"
            r0.mo14616b(r4, r5)     // Catch:{ RuntimeException -> 0x0190 }
        L_0x0143:
            com.google.android.gms.measurement.internal.t6 r0 = r2.f14854d     // Catch:{ RuntimeException -> 0x0190 }
            r4 = 1
            r5 = 0
            r0.mo14888K(r3, r1, r5, r4)     // Catch:{ RuntimeException -> 0x0190 }
            return
        L_0x014b:
            boolean r0 = r5.contains(r9)     // Catch:{ RuntimeException -> 0x0190 }
            if (r0 == 0) goto L_0x0180
            boolean r0 = r5.contains(r15)     // Catch:{ RuntimeException -> 0x0190 }
            if (r0 != 0) goto L_0x0173
            boolean r0 = r5.contains(r14)     // Catch:{ RuntimeException -> 0x0190 }
            if (r0 != 0) goto L_0x0173
            boolean r0 = r5.contains(r12)     // Catch:{ RuntimeException -> 0x0190 }
            if (r0 != 0) goto L_0x0173
            java.lang.String r0 = "utm_term"
            boolean r0 = r5.contains(r0)     // Catch:{ RuntimeException -> 0x0190 }
            if (r0 != 0) goto L_0x0173
            java.lang.String r0 = "utm_content"
            boolean r0 = r5.contains(r0)     // Catch:{ RuntimeException -> 0x0190 }
            if (r0 == 0) goto L_0x0180
        L_0x0173:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ RuntimeException -> 0x0190 }
            if (r0 != 0) goto L_0x017f
            com.google.android.gms.measurement.internal.t6 r0 = r2.f14854d     // Catch:{ RuntimeException -> 0x0190 }
            r4 = 1
            r0.mo14888K(r3, r1, r5, r4)     // Catch:{ RuntimeException -> 0x0190 }
        L_0x017f:
            return
        L_0x0180:
            com.google.android.gms.measurement.internal.t6 r0 = r2.f14854d     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.t4 r0 = r0.f14613a     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()     // Catch:{ RuntimeException -> 0x0190 }
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14674q()     // Catch:{ RuntimeException -> 0x0190 }
            r0.mo14615a(r11)     // Catch:{ RuntimeException -> 0x0190 }
            return
        L_0x0190:
            r0 = move-exception
            com.google.android.gms.measurement.internal.t6 r1 = r2.f14854d
            com.google.android.gms.measurement.internal.t4 r1 = r1.f14613a
            com.google.android.gms.measurement.internal.p3 r1 = r1.mo14551d()
            com.google.android.gms.measurement.internal.n3 r1 = r1.mo14675r()
            java.lang.String r2 = "Throwable caught in handleReferrerForOnActivityCreated"
            r1.mo14616b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4771r6.run():void");
    }
}
