package g20;

import androidx.recyclerview.widget.RecyclerView;
import d20.C19874l;
import g91.C32343x;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p90.C27290e6;

/* renamed from: g20.b0 */
public final class C20595b0 extends RecyclerView.C1734f0 {

    /* renamed from: f */
    public static final C20596a f55646f = new C20596a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C27290e6 f55647d;

    /* renamed from: e */
    private final C19874l f55648e;

    /* renamed from: g20.b0$a */
    public static final class C20596a {
        private C20596a() {
        }

        public /* synthetic */ C20596a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20595b0(C27290e6 e6Var, C19874l lVar) {
        super(e6Var.mo3946b());
        C41536l.m120489i(e6Var, "binding");
        C41536l.m120489i(lVar, "adapter");
        this.f55647d = e6Var;
        this.f55648e = lVar;
        e6Var.f68654f.setTitle(C32343x.m95388F("text.nbo.offers.title", new Object[0]));
        e6Var.f68653e.setAdapter(lVar);
    }

    /* renamed from: h */
    public final void mo49140h(List list) {
        C41536l.m120489i(list, "items");
        this.f55648e.mo6029i(list);
    }
}
