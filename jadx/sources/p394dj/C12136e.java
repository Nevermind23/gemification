package p394dj;

import android.graphics.drawable.Drawable;
import java.util.Map;
import p341ge.bog.designsystem.components.common.Image;

/* renamed from: dj.e */
public abstract class C12136e {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final Image m44507b(Image image, Drawable drawable) {
        if (!(image instanceof Image.Url)) {
            return image;
        }
        Image.Url url = (Image.Url) image;
        if (url.mo35409i() == null && url.mo35410j() == null) {
            return Image.Url.m49924d(url, (String) null, (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, drawable, (Drawable) null, (Boolean) null, 111, (Object) null);
        }
        return image;
    }
}
