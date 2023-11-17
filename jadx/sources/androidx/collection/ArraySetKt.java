package androidx.collection;

import kotlin.jvm.internal.C41536l;

public final class ArraySetKt {
    public static final <T> ArraySet<T> arraySetOf() {
        return new ArraySet<>();
    }

    public static final <T> ArraySet<T> arraySetOf(T... tArr) {
        C41536l.m120490j(tArr, "values");
        ArraySet<T> arraySet = new ArraySet<>(tArr.length);
        for (T add : tArr) {
            arraySet.add(add);
        }
        return arraySet;
    }
}
