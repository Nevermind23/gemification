package p068e9;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.text.TextUtils;
import com.salesforce.marketingcloud.C11398b;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import p027b9.C2184f;

/* renamed from: e9.h */
public abstract class C6063h {

    /* renamed from: a */
    private static final char[] f18852a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    private static long f18853b = -1;

    /* renamed from: e9.h$a */
    enum C6064a {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        

        /* renamed from: n */
        private static final Map f18864n = null;

        static {
            C6064a aVar;
            C6064a aVar2;
            C6064a aVar3;
            C6064a aVar4;
            HashMap hashMap = new HashMap(4);
            f18864n = hashMap;
            hashMap.put("armeabi-v7a", aVar3);
            hashMap.put("armeabi", aVar2);
            hashMap.put("arm64-v8a", aVar4);
            hashMap.put("x86", aVar);
        }

        /* renamed from: a */
        static C6064a m24236a() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                C2184f.m8346f().mo7095i("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            C6064a aVar = (C6064a) f18864n.get(str.toLowerCase(Locale.US));
            if (aVar == null) {
                return UNKNOWN;
            }
            return aVar;
        }
    }

    /* renamed from: A */
    public static boolean m24206A() {
        boolean z = m24235z();
        String str = Build.TAGS;
        if ((!z && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        File file = new File("/system/xbin/su");
        if (z || !file.exists()) {
            return false;
        }
        return true;
    }

    /* renamed from: B */
    public static boolean m24207B(String str, String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }

    /* renamed from: C */
    public static String m24208C(String str) {
        return m24230u(str, "SHA-1");
    }

    /* renamed from: D */
    public static String m24209D(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        if (useDelimiter.hasNext()) {
            return useDelimiter.next();
        }
        return "";
    }

    /* renamed from: a */
    public static long m24210a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    /* renamed from: b */
    public static long m24211b(String str) {
        StatFs statFs = new StatFs(str);
        long blockSize = (long) statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    /* renamed from: c */
    public static boolean m24212c(Context context) {
        if (!m24213d(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m24213d(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* renamed from: e */
    public static void m24214e(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                C2184f.m8346f().mo7092e(str, e);
            }
        }
    }

    /* renamed from: f */
    public static void m24215f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: g */
    static long m24216g(String str, String str2, int i) {
        return Long.parseLong(str.split(str2)[0].trim()) * ((long) i);
    }

    /* renamed from: h */
    public static String m24217h(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (String append : arrayList) {
            sb.append(append);
        }
        String sb2 = sb.toString();
        if (sb2.length() > 0) {
            return m24208C(sb2);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m24218i(java.io.File r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "Failed to close system file reader."
            boolean r1 = r6.exists()
            r2 = 0
            if (r1 == 0) goto L_0x005f
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            r3.<init>(r6)     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r3, r4)     // Catch:{ Exception -> 0x003e, all -> 0x003c }
        L_0x0015:
            java.lang.String r3 = r1.readLine()     // Catch:{ Exception -> 0x003a }
            if (r3 == 0) goto L_0x0036
            java.lang.String r4 = "\\s*:\\s*"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)     // Catch:{ Exception -> 0x003a }
            r5 = 2
            java.lang.String[] r3 = r4.split(r3, r5)     // Catch:{ Exception -> 0x003a }
            int r4 = r3.length     // Catch:{ Exception -> 0x003a }
            r5 = 1
            if (r4 <= r5) goto L_0x0015
            r4 = 0
            r4 = r3[r4]     // Catch:{ Exception -> 0x003a }
            boolean r4 = r4.equals(r7)     // Catch:{ Exception -> 0x003a }
            if (r4 == 0) goto L_0x0015
            r6 = r3[r5]     // Catch:{ Exception -> 0x003a }
            r2 = r6
        L_0x0036:
            m24214e(r1, r0)
            goto L_0x005f
        L_0x003a:
            r7 = move-exception
            goto L_0x0040
        L_0x003c:
            r6 = move-exception
            goto L_0x005b
        L_0x003e:
            r7 = move-exception
            r1 = r2
        L_0x0040:
            b9.f r3 = p027b9.C2184f.m8346f()     // Catch:{ all -> 0x0059 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0059 }
            r4.<init>()     // Catch:{ all -> 0x0059 }
            java.lang.String r5 = "Error parsing "
            r4.append(r5)     // Catch:{ all -> 0x0059 }
            r4.append(r6)     // Catch:{ all -> 0x0059 }
            java.lang.String r6 = r4.toString()     // Catch:{ all -> 0x0059 }
            r3.mo7092e(r6, r7)     // Catch:{ all -> 0x0059 }
            goto L_0x0036
        L_0x0059:
            r6 = move-exception
            r2 = r1
        L_0x005b:
            m24214e(r2, r0)
            throw r6
        L_0x005f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p068e9.C6063h.m24218i(java.io.File, java.lang.String):java.lang.String");
    }

    /* renamed from: j */
    public static ActivityManager.RunningAppProcessInfo m24219j(String str, Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.processName.equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    /* renamed from: k */
    public static boolean m24220k(Context context, String str, boolean z) {
        Resources resources;
        if (!(context == null || (resources = context.getResources()) == null)) {
            int r = m24227r(context, str, "bool");
            if (r > 0) {
                return resources.getBoolean(r);
            }
            int r2 = m24227r(context, str, "string");
            if (r2 > 0) {
                return Boolean.parseBoolean(context.getString(r2));
            }
        }
        return z;
    }

    /* renamed from: l */
    public static List m24221l(Context context) {
        ArrayList arrayList = new ArrayList();
        int r = m24227r(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int r2 = m24227r(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int r3 = m24227r(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (r == 0 || r2 == 0 || r3 == 0) {
            C2184f.m8346f().mo7089b(String.format("Could not find resources: %d %d %d", new Object[]{Integer.valueOf(r), Integer.valueOf(r2), Integer.valueOf(r3)}));
            return arrayList;
        }
        String[] stringArray = context.getResources().getStringArray(r);
        String[] stringArray2 = context.getResources().getStringArray(r2);
        String[] stringArray3 = context.getResources().getStringArray(r3);
        if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
            for (int i = 0; i < stringArray3.length; i++) {
                arrayList.add(new C6057e(stringArray[i], stringArray2[i], stringArray3[i]));
            }
            return arrayList;
        }
        C2184f.m8346f().mo7089b(String.format("Lengths did not match: %d %d %d", new Object[]{Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length)}));
        return arrayList;
    }

    /* renamed from: m */
    public static int m24222m() {
        return C6064a.m24236a().ordinal();
    }

    /* renamed from: n */
    public static int m24223n() {
        boolean z = m24235z();
        if (m24206A()) {
            z |= true;
        }
        return m24234y() ? z | true ? 1 : 0 : z ? 1 : 0;
    }

    /* renamed from: o */
    public static String m24224o(Context context) {
        int r = m24227r(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (r == 0) {
            r = m24227r(context, "com.crashlytics.android.build_id", "string");
        }
        if (r != 0) {
            return context.getResources().getString(r);
        }
        return null;
    }

    /* renamed from: p */
    public static boolean m24225p(Context context) {
        if (!m24235z() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public static String m24226q(Context context) {
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i <= 0) {
            return context.getPackageName();
        }
        try {
            String resourcePackageName = context.getResources().getResourcePackageName(i);
            if ("android".equals(resourcePackageName)) {
                return context.getPackageName();
            }
            return resourcePackageName;
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    /* renamed from: r */
    public static int m24227r(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, m24226q(context));
    }

    /* renamed from: s */
    public static SharedPreferences m24228s(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    /* renamed from: t */
    public static synchronized long m24229t() {
        long j;
        long g;
        synchronized (C6063h.class) {
            if (f18853b == -1) {
                String i = m24218i(new File("/proc/meminfo"), "MemTotal");
                long j2 = 0;
                if (!TextUtils.isEmpty(i)) {
                    String upperCase = i.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            g = m24216g(upperCase, "KB", C11398b.f33141t);
                        } else if (upperCase.endsWith("MB")) {
                            g = m24216g(upperCase, "MB", 1048576);
                        } else if (upperCase.endsWith("GB")) {
                            g = m24216g(upperCase, "GB", 1073741824);
                        } else {
                            C2184f f = C2184f.m8346f();
                            f.mo7097k("Unexpected meminfo format while computing RAM: " + upperCase);
                        }
                        j2 = g;
                    } catch (NumberFormatException e) {
                        C2184f f2 = C2184f.m8346f();
                        f2.mo7092e("Unexpected meminfo format while computing RAM: " + upperCase, e);
                    }
                }
                f18853b = j2;
            }
            j = f18853b;
        }
        return j;
    }

    /* renamed from: u */
    private static String m24230u(String str, String str2) {
        return m24231v(str.getBytes(), str2);
    }

    /* renamed from: v */
    private static String m24231v(byte[] bArr, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            instance.update(bArr);
            return m24232w(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            C2184f f = C2184f.m8346f();
            f.mo7092e("Could not create hashing algorithm: " + str + ", returning empty string.", e);
            return "";
        }
    }

    /* renamed from: w */
    public static String m24232w(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = f18852a;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: x */
    public static boolean m24233x(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    /* renamed from: y */
    public static boolean m24234y() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    /* renamed from: z */
    public static boolean m24235z() {
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            if (str.contains("goldfish") || str.contains("ranchu")) {
                return true;
            }
            return false;
        }
        return true;
    }
}
