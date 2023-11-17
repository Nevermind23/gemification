package p858pr;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import g91.C32343x;
import he1.C41217g;
import he1.C41233s;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;
import p603si.C17799b;
import p90.C27273d;
import ue1.C43064a;

/* renamed from: pr.f */
public final class C27612f extends C27605a {

    /* renamed from: J */
    public static final C27613a f70550J = new C27613a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private C27273d f70551G;

    /* renamed from: H */
    private final C41217g f70552H = C41219i.m119470b(new C27615c(this));

    /* renamed from: I */
    private final C41217g f70553I = C41219i.m119470b(new C27614b(this));

    /* renamed from: pr.f$a */
    public static final class C27613a {
        private C27613a() {
        }

        public /* synthetic */ C27613a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C27612f mo66983a(String str, String str2) {
            C41536l.m120489i(str, "minAmount");
            C41536l.m120489i(str2, "maxAmount");
            C27612f fVar = new C27612f();
            fVar.setArguments(C0908e.m3336b(C41233s.m119492a("EXTRA_MIN_AMOUNT", str), C41233s.m119492a("EXTRA_MAX_AMOUNT", str2)));
            return fVar;
        }
    }

    /* renamed from: pr.f$b */
    static final class C27614b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C27612f f70554d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27614b(C27612f fVar) {
            super(0);
            this.f70554d = fVar;
        }

        public final String invoke() {
            String string = this.f70554d.requireArguments().getString("EXTRA_MAX_AMOUNT");
            C41536l.m120486f(string);
            return string;
        }
    }

    /* renamed from: pr.f$c */
    static final class C27615c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C27612f f70555d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27615c(C27612f fVar) {
            super(0);
            this.f70555d = fVar;
        }

        public final String invoke() {
            String string = this.f70555d.requireArguments().getString("EXTRA_MIN_AMOUNT");
            C41536l.m120486f(string);
            return string;
        }
    }

    /* renamed from: pr.f$d */
    public static final class C27616d implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ C27612f f70556d;

        /* renamed from: e */
        final /* synthetic */ Input f70557e;

        public C27616d(C27612f fVar, Input input) {
            this.f70556d = fVar;
            this.f70557e = input;
        }

        public void afterTextChanged(Editable editable) {
            this.f70556d.m85459f2().f68498g.setEnabled(this.f70557e.mo35918a());
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public final C27273d m85459f2() {
        C27273d dVar = this.f70551G;
        C41536l.m120486f(dVar);
        return dVar;
    }

    /* renamed from: g2 */
    private final String m85460g2() {
        return (String) this.f70553I.getValue();
    }

    /* renamed from: h2 */
    private final String m85461h2() {
        return (String) this.f70552H.getValue();
    }

    /* renamed from: i2 */
    private final void m85462i2() {
        m85459f2().f68497f.setTitleText(C32343x.m95388F("offers.loan.invalid.amount.action.sheet.main.text", m85461h2(), m85460g2()));
        Input input = m85459f2().f68496e;
        input.setHintText((CharSequence) C32343x.m95388F("offers.loan.invalid.amount.action.sheet.amount.field.label", new Object[0]));
        input.getTextInput().setInputType(8192);
        input.getTextInput().addTextChangedListener(new C27616d(this, input));
        C41536l.m120488h(input, "setUpViews$lambda$1");
        Input.m50261f(input, new C17799b.C17806g(new BigDecimal(m85461h2()), new BigDecimal(m85460g2())), true, false, false, 12, (Object) null);
        Button button = m85459f2().f68498g;
        button.setButtonText(C32343x.m95388F("offers.loan.invalid.amount.action.sheet.calculate.button", new Object[0]));
        button.setEnabled(false);
        button.setOnClickListener(new C27611e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public static final void m85463j2(C27612f fVar, View view) {
        C41536l.m120489i(fVar, "this$0");
        C1533o.m5445b(fVar, "LoanDecisionChangeAmountActionSheet.CHOSEN_PROVIDER", C0908e.m3336b(C41233s.m119492a("LoanDecisionChangeAmountActionSheet.CHOSEN_PROVIDER", fVar.m85459f2().f68496e.getInputText())));
        fVar.mo4577k1();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f70551G = C27273d.m84392d(layoutInflater, viewGroup, true);
        mo26370a2(C32343x.m95388F("offers.loan.invalid.amount.action.sheet.header", new Object[0]));
        m85462i2();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m85459f2().f68496e.getTextInput().requestFocus();
    }
}
