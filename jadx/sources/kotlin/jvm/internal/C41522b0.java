package kotlin.jvm.internal;

import af1.C40296c;
import af1.C40297d;
import af1.C40298e;
import af1.C40299f;
import af1.C40300g;
import af1.C40301h;

/* renamed from: kotlin.jvm.internal.b0 */
public class C41522b0 {
    /* renamed from: a */
    public C40298e mo96295a(C41534j jVar) {
        return jVar;
    }

    /* renamed from: b */
    public C40296c mo96296b(Class cls) {
        return new C41529f(cls);
    }

    /* renamed from: c */
    public C40297d mo96297c(Class cls, String str) {
        return new C41541q(cls, str);
    }

    /* renamed from: d */
    public C40299f mo96298d(C41538n nVar) {
        return nVar;
    }

    /* renamed from: e */
    public C40300g mo96299e(C41542r rVar) {
        return rVar;
    }

    /* renamed from: f */
    public C40301h mo96300f(C41544t tVar) {
        return tVar;
    }

    /* renamed from: g */
    public String mo96301g(C41533i iVar) {
        String obj = iVar.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }

    /* renamed from: h */
    public String mo96302h(C41537m mVar) {
        return mo96301g(mVar);
    }
}
