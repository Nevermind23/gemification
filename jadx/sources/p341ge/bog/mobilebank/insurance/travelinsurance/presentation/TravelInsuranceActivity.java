package p341ge.bog.mobilebank.insurance.travelinsurance.presentation;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.C0173b;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import he1.C41233s;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ml0.C26254g;
import p202p0.C7556l;
import p202p0.C7589q;
import p202p0.C7594s;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import vl0.C29126a;
import xl0.C29817a;
import y71.C40030d;
import y71.C40032f;
import y71.C40034h;
import z71.C40176c;

/* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.TravelInsuranceActivity */
public final class TravelInsuranceActivity extends C30772sa {

    /* renamed from: G */
    public static final C24510a f63219G = new C24510a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private C40176c f63220F;

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.TravelInsuranceActivity$a */
    public static final class C24510a {
        private C24510a() {
        }

        public /* synthetic */ C24510a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo62642a(Context context, C26254g gVar, C0173b bVar) {
            C41238w wVar;
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, TravelInsuranceActivity.class);
            if (gVar != null) {
                intent.putExtra("EXTRA_OPEN_DETAILS", C29817a.m90578a(gVar));
            }
            if (bVar != null) {
                bVar.mo404a(intent);
                wVar = C41238w.f97225a;
            } else {
                wVar = null;
            }
            if (wVar == null) {
                context.startActivity(intent);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public static final void m78773F2(TravelInsuranceActivity travelInsuranceActivity, C7556l lVar, C7589q qVar, Bundle bundle) {
        boolean z;
        C41536l.m120489i(travelInsuranceActivity, "this$0");
        C41536l.m120489i(lVar, "<anonymous parameter 0>");
        C41536l.m120489i(qVar, "destination");
        C40176c cVar = travelInsuranceActivity.f63220F;
        if (cVar == null) {
            C41536l.m120506z("binding");
            cVar = null;
        }
        ToolbarView toolbarView = cVar.f95457f.f68494e;
        if (qVar.mo22214w() != C40030d.TravelInsuranceSuccessFragment) {
            z = true;
        } else {
            z = false;
        }
        toolbarView.setNavigationEnabled(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        int i;
        C40176c d = C40176c.m116411d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f63220F = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        Fragment j0 = getSupportFragmentManager().mo4415j0(C40030d.f95098Z);
        C41536l.m120487g(j0, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        C7556l k1 = ((NavHostFragment) j0).mo5009k1();
        C7594s b = k1.mo22114F().mo22243b(C40032f.travel_insurance_nav_graph);
        if (getIntent().hasExtra("EXTRA_OPEN_DETAILS")) {
            i = C40030d.travelInsuranceDetailsFragment;
        } else {
            i = C40030d.travelInsuranceInfoFragment;
        }
        b.mo22234T(i);
        String string = getString(C40034h.arg_policy_details);
        C41536l.m120488h(string, "getString(R.string.arg_policy_details)");
        k1.mo22133k0(b, C0908e.m3336b(C41233s.m119492a(string, getIntent().getParcelableExtra("EXTRA_OPEN_DETAILS"))));
        k1.mo22137p(new C29126a(this));
    }

    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
