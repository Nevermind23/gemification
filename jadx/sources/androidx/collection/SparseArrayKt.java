package androidx.collection;

import com.salesforce.marketingcloud.UrlHandler;
import ie1.C41330k0;
import java.util.Iterator;
import kotlin.jvm.internal.C41536l;
import ue1.C43064a;
import ue1.C43079p;

public final class SparseArrayKt {
    public static final <T> boolean contains(SparseArrayCompat<T> sparseArrayCompat, int i) {
        C41536l.m120490j(sparseArrayCompat, "receiver$0");
        return sparseArrayCompat.containsKey(i);
    }

    public static final <T> void forEach(SparseArrayCompat<T> sparseArrayCompat, C43079p pVar) {
        C41536l.m120490j(sparseArrayCompat, "receiver$0");
        C41536l.m120490j(pVar, UrlHandler.ACTION);
        int size = sparseArrayCompat.size();
        for (int i = 0; i < size; i++) {
            pVar.invoke(Integer.valueOf(sparseArrayCompat.keyAt(i)), sparseArrayCompat.valueAt(i));
        }
    }

    public static final <T> T getOrDefault(SparseArrayCompat<T> sparseArrayCompat, int i, T t) {
        C41536l.m120490j(sparseArrayCompat, "receiver$0");
        return sparseArrayCompat.get(i, t);
    }

    public static final <T> T getOrElse(SparseArrayCompat<T> sparseArrayCompat, int i, C43064a aVar) {
        C41536l.m120490j(sparseArrayCompat, "receiver$0");
        C41536l.m120490j(aVar, "defaultValue");
        T t = sparseArrayCompat.get(i);
        if (t != null) {
            return t;
        }
        return aVar.invoke();
    }

    public static final <T> int getSize(SparseArrayCompat<T> sparseArrayCompat) {
        C41536l.m120490j(sparseArrayCompat, "receiver$0");
        return sparseArrayCompat.size();
    }

    public static final <T> boolean isNotEmpty(SparseArrayCompat<T> sparseArrayCompat) {
        C41536l.m120490j(sparseArrayCompat, "receiver$0");
        return !sparseArrayCompat.isEmpty();
    }

    public static final <T> C41330k0 keyIterator(SparseArrayCompat<T> sparseArrayCompat) {
        C41536l.m120490j(sparseArrayCompat, "receiver$0");
        return new SparseArrayKt$keyIterator$1(sparseArrayCompat);
    }

    public static final <T> SparseArrayCompat<T> plus(SparseArrayCompat<T> sparseArrayCompat, SparseArrayCompat<T> sparseArrayCompat2) {
        C41536l.m120490j(sparseArrayCompat, "receiver$0");
        C41536l.m120490j(sparseArrayCompat2, "other");
        SparseArrayCompat<T> sparseArrayCompat3 = new SparseArrayCompat<>(sparseArrayCompat.size() + sparseArrayCompat2.size());
        sparseArrayCompat3.putAll(sparseArrayCompat);
        sparseArrayCompat3.putAll(sparseArrayCompat2);
        return sparseArrayCompat3;
    }

    public static final <T> boolean remove(SparseArrayCompat<T> sparseArrayCompat, int i, T t) {
        C41536l.m120490j(sparseArrayCompat, "receiver$0");
        return sparseArrayCompat.remove(i, t);
    }

    public static final <T> void set(SparseArrayCompat<T> sparseArrayCompat, int i, T t) {
        C41536l.m120490j(sparseArrayCompat, "receiver$0");
        sparseArrayCompat.put(i, t);
    }

    public static final <T> Iterator<T> valueIterator(SparseArrayCompat<T> sparseArrayCompat) {
        C41536l.m120490j(sparseArrayCompat, "receiver$0");
        return new SparseArrayKt$valueIterator$1(sparseArrayCompat);
    }
}
