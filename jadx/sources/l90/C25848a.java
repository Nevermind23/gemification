package l90;

import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import h00.C24846c;
import h80.C24912s;
import h80.C24913t;
import h80.C24914u;
import h80.C24916w;
import h80.C24917x;
import h80.C24918y;
import h80.C24919z;
import he1.C41224m;
import he1.C41238w;
import java.math.BigDecimal;
import java.util.List;
import k90.C25688c;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import n90.C26381a;
import n90.C26390b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p341ge.bog.designsystem.components.textgroup.TextGroupView;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo;
import p615tg.C17963d;
import u70.C28605a;
import u70.C28609e;
import ue1.C43075l;

/* renamed from: l90.a */
public final class C25848a extends C1819o {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C25688c f65816f;

    /* renamed from: g */
    private C24846c f65817g;

    /* renamed from: l90.a$a */
    public final class C25849a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C24912s f65818d;

        /* renamed from: e */
        final /* synthetic */ C25848a f65819e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25849a(C25848a aVar, C24912s sVar) {
            super(sVar.mo3946b());
            C41536l.m120489i(sVar, "binding");
            this.f65819e = aVar;
            this.f65818d = sVar;
        }

        /* renamed from: h */
        public final C41238w mo64636h(C26381a.C26382a aVar) {
            C41536l.m120489i(aVar, "data");
            C24912s sVar = this.f65818d;
            if (aVar.mo65609e()) {
                sVar.f64054e.setLayerStyle(C28609e.f72618d);
            }
            PageState pageState = sVar.f64056g;
            pageState.setPageStateType(aVar.mo65607c());
            pageState.setTitleText(aVar.mo65608d());
            String b = aVar.mo65606b();
            if (b == null) {
                return null;
            }
            TextView textView = sVar.f64055f;
            C41536l.m120488h(textView, "description");
            C32343x.m95447f1(textView);
            sVar.f64055f.setText(b);
            return C41238w.f97225a;
        }
    }

    /* renamed from: l90.a$b */
    public final class C25850b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C24913t f65820d;

        /* renamed from: e */
        final /* synthetic */ C25848a f65821e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25850b(C25848a aVar, C24913t tVar) {
            super(tVar.mo3946b());
            C41536l.m120489i(tVar, "binding");
            this.f65821e = aVar;
            this.f65820d = tVar;
        }

        /* renamed from: h */
        public final void mo64637h(C26381a.C26383b bVar) {
            String str;
            C41536l.m120489i(bVar, "data");
            C24913t tVar = this.f65820d;
            BigDecimal d = bVar.mo65612d();
            if (d != null) {
                TextGroupView textGroupView = tVar.f64059f;
                C41536l.m120488h(textGroupView, "requestedAmount");
                C32343x.m95447f1(textGroupView);
                tVar.f64059f.setTitle(C32343x.m95388F("CLA.result.requested.amount", new Object[0]));
                tVar.f64059f.setBottomTitle(C32343x.m95408P(d, bVar.mo65610b()));
            }
            tVar.f64058e.setTitle(C32343x.m95388F("CLA.result.approved.amount", new Object[0]));
            TextGroupView textGroupView2 = tVar.f64058e;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            BigDecimal c = bVar.mo65611c();
            if (c != null) {
                str = C32343x.m95408P(c, bVar.mo65610b());
            } else {
                str = null;
            }
            textGroupView2.setBottomTitle(spannableStringBuilder.append(str, new TextAppearanceSpan(this.itemView.getContext(), C28609e.ClaApprovedAmountStyle), 33));
        }
    }

    /* renamed from: l90.a$c */
    public final class C25851c extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C24914u f65822d;

        /* renamed from: e */
        final /* synthetic */ C25848a f65823e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25851c(C25848a aVar, C24914u uVar) {
            super(uVar.mo3946b());
            C41536l.m120489i(uVar, "binding");
            this.f65823e = aVar;
            this.f65822d = uVar;
        }

        /* renamed from: h */
        public final TwoLineTextItem mo64638h(C26381a.C26384c cVar) {
            String str;
            C41536l.m120489i(cVar, "data");
            C24914u uVar = this.f65822d;
            uVar.f64062e.setText(C32343x.m95388F("CLA.result.appl.details.header", new Object[0]));
            TwoLineTextItem twoLineTextItem = uVar.f64065h;
            twoLineTextItem.setTitle(C32343x.m95388F("CLA.result.appl.details.type", new Object[0]));
            twoLineTextItem.setText(C32343x.m95388F("credit.application.CL.result.screen.loan.type.field.value", new Object[0]));
            TwoLineTextItem twoLineTextItem2 = uVar.f64063f;
            twoLineTextItem2.setTitle(C32343x.m95388F("CLA.result.appl.details.requested.amount", new Object[0]));
            BigDecimal d = cVar.mo65615d();
            if (d != null) {
                str = C32343x.m95408P(d, cVar.mo65613b());
            } else {
                str = null;
            }
            twoLineTextItem2.setText(str);
            TwoLineTextItem twoLineTextItem3 = uVar.f64064g;
            twoLineTextItem3.setTitle(C32343x.m95388F("CLA.result.appl.details.term", new Object[0]));
            twoLineTextItem3.setText(cVar.mo65614c());
            C41536l.m120488h(twoLineTextItem3, "with(binding) {\n        …m\n            }\n        }");
            return twoLineTextItem3;
        }
    }

    /* renamed from: l90.a$d */
    public final class C25852d extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C24916w f65824d;

        /* renamed from: e */
        private final C25861f f65825e;

        /* renamed from: f */
        final /* synthetic */ C25848a f65826f;

        /* renamed from: l90.a$d$a */
        static final class C25853a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C25848a f65827d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C25853a(C25848a aVar) {
                super(1);
                this.f65827d = aVar;
            }

            /* renamed from: a */
            public final void mo64640a(OfferInfo offerInfo) {
                C41536l.m120489i(offerInfo, "offer");
                this.f65827d.f65816f.mo56242r2(offerInfo);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo64640a((OfferInfo) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25852d(C25848a aVar, C24916w wVar) {
            super(wVar.mo3946b());
            C41536l.m120489i(wVar, "binding");
            this.f65826f = aVar;
            this.f65824d = wVar;
            this.f65825e = new C25861f(new C25853a(aVar));
        }

        /* renamed from: h */
        public final void mo64639h(C26381a.C26385d dVar) {
            C41536l.m120489i(dVar, "data");
            C24916w wVar = this.f65824d;
            wVar.f64072h.setAdapter(this.f65825e);
            this.f65825e.mo6029i(dVar.mo65616b());
            if (dVar.mo65617c()) {
                EmptyWidget emptyWidget = wVar.f64069e;
                C41536l.m120488h(emptyWidget, "bindData$lambda$1$lambda$0");
                C32343x.m95447f1(emptyWidget);
                emptyWidget.setTitle(C32343x.m95388F("CLA.result.other.offers", new Object[0]));
            }
        }
    }

    /* renamed from: l90.a$e */
    public final class C25854e extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C24917x f65828d;

        /* renamed from: e */
        final /* synthetic */ C25848a f65829e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25854e(C25848a aVar, C24917x xVar) {
            super(xVar.mo3946b());
            C41536l.m120489i(xVar, "binding");
            this.f65829e = aVar;
            this.f65828d = xVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m81262j(C25848a aVar, View view) {
            C41536l.m120489i(aVar, "this$0");
            aVar.f65816f.mo56237Ri();
        }

        /* renamed from: i */
        public final void mo64641i() {
            Button button = this.f65828d.f64074e;
            C25848a aVar = this.f65829e;
            button.setButtonText(C32343x.m95388F("CLA.result.activate.button", new Object[0]));
            button.setOnClickListener(new C25857b(aVar));
        }
    }

    /* renamed from: l90.a$f */
    public final class C25855f extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C24918y f65830d;

        /* renamed from: e */
        private final C25863g f65831e = new C25863g();

        /* renamed from: f */
        final /* synthetic */ C25848a f65832f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25855f(C25848a aVar, C24918y yVar) {
            super(yVar.mo3946b());
            C41536l.m120489i(yVar, "binding");
            this.f65832f = aVar;
            this.f65830d = yVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m81265j(C25848a aVar, View view) {
            C41536l.m120489i(aVar, "this$0");
            aVar.f65816f.mo56233Hp();
        }

        /* renamed from: i */
        public final void mo64642i(C26381a.C26387f fVar) {
            C41536l.m120489i(fVar, "data");
            C24918y yVar = this.f65830d;
            C25848a aVar = this.f65832f;
            if (fVar.mo65621e()) {
                yVar.f64077f.setLayerStyle(C28609e.f72618d);
            }
            yVar.f64079h.setText(fVar.mo65619c());
            Button button = yVar.f64076e;
            button.setButtonText(fVar.mo65618b());
            button.setOnClickListener(new C25858c(aVar));
            yVar.f64078g.setAdapter(this.f65831e);
            this.f65831e.mo6029i(fVar.mo65620d());
        }
    }

    /* renamed from: l90.a$g */
    public final class C25856g extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C24919z f65833d;

        /* renamed from: e */
        final /* synthetic */ C25848a f65834e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25856g(C25848a aVar, C24919z zVar) {
            super(zVar.mo3946b());
            C41536l.m120489i(zVar, "binding");
            this.f65834e = aVar;
            this.f65833d = zVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m81268j(C25848a aVar, C26381a.C26388g gVar, View view) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(gVar, "$data");
            aVar.f65816f.mo56236R9(gVar.mo65622b());
        }

        /* renamed from: i */
        public final Button mo64643i(C26381a.C26388g gVar) {
            C41536l.m120489i(gVar, "data");
            C24919z zVar = this.f65833d;
            C25848a aVar = this.f65834e;
            Button button = zVar.f64081e;
            button.setButtonText(gVar.mo65623c());
            if (gVar.mo65622b() == C26390b.RETURN_HOME) {
                button.setButtonIcon(C0767a.m2895e(this.itemView.getContext(), C28605a.f72563l));
            }
            button.setOnClickListener(new C25859d(aVar, gVar));
            C41536l.m120488h(button, "with(binding) {\n        …}\n            }\n        }");
            return button;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25848a(C25688c cVar) {
        super(C17963d.f51158a.mo45633d());
        C41536l.m120489i(cVar, "input");
        this.f65816f = cVar;
    }

    public int getItemViewType(int i) {
        return ((C26381a) mo6027g(i)).mo65605a();
    }

    /* renamed from: l */
    public final void mo64635l(C41224m mVar) {
        C41536l.m120489i(mVar, "pair");
        this.f65817g = (C24846c) mVar.mo95678e();
        mo6029i((List) mVar.mo95680f());
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        C41536l.m120489i(f0Var, "holder");
        C26381a aVar = (C26381a) mo6026f().get(i);
        if (f0Var instanceof C25849a) {
            C41536l.m120487g(aVar, "null cannot be cast to non-null type ge.bog.mobilebank.consumerloanapplication.presentation.result.model.ResultViewType.Header");
            ((C25849a) f0Var).mo64636h((C26381a.C26382a) aVar);
        } else if (f0Var instanceof C25856g) {
            C41536l.m120487g(aVar, "null cannot be cast to non-null type ge.bog.mobilebank.consumerloanapplication.presentation.result.model.ResultViewType.SecondaryButton");
            ((C25856g) f0Var).mo64643i((C26381a.C26388g) aVar);
        } else if (f0Var instanceof C25850b) {
            C41536l.m120487g(aVar, "null cannot be cast to non-null type ge.bog.mobilebank.consumerloanapplication.presentation.result.model.ResultViewType.LoanAmountInfo");
            ((C25850b) f0Var).mo64637h((C26381a.C26383b) aVar);
        } else if (f0Var instanceof C25855f) {
            C41536l.m120487g(aVar, "null cannot be cast to non-null type ge.bog.mobilebank.consumerloanapplication.presentation.result.model.ResultViewType.Salary");
            ((C25855f) f0Var).mo64642i((C26381a.C26387f) aVar);
        } else if (f0Var instanceof C25851c) {
            C41536l.m120487g(aVar, "null cannot be cast to non-null type ge.bog.mobilebank.consumerloanapplication.presentation.result.model.ResultViewType.LoanDetails");
            ((C25851c) f0Var).mo64638h((C26381a.C26384c) aVar);
        } else if (f0Var instanceof C25854e) {
            ((C25854e) f0Var).mo64641i();
        } else if (f0Var instanceof C25852d) {
            C41536l.m120487g(aVar, "null cannot be cast to non-null type ge.bog.mobilebank.consumerloanapplication.presentation.result.model.ResultViewType.Offers");
            ((C25852d) f0Var).mo64639h((C26381a.C26385d) aVar);
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == C26381a.C26389h.HEADER.ordinal()) {
            C24912s d = C24912s.m79634d(from, viewGroup, false);
            C41536l.m120488h(d, "inflate(inflater, parent, false)");
            return new C25849a(this, d);
        } else if (i == C26381a.C26389h.SECONDARY_BUTTON.ordinal()) {
            C24919z d2 = C24919z.m79662d(from, viewGroup, false);
            C41536l.m120488h(d2, "inflate(inflater, parent, false)");
            return new C25856g(this, d2);
        } else if (i == C26381a.C26389h.LOAN_AMOUNT_INFO.ordinal()) {
            C24913t d3 = C24913t.m79638d(from, viewGroup, false);
            C41536l.m120488h(d3, "inflate(inflater, parent, false)");
            return new C25850b(this, d3);
        } else if (i == C26381a.C26389h.LOAN_DETAILS.ordinal()) {
            C24914u d4 = C24914u.m79642d(from, viewGroup, false);
            C41536l.m120488h(d4, "inflate(inflater, parent, false)");
            return new C25851c(this, d4);
        } else if (i == C26381a.C26389h.SALARY.ordinal()) {
            C24918y d5 = C24918y.m79658d(from, viewGroup, false);
            C41536l.m120488h(d5, "inflate(inflater, parent, false)");
            return new C25855f(this, d5);
        } else if (i == C26381a.C26389h.PRIMARY_BUTTON.ordinal()) {
            C24917x d6 = C24917x.m79654d(from, viewGroup, false);
            C41536l.m120488h(d6, "inflate(inflater, parent, false)");
            return new C25854e(this, d6);
        } else if (i == C26381a.C26389h.OFFERS.ordinal()) {
            C24916w d7 = C24916w.m79650d(from, viewGroup, false);
            C41536l.m120488h(d7, "inflate(inflater, parent, false)");
            return new C25852d(this, d7);
        } else {
            throw new IllegalStateException("Unknown view type");
        }
    }
}
