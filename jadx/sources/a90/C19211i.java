package a90;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import h80.C24911r;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.IncomeType;
import p615tg.C17963d;
import u70.C28605a;
import ue1.C43075l;

/* renamed from: a90.i */
public final class C19211i extends C1819o {

    /* renamed from: f */
    private final C43075l f53422f;

    /* renamed from: a90.i$a */
    public final class C19212a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C24911r f53423d;

        /* renamed from: e */
        final /* synthetic */ C19211i f53424e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19212a(C19211i iVar, C24911r rVar) {
            super(rVar.mo3946b());
            C41536l.m120489i(rVar, "binding");
            this.f53424e = iVar;
            this.f53423d = rVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m64640j(C19211i iVar, LookupUiModel lookupUiModel, View view) {
            C41536l.m120489i(iVar, "this$0");
            C41536l.m120489i(lookupUiModel, "$incomeType");
            iVar.mo47437k().invoke(lookupUiModel);
        }

        /* renamed from: i */
        public final void mo47440i(LookupUiModel lookupUiModel) {
            int i;
            C41536l.m120489i(lookupUiModel, "incomeType");
            C24911r rVar = this.f53423d;
            C19211i iVar = this.f53424e;
            rVar.f64052f.setText(C32343x.m95388F(lookupUiModel.mo52391a(), new Object[0]));
            Context context = this.f53423d.mo3946b().getContext();
            IncomeType a = IncomeType.f59832d.mo56156a(lookupUiModel.mo52393d());
            if (C41536l.m120484d(a, IncomeType.Bonus.f59833e)) {
                i = C28605a.icons_16_deposit_call;
            } else if (C41536l.m120484d(a, IncomeType.Dividend.f59836e)) {
                i = C28605a.f72560i;
            } else if (C41536l.m120484d(a, IncomeType.MoneyTransfer.f59839e)) {
                i = C28605a.f72561j;
            } else if (C41536l.m120484d(a, IncomeType.Rent.f59845e)) {
                i = C28605a.f72558g;
            } else if (C41536l.m120484d(a, IncomeType.Salary.f59848e)) {
                i = C28605a.f72559h;
            } else {
                i = C28605a.f72562k;
            }
            this.f53423d.f64051e.setButtonIcon(C0767a.m2895e(context, i));
            rVar.mo3946b().setOnClickListener(new C19210h(iVar, lookupUiModel));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19211i(C43075l lVar) {
        super(C17963d.f51158a.mo45633d());
        C41536l.m120489i(lVar, "itemClicked");
        this.f53422f = lVar;
    }

    /* renamed from: k */
    public final C43075l mo47437k() {
        return this.f53422f;
    }

    /* renamed from: l */
    public void onBindViewHolder(C19212a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo47440i((LookupUiModel) g);
    }

    /* renamed from: m */
    public C19212a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C24911r d = C24911r.m79630d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …rent, false\n            )");
        return new C19212a(this, d);
    }
}
