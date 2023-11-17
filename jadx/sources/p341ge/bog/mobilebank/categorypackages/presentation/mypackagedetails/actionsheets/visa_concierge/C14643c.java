package p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.visa_concierge;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import b41.C31132b;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ld0.C25950a;
import o00.C26656a;
import o00.C26657b;
import p00.C27113k;
import p163m0.C7047a;
import p228r0.C8034d;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.model.offers.Summary;
import p356ao.C10110b;
import p356ao.C10112d;
import p356ao.C10114f;
import p366bk.C10328q;
import p413eo.C12744g;
import p420fh.C12902d;
import p420fh.C12910e;
import p484jp.C16311c;
import p484jp.C16312d;
import p484jp.C16313e;
import p484jp.C16314f;
import p484jp.C16315g;
import p484jp.C16318j;
import p526mp.C16883a;
import p642vh.C18358g;
import q31.C38122f;
import q31.C38125h;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.visa_concierge.c */
public final class C14643c extends C14642b implements C26656a, C26657b {

    /* renamed from: N */
    public static final C14644a f42588N = new C14644a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: O */
    public static final List f42589O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public static final List f42590P;

    /* renamed from: K */
    private C12744g f42591K;

    /* renamed from: L */
    private final C41217g f42592L = C41219i.m119470b(new C14658o(this));

    /* renamed from: M */
    private final C41217g f42593M;

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.visa_concierge.c$a */
    public static final class C14644a {
        private C14644a() {
        }

        public /* synthetic */ C14644a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final List mo41037a() {
            return C14643c.f42590P;
        }

        /* renamed from: b */
        public final C14643c mo41038b(C16883a aVar) {
            C14643c cVar = new C14643c();
            cVar.setArguments(C0908e.m3336b(C41233s.m119492a("EXTRA_STATUS", aVar)));
            return cVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.visa_concierge.c$b */
    /* synthetic */ class C14645b extends C41535k implements C43075l {
        C14645b(Object obj) {
            super(1, obj, C14643c.class, "onPreContractResult", "onPreContractResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo41039b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C14643c) this.receiver).m53979u2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41039b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.visa_concierge.c$c */
    /* synthetic */ class C14646c extends C41535k implements C43075l {
        C14646c(Object obj) {
            super(1, obj, C14643c.class, "onSetVisaConciergeResult", "onSetVisaConciergeResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo41040b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C14643c) this.receiver).m53980v2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41040b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.visa_concierge.c$d */
    static final class C14647d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C14643c f42594d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14647d(C14643c cVar) {
            super(1);
            this.f42594d = cVar;
        }

        /* renamed from: a */
        public final void mo41041a(C25950a aVar) {
            C41536l.m120489i(aVar, "preContract");
            this.f42594d.m53981w2(aVar.mo64864a());
            this.f42594d.m53975q2().f37726e.setLoading(false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41041a((C25950a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.visa_concierge.c$e */
    static final class C14648e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C14643c f42595d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14648e(C14643c cVar) {
            super(1);
            this.f42595d = cVar;
        }

        /* renamed from: a */
        public final void mo41042a(C25950a aVar) {
            this.f42595d.m53975q2().f37726e.setLoading(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41042a((C25950a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.visa_concierge.c$f */
    static final class C14649f extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ C14643c f42596d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14649f(C14643c cVar) {
            super(2);
            this.f42596d = cVar;
        }

        /* renamed from: a */
        public final void mo41043a(Throwable th, C25950a aVar) {
            C41536l.m120489i(th, "<anonymous parameter 0>");
            C14643c cVar = this.f42596d;
            String string = cVar.getString(C10328q.f28955d2);
            C41536l.m120488h(string, "getString(ge.bog.mobileb…mon_text_operation_error)");
            C12910e.m48792j(cVar, string, (C12902d.C12905b) null, false, 6, (Object) null);
            this.f42596d.m53975q2().f37726e.setLoading(false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo41043a((Throwable) obj, (C25950a) obj2);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.visa_concierge.c$g */
    static final class C14650g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C14643c f42597d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14650g(C14643c cVar) {
            super(1);
            this.f42597d = cVar;
        }

        /* renamed from: a */
        public final void mo41044a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C8034d.m30522a(this.f42597d).mo22118M(C10114f.action_packageDetailsFragment_to_setVisaConciergeResultFragment, SetConciergeResultFragment.f42566j.mo41016a(C14643c.f42589O.contains(this.f42597d.m53976r2())));
            FragmentManager childFragmentManager = this.f42597d.getChildFragmentManager();
            C41536l.m120488h(childFragmentManager, "childFragmentManager");
            C27113k e0 = C32343x.m95443e0(childFragmentManager, (String) null, 1, (Object) null);
            if (e0 != null) {
                e0.mo4577k1();
            }
            this.f42597d.mo4577k1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41044a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.visa_concierge.c$h */
    static final class C14651h extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ C14643c f42598d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14651h(C14643c cVar) {
            super(2);
            this.f42598d = cVar;
        }

        /* renamed from: a */
        public final void mo41045a(Throwable th, C41238w wVar) {
            C41536l.m120489i(th, "<anonymous parameter 0>");
            C14643c cVar = this.f42598d;
            String string = cVar.getString(C10328q.f28955d2);
            C41536l.m120488h(string, "getString(ge.bog.mobileb…mon_text_operation_error)");
            C12910e.m48792j(cVar, string, (C12902d.C12905b) null, false, 6, (Object) null);
            FragmentManager childFragmentManager = this.f42598d.getChildFragmentManager();
            C41536l.m120488h(childFragmentManager, "childFragmentManager");
            C27113k e0 = C32343x.m95443e0(childFragmentManager, (String) null, 1, (Object) null);
            if (e0 != null) {
                e0.mo4577k1();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo41045a((Throwable) obj, (C41238w) obj2);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.visa_concierge.c$i */
    static final class C14652i implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f42599a;

        C14652i(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f42599a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f42599a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f42599a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.visa_concierge.c$j */
    public static final class C14653j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f42600d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14653j(Fragment fragment) {
            super(0);
            this.f42600d = fragment;
        }

        public final Fragment invoke() {
            return this.f42600d;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.visa_concierge.c$k */
    public static final class C14654k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f42601d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14654k(C43064a aVar) {
            super(0);
            this.f42601d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f42601d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.visa_concierge.c$l */
    public static final class C14655l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f42602d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14655l(C41217g gVar) {
            super(0);
            this.f42602d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f42602d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.visa_concierge.c$m */
    public static final class C14656m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f42603d;

        /* renamed from: e */
        final /* synthetic */ C41217g f42604e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14656m(C43064a aVar, C41217g gVar) {
            super(0);
            this.f42603d = aVar;
            this.f42604e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f42603d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f42604e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.visa_concierge.c$n */
    public static final class C14657n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f42605d;

        /* renamed from: e */
        final /* synthetic */ C41217g f42606e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14657n(Fragment fragment, C41217g gVar) {
            super(0);
            this.f42605d = fragment;
            this.f42606e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f42606e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f42605d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.visa_concierge.c$o */
    static final class C14658o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C14643c f42607d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14658o(C14643c cVar) {
            super(0);
            this.f42607d = cVar;
        }

        /* renamed from: b */
        public final C16883a invoke() {
            Bundle arguments = this.f42607d.getArguments();
            return (C16883a) (arguments != null ? arguments.getSerializable("EXTRA_STATUS") : null);
        }
    }

    static {
        C16883a aVar = C16883a.D;
        C16883a aVar2 = C16883a.N;
        f42589O = C41341q.m119910m(aVar, aVar2, null);
        f42590P = C41341q.m119910m(aVar, C16883a.A, C16883a.P, C16883a.S, aVar2, null);
    }

    public C14643c() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C14654k(new C14653j(this)));
        this.f42593M = C1514j0.m5374c(this, C41520a0.m120436b(VisaConciergeViewModel$ViewModel.class), new C14655l(a), new C14656m((C43064a) null, a), new C14657n(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: A2 */
    public static final void m53959A2(C14643c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        Context requireContext = cVar.requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        C38122f c = C38125h.m112238c(requireContext);
        Context requireContext2 = cVar.requireContext();
        C41536l.m120488h(requireContext2, "requireContext()");
        c.mo91631t0(requireContext2);
        cVar.requireActivity().finish();
    }

    /* renamed from: B2 */
    private final void m53960B2() {
        C13310d dVar = new C13310d();
        dVar.mo35647a2(C13310d.C13312b.TITLE_CLOSE_TWO_BUTTON);
        dVar.mo35648c2(C32343x.m95388F("my.package.page.VISA.consierge.deactivate.header", new Object[0]));
        dVar.mo35639Q1(C32343x.m95388F("my.package.page.VISA.consierge.deactivate.explanatory", new Object[0]));
        dVar.mo35646Z1(C32343x.m95388F("my.package.page.VISA.consierge.deactivate.primary.button", new Object[0]));
        dVar.mo35642U1(C32343x.m95388F("my.package.page.VISA.consierge.deactivate.secondary.button", new Object[0]));
        dVar.mo35645Y1(new C16314f(this, dVar));
        dVar.mo35641T1(new C16315g(dVar));
        dVar.mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public static final void m53961C2(C14643c cVar, C13310d dVar, Button button) {
        C41536l.m120489i(cVar, "this$0");
        C41536l.m120489i(dVar, "$this_apply");
        C41536l.m120489i(button, "it");
        cVar.m53977s2().mo41027iw().mo41026R5(false);
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: D2 */
    public static final void m53962D2(C13310d dVar, Button button) {
        C41536l.m120489i(dVar, "$this_apply");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public final C12744g m53975q2() {
        C12744g gVar = this.f42591K;
        C41536l.m120486f(gVar);
        return gVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public final C16883a m53976r2() {
        return (C16883a) this.f42592L.getValue();
    }

    /* renamed from: s2 */
    private final VisaConciergeViewModel$ViewModel m53977s2() {
        return (VisaConciergeViewModel$ViewModel) this.f42593M.getValue();
    }

    /* renamed from: t2 */
    private final void m53978t2() {
        C16318j jw = m53977s2().mo41028jw();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        jw.mo41029k().mo4819k(viewLifecycleOwner, new C14652i(new C14645b(this)));
        jw.mo41030li().mo4819k(viewLifecycleOwner, new C14652i(new C14646c(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public final void m53979u2(C31128a aVar) {
        C31132b.m92648j(aVar, (int[]) null, new C14647d(this), 1, (Object) null);
        C31132b.m92646h(aVar, (int[]) null, new C14648e(this), 1, (Object) null);
        C31132b.m92644f(aVar, (int[]) null, new C14649f(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public final void m53980v2(C31128a aVar) {
        C31132b.m92648j(aVar, (int[]) null, new C14650g(this), 1, (Object) null);
        C31132b.m92644f(aVar, (int[]) null, new C14651h(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public final void m53981w2(String str) {
        C27113k.C27114a aVar = C27113k.f68083P;
        String F = C32343x.m95388F("my.package.page.VISA.consierge.precontract.page.header", new Object[0]);
        C27113k c = C27113k.C27114a.m84066c(aVar, str, false, C32343x.m95388F("my.package.page.VISA.consierge.precontract.page.button", new Object[0]), (ArrayList) null, (Summary) null, F, 24, (Object) null);
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        c.mo4576A1(childFragmentManager, (String) null);
    }

    /* renamed from: x2 */
    private final Object m53982x2() {
        C12744g q2 = m53975q2();
        C16883a r2 = m53976r2();
        if (f42589O.contains(r2)) {
            mo26370a2(C32343x.m95388F("my.package.page.VISA.consierge.status.D.main.header", new Object[0]));
            Button button = q2.f37726e;
            button.setButtonText(C32343x.m95388F("my.package.page.VISA.consierge.status.D.activate.button", new Object[0]));
            button.setOnClickListener(new C16311c(this));
            PageDescriptionView pageDescriptionView = q2.f37729h;
            pageDescriptionView.setTitle(C32343x.m95388F("my.package.page.VISA.consierge.status.D.terms.header", new Object[0]));
            pageDescriptionView.setDrawableSrc(Integer.valueOf(C10112d.img_visa_cons_hand));
            pageDescriptionView.setText(C32343x.m95388F("my.package.page.VISA.consierge.status.D.terms.1", new Object[0]) + " \n  \n " + C32343x.m95388F("my.package.page.VISA.consierge.status.D.terms.2", new Object[0]) + " \n \n " + C32343x.m95388F("my.package.page.VISA.consierge.status.D.terms.3", new Object[0]));
            C41536l.m120488h(pageDescriptionView, "{\n                title …          }\n            }");
            return pageDescriptionView;
        } else if (r2 == C16883a.A) {
            mo26370a2(C32343x.m95388F("my.package.page.VISA.consierge.A.ASheet.header", new Object[0]));
            PageDescriptionView pageDescriptionView2 = q2.f37729h;
            pageDescriptionView2.setDrawableSrc(Integer.valueOf(C10112d.f27917j));
            pageDescriptionView2.setDrawableTint(C18358g.m62729c(C10110b.f27905n));
            pageDescriptionView2.setTitle(C32343x.m95388F("my.package.page.VISA.consierge.A.ASheet.main", new Object[0]));
            pageDescriptionView2.setText(C32343x.m95388F("my.package.page.VISA.consierge.A.ASheet.explanatory", new Object[0]));
            Button button2 = q2.f37726e;
            C41536l.m120488h(button2, "actionButton");
            C32343x.m95455i0(button2);
            Button button3 = q2.f37727f;
            C41536l.m120488h(button3, "setUpView$lambda$11$lambda$6");
            C32343x.m95447f1(button3);
            button3.setButtonText(C32343x.m95388F("my.package.page.VISA.consierge.A.ASheet.button.labe", new Object[0]));
            button3.setOnClickListener(new C16312d(this));
            C41536l.m120488h(button3, "{\n                title …          }\n            }");
            return button3;
        } else {
            boolean z = true;
            if (!(r2 == C16883a.S || r2 == C16883a.P)) {
                z = false;
            }
            if (z) {
                mo26370a2(C32343x.m95388F("my.package.page.VISA.consierge.status.P.main.header", new Object[0]));
                Button button4 = q2.f37726e;
                button4.setButtonText(C32343x.m95388F("my.package.page.VISA.consierge.status.P.order.button", new Object[0]));
                button4.setOnClickListener(new C16313e(this));
                PageDescriptionView pageDescriptionView3 = q2.f37729h;
                pageDescriptionView3.setTitle(C32343x.m95388F("my.package.page.VISA.consierge.status.P.terms.header", new Object[0]));
                pageDescriptionView3.setDrawableSrc(Integer.valueOf(C10112d.img_visa_cons_hand));
                pageDescriptionView3.setText("  " + C32343x.m95388F("my.package.page.VISA.consierge.status.P.terms.1", new Object[0]) + " \n  \n " + C32343x.m95388F("my.package.page.VISA.consierge.status.P.terms.2", new Object[0]) + " \n \n " + C32343x.m95388F("my.package.page.VISA.consierge.status.P.terms.3", new Object[0]) + " ");
                InlineFeedback inlineFeedback = q2.f37731j;
                C41536l.m120488h(inlineFeedback, "setUpView$lambda$11$lambda$10");
                C32343x.m95447f1(inlineFeedback);
                inlineFeedback.setTitleText(C32343x.m95388F("my.package.page.VISA.consierge.status.P.explanatory.header", new Object[0]));
                inlineFeedback.setCaptionText(C32343x.m95388F("my.package.page.VISA.consierge.status.P.explanatory", new Object[0]));
                C41536l.m120488h(inlineFeedback, "{\n                title …          }\n            }");
                return inlineFeedback;
            }
            mo4577k1();
            return C41238w.f97225a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y2 */
    public static final void m53983y2(C14643c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        cVar.m53977s2().mo41027iw().mo41026R5(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public static final void m53984z2(C14643c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        cVar.m53960B2();
    }

    /* renamed from: C */
    public void mo39136C() {
        m53975q2().f37726e.setLoading(false);
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f42591K = C12744g.m48370d(layoutInflater, viewGroup, true);
    }

    /* renamed from: m */
    public void mo39137m() {
        m53977s2().mo41027iw().mo41031ys();
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        C27113k e0 = C32343x.m95443e0(childFragmentManager, (String) null, 1, (Object) null);
        if (e0 != null) {
            e0.mo66414v2(true);
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f42591K = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m53978t2();
        m53982x2();
    }
}
