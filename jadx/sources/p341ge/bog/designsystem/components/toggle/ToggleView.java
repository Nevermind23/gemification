package p341ge.bog.designsystem.components.toggle;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.view.C0267d;
import androidx.appcompat.widget.SwitchCompat;
import kotlin.jvm.internal.C41536l;
import p601sg.C17786k;

/* renamed from: ge.bog.designsystem.components.toggle.ToggleView */
public final class ToggleView extends SwitchCompat {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ToggleView(Context context, AttributeSet attributeSet) {
        super(new C0267d(context, C17786k.ToggleStyle), attributeSet);
        C41536l.m120489i(context, "context");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText((CharSequence) null, bufferType);
    }
}
