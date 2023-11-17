package p341ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetail;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import g91.C32289b0;
import g91.C32303f;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import iu0.C36546y;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.mobilebank.autoliabilityinsurance.domain.model.PolicyDetailsModel;
import p341ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetail.C13657a;
import p341ge.bog.mobilebank.p975ui.activities.DDSTOListActivity;
import p341ge.bog.mobilebank.rest.model.RetrofitClient;
import p341ge.bog.mobilebank.shared2.environment.TargetEnvironment;
import p380ck.C10463g;
import p451hk.C15525c;
import p451hk.C15529g;
import p493kk.C16458l;
import p645vk.C18402c;
import p645vk.C18403d;
import p645vk.C18404e;
import p759fv.C20559a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetail.PolicyDetailFragment */
public final class PolicyDetailFragment extends C13662b {

    /* renamed from: k */
    public static final C13647a f40784k = new C13647a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private final C41217g f40785g;

    /* renamed from: h */
    private C16458l f40786h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public PolicyDetailsModel f40787i;

    /* renamed from: j */
    public TargetEnvironment f40788j;

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetail.PolicyDetailFragment$a */
    public static final class C13647a {
        private C13647a() {
        }

        public /* synthetic */ C13647a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetail.PolicyDetailFragment$b */
    static final class C13648b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PolicyDetailFragment f40789d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13648b(PolicyDetailFragment policyDetailFragment) {
            super(1);
            this.f40789d = policyDetailFragment;
        }

        /* renamed from: a */
        public final void mo37541a(PolicyDetailsModel policyDetailsModel) {
            PolicyDetailFragment policyDetailFragment = this.f40789d;
            C41536l.m120488h(policyDetailsModel, "result");
            policyDetailFragment.f40787i = policyDetailsModel;
            this.f40789d.m51122y1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo37541a((PolicyDetailsModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetail.PolicyDetailFragment$c */
    static final class C13649c implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f40790a;

        C13649c(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f40790a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f40790a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f40790a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetail.PolicyDetailFragment$d */
    public static final class C13650d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f40791d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13650d(Fragment fragment) {
            super(0);
            this.f40791d = fragment;
        }

        public final Fragment invoke() {
            return this.f40791d;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetail.PolicyDetailFragment$e */
    public static final class C13651e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f40792d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13651e(C43064a aVar) {
            super(0);
            this.f40792d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f40792d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetail.PolicyDetailFragment$f */
    public static final class C13652f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f40793d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13652f(C41217g gVar) {
            super(0);
            this.f40793d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f40793d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetail.PolicyDetailFragment$g */
    public static final class C13653g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f40794d;

        /* renamed from: e */
        final /* synthetic */ C41217g f40795e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13653g(C43064a aVar, C41217g gVar) {
            super(0);
            this.f40794d = aVar;
            this.f40795e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f40794d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f40795e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetail.PolicyDetailFragment$h */
    public static final class C13654h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f40796d;

        /* renamed from: e */
        final /* synthetic */ C41217g f40797e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13654h(Fragment fragment, C41217g gVar) {
            super(0);
            this.f40796d = fragment;
            this.f40797e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f40797e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f40796d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public PolicyDetailFragment() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C13651e(new C13650d(this)));
        this.f40785g = C1514j0.m5374c(this, C41520a0.m120436b(PolicyDetailViewModel$ViewModel.class), new C13652f(a), new C13653g((C43064a) null, a), new C13654h(this, a));
    }

    /* renamed from: n1 */
    private final C16458l m51113n1() {
        C16458l lVar = this.f40786h;
        C41536l.m120486f(lVar);
        return lVar;
    }

    private final void observeData() {
        m51114p1().mo37544hw().mo4819k(getViewLifecycleOwner(), new C13649c(new C13648b(this)));
    }

    /* renamed from: p1 */
    private final PolicyDetailViewModel$ViewModel m51114p1() {
        return (PolicyDetailViewModel$ViewModel) this.f40785g.getValue();
    }

    /* renamed from: q1 */
    private final void m51115q1() {
        m51113n1().f46532e.setInfoText(C32343x.m95388F("rbc.ins.policy.details.accident.info", new Object[0]));
        m51113n1().f46532e.setShowMoreText(getString(C15529g.policy_detail_banner_more_text));
        m51113n1().f46532e.setButtonVisible(true);
        m51113n1().f46532e.setBannerImage(new Image.Resource(C15525c.mtpl_information, (Boolean) null, 2, (DefaultConstructorMarker) null));
        m51113n1().f46532e.setOnClickListener(new C18403d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public static final void m51116r1(PolicyDetailFragment policyDetailFragment, View view) {
        C41536l.m120489i(policyDetailFragment, "this$0");
        C13657a.C13658a aVar = C13657a.f40802L;
        PolicyDetailsModel policyDetailsModel = policyDetailFragment.f40787i;
        if (policyDetailsModel == null) {
            C41536l.m120506z("policy");
            policyDetailsModel = null;
        }
        String u = policyDetailsModel.mo37388u();
        PolicyDetailsModel policyDetailsModel2 = policyDetailFragment.f40787i;
        if (policyDetailsModel2 == null) {
            C41536l.m120506z("policy");
            policyDetailsModel2 = null;
        }
        String v = policyDetailsModel2.mo37389v();
        PolicyDetailsModel policyDetailsModel3 = policyDetailFragment.f40787i;
        if (policyDetailsModel3 == null) {
            C41536l.m120506z("policy");
            policyDetailsModel3 = null;
        }
        aVar.mo37547a(u, v, policyDetailsModel3.mo37386t()).mo4576A1(policyDetailFragment.getChildFragmentManager(), (String) null);
    }

    /* renamed from: s1 */
    private final void m51117s1() {
        ImageView imageView = m51113n1().f46550w;
        PolicyDetailsModel policyDetailsModel = this.f40787i;
        PolicyDetailsModel policyDetailsModel2 = null;
        if (policyDetailsModel == null) {
            C41536l.m120506z("policy");
            policyDetailsModel = null;
        }
        C32289b0.m95107s(imageView, C32289b0.m95091c(policyDetailsModel.mo37386t()), Integer.valueOf(C15525c.f44046h), (Integer) null, false, false);
        TextView textView = m51113n1().f46553z;
        PolicyDetailsModel policyDetailsModel3 = this.f40787i;
        if (policyDetailsModel3 == null) {
            C41536l.m120506z("policy");
            policyDetailsModel3 = null;
        }
        textView.setText(C32343x.m95388F(policyDetailsModel3.mo37388u(), new Object[0]));
        TextView textView2 = m51113n1().f46537j;
        PolicyDetailsModel policyDetailsModel4 = this.f40787i;
        if (policyDetailsModel4 == null) {
            C41536l.m120506z("policy");
            policyDetailsModel4 = null;
        }
        textView2.setText(policyDetailsModel4.mo37367a());
        TwoLineTextItem twoLineTextItem = m51113n1().f46548u;
        PolicyDetailsModel policyDetailsModel5 = this.f40787i;
        if (policyDetailsModel5 == null) {
            C41536l.m120506z("policy");
        } else {
            policyDetailsModel2 = policyDetailsModel5;
        }
        twoLineTextItem.setText(policyDetailsModel2.mo37383q());
        m51113n1().f46538k.setOnClickListener(new C18404e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public static final void m51118t1(PolicyDetailFragment policyDetailFragment, View view) {
        C41536l.m120489i(policyDetailFragment, "this$0");
        C20559a.C20569j jVar = C20559a.C20569j.f55605f;
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        jVar.mo49091a(F);
        String rbMiddleware = policyDetailFragment.mo37540o1().getRbMiddleware();
        PolicyDetailsModel policyDetailsModel = policyDetailFragment.f40787i;
        PolicyDetailsModel policyDetailsModel2 = null;
        if (policyDetailsModel == null) {
            C41536l.m120506z("policy");
            policyDetailsModel = null;
        }
        String populateUrlWithExtraData = RetrofitClient.populateUrlWithExtraData(rbMiddleware + "?" + policyDetailsModel.mo37384r());
        C1505h requireActivity = policyDetailFragment.requireActivity();
        PolicyDetailsModel policyDetailsModel3 = policyDetailFragment.f40787i;
        if (policyDetailsModel3 == null) {
            C41536l.m120506z("policy");
        } else {
            policyDetailsModel2 = policyDetailsModel3;
        }
        C32303f.m95195f(populateUrlWithExtraData, requireActivity, policyDetailsModel2.mo37383q() + ".pdf", "application/pdf");
    }

    /* renamed from: u1 */
    private final void m51119u1() {
        PolicyDetailsModel policyDetailsModel = this.f40787i;
        PolicyDetailsModel policyDetailsModel2 = null;
        if (policyDetailsModel == null) {
            C41536l.m120506z("policy");
            policyDetailsModel = null;
        }
        if (policyDetailsModel.mo37390w()) {
            LayerView layerView = m51113n1().f46545r;
            C41536l.m120488h(layerView, "binding.ownerInfoLayer");
            C32343x.m95483r1(layerView, false, false, 2, (Object) null);
            return;
        }
        TwoLineTextItem twoLineTextItem = m51113n1().f46543p;
        PolicyDetailsModel policyDetailsModel3 = this.f40787i;
        if (policyDetailsModel3 == null) {
            C41536l.m120506z("policy");
            policyDetailsModel3 = null;
        }
        String d = policyDetailsModel3.mo37369d();
        PolicyDetailsModel policyDetailsModel4 = this.f40787i;
        if (policyDetailsModel4 == null) {
            C41536l.m120506z("policy");
            policyDetailsModel4 = null;
        }
        twoLineTextItem.setText(d + " " + policyDetailsModel4.mo37371e());
        TwoLineTextItem twoLineTextItem2 = m51113n1().f46544q;
        PolicyDetailsModel policyDetailsModel5 = this.f40787i;
        if (policyDetailsModel5 == null) {
            C41536l.m120506z("policy");
            policyDetailsModel5 = null;
        }
        twoLineTextItem2.setText(policyDetailsModel5.mo37373f());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
        TwoLineTextItem twoLineTextItem3 = m51113n1().f46542o;
        PolicyDetailsModel policyDetailsModel6 = this.f40787i;
        if (policyDetailsModel6 == null) {
            C41536l.m120506z("policy");
        } else {
            policyDetailsModel2 = policyDetailsModel6;
        }
        twoLineTextItem3.setText(simpleDateFormat.format(policyDetailsModel2.mo37368b()));
    }

    /* renamed from: v1 */
    private final void m51120v1() {
        TextView textView = m51113n1().f46541n;
        PolicyDetailsModel policyDetailsModel = this.f40787i;
        if (policyDetailsModel == null) {
            C41536l.m120506z("policy");
            policyDetailsModel = null;
        }
        BigDecimal i = policyDetailsModel.mo37377i();
        PolicyDetailsModel policyDetailsModel2 = this.f40787i;
        if (policyDetailsModel2 == null) {
            C41536l.m120506z("policy");
            policyDetailsModel2 = null;
        }
        textView.setText(C32303f.m95203n(i, policyDetailsModel2.mo37378j()));
        TextView textView2 = m51113n1().f46549v;
        PolicyDetailsModel policyDetailsModel3 = this.f40787i;
        if (policyDetailsModel3 == null) {
            C41536l.m120506z("policy");
            policyDetailsModel3 = null;
        }
        BigDecimal k = policyDetailsModel3.mo37379k();
        PolicyDetailsModel policyDetailsModel4 = this.f40787i;
        if (policyDetailsModel4 == null) {
            C41536l.m120506z("policy");
            policyDetailsModel4 = null;
        }
        textView2.setText(C32303f.m95203n(k, policyDetailsModel4.mo37380l()));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
        TextView textView3 = m51113n1().f46546s;
        PolicyDetailsModel policyDetailsModel5 = this.f40787i;
        if (policyDetailsModel5 == null) {
            C41536l.m120506z("policy");
            policyDetailsModel5 = null;
        }
        textView3.setText(C32343x.m95388F(policyDetailsModel5.mo37381m(), new Object[0]));
        TextView textView4 = m51113n1().f46530C;
        PolicyDetailsModel policyDetailsModel6 = this.f40787i;
        if (policyDetailsModel6 == null) {
            C41536l.m120506z("policy");
            policyDetailsModel6 = null;
        }
        textView4.setText(simpleDateFormat.format(policyDetailsModel6.mo37385s()));
        TextView textView5 = m51113n1().f46539l;
        PolicyDetailsModel policyDetailsModel7 = this.f40787i;
        if (policyDetailsModel7 == null) {
            C41536l.m120506z("policy");
            policyDetailsModel7 = null;
        }
        textView5.setText(simpleDateFormat.format(policyDetailsModel7.mo37382p()));
        ListItem listItem = m51113n1().f46535h;
        C41536l.m120488h(listItem, "binding.automaticPaymentLayer");
        PolicyDetailsModel policyDetailsModel8 = this.f40787i;
        if (policyDetailsModel8 == null) {
            C41536l.m120506z("policy");
            policyDetailsModel8 = null;
        }
        C32343x.m95483r1(listItem, policyDetailsModel8.mo37374g(), false, 2, (Object) null);
        View view = m51113n1().f46529B;
        C41536l.m120488h(view, "binding.separatorOverDd");
        PolicyDetailsModel policyDetailsModel9 = this.f40787i;
        if (policyDetailsModel9 == null) {
            C41536l.m120506z("policy");
            policyDetailsModel9 = null;
        }
        C32343x.m95483r1(view, policyDetailsModel9.mo37374g(), false, 2, (Object) null);
        m51113n1().f46535h.setOnClickListener(new C18402c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public static final void m51121x1(PolicyDetailFragment policyDetailFragment, View view) {
        C41536l.m120489i(policyDetailFragment, "this$0");
        policyDetailFragment.startActivity(new Intent(policyDetailFragment.requireContext(), DDSTOListActivity.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public final void m51122y1() {
        m51117s1();
        m51115q1();
        m51120v1();
        m51119u1();
    }

    /* renamed from: o1 */
    public final TargetEnvironment mo37540o1() {
        TargetEnvironment targetEnvironment = this.f40788j;
        if (targetEnvironment != null) {
            return targetEnvironment;
        }
        C41536l.m120506z("environment");
        return null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f40786h = C16458l.m58637d(getLayoutInflater());
        ConstraintLayout c = m51113n1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f40786h = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        observeData();
    }
}
