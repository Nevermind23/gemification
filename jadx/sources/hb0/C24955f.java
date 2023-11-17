package hb0;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import d21.C31517a;
import g91.C32314k;
import g91.C32343x;
import ha0.C24923a;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lb0.C25878a;
import lb0.C25884g;
import m41.C37224b;
import o31.C37588a0;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.chips.Chip;
import p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onpayment.AccumulateOnPaymentModel;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onpayment.C22976a;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.moneybox.MoneyBoxTariffUiModel;
import p341ge.bog.mobilebank.shared.cardaccountselector.presentation.model.CardAccountSelectorData;
import p341ge.bog.mobilebank.shared.cardaccountselector.presentation.model.CardAccountSelectorUiModel;
import t31.C38637a;
import ta0.C28345h;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: hb0.f */
public final class C24955f extends C22976a {

    /* renamed from: O */
    public static final C24956a f64277O = new C24956a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private C24923a f64278K;

    /* renamed from: L */
    private final C41217g f64279L = C41219i.m119470b(new C24957b(this));

    /* renamed from: M */
    public C25878a f64280M;

    /* renamed from: N */
    private final C41217g f64281N;

    /* renamed from: hb0.f$a */
    public static final class C24956a {
        private C24956a() {
        }

        public /* synthetic */ C24956a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C24955f mo63365a(AccumulateOnPaymentModel accumulateOnPaymentModel) {
            C41536l.m120489i(accumulateOnPaymentModel, "args");
            C24955f fVar = new C24955f();
            fVar.setArguments(C0908e.m3336b(C41233s.m119492a("ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onpayment.ARGS_KEY", accumulateOnPaymentModel)));
            return fVar;
        }
    }

    /* renamed from: hb0.f$b */
    static final class C24957b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C24955f f64282d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24957b(C24955f fVar) {
            super(0);
            this.f64282d = fVar;
        }

        /* renamed from: b */
        public final AccumulateOnPaymentModel invoke() {
            AccumulateOnPaymentModel accumulateOnPaymentModel = (AccumulateOnPaymentModel) this.f64282d.requireArguments().getParcelable("ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onpayment.ARGS_KEY");
            if (accumulateOnPaymentModel != null) {
                return accumulateOnPaymentModel;
            }
            throw new NullPointerException("arguments cannot be null");
        }
    }

    /* renamed from: hb0.f$c */
    /* synthetic */ class C24958c extends C41535k implements C43075l {
        C24958c(Object obj) {
            super(1, obj, C24955f.class, "onMoneyBoxTariffsResult", "onMoneyBoxTariffsResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo63367b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C24955f) this.receiver).m79798v2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo63367b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: hb0.f$d */
    static final class C24959d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24955f f64283d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24959d(C24955f fVar) {
            super(1);
            this.f64283d = fVar;
        }

        /* renamed from: a */
        public final void mo63368a(C41224m mVar) {
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            C31517a.f78078J.mo71926a(new CardAccountSelectorData((List) mVar.mo95676b(), Long.valueOf(((Number) mVar.mo95675a()).longValue()))).mo4576A1(this.f64283d.getChildFragmentManager(), (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo63368a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: hb0.f$e */
    static final class C24960e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24955f f64284d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24960e(C24955f fVar) {
            super(1);
            this.f64284d = fVar;
        }

        /* renamed from: a */
        public final void mo63369a(C41224m mVar) {
            C41536l.m120489i(mVar, "data");
            C38637a.f92497I.mo92278a((String) mVar.mo95678e(), (String) mVar.mo95680f()).mo4576A1(this.f64284d.getChildFragmentManager(), (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo63369a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: hb0.f$f */
    /* synthetic */ class C24961f extends C41535k implements C43075l {
        C24961f(Object obj) {
            super(1, obj, C24955f.class, "handleViews", "handleViews(Lge/bog/mobilebank/depositapplication/presentation/depositsubmission/fragment/onpayment/AccumulateOnPaymentModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo63370b(AccumulateOnPaymentModel accumulateOnPaymentModel) {
            C41536l.m120489i(accumulateOnPaymentModel, "p0");
            ((C24955f) this.receiver).m79796t2(accumulateOnPaymentModel);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo63370b((AccumulateOnPaymentModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: hb0.f$g */
    static final class C24962g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24955f f64285d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24962g(C24955f fVar) {
            super(1);
            this.f64285d = fVar;
        }

        /* renamed from: a */
        public final void mo63371a(AccumulateOnPaymentModel accumulateOnPaymentModel) {
            C41536l.m120489i(accumulateOnPaymentModel, "it");
            C1533o.m5445b(this.f64285d, "AccumulateOnPaymentActionSheet.CAS_DATA", C0908e.m3336b(C41233s.m119492a("AccumulateOnPaymentActionSheet.CAS_DATA", accumulateOnPaymentModel)));
            this.f64285d.mo4577k1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo63371a((AccumulateOnPaymentModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: hb0.f$h */
    static final class C24963h implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f64286a;

        C24963h(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f64286a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f64286a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f64286a.invoke(obj);
        }
    }

    /* renamed from: hb0.f$i */
    static final class C24964i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C24955f f64287d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24964i(C24955f fVar) {
            super(0);
            this.f64287d = fVar;
        }

        public final void invoke() {
            this.f64287d.m79795s2().mo64687rw().mo64679P0();
        }
    }

    /* renamed from: hb0.f$j */
    public static final class C24965j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f64288d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24965j(Fragment fragment) {
            super(0);
            this.f64288d = fragment;
        }

        public final Fragment invoke() {
            return this.f64288d;
        }
    }

    /* renamed from: hb0.f$k */
    public static final class C24966k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f64289d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24966k(C43064a aVar) {
            super(0);
            this.f64289d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f64289d.invoke();
        }
    }

    /* renamed from: hb0.f$l */
    public static final class C24967l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f64290d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24967l(C41217g gVar) {
            super(0);
            this.f64290d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f64290d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: hb0.f$m */
    public static final class C24968m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f64291d;

        /* renamed from: e */
        final /* synthetic */ C41217g f64292e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24968m(C43064a aVar, C41217g gVar) {
            super(0);
            this.f64291d = aVar;
            this.f64292e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f64291d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f64292e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: hb0.f$n */
    static final class C24969n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C24955f f64293d;

        /* renamed from: hb0.f$n$a */
        static final class C24970a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C24955f f64294d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24970a(C24955f fVar) {
                super(0);
                this.f64294d = fVar;
            }

            /* renamed from: b */
            public final C25884g invoke() {
                return this.f64294d.mo63364r2().mo32810a(this.f64294d.m79793p2());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24969n(C24955f fVar) {
            super(0);
            this.f64293d = fVar;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C24970a(this.f64293d));
        }
    }

    public C24955f() {
        C24969n nVar = new C24969n(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C24966k(new C24965j(this)));
        this.f64281N = C1514j0.m5374c(this, C41520a0.m120436b(C25884g.class), new C24967l(a), new C24968m((C43064a) null, a), nVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: A2 */
    public static final void m79780A2(C24955f fVar, View view) {
        C41536l.m120489i(fVar, "this$0");
        fVar.m79795s2().mo64694yw();
    }

    /* access modifiers changed from: private */
    /* renamed from: B2 */
    public static final void m79781B2(C24955f fVar, View view) {
        C41536l.m120489i(fVar, "this$0");
        fVar.m79795s2().mo64687rw().mo64678F1();
    }

    /* renamed from: n2 */
    private final void m79791n2(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C41224m mVar = (C41224m) it.next();
            MoneyBoxTariffUiModel moneyBoxTariffUiModel = (MoneyBoxTariffUiModel) mVar.mo95675a();
            boolean booleanValue = ((Boolean) mVar.mo95676b()).booleanValue();
            String a = moneyBoxTariffUiModel.mo75109a();
            if (a == null) {
                a = "GEL";
            }
            String a2 = C32314k.m95245a(a);
            Context requireContext = requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            Chip chip = new Chip(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            double e = moneyBoxTariffUiModel.mo75113e();
            C41536l.m120488h(a2, "currency");
            chip.setChipTitle(C32343x.m95410Q(e, a2, false, 2, (Object) null));
            chip.setTag(Double.valueOf(moneyBoxTariffUiModel.mo75113e()));
            chip.setOnClickListener(new C24950a(this, moneyBoxTariffUiModel));
            if (booleanValue) {
                chip.performClick();
            }
            m79794q2().f64084f.addView(chip);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public static final void m79792o2(C24955f fVar, MoneyBoxTariffUiModel moneyBoxTariffUiModel, View view) {
        C41536l.m120489i(fVar, "this$0");
        C41536l.m120489i(moneyBoxTariffUiModel, "$tariffUiModel");
        fVar.m79795s2().mo64687rw().mo64680mv(moneyBoxTariffUiModel.mo75113e());
    }

    private final void observeData() {
        m79795s2().mo64690uw().mo64682Ye().mo4819k(this, new C24963h(new C24958c(this)));
        C37224b.m109963b(m79795s2().mo64690uw().mo64683f3(), this, new C24959d(this));
        C37224b.m109963b(m79795s2().mo64690uw().mo64681Gu(), this, new C24960e(this));
        m79795s2().mo64690uw().mo64684rg().mo4819k(this, new C24963h(new C24961f(this)));
        C37224b.m109963b(m79795s2().mo64690uw().mo64685zo(), this, new C24962g(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public final AccumulateOnPaymentModel m79793p2() {
        return (AccumulateOnPaymentModel) this.f64279L.getValue();
    }

    /* renamed from: q2 */
    private final C24923a m79794q2() {
        C24923a aVar = this.f64278K;
        C41536l.m120486f(aVar);
        return aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public final C25884g m79795s2() {
        return (C25884g) this.f64281N.getValue();
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [he1.w] */
    /* JADX WARNING: type inference failed for: r6v1, types: [android.view.View, java.lang.Object] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: t2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m79796t2(p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onpayment.AccumulateOnPaymentModel r10) {
        /*
            r9 = this;
            ha0.a r0 = r9.m79794q2()
            ge.bog.designsystem.components.fixedbutton.FixedButtonCardSelectorView r1 = r0.f64083e
            ge.bog.designsystem.components.buttons.Button r1 = r1.getMainButton()
            boolean r2 = r10.mo57127j()
            r1.setEnabled(r2)
            com.google.android.flexbox.FlexboxLayout r1 = r0.f64084f
            java.lang.String r2 = "chipContainer"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            int r2 = r1.getChildCount()
            r3 = 0
            r4 = r3
        L_0x001e:
            r5 = 0
            if (r4 >= r2) goto L_0x0058
            android.view.View r6 = r1.getChildAt(r4)
            java.lang.String r7 = "getChildAt(index)"
            kotlin.jvm.internal.C41536l.m120488h(r6, r7)
            boolean r7 = r6 instanceof p341ge.bog.designsystem.components.chips.Chip
            if (r7 == 0) goto L_0x0031
            r5 = r6
            ge.bog.designsystem.components.chips.Chip r5 = (p341ge.bog.designsystem.components.chips.Chip) r5
        L_0x0031:
            if (r5 == 0) goto L_0x0055
            java.lang.Object r6 = r5.getTag()
            if (r6 == 0) goto L_0x0051
            java.lang.Object r6 = r5.getTag()
            java.lang.String r6 = r6.toString()
            java.math.BigDecimal r7 = r10.mo57120e()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r6, r7)
            if (r6 == 0) goto L_0x0051
            r6 = 1
            goto L_0x0052
        L_0x0051:
            r6 = r3
        L_0x0052:
            r5.setActivated(r6)
        L_0x0055:
            int r4 = r4 + 1
            goto L_0x001e
        L_0x0058:
            java.lang.Long r1 = r10.mo57118d()
            if (r1 == 0) goto L_0x0080
            r1.longValue()
            ge.bog.designsystem.components.fixedbutton.FixedButtonCardSelectorView r1 = r0.f64083e
            ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView r1 = r1.getPicker()
            ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView$b$b r8 = new ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView$b$b
            r3 = 0
            java.lang.Integer r4 = r10.mo57124h()
            java.lang.String r5 = r10.mo57122f()
            boolean r6 = r10.mo57126i()
            r7 = 0
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            r1.setCreditCard(r8)
            he1.w r5 = he1.C41238w.f97225a
        L_0x0080:
            if (r5 != 0) goto L_0x008d
            ge.bog.designsystem.components.fixedbutton.FixedButtonCardSelectorView r10 = r0.f64083e
            ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView r10 = r10.getPicker()
            ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView$b$a r0 = p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView.C13279b.C13280a.f39265a
            r10.setCreditCard(r0)
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hb0.C24955f.m79796t2(ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onpayment.AccumulateOnPaymentModel):void");
    }

    /* renamed from: u2 */
    private final void m79797u2(boolean z) {
        FrameLayout frameLayout = m79794q2().f64088j;
        C41536l.m120488h(frameLayout, "binding.progressBar");
        C32343x.m95483r1(frameLayout, z, false, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public final void m79798v2(C31128a aVar) {
        if (aVar instanceof C31128a.C31130b) {
            m79797u2(true);
        } else if (aVar instanceof C31128a.C31131c) {
            m79797u2(false);
            m79791n2((List) ((C31128a.C31131c) aVar).mo71340a());
        } else if (aVar instanceof C31128a.C31129a) {
            m79797u2(false);
            CardView cardView = m79794q2().f64090l;
            C41536l.m120488h(cardView, "binding.retryButtonContainer");
            C32343x.m95447f1(cardView);
            handleError(((C31128a.C31129a) aVar).mo71342c());
        }
    }

    /* renamed from: w2 */
    private final void m79799w2() {
        getChildFragmentManager().mo4367F1("REQUEST_KEY_CARD_ACCOUNT_SELECTED", getViewLifecycleOwner(), new C24954e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public static final void m79800x2(C24955f fVar, String str, Bundle bundle) {
        C41536l.m120489i(fVar, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        CardAccountSelectorUiModel cardAccountSelectorUiModel = (CardAccountSelectorUiModel) bundle.getParcelable("RESULT_KEY_SELECTED_ACCOUNT");
        if (cardAccountSelectorUiModel != null) {
            fVar.m79795s2().mo64693xw(cardAccountSelectorUiModel);
        }
    }

    /* renamed from: y2 */
    private final void m79801y2() {
        C24923a q2 = m79794q2();
        mo26370a2(C32343x.m95388F("applications.deposits.money.box.action.sheet.header", new Object[0]));
        q2.f64086h.setText(C32343x.m95388F("applications.deposits.money.box.action.sheet.amount.text", new Object[0]));
        q2.f64085g.setButtonText(C32343x.m95388F("applications.deposits.bundle.accumulate.CAS.sheet.cancel.button", new Object[0]));
        Button mainButton = q2.f64083e.getMainButton();
        mainButton.setEnabled(false);
        mainButton.setButtonText(C32343x.m95388F("applications.deposits.money.box.action.sheet.main.button", new Object[0]));
        mainButton.setOnClickListener(new C24951b(this));
        CreditCardSmallPickerView picker = q2.f64083e.getPicker();
        C28345h.m86979b(picker, 0, new C24964i(this), 1, (Object) null);
        picker.mo35468h(new CreditCardSmallPickerView.C13282c(C32343x.m95388F("applications.deposits.money.box.action.sheet.acc.header", new Object[0]), C32343x.m95388F("applications.deposits.money.box.action.sheet.acc.from", new Object[0])));
        q2.f64089k.mo3946b().setOnClickListener(new C24952c(this, q2));
        Button button = q2.f64085g;
        C41536l.m120488h(button, "setupViews$lambda$14$lambda$13");
        C32343x.m95483r1(button, m79793p2().mo57127j(), false, 2, (Object) null);
        button.setOnClickListener(new C24953d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public static final void m79802z2(C24955f fVar, C24923a aVar, View view) {
        C41536l.m120489i(fVar, "this$0");
        C41536l.m120489i(aVar, "$this_with");
        C21481a.onRefresh$default(fVar.m79795s2(), 0, 1, (Object) null);
        CardView cardView = aVar.f64090l;
        C41536l.m120488h(cardView, "retryButtonContainer");
        C32343x.m95455i0(cardView);
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f64278K = C24923a.m79671d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f64278K = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        observeData();
        m79801y2();
        m79799w2();
    }

    /* renamed from: r2 */
    public final C25878a mo63364r2() {
        C25878a aVar = this.f64280M;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("factory");
        return null;
    }
}
