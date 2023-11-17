package p642vh;

import af1.C40303i;
import android.graphics.ColorFilter;
import android.widget.ImageView;
import androidx.core.content.C0767a;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.properties.C41555e;

/* renamed from: vh.q */
public final class C18378q implements C41555e {

    /* renamed from: a */
    private final ImageView f51834a;

    public C18378q(ImageView imageView) {
        C41536l.m120489i(imageView, "imageView");
        this.f51834a = imageView;
    }

    /* renamed from: a */
    public Integer getValue(Object obj, C40303i iVar) {
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public void setValue(Object obj, C40303i iVar, Integer num) {
        C41238w wVar;
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        if (num != null) {
            try {
                int intValue = num.intValue();
                ImageView imageView = this.f51834a;
                imageView.setColorFilter(C0767a.m2893c(imageView.getContext(), intValue));
                wVar = C41238w.f97225a;
            } catch (Exception unused) {
                this.f51834a.setColorFilter((ColorFilter) null);
                return;
            }
        } else {
            wVar = null;
        }
        if (wVar == null) {
            this.f51834a.setColorFilter((ColorFilter) null);
        }
    }
}
