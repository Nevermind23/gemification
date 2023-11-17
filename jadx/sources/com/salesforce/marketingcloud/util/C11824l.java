package com.salesforce.marketingcloud.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeSet;
import p342j$.util.DesugarTimeZone;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.util.l */
public final class C11824l {

    /* renamed from: a */
    public static final Locale f34333a = Locale.US;

    /* renamed from: b */
    public static final Charset f34334b = Charset.forName("UTF-8");

    /* renamed from: c */
    static final String f34335c = C11461g.m41875a("Utils");

    /* renamed from: d */
    private static final String f34336d = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

    /* renamed from: e */
    private static final String f34337e = "^|^";

    /* renamed from: f */
    private static final String f34338f = "\\^\\|\\^";

    /* renamed from: g */
    private static final char[] f34339g = "0123456789ABCDEF".toCharArray();

    /* renamed from: h */
    private static final TimeZone f34340h = DesugarTimeZone.getTimeZone("UTC");

    /* renamed from: i */
    private static Boolean f34341i;

    private C11824l() {
    }

    /* renamed from: a */
    public static int m43279a(int i) {
        return Build.VERSION.SDK_INT >= 31 ? i | 67108864 : i;
    }

    /* renamed from: b */
    public static int m43290b() {
        return TimeZone.getDefault().getOffset(new Date().getTime()) / 1000;
    }

    /* renamed from: c */
    public static Map<String, String> m43294c(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(f34338f);
            for (int i = 0; i < split.length; i += 2) {
                int i2 = i + 1;
                hashMap.put(split[i], i2 < split.length ? split[i2] : "");
            }
        }
        return hashMap;
    }

    /* renamed from: d */
    public static Set<String> m43297d(String str) {
        TreeSet treeSet = new TreeSet();
        if (str != null && !TextUtils.isEmpty(str)) {
            for (String str2 : str.split(f34338f)) {
                if (str2 != null && !str2.isEmpty()) {
                    treeSet.add(str2);
                }
            }
        }
        return treeSet;
    }

    /* renamed from: e */
    public static String m43298e(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            byte[] bytes = str.getBytes(f34334b);
            instance.update(bytes, 0, bytes.length);
            return new BigInteger(1, instance.digest()).toString(16);
        } catch (Throwable th) {
            C11461g.m41885b(f34335c, th, "md5 failed", new Object[0]);
            return "";
        }
    }

    /* renamed from: f */
    public static Date m43299f(String str) {
        if (str == null) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(f34336d, f34333a);
        simpleDateFormat.setTimeZone(f34340h);
        return simpleDateFormat.parse(str);
    }

    /* renamed from: a */
    static String m43280a(String str) {
        return m43281a(str, "SHA-256", "UTF-8");
    }

    /* renamed from: b */
    public static int m43291b(int i) {
        return Build.VERSION.SDK_INT >= 31 ? i | 33554432 : i;
    }

    /* renamed from: c */
    public static boolean m43295c() {
        if (Build.VERSION.SDK_INT <= 25) {
            String str = Build.VERSION.CODENAME;
            return "O".equals(str) || str.startsWith("OMR");
        }
    }

    /* renamed from: a */
    private static String m43281a(String str, String str2, String str3) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str2);
            byte[] bytes = str.getBytes(str3);
            instance.update(bytes, 0, bytes.length);
            return m43285a(instance.digest());
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static String m43292b(String str) {
        return m43281a(str, "MD5", "UTF-8");
    }

    /* renamed from: c */
    private static boolean m43296c(Context context) {
        try {
            String name = context.getApplicationContext().getClass().getName();
            String replace = name.replace("." + context.getApplicationContext().getClass().getSimpleName(), "");
            Class<?> cls = Class.forName(replace + ".BuildConfig");
            Field field = cls.getField("DEBUG");
            field.setAccessible(true);
            boolean z = field.getBoolean((Object) null);
            C11461g.m41888c(f34335c, "isDebugBuild set to %s for clazz %s", Boolean.valueOf(z), cls.getCanonicalName());
            return z;
        } catch (Exception e) {
            boolean b = m43293b(context);
            C11461g.m41880a(f34335c, "isDebugBuild determination failed with Exception [%s].  isDebugBuild set to: %s", e.getMessage(), Boolean.valueOf(b));
            return b;
        }
    }

    /* renamed from: a */
    public static String m43282a(Date date) {
        if (date == null) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(f34336d, f34333a);
        simpleDateFormat.setTimeZone(f34340h);
        return simpleDateFormat.format(date);
    }

    /* renamed from: b */
    private static boolean m43293b(Context context) {
        try {
            return (context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.flags & 2) != 0;
        } catch (PackageManager.NameNotFoundException unused) {
            C11461g.m41894e(f34335c, "Failed to determine if app was in debug mode.", new Object[0]);
        }
    }

    /* renamed from: a */
    public static String m43283a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return "";
        }
        HashMap hashMap = new HashMap(map);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : hashMap.entrySet()) {
            m43286a(sb, (String) entry.getKey(), (String) entry.getValue());
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static synchronized String m43284a(Set<String> set) {
        synchronized (C11824l.class) {
            if (set == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            for (String append : set) {
                sb.append(append);
                sb.append(f34337e);
            }
            String sb2 = sb.toString();
            return sb2;
        }
    }

    /* renamed from: a */
    private static String m43285a(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = f34339g;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: a */
    private static void m43286a(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(f34337e);
        sb.append(str2);
        sb.append(f34337e);
    }

    /* renamed from: a */
    private static boolean m43287a() {
        return MarketingCloudSdk.isReady() || MarketingCloudSdk.isInitializing();
    }

    /* renamed from: a */
    public static boolean m43288a(long j, long j2) {
        long j3 = j;
        if (j3 > 0) {
            long min = Math.min(j2, j3);
            long currentTimeMillis = System.currentTimeMillis();
            long j4 = currentTimeMillis;
            boolean z = false;
            while (true) {
                long j5 = currentTimeMillis + j3;
                if (j5 <= j4 || z || m43287a()) {
                    break;
                }
                long j6 = j4 + min > j5 ? j5 - j4 : min;
                try {
                    C11461g.m41891d(f34335c, "Marketing Cloud SDK is not yet initializing.  Trying again in %sms. %s", Long.valueOf(j6), Long.valueOf(j4 - currentTimeMillis));
                    Thread.sleep(j6);
                } catch (Exception e) {
                    C11461g.m41885b(f34335c, e, "Encountered exception while waiting for SDK initialization to be triggered by the application.", new Object[0]);
                    z = true;
                }
                j4 = System.currentTimeMillis();
            }
        }
        return m43287a();
    }

    /* renamed from: a */
    public static boolean m43289a(Context context) {
        if (f34341i == null) {
            f34341i = Boolean.valueOf(m43296c(context));
        }
        return f34341i.booleanValue();
    }
}
