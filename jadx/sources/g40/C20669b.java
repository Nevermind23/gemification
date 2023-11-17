package g40;

import android.widget.CompoundButton;
import g40.C20670c;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.budgeting.model.AddBudgetModel;

/* renamed from: g40.b */
public final /* synthetic */ class C20669b implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C20670c.C20671a f55771a;

    /* renamed from: b */
    public final /* synthetic */ AddBudgetModel f55772b;

    public /* synthetic */ C20669b(C20670c.C20671a aVar, AddBudgetModel addBudgetModel) {
        this.f55771a = aVar;
        this.f55772b = addBudgetModel;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C20670c.C20671a.m66979u(this.f55771a, this.f55772b, compoundButton, z);
    }
}
