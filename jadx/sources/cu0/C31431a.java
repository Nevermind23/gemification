package cu0;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.C0767a;
import bu0.C31196j;
import fu0.C32012b;
import g91.C32343x;
import he1.C41217g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.mobilebank.loyaltyprogress.presentation.model.statusbenefits.StatusBenefitsUiModel;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import ue1.C43064a;
import vt0.C39467d;

/* renamed from: cu0.a */
public final class C31431a extends C35651n1 {

    /* renamed from: f */
    public static final C31432a f77979f = new C31432a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C41217g f77980d = C41219i.m119470b(new C31433b(this));

    /* renamed from: e */
    private C39467d f77981e;

    /* renamed from: cu0.a$a */
    public static final class C31432a {
        private C31432a() {
        }

        public /* synthetic */ C31432a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C31431a mo71786a(StatusBenefitsUiModel statusBenefitsUiModel) {
            C41536l.m120489i(statusBenefitsUiModel, "statusBenefitsUiModel");
            C31431a aVar = new C31431a();
            Bundle bundle = new Bundle();
            bundle.putParcelable("BENEFITS", statusBenefitsUiModel);
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    /* renamed from: cu0.a$b */
    static final class C31433b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C31431a f77982d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31433b(C31431a aVar) {
            super(0);
            this.f77982d = aVar;
        }

        /* renamed from: b */
        public final StatusBenefitsUiModel invoke() {
            Bundle arguments = this.f77982d.getArguments();
            StatusBenefitsUiModel statusBenefitsUiModel = arguments != null ? (StatusBenefitsUiModel) arguments.getParcelable("BENEFITS") : null;
            C41536l.m120486f(statusBenefitsUiModel);
            return statusBenefitsUiModel;
        }
    }

    /* renamed from: i1 */
    private final C39467d m93367i1() {
        C39467d dVar = this.f77981e;
        C41536l.m120486f(dVar);
        return dVar;
    }

    /* renamed from: j1 */
    private final StatusBenefitsUiModel m93368j1() {
        return (StatusBenefitsUiModel) this.f77980d.getValue();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f77981e = C39467d.m114725d(layoutInflater, viewGroup, false);
        LinearLayout c = m93367i1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onResume() {
        super.onResume();
        m93367i1().mo3946b().requestLayout();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m93367i1().f93891f.setTitle(C32343x.m95388F("text.pluspage.benefits.title", new Object[0]));
        C32012b a = m93368j1().mo75442a();
        if (a != null) {
            m93367i1().f93892g.setImageResource(a.mo72509c());
            m93367i1().f93893h.setBackground(new ColorDrawable(C0767a.m2893c(requireContext(), a.mo72508b())));
        }
        TwoLineTextItem twoLineTextItem = m93367i1().f93894i;
        String b = m93368j1().mo75443b();
        String F = C32343x.m95388F("text.pluspage.benefits.status.starts", new Object[0]);
        twoLineTextItem.setTitle(b + " " + F + ":");
        TwoLineTextItem twoLineTextItem2 = m93367i1().f93894i;
        int d = m93368j1().mo75444d();
        String F2 = C32343x.m95388F("text.pluspage.benefits.status.stars", new Object[0]);
        twoLineTextItem2.setText(d + " " + F2);
        C31196j jVar = new C31196j();
        m93367i1().f93890e.setAdapter(jVar);
        jVar.mo6029i(m93368j1().mo75446e());
    }
}
