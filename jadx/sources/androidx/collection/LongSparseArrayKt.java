package androidx.collection;

import com.salesforce.marketingcloud.UrlHandler;
import ie1.C41332l0;
import java.util.Iterator;
import kotlin.jvm.internal.C41536l;
import ue1.C43064a;
import ue1.C43079p;

public final class LongSparseArrayKt {
    public static final <T> boolean contains(LongSparseArray<T> longSparseArray, long j) {
        C41536l.m120490j(longSparseArray, "receiver$0");
        return longSparseArray.containsKey(j);
    }

    public static final <T> void forEach(LongSparseArray<T> longSparseArray, C43079p pVar) {
        C41536l.m120490j(longSparseArray, "receiver$0");
        C41536l.m120490j(pVar, UrlHandler.ACTION);
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            pVar.invoke(Long.valueOf(longSparseArray.keyAt(i)), longSparseArray.valueAt(i));
        }
    }

    public static final <T> T getOrDefault(LongSparseArray<T> longSparseArray, long j, T t) {
        C41536l.m120490j(longSparseArray, "receiver$0");
        return longSparseArray.get(j, t);
    }

    public static final <T> T getOrElse(LongSparseArray<T> longSparseArray, long j, C43064a aVar) {
        C41536l.m120490j(longSparseArray, "receiver$0");
        C41536l.m120490j(aVar, "defaultValue");
        T t = longSparseArray.get(j);
        if (t != null) {
            return t;
        }
        return aVar.invoke();
    }

    public static final <T> int getSize(LongSparseArray<T> longSparseArray) {
        C41536l.m120490j(longSparseArray, "receiver$0");
        return longSparseArray.size();
    }

    public static final <T> boolean isNotEmpty(LongSparseArray<T> longSparseArray) {
        C41536l.m120490j(longSparseArray, "receiver$0");
        return !longSparseArray.isEmpty();
    }

    public static final <T> C41332l0 keyIterator(LongSparseArray<T> longSparseArray) {
        C41536l.m120490j(longSparseArray, "receiver$0");
        return new LongSparseArrayKt$keyIterator$1(longSparseArray);
    }

    public static final <T> LongSparseArray<T> plus(LongSparseArray<T> longSparseArray, LongSparseArray<T> longSparseArray2) {
        C41536l.m120490j(longSparseArray, "receiver$0");
        C41536l.m120490j(longSparseArray2, "other");
        LongSparseArray<T> longSparseArray3 = new LongSparseArray<>(longSparseArray.size() + longSparseArray2.size());
        longSparseArray3.putAll(longSparseArray);
        longSparseArray3.putAll(longSparseArray2);
        return longSparseArray3;
    }

    public static final <T> boolean remove(LongSparseArray<T> longSparseArray, long j, T t) {
        C41536l.m120490j(longSparseArray, "receiver$0");
        return longSparseArray.remove(j, t);
    }

    public static final <T> void set(LongSparseArray<T> longSparseArray, long j, T t) {
        C41536l.m120490j(longSparseArray, "receiver$0");
        longSparseArray.put(j, t);
    }

    public static final <T> Iterator<T> valueIterator(LongSparseArray<T> longSparseArray) {
        C41536l.m120490j(longSparseArray, "receiver$0");
        return new LongSparseArrayKt$valueIterator$1(longSparseArray);
    }
}
