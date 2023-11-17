package p542od;

import java.util.List;
import p458id.C15600b;
import p500ld.C16546c;
import p500ld.C16550f;

/* renamed from: od.a */
public abstract class C17170a extends C16550f {

    /* renamed from: h */
    private static final C15600b f48190h = C15600b.m56349a(C17170a.class.getSimpleName());

    /* renamed from: e */
    private final List f48191e;

    /* renamed from: f */
    private boolean f48192f;

    /* renamed from: g */
    private boolean f48193g;

    protected C17170a(List list, boolean z) {
        this.f48191e = list;
        this.f48193g = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo26303m(C16546c cVar) {
        boolean z;
        super.mo26303m(cVar);
        if (!this.f48193g || !mo44588q(cVar)) {
            z = false;
        } else {
            z = true;
        }
        if (!mo44587p(cVar) || z) {
            f48190h.mo42878c("onStart:", "not supported or skipped. Dispatching COMPLETED state.");
            mo44591t(true);
            mo43702o(Integer.MAX_VALUE);
            return;
        }
        f48190h.mo42878c("onStart:", "supported and not skipped. Dispatching onStarted.");
        mo44590s(cVar, this.f48191e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract boolean mo44587p(C16546c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract boolean mo44588q(C16546c cVar);

    /* renamed from: r */
    public boolean mo44589r() {
        return this.f48192f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract void mo44590s(C16546c cVar, List list);

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo44591t(boolean z) {
        this.f48192f = z;
    }
}
