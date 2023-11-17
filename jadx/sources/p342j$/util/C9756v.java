package p342j$.util;

import p342j$.util.function.C9441U;
import p342j$.util.function.C9444X;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.v */
public final /* synthetic */ class C9756v implements C9444X {

    /* renamed from: a */
    public final /* synthetic */ Consumer f26537a;

    public /* synthetic */ C9756v(Consumer consumer) {
        this.f26537a = consumer;
    }

    public final void accept(long j) {
        this.f26537a.accept(Long.valueOf(j));
    }

    /* renamed from: f */
    public final C9444X mo25289f(C9444X x) {
        x.getClass();
        return new C9441U(this, x);
    }
}
