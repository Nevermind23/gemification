package p662wo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import g91.C32343x;
import he1.C41233s;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.model.FinancialInfoLookupUiModel;
import p413eo.C12758n;
import p413eo.C12761o0;

/* renamed from: wo.c */
public final class C18648c extends C18646a {

    /* renamed from: j */
    public static final C18649a f52240j = new C18649a((DefaultConstructorMarker) null);

    /* renamed from: i */
    private C12758n f52241i;

    /* renamed from: wo.c$a */
    public static final class C18649a {
        private C18649a() {
        }

        public /* synthetic */ C18649a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C18648c mo46486a(List list) {
            C41536l.m120489i(list, "infoLookups");
            C18648c cVar = new C18648c();
            cVar.setArguments(C0908e.m3336b(C41233s.m119492a("EXTRA_FINANCIAL_INFO_LOOK_UPS", list)));
            return cVar;
        }
    }

    /* renamed from: i1 */
    private final C12758n m63207i1() {
        C12758n nVar = this.f52241i;
        C41536l.m120486f(nVar);
        return nVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: j1 */
    public static final void m63208j1(C18648c cVar, FinancialInfoLookupUiModel financialInfoLookupUiModel, View view) {
        C41536l.m120489i(cVar, "this$0");
        C1533o.m5445b(cVar, "REQUEST_KEY_INFO_TYPE_SELECTED", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_SELECTED_INFO_TYPE", financialInfoLookupUiModel)));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f52241i = C12758n.m48427d(layoutInflater, viewGroup, false);
        ConstraintLayout c = m63207i1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        this.f52241i = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        ArrayList<FinancialInfoLookupUiModel> parcelableArrayList = requireArguments().getParcelableArrayList("EXTRA_FINANCIAL_INFO_LOOK_UPS");
        C41536l.m120486f(parcelableArrayList);
        m63207i1().f37795e.removeAllViews();
        for (FinancialInfoLookupUiModel financialInfoLookupUiModel : parcelableArrayList) {
            C12761o0 d = C12761o0.m48440d(getLayoutInflater(), m63207i1().f37795e, true);
            d.f37815h.setText(C32343x.m95388F(financialInfoLookupUiModel.mo40836a(), new Object[0]));
            View view2 = d.f37812e;
            C41536l.m120488h(view2, "divider");
            C32343x.m95483r1(view2, true ^ C41536l.m120484d(C41358y.m120019i0(parcelableArrayList), financialInfoLookupUiModel), false, 2, (Object) null);
            d.mo3946b().setOnClickListener(new C18647b(this, financialInfoLookupUiModel));
        }
    }
}
