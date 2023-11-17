package p342j$.util.concurrent;

import java.util.Comparator;
import p342j$.util.C9371P;
import p342j$.util.C9381a;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.concurrent.f */
final class C9393f extends C9403p implements C9371P {

    /* renamed from: i */
    final ConcurrentHashMap f26002i;

    /* renamed from: j */
    long f26003j;

    C9393f(C9399l[] lVarArr, int i, int i2, int i3, long j, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i, i2, i3);
        this.f26002i = concurrentHashMap;
        this.f26003j = j;
    }

    /* renamed from: a */
    public final void mo25169a(Consumer consumer) {
        consumer.getClass();
        while (true) {
            C9399l b = mo25406b();
            if (b != null) {
                consumer.accept(new C9398k(b.f26012b, b.f26013c, this.f26002i));
            } else {
                return;
            }
        }
    }

    public final int characteristics() {
        return 4353;
    }

    public final long estimateSize() {
        return this.f26003j;
    }

    public final Comparator getComparator() {
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
        C9399l b = mo25406b();
        if (b == null) {
            return false;
        }
        consumer.accept(new C9398k(b.f26012b, b.f26013c, this.f26002i));
        return true;
    }

    public final C9371P trySplit() {
        int i = this.f26024f;
        int i2 = this.f26025g;
        int i3 = (i + i2) >>> 1;
        if (i3 <= i) {
            return null;
        }
        C9399l[] lVarArr = this.f26019a;
        int i4 = this.f26026h;
        this.f26025g = i3;
        long j = this.f26003j >>> 1;
        this.f26003j = j;
        return new C9393f(lVarArr, i4, i3, i2, j, this.f26002i);
    }
}
