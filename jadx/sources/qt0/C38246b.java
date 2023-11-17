package qt0;

import androidx.lifecycle.C1613n0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1630r0;
import kotlin.jvm.internal.C41536l;
import p163m0.C7047a;
import ue1.C43064a;

/* renamed from: qt0.b */
public final class C38246b {

    /* renamed from: a */
    public static final C38246b f91733a = new C38246b();

    /* renamed from: qt0.b$a */
    public static final class C38247a implements C1620q0.C1624b {

        /* renamed from: a */
        final /* synthetic */ C43064a f91734a;

        C38247a(C43064a aVar) {
            this.f91734a = aVar;
        }

        /* renamed from: a */
        public /* synthetic */ C1613n0 mo4803a(Class cls, C7047a aVar) {
            return C1630r0.m5685b(this, cls, aVar);
        }

        /* renamed from: b */
        public C1613n0 mo4804b(Class cls) {
            C41536l.m120489i(cls, "modelClass");
            Object invoke = this.f91734a.invoke();
            C41536l.m120487g(invoke, "null cannot be cast to non-null type T of ge.bog.mobilebank.loyaltyandbonusprograms.util.ViewModelFactoryProvider.providerViewModelFactory.<no name provided>.create");
            return (C1613n0) invoke;
        }
    }

    private C38246b() {
    }

    /* renamed from: a */
    public final C1620q0.C1624b mo91781a(C43064a aVar) {
        C41536l.m120489i(aVar, "predicate");
        return new C38247a(aVar);
    }
}
