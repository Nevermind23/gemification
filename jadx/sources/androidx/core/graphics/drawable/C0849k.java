package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;

/* renamed from: androidx.core.graphics.drawable.k */
class C0849k extends C0850l {
    protected C0849k(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3311c(int i, int i2, int i3, Rect rect, Rect rect2) {
        Gravity.apply(i, i2, i3, rect, rect2, 0);
    }

    public void getOutline(Outline outline) {
        mo3315f();
        outline.setRoundRect(this.f3487h, mo3313b());
    }
}
