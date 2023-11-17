package p634um;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import b41.C31132b;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.mobilebank.cardapplications.presentation.model.C14235a;
import p341ge.bog.mobilebank.cleanarch.cardinsurance.presentation.model.DebitCardInsuranceTypeUiModel;
import p412en.C12550j3;
import p412en.C12657s2;
import p481jm.C16238q;
import p621tm.C18008j;
import p674xm.C18833r;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: um.p */
public final class C18240p extends C18187b {

    /* renamed from: j */
    public static final C18241a f51558j = new C18241a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C16238q f51559g;

    /* renamed from: h */
    private final C41217g f51560h = C1514j0.m5374c(this, C41520a0.m120436b(C12550j3.class), new C18249h(this), new C18250i((C43064a) null, this), new C18251j(this));

    /* renamed from: i */
    private final C41217g f51561i = C41219i.m119470b(C18246e.f51563d);

    /* renamed from: um.p$a */
    public static final class C18241a {
        private C18241a() {
        }

        public /* synthetic */ C18241a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C18240p mo45894a() {
            return new C18240p();
        }
    }

    /* renamed from: um.p$b */
    static final class C18242b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C18240p f51562d;

        /* renamed from: um.p$b$a */
        /* synthetic */ class C18243a extends C41535k implements C43075l {
            C18243a(Object obj) {
                super(1, obj, C18240p.class, "onResourcesReady", "onResourcesReady(Lge/bog/mobilebank/cardapplications/presentation/model/OrderDebitCardResourcesUiModel;)V", 0);
            }

            /* renamed from: b */
            public final void mo45896b(C14235a aVar) {
                C41536l.m120489i(aVar, "p0");
                ((C18240p) this.receiver).m62442x1(aVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo45896b((C14235a) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18242b(C18240p pVar) {
            super(1);
            this.f51562d = pVar;
        }

        /* renamed from: a */
        public final void mo45895a(C31128a aVar) {
            C41536l.m120488h(aVar, "it");
            C31132b.m92648j(aVar, (int[]) null, new C18243a(this.f51562d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45895a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: um.p$c */
    /* synthetic */ class C18244c extends C41535k implements C43075l {
        C18244c(Object obj) {
            super(1, obj, C18240p.class, "fillInsurance", "fillInsurance(Lge/bog/mobilebank/cardapplications/presentation/model/OrderDebitCardInput;)V", 0);
        }

        /* renamed from: b */
        public final void mo45897b(C18833r rVar) {
            C41536l.m120489i(rVar, "p0");
            ((C18240p) this.receiver).m62437r1(rVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45897b((C18833r) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: um.p$d */
    /* synthetic */ class C18245d extends C41535k implements C43075l {
        C18245d(Object obj) {
            super(1, obj, C18240p.class, "onCardFees", "onCardFees(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo45898b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C18240p) this.receiver).m62441v1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45898b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: um.p$e */
    static final class C18246e extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C18246e f51563d = new C18246e();

        C18246e() {
            super(0);
        }

        /* renamed from: b */
        public final C18008j invoke() {
            return new C18008j();
        }
    }

    /* renamed from: um.p$f */
    static final class C18247f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C18240p f51564d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18247f(C18240p pVar) {
            super(1);
            this.f51564d = pVar;
        }

        /* renamed from: a */
        public final void mo45900a(List list) {
            C41536l.m120489i(list, "fees");
            LayerView layerView = this.f51564d.m62438s1().f45966m;
            C41536l.m120488h(layerView, "binding.summaryContainer");
            C32343x.m95483r1(layerView, !list.isEmpty(), false, 2, (Object) null);
            this.f51564d.m62439t1().mo6029i(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45900a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: um.p$g */
    static final class C18248g implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f51565a;

        C18248g(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f51565a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f51565a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f51565a.invoke(obj);
        }
    }

    /* renamed from: um.p$h */
    public static final class C18249h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f51566d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18249h(Fragment fragment) {
            super(0);
            this.f51566d = fragment;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f51566d.requireActivity().getViewModelStore();
            C41536l.m120488h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: um.p$i */
    public static final class C18250i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f51567d;

        /* renamed from: e */
        final /* synthetic */ Fragment f51568e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18250i(C43064a aVar, Fragment fragment) {
            super(0);
            this.f51567d = aVar;
            this.f51568e = fragment;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f51567d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f51568e.requireActivity().getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: um.p$j */
    public static final class C18251j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f51569d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18251j(Fragment fragment) {
            super(0);
            this.f51569d = fragment;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f51569d.requireActivity().getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: o1 */
    private final void m62434o1() {
        m62438s1().f45965l.setOnClickListener(new C18239o(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public static final void m62435p1(C18240p pVar, View view) {
        C41536l.m120489i(pVar, "this$0");
        pVar.m62440u1().mo33224px().mo33193Jp();
    }

    /* renamed from: q1 */
    private final void m62436q1() {
        C12657s2 sx = m62440u1().mo33229sx();
        sx.mo33201X9().mo4819k(getViewLifecycleOwner(), new C18248g(new C18242b(this)));
        sx.mo33197Rv().mo4819k(getViewLifecycleOwner(), new C18248g(new C18244c(this)));
        sx.mo33239y0().mo4819k(getViewLifecycleOwner(), new C18248g(new C18245d(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public final void m62437r1(C18833r rVar) {
        String str;
        String b;
        Input input = m62438s1().f45965l;
        DebitCardInsuranceTypeUiModel e = rVar.mo46770i().mo46669a();
        if (e == null || (b = e.mo49681b()) == null || (str = C32343x.m95388F(b, new Object[0])) == null) {
            str = "";
        }
        input.setInputText(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public final C16238q m62438s1() {
        C16238q qVar = this.f51559g;
        C41536l.m120486f(qVar);
        return qVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public final C18008j m62439t1() {
        return (C18008j) this.f51561i.getValue();
    }

    /* renamed from: u1 */
    private final C12550j3 m62440u1() {
        return (C12550j3) this.f51560h.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public final void m62441v1(C31128a aVar) {
        C31132b.m92648j(aVar, (int[]) null, new C18247f(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public final void m62442x1(C14235a aVar) {
        LayerView layerView = m62438s1().f45964k;
        C41536l.m120488h(layerView, "binding.inputContainer");
        C32343x.m95483r1(layerView, !aVar.mo39890j().mo39956a().isEmpty(), false, 2, (Object) null);
    }

    /* renamed from: y1 */
    private final void m62443y1() {
        m62438s1().f45959f.setTitle(C32343x.m95388F("card.applications.insurance.title", new Object[0]));
        m62438s1().f45958e.setText(C32343x.m95388F("card.applications.insurance.description", new Object[0]));
        m62438s1().f45965l.setHintText((CharSequence) C32343x.m95388F("card.applications.choose.insurance", new Object[0]));
        m62438s1().f45961h.setAdapter(m62439t1());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f51559g = C16238q.m57888d(layoutInflater, viewGroup, false);
        ScrollView c = m62438s1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f51559g = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m62443y1();
        m62436q1();
        m62434o1();
    }
}
