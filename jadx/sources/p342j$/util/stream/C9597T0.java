package p342j$.util.stream;

import java.util.Arrays;
import p342j$.util.function.C9469l;
import p342j$.util.function.C9475o;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.T0 */
final class C9597T0 extends C9593S0 implements C9740x0 {
    C9597T0(long j) {
        super(j);
    }

    public final void accept(double d) {
        int i = this.f26276b;
        double[] dArr = this.f26275a;
        if (i < dArr.length) {
            this.f26276b = i + 1;
            dArr[i] = d;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", new Object[]{Integer.valueOf(dArr.length)}));
    }

    public final /* synthetic */ void accept(int i) {
        C9735w0.m35836w0();
        throw null;
    }

    public final /* synthetic */ void accept(long j) {
        C9735w0.m35837x0();
        throw null;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo25697s((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    /* renamed from: b */
    public final C9519B0 mo25682b() {
        int i = this.f26276b;
        double[] dArr = this.f26275a;
        if (i >= dArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.f26276b), Integer.valueOf(dArr.length)}));
    }

    /* renamed from: l */
    public final C9475o mo25296l(C9475o oVar) {
        oVar.getClass();
        return new C9469l(this, oVar);
    }

    /* renamed from: o */
    public final void mo25694o() {
        int i = this.f26276b;
        double[] dArr = this.f26275a;
        if (i < dArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.f26276b), Integer.valueOf(dArr.length)}));
        }
    }

    /* renamed from: p */
    public final void mo25695p(long j) {
        double[] dArr = this.f26275a;
        if (j == ((long) dArr.length)) {
            this.f26276b = 0;
        } else {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", new Object[]{Long.valueOf(j), Integer.valueOf(dArr.length)}));
        }
    }

    /* renamed from: r */
    public final /* synthetic */ boolean mo25696r() {
        return false;
    }

    /* renamed from: s */
    public final /* synthetic */ void mo25697s(Double d) {
        C9735w0.m35826q0(this, d);
    }

    public final String toString() {
        double[] dArr = this.f26275a;
        return String.format("DoubleFixedNodeBuilder[%d][%s]", new Object[]{Integer.valueOf(dArr.length - this.f26276b), Arrays.toString(dArr)});
    }
}
