package p341ge.bog.designsystem.components.radiobutton;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.view.C0267d;
import androidx.appcompat.widget.C0481r;
import androidx.core.widget.C1314o;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p601sg.C17786k;

/* renamed from: ge.bog.designsystem.components.radiobutton.RadioButtonView */
public final class RadioButtonView extends C0481r {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RadioButtonView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* renamed from: a */
    private final void m50634a(boolean z) {
        int i;
        if (z) {
            i = C17786k.f49823N;
        } else {
            i = C17786k.TextBody1InvertComponents150Left;
        }
        C1314o.m4575q(this, i);
    }

    public void setEnabled(boolean z) {
        m50634a(z);
        super.setEnabled(z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RadioButtonView(Context context, AttributeSet attributeSet) {
        super(new C0267d(context, C17786k.RadioButtonStyle), attributeSet);
        C41536l.m120489i(context, "context");
        m50634a(isEnabled());
    }
}
