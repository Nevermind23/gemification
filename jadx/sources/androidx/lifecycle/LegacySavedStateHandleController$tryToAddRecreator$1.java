package androidx.lifecycle;

import androidx.lifecycle.C1593j;
import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.savedstate.C1846a;
import kotlin.jvm.internal.C41536l;

public final class LegacySavedStateHandleController$tryToAddRecreator$1 implements C1606m {

    /* renamed from: d */
    final /* synthetic */ C1593j f4505d;

    /* renamed from: e */
    final /* synthetic */ C1846a f4506e;

    LegacySavedStateHandleController$tryToAddRecreator$1(C1593j jVar, C1846a aVar) {
        this.f4505d = jVar;
        this.f4506e = aVar;
    }

    /* renamed from: b */
    public void mo336b(C1619q qVar, C1593j.C1594a aVar) {
        C41536l.m120489i(qVar, "source");
        C41536l.m120489i(aVar, "event");
        if (aVar == C1593j.C1594a.ON_START) {
            this.f4505d.mo4909d(this);
            this.f4506e.mo6117i(LegacySavedStateHandleController.C1549a.class);
        }
    }
}
