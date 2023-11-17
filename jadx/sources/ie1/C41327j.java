package ie1;

import java.lang.reflect.Array;
import kotlin.jvm.internal.C41536l;

/* renamed from: ie1.j */
abstract class C41327j {
    /* renamed from: a */
    public static final Object[] m119756a(Object[] objArr, int i) {
        C41536l.m120489i(objArr, "reference");
        Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
        C41536l.m120487g(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) newInstance;
    }

    /* renamed from: b */
    public static final void m119757b(int i, int i2) {
        if (i > i2) {
            throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
        }
    }
}
