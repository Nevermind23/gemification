package p341ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import g91.C32343x;
import hc1.C41143c;
import hc1.C41185v;
import he1.C41212c;
import he1.C41217g;
import he1.C41224m;
import he1.C41238w;
import ie0.C25185e;
import ie0.C25190j;
import if0.C25192a;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf0.C25958e;
import m41.C37224b;
import mf0.C26199a;
import mf0.C26200b;
import mf0.C26201c;
import nf0.C26457a;
import nf0.C26476g;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.biginput.BigInputView;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView;
import p341ge.bog.designsystem.components.digitalkeyboard.NumericKeyboardView;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.galtandtaggart.presentation.exchange.GTMoneyExchangeViewModel$ViewModel;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p420fh.C12902d;
import p420fh.C12910e;
import ue0.C28748r;
import ue1.C43064a;
import ue1.C43075l;
import ug0.C28786c;
import xe0.C29746d;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities.GTMoneyExchangeActivity */
public final class GTMoneyExchangeActivity extends C23441a implements C26457a.C26458a, C26476g.C26478b, C41185v.C41186a {

    /* renamed from: L */
    public static final C23418a f61255L = new C23418a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private final C41217g f61256G = new C1617p0(C41520a0.m120436b(GTMoneyExchangeViewModel$ViewModel.class), new C23431n(this), new C23430m(this), new C23432o((C43064a) null, this));
    /* access modifiers changed from: private */

    /* renamed from: H */
    public C28748r f61257H;

    /* renamed from: I */
    private final C41217g f61258I = C41219i.m119470b(new C23420c(this));
    /* access modifiers changed from: private */

    /* renamed from: J */
    public C31128a f61259J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public final String f61260K = "$";

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities.GTMoneyExchangeActivity$a */
    public static final class C23418a {
        private C23418a() {
        }

        public /* synthetic */ C23418a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo60240a(C25192a aVar, Context context) {
            C41536l.m120489i(aVar, "actionType");
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, GTMoneyExchangeActivity.class);
            intent.putExtra("KEY_ACTION_TYPE", aVar);
            context.startActivity(intent);
        }

        /* renamed from: b */
        public final void mo60241b(C25192a aVar, Fragment fragment) {
            C41536l.m120489i(aVar, "actionType");
            C41536l.m120489i(fragment, "parent");
            Context requireContext = fragment.requireContext();
            C41536l.m120488h(requireContext, "parent.requireContext()");
            mo60240a(aVar, requireContext);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities.GTMoneyExchangeActivity$b */
    public /* synthetic */ class C23419b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f61261a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                if0.a[] r0 = if0.C25192a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                if0.a r1 = if0.C25192a.GET_MONEY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                if0.a r1 = if0.C25192a.DEPOSIT_MONEY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f61261a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities.GTMoneyExchangeActivity.C23419b.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities.GTMoneyExchangeActivity$c */
    static final class C23420c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GTMoneyExchangeActivity f61262d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23420c(GTMoneyExchangeActivity gTMoneyExchangeActivity) {
            super(0);
            this.f61262d = gTMoneyExchangeActivity;
        }

        /* renamed from: b */
        public final C25192a invoke() {
            Intent intent = this.f61262d.getIntent();
            Serializable serializableExtra = intent != null ? intent.getSerializableExtra("KEY_ACTION_TYPE") : null;
            C41536l.m120487g(serializableExtra, "null cannot be cast to non-null type ge.bog.mobilebank.galtandtaggart.domain.shared.GTActionType");
            return (C25192a) serializableExtra;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities.GTMoneyExchangeActivity$d */
    static final class C23421d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTMoneyExchangeActivity f61263d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23421d(GTMoneyExchangeActivity gTMoneyExchangeActivity) {
            super(1);
            this.f61263d = gTMoneyExchangeActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C28748r I2 = this.f61263d.f61257H;
            if (I2 == null) {
                C41536l.m120506z("binding");
                I2 = null;
            }
            Button button = I2.f73433f;
            C41536l.m120488h(bool, "loading");
            button.setLoading(bool.booleanValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities.GTMoneyExchangeActivity$e */
    static final class C23422e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTMoneyExchangeActivity f61264d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23422e(GTMoneyExchangeActivity gTMoneyExchangeActivity) {
            super(1);
            this.f61264d = gTMoneyExchangeActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C28748r I2 = this.f61264d.f61257H;
            if (I2 == null) {
                C41536l.m120506z("binding");
                I2 = null;
            }
            Button button = I2.f73433f;
            C41536l.m120488h(bool, "enabled");
            button.setEnabled(bool.booleanValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities.GTMoneyExchangeActivity$f */
    static final class C23423f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTMoneyExchangeActivity f61265d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23423f(GTMoneyExchangeActivity gTMoneyExchangeActivity) {
            super(1);
            this.f61265d = gTMoneyExchangeActivity;
        }

        /* renamed from: a */
        public final void mo60245a(StringSource stringSource) {
            C41536l.m120489i(stringSource, "it");
            C12910e.m48790h(this.f61265d, C34646b.m101752f(stringSource, (Context) null, 1, (Object) null), (C12902d.C12905b) null, false, 6, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60245a((StringSource) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities.GTMoneyExchangeActivity$g */
    static final class C23424g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTMoneyExchangeActivity f61266d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23424g(GTMoneyExchangeActivity gTMoneyExchangeActivity) {
            super(1);
            this.f61266d = gTMoneyExchangeActivity;
        }

        /* renamed from: a */
        public final void mo60246a(C31128a aVar) {
            this.f61266d.f61259J = aVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60246a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities.GTMoneyExchangeActivity$h */
    static final class C23425h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTMoneyExchangeActivity f61267d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23425h(GTMoneyExchangeActivity gTMoneyExchangeActivity) {
            super(1);
            this.f61267d = gTMoneyExchangeActivity;
        }

        /* renamed from: a */
        public final void mo60247a(C31128a aVar) {
            C28748r rVar = null;
            if (aVar instanceof C31128a.C31129a) {
                C28748r I2 = this.f61267d.f61257H;
                if (I2 == null) {
                    C41536l.m120506z("binding");
                } else {
                    rVar = I2;
                }
                rVar.f73439l.mo53595c();
            } else if (aVar instanceof C31128a.C31130b) {
                C28748r I22 = this.f61267d.f61257H;
                if (I22 == null) {
                    C41536l.m120506z("binding");
                } else {
                    rVar = I22;
                }
                rVar.f73439l.mo53597e();
            } else if (aVar instanceof C31128a.C31131c) {
                C28748r I23 = this.f61267d.f61257H;
                if (I23 == null) {
                    C41536l.m120506z("binding");
                    I23 = null;
                }
                GTMoneyExchangeActivity gTMoneyExchangeActivity = this.f61267d;
                C31128a.C31131c cVar = (C31128a.C31131c) aVar;
                I23.f73435h.setText(C32343x.m95408P(((C29746d) cVar.mo71340a()).mo69771c(), gTMoneyExchangeActivity.f61260K));
                I23.f73438k.setText(C32343x.m95408P(((C29746d) cVar.mo71340a()).mo69770b(), gTMoneyExchangeActivity.f61260K));
                C28748r I24 = this.f61267d.f61257H;
                if (I24 == null) {
                    C41536l.m120506z("binding");
                } else {
                    rVar = I24;
                }
                rVar.f73439l.mo53595c();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60247a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities.GTMoneyExchangeActivity$i */
    static final class C23426i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTMoneyExchangeActivity f61268d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23426i(GTMoneyExchangeActivity gTMoneyExchangeActivity) {
            super(1);
            this.f61268d = gTMoneyExchangeActivity;
        }

        /* renamed from: a */
        public final void mo60248a(TransferAccountItem transferAccountItem) {
            C28748r I2 = this.f61268d.f61257H;
            if (I2 == null) {
                C41536l.m120506z("binding");
                I2 = null;
            }
            CreditCardSmallPickerView creditCardSmallPickerView = I2.f73432e;
            String q = transferAccountItem.mo52148q();
            if (q == null) {
                q = transferAccountItem.mo52134d();
            }
            String str = q;
            int i = C25185e.f64664y;
            creditCardSmallPickerView.setCreditCard(new CreditCardSmallPickerView.C13279b.C13281b((String) null, Integer.valueOf(i), str, false, String.valueOf(Long.valueOf(transferAccountItem.mo52146m()))));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60248a((TransferAccountItem) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities.GTMoneyExchangeActivity$j */
    static final class C23427j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTMoneyExchangeActivity f61269d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23427j(GTMoneyExchangeActivity gTMoneyExchangeActivity) {
            super(1);
            this.f61269d = gTMoneyExchangeActivity;
        }

        /* renamed from: a */
        public final void mo60249a(C41224m mVar) {
            GTMoneyExchangeResultActivity.f61276K.mo60253a((String) mVar.mo95675a(), (String) mVar.mo95676b(), this.f61269d.m75831O2(), this.f61269d);
            this.f61269d.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60249a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities.GTMoneyExchangeActivity$k */
    static final class C23428k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTMoneyExchangeActivity f61270d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23428k(GTMoneyExchangeActivity gTMoneyExchangeActivity) {
            super(1);
            this.f61270d = gTMoneyExchangeActivity;
        }

        /* renamed from: a */
        public final void mo60250a(C21503d dVar) {
            Dialog dialog = null;
            if (dVar instanceof C21503d.C21506c) {
                C41185v e = C41185v.C41187b.m119423e(C41185v.f97155C, "GT_TRANSFER_TO_GT_ACCOUNT", this.f61270d.m75833Q2().mo60191Ew(GTMoneyExchangeViewModel$ViewModel.m75770ww(this.f61270d.m75833Q2(), (String) null, (String) null, (String) null, 7, (Object) null)), (C41143c) null, 4, (Object) null);
                FragmentManager supportFragmentManager = this.f61270d.getSupportFragmentManager();
                C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
                e.mo4576A1(supportFragmentManager, (String) null);
            } else if (dVar instanceof C21503d.C21505b) {
                C41185v K2 = this.f61270d.m75832P2();
                if (K2 != null) {
                    K2.mo95635L2(true);
                }
            } else if (dVar instanceof C21503d.C21504a) {
                C21503d.C21504a aVar = (C21503d.C21504a) dVar;
                if (aVar.mo53708h()) {
                    C41185v K22 = this.f61270d.m75832P2();
                    if (K22 != null) {
                        K22.mo95634K2(C32343x.m95388F(aVar.mo53705e(), new Object[0]));
                        return;
                    }
                    return;
                }
                GTMoneyExchangeActivity gTMoneyExchangeActivity = this.f61270d;
                C41185v K23 = gTMoneyExchangeActivity.m75832P2();
                if (K23 != null) {
                    dialog = K23.mo4579n1();
                }
                gTMoneyExchangeActivity.m75834R2(dialog);
                C41185v K24 = this.f61270d.m75832P2();
                if (K24 != null) {
                    K24.mo4577k1();
                }
                this.f61270d.mo74709H1(aVar.mo53706f());
            } else {
                GTMoneyExchangeActivity gTMoneyExchangeActivity2 = this.f61270d;
                C41185v K25 = gTMoneyExchangeActivity2.m75832P2();
                if (K25 != null) {
                    dialog = K25.mo4579n1();
                }
                gTMoneyExchangeActivity2.m75834R2(dialog);
                C41185v K26 = this.f61270d.m75832P2();
                if (K26 != null) {
                    K26.mo4577k1();
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60250a((C21503d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities.GTMoneyExchangeActivity$l */
    static final class C23429l implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f61271a;

        C23429l(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f61271a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f61271a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f61271a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities.GTMoneyExchangeActivity$m */
    public static final class C23430m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f61272d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23430m(ComponentActivity componentActivity) {
            super(0);
            this.f61272d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f61272d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities.GTMoneyExchangeActivity$n */
    public static final class C23431n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f61273d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23431n(ComponentActivity componentActivity) {
            super(0);
            this.f61273d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f61273d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities.GTMoneyExchangeActivity$o */
    public static final class C23432o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f61274d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f61275e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23432o(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f61274d = aVar;
            this.f61275e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f61274d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f61275e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public final C25192a m75831O2() {
        return (C25192a) this.f61258I.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public final C41185v m75832P2() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        return C32343x.m95449g0(supportFragmentManager, (String) null, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q2 */
    public final GTMoneyExchangeViewModel$ViewModel m75833Q2() {
        return (GTMoneyExchangeViewModel$ViewModel) this.f61256G.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public final void m75834R2(Dialog dialog) {
        Object obj;
        Context context;
        if (dialog != null) {
            View currentFocus = dialog.getCurrentFocus();
            if (currentFocus == null || (context = currentFocus.getContext()) == null) {
                obj = null;
            } else {
                obj = context.getSystemService("input_method");
            }
            InputMethodManager inputMethodManager = (InputMethodManager) obj;
            if (inputMethodManager != null && inputMethodManager.isActive()) {
                inputMethodManager.toggleSoftInput(0, 2);
            }
        }
    }

    /* renamed from: S2 */
    private final void m75835S2() {
        m75833Q2().mo60192Fw().mo60204i8().mo4819k(this, new C23429l(new C23421d(this)));
        m75833Q2().mo60192Fw().mo60202d6().mo4819k(this, new C23429l(new C23422e(this)));
        C37224b.m109963b(m75833Q2().mo60192Fw().mo60205j5(), this, new C23423f(this));
        m75833Q2().mo60192Fw().mo60198J().mo4819k(this, new C23429l(new C23424g(this)));
        m75833Q2().mo60192Fw().mo60206qb().mo4819k(this, new C23429l(new C23425h(this)));
        m75833Q2().mo60192Fw().mo60200O1().mo4819k(this, new C23429l(new C23426i(this)));
        m75833Q2().mo60192Fw().mo60194Hs().mo4819k(this, new C23429l(new C23427j(this)));
        m75833Q2().mo60192Fw().mo60196I2().mo4819k(this, new C23429l(new C23428k(this)));
    }

    /* renamed from: T2 */
    private final void m75836T2() {
        C28748r rVar = this.f61257H;
        if (rVar == null) {
            C41536l.m120506z("binding");
            rVar = null;
        }
        rVar.f73432e.setTitleText(getString(C25190j.gt_small_account_selector_title));
        rVar.f73432e.setOnClickListener(new C26199a(this));
        rVar.f73437j.setText(C32343x.m95388F("text.gt.buying.power", new Object[0]));
        BigInputView bigInputView = rVar.f73442o;
        String string = getString(C25190j.gt_exchange_hint_amount);
        C41536l.m120488h(string, "getString(R.string.gt_exchange_hint_amount)");
        bigInputView.setInfoText(string);
        rVar.f73442o.setHint("0.00$");
        rVar.f73433f.setEnabled(false);
        rVar.f73433f.setOnClickListener(new C26200b(rVar, this));
        int i = C23419b.f61261a[m75831O2().ordinal()];
        if (i == 1) {
            RelativeLayout relativeLayout = rVar.f73436i;
            C41536l.m120488h(relativeLayout, "buyingPowerCon");
            C32343x.m95483r1(relativeLayout, false, false, 2, (Object) null);
            RelativeLayout relativeLayout2 = rVar.f73441n;
            C41536l.m120488h(relativeLayout2, "freeCashCon");
            C32343x.m95483r1(relativeLayout2, true, false, 2, (Object) null);
            rVar.f73433f.setButtonText(getString(C25190j.gt_balance_sheet_button_get));
        } else if (i == 2) {
            RelativeLayout relativeLayout3 = rVar.f73436i;
            C41536l.m120488h(relativeLayout3, "buyingPowerCon");
            C32343x.m95483r1(relativeLayout3, true, false, 2, (Object) null);
            RelativeLayout relativeLayout4 = rVar.f73441n;
            C41536l.m120488h(relativeLayout4, "freeCashCon");
            C32343x.m95483r1(relativeLayout4, false, false, 2, (Object) null);
            rVar.f73433f.setButtonText(getString(C25190j.gt_balance_sheet_button_add));
        }
        rVar.f73442o.mo34891i(false);
        rVar.f73442o.setFormatText(false);
        rVar.f73442o.setTextChangeListener(new C26201c(this));
        rVar.f73444q.setVibrationEnabled(true);
        rVar.f73444q.setAdditionalButtonEnabled(true);
        NumericKeyboardView numericKeyboardView = rVar.f73444q;
        C41536l.m120488h(numericKeyboardView, "numericKeyboardView");
        String str = this.f61260K;
        BigInputView bigInputView2 = rVar.f73442o;
        C41536l.m120488h(bigInputView2, "inputView");
        C28786c.m88246b(numericKeyboardView, str, 2, bigInputView2);
        NumericKeyboardView numericKeyboardView2 = rVar.f73444q;
        C41536l.m120488h(numericKeyboardView2, "numericKeyboardView");
        String str2 = this.f61260K;
        BigInputView bigInputView3 = rVar.f73442o;
        C41536l.m120488h(bigInputView3, "inputView");
        C28786c.m88245a(numericKeyboardView2, str2, bigInputView3);
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public static final void m75837U2(GTMoneyExchangeActivity gTMoneyExchangeActivity, View view) {
        C41536l.m120489i(gTMoneyExchangeActivity, "this$0");
        C31128a aVar = gTMoneyExchangeActivity.f61259J;
        if (aVar instanceof C31128a.C31131c) {
            C31128a.C31131c cVar = (C31128a.C31131c) aVar;
            if (!((Collection) cVar.mo71340a()).isEmpty()) {
                gTMoneyExchangeActivity.m75840X2((List) cVar.mo71340a());
            } else {
                gTMoneyExchangeActivity.m75841Y2();
            }
        } else {
            gTMoneyExchangeActivity.m75840X2((List) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public static final void m75838V2(C28748r rVar, GTMoneyExchangeActivity gTMoneyExchangeActivity, View view) {
        C41536l.m120489i(rVar, "$this_with");
        C41536l.m120489i(gTMoneyExchangeActivity, "this$0");
        if (rVar.f73433f.isEnabled()) {
            gTMoneyExchangeActivity.m75833Q2().mo60197Iw(gTMoneyExchangeActivity.m75831O2());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public static final void m75839W2(GTMoneyExchangeActivity gTMoneyExchangeActivity, String str) {
        BigDecimal bigDecimal;
        boolean z;
        C41536l.m120489i(gTMoneyExchangeActivity, "this$0");
        if (str != null) {
            if (C28786c.m88247c(str, gTMoneyExchangeActivity.f61260K, gTMoneyExchangeActivity).length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                bigDecimal = new BigDecimal(C28786c.m88247c(str, gTMoneyExchangeActivity.f61260K, gTMoneyExchangeActivity));
                gTMoneyExchangeActivity.m75833Q2().mo60199Jw(bigDecimal);
            }
        }
        bigDecimal = BigDecimal.valueOf(0);
        C41536l.m120488h(bigDecimal, "valueOf(this.toLong())");
        gTMoneyExchangeActivity.m75833Q2().mo60199Jw(bigDecimal);
    }

    /* renamed from: X2 */
    private final void m75840X2(List list) {
        C26457a.f67031K.mo65755a(list).mo4576A1(getSupportFragmentManager(), "ACC_SELECTOR_SHEET");
    }

    /* renamed from: Y2 */
    private final void m75841Y2() {
        C26476g.f67056J.mo65767a().mo4576A1(getSupportFragmentManager(), "ACC_SELECTOR_EMPTY_SHEET");
    }

    /* renamed from: H */
    public void mo60236H(TransferAccountItem transferAccountItem) {
        C41536l.m120489i(transferAccountItem, "acc");
        m75833Q2().mo60190Dw().mo60203hp(transferAccountItem);
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        m75833Q2().mo60201Ph(new C21503d.C21506c((Object) null), str, str2, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C28748r d = C28748r.m88119d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f61257H = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        mo86436g2();
        super.mo37451O1(bundle);
        m75836T2();
        m75835S2();
        m75833Q2().mo60190Dw().mo60208w0(m75831O2());
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        C25958e.C25959a.m81603a(m75833Q2(), new C21503d.C21504a(new Exception(str), (Object) null), (String) null, (String) null, (String) null, 14, (Object) null);
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
        if (z) {
            C25958e.C25959a.m81603a(m75833Q2(), new C21503d.C21505b((Object) null), (String) null, (String) null, (String) null, 14, (Object) null);
        }
    }

    /* renamed from: V */
    public void mo60237V() {
        C28748r rVar = this.f61257H;
        if (rVar == null) {
            C41536l.m120506z("binding");
            rVar = null;
        }
        CreditCardSmallPickerView creditCardSmallPickerView = rVar.f73432e;
        C41536l.m120488h(creditCardSmallPickerView, "binding.accountSelector");
        C32343x.m95483r1(creditCardSmallPickerView, false, false, 2, (Object) null);
        C21481a.onRefresh$default(m75833Q2(), 0, 1, (Object) null);
    }

    /* renamed from: f */
    public void mo60238f(List list) {
        C41536l.m120489i(list, "accs");
        this.f61259J = new C31128a.C31131c(list, 0, 2, (DefaultConstructorMarker) null);
    }

    /* renamed from: m0 */
    public void mo60239m0() {
        m75841Y2();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        int i = C23419b.f61261a[m75831O2().ordinal()];
        if (i == 1) {
            String string = getString(C25190j.gt_page_title_get_money);
            C41536l.m120488h(string, "getString(R.string.gt_page_title_get_money)");
            return string;
        } else if (i != 2) {
            return "";
        } else {
            String string2 = getString(C25190j.gt_page_title_add_money);
            C41536l.m120488h(string2, "getString(R.string.gt_page_title_add_money)");
            return string2;
        }
    }
}
