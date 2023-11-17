package p060e1;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: e1.y0 */
class C6010y0 implements C6012z0 {

    /* renamed from: a */
    private final ViewOverlay f18757a;

    C6010y0(View view) {
        this.f18757a = view.getOverlay();
    }

    /* renamed from: a */
    public void mo19449a(Drawable drawable) {
        this.f18757a.add(drawable);
    }

    /* renamed from: b */
    public void mo19450b(Drawable drawable) {
        this.f18757a.remove(drawable);
    }
}
