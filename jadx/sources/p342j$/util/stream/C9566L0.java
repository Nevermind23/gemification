package p342j$.util.stream;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import p342j$.util.C9499g;
import p342j$.util.C9501h;
import p342j$.util.C9503j;
import p342j$.util.C9504k;
import p342j$.util.C9505l;
import p342j$.util.C9506m;
import p342j$.util.Optional;
import p342j$.util.concurrent.C9407t;
import p342j$.util.function.BiConsumer;
import p342j$.util.function.C9424C;
import p342j$.util.function.C9431J;
import p342j$.util.function.C9448a0;
import p342j$.util.function.C9467k;
import p342j$.util.function.C9468k0;
import p342j$.util.function.C9474n0;
import p342j$.util.function.C9481r;
import p342j$.util.function.C9494x0;
import p342j$.util.function.Consumer;
import p342j$.util.function.Predicate;
import p342j$.util.function.ToLongFunction;

/* renamed from: j$.util.stream.L0 */
public final /* synthetic */ class C9566L0 implements C9448a0, C9431J, ToLongFunction, Consumer, C9494x0, BiConsumer, C9467k, C9481r, C9468k0, Predicate, C9424C, C9474n0 {

    /* renamed from: a */
    public final /* synthetic */ int f26239a;

    public /* synthetic */ C9566L0(int i) {
        this.f26239a = i;
    }

    public final void accept(Object obj) {
    }

    public final void accept(Object obj, double d) {
        ((C9499g) obj).accept(d);
    }

    public final void accept(Object obj, int i) {
        ((C9501h) obj).accept(i);
    }

    public final void accept(Object obj, Object obj2) {
        switch (this.f26239a) {
            case 12:
                ((List) obj).add(obj2);
                return;
            case 15:
                ((LinkedHashSet) obj).add(obj2);
                return;
            case 16:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                return;
            case 21:
                ((C9499g) obj).mo25638a((C9499g) obj2);
                return;
            default:
                ((C9501h) obj).mo25640a((C9501h) obj2);
                return;
        }
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f26239a) {
            case 22:
                return Predicate.CC.$default$and(this, predicate);
            case 23:
                return Predicate.CC.$default$and(this, predicate);
            case 24:
                return Predicate.CC.$default$and(this, predicate);
            default:
                return Predicate.CC.$default$and(this, predicate);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f26239a) {
            case 7:
                return Consumer.CC.$default$andThen(this, consumer);
            default:
                return Consumer.CC.$default$andThen(this, consumer);
        }
    }

    public final Object apply(double d) {
        return Double.valueOf(d);
    }

    public final Object apply(int i) {
        switch (this.f26239a) {
            case 1:
                int i2 = C9618Y1.f26335s;
                return new Object[i];
            case 3:
                return new Object[i];
            case 4:
                int i3 = C9677k2.f26411v;
                return new Integer[i];
            case 5:
                int i4 = C9687m2.f26422v;
                return new Long[i];
            default:
                int i5 = C9697o2.f26441v;
                return new Double[i];
        }
    }

    public final Object apply(long j) {
        return C9735w0.m35818j1(j);
    }

    public final double applyAsDouble(double d, double d2) {
        switch (this.f26239a) {
            case 17:
                return Math.min(d, d2);
            default:
                return Math.max(d, d2);
        }
    }

    public final int applyAsInt(int i, int i2) {
        switch (this.f26239a) {
            case 26:
                return Math.min(i, i2);
            default:
                return i + i2;
        }
    }

    public final long applyAsLong(Object obj) {
        int i = C9618Y1.f26335s;
        return 1;
    }

    /* renamed from: c */
    public final BiConsumer mo25420c(BiConsumer biConsumer) {
        switch (this.f26239a) {
            case 12:
                biConsumer.getClass();
                return new C9407t(1, this, biConsumer);
            case 15:
                biConsumer.getClass();
                return new C9407t(1, this, biConsumer);
            case 16:
                biConsumer.getClass();
                return new C9407t(1, this, biConsumer);
            case 21:
                biConsumer.getClass();
                return new C9407t(1, this, biConsumer);
            default:
                biConsumer.getClass();
                return new C9407t(1, this, biConsumer);
        }
    }

    public final Object get() {
        switch (this.f26239a) {
            case 9:
                return new C9499g();
            case 10:
                return new C9501h();
            case 11:
                return new ArrayList();
            case 13:
                return new C9503j();
            default:
                return new LinkedHashSet();
        }
    }

    public final /* synthetic */ Predicate negate() {
        switch (this.f26239a) {
            case 22:
                return Predicate.CC.$default$negate(this);
            case 23:
                return Predicate.CC.$default$negate(this);
            case 24:
                return Predicate.CC.$default$negate(this);
            default:
                return Predicate.CC.$default$negate(this);
        }
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo25500or(Predicate predicate) {
        switch (this.f26239a) {
            case 22:
                return Predicate.CC.$default$or(this, predicate);
            case 23:
                return Predicate.CC.$default$or(this, predicate);
            case 24:
                return Predicate.CC.$default$or(this, predicate);
            default:
                return Predicate.CC.$default$or(this, predicate);
        }
    }

    public final boolean test(Object obj) {
        switch (this.f26239a) {
            case 22:
                return ((C9504k) obj).mo25645c();
            case 23:
                return ((C9506m) obj).mo25655c();
            case 24:
                return ((Optional) obj).mo25271c();
            default:
                return ((C9505l) obj).mo25650c();
        }
    }
}
