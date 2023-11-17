package p342j$.util.stream;

import java.util.Arrays;
import java.util.Iterator;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p342j$.util.C9359D;
import p342j$.util.C9417e0;
import p342j$.util.function.C9469l;
import p342j$.util.function.C9475o;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.J2 */
class C9560J2 extends C9584P2 implements C9475o {
    C9560J2() {
    }

    C9560J2(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final Object[] mo25882A() {
        return new double[8][];
    }

    /* renamed from: C */
    public C9359D spliterator() {
        return new C9556I2(this, 0, this.f26367c, 0, this.f26366b);
    }

    /* renamed from: a */
    public final void mo24915a(Consumer consumer) {
        if (consumer instanceof C9475o) {
            mo25917h((C9475o) consumer);
        } else if (!C9552H3.f26222a) {
            spliterator().mo25169a(consumer);
        } else {
            C9552H3.m35026a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
            throw null;
        }
    }

    public void accept(double d) {
        mo25913B();
        int i = this.f26366b;
        this.f26366b = i + 1;
        ((double[]) this.f26266e)[i] = d;
    }

    /* renamed from: d */
    public final Object mo25884d(int i) {
        return new double[i];
    }

    public final Iterator iterator() {
        return C9417e0.m34758f(spliterator());
    }

    /* renamed from: l */
    public final C9475o mo25296l(C9475o oVar) {
        oVar.getClass();
        return new C9469l(this, oVar);
    }

    public final String toString() {
        double[] dArr = (double[]) mo25916g();
        if (dArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", new Object[]{getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f26367c), Arrays.toString(dArr)});
        }
        return String.format("%s[length=%d, chunks=%d]%s...", new Object[]{getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f26367c), Arrays.toString(Arrays.copyOf(dArr, BogInputLayout.INPUT_NORMAL_STATE))});
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo25888w(Object obj, int i, int i2, Object obj2) {
        double[] dArr = (double[]) obj;
        C9475o oVar = (C9475o) obj2;
        while (i < i2) {
            oVar.accept(dArr[i]);
            i++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final int mo25889x(Object obj) {
        return ((double[]) obj).length;
    }
}
