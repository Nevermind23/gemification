package bq0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import np0.C37437c;
import nq0.C37445b;
import o31.C37599g;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import sp0.C38481a0;
import sp0.C38496o;
import sp0.C38497p;
import sp0.C38498q;
import sp0.C38500s;

/* renamed from: bq0.a */
public final class C31169a extends C1819o {

    /* renamed from: bq0.a$a */
    public static final class C31170a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C38496o f77434d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31170a(C38496o oVar) {
            super(oVar.mo3946b());
            C41536l.m120489i(oVar, "binding");
            this.f77434d = oVar;
        }
    }

    /* renamed from: bq0.a$b */
    public static final class C31171b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C38500s f77435d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31171b(C38500s sVar) {
            super(sVar.mo3946b());
            C41536l.m120489i(sVar, "binding");
            this.f77435d = sVar;
        }

        /* renamed from: h */
        public final void mo71377h(C37445b.C37447b bVar) {
            C41536l.m120489i(bVar, "item");
            C38500s sVar = this.f77435d;
            LinearLayout linearLayout = sVar.f92276i;
            C41536l.m120488h(linearLayout, "reverseTextGroup");
            C32343x.m95483r1(linearLayout, bVar.mo90562e(), false, 2, (Object) null);
            LinearLayout linearLayout2 = sVar.f92277j;
            C41536l.m120488h(linearLayout2, "textGroup");
            boolean z = true;
            C32343x.m95483r1(linearLayout2, !bVar.mo90562e(), false, 2, (Object) null);
            TextView textView = sVar.f92280m;
            C41536l.m120488h(textView, "valueTv");
            C32343x.m95483r1(textView, bVar.mo90562e(), false, 2, (Object) null);
            LinearLayout linearLayout3 = sVar.f92276i;
            C41536l.m120488h(linearLayout3, "reverseTextGroup");
            C32343x.m95483r1(linearLayout3, bVar.mo90562e(), false, 2, (Object) null);
            View view = sVar.f92274g;
            C41536l.m120488h(view, "divider");
            if (bVar.mo90566h() && !bVar.mo90560c()) {
                z = false;
            }
            C32343x.m95483r1(view, z, false, 2, (Object) null);
            if (bVar.mo90562e()) {
                sVar.f92279l.setText(bVar.mo90564f());
                sVar.f92273f.setText(bVar.mo90559b());
                sVar.f92280m.setText(bVar.mo90565g());
            } else {
                sVar.f92272e.setText(bVar.mo90564f());
                sVar.f92278k.setText(bVar.mo90565g());
            }
            sVar.f92275h.setImageDrawable(C32343x.m95424X(bVar.mo90561d(), this.itemView.getContext()));
        }
    }

    /* renamed from: bq0.a$c */
    public static final class C31172c extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C38481a0 f77436d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31172c(C38481a0 a0Var) {
            super(a0Var.mo3946b());
            C41536l.m120489i(a0Var, "binding");
            this.f77436d = a0Var;
        }

        /* renamed from: h */
        public final void mo71378h(C37445b.C37448c cVar) {
            C41536l.m120489i(cVar, "item");
            this.f77436d.f92167e.setTitleText(cVar.mo90569b());
        }
    }

    /* renamed from: bq0.a$d */
    public static final class C31173d extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C38497p f77437d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31173d(C38497p pVar) {
            super(pVar.mo3946b());
            C41536l.m120489i(pVar, "binding");
            this.f77437d = pVar;
        }

        /* renamed from: h */
        public final void mo71379h(C37445b.C37449d dVar) {
            boolean z;
            int i;
            C41536l.m120489i(dVar, "item");
            EmptyWidget emptyWidget = this.f77437d.f92262e;
            emptyWidget.setTitle(C32343x.m95388F(dVar.mo90575d(), new Object[0]));
            if (dVar.mo90573b() != null) {
                z = true;
            } else {
                z = false;
            }
            emptyWidget.setEnableTwoLineText(z);
            emptyWidget.setEnableMultiLineSubtitle(true);
            emptyWidget.setText(dVar.mo90573b());
            View view = this.itemView;
            C41536l.m120488h(view, "itemView");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (dVar.mo90574c()) {
                    i = this.itemView.getResources().getDimensionPixelOffset(C37437c.f89970a);
                } else {
                    i = 0;
                }
                marginLayoutParams.setMargins(0, i, 0, 0);
                view.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: bq0.a$e */
    public static final class C31174e extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C38498q f77438d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31174e(C38498q qVar) {
            super(qVar.mo3946b());
            C41536l.m120489i(qVar, "binding");
            this.f77438d = qVar;
        }

        /* renamed from: h */
        public final void mo71380h(C37445b.C37450e eVar) {
            C41536l.m120489i(eVar, "item");
            this.f77438d.f92265f.setText(C32343x.m95388F(eVar.mo90579b(), new Object[0]));
            this.f77438d.f92266g.setText(eVar.mo90580c());
        }
    }

    public C31169a() {
        super(C37599g.f90345a.mo90787d());
    }

    public int getItemViewType(int i) {
        return ((C37445b) mo6026f().get(i)).mo90558a();
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        C41536l.m120489i(f0Var, "holder");
        C37445b bVar = (C37445b) mo6026f().get(i);
        if (f0Var instanceof C31173d) {
            C41536l.m120487g(bVar, "null cannot be cast to non-null type ge.bog.mobilebank.loanactivation.presentation.activation.model.details.ActivationDetailsViewType.Header");
            ((C31173d) f0Var).mo71379h((C37445b.C37449d) bVar);
        } else if (f0Var instanceof C31171b) {
            C41536l.m120487g(bVar, "null cannot be cast to non-null type ge.bog.mobilebank.loanactivation.presentation.activation.model.details.ActivationDetailsViewType.DetailsItem");
            ((C31171b) f0Var).mo71377h((C37445b.C37447b) bVar);
        } else if (f0Var instanceof C31174e) {
            C41536l.m120487g(bVar, "null cannot be cast to non-null type ge.bog.mobilebank.loanactivation.presentation.activation.model.details.ActivationDetailsViewType.Summary");
            ((C31174e) f0Var).mo71380h((C37445b.C37450e) bVar);
        } else if (f0Var instanceof C31172c) {
            C41536l.m120487g(bVar, "null cannot be cast to non-null type ge.bog.mobilebank.loanactivation.presentation.activation.model.details.ActivationDetailsViewType.Feedback");
            ((C31172c) f0Var).mo71378h((C37445b.C37448c) bVar);
        } else {
            boolean z = f0Var instanceof C31170a;
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == C37445b.C37451f.HEADER.ordinal()) {
            C38497p d = C38497p.m113003d(from, viewGroup, false);
            C41536l.m120488h(d, "inflate(\n               …lse\n                    )");
            return new C31173d(d);
        } else if (i == C37445b.C37451f.DETAILS_ITEM.ordinal()) {
            C38500s d2 = C38500s.m113015d(from, viewGroup, false);
            C41536l.m120488h(d2, "inflate(\n               …lse\n                    )");
            return new C31171b(d2);
        } else if (i == C37445b.C37451f.SUMMARY.ordinal()) {
            C38498q d3 = C38498q.m113007d(from, viewGroup, false);
            C41536l.m120488h(d3, "inflate(\n               …lse\n                    )");
            return new C31174e(d3);
        } else if (i == C37445b.C37451f.FEEDBACK.ordinal()) {
            C38481a0 d4 = C38481a0.m112937d(from, viewGroup, false);
            C41536l.m120488h(d4, "inflate(\n               …, false\n                )");
            return new C31172c(d4);
        } else if (i == C37445b.C37451f.BOTTOM_BORDER.ordinal()) {
            C38496o d5 = C38496o.m112999d(from, viewGroup, false);
            C41536l.m120488h(d5, "inflate(\n               …, false\n                )");
            return new C31170a(d5);
        } else {
            throw new UnsupportedOperationException("Unknown View Type");
        }
    }
}
