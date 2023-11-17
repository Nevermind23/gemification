package jq0;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.form.view.FormLoanDetailsView;

/* renamed from: jq0.f */
public final /* synthetic */ class C36780f implements TextView.OnEditorActionListener {

    /* renamed from: a */
    public final /* synthetic */ EditText f88738a;

    public /* synthetic */ C36780f(EditText editText) {
        this.f88738a = editText;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return FormLoanDetailsView.m95927h(this.f88738a, textView, i, keyEvent);
    }
}
