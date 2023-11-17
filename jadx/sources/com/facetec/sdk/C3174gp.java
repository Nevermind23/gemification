package com.facetec.sdk;

import com.facetec.sdk.C3091fn;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: com.facetec.sdk.gp */
public final class C3174gp {
    /* renamed from: a */
    public static Type m12982a(Type type, Object obj) {
        if (obj == null) {
            return type;
        }
        if (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) {
            return obj.getClass();
        }
        return type;
    }

    /* renamed from: d */
    public static boolean m12983d(C3004eg egVar) {
        return !(egVar instanceof C3176gr) && !(egVar instanceof C3091fn.C3094d);
    }
}
