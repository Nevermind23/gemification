package al0;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ok0.C27028d;
import p341ge.bog.designsystem.components.buttonlist.ButtonListLargeView;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;

/* renamed from: al0.c */
public abstract class C19262c {
    /* renamed from: a */
    public static final Drawable m64709a(Color color, Context context) {
        C41536l.m120489i(color, "<this>");
        C41536l.m120489i(context, "context");
        if (Build.VERSION.SDK_INT < 29) {
            return new ColorDrawable(color.mo35260a(context));
        }
        C19261b.m64708a();
        return C19260a.m64707a(color.mo35261b(context));
    }

    /* renamed from: b */
    public static final void m64710b(ButtonListLargeView buttonListLargeView, String str) {
        C41536l.m120489i(buttonListLargeView, "<this>");
        if (str == null) {
            str = "";
        }
        buttonListLargeView.setIcon(new Image.Url(str, (Image.Placeholder) null, new Image.Resource(C27028d.f67867W, (Boolean) null, 2, (DefaultConstructorMarker) null), (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 122, (DefaultConstructorMarker) null));
    }
}
