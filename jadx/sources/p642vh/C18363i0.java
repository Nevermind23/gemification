package p642vh;

import af1.C40303i;
import android.content.res.ColorStateList;
import android.view.View;
import kotlin.jvm.internal.C41536l;
import kotlin.properties.C41555e;

/* renamed from: vh.i0 */
public final class C18363i0 implements C41555e {

    /* renamed from: a */
    private final View f51816a;

    public C18363i0(View view) {
        C41536l.m120489i(view, "view");
        this.f51816a = view;
    }

    /* renamed from: a */
    public ColorStateList getValue(Object obj, C40303i iVar) {
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        return this.f51816a.getBackgroundTintList();
    }

    /* renamed from: b */
    public void setValue(Object obj, C40303i iVar, ColorStateList colorStateList) {
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        this.f51816a.setBackgroundTintList(colorStateList);
    }
}
