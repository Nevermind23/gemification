package p341ge.bog.mobilebank.cardapplications.presentation.activity.instantcards;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.C0173b;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import g91.C32343x;
import he1.C41233s;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cardapplications.presentation.model.instantcards.InstantCardActivationResultUiModel;
import p481jm.C16220c;
import p607sm.C17874o;
import p725cr.C19788a;
import q31.C38122f;
import q31.C38125h;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.e */
public final class C14188e extends C19788a {

    /* renamed from: I */
    public static final C14189a f41589I = new C14189a((DefaultConstructorMarker) null);

    /* renamed from: H */
    private C16220c f41590H;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.e$a */
    public static final class C14189a {
        private C14189a() {
        }

        public /* synthetic */ C14189a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C14188e mo39260a(InstantCardActivationResultUiModel instantCardActivationResultUiModel) {
            C41536l.m120489i(instantCardActivationResultUiModel, "result");
            C14188e eVar = new C14188e();
            eVar.setArguments(C0908e.m3336b(C41233s.m119492a("ARG_RESULT", instantCardActivationResultUiModel)));
            return eVar;
        }
    }

    /* renamed from: f2 */
    private final C16220c m52488f2() {
        C16220c cVar = this.f41590H;
        C41536l.m120486f(cVar);
        return cVar;
    }

    /* renamed from: g2 */
    private final void m52489g2() {
        C41238w wVar;
        InstantCardActivationResultUiModel instantCardActivationResultUiModel;
        m52488f2().f45780e.setTitleText(C32343x.m95388F("text.activate.iic.card.success.message", new Object[0]));
        m52488f2().f45781f.setButtonText(C32343x.m95388F("text.activate.iic.card.success.button.card.details", new Object[0]));
        Bundle arguments = getArguments();
        if (arguments == null || (instantCardActivationResultUiModel = (InstantCardActivationResultUiModel) arguments.getParcelable("ARG_RESULT")) == null) {
            wVar = null;
        } else {
            m52488f2().f45781f.setOnClickListener(new C17874o(this, instantCardActivationResultUiModel));
            wVar = C41238w.f97225a;
        }
        if (wVar == null) {
            mo4577k1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public static final void m52490h2(C14188e eVar, InstantCardActivationResultUiModel instantCardActivationResultUiModel, View view) {
        C41536l.m120489i(eVar, "this$0");
        C41536l.m120489i(instantCardActivationResultUiModel, "$result");
        Context requireContext = eVar.requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        C38122f c = C38125h.m112238c(requireContext);
        Context requireContext2 = eVar.requireContext();
        C41536l.m120488h(requireContext2, "requireContext()");
        C38122f.C38123a.m112211g(c, requireContext2, instantCardActivationResultUiModel.mo39937a(), (C0173b) null, 4, (Object) null);
        eVar.mo4577k1();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f41590H = C16220c.m57809d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f41590H = null;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C41536l.m120489i(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        C1533o.m5445b(this, "REQUEST_KEY_ACTIVATION_SUCCESS", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_ACTIVATION_SUCCESS_DISMISSED", Boolean.TRUE)));
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        mo26370a2(C32343x.m95388F("text.order.iic.card.title", new Object[0]));
        super.onViewCreated(view, bundle);
        m52489g2();
    }
}
