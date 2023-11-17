package p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.benefits;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
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
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import g91.C32289b0;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import j31.C36725a;
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
import p163m0.C7047a;
import p228r0.C8034d;
import p341ge.bog.designsystem.components.buttonlist.ButtonListLargeView;
import p341ge.bog.designsystem.components.packagecard.PackageCardView;
import p341ge.bog.mobilebank.categorypackages.presentation.application.navigator.ApplicationNavigatorFragment;
import p341ge.bog.mobilebank.categorypackages.presentation.application.shared.model.SoloApplicationFormData;
import p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.benefits.C14687c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p356ao.C10114f;
import p413eo.C12760o;
import p455ho.C15555h;
import p469io.C15709b;
import p498kp.C16523a;
import p498kp.C16524b;
import p498kp.C16525c;
import p568pp.C17475c;
import p610sp.C17913e;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.benefits.PackageBenefitsDetailsFragment */
public final class PackageBenefitsDetailsFragment extends C14685a {

    /* renamed from: i */
    private C12760o f42625i;

    /* renamed from: j */
    private final C41217g f42626j = C41219i.m119470b(new C14670a(this));

    /* renamed from: k */
    public C14687c.C14689b f42627k;

    /* renamed from: l */
    private final C41217g f42628l;

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.benefits.PackageBenefitsDetailsFragment$a */
    static final class C14670a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PackageBenefitsDetailsFragment f42629d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14670a(PackageBenefitsDetailsFragment packageBenefitsDetailsFragment) {
            super(0);
            this.f42629d = packageBenefitsDetailsFragment;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            Bundle arguments = this.f42629d.getArguments();
            boolean z = false;
            if (arguments != null) {
                z = arguments.getBoolean("forceSoloColor", false);
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.benefits.PackageBenefitsDetailsFragment$b */
    static final class C14671b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PackageBenefitsDetailsFragment f42630d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14671b(PackageBenefitsDetailsFragment packageBenefitsDetailsFragment) {
            super(1);
            this.f42630d = packageBenefitsDetailsFragment;
        }

        /* renamed from: a */
        public final void mo41065a(C31128a aVar) {
            PackageBenefitsDetailsFragment packageBenefitsDetailsFragment = this.f42630d;
            C41536l.m120488h(aVar, "it");
            packageBenefitsDetailsFragment.m54036t1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41065a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.benefits.PackageBenefitsDetailsFragment$c */
    static final class C14672c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PackageBenefitsDetailsFragment f42631d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14672c(PackageBenefitsDetailsFragment packageBenefitsDetailsFragment) {
            super(1);
            this.f42631d = packageBenefitsDetailsFragment;
        }

        /* renamed from: a */
        public final void mo41066a(C15709b bVar) {
            PackageBenefitsDetailsFragment packageBenefitsDetailsFragment = this.f42631d;
            C41536l.m120488h(bVar, "it");
            packageBenefitsDetailsFragment.m54037u1(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41066a((C15709b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.benefits.PackageBenefitsDetailsFragment$d */
    static final class C14673d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PackageBenefitsDetailsFragment f42632d;

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.benefits.PackageBenefitsDetailsFragment$d$a */
        /* synthetic */ class C14674a extends C41535k implements C43075l {
            C14674a(Object obj) {
                super(1, obj, PackageBenefitsDetailsFragment.class, "startApplication", "startApplication(Lge/bog/mobilebank/categorypackages/presentation/application/shared/model/SoloApplicationFormData;)V", 0);
            }

            /* renamed from: b */
            public final void mo41068b(SoloApplicationFormData soloApplicationFormData) {
                C41536l.m120489i(soloApplicationFormData, "p0");
                ((PackageBenefitsDetailsFragment) this.receiver).m54024A1(soloApplicationFormData);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo41068b((SoloApplicationFormData) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14673d(PackageBenefitsDetailsFragment packageBenefitsDetailsFragment) {
            super(1);
            this.f42632d = packageBenefitsDetailsFragment;
        }

        /* renamed from: a */
        public final void mo41067a(SoloApplicationFormData soloApplicationFormData) {
            C41536l.m120489i(soloApplicationFormData, "it");
            C17913e.m61723e(soloApplicationFormData, this.f42632d.m54035s1().mo41078lw().mo41084vv(), new C14674a(this.f42632d), this.f42632d);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41067a((SoloApplicationFormData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.benefits.PackageBenefitsDetailsFragment$e */
    static final class C14675e extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ PackageBenefitsDetailsFragment f42633d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14675e(PackageBenefitsDetailsFragment packageBenefitsDetailsFragment) {
            super(2);
            this.f42633d = packageBenefitsDetailsFragment;
        }

        /* renamed from: a */
        public final void mo41069a(Throwable th, List list) {
            C41536l.m120489i(th, "t");
            this.f42633d.m54033p1().f37810n.mo53596d();
            C1505h activity = this.f42633d.getActivity();
            C41536l.m120487g(activity, "null cannot be cast to non-null type ge.bog.mobilebank.ui.activities.RootActivity");
            ((C35388f2) activity).mo74709H1(th);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo41069a((Throwable) obj, (List) obj2);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.benefits.PackageBenefitsDetailsFragment$f */
    static final class C14676f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PackageBenefitsDetailsFragment f42634d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14676f(PackageBenefitsDetailsFragment packageBenefitsDetailsFragment) {
            super(1);
            this.f42634d = packageBenefitsDetailsFragment;
        }

        /* renamed from: a */
        public final void mo41070a(List list) {
            this.f42634d.m54033p1().f37810n.mo53597e();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41070a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.benefits.PackageBenefitsDetailsFragment$g */
    static final class C14677g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PackageBenefitsDetailsFragment f42635d;

        /* renamed from: e */
        final /* synthetic */ Context f42636e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14677g(PackageBenefitsDetailsFragment packageBenefitsDetailsFragment, Context context) {
            super(1);
            this.f42635d = packageBenefitsDetailsFragment;
            this.f42636e = context;
        }

        /* renamed from: a */
        public final void mo41071a(List list) {
            String str;
            C41536l.m120489i(list, "benefits");
            this.f42635d.m54033p1().f37810n.mo53595c();
            Context context = this.f42636e;
            PackageBenefitsDetailsFragment packageBenefitsDetailsFragment = this.f42635d;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C15555h hVar = (C15555h) it.next();
                C41536l.m120488h(context, "ctx");
                ButtonListLargeView buttonListLargeView = new ButtonListLargeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                buttonListLargeView.setUpperText(C32343x.m95388F(hVar.mo42751b(), new Object[0]));
                buttonListLargeView.setLowerText(C32343x.m95388F(hVar.mo42760i(), new Object[0]));
                C36725a f = hVar.mo42756f();
                if (f == null || (str = f.mo89541d()) == null) {
                    str = "";
                }
                String c = C32289b0.m95091c(str);
                C41536l.m120488h(c, "generateImageUrl(\n      …                        )");
                buttonListLargeView.mo34925p(c);
                buttonListLargeView.setButtonListType(ButtonListLargeView.C13185c.THUMBNAIL_MULTI_SECONDARY_TEXT);
                buttonListLargeView.setChangeButtonVisible(false);
                packageBenefitsDetailsFragment.m54033p1().f37801e.addView(buttonListLargeView);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41071a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.benefits.PackageBenefitsDetailsFragment$h */
    static final class C14678h implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f42637a;

        C14678h(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f42637a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f42637a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f42637a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.benefits.PackageBenefitsDetailsFragment$i */
    public static final class C14679i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f42638d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14679i(Fragment fragment) {
            super(0);
            this.f42638d = fragment;
        }

        public final Fragment invoke() {
            return this.f42638d;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.benefits.PackageBenefitsDetailsFragment$j */
    public static final class C14680j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f42639d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14680j(C43064a aVar) {
            super(0);
            this.f42639d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f42639d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.benefits.PackageBenefitsDetailsFragment$k */
    public static final class C14681k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f42640d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14681k(C41217g gVar) {
            super(0);
            this.f42640d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f42640d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.benefits.PackageBenefitsDetailsFragment$l */
    public static final class C14682l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f42641d;

        /* renamed from: e */
        final /* synthetic */ C41217g f42642e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14682l(C43064a aVar, C41217g gVar) {
            super(0);
            this.f42641d = aVar;
            this.f42642e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f42641d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f42642e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.benefits.PackageBenefitsDetailsFragment$m */
    static final class C14683m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PackageBenefitsDetailsFragment f42643d;

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.benefits.PackageBenefitsDetailsFragment$m$a */
        static final class C14684a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ PackageBenefitsDetailsFragment f42644d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14684a(PackageBenefitsDetailsFragment packageBenefitsDetailsFragment) {
                super(0);
                this.f42644d = packageBenefitsDetailsFragment;
            }

            /* renamed from: b */
            public final C14687c invoke() {
                String str;
                C14687c.C14689b q1 = this.f42644d.mo41063q1();
                Bundle arguments = this.f42644d.getArguments();
                String str2 = null;
                String str3 = "";
                if (arguments != null) {
                    str = arguments.getString("packageName", str3);
                } else {
                    str = null;
                }
                if (str == null) {
                    str = str3;
                }
                Bundle arguments2 = this.f42644d.getArguments();
                if (arguments2 != null) {
                    str2 = arguments2.getString("activePackageName", str3);
                }
                if (str2 != null) {
                    str3 = str2;
                }
                return q1.mo32781a(str, str3);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14683m(PackageBenefitsDetailsFragment packageBenefitsDetailsFragment) {
            super(0);
            this.f42643d = packageBenefitsDetailsFragment;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C14684a(this.f42643d));
        }
    }

    public PackageBenefitsDetailsFragment() {
        C14683m mVar = new C14683m(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C14680j(new C14679i(this)));
        this.f42628l = C1514j0.m5374c(this, C41520a0.m120436b(C14687c.class), new C14681k(a), new C14682l((C43064a) null, a), mVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public final void m54024A1(SoloApplicationFormData soloApplicationFormData) {
        C8034d.m30522a(this).mo22118M(C10114f.solo_application_nav_graph, ApplicationNavigatorFragment.C14458a.m53506b(ApplicationNavigatorFragment.f42261B, soloApplicationFormData, false, 2, (Object) null));
    }

    private final void observeData() {
        m54035s1().mo41079mw().mo41080nw().mo4819k(getViewLifecycleOwner(), new C14678h(new C14671b(this)));
        m54035s1().mo41079mw().mo41081ow().mo4819k(getViewLifecycleOwner(), new C14678h(new C14672c(this)));
        LiveData pw = m54035s1().mo41079mw().mo41082pw();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(pw, viewLifecycleOwner, new C14673d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public final C12760o m54033p1() {
        C12760o oVar = this.f42625i;
        C41536l.m120486f(oVar);
        return oVar;
    }

    /* renamed from: r1 */
    private final boolean m54034r1() {
        return ((Boolean) this.f42626j.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public final C14687c m54035s1() {
        return (C14687c) this.f42628l.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public final void m54036t1(C31128a aVar) {
        Context context = getContext();
        if (context != null) {
            m54033p1().f37801e.removeAllViews();
            C31132b.m92644f(aVar, (int[]) null, new C14675e(this), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C14676f(this), 1, (Object) null);
            C31132b.m92648j(aVar, (int[]) null, new C14677g(this, context), 1, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public final void m54037u1(C15709b bVar) {
        PackageCardView packageCardView = m54033p1().f37807k;
        packageCardView.setForceWhiteTexts(m54034r1());
        Integer num = null;
        Integer d = C17475c.m60974d(bVar, m54034r1(), (Integer) null, 2, (Object) null);
        if (d != null) {
            int intValue = d.intValue();
            Context context = packageCardView.getContext();
            C41536l.m120488h(context, "context");
            num = Integer.valueOf(C32343x.m95418U(intValue, context));
        }
        packageCardView.setBackgroundColor(num);
        packageCardView.setHeaderData(C17475c.m60975e(bVar));
    }

    /* renamed from: v1 */
    private final void m54038v1() {
        C1505h activity = getActivity();
        C41536l.m120487g(activity, "null cannot be cast to non-null type ge.bog.mobilebank.ui.activities.RootActivity");
        ((C35388f2) activity).mo86429X1(C32343x.m95388F("text.packages.middle.page.header.change.package", new Object[0]));
        m54033p1().f37802f.setButtonText(C32343x.m95388F("text.packages.middle.page.activate.button", new Object[0]));
        m54033p1().f37803g.setButtonText(C32343x.m95388F("text.packages.middle.page.close.button", new Object[0]));
        m54033p1().f37810n.mo53597e();
        m54033p1().f37803g.setOnClickListener(new C16523a(this));
        m54033p1().f37802f.setOnClickListener(new C16524b(this));
        m54033p1().f37808l.setOnClickListener(new C16525c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public static final void m54039x1(PackageBenefitsDetailsFragment packageBenefitsDetailsFragment, View view) {
        C41536l.m120489i(packageBenefitsDetailsFragment, "this$0");
        C1505h activity = packageBenefitsDetailsFragment.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public static final void m54040y1(PackageBenefitsDetailsFragment packageBenefitsDetailsFragment, View view) {
        C41536l.m120489i(packageBenefitsDetailsFragment, "this$0");
        packageBenefitsDetailsFragment.m54035s1().mo41078lw().mo41083qw();
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public static final void m54041z1(PackageBenefitsDetailsFragment packageBenefitsDetailsFragment, View view) {
        C41536l.m120489i(packageBenefitsDetailsFragment, "this$0");
        C21481a.onRefresh$default(packageBenefitsDetailsFragment.m54035s1(), 0, 1, (Object) null);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C17913e.m61728j(this, m54034r1());
        this.f42625i = C12760o.m48435d(getLayoutInflater());
        StateView c = m54033p1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f42625i = null;
    }

    public void onResume() {
        super.onResume();
        C17913e.m61729k(this, m54034r1());
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m54038v1();
        observeData();
    }

    /* renamed from: q1 */
    public final C14687c.C14689b mo41063q1() {
        C14687c.C14689b bVar = this.f42627k;
        if (bVar != null) {
            return bVar;
        }
        C41536l.m120506z("factory");
        return null;
    }
}
