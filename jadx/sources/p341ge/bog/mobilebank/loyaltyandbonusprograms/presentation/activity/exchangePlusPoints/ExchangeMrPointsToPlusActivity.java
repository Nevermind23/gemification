package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import androidx.activity.ComponentActivity;
import androidx.activity.result.C0173b;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0767a;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import et0.C31798a;
import et0.C31799b;
import et0.C31800c;
import et0.C31801d;
import et0.C31804g;
import g91.C32343x;
import g91.C32359z0;
import he1.C41212c;
import he1.C41217g;
import he1.C41233s;
import he1.C41238w;
import java.math.BigDecimal;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o31.C37598f;
import o31.C37613p;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.C32936b;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.C32944c;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.ExchangeMrPointsToPlusViewModel$ViewModel;
import p341ge.bog.mobilebank.shared.helper.InputExtensionKt;
import rs0.C38334a;
import rs0.C38335b;
import rs0.C38338e;
import ue1.C43064a;
import ue1.C43075l;
import vs0.C39444c;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.ExchangeMrPointsToPlusActivity */
public final class ExchangeMrPointsToPlusActivity extends C32947d {

    /* renamed from: K */
    public static final C32907a f80760K = new C32907a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private final C41217g f80761G = new C1617p0(C41520a0.m120436b(ExchangeMrPointsToPlusViewModel$ViewModel.class), new C32918l(this), new C32917k(this), new C32919m((C43064a) null, this));

    /* renamed from: H */
    private final C41217g f80762H = C41219i.m119470b(new C32910d(this));

    /* renamed from: I */
    private final C41217g f80763I = C41219i.m119470b(new C32908b(this));

    /* renamed from: J */
    private final C41217g f80764J = C41219i.m119470b(new C32909c(this));

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.ExchangeMrPointsToPlusActivity$a */
    public static final class C32907a {
        private C32907a() {
        }

        public /* synthetic */ C32907a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo74783a(Context context, String str, String str2, C0173b bVar) {
            C41238w wVar;
            C41536l.m120489i(context, "context");
            C41536l.m120489i(str, "amexPoints");
            C41536l.m120489i(str2, "amexAmount");
            Intent a = C37613p.m110614a(new Intent(context, ExchangeMrPointsToPlusActivity.class), C41233s.m119492a("AMEX_POINTS_KEY", str), C41233s.m119492a("AMEX_AMOUNT_KEY", str2));
            if (bVar != null) {
                bVar.mo404a(a);
                wVar = C41238w.f97225a;
            } else {
                wVar = null;
            }
            if (wVar == null) {
                context.startActivity(a);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.ExchangeMrPointsToPlusActivity$b */
    static final class C32908b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ExchangeMrPointsToPlusActivity f80765d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32908b(ExchangeMrPointsToPlusActivity exchangeMrPointsToPlusActivity) {
            super(0);
            this.f80765d = exchangeMrPointsToPlusActivity;
        }

        public final String invoke() {
            Intent intent = this.f80765d.getIntent();
            if (intent != null) {
                return intent.getStringExtra("AMEX_POINTS_KEY");
            }
            return null;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.ExchangeMrPointsToPlusActivity$c */
    static final class C32909c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ExchangeMrPointsToPlusActivity f80766d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32909c(ExchangeMrPointsToPlusActivity exchangeMrPointsToPlusActivity) {
            super(0);
            this.f80766d = exchangeMrPointsToPlusActivity;
        }

        public final String invoke() {
            Intent intent = this.f80766d.getIntent();
            if (intent != null) {
                return intent.getStringExtra("AMEX_AMOUNT_KEY");
            }
            return null;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.ExchangeMrPointsToPlusActivity$d */
    static final class C32910d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ExchangeMrPointsToPlusActivity f80767d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32910d(ExchangeMrPointsToPlusActivity exchangeMrPointsToPlusActivity) {
            super(0);
            this.f80767d = exchangeMrPointsToPlusActivity;
        }

        /* renamed from: b */
        public final C39444c invoke() {
            C39444c d = C39444c.m114627d(this.f80767d.getLayoutInflater());
            C41536l.m120488h(d, "inflate(layoutInflater)");
            return d;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.ExchangeMrPointsToPlusActivity$e */
    static final class C32911e implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f80768a;

        C32911e(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f80768a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f80768a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f80768a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.ExchangeMrPointsToPlusActivity$f */
    public static final class C32912f implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ EditText f80769d;

        /* renamed from: e */
        final /* synthetic */ ExchangeMrPointsToPlusActivity f80770e;

        C32912f(EditText editText, ExchangeMrPointsToPlusActivity exchangeMrPointsToPlusActivity) {
            this.f80769d = editText;
            this.f80770e = exchangeMrPointsToPlusActivity;
        }

        public void afterTextChanged(Editable editable) {
            this.f80769d.removeTextChangedListener(this);
            if (editable != null) {
                InputExtensionKt.m101730b(editable);
            }
            this.f80770e.m97122X2().mo74797vw().mo72245wg(String.valueOf(editable));
            this.f80769d.addTextChangedListener(this);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.ExchangeMrPointsToPlusActivity$g */
    static final class C32913g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ExchangeMrPointsToPlusActivity f80771d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32913g(ExchangeMrPointsToPlusActivity exchangeMrPointsToPlusActivity) {
            super(1);
            this.f80771d = exchangeMrPointsToPlusActivity;
        }

        /* renamed from: a */
        public final void mo74790a(boolean z) {
            int i;
            ExchangeMrPointsToPlusActivity exchangeMrPointsToPlusActivity = this.f80771d;
            if (z) {
                i = C38334a.f91847b;
            } else {
                i = C38334a.f91846a;
            }
            exchangeMrPointsToPlusActivity.m97110M(i);
            this.f80771d.m97121W2().f93690C.mo37106h0(z, true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74790a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.ExchangeMrPointsToPlusActivity$h */
    static final class C32914h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ExchangeMrPointsToPlusActivity f80772d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32914h(ExchangeMrPointsToPlusActivity exchangeMrPointsToPlusActivity) {
            super(1);
            this.f80772d = exchangeMrPointsToPlusActivity;
        }

        /* renamed from: a */
        public final void mo74791a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            ExchangeMrPointsToPlusActivity.super.onBackPressed();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74791a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.ExchangeMrPointsToPlusActivity$i */
    static final class C32915i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ExchangeMrPointsToPlusActivity f80773d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32915i(ExchangeMrPointsToPlusActivity exchangeMrPointsToPlusActivity) {
            super(1);
            this.f80773d = exchangeMrPointsToPlusActivity;
        }

        /* renamed from: a */
        public final void mo74792a(C32936b bVar) {
            if (bVar instanceof C32936b.C32938b) {
                this.f80773d.m97124Z2();
            } else if (bVar instanceof C32936b.C32940d) {
                C32936b.C32940d dVar = (C32936b.C32940d) bVar;
                this.f80773d.m97129e3(dVar.mo74822b(), dVar.mo74823c(), dVar.mo74821a());
            } else if (bVar instanceof C32936b.C32941e) {
                this.f80773d.m97121W2().f93689B.mo53597e();
            } else if (bVar instanceof C32936b.C32937a) {
                this.f80773d.m97131g3(((C32936b.C32937a) bVar).mo74816a());
            } else if (bVar instanceof C32936b.C32939c) {
                this.f80773d.m97128d3(false, false);
                this.f80773d.m97121W2().f93696h.getButton().setLoading(((C32936b.C32939c) bVar).mo74817a());
            } else if (bVar instanceof C32936b.C32942f) {
                this.f80773d.m97121W2().f93704p.mo35920c();
            } else if (bVar instanceof C32936b.C32943g) {
                C32936b.C32943g gVar = (C32936b.C32943g) bVar;
                this.f80773d.m97121W2().f93704p.setInputText(gVar.mo74827a());
                this.f80773d.m97121W2().f93704p.getTextInput().setSelection(gVar.mo74827a().length());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74792a((C32936b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.ExchangeMrPointsToPlusActivity$j */
    static final class C32916j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ExchangeMrPointsToPlusActivity f80774d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32916j(ExchangeMrPointsToPlusActivity exchangeMrPointsToPlusActivity) {
            super(1);
            this.f80774d = exchangeMrPointsToPlusActivity;
        }

        /* renamed from: a */
        public final void mo74793a(C32944c cVar) {
            C41536l.m120489i(cVar, "exchangeMrToPlusUiEvent");
            if (cVar instanceof C32944c.C32945a) {
                this.f80774d.m97123Y2(((C32944c.C32945a) cVar).mo74831a());
            } else if (cVar instanceof C32944c.C32946b) {
                this.f80774d.m97130f3((C32944c.C32946b) cVar);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74793a((C32944c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.ExchangeMrPointsToPlusActivity$k */
    public static final class C32917k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f80775d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32917k(ComponentActivity componentActivity) {
            super(0);
            this.f80775d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f80775d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.ExchangeMrPointsToPlusActivity$l */
    public static final class C32918l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f80776d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32918l(ComponentActivity componentActivity) {
            super(0);
            this.f80776d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f80776d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.ExchangeMrPointsToPlusActivity$m */
    public static final class C32919m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f80777d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f80778e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32919m(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f80777d = aVar;
            this.f80778e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f80777d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f80778e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public final void m97110M(int i) {
        m97121W2().f93690C.setBackgroundColor(C0767a.m2893c(this, i));
    }

    /* renamed from: S2 */
    private final String m97117S2(String str, BigDecimal bigDecimal) {
        BigDecimal multiply = new BigDecimal(str).multiply(bigDecimal);
        C41536l.m120488h(multiply, "this.multiply(other)");
        String N = C32359z0.m95543N(multiply.toString());
        C41536l.m120488h(N, "getFormatedAmountFromTet…Commas(result.toString())");
        return N;
    }

    /* renamed from: T2 */
    static /* synthetic */ String m97118T2(ExchangeMrPointsToPlusActivity exchangeMrPointsToPlusActivity, String str, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 2) != 0) {
            bigDecimal = new BigDecimal(100);
        }
        return exchangeMrPointsToPlusActivity.m97117S2(str, bigDecimal);
    }

    /* renamed from: U2 */
    private final String m97119U2() {
        return (String) this.f80763I.getValue();
    }

    /* renamed from: V2 */
    private final String m97120V2() {
        return (String) this.f80764J.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public final C39444c m97121W2() {
        return (C39444c) this.f80762H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public final ExchangeMrPointsToPlusViewModel$ViewModel m97122X2() {
        return (ExchangeMrPointsToPlusViewModel$ViewModel) this.f80761G.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public final void m97123Y2(Throwable th) {
        m97128d3(true, true);
        mo74709H1(th);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public final void m97124Z2() {
        C39444c W2 = m97121W2();
        W2.f93689B.mo53596d();
        W2.f93694f.setText(C32343x.m95388F("text.MR.to.PLUS.service.error.text", new Object[0]));
        W2.f93688A.setButtonIcon(getDrawable(C38335b.retry_button_img_selector));
        W2.f93688A.setButtonText(C32343x.m95388F("text.MR.to.PLUS.service.error.refresh.button", new Object[0]));
        W2.f93688A.setOnClickListener(new C31798a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public static final void m97125a3(ExchangeMrPointsToPlusActivity exchangeMrPointsToPlusActivity, View view) {
        C41536l.m120489i(exchangeMrPointsToPlusActivity, "this$0");
        C21481a.onRefresh$default(exchangeMrPointsToPlusActivity.m97122X2(), 0, 1, (Object) null);
    }

    /* renamed from: b3 */
    private final void m97126b3() {
        C39444c W2 = m97121W2();
        W2.f93696h.getButton().setOnClickListener(new C31800c(this, W2));
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public static final void m97127c3(ExchangeMrPointsToPlusActivity exchangeMrPointsToPlusActivity, C39444c cVar, View view) {
        C41536l.m120489i(exchangeMrPointsToPlusActivity, "this$0");
        C41536l.m120489i(cVar, "$this_with");
        exchangeMrPointsToPlusActivity.m97122X2().mo74797vw().mo72244uq(cVar.f93704p.getInputText());
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public final void m97128d3(boolean z, boolean z2) {
        Input input = m97121W2().f93704p;
        input.getTextInput().setEnabled(z);
        input.setInputButtonEnabled(z2);
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public final void m97129e3(String str, String str2, String str3) {
        C39444c W2 = m97121W2();
        W2.f93710v.setText(m97118T2(this, str, (BigDecimal) null, 2, (Object) null));
        W2.f93711w.setText(C32343x.m95406O(m97118T2(this, str2, (BigDecimal) null, 2, (Object) null), "GEL"));
        Input input = W2.f93704p;
        String F = C32343x.m95388F("text.MR.to.PLUS.exchange.points.in.Gel", new Object[0]);
        String O = C32343x.m95406O(m97118T2(this, str3, (BigDecimal) null, 2, (Object) null), "GEL");
        input.setInfoText(F + ": " + O);
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public final void m97130f3(C32944c.C32946b bVar) {
        m97128d3(true, true);
        PointsExchangeSuccessActivity.f80795I.mo74809a(this, bVar.mo74832a());
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public final void m97131g3(ExchangeMrPointsToPlusViewModel$ViewModel.C32924d dVar) {
        String str;
        C39444c W2 = m97121W2();
        m97121W2().f93696h.getButton().setLoading(false);
        W2.f93689B.mo53595c();
        InlineFeedback inlineFeedback = W2.f93698j;
        if (dVar != null) {
            str = dVar.mo74804a();
        } else {
            str = null;
        }
        inlineFeedback.setCaptionText(str);
    }

    /* renamed from: h3 */
    private final void m97132h3() {
        m97121W2().f93708t.setOnScrollChangeListener(new C31801d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: i3 */
    public static final void m97133i3(ExchangeMrPointsToPlusActivity exchangeMrPointsToPlusActivity, NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        C41536l.m120489i(exchangeMrPointsToPlusActivity, "this$0");
        C41536l.m120489i(nestedScrollView, "<anonymous parameter 0>");
        exchangeMrPointsToPlusActivity.m97122X2().mo74800yw(exchangeMrPointsToPlusActivity.m97121W2().f93708t.canScrollVertically(-1));
    }

    /* renamed from: j3 */
    private final void m97134j3() {
        EditText textInput = m97121W2().f93704p.getTextInput();
        textInput.setFilters(new InputFilter[]{new C37598f((Pattern) null, 1, (DefaultConstructorMarker) null)});
        textInput.addTextChangedListener(new C32912f(textInput, this));
    }

    /* renamed from: k3 */
    private final void m97135k3() {
        BigDecimal bigDecimal;
        C39444c W2 = m97121W2();
        String U2 = m97119U2();
        BigDecimal bigDecimal2 = null;
        if (U2 != null) {
            bigDecimal = new BigDecimal(U2).multiply(new BigDecimal(100));
            C41536l.m120488h(bigDecimal, "this.multiply(other)");
        } else {
            bigDecimal = null;
        }
        String N = C32359z0.m95543N(String.valueOf(bigDecimal));
        String V2 = m97120V2();
        if (V2 != null) {
            bigDecimal2 = new BigDecimal(V2).multiply(new BigDecimal(100));
            C41536l.m120488h(bigDecimal2, "this.multiply(other)");
        }
        String N2 = C32359z0.m95543N(String.valueOf(bigDecimal2));
        W2.f93707s.setText(N + " " + getResources().getString(C38338e.f91911l));
        AppCompatTextView appCompatTextView = W2.f93706r;
        C41536l.m120488h(N2, "amexPointsInGel");
        appCompatTextView.setText(C32343x.m95406O(N2, "GEL"));
    }

    /* renamed from: l3 */
    private final void m97136l3() {
        Input input = m97121W2().f93704p;
        input.setHintText((CharSequence) C32343x.m95388F("text.MR.to.PLUS.exchange.points.to.exchange", new Object[0]));
        String F = C32343x.m95388F("text.MR.to.PLUS.exchange.points.in.Gel", new Object[0]);
        input.setInfoText(F + ": 0.00 ₾");
        input.setInputButtonText(C32343x.m95388F("text.MR.to.PLUS.exchange.all", new Object[0]));
        input.setInputButtonClickListener(new C31799b(input, this));
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public static final void m97137m3(Input input, ExchangeMrPointsToPlusActivity exchangeMrPointsToPlusActivity, View view) {
        C41536l.m120489i(input, "$this_with");
        C41536l.m120489i(exchangeMrPointsToPlusActivity, "this$0");
        input.setInputText(String.valueOf(exchangeMrPointsToPlusActivity.m97119U2()));
        input.getTextInput().setSelection(input.getTextInput().getText().toString().length());
    }

    /* renamed from: n3 */
    private final void m97138n3() {
        C31804g ww = m97122X2().mo74798ww();
        C37224b.m109963b(ww.mo72248rd(), this, new C32913g(this));
        C37224b.m109963b(ww.mo72246X(), this, new C32914h(this));
        ww.mo72249u5().mo4819k(this, new C32911e(new C32915i(this)));
        C37224b.m109963b(ww.mo72247na(), this, new C32916j(this));
    }

    /* renamed from: o3 */
    private final void m97139o3() {
        C39444c W2 = m97121W2();
        W2.f93713y.setText(C32343x.m95388F("text.MR.to.PLUS.exchange.points.to.receive", new Object[0]));
        W2.f93713y.setTitle(C32343x.m95388F("text.MR.to.PLUS.exchange.points.in.Gel", new Object[0]));
        W2.f93710v.setText("0.00");
        W2.f93711w.setText("0.00 ₾");
    }

    /* renamed from: p3 */
    private final void m97140p3() {
        C39444c W2 = m97121W2();
        W2.f93696h.getButton().setButtonText(C32343x.m95388F("text.MR.to.PLUS.exchange.button", new Object[0]));
        W2.f93699k.setTitle(C32343x.m95388F("text.MR.to.PLUS.exchange.ratio", new Object[0]));
        W2.f93698j.setTitleText(C32343x.m95388F("text.MR.to.PLUS.exchange.ratio.description", new Object[0]));
        W2.f93691D.setText(C32343x.m95388F("text.MR.to.PLUS.exchange.total.MR", new Object[0]));
        W2.f93691D.setTitle(C32343x.m95388F("text.MR.to.PLUS.exchange.points.in.Gel", new Object[0]));
        m97135k3();
        m97139o3();
        m97136l3();
        m97126b3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m97121W2().mo3946b());
        super.mo70996D2(bundle, m97121W2());
        m97138n3();
        m97140p3();
        m97134j3();
        m97132h3();
    }

    public void onBackPressed() {
        m97122X2().mo74797vw().mo72243l();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("text.MR.to.PLUS.exchange.header", new Object[0]);
    }
}
