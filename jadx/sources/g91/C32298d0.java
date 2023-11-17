package g91;

import android.graphics.drawable.Drawable;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Image;

/* renamed from: g91.d0 */
public abstract class C32298d0 {
    /* renamed from: a */
    public static final Image m95162a(String str) {
        C41536l.m120489i(str, C11769i.C11770a.f34149l);
        String c = C32289b0.m95091c(str);
        C41536l.m120488h(c, "generateImageUrl(url)");
        return new Image.Url(c, (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null);
    }
}
