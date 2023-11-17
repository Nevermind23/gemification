package p642vh;

import af1.C40303i;
import android.graphics.drawable.Drawable;
import android.view.View;
import kotlin.jvm.internal.C41536l;
import kotlin.properties.C41555e;

/* renamed from: vh.d */
public final class C18352d implements C41555e {

    /* renamed from: a */
    private final View f51799a;

    public C18352d(View view) {
        C41536l.m120489i(view, "view");
        this.f51799a = view;
    }

    /* renamed from: a */
    public Drawable getValue(Object obj, C40303i iVar) {
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        return this.f51799a.getBackground();
    }

    /* renamed from: b */
    public void setValue(Object obj, C40303i iVar, Drawable drawable) {
        Drawable drawable2;
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        View view = this.f51799a;
        if (drawable != null) {
            drawable2 = drawable.mutate();
        } else {
            drawable2 = null;
        }
        view.setBackground(drawable2);
    }
}
