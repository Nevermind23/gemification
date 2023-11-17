package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.C1593j;
import androidx.savedstate.C1846a;
import kotlin.jvm.internal.C41536l;
import p306x0.C8933d;

public final class LegacySavedStateHandleController {

    /* renamed from: a */
    public static final LegacySavedStateHandleController f4504a = new LegacySavedStateHandleController();

    /* renamed from: androidx.lifecycle.LegacySavedStateHandleController$a */
    public static final class C1549a implements C1846a.C1847a {
        /* renamed from: a */
        public void mo4807a(C8933d dVar) {
            C41536l.m120489i(dVar, "owner");
            if (dVar instanceof C1638u0) {
                C1636t0 viewModelStore = ((C1638u0) dVar).getViewModelStore();
                C1846a savedStateRegistry = dVar.getSavedStateRegistry();
                for (String b : viewModelStore.mo4954c()) {
                    C1613n0 b2 = viewModelStore.mo4953b(b);
                    C41536l.m120486f(b2);
                    LegacySavedStateHandleController.m5495a(b2, savedStateRegistry, dVar.getLifecycle());
                }
                if (!viewModelStore.mo4954c().isEmpty()) {
                    savedStateRegistry.mo6117i(C1549a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
        }
    }

    private LegacySavedStateHandleController() {
    }

    /* renamed from: a */
    public static final void m5495a(C1613n0 n0Var, C1846a aVar, C1593j jVar) {
        C41536l.m120489i(n0Var, "viewModel");
        C41536l.m120489i(aVar, "registry");
        C41536l.m120489i(jVar, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) n0Var.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.mo4840g()) {
            savedStateHandleController.mo4838c(aVar, jVar);
            f4504a.m5497c(aVar, jVar);
        }
    }

    /* renamed from: b */
    public static final SavedStateHandleController m5496b(C1846a aVar, C1593j jVar, String str, Bundle bundle) {
        C41536l.m120489i(aVar, "registry");
        C41536l.m120489i(jVar, "lifecycle");
        C41536l.m120486f(str);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, C1580f0.f4582f.mo4895a(aVar.mo6111b(str), bundle));
        savedStateHandleController.mo4838c(aVar, jVar);
        f4504a.m5497c(aVar, jVar);
        return savedStateHandleController;
    }

    /* renamed from: c */
    private final void m5497c(C1846a aVar, C1593j jVar) {
        C1593j.C1598b b = jVar.mo4907b();
        if (b == C1593j.C1598b.INITIALIZED || b.mo4914b(C1593j.C1598b.STARTED)) {
            aVar.mo6117i(C1549a.class);
        } else {
            jVar.mo4906a(new LegacySavedStateHandleController$tryToAddRecreator$1(jVar, aVar));
        }
    }
}
