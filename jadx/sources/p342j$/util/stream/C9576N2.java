package p342j$.util.stream;

import java.util.Arrays;
import java.util.Iterator;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p342j$.util.C9365J;
import p342j$.util.C9417e0;
import p342j$.util.function.C9441U;
import p342j$.util.function.C9444X;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.N2 */
class C9576N2 extends C9584P2 implements C9444X {
    C9576N2() {
    }

    C9576N2(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object[] mo25882A() {
        return new long[8][];
    }

    /* renamed from: C */
    public C9365J spliterator() {
        return new C9572M2(this, 0, this.f26367c, 0, this.f26366b);
    }

    /* renamed from: a */
    public final void mo24915a(Consumer consumer) {
        if (consumer instanceof C9444X) {
            mo25917h((C9444X) consumer);
        } else if (!C9552H3.f26222a) {
            spliterator().mo25169a(consumer);
        } else {
            C9552H3.m35026a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
            throw null;
        }
    }

    public void accept(long j) {
        mo25913B();
        int i = this.f26366b;
        this.f26366b = i + 1;
        ((long[]) this.f26266e)[i] = j;
    }

    /* renamed from: d */
    public final Object mo25884d(int i) {
        return new long[i];
    }

    /* renamed from: f */
    public final C9444X mo25289f(C9444X x) {
        x.getClass();
        return new C9441U(this, x);
    }

    public final Iterator iterator() {
        return C9417e0.m34760h(spliterator());
    }

    public final String toString() {
        long[] jArr = (long[]) mo25916g();
        if (jArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", new Object[]{getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f26367c), Arrays.toString(jArr)});
        }
        return String.format("%s[length=%d, chunks=%d]%s...", new Object[]{getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f26367c), Arrays.toString(Arrays.copyOf(jArr, BogInputLayout.INPUT_NORMAL_STATE))});
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo25888w(Object obj, int i, int i2, Object obj2) {
        long[] jArr = (long[]) obj;
        C9444X x = (C9444X) obj2;
        while (i < i2) {
            x.accept(jArr[i]);
            i++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final int mo25889x(Object obj) {
        return ((long[]) obj).length;
    }
}
