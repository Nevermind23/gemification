package p342j$.util.concurrent;

import java.util.Comparator;
import p342j$.util.C9371P;
import p342j$.util.C9381a;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.concurrent.j */
final class C9397j extends C9403p implements C9371P {

    /* renamed from: i */
    public final /* synthetic */ int f26006i;

    /* renamed from: j */
    long f26007j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9397j(C9399l[] lVarArr, int i, int i2, int i3, long j, int i4) {
        super(lVarArr, i, i2, i3);
        this.f26006i = i4;
        this.f26007j = j;
    }

    /* renamed from: a */
    public final void mo25169a(Consumer consumer) {
        switch (this.f26006i) {
            case 0:
                consumer.getClass();
                while (true) {
                    C9399l b = mo25406b();
                    if (b != null) {
                        consumer.accept(b.f26012b);
                    } else {
                        return;
                    }
                }
            default:
                consumer.getClass();
                while (true) {
                    C9399l b2 = mo25406b();
                    if (b2 != null) {
                        consumer.accept(b2.f26013c);
                    } else {
                        return;
                    }
                }
        }
    }

    public final int characteristics() {
        switch (this.f26006i) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    public final long estimateSize() {
        switch (this.f26006i) {
            case 0:
                return this.f26007j;
            default:
                return this.f26007j;
        }
    }

    public final Comparator getComparator() {
        switch (this.f26006i) {
            case 0:
                throw new IllegalStateException();
            default:
                throw new IllegalStateException();
        }
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.f26006i) {
            case 0:
                return C9381a.m34652k(this);
            default:
                return C9381a.m34652k(this);
        }
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        switch (this.f26006i) {
            case 0:
                return C9381a.m34653l(this, i);
            default:
                return C9381a.m34653l(this, i);
        }
    }

    /* renamed from: m */
    public final boolean mo25179m(Consumer consumer) {
        switch (this.f26006i) {
            case 0:
                consumer.getClass();
                C9399l b = mo25406b();
                if (b == null) {
                    return false;
                }
                consumer.accept(b.f26012b);
                return true;
            default:
                consumer.getClass();
                C9399l b2 = mo25406b();
                if (b2 == null) {
                    return false;
                }
                consumer.accept(b2.f26013c);
                return true;
        }
    }

    public final C9371P trySplit() {
        switch (this.f26006i) {
            case 0:
                int i = this.f26024f;
                int i2 = this.f26025g;
                int i3 = (i + i2) >>> 1;
                if (i3 <= i) {
                    return null;
                }
                C9399l[] lVarArr = this.f26019a;
                int i4 = this.f26026h;
                this.f26025g = i3;
                long j = this.f26007j >>> 1;
                this.f26007j = j;
                return new C9397j(lVarArr, i4, i3, i2, j, 0);
            default:
                int i5 = this.f26024f;
                int i6 = this.f26025g;
                int i7 = (i5 + i6) >>> 1;
                if (i7 <= i5) {
                    return null;
                }
                C9399l[] lVarArr2 = this.f26019a;
                int i8 = this.f26026h;
                this.f26025g = i7;
                long j2 = this.f26007j >>> 1;
                this.f26007j = j2;
                return new C9397j(lVarArr2, i8, i7, i6, j2, 1);
        }
    }
}
