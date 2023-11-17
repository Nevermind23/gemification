package p642vh;

import af1.C40303i;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.jvm.internal.C41536l;
import kotlin.properties.C41555e;

/* renamed from: vh.o */
public final class C18376o implements C41555e {

    /* renamed from: a */
    private final ImageView f51832a;

    public C18376o(ImageView imageView) {
        C41536l.m120489i(imageView, "imageView");
        this.f51832a = imageView;
    }

    /* renamed from: a */
    public Drawable getValue(Object obj, C40303i iVar) {
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        return this.f51832a.getDrawable();
    }

    /* renamed from: b */
    public void setValue(Object obj, C40303i iVar, Drawable drawable) {
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        this.f51832a.setImageDrawable(drawable);
    }
}
