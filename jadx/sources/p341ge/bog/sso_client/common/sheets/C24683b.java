package p341ge.bog.sso_client.common.sheets;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import ba1.C10220y;
import he1.C41233s;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.input.Input;
import p349ah.C9860d;
import p603si.C17799b;
import p603si.C17809c;
import ua1.C28671p1;

/* renamed from: ge.bog.sso_client.common.sheets.b */
public final class C24683b extends C9860d {

    /* renamed from: C */
    public static final C24684a f63561C = new C24684a((DefaultConstructorMarker) null);

    /* renamed from: B */
    private C28671p1 f63562B;

    /* renamed from: ge.bog.sso_client.common.sheets.b$a */
    public static final class C24684a {
        private C24684a() {
        }

        public /* synthetic */ C24684a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C24683b mo63077a(String str) {
            C41536l.m120489i(str, "title");
            C24683b bVar = new C24683b();
            bVar.setArguments(C0908e.m3336b(C41233s.m119492a("BUNDLE_PARAM_TITLE", str)));
            return bVar;
        }
    }

    /* renamed from: ge.bog.sso_client.common.sheets.b$b */
    public static final class C24685b implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ C24683b f63563d;

        /* renamed from: e */
        final /* synthetic */ Input f63564e;

        public C24685b(C24683b bVar, Input input) {
            this.f63563d = bVar;
            this.f63564e = input;
        }

        public void afterTextChanged(Editable editable) {
            this.f63563d.m79203f2().f72886e.setEnabled(this.f63564e.mo35918a());
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public final C28671p1 m79203f2() {
        C28671p1 p1Var = this.f63562B;
        C41536l.m120486f(p1Var);
        return p1Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public static final void m79204g2(C24683b bVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        C1533o.m5445b(bVar, "REQUEST_TAG_EMAIL_INPUT", C0908e.m3336b(C41233s.m119492a("RESULT_BUNDLE_TAG_EMAIL_INPUT", bVar.m79203f2().f72887f.getInputText())));
        bVar.mo4577k1();
    }

    /* renamed from: h2 */
    private final void m79205h2(Input input) {
        C17799b.C17804e eVar = C17799b.C17804e.f50685d;
        String string = getString(C10220y.error_message_incorrect_email);
        C41536l.m120488h(string, "getString(R.string.error_message_incorrect_email)");
        Input.m50261f(input, C17809c.m61562a(eVar, string), false, false, false, 14, (Object) null);
        input.getTextInput().addTextChangedListener(new C24685b(this, input));
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f63562B = C28671p1.m87798d(layoutInflater, viewGroup, true);
        m79203f2().f72886e.setEnabled(false);
        m79203f2().f72886e.setButtonText(getString(C10220y.common_text_confirm));
        Input input = m79203f2().f72887f;
        C41536l.m120488h(input, "binding.emailInput");
        m79205h2(input);
        m79203f2().f72886e.setOnClickListener(new C24682a(this));
        m79203f2().f72887f.requestFocus();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f63562B = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        String string;
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("BUNDLE_PARAM_TITLE")) != null) {
            mo26370a2(string);
        }
    }
}
