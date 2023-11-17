package p446hf;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.C41536l;

/* renamed from: hf.c */
public abstract class C15495c {
    /* renamed from: a */
    public static final Type m56049a(ParameterizedType parameterizedType, int i) {
        C41536l.m120490j(parameterizedType, "$this$getParameterUpperBound");
        Type b = C15496d.m56053b(i, parameterizedType);
        C41536l.m120485e(b, "Utils.getParameterUpperBound(index, this)");
        return b;
    }

    /* renamed from: b */
    public static final Class m56050b(Type type) {
        C41536l.m120490j(type, "$this$getRawType");
        Class c = C15496d.m56054c(type);
        C41536l.m120485e(c, "Utils.getRawType(this)");
        return c;
    }

    /* renamed from: c */
    public static final boolean m56051c(Type type) {
        C41536l.m120490j(type, "$this$hasUnresolvableType");
        return C15496d.m56055d(type);
    }
}
