package g20;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import iu0.C36546y;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.C21770a;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.activity.BudgetActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.compoundview.RoundProgressView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;

/* renamed from: g20.e */
public final class C20601e extends RecyclerView.C1734f0 {

    /* renamed from: d */
    private final Context f55654d;

    /* renamed from: e */
    private final RoundProgressView f55655e;

    /* renamed from: f */
    private final BogTextView f55656f;

    /* renamed from: g */
    private final BogTextView f55657g;

    /* renamed from: h */
    private final ConstraintLayout f55658h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20601e(View view, Context context) {
        super(view);
        C41536l.m120489i(view, "itemView");
        C41536l.m120489i(context, "context");
        this.f55654d = context;
        View findViewById = view.findViewById(C10322k.budget_progress_bar);
        C41536l.m120488h(findViewById, "itemView.findViewById(R.id.budget_progress_bar)");
        this.f55655e = (RoundProgressView) findViewById;
        View findViewById2 = view.findViewById(C10322k.current_budget_TV);
        C41536l.m120488h(findViewById2, "itemView.findViewById(R.id.current_budget_TV)");
        this.f55656f = (BogTextView) findViewById2;
        View findViewById3 = view.findViewById(C10322k.budget_subtext_TV);
        C41536l.m120488h(findViewById3, "itemView.findViewById(R.id.budget_subtext_TV)");
        this.f55657g = (BogTextView) findViewById3;
        View findViewById4 = view.findViewById(C10322k.budget_constraint);
        C41536l.m120488h(findViewById4, "itemView.findViewById(R.id.budget_constraint)");
        this.f55658h = (ConstraintLayout) findViewById4;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m66859j(C20601e eVar, View view) {
        C41536l.m120489i(eVar, "this$0");
        BudgetActivity.f58716F.mo54847a(eVar.f55654d);
        C36546y.m108282F().mo27152s("budgeting", "from_home", "open_budgeting_module");
    }

    /* renamed from: i */
    public final void mo49145i(C21770a.C21772b bVar) {
        C41536l.m120489i(bVar, "budget");
        this.f55657g.setText(bVar.mo54303a());
        this.f55656f.setText(bVar.mo54304b());
        this.f55655e.setProgress(bVar.mo54305c());
        this.f55658h.setOnClickListener(new C20599d(this));
    }
}
