package p060e1;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: e1.t0 */
class C5999t0 implements C6001u0 {

    /* renamed from: a */
    private final ViewGroupOverlay f18751a;

    C5999t0(ViewGroup viewGroup) {
        this.f18751a = viewGroup.getOverlay();
    }

    /* renamed from: a */
    public void mo19449a(Drawable drawable) {
        this.f18751a.add(drawable);
    }

    /* renamed from: b */
    public void mo19450b(Drawable drawable) {
        this.f18751a.remove(drawable);
    }

    /* renamed from: c */
    public void mo19451c(View view) {
        this.f18751a.add(view);
    }

    /* renamed from: d */
    public void mo19452d(View view) {
        this.f18751a.remove(view);
    }
}
