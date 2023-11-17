package p341ge.bog.mobilebank.galtandtaggart.presentation.landing;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import g31.C32054a;
import g41.C32081a;
import g91.C32343x;
import ie0.C25190j;
import iu0.C36546y;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of0.C26955d0;
import of0.C26957e0;
import of0.C26963h0;
import p341ge.bog.mobilebank.galtandtaggart.presentation.parameters.GTParametersInvestmentAccountActivity;
import p380ck.C10463g;
import ue0.C28732j;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.d */
public final class C23494d extends C26963h0 {

    /* renamed from: H */
    public static final C23495a f61382H = new C23495a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private C28732j f61383G;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.d$a */
    public static final class C23495a {
        private C23495a() {
        }

        public /* synthetic */ C23495a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C23494d mo60341a(String str) {
            C23494d dVar = new C23494d();
            Bundle bundle = new Bundle();
            bundle.putString("KEY_FAQ_LINK", str);
            dVar.setArguments(bundle);
            return dVar;
        }
    }

    /* renamed from: f2 */
    private final C28732j m76023f2() {
        C28732j jVar = this.f61383G;
        C41536l.m120486f(jVar);
        return jVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public static final void m76024g2(C23494d dVar, View view) {
        String str;
        String string;
        C41536l.m120489i(dVar, "this$0");
        Bundle arguments = dVar.getArguments();
        boolean z = false;
        if (arguments == null || (string = arguments.getString("KEY_FAQ_LINK")) == null) {
            str = null;
        } else {
            str = C32343x.m95388F(string, new Object[0]);
        }
        if (str == null || str.length() == 0) {
            z = true;
        }
        if (!z) {
            dVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            dVar.mo4577k1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public static final void m76025h2(C23494d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        C32054a.C32060f fVar = C32054a.C32060f.f78902f;
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        C32081a.m94499a(fVar, F, " ", " ");
        GTParametersInvestmentAccountActivity.C23648a aVar = GTParametersInvestmentAccountActivity.f61668H;
        Context requireContext = dVar.requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        aVar.mo60526a(requireContext);
        dVar.mo4577k1();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f61383G = C28732j.m88052d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f61383G = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26370a2(getString(C25190j.gt_title_additional_functions));
        m76023f2().f73309i.setOnClickListener(new C26955d0(this));
        m76023f2().f73306f.setOnClickListener(new C26957e0(this));
    }
}
