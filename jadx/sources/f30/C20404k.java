package f30;

import android.view.View;
import android.widget.ImageButton;
import d30.C19878a;
import g60.C20742c;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import p086g1.C6201a;
import p366bk.C10328q;
import p90.C27474y4;
import ue1.C43064a;

/* renamed from: f30.k */
public final class C20404k extends C20742c {

    /* renamed from: d */
    private final C27474y4 f55342d;

    /* renamed from: e */
    private C43064a f55343e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20404k(C27474y4 y4Var) {
        super((C6201a) y4Var);
        C41536l.m120489i(y4Var, "binding");
        this.f55342d = y4Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m66526j(C20404k kVar, View view) {
        C41536l.m120489i(kVar, "this$0");
        C43064a aVar = kVar.f55343e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: i */
    public void onBind(C19878a aVar) {
        C41536l.m120489i(aVar, "data");
        C19878a.C19887i iVar = (C19878a.C19887i) aVar;
        if (iVar.mo48217b()) {
            this.f55342d.f70265e.setText(C10328q.bill_split_label_amount_split_evenly);
        } else {
            this.f55342d.f70265e.setText(C10328q.bill_split_reset_moneys);
        }
        ImageButton imageButton = this.f55342d.f70266f;
        C41536l.m120488h(imageButton, "binding.resetMoneyAmountsBtn");
        C32343x.m95483r1(imageButton, !iVar.mo48217b(), false, 2, (Object) null);
        this.f55342d.f70266f.setOnClickListener(new C20403j(this));
    }

    /* renamed from: k */
    public final void mo48888k(C43064a aVar) {
        this.f55343e = aVar;
    }
}
