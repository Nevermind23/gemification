package p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.visa_concierge;

import a81.C30772sa;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1505h;
import g91.C32343x;
import he1.C41233s;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p413eo.C12770t;
import p484jp.C16309a;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.visa_concierge.SetConciergeResultFragment */
public final class SetConciergeResultFragment extends C14641a {

    /* renamed from: j */
    public static final C14637a f42566j = new C14637a((DefaultConstructorMarker) null);

    /* renamed from: i */
    private C12770t f42567i;

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.visa_concierge.SetConciergeResultFragment$a */
    public static final class C14637a {
        private C14637a() {
        }

        public /* synthetic */ C14637a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Bundle mo41016a(boolean z) {
            return C0908e.m3336b(C41233s.m119492a("EXTRA_IS_ACTIVATION_RESULT", Boolean.valueOf(z)));
        }
    }

    /* renamed from: i1 */
    private final C12770t m53937i1() {
        C12770t tVar = this.f42567i;
        C41536l.m120486f(tVar);
        return tVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: j1 */
    public static final void m53938j1(C30772sa saVar, View view) {
        if (saVar != null) {
            saVar.finish();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f42567i = C12770t.m48480d(layoutInflater, viewGroup, false);
        LinearLayout c = m53937i1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f42567i = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C30772sa saVar;
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        C1505h activity = getActivity();
        if (activity instanceof C30772sa) {
            saVar = (C30772sa) activity;
        } else {
            saVar = null;
        }
        if (requireArguments().getBoolean("EXTRA_IS_ACTIVATION_RESULT")) {
            if (saVar != null) {
                saVar.mo86429X1(C32343x.m95388F("my.package.page.VISA.consierge.activation.sucess.result.header", new Object[0]));
            }
            m53937i1().f37864f.setTitleText(C32343x.m95388F("my.package.page.VISA.consierge.activation.sucess.result.main.text", new Object[0]));
            m53937i1().f37863e.setButtonText(C32343x.m95388F("my.package.page.VISA.consierge.activation.sucess.result.button", new Object[0]));
        } else {
            if (saVar != null) {
                saVar.mo86429X1(C32343x.m95388F("my.package.page.VISA.consierge.deactivation.sucess.result.header", new Object[0]));
            }
            m53937i1().f37864f.setTitleText(C32343x.m95388F("my.package.page.VISA.deconsierge.activation.sucess.result.main.text", new Object[0]));
            m53937i1().f37863e.setButtonText(C32343x.m95388F("my.package.page.VISA.consierge.deactivation.sucess.result.button", new Object[0]));
        }
        m53937i1().f37863e.setOnClickListener(new C16309a(saVar));
    }
}
