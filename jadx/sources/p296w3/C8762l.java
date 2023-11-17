package p296w3;

import android.graphics.drawable.Drawable;
import p192o3.C7430c;

/* renamed from: w3.l */
final class C8762l extends C8760j {
    private C8762l(Drawable drawable) {
        super(drawable);
    }

    /* renamed from: e */
    static C7430c m32598e(Drawable drawable) {
        if (drawable != null) {
            return new C8762l(drawable);
        }
        return null;
    }

    /* renamed from: a */
    public int mo7941a() {
        return Math.max(1, this.f24612d.getIntrinsicWidth() * this.f24612d.getIntrinsicHeight() * 4);
    }

    /* renamed from: d */
    public Class mo7944d() {
        return this.f24612d.getClass();
    }

    public void recycle() {
    }
}
