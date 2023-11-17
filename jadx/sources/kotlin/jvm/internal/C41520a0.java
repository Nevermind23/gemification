package kotlin.jvm.internal;

import af1.C40296c;
import af1.C40297d;
import af1.C40298e;
import af1.C40299f;
import af1.C40300g;
import af1.C40301h;

/* renamed from: kotlin.jvm.internal.a0 */
public abstract class C41520a0 {

    /* renamed from: a */
    private static final C41522b0 f97697a;

    /* renamed from: b */
    private static final C40296c[] f97698b = new C40296c[0];

    static {
        C41522b0 b0Var = null;
        try {
            b0Var = (C41522b0) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (b0Var == null) {
            b0Var = new C41522b0();
        }
        f97697a = b0Var;
    }

    /* renamed from: a */
    public static C40298e m120435a(C41534j jVar) {
        return f97697a.mo96295a(jVar);
    }

    /* renamed from: b */
    public static C40296c m120436b(Class cls) {
        return f97697a.mo96296b(cls);
    }

    /* renamed from: c */
    public static C40297d m120437c(Class cls) {
        return f97697a.mo96297c(cls, "");
    }

    /* renamed from: d */
    public static C40297d m120438d(Class cls, String str) {
        return f97697a.mo96297c(cls, str);
    }

    /* renamed from: e */
    public static C40299f m120439e(C41538n nVar) {
        return f97697a.mo96298d(nVar);
    }

    /* renamed from: f */
    public static C40300g m120440f(C41542r rVar) {
        return f97697a.mo96299e(rVar);
    }

    /* renamed from: g */
    public static C40301h m120441g(C41544t tVar) {
        return f97697a.mo96300f(tVar);
    }

    /* renamed from: h */
    public static String m120442h(C41533i iVar) {
        return f97697a.mo96301g(iVar);
    }

    /* renamed from: i */
    public static String m120443i(C41537m mVar) {
        return f97697a.mo96302h(mVar);
    }
}
