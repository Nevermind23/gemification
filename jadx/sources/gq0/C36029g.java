package gq0;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
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
import g91.C32286a1;
import g91.C32290b1;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import hq0.C36178a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import np0.C37442h;
import np0.C37443i;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.form.actionsheet.recommender.model.RecommenderData;
import sp0.C38487f;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: gq0.g */
public final class C36029g extends C36023a {

    /* renamed from: P */
    public static final C36030a f87148P = new C36030a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private C38487f f87149K;

    /* renamed from: L */
    private final C41217g f87150L = C41219i.m119470b(new C36034e(this));

    /* renamed from: M */
    public C36045j f87151M;

    /* renamed from: N */
    private final C41217g f87152N;

    /* renamed from: O */
    private TextWatcher f87153O;

    /* renamed from: gq0.g$a */
    public static final class C36030a {
        private C36030a() {
        }

        public /* synthetic */ C36030a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C36029g mo88748a(RecommenderData recommenderData) {
            C41536l.m120489i(recommenderData, "data");
            C36029g gVar = new C36029g();
            gVar.setArguments(C0908e.m3336b(C41233s.m119492a("EXTRA_RECOMMENDER_DATA", recommenderData)));
            return gVar;
        }
    }

    /* renamed from: gq0.g$b */
    /* synthetic */ class C36031b extends C41535k implements C43075l {
        C36031b(Object obj) {
            super(1, obj, C36029g.class, "onAmountInputSet", "onAmountInputSet(Lge/bog/mobilebank/loanactivation/presentation/activation/form/actionsheet/recommender/model/AmountInputData;)V", 0);
        }

        /* renamed from: b */
        public final void mo88749b(C36178a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((C36029g) this.receiver).m107231s2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo88749b((C36178a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: gq0.g$c */
    static final class C36032c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36029g f87154d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36032c(C36029g gVar) {
            super(1);
            this.f87154d = gVar;
        }

        /* renamed from: a */
        public final void mo88750a(String str) {
            C41536l.m120489i(str, "amount");
            C36029g.m107233u2(this.f87154d, "RESULT_KEY_AMOUNT", str, false, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo88750a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: gq0.g$d */
    static final class C36033d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36029g f87155d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36033d(C36029g gVar) {
            super(1);
            this.f87155d = gVar;
        }

        /* renamed from: a */
        public final void mo88751a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C36029g.m107233u2(this.f87155d, "RESULT_KEY_RESET", (String) null, false, 6, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo88751a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: gq0.g$e */
    static final class C36034e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C36029g f87156d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36034e(C36029g gVar) {
            super(0);
            this.f87156d = gVar;
        }

        /* renamed from: b */
        public final RecommenderData invoke() {
            Parcelable parcelable = this.f87156d.requireArguments().getParcelable("EXTRA_RECOMMENDER_DATA");
            C41536l.m120486f(parcelable);
            return (RecommenderData) parcelable;
        }
    }

    /* renamed from: gq0.g$f */
    static final class C36035f implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f87157a;

        C36035f(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f87157a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f87157a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f87157a.invoke(obj);
        }
    }

    /* renamed from: gq0.g$g */
    public static final class C36036g implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ C36029g f87158d;

        public C36036g(C36029g gVar) {
            this.f87158d = gVar;
        }

        public void afterTextChanged(Editable editable) {
            this.f87158d.m107230r2().mo88768fw().mo88760d(this.f87158d.m107227n2().f92184e.getRawText());
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: gq0.g$h */
    public static final class C36037h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f87159d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36037h(Fragment fragment) {
            super(0);
            this.f87159d = fragment;
        }

        public final Fragment invoke() {
            return this.f87159d;
        }
    }

    /* renamed from: gq0.g$i */
    public static final class C36038i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f87160d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36038i(C43064a aVar) {
            super(0);
            this.f87160d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f87160d.invoke();
        }
    }

    /* renamed from: gq0.g$j */
    public static final class C36039j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f87161d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36039j(C41217g gVar) {
            super(0);
            this.f87161d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f87161d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: gq0.g$k */
    public static final class C36040k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f87162d;

        /* renamed from: e */
        final /* synthetic */ C41217g f87163e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36040k(C43064a aVar, C41217g gVar) {
            super(0);
            this.f87162d = aVar;
            this.f87163e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f87162d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f87163e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: gq0.g$l */
    static final class C36041l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C36029g f87164d;

        /* renamed from: gq0.g$l$a */
        static final class C36042a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C36029g f87165d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C36042a(C36029g gVar) {
                super(0);
                this.f87165d = gVar;
            }

            /* renamed from: b */
            public final C36048m invoke() {
                return this.f87165d.mo88747o2().mo32814a(this.f87165d.m107228p2());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36041l(C36029g gVar) {
            super(0);
            this.f87164d = gVar;
        }

        public final C1620q0.C1624b invoke() {
            return C32286a1.f79687a.mo72809a(new C36042a(this.f87164d));
        }
    }

    public C36029g() {
        C36041l lVar = new C36041l(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C36038i(new C36037h(this)));
        this.f87152N = C1514j0.m5374c(this, C41520a0.m120436b(C36048m.class), new C36039j(a), new C36040k((C43064a) null, a), lVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: A2 */
    public static final void m107216A2(C13310d dVar, Button button) {
        C41536l.m120489i(dVar, "$this_apply");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: B2 */
    public static final void m107217B2(C36029g gVar, Button button) {
        C41536l.m120489i(gVar, "this$0");
        C41536l.m120489i(button, "it");
        gVar.m107230r2().mo88768fw().mo88759Fd();
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public final C38487f m107227n2() {
        C38487f fVar = this.f87149K;
        C41536l.m120486f(fVar);
        return fVar;
    }

    private final void observeData() {
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C36047l gw = m107230r2().mo88769gw();
        gw.mo88765vo().mo4819k(viewLifecycleOwner, new C36035f(new C36031b(this)));
        C37224b.m109963b(gw.mo88763Uc(), viewLifecycleOwner, new C36032c(this));
        C37224b.m109963b(gw.mo88764q7(), viewLifecycleOwner, new C36033d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public final RecommenderData m107228p2() {
        return (RecommenderData) this.f87150L.getValue();
    }

    /* renamed from: q2 */
    private final Spanned m107229q2() {
        SpannableStringBuilder append = new SpannableStringBuilder().append(C32343x.m95388F("loan.activation.recommender.action.sheet.info.android", new Object[0])).append(" ");
        String string = getString(C37442h.recommender_feedback_amount_from, C32343x.m95404N(m107228p2().mo73236d(), m107228p2().mo73234a(), true));
        Context context = getContext();
        int i = C37443i.RecommenderFeedbackAmount;
        SpannableStringBuilder append2 = append.append(string, new TextAppearanceSpan(context, i), 33).append(" ").append(getString(C37442h.recommender_feedback_amount_to, C32343x.m95404N(m107228p2().mo73235b(), m107228p2().mo73234a(), true)), new TextAppearanceSpan(getContext(), i), 33);
        C41536l.m120488h(append2, "SpannableStringBuilder()…E_EXCLUSIVE\n            )");
        return append2;
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public final C36048m m107230r2() {
        return (C36048m) this.f87152N.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public final void m107231s2(C36178a aVar) {
        if (!C41536l.m120484d(aVar.mo88932a(), m107227n2().f92184e.getRawText())) {
            m107227n2().f92184e.getTextInput().removeTextChangedListener(this.f87153O);
            m107227n2().f92184e.getTextInput().setText(aVar.mo88932a());
            m107227n2().f92184e.getTextInput().addTextChangedListener(this.f87153O);
        }
        m107227n2().f92185f.setEnabled(aVar.mo88933b());
    }

    /* renamed from: t2 */
    private final void m107232t2(String str, String str2, boolean z) {
        C1533o.m5445b(this, "REQUEST_KEY_RECOMMENDER", C0908e.m3336b(C41233s.m119492a(str, str2)));
        if (z) {
            mo4577k1();
        }
    }

    /* renamed from: u2 */
    static /* synthetic */ void m107233u2(C36029g gVar, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            z = true;
        }
        gVar.m107232t2(str, str2, z);
    }

    /* renamed from: v2 */
    private final void m107234v2() {
        mo26370a2(C32343x.m95388F("loan.activation.recommender.action.sheet.header", new Object[0]));
        C32290b1.m95115e(m107227n2().f92184e.getTextInput());
        m107227n2().f92187h.setSpannableTitle(m107229q2());
        Input input = m107227n2().f92184e;
        input.setHintText((CharSequence) C32343x.m95388F("loan.activation.recommender.field.loan.amount", new Object[0]));
        input.setInputButtonText(C32343x.m95388F("loan.activation.recommender.field.loan.amount.max", new Object[0]));
        input.getTextInput().setInputType(8194);
        EditText textInput = input.getTextInput();
        C36036g gVar = new C36036g(this);
        textInput.addTextChangedListener(gVar);
        this.f87153O = gVar;
        input.setInputButtonClickListener(new C36024b(this));
        Button button = m107227n2().f92185f;
        button.setButtonText(C32343x.m95388F("loan.activation.recommender.button.next", new Object[0]));
        button.setOnClickListener(new C36025c(this));
        Button button2 = m107227n2().f92186g;
        button2.setButtonText(C32343x.m95388F("loan.activation.recommender.button.initial.terms", new Object[0]));
        button2.setOnClickListener(new C36026d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public static final void m107235w2(C36029g gVar, View view) {
        C41536l.m120489i(gVar, "this$0");
        m107233u2(gVar, "RESULT_KEY_MAX_AMOUNT", (String) null, false, 2, (Object) null);
        gVar.m107230r2().mo88768fw().mo88761p6();
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public static final void m107236x2(C36029g gVar, View view) {
        C41536l.m120489i(gVar, "this$0");
        gVar.m107230r2().mo88768fw().mo88762s2();
    }

    /* access modifiers changed from: private */
    /* renamed from: y2 */
    public static final void m107237y2(C36029g gVar, View view) {
        C41536l.m120489i(gVar, "this$0");
        gVar.m107238z2();
    }

    /* renamed from: z2 */
    private final void m107238z2() {
        C13310d dVar = new C13310d();
        dVar.mo35647a2(C13310d.C13312b.TITLE_TWO_BUTTON);
        dVar.mo35648c2(C32343x.m95388F("loan.activation.recommender.button.initial.terms.header", new Object[0]));
        dVar.mo35639Q1(C32343x.m95388F("loan.activation.recommender.button.initial.terms.info", new Object[0]));
        dVar.mo35646Z1(C32343x.m95388F("loan.activation.recommender.button.initial.terms.button.yes", new Object[0]));
        dVar.mo35642U1(C32343x.m95388F("loan.activation.recommender.button.initial.terms.button.no", new Object[0]));
        dVar.mo35645Y1(new C36027e(this));
        dVar.mo35641T1(new C36028f(dVar));
        dVar.mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f87149K = C38487f.m112961d(layoutInflater, viewGroup, true);
    }

    /* renamed from: b */
    public void mo26371b() {
        super.mo26371b();
        m107233u2(this, "RESULT_KEY_CLOSE", (String) null, false, 2, (Object) null);
    }

    /* renamed from: o2 */
    public final C36045j mo88747o2() {
        C36045j jVar = this.f87151M;
        if (jVar != null) {
            return jVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f87149K = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        observeData();
        m107234v2();
    }
}
