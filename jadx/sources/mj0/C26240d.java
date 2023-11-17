package mj0;

import android.view.View;
import kotlin.jvm.internal.C41536l;
import qj0.C27842a;
import th0.C28403h0;

/* renamed from: mj0.d */
public final class C26240d extends C26238b {

    /* renamed from: f */
    private final C27842a f66431f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26240d(C28403h0 h0Var, C27842a aVar) {
        super(h0Var);
        C41536l.m120489i(h0Var, "binding");
        C41536l.m120489i(aVar, "listener");
        this.f66431f = aVar;
        h0Var.f72035g.setOnClickListener(new C26239c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m82054n(C26240d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        if (dVar.getBindingAdapterPosition() != -1) {
            dVar.f66431f.mo61793e0();
        }
    }
}
