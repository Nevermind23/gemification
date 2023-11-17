package p621tm;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cardapplications.presentation.model.OrderCardResultDetailItem;
import p481jm.C16245x;
import p615tg.C17963d;

/* renamed from: tm.k */
public final class C18013k extends C1819o {

    /* renamed from: tm.k$a */
    public static final class C18014a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C16245x f51233d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18014a(C16245x xVar) {
            super(xVar.mo3946b());
            C41536l.m120489i(xVar, "binding");
            this.f51233d = xVar;
        }

        /* renamed from: h */
        public final void mo45705h(OrderCardResultDetailItem.DetailItem detailItem) {
            C41536l.m120489i(detailItem, "item");
            this.f51233d.mo3946b().setText(detailItem.mo39769a());
            this.f51233d.mo3946b().setTitle(detailItem.mo39770b());
        }
    }

    public C18013k() {
        super(C17963d.f51158a.mo45633d());
    }

    /* renamed from: k */
    public void onBindViewHolder(C18014a aVar, int i) {
        OrderCardResultDetailItem.DetailItem detailItem;
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        if (g instanceof OrderCardResultDetailItem.DetailItem) {
            detailItem = (OrderCardResultDetailItem.DetailItem) g;
        } else {
            detailItem = null;
        }
        if (detailItem != null) {
            aVar.mo45705h(detailItem);
        }
    }

    /* renamed from: l */
    public C18014a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C16245x d = C16245x.m57916d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C18014a(d);
    }
}
