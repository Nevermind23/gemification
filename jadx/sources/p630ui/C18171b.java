package p630ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ui.b */
public abstract class C18171b extends ViewOutlineProvider {

    /* renamed from: a */
    private final float f51483a;

    /* renamed from: ui.b$a */
    public static final class C18172a extends C18171b {
        public C18172a(float f) {
            super(f, (DefaultConstructorMarker) null);
        }

        public void getOutline(View view, Outline outline) {
            Rect bounds;
            C41536l.m120489i(view, "view");
            C41536l.m120489i(outline, "outline");
            Drawable background = view.getBackground();
            if (background != null && (bounds = background.getBounds()) != null) {
                outline.setOval(bounds);
                outline.setAlpha(mo45834a());
            }
        }
    }

    /* renamed from: ui.b$b */
    public static final class C18173b extends C18171b {

        /* renamed from: b */
        private final float f51484b;

        /* renamed from: c */
        private final int f51485c;

        /* renamed from: d */
        private final Rect f51486d = new Rect();

        public C18173b(float f, float f2, int i) {
            super(f, (DefaultConstructorMarker) null);
            this.f51484b = f2;
            this.f51485c = i;
        }

        public void getOutline(View view, Outline outline) {
            Rect bounds;
            C41536l.m120489i(view, "view");
            C41536l.m120489i(outline, "outline");
            Drawable background = view.getBackground();
            if (background != null && (bounds = background.getBounds()) != null) {
                this.f51486d.set(bounds);
                int i = this.f51485c;
                if (i == 1) {
                    this.f51486d.bottom += (int) this.f51484b;
                } else if (i == 2) {
                    this.f51486d.left -= (int) this.f51484b;
                } else if (i == 3) {
                    this.f51486d.top -= (int) this.f51484b;
                } else if (i == 4) {
                    this.f51486d.right += (int) this.f51484b;
                }
                Rect rect = this.f51486d;
                outline.setRoundRect(rect, Math.min(((float) rect.height()) / 2.0f, this.f51484b));
                outline.setAlpha(mo45834a());
            }
        }
    }

    public /* synthetic */ C18171b(float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final float mo45834a() {
        return this.f51483a;
    }

    private C18171b(float f) {
        this.f51483a = f;
    }
}
