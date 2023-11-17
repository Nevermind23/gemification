package p642vh;

import af1.C40303i;
import android.view.View;
import androidx.core.content.C0767a;
import kotlin.jvm.internal.C41536l;
import kotlin.properties.C41555e;

/* renamed from: vh.b */
public final class C18337b implements C41555e {

    /* renamed from: a */
    private final View f51786a;

    public C18337b(View view) {
        C41536l.m120489i(view, "view");
        this.f51786a = view;
    }

    /* renamed from: a */
    public Integer getValue(Object obj, C40303i iVar) {
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public void setValue(Object obj, C40303i iVar, Integer num) {
        int i;
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        if (num != null) {
            try {
                i = num.intValue();
            } catch (Exception unused) {
                View view = this.f51786a;
                view.setBackgroundColor(C0767a.m2893c(view.getContext(), 17170445));
                return;
            }
        } else {
            i = 17170445;
        }
        View view2 = this.f51786a;
        view2.setBackgroundColor(C0767a.m2893c(view2.getContext(), i));
    }
}
