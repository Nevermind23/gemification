package p341ge.bog.designsystem.components.input;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.TextView;
import kotlin.jvm.internal.C41536l;
import p533ni.C16940a;

/* renamed from: ge.bog.designsystem.components.input.ClearFocusEditText */
public final class ClearFocusEditText extends BogEditText {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClearFocusEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C41536l.m120489i(context, "context");
        setOnEditorActionListener(new C16940a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m50260d(ClearFocusEditText clearFocusEditText, TextView textView, int i, KeyEvent keyEvent) {
        C41536l.m120489i(clearFocusEditText, "this$0");
        if ((i & C11051p3.f31759c) == 0) {
            return false;
        }
        clearFocusEditText.clearFocus();
        return false;
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4) {
            clearFocus();
        }
        return super.onKeyPreIme(i, keyEvent);
    }
}
