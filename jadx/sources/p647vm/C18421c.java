package p647vm;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.C0173b;
import androidx.appcompat.app.C0214c;
import androidx.core.p016os.C0908e;
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
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l41.C37071a;
import m41.C37224b;
import o31.C37588a0;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData;
import p341ge.bog.mobilebank.cardapplications.presentation.model.expiringcard.ExpiringCardPopUpUiModel;
import p341ge.bog.mobilebank.cleanarch.mainactivity.model.ExpiringCardPopUpData;
import p411em.C12487d;
import p412en.C12612q1;
import p412en.C12656s1;
import p412en.C12676w1;
import p481jm.C16236o;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: vm.c */
public final class C18421c extends C18439f {

    /* renamed from: D */
    public static final C18422a f51875D = new C18422a((DefaultConstructorMarker) null);

    /* renamed from: A */
    private final C41217g f51876A;

    /* renamed from: B */
    private C16236o f51877B;

    /* renamed from: C */
    public C37071a f51878C;

    /* renamed from: y */
    private final C41217g f51879y = C41219i.m119470b(new C18426e(this));

    /* renamed from: z */
    public C12612q1 f51880z;

    /* renamed from: vm.c$a */
    public static final class C18422a {
        private C18422a() {
        }

        public /* synthetic */ C18422a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C18421c mo46213a(ExpiringCardPopUpData expiringCardPopUpData) {
            C41536l.m120489i(expiringCardPopUpData, "data");
            C18421c cVar = new C18421c();
            cVar.setArguments(C0908e.m3336b(C41233s.m119492a("ARG_DATA", expiringCardPopUpData)));
            return cVar;
        }
    }

    /* renamed from: vm.c$b */
    /* synthetic */ class C18423b extends C41535k implements C43075l {
        C18423b(Object obj) {
            super(1, obj, C18421c.class, "fillData", "fillData(Lge/bog/mobilebank/cardapplications/presentation/model/expiringcard/ExpiringCardPopUpUiModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo46214b(ExpiringCardPopUpUiModel expiringCardPopUpUiModel) {
            C41536l.m120489i(expiringCardPopUpUiModel, "p0");
            ((C18421c) this.receiver).m62848J1(expiringCardPopUpUiModel);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo46214b((ExpiringCardPopUpUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: vm.c$c */
    /* synthetic */ class C18424c extends C41535k implements C43075l {
        C18424c(Object obj) {
            super(1, obj, C18421c.class, "openRecoverCard", "openRecoverCard(Lge/bog/mobilebank/cardapplications/presentation/model/CardApplicationTypeData$RecoverCardOrderData;)V", 0);
        }

        /* renamed from: b */
        public final void mo46215b(CardApplicationTypeData.RecoverCardOrderData recoverCardOrderData) {
            C41536l.m120489i(recoverCardOrderData, "p0");
            ((C18421c) this.receiver).m62854R1(recoverCardOrderData);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo46215b((CardApplicationTypeData.RecoverCardOrderData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: vm.c$d */
    /* synthetic */ class C18425d extends C41535k implements C43075l {
        C18425d(Object obj) {
            super(1, obj, C18421c.class, "onOrderDataResult", "onOrderDataResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo46216b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C18421c) this.receiver).m62852P1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo46216b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: vm.c$e */
    static final class C18426e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C18421c f51881d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18426e(C18421c cVar) {
            super(0);
            this.f51881d = cVar;
        }

        /* renamed from: b */
        public final ExpiringCardPopUpData invoke() {
            ExpiringCardPopUpData expiringCardPopUpData;
            Bundle arguments = this.f51881d.getArguments();
            if (arguments != null) {
                expiringCardPopUpData = (ExpiringCardPopUpData) arguments.getParcelable("ARG_DATA");
            } else {
                expiringCardPopUpData = null;
            }
            if (expiringCardPopUpData == null) {
                return new ExpiringCardPopUpData(0, "", C12487d.f37160a, (String) null, false, 16, (DefaultConstructorMarker) null);
            }
            return expiringCardPopUpData;
        }
    }

    /* renamed from: vm.c$f */
    static final class C18427f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C18421c f51882d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18427f(C18421c cVar) {
            super(1);
            this.f51882d = cVar;
        }

        /* renamed from: a */
        public final void mo46218a(C41238w wVar) {
            C18421c.m62853Q1(this.f51882d, true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo46218a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: vm.c$g */
    static final class C18428g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C18421c f51883d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18428g(C18421c cVar) {
            super(1);
            this.f51883d = cVar;
        }

        /* renamed from: a */
        public final void mo46219a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C18421c.m62853Q1(this.f51883d, false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo46219a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: vm.c$h */
    static final class C18429h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C18421c f51884d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18429h(C18421c cVar) {
            super(1);
            this.f51884d = cVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            C18421c.m62853Q1(this.f51884d, false);
            this.f51884d.mo46211M1().mo48350a(th);
        }
    }

    /* renamed from: vm.c$i */
    static final class C18430i implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f51885a;

        C18430i(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f51885a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f51885a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f51885a.invoke(obj);
        }
    }

    /* renamed from: vm.c$j */
    public static final class C18431j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f51886d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18431j(Fragment fragment) {
            super(0);
            this.f51886d = fragment;
        }

        public final Fragment invoke() {
            return this.f51886d;
        }
    }

    /* renamed from: vm.c$k */
    public static final class C18432k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f51887d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18432k(C43064a aVar) {
            super(0);
            this.f51887d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f51887d.invoke();
        }
    }

    /* renamed from: vm.c$l */
    public static final class C18433l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f51888d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18433l(C41217g gVar) {
            super(0);
            this.f51888d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f51888d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: vm.c$m */
    public static final class C18434m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f51889d;

        /* renamed from: e */
        final /* synthetic */ C41217g f51890e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18434m(C43064a aVar, C41217g gVar) {
            super(0);
            this.f51889d = aVar;
            this.f51890e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f51889d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f51890e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: vm.c$n */
    static final class C18435n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C18421c f51891d;

        /* renamed from: vm.c$n$a */
        static final class C18436a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C18421c f51892d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C18436a(C18421c cVar) {
                super(0);
                this.f51892d = cVar;
            }

            /* renamed from: b */
            public final C12676w1 invoke() {
                return this.f51892d.mo46212N1().mo32835a(this.f51892d.m62850L1());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18435n(C18421c cVar) {
            super(0);
            this.f51891d = cVar;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C18436a(this.f51891d));
        }
    }

    public C18421c() {
        C18435n nVar = new C18435n(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C18432k(new C18431j(this)));
        this.f51876A = C1514j0.m5374c(this, C41520a0.m120436b(C12676w1.class), new C18433l(a), new C18434m((C43064a) null, a), nVar);
    }

    /* renamed from: I1 */
    private final void m62847I1() {
        C12656s1 mw = m62851O1().mo33340mw();
        mw.mo33333ta().mo4819k(getViewLifecycleOwner(), new C18430i(new C18423b(this)));
        LiveData jj = mw.mo33332jj();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(jj, viewLifecycleOwner, new C18424c(this));
        mw.mo33331Ib().mo4819k(getViewLifecycleOwner(), new C18430i(new C18425d(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: J1 */
    public final void m62848J1(ExpiringCardPopUpUiModel expiringCardPopUpUiModel) {
        String str;
        m62849K1().f45931f.setTitle(expiringCardPopUpUiModel.mo39928e());
        PageDescriptionView pageDescriptionView = m62849K1().f45931f;
        if (expiringCardPopUpUiModel.mo39924a() > 0) {
            str = C32343x.m95388F("expired.card.popup.message", Integer.valueOf(expiringCardPopUpUiModel.mo39924a()));
        } else {
            str = C32343x.m95388F("expiring.card.popup.message.today", new Object[0]);
        }
        pageDescriptionView.setText(str);
        if (expiringCardPopUpUiModel.mo39925b() != null) {
            m62849K1().f45931f.setImageUrl(expiringCardPopUpUiModel.mo39925b());
        } else {
            m62849K1().f45931f.setDrawableSrc(Integer.valueOf(expiringCardPopUpUiModel.mo39926d()));
        }
    }

    /* renamed from: K1 */
    private final C16236o m62849K1() {
        C16236o oVar = this.f51877B;
        C41536l.m120486f(oVar);
        return oVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: L1 */
    public final ExpiringCardPopUpData m62850L1() {
        return (ExpiringCardPopUpData) this.f51879y.getValue();
    }

    /* renamed from: O1 */
    private final C12676w1 m62851O1() {
        return (C12676w1) this.f51876A.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: P1 */
    public final void m62852P1(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C18427f(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C18428g(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C18429h(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q1 */
    public static final void m62853Q1(C18421c cVar, boolean z) {
        cVar.m62849K1().f45934i.setLoading(z);
        cVar.m62849K1().f45930e.setEnabled(!z);
    }

    /* access modifiers changed from: private */
    /* renamed from: R1 */
    public final void m62854R1(CardApplicationTypeData.RecoverCardOrderData recoverCardOrderData) {
        CardOrderListActivity.C13998a aVar = CardOrderListActivity.f41389O;
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        CardOrderListActivity.C13998a.m52073b(aVar, requireContext, recoverCardOrderData, (C0173b) null, (List) null, false, false, 60, (Object) null);
        mo4577k1();
    }

    /* renamed from: S1 */
    private final void m62855S1() {
        m62849K1().f45935j.setTitle(C32343x.m95388F("expired.card.popup.title", new Object[0]));
        m62849K1().f45930e.setButtonText(C32343x.m95388F("expired.card.popup.button.later", new Object[0]));
        m62849K1().f45934i.setButtonText(C32343x.m95388F("expired.card.popup.button.order", new Object[0]));
        m62849K1().f45930e.setOnClickListener(new C18419a(this));
        m62849K1().f45934i.setOnClickListener(new C18420b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public static final void m62856T1(C18421c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        cVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public static final void m62857U1(C18421c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        cVar.m62851O1().mo33337jw().mo33329fa();
    }

    /* renamed from: M1 */
    public final C37071a mo46211M1() {
        C37071a aVar = this.f51878C;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("errorHandler");
        return null;
    }

    /* renamed from: N1 */
    public final C12612q1 mo46212N1() {
        C12612q1 q1Var = this.f51880z;
        if (q1Var != null) {
            return q1Var;
        }
        C41536l.m120506z("factory");
        return null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        C41536l.m120489i(layoutInflater, "inflater");
        Dialog n1 = mo4579n1();
        if (!(n1 == null || (window = n1.getWindow()) == null)) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        LayerView c = m62849K1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C41536l.m120489i(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        m62851O1().mo33337jw().onDismiss();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m62847I1();
        m62855S1();
    }

    /* renamed from: q1 */
    public Dialog mo710q1(Bundle bundle) {
        C0214c.C0215a aVar = new C0214c.C0215a(requireContext());
        this.f51877B = C16236o.m57879d(LayoutInflater.from(requireContext()));
        aVar.setView((View) m62849K1().mo3946b());
        C0214c create = aVar.create();
        C41536l.m120488h(create, "builder.create()");
        return create;
    }
}
