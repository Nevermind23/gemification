package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.q1 */
class C0480q1 extends C0453i1 {

    /* renamed from: b */
    private final WeakReference f2203b;

    public C0480q1(Context context, Resources resources) {
        super(resources);
        this.f2203b = new WeakReference(context);
    }

    public Drawable getDrawable(int i) {
        Drawable a = mo2147a(i);
        Context context = (Context) this.f2203b.get();
        if (!(a == null || context == null)) {
            C0436h1.m1738h().mo2118x(context, i, a);
        }
        return a;
    }
}
