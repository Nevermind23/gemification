package f30;

import android.view.View;
import d30.C19878a;
import g60.C20742c;
import kotlin.jvm.internal.C41536l;
import p086g1.C6201a;
import p90.C27289e5;
import ue1.C43064a;

/* renamed from: f30.i */
public final class C20402i extends C20742c {

    /* renamed from: d */
    private final C27289e5 f55339d;

    /* renamed from: e */
    private C43064a f55340e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20402i(C27289e5 e5Var) {
        super((C6201a) e5Var);
        C41536l.m120489i(e5Var, "binding");
        this.f55339d = e5Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m66522j(C20402i iVar, View view) {
        C41536l.m120489i(iVar, "this$0");
        C43064a aVar = iVar.f55340e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: i */
    public void onBind(C19878a aVar) {
        C41536l.m120489i(aVar, "data");
        this.f55339d.f68651e.setOnClickListener(new C20401h(this));
    }

    /* renamed from: k */
    public final void mo48885k(C43064a aVar) {
        this.f55340e = aVar;
    }
}
