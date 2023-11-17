package zh1;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* renamed from: zh1.x */
abstract class C43514x {
    C43514x() {
    }

    /* renamed from: b */
    static C43514x m124799b(C43511w wVar, Method method) {
        C43508u b = C43508u.m124763b(wVar, method);
        Type genericReturnType = method.getGenericReturnType();
        if (C43439a0.m124622j(genericReturnType)) {
            throw C43439a0.m124625m(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        } else if (genericReturnType != Void.TYPE) {
            return C43463l.m124673f(wVar, method, b);
        } else {
            throw C43439a0.m124625m(method, "Service methods cannot return void.", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract Object mo102170a(Object[] objArr);
}
