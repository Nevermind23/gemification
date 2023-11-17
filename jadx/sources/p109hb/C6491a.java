package p109hb;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.content.C0767a;
import p340za.C9274b;

/* renamed from: hb.a */
class C6491a extends Drawable {

    /* renamed from: a */
    private final Drawable f19813a;

    /* renamed from: b */
    private final Drawable f19814b;

    /* renamed from: c */
    private int f19815c = -1;

    public C6491a(Context context) {
        this.f19814b = C0767a.m2895e(context, C9274b.amu_bubble_mask);
        this.f19813a = C0767a.m2895e(context, C9274b.amu_bubble_shadow);
    }

    /* renamed from: a */
    public void mo20395a(int i) {
        this.f19815c = i;
    }

    public void draw(Canvas canvas) {
        this.f19814b.draw(canvas);
        canvas.drawColor(this.f19815c, PorterDuff.Mode.SRC_IN);
        this.f19813a.draw(canvas);
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        return this.f19814b.getPadding(rect);
    }

    public void setAlpha(int i) {
        throw new UnsupportedOperationException();
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        this.f19814b.setBounds(i, i2, i3, i4);
        this.f19813a.setBounds(i, i2, i3, i4);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException();
    }

    public void setBounds(Rect rect) {
        this.f19814b.setBounds(rect);
        this.f19813a.setBounds(rect);
    }
}
