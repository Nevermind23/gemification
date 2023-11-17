package p260t6;

/* renamed from: t6.p */
public abstract class C8414p {

    /* renamed from: a */
    private static String f23860a;

    /* renamed from: b */
    private static int f23861b;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m31575a() {
        /*
            java.lang.String r0 = f23860a
            if (r0 != 0) goto L_0x0065
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x0011
            java.lang.String r0 = android.app.Application.getProcessName()
            f23860a = r0
            goto L_0x0065
        L_0x0011:
            int r0 = f23861b
            if (r0 != 0) goto L_0x001b
            int r0 = android.os.Process.myPid()
            f23861b = r0
        L_0x001b:
            r1 = 0
            if (r0 > 0) goto L_0x001f
            goto L_0x0063
        L_0x001f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x005f, all -> 0x005a }
            r2.<init>()     // Catch:{ IOException -> 0x005f, all -> 0x005a }
            java.lang.String r3 = "/proc/"
            r2.append(r3)     // Catch:{ IOException -> 0x005f, all -> 0x005a }
            r2.append(r0)     // Catch:{ IOException -> 0x005f, all -> 0x005a }
            java.lang.String r0 = "/cmdline"
            r2.append(r0)     // Catch:{ IOException -> 0x005f, all -> 0x005a }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x005f, all -> 0x005a }
            android.os.StrictMode$ThreadPolicy r2 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ IOException -> 0x005f, all -> 0x005a }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0055 }
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ all -> 0x0055 }
            r4.<init>(r0)     // Catch:{ all -> 0x0055 }
            r3.<init>(r4)     // Catch:{ all -> 0x0055 }
            android.os.StrictMode.setThreadPolicy(r2)     // Catch:{ IOException -> 0x005f, all -> 0x005a }
            java.lang.String r0 = r3.readLine()     // Catch:{ IOException -> 0x0060, all -> 0x0052 }
            p182n6.C7264i.m27902k(r0)     // Catch:{ IOException -> 0x0060, all -> 0x0052 }
            java.lang.String r1 = r0.trim()     // Catch:{ IOException -> 0x0060, all -> 0x0052 }
            goto L_0x0060
        L_0x0052:
            r0 = move-exception
            r1 = r3
            goto L_0x005b
        L_0x0055:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r2)     // Catch:{ IOException -> 0x005f, all -> 0x005a }
            throw r0     // Catch:{ IOException -> 0x005f, all -> 0x005a }
        L_0x005a:
            r0 = move-exception
        L_0x005b:
            p260t6.C8410l.m31557a(r1)
            throw r0
        L_0x005f:
            r3 = r1
        L_0x0060:
            p260t6.C8410l.m31557a(r3)
        L_0x0063:
            f23860a = r1
        L_0x0065:
            java.lang.String r0 = f23860a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p260t6.C8414p.m31575a():java.lang.String");
    }
}
