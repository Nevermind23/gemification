package p341ge.bog.sso_client.common.sheets;

import af1.C40303i;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import ba1.C10220y;
import he1.C41224m;
import he1.C41233s;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;
import p349ah.C9860d;
import ua1.C28674q1;

/* renamed from: ge.bog.sso_client.common.sheets.e */
public final class C24688e extends C9860d {

    /* renamed from: D */
    public static final C24689a f63568D = new C24689a((DefaultConstructorMarker) null);

    /* renamed from: E */
    static final /* synthetic */ C40303i[] f63569E = {C41520a0.m120439e(new C41539o(C24688e.class, "countryCode", "getCountryCode()Ljava/lang/String;", 0))};
    /* access modifiers changed from: private */

    /* renamed from: B */
    public C28674q1 f63570B;

    /* renamed from: C */
    private final C41555e f63571C = new C24691c("+995", this);

    /* renamed from: ge.bog.sso_client.common.sheets.e$a */
    public static final class C24689a {
        private C24689a() {
        }

        public /* synthetic */ C24689a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C24688e mo63085a() {
            return new C24688e();
        }
    }

    /* renamed from: ge.bog.sso_client.common.sheets.e$b */
    public static final class C24690b implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ C24688e f63572d;

        public C24690b(C24688e eVar) {
            this.f63572d = eVar;
        }

        public void afterTextChanged(Editable editable) {
            Button button;
            C28674q1 f2 = this.f63572d.f63570B;
            if (f2 != null) {
                button = f2.f72898e;
            } else {
                button = null;
            }
            if (button != null) {
                boolean z = false;
                if (editable != null) {
                    if (editable.length() > 3) {
                        z = true;
                    }
                    z = Boolean.valueOf(z).booleanValue();
                }
                button.setEnabled(z);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.sso_client.common.sheets.e$c */
    public static final class C24691c extends C41553c {

        /* renamed from: a */
        final /* synthetic */ C24688e f63573a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24691c(Object obj, C24688e eVar) {
            super(obj);
            this.f63573a = eVar;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            Input input;
            C41536l.m120489i(iVar, "property");
            String str = (String) obj2;
            String str2 = (String) obj;
            C28674q1 f2 = this.f63573a.f63570B;
            if (f2 != null) {
                input = f2.f72899f;
            } else {
                input = null;
            }
            if (input != null) {
                input.setPhonePrefixText(str);
            }
        }
    }

    public C24688e() {
        C41551a aVar = C41551a.f97718a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public static final void m79211h2(C24688e eVar, C28674q1 q1Var, View view) {
        C41536l.m120489i(eVar, "this$0");
        C41536l.m120489i(q1Var, "$binding");
        StringBuilder sb = new StringBuilder();
        String l2 = eVar.m79214l2(q1Var.f72899f.getPhonePrefixText());
        if (l2 == null) {
            l2 = "995";
        }
        sb.append(l2);
        sb.append(q1Var.f72899f.getInputText());
        C1533o.m5445b(eVar, "REQUEST_TAG_PHONE_NUMBER_SUBMITTED", C0908e.m3336b(C41233s.m119492a("BUNDLE_PARAM_PHONE_NUMBER", sb.toString())));
        eVar.mo4577k1();
    }

    /* renamed from: j2 */
    private final void m79212j2(Input input) {
        input.setPhonePrefixText(mo63083g2());
        input.setPhoneNumberPrefixClickListener(new C24687d(this));
        input.getTextInput().addTextChangedListener(new C24690b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public static final void m79213k2(C24688e eVar, View view) {
        C41536l.m120489i(eVar, "this$0");
        C1533o.m5445b(eVar, "REQUEST_TAG_COUNTRY_CODE_REQUESTED", C0908e.m3336b(new C41224m[0]));
    }

    /* renamed from: l2 */
    private final String m79214l2(String str) {
        if (str == null) {
            return null;
        }
        if (!C40439w.m117109H(str, "+", false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(C40440x.m117160b0(str, '+', 0, false, 6, (Object) null) + 1);
        C41536l.m120488h(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        C28674q1 d = C28674q1.m87811d(layoutInflater, viewGroup, true);
        this.f63570B = d;
        C41536l.m120486f(d);
        mo26370a2(layoutInflater.getContext().getString(C10220y.add_number));
        Input input = d.f72899f;
        C41536l.m120488h(input, "binding.phoneNumberInput");
        m79212j2(input);
        Button button = d.f72898e;
        button.setEnabled(false);
        button.setOnClickListener(new C24686c(this, d));
        d.f72899f.requestFocus();
    }

    /* renamed from: g2 */
    public final String mo63083g2() {
        return (String) this.f63571C.getValue(this, f63569E[0]);
    }

    /* renamed from: i2 */
    public final void mo63084i2(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.f63571C.setValue(this, f63569E[0], str);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f63570B = null;
    }
}
