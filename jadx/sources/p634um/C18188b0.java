package p634um;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ScrollView;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import com.google.android.material.datepicker.C5023l;
import g91.C32319m;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o21.C37586a;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.chips.Chip;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.mobilebank.cardapplications.presentation.actionsheet.AddressChooserActionSheet;
import p341ge.bog.mobilebank.cardapplications.presentation.model.AddressAdapterModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.C14235a;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardPinDeliveryTypeUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardReceiveTypeUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardRecipientTypeUiModel;
import p383cn.C10515c;
import p398dn.C12330d;
import p412en.C12550j3;
import p412en.C12651r2;
import p412en.C12657s2;
import p481jm.C16239r;
import p629uh.C18167d;
import p674xm.C18781a;
import p674xm.C18805i;
import p674xm.C18810l;
import p674xm.C18815q;
import p674xm.C18833r;
import p674xm.C18835s;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: um.b0 */
public final class C18188b0 extends C18209c {

    /* renamed from: l */
    public static final C18189a f51511l = new C18189a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f51512g;

    /* renamed from: h */
    private C16239r f51513h;

    /* renamed from: i */
    private final C41217g f51514i = C1514j0.m5374c(this, C41520a0.m120436b(C12550j3.class), new C18206q(this), new C18207r((C43064a) null, this), new C18208s(this));
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Chip f51515j;

    /* renamed from: k */
    private List f51516k;

    /* renamed from: um.b0$a */
    public static final class C18189a {
        private C18189a() {
        }

        public /* synthetic */ C18189a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C18188b0 mo45850a() {
            return new C18188b0();
        }
    }

    /* renamed from: um.b0$b */
    static final class C18190b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C18188b0 f51517d;

        /* renamed from: um.b0$b$a */
        /* synthetic */ class C18191a extends C41535k implements C43075l {
            C18191a(Object obj) {
                super(1, obj, C18188b0.class, "fillData", "fillData(Lge/bog/mobilebank/cardapplications/presentation/model/OrderDebitCardResourcesUiModel;)V", 0);
            }

            /* renamed from: b */
            public final void mo45852b(C14235a aVar) {
                C41536l.m120489i(aVar, "p0");
                ((C18188b0) this.receiver).m62298V1(aVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo45852b((C14235a) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18190b(C18188b0 b0Var) {
            super(1);
            this.f51517d = b0Var;
        }

        /* renamed from: a */
        public final void mo45851a(C31128a aVar) {
            C41536l.m120488h(aVar, "it");
            C31132b.m92648j(aVar, (int[]) null, new C18191a(this.f51517d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45851a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: um.b0$c */
    /* synthetic */ class C18192c extends C41535k implements C43075l {
        C18192c(Object obj) {
            super(1, obj, C18188b0.class, "onInputChange", "onInputChange(Lge/bog/mobilebank/cardapplications/presentation/model/OrderDebitCardInput;)V", 0);
        }

        /* renamed from: b */
        public final void mo45853b(C18833r rVar) {
            C41536l.m120489i(rVar, "p0");
            ((C18188b0) this.receiver).m62310h2(rVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45853b((C18833r) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: um.b0$d */
    /* synthetic */ class C18193d extends C41535k implements C43075l {
        C18193d(Object obj) {
            super(1, obj, C18188b0.class, "openServiceCenterActionSheet", "openServiceCenterActionSheet(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo45854b(List list) {
            C41536l.m120489i(list, "p0");
            ((C18188b0) this.receiver).m62320m2(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45854b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: um.b0$e */
    /* synthetic */ class C18194e extends C41535k implements C43075l {
        C18194e(Object obj) {
            super(1, obj, C18188b0.class, "openDeliveryAddressActionSheet", "openDeliveryAddressActionSheet(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo45855b(List list) {
            C41536l.m120489i(list, "p0");
            ((C18188b0) this.receiver).m62318l2(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45855b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: um.b0$f */
    /* synthetic */ class C18195f extends C41535k implements C43075l {
        C18195f(Object obj) {
            super(1, obj, C18188b0.class, "openDatePicker", "openDatePicker(Lge/bog/mobilebank/shared/common/presentation/DatePickerData;)V", 0);
        }

        /* renamed from: b */
        public final void mo45856b(C37586a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C18188b0) this.receiver).m62314j2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45856b((C37586a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: um.b0$g */
    /* synthetic */ class C18196g extends C41535k implements C43075l {
        C18196g(Object obj) {
            super(1, obj, C18188b0.class, "onDeliveryFeesResult", "onDeliveryFeesResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo45857b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C18188b0) this.receiver).m62309g2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45857b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: um.b0$h */
    /* synthetic */ class C18197h extends C41535k implements C43075l {
        C18197h(Object obj) {
            super(1, obj, C18188b0.class, "setValidators", "setValidators(Lge/bog/mobilebank/cardapplications/presentation/model/OrderDebitCardInputValidators;)V", 0);
        }

        /* renamed from: b */
        public final void mo45858b(C18835s sVar) {
            C41536l.m120489i(sVar, "p0");
            ((C18188b0) this.receiver).m62326p2(sVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45858b((C18835s) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: um.b0$i */
    static final class C18198i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C18188b0 f51518d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18198i(C18188b0 b0Var) {
            super(1);
            this.f51518d = b0Var;
        }

        /* renamed from: a */
        public final void mo45859a(String str) {
            C41536l.m120489i(str, "it");
            this.f51518d.m62307e2().f45974k.mo35918a();
            this.f51518d.m62308f2().mo33224px().mo33237wp(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45859a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: um.b0$j */
    static final class C18199j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C18188b0 f51519d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18199j(C18188b0 b0Var) {
            super(1);
            this.f51519d = b0Var;
        }

        /* renamed from: a */
        public final void mo45860a(String str) {
            C41536l.m120489i(str, "it");
            this.f51519d.m62307e2().f45977n.mo35918a();
            this.f51519d.m62308f2().mo33224px().mo33189Gc(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45860a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: um.b0$k */
    static final class C18200k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C18188b0 f51520d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18200k(C18188b0 b0Var) {
            super(1);
            this.f51520d = b0Var;
        }

        /* renamed from: a */
        public final void mo45861a(String str) {
            C41536l.m120489i(str, "it");
            this.f51520d.m62307e2().f45978o.mo35918a();
            this.f51520d.m62308f2().mo33224px().mo33221p8(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45861a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: um.b0$l */
    static final class C18201l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C18188b0 f51521d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18201l(C18188b0 b0Var) {
            super(1);
            this.f51521d = b0Var;
        }

        /* renamed from: a */
        public final void mo45862a(String str) {
            C41536l.m120489i(str, "it");
            this.f51521d.m62307e2().f45979p.mo35918a();
            this.f51521d.m62308f2().mo33224px().mo33182Cn(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45862a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: um.b0$m */
    public static final class C18202m implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ C18188b0 f51522d;

        /* renamed from: e */
        final /* synthetic */ C43075l f51523e;

        public C18202m(C18188b0 b0Var, C43075l lVar) {
            this.f51522d = b0Var;
            this.f51523e = lVar;
        }

        public void afterTextChanged(Editable editable) {
            C43075l lVar;
            if (!this.f51522d.f51512g && (lVar = this.f51523e) != null) {
                lVar.invoke(String.valueOf(editable));
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: um.b0$n */
    static final class C18203n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C18188b0 f51524d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18203n(C18188b0 b0Var) {
            super(1);
            this.f51524d = b0Var;
        }

        /* renamed from: a */
        public final void mo45866a(String str) {
            C41536l.m120489i(str, "it");
            Chip u1 = this.f51524d.f51515j;
            if (u1 != null) {
                u1.setChipTitle(str);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45866a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: um.b0$o */
    /* synthetic */ class C18204o extends C41535k implements C43075l {
        C18204o(Object obj) {
            super(1, obj, C12651r2.class, "setRecipientBirthDate", "setRecipientBirthDate(J)V", 0);
        }

        /* renamed from: b */
        public final void mo45867b(long j) {
            ((C12651r2) this.receiver).mo33231u8(j);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45867b(((Number) obj).longValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: um.b0$p */
    static final class C18205p implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f51525a;

        C18205p(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f51525a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f51525a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f51525a.invoke(obj);
        }
    }

    /* renamed from: um.b0$q */
    public static final class C18206q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f51526d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18206q(Fragment fragment) {
            super(0);
            this.f51526d = fragment;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f51526d.requireActivity().getViewModelStore();
            C41536l.m120488h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: um.b0$r */
    public static final class C18207r extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f51527d;

        /* renamed from: e */
        final /* synthetic */ Fragment f51528e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18207r(C43064a aVar, Fragment fragment) {
            super(0);
            this.f51527d = aVar;
            this.f51528e = fragment;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f51527d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f51528e.requireActivity().getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: um.b0$s */
    public static final class C18208s extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f51529d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18208s(Fragment fragment) {
            super(0);
            this.f51529d = fragment;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f51529d.requireActivity().getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: E1 */
    private final void m62281E1(ChipGroup chipGroup, int i, boolean z) {
        boolean z2 = false;
        if (i >= 0 && i < chipGroup.getChipCount()) {
            z2 = true;
        }
        if (z2) {
            chipGroup.mo35182m(i, z);
        }
    }

    /* renamed from: F1 */
    private final void m62282F1() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.mo4367F1("REQUEST_KEY_CHOOSE_SC", getViewLifecycleOwner(), new C18261z(this));
        childFragmentManager.mo4367F1("REQUEST_KEY_CHOOSE_DISTRICT", getViewLifecycleOwner(), new C18186a0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public static final void m62283G1(C18188b0 b0Var, String str, Bundle bundle) {
        C41536l.m120489i(b0Var, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        AddressAdapterModel addressAdapterModel = (AddressAdapterModel) bundle.getParcelable("SELECTED_ADDRESS");
        if (addressAdapterModel != null) {
            b0Var.m62308f2().mo33224px().mo33184Dc(addressAdapterModel.mo39272d());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H1 */
    public static final void m62284H1(C18188b0 b0Var, String str, Bundle bundle) {
        C41536l.m120489i(b0Var, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        AddressAdapterModel addressAdapterModel = (AddressAdapterModel) bundle.getParcelable("SELECTED_ADDRESS");
        if (addressAdapterModel != null) {
            b0Var.m62308f2().mo33224px().mo33220oh(addressAdapterModel.mo39272d());
        }
    }

    /* renamed from: I1 */
    private final void m62285I1() {
        m62307e2().f45980q.setOnClickListener(new C18253r(this));
        m62307e2().f45981r.setOnChipActivatedChangedListener(new C18254s(this));
        m62307e2().f45983t.setOnChipActivatedChangedListener(new C18255t(this));
        m62307e2().f45982s.f45829f.setOnChipActivatedChangedListener(new C18256u(this));
        m62307e2().f45982s.f45828e.setOnClickListener(new C18257v(this));
        m62307e2().f45970g.setOnClickListener(new C18258w(this));
        m62307e2().f45976m.setOnClickListener(new C18259x(this));
        m62294R1();
    }

    /* access modifiers changed from: private */
    /* renamed from: J1 */
    public static final void m62286J1(C18188b0 b0Var, View view) {
        C41536l.m120489i(b0Var, "this$0");
        b0Var.m62308f2().mo33224px().mo33209fg();
    }

    /* access modifiers changed from: private */
    /* renamed from: K1 */
    public static final void m62287K1(C18188b0 b0Var, View view) {
        C41536l.m120489i(b0Var, "this$0");
        b0Var.m62308f2().mo33224px().mo33217l5();
    }

    /* access modifiers changed from: private */
    /* renamed from: L1 */
    public static final void m62288L1(C18188b0 b0Var, Chip chip, int i) {
        C41536l.m120489i(b0Var, "this$0");
        C41536l.m120489i(chip, "<anonymous parameter 0>");
        b0Var.m62308f2().mo33224px().mo33185Dn(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public static final void m62289M1(C18188b0 b0Var, Chip chip, int i) {
        C41536l.m120489i(b0Var, "this$0");
        C41536l.m120489i(chip, "chip");
        if (chip.isActivated()) {
            b0Var.m62308f2().mo33224px().mo33195L6(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N1 */
    public static final void m62290N1(C18188b0 b0Var, Chip chip, int i) {
        C41536l.m120489i(b0Var, "this$0");
        C41536l.m120489i(chip, "chip");
        if (chip.isActivated()) {
            b0Var.m62308f2().mo33224px().mo33223pm(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public static final void m62291O1(C18188b0 b0Var, View view) {
        C41536l.m120489i(b0Var, "this$0");
        b0Var.m62308f2().mo33224px().mo33212ht();
    }

    /* access modifiers changed from: private */
    /* renamed from: P1 */
    public static final void m62292P1(C18188b0 b0Var, View view) {
        C41536l.m120489i(b0Var, "this$0");
        b0Var.m62308f2().mo33224px().mo33200W6();
    }

    /* renamed from: Q1 */
    private final void m62293Q1() {
        C12657s2 sx = m62308f2().mo33229sx();
        sx.mo33201X9().mo4819k(getViewLifecycleOwner(), new C18205p(new C18190b(this)));
        sx.mo33197Rv().mo4819k(getViewLifecycleOwner(), new C18205p(new C18192c(this)));
        LiveData w5 = sx.mo33235w5();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(w5, viewLifecycleOwner, new C18193d(this));
        LiveData i6 = sx.mo33213i6();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C37224b.m109963b(i6, viewLifecycleOwner2, new C18194e(this));
        LiveData D6 = sx.mo33183D6();
        C1619q viewLifecycleOwner3 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner3, "viewLifecycleOwner");
        C37224b.m109963b(D6, viewLifecycleOwner3, new C18195f(this));
        sx.mo33227rf().mo4819k(getViewLifecycleOwner(), new C18205p(new C18196g(this)));
        sx.mo33203Yo().mo4819k(getViewLifecycleOwner(), new C18205p(new C18197h(this)));
    }

    /* renamed from: R1 */
    private final void m62294R1() {
        m62296T1(m62307e2().f45974k.getTextInput(), new C18198i(this));
        m62296T1(m62307e2().f45977n.getTextInput(), new C18199j(this));
        m62296T1(m62307e2().f45978o.getTextInput(), new C18200k(this));
        m62296T1(m62307e2().f45979p.getTextInput(), new C18201l(this));
    }

    /* renamed from: S1 */
    private final void m62295S1(List list) {
        m62307e2().f45981r.mo35190t();
        ArrayList<View> arrayList = new ArrayList<>(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DebitCardReceiveTypeUiModel debitCardReceiveTypeUiModel = (DebitCardReceiveTypeUiModel) it.next();
            Context requireContext = requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            Chip chip = new Chip(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            chip.setChipTitle(C32343x.m95388F(debitCardReceiveTypeUiModel.mo39573b(), new Object[0]));
            chip.setChipType(C18167d.CHOICE_CHIP);
            if (debitCardReceiveTypeUiModel.mo39572a() == C18805i.HOME) {
                this.f51515j = chip;
            }
            arrayList.add(chip);
        }
        ChipGroup chipGroup = m62307e2().f45981r;
        C41536l.m120488h(chipGroup, "binding.pickupChips");
        for (View o : arrayList) {
            chipGroup.mo35183o(o);
        }
    }

    /* renamed from: T1 */
    private final void m62296T1(EditText editText, C43075l lVar) {
        editText.addTextChangedListener(new C18202m(this, lVar));
    }

    /* renamed from: U1 */
    private final void m62297U1(ChipGroup chipGroup, int i, boolean z) {
        boolean z2 = false;
        if (i >= 0 && i < chipGroup.getChipCount()) {
            z2 = true;
        }
        if (z2) {
            chipGroup.mo35185q(i, z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V1 */
    public final void m62298V1(C14235a aVar) {
        m62295S1(aVar.mo39895o());
        m62301Y1(aVar.mo39894n());
        m62322n2(aVar.mo39896p());
        m62308f2().mo33224px().mo33191Hl();
    }

    /* renamed from: W1 */
    private final void m62299W1(C18815q.C18822g gVar) {
        Input input = m62307e2().f45970g;
        C41536l.m120488h(input, "fillDeliveryDistrict$lambda$25");
        C32343x.m95483r1(input, gVar.mo46704g(), false, 2, (Object) null);
        input.setEnabled(gVar.mo46670b());
        input.setInputText(gVar.mo46701e());
    }

    /* renamed from: X1 */
    private final void m62300X1(C18815q.C18827l lVar) {
        ChipGroup chipGroup = m62307e2().f45981r;
        C41536l.m120488h(chipGroup, "binding.pickupChips");
        m62281E1(chipGroup, lVar.mo46727d(), false);
        EmptyWidget emptyWidget = m62307e2().f45971h;
        C41536l.m120488h(emptyWidget, "binding.deliveryTypeHeader");
        C32343x.m95483r1(emptyWidget, lVar.mo46728e(), false, 2, (Object) null);
    }

    /* renamed from: Y1 */
    private final void m62301Y1(List list) {
        ChipGroup chipGroup = m62307e2().f45982s.f45829f;
        C41536l.m120488h(chipGroup, "binding.pinLayout.pinChips");
        chipGroup.mo35190t();
        ArrayList<String> arrayList = new ArrayList<>(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C32343x.m95388F(((DebitCardPinDeliveryTypeUiModel) it.next()).mo39562b(), new Object[0]));
        }
        ArrayList<View> arrayList2 = new ArrayList<>(C41343r.m119925u(arrayList, 10));
        for (String chipTitle : arrayList) {
            Context requireContext = requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            Chip chip = new Chip(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            chip.setChipTitle(chipTitle);
            chip.setChipType(C18167d.CHOICE_CHIP);
            arrayList2.add(chip);
        }
        this.f51516k = arrayList2;
        for (View o : arrayList2) {
            chipGroup.mo35183o(o);
        }
    }

    /* renamed from: Z1 */
    private final void m62302Z1(C18815q.C18826k kVar) {
        Input input = m62307e2().f45982s.f45828e;
        String c = kVar.mo46669a();
        if (c == null) {
            c = "";
        }
        input.setInputText(c);
        Input input2 = m62307e2().f45982s.f45828e;
        C41536l.m120488h(input2, "binding.pinLayout.numberSelector");
        C32343x.m95483r1(input2, kVar.mo46723h(), false, 2, (Object) null);
        m62307e2().f45982s.f45828e.setEnabled(kVar.mo46670b());
    }

    /* renamed from: a2 */
    private final void m62303a2(C18815q.C18828m mVar) {
        boolean z;
        LayerView c = m62307e2().f45982s.mo3946b();
        C41536l.m120488h(c, "binding.pinLayout.root");
        if (mVar.mo46736g() == C10515c.PICKUP_DETAILS) {
            z = true;
        } else {
            z = false;
        }
        C32343x.m95483r1(c, z, false, 2, (Object) null);
        ChipGroup chipGroup = m62307e2().f45982s.f45829f;
        Integer f = mVar.mo46735f();
        if (f != null) {
            int intValue = f.intValue();
            List list = this.f51516k;
            if (list != null) {
                int i = 0;
                for (Object next : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C41341q.m119917t();
                    }
                    Chip chip = (Chip) next;
                    if (i != intValue) {
                        C41536l.m120488h(chipGroup, "fillPinInput$lambda$29$lambda$28$lambda$27");
                        m62297U1(chipGroup, i, false);
                    }
                    chip.setEnabled(mVar.mo46670b());
                    i = i2;
                }
            }
            C41536l.m120488h(chipGroup, "fillPinInput$lambda$29$lambda$28");
            m62281E1(chipGroup, intValue, false);
        }
    }

    /* renamed from: b2 */
    private final void m62304b2(C18815q.C18825j jVar) {
        Input input = m62307e2().f45976m;
        C41536l.m120488h(input, "fillRecipient$lambda$23");
        String str = null;
        C32343x.m95483r1(input, jVar.mo46718f(), false, 2, (Object) null);
        input.setEnabled(jVar.mo46670b());
        Long e = jVar.mo46669a();
        if (e != null) {
            str = C32319m.m95295b(e.longValue());
        }
        if (str == null) {
            str = "";
        } else {
            C41536l.m120488h(str, "recipientBirthDate.data?…eUtils::formatDate) ?: \"\"");
        }
        input.setInputText(str);
    }

    /* renamed from: c2 */
    private final void m62305c2(C18815q.C18831p pVar, boolean z) {
        String str;
        String str2;
        Input input = m62307e2().f45980q;
        C18810l e = pVar.mo46669a();
        if (e == null || (str = e.mo46647a()) == null) {
            str = "";
        }
        input.setInputText(str);
        Input input2 = m62307e2().f45980q;
        if (z) {
            str2 = "text.applications.debitcard.delivery.department";
        } else {
            str2 = "text.card.applications.pickup.branch";
        }
        input2.setHintText((CharSequence) C32343x.m95388F(str2, new Object[0]));
    }

    /* renamed from: d2 */
    private final void m62306d2(C18815q.C18832q qVar, Input input) {
        this.f51512g = true;
        C32343x.m95483r1(input, qVar.mo46758h(), false, 2, (Object) null);
        input.setEnabled(qVar.mo46670b());
        if (!input.getTextInput().isFocused()) {
            String c = qVar.mo46669a();
            if (c == null) {
                c = "";
            }
            input.setInputText(c);
        }
        this.f51512g = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: e2 */
    public final C16239r m62307e2() {
        C16239r rVar = this.f51513h;
        C41536l.m120486f(rVar);
        return rVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public final C12550j3 m62308f2() {
        return (C12550j3) this.f51514i.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public final void m62309g2(C31128a aVar) {
        C31132b.m92648j(aVar, (int[]) null, new C18203n(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public final void m62310h2(C18833r rVar) {
        m62303a2(rVar.mo46775n());
        m62302Z1(rVar.mo46774m());
        m62305c2(rVar.mo46783u(), C12330d.f36975a.mo32926f(rVar.mo46773l().mo46669a()));
        m62300X1(rVar.mo46773l());
        m62324o2(rVar.mo46780s());
        m62299W1(rVar.mo46768h());
        C18815q.C18832q g = rVar.mo46767g();
        Input input = m62307e2().f45974k;
        C41536l.m120488h(input, "binding.inputAddress");
        m62306d2(g, input);
        C18815q.C18832q p = rVar.mo46777p();
        Input input2 = m62307e2().f45977n;
        C41536l.m120488h(input2, "binding.inputRecipientFirstName");
        m62306d2(p, input2);
        C18815q.C18832q q = rVar.mo46778q();
        Input input3 = m62307e2().f45978o;
        C41536l.m120488h(input3, "binding.inputRecipientLastName");
        m62306d2(q, input3);
        if (rVar.mo46779r().mo46758h()) {
            C18815q.C18832q r = rVar.mo46779r();
            Input input4 = m62307e2().f45979p;
            C41536l.m120488h(input4, "binding.inputRecipientPhone");
            m62306d2(r, input4);
        } else {
            C18815q.C18832q k = rVar.mo46772k();
            Input input5 = m62307e2().f45979p;
            C41536l.m120488h(input5, "binding.inputRecipientPhone");
            m62306d2(k, input5);
        }
        m62304b2(rVar.mo46776o());
    }

    /* renamed from: i2 */
    private final void m62312i2(List list, String str, C18781a aVar) {
        AddressChooserActionSheet.C13935a.m51910b(AddressChooserActionSheet.f41314P, list, aVar, (Set) null, str, 4, (Object) null).mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public final void m62314j2(C37586a aVar) {
        C5023l.C5029f i = C5023l.C5029f.m19565c().mo16276e(aVar.mo90772a()).mo16280i(C32343x.m95388F("text.applications.debitcard.delivery.person.bith.date", new Object[0]));
        Long b = aVar.mo90773b();
        if (b != null) {
            C41536l.m120488h(i, "it");
            i.mo16278g(b);
        }
        C5023l a = i.mo16277f(0).mo16275a();
        a.mo16267J1(new C18260y(new C18204o(m62308f2().mo33224px())));
        a.mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public static final void m62316k2(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public final void m62318l2(List list) {
        C18781a aVar;
        if (list.size() == 1) {
            aVar = C18781a.DELIVERY_DISTRICT;
        } else {
            aVar = C18781a.DELIVERY_CITY;
        }
        m62312i2(list, "REQUEST_KEY_CHOOSE_DISTRICT", aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public final void m62320m2(List list) {
        m62312i2(list, "REQUEST_KEY_CHOOSE_SC", C18781a.SC_CITY);
    }

    /* renamed from: n2 */
    private final void m62322n2(List list) {
        ArrayList<String> arrayList = new ArrayList<>(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C32343x.m95388F(((DebitCardRecipientTypeUiModel) it.next()).mo39583a(), new Object[0]));
        }
        for (String chipTitle : arrayList) {
            ChipGroup chipGroup = m62307e2().f45983t;
            Context requireContext = requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            Chip chip = new Chip(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            chip.setChipTitle(chipTitle);
            chip.setChipType(C18167d.CHOICE_CHIP);
            chipGroup.mo35183o(chip);
        }
    }

    /* renamed from: o2 */
    private final void m62324o2(C18815q.C18829n nVar) {
        String str;
        Input input = m62307e2().f45979p;
        if (C12330d.f36975a.mo32927g(nVar.mo46669a())) {
            str = "text.applications.debitcard.delivery.person.phone.other";
        } else {
            str = "text.applications.debitcard.delivery.person.phone";
        }
        input.setHintText((CharSequence) C32343x.m95388F(str, new Object[0]));
        ChipGroup chipGroup = m62307e2().f45983t;
        C41536l.m120488h(chipGroup, "setRecipientTypeData$lambda$26");
        C32343x.m95483r1(chipGroup, nVar.mo46743g(), false, 2, (Object) null);
        m62281E1(chipGroup, nVar.mo46742f(), false);
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public final void m62326p2(C18835s sVar) {
        Input input = m62307e2().f45974k;
        C41536l.m120488h(input, "binding.inputAddress");
        Input.m50261f(input, sVar.mo46785a(), false, false, false, 14, (Object) null);
        Input input2 = m62307e2().f45977n;
        C41536l.m120488h(input2, "binding.inputRecipientFirstName");
        Input.m50261f(input2, sVar.mo46787c(), false, false, false, 14, (Object) null);
        Input input3 = m62307e2().f45978o;
        C41536l.m120488h(input3, "binding.inputRecipientLastName");
        Input.m50261f(input3, sVar.mo46788d(), false, false, false, 14, (Object) null);
        Input input4 = m62307e2().f45979p;
        C41536l.m120488h(input4, "binding.inputRecipientPhone");
        Input.m50261f(input4, sVar.mo46789e(), false, false, false, 14, (Object) null);
    }

    /* renamed from: q2 */
    private final void m62328q2() {
        m62307e2().f45968e.setTitle(C32343x.m95388F("text.applications.debitcard.delivery", new Object[0]));
        m62307e2().f45971h.setTitle(C32343x.m95388F("text.applications.debitcard.delivery.person.title", new Object[0]));
        m62307e2().f45970g.setHintText((CharSequence) C32343x.m95388F("text.card.applications.delivery.region", new Object[0]));
        m62307e2().f45974k.setHintText((CharSequence) C32343x.m95388F("text.card.applications.delivery.address", new Object[0]));
        m62307e2().f45974k.setInfoText(C32343x.m95388F("text.card.applications.delivery.address.description", new Object[0]));
        m62307e2().f45977n.setHintText((CharSequence) C32343x.m95388F("text.applications.debitcard.delivery.person.first.name", new Object[0]));
        m62307e2().f45978o.setHintText((CharSequence) C32343x.m95388F("text.applications.debitcard.delivery.person.last.name", new Object[0]));
        m62307e2().f45979p.setHintText((CharSequence) C32343x.m95388F("text.applications.debitcard.delivery.person.phone", new Object[0]));
        m62307e2().f45976m.setHintText((CharSequence) C32343x.m95388F("text.applications.debitcard.delivery.person.bith.date", new Object[0]));
        m62307e2().f45976m.setInfoText(C32343x.m95388F("text.applications.delivery.person.bith.date.desc", new Object[0]));
        m62307e2().f45980q.setHintText((CharSequence) C32343x.m95388F("text.card.applications.pickup.branch", new Object[0]));
        m62307e2().f45982s.f45830g.setTitle(C32343x.m95388F("text.applications.pin.delivery.types", new Object[0]));
        m62307e2().f45982s.f45828e.setHintText((CharSequence) C32343x.m95388F("text.card.applications.pin.delivery.phone", new Object[0]));
        m62307e2().f45982s.f45828e.setInfoText(C32343x.m95388F("text.card.applications.pin.delivery.phone.desc", new Object[0]));
    }

    /* renamed from: r2 */
    private final void m62330r2() {
        m62328q2();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f51513h = C16239r.m57892d(layoutInflater, viewGroup, false);
        ScrollView c = m62307e2().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f51513h = null;
        this.f51515j = null;
        this.f51516k = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m62330r2();
        m62293Q1();
        m62285I1();
        m62282F1();
    }
}
