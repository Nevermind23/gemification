package p642vh;

import af1.C40303i;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import androidx.core.widget.C1305j;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41555e;

/* renamed from: vh.t */
public final class C18381t implements C41555e {

    /* renamed from: a */
    private final ImageView f51836a;

    public C18381t(ImageView imageView, PorterDuff.Mode mode) {
        C41536l.m120489i(imageView, "imageView");
        C41536l.m120489i(mode, "imageTintMode");
        this.f51836a = imageView;
        C1305j.m4530d(imageView, mode);
    }

    /* renamed from: a */
    public ColorStateList getValue(Object obj, C40303i iVar) {
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        return C1305j.m4527a(this.f51836a);
    }

    /* renamed from: b */
    public void setValue(Object obj, C40303i iVar, ColorStateList colorStateList) {
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        C1305j.m4529c(this.f51836a, colorStateList);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18381t(ImageView imageView, PorterDuff.Mode mode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageView, (i & 2) != 0 ? PorterDuff.Mode.SRC_IN : mode);
    }
}
