package hc1;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.widget.EditText;
import androidx.core.graphics.drawable.C0836a;
import ba1.C10211p;
import ba1.C10212q;
import ba1.C10214s;
import kotlin.jvm.internal.C41536l;
import p045d.C5769a;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.input.Input;

/* renamed from: hc1.b */
public abstract class C41129b {
    /* renamed from: a */
    public static final Drawable m119229a(Drawable drawable, Context context, Color color) {
        C41536l.m120489i(drawable, "<this>");
        C41536l.m120489i(context, "context");
        C41536l.m120489i(color, "color");
        Drawable r = C0836a.m3156r(drawable.mutate());
        C41536l.m120488h(r, "wrap(mutate())");
        C0836a.m3152n(r, color.mo35260a(context));
        C0836a.m3154p(r, PorterDuff.Mode.SRC_IN);
        return r;
    }

    /* renamed from: b */
    public static final void m119230b(Input input, Context context) {
        Drawable drawable;
        C41536l.m120489i(input, "<this>");
        C41536l.m120489i(context, "context");
        EditText textInput = input.getTextInput();
        int selectionEnd = textInput.getSelectionEnd();
        Drawable b = C5769a.m23210b(context, C10214s.icons_24_system_eye_on);
        Drawable drawable2 = null;
        if (textInput.getTransformationMethod() instanceof PasswordTransformationMethod) {
            if (b != null) {
                drawable = m119229a(b, context, new Color.Resource(C10212q.f28268b));
            } else {
                drawable = null;
            }
            input.setEndIconImageSmall(drawable);
            textInput.setTransformationMethod((TransformationMethod) null);
        } else {
            if (b != null) {
                drawable2 = m119229a(b, context, new Color.Attribute(C10211p.f28264b));
            }
            input.setEndIconImageSmall(drawable2);
            textInput.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            textInput.setSelection(selectionEnd);
        }
    }
}
