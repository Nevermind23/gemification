package mj0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p086g1.C6201a;
import pi0.C27534a;

/* renamed from: mj0.b */
public abstract class C26238b extends RecyclerView.C1734f0 {

    /* renamed from: d */
    private final C6201a f66428d;

    /* renamed from: e */
    public C27534a f66429e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26238b(C6201a aVar) {
        super(aVar.mo3946b());
        C41536l.m120489i(aVar, "binding");
        this.f66428d = aVar;
    }

    /* renamed from: h */
    public final C6201a mo65241h() {
        return this.f66428d;
    }

    /* renamed from: i */
    public final C27534a mo65242i() {
        C27534a aVar = this.f66429e;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("item");
        return null;
    }

    /* renamed from: j */
    public void mo48397j(C27534a aVar) {
        C41536l.m120489i(aVar, "item");
        mo65244l(aVar);
    }

    /* renamed from: k */
    public void mo65243k(C27534a aVar, List list) {
        C41536l.m120489i(aVar, "item");
        C41536l.m120489i(list, "payloads");
        mo65244l(aVar);
    }

    /* renamed from: l */
    public final void mo65244l(C27534a aVar) {
        C41536l.m120489i(aVar, "<set-?>");
        this.f66429e = aVar;
    }
}
