package com.threatmetrix.TrustDefender;

import com.threatmetrix.TrustDefender.C11879b0;
import java.lang.reflect.Method;

/* renamed from: com.threatmetrix.TrustDefender.p0 */
public class C11944p0 extends C11879b0 {

    /* renamed from: c */
    private static final Class f35058c;

    /* renamed from: d */
    private static final Method f35059d;

    /* renamed from: e */
    private static final Method f35060e;

    /* renamed from: f */
    private static final Method f35061f;

    /* renamed from: g */
    private static final Method f35062g;

    /* renamed from: h */
    private static final Method f35063h;

    /* renamed from: i */
    private static final Method f35064i;

    /* renamed from: b */
    private final Object f35065b;

    static {
        Class i = C11879b0.m43537i(C11879b0.C11880a.STAT_FS);
        f35058c = i;
        f35059d = C11879b0.m43538j(i, "getBlockSize", new Class[0]);
        f35060e = C11879b0.m43538j(i, "getBlockSizeLong", new Class[0]);
        f35061f = C11879b0.m43538j(i, "getAvailableBlocks", new Class[0]);
        f35062g = C11879b0.m43538j(i, "getAvailableBlocksLong", new Class[0]);
        f35063h = C11879b0.m43538j(i, "getBlockCount", new Class[0]);
        f35064i = C11879b0.m43538j(i, "getBlockCountLong", new Class[0]);
    }

    public C11944p0(String str) {
        Object obj;
        Class cls = f35058c;
        if (cls == null) {
            obj = null;
        } else {
            obj = C11879b0.m43530b(cls, new Class[]{String.class}, new Object[]{str});
        }
        this.f35065b = obj;
    }

    /* renamed from: k */
    public long mo32002k() {
        Integer num;
        Long l;
        Method method = f35060e;
        if (method != null && (l = (Long) C11879b0.m43529a(this.f35065b, method, new Object[0])) != null) {
            return l.longValue();
        }
        Method method2 = f35059d;
        if (method2 == null || (num = (Integer) C11879b0.m43529a(this.f35065b, method2, new Object[0])) == null) {
            return 0;
        }
        return (long) num.intValue();
    }

    /* renamed from: l */
    public long mo32003l() {
        Integer num;
        Long l;
        Method method = f35062g;
        if (method != null && (l = (Long) C11879b0.m43529a(this.f35065b, method, new Object[0])) != null) {
            return l.longValue();
        }
        Method method2 = f35061f;
        if (method2 == null || (num = (Integer) C11879b0.m43529a(this.f35065b, method2, new Object[0])) == null) {
            return 0;
        }
        return (long) num.intValue();
    }

    /* renamed from: m */
    public long mo32004m() {
        Integer num;
        Long l;
        Method method = f35064i;
        if (method != null && (l = (Long) C11879b0.m43529a(this.f35065b, method, new Object[0])) != null) {
            return l.longValue();
        }
        Method method2 = f35063h;
        if (method2 == null || (num = (Integer) C11879b0.m43529a(this.f35065b, method2, new Object[0])) == null) {
            return 0;
        }
        return (long) num.intValue();
    }
}
