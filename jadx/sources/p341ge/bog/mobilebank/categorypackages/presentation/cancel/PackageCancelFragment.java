package p341ge.bog.mobilebank.categorypackages.presentation.cancel;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
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
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p163m0.C7047a;
import p202p0.C7602w;
import p228r0.C8034d;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.packagecard.PackageCardView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.categorypackages.presentation.application.navigator.ApplicationNavigatorFragment;
import p341ge.bog.mobilebank.categorypackages.presentation.application.shared.model.SoloApplicationFormData;
import p341ge.bog.mobilebank.cleanarch.moremenu.presentation.PackageType;
import p356ao.C10114f;
import p400dp.C12406a;
import p400dp.C12407b;
import p400dp.C12410e;
import p413eo.C12762p;
import p469io.C15709b;
import p568pp.C17472b;
import p568pp.C17475c;
import p684yi.C18922d;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.cancel.PackageCancelFragment */
public final class PackageCancelFragment extends C14590a {

    /* renamed from: i */
    public static final C14571a f42475i = new C14571a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C12762p f42476g;

    /* renamed from: h */
    private final C41217g f42477h;

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.cancel.PackageCancelFragment$a */
    public static final class C14571a {
        private C14571a() {
        }

        public /* synthetic */ C14571a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.cancel.PackageCancelFragment$b */
    /* synthetic */ class C14572b extends C41535k implements C43075l {
        C14572b(Object obj) {
            super(1, obj, PackageCancelFragment.class, "onOfferPackageResult", "onOfferPackageResult(Lge/bog/mobilebank/categorypackages/domain/model/packages/PackageItem;)V", 0);
        }

        /* renamed from: b */
        public final void mo40957b(C15709b bVar) {
            C41536l.m120489i(bVar, "p0");
            ((PackageCancelFragment) this.receiver).m53832t1(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40957b((C15709b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.cancel.PackageCancelFragment$c */
    /* synthetic */ class C14573c extends C41535k implements C43075l {
        C14573c(Object obj) {
            super(1, obj, PackageCancelFragment.class, "onActivatePackage", "onActivatePackage(Lge/bog/mobilebank/categorypackages/presentation/application/shared/model/SoloApplicationFormData;)V", 0);
        }

        /* renamed from: b */
        public final void mo40958b(SoloApplicationFormData soloApplicationFormData) {
            C41536l.m120489i(soloApplicationFormData, "p0");
            ((PackageCancelFragment) this.receiver).m53831s1(soloApplicationFormData);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40958b((SoloApplicationFormData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.cancel.PackageCancelFragment$d */
    /* synthetic */ class C14574d extends C41535k implements C43075l {
        C14574d(Object obj) {
            super(1, obj, PackageCancelFragment.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0);
        }

        /* renamed from: b */
        public final void mo40959b(Throwable th) {
            ((PackageCancelFragment) this.receiver).handleError(th);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40959b((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.cancel.PackageCancelFragment$e */
    /* synthetic */ class C14575e extends C41535k implements C43075l {
        C14575e(Object obj) {
            super(1, obj, PackageCancelFragment.class, "handlePackageCancelResult", "handlePackageCancelResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo40960b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((PackageCancelFragment) this.receiver).m53830r1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40960b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.cancel.PackageCancelFragment$f */
    static final class C14576f implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f42478a;

        C14576f(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f42478a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f42478a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f42478a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.cancel.PackageCancelFragment$g */
    static final class C14577g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PackageCancelFragment f42479d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14577g(PackageCancelFragment packageCancelFragment) {
            super(0);
            this.f42479d = packageCancelFragment;
        }

        public final void invoke() {
            this.f42479d.m53829q1().mo40965yw();
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.cancel.PackageCancelFragment$h */
    public static final class C14578h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f42480d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14578h(Fragment fragment) {
            super(0);
            this.f42480d = fragment;
        }

        public final Fragment invoke() {
            return this.f42480d;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.cancel.PackageCancelFragment$i */
    public static final class C14579i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f42481d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14579i(C43064a aVar) {
            super(0);
            this.f42481d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f42481d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.cancel.PackageCancelFragment$j */
    public static final class C14580j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f42482d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14580j(C41217g gVar) {
            super(0);
            this.f42482d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f42482d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.cancel.PackageCancelFragment$k */
    public static final class C14581k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f42483d;

        /* renamed from: e */
        final /* synthetic */ C41217g f42484e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14581k(C43064a aVar, C41217g gVar) {
            super(0);
            this.f42483d = aVar;
            this.f42484e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f42483d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f42484e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.cancel.PackageCancelFragment$l */
    public static final class C14582l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f42485d;

        /* renamed from: e */
        final /* synthetic */ C41217g f42486e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14582l(Fragment fragment, C41217g gVar) {
            super(0);
            this.f42485d = fragment;
            this.f42486e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f42486e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f42485d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public PackageCancelFragment() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C14579i(new C14578h(this)));
        this.f42477h = C1514j0.m5374c(this, C41520a0.m120436b(PackageCancelViewModel$ViewModel.class), new C14580j(a), new C14581k((C43064a) null, a), new C14582l(this, a));
    }

    /* renamed from: o1 */
    private final C12762p m53827o1() {
        C12762p pVar = this.f42476g;
        C41536l.m120486f(pVar);
        return pVar;
    }

    private final void observeData() {
        C12410e xw = m53829q1().mo40964xw();
        LiveData N8 = xw.mo33013N8();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(N8, viewLifecycleOwner, new C14572b(this));
        LiveData bj = xw.mo33014bj();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C37224b.m109963b(bj, viewLifecycleOwner2, new C14573c(this));
        LiveData wj = xw.mo33016wj();
        C1619q viewLifecycleOwner3 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner3, "viewLifecycleOwner");
        C37224b.m109963b(wj, viewLifecycleOwner3, new C14574d(this));
        xw.mo33015vl().mo4819k(getViewLifecycleOwner(), new C14576f(new C14575e(this)));
    }

    /* renamed from: p1 */
    private final String m53828p1(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(C32343x.m95388F("text.package.package.cancel.description.text", new Object[0]));
        sb.append("\n\n");
        String F = C32343x.m95388F("text.package.package.cancel.offer.package.text", new Object[0]);
        if (str == null) {
            str = "";
        }
        sb.append(C40439w.m117103B(F, "%PACKAGE_DESC%", str, false, 4, (Object) null));
        String sb2 = sb.toString();
        C41536l.m120488h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public final PackageCancelViewModel$ViewModel m53829q1() {
        return (PackageCancelViewModel$ViewModel) this.f42477h.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public final void m53830r1(C31128a aVar) {
        if (aVar instanceof C31128a.C31130b) {
            m53827o1().f37818f.setLoading(true);
        } else if (aVar instanceof C31128a.C31129a) {
            handleError(((C31128a.C31129a) aVar).mo71342c());
            m53827o1().f37818f.setLoading(false);
        } else if (aVar instanceof C31128a.C31131c) {
            m53827o1().f37818f.setLoading(false);
            C8034d.m30522a(this).mo22121Q(C14591b.f42510a.mo40973a((PackageType) ((C31128a.C31131c) aVar).mo71340a()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public final void m53831s1(SoloApplicationFormData soloApplicationFormData) {
        C8034d.m30522a(this).mo22119N(C10114f.solo_application_nav_graph, ApplicationNavigatorFragment.C14458a.m53506b(ApplicationNavigatorFragment.f42261B, soloApplicationFormData, false, 2, (Object) null), C7602w.C7603a.m28913i(new C7602w.C7603a(), C10114f.packagesListFragment, true, false, 4, (Object) null).mo22256a());
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public final void m53832t1(C15709b bVar) {
        C12762p o1 = m53827o1();
        Button button = o1.f37818f;
        C41536l.m120488h(button, "cancelPrimaryButton");
        Integer num = null;
        C32343x.m95483r1(button, false, false, 2, (Object) null);
        Button button2 = o1.f37817e;
        C41536l.m120488h(button2, "cancelButton");
        C32343x.m95483r1(button2, true, false, 2, (Object) null);
        PackageCardView packageCardView = o1.f37819g;
        C41536l.m120488h(packageCardView, "offerPackage");
        C32343x.m95483r1(packageCardView, true, false, 2, (Object) null);
        C17472b.C17474b i = C17475c.m60979i(bVar, false, (C43064a) null, (C43064a) null, (Integer) null, 14, (Object) null);
        PackageCardView packageCardView2 = o1.f37819g;
        packageCardView2.setForceWhiteTexts(i.mo44989e());
        Integer a = i.mo44985a();
        if (a != null) {
            int intValue = a.intValue();
            Context context = packageCardView2.getContext();
            C41536l.m120488h(context, "context");
            num = Integer.valueOf(C32343x.m95418U(intValue, context));
        }
        packageCardView2.setBackgroundColor(num);
        packageCardView2.setHeaderData(i.mo44991f());
        packageCardView2.setLimitInfoData(i.mo44993h());
        packageCardView2.setTransactionsData(i.mo45000n());
        packageCardView2.setInfoTextsData(i.mo44992g());
        o1.f37820h.setText(m53828p1(i.mo44988d()));
    }

    /* renamed from: u1 */
    private final void m53833u1() {
        C12762p o1 = m53827o1();
        PageDescriptionView pageDescriptionView = o1.f37820h;
        pageDescriptionView.setTitle(C32343x.m95388F("text.package.package.cancel.question.text", new Object[0]));
        pageDescriptionView.setText(C32343x.m95388F("text.package.package.cancel.description.text", new Object[0]));
        Button button = o1.f37817e;
        button.setButtonText(C32343x.m95388F("text.packages.cancel.button", new Object[0]));
        button.setOnClickListener(new C12406a(this));
        Button button2 = o1.f37818f;
        button2.setButtonText(C32343x.m95388F("text.packages.cancel.button", new Object[0]));
        button2.setOnClickListener(new C12407b(this));
        o1.f37819g.setButtonData(new C18922d(C32343x.m95388F("text.packages.package.card.middle.page.button", new Object[0]), new C14577g(this), (String) null, (C43064a) null, 12, (DefaultConstructorMarker) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public static final void m53834v1(PackageCancelFragment packageCancelFragment, View view) {
        C41536l.m120489i(packageCancelFragment, "this$0");
        packageCancelFragment.m53829q1().mo40963pw();
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public static final void m53835x1(PackageCancelFragment packageCancelFragment, View view) {
        C41536l.m120489i(packageCancelFragment, "this$0");
        packageCancelFragment.m53829q1().mo40963pw();
    }

    public String getHeaderText() {
        return C32343x.m95388F("text.package.cancel.page.header", new Object[0]);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f42476g = C12762p.m48444d(getLayoutInflater());
        NestedScrollView c = m53827o1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f42476g = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m53833u1();
        observeData();
    }
}
