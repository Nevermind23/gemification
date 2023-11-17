package p342j$.util.concurrent;

import p342j$.util.function.BiConsumer;
import p342j$.util.function.BiFunction;
import p342j$.util.function.Consumer;
import p342j$.util.function.Function;

/* renamed from: j$.util.concurrent.t */
public final /* synthetic */ class C9407t implements BiConsumer, BiFunction, Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f26037a;

    /* renamed from: b */
    public final /* synthetic */ Object f26038b;

    /* renamed from: c */
    public final /* synthetic */ Object f26039c;

    public /* synthetic */ C9407t(int i, Object obj, Object obj2) {
        this.f26037a = i;
        this.f26038b = obj;
        this.f26039c = obj2;
    }

    public /* synthetic */ C9407t(BiFunction biFunction, Function function) {
        this.f26037a = 2;
        this.f26039c = biFunction;
        this.f26038b = function;
    }

    /* renamed from: a */
    public final BiFunction mo25417a(Function function) {
        function.getClass();
        return new C9407t(this, function);
    }

    public final void accept(Object obj) {
        ((Consumer) this.f26038b).accept(obj);
        ((Consumer) this.f26039c).accept(obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000e A[LOOP:0: B:3:0x000e->B:6:0x001c, LOOP_START, PHI: r5 
      PHI: (r5v1 java.lang.Object) = (r5v0 java.lang.Object), (r5v3 java.lang.Object) binds: [B:2:0x000a, B:6:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r4, java.lang.Object r5) {
        /*
            r3 = this;
            int r0 = r3.f26037a
            java.lang.Object r1 = r3.f26039c
            java.lang.Object r2 = r3.f26038b
            switch(r0) {
                case 0: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x001f
        L_0x000a:
            java.util.concurrent.ConcurrentMap r2 = (java.util.concurrent.ConcurrentMap) r2
            j$.util.function.BiFunction r1 = (p342j$.util.function.BiFunction) r1
        L_0x000e:
            java.lang.Object r0 = r1.apply(r4, r5)
            boolean r5 = r2.replace(r4, r5, r0)
            if (r5 != 0) goto L_0x001e
            java.lang.Object r5 = r2.get(r4)
            if (r5 != 0) goto L_0x000e
        L_0x001e:
            return
        L_0x001f:
            j$.util.function.BiConsumer r2 = (p342j$.util.function.BiConsumer) r2
            j$.util.function.BiConsumer r1 = (p342j$.util.function.BiConsumer) r1
            r2.accept(r4, r5)
            r1.accept(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p342j$.util.concurrent.C9407t.accept(java.lang.Object, java.lang.Object):void");
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final Object apply(Object obj, Object obj2) {
        return ((Function) this.f26038b).apply(((BiFunction) this.f26039c).apply(obj, obj2));
    }

    /* renamed from: c */
    public final BiConsumer mo25420c(BiConsumer biConsumer) {
        switch (this.f26037a) {
            case 0:
                biConsumer.getClass();
                return new C9407t(1, this, biConsumer);
            default:
                biConsumer.getClass();
                return new C9407t(1, this, biConsumer);
        }
    }
}
