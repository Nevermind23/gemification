package p341ge.bog.mobilebank.autoliabilityinsurance.presentation.registermtplpolicy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C1533o;
import g91.C32303f;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import p349ah.C9860d;
import p381cl.C10484a;
import p381cl.C10485b;
import p451hk.C15529g;
import p493kk.C16448b;

/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.registermtplpolicy.a */
public final class C13731a extends C9860d {

    /* renamed from: C */
    public static final C13732a f40943C = new C13732a((DefaultConstructorMarker) null);

    /* renamed from: B */
    private C16448b f40944B;

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.registermtplpolicy.a$a */
    public static final class C13732a {
        private C13732a() {
        }

        public /* synthetic */ C13732a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C13731a mo37632a(String str) {
            C41536l.m120489i(str, "payDay");
            C13731a aVar = new C13731a();
            Bundle bundle = new Bundle();
            bundle.putString("PAY_DAY_ARG", str);
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    /* renamed from: f2 */
    private final C16448b m51337f2() {
        C16448b bVar = this.f40944B;
        C41536l.m120486f(bVar);
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public static final void m51338g2(C13731a aVar, View view) {
        C41536l.m120489i(aVar, "this$0");
        Bundle bundle = Bundle.EMPTY;
        C41536l.m120488h(bundle, "EMPTY");
        C1533o.m5445b(aVar, "AUTOMATIC_CONFIRM_REQUEST_KEY", bundle);
        aVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public static final void m51339h2(C13731a aVar) {
        C41536l.m120489i(aVar, "this$0");
        C32303f.m95182B(aVar.requireContext());
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f40944B = C16448b.m58596d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f40944B = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        String string;
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26372b2(ActionSheetTitle.C13155a.BASIC);
        mo26370a2(getString(C15529g.choose_payment_method_label_automatic_payment));
        Bundle arguments = getArguments();
        if (!(arguments == null || (string = arguments.getString("PAY_DAY_ARG")) == null)) {
            m51337f2().f46462f.setText(C40439w.m117103B(C32343x.m95388F("rbc.ins.dd.activation.desc", new Object[0]), "{0}", string, false, 4, (Object) null));
        }
        m51337f2().f46461e.getButton().setOnClickListener(new C10484a(this));
        m51337f2().f46461e.getCheckbox().setTextClickListener(new C10485b(this));
    }
}
