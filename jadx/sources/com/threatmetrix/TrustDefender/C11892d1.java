package com.threatmetrix.TrustDefender;

import com.threatmetrix.TrustDefender.C11879b0;
import java.lang.reflect.Method;

/* renamed from: com.threatmetrix.TrustDefender.d1 */
public abstract class C11892d1 {

    /* renamed from: a */
    private static final Method f34817a;

    /* renamed from: b */
    private static final Method f34818b;

    static {
        Class i = C11879b0.m43537i(C11879b0.C11880a.FIREBASE_INSTANCE_ID);
        f34817a = C11879b0.m43538j(i, "getInstance", new Class[0]);
        f34818b = C11879b0.m43538j(i, "getToken", new Class[0]);
    }

    /* renamed from: a */
    public static String m43574a() {
        Method method;
        Object a;
        Method method2 = f34817a;
        if (method2 == null || (method = f34818b) == null || (a = C11879b0.m43529a((Object) null, method2, new Object[0])) == null) {
            return null;
        }
        return (String) C11879b0.m43529a(a, method, new Object[0]);
    }

    /* renamed from: b */
    public static boolean m43575b() {
        return (f34817a == null || f34818b == null) ? false : true;
    }
}
