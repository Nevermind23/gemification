package p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.C0173b;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import b41.C31128a;
import b41.C31132b;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import iu0.C36546y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o31.C37588a0;
import org.parceler.C42035e;
import p163m0.C7047a;
import p228r0.C8034d;
import p341ge.bog.mobilebank.categorypackages.presentation.application.navigator.ApplicationNavigatorFragment;
import p341ge.bog.mobilebank.categorypackages.presentation.application.shared.model.SoloApplicationFormData;
import p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.C14716h;
import p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.visa_concierge.C14643c;
import p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.model.StatisticsData;
import p341ge.bog.mobilebank.cleanarch.moremenu.presentation.PackageType;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity;
import p341ge.bog.mobilebank.cleanarch.settings.presentation.EditProfileActivity2;
import p341ge.bog.mobilebank.model.KeyValue;
import p341ge.bog.mobilebank.shared.products.presentation.LinearLayoutManagerAccurateOffset;
import p356ao.C10114f;
import p413eo.C12766r;
import p414ep.C12817j;
import p442gp.C15418d;
import p526mp.C16886c;
import p526mp.C16888e;
import p610sp.C17913e;
import q31.C38122f;
import q31.C38125h;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.PackageDetailsFragment */
public final class PackageDetailsFragment extends C14620a {

    /* renamed from: k */
    public static final C14594a f42513k = new C14594a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C12766r f42514g;

    /* renamed from: h */
    public C14716h.C14718b f42515h;

    /* renamed from: i */
    private final C41217g f42516i;

    /* renamed from: j */
    private final C41217g f42517j = C41219i.m119470b(new C14595b(this));

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.PackageDetailsFragment$a */
    public static final class C14594a {
        private C14594a() {
        }

        public /* synthetic */ C14594a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.PackageDetailsFragment$b */
    static final class C14595b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PackageDetailsFragment f42518d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14595b(PackageDetailsFragment packageDetailsFragment) {
            super(0);
            this.f42518d = packageDetailsFragment;
        }

        /* renamed from: b */
        public final C14659b invoke() {
            return new C14659b(this.f42518d.m53890t1());
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.PackageDetailsFragment$c */
    /* synthetic */ class C14596c extends C41535k implements C43075l {
        C14596c(Object obj) {
            super(1, obj, PackageDetailsFragment.class, "openPackageList", "openPackageList(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo40979b(boolean z) {
            ((PackageDetailsFragment) this.receiver).m53875A1(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40979b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.PackageDetailsFragment$d */
    /* synthetic */ class C14597d extends C41535k implements C43075l {
        C14597d(Object obj) {
            super(1, obj, PackageDetailsFragment.class, "onBenefitsUpdate", "onBenefitsUpdate(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo40980b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((PackageDetailsFragment) this.receiver).m53893y1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40980b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.PackageDetailsFragment$e */
    static final class C14598e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PackageDetailsFragment f42519d;

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.PackageDetailsFragment$e$a */
        /* synthetic */ class C14599a extends C41535k implements C43075l {
            C14599a(Object obj) {
                super(1, obj, PackageDetailsFragment.class, "startSoloApplication", "startSoloApplication(Lge/bog/mobilebank/categorypackages/presentation/application/shared/model/SoloApplicationFormData;)V", 0);
            }

            /* renamed from: b */
            public final void mo40982b(SoloApplicationFormData soloApplicationFormData) {
                C41536l.m120489i(soloApplicationFormData, "p0");
                ((PackageDetailsFragment) this.receiver).m53878D1(soloApplicationFormData);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo40982b((SoloApplicationFormData) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14598e(PackageDetailsFragment packageDetailsFragment) {
            super(1);
            this.f42519d = packageDetailsFragment;
        }

        /* renamed from: a */
        public final void mo40981a(SoloApplicationFormData soloApplicationFormData) {
            C41536l.m120489i(soloApplicationFormData, "it");
            C17913e.m61723e(soloApplicationFormData, this.f42519d.m53890t1().mo41126Qw().mo41109vv(), new C14599a(this.f42519d), this.f42519d);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40981a((SoloApplicationFormData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.PackageDetailsFragment$f */
    /* synthetic */ class C14600f extends C41535k implements C43075l {
        C14600f(Object obj) {
            super(1, obj, PackageDetailsFragment.class, "openFeesLink", "openFeesLink(Ljava/lang/String;)V", 0);
        }

        /* renamed from: b */
        public final void mo40983b(String str) {
            C41536l.m120489i(str, "p0");
            ((PackageDetailsFragment) this.receiver).m53894z1(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40983b((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.PackageDetailsFragment$g */
    static final class C14601g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PackageDetailsFragment f42520d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14601g(PackageDetailsFragment packageDetailsFragment) {
            super(1);
            this.f42520d = packageDetailsFragment;
        }

        /* renamed from: a */
        public final void mo40984a(C31128a aVar) {
            if (aVar instanceof C31128a.C31131c) {
                this.f42520d.m53888r1().f37839g.mo53595c();
            } else if (aVar instanceof C31128a.C31130b) {
                this.f42520d.m53888r1().f37839g.mo53597e();
            } else if (aVar instanceof C31128a.C31129a) {
                this.f42520d.m53888r1().f37839g.mo53595c();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40984a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.PackageDetailsFragment$h */
    static final class C14602h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PackageDetailsFragment f42521d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14602h(PackageDetailsFragment packageDetailsFragment) {
            super(1);
            this.f42521d = packageDetailsFragment;
        }

        /* renamed from: a */
        public final void mo40985a(List list) {
            this.f42521d.m53889s1().mo6029i(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40985a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.PackageDetailsFragment$i */
    static final class C14603i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PackageDetailsFragment f42522d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14603i(PackageDetailsFragment packageDetailsFragment) {
            super(1);
            this.f42522d = packageDetailsFragment;
        }

        /* renamed from: a */
        public final void mo40986a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C36546y.m108282F().mo27152s("more", "user_profile", "open_module");
            Context context = this.f42522d.getContext();
            if (context != null) {
                EditProfileActivity2.f59595H.mo55694a(context);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40986a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.PackageDetailsFragment$j */
    static final class C14604j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PackageDetailsFragment f42523d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14604j(PackageDetailsFragment packageDetailsFragment) {
            super(1);
            this.f42523d = packageDetailsFragment;
        }

        /* renamed from: a */
        public final void mo40987a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C8034d.m30522a(this.f42523d).mo22121Q(C14693c.f42665a.mo41088a());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40987a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.PackageDetailsFragment$k */
    static final class C14605k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PackageDetailsFragment f42524d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14605k(PackageDetailsFragment packageDetailsFragment) {
            super(1);
            this.f42524d = packageDetailsFragment;
        }

        /* renamed from: a */
        public final void mo40988a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C8034d.m30522a(this.f42524d).mo22117L(C10114f.action_packageDetailsFragment_to_solo_application_graph);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40988a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.PackageDetailsFragment$l */
    static final class C14606l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PackageDetailsFragment f42525d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14606l(PackageDetailsFragment packageDetailsFragment) {
            super(1);
            this.f42525d = packageDetailsFragment;
        }

        /* renamed from: a */
        public final void mo40989a(String str) {
            C41536l.m120489i(str, "subProductCode");
            Context requireContext = this.f42525d.requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            C38122f c = C38125h.m112238c(requireContext);
            Context requireContext2 = this.f42525d.requireContext();
            C41536l.m120488h(requireContext2, "requireContext()");
            c.mo91571Q0(requireContext2, (C0173b) null, str, this.f42525d.m53890t1().mo41125Nw());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40989a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.PackageDetailsFragment$m */
    static final class C14607m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PackageDetailsFragment f42526d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14607m(PackageDetailsFragment packageDetailsFragment) {
            super(1);
            this.f42526d = packageDetailsFragment;
        }

        /* renamed from: a */
        public final void mo40990a(StatisticsData statisticsData) {
            C41536l.m120489i(statisticsData, "statistics");
            C15418d.f43820Q.mo42512a(statisticsData).mo4576A1(this.f42526d.getChildFragmentManager(), (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40990a((StatisticsData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.PackageDetailsFragment$n */
    /* synthetic */ class C14608n extends C41535k implements C43075l {
        C14608n(Object obj) {
            super(1, obj, PackageDetailsFragment.class, "handleBenefitClick", "handleBenefitClick(Lge/bog/mobilebank/categorypackages/presentation/mypackagedetails/model/PackageBenefitUiModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo40991b(C16886c cVar) {
            C41536l.m120489i(cVar, "p0");
            ((PackageDetailsFragment) this.receiver).m53891v1(cVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40991b((C16886c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.PackageDetailsFragment$o */
    /* synthetic */ class C14609o extends C41535k implements C43075l {
        C14609o(Object obj) {
            super(1, obj, PackageDetailsFragment.class, "startPackageBenefitsPage", "startPackageBenefitsPage(Lge/bog/mobilebank/categorypackages/presentation/mypackagedetails/model/RecommendedPackageDetails;)V", 0);
        }

        /* renamed from: b */
        public final void mo40992b(C16888e eVar) {
            C41536l.m120489i(eVar, "p0");
            ((PackageDetailsFragment) this.receiver).m53877C1(eVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40992b((C16888e) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.PackageDetailsFragment$p */
    static final class C14610p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PackageDetailsFragment f42527d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14610p(PackageDetailsFragment packageDetailsFragment) {
            super(1);
            this.f42527d = packageDetailsFragment;
        }

        /* renamed from: a */
        public final void mo40993a(Object obj) {
            C41536l.m120489i(obj, "it");
            this.f42527d.m53888r1().f37839g.mo53595c();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40993a(obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.PackageDetailsFragment$q */
    static final class C14611q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PackageDetailsFragment f42528d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14611q(PackageDetailsFragment packageDetailsFragment) {
            super(1);
            this.f42528d = packageDetailsFragment;
        }

        /* renamed from: a */
        public final void mo40994a(Object obj) {
            this.f42528d.m53888r1().f37839g.mo53597e();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40994a(obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.PackageDetailsFragment$r */
    static final class C14612r extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ PackageDetailsFragment f42529d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14612r(PackageDetailsFragment packageDetailsFragment) {
            super(2);
            this.f42529d = packageDetailsFragment;
        }

        /* renamed from: a */
        public final void mo40995a(Throwable th, Object obj) {
            C41536l.m120489i(th, "<anonymous parameter 0>");
            this.f42529d.m53888r1().f37839g.mo53595c();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo40995a((Throwable) obj, obj2);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.PackageDetailsFragment$s */
    static final class C14613s implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f42530a;

        C14613s(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f42530a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f42530a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f42530a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.PackageDetailsFragment$t */
    public static final class C14614t extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f42531d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14614t(Fragment fragment) {
            super(0);
            this.f42531d = fragment;
        }

        public final Fragment invoke() {
            return this.f42531d;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.PackageDetailsFragment$u */
    public static final class C14615u extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f42532d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14615u(C43064a aVar) {
            super(0);
            this.f42532d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f42532d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.PackageDetailsFragment$v */
    public static final class C14616v extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f42533d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14616v(C41217g gVar) {
            super(0);
            this.f42533d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f42533d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.PackageDetailsFragment$w */
    public static final class C14617w extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f42534d;

        /* renamed from: e */
        final /* synthetic */ C41217g f42535e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14617w(C43064a aVar, C41217g gVar) {
            super(0);
            this.f42534d = aVar;
            this.f42535e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f42534d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f42535e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.PackageDetailsFragment$x */
    static final class C14618x extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PackageDetailsFragment f42536d;

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.PackageDetailsFragment$x$a */
        static final class C14619a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ PackageDetailsFragment f42537d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14619a(PackageDetailsFragment packageDetailsFragment) {
                super(0);
                this.f42537d = packageDetailsFragment;
            }

            /* renamed from: b */
            public final C14716h invoke() {
                C14716h.C14718b u1 = this.f42537d.mo40977u1();
                Object obj = this.f42537d.requireArguments().get("package_type");
                C41536l.m120487g(obj, "null cannot be cast to non-null type ge.bog.mobilebank.cleanarch.moremenu.presentation.PackageType");
                return u1.mo32775a((PackageType) obj);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14618x(PackageDetailsFragment packageDetailsFragment) {
            super(0);
            this.f42536d = packageDetailsFragment;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C14619a(this.f42536d));
        }
    }

    public PackageDetailsFragment() {
        C14618x xVar = new C14618x(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C14615u(new C14614t(this)));
        this.f42516i = C1514j0.m5374c(this, C41520a0.m120436b(C14716h.class), new C14616v(a), new C14617w((C43064a) null, a), xVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public final void m53875A1(boolean z) {
        C8034d.m30522a(this).mo22118M(C10114f.action_packageDetailsFragment_to_packagesListFragment, C0908e.m3336b(C41233s.m119492a("forceSoloColor", Boolean.valueOf(z))));
    }

    /* renamed from: B1 */
    private final RecyclerView m53876B1() {
        RecyclerView recyclerView = m53888r1().f37837e;
        recyclerView.setAdapter(m53889s1());
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        recyclerView.setLayoutManager(new LinearLayoutManagerAccurateOffset(requireContext));
        recyclerView.setItemAnimator((RecyclerView.C1742m) null);
        C41536l.m120488h(recyclerView, "with(binding) {\n        …or = null\n        }\n    }");
        return recyclerView;
    }

    /* access modifiers changed from: private */
    /* renamed from: C1 */
    public final void m53877C1(C16888e eVar) {
        C8034d.m30522a(this).mo22118M(C10114f.packageBenefitsFragment, C0908e.m3336b(C41233s.m119492a("forceSoloColor", Boolean.valueOf(eVar.mo44054c())), C41233s.m119492a("packageName", eVar.mo44053b()), C41233s.m119492a("activePackageName", eVar.mo44052a())));
    }

    /* access modifiers changed from: private */
    /* renamed from: D1 */
    public final void m53878D1(SoloApplicationFormData soloApplicationFormData) {
        C8034d.m30522a(this).mo22118M(C10114f.solo_application_nav_graph, ApplicationNavigatorFragment.C14458a.m53506b(ApplicationNavigatorFragment.f42261B, soloApplicationFormData, false, 2, (Object) null));
    }

    private final void observeData() {
        C12817j Vw = m53890t1().mo41129Vw();
        Vw.mo33473hh().mo4819k(getViewLifecycleOwner(), new C14613s(new C14601g(this)));
        Vw.mo33468B9().mo4819k(getViewLifecycleOwner(), new C14613s(new C14602h(this)));
        LiveData oi = Vw.mo33476oi();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(oi, viewLifecycleOwner, new C14603i(this));
        LiveData jh = Vw.mo33474jh();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C37224b.m109963b(jh, viewLifecycleOwner2, new C14604j(this));
        LiveData ph = Vw.mo33477ph();
        C1619q viewLifecycleOwner3 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner3, "viewLifecycleOwner");
        C37224b.m109963b(ph, viewLifecycleOwner3, new C14605k(this));
        LiveData ui = Vw.mo33478ui();
        C1619q viewLifecycleOwner4 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner4, "viewLifecycleOwner");
        C37224b.m109963b(ui, viewLifecycleOwner4, new C14606l(this));
        LiveData Yd = Vw.mo33471Yd();
        C1619q viewLifecycleOwner5 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner5, "viewLifecycleOwner");
        C37224b.m109963b(Yd, viewLifecycleOwner5, new C14607m(this));
        LiveData Ga = Vw.mo33469Ga();
        C1619q viewLifecycleOwner6 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner6, "viewLifecycleOwner");
        C37224b.m109963b(Ga, viewLifecycleOwner6, new C14608n(this));
        LiveData Mc = Vw.mo33470Mc();
        C1619q viewLifecycleOwner7 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner7, "viewLifecycleOwner");
        C37224b.m109963b(Mc, viewLifecycleOwner7, new C14609o(this));
        LiveData dd = Vw.mo33472dd();
        C1619q viewLifecycleOwner8 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner8, "viewLifecycleOwner");
        C37224b.m109963b(dd, viewLifecycleOwner8, new C14596c(this));
        Vw.mo33467Af().mo4819k(getViewLifecycleOwner(), new C14613s(new C14597d(this)));
        LiveData zu = Vw.mo33479zu();
        C1619q viewLifecycleOwner9 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner9, "viewLifecycleOwner");
        C37224b.m109963b(zu, viewLifecycleOwner9, new C14598e(this));
        LiveData kn = Vw.mo33475kn();
        C1619q viewLifecycleOwner10 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner10, "viewLifecycleOwner");
        C37224b.m109963b(kn, viewLifecycleOwner10, new C14600f(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public final C12766r m53888r1() {
        C12766r rVar = this.f42514g;
        C41536l.m120486f(rVar);
        return rVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public final C14659b m53889s1() {
        return (C14659b) this.f42517j.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public final C14716h m53890t1() {
        return (C14716h) this.f42516i.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public final void m53891v1(C16886c cVar) {
        String f = cVar.mo44034f();
        if (f == null) {
            return;
        }
        if (C41536l.m120484d(f, "VISA_CONS")) {
            C14643c.C14644a aVar = C14643c.f42588N;
            if (aVar.mo41037a().contains(cVar.mo44032e())) {
                aVar.mo41038b(cVar.mo44032e()).mo4576A1(getChildFragmentManager(), (String) null);
                return;
            }
            return;
        }
        m53892x1(f, cVar.mo44031d());
    }

    /* renamed from: x1 */
    private final void m53892x1(String str, ArrayList arrayList) {
        ArrayList arrayList2;
        Intent intent = new Intent();
        intent.putExtra("type", str);
        if (arrayList != null) {
            arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                KeyValue keyValue = (KeyValue) it.next();
                arrayList2.add(new KeyValue(keyValue.getKey(), keyValue.getValue()));
            }
        } else {
            arrayList2 = null;
        }
        intent.putExtra("parameters", C42035e.m122121c(arrayList2));
        PushNotificationHandlerActivity.C22291a aVar = PushNotificationHandlerActivity.f59140a0;
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        aVar.mo55229a(requireActivity, intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public final void m53893y1(C31128a aVar) {
        C31132b.m92648j(aVar, (int[]) null, new C14610p(this), 1, (Object) null);
        C31132b.m92646h(aVar, (int[]) null, new C14611q(this), 1, (Object) null);
        C31132b.m92644f(aVar, (int[]) null, new C14612r(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public final void m53894z1(String str) {
        PackageManager packageManager;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        C1505h activity = getActivity();
        if (activity != null && (packageManager = activity.getPackageManager()) != null && intent.resolveActivity(packageManager) != null) {
            startActivity(intent);
        }
    }

    public String getHeaderText() {
        return C32343x.m95388F("my.package.page.main.header", new Object[0]);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C17913e.m61728j(this, false);
        this.f42514g = C12766r.m48462d(getLayoutInflater());
        StateView c = m53888r1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        m53888r1().f37837e.setAdapter((RecyclerView.C1736h) null);
        this.f42514g = null;
    }

    public void onResume() {
        super.onResume();
        C17913e.m61729k(this, false);
    }

    public void onStart() {
        super.onStart();
        m53890t1().mo41126Qw().mo41104Rt();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m53876B1();
        observeData();
    }

    /* renamed from: u1 */
    public final C14716h.C14718b mo40977u1() {
        C14716h.C14718b bVar = this.f42515h;
        if (bVar != null) {
            return bVar;
        }
        C41536l.m120506z("viewModelAssistedFactory");
        return null;
    }
}
