package p342j$.util;

import com.salesforce.marketingcloud.C11398b;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.c0 */
class C9386c0 implements C9371P {

    /* renamed from: a */
    private final Collection f25966a;

    /* renamed from: b */
    private Iterator f25967b = null;

    /* renamed from: c */
    private final int f25968c;

    /* renamed from: d */
    private long f25969d;

    /* renamed from: e */
    private int f25970e;

    public C9386c0(Collection collection, int i) {
        this.f25966a = collection;
        this.f25968c = (i & C11398b.f33143v) == 0 ? i | 64 | 16384 : i;
    }

    /* renamed from: a */
    public final void mo25169a(Consumer consumer) {
        consumer.getClass();
        Iterator it = this.f25967b;
        if (it == null) {
            Collection collection = this.f25966a;
            Iterator it2 = collection.iterator();
            this.f25967b = it2;
            this.f25969d = (long) collection.size();
            it = it2;
        }
        if (it instanceof C9502i) {
            ((C9502i) it).mo25279a(consumer);
            return;
        }
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public final int characteristics() {
        return this.f25968c;
    }

    public final long estimateSize() {
        if (this.f25967b != null) {
            return this.f25969d;
        }
        Collection collection = this.f25966a;
        this.f25967b = collection.iterator();
        long size = (long) collection.size();
        this.f25969d = size;
        return size;
    }

    public Comparator getComparator() {
        if (C9381a.m34653l(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return C9381a.m34652k(this);
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C9381a.m34653l(this, i);
    }

    /* renamed from: m */
    public final boolean mo25179m(Consumer consumer) {
        consumer.getClass();
        if (this.f25967b == null) {
            Collection collection = this.f25966a;
            this.f25967b = collection.iterator();
            this.f25969d = (long) collection.size();
        }
        if (!this.f25967b.hasNext()) {
            return false;
        }
        consumer.accept(this.f25967b.next());
        return true;
    }

    public final C9371P trySplit() {
        long j;
        Iterator it = this.f25967b;
        if (it == null) {
            Collection collection = this.f25966a;
            Iterator it2 = collection.iterator();
            this.f25967b = it2;
            j = (long) collection.size();
            this.f25969d = j;
            it = it2;
        } else {
            j = this.f25969d;
        }
        if (j <= 1 || !it.hasNext()) {
            return null;
        }
        int i = this.f25970e + C11398b.f33141t;
        if (((long) i) > j) {
            i = (int) j;
        }
        if (i > 33554432) {
            i = 33554432;
        }
        Object[] objArr = new Object[i];
        int i2 = 0;
        do {
            objArr[i2] = it.next();
            i2++;
            if (i2 >= i || !it.hasNext()) {
                this.f25970e = i2;
                long j2 = this.f25969d;
            }
            objArr[i2] = it.next();
            i2++;
            break;
        } while (!it.hasNext());
        this.f25970e = i2;
        long j22 = this.f25969d;
        if (j22 != Long.MAX_VALUE) {
            this.f25969d = j22 - ((long) i2);
        }
        return new C9376V(objArr, 0, i2, this.f25968c);
    }
}
