package p342j$.util.stream;

import java.util.Set;
import p342j$.util.concurrent.C9407t;
import p342j$.util.function.BiConsumer;
import p342j$.util.function.C9431J;
import p342j$.util.function.C9436O;
import p342j$.util.function.C9448a0;
import p342j$.util.function.C9456e0;
import p342j$.util.function.C9462h0;
import p342j$.util.function.C9468k0;
import p342j$.util.function.C9474n0;
import p342j$.util.function.C9480q0;
import p342j$.util.function.C9491w;
import p342j$.util.function.C9494x0;
import p342j$.util.function.C9495y;
import p342j$.util.function.Function;
import p342j$.util.function.ToDoubleFunction;
import p342j$.util.function.ToIntFunction;
import p342j$.util.function.ToLongFunction;

/* renamed from: j$.util.stream.b */
public final /* synthetic */ class C9629b implements C9431J, Function, C9468k0, BiConsumer, C9491w, C9494x0, ToDoubleFunction, ToIntFunction, C9436O, C9474n0, C9462h0, ToLongFunction, C9480q0, C9448a0 {

    /* renamed from: a */
    public final /* synthetic */ int f26344a;

    public /* synthetic */ C9629b(int i) {
        this.f26344a = i;
    }

    /* renamed from: a */
    public final Function mo25463a(Function function) {
        function.getClass();
        return new C9495y(this, function, 0);
    }

    public final void accept(Object obj, double d) {
        switch (this.f26344a) {
            case 3:
                double[] dArr = (double[]) obj;
                int i = C9528D.f26179s;
                Collectors.m34923a(dArr, d);
                dArr[2] = dArr[2] + d;
                return;
            default:
                double[] dArr2 = (double[]) obj;
                int i2 = C9528D.f26179s;
                dArr2[2] = dArr2[2] + 1.0d;
                Collectors.m34923a(dArr2, d);
                dArr2[3] = dArr2[3] + d;
                return;
        }
    }

    public final void accept(Object obj, int i) {
        long[] jArr = (long[]) obj;
        int i2 = C9645e0.f26369s;
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + ((long) i);
    }

    public final void accept(Object obj, long j) {
        long[] jArr = (long[]) obj;
        int i = C9675k0.f26408s;
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + j;
    }

    public final void accept(Object obj, Object obj2) {
        switch (this.f26344a) {
            case 4:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                int i = C9528D.f26179s;
                Collectors.m34923a(dArr, dArr2[0]);
                Collectors.m34923a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                return;
            case 8:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                int i2 = C9528D.f26179s;
                Collectors.m34923a(dArr3, dArr4[0]);
                Collectors.m34923a(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                return;
            case 20:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                int i3 = C9645e0.f26369s;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                return;
            default:
                long[] jArr3 = (long[]) obj;
                long[] jArr4 = (long[]) obj2;
                int i4 = C9675k0.f26408s;
                jArr3[0] = jArr3[0] + jArr4[0];
                jArr3[1] = jArr3[1] + jArr4[1];
                return;
        }
    }

    public final Object apply(int i) {
        switch (this.f26344a) {
            case 0:
                return new Object[i];
            case 2:
                int i2 = C9528D.f26179s;
                return new Double[i];
            case 15:
                int i3 = C9600U.f26282h;
                return new Object[i];
            case 21:
                int i4 = C9645e0.f26369s;
                return new Integer[i];
            default:
                int i5 = C9675k0.f26408s;
                return new Long[i];
        }
    }

    public final Object apply(long j) {
        switch (this.f26344a) {
            case 28:
                return C9735w0.m35808X0(j);
            default:
                return C9735w0.m35816h1(j);
        }
    }

    public final Object apply(Object obj) {
        Set set = Collectors.f26178a;
        return obj;
    }

    public final double applyAsDouble(Object obj) {
        int i = C9528D.f26179s;
        return ((Double) obj).doubleValue();
    }

    public final int applyAsInt(Object obj) {
        int i = C9645e0.f26369s;
        return ((Integer) obj).intValue();
    }

    public final long applyAsLong(double d) {
        int i = C9528D.f26179s;
        return 1;
    }

    public final long applyAsLong(int i) {
        int i2 = C9645e0.f26369s;
        return 1;
    }

    public final long applyAsLong(long j) {
        int i = C9675k0.f26408s;
        return 1;
    }

    public final long applyAsLong(Object obj) {
        int i = C9675k0.f26408s;
        return ((Long) obj).longValue();
    }

    /* renamed from: b */
    public final Function mo25465b(Function function) {
        function.getClass();
        return new C9495y(this, function, 1);
    }

    /* renamed from: c */
    public final BiConsumer mo25420c(BiConsumer biConsumer) {
        switch (this.f26344a) {
            case 4:
                biConsumer.getClass();
                return new C9407t(1, this, biConsumer);
            case 8:
                biConsumer.getClass();
                return new C9407t(1, this, biConsumer);
            case 20:
                biConsumer.getClass();
                return new C9407t(1, this, biConsumer);
            default:
                biConsumer.getClass();
                return new C9407t(1, this, biConsumer);
        }
    }

    /* renamed from: d */
    public final C9462h0 mo25550d(C9462h0 h0Var) {
        h0Var.getClass();
        return new C9456e0(this, h0Var, 0);
    }

    /* renamed from: e */
    public final C9462h0 mo25551e(C9462h0 h0Var) {
        h0Var.getClass();
        return new C9456e0(this, h0Var, 1);
    }

    public final Object get() {
        switch (this.f26344a) {
            case 6:
                int i = C9528D.f26179s;
                return new double[4];
            case 10:
                int i2 = C9528D.f26179s;
                return new double[3];
            case 11:
                return new C9553I();
            case 12:
                return new C9561K();
            case 13:
                return new C9565L();
            case 14:
                return new C9557J();
            case 18:
                int i3 = C9645e0.f26369s;
                return new long[2];
            default:
                int i4 = C9675k0.f26408s;
                return new long[2];
        }
    }
}
