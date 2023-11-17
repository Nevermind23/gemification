package wm0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import g91.C32319m;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41233s;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import om0.C27055f;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.mobilebank.cleanarch.junior.presentation.JuniorRequestDataUiModel;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p341ge.bog.mobilebank.p975ui.views.widgets.BigDividerView;
import ue1.C43064a;
import ue1.C43075l;
import zm0.C30372r;

/* renamed from: wm0.q */
public final class C29548q extends C35651n1 {

    /* renamed from: g */
    public static final C29549a f74658g = new C29549a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C27055f f74659d;

    /* renamed from: e */
    private final C41217g f74660e = C41219i.m119470b(new C29551c(this));

    /* renamed from: f */
    private final C41217g f74661f = C1514j0.m5374c(this, C41520a0.m120436b(C30372r.class), new C29553e(this), new C29554f((C43064a) null, this), new C29555g(this));

    /* renamed from: wm0.q$a */
    public static final class C29549a {
        private C29549a() {
        }

        public /* synthetic */ C29549a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C29548q mo69398a(String str) {
            C29548q qVar = new C29548q();
            qVar.setArguments(C0908e.m3336b(C41233s.m119492a("ARG_PHONE", str)));
            return qVar;
        }
    }

    /* renamed from: wm0.q$b */
    /* synthetic */ class C29550b extends C41535k implements C43075l {
        C29550b(Object obj) {
            super(1, obj, C29548q.class, "fillRequestData", "fillRequestData(Lge/bog/mobilebank/cleanarch/junior/presentation/JuniorRequestDataUiModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo69399b(JuniorRequestDataUiModel juniorRequestDataUiModel) {
            ((C29548q) this.receiver).m89731l1(juniorRequestDataUiModel);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69399b((JuniorRequestDataUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wm0.q$c */
    static final class C29551c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C29548q f74662d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29551c(C29548q qVar) {
            super(0);
            this.f74662d = qVar;
        }

        public final String invoke() {
            Bundle arguments = this.f74662d.getArguments();
            if (arguments != null) {
                return arguments.getString("ARG_PHONE");
            }
            return null;
        }
    }

    /* renamed from: wm0.q$d */
    static final class C29552d implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f74663a;

        C29552d(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f74663a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f74663a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f74663a.invoke(obj);
        }
    }

    /* renamed from: wm0.q$e */
    public static final class C29553e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f74664d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29553e(Fragment fragment) {
            super(0);
            this.f74664d = fragment;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f74664d.requireActivity().getViewModelStore();
            C41536l.m120488h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: wm0.q$f */
    public static final class C29554f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f74665d;

        /* renamed from: e */
        final /* synthetic */ Fragment f74666e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29554f(C43064a aVar, Fragment fragment) {
            super(0);
            this.f74665d = aVar;
            this.f74666e = fragment;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f74665d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f74666e.requireActivity().getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: wm0.q$g */
    public static final class C29555g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f74667d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29555g(Fragment fragment) {
            super(0);
            this.f74667d = fragment;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f74667d.requireActivity().getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: k1 */
    private final void m89730k1() {
        m89734o1().mo70730Ew().mo70717hq().mo4819k(getViewLifecycleOwner(), new C29552d(new C29550b(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: l1 */
    public final void m89731l1(JuniorRequestDataUiModel juniorRequestDataUiModel) {
        long j;
        if (m89733n1() != null) {
            TwoLineTextItem twoLineTextItem = m89732m1().f67964h;
            C41536l.m120488h(twoLineTextItem, "binding.idNumber");
            C32343x.m95455i0(twoLineTextItem);
            BigDividerView bigDividerView = m89732m1().f67965i;
            C41536l.m120488h(bigDividerView, "binding.idNumberDivider");
            C32343x.m95455i0(bigDividerView);
            TwoLineTextItem twoLineTextItem2 = m89732m1().f67967k;
            C41536l.m120486f(juniorRequestDataUiModel);
            String d = juniorRequestDataUiModel.mo52341d();
            String e = juniorRequestDataUiModel.mo52343e();
            twoLineTextItem2.setText(d + " " + e);
            m89732m1().f67961e.setText(m89733n1());
            return;
        }
        TwoLineTextItem twoLineTextItem3 = m89732m1().f67964h;
        C41536l.m120488h(twoLineTextItem3, "binding.idNumber");
        C32343x.m95447f1(twoLineTextItem3);
        BigDividerView bigDividerView2 = m89732m1().f67965i;
        C41536l.m120488h(bigDividerView2, "binding.idNumberDivider");
        C32343x.m95447f1(bigDividerView2);
        TwoLineTextItem twoLineTextItem4 = m89732m1().f67967k;
        C41536l.m120486f(juniorRequestDataUiModel);
        String d2 = juniorRequestDataUiModel.mo52341d();
        String e2 = juniorRequestDataUiModel.mo52343e();
        twoLineTextItem4.setText(d2 + " " + e2);
        m89732m1().f67964h.setText(String.valueOf(juniorRequestDataUiModel.mo52346g()));
        TwoLineTextItem twoLineTextItem5 = m89732m1().f67961e;
        Long a = juniorRequestDataUiModel.mo52339a();
        if (a != null) {
            j = a.longValue();
        } else {
            j = 0;
        }
        twoLineTextItem5.setText(C32319m.m95300g(j, getContext()));
    }

    /* renamed from: m1 */
    private final C27055f m89732m1() {
        C27055f fVar = this.f74659d;
        C41536l.m120486f(fVar);
        return fVar;
    }

    /* renamed from: n1 */
    private final String m89733n1() {
        return (String) this.f74660e.getValue();
    }

    /* renamed from: o1 */
    private final C30372r m89734o1() {
        return (C30372r) this.f74661f.getValue();
    }

    /* renamed from: p1 */
    private final void m89735p1() {
        m89732m1().f67963g.setOnClickListener(new C29547p(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public static final void m89736q1(C29548q qVar, View view) {
        C41536l.m120489i(qVar, "this$0");
        qVar.requireActivity().finish();
    }

    /* renamed from: r1 */
    private final void m89737r1() {
        if (m89733n1() != null) {
            m89732m1().f67961e.setTitle(C32343x.m95388F("child.financial.number.success.page.phone", new Object[0]));
            m89732m1().f67968l.setTitleText(C32343x.m95388F("child.financial.number.success.page.message", new Object[0]));
            Button button = m89732m1().f67963g;
            C41536l.m120488h(button, "binding.homeButton");
            C32343x.m95455i0(button);
            m89732m1().f67967k.setTitle(C32343x.m95388F("text.junior.activation.success.page.child.name", new Object[0]));
            m89732m1().f67962f.setTitle(C32343x.m95388F("child.financial.number.success.page.info", new Object[0]));
            return;
        }
        Button button2 = m89732m1().f67963g;
        C41536l.m120488h(button2, "binding.homeButton");
        C32343x.m95447f1(button2);
        m89732m1().f67968l.setTitleText(C32343x.m95388F("text.junior.activation.success.page.message", new Object[0]));
        m89732m1().f67962f.setTitle(C32343x.m95388F("text.junior.activation.success.page.info", new Object[0]));
        m89732m1().f67967k.setTitle(C32343x.m95388F("text.junior.activation.success.page.child.name", new Object[0]));
        m89732m1().f67961e.setTitle(C32343x.m95388F("text.junior.activation.success.page.birth.date", new Object[0]));
        m89732m1().f67964h.setTitle(C32343x.m95388F("text.junior.activation.success.page.pin", new Object[0]));
        m89732m1().f67963g.setButtonText(C32343x.m95388F("text.junior.activation.success.page.button", new Object[0]));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f74659d = C27055f.m83895d(getLayoutInflater());
        NestedScrollView c = m89732m1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f74659d = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m89737r1();
        m89735p1();
        m89730k1();
    }
}
