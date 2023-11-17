package androidx.collection;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import ue1.C43075l;
import ue1.C43079p;
import ue1.C43081r;

public final class LruCacheKt$lruCache$4 extends LruCache<K, V> {
    final /* synthetic */ C43075l $create;
    final /* synthetic */ int $maxSize;
    final /* synthetic */ C43081r $onEntryRemoved;
    final /* synthetic */ C43079p $sizeOf;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LruCacheKt$lruCache$4(C43079p pVar, C43075l lVar, C43081r rVar, int i, int i2) {
        super(i2);
        this.$sizeOf = pVar;
        this.$create = lVar;
        this.$onEntryRemoved = rVar;
        this.$maxSize = i;
    }

    /* access modifiers changed from: protected */
    public V create(K k) {
        C41536l.m120490j(k, "key");
        return this.$create.invoke(k);
    }

    /* access modifiers changed from: protected */
    public void entryRemoved(boolean z, K k, V v, V v2) {
        C41536l.m120490j(k, "key");
        C41536l.m120490j(v, "oldValue");
        this.$onEntryRemoved.invoke(Boolean.valueOf(z), k, v, v2);
    }

    /* access modifiers changed from: protected */
    public int sizeOf(K k, V v) {
        C41536l.m120490j(k, "key");
        C41536l.m120490j(v, C11755a.C11756a.f34100b);
        return ((Number) this.$sizeOf.invoke(k, v)).intValue();
    }
}
