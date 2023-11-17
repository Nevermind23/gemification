package com.google.android.gms.common;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import p182n6.C7264i;
import p260t6.C8408j;
import p260t6.C8413o;
import p260t6.C8416r;
import p286v6.C8708e;

/* renamed from: com.google.android.gms.common.d */
public abstract class C3943d {

    /* renamed from: a */
    public static final int f12557a = 12451000;

    /* renamed from: b */
    static final AtomicBoolean f12558b = new AtomicBoolean();

    /* renamed from: c */
    private static boolean f12559c = false;

    /* renamed from: d */
    static boolean f12560d = false;

    /* renamed from: e */
    private static final AtomicBoolean f12561e = new AtomicBoolean();

    /* renamed from: a */
    public static void m14958a(Context context) {
        if (!f12558b.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(10436);
                }
            } catch (SecurityException e) {
                Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e);
            }
        }
    }

    /* renamed from: b */
    public static void m14959b(Context context, int i) {
        int j = C3941b.m14941h().mo11873j(context, i);
        if (j != 0) {
            Intent d = C3941b.m14941h().mo11869d(context, j, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + j);
            if (d == null) {
                throw new GooglePlayServicesNotAvailableException(j);
            }
            throw new GooglePlayServicesRepairableException(j, "Google Play Services not available", d);
        }
    }

    /* renamed from: c */
    public static int m14960c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    /* renamed from: d */
    public static String m14961d(int i) {
        return ConnectionResult.m14460q0(i);
    }

    /* renamed from: e */
    public static Context m14962e(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static Resources m14963f(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static boolean m14964g(Context context) {
        if (!f12560d) {
            try {
                PackageInfo e = C8708e.m32461a(context).mo24091e("com.google.android.gms", 64);
                C3948e.m14975a(context);
                if (e == null || C3948e.m14977e(e, false) || !C3948e.m14977e(e, true)) {
                    f12559c = false;
                } else {
                    f12559c = true;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e2);
            } finally {
                f12560d = true;
            }
        }
        if (f12559c || !C8408j.m31549b()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0099  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m14965h(android.content.Context r10, int r11) {
        /*
            java.lang.String r0 = "GooglePlayServicesUtil"
            android.content.res.Resources r1 = r10.getResources()     // Catch:{ all -> 0x000c }
            int r2 = p130j6.C6733i.f20302a     // Catch:{ all -> 0x000c }
            r1.getString(r2)     // Catch:{ all -> 0x000c }
            goto L_0x0011
        L_0x000c:
            java.lang.String r1 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
            android.util.Log.e(r0, r1)
        L_0x0011:
            java.lang.String r1 = r10.getPackageName()
            java.lang.String r2 = "com.google.android.gms"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x003d
            java.util.concurrent.atomic.AtomicBoolean r1 = f12561e
            boolean r1 = r1.get()
            if (r1 == 0) goto L_0x0026
            goto L_0x003d
        L_0x0026:
            int r1 = p182n6.C7267j0.m27915a(r10)
            if (r1 == 0) goto L_0x0037
            int r3 = f12557a
            if (r1 != r3) goto L_0x0031
            goto L_0x003d
        L_0x0031:
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r10 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            r10.<init>(r1)
            throw r10
        L_0x0037:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r10 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r10.<init>()
            throw r10
        L_0x003d:
            boolean r1 = p260t6.C8408j.m31551d(r10)
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x004d
            boolean r1 = p260t6.C8408j.m31553f(r10)
            if (r1 != 0) goto L_0x004d
            r1 = r3
            goto L_0x004e
        L_0x004d:
            r1 = r4
        L_0x004e:
            if (r11 < 0) goto L_0x0052
            r5 = r3
            goto L_0x0053
        L_0x0052:
            r5 = r4
        L_0x0053:
            p182n6.C7264i.m27892a(r5)
            java.lang.String r5 = r10.getPackageName()
            android.content.pm.PackageManager r6 = r10.getPackageManager()
            r7 = 9
            if (r1 == 0) goto L_0x007b
            java.lang.String r8 = "com.android.vending"
            r9 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r8 = r6.getPackageInfo(r8, r9)     // Catch:{ NameNotFoundException -> 0x006b }
            goto L_0x007c
        L_0x006b:
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires the Google Play Store, but it is missing."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
        L_0x0078:
            r3 = r7
            goto L_0x0132
        L_0x007b:
            r8 = 0
        L_0x007c:
            r9 = 64
            android.content.pm.PackageInfo r9 = r6.getPackageInfo(r2, r9)     // Catch:{ NameNotFoundException -> 0x0125 }
            com.google.android.gms.common.C3948e.m14975a(r10)
            boolean r10 = com.google.android.gms.common.C3948e.m14977e(r9, r3)
            if (r10 != 0) goto L_0x0099
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play services, but their signature is invalid."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
            goto L_0x0078
        L_0x0099:
            if (r1 == 0) goto L_0x00b2
            p182n6.C7264i.m27902k(r8)
            boolean r10 = com.google.android.gms.common.C3948e.m14977e(r8, r3)
            if (r10 != 0) goto L_0x00b2
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play Store, but its signature is invalid."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
            goto L_0x0078
        L_0x00b2:
            if (r1 == 0) goto L_0x00d2
            if (r8 == 0) goto L_0x00d2
            android.content.pm.Signature[] r10 = r8.signatures
            r10 = r10[r4]
            android.content.pm.Signature[] r1 = r9.signatures
            r1 = r1[r4]
            boolean r10 = r10.equals(r1)
            if (r10 != 0) goto L_0x00d2
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play Store, but its signature doesn't match that of Google Play services."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
            goto L_0x0078
        L_0x00d2:
            int r10 = r9.versionCode
            int r10 = p260t6.C8418t.m31584a(r10)
            int r1 = p260t6.C8418t.m31584a(r11)
            if (r10 >= r1) goto L_0x0106
            int r10 = r9.versionCode
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Google Play services out of date for "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = ".  Requires "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = " but found "
            r1.append(r11)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            android.util.Log.w(r0, r10)
            r3 = 2
            goto L_0x0132
        L_0x0106:
            android.content.pm.ApplicationInfo r10 = r9.applicationInfo
            if (r10 != 0) goto L_0x011e
            android.content.pm.ApplicationInfo r10 = r6.getApplicationInfo(r2, r4)     // Catch:{ NameNotFoundException -> 0x010f }
            goto L_0x011e
        L_0x010f:
            r10 = move-exception
            java.lang.String r11 = java.lang.String.valueOf(r5)
            java.lang.String r1 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r11 = r11.concat(r1)
            android.util.Log.wtf(r0, r11, r10)
            goto L_0x0132
        L_0x011e:
            boolean r10 = r10.enabled
            if (r10 != 0) goto L_0x0124
            r3 = 3
            goto L_0x0132
        L_0x0124:
            return r4
        L_0x0125:
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play services, but they are missing."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
        L_0x0132:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.C3943d.m14965h(android.content.Context, int):int");
    }

    /* renamed from: i */
    public static boolean m14966i(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return m14970m(context, "com.google.android.gms");
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m14967j(Context context) {
        if (!C8413o.m31565c()) {
            return false;
        }
        Object systemService = context.getSystemService("user");
        C7264i.m27902k(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        if (applicationRestrictions == null || !"true".equals(applicationRestrictions.getString("restricted_profile"))) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static boolean m14968k(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    /* renamed from: l */
    public static boolean m14969l(Context context, int i, String str) {
        return C8416r.m31578b(context, i, str);
    }

    /* renamed from: m */
    static boolean m14970m(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (C8413o.m31568f()) {
            try {
                for (PackageInstaller.SessionInfo appPackageName : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(appPackageName.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            if (equals) {
                return applicationInfo.enabled;
            }
            if (!applicationInfo.enabled || m14967j(context)) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }
}
