package androidx.lifecycle;

import androidx.lifecycle.C1593j;
import androidx.savedstate.C1846a;
import kotlin.jvm.internal.C41536l;

public final class SavedStateHandleController implements C1606m {

    /* renamed from: d */
    private final String f4547d;

    /* renamed from: e */
    private final C1580f0 f4548e;

    /* renamed from: f */
    private boolean f4549f;

    public SavedStateHandleController(String str, C1580f0 f0Var) {
        C41536l.m120489i(str, "key");
        C41536l.m120489i(f0Var, "handle");
        this.f4547d = str;
        this.f4548e = f0Var;
    }

    /* renamed from: b */
    public void mo336b(C1619q qVar, C1593j.C1594a aVar) {
        C41536l.m120489i(qVar, "source");
        C41536l.m120489i(aVar, "event");
        if (aVar == C1593j.C1594a.ON_DESTROY) {
            this.f4549f = false;
            qVar.getLifecycle().mo4909d(this);
        }
    }

    /* renamed from: c */
    public final void mo4838c(C1846a aVar, C1593j jVar) {
        C41536l.m120489i(aVar, "registry");
        C41536l.m120489i(jVar, "lifecycle");
        if (!this.f4549f) {
            this.f4549f = true;
            jVar.mo4906a(this);
            aVar.mo6116h(this.f4547d, this.f4548e.mo4893c());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner".toString());
    }

    /* renamed from: f */
    public final C1580f0 mo4839f() {
        return this.f4548e;
    }

    /* renamed from: g */
    public final boolean mo4840g() {
        return this.f4549f;
    }
}
