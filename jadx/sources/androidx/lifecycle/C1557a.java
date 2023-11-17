package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.C1620q0;
import androidx.savedstate.C1846a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p306x0.C8933d;

/* renamed from: androidx.lifecycle.a */
public abstract class C1557a extends C1620q0.C1628d implements C1620q0.C1624b {

    /* renamed from: d */
    public static final C1558a f4554d = new C1558a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private C1846a f4555a;

    /* renamed from: b */
    private C1593j f4556b;

    /* renamed from: c */
    private Bundle f4557c;

    /* renamed from: androidx.lifecycle.a$a */
    public static final class C1558a {
        private C1558a() {
        }

        public /* synthetic */ C1558a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C1557a() {
    }

    /* renamed from: d */
    private final C1613n0 m5551d(String str, Class cls) {
        C1846a aVar = this.f4555a;
        C41536l.m120486f(aVar);
        C1593j jVar = this.f4556b;
        C41536l.m120486f(jVar);
        SavedStateHandleController b = LegacySavedStateHandleController.m5496b(aVar, jVar, str, this.f4557c);
        C1613n0 e = mo4842e(str, cls, b.mo4839f());
        e.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", b);
        return e;
    }

    /* renamed from: a */
    public C1613n0 mo4803a(Class cls, C7047a aVar) {
        C41536l.m120489i(cls, "modelClass");
        C41536l.m120489i(aVar, "extras");
        String str = (String) aVar.mo21270a(C1620q0.C1625c.f4646c);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (this.f4555a != null) {
            return m5551d(str, cls);
        } else {
            return mo4842e(str, cls, C1583g0.m5612a(aVar));
        }
    }

    /* renamed from: b */
    public C1613n0 mo4804b(Class cls) {
        C41536l.m120489i(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        } else if (this.f4556b != null) {
            return m5551d(canonicalName, cls);
        } else {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    /* renamed from: c */
    public void mo4841c(C1613n0 n0Var) {
        C41536l.m120489i(n0Var, "viewModel");
        C1846a aVar = this.f4555a;
        if (aVar != null) {
            C41536l.m120486f(aVar);
            C1593j jVar = this.f4556b;
            C41536l.m120486f(jVar);
            LegacySavedStateHandleController.m5495a(n0Var, aVar, jVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract C1613n0 mo4842e(String str, Class cls, C1580f0 f0Var);

    public C1557a(C8933d dVar, Bundle bundle) {
        C41536l.m120489i(dVar, "owner");
        this.f4555a = dVar.getSavedStateRegistry();
        this.f4556b = dVar.getLifecycle();
        this.f4557c = bundle;
    }
}
