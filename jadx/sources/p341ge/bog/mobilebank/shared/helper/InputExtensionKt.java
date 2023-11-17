package p341ge.bog.mobilebank.shared.helper;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.internal.C41536l;
import o31.C37587a;
import o31.C37603j;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.shared.helper.InputExtensionKt */
public abstract class InputExtensionKt {

    /* renamed from: ge.bog.mobilebank.shared.helper.InputExtensionKt$a */
    public static final class C34641a implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ Input f83737d;

        /* renamed from: e */
        final /* synthetic */ C43064a f83738e;

        /* renamed from: f */
        final /* synthetic */ Input f83739f;

        C34641a(Input input, C43064a aVar, Input input2) {
            this.f83737d = input;
            this.f83738e = aVar;
            this.f83739f = input2;
        }

        public void afterTextChanged(Editable editable) {
            this.f83737d.getTextInput().removeTextChangedListener(this);
            if (editable != null) {
                InputExtensionKt.m101730b(editable);
            }
            String valueOf = String.valueOf(editable);
            C43064a aVar = this.f83738e;
            if (aVar != null) {
                aVar.invoke();
            }
            if (valueOf.length() == 2) {
                if (valueOf.charAt(0) == '0' && valueOf.charAt(1) != '0' && !C40440x.m117137L(valueOf, '.', false, 2, (Object) null)) {
                    valueOf = valueOf.substring(1);
                    C41536l.m120488h(valueOf, "this as java.lang.String).substring(startIndex)");
                    this.f83739f.setInputText(valueOf);
                    this.f83739f.getTextInput().setSelection(valueOf.length());
                }
                if (valueOf.charAt(0) == '0' && valueOf.charAt(1) == '0') {
                    this.f83739f.setInputText(BankApiResponse.SUCCESSFUL_RESPONSE_CODE);
                    this.f83739f.getTextInput().setSelection(1);
                    valueOf = BankApiResponse.SUCCESSFUL_RESPONSE_CODE;
                }
            }
            if (valueOf.length() > 2 && !InputExtensionKt.m101731c(valueOf) && C37603j.m110578a(valueOf)) {
                this.f83739f.setInputText(BankApiResponse.SUCCESSFUL_RESPONSE_CODE);
                this.f83739f.getTextInput().setSelection(1);
            }
            this.f83737d.getTextInput().addTextChangedListener(this);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: b */
    public static final void m101730b(Editable editable) {
        C41536l.m120489i(editable, "<this>");
        m101733e(editable);
        String N0 = C40440x.m117142N0(editable.toString(), '.', (String) null, 2, (Object) null);
        int R = C40440x.m117149R(N0);
        for (int i = 0; i < R; i++) {
            if ((C40440x.m117149R(N0) - i) % 3 == 0) {
                editable.setSpan(new C37587a(","), i, i + 1, 33);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final boolean m101731c(String str) {
        return str.charAt(1) == '.' && str.charAt(2) == '0';
    }

    /* renamed from: d */
    public static final void m101732d(View view, C43064a aVar) {
        C41536l.m120489i(view, "<this>");
        C41536l.m120489i(aVar, "onKeyboardHidden");
        Object systemService = view.getContext().getSystemService("input_method");
        C41536l.m120487g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        if (!((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0, new InputExtensionKt$hideKeyboardWithResult$result$1(aVar))) {
            aVar.invoke();
        }
    }

    /* renamed from: e */
    public static final void m101733e(Editable editable) {
        C41536l.m120489i(editable, "<this>");
        C37587a[] aVarArr = (C37587a[]) editable.getSpans(0, editable.length(), C37587a.class);
        C41536l.m120488h(aVarArr, "toRemoveSpans");
        for (C37587a removeSpan : aVarArr) {
            editable.removeSpan(removeSpan);
        }
    }

    /* renamed from: f */
    public static final void m101734f(Input input, C43064a aVar) {
        C41536l.m120489i(input, "<this>");
        input.getTextInput().addTextChangedListener(new C34641a(input, aVar, input));
    }
}
