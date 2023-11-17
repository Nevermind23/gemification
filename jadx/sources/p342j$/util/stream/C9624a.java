package p342j$.util.stream;

import java.util.List;
import p342j$.util.C9371P;
import p342j$.util.function.C9431J;
import p342j$.util.function.C9448a0;
import p342j$.util.function.C9494x0;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.a */
public final /* synthetic */ class C9624a implements C9494x0, C9448a0, Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f26340a;

    /* renamed from: b */
    public final /* synthetic */ Object f26341b;

    public /* synthetic */ C9624a(Object obj, int i) {
        this.f26340a = i;
        this.f26341b = obj;
    }

    public final void accept(Object obj) {
        int i = this.f26340a;
        Object obj2 = this.f26341b;
        switch (i) {
            case 3:
                ((C9657g2) obj2).accept(obj);
                return;
            default:
                ((List) obj2).add(obj);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f26340a) {
            case 3:
                return Consumer.CC.$default$andThen(this, consumer);
            default:
                return Consumer.CC.$default$andThen(this, consumer);
        }
    }

    public final Object apply(long j) {
        int i = C9562K0.f26234k;
        return C9735w0.m35802P0(j, (C9431J) this.f26341b);
    }

    public final Object get() {
        int i = this.f26340a;
        Object obj = this.f26341b;
        switch (i) {
            case 0:
                return (C9371P) obj;
            default:
                return ((C9634c) obj).mo26028G1();
        }
    }
}
