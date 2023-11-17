package com.salesforce.marketingcloud.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.salesforce.marketingcloud.C11461g;
import java.io.File;
import java.util.Locale;
import java.util.UUID;

/* renamed from: com.salesforce.marketingcloud.util.e */
public final class C11810e {

    /* renamed from: a */
    private static final String f34271a = C11461g.m41875a("DeviceData");

    /* renamed from: b */
    private static final String f34272b = "SFMCDeviceUUID";

    /* renamed from: c */
    static volatile String f34273c;

    private C11810e() {
    }

    /* renamed from: a */
    private static String m43210a() {
        return C11824l.m43280a(String.format(Locale.ENGLISH, "%s%d", new Object[]{UUID.randomUUID().toString(), Long.valueOf(System.currentTimeMillis())}));
    }

    /* renamed from: b */
    private static String m43215b(Context context, String str) {
        File file = new File(context.getNoBackupFilesDir(), f34272b);
        String a = file.exists() ? m43213a(file) : null;
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        String str2 = f34271a;
        C11461g.m41880a(str2, "Checking SharedPreferences for deviceId", new Object[0]);
        String a2 = m43211a(context);
        if (TextUtils.isEmpty(a2)) {
            C11461g.m41880a(str2, "Checking pre-lollipop location for deviceId", new Object[0]);
            File file2 = new File(context.getFilesDir(), f34272b);
            if (file2.exists()) {
                a2 = m43213a(file2);
                C11818g.m43264b(file2);
            }
        }
        if (TextUtils.isEmpty(a2)) {
            Object[] objArr = new Object[0];
            if (str != null) {
                C11461g.m41880a(str2, "Using registrationId as deviceId", objArr);
            } else {
                C11461g.m41880a(str2, "Generating/Storing new deviceId", objArr);
                str = m43210a();
            }
        } else {
            str = a2;
        }
        m43214a(file, str);
        return str;
    }

    /* renamed from: a */
    private static String m43211a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("_et_default_shared_preferences", 0);
        String string = sharedPreferences.getString("id", (String) null);
        if (string != null) {
            sharedPreferences.edit().remove("id").apply();
        }
        return string;
    }

    /* renamed from: a */
    public static String m43212a(Context context, String str) {
        if (f34273c == null) {
            synchronized (C11810e.class) {
                f34273c = m43215b(context, str);
            }
        }
        return f34273c;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m43213a(java.io.File r6) {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x001b, all -> 0x0019 }
            r1.<init>(r6)     // Catch:{ Exception -> 0x001b, all -> 0x0019 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x001c, all -> 0x0017 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x001c, all -> 0x0017 }
            java.nio.charset.Charset r4 = com.salesforce.marketingcloud.util.C11824l.f34334b     // Catch:{ Exception -> 0x001c, all -> 0x0017 }
            r3.<init>(r1, r4)     // Catch:{ Exception -> 0x001c, all -> 0x0017 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x001c, all -> 0x0017 }
            java.lang.String r0 = r2.readLine()     // Catch:{ Exception -> 0x001c, all -> 0x0017 }
            goto L_0x002d
        L_0x0017:
            r6 = move-exception
            goto L_0x0034
        L_0x0019:
            r6 = move-exception
            goto L_0x0033
        L_0x001b:
            r1 = r0
        L_0x001c:
            java.lang.String r2 = f34271a     // Catch:{ all -> 0x0031 }
            java.lang.String r3 = "Failed to read device id from file: "
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0031 }
            java.lang.String r6 = r6.getAbsolutePath()     // Catch:{ all -> 0x0031 }
            r5 = 0
            r4[r5] = r6     // Catch:{ all -> 0x0031 }
            com.salesforce.marketingcloud.C11461g.m41884b((java.lang.String) r2, (java.lang.String) r3, (java.lang.Object[]) r4)     // Catch:{ all -> 0x0031 }
        L_0x002d:
            com.salesforce.marketingcloud.util.C11818g.m43258a((java.io.Closeable) r1)
            return r0
        L_0x0031:
            r6 = move-exception
            r0 = r1
        L_0x0033:
            r1 = r0
        L_0x0034:
            com.salesforce.marketingcloud.util.C11818g.m43258a((java.io.Closeable) r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.util.C11810e.m43213a(java.io.File):java.lang.String");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        com.salesforce.marketingcloud.C11461g.m41884b(f34271a, "Failed to write device id to file: ", r4.getAbsolutePath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        r4 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0016 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m43214a(java.io.File r4, java.lang.String r5) {
        /*
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0016 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x0016 }
            java.nio.charset.Charset r0 = com.salesforce.marketingcloud.util.C11824l.f34334b     // Catch:{ Exception -> 0x0012, all -> 0x0010 }
            byte[] r5 = r5.getBytes(r0)     // Catch:{ Exception -> 0x0012, all -> 0x0010 }
            r1.write(r5)     // Catch:{ Exception -> 0x0012, all -> 0x0010 }
            goto L_0x0028
        L_0x0010:
            r4 = move-exception
            goto L_0x002d
        L_0x0012:
            r0 = r1
            goto L_0x0016
        L_0x0014:
            r4 = move-exception
            goto L_0x002c
        L_0x0016:
            java.lang.String r5 = f34271a     // Catch:{ all -> 0x0014 }
            java.lang.String r1 = "Failed to write device id to file: "
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0014 }
            java.lang.String r4 = r4.getAbsolutePath()     // Catch:{ all -> 0x0014 }
            r3 = 0
            r2[r3] = r4     // Catch:{ all -> 0x0014 }
            com.salesforce.marketingcloud.C11461g.m41884b((java.lang.String) r5, (java.lang.String) r1, (java.lang.Object[]) r2)     // Catch:{ all -> 0x0014 }
            r1 = r0
        L_0x0028:
            com.salesforce.marketingcloud.util.C11818g.m43258a((java.io.Closeable) r1)
            return
        L_0x002c:
            r1 = r0
        L_0x002d:
            com.salesforce.marketingcloud.util.C11818g.m43258a((java.io.Closeable) r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.util.C11810e.m43214a(java.io.File, java.lang.String):void");
    }
}
