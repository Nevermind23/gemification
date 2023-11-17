package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.C3941b;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p182n6.C7258g;
import p182n6.C7264i;
import p312x6.C8971f;

public final class DynamiteModule {

    /* renamed from: b */
    public static final C4014a f12825b = new C4020d();

    /* renamed from: c */
    public static final C4014a f12826c = new C4021e();

    /* renamed from: d */
    public static final C4014a f12827d = new C4022f();

    /* renamed from: e */
    public static final C4014a f12828e = new C4023g();

    /* renamed from: f */
    public static final C4014a f12829f = new C4024h();

    /* renamed from: g */
    public static final C4014a f12830g = new C4025i();

    /* renamed from: h */
    private static Boolean f12831h = null;

    /* renamed from: i */
    private static String f12832i = null;

    /* renamed from: j */
    private static boolean f12833j = false;

    /* renamed from: k */
    private static int f12834k = -1;

    /* renamed from: l */
    private static Boolean f12835l;

    /* renamed from: m */
    private static final ThreadLocal f12836m = new ThreadLocal();

    /* renamed from: n */
    private static final ThreadLocal f12837n = new C4018b();

    /* renamed from: o */
    private static final C4014a.C4015a f12838o = new C4019c();

    /* renamed from: p */
    public static final C4014a f12839p = new C4026j();

    /* renamed from: q */
    private static C4029m f12840q;

    /* renamed from: r */
    private static C4030n f12841r;

    /* renamed from: a */
    private final Context f12842a;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class LoadingException extends Exception {
        /* synthetic */ LoadingException(String str, C8971f fVar) {
            super(str);
        }

        /* synthetic */ LoadingException(String str, Throwable th, C8971f fVar) {
            super(str, th);
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    public interface C4014a {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$a */
        public interface C4015a {
            /* renamed from: a */
            int mo12399a(Context context, String str, boolean z);

            /* renamed from: b */
            int mo12400b(Context context, String str);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$b */
        public static class C4016b {

            /* renamed from: a */
            public int f12843a = 0;

            /* renamed from: b */
            public int f12844b = 0;

            /* renamed from: c */
            public int f12845c = 0;
        }

        /* renamed from: a */
        C4016b mo12398a(Context context, String str, C4015a aVar);
    }

    private DynamiteModule(Context context) {
        C7264i.m27902k(context);
        this.f12842a = context;
    }

    /* renamed from: a */
    public static int m15256a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (C7258g.m27880a(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            Log.e("DynamiteModule", "Module descriptor id '" + valueOf + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage())));
            return 0;
        }
    }

    /* renamed from: c */
    public static int m15257c(Context context, String str) {
        return m15259f(context, str, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01cc, code lost:
        android.util.Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
        r4 = r4.mo12404B2(p299w6.C8862d.m32984T1(r20), r3, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01db, code lost:
        r4 = p299w6.C8862d.m32985y(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01df, code lost:
        if (r4 == null) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01e1, code lost:
        r5 = new com.google.android.gms.dynamite.DynamiteModule((android.content.Context) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01ec, code lost:
        if (r9 != 0) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01ee, code lost:
        r8.remove();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01f2, code lost:
        r8.set(java.lang.Long.valueOf(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01f9, code lost:
        r1 = r7.f12846a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01fb, code lost:
        if (r1 == null) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01fd, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0200, code lost:
        r0.set(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0203, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x020c, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to load remote module.", (p312x6.C8971f) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0215, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to create IDynamiteLoader.", (p312x6.C8971f) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0216, code lost:
        r19 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0220, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to determine which loading route to use.", (p312x6.C8971f) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0233, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0235, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0237, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b1, code lost:
        if (r17 == null) goto L_0x0216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b8, code lost:
        if (r17.booleanValue() == false) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ba, code lost:
        android.util.Log.i("DynamiteModule", "Selected remote version of " + r3 + ", version >= " + r14);
        r5 = com.google.android.gms.dynamite.DynamiteModule.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00da, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r11 = f12841r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00de, code lost:
        if (r11 == null) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r5 = (com.google.android.gms.dynamite.C4027k) r0.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e6, code lost:
        if (r5 == null) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ea, code lost:
        if (r5.f12846a == null) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ec, code lost:
        r15 = r20.getApplicationContext();
        r5 = r5.f12846a;
        p299w6.C8862d.m32984T1((java.lang.Object) null);
        r18 = com.google.android.gms.dynamite.DynamiteModule.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f9, code lost:
        monitor-enter(r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00fa, code lost:
        r19 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00fe, code lost:
        if (f12834k < 2) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0100, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0102, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0103, code lost:
        r4 = java.lang.Boolean.valueOf(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0107, code lost:
        monitor-exit(r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x010c, code lost:
        if (r4.booleanValue() == false) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010e, code lost:
        android.util.Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
        r4 = r11.mo12410T1(p299w6.C8862d.m32984T1(r15), r3, r14, p299w6.C8862d.m32984T1(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0122, code lost:
        android.util.Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
        r4 = r11.mo12411y(p299w6.C8862d.m32984T1(r15), r3, r14, p299w6.C8862d.m32984T1(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0135, code lost:
        r4 = (android.content.Context) p299w6.C8862d.m32985y(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x013b, code lost:
        if (r4 == null) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x013d, code lost:
        r5 = new com.google.android.gms.dynamite.DynamiteModule(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x014c, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("Failed to get module context", (p312x6.C8971f) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0150, code lost:
        r19 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x015a, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("No result cursor", (p312x6.C8971f) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x015b, code lost:
        r19 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0165, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("DynamiteLoaderV2 was not cached.", (p312x6.C8971f) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0166, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0167, code lost:
        r19 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x016b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x016d, code lost:
        r19 = r4;
        android.util.Log.i("DynamiteModule", "Selected remote version of " + r3 + ", version >= " + r14);
        r4 = m15265l(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0191, code lost:
        if (r4 == null) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0193, code lost:
        r5 = r4.mo12409y();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0198, code lost:
        if (r5 < 3) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x019a, code lost:
        r5 = (com.google.android.gms.dynamite.C4027k) r0.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01a0, code lost:
        if (r5 == null) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01a2, code lost:
        r4 = r4.mo12405C2(p299w6.C8862d.m32984T1(r20), r3, r14, p299w6.C8862d.m32984T1(r5.f12846a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01b9, code lost:
        throw new com.google.android.gms.dynamite.DynamiteModule.LoadingException("No cached result cursor holder", (p312x6.C8971f) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ba, code lost:
        if (r5 != 2) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01bc, code lost:
        android.util.Log.w("DynamiteModule", "IDynamite loader version = 2");
        r4 = r4.mo12406D2(p299w6.C8862d.m32984T1(r20), r3, r14);
     */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x028a A[Catch:{ all -> 0x0304 }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02b2 A[SYNTHETIC, Splitter:B:165:0x02b2] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.dynamite.DynamiteModule m15258e(android.content.Context r20, com.google.android.gms.dynamite.DynamiteModule.C4014a r21, java.lang.String r22) {
        /*
            r1 = r20
            r2 = r21
            r3 = r22
            android.content.Context r4 = r20.getApplicationContext()
            r5 = 0
            if (r4 == 0) goto L_0x0327
            java.lang.ThreadLocal r0 = f12836m
            java.lang.Object r6 = r0.get()
            com.google.android.gms.dynamite.k r6 = (com.google.android.gms.dynamite.C4027k) r6
            com.google.android.gms.dynamite.k r7 = new com.google.android.gms.dynamite.k
            r7.<init>(r5)
            r0.set(r7)
            java.lang.ThreadLocal r8 = f12837n
            java.lang.Object r9 = r8.get()
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0304 }
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0304 }
            r8.set(r13)     // Catch:{ all -> 0x0304 }
            com.google.android.gms.dynamite.DynamiteModule$a$a r13 = f12838o     // Catch:{ all -> 0x0304 }
            com.google.android.gms.dynamite.DynamiteModule$a$b r13 = r2.mo12398a(r1, r3, r13)     // Catch:{ all -> 0x0304 }
            java.lang.String r14 = "DynamiteModule"
            int r15 = r13.f12843a     // Catch:{ all -> 0x0304 }
            int r5 = r13.f12844b     // Catch:{ all -> 0x0304 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0304 }
            r11.<init>()     // Catch:{ all -> 0x0304 }
            java.lang.String r12 = "Considering local module "
            r11.append(r12)     // Catch:{ all -> 0x0304 }
            r11.append(r3)     // Catch:{ all -> 0x0304 }
            java.lang.String r12 = ":"
            r11.append(r12)     // Catch:{ all -> 0x0304 }
            r11.append(r15)     // Catch:{ all -> 0x0304 }
            java.lang.String r12 = " and remote module "
            r11.append(r12)     // Catch:{ all -> 0x0304 }
            r11.append(r3)     // Catch:{ all -> 0x0304 }
            java.lang.String r12 = ":"
            r11.append(r12)     // Catch:{ all -> 0x0304 }
            r11.append(r5)     // Catch:{ all -> 0x0304 }
            java.lang.String r5 = r11.toString()     // Catch:{ all -> 0x0304 }
            android.util.Log.i(r14, r5)     // Catch:{ all -> 0x0304 }
            int r5 = r13.f12845c     // Catch:{ all -> 0x0304 }
            if (r5 == 0) goto L_0x02d3
            r11 = -1
            if (r5 != r11) goto L_0x0078
            int r5 = r13.f12843a     // Catch:{ all -> 0x0304 }
            if (r5 == 0) goto L_0x02d3
            r5 = r11
        L_0x0078:
            r12 = 1
            if (r5 != r12) goto L_0x007f
            int r14 = r13.f12844b     // Catch:{ all -> 0x0304 }
            if (r14 == 0) goto L_0x02d3
        L_0x007f:
            if (r5 != r11) goto L_0x00a1
            com.google.android.gms.dynamite.DynamiteModule r1 = m15261h(r4, r3)     // Catch:{ all -> 0x0304 }
            r2 = 0
            int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x008f
            r8.remove()
            goto L_0x0096
        L_0x008f:
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            r8.set(r2)
        L_0x0096:
            android.database.Cursor r2 = r7.f12846a
            if (r2 == 0) goto L_0x009d
            r2.close()
        L_0x009d:
            r0.set(r6)
            return r1
        L_0x00a1:
            if (r5 != r12) goto L_0x02bb
            int r14 = r13.f12844b     // Catch:{ LoadingException -> 0x025a }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r15 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r15)     // Catch:{ RemoteException -> 0x024c, LoadingException -> 0x0248, all -> 0x0239 }
            boolean r17 = m15264k(r20)     // Catch:{ all -> 0x022e }
            if (r17 == 0) goto L_0x0221
            java.lang.Boolean r17 = f12831h     // Catch:{ all -> 0x022e }
            monitor-exit(r15)     // Catch:{ all -> 0x022e }
            if (r17 == 0) goto L_0x0216
            boolean r15 = r17.booleanValue()     // Catch:{ RemoteException -> 0x024c, LoadingException -> 0x0248, all -> 0x0239 }
            r12 = 2
            if (r15 == 0) goto L_0x016d
            java.lang.String r15 = "DynamiteModule"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x024c, LoadingException -> 0x0248, all -> 0x0239 }
            r11.<init>()     // Catch:{ RemoteException -> 0x024c, LoadingException -> 0x0248, all -> 0x0239 }
            java.lang.String r5 = "Selected remote version of "
            r11.append(r5)     // Catch:{ RemoteException -> 0x024c, LoadingException -> 0x0248, all -> 0x0239 }
            r11.append(r3)     // Catch:{ RemoteException -> 0x024c, LoadingException -> 0x0248, all -> 0x0239 }
            java.lang.String r5 = ", version >= "
            r11.append(r5)     // Catch:{ RemoteException -> 0x024c, LoadingException -> 0x0248, all -> 0x0239 }
            r11.append(r14)     // Catch:{ RemoteException -> 0x024c, LoadingException -> 0x0248, all -> 0x0239 }
            java.lang.String r5 = r11.toString()     // Catch:{ RemoteException -> 0x024c, LoadingException -> 0x0248, all -> 0x0239 }
            android.util.Log.i(r15, r5)     // Catch:{ RemoteException -> 0x024c, LoadingException -> 0x0248, all -> 0x0239 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r5 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r5)     // Catch:{ RemoteException -> 0x024c, LoadingException -> 0x0248, all -> 0x0239 }
            com.google.android.gms.dynamite.n r11 = f12841r     // Catch:{ all -> 0x0166 }
            monitor-exit(r5)     // Catch:{ all -> 0x0166 }
            if (r11 == 0) goto L_0x015b
            java.lang.Object r5 = r0.get()     // Catch:{ RemoteException -> 0x024c, LoadingException -> 0x0248, all -> 0x0239 }
            com.google.android.gms.dynamite.k r5 = (com.google.android.gms.dynamite.C4027k) r5     // Catch:{ RemoteException -> 0x024c, LoadingException -> 0x0248, all -> 0x0239 }
            if (r5 == 0) goto L_0x0150
            android.database.Cursor r15 = r5.f12846a     // Catch:{ RemoteException -> 0x024c, LoadingException -> 0x0248, all -> 0x0239 }
            if (r15 == 0) goto L_0x0150
            android.content.Context r15 = r20.getApplicationContext()     // Catch:{ RemoteException -> 0x024c, LoadingException -> 0x0248, all -> 0x0239 }
            android.database.Cursor r5 = r5.f12846a     // Catch:{ RemoteException -> 0x024c, LoadingException -> 0x0248, all -> 0x0239 }
            r16 = 0
            p299w6.C8862d.m32984T1(r16)     // Catch:{ RemoteException -> 0x024c, LoadingException -> 0x0248, all -> 0x0239 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r18 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r18)     // Catch:{ RemoteException -> 0x024c, LoadingException -> 0x0248, all -> 0x0239 }
            r19 = r4
            int r4 = f12834k     // Catch:{ all -> 0x014d }
            if (r4 < r12) goto L_0x0102
            r12 = 1
            goto L_0x0103
        L_0x0102:
            r12 = 0
        L_0x0103:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x014d }
            monitor-exit(r18)     // Catch:{ all -> 0x014d }
            boolean r4 = r4.booleanValue()     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            if (r4 == 0) goto L_0x0122
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r12 = "Dynamite loader version >= 2, using loadModule2NoCrashUtils"
            android.util.Log.v(r4, r12)     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            w6.b r4 = p299w6.C8862d.m32984T1(r15)     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            w6.b r5 = p299w6.C8862d.m32984T1(r5)     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            w6.b r4 = r11.mo12410T1(r4, r3, r14, r5)     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            goto L_0x0135
        L_0x0122:
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r12 = "Dynamite loader version < 2, falling back to loadModule2"
            android.util.Log.w(r4, r12)     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            w6.b r4 = p299w6.C8862d.m32984T1(r15)     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            w6.b r5 = p299w6.C8862d.m32984T1(r5)     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            w6.b r4 = r11.mo12411y(r4, r3, r14, r5)     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
        L_0x0135:
            java.lang.Object r4 = p299w6.C8862d.m32985y(r4)     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            android.content.Context r4 = (android.content.Context) r4     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            if (r4 == 0) goto L_0x0144
            com.google.android.gms.dynamite.DynamiteModule r5 = new com.google.android.gms.dynamite.DynamiteModule     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            r5.<init>(r4)     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            goto L_0x01e8
        L_0x0144:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            java.lang.String r4 = "Failed to get module context"
            r5 = 0
            r0.<init>(r4, r5)     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            throw r0     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
        L_0x014d:
            r0 = move-exception
            monitor-exit(r18)     // Catch:{ all -> 0x014d }
            throw r0     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
        L_0x0150:
            r19 = r4
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            java.lang.String r4 = "No result cursor"
            r5 = 0
            r0.<init>(r4, r5)     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            throw r0     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
        L_0x015b:
            r19 = r4
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            java.lang.String r4 = "DynamiteLoaderV2 was not cached."
            r5 = 0
            r0.<init>(r4, r5)     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            throw r0     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
        L_0x0166:
            r0 = move-exception
            r19 = r4
        L_0x0169:
            monitor-exit(r5)     // Catch:{ all -> 0x016b }
            throw r0     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
        L_0x016b:
            r0 = move-exception
            goto L_0x0169
        L_0x016d:
            r19 = r4
            java.lang.String r4 = "DynamiteModule"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            r5.<init>()     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            java.lang.String r11 = "Selected remote version of "
            r5.append(r11)     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            r5.append(r3)     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            java.lang.String r11 = ", version >= "
            r5.append(r11)     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            r5.append(r14)     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            java.lang.String r5 = r5.toString()     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            android.util.Log.i(r4, r5)     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            com.google.android.gms.dynamite.m r4 = m15265l(r20)     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            if (r4 == 0) goto L_0x020d
            int r5 = r4.mo12409y()     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            r11 = 3
            if (r5 < r11) goto L_0x01ba
            java.lang.Object r5 = r0.get()     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            com.google.android.gms.dynamite.k r5 = (com.google.android.gms.dynamite.C4027k) r5     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            if (r5 == 0) goto L_0x01b1
            w6.b r11 = p299w6.C8862d.m32984T1(r20)     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            android.database.Cursor r5 = r5.f12846a     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            w6.b r5 = p299w6.C8862d.m32984T1(r5)     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            w6.b r4 = r4.mo12405C2(r11, r3, r14, r5)     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            goto L_0x01db
        L_0x01b1:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            java.lang.String r4 = "No cached result cursor holder"
            r5 = 0
            r0.<init>(r4, r5)     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            throw r0     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
        L_0x01ba:
            if (r5 != r12) goto L_0x01cc
            java.lang.String r5 = "DynamiteModule"
            java.lang.String r11 = "IDynamite loader version = 2"
            android.util.Log.w(r5, r11)     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            w6.b r5 = p299w6.C8862d.m32984T1(r20)     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            w6.b r4 = r4.mo12406D2(r5, r3, r14)     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            goto L_0x01db
        L_0x01cc:
            java.lang.String r5 = "DynamiteModule"
            java.lang.String r11 = "Dynamite loader version < 2, falling back to createModuleContext"
            android.util.Log.w(r5, r11)     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            w6.b r5 = p299w6.C8862d.m32984T1(r20)     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            w6.b r4 = r4.mo12404B2(r5, r3, r14)     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
        L_0x01db:
            java.lang.Object r4 = p299w6.C8862d.m32985y(r4)     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            if (r4 == 0) goto L_0x0204
            com.google.android.gms.dynamite.DynamiteModule r5 = new com.google.android.gms.dynamite.DynamiteModule     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            android.content.Context r4 = (android.content.Context) r4     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            r5.<init>(r4)     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
        L_0x01e8:
            r1 = 0
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x01f2
            r8.remove()
            goto L_0x01f9
        L_0x01f2:
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            r8.set(r1)
        L_0x01f9:
            android.database.Cursor r1 = r7.f12846a
            if (r1 == 0) goto L_0x0200
            r1.close()
        L_0x0200:
            r0.set(r6)
            return r5
        L_0x0204:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            java.lang.String r4 = "Failed to load remote module."
            r5 = 0
            r0.<init>(r4, r5)     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            throw r0     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
        L_0x020d:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            java.lang.String r4 = "Failed to create IDynamiteLoader."
            r5 = 0
            r0.<init>(r4, r5)     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            throw r0     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
        L_0x0216:
            r19 = r4
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            java.lang.String r4 = "Failed to determine which loading route to use."
            r5 = 0
            r0.<init>(r4, r5)     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
            throw r0     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
        L_0x0221:
            r19 = r4
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x022c }
            java.lang.String r4 = "Remote loading disabled"
            r5 = 0
            r0.<init>(r4, r5)     // Catch:{ all -> 0x022c }
            throw r0     // Catch:{ all -> 0x022c }
        L_0x022c:
            r0 = move-exception
            goto L_0x0231
        L_0x022e:
            r0 = move-exception
            r19 = r4
        L_0x0231:
            monitor-exit(r15)     // Catch:{ all -> 0x022c }
            throw r0     // Catch:{ RemoteException -> 0x0237, LoadingException -> 0x0235, all -> 0x0233 }
        L_0x0233:
            r0 = move-exception
            goto L_0x023c
        L_0x0235:
            r0 = move-exception
            goto L_0x024b
        L_0x0237:
            r0 = move-exception
            goto L_0x024f
        L_0x0239:
            r0 = move-exception
            r19 = r4
        L_0x023c:
            p260t6.C8406h.m31543a(r1, r0)     // Catch:{ LoadingException -> 0x0258 }
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r4 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ LoadingException -> 0x0258 }
            java.lang.String r5 = "Failed to load remote module."
            r8 = 0
            r4.<init>(r5, r0, r8)     // Catch:{ LoadingException -> 0x0258 }
            throw r4     // Catch:{ LoadingException -> 0x0258 }
        L_0x0248:
            r0 = move-exception
            r19 = r4
        L_0x024b:
            throw r0     // Catch:{ LoadingException -> 0x0258 }
        L_0x024c:
            r0 = move-exception
            r19 = r4
        L_0x024f:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r4 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ LoadingException -> 0x0258 }
            java.lang.String r5 = "Failed to load remote module."
            r8 = 0
            r4.<init>(r5, r0, r8)     // Catch:{ LoadingException -> 0x0258 }
            throw r4     // Catch:{ LoadingException -> 0x0258 }
        L_0x0258:
            r0 = move-exception
            goto L_0x025d
        L_0x025a:
            r0 = move-exception
            r19 = r4
        L_0x025d:
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r5 = r0.getMessage()     // Catch:{ all -> 0x0304 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0304 }
            r8.<init>()     // Catch:{ all -> 0x0304 }
            java.lang.String r11 = "Failed to load remote module: "
            r8.append(r11)     // Catch:{ all -> 0x0304 }
            r8.append(r5)     // Catch:{ all -> 0x0304 }
            java.lang.String r5 = r8.toString()     // Catch:{ all -> 0x0304 }
            android.util.Log.w(r4, r5)     // Catch:{ all -> 0x0304 }
            int r4 = r13.f12843a     // Catch:{ all -> 0x0304 }
            if (r4 == 0) goto L_0x02b2
            com.google.android.gms.dynamite.l r5 = new com.google.android.gms.dynamite.l     // Catch:{ all -> 0x0304 }
            r8 = 0
            r5.<init>(r4, r8)     // Catch:{ all -> 0x0304 }
            com.google.android.gms.dynamite.DynamiteModule$a$b r1 = r2.mo12398a(r1, r3, r5)     // Catch:{ all -> 0x0304 }
            int r1 = r1.f12845c     // Catch:{ all -> 0x0304 }
            r2 = -1
            if (r1 != r2) goto L_0x02b2
            r1 = r19
            com.google.android.gms.dynamite.DynamiteModule r0 = m15261h(r1, r3)     // Catch:{ all -> 0x0304 }
            r1 = 0
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x029c
            java.lang.ThreadLocal r1 = f12837n
            r1.remove()
            goto L_0x02a5
        L_0x029c:
            java.lang.ThreadLocal r1 = f12837n
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            r1.set(r2)
        L_0x02a5:
            android.database.Cursor r1 = r7.f12846a
            if (r1 == 0) goto L_0x02ac
            r1.close()
        L_0x02ac:
            java.lang.ThreadLocal r1 = f12836m
            r1.set(r6)
            return r0
        L_0x02b2:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r1 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x0304 }
            java.lang.String r2 = "Remote load failed. No local fallback found."
            r3 = 0
            r1.<init>(r2, r0, r3)     // Catch:{ all -> 0x0304 }
            throw r1     // Catch:{ all -> 0x0304 }
        L_0x02bb:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x0304 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0304 }
            r1.<init>()     // Catch:{ all -> 0x0304 }
            java.lang.String r2 = "VersionPolicy returned invalid code:"
            r1.append(r2)     // Catch:{ all -> 0x0304 }
            r1.append(r5)     // Catch:{ all -> 0x0304 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0304 }
            r2 = 0
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0304 }
            throw r0     // Catch:{ all -> 0x0304 }
        L_0x02d3:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x0304 }
            int r1 = r13.f12843a     // Catch:{ all -> 0x0304 }
            int r2 = r13.f12844b     // Catch:{ all -> 0x0304 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0304 }
            r4.<init>()     // Catch:{ all -> 0x0304 }
            java.lang.String r5 = "No acceptable module "
            r4.append(r5)     // Catch:{ all -> 0x0304 }
            r4.append(r3)     // Catch:{ all -> 0x0304 }
            java.lang.String r3 = " found. Local version is "
            r4.append(r3)     // Catch:{ all -> 0x0304 }
            r4.append(r1)     // Catch:{ all -> 0x0304 }
            java.lang.String r1 = " and remote version is "
            r4.append(r1)     // Catch:{ all -> 0x0304 }
            r4.append(r2)     // Catch:{ all -> 0x0304 }
            java.lang.String r1 = "."
            r4.append(r1)     // Catch:{ all -> 0x0304 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0304 }
            r2 = 0
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0304 }
            throw r0     // Catch:{ all -> 0x0304 }
        L_0x0304:
            r0 = move-exception
            r1 = 0
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0311
            java.lang.ThreadLocal r1 = f12837n
            r1.remove()
            goto L_0x031a
        L_0x0311:
            java.lang.ThreadLocal r1 = f12837n
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            r1.set(r2)
        L_0x031a:
            android.database.Cursor r1 = r7.f12846a
            if (r1 == 0) goto L_0x0321
            r1.close()
        L_0x0321:
            java.lang.ThreadLocal r1 = f12836m
            r1.set(r6)
            throw r0
        L_0x0327:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException
            java.lang.String r1 = "null application Context"
            r2 = 0
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m15258e(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$a, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:31:0x0056=Splitter:B:31:0x0056, B:17:0x003b=Splitter:B:17:0x003b, B:50:0x009c=Splitter:B:50:0x009c} */
    /* renamed from: f */
    public static int m15259f(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x01c4 }
            java.lang.Boolean r1 = f12831h     // Catch:{ all -> 0x01c1 }
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x00da
            android.content.Context r1 = r10.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00bb, IllegalAccessException -> 0x00b9, NoSuchFieldException -> 0x00b7 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00bb, IllegalAccessException -> 0x00b9, NoSuchFieldException -> 0x00b7 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r4 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r4 = r4.getName()     // Catch:{ ClassNotFoundException -> 0x00bb, IllegalAccessException -> 0x00b9, NoSuchFieldException -> 0x00b7 }
            java.lang.Class r1 = r1.loadClass(r4)     // Catch:{ ClassNotFoundException -> 0x00bb, IllegalAccessException -> 0x00b9, NoSuchFieldException -> 0x00b7 }
            java.lang.String r4 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r4)     // Catch:{ ClassNotFoundException -> 0x00bb, IllegalAccessException -> 0x00b9, NoSuchFieldException -> 0x00b7 }
            java.lang.Class r4 = r1.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x00bb, IllegalAccessException -> 0x00b9, NoSuchFieldException -> 0x00b7 }
            monitor-enter(r4)     // Catch:{ ClassNotFoundException -> 0x00bb, IllegalAccessException -> 0x00b9, NoSuchFieldException -> 0x00b7 }
            java.lang.Object r5 = r1.get(r2)     // Catch:{ all -> 0x00b4 }
            java.lang.ClassLoader r5 = (java.lang.ClassLoader) r5     // Catch:{ all -> 0x00b4 }
            java.lang.ClassLoader r6 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b4 }
            if (r5 != r6) goto L_0x0036
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b4 }
            goto L_0x00b2
        L_0x0036:
            if (r5 == 0) goto L_0x003f
            m15262i(r5)     // Catch:{ LoadingException -> 0x003b }
        L_0x003b:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00b4 }
            goto L_0x00b2
        L_0x003f:
            boolean r5 = m15264k(r10)     // Catch:{ all -> 0x00b4 }
            if (r5 != 0) goto L_0x0048
            monitor-exit(r4)     // Catch:{ all -> 0x00b4 }
            monitor-exit(r0)     // Catch:{ all -> 0x01c1 }
            return r3
        L_0x0048:
            boolean r5 = f12833j     // Catch:{ all -> 0x00b4 }
            if (r5 != 0) goto L_0x00a9
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00b4 }
            boolean r6 = r5.equals(r2)     // Catch:{ all -> 0x00b4 }
            if (r6 == 0) goto L_0x0055
            goto L_0x00a9
        L_0x0055:
            r6 = 1
            int r6 = m15260g(r10, r11, r12, r6)     // Catch:{ LoadingException -> 0x009f }
            java.lang.String r7 = f12832i     // Catch:{ LoadingException -> 0x009f }
            if (r7 == 0) goto L_0x009c
            boolean r7 = r7.isEmpty()     // Catch:{ LoadingException -> 0x009f }
            if (r7 == 0) goto L_0x0065
            goto L_0x009c
        L_0x0065:
            java.lang.ClassLoader r7 = p312x6.C8969d.m33241a()     // Catch:{ LoadingException -> 0x009f }
            if (r7 == 0) goto L_0x006c
            goto L_0x0091
        L_0x006c:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ LoadingException -> 0x009f }
            r8 = 29
            if (r7 < r8) goto L_0x0083
            p312x6.C8967b.m33240a()     // Catch:{ LoadingException -> 0x009f }
            java.lang.String r7 = f12832i     // Catch:{ LoadingException -> 0x009f }
            p182n6.C7264i.m27902k(r7)     // Catch:{ LoadingException -> 0x009f }
            java.lang.ClassLoader r8 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x009f }
            dalvik.system.DelegateLastClassLoader r7 = p312x6.C8966a.m33239a(r7, r8)     // Catch:{ LoadingException -> 0x009f }
            goto L_0x0091
        L_0x0083:
            com.google.android.gms.dynamite.a r7 = new com.google.android.gms.dynamite.a     // Catch:{ LoadingException -> 0x009f }
            java.lang.String r8 = f12832i     // Catch:{ LoadingException -> 0x009f }
            p182n6.C7264i.m27902k(r8)     // Catch:{ LoadingException -> 0x009f }
            java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x009f }
            r7.<init>(r8, r9)     // Catch:{ LoadingException -> 0x009f }
        L_0x0091:
            m15262i(r7)     // Catch:{ LoadingException -> 0x009f }
            r1.set(r2, r7)     // Catch:{ LoadingException -> 0x009f }
            f12831h = r5     // Catch:{ LoadingException -> 0x009f }
            monitor-exit(r4)     // Catch:{ all -> 0x00b4 }
            monitor-exit(r0)     // Catch:{ all -> 0x01c1 }
            return r6
        L_0x009c:
            monitor-exit(r4)     // Catch:{ all -> 0x00b4 }
            monitor-exit(r0)     // Catch:{ all -> 0x01c1 }
            return r6
        L_0x009f:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b4 }
            r1.set(r2, r5)     // Catch:{ all -> 0x00b4 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b4 }
            goto L_0x00b2
        L_0x00a9:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b4 }
            r1.set(r2, r5)     // Catch:{ all -> 0x00b4 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b4 }
        L_0x00b2:
            monitor-exit(r4)     // Catch:{ all -> 0x00b4 }
            goto L_0x00d8
        L_0x00b4:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00b4 }
            throw r1     // Catch:{ ClassNotFoundException -> 0x00bb, IllegalAccessException -> 0x00b9, NoSuchFieldException -> 0x00b7 }
        L_0x00b7:
            r1 = move-exception
            goto L_0x00bc
        L_0x00b9:
            r1 = move-exception
            goto L_0x00bc
        L_0x00bb:
            r1 = move-exception
        L_0x00bc:
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01c1 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c1 }
            r5.<init>()     // Catch:{ all -> 0x01c1 }
            java.lang.String r6 = "Failed to load module via V2: "
            r5.append(r6)     // Catch:{ all -> 0x01c1 }
            r5.append(r1)     // Catch:{ all -> 0x01c1 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x01c1 }
            android.util.Log.w(r4, r1)     // Catch:{ all -> 0x01c1 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x01c1 }
        L_0x00d8:
            f12831h = r1     // Catch:{ all -> 0x01c1 }
        L_0x00da:
            monitor-exit(r0)     // Catch:{ all -> 0x01c1 }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x01c4 }
            if (r0 == 0) goto L_0x0102
            int r10 = m15260g(r10, r11, r12, r3)     // Catch:{ LoadingException -> 0x00e6 }
            return r10
        L_0x00e6:
            r11 = move-exception
            java.lang.String r12 = "DynamiteModule"
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x01c4 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c4 }
            r0.<init>()     // Catch:{ all -> 0x01c4 }
            java.lang.String r1 = "Failed to retrieve remote module version: "
            r0.append(r1)     // Catch:{ all -> 0x01c4 }
            r0.append(r11)     // Catch:{ all -> 0x01c4 }
            java.lang.String r11 = r0.toString()     // Catch:{ all -> 0x01c4 }
            android.util.Log.w(r12, r11)     // Catch:{ all -> 0x01c4 }
            return r3
        L_0x0102:
            com.google.android.gms.dynamite.m r4 = m15265l(r10)     // Catch:{ all -> 0x01c4 }
            if (r4 != 0) goto L_0x010a
            goto L_0x01b8
        L_0x010a:
            int r0 = r4.mo12409y()     // Catch:{ RemoteException -> 0x0197 }
            r1 = 3
            if (r0 < r1) goto L_0x0172
            java.lang.ThreadLocal r0 = f12836m     // Catch:{ RemoteException -> 0x0197 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0197 }
            com.google.android.gms.dynamite.k r0 = (com.google.android.gms.dynamite.C4027k) r0     // Catch:{ RemoteException -> 0x0197 }
            if (r0 == 0) goto L_0x0125
            android.database.Cursor r0 = r0.f12846a     // Catch:{ RemoteException -> 0x0197 }
            if (r0 == 0) goto L_0x0125
            int r3 = r0.getInt(r3)     // Catch:{ RemoteException -> 0x0197 }
            goto L_0x01b8
        L_0x0125:
            w6.b r5 = p299w6.C8862d.m32984T1(r10)     // Catch:{ RemoteException -> 0x0197 }
            java.lang.ThreadLocal r0 = f12837n     // Catch:{ RemoteException -> 0x0197 }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0197 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ RemoteException -> 0x0197 }
            long r8 = r0.longValue()     // Catch:{ RemoteException -> 0x0197 }
            r6 = r11
            r7 = r12
            w6.b r11 = r4.mo12407E2(r5, r6, r7, r8)     // Catch:{ RemoteException -> 0x0197 }
            java.lang.Object r11 = p299w6.C8862d.m32985y(r11)     // Catch:{ RemoteException -> 0x0197 }
            android.database.Cursor r11 = (android.database.Cursor) r11     // Catch:{ RemoteException -> 0x0197 }
            if (r11 == 0) goto L_0x015f
            boolean r12 = r11.moveToFirst()     // Catch:{ RemoteException -> 0x016f, all -> 0x016c }
            if (r12 != 0) goto L_0x014a
            goto L_0x015f
        L_0x014a:
            int r12 = r11.getInt(r3)     // Catch:{ RemoteException -> 0x016f, all -> 0x016c }
            if (r12 <= 0) goto L_0x0157
            boolean r0 = m15263j(r11)     // Catch:{ RemoteException -> 0x016f, all -> 0x016c }
            if (r0 == 0) goto L_0x0157
            goto L_0x0158
        L_0x0157:
            r2 = r11
        L_0x0158:
            if (r2 == 0) goto L_0x015d
            r2.close()     // Catch:{ all -> 0x01c4 }
        L_0x015d:
            r3 = r12
            goto L_0x01b8
        L_0x015f:
            java.lang.String r12 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r12, r0)     // Catch:{ RemoteException -> 0x016f, all -> 0x016c }
            if (r11 == 0) goto L_0x01b8
            r11.close()     // Catch:{ all -> 0x01c4 }
            goto L_0x01b8
        L_0x016c:
            r12 = move-exception
            r2 = r11
            goto L_0x01bb
        L_0x016f:
            r12 = move-exception
            r2 = r11
            goto L_0x0199
        L_0x0172:
            r1 = 2
            if (r0 != r1) goto L_0x0185
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r1 = "IDynamite loader version = 2, no high precision latency measurement."
            android.util.Log.w(r0, r1)     // Catch:{ RemoteException -> 0x0197 }
            w6.b r0 = p299w6.C8862d.m32984T1(r10)     // Catch:{ RemoteException -> 0x0197 }
            int r3 = r4.mo12403A2(r0, r11, r12)     // Catch:{ RemoteException -> 0x0197 }
            goto L_0x01b8
        L_0x0185:
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r1 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r0, r1)     // Catch:{ RemoteException -> 0x0197 }
            w6.b r0 = p299w6.C8862d.m32984T1(r10)     // Catch:{ RemoteException -> 0x0197 }
            int r3 = r4.mo12408T1(r0, r11, r12)     // Catch:{ RemoteException -> 0x0197 }
            goto L_0x01b8
        L_0x0195:
            r12 = r11
            goto L_0x01bb
        L_0x0197:
            r11 = move-exception
            r12 = r11
        L_0x0199:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = r12.getMessage()     // Catch:{ all -> 0x01b9 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b9 }
            r0.<init>()     // Catch:{ all -> 0x01b9 }
            java.lang.String r1 = "Failed to retrieve remote module version: "
            r0.append(r1)     // Catch:{ all -> 0x01b9 }
            r0.append(r12)     // Catch:{ all -> 0x01b9 }
            java.lang.String r12 = r0.toString()     // Catch:{ all -> 0x01b9 }
            android.util.Log.w(r11, r12)     // Catch:{ all -> 0x01b9 }
            if (r2 == 0) goto L_0x01b8
            r2.close()     // Catch:{ all -> 0x01c4 }
        L_0x01b8:
            return r3
        L_0x01b9:
            r11 = move-exception
            goto L_0x0195
        L_0x01bb:
            if (r2 == 0) goto L_0x01c0
            r2.close()     // Catch:{ all -> 0x01c4 }
        L_0x01c0:
            throw r12     // Catch:{ all -> 0x01c4 }
        L_0x01c1:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01c1 }
            throw r11     // Catch:{ all -> 0x01c4 }
        L_0x01c4:
            r11 = move-exception
            p260t6.C8406h.m31543a(r10, r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m15259f(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00bc A[Catch:{ all -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00bd A[Catch:{ all -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00dc  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m15260g(android.content.Context r10, java.lang.String r11, boolean r12, boolean r13) {
        /*
            r0 = 0
            java.lang.ThreadLocal r1 = f12837n     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L_0x0019
            r10 = r4
        L_0x0019:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            r12.<init>()     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            android.net.Uri r4 = r10.build()     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00b5, all -> 0x00b2 }
            if (r10 == 0) goto L_0x00a3
            boolean r11 = r10.moveToFirst()     // Catch:{ Exception -> 0x009b }
            if (r11 == 0) goto L_0x00a3
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch:{ Exception -> 0x009b }
            if (r12 <= 0) goto L_0x008e
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch:{ Exception -> 0x009b }
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch:{ all -> 0x008b }
            f12832i = r2     // Catch:{ all -> 0x008b }
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008b }
            if (r2 < 0) goto L_0x006f
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008b }
            f12834k = r2     // Catch:{ all -> 0x008b }
        L_0x006f:
            java.lang.String r2 = "disableStandaloneDynamiteLoader2"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008b }
            if (r2 < 0) goto L_0x0082
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r9 = r11
        L_0x007f:
            f12833j = r9     // Catch:{ all -> 0x008b }
            r11 = r9
        L_0x0082:
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            boolean r1 = m15263j(r10)     // Catch:{ Exception -> 0x009b }
            if (r1 == 0) goto L_0x008e
            r10 = r0
            goto L_0x008e
        L_0x008b:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x008e:
            if (r13 == 0) goto L_0x009d
            if (r11 != 0) goto L_0x0093
            goto L_0x009d
        L_0x0093:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x009b }
            java.lang.String r12 = "forcing fallback to container DynamiteLoader impl"
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x009b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x009b:
            r11 = move-exception
            goto L_0x00b8
        L_0x009d:
            if (r10 == 0) goto L_0x00a2
            r10.close()
        L_0x00a2:
            return r12
        L_0x00a3:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r12)     // Catch:{ Exception -> 0x009b }
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x009b }
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x009b }
            throw r11     // Catch:{ Exception -> 0x009b }
        L_0x00b2:
            r10 = move-exception
            r11 = r10
            goto L_0x00da
        L_0x00b5:
            r10 = move-exception
            r11 = r10
            r10 = r0
        L_0x00b8:
            boolean r12 = r11 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch:{ all -> 0x00d8 }
            if (r12 == 0) goto L_0x00bd
            throw r11     // Catch:{ all -> 0x00d8 }
        L_0x00bd:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r12 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x00d8 }
            java.lang.String r13 = r11.getMessage()     // Catch:{ all -> 0x00d8 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d8 }
            r1.<init>()     // Catch:{ all -> 0x00d8 }
            java.lang.String r2 = "V2 version check failed: "
            r1.append(r2)     // Catch:{ all -> 0x00d8 }
            r1.append(r13)     // Catch:{ all -> 0x00d8 }
            java.lang.String r13 = r1.toString()     // Catch:{ all -> 0x00d8 }
            r12.<init>(r13, r11, r0)     // Catch:{ all -> 0x00d8 }
            throw r12     // Catch:{ all -> 0x00d8 }
        L_0x00d8:
            r11 = move-exception
            r0 = r10
        L_0x00da:
            if (r0 == 0) goto L_0x00df
            r0.close()
        L_0x00df:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m15260g(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    /* renamed from: h */
    private static DynamiteModule m15261h(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    /* renamed from: i */
    private static void m15262i(ClassLoader classLoader) {
        C4030n nVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                nVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof C4030n) {
                    nVar = (C4030n) queryLocalInterface;
                } else {
                    nVar = new C4030n(iBinder);
                }
            }
            f12841r = nVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new LoadingException("Failed to instantiate dynamite loader", e, (C8971f) null);
        }
    }

    /* renamed from: j */
    private static boolean m15263j(Cursor cursor) {
        C4027k kVar = (C4027k) f12836m.get();
        if (kVar == null || kVar.f12846a != null) {
            return false;
        }
        kVar.f12846a = cursor;
        return true;
    }

    /* renamed from: k */
    private static boolean m15264k(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals((Object) null) || bool.equals(f12835l)) {
            return true;
        }
        boolean z = false;
        if (f12835l == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (C3941b.m14941h().mo11873j(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            f12835l = valueOf;
            z = valueOf.booleanValue();
            if (z && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f12833j = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    /* renamed from: l */
    private static C4029m m15265l(Context context) {
        C4029m mVar;
        synchronized (DynamiteModule.class) {
            C4029m mVar2 = f12840q;
            if (mVar2 != null) {
                return mVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    mVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof C4029m) {
                        mVar = (C4029m) queryLocalInterface;
                    } else {
                        mVar = new C4029m(iBinder);
                    }
                }
                if (mVar != null) {
                    f12840q = mVar;
                    return mVar;
                }
            } catch (Exception e) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e.getMessage());
            }
        }
        return null;
    }

    /* renamed from: b */
    public Context mo12396b() {
        return this.f12842a;
    }

    /* renamed from: d */
    public IBinder mo12397d(String str) {
        try {
            return (IBinder) this.f12842a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e, (C8971f) null);
        }
    }
}
