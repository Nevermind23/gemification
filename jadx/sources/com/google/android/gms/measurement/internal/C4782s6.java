package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.s6 */
final class C4782s6 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d */
    final /* synthetic */ C4793t6 f14854d;

    C4782s6(C4793t6 t6Var) {
        this.f14854d = t6Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0065 A[Catch:{ RuntimeException -> 0x00c4, all -> 0x00c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a0 A[Catch:{ RuntimeException -> 0x00c4, all -> 0x00c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a2 A[Catch:{ RuntimeException -> 0x00c4, all -> 0x00c2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityCreated(android.app.Activity r9, android.os.Bundle r10) {
        /*
            r8 = this;
            com.google.android.gms.measurement.internal.t6 r0 = r8.f14854d     // Catch:{ RuntimeException -> 0x00c4 }
            com.google.android.gms.measurement.internal.t4 r0 = r0.f14613a     // Catch:{ RuntimeException -> 0x00c4 }
            com.google.android.gms.measurement.internal.p3 r0 = r0.mo14551d()     // Catch:{ RuntimeException -> 0x00c4 }
            com.google.android.gms.measurement.internal.n3 r0 = r0.mo14679v()     // Catch:{ RuntimeException -> 0x00c4 }
            java.lang.String r1 = "onActivityCreated"
            r0.mo14615a(r1)     // Catch:{ RuntimeException -> 0x00c4 }
            android.content.Intent r0 = r9.getIntent()     // Catch:{ RuntimeException -> 0x00c4 }
            if (r0 != 0) goto L_0x0023
            com.google.android.gms.measurement.internal.t6 r0 = r8.f14854d
            com.google.android.gms.measurement.internal.t4 r0 = r0.f14613a
        L_0x001b:
            com.google.android.gms.measurement.internal.f7 r0 = r0.mo14853K()
            r0.mo14371y(r9, r10)
            return
        L_0x0023:
            com.google.android.gms.internal.measurement.C4439uc.m17015c()     // Catch:{ RuntimeException -> 0x00c4 }
            com.google.android.gms.measurement.internal.t6 r1 = r8.f14854d     // Catch:{ RuntimeException -> 0x00c4 }
            com.google.android.gms.measurement.internal.t4 r1 = r1.f14613a     // Catch:{ RuntimeException -> 0x00c4 }
            com.google.android.gms.measurement.internal.g r1 = r1.mo14876z()     // Catch:{ RuntimeException -> 0x00c4 }
            com.google.android.gms.measurement.internal.e3 r2 = com.google.android.gms.measurement.internal.C4636f3.f14339H0     // Catch:{ RuntimeException -> 0x00c4 }
            r3 = 0
            boolean r1 = r1.mo14398B(r3, r2)     // Catch:{ RuntimeException -> 0x00c4 }
            if (r1 != 0) goto L_0x003d
            android.net.Uri r3 = r0.getData()     // Catch:{ RuntimeException -> 0x00c4 }
        L_0x003b:
            r4 = r3
            goto L_0x0063
        L_0x003d:
            android.net.Uri r1 = r0.getData()     // Catch:{ RuntimeException -> 0x00c4 }
            if (r1 == 0) goto L_0x004c
            boolean r2 = r1.isHierarchical()     // Catch:{ RuntimeException -> 0x00c4 }
            if (r2 != 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            r4 = r1
            goto L_0x0063
        L_0x004c:
            android.os.Bundle r1 = r0.getExtras()     // Catch:{ RuntimeException -> 0x00c4 }
            if (r1 == 0) goto L_0x003b
            java.lang.String r2 = "com.android.vending.referral_url"
            java.lang.String r1 = r1.getString(r2)     // Catch:{ RuntimeException -> 0x00c4 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ RuntimeException -> 0x00c4 }
            if (r2 != 0) goto L_0x003b
            android.net.Uri r3 = android.net.Uri.parse(r1)     // Catch:{ RuntimeException -> 0x00c4 }
            goto L_0x003b
        L_0x0063:
            if (r4 == 0) goto L_0x00bc
            boolean r1 = r4.isHierarchical()     // Catch:{ RuntimeException -> 0x00c4 }
            if (r1 != 0) goto L_0x006c
            goto L_0x00bc
        L_0x006c:
            com.google.android.gms.measurement.internal.t6 r1 = r8.f14854d     // Catch:{ RuntimeException -> 0x00c4 }
            com.google.android.gms.measurement.internal.t4 r1 = r1.f14613a     // Catch:{ RuntimeException -> 0x00c4 }
            r1.mo14856N()     // Catch:{ RuntimeException -> 0x00c4 }
            java.lang.String r1 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ RuntimeException -> 0x00c4 }
            java.lang.String r1 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com"
            boolean r1 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x00c4 }
            if (r1 != 0) goto L_0x0095
            java.lang.String r1 = "https://www.google.com"
            boolean r1 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x00c4 }
            if (r1 != 0) goto L_0x0095
            java.lang.String r1 = "android-app://com.google.appcrawler"
            boolean r0 = r1.equals(r0)     // Catch:{ RuntimeException -> 0x00c4 }
            if (r0 == 0) goto L_0x0092
            goto L_0x0095
        L_0x0092:
            java.lang.String r0 = "auto"
            goto L_0x0097
        L_0x0095:
            java.lang.String r0 = "gs"
        L_0x0097:
            r5 = r0
            java.lang.String r0 = "referrer"
            java.lang.String r6 = r4.getQueryParameter(r0)     // Catch:{ RuntimeException -> 0x00c4 }
            if (r10 != 0) goto L_0x00a2
            r0 = 1
            goto L_0x00a3
        L_0x00a2:
            r0 = 0
        L_0x00a3:
            r3 = r0
            com.google.android.gms.measurement.internal.t6 r0 = r8.f14854d     // Catch:{ RuntimeException -> 0x00c4 }
            com.google.android.gms.measurement.internal.t4 r0 = r0.f14613a     // Catch:{ RuntimeException -> 0x00c4 }
            com.google.android.gms.measurement.internal.r4 r0 = r0.mo14552f()     // Catch:{ RuntimeException -> 0x00c4 }
            com.google.android.gms.measurement.internal.r6 r7 = new com.google.android.gms.measurement.internal.r6     // Catch:{ RuntimeException -> 0x00c4 }
            r1 = r7
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ RuntimeException -> 0x00c4 }
            r0.mo14776z(r7)     // Catch:{ RuntimeException -> 0x00c4 }
            com.google.android.gms.measurement.internal.t6 r0 = r8.f14854d
            com.google.android.gms.measurement.internal.t4 r0 = r0.f14613a
            goto L_0x001b
        L_0x00bc:
            com.google.android.gms.measurement.internal.t6 r0 = r8.f14854d
            com.google.android.gms.measurement.internal.t4 r0 = r0.f14613a
            goto L_0x001b
        L_0x00c2:
            r0 = move-exception
            goto L_0x00dc
        L_0x00c4:
            r0 = move-exception
            com.google.android.gms.measurement.internal.t6 r1 = r8.f14854d     // Catch:{ all -> 0x00c2 }
            com.google.android.gms.measurement.internal.t4 r1 = r1.f14613a     // Catch:{ all -> 0x00c2 }
            com.google.android.gms.measurement.internal.p3 r1 = r1.mo14551d()     // Catch:{ all -> 0x00c2 }
            com.google.android.gms.measurement.internal.n3 r1 = r1.mo14675r()     // Catch:{ all -> 0x00c2 }
            java.lang.String r2 = "Throwable caught in onActivityCreated"
            r1.mo14616b(r2, r0)     // Catch:{ all -> 0x00c2 }
            com.google.android.gms.measurement.internal.t6 r0 = r8.f14854d
            com.google.android.gms.measurement.internal.t4 r0 = r0.f14613a
            goto L_0x001b
        L_0x00dc:
            com.google.android.gms.measurement.internal.t6 r1 = r8.f14854d
            com.google.android.gms.measurement.internal.t4 r1 = r1.f14613a
            com.google.android.gms.measurement.internal.f7 r1 = r1.mo14853K()
            r1.mo14371y(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4782s6.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f14854d.f14613a.mo14853K().mo14372z(activity);
    }

    public final void onActivityPaused(Activity activity) {
        this.f14854d.f14613a.mo14853K().mo14362A(activity);
        C4817v8 M = this.f14854d.f14613a.mo14855M();
        M.f14613a.mo14552f().mo14776z(new C4740o8(M, M.f14613a.mo14548a().mo23596c()));
    }

    public final void onActivityResumed(Activity activity) {
        C4817v8 M = this.f14854d.f14613a.mo14855M();
        M.f14613a.mo14552f().mo14776z(new C4729n8(M, M.f14613a.mo14548a().mo23596c()));
        this.f14854d.f14613a.mo14853K().mo14363B(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f14854d.f14613a.mo14853K().mo14364C(activity, bundle);
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
