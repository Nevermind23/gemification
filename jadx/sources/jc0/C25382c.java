package jc0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import p341ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.depositperiod.C23250a;
import p341ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.depositperiod.DepositPeriodModel;
import ue1.C43075l;
import xb0.C29736x;

/* renamed from: jc0.c */
public final class C25382c extends C1819o {

    /* renamed from: f */
    private final C43075l f65029f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25382c(C43075l lVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(lVar, "onItemClicked");
        this.f65029f = lVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m80564m(C25382c cVar, DepositPeriodModel depositPeriodModel, View view) {
        C41536l.m120489i(cVar, "this$0");
        C43075l lVar = cVar.f65029f;
        C41536l.m120488h(depositPeriodModel, "item");
        lVar.invoke(depositPeriodModel);
    }

    /* renamed from: l */
    public void onBindViewHolder(C23250a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        DepositPeriodModel depositPeriodModel = (DepositPeriodModel) mo6027g(i);
        C41536l.m120488h(depositPeriodModel, "item");
        aVar.mo58168h(depositPeriodModel);
        aVar.itemView.setOnClickListener(new C25381b(this, depositPeriodModel));
    }

    /* renamed from: n */
    public C23250a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C29736x d = C29736x.m90310d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n            Lay…          false\n        )");
        return new C23250a(d);
    }
}
