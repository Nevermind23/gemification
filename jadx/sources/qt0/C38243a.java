package qt0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.C1796h;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32303f;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.list.C13364a;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.designsystem.components.textgroup.TextGroupView;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasHistoryItemUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.CasDetailsUiModel;
import p615tg.C17963d;
import rs0.C38335b;
import vs0.C39454m;
import vs0.C39459r;

/* renamed from: qt0.a */
public final class C38243a {

    /* renamed from: a */
    public static final C38243a f91731a = new C38243a();

    /* renamed from: qt0.a$a */
    public static final class C38244a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C39459r f91732d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38244a(C39459r rVar) {
            super(rVar.mo3946b());
            C41536l.m120489i(rVar, "binding");
            this.f91732d = rVar;
        }

        /* renamed from: h */
        public final void mo91778h(CasHistoryItemUiModel casHistoryItemUiModel) {
            C41536l.m120489i(casHistoryItemUiModel, "item");
            this.f91732d.f93841f.setText(C32343x.m95388F(casHistoryItemUiModel.mo75019d(), new Object[0]));
            this.f91732d.f93840e.setText(C32303f.m95200k(casHistoryItemUiModel.mo75017a(), casHistoryItemUiModel.mo75018b()));
        }
    }

    /* renamed from: qt0.a$b */
    public static final class C38245b extends C1819o {
        C38245b(C1796h.C1802f fVar) {
            super(fVar);
        }

        /* renamed from: k */
        public void onBindViewHolder(C38244a aVar, int i) {
            C41536l.m120489i(aVar, "holder");
            Object g = mo6027g(i);
            C41536l.m120488h(g, "getItem(position)");
            aVar.mo91778h((CasHistoryItemUiModel) g);
        }

        /* renamed from: l */
        public C38244a onCreateViewHolder(ViewGroup viewGroup, int i) {
            C41536l.m120489i(viewGroup, "parent");
            C39459r d = C39459r.m114692d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d, "inflate(\n               ….context), parent, false)");
            return new C38244a(d);
        }
    }

    private C38243a() {
    }

    /* renamed from: a */
    private final void m112450a(CasDetailsUiModel casDetailsUiModel, TextGroupView textGroupView) {
        textGroupView.setTitle(C32343x.m95388F("cas.details.sum.monthly", new Object[0]));
        textGroupView.setBottomTitle(C32303f.m95200k(casDetailsUiModel.mo75123b(), casDetailsUiModel.mo75133j()));
    }

    /* renamed from: b */
    private final void m112451b(CasDetailsUiModel casDetailsUiModel, TextGroupView textGroupView) {
        textGroupView.setTitle(C32343x.m95388F("cas.details.sum.total", new Object[0]));
        textGroupView.setBottomTitle(C32303f.m95200k(casDetailsUiModel.mo75136m(), casDetailsUiModel.mo75133j()));
    }

    /* renamed from: c */
    public final C1819o mo91775c() {
        return new C38245b(C17963d.f51158a.mo45633d());
    }

    /* renamed from: d */
    public final void mo91776d(CasDetailsUiModel casDetailsUiModel, C39454m mVar, C1819o oVar) {
        C41536l.m120489i(casDetailsUiModel, "details");
        C41536l.m120489i(mVar, "binding");
        C41536l.m120489i(oVar, "adapter");
        PageDescriptionView pageDescriptionView = mVar.f93821e;
        C41536l.m120488h(pageDescriptionView, "binding.emptyStateView");
        C32343x.m95483r1(pageDescriptionView, casDetailsUiModel.mo75126e().isEmpty(), false, 2, (Object) null);
        RecyclerView recyclerView = mVar.f93823g;
        C41536l.m120488h(recyclerView, "binding.piggyBankHistoryRecycler");
        C32343x.m95483r1(recyclerView, !casDetailsUiModel.mo75126e().isEmpty(), false, 2, (Object) null);
        oVar.mo6029i(casDetailsUiModel.mo75126e());
        TextGroupView textGroupView = mVar.f93822f;
        C41536l.m120488h(textGroupView, "binding.monthlyAmount");
        m112450a(casDetailsUiModel, textGroupView);
        TextGroupView textGroupView2 = mVar.f93826j;
        C41536l.m120488h(textGroupView2, "binding.totalAmount");
        m112451b(casDetailsUiModel, textGroupView2);
    }

    /* renamed from: e */
    public final void mo91777e(C39454m mVar, Context context) {
        C41536l.m120489i(mVar, "binding");
        C41536l.m120489i(context, "context");
        mVar.f93823g.mo5351j(new C13364a(C0767a.m2895e(context, C38335b.f91850e), true, false));
        mVar.f93824h.setTitle(C32343x.m95388F("cas.details.stastistics", new Object[0]));
        mVar.f93825i.setTitle(C32343x.m95388F("cas.details.transaction.history", new Object[0]));
        mVar.f93821e.setDrawableSrc(Integer.valueOf(C38335b.icons_48_statement_statement_outline));
        mVar.f93821e.setText(C32343x.m95388F("cas.details.tab.history.empty.state", new Object[0]));
    }
}
