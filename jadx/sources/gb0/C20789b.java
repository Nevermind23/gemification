package gb0;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import g91.C32343x;
import ha0.C24926c;
import he1.C41233s;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;
import p725cr.C19788a;

/* renamed from: gb0.b */
public final class C20789b extends C19788a {

    /* renamed from: J */
    public static final C20790a f56024J = new C20790a((DefaultConstructorMarker) null);

    /* renamed from: H */
    private C24926c f56025H;

    /* renamed from: I */
    private String f56026I = C32343x.m95388F("applications.deposits.name.action.sheet.deposit.name", new Object[0]);

    /* renamed from: gb0.b$a */
    public static final class C20790a {
        private C20790a() {
        }

        public /* synthetic */ C20790a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C20789b mo49379a() {
            return new C20789b();
        }
    }

    /* renamed from: gb0.b$b */
    public static final class C20791b implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ C20789b f56027d;

        public C20791b(C20789b bVar) {
            this.f56027d = bVar;
        }

        public void afterTextChanged(Editable editable) {
            Button button = this.f56027d.m67280g2().f64103f;
            String obj = editable != null ? editable.toString() : null;
            button.setEnabled(!(obj == null || C40439w.m117118v(obj)));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public final C24926c m67280g2() {
        C24926c cVar = this.f56025H;
        C41536l.m120486f(cVar);
        return cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public static final void m67281h2(C20789b bVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        String inputText = bVar.m67280g2().f64102e.getInputText();
        if (!C40439w.m117118v(inputText)) {
            C1533o.m5445b(bVar, "DepositNameActionSheet_REQUEST_KEY", C0908e.m3336b(C41233s.m119492a("ARGS_DEPOSIT_NAME", inputText)));
            bVar.mo4577k1();
        }
    }

    /* renamed from: Q1 */
    public String mo26364Q1() {
        return this.f56026I;
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f56025H = C24926c.m79682d(layoutInflater, viewGroup, true);
        Input input = m67280g2().f64102e;
        input.setHintText((CharSequence) C32343x.m95388F("applications.deposits.fields.deposit.name", new Object[0]));
        input.getTextInput().addTextChangedListener(new C20791b(this));
        Button button = m67280g2().f64103f;
        button.setEnabled(false);
        button.setButtonText(C32343x.m95388F("applications.deposits.name.action.sheet.main.button", new Object[0]));
        button.setOnClickListener(new C20788a(this));
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f56025H = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m67280g2().f64102e.getTextInput().requestFocus();
    }
}
