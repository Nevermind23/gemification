package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.C1620q0;
import androidx.savedstate.C1846a;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.C41536l;
import p163m0.C7047a;
import p306x0.C8933d;

/* renamed from: androidx.lifecycle.j0 */
public final class C1599j0 extends C1620q0.C1628d implements C1620q0.C1624b {

    /* renamed from: a */
    private Application f4608a;

    /* renamed from: b */
    private final C1620q0.C1624b f4609b;

    /* renamed from: c */
    private Bundle f4610c;

    /* renamed from: d */
    private C1593j f4611d;

    /* renamed from: e */
    private C1846a f4612e;

    public C1599j0(Application application, C8933d dVar, Bundle bundle) {
        C1620q0.C1621a aVar;
        C41536l.m120489i(dVar, "owner");
        this.f4612e = dVar.getSavedStateRegistry();
        this.f4611d = dVar.getLifecycle();
        this.f4610c = bundle;
        this.f4608a = application;
        if (application != null) {
            aVar = C1620q0.C1621a.f4639e.mo4939b(application);
        } else {
            aVar = new C1620q0.C1621a();
        }
        this.f4609b = aVar;
    }

    /* renamed from: a */
    public C1613n0 mo4803a(Class cls, C7047a aVar) {
        Constructor constructor;
        C41536l.m120489i(cls, "modelClass");
        C41536l.m120489i(aVar, "extras");
        String str = (String) aVar.mo21270a(C1620q0.C1625c.f4646c);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (aVar.mo21270a(C1583g0.f4589a) != null && aVar.mo21270a(C1583g0.f4590b) != null) {
            Application application = (Application) aVar.mo21270a(C1620q0.C1621a.f4641g);
            boolean isAssignableFrom = C1560b.class.isAssignableFrom(cls);
            if (!isAssignableFrom || application == null) {
                constructor = C1601k0.m5643c(cls, C1601k0.f4614b);
            } else {
                constructor = C1601k0.m5643c(cls, C1601k0.f4613a);
            }
            if (constructor == null) {
                return this.f4609b.mo4803a(cls, aVar);
            }
            if (!isAssignableFrom || application == null) {
                return C1601k0.m5644d(cls, constructor, C1583g0.m5612a(aVar));
            }
            return C1601k0.m5644d(cls, constructor, application, C1583g0.m5612a(aVar));
        } else if (this.f4611d != null) {
            return mo4915d(str, cls);
        } else {
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
    }

    /* renamed from: b */
    public C1613n0 mo4804b(Class cls) {
        C41536l.m120489i(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return mo4915d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: c */
    public void mo4841c(C1613n0 n0Var) {
        C41536l.m120489i(n0Var, "viewModel");
        if (this.f4611d != null) {
            C1846a aVar = this.f4612e;
            C41536l.m120486f(aVar);
            C1593j jVar = this.f4611d;
            C41536l.m120486f(jVar);
            LegacySavedStateHandleController.m5495a(n0Var, aVar, jVar);
        }
    }

    /* renamed from: d */
    public final C1613n0 mo4915d(String str, Class cls) {
        Constructor constructor;
        C1613n0 n0Var;
        Application application;
        C41536l.m120489i(str, "key");
        C41536l.m120489i(cls, "modelClass");
        C1593j jVar = this.f4611d;
        if (jVar != null) {
            boolean isAssignableFrom = C1560b.class.isAssignableFrom(cls);
            if (!isAssignableFrom || this.f4608a == null) {
                constructor = C1601k0.m5643c(cls, C1601k0.f4614b);
            } else {
                constructor = C1601k0.m5643c(cls, C1601k0.f4613a);
            }
            if (constructor != null) {
                C1846a aVar = this.f4612e;
                C41536l.m120486f(aVar);
                SavedStateHandleController b = LegacySavedStateHandleController.m5496b(aVar, jVar, str, this.f4610c);
                if (!isAssignableFrom || (application = this.f4608a) == null) {
                    n0Var = C1601k0.m5644d(cls, constructor, b.mo4839f());
                } else {
                    C41536l.m120486f(application);
                    n0Var = C1601k0.m5644d(cls, constructor, application, b.mo4839f());
                }
                n0Var.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", b);
                return n0Var;
            } else if (this.f4608a != null) {
                return this.f4609b.mo4804b(cls);
            } else {
                return C1620q0.C1625c.f4644a.mo4940a().mo4804b(cls);
            }
        } else {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }
}
