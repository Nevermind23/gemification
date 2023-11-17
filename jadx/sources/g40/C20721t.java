package g40;

import g40.C20708o;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.model.AddBudgetModel;
import p341ge.bog.mobilebank.p975ui.views.widgets.FlipImageViewContainer;

/* renamed from: g40.t */
public final /* synthetic */ class C20721t implements FlipImageViewContainer.FlipListener {

    /* renamed from: a */
    public final /* synthetic */ C20708o f55892a;

    /* renamed from: b */
    public final /* synthetic */ AddBudgetModel f55893b;

    public /* synthetic */ C20721t(C20708o oVar, AddBudgetModel addBudgetModel) {
        this.f55892a = oVar;
        this.f55893b = addBudgetModel;
    }

    public final void onFlip(boolean z) {
        C20708o.C20710b.m67085F(this.f55892a, this.f55893b, z);
    }
}
