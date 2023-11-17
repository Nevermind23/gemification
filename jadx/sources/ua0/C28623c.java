package ua0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import ha0.C24939p;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import p341ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.actionsheet.period.C22862a;
import p341ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.actionsheet.period.DepositPeriodModel;
import ue1.C43075l;

/* renamed from: ua0.c */
public final class C28623c extends C1819o {

    /* renamed from: f */
    private final C43075l f72640f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28623c(C43075l lVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(lVar, "onItemClicked");
        this.f72640f = lVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m87587m(C28623c cVar, DepositPeriodModel depositPeriodModel, View view) {
        C41536l.m120489i(cVar, "this$0");
        C43075l lVar = cVar.f72640f;
        C41536l.m120488h(depositPeriodModel, "item");
        lVar.invoke(depositPeriodModel);
    }

    /* renamed from: l */
    public void onBindViewHolder(C22862a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        DepositPeriodModel depositPeriodModel = (DepositPeriodModel) mo6027g(i);
        C41536l.m120488h(depositPeriodModel, "item");
        aVar.mo56989h(depositPeriodModel);
        aVar.itemView.setOnClickListener(new C28622b(this, depositPeriodModel));
    }

    /* renamed from: n */
    public C22862a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C24939p d = C24939p.m79741d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n            Lay…          false\n        )");
        return new C22862a(d);
    }
}
