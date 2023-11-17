package p642vh;

import af1.C40303i;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.jvm.internal.C41536l;
import kotlin.properties.C41555e;
import p045d.C5769a;

/* renamed from: vh.p */
public final class C18377p implements C41555e {

    /* renamed from: a */
    private final ImageView f51833a;

    public C18377p(ImageView imageView) {
        C41536l.m120489i(imageView, "imageView");
        this.f51833a = imageView;
    }

    /* renamed from: a */
    public Integer getValue(Object obj, C40303i iVar) {
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public void setValue(Object obj, C40303i iVar, Integer num) {
        Drawable drawable;
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        if (num != null) {
            try {
                drawable = C5769a.m23210b(this.f51833a.getContext(), num.intValue());
            } catch (Exception unused) {
                this.f51833a.setImageDrawable((Drawable) null);
                return;
            }
        } else {
            drawable = null;
        }
        this.f51833a.setImageDrawable(drawable);
    }
}
