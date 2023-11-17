package p342j$.util.stream;

import java.util.Arrays;
import p342j$.util.function.C9431J;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.a1 */
final class C9626a1 extends C9554I0 implements C9514A0 {
    C9626a1(long j, C9431J j2) {
        super(j, j2);
    }

    public final /* synthetic */ void accept(double d) {
        C9735w0.m35824p0();
        throw null;
    }

    public final /* synthetic */ void accept(int i) {
        C9735w0.m35836w0();
        throw null;
    }

    public final /* synthetic */ void accept(long j) {
        C9735w0.m35837x0();
        throw null;
    }

    public final void accept(Object obj) {
        int i = this.f26224b;
        Object[] objArr = this.f26223a;
        if (i < objArr.length) {
            this.f26224b = i + 1;
            objArr[i] = obj;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", new Object[]{Integer.valueOf(objArr.length)}));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    /* renamed from: b */
    public final C9539F0 mo25682b() {
        int i = this.f26224b;
        Object[] objArr = this.f26223a;
        if (i >= objArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.f26224b), Integer.valueOf(objArr.length)}));
    }

    /* renamed from: o */
    public final void mo25694o() {
        int i = this.f26224b;
        Object[] objArr = this.f26223a;
        if (i < objArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.f26224b), Integer.valueOf(objArr.length)}));
        }
    }

    /* renamed from: p */
    public final void mo25695p(long j) {
        Object[] objArr = this.f26223a;
        if (j == ((long) objArr.length)) {
            this.f26224b = 0;
        } else {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", new Object[]{Long.valueOf(j), Integer.valueOf(objArr.length)}));
        }
    }

    /* renamed from: r */
    public final /* synthetic */ boolean mo25696r() {
        return false;
    }

    public final String toString() {
        Object[] objArr = this.f26223a;
        return String.format("FixedNodeBuilder[%d][%s]", new Object[]{Integer.valueOf(objArr.length - this.f26224b), Arrays.toString(objArr)});
    }
}
