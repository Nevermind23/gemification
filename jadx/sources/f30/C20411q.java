package f30;

import a30.C19151a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import d30.C19878a;
import g60.C20742c;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p086g1.C6201a;
import p20.C27143e;
import p90.C27279d5;
import ue1.C43075l;

/* renamed from: f30.q */
public final class C20411q extends C20742c {

    /* renamed from: d */
    private final C27279d5 f55358d;

    /* renamed from: e */
    private C43075l f55359e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20411q(C27279d5 d5Var) {
        super((C6201a) d5Var);
        C41536l.m120489i(d5Var, "binding");
        this.f55358d = d5Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m66550j(C20411q qVar, C19151a aVar) {
        C41536l.m120489i(qVar, "this$0");
        C41536l.m120489i(aVar, "it");
        C43075l lVar = qVar.f55359e;
        if (lVar != null) {
            lVar.invoke(aVar);
        }
    }

    /* renamed from: i */
    public void onBind(C19878a aVar) {
        C41536l.m120489i(aVar, "data");
        RecyclerView recyclerView = this.f55358d.f68549e;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        C27143e eVar = new C27143e(false, 1, (DefaultConstructorMarker) null);
        eVar.mo6029i(((C19878a.C19886h) aVar).mo48213b());
        eVar.mo66442p(new C20410p(this));
        this.f55358d.f68549e.setAdapter(eVar);
    }

    /* renamed from: k */
    public final void mo48905k(C43075l lVar) {
        this.f55359e = lVar;
    }
}
