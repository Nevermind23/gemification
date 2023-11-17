package f30;

import android.view.View;
import androidx.cardview.widget.CardView;
import d30.C19878a;
import g60.C20742c;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import p086g1.C6201a;
import p90.C27259b5;
import ue1.C43064a;

/* renamed from: f30.g */
public final class C20400g extends C20742c {

    /* renamed from: d */
    private final C27259b5 f55336d;

    /* renamed from: e */
    private C43064a f55337e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20400g(C27259b5 b5Var) {
        super((C6201a) b5Var);
        C41536l.m120489i(b5Var, "binding");
        this.f55336d = b5Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m66518j(C20400g gVar, View view) {
        C41536l.m120489i(gVar, "this$0");
        C43064a aVar = gVar.f55337e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: i */
    public void onBind(C19878a aVar) {
        C41536l.m120489i(aVar, "data");
        C19878a.C19883e eVar = (C19878a.C19883e) aVar;
        this.f55336d.f68391f.setText(String.valueOf(eVar.mo48205b()));
        CardView cardView = this.f55336d.f68390e;
        C41536l.m120488h(cardView, "binding.addresseeCountLayout");
        boolean z = true;
        if (eVar.mo48205b() <= 1) {
            z = false;
        }
        C32343x.m95483r1(cardView, z, false, 2, (Object) null);
        this.f55336d.f68392g.setOnClickListener(new C20399f(this));
    }

    /* renamed from: k */
    public final void mo48882k(C43064a aVar) {
        this.f55337e = aVar;
    }
}
