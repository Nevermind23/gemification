package dq0;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import com.github.mikephil.charting.utils.Utils;
import g91.C32343x;
import he1.C41233s;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import np0.C37443i;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.conditions.ConditionsData;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.conditions.ForgivenFund;
import sp0.C38480a;
import sp0.C38501t;

/* renamed from: dq0.b */
public final class C31566b extends C31569d {

    /* renamed from: L */
    public static final C31567a f78139L = new C31567a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private C38480a f78140K;

    /* renamed from: dq0.b$a */
    public static final class C31567a {
        private C31567a() {
        }

        public /* synthetic */ C31567a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C31566b mo71994a(ConditionsData conditionsData) {
            C41536l.m120489i(conditionsData, "data");
            C31566b bVar = new C31566b();
            bVar.setArguments(C0908e.m3336b(C41233s.m119492a("EXTRA_CONDITIONS_DATA", conditionsData)));
            return bVar;
        }
    }

    /* renamed from: f2 */
    private final C38480a m93662f2() {
        C38480a aVar = this.f78140K;
        C41536l.m120486f(aVar);
        return aVar;
    }

    /* renamed from: g2 */
    private final SpannableStringBuilder m93663g2(double d, String str) {
        SpannableStringBuilder append = new SpannableStringBuilder().append(C32343x.m95388F("credit.offers.RL.conditions.AS.rqstDownPayment", new Object[0])).append(" ").append(C32343x.m95404N(d, str, false), new TextAppearanceSpan(requireContext(), C37443i.ConditionsActionSheetFeedbackSpannableAmountStyle), 33);
        C41536l.m120488h(append, "SpannableStringBuilder()…E_EXCLUSIVE\n            )");
        return append;
    }

    /* renamed from: h2 */
    private final void m93664h2() {
        ConditionsData conditionsData;
        Bundle arguments = getArguments();
        if (arguments != null) {
            conditionsData = (ConditionsData) arguments.getParcelable("EXTRA_CONDITIONS_DATA");
        } else {
            conditionsData = null;
        }
        C41536l.m120486f(conditionsData);
        boolean z = true;
        if (!conditionsData.mo73292b().isEmpty()) {
            LinearLayout linearLayout = m93662f2().f92162h;
            C41536l.m120488h(linearLayout, "binding.forgivenFundsContainer");
            C32343x.m95447f1(linearLayout);
            ConstraintLayout constraintLayout = m93662f2().f92163i;
            C41536l.m120488h(constraintLayout, "binding.fullAmountContainer");
            C32343x.m95447f1(constraintLayout);
        }
        for (ForgivenFund forgivenFund : conditionsData.mo73292b()) {
            C38501t d = C38501t.m113019d(getLayoutInflater(), m93662f2().f92162h, true);
            d.f92283f.setImageDrawable(C32343x.m95424X(forgivenFund.mo73305b().mo90331b(), requireContext()));
            d.f92284g.setText(C32343x.m95388F(forgivenFund.mo73305b().mo90332c(), new Object[0]));
            d.f92282e.setText(C32343x.m95410Q(forgivenFund.mo73304a(), conditionsData.mo73291a(), false, 2, (Object) null));
        }
        m93662f2().f92165k.setText(C32343x.m95410Q(conditionsData.mo73293d(), conditionsData.mo73291a(), false, 2, (Object) null));
        if (conditionsData.mo73295e() != Utils.DOUBLE_EPSILON) {
            z = false;
        }
        if (!z) {
            InlineFeedback inlineFeedback = m93662f2().f92161g;
            C41536l.m120488h(inlineFeedback, "binding.downPaymentFeedback");
            C32343x.m95447f1(inlineFeedback);
        }
        m93662f2().f92161g.setTitleText(m93663g2(conditionsData.mo73295e(), conditionsData.mo73291a()));
        mo26370a2(C32343x.m95388F("credit.offers.RL.conditions.AS.header", new Object[0]));
        m93662f2().f92160f.setText(C32343x.m95388F("credit.offers.RL.conditions.AS.info", new Object[0]));
        m93662f2().f92164j.setText(C32343x.m95388F("credit.offers.RL.conditions.AS.total.full.total", new Object[0]));
        Button button = m93662f2().f92159e;
        button.setButtonText(C32343x.m95388F("credit.offers.RL.conditions.AS.button.label", new Object[0]));
        button.setOnClickListener(new C31565a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public static final void m93665i2(C31566b bVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        C1533o.m5445b(bVar, "REQUEST_KEY_CONDITIONS", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_OK_BUTTON_CLICKED", "")));
        bVar.mo4577k1();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f78140K = C38480a.m112933d(layoutInflater, viewGroup, true);
        m93664h2();
    }

    /* renamed from: b */
    public void mo26371b() {
        super.mo26371b();
        C1533o.m5445b(this, "REQUEST_KEY_CONDITIONS", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_CLOSE_BUTTON_CLICKED", "")));
    }
}
