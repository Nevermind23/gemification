package p341ge.bog.mobilebank.categorypackages.presentation.packagecancelfeedback;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o31.C37590b;
import p163m0.C7047a;
import p202p0.C7542g;
import p228r0.C8034d;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.designsystem.components.radiobutton.RadioButtonView;
import p341ge.bog.mobilebank.categorypackages.presentation.packagecancelfeedback.C14758b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p413eo.C12764q;
import p455ho.C15556i;
import p497ko.C16515b;
import p540np.C17135a;
import p540np.C17136b;
import p540np.C17137c;
import p540np.C17138d;
import p540np.C17142g;
import p642vh.C18368l;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagecancelfeedback.PackageCancelFeedbackFragment */
public final class PackageCancelFeedbackFragment extends C14757a {

    /* renamed from: g */
    private C12764q f42759g;

    /* renamed from: h */
    private final C41217g f42760h;

    /* renamed from: i */
    private final C7542g f42761i = new C7542g(C41520a0.m120436b(C17138d.class), new C14746g(this));

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagecancelfeedback.PackageCancelFeedbackFragment$a */
    static final class C14740a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PackageCancelFeedbackFragment f42762d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14740a(PackageCancelFeedbackFragment packageCancelFeedbackFragment) {
            super(1);
            this.f42762d = packageCancelFeedbackFragment;
        }

        /* renamed from: a */
        public final void mo41171a(C41238w wVar) {
            this.f42762d.m54271p1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41171a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagecancelfeedback.PackageCancelFeedbackFragment$b */
    /* synthetic */ class C14741b extends C41535k implements C43075l {
        C14741b(Object obj) {
            super(1, obj, PackageCancelFeedbackFragment.class, "setupRadioGroup", "setupRadioGroup(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo41172b(List list) {
            C41536l.m120489i(list, "p0");
            ((PackageCancelFeedbackFragment) this.receiver).m54262B1(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41172b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagecancelfeedback.PackageCancelFeedbackFragment$c */
    /* synthetic */ class C14742c extends C41535k implements C43075l {
        C14742c(Object obj) {
            super(1, obj, PackageCancelFeedbackFragment.class, "handlePageStateLoading", "handlePageStateLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo41173b(boolean z) {
            ((PackageCancelFeedbackFragment) this.receiver).m54276u1(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41173b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagecancelfeedback.PackageCancelFeedbackFragment$d */
    /* synthetic */ class C14743d extends C41535k implements C43075l {
        C14743d(Object obj) {
            super(1, obj, PackageCancelFeedbackFragment.class, "handleButtonState", "handleButtonState(Lge/bog/mobilebank/shared/helper/ButtonState;)V", 0);
        }

        /* renamed from: b */
        public final void mo41174b(C37590b bVar) {
            C41536l.m120489i(bVar, "p0");
            ((PackageCancelFeedbackFragment) this.receiver).m54275t1(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41174b((C37590b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagecancelfeedback.PackageCancelFeedbackFragment$e */
    /* synthetic */ class C14744e extends C41535k implements C43075l {
        C14744e(Object obj) {
            super(1, obj, PackageCancelFeedbackFragment.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0);
        }

        /* renamed from: b */
        public final void mo41175b(Throwable th) {
            ((PackageCancelFeedbackFragment) this.receiver).handleError(th);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41175b((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagecancelfeedback.PackageCancelFeedbackFragment$f */
    static final class C14745f implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f42763a;

        C14745f(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f42763a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f42763a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f42763a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagecancelfeedback.PackageCancelFeedbackFragment$g */
    public static final class C14746g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f42764d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14746g(Fragment fragment) {
            super(0);
            this.f42764d = fragment;
        }

        /* renamed from: b */
        public final Bundle invoke() {
            Bundle arguments = this.f42764d.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f42764d + " has null arguments");
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagecancelfeedback.PackageCancelFeedbackFragment$h */
    public static final class C14747h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f42765d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14747h(Fragment fragment) {
            super(0);
            this.f42765d = fragment;
        }

        public final Fragment invoke() {
            return this.f42765d;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagecancelfeedback.PackageCancelFeedbackFragment$i */
    public static final class C14748i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f42766d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14748i(C43064a aVar) {
            super(0);
            this.f42766d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f42766d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagecancelfeedback.PackageCancelFeedbackFragment$j */
    public static final class C14749j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f42767d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14749j(C41217g gVar) {
            super(0);
            this.f42767d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f42767d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagecancelfeedback.PackageCancelFeedbackFragment$k */
    public static final class C14750k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f42768d;

        /* renamed from: e */
        final /* synthetic */ C41217g f42769e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14750k(C43064a aVar, C41217g gVar) {
            super(0);
            this.f42768d = aVar;
            this.f42769e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f42768d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f42769e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.packagecancelfeedback.PackageCancelFeedbackFragment$l */
    public static final class C14751l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f42770d;

        /* renamed from: e */
        final /* synthetic */ C41217g f42771e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14751l(Fragment fragment, C41217g gVar) {
            super(0);
            this.f42770d = fragment;
            this.f42771e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f42771e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f42770d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public PackageCancelFeedbackFragment() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C14748i(new C14747h(this)));
        this.f42760h = C1514j0.m5374c(this, C41520a0.m120436b(PackageCancelFeedbackViewModel$ViewModel.class), new C14749j(a), new C14750k((C43064a) null, a), new C14751l(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public static final void m54261A1(C12764q qVar, PackageCancelFeedbackFragment packageCancelFeedbackFragment, RadioGroup radioGroup, int i) {
        Integer num;
        C41536l.m120489i(qVar, "$this_with");
        C41536l.m120489i(packageCancelFeedbackFragment, "this$0");
        if (i >= 0) {
            RadioGroup radioGroup2 = qVar.f37831l;
            num = Integer.valueOf(radioGroup2.indexOfChild(radioGroup2.findViewById(i)));
        } else {
            num = null;
        }
        packageCancelFeedbackFragment.m54274s1().mo41187tw(num);
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public final void m54262B1(List list) {
        RadioGroup radioGroup = m54273r1().f37831l;
        radioGroup.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Context requireContext = requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            RadioButtonView radioButtonView = new RadioButtonView(requireContext, (AttributeSet) null, 2, (DefaultConstructorMarker) null);
            radioButtonView.setId(View.generateViewId());
            radioButtonView.setText(C32343x.m95388F(((C15556i) it.next()).mo42763b(), new Object[0]));
            radioButtonView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            radioButtonView.setPadding(radioButtonView.getPaddingLeft(), radioButtonView.getPaddingTop(), radioButtonView.getPaddingRight(), C18368l.m62764m(32));
            radioGroup.addView(radioButtonView);
        }
        Integer qw = m54274s1().mo41184qw();
        if (qw != null) {
            radioGroup.check(radioGroup.getChildAt(qw.intValue()).getId());
        }
    }

    /* renamed from: C1 */
    private final void m54263C1() {
        C12764q r1 = m54273r1();
        PageDescriptionView pageDescriptionView = r1.f37828i;
        C16515b bVar = C16515b.f46654a;
        pageDescriptionView.setTitle(C34646b.m101752f(bVar.mo43655e(), (Context) null, 1, (Object) null));
        r1.f37828i.setText(C34646b.m101752f(bVar.mo43651a(), (Context) null, 1, (Object) null));
        r1.f37830k.setText(C34646b.m101752f(bVar.mo43653c(), (Context) null, 1, (Object) null));
        r1.f37825f.setButtonText(C34646b.m101752f(bVar.mo43654d(), (Context) null, 1, (Object) null));
        r1.f37824e.setButtonText(C34646b.m101752f(bVar.mo43652b(), (Context) null, 1, (Object) null));
    }

    private final void observeData() {
        C17142g pw = m54274s1().mo41183pw();
        pw.mo41188xs().mo4819k(getViewLifecycleOwner(), new C14745f(new C14740a(this)));
        pw.mo41181Y3().mo4819k(getViewLifecycleOwner(), new C14745f(new C14741b(this)));
        pw.mo41180P3().mo4819k(getViewLifecycleOwner(), new C14745f(new C14742c(this)));
        pw.mo41179Gh().mo4819k(getViewLifecycleOwner(), new C14745f(new C14743d(this)));
        LiveData o3 = pw.mo41182o3();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(o3, viewLifecycleOwner, new C14744e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public final void m54271p1() {
        C8034d.m30522a(this).mo22121Q(C14758b.C14759a.m54314b(C14758b.f42792a, m54272q1().mo44559a(), false, 2, (Object) null));
    }

    /* renamed from: q1 */
    private final C17138d m54272q1() {
        return (C17138d) this.f42761i.getValue();
    }

    /* renamed from: r1 */
    private final C12764q m54273r1() {
        C12764q qVar = this.f42759g;
        C41536l.m120486f(qVar);
        return qVar;
    }

    /* renamed from: s1 */
    private final PackageCancelFeedbackViewModel$ViewModel m54274s1() {
        return (PackageCancelFeedbackViewModel$ViewModel) this.f42760h.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public final void m54275t1(C37590b bVar) {
        Button button = m54273r1().f37824e;
        button.setEnabled(bVar.mo90780b());
        button.setLoading(bVar.mo90781c());
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public final void m54276u1(boolean z) {
        StateView stateView = m54273r1().f37829j;
        if (z) {
            stateView.mo53597e();
        } else {
            stateView.mo53595c();
        }
    }

    /* renamed from: v1 */
    private final void m54277v1() {
        m54274s1().mo41185rw();
    }

    /* renamed from: x1 */
    private final void m54278x1() {
        C12764q r1 = m54273r1();
        r1.f37824e.setOnClickListener(new C17135a(this));
        r1.f37825f.setOnClickListener(new C17136b(this));
        r1.f37831l.setOnCheckedChangeListener(new C17137c(r1, this));
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public static final void m54279y1(PackageCancelFeedbackFragment packageCancelFeedbackFragment, View view) {
        C41536l.m120489i(packageCancelFeedbackFragment, "this$0");
        packageCancelFeedbackFragment.m54277v1();
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public static final void m54280z1(PackageCancelFeedbackFragment packageCancelFeedbackFragment, View view) {
        C41536l.m120489i(packageCancelFeedbackFragment, "this$0");
        packageCancelFeedbackFragment.m54274s1().mo41186sw();
    }

    public String getHeaderText() {
        return C32343x.m95388F("text.package.cancel.page.header", new Object[0]);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f42759g = C12764q.m48453d(getLayoutInflater());
        StateView c = m54273r1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f42759g = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m54263C1();
        m54278x1();
        observeData();
    }
}
