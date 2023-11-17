package p341ge.bog.mobilebank.insurance.travelinsurance.presentation.info;

import am0.C19263a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import bm0.C19396a;
import bm0.C19398b;
import g91.C32343x;
import iu0.C36546y;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p228r0.C8034d;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p380ck.C10463g;
import p759fv.C20559a;
import y71.C40030d;
import y71.C40033g;
import z71.C40182i;

/* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.info.TravelInsuranceInfoFragment */
public final class TravelInsuranceInfoFragment extends C35651n1 {

    /* renamed from: d */
    private C40182i f63342d;

    /* renamed from: e */
    private final C19396a f63343e = new C19396a();

    /* renamed from: f */
    private final List f63344f = C41341q.m119910m(new C19398b(C32343x.m95388F("rbc.travel.insurance.info.title1", new Object[0])), new C19398b(C32343x.m95388F("rbc.travel.insurance.info.title2", new Object[0])));

    /* renamed from: j1 */
    private final C40182i m78926j1() {
        C40182i iVar = this.f63342d;
        C41536l.m120486f(iVar);
        return iVar;
    }

    /* renamed from: k1 */
    private final void m78927k1() {
        m78926j1().f95523e.setOnClickListener(new C19263a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: l1 */
    public static final void m78928l1(TravelInsuranceInfoFragment travelInsuranceInfoFragment, View view) {
        C41536l.m120489i(travelInsuranceInfoFragment, "this$0");
        C8034d.m30522a(travelInsuranceInfoFragment).mo22117L(C40030d.action_travelInsuranceInfoFragment_to_fillInsuranceInfoFragment);
        C20559a.C20574o oVar = C20559a.C20574o.f55610f;
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        oVar.mo49091a(F);
    }

    /* renamed from: m1 */
    private final void m78929m1() {
        m78926j1().f95524f.setAdapter(this.f63343e);
        m78926j1().f95524f.setNestedScrollingEnabled(false);
        this.f63343e.mo6029i(this.f63344f);
    }

    /* renamed from: n1 */
    private final void m78930n1() {
        C40182i j1 = m78926j1();
        j1.f95523e.setButtonText(C32343x.m95388F("rbc.travel.insurance.info.button.choose.policy", new Object[0]));
        j1.f95525g.setTitle(C32343x.m95388F("rbc.travel.insurance.info.title", new Object[0]));
        j1.f95525g.setImage(new Image.Animation.Raw(C40033g.f95124a, (Image.Animation.AnimationConfig) null, 2, (DefaultConstructorMarker) null));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f63342d = C40182i.m116436d(layoutInflater, viewGroup, false);
        NestedScrollView c = m78926j1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f63342d = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        refreshHeaderText(C32343x.m95388F("text.insurance.product.type.TRI", new Object[0]));
        m78930n1();
        m78929m1();
        m78927k1();
    }
}
