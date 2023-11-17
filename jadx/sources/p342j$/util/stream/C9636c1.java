package p342j$.util.stream;

import java.util.Arrays;
import p342j$.util.function.C9425D;
import p342j$.util.function.C9428G;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.c1 */
final class C9636c1 extends C9631b1 implements C9745y0 {
    C9636c1(long j) {
        super(j);
    }

    public final /* synthetic */ void accept(double d) {
        C9735w0.m35824p0();
        throw null;
    }

    public final void accept(int i) {
        int i2 = this.f26346b;
        int[] iArr = this.f26345a;
        if (i2 < iArr.length) {
            this.f26346b = i2 + 1;
            iArr[i2] = i;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", new Object[]{Integer.valueOf(iArr.length)}));
    }

    public final /* synthetic */ void accept(long j) {
        C9735w0.m35837x0();
        throw null;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo25881q((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    /* renamed from: b */
    public final C9524C0 mo25682b() {
        int i = this.f26346b;
        int[] iArr = this.f26345a;
        if (i >= iArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.f26346b), Integer.valueOf(iArr.length)}));
    }

    /* renamed from: n */
    public final C9428G mo25284n(C9428G g) {
        g.getClass();
        return new C9425D(this, g);
    }

    /* renamed from: o */
    public final void mo25694o() {
        int i = this.f26346b;
        int[] iArr = this.f26345a;
        if (i < iArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.f26346b), Integer.valueOf(iArr.length)}));
        }
    }

    /* renamed from: p */
    public final void mo25695p(long j) {
        int[] iArr = this.f26345a;
        if (j == ((long) iArr.length)) {
            this.f26346b = 0;
        } else {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", new Object[]{Long.valueOf(j), Integer.valueOf(iArr.length)}));
        }
    }

    /* renamed from: q */
    public final /* synthetic */ void mo25881q(Integer num) {
        C9735w0.m35829s0(this, num);
    }

    /* renamed from: r */
    public final /* synthetic */ boolean mo25696r() {
        return false;
    }

    public final String toString() {
        int[] iArr = this.f26345a;
        return String.format("IntFixedNodeBuilder[%d][%s]", new Object[]{Integer.valueOf(iArr.length - this.f26346b), Arrays.toString(iArr)});
    }
}
