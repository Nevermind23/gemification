package p342j$.util.stream;

import p342j$.util.C9503j;
import p342j$.util.concurrent.C9407t;
import p342j$.util.function.BiConsumer;
import p342j$.util.function.C9424C;
import p342j$.util.function.C9431J;
import p342j$.util.function.C9440T;
import p342j$.util.function.C9448a0;
import p342j$.util.function.C9480q0;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.X */
public final /* synthetic */ class C9612X implements C9431J, C9424C, C9440T, C9448a0, C9480q0, BiConsumer, Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f26323a;

    public /* synthetic */ C9612X(int i) {
        this.f26323a = i;
    }

    public final void accept(Object obj) {
    }

    public final void accept(Object obj, long j) {
        ((C9503j) obj).accept(j);
    }

    public final void accept(Object obj, Object obj2) {
        ((C9503j) obj).mo25642a((C9503j) obj2);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final Object apply(int i) {
        return Integer.valueOf(i);
    }

    public final Object apply(long j) {
        return Long.valueOf(j);
    }

    public final int applyAsInt(int i, int i2) {
        return Math.max(i, i2);
    }

    public final long applyAsLong(long j, long j2) {
        switch (this.f26323a) {
            case 2:
                return Math.min(j, j2);
            case 3:
                return Math.max(j, j2);
            default:
                return j + j2;
        }
    }

    /* renamed from: c */
    public final BiConsumer mo25420c(BiConsumer biConsumer) {
        biConsumer.getClass();
        return new C9407t(1, this, biConsumer);
    }
}
