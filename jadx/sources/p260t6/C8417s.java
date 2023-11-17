package p260t6;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import androidx.core.content.C0767a;
import java.lang.reflect.Method;
import p182n6.C7264i;
import p286v6.C8708e;

/* renamed from: t6.s */
public abstract class C8417s {

    /* renamed from: a */
    private static final int f23863a = Process.myUid();

    /* renamed from: b */
    private static final Method f23864b;

    /* renamed from: c */
    private static final Method f23865c;

    /* renamed from: d */
    private static final Method f23866d;

    /* renamed from: e */
    private static final Method f23867e;

    /* renamed from: f */
    private static final Method f23868f;

    /* renamed from: g */
    private static final Method f23869g;

    /* renamed from: h */
    private static final Method f23870h;

    /* renamed from: i */
    private static final Method f23871i;

    /* renamed from: j */
    private static Boolean f23872j = null;

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00aa  */
    static {
        /*
            java.lang.String r0 = "add"
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            int r2 = android.os.Process.myUid()
            f23863a = r2
            r2 = 1
            r3 = 0
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0018 }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0018 }
            r5[r3] = r6     // Catch:{ Exception -> 0x0018 }
            java.lang.reflect.Method r5 = r1.getMethod(r0, r5)     // Catch:{ Exception -> 0x0018 }
            goto L_0x0019
        L_0x0018:
            r5 = r4
        L_0x0019:
            f23864b = r5
            boolean r5 = p260t6.C8413o.m31565c()
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r7 = 2
            if (r5 == 0) goto L_0x0031
            java.lang.Class[] r5 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x0031 }
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0031 }
            r5[r3] = r8     // Catch:{ Exception -> 0x0031 }
            r5[r2] = r6     // Catch:{ Exception -> 0x0031 }
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch:{ Exception -> 0x0031 }
            goto L_0x0032
        L_0x0031:
            r0 = r4
        L_0x0032:
            f23865c = r0
            java.lang.String r0 = "size"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x003d }
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch:{ Exception -> 0x003d }
            goto L_0x003e
        L_0x003d:
            r0 = r4
        L_0x003e:
            f23866d = r0
            java.lang.String r0 = "get"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x004d }
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x004d }
            r5[r3] = r8     // Catch:{ Exception -> 0x004d }
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch:{ Exception -> 0x004d }
            goto L_0x004e
        L_0x004d:
            r0 = r4
        L_0x004e:
            f23867e = r0
            boolean r0 = p260t6.C8413o.m31565c()
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = "getName"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0063 }
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0063 }
            r5[r3] = r8     // Catch:{ Exception -> 0x0063 }
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch:{ Exception -> 0x0063 }
            goto L_0x0064
        L_0x0063:
            r0 = r4
        L_0x0064:
            f23868f = r0
            boolean r0 = p260t6.C8413o.m31571i()
            java.lang.String r5 = "WorkSourceUtil"
            if (r0 == 0) goto L_0x007d
            java.lang.String r0 = "createWorkChain"
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0077 }
            java.lang.reflect.Method r0 = r1.getMethod(r0, r8)     // Catch:{ Exception -> 0x0077 }
            goto L_0x007e
        L_0x0077:
            r0 = move-exception
            java.lang.String r8 = "Missing WorkChain API createWorkChain"
            android.util.Log.w(r5, r8, r0)
        L_0x007d:
            r0 = r4
        L_0x007e:
            f23869g = r0
            boolean r0 = p260t6.C8413o.m31571i()
            if (r0 == 0) goto L_0x00a1
            java.lang.String r0 = "android.os.WorkSource$WorkChain"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x009b }
            java.lang.String r8 = "addNode"
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x009b }
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x009b }
            r7[r3] = r9     // Catch:{ Exception -> 0x009b }
            r7[r2] = r6     // Catch:{ Exception -> 0x009b }
            java.lang.reflect.Method r0 = r0.getMethod(r8, r7)     // Catch:{ Exception -> 0x009b }
            goto L_0x00a2
        L_0x009b:
            r0 = move-exception
            java.lang.String r6 = "Missing WorkChain class"
            android.util.Log.w(r5, r6, r0)
        L_0x00a1:
            r0 = r4
        L_0x00a2:
            f23870h = r0
            boolean r0 = p260t6.C8413o.m31571i()
            if (r0 == 0) goto L_0x00b6
            java.lang.String r0 = "isEmpty"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x00b6 }
            java.lang.reflect.Method r0 = r1.getMethod(r0, r3)     // Catch:{ Exception -> 0x00b6 }
            r0.setAccessible(r2)     // Catch:{ Exception -> 0x00b7 }
            goto L_0x00b7
        L_0x00b6:
            r0 = r4
        L_0x00b7:
            f23871i = r0
            f23872j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p260t6.C8417s.<clinit>():void");
    }

    /* renamed from: a */
    public static void m31579a(WorkSource workSource, int i, String str) {
        Method method = f23865c;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, new Object[]{Integer.valueOf(i), str});
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        } else {
            Method method2 = f23864b;
            if (method2 != null) {
                try {
                    method2.invoke(workSource, new Object[]{Integer.valueOf(i)});
                } catch (Exception e2) {
                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                }
            }
        }
    }

    /* renamed from: b */
    public static WorkSource m31580b(Context context, String str) {
        if (!(context == null || context.getPackageManager() == null || str == null)) {
            try {
                ApplicationInfo c = C8708e.m32461a(context).mo24089c(str, 0);
                if (c == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                    return null;
                }
                int i = c.uid;
                WorkSource workSource = new WorkSource();
                m31579a(workSource, i, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
        }
        return null;
    }

    /* renamed from: c */
    public static synchronized boolean m31581c(Context context) {
        synchronized (C8417s.class) {
            Boolean bool = f23872j;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                return booleanValue;
            }
            boolean z = false;
            if (context == null) {
                return false;
            }
            if (C0767a.m2891a(context, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            f23872j = valueOf;
            boolean booleanValue2 = valueOf.booleanValue();
            return booleanValue2;
        }
    }

    /* renamed from: d */
    public static boolean m31582d(WorkSource workSource) {
        Method method = f23871i;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                C7264i.m27902k(invoke);
                return ((Boolean) invoke).booleanValue();
            } catch (Exception e) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e);
            }
        }
        if (m31583e(workSource) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static int m31583e(WorkSource workSource) {
        Method method = f23866d;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                C7264i.m27902k(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }
}
