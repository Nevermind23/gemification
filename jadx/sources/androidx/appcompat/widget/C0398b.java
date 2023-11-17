package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.appcompat.widget.b */
class C0398b extends Drawable {

    /* renamed from: a */
    final ActionBarContainer f2030a;

    /* renamed from: androidx.appcompat.widget.b$a */
    private static class C0399a {
        /* renamed from: a */
        public static void m1619a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public C0398b(ActionBarContainer actionBarContainer) {
        this.f2030a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f2030a;
        if (actionBarContainer.f1707k) {
            Drawable drawable = actionBarContainer.f1706j;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1704h;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f2030a;
        Drawable drawable3 = actionBarContainer2.f1705i;
        if (drawable3 != null && actionBarContainer2.f1708l) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f2030a;
        if (!actionBarContainer.f1707k) {
            Drawable drawable = actionBarContainer.f1704h;
            if (drawable != null) {
                C0399a.m1619a(drawable, outline);
            }
        } else if (actionBarContainer.f1706j != null) {
            C0399a.m1619a(actionBarContainer.f1704h, outline);
        }
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
