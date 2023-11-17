package nb0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import da0.C19949c;
import g91.C32343x;
import ha0.C24947x;
import ha0.C24948y;
import java.util.ArrayList;
import java.util.List;
import ka0.C25695d;
import kotlin.jvm.internal.C41536l;
import nb0.C26394a;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p615tg.C17963d;

/* renamed from: nb0.b */
public final class C26397b extends C1819o {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C26398a f66895f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C26399b f66896g;

    /* renamed from: nb0.b$a */
    public interface C26398a {
        /* renamed from: k3 */
        void mo65212k3();
    }

    /* renamed from: nb0.b$b */
    public interface C26399b {
        /* renamed from: h1 */
        void mo57197h1(C25695d dVar);
    }

    /* renamed from: nb0.b$c */
    public final class C26400c extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C24947x f66897d;

        /* renamed from: e */
        private final Context f66898e;

        /* renamed from: f */
        private final int f66899f;

        /* renamed from: g */
        final /* synthetic */ C26397b f66900g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26400c(C26397b bVar, C24947x xVar) {
            super(xVar.mo3946b());
            C41536l.m120489i(xVar, "binding");
            this.f66900g = bVar;
            this.f66897d = xVar;
            xVar.mo3946b().setOnClickListener(new C26402c(bVar, this));
            Context context = this.itemView.getContext();
            this.f66898e = context;
            this.f66899f = context.getResources().getDimensionPixelSize(C19949c.f54496a);
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m82505i(C26397b bVar, C26400c cVar, View view) {
            C41536l.m120489i(bVar, "this$0");
            C41536l.m120489i(cVar, "this$1");
            C26399b l = bVar.f66896g;
            if (l != null) {
                C26394a m = C26397b.m82499m(bVar, cVar.getAdapterPosition());
                C41536l.m120487g(m, "null cannot be cast to non-null type ge.bog.mobilebank.depositapplication.presentation.deposittypes.adapter.DepositTypesRecyclerItem.ListItem");
                l.mo57197h1(((C26394a.C26396b) m).mo65633a().mo57218e());
            }
        }

        /* JADX WARNING: type inference failed for: r7v8, types: [android.view.ViewGroup$LayoutParams] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo65639j(nb0.C26394a.C26396b r7) {
            /*
                r6 = this;
                java.lang.String r0 = "item"
                kotlin.jvm.internal.C41536l.m120489i(r7, r0)
                ha0.x r0 = r6.f66897d
                ge.bog.designsystem.components.depositcard.DepositCardView r0 = r0.f64261e
                ge.bog.mobilebank.depositapplication.presentation.deposittypes.model.DepositTypeDetailsUiModel r1 = r7.mo65633a()
                ka0.d r1 = r1.mo57218e()
                java.lang.String r1 = r1.name()
                int r1 = h91.C36162a.m107561b(r1)
                r0.setIcon(r1)
                ge.bog.mobilebank.depositapplication.presentation.deposittypes.model.DepositTypeDetailsUiModel r1 = r7.mo65633a()
                java.lang.String r1 = r1.mo57220f()
                r2 = 0
                r3 = 0
                if (r1 == 0) goto L_0x002f
                java.lang.Object[] r4 = new java.lang.Object[r3]
                java.lang.String r1 = g91.C32343x.m95388F(r1, r4)
                goto L_0x0030
            L_0x002f:
                r1 = r2
            L_0x0030:
                r0.setTitle(r1)
                java.lang.String r1 = "applications.deposits.main.page.deposit.card.min.amount"
                java.lang.Object[] r4 = new java.lang.Object[r3]
                java.lang.String r1 = g91.C32343x.m95388F(r1, r4)
                r0.setMinAmountTitle(r1)
                ge.bog.mobilebank.depositapplication.presentation.deposittypes.model.DepositTypeDetailsUiModel r1 = r7.mo65633a()
                java.lang.String r1 = r1.mo57224i()
                r0.setMinAmountValue(r1)
                ob0.a r1 = ob0.C26920a.f67675a
                android.view.View r4 = r6.itemView
                android.content.Context r4 = r4.getContext()
                java.lang.String r5 = "itemView.context"
                kotlin.jvm.internal.C41536l.m120488h(r4, r5)
                ge.bog.mobilebank.depositapplication.presentation.deposittypes.model.DepositTypeDetailsUiModel r7 = r7.mo65633a()
                java.lang.String r7 = r7.mo57225j()
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r7 = g91.C32343x.m95388F(r7, r3)
                android.text.SpannableStringBuilder r7 = r1.mo66214b(r4, r7)
                r0.setInterestRateMessage(r7)
                int r7 = r6.getAdapterPosition()
                nb0.b r0 = r6.f66900g
                int r0 = r0.getItemCount()
                int r0 = r0 + -1
                if (r7 != r0) goto L_0x0097
                ha0.x r7 = r6.f66897d
                ge.bog.designsystem.components.depositcard.DepositCardView r7 = r7.mo3946b()
                android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
                boolean r0 = r7 instanceof android.view.ViewGroup.MarginLayoutParams
                if (r0 == 0) goto L_0x008a
                r2 = r7
                android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            L_0x008a:
                if (r2 == 0) goto L_0x0097
                int r7 = r2.leftMargin
                int r0 = r2.topMargin
                int r1 = r2.rightMargin
                int r3 = r6.f66899f
                r2.setMargins(r7, r0, r1, r3)
            L_0x0097:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: nb0.C26397b.C26400c.mo65639j(nb0.a$b):void");
        }
    }

    /* renamed from: nb0.b$d */
    public final class C26401d extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C24948y f66901d;

        /* renamed from: e */
        final /* synthetic */ C26397b f66902e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26401d(C26397b bVar, C24948y yVar) {
            super(yVar.mo3946b());
            C41536l.m120489i(yVar, "binding");
            this.f66902e = bVar;
            this.f66901d = yVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m82508j(C26397b bVar, View view) {
            C41536l.m120489i(bVar, "this$0");
            C26398a k = bVar.f66895f;
            if (k != null) {
                k.mo65212k3();
            }
        }

        /* renamed from: k */
        private final boolean m82509k() {
            List f = this.f66902e.mo6026f();
            C41536l.m120488h(f, "currentList");
            ArrayList<C26394a.C26396b> arrayList = new ArrayList<>();
            for (Object next : f) {
                if (next instanceof C26394a.C26396b) {
                    arrayList.add(next);
                }
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            for (C26394a.C26396b a : arrayList) {
                if (a.mo65633a().mo57230q()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: i */
        public final void mo65640i() {
            C24948y yVar = this.f66901d;
            C26397b bVar = this.f66902e;
            yVar.f64265g.setTitle(C32343x.m95388F("applications.deposits.main.page.info.header", new Object[0]));
            yVar.f64265g.setText(C32343x.m95388F("applications.deposits.main.page.info.text", new Object[0]));
            yVar.f64264f.setTitleText(C32343x.m95388F("deposits.dep.types.page.campaign.block.text", new Object[0]));
            yVar.f64263e.setButtonText(C32343x.m95388F("applications.deposits.main.page.suggest.deposit.button", new Object[0]));
            InlineFeedback inlineFeedback = yVar.f64264f;
            C41536l.m120488h(inlineFeedback, "inlineFeedback");
            C32343x.m95483r1(inlineFeedback, m82509k(), false, 2, (Object) null);
            yVar.f64263e.setOnClickListener(new C26403d(bVar));
        }
    }

    public C26397b() {
        super(C17963d.f51158a.mo45633d());
    }

    /* renamed from: m */
    public static final /* synthetic */ C26394a m82499m(C26397b bVar, int i) {
        return (C26394a) bVar.mo6027g(i);
    }

    public int getItemViewType(int i) {
        return i;
    }

    /* renamed from: n */
    public final void mo65637n(C26398a aVar) {
        this.f66895f = aVar;
    }

    /* renamed from: o */
    public final void mo65638o(C26399b bVar) {
        this.f66896g = bVar;
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        C41536l.m120489i(f0Var, "holder");
        C26394a aVar = (C26394a) mo6027g(i);
        Object obj = null;
        if (f0Var instanceof C26401d) {
            if (aVar instanceof C26394a.C26395a) {
                obj = (C26394a.C26395a) aVar;
            }
            if (obj != null) {
                ((C26401d) f0Var).mo65640i();
            }
        } else if (f0Var instanceof C26400c) {
            if (aVar instanceof C26394a.C26396b) {
                obj = (C26394a.C26396b) aVar;
            }
            if (obj != null) {
                C41536l.m120488h(aVar, "item");
                ((C26400c) f0Var).mo65639j((C26394a.C26396b) aVar);
            }
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C26394a aVar = (C26394a) mo6027g(i);
        if (aVar instanceof C26394a.C26395a) {
            C24948y d = C24948y.m79773d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d, "inflate(\n               …, false\n                )");
            return new C26401d(this, d);
        } else if (aVar instanceof C26394a.C26396b) {
            C24947x d2 = C24947x.m79769d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d2, "inflate(\n               …, false\n                )");
            return new C26400c(this, d2);
        } else {
            throw new IllegalStateException("Illegal ViewType: " + i);
        }
    }
}
