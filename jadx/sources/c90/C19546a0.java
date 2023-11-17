package c90;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.C1533o;
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
import g90.C20783e;
import g91.C32343x;
import h80.C24894c;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
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
import o90.C26822i1;
import o90.C26836m1;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.biginput.BigInputView;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.chips.Chip;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.FormData;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p420fh.C12902d;
import p420fh.C12910e;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: c90.a0 */
public final class C19546a0 extends C19606i {

    /* renamed from: N */
    public static final C19547a f53849N = new C19547a((DefaultConstructorMarker) null);

    /* renamed from: K */
    public C26836m1.C26840b f53850K;

    /* renamed from: L */
    private final C41217g f53851L;

    /* renamed from: M */
    private C24894c f53852M;

    /* renamed from: c90.a0$a */
    public static final class C19547a {
        private C19547a() {
        }

        public /* synthetic */ C19547a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C19546a0 mo47786a(FormData formData, String str) {
            C41536l.m120489i(formData, "formData");
            C19546a0 a0Var = new C19546a0();
            a0Var.setArguments(C0908e.m3336b(C41233s.m119492a("EXTRA_FORM_DATA", formData), C41233s.m119492a("EXTRA_MIN_AMOUNT", str)));
            return a0Var;
        }
    }

    /* renamed from: c90.a0$b */
    static final class C19548b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19546a0 f53853d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19548b(C19546a0 a0Var) {
            super(1);
            this.f53853d = a0Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m65173c(C19546a0 a0Var, Chip chip, int i) {
            C41536l.m120489i(a0Var, "this$0");
            C41536l.m120489i(chip, "chip");
            if (chip.isActivated()) {
                a0Var.m65161o2().mo66139lw().mo66123uh(i);
                a0Var.m65160n2().f63897e.setSuffix(a0Var.m65161o2().mo66139lw().mo66120Va());
            }
        }

        /* renamed from: b */
        public final void mo47787b(List list) {
            C41536l.m120489i(list, "currencies");
            CardView cardView = this.f53853d.m65160n2().f63901i;
            C41536l.m120488h(cardView, "binding.progressBar");
            C32343x.m95455i0(cardView);
            ChipGroup chipGroup = this.f53853d.m65160n2().f63899g;
            C19546a0 a0Var = this.f53853d;
            chipGroup.mo35190t();
            ArrayList<View> arrayList = new ArrayList<>(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C20783e eVar = (C20783e) it.next();
                Context context = chipGroup.getContext();
                C41536l.m120488h(context, "context");
                Chip chip = new Chip(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                chip.setChipTitle(C32343x.m95388F(eVar.mo49353a().mo52391a(), new Object[0]));
                chip.setActivated(eVar.mo49354b());
                arrayList.add(chip);
            }
            C41536l.m120488h(chipGroup, "this");
            for (View o : arrayList) {
                chipGroup.mo35183o(o);
            }
            chipGroup.setOnChipActivatedChangedListener(new C19564b0(a0Var));
            this.f53853d.m65160n2().f63897e.setSuffix(this.f53853d.m65161o2().mo66139lw().mo66120Va());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47787b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c90.a0$c */
    static final class C19549c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19546a0 f53854d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19549c(C19546a0 a0Var) {
            super(1);
            this.f53854d = a0Var;
        }

        /* renamed from: a */
        public final void mo47788a(List list) {
            CardView cardView = this.f53854d.m65160n2().f63901i;
            C41536l.m120488h(cardView, "binding.progressBar");
            C32343x.m95447f1(cardView);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47788a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c90.a0$d */
    static final class C19550d extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ C19546a0 f53855d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19550d(C19546a0 a0Var) {
            super(2);
            this.f53855d = a0Var;
        }

        /* renamed from: a */
        public final void mo47789a(Throwable th, List list) {
            C41536l.m120489i(th, "<anonymous parameter 0>");
            CardView cardView = this.f53855d.m65160n2().f63901i;
            C41536l.m120488h(cardView, "binding.progressBar");
            C32343x.m95455i0(cardView);
            CardView cardView2 = this.f53855d.m65160n2().f63903k;
            C41536l.m120488h(cardView2, "binding.retryButtonContainer");
            C32343x.m95447f1(cardView2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo47789a((Throwable) obj, (List) obj2);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c90.a0$e */
    /* synthetic */ class C19551e extends C41535k implements C43075l {
        C19551e(Object obj) {
            super(1, obj, C19546a0.class, "handleCurrenciesResult", "handleCurrenciesResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo47790b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C19546a0) this.receiver).m65162q2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47790b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c90.a0$f */
    /* synthetic */ class C19552f extends C41535k implements C43075l {
        C19552f(Object obj) {
            super(1, obj, Button.class, "setEnabled", "setEnabled(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo47791b(boolean z) {
            ((Button) this.receiver).setEnabled(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47791b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: c90.a0$g */
    /* synthetic */ class C19553g extends C41535k implements C43075l {
        C19553g(Object obj) {
            super(1, obj, C19546a0.class, "setFragmentResult", "setFragmentResult(Lge/bog/mobilebank/consumerloanapplication/presentation/model/addincomes/FormData;)V", 0);
        }

        /* renamed from: b */
        public final void mo47792b(FormData formData) {
            C41536l.m120489i(formData, "p0");
            ((C19546a0) this.receiver).m65167v2(formData);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47792b((FormData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c90.a0$h */
    static final class C19554h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19546a0 f53856d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19554h(C19546a0 a0Var) {
            super(1);
            this.f53856d = a0Var;
        }

        /* renamed from: a */
        public final void mo47793a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f53856d.m65168w2();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47793a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c90.a0$i */
    /* synthetic */ class C19555i extends C41535k implements C43075l {
        C19555i(Object obj) {
            super(1, obj, C19546a0.class, "setAmount", "setAmount(Ljava/lang/String;)V", 0);
        }

        /* renamed from: b */
        public final void mo47794b(String str) {
            C41536l.m120489i(str, "p0");
            ((C19546a0) this.receiver).m65166u2(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47794b((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: c90.a0$j */
    static final class C19556j implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f53857a;

        C19556j(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f53857a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f53857a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f53857a.invoke(obj);
        }
    }

    /* renamed from: c90.a0$k */
    public static final class C19557k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f53858d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19557k(Fragment fragment) {
            super(0);
            this.f53858d = fragment;
        }

        public final Fragment invoke() {
            return this.f53858d;
        }
    }

    /* renamed from: c90.a0$l */
    public static final class C19558l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f53859d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19558l(C43064a aVar) {
            super(0);
            this.f53859d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f53859d.invoke();
        }
    }

    /* renamed from: c90.a0$m */
    public static final class C19559m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f53860d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19559m(C41217g gVar) {
            super(0);
            this.f53860d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f53860d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: c90.a0$n */
    public static final class C19560n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f53861d;

        /* renamed from: e */
        final /* synthetic */ C41217g f53862e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19560n(C43064a aVar, C41217g gVar) {
            super(0);
            this.f53861d = aVar;
            this.f53862e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f53861d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f53862e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: c90.a0$o */
    static final class C19561o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C19546a0 f53863d;

        /* renamed from: c90.a0$o$a */
        static final class C19562a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C19546a0 f53864d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C19562a(C19546a0 a0Var) {
                super(0);
                this.f53864d = a0Var;
            }

            /* renamed from: b */
            public final C26836m1 invoke() {
                FormData formData;
                String str;
                C26836m1.C26840b p2 = this.f53864d.mo47785p2();
                Bundle arguments = this.f53864d.getArguments();
                if (arguments != null) {
                    formData = (FormData) arguments.getParcelable("EXTRA_FORM_DATA");
                } else {
                    formData = null;
                }
                C41536l.m120486f(formData);
                Bundle arguments2 = this.f53864d.getArguments();
                if (arguments2 == null || (str = arguments2.getString("EXTRA_MIN_AMOUNT")) == null) {
                    str = BankApiResponse.SUCCESSFUL_RESPONSE_CODE;
                }
                return p2.mo32792a(formData, str);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19561o(C19546a0 a0Var) {
            super(0);
            this.f53863d = a0Var;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C19562a(this.f53863d));
        }
    }

    public C19546a0() {
        C19561o oVar = new C19561o(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C19558l(new C19557k(this)));
        this.f53851L = C1514j0.m5374c(this, C41520a0.m120436b(C26836m1.class), new C19559m(a), new C19560n((C43064a) null, a), oVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public final C24894c m65160n2() {
        C24894c cVar = this.f53852M;
        C41536l.m120486f(cVar);
        return cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public final C26836m1 m65161o2() {
        return (C26836m1) this.f53851L.getValue();
    }

    private final void observeData() {
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C26822i1 ow = m65161o2().mo66142ow();
        ow.mo66128z().mo4819k(viewLifecycleOwner, new C19556j(new C19551e(this)));
        LiveData wk = ow.mo66127wk();
        Button button = m65160n2().f63904l;
        C41536l.m120488h(button, "binding.saveButton");
        wk.mo4819k(viewLifecycleOwner, new C19556j(new C19552f(button)));
        C37224b.m109963b(ow.mo66124Mt(), viewLifecycleOwner, new C19553g(this));
        C37224b.m109963b(ow.mo66126iq(), viewLifecycleOwner, new C19554h(this));
        C37224b.m109963b(ow.mo66125Qr(), viewLifecycleOwner, new C19555i(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public final void m65162q2(C31128a aVar) {
        C31132b.m92648j(aVar, (int[]) null, new C19548b(this), 1, (Object) null);
        C31132b.m92646h(aVar, (int[]) null, new C19549c(this), 1, (Object) null);
        C31132b.m92644f(aVar, (int[]) null, new C19550d(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public static final void m65163r2(C19546a0 a0Var, String str) {
        C41536l.m120489i(a0Var, "this$0");
        a0Var.m65161o2().mo66139lw().mo66121d(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public static final void m65164s2(C19546a0 a0Var, View view) {
        C41536l.m120489i(a0Var, "this$0");
        a0Var.m65161o2().mo66139lw().mo66122sg();
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public static final void m65165t2(C19546a0 a0Var, View view) {
        C41536l.m120489i(a0Var, "this$0");
        a0Var.m65161o2().onRefresh(6);
        CardView cardView = a0Var.m65160n2().f63903k;
        C41536l.m120488h(cardView, "binding.retryButtonContainer");
        C32343x.m95455i0(cardView);
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public final void m65166u2(String str) {
        m65160n2().f63897e.setText(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public final void m65167v2(FormData formData) {
        C1533o.m5445b(this, "EDIT_INCOME_REQUEST_KEY", C0908e.m3336b(C41233s.m119492a("EDIT_INCOME_RESPONSE_KEY", formData)));
        mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public final void m65168w2() {
        C12910e.m48792j(this, C32343x.m95388F("applications.CL.income.min.amount.validation.failed", new Object[0]), (C12902d.C12905b) null, false, 6, (Object) null);
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f53852M = C24894c.m79558d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f53852M = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        observeData();
        mo26370a2(C32343x.m95388F("CLA.edit.income.action.header", new Object[0]));
        C24894c n2 = m65160n2();
        n2.f63900h.setText(C32343x.m95388F("CLA.edit.income.action.explanatory.text", new Object[0]));
        BigInputView bigInputView = n2.f63897e;
        bigInputView.setInfoText(C32343x.m95388F("CLA.edit.income.action.amount.field", new Object[0]));
        bigInputView.setTextChangeListener(new C19666x(this));
        Button button = n2.f63904l;
        button.setButtonText(C32343x.m95388F("CLA.edit.income.action.save.button", new Object[0]));
        button.setOnClickListener(new C19667y(this));
        n2.f63902j.mo3946b().setOnClickListener(new C19668z(this));
    }

    /* renamed from: p2 */
    public final C26836m1.C26840b mo47785p2() {
        C26836m1.C26840b bVar = this.f53850K;
        if (bVar != null) {
            return bVar;
        }
        C41536l.m120506z("viewModelAssistedFactory");
        return null;
    }
}
