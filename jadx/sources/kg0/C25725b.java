package kg0;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ie0.C25190j;
import if0.C25192a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import p341ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities.GTMoneyExchangeActivity;
import ue0.C28724f;

/* renamed from: kg0.b */
public final class C25725b extends C25736l {

    /* renamed from: H */
    public static final C25726a f65487H = new C25726a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private C28724f f65488G;

    /* renamed from: kg0.b$a */
    public static final class C25726a {
        private C25726a() {
        }

        public /* synthetic */ C25726a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C25725b mo64306a() {
            return new C25725b();
        }
    }

    /* renamed from: e2 */
    private final C28724f m80965e2() {
        C28724f fVar = this.f65488G;
        C41536l.m120486f(fVar);
        return fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public static final void m80966f2(C25725b bVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        GTMoneyExchangeActivity.C23418a aVar = GTMoneyExchangeActivity.f61255L;
        C25192a aVar2 = C25192a.DEPOSIT_MONEY;
        Context requireContext = bVar.requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        aVar.mo60240a(aVar2, requireContext);
        bVar.mo4577k1();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f65488G = C28724f.m88016d(getLayoutInflater(), viewGroup, true);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26372b2(ActionSheetTitle.C13155a.BASIC);
        mo26370a2(getString(C25190j.gt_title_add_money));
        m80965e2().f73222e.setOnClickListener(new C25724a(this));
    }
}
