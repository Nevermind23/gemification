package p342j$.util.stream;

import java.util.Arrays;
import java.util.Iterator;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p342j$.util.C9362G;
import p342j$.util.C9417e0;
import p342j$.util.function.C9425D;
import p342j$.util.function.C9428G;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.L2 */
class C9568L2 extends C9584P2 implements C9428G {
    C9568L2() {
    }

    C9568L2(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object[] mo25882A() {
        return new int[8][];
    }

    /* renamed from: C */
    public C9362G spliterator() {
        return new C9564K2(this, 0, this.f26367c, 0, this.f26366b);
    }

    /* renamed from: a */
    public final void mo24915a(Consumer consumer) {
        if (consumer instanceof C9428G) {
            mo25917h((C9428G) consumer);
        } else if (!C9552H3.f26222a) {
            spliterator().mo25169a(consumer);
        } else {
            C9552H3.m35026a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
            throw null;
        }
    }

    public void accept(int i) {
        mo25913B();
        int i2 = this.f26366b;
        this.f26366b = i2 + 1;
        ((int[]) this.f26266e)[i2] = i;
    }

    /* renamed from: d */
    public final Object mo25884d(int i) {
        return new int[i];
    }

    public final Iterator iterator() {
        return C9417e0.m34759g(spliterator());
    }

    /* renamed from: n */
    public final C9428G mo25284n(C9428G g) {
        g.getClass();
        return new C9425D(this, g);
    }

    public final String toString() {
        int[] iArr = (int[]) mo25916g();
        if (iArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", new Object[]{getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f26367c), Arrays.toString(iArr)});
        }
        return String.format("%s[length=%d, chunks=%d]%s...", new Object[]{getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f26367c), Arrays.toString(Arrays.copyOf(iArr, BogInputLayout.INPUT_NORMAL_STATE))});
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo25888w(Object obj, int i, int i2, Object obj2) {
        int[] iArr = (int[]) obj;
        C9428G g = (C9428G) obj2;
        while (i < i2) {
            g.accept(iArr[i]);
            i++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final int mo25889x(Object obj) {
        return ((int[]) obj).length;
    }
}
