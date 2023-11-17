package androidx.collection;

import kotlin.jvm.internal.C41536l;
import ue1.C43075l;
import ue1.C43079p;
import ue1.C43081r;

public final class LruCacheKt {
    public static final <K, V> LruCache<K, V> lruCache(int i, C43079p pVar, C43075l lVar, C43081r rVar) {
        C41536l.m120490j(pVar, "sizeOf");
        C41536l.m120490j(lVar, "create");
        C41536l.m120490j(rVar, "onEntryRemoved");
        return new LruCacheKt$lruCache$4(pVar, lVar, rVar, i, i);
    }

    public static /* synthetic */ LruCache lruCache$default(int i, C43079p pVar, C43075l lVar, C43081r rVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            pVar = LruCacheKt$lruCache$1.INSTANCE;
        }
        C43079p pVar2 = pVar;
        if ((i2 & 4) != 0) {
            lVar = LruCacheKt$lruCache$2.INSTANCE;
        }
        C43075l lVar2 = lVar;
        if ((i2 & 8) != 0) {
            rVar = LruCacheKt$lruCache$3.INSTANCE;
        }
        C43081r rVar2 = rVar;
        C41536l.m120490j(pVar2, "sizeOf");
        C41536l.m120490j(lVar2, "create");
        C41536l.m120490j(rVar2, "onEntryRemoved");
        return new LruCacheKt$lruCache$4(pVar2, lVar2, rVar2, i, i);
    }
}
