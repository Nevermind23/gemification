package p448hh;

import android.view.KeyEvent;
import android.widget.TextView;
import p341ge.bog.designsystem.components.biginput.BigInputView;

/* renamed from: hh.c */
public final /* synthetic */ class C15514c implements TextView.OnEditorActionListener {

    /* renamed from: a */
    public final /* synthetic */ BigInputView f44022a;

    public /* synthetic */ C15514c(BigInputView bigInputView) {
        this.f44022a = bigInputView;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return BigInputView.m49605d(this.f44022a, textView, i, keyEvent);
    }
}
