package yg1;

import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p306x0.C8933d;

/* renamed from: yg1.a */
public final class C43399a {

    /* renamed from: c */
    public static final C43400a f101246c = new C43400a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C1636t0 f101247a;

    /* renamed from: b */
    private final C8933d f101248b;

    /* renamed from: yg1.a$a */
    public static final class C43400a {
        private C43400a() {
        }

        public /* synthetic */ C43400a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C43399a mo102076a(C1638u0 u0Var, C8933d dVar) {
            C41536l.m120489i(u0Var, "storeOwner");
            C1636t0 viewModelStore = u0Var.getViewModelStore();
            C41536l.m120488h(viewModelStore, "storeOwner.viewModelStore");
            return new C43399a(viewModelStore, dVar);
        }
    }

    public C43399a(C1636t0 t0Var, C8933d dVar) {
        C41536l.m120489i(t0Var, "store");
        this.f101247a = t0Var;
        this.f101248b = dVar;
    }

    /* renamed from: a */
    public final C8933d mo102074a() {
        return this.f101248b;
    }

    /* renamed from: b */
    public final C1636t0 mo102075b() {
        return this.f101247a;
    }
}
