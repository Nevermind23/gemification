package p209p7;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.C3942c;
import com.google.android.gms.dynamite.DynamiteModule;
import p196o7.C7474d;

/* renamed from: p7.u */
public abstract class C7756u {

    /* renamed from: a */
    private static final String f22449a = "u";

    /* renamed from: b */
    private static Context f22450b;

    /* renamed from: c */
    private static C7758w f22451c;

    /* JADX WARNING: type inference failed for: r1v8, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p209p7.C7758w m29412a(android.content.Context r3, p196o7.C7474d.C7475a r4) {
        /*
            p182n6.C7264i.m27902k(r3)
            java.lang.String r0 = f22449a
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r2 = "preferredRenderer: "
            java.lang.String r1 = r2.concat(r1)
            android.util.Log.d(r0, r1)
            p7.w r1 = f22451c
            if (r1 != 0) goto L_0x0084
            r1 = 13400000(0xcc77c0, float:1.87774E-38)
            int r1 = com.google.android.gms.common.C3942c.m14957h(r3, r1)
            if (r1 != 0) goto L_0x007e
            java.lang.String r1 = "Making Creator dynamically"
            android.util.Log.i(r0, r1)
            android.content.Context r0 = m29414c(r3, r4)
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.String r1 = "com.google.android.gms.maps.internal.CreatorImpl"
            java.lang.Object r0 = p182n6.C7264i.m27902k(r0)     // Catch:{ ClassNotFoundException -> 0x0076 }
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0     // Catch:{ ClassNotFoundException -> 0x0076 }
            java.lang.Class r0 = r0.loadClass(r1)     // Catch:{ ClassNotFoundException -> 0x0076 }
            java.lang.Object r0 = m29415d(r0)     // Catch:{ ClassNotFoundException -> 0x0076 }
            android.os.IBinder r0 = (android.os.IBinder) r0
            if (r0 != 0) goto L_0x0042
            r0 = 0
            goto L_0x0056
        L_0x0042:
            java.lang.String r1 = "com.google.android.gms.maps.internal.ICreator"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof p209p7.C7758w
            if (r2 == 0) goto L_0x0050
            r0 = r1
            p7.w r0 = (p209p7.C7758w) r0
            goto L_0x0056
        L_0x0050:
            p7.v r1 = new p7.v
            r1.<init>(r0)
            r0 = r1
        L_0x0056:
            f22451c = r0
            android.content.Context r3 = m29414c(r3, r4)     // Catch:{ RemoteException -> 0x006f }
            r3.getClass()     // Catch:{ RemoteException -> 0x006f }
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ RemoteException -> 0x006f }
            w6.b r3 = p299w6.C8862d.m32984T1(r3)     // Catch:{ RemoteException -> 0x006f }
            int r4 = com.google.android.gms.common.C3942c.f12556f     // Catch:{ RemoteException -> 0x006f }
            r0.mo22514A(r3, r4)     // Catch:{ RemoteException -> 0x006f }
            p7.w r3 = f22451c
            return r3
        L_0x006f:
            r3 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r4 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r4.<init>(r3)
            throw r4
        L_0x0076:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl"
            r3.<init>(r4)
            throw r3
        L_0x007e:
            com.google.android.gms.common.GooglePlayServicesNotAvailableException r3 = new com.google.android.gms.common.GooglePlayServicesNotAvailableException
            r3.<init>(r1)
            throw r3
        L_0x0084:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p209p7.C7756u.m29412a(android.content.Context, o7.d$a):p7.w");
    }

    /* renamed from: b */
    private static Context m29413b(Exception exc, Context context) {
        Log.e(f22449a, "Failed to load maps module, use pre-Chimera", exc);
        return C3942c.m14955e(context);
    }

    /* renamed from: c */
    private static Context m29414c(Context context, C7474d.C7475a aVar) {
        String str;
        Context context2;
        Context context3 = f22450b;
        if (context3 != null) {
            return context3;
        }
        context.getApplicationContext();
        if (aVar != null) {
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                str = "com.google.android.gms.maps_legacy_dynamite";
            } else if (ordinal == 1) {
                str = "com.google.android.gms.maps_core_dynamite";
            }
            context2 = DynamiteModule.m15258e(context, DynamiteModule.f12825b, str).mo12396b();
            f22450b = context2;
            return context2;
        }
        str = "com.google.android.gms.maps_dynamite";
        try {
            context2 = DynamiteModule.m15258e(context, DynamiteModule.f12825b, str).mo12396b();
        } catch (Exception e) {
            if (!str.equals("com.google.android.gms.maps_dynamite")) {
                try {
                    Log.d(f22449a, "Attempting to load maps_dynamite again.");
                    context2 = DynamiteModule.m15258e(context, DynamiteModule.f12825b, "com.google.android.gms.maps_dynamite").mo12396b();
                } catch (Exception e2) {
                    context2 = m29413b(e2, context);
                }
            } else {
                context2 = m29413b(e, context);
            }
        }
        f22450b = context2;
        return context2;
    }

    /* renamed from: d */
    private static Object m29415d(Class cls) {
        try {
            return cls.newInstance();
        } catch (InstantiationException unused) {
            throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(cls.getName()));
        } catch (IllegalAccessException unused2) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat(cls.getName()));
        }
    }
}
