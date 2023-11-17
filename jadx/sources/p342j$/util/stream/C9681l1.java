package p342j$.util.stream;

import java.util.Arrays;
import p342j$.util.function.C9441U;
import p342j$.util.function.C9444X;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.l1 */
final class C9681l1 extends C9676k1 implements C9750z0 {
    C9681l1(long j) {
        super(j);
    }

    public final /* synthetic */ void accept(double d) {
        C9735w0.m35824p0();
        throw null;
    }

    public final /* synthetic */ void accept(int i) {
        C9735w0.m35836w0();
        throw null;
    }

    public final void accept(long j) {
        int i = this.f26410b;
        long[] jArr = this.f26409a;
        if (i < jArr.length) {
            this.f26410b = i + 1;
            jArr[i] = j;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", new Object[]{Integer.valueOf(jArr.length)}));
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo25901k((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    /* renamed from: b */
    public final C9529D0 mo25682b() {
        int i = this.f26410b;
        long[] jArr = this.f26409a;
        if (i >= jArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.f26410b), Integer.valueOf(jArr.length)}));
    }

    /* renamed from: f */
    public final C9444X mo25289f(C9444X x) {
        x.getClass();
        return new C9441U(this, x);
    }

    /* renamed from: k */
    public final /* synthetic */ void mo25901k(Long l) {
        C9735w0.m35833u0(this, l);
    }

    /* renamed from: o */
    public final void mo25694o() {
        int i = this.f26410b;
        long[] jArr = this.f26409a;
        if (i < jArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.f26410b), Integer.valueOf(jArr.length)}));
        }
    }

    /* renamed from: p */
    public final void mo25695p(long j) {
        long[] jArr = this.f26409a;
        if (j == ((long) jArr.length)) {
            this.f26410b = 0;
        } else {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", new Object[]{Long.valueOf(j), Integer.valueOf(jArr.length)}));
        }
    }

    /* renamed from: r */
    public final /* synthetic */ boolean mo25696r() {
        return false;
    }

    public final String toString() {
        long[] jArr = this.f26409a;
        return String.format("LongFixedNodeBuilder[%d][%s]", new Object[]{Integer.valueOf(jArr.length - this.f26410b), Arrays.toString(jArr)});
    }
}
