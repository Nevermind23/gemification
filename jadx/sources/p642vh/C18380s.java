package p642vh;

import android.content.Context;
import androidx.core.content.C0767a;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.common.Image;

/* renamed from: vh.s */
public abstract class C18380s {
    /* renamed from: a */
    public static final Object m62796a(Image image, Context context) {
        C41536l.m120489i(image, "<this>");
        C41536l.m120489i(context, "context");
        if (image instanceof Image.Resource) {
            return C0767a.m2895e(context, ((Image.Resource) image).mo35391d());
        }
        if (image instanceof Image.Attribute) {
            return C18368l.m62763l(context, ((Image.Attribute) image).mo35371d());
        }
        return image.mo35313a();
    }
}
