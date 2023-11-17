package p341ge.bog.mobilebank.insurance.travelinsurance.presentation.details;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.RecyclerView;
import cf1.C40419j;
import g91.C32303f;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import iu0.C36546y;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o31.C37588a0;
import p163m0.C7047a;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.details.C24525c;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.details.C24529d;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.details.model.PolicyDetailsUiModel;
import p341ge.bog.mobilebank.rest.model.RetrofitClient;
import p341ge.bog.mobilebank.shared2.environment.TargetEnvironment;
import p380ck.C10463g;
import p420fh.C12902d;
import p420fh.C12910e;
import p759fv.C20559a;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43081r;
import wl0.C29456a;
import y71.C40034h;
import z71.C40181h;

/* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.details.TravelInsuranceDetailsFragment */
public final class TravelInsuranceDetailsFragment extends C24523a {

    /* renamed from: l */
    public static final C24511a f63221l = new C24511a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C40181h f63222g;

    /* renamed from: h */
    public C24529d.C24530a f63223h;

    /* renamed from: i */
    public TargetEnvironment f63224i;

    /* renamed from: j */
    private final C41217g f63225j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C29456a f63226k = new C29456a(new C24512b(this), new C24513c(this));

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.details.TravelInsuranceDetailsFragment$a */
    public static final class C24511a {
        private C24511a() {
        }

        public /* synthetic */ C24511a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.details.TravelInsuranceDetailsFragment$b */
    /* synthetic */ class C24512b extends C41535k implements C43081r {
        C24512b(Object obj) {
            super(4, obj, TravelInsuranceDetailsFragment.class, "downloadPolicy", "downloadPolicy(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;)V", 0);
        }

        /* renamed from: b */
        public final void mo62645b(String str, String str2, long j, Long l) {
            C41536l.m120489i(str, "p0");
            C41536l.m120489i(str2, "p1");
            ((TravelInsuranceDetailsFragment) this.receiver).m78781n1(str, str2, j, l);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            mo62645b((String) obj, (String) obj2, ((Number) obj3).longValue(), (Long) obj4);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.details.TravelInsuranceDetailsFragment$c */
    /* synthetic */ class C24513c extends C41535k implements C43075l {
        C24513c(Object obj) {
            super(1, obj, TravelInsuranceDetailsFragment.class, "startDialAction", "startDialAction(Ljava/lang/String;)V", 0);
        }

        /* renamed from: b */
        public final void mo62646b(String str) {
            C41536l.m120489i(str, "p0");
            ((TravelInsuranceDetailsFragment) this.receiver).m78785t1(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62646b((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.details.TravelInsuranceDetailsFragment$d */
    static final class C24514d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TravelInsuranceDetailsFragment f63227d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24514d(TravelInsuranceDetailsFragment travelInsuranceDetailsFragment) {
            super(1);
            this.f63227d = travelInsuranceDetailsFragment;
        }

        /* renamed from: a */
        public final void mo62647a(List list) {
            this.f63227d.f63226k.mo6029i(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62647a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.details.TravelInsuranceDetailsFragment$e */
    static final class C24515e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TravelInsuranceDetailsFragment f63228d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24515e(TravelInsuranceDetailsFragment travelInsuranceDetailsFragment) {
            super(1);
            this.f63228d = travelInsuranceDetailsFragment;
        }

        /* renamed from: a */
        public final void mo62648a(C24525c cVar) {
            C41536l.m120489i(cVar, "it");
            this.f63228d.m78784s1(cVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62648a((C24525c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.details.TravelInsuranceDetailsFragment$f */
    static final class C24516f implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f63229a;

        C24516f(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f63229a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f63229a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f63229a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.details.TravelInsuranceDetailsFragment$g */
    public static final class C24517g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f63230d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24517g(Fragment fragment) {
            super(0);
            this.f63230d = fragment;
        }

        public final Fragment invoke() {
            return this.f63230d;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.details.TravelInsuranceDetailsFragment$h */
    public static final class C24518h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f63231d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24518h(C43064a aVar) {
            super(0);
            this.f63231d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f63231d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.details.TravelInsuranceDetailsFragment$i */
    public static final class C24519i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f63232d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24519i(C41217g gVar) {
            super(0);
            this.f63232d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f63232d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.details.TravelInsuranceDetailsFragment$j */
    public static final class C24520j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f63233d;

        /* renamed from: e */
        final /* synthetic */ C41217g f63234e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24520j(C43064a aVar, C41217g gVar) {
            super(0);
            this.f63233d = aVar;
            this.f63234e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f63233d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f63234e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.details.TravelInsuranceDetailsFragment$k */
    static final class C24521k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ TravelInsuranceDetailsFragment f63235d;

        /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.details.TravelInsuranceDetailsFragment$k$a */
        static final class C24522a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ TravelInsuranceDetailsFragment f63236d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24522a(TravelInsuranceDetailsFragment travelInsuranceDetailsFragment) {
                super(0);
                this.f63236d = travelInsuranceDetailsFragment;
            }

            /* renamed from: b */
            public final C24529d invoke() {
                PolicyDetailsUiModel policyDetailsUiModel;
                C24529d.C24530a q1 = this.f63236d.mo62644q1();
                Bundle arguments = this.f63236d.getArguments();
                if (arguments != null) {
                    policyDetailsUiModel = (PolicyDetailsUiModel) arguments.getParcelable(this.f63236d.getString(C40034h.arg_policy_details));
                } else {
                    policyDetailsUiModel = null;
                }
                C41536l.m120486f(policyDetailsUiModel);
                return q1.mo32843a(policyDetailsUiModel);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24521k(TravelInsuranceDetailsFragment travelInsuranceDetailsFragment) {
            super(0);
            this.f63235d = travelInsuranceDetailsFragment;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C24522a(this.f63235d));
        }
    }

    public TravelInsuranceDetailsFragment() {
        C24521k kVar = new C24521k(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C24518h(new C24517g(this)));
        this.f63225j = C1514j0.m5374c(this, C41520a0.m120436b(C24529d.class), new C24519i(a), new C24520j((C43064a) null, a), kVar);
    }

    /* renamed from: m1 */
    private final void m78780m1(String str, String str2) {
        String rbMiddleware = mo62643p1().getRbMiddleware();
        String populateUrlWithExtraData = RetrofitClient.populateUrlWithExtraData(rbMiddleware + "?" + str);
        C1505h requireActivity = requireActivity();
        C32303f.m95195f(populateUrlWithExtraData, requireActivity, str2 + ".pdf", "application/pdf");
    }

    /* access modifiers changed from: private */
    /* renamed from: n1 */
    public final void m78781n1(String str, String str2, long j, Long l) {
        C20559a.C20573n nVar = C20559a.C20573n.f55609f;
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        nVar.mo49091a(F);
        m78783r1().mo62656gw(str, str2, j, l);
    }

    /* renamed from: o1 */
    private final C40181h m78782o1() {
        C40181h hVar = this.f63222g;
        C41536l.m120486f(hVar);
        return hVar;
    }

    private final void observeData() {
        m78783r1().mo62657hw().mo4819k(getViewLifecycleOwner(), new C24516f(new C24514d(this)));
        C1644x iw = m78783r1().mo62658iw();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(iw, viewLifecycleOwner, new C24515e(this));
    }

    /* renamed from: r1 */
    private final C24529d m78783r1() {
        return (C24529d) this.f63225j.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public final void m78784s1(C24525c cVar) {
        if (cVar instanceof C24525c.C24526a) {
            C1505h activity = getActivity();
            if (activity != null) {
                String string = getString(C40034h.f95125d);
                C41536l.m120488h(string, "getString(R.string.common_text_operation_error)");
                C12910e.m48790h(activity, string, (C12902d.C12905b) null, false, 6, (Object) null);
            }
        } else if (cVar instanceof C24525c.C24528c) {
            C24525c.C24528c cVar2 = (C24525c.C24528c) cVar;
            m78780m1(cVar2.mo62655b(), cVar2.mo62654a());
        } else if (cVar instanceof C24525c.C24527b) {
            C24525c.C24527b bVar = (C24525c.C24527b) cVar;
            m78780m1(bVar.mo62653b(), bVar.mo62652a());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public final void m78785t1(String str) {
        try {
            String g = new C40419j("\\s").mo94490g(str, "");
            Intent intent = new Intent("android.intent.action.DIAL");
            intent.setData(Uri.parse("tel:" + g));
            startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f63222g = C40181h.m116432d(layoutInflater, viewGroup, false);
        RecyclerView c = m78782o1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        m78782o1().f95521e.setAdapter((RecyclerView.C1736h) null);
        this.f63222g = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        refreshHeaderText(C32343x.m95388F("text.insurance.product.type.TRI", new Object[0]));
        m78782o1().f95521e.setAdapter(this.f63226k);
        observeData();
    }

    /* renamed from: p1 */
    public final TargetEnvironment mo62643p1() {
        TargetEnvironment targetEnvironment = this.f63224i;
        if (targetEnvironment != null) {
            return targetEnvironment;
        }
        C41536l.m120506z("environment");
        return null;
    }

    /* renamed from: q1 */
    public final C24529d.C24530a mo62644q1() {
        C24529d.C24530a aVar = this.f63223h;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("factory");
        return null;
    }
}
