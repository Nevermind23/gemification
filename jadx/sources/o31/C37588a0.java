package o31;

import androidx.lifecycle.C1613n0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1630r0;
import kotlin.jvm.internal.C41536l;
import p163m0.C7047a;
import ue1.C43064a;

/* renamed from: o31.a0 */
public final class C37588a0 {

    /* renamed from: a */
    public static final C37588a0 f90326a = new C37588a0();

    /* renamed from: o31.a0$a */
    public static final class C37589a implements C1620q0.C1624b {

        /* renamed from: a */
        final /* synthetic */ C43064a f90327a;

        C37589a(C43064a aVar) {
            this.f90327a = aVar;
        }

        /* renamed from: a */
        public /* synthetic */ C1613n0 mo4803a(Class cls, C7047a aVar) {
            return C1630r0.m5685b(this, cls, aVar);
        }

        /* renamed from: b */
        public C1613n0 mo4804b(Class cls) {
            C41536l.m120489i(cls, "modelClass");
            Object invoke = this.f90327a.invoke();
            C41536l.m120487g(invoke, "null cannot be cast to non-null type T of ge.bog.mobilebank.shared.helper.ViewModelFactoryProvider.provideViewModel.<no name provided>.create");
            return (C1613n0) invoke;
        }
    }

    private C37588a0() {
    }

    /* renamed from: a */
    public final C1620q0.C1624b mo90779a(C43064a aVar) {
        C41536l.m120489i(aVar, "predicate");
        return new C37589a(aVar);
    }
}
