package p342j$.util.stream;

import java.util.concurrent.atomic.AtomicBoolean;
import p342j$.util.concurrent.ConcurrentHashMap;
import p342j$.util.function.BiConsumer;
import p342j$.util.function.C9432K;
import p342j$.util.function.C9450b0;
import p342j$.util.function.C9483s;
import p342j$.util.function.C9494x0;
import p342j$.util.function.Consumer;
import p342j$.util.function.Predicate;

/* renamed from: j$.util.stream.o */
public final /* synthetic */ class C9694o implements Consumer, C9494x0 {

    /* renamed from: a */
    public final /* synthetic */ int f26435a;

    /* renamed from: b */
    public final /* synthetic */ Object f26436b;

    /* renamed from: c */
    public final /* synthetic */ Object f26437c;

    public /* synthetic */ C9694o(int i, Object obj, Object obj2) {
        this.f26435a = i;
        this.f26436b = obj;
        this.f26437c = obj2;
    }

    public final void accept(Object obj) {
        int i = this.f26435a;
        Object obj2 = this.f26437c;
        Object obj3 = this.f26436b;
        switch (i) {
            case 0:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj2;
                if (obj == null) {
                    atomicBoolean.set(true);
                    return;
                } else {
                    concurrentHashMap.putIfAbsent(obj, Boolean.TRUE);
                    return;
                }
            case 5:
                ((BiConsumer) obj3).accept(obj2, obj);
                return;
            default:
                ((C9648e3) obj3).mo26049f((Consumer) obj2, obj);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f26435a) {
            case 0:
                return Consumer.CC.$default$andThen(this, consumer);
            case 5:
                return Consumer.CC.$default$andThen(this, consumer);
            default:
                return Consumer.CC.$default$andThen(this, consumer);
        }
    }

    public final Object get() {
        int i = this.f26435a;
        Object obj = this.f26437c;
        Object obj2 = this.f26436b;
        switch (i) {
            case 1:
                return new C9700p0((C9432K) obj, (C9720t0) obj2);
            case 2:
                return new C9695o0((Predicate) obj, (C9720t0) obj2);
            case 3:
                return new C9710r0((C9483s) obj, (C9720t0) obj2);
            default:
                return new C9705q0((C9450b0) obj, (C9720t0) obj2);
        }
    }
}
