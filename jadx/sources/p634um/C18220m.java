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
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
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
import d21.C31517a;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
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
import m70.C26148a;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.actionsheet.additionalactions.model.SelectorConfig;
import p341ge.bog.designsystem.components.chips.Chip;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.designsystem.components.creditcardwidget.CreditCardWidgetBannerView;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.mobilebank.cardapplications.presentation.model.C14235a;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardCurrencyUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardPinDeliveryTypeUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardRegTypeUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.RegionUiModel;
import p341ge.bog.mobilebank.shared.cardaccountselector.presentation.model.CardAccountSelectorData;
import p341ge.bog.mobilebank.shared.cardaccountselector.presentation.model.CardAccountSelectorUiModel;
import p341ge.bog.mobilebank.shared.cards.presentation.scoolcardlimitchooser.model.CardDailyLimitUiModel;
import p363bh.C10282f;
import p383cn.C10515c;
import p392dh.C12129b;
import p412en.C12550j3;
import p412en.C12657s2;
import p481jm.C16227f0;
import p481jm.C16237p;
import p537nm.C17102s;
import p537nm.C17103t;
import p629uh.C18167d;
import p674xm.C18815q;
import p674xm.C18833r;
import p674xm.C18835s;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: um.m */
public final class C18220m extends C18185a {

    /* renamed from: j */
    public static final C18221a f51542j = new C18221a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C16237p f51543g;

    /* renamed from: h */
    private final C41217g f51544h = C1514j0.m5374c(this, C41520a0.m120436b(C12550j3.class), new C18235o(this), new C18236p((C43064a) null, this), new C18237q(this));
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f51545i;

    /* renamed from: um.m$a */
    public static final class C18221a {
        private C18221a() {
        }

        public /* synthetic */ C18221a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C18220m mo45875a() {
            return new C18220m();
        }
    }

    /* renamed from: um.m$b */
    static final class C18222b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C18220m f51546d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18222b(C18220m mVar) {
            super(1);
            this.f51546d = mVar;
        }

        /* renamed from: a */
        public final void mo45876a(String str) {
            C41536l.m120489i(str, "it");
            this.f51546d.m62387d2().f45947o.mo35918a();
            this.f51546d.m62388e2().mo33224px().mo33179Al(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45876a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: um.m$c */
    /* synthetic */ class C18223c extends C41535k implements C43075l {
        C18223c(Object obj) {
            super(1, obj, C18220m.class, "onResourcesResult", "onResourcesResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo45877b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C18220m) this.receiver).m62390g2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45877b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: um.m$d */
    /* synthetic */ class C18224d extends C41535k implements C43075l {
        C18224d(Object obj) {
            super(1, obj, C18220m.class, "onInputChange", "onInputChange(Lge/bog/mobilebank/cardapplications/presentation/model/OrderDebitCardInput;)V", 0);
        }

        /* renamed from: b */
        public final void mo45878b(C18833r rVar) {
            C41536l.m120489i(rVar, "p0");
            ((C18220m) this.receiver).m62389f2(rVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45878b((C18833r) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: um.m$e */
    /* synthetic */ class C18225e extends C41535k implements C43075l {
        C18225e(Object obj) {
            super(1, obj, C18220m.class, "openAccountTypesActionSheet", "openAccountTypesActionSheet(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo45879b(List list) {
            C41536l.m120489i(list, "p0");
            ((C18220m) this.receiver).m62395j2(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45879b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: um.m$f */
    /* synthetic */ class C18226f extends C41535k implements C43075l {
        C18226f(Object obj) {
            super(1, obj, C18220m.class, "openAccountSelector", "openAccountSelector(Lge/bog/mobilebank/shared/cardaccountselector/presentation/model/CardAccountSelectorData;)V", 0);
        }

        /* renamed from: b */
        public final void mo45880b(CardAccountSelectorData cardAccountSelectorData) {
            C41536l.m120489i(cardAccountSelectorData, "p0");
            ((C18220m) this.receiver).m62393i2(cardAccountSelectorData);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45880b((CardAccountSelectorData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: um.m$g */
    /* synthetic */ class C18227g extends C41535k implements C43075l {
        C18227g(Object obj) {
            super(1, obj, C18220m.class, "fillCurrencies", "fillCurrencies(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo45881b(List list) {
            C41536l.m120489i(list, "p0");
            ((C18220m) this.receiver).m62379V1(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45881b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: um.m$h */
    /* synthetic */ class C18228h extends C41535k implements C43075l {
        C18228h(Object obj) {
            super(1, obj, C18220m.class, "setValidators", "setValidators(Lge/bog/mobilebank/cardapplications/presentation/model/OrderDebitCardInputValidators;)V", 0);
        }

        /* renamed from: b */
        public final void mo45882b(C18835s sVar) {
            C41536l.m120489i(sVar, "p0");
            ((C18220m) this.receiver).m62397k2(sVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45882b((C18835s) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: um.m$i */
    public static final class C18229i implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ C18220m f51547d;

        /* renamed from: e */
        final /* synthetic */ C43075l f51548e;

        public C18229i(C18220m mVar, C43075l lVar) {
            this.f51547d = mVar;
            this.f51548e = lVar;
        }

        public void afterTextChanged(Editable editable) {
            C43075l lVar;
            if (!this.f51547d.f51545i && (lVar = this.f51548e) != null) {
                lVar.invoke(String.valueOf(editable));
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: um.m$j */
    static final class C18230j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C18220m f51549d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18230j(C18220m mVar) {
            super(1);
            this.f51549d = mVar;
        }

        /* renamed from: a */
        public final void mo45886a(C14235a aVar) {
            C18220m.m62391h2(this.f51549d, true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45886a((C14235a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: um.m$k */
    static final class C18231k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C18220m f51550d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18231k(C18220m mVar) {
            super(1);
            this.f51550d = mVar;
        }

        /* renamed from: a */
        public final void mo45887a(C14235a aVar) {
            C41536l.m120489i(aVar, "it");
            C18220m.m62391h2(this.f51550d, false);
            this.f51550d.m62381X1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45887a((C14235a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: um.m$l */
    static final class C18232l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C18220m f51551d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18232l(C18220m mVar) {
            super(1);
            this.f51551d = mVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            C18220m.m62391h2(this.f51551d, false);
        }
    }

    /* renamed from: um.m$m */
    public static final class C18233m implements C12129b {
        C18233m() {
        }

        /* renamed from: c */
        public String mo26885a(DebitCardRegTypeUiModel debitCardRegTypeUiModel) {
            C41536l.m120489i(debitCardRegTypeUiModel, "item");
            return C32343x.m95388F(debitCardRegTypeUiModel.mo39594a(), new Object[0]);
        }

        /* renamed from: d */
        public String mo26886b(DebitCardRegTypeUiModel debitCardRegTypeUiModel) {
            C41536l.m120489i(debitCardRegTypeUiModel, "item");
            return null;
        }
    }

    /* renamed from: um.m$n */
    static final class C18234n implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f51552a;

        C18234n(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f51552a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f51552a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f51552a.invoke(obj);
        }
    }

    /* renamed from: um.m$o */
    public static final class C18235o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f51553d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18235o(Fragment fragment) {
            super(0);
            this.f51553d = fragment;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f51553d.requireActivity().getViewModelStore();
            C41536l.m120488h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: um.m$p */
    public static final class C18236p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f51554d;

        /* renamed from: e */
        final /* synthetic */ Fragment f51555e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18236p(C43064a aVar, Fragment fragment) {
            super(0);
            this.f51554d = aVar;
            this.f51555e = fragment;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f51554d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f51555e.requireActivity().getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: um.m$q */
    public static final class C18237q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f51556d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18237q(Fragment fragment) {
            super(0);
            this.f51556d = fragment;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f51556d.requireActivity().getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: D1 */
    private final void m62361D1(ChipGroup chipGroup, int i, boolean z) {
        boolean z2 = false;
        if (i >= 0 && i < chipGroup.getChipCount()) {
            z2 = true;
        }
        if (z2) {
            chipGroup.mo35182m(i, z);
        }
    }

    /* renamed from: E1 */
    private final void m62362E1() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.mo4367F1("REQUEST_KEY_ACCOUNT_TYPE", getViewLifecycleOwner(), new C18218k(this));
        childFragmentManager.mo4367F1("REQUEST_KEY_CARD_ACCOUNT_SELECTED", getViewLifecycleOwner(), new C18219l(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public static final void m62363F1(C18220m mVar, String str, Bundle bundle) {
        DebitCardRegTypeUiModel debitCardRegTypeUiModel;
        C41536l.m120489i(mVar, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("SELECTOR_RESULT_KEY");
        if (parcelableArrayList != null && (debitCardRegTypeUiModel = (DebitCardRegTypeUiModel) C41358y.m120009Y(parcelableArrayList)) != null) {
            mVar.m62388e2().mo33224px().mo33196Od(debitCardRegTypeUiModel);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public static final void m62364G1(C18220m mVar, String str, Bundle bundle) {
        C41536l.m120489i(mVar, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        CardAccountSelectorUiModel cardAccountSelectorUiModel = (CardAccountSelectorUiModel) bundle.getParcelable("RESULT_KEY_SELECTED_ACCOUNT");
        if (cardAccountSelectorUiModel != null) {
            mVar.m62388e2().mo33224px().mo33211gu(cardAccountSelectorUiModel.mo84203a());
        }
    }

    /* renamed from: H1 */
    private final void m62365H1() {
        m62387d2().f45948p.setOnChipActivatedChangedListener(new C18211d(this));
        m62387d2().f45955w.f45829f.setOnChipActivatedChangedListener(new C18212e(this));
        m62387d2().f45938f.setOnClickListener(new C18213f(this));
        m62387d2().f45937e.setOnClickListener(new C18214g(this));
        m62387d2().f45955w.f45828e.setOnClickListener(new C18215h(this));
        m62374Q1(m62387d2().f45947o.getTextInput(), new C18222b(this));
        m62387d2().f45956x.setOnClickListener(new C18216i(this));
        m62387d2().f45944l.setOnClickListener(new C18217j(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: I1 */
    public static final void m62366I1(C18220m mVar, View view) {
        C41536l.m120489i(mVar, "this$0");
        mVar.m62388e2().mo33224px().mo33236wa();
    }

    /* access modifiers changed from: private */
    /* renamed from: J1 */
    public static final void m62367J1(C18220m mVar, Chip chip, int i) {
        C41536l.m120489i(mVar, "this$0");
        C41536l.m120489i(chip, "chip");
        if (chip.isActivated()) {
            mVar.m62388e2().mo33224px().mo33238y(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: K1 */
    public static final void m62368K1(C18220m mVar, Chip chip, int i) {
        C41536l.m120489i(mVar, "this$0");
        C41536l.m120489i(chip, "chip");
        if (chip.isActivated()) {
            mVar.m62388e2().mo33224px().mo33223pm(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L1 */
    public static final void m62369L1(C18220m mVar, View view) {
        C41536l.m120489i(mVar, "this$0");
        mVar.m62388e2().mo33224px().mo33218mq();
    }

    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public static final void m62370M1(C18220m mVar, View view) {
        C41536l.m120489i(mVar, "this$0");
        mVar.m62388e2().mo33224px().mo33186E1();
    }

    /* access modifiers changed from: private */
    /* renamed from: N1 */
    public static final void m62371N1(C18220m mVar, View view) {
        C41536l.m120489i(mVar, "this$0");
        mVar.m62388e2().mo33224px().mo33212ht();
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public static final void m62372O1(C18220m mVar, View view) {
        C41536l.m120489i(mVar, "this$0");
        mVar.m62388e2().mo33224px().mo33202Xq();
    }

    /* renamed from: P1 */
    private final void m62373P1() {
        C12657s2 sx = m62388e2().mo33229sx();
        sx.mo33201X9().mo4819k(getViewLifecycleOwner(), new C18234n(new C18223c(this)));
        sx.mo33197Rv().mo4819k(getViewLifecycleOwner(), new C18234n(new C18224d(this)));
        LiveData nt = sx.mo33219nt();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(nt, viewLifecycleOwner, new C18225e(this));
        LiveData q2 = sx.mo33225q2();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C37224b.m109963b(q2, viewLifecycleOwner2, new C18226f(this));
        sx.mo33199Vi().mo4819k(getViewLifecycleOwner(), new C18234n(new C18227g(this)));
        sx.mo33203Yo().mo4819k(getViewLifecycleOwner(), new C18234n(new C18228h(this)));
    }

    /* renamed from: Q1 */
    private final void m62374Q1(EditText editText, C43075l lVar) {
        editText.addTextChangedListener(new C18229i(this, lVar));
    }

    /* renamed from: R1 */
    private final void m62375R1(C18815q.C18818c cVar) {
        String str;
        String str2;
        m62387d2().f45937e.setEnabled(cVar.mo46670b());
        Input input = m62387d2().f45937e;
        C41536l.m120488h(input, "binding.accountInput");
        C32343x.m95483r1(input, cVar.mo46683d(), false, 2, (Object) null);
        Input input2 = m62387d2().f45937e;
        if (cVar.mo46669a() != null) {
            str = "text.card.applications.account";
        } else {
            str = "text.card.applications.choose.account";
        }
        input2.setHintText((CharSequence) C32343x.m95388F(str, new Object[0]));
        Input input3 = m62387d2().f45937e;
        C26148a c = cVar.mo46669a();
        if (c == null || (str2 = c.mo65088c()) == null) {
            C26148a c2 = cVar.mo46669a();
            if (c2 != null) {
                str2 = c2.mo65111w();
            } else {
                str2 = "";
            }
        }
        input3.setInputText(str2);
    }

    /* renamed from: S1 */
    private final void m62376S1(C18815q.C18819d dVar) {
        String str;
        String str2;
        String a;
        Input input = m62387d2().f45938f;
        C41536l.m120488h(input, "binding.accountTypeInput");
        C32343x.m95483r1(input, dVar.mo46690f(), false, 2, (Object) null);
        m62387d2().f45938f.setEnabled(dVar.mo46670b());
        Input input2 = m62387d2().f45938f;
        if (dVar.mo46669a() != null) {
            str = "text.card.applications.account.type";
        } else {
            str = "text.applications.debitcard.account.type";
        }
        input2.setHintText((CharSequence) C32343x.m95388F(str, new Object[0]));
        Input input3 = m62387d2().f45938f;
        DebitCardRegTypeUiModel e = dVar.mo46669a();
        if (e == null || (a = e.mo39594a()) == null || (str2 = C32343x.m95388F(a, new Object[0])) == null) {
            str2 = "";
        }
        input3.setInputText(str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x005e, code lost:
        if (r3 == null) goto L_0x0060;
     */
    /* renamed from: T1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m62377T1(p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardUiModel r20, p537nm.C17103t r21, boolean r22) {
        /*
            r19 = this;
            jm.p r0 = r19.m62387d2()
            ge.bog.designsystem.components.creditcardwidget.CreditCardWidgetBannerView r0 = r0.f45939g
            java.lang.String r1 = r20.getCardNameKey()
            r2 = 0
            if (r1 == 0) goto L_0x001c
            java.lang.String r3 = r20.getCardNameValue()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r1 = g91.C32343x.m95420V(r1, r3, r4)
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            java.lang.String r6 = java.lang.String.valueOf(r1)
            ge.bog.designsystem.components.common.Image r7 = r20.getCardImage()
            android.content.Context r1 = r19.requireContext()
            java.lang.String r3 = "requireContext()"
            kotlin.jvm.internal.C41536l.m120488h(r1, r3)
            int r3 = p411em.C12485b.f37157a
            int r1 = p642vh.C18368l.m62755d(r1, r3)
            nm.s r3 = r21.mo44487a()
            if (r3 == 0) goto L_0x0060
            java.lang.String r3 = "text.card.applications.card.price"
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r3 = g91.C32343x.m95388F(r3, r4)
            dn.b r4 = p398dn.C12327b.f36972a
            r5 = r21
            java.lang.String r4 = r4.mo32913d(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r3 = " "
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = r5.toString()
            if (r3 != 0) goto L_0x0062
        L_0x0060:
            java.lang.String r3 = ""
        L_0x0062:
            r15 = r3
            if (r22 == 0) goto L_0x0068
            java.lang.String r3 = "text.card.applications.digital.card.dropdown.digital"
            goto L_0x006a
        L_0x0068:
            java.lang.String r3 = "text.card.applications.digital.card.dropdown.plastic"
        L_0x006a:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r14 = g91.C32343x.m95388F(r3, r2)
            yh.a r2 = new yh.a
            r4 = -1
            java.lang.String r8 = ""
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            java.lang.Integer r16 = java.lang.Integer.valueOf(r1)
            r17 = 448(0x1c0, float:6.28E-43)
            r18 = 0
            r3 = r2
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0.setInfoData(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p634um.C18220m.m62377T1(ge.bog.mobilebank.cardapplications.presentation.model.DebitCardUiModel, nm.t, boolean):void");
    }

    /* renamed from: U1 */
    private final void m62378U1(C18815q.C18817b bVar) {
        String str;
        String str2;
        Input input = m62387d2().f45944l;
        CardDailyLimitUiModel e = bVar.mo46669a();
        if (e == null || (str = e.mo84223b()) == null) {
            str = "";
        }
        input.setInputText(str);
        input.setEnabled(bVar.mo46670b());
        if (bVar.mo46669a() == null) {
            str2 = "text.card.applications.choose.daily.limit.type";
        } else {
            str2 = "text.card.applications.daily.limit.type";
        }
        input.setHintText((CharSequence) C32343x.m95388F(str2, new Object[0]));
        Group group = m62387d2().f45946n;
        C41536l.m120488h(group, "binding.cardLimitsGroup");
        C32343x.m95483r1(group, bVar.mo46679f(), false, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: V1 */
    public final void m62379V1(List list) {
        m62387d2().f45948p.mo35190t();
        ArrayList<View> arrayList = new ArrayList<>(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Context requireContext = requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            Chip chip = new Chip(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            chip.setChipTitle(((DebitCardCurrencyUiModel) it.next()).mo39510a());
            chip.setChipType(C18167d.CHOICE_CHIP);
            arrayList.add(chip);
        }
        ChipGroup chipGroup = m62387d2().f45948p;
        C41536l.m120488h(chipGroup, "binding.currencyChips");
        for (View o : arrayList) {
            chipGroup.mo35183o(o);
        }
    }

    /* renamed from: W1 */
    private final void m62380W1(C18815q.C18820e eVar) {
        Group group = m62387d2().f45949q;
        C41536l.m120488h(group, "binding.currencyGroup");
        C32343x.m95483r1(group, eVar.mo46695e(), false, 2, (Object) null);
        Integer d = eVar.mo46694d();
        if (d != null) {
            int intValue = d.intValue();
            ChipGroup chipGroup = m62387d2().f45948p;
            C41536l.m120488h(chipGroup, "binding.currencyChips");
            m62361D1(chipGroup, intValue, false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X1 */
    public final void m62381X1(C14235a aVar) {
        DebitCardUiModel d = aVar.mo39882d();
        C17103t i = aVar.mo39889i();
        if (i == null) {
            i = new C17103t((C17102s) null);
        }
        m62377T1(d, i, aVar.mo39886g().mo39786f());
        m62382Y1(aVar.mo39894n());
        m62388e2().mo33224px().mo33191Hl();
    }

    /* renamed from: Y1 */
    private final void m62382Y1(List list) {
        ChipGroup chipGroup = m62387d2().f45955w.f45829f;
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
        for (View o : arrayList2) {
            chipGroup.mo35183o(o);
        }
    }

    /* renamed from: Z1 */
    private final void m62383Z1(C18815q.C18826k kVar) {
        Input input = m62387d2().f45955w.f45828e;
        String c = kVar.mo46669a();
        if (c == null) {
            c = "";
        }
        input.setInputText(c);
        Input input2 = m62387d2().f45955w.f45828e;
        C41536l.m120488h(input2, "binding.pinLayout.numberSelector");
        C32343x.m95483r1(input2, kVar.mo46723h(), false, 2, (Object) null);
        m62387d2().f45955w.f45828e.setEnabled(kVar.mo46670b());
    }

    /* renamed from: a2 */
    private final void m62384a2(C18815q.C18828m mVar) {
        boolean z;
        LayerView c = m62387d2().f45955w.mo3946b();
        C41536l.m120488h(c, "binding.pinLayout.root");
        if (mVar.mo46736g() == C10515c.CARD_DETAILS) {
            z = true;
        } else {
            z = false;
        }
        C32343x.m95483r1(c, z, false, 2, (Object) null);
        C16227f0 f0Var = m62387d2().f45955w;
        Integer f = mVar.mo46735f();
        if (f != null) {
            int intValue = f.intValue();
            ChipGroup chipGroup = f0Var.f45829f;
            C41536l.m120488h(chipGroup, "pinChips");
            m62361D1(chipGroup, intValue, false);
        }
    }

    /* renamed from: b2 */
    private final void m62385b2(C18815q.C18830o oVar) {
        String str;
        boolean z;
        String d;
        Input input = m62387d2().f45956x;
        RegionUiModel e = oVar.mo46669a();
        if (e == null || (d = e.mo39836d()) == null || (str = C32343x.m95388F(d, new Object[0])) == null) {
            str = "";
        }
        input.setInputText(str);
        m62387d2().f45956x.setEnabled(oVar.mo46670b());
        Input input2 = m62387d2().f45956x;
        C41536l.m120488h(input2, "binding.studentRegion");
        RegionUiModel e2 = oVar.mo46669a();
        if (e2 == null || e2.mo39834a()) {
            z = false;
        } else {
            z = true;
        }
        C32343x.m95483r1(input2, z, false, 2, (Object) null);
    }

    /* renamed from: c2 */
    private final void m62386c2(C18815q.C18832q qVar, Input input) {
        this.f51545i = true;
        C32343x.m95483r1(input, qVar.mo46758h(), false, 2, (Object) null);
        input.setEnabled(qVar.mo46670b());
        if (!input.getTextInput().isFocused()) {
            String c = qVar.mo46669a();
            if (c == null) {
                c = "";
            }
            input.setInputText(c);
        }
        this.f51545i = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: d2 */
    public final C16237p m62387d2() {
        C16237p pVar = this.f51543g;
        C41536l.m120486f(pVar);
        return pVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: e2 */
    public final C12550j3 m62388e2() {
        return (C12550j3) this.f51544h.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public final void m62389f2(C18833r rVar) {
        C18815q.C18832q j = rVar.mo46771j();
        Input input = m62387d2().f45947o;
        C41536l.m120488h(input, "binding.cardNameInput");
        m62386c2(j, input);
        m62384a2(rVar.mo46775n());
        m62380W1(rVar.mo46766f());
        m62375R1(rVar.mo46763d());
        m62376S1(rVar.mo46764e());
        m62383Z1(rVar.mo46774m());
        m62385b2(rVar.mo46781t());
        m62378U1(rVar.mo46762c());
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public final void m62390g2(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C18230j(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C18231k(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C18232l(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public static final void m62391h2(C18220m mVar, boolean z) {
        CreditCardWidgetBannerView creditCardWidgetBannerView = mVar.m62387d2().f45939g;
        C41536l.m120488h(creditCardWidgetBannerView, "binding.cardBanner");
        C32343x.m95483r1(creditCardWidgetBannerView, !z, false, 2, (Object) null);
        ConstraintLayout constraintLayout = mVar.m62387d2().f45941i;
        C41536l.m120488h(constraintLayout, "binding.cardDetailsInputs");
        C32343x.m95483r1(constraintLayout, !z, false, 2, (Object) null);
        LoadingView loadingView = mVar.m62387d2().f45952t;
        C41536l.m120488h(loadingView, "binding.headerLoader");
        C32343x.m95483r1(loadingView, z, false, 2, (Object) null);
        LinearLayout linearLayout = mVar.m62387d2().f45942j;
        C41536l.m120488h(linearLayout, "binding.cardDetailsInputsLoaders");
        C32343x.m95483r1(linearLayout, z, false, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public final void m62393i2(CardAccountSelectorData cardAccountSelectorData) {
        C31517a.f78078J.mo71926a(cardAccountSelectorData).mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public final void m62395j2(List list) {
        C10282f c = C10282f.f28515F.mo26883c(new SelectorConfig(C32343x.m95388F("text.applications.debitcard.account.type", new Object[0]), false, (String) null, false, false, (String) null, "REQUEST_KEY_ACCOUNT_TYPE", false, false, 446, (DefaultConstructorMarker) null), new C18233m());
        c.mo26881q2(list);
        c.mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public final void m62397k2(C18835s sVar) {
        Input input = m62387d2().f45947o;
        C41536l.m120488h(input, "binding.cardNameInput");
        Input.m50261f(input, sVar.mo46786b(), false, false, false, 14, (Object) null);
    }

    /* renamed from: l2 */
    private final void m62399l2() {
        m62387d2().f45940h.setTitle(C32343x.m95388F("text.card.applications.details", new Object[0]));
        m62387d2().f45938f.setHintText((CharSequence) C32343x.m95388F("text.applications.debitcard.account.type", new Object[0]));
        m62387d2().f45937e.setHintText((CharSequence) C32343x.m95388F("text.card.applications.choose.account", new Object[0]));
        m62387d2().f45954v.setTitle(C32343x.m95388F("text.applications.debitcard.ccy", new Object[0]));
        m62387d2().f45947o.setHintText((CharSequence) C32343x.m95388F("text.applications.debitcard.fullname", new Object[0]));
        m62387d2().f45955w.f45830g.setTitle(C32343x.m95388F("text.applications.pin.delivery.types", new Object[0]));
        m62387d2().f45955w.f45828e.setHintText((CharSequence) C32343x.m95388F("text.card.applications.pin.delivery.phone", new Object[0]));
        m62387d2().f45955w.f45828e.setInfoText(C32343x.m95388F("text.card.applications.pin.delivery.phone.desc", new Object[0]));
        m62387d2().f45956x.setEnabled(false);
        m62387d2().f45956x.setHintText((CharSequence) C32343x.m95388F("applications.student.card.details.region.label", new Object[0]));
        m62387d2().f45945m.setText(C32343x.m95388F("text.card.applications.daily.limit.type.description", new Object[0]));
        m62387d2().f45944l.setHintText((CharSequence) C32343x.m95388F("text.card.applications.choose.daily.limit.type", new Object[0]));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f51543g = C16237p.m57884d(layoutInflater, viewGroup, false);
        ScrollView c = m62387d2().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f51543g = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m62399l2();
        m62373P1();
        m62365H1();
        m62362E1();
    }
}
