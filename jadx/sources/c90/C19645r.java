package c90;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import g90.C20781c;
import g91.C32343x;
import h80.C24890a;
import he1.C41217g;
import he1.C41233s;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.FormData;
import p725cr.C19788a;
import ue1.C43064a;

/* renamed from: c90.r */
public final class C19645r extends C19788a {

    /* renamed from: J */
    public static final C19646a f53971J = new C19646a((DefaultConstructorMarker) null);

    /* renamed from: H */
    private C24890a f53972H;

    /* renamed from: I */
    private final C41217g f53973I = C41219i.m119470b(new C19647b(this));

    /* renamed from: c90.r$a */
    public static final class C19646a {
        private C19646a() {
        }

        public /* synthetic */ C19646a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C19645r mo47846a(FormData formData) {
            C41536l.m120489i(formData, "income");
            C19645r rVar = new C19645r();
            rVar.setArguments(C0908e.m3336b(C41233s.m119492a("EXTRA_INCOME", formData)));
            return rVar;
        }
    }

    /* renamed from: c90.r$b */
    static final class C19647b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C19645r f53974d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19647b(C19645r rVar) {
            super(0);
            this.f53974d = rVar;
        }

        /* renamed from: b */
        public final FormData invoke() {
            Bundle arguments = this.f53974d.getArguments();
            FormData formData = arguments != null ? (FormData) arguments.getParcelable("EXTRA_INCOME") : null;
            C41536l.m120486f(formData);
            return formData;
        }
    }

    /* renamed from: i2 */
    private final C24890a m65292i2() {
        C24890a aVar = this.f53972H;
        C41536l.m120486f(aVar);
        return aVar;
    }

    /* renamed from: j2 */
    private final FormData m65293j2() {
        return (FormData) this.f53973I.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public static final void m65294k2(C19645r rVar, View view) {
        C41536l.m120489i(rVar, "this$0");
        rVar.m65296m2(C19626m.EDIT);
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public static final void m65295l2(C19645r rVar, View view) {
        C41536l.m120489i(rVar, "this$0");
        rVar.m65297n2();
    }

    /* renamed from: m2 */
    private final void m65296m2(C19626m mVar) {
        C1533o.m5445b(this, "ACTION_TYPE_REQUEST_KEY", C0908e.m3336b(C41233s.m119492a("ACTION_TYPE_RESULT_KEY", mVar), C41233s.m119492a("INCOME_RESULT_KEY", m65293j2().mo56095j())));
        mo4577k1();
    }

    /* renamed from: n2 */
    private final void m65297n2() {
        C13310d dVar = new C13310d();
        dVar.mo35647a2(C13310d.C13312b.TITLE_CLOSE_TWO_BUTTON);
        dVar.mo35648c2(C32343x.m95388F("CLA.delete.income.popup.header", new Object[0]));
        dVar.mo35639Q1(C32343x.m95388F("CLA.delete.income.popup.header", new Object[0]));
        dVar.mo35646Z1(C32343x.m95388F("CLA.delete.income.popup.header", new Object[0]));
        dVar.mo35642U1(C32343x.m95388F("CLA.delete.income.popup.header", new Object[0]));
        dVar.mo35645Y1(new C19642p(this, dVar));
        dVar.mo35641T1(new C19644q(dVar));
        dVar.mo4576A1(getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public static final void m65298o2(C19645r rVar, C13310d dVar, Button button) {
        C41536l.m120489i(rVar, "this$0");
        C41536l.m120489i(dVar, "$this_apply");
        C41536l.m120489i(button, "it");
        rVar.m65296m2(C19626m.DELETE);
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public static final void m65299p2(C13310d dVar, Button button) {
        C41536l.m120489i(dVar, "$this_apply");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f53972H = C24890a.m79542d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f53972H = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        boolean z = false;
        mo26370a2(C32343x.m95388F("CLA.edit.income.action.header", new Object[0]));
        C24890a i2 = m65292i2();
        i2.f63877h.setText(C32343x.m95388F("CLA.edit.income.action.edit.button", new Object[0]));
        i2.f63875f.setText(C32343x.m95388F("CLA.edit.income.action.delete.button", new Object[0]));
        ListItem listItem = i2.f63876g;
        if (m65293j2().mo56090f() != C20781c.NONE) {
            z = true;
        }
        listItem.setEnabled(z);
        i2.f63874e.setEnabled(m65293j2().mo56099p());
        i2.f63876g.setOnClickListener(new C19628n(this));
        i2.f63874e.setOnClickListener(new C19630o(this));
    }
}
