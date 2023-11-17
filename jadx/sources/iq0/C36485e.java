package iq0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import np0.C37435a;
import o31.C37599g;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import sp0.C38481a0;
import sp0.C38506y;
import sp0.C38507z;
import sq0.C38508a;

/* renamed from: iq0.e */
public final class C36485e extends C1819o {

    /* renamed from: f */
    private final C36488c f87987f;

    /* renamed from: iq0.e$a */
    public static final class C36486a extends RecyclerView.C1734f0 {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36486a(C38481a0 a0Var) {
            super(a0Var.mo3946b());
            C41536l.m120489i(a0Var, "binding");
            a0Var.f92167e.setTitleText(C32343x.m95388F("loan.activation.details.page.refinance.block.other.banks.condition", new Object[0]));
        }
    }

    /* renamed from: iq0.e$b */
    public static final class C36487b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C38506y f87988d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36487b(C38506y yVar) {
            super(yVar.mo3946b());
            C41536l.m120489i(yVar, "binding");
            this.f87988d = yVar;
        }

        /* renamed from: h */
        public final void mo89285h(C38508a.C38510b bVar) {
            C41536l.m120489i(bVar, "data");
            EmptyWidget emptyWidget = this.f87988d.f92304e;
            emptyWidget.setEnableTwoLineText(true);
            emptyWidget.setEnableMultiLineSubtitle(true);
            emptyWidget.setTitle(bVar.mo92072b());
            emptyWidget.setText(bVar.mo92071a());
        }
    }

    /* renamed from: iq0.e$c */
    public interface C36488c {
        /* renamed from: a */
        void mo89286a(C38508a.C38511c cVar);
    }

    /* renamed from: iq0.e$d */
    public static final class C36489d extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C38507z f87989d;

        /* renamed from: e */
        private final C36488c f87990e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36489d(C38507z zVar, C36488c cVar) {
            super(zVar.mo3946b());
            C41536l.m120489i(zVar, "binding");
            C41536l.m120489i(cVar, "listener");
            this.f87989d = zVar;
            this.f87990e = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m108227j(C38508a.C38511c cVar, C36489d dVar, View view) {
            C41536l.m120489i(cVar, "$data");
            C41536l.m120489i(dVar, "this$0");
            if (cVar.mo92080f()) {
                dVar.f87990e.mo89286a(cVar);
            }
        }

        /* renamed from: i */
        public final void mo89287i(C38508a.C38511c cVar) {
            Color.Attribute attribute;
            boolean z;
            C41536l.m120489i(cVar, "data");
            C38507z zVar = this.f87989d;
            if (cVar.mo92080f()) {
                attribute = new Color.Attribute(C37435a.f89966c);
            } else {
                attribute = new Color.Attribute(C37435a.f89965b);
            }
            CheckboxView checkboxView = zVar.f92307f;
            checkboxView.setChecked(cVar.mo92078e());
            checkboxView.setEnabled(cVar.mo92080f());
            TextView textView = zVar.f92309h;
            Context context = textView.getContext();
            C41536l.m120488h(context, "context");
            textView.setTextColor(attribute.mo35260a(context));
            textView.setText(cVar.mo92077c().mo73515m());
            C41536l.m120488h(textView, "bindData$lambda$5$lambda$1");
            boolean z2 = true;
            if (cVar.mo92077c().mo73515m() != null) {
                z = true;
            } else {
                z = false;
            }
            C32343x.m95483r1(textView, z, false, 2, (Object) null);
            TextView textView2 = zVar.f92308g;
            Context context2 = textView2.getContext();
            C41536l.m120488h(context2, "context");
            textView2.setTextColor(attribute.mo35260a(context2));
            textView2.setText(cVar.mo92077c().mo73511i());
            C41536l.m120488h(textView2, "bindData$lambda$5$lambda$2");
            if (cVar.mo92077c().mo73515m() == null) {
                z2 = false;
            }
            C32343x.m95483r1(textView2, z2, false, 2, (Object) null);
            TextView textView3 = zVar.f92306e;
            Context context3 = textView3.getContext();
            C41536l.m120488h(context3, "context");
            textView3.setTextColor(attribute.mo35260a(context3));
            textView3.setText(C32343x.m95410Q(cVar.mo92077c().mo73503d(), cVar.mo92077c().mo73505e(), false, 2, (Object) null));
            this.itemView.setOnClickListener(new C36490f(cVar, this));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36485e(C36488c cVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(cVar, "listener");
        this.f87987f = cVar;
    }

    public int getItemViewType(int i) {
        return ((C38508a) mo6026f().get(i)).mo92070d();
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        C41536l.m120489i(f0Var, "holder");
        if (f0Var instanceof C36487b) {
            Object obj = mo6026f().get(i);
            C41536l.m120487g(obj, "null cannot be cast to non-null type ge.bog.mobilebank.loanactivation.presentation.activation.model.form.refinanceinfo.RefinanceInfoListItem.Header");
            ((C36487b) f0Var).mo89285h((C38508a.C38510b) obj);
        } else if (f0Var instanceof C36489d) {
            Object obj2 = mo6026f().get(i);
            C41536l.m120487g(obj2, "null cannot be cast to non-null type ge.bog.mobilebank.loanactivation.presentation.activation.model.form.refinanceinfo.RefinanceInfoListItem.RefinanceItem");
            ((C36489d) f0Var).mo89287i((C38508a.C38511c) obj2);
        } else {
            boolean z = f0Var instanceof C36486a;
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == C38508a.C38512d.HEADER.ordinal()) {
            C38506y d = C38506y.m113039d(from, viewGroup, false);
            C41536l.m120488h(d, "inflate(\n               …, false\n                )");
            return new C36487b(d);
        } else if (i == C38508a.C38512d.REFINANCE_ITEM.ordinal()) {
            C38507z d2 = C38507z.m113043d(from, viewGroup, false);
            C41536l.m120488h(d2, "inflate(\n               …, false\n                )");
            return new C36489d(d2, this.f87987f);
        } else if (i == C38508a.C38512d.FEEDBACK.ordinal()) {
            C38481a0 d3 = C38481a0.m112937d(from, viewGroup, false);
            C41536l.m120488h(d3, "inflate(\n               …, false\n                )");
            return new C36486a(d3);
        } else {
            throw new IllegalStateException("Unknown view type");
        }
    }
}
