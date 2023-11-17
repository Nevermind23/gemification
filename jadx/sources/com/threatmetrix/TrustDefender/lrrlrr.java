package com.threatmetrix.TrustDefender;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.threatmetrix.TrustDefender.C11879b0;
import com.threatmetrix.TrustDefender.C11907h;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public abstract class lrrlrr {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f34917a = C11907h.m43615j(lrrlrr.class);

    /* renamed from: b */
    public static final lrlrrr f34918b;

    /* renamed from: c */
    private static String f34919c = null;

    /* renamed from: com.threatmetrix.TrustDefender.lrrlrr$a */
    public interface C11930a {
        /* renamed from: a */
        void mo31927a();

        /* renamed from: b */
        void mo31928b();
    }

    /* renamed from: com.threatmetrix.TrustDefender.lrrlrr$b */
    public static class C11931b {

        /* renamed from: a */
        public final Object f34920a;

        /* renamed from: b */
        public final Object f34921b;

        /* renamed from: c */
        public final Object f34922c;

        /* renamed from: d */
        public final Object f34923d;

        /* renamed from: e */
        public final Object f34924e;

        public C11931b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            this.f34920a = obj;
            this.f34921b = obj2;
            this.f34922c = obj3;
            this.f34923d = obj4;
            this.f34924e = obj5;
        }

        /* renamed from: a */
        public void mo31982a(InvocationHandler invocationHandler) {
            Object a;
            lrlrrr lrlrrr = lrrlrr.f34918b;
            if (lrlrrr != null && (a = C11879b0.m43529a(C11879b0.m43535g((Object) null, lrlrrr.f34964s), lrlrrr.f34937L, this.f34920a, this.f34923d)) != null) {
                Object d = C11879b0.m43532d(lrlrrr.f34960o.getClassLoader(), new Class[]{lrlrrr.f34960o}, invocationHandler);
                C11879b0.m43529a(a, lrlrrr.f34939N, d);
            }
        }

        /* renamed from: b */
        public void mo31983b(Object obj, Object obj2, InvocationHandler invocationHandler, Looper looper) {
            Object a;
            lrlrrr lrlrrr = lrrlrr.f34918b;
            if (lrlrrr != null && (a = C11879b0.m43529a(C11879b0.m43535g((Object) null, lrlrrr.f34964s), lrlrrr.f34936K, this.f34920a, obj, obj2, looper)) != null) {
                Object d = C11879b0.m43532d(lrlrrr.f34960o.getClassLoader(), new Class[]{lrlrrr.f34960o}, invocationHandler);
                C11879b0.m43529a(a, lrlrrr.f34939N, d);
            }
        }

        /* renamed from: c */
        public void mo31984c(InvocationHandler invocationHandler, Looper looper) {
            mo31983b(this.f34921b, this.f34923d, invocationHandler, looper);
            mo31983b(this.f34922c, this.f34924e, invocationHandler, looper);
        }
    }

    /* renamed from: com.threatmetrix.TrustDefender.lrrlrr$c */
    public private static class C11932c implements InvocationHandler {

        /* renamed from: a */
        public final C11930a f34925a;

        public C11932c(C11930a aVar) {
            this.f34925a = aVar;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            if ("onConnected".equals(method.getName())) {
                C11930a aVar = this.f34925a;
                if (aVar != null) {
                    aVar.mo31928b();
                }
                return null;
            } else if ("onConnectionSuspended".equals(method.getName())) {
                if (objArr != null && objArr.length > 0) {
                    String f = lrrlrr.f34917a;
                    C11907h.m43610e(f, "Connection to the Google Service is suspended, the error code is " + objArr[0]);
                }
                C11930a aVar2 = this.f34925a;
                if (aVar2 != null) {
                    aVar2.mo31927a();
                }
                return null;
            } else if (!"onConnectionFailed".equals(method.getName())) {
                return lrrlrr.m43775c(this, method, objArr);
            } else {
                if (objArr != null && objArr.length > 0) {
                    String f2 = lrrlrr.f34917a;
                    C11907h.m43610e(f2, "Connection to the Google Service is failed. The error code is " + objArr[0]);
                }
                C11930a aVar3 = this.f34925a;
                if (aVar3 != null) {
                    aVar3.mo31927a();
                }
                return null;
            }
        }
    }

    public static class lrlrrr {

        /* renamed from: A */
        public final Method f34926A;

        /* renamed from: B */
        public final Method f34927B;

        /* renamed from: C */
        public final Method f34928C;

        /* renamed from: D */
        public final Method f34929D;

        /* renamed from: E */
        public final Method f34930E;

        /* renamed from: F */
        public final Method f34931F;

        /* renamed from: G */
        public final Method f34932G;

        /* renamed from: H */
        public final Method f34933H;

        /* renamed from: I */
        public final Method f34934I;

        /* renamed from: J */
        public final Method f34935J;

        /* renamed from: K */
        public final Method f34936K;

        /* renamed from: L */
        public final Method f34937L;

        /* renamed from: M */
        public final Method f34938M;

        /* renamed from: N */
        public final Method f34939N;

        /* renamed from: O */
        public final Method f34940O;

        /* renamed from: P */
        public final Method f34941P;

        /* renamed from: Q */
        public final Method f34942Q;

        /* renamed from: R */
        public final Object f34943R;

        /* renamed from: S */
        public final Object f34944S;

        /* renamed from: T */
        public final Object f34945T;

        /* renamed from: a */
        public final Class f34946a;

        /* renamed from: b */
        public final Class f34947b;

        /* renamed from: c */
        public final Class f34948c;

        /* renamed from: d */
        public final Class f34949d;

        /* renamed from: e */
        public final Class f34950e;

        /* renamed from: f */
        public final Class f34951f;

        /* renamed from: g */
        public final Class f34952g;

        /* renamed from: h */
        public final Class f34953h;

        /* renamed from: i */
        public final Class f34954i;

        /* renamed from: j */
        public final Class f34955j;

        /* renamed from: k */
        public final Class f34956k;

        /* renamed from: l */
        public final Class f34957l;

        /* renamed from: m */
        public final Class f34958m;

        /* renamed from: n */
        public final Class f34959n;

        /* renamed from: o */
        public final Class f34960o;

        /* renamed from: p */
        public final Field f34961p;

        /* renamed from: q */
        public final Field f34962q;

        /* renamed from: r */
        public final Field f34963r;

        /* renamed from: s */
        public final Field f34964s;

        /* renamed from: t */
        public final Field f34965t;

        /* renamed from: u */
        public final Field f34966u;

        /* renamed from: v */
        public final Field f34967v;

        /* renamed from: w */
        public final Field f34968w;

        /* renamed from: x */
        public final Method f34969x;

        /* renamed from: y */
        public final Method f34970y;

        /* renamed from: z */
        public final Method f34971z;

        public class rrlrrr extends Exception {
            public rrlrrr() {
            }
        }

        public lrlrrr() {
            Method method;
            lrlrrr lrlrrr;
            Class i = C11879b0.m43537i(C11879b0.C11880a.GOOGLE_PLAY_UTILS);
            Class i2 = C11879b0.m43537i(C11879b0.C11880a.GOOGLE_AVAILABILITY);
            Class i3 = C11879b0.m43537i(C11879b0.C11880a.GOOGLE_API_BUILDER);
            Class i4 = C11879b0.m43537i(C11879b0.C11880a.GOOGLE_CONNECTION_CALL_BACK);
            Class i5 = C11879b0.m43537i(C11879b0.C11880a.GOOGLE_FAILED_CALL_BACK);
            Class i6 = C11879b0.m43537i(C11879b0.C11880a.GOOGLE_LOCATION_SERVICES);
            Class i7 = C11879b0.m43537i(C11879b0.C11880a.GOOGLE_API);
            Class i8 = C11879b0.m43537i(C11879b0.C11880a.GOOGLE_API_CLIENT);
            Class i9 = C11879b0.m43537i(C11879b0.C11880a.GOOGLE_LOCATION_REQUEST);
            Class i12 = C11879b0.m43537i(C11879b0.C11880a.GOOGLE_LOCATION_LISTENER);
            Class i13 = C11879b0.m43537i(C11879b0.C11880a.GOOGLE_PENDING_RESULT);
            Class i14 = C11879b0.m43537i(C11879b0.C11880a.GOOGLE_STATUS);
            Class i15 = C11879b0.m43537i(C11879b0.C11880a.GOOGLE_RESULT_CALL_BACK);
            Class i16 = C11879b0.m43537i(C11879b0.C11880a.GOOGLE_SAFETY_NET);
            Class i17 = C11879b0.m43537i(C11879b0.C11880a.GOOGLE_SAFETY_NET_API);
            Class i18 = C11879b0.m43537i(C11879b0.C11880a.GOOGLE_SAFETY_NET_ATTEST_RESULT);
            if ((i == null && i2 == null) || i3 == null || i4 == null || i5 == null || i6 == null || i7 == null || i8 == null || i9 == null || i12 == null || i13 == null || i14 == null || i15 == null || i16 == null || i17 == null || i18 == null) {
                throw new rrlrrr();
            }
            this.f34946a = i;
            this.f34947b = i2;
            this.f34948c = i3;
            this.f34949d = i4;
            this.f34950e = i5;
            this.f34954i = i6;
            this.f34951f = i7;
            this.f34955j = i8;
            this.f34956k = i9;
            this.f34957l = i12;
            this.f34958m = i13;
            this.f34959n = i14;
            this.f34960o = i15;
            this.f34952g = i16;
            this.f34953h = i18;
            Class cls = i;
            Class cls2 = i2;
            Field f = C11879b0.m43534f(i16, "API");
            Class cls3 = i18;
            Field f2 = C11879b0.m43534f(i16, "SafetyNetApi");
            Field f3 = C11879b0.m43534f(i6, "API");
            Field f4 = C11879b0.m43534f(i6, "FusedLocationApi");
            Field f5 = C11879b0.m43534f(i9, "PRIORITY_NO_POWER");
            Class cls4 = i12;
            Field f6 = C11879b0.m43534f(i9, "PRIORITY_LOW_POWER");
            Class cls5 = i13;
            Field f7 = C11879b0.m43534f(i9, "PRIORITY_HIGH_ACCURACY");
            Class cls6 = i15;
            Field f8 = C11879b0.m43534f(i9, "PRIORITY_BALANCED_POWER_ACCURACY");
            if (f3 == null || f4 == null || f5 == null || f6 == null || f7 == null || f8 == null || f == null || f2 == null) {
                throw new rrlrrr();
            }
            this.f34961p = f;
            this.f34962q = f2;
            this.f34963r = f3;
            this.f34964s = f4;
            this.f34965t = f5;
            this.f34966u = f6;
            this.f34967v = f7;
            this.f34968w = f8;
            Field field = f8;
            Method j = C11879b0.m43538j(i3, "build", new Class[0]);
            Field field2 = f7;
            Method j2 = C11879b0.m43538j(i3, "addApi", i7);
            Method j3 = C11879b0.m43538j(i3, "addConnectionCallbacks", i4);
            Method j4 = C11879b0.m43538j(i3, "addOnConnectionFailedListener", i5);
            Method j5 = C11879b0.m43538j(i3, "setHandler", Handler.class);
            Method j6 = C11879b0.m43538j(i8, "connect", new Class[0]);
            Field field3 = f6;
            Method j7 = C11879b0.m43538j(i8, "disconnect", new Class[0]);
            Field field4 = f5;
            Method j8 = C11879b0.m43538j(i14, "isSuccess", new Class[0]);
            Method j9 = C11879b0.m43538j(cls5, "setResultCallback", cls6);
            Method j12 = C11879b0.m43538j(i9, "setPriority", Integer.TYPE);
            Method method2 = j5;
            Class cls7 = Long.TYPE;
            Method j13 = C11879b0.m43538j(i9, "setInterval", cls7);
            Method j14 = C11879b0.m43538j(i9, "setFastestInterval", cls7);
            Method method3 = j9;
            Method method4 = j4;
            Method j15 = C11879b0.m43538j(f4.getType(), "getLastLocation", i8);
            Method method5 = j15;
            Method j16 = C11879b0.m43538j(f4.getType(), "requestLocationUpdates", i8, i9, cls4, Looper.class);
            Method j17 = C11879b0.m43538j(f4.getType(), "removeLocationUpdates", i8, cls4);
            Method j18 = C11879b0.m43538j(f2.getType(), "attest", i8, byte[].class);
            Class cls8 = cls3;
            Method j19 = C11879b0.m43538j(cls8, "getStatus", new Class[0]);
            Method j22 = C11879b0.m43538j(cls8, "getJwsResult", new Class[0]);
            if (j == null || j6 == null || j8 == null || j7 == null || j2 == null || j12 == null || j13 == null || j14 == null || j3 == null || method4 == null || method3 == null || method5 == null || j16 == null || j17 == null || j18 == null || j19 == null || j22 == null || method2 == null) {
                throw new rrlrrr();
            }
            Class<Context> cls9 = Context.class;
            Method method6 = j22;
            Class cls10 = cls2;
            Method j23 = C11879b0.m43538j(cls10, "isGooglePlayServicesAvailable", cls9);
            Method method7 = j18;
            Method method8 = j17;
            Method j24 = C11879b0.m43538j(cls10, "getInstance", new Class[0]);
            if (j24 == null) {
                method = C11879b0.m43538j(cls, "isGooglePlayServicesAvailable", cls9);
                if (method != null) {
                    lrlrrr = this;
                } else {
                    throw new rrlrrr();
                }
            } else {
                lrlrrr = this;
                method = j23;
            }
            lrlrrr.f34929D = j;
            lrlrrr.f34931F = j6;
            lrlrrr.f34940O = j8;
            lrlrrr.f34932G = j7;
            lrlrrr.f34927B = j2;
            lrlrrr.f34928C = method2;
            lrlrrr.f34935J = j12;
            lrlrrr.f34933H = j13;
            lrlrrr.f34934I = j14;
            lrlrrr.f34971z = j3;
            lrlrrr.f34926A = method4;
            lrlrrr.f34939N = method3;
            lrlrrr.f34970y = method;
            lrlrrr.f34969x = j24;
            lrlrrr.f34936K = j16;
            lrlrrr.f34937L = method8;
            lrlrrr.f34938M = method5;
            lrlrrr.f34930E = method7;
            lrlrrr.f34941P = j19;
            lrlrrr.f34942Q = method6;
            Object g = C11879b0.m43535g((Object) null, field4);
            Object g2 = C11879b0.m43535g((Object) null, field3);
            Object g3 = C11879b0.m43535g((Object) null, field2);
            Object g4 = C11879b0.m43535g((Object) null, field);
            if (g == null || g2 == null || g3 == null || g4 == null) {
                throw new rrlrrr();
            }
            lrlrrr.f34943R = g;
            lrlrrr.f34944S = g3;
            lrlrrr.f34945T = g4;
        }
    }

    static {
        lrlrrr lrlrrr2 = null;
        try {
            lrlrrr2 = new lrlrrr();
        } catch (lrlrrr.rrlrrr unused) {
            C11907h.C11908a.m43624b(f34917a, "Can't get all requirements via reflection");
        }
        f34918b = lrlrrr2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        r8 = com.threatmetrix.TrustDefender.C11879b0.m43532d(r0.f34950e.getClassLoader(), new java.lang.Class[]{r0.f34950e}, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        r8 = com.threatmetrix.TrustDefender.C11879b0.m43532d(r0.f34949d.getClassLoader(), new java.lang.Class[]{r0.f34949d}, r2);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object m43773a(android.content.Context r7, com.threatmetrix.TrustDefender.lrrlrr.C11930a r8, android.os.Handler r9) {
        /*
            com.threatmetrix.TrustDefender.lrrlrr$lrlrrr r0 = f34918b
            r1 = 0
            if (r0 == 0) goto L_0x00a7
            boolean r2 = m43776d(r7)
            if (r2 == 0) goto L_0x00a7
            com.threatmetrix.TrustDefender.lrrlrr$c r2 = new com.threatmetrix.TrustDefender.lrrlrr$c
            r2.<init>(r8)
            java.lang.Class r8 = r0.f34948c
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r6] = r7
            java.lang.Object r7 = com.threatmetrix.TrustDefender.C11879b0.m43530b(r8, r4, r5)
            if (r7 != 0) goto L_0x0025
            return r1
        L_0x0025:
            java.lang.Class r8 = r0.f34949d
            java.lang.ClassLoader r8 = r8.getClassLoader()
            java.lang.Class[] r4 = new java.lang.Class[r3]
            java.lang.Class r5 = r0.f34949d
            r4[r6] = r5
            java.lang.Object r8 = com.threatmetrix.TrustDefender.C11879b0.m43532d(r8, r4, r2)
            java.lang.reflect.Method r4 = r0.f34971z
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r6] = r8
            java.lang.Object r7 = com.threatmetrix.TrustDefender.C11879b0.m43529a(r7, r4, r5)
            if (r7 != 0) goto L_0x0042
            return r1
        L_0x0042:
            java.lang.Class r8 = r0.f34950e
            java.lang.ClassLoader r8 = r8.getClassLoader()
            java.lang.Class[] r4 = new java.lang.Class[r3]
            java.lang.Class r5 = r0.f34950e
            r4[r6] = r5
            java.lang.Object r8 = com.threatmetrix.TrustDefender.C11879b0.m43532d(r8, r4, r2)
            java.lang.reflect.Method r2 = r0.f34926A
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r6] = r8
            java.lang.Object r7 = com.threatmetrix.TrustDefender.C11879b0.m43529a(r7, r2, r4)
            if (r7 != 0) goto L_0x005f
            return r1
        L_0x005f:
            java.lang.reflect.Method r8 = r0.f34927B
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.reflect.Field r4 = r0.f34963r
            java.lang.Object r4 = com.threatmetrix.TrustDefender.C11879b0.m43535g(r1, r4)
            r2[r6] = r4
            java.lang.Object r7 = com.threatmetrix.TrustDefender.C11879b0.m43529a(r7, r8, r2)
            if (r7 != 0) goto L_0x0072
            return r1
        L_0x0072:
            java.lang.reflect.Method r8 = r0.f34927B
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.reflect.Field r4 = r0.f34961p
            java.lang.Object r4 = com.threatmetrix.TrustDefender.C11879b0.m43535g(r1, r4)
            r2[r6] = r4
            java.lang.Object r7 = com.threatmetrix.TrustDefender.C11879b0.m43529a(r7, r8, r2)
            if (r7 != 0) goto L_0x0085
            return r1
        L_0x0085:
            if (r9 == 0) goto L_0x0094
            java.lang.reflect.Method r8 = r0.f34928C
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r2[r6] = r9
            java.lang.Object r7 = com.threatmetrix.TrustDefender.C11879b0.m43529a(r7, r8, r2)
            if (r7 != 0) goto L_0x0094
            return r1
        L_0x0094:
            java.lang.reflect.Method r8 = r0.f34929D
            java.lang.Object[] r9 = new java.lang.Object[r6]
            java.lang.Object r7 = com.threatmetrix.TrustDefender.C11879b0.m43529a(r7, r8, r9)
            if (r7 != 0) goto L_0x009f
            return r1
        L_0x009f:
            java.lang.reflect.Method r8 = r0.f34931F
            java.lang.Object[] r9 = new java.lang.Object[r6]
            com.threatmetrix.TrustDefender.C11879b0.m43529a(r7, r8, r9)
            return r7
        L_0x00a7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.threatmetrix.TrustDefender.lrrlrr.m43773a(android.content.Context, com.threatmetrix.TrustDefender.lrrlrr$a, android.os.Handler):java.lang.Object");
    }

    /* renamed from: b */
    public static boolean m43774b(Object obj) {
        Object a;
        lrlrrr lrlrrr2 = f34918b;
        if (lrlrrr2 == null || (a = C11879b0.m43529a(obj, lrlrrr2.f34941P, new Object[0])) == null) {
            return false;
        }
        Object a2 = C11879b0.m43529a(a, lrlrrr2.f34940O, new Object[0]);
        return (a2 instanceof Boolean) && ((Boolean) a2).booleanValue();
    }

    /* renamed from: c */
    public static Object m43775c(Object obj, Method method, Object[] objArr) {
        if ("toString".equals(method.getName())) {
            return method.getName();
        }
        if ("hashCode".equals(method.getName())) {
            return Integer.valueOf(obj.hashCode());
        }
        if (!"equals".equals(method.getName())) {
            return null;
        }
        boolean z = true;
        if (objArr != null && objArr.length == 2 && !objArr[0].equals(objArr[1])) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: d */
    public static boolean m43776d(Context context) {
        Object a;
        lrlrrr lrlrrr2 = f34918b;
        if (context == null) {
            C11907h.m43622q(f34917a, "Null context");
            return false;
        } else if (lrlrrr2 == null) {
            return false;
        } else {
            Object a2 = C11879b0.m43529a((Object) null, lrlrrr2.f34969x, new Object[0]);
            if (a2 != null && (a = C11879b0.m43529a(a2, lrlrrr2.f34970y, context)) != null && a.equals(0)) {
                return true;
            }
            Object a3 = C11879b0.m43529a((Object) null, lrlrrr2.f34970y, context);
            return a3 != null && a3.equals(0);
        }
    }

    /* renamed from: e */
    public static String m43777e(Context context) {
        Object a;
        if (f34919c == null && m43776d(context)) {
            Class i = C11879b0.m43537i(C11879b0.C11880a.GOOGLE_ADVERTISING_ID);
            Class i2 = C11879b0.m43537i(C11879b0.C11880a.GOOGLE_ADVERTISING_INFO);
            Method j = C11879b0.m43538j(i2, "getId", new Class[0]);
            Method j2 = C11879b0.m43538j(i, "getAdvertisingIdInfo", Context.class);
            if (i == null || i2 == null || j == null || j2 == null) {
                return null;
            }
            Object a2 = C11879b0.m43529a((Object) null, j2, context);
            if (!(a2 == null || (a = C11879b0.m43529a(a2, j, new Object[0])) == null)) {
                f34919c = String.valueOf(a);
            }
        }
        return f34919c;
    }

    /* renamed from: g */
    private static int m43779g(int i) {
        lrlrrr lrlrrr2 = f34918b;
        int i2 = 102;
        if (lrlrrr2 != null) {
            i2 = (i == 1 || i == 2 || i != 3) ? lrlrrr2.f34945T : lrlrrr2.f34944S;
        }
        return ((Integer) i2).intValue();
    }

    /* renamed from: h */
    public static C11931b m43780h(Context context, long j, long j2, int i, C11930a aVar, InvocationHandler invocationHandler, InvocationHandler invocationHandler2, Handler handler) {
        Object a;
        lrlrrr lrlrrr2 = f34918b;
        if (lrlrrr2 == null || (a = m43773a(context, aVar, handler)) == null) {
            return null;
        }
        Object j3 = m43782j(j, j2, m43779g(i));
        Object j4 = m43782j(j, j2, ((Integer) lrlrrr2.f34943R).intValue());
        if (!(j3 == null || j4 == null)) {
            return new C11931b(a, j3, j4, C11879b0.m43532d(lrlrrr2.f34957l.getClassLoader(), new Class[]{lrlrrr2.f34957l}, invocationHandler), C11879b0.m43532d(lrlrrr2.f34957l.getClassLoader(), new Class[]{lrlrrr2.f34957l}, invocationHandler2));
        }
        return null;
    }

    /* renamed from: i */
    public static void m43781i(Context context, byte[] bArr, InvocationHandler invocationHandler) {
        lrlrrr lrlrrr2 = f34918b;
        Object a = m43773a(context, (C11930a) null, (Handler) null);
        if (lrlrrr2 != null && a != null) {
            Object a2 = C11879b0.m43529a(C11879b0.m43535g((Object) null, lrlrrr2.f34962q), lrlrrr2.f34930E, a, bArr);
            Object d = C11879b0.m43532d(lrlrrr2.f34960o.getClassLoader(), new Class[]{lrlrrr2.f34960o}, invocationHandler);
            C11879b0.m43529a(a2, lrlrrr2.f34939N, d);
        }
    }

    /* renamed from: j */
    private static Object m43782j(long j, long j2, int i) {
        lrlrrr lrlrrr2 = f34918b;
        if (lrlrrr2 == null) {
            return null;
        }
        Object b = C11879b0.m43530b(lrlrrr2.f34956k, (Class[]) null, (Object[]) null);
        C11879b0.m43529a(b, lrlrrr2.f34933H, Long.valueOf(j));
        C11879b0.m43529a(b, lrlrrr2.f34934I, Long.valueOf(j2));
        C11879b0.m43529a(b, lrlrrr2.f34935J, Integer.valueOf(i));
        return b;
    }
}
