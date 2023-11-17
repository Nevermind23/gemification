package p533ni;

import android.view.KeyEvent;
import android.widget.TextView;
import p341ge.bog.designsystem.components.input.ClearFocusEditText;

/* renamed from: ni.a */
public final /* synthetic */ class C16940a implements TextView.OnEditorActionListener {

    /* renamed from: a */
    public final /* synthetic */ ClearFocusEditText f47310a;

    public /* synthetic */ C16940a(ClearFocusEditText clearFocusEditText) {
        this.f47310a = clearFocusEditText;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return ClearFocusEditText.m50260d(this.f47310a, textView, i, keyEvent);
    }
}
