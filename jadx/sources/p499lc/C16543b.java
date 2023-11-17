package p499lc;

import androidx.lifecycle.C1613n0;
import androidx.lifecycle.LiveData;
import kotlin.jvm.internal.C41536l;
import p345ad.C9796h;

/* renamed from: lc.b */
public final class C16543b extends C1613n0 {

    /* renamed from: d */
    private C9796h f46698d;

    /* renamed from: e */
    private LiveData f46699e;

    public C16543b(C9796h hVar) {
        C41536l.m120489i(hVar, "notificationSocket");
        this.f46698d = hVar;
        m58749dw();
        m58751hw();
    }

    /* renamed from: dw */
    private final void m58749dw() {
        this.f46698d.mo96620I();
    }

    /* renamed from: fw */
    public static /* synthetic */ void m58750fw(C16543b bVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "closed";
        }
        bVar.mo43687ew(str);
    }

    /* renamed from: hw */
    private final void m58751hw() {
        this.f46699e = this.f46698d.mo26288d0();
    }

    /* renamed from: ew */
    public final void mo43687ew(String str) {
        C41536l.m120489i(str, "message");
        this.f46698d.mo26287c0(str);
    }

    /* renamed from: gw */
    public final LiveData mo43688gw() {
        return this.f46699e;
    }
}
