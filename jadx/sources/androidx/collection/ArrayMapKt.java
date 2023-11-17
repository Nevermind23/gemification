package androidx.collection;

import he1.C41224m;
import kotlin.jvm.internal.C41536l;

public final class ArrayMapKt {
    public static final <K, V> ArrayMap<K, V> arrayMapOf() {
        return new ArrayMap<>();
    }

    public static final <K, V> ArrayMap<K, V> arrayMapOf(C41224m... mVarArr) {
        C41536l.m120490j(mVarArr, "pairs");
        ArrayMap<K, V> arrayMap = new ArrayMap<>(mVarArr.length);
        for (C41224m mVar : mVarArr) {
            arrayMap.put(mVar.mo95678e(), mVar.mo95680f());
        }
        return arrayMap;
    }
}
