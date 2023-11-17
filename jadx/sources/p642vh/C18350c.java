package p642vh;

import af1.C40303i;
import android.content.Context;
import android.view.View;
import androidx.core.content.C0767a;
import kotlin.jvm.internal.C41536l;
import kotlin.properties.C41555e;
import p341ge.bog.designsystem.components.common.Color;

/* renamed from: vh.c */
public final class C18350c implements C41555e {

    /* renamed from: a */
    private final View f51797a;

    public C18350c(View view) {
        C41536l.m120489i(view, "view");
        this.f51797a = view;
    }

    /* renamed from: a */
    public Color getValue(Object obj, C40303i iVar) {
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public void setValue(Object obj, C40303i iVar, Color color) {
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        if (color == null) {
            try {
                color = new Color.Resource(17170445);
            } catch (Exception unused) {
                View view = this.f51797a;
                view.setBackgroundColor(C0767a.m2893c(view.getContext(), 17170445));
                return;
            }
        }
        View view2 = this.f51797a;
        Context context = view2.getContext();
        C41536l.m120488h(context, "view.context");
        view2.setBackgroundColor(color.mo35260a(context));
    }
}
