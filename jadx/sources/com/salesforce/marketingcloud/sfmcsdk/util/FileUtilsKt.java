package com.salesforce.marketingcloud.sfmcsdk.util;

import android.content.Context;
import com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger;
import java.io.File;
import java.nio.charset.Charset;
import kotlin.jvm.internal.C41536l;

public final class FileUtilsKt {
    public static final String SDK_PACKAGE_PREFIX = "com.salesforce.marketingcloud";

    public static final String getFilenameForModuleInstallation(String str, String str2, String str3) {
        C41536l.m120489i(str, "filename");
        C41536l.m120489i(str2, "moduleApplicationId");
        C41536l.m120489i(str3, "registrationId");
        return getFilenamePrefixForModuleInstallation(str2, str3) + '_' + str;
    }

    public static final String getFilenamePrefixForModule(String str) {
        C41536l.m120489i(str, "moduleApplicationId");
        return C41536l.m120497q("com.salesforce.marketingcloud_", str);
    }

    public static final String getFilenamePrefixForModuleInstallation(String str, String str2) {
        C41536l.m120489i(str, "moduleApplicationId");
        C41536l.m120489i(str2, "registrationId");
        return getFilenamePrefixForModule(str) + '_' + str2;
    }

    public static final String getFilenamePrefixForSFMCSdk(String str) {
        C41536l.m120489i(str, "filename");
        return C41536l.m120497q("com.salesforce.marketingcloud_sfmcsdk_", str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        se1.C42550b.m123187a(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String readAll(java.io.InputStream r4) {
        /*
            r0 = 0
            if (r4 == 0) goto L_0x0039
            java.io.BufferedReader r1 = new java.io.BufferedReader
            java.nio.charset.Charset r2 = com.salesforce.marketingcloud.sfmcsdk.components.http.RequestKt.getUTF_8()
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            r3.<init>(r4, r2)
            r1.<init>(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0032 }
            r4.<init>()     // Catch:{ all -> 0x0032 }
            java.lang.String r2 = r1.readLine()     // Catch:{ all -> 0x0032 }
        L_0x001a:
            if (r2 == 0) goto L_0x0029
            r4.append(r2)     // Catch:{ all -> 0x0032 }
            r2 = 10
            r4.append(r2)     // Catch:{ all -> 0x0032 }
            java.lang.String r2 = r1.readLine()     // Catch:{ all -> 0x0032 }
            goto L_0x001a
        L_0x0029:
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0032 }
            se1.C42550b.m123187a(r1, r0)
            r0 = r4
            goto L_0x0039
        L_0x0032:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r0 = move-exception
            se1.C42550b.m123187a(r1, r4)
            throw r0
        L_0x0039:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.sfmcsdk.util.FileUtilsKt.readAll(java.io.InputStream):java.lang.String");
    }

    public static final String retrieveModuleKey(Context context, String str) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(str, "moduleApplicationId");
        try {
            File file = new File(context.getNoBackupFilesDir(), str);
            if (file.exists()) {
                String c = C42554f.m123194c(file, (Charset) null, 1, (Object) null);
                if (true ^ C40439w.m117118v(c)) {
                    return c;
                }
            }
        } catch (Exception unused) {
            SFMCSdkLogger.INSTANCE.mo31454e("~$SFMCSdkStorage", FileUtilsKt$retrieveModuleKey$1.INSTANCE);
        }
        return null;
    }

    public static final void storeModuleKey(Context context, String str, String str2) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(str, "moduleName");
        C41536l.m120489i(str2, "keyValue");
        try {
            C42554f.m123197f(new File(context.getNoBackupFilesDir(), str), str2, (Charset) null, 2, (Object) null);
        } catch (Exception unused) {
            SFMCSdkLogger.INSTANCE.mo31454e("~$SFMCSdkStorage", FileUtilsKt$storeModuleKey$1.INSTANCE);
        }
    }

    public static final void wipeModuleFiles(Context context, String str) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(str, "moduleApplicationId");
        try {
            File parentFile = context.getDatabasePath(str).getParentFile();
            if (parentFile != null && parentFile.isDirectory()) {
                File[] listFiles = parentFile.listFiles(new C11747a(str));
                if (listFiles != null) {
                    for (File file : listFiles) {
                        SFMCSdkLogger.INSTANCE.mo31463w("~$SFMCSdkStorage", new FileUtilsKt$wipeModuleFiles$2$1(file));
                        file.delete();
                    }
                }
            }
        } catch (Exception unused) {
            SFMCSdkLogger.INSTANCE.mo31463w("~$SFMCSdkStorage", FileUtilsKt$wipeModuleFiles$3.INSTANCE);
        }
        try {
            File file2 = new File(C41536l.m120497q(context.getFilesDir().getParent(), "/shared_prefs"));
            if (file2.isDirectory()) {
                File[] listFiles2 = file2.listFiles(new C11748b(str));
                if (listFiles2 != null) {
                    for (File file3 : listFiles2) {
                        SFMCSdkLogger.INSTANCE.mo31463w("~$SFMCSdkStorage", new FileUtilsKt$wipeModuleFiles$5$1(file3));
                        file3.delete();
                    }
                }
            }
        } catch (Exception unused2) {
            SFMCSdkLogger.INSTANCE.mo31463w("~$SFMCSdkStorage", FileUtilsKt$wipeModuleFiles$6.INSTANCE);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: wipeModuleFiles$lambda-0  reason: not valid java name */
    public static final boolean m125026wipeModuleFiles$lambda0(String str, File file, String str2) {
        C41536l.m120489i(str, "$moduleApplicationId");
        C41536l.m120488h(str2, "name");
        return C40439w.m117109H(str2, getFilenamePrefixForModule(str), false, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: wipeModuleFiles$lambda-2  reason: not valid java name */
    public static final boolean m125027wipeModuleFiles$lambda2(String str, File file, String str2) {
        C41536l.m120489i(str, "$moduleApplicationId");
        C41536l.m120488h(str2, "name");
        return C40439w.m117109H(str2, getFilenamePrefixForModule(str), false, 2, (Object) null);
    }
}
