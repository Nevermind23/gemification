package p642vh;

import af1.C40303i;
import android.content.res.ColorStateList;
import android.widget.TextView;
import kotlin.jvm.internal.C41536l;
import kotlin.properties.C41555e;

/* renamed from: vh.g0 */
public final class C18359g0 implements C41555e {

    /* renamed from: a */
    private final TextView f51809a;

    public C18359g0(TextView textView) {
        C41536l.m120489i(textView, "view");
        this.f51809a = textView;
    }

    /* renamed from: a */
    public ColorStateList getValue(Object obj, C40303i iVar) {
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public void setValue(Object obj, C40303i iVar, ColorStateList colorStateList) {
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        this.f51809a.setTextColor(colorStateList);
    }
}
