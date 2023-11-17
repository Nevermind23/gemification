package p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.C14557h;
import p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.model.FinancialInfoUiModel;
import p413eo.C12730b0;
import p413eo.C12733c0;
import p413eo.C12736d0;
import p413eo.C12759n0;
import p623to.C18064g;
import p623to.C18065h;
import p623to.C18066i;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.c */
public final class C14538c extends C1819o {

    /* renamed from: f */
    private final C14540b f42380f;

    /* renamed from: g */
    private final C14541c f42381g;

    /* renamed from: h */
    private final C14542d f42382h;

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.c$a */
    public static final class C14539a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C12730b0 f42383d;

        /* renamed from: e */
        private final C14540b f42384e;

        /* renamed from: f */
        private final C14541c f42385f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14539a(C12730b0 b0Var, C14540b bVar, C14541c cVar) {
            super(b0Var.mo3946b());
            C41536l.m120489i(b0Var, "binding");
            C41536l.m120489i(bVar, "onAddInfoButtonClick");
            C41536l.m120489i(cVar, "onRemoveInfoButtonClick");
            this.f42383d = b0Var;
            this.f42384e = bVar;
            this.f42385f = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m53684k(C14539a aVar, View view) {
            C41536l.m120489i(aVar, "this$0");
            aVar.f42384e.invoke();
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public static final void m53685l(C14539a aVar, FinancialInfoUiModel financialInfoUiModel, View view) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(financialInfoUiModel, "$financialInfo");
            aVar.f42385f.mo40773a(financialInfoUiModel);
        }

        /* renamed from: j */
        public final LinearLayout mo40794j(C14557h.C14558a aVar) {
            boolean z;
            C41536l.m120489i(aVar, "data");
            C12730b0 b0Var = this.f42383d;
            TextView textView = b0Var.f37676f;
            C41536l.m120488h(textView, "descriptionText");
            C32343x.m95483r1(textView, aVar.mo40820d().isEmpty(), false, 2, (Object) null);
            b0Var.f37676f.setText(C32343x.m95388F("packages.application.II.financial.info.explanatory", new Object[0]));
            Button button = b0Var.f37675e;
            button.setButtonText(C32343x.m95388F("packages.application.II.financial.info.add.button.labe", new Object[0]));
            button.setOnClickListener(new C18064g(this));
            C41536l.m120488h(button, "bindData$lambda$7$lambda$1");
            C32343x.m95483r1(button, !aVar.mo40821e(), false, 2, (Object) null);
            LinearLayout linearLayout = b0Var.f37677g;
            C41536l.m120488h(linearLayout, "bindData$lambda$7$lambda$6");
            C32343x.m95483r1(linearLayout, !aVar.mo40820d().isEmpty(), false, 2, (Object) null);
            linearLayout.removeAllViews();
            for (FinancialInfoUiModel financialInfoUiModel : aVar.mo40820d()) {
                C12759n0 d = C12759n0.m48431d(LayoutInflater.from(this.itemView.getContext()), linearLayout, true);
                TwoLineTextItem twoLineTextItem = d.f37798f;
                twoLineTextItem.setTitle(financialInfoUiModel.mo40849d());
                twoLineTextItem.setText(C32343x.m95406O(financialInfoUiModel.mo40847a(), financialInfoUiModel.mo40848b()));
                twoLineTextItem.setMultilineText(true);
                d.f37799g.setOnClickListener(new C18065h(this, financialInfoUiModel));
                View view = d.f37797e;
                C41536l.m120488h(view, "divider");
                if (C41358y.m120019i0(aVar.mo40820d()) != financialInfoUiModel) {
                    z = true;
                } else {
                    z = false;
                }
                C32343x.m95483r1(view, z, false, 2, (Object) null);
            }
            C41536l.m120488h(linearLayout, "with(binding) {\n        …}\n            }\n        }");
            return linearLayout;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.c$b */
    public interface C14540b {
        void invoke();
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.c$c */
    public interface C14541c {
        /* renamed from: a */
        void mo40773a(FinancialInfoUiModel financialInfoUiModel);
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.c$d */
    public interface C14542d {
        void invoke();
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.c$e */
    public static final class C14543e extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C12736d0 f42386d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14543e(C12736d0 d0Var) {
            super(d0Var.mo3946b());
            C41536l.m120489i(d0Var, "binding");
            this.f42386d = d0Var;
        }

        /* renamed from: h */
        public final void mo40795h(C14557h.C14559b bVar) {
            C41536l.m120489i(bVar, "data");
            C12736d0 d0Var = this.f42386d;
            boolean z = false;
            d0Var.f37695e.setTitle(C32343x.m95388F(bVar.mo40826c(), new Object[0]));
            d0Var.f37695e.setText(C32343x.m95388F(bVar.mo40825b(), new Object[0]));
            EmptyWidget emptyWidget = d0Var.f37695e;
            if (bVar.mo40825b() != null) {
                z = true;
            }
            emptyWidget.setEnableTwoLineText(z);
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.c$f */
    public static final class C14544f extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C12733c0 f42387d;

        /* renamed from: e */
        private final C14542d f42388e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14544f(C12733c0 c0Var, C14542d dVar) {
            super(c0Var.mo3946b());
            C41536l.m120489i(c0Var, "binding");
            C41536l.m120489i(dVar, "onSoloLoungeInputClick");
            this.f42387d = c0Var;
            this.f42388e = dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m53690j(C14544f fVar, View view) {
            C41536l.m120489i(fVar, "this$0");
            fVar.f42388e.invoke();
        }

        /* renamed from: i */
        public final void mo40796i(C14557h.C14560c cVar) {
            C41536l.m120489i(cVar, "data");
            C12733c0 c0Var = this.f42387d;
            c0Var.f37688e.setHintText((CharSequence) C32343x.m95388F("packages.application.II.solo.lounge.input.text", new Object[0]));
            c0Var.f37688e.getTextInput().setText(cVar.mo40831d());
            c0Var.f37688e.setOnClickListener(new C18066i(this));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14538c(C14540b bVar, C14541c cVar, C14542d dVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(bVar, "onAddInfoButtonClick");
        C41536l.m120489i(cVar, "onRemoveInfoButtonClick");
        C41536l.m120489i(dVar, "onSoloLoungeInputClick");
        this.f42380f = bVar;
        this.f42381g = cVar;
        this.f42382h = dVar;
    }

    public int getItemViewType(int i) {
        return ((C14557h) mo6026f().get(i)).mo40818a();
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        C41536l.m120489i(f0Var, "holder");
        C14557h hVar = (C14557h) mo6026f().get(i);
        if (f0Var instanceof C14543e) {
            C41536l.m120487g(hVar, "null cannot be cast to non-null type ge.bog.mobilebank.categorypackages.presentation.application.secondstage.SecondStageViewType.SectionHeader");
            ((C14543e) f0Var).mo40795h((C14557h.C14559b) hVar);
        } else if (f0Var instanceof C14539a) {
            C41536l.m120487g(hVar, "null cannot be cast to non-null type ge.bog.mobilebank.categorypackages.presentation.application.secondstage.SecondStageViewType.FinancialInformation");
            ((C14539a) f0Var).mo40794j((C14557h.C14558a) hVar);
        } else if (f0Var instanceof C14544f) {
            C41536l.m120487g(hVar, "null cannot be cast to non-null type ge.bog.mobilebank.categorypackages.presentation.application.secondstage.SecondStageViewType.SoloLounge");
            ((C14544f) f0Var).mo40796i((C14557h.C14560c) hVar);
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == C14557h.C14561d.HEADER.ordinal()) {
            C12736d0 d = C12736d0.m48338d(from, viewGroup, false);
            C41536l.m120488h(d, "inflate(\n               …  false\n                )");
            return new C14543e(d);
        } else if (i == C14557h.C14561d.FINANCIAL_INFORMATION.ordinal()) {
            C12730b0 d2 = C12730b0.m48314d(from, viewGroup, false);
            C41536l.m120488h(d2, "inflate(\n               …  false\n                )");
            return new C14539a(d2, this.f42380f, this.f42381g);
        } else if (i == C14557h.C14561d.SOLO_LOUNGE.ordinal()) {
            C12733c0 d3 = C12733c0.m48326d(from, viewGroup, false);
            C41536l.m120488h(d3, "inflate(\n               …  false\n                )");
            return new C14544f(d3, this.f42382h);
        } else {
            throw new IllegalStateException("Unknown view type");
        }
    }
}
