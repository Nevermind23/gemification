package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import g91.C32343x;
import gt0.C36077d;
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
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.CreatePiggyBankViewModel$ViewModel;
import p380ck.C10464h;
import ue1.C43064a;
import ue1.C43075l;
import vs0.C39455n;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.j */
public final class C33092j extends C33071g {

    /* renamed from: j */
    public static final C33093a f81001j = new C33093a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C39455n f81002g;

    /* renamed from: h */
    private final C41217g f81003h = C1514j0.m5374c(this, C41520a0.m120436b(CreatePiggyBankViewModel$ViewModel.class), new C33097e(this), new C33098f((C43064a) null, this), new C33099g(this));

    /* renamed from: i */
    private final C41217g f81004i = C41219i.m119470b(C33094b.f81005d);

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.j$a */
    public static final class C33093a {
        private C33093a() {
        }

        public /* synthetic */ C33093a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C33092j mo74973a() {
            return new C33092j();
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.j$b */
    static final class C33094b extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C33094b f81005d = new C33094b();

        C33094b() {
            super(0);
        }

        /* renamed from: b */
        public final C36077d invoke() {
            return new C36077d();
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.j$c */
    /* synthetic */ class C33095c extends C41535k implements C43075l {
        C33095c(Object obj) {
            super(1, obj, C36077d.class, "submitList", "submitList(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo74975b(List list) {
            ((C36077d) this.receiver).mo6029i(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74975b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.j$d */
    static final class C33096d implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f81006a;

        C33096d(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f81006a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f81006a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f81006a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.j$e */
    public static final class C33097e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f81007d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33097e(Fragment fragment) {
            super(0);
            this.f81007d = fragment;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f81007d.requireActivity().getViewModelStore();
            C41536l.m120488h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.j$f */
    public static final class C33098f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f81008d;

        /* renamed from: e */
        final /* synthetic */ Fragment f81009e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33098f(C43064a aVar, Fragment fragment) {
            super(0);
            this.f81008d = aVar;
            this.f81009e = fragment;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f81008d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f81009e.requireActivity().getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.j$g */
    public static final class C33099g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f81010d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33099g(Fragment fragment) {
            super(0);
            this.f81010d = fragment;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f81010d.requireActivity().getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: i1 */
    private final void m97495i1() {
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        m97498l1().mo75226Dw().mo75240yp().mo4819k(viewLifecycleOwner, new C33096d(new C33095c(m97496j1())));
    }

    /* renamed from: j1 */
    private final C36077d m97496j1() {
        return (C36077d) this.f81004i.getValue();
    }

    /* renamed from: k1 */
    private final C39455n m97497k1() {
        C39455n nVar = this.f81002g;
        C41536l.m120486f(nVar);
        return nVar;
    }

    /* renamed from: l1 */
    private final CreatePiggyBankViewModel$ViewModel m97498l1() {
        return (CreatePiggyBankViewModel$ViewModel) this.f81003h.getValue();
    }

    /* renamed from: m1 */
    private final void m97499m1() {
        m97497k1().f93831h.setText(C32343x.m95388F("cas.service.open.header", new Object[0]));
        m97497k1().f93832i.setAdapter(m97496j1());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f81002g = C39455n.m114676d(layoutInflater, viewGroup, false);
        C32343x.m95395I0(this, "piggy_bank", (String) null, "piggy_bank_intro_page", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
        m97499m1();
        m97495i1();
        ConstraintLayout c = m97497k1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f81002g = null;
    }
}
