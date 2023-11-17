package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: androidx.lifecycle.k0 */
public abstract class C1601k0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final List f4613a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final List f4614b;

    static {
        Class<C1580f0> cls = C1580f0.class;
        f4613a = C41341q.m119910m(Application.class, cls);
        f4614b = C41339p.m119900e(cls);
    }

    /* renamed from: c */
    public static final Constructor m5643c(Class cls, List list) {
        C41536l.m120489i(cls, "modelClass");
        C41536l.m120489i(list, "signature");
        Constructor[] constructors = cls.getConstructors();
        C41536l.m120488h(constructors, "modelClass.constructors");
        int length = constructors.length;
        int i = 0;
        while (i < length) {
            Constructor constructor = constructors[i];
            Class[] parameterTypes = constructor.getParameterTypes();
            C41536l.m120488h(parameterTypes, "constructor.parameterTypes");
            List O = C41333m.m119788O(parameterTypes);
            if (C41536l.m120484d(list, O)) {
                C41536l.m120487g(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            } else if (list.size() != O.size() || !O.containsAll(list)) {
                i++;
            } else {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    /* renamed from: d */
    public static final C1613n0 m5644d(Class cls, Constructor constructor, Object... objArr) {
        C41536l.m120489i(cls, "modelClass");
        C41536l.m120489i(constructor, "constructor");
        C41536l.m120489i(objArr, "params");
        try {
            return (C1613n0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
