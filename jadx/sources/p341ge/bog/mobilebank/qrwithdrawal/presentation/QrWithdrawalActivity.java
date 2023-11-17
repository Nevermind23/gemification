package p341ge.bog.mobilebank.qrwithdrawal.presentation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import e01.C31641e;
import e01.C31642f;
import g91.C32303f;
import g91.C32343x;
import hc1.C41143c;
import hc1.C41185v;
import he1.C41212c;
import he1.C41217g;
import he1.C41224m;
import he1.C41238w;
import i01.C36335c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o01.C37565a;
import o01.C37566b;
import o01.C37567c;
import o01.C37568d;
import o01.C37569e;
import o01.C37570f;
import o01.C37571g;
import o01.C37572h;
import o01.C37573i;
import o01.C37575k;
import o31.C37588a0;
import p01.C37868a;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.chips.Chip;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.designsystem.components.countdowntimer.CountDownTimerView;
import p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2;
import p341ge.bog.mobilebank.cleanarch.qrscanner.presentation.QrScannerActivity;
import p341ge.bog.mobilebank.p975ui.activities.MainActivity;
import p341ge.bog.mobilebank.qrwithdrawal.presentation.C34402d;
import p341ge.bog.mobilebank.qrwithdrawal.presentation.cardchooser.model.CardChooserData;
import p341ge.bog.mobilebank.qrwithdrawal.presentation.model.CardData;
import p341ge.bog.mobilebank.qrwithdrawal.presentation.model.CardUiModel;
import p341ge.bog.mobilebank.qrwithdrawal.presentation.resultpage.QrResult;
import p341ge.bog.mobilebank.qrwithdrawal.presentation.resultpage.QrResultPageActivity;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.InputExtensionKt;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p380ck.C10464h;
import p420fh.C12902d;
import p420fh.C12910e;
import p629uh.C18167d;
import p745er.C20288a;
import r01.C38272a;
import r01.C38275c;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.QrWithdrawalActivity */
public final class QrWithdrawalActivity extends C34397a implements C41185v.C41186a {

    /* renamed from: J */
    public static final C34378a f83339J = new C34378a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public C34402d.C34421i f83340G;

    /* renamed from: H */
    private final C41217g f83341H = new C1617p0(C41520a0.m120436b(C34402d.class), new C34393p(this), new C34395r(this), new C34394q((C43064a) null, this));

    /* renamed from: I */
    private final C41217g f83342I = C41219i.m119470b(new C34380c(this));

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.QrWithdrawalActivity$a */
    public static final class C34378a {
        private C34378a() {
        }

        public /* synthetic */ C34378a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo82866a(String str, String str2, Context context) {
            C41536l.m120489i(str, "ed");
            C41536l.m120489i(str2, "aid");
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, QrWithdrawalActivity.class);
            intent.putExtra("ed", str);
            intent.putExtra("AID", str2);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.QrWithdrawalActivity$b */
    public /* synthetic */ class C34379b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f83343a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                r01.b[] r0 = r01.C38273b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r01.b r1 = r01.C38273b.ERROR_SCREEN     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r01.b r1 = r01.C38273b.BANNER     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r01.b r1 = r01.C38273b.POPUP     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r01.b r1 = r01.C38273b.RESULT_PAGE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f83343a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.qrwithdrawal.presentation.QrWithdrawalActivity.C34379b.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.QrWithdrawalActivity$c */
    static final class C34380c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ QrWithdrawalActivity f83344d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34380c(QrWithdrawalActivity qrWithdrawalActivity) {
            super(0);
            this.f83344d = qrWithdrawalActivity;
        }

        /* renamed from: b */
        public final C36335c invoke() {
            return C36335c.m107831d(this.f83344d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.QrWithdrawalActivity$d */
    static final class C34381d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ String f83345d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34381d(String str) {
            super(1);
            this.f83345d = str;
        }

        /* renamed from: a */
        public final CharSequence mo82868a(int i) {
            String h = C32303f.m95197h(this.f83345d);
            return " " + i + h;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo82868a(((Number) obj).intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.QrWithdrawalActivity$e */
    /* synthetic */ class C34382e extends C41535k implements C43075l {
        C34382e(Object obj) {
            super(1, obj, QrWithdrawalActivity.class, "setResponseState", "setResponseState(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo82869b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((QrWithdrawalActivity) this.receiver).m101080k3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82869b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.QrWithdrawalActivity$f */
    /* synthetic */ class C34383f extends C41535k implements C43075l {
        C34383f(Object obj) {
            super(1, obj, QrWithdrawalActivity.class, "setUiState", "setUiState(Lge/bog/mobilebank/qrwithdrawal/presentation/model/UiState;)V", 0);
        }

        /* renamed from: b */
        public final void mo82870b(C38272a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((QrWithdrawalActivity) this.receiver).m101081l3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82870b((C38272a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.QrWithdrawalActivity$g */
    /* synthetic */ class C34384g extends C41535k implements C43075l {
        C34384g(Object obj) {
            super(1, obj, QrWithdrawalActivity.class, "setUpInitialState", "setUpInitialState(Lkotlin/Pair;)V", 0);
        }

        /* renamed from: b */
        public final void mo82871b(C41224m mVar) {
            C41536l.m120489i(mVar, "p0");
            ((QrWithdrawalActivity) this.receiver).m101082m3(mVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82871b((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.QrWithdrawalActivity$h */
    static final class C34385h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ QrWithdrawalActivity f83346d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34385h(QrWithdrawalActivity qrWithdrawalActivity) {
            super(1);
            this.f83346d = qrWithdrawalActivity;
        }

        /* renamed from: a */
        public final void mo82872a(C41238w wVar) {
            this.f83346d.m101090u3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82872a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.QrWithdrawalActivity$i */
    /* synthetic */ class C34386i extends C41535k implements C43075l {
        C34386i(Object obj) {
            super(1, obj, QrWithdrawalActivity.class, "openCardSelectorActionSheet", "openCardSelectorActionSheet(Lge/bog/mobilebank/qrwithdrawal/presentation/cardchooser/model/CardChooserData;)V", 0);
        }

        /* renamed from: b */
        public final void mo82873b(CardChooserData cardChooserData) {
            C41536l.m120489i(cardChooserData, "p0");
            ((QrWithdrawalActivity) this.receiver).m101075f3(cardChooserData);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82873b((CardChooserData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.QrWithdrawalActivity$j */
    /* synthetic */ class C34387j extends C41535k implements C43075l {
        C34387j(Object obj) {
            super(1, obj, QrWithdrawalActivity.class, "showSca", "showSca(Lkotlin/Pair;)V", 0);
        }

        /* renamed from: b */
        public final void mo82874b(C41224m mVar) {
            C41536l.m120489i(mVar, "p0");
            ((QrWithdrawalActivity) this.receiver).m101093x3(mVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82874b((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.QrWithdrawalActivity$k */
    /* synthetic */ class C34388k extends C41535k implements C43075l {
        C34388k(Object obj) {
            super(1, obj, QrWithdrawalActivity.class, "handleWithdrawalError", "handleWithdrawalError(Lge/bog/mobilebank/qrwithdrawal/presentation/model/WithdrawalErrorUiModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo82875b(C38275c cVar) {
            C41536l.m120489i(cVar, "p0");
            ((QrWithdrawalActivity) this.receiver).m101071b3(cVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82875b((C38275c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.QrWithdrawalActivity$l */
    /* synthetic */ class C34389l extends C41535k implements C43075l {
        C34389l(Object obj) {
            super(1, obj, QrWithdrawalActivity.class, "toggleButtonLoading", "toggleButtonLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo82876b(boolean z) {
            ((QrWithdrawalActivity) this.receiver).m101094y3(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82876b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.QrWithdrawalActivity$m */
    /* synthetic */ class C34390m extends C41535k implements C43075l {
        C34390m(Object obj) {
            super(1, obj, QrWithdrawalActivity.class, "openResultScreen", "openResultScreen(Lge/bog/mobilebank/qrwithdrawal/presentation/resultpage/QrResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo82877b(QrResult qrResult) {
            C41536l.m120489i(qrResult, "p0");
            ((QrWithdrawalActivity) this.receiver).m101076g3(qrResult);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82877b((QrResult) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.QrWithdrawalActivity$n */
    static final class C34391n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CardChooserData f83347d;

        /* renamed from: e */
        final /* synthetic */ QrWithdrawalActivity f83348e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34391n(CardChooserData cardChooserData, QrWithdrawalActivity qrWithdrawalActivity) {
            super(0);
            this.f83347d = cardChooserData;
            this.f83348e = qrWithdrawalActivity;
        }

        public final void invoke() {
            C37868a.f90931J.mo91219a(this.f83347d).mo4576A1(this.f83348e.getSupportFragmentManager(), (String) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.QrWithdrawalActivity$o */
    static final class C34392o implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f83349a;

        C34392o(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f83349a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f83349a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f83349a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.QrWithdrawalActivity$p */
    public static final class C34393p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f83350d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34393p(ComponentActivity componentActivity) {
            super(0);
            this.f83350d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f83350d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.QrWithdrawalActivity$q */
    public static final class C34394q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f83351d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f83352e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34394q(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f83351d = aVar;
            this.f83352e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f83351d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f83352e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.QrWithdrawalActivity$r */
    static final class C34395r extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ QrWithdrawalActivity f83353d;

        /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.QrWithdrawalActivity$r$a */
        static final class C34396a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ QrWithdrawalActivity f83354d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C34396a(QrWithdrawalActivity qrWithdrawalActivity) {
                super(0);
                this.f83354d = qrWithdrawalActivity;
            }

            /* renamed from: b */
            public final C34402d invoke() {
                String str;
                String stringExtra;
                C34402d.C34421i a3 = this.f83354d.mo82865a3();
                Intent intent = this.f83354d.getIntent();
                String str2 = "";
                if (intent == null || (str = intent.getStringExtra("ed")) == null) {
                    str = str2;
                }
                Intent intent2 = this.f83354d.getIntent();
                if (!(intent2 == null || (stringExtra = intent2.getStringExtra("AID")) == null)) {
                    str2 = stringExtra;
                }
                return a3.mo32551a(str, str2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34395r(QrWithdrawalActivity qrWithdrawalActivity) {
            super(0);
            this.f83353d = qrWithdrawalActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C34396a(this.f83353d));
        }
    }

    /* renamed from: W2 */
    private final SpannableStringBuilder m101067W2(List list, String str) {
        SpannableStringBuilder append = new SpannableStringBuilder().append(C32343x.m95388F("qr.atm.withdrawal.page.available.banknotes", new Object[0]), new TextAppearanceSpan(this, C31642f.f78229b), 33).append(C41358y.m120017g0(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new C34381d(str), 30, (Object) null), new TextAppearanceSpan(this, C31642f.QrAmount), 33);
        C41536l.m120488h(append, "ccy: String): SpannableS…E_EXCLUSIVE\n            )");
        return append;
    }

    /* renamed from: X2 */
    private final C36335c m101068X2() {
        return (C36335c) this.f83342I.getValue();
    }

    /* renamed from: Y2 */
    private final SpannableStringBuilder m101069Y2(String str) {
        SpannableStringBuilder append = new SpannableStringBuilder().append(C32343x.m95388F("qr.atm.withdrawal.page.withdrawal.limit.left", new Object[0]), new TextAppearanceSpan(this, C31642f.f78229b), 33);
        String h = C32303f.m95197h("GEL");
        SpannableStringBuilder append2 = append.append(" " + str + h, new TextAppearanceSpan(this, C31642f.QrAmount), 33);
        C41536l.m120488h(append2, "SpannableStringBuilder()…E_EXCLUSIVE\n            )");
        return append2;
    }

    /* renamed from: Z2 */
    private final C34402d m101070Z2() {
        return (C34402d) this.f83341H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public final void m101071b3(C38275c cVar) {
        String str;
        StringSource a = cVar.mo91825a();
        if (a == null || (str = C34646b.m101752f(a, (Context) null, 1, (Object) null)) == null) {
            str = getString(C31641e.f78228a);
            C41536l.m120488h(str, "getString(R.string.error_loading_data)");
        }
        String str2 = str;
        int i = C34379b.f83343a[cVar.mo91826b().ordinal()];
        if (i == 1) {
            FrameLayout frameLayout = m101068X2().f87688n;
            C41536l.m120488h(frameLayout, "binding.errorContainer");
            C32343x.m95447f1(frameLayout);
        } else if (i == 2) {
            C12910e.m48790h(this, str2, (C12902d.C12905b) null, false, 6, (Object) null);
        } else if (i == 3) {
            m101090u3();
        } else if (i == 4) {
            m101076g3(new QrResult.Error(C34646b.m101749c(str2)));
        }
    }

    /* renamed from: c3 */
    private final void m101072c3() {
        getSupportFragmentManager().mo4367F1("RESULT_CARD_SELECTED", this, new C37573i(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public static final void m101073d3(QrWithdrawalActivity qrWithdrawalActivity, String str, Bundle bundle) {
        C41536l.m120489i(qrWithdrawalActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        C37575k Rw = qrWithdrawalActivity.m101070Z2().mo82905Rw();
        Parcelable parcelable = bundle.getParcelable("RESULT_CARD_SELECTED");
        C41536l.m120486f(parcelable);
        Rw.mo82896Gi((CardUiModel) parcelable);
    }

    /* renamed from: e3 */
    private final void m101074e3() {
        m101070Z2().mo82907Sw().mo82899M4().mo4819k(this, new C34392o(new C34382e(this)));
        m101070Z2().mo82907Sw().mo82915a().mo4819k(this, new C34392o(new C34383f(this)));
        m101070Z2().mo82907Sw().mo82911X0().mo4819k(this, new C34392o(new C34384g(this)));
        m101070Z2().mo82907Sw().mo82897Ka().mo4819k(this, new C34392o(new C34385h(this)));
        C37224b.m109963b(m101070Z2().mo82907Sw().mo82894Cp(), this, new C34386i(this));
        C37224b.m109963b(m101070Z2().mo82907Sw().mo82904R2(), this, new C34387j(this));
        m101070Z2().mo82907Sw().mo82920x0().mo4819k(this, new C34392o(new C34388k(this)));
        m101070Z2().mo82907Sw().mo82921x1().mo4819k(this, new C34392o(new C34389l(this)));
        C37224b.m109963b(m101070Z2().mo82907Sw().mo82895Ed(), this, new C34390m(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public final void m101075f3(CardChooserData cardChooserData) {
        InputExtensionKt.m101732d(m101068X2().f87691q.getTextInput(), new C34391n(cardChooserData, this));
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public final void m101076g3(QrResult qrResult) {
        QrResultPageActivity.f83450H.mo83037a(qrResult, this);
        finish();
    }

    /* renamed from: h3 */
    private final void m101077h3() {
        Intent flags = new Intent(this, MainActivity.class).setFlags(872415232);
        C41536l.m120488h(flags, "Intent(this, MainActivit…_SINGLE_TOP\n            )");
        startActivity(flags);
        finish();
    }

    /* renamed from: i3 */
    private final void m101078i3(List list) {
        m101068X2().f87683i.mo35190t();
        m101068X2().f87683i.setOnChipActivatedChangedListener(new C37565a(this, list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ChipGroup chipGroup = m101068X2().f87683i;
            Chip chip = new Chip(this, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            chip.setChipTitle(str);
            chip.setChipType(C18167d.CHOICE_CHIP);
            chip.setTag(str);
            if (list.indexOf(str) == 0) {
                chip.setActivated(true);
            }
            chipGroup.mo35183o(chip);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public static final void m101079j3(QrWithdrawalActivity qrWithdrawalActivity, List list, Chip chip, int i) {
        C41536l.m120489i(qrWithdrawalActivity, "this$0");
        C41536l.m120489i(list, "$chipsList");
        C41536l.m120489i(chip, "<anonymous parameter 0>");
        qrWithdrawalActivity.m101070Z2().mo82905Rw().mo82903Qv((String) list.get(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public final void m101080k3(C31128a aVar) {
        CountDownTimerView countDownTimerView = m101068X2().f87695u.f87702e;
        C41536l.m120488h(countDownTimerView, "binding.toolbar.timer");
        C32343x.m95483r1(countDownTimerView, aVar instanceof C31128a.C31131c, false, 2, (Object) null);
        FrameLayout frameLayout = m101068X2().f87692r;
        C41536l.m120488h(frameLayout, "binding.progressBar");
        C32343x.m95483r1(frameLayout, aVar instanceof C31128a.C31130b, false, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public final void m101081l3(C38272a aVar) {
        boolean z;
        if (aVar.mo91817e() != null) {
            m101068X2().f87687m.setText(m101069Y2(aVar.mo91817e()));
        }
        TextView textView = m101068X2().f87687m;
        C41536l.m120488h(textView, "binding.dailyLimit");
        if (aVar.mo91817e() != null) {
            z = true;
        } else {
            z = false;
        }
        C32343x.m95483r1(textView, z, false, 2, (Object) null);
        m101068X2().f87679e.setText(m101067W2(aVar.mo91815c(), aVar.mo91820g()));
        m101068X2().f87691q.setSuffix(" " + C32303f.m95197h(aVar.mo91820g()));
        CardData d = aVar.mo91816d();
        if (d != null) {
            CreditCardSmallPickerView creditCardSmallPickerView = m101068X2().f87681g;
            String g = aVar.mo91816d().mo82960g();
            Integer f = aVar.mo91816d().mo82959f();
            String d2 = aVar.mo91816d().mo82955d();
            if (d2 == null) {
                d2 = C32343x.m95388F("qr.atm.withdrawal.page.select.card", new Object[0]);
            }
            creditCardSmallPickerView.setCreditCard(new CreditCardSmallPickerView.C13279b.C13281b(g, f, d2, false, aVar.mo91816d().mo82957e()));
            InlineFeedback2 inlineFeedback2 = m101068X2().f87686l;
            C41536l.m120488h(inlineFeedback2, "binding.creditCardFeedback");
            C32343x.m95483r1(inlineFeedback2, d.mo82964j(), false, 2, (Object) null);
            CreditCardSmallPickerView creditCardSmallPickerView2 = m101068X2().f87681g;
            String F = C32343x.m95388F("qr.atm.withdrawal.page.select.card", new Object[0]);
            String i = aVar.mo91816d().mo82963i();
            if (i == null) {
                i = C32343x.m95388F("qr.atm.withdrawal.page.select.card", new Object[0]);
            }
            creditCardSmallPickerView2.mo35468h(new CreditCardSmallPickerView.C13282c(F, i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public final void m101082m3(C41224m mVar) {
        m101083n3(((Number) mVar.mo95675a()).intValue());
        m101078i3((List) mVar.mo95676b());
    }

    /* renamed from: n3 */
    private final void m101083n3(int i) {
        m101068X2().f87695u.f87702e.setStartTimeSeconds(i);
        m101068X2().f87695u.f87702e.mo35419i();
        m101068X2().f87695u.f87702e.setOnTimerExpiredListener(new C37572h(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public static final void m101084o3(QrWithdrawalActivity qrWithdrawalActivity) {
        C41536l.m120489i(qrWithdrawalActivity, "this$0");
        qrWithdrawalActivity.m101070Z2().mo82905Rw().mo82906S8();
    }

    /* renamed from: p3 */
    private final void m101085p3() {
        m101068X2().f87691q.setHint(BankApiResponse.SUCCESSFUL_RESPONSE_CODE);
        m101068X2().f87691q.setInfoText(C32343x.m95388F("qr.atm.withdrawal.page.add.amount", new Object[0]));
        m101068X2().f87685k.setButtonText(C32343x.m95388F("qr.atm.withdrawal.page.button.continue", new Object[0]));
        m101068X2().f87686l.setTitle(C32343x.m95388F("qr.atm.withdrawal.page.credit.card.selected.commission", new Object[0]));
        m101068X2().f87691q.getTextInput().requestFocus();
        m101068X2().f87681g.mo35468h(new CreditCardSmallPickerView.C13282c(C32343x.m95388F("qr.atm.withdrawal.page.select.card", new Object[0]), C32343x.m95388F("qr.atm.withdrawal.page.select.card", new Object[0])));
        m101068X2().f87681g.setOnClickListener(new C37566b(this));
        m101068X2().f87691q.setTextChangeListener(new C37567c(this));
        m101068X2().f87685k.setOnClickListener(new C37568d(this));
        m101068X2().f87693s.setOnClickListener(new C37569e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public static final void m101086q3(QrWithdrawalActivity qrWithdrawalActivity, View view) {
        C41536l.m120489i(qrWithdrawalActivity, "this$0");
        qrWithdrawalActivity.m101070Z2().onRefresh(6);
        FrameLayout frameLayout = qrWithdrawalActivity.m101068X2().f87688n;
        C41536l.m120488h(frameLayout, "binding.errorContainer");
        C32343x.m95455i0(frameLayout);
        FrameLayout frameLayout2 = qrWithdrawalActivity.m101068X2().f87692r;
        C41536l.m120488h(frameLayout2, "binding.progressBar");
        C32343x.m95447f1(frameLayout2);
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public static final void m101087r3(QrWithdrawalActivity qrWithdrawalActivity, View view) {
        C41536l.m120489i(qrWithdrawalActivity, "this$0");
        qrWithdrawalActivity.m101070Z2().mo82905Rw().mo82914Ze();
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public static final void m101088s3(QrWithdrawalActivity qrWithdrawalActivity, String str) {
        C41536l.m120489i(qrWithdrawalActivity, "this$0");
        qrWithdrawalActivity.m101070Z2().mo82905Rw().mo82917d(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public static final void m101089t3(QrWithdrawalActivity qrWithdrawalActivity, View view) {
        C41536l.m120489i(qrWithdrawalActivity, "this$0");
        qrWithdrawalActivity.m101070Z2().mo82905Rw().mo82919pt();
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public final void m101090u3() {
        C13310d dVar = new C13310d();
        dVar.mo35647a2(C13310d.C13312b.TITLE_TWO_BUTTON);
        dVar.mo35648c2(C32343x.m95388F("qr.atm.withdrawal.timeOut.dialog.main.text", new Object[0]));
        dVar.mo35639Q1(C32343x.m95388F("qr.atm.withdrawal.timeOut.dialog.info.text", new Object[0]));
        dVar.mo35646Z1(C32343x.m95388F("qr.atm.withdrawal.timeOut.dialog.button.continue", new Object[0]));
        dVar.mo35642U1(C32343x.m95388F("qr.atm.withdrawal.timeOut.dialog.button.exit", new Object[0]));
        dVar.mo4586v1(false);
        dVar.mo35645Y1(new C37570f(dVar, this));
        dVar.mo35641T1(new C37571g(dVar, this));
        dVar.mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public static final void m101091v3(C13310d dVar, QrWithdrawalActivity qrWithdrawalActivity, Button button) {
        C41536l.m120489i(dVar, "$this_apply");
        C41536l.m120489i(qrWithdrawalActivity, "this$0");
        C41536l.m120489i(button, "it");
        C32343x.m95395I0(dVar, "qr_withdrawal_page", (String) null, "timeout_dialog_box_continue_button_click", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
        qrWithdrawalActivity.mo86447x2(QrScannerActivity.class);
        qrWithdrawalActivity.finish();
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public static final void m101092w3(C13310d dVar, QrWithdrawalActivity qrWithdrawalActivity, Button button) {
        C41536l.m120489i(dVar, "$this_apply");
        C41536l.m120489i(qrWithdrawalActivity, "this$0");
        C41536l.m120489i(button, "it");
        C32343x.m95395I0(dVar, "qr_withdrawal_page", (String) null, "timeout_dialog_box_close_button_click", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
        qrWithdrawalActivity.m101077h3();
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public final void m101093x3(C41224m mVar) {
        C41185v e = C41185v.C41187b.m119423e(C41185v.f97155C, (String) mVar.mo95678e(), (HashMap) mVar.mo95680f(), (C41143c) null, 4, (Object) null);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        e.mo4576A1(supportFragmentManager, (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public final void m101094y3(boolean z) {
        m101068X2().f87685k.setLoading(z);
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        m101070Z2().mo82905Rw().mo82916bv(str, str2, str3);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        C41185v f = C20288a.m66331f(supportFragmentManager, (String) null, 2, (Object) null);
        if (f != null) {
            f.mo4577k1();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m101068X2().mo3946b());
        super.mo37451O1(bundle);
        m101074e3();
        m101072c3();
        m101085p3();
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        C12910e.m48790h(this, str, (C12902d.C12905b) null, false, 6, (Object) null);
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
        m101070Z2().mo82905Rw().mo82918mu(z);
    }

    /* renamed from: a3 */
    public final C34402d.C34421i mo82865a3() {
        C34402d.C34421i iVar = this.f83340G;
        if (iVar != null) {
            return iVar;
        }
        C41536l.m120506z("viewModelFactory");
        return null;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C41536l.m120489i(menu, "menu");
        return false;
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("qr.atm.withdrawal.page.main.header", new Object[0]);
    }
}
