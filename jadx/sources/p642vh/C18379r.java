package p642vh;

import af1.C40303i;
import android.content.Context;
import android.graphics.ColorFilter;
import android.widget.ImageView;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.properties.C41555e;
import p341ge.bog.designsystem.components.common.Color;

/* renamed from: vh.r */
public final class C18379r implements C41555e {

    /* renamed from: a */
    private final ImageView f51835a;

    public C18379r(ImageView imageView) {
        C41536l.m120489i(imageView, "imageView");
        this.f51835a = imageView;
    }

    /* renamed from: a */
    public Color getValue(Object obj, C40303i iVar) {
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public void setValue(Object obj, C40303i iVar, Color color) {
        C41238w wVar;
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        if (color != null) {
            try {
                ImageView imageView = this.f51835a;
                Context context = imageView.getContext();
                C41536l.m120488h(context, "imageView.context");
                imageView.setColorFilter(color.mo35260a(context));
                wVar = C41238w.f97225a;
            } catch (Exception unused) {
                this.f51835a.setColorFilter((ColorFilter) null);
                return;
            }
        } else {
            wVar = null;
        }
        if (wVar == null) {
            this.f51835a.setColorFilter((ColorFilter) null);
        }
    }
}
