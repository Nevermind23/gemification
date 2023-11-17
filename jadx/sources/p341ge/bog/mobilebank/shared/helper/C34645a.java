package p341ge.bog.mobilebank.shared.helper;

import android.graphics.drawable.Drawable;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.mobilebank.shared.helper.ImageSource;

/* renamed from: ge.bog.mobilebank.shared.helper.a */
public abstract class C34645a {
    /* renamed from: a */
    public static final Image m101746a(ImageSource imageSource) {
        C41536l.m120489i(imageSource, "<this>");
        if (imageSource instanceof ImageSource.Resource) {
            return new Image.Resource(((ImageSource.Resource) imageSource).mo84372a(), (Boolean) null, 2, (DefaultConstructorMarker) null);
        }
        if (imageSource instanceof ImageSource.Url) {
            return new Image.Url(((ImageSource.Url) imageSource).mo84384d(), (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
