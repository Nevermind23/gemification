package p350ai;

import android.view.View;
import android.widget.Button;
import p341ge.bog.designsystem.components.digitalkeyboard.NumericKeyboardView;

/* renamed from: ai.a */
public final /* synthetic */ class C9861a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ NumericKeyboardView f26724d;

    /* renamed from: e */
    public final /* synthetic */ Button f26725e;

    public /* synthetic */ C9861a(NumericKeyboardView numericKeyboardView, Button button) {
        this.f26724d = numericKeyboardView;
        this.f26725e = button;
    }

    public final void onClick(View view) {
        NumericKeyboardView.m50135m(this.f26724d, this.f26725e, view);
    }
}
