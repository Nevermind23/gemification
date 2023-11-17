package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewParent;
import androidx.core.util.C1008h;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: androidx.viewpager2.widget.e */
public final class C1942e implements ViewPager2.C1933k {

    /* renamed from: a */
    private final int f5843a;

    public C1942e(int i) {
        C1008h.m3528e(i, "Margin must be non-negative");
        this.f5843a = i;
    }

    /* renamed from: b */
    private ViewPager2 m7620b(View view) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if ((parent instanceof RecyclerView) && (parent2 instanceof ViewPager2)) {
            return (ViewPager2) parent2;
        }
        throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
    }

    /* renamed from: a */
    public void mo6653a(View view, float f) {
        ViewPager2 b = m7620b(view);
        float f2 = ((float) this.f5843a) * f;
        if (b.getOrientation() == 0) {
            if (b.mo6593e()) {
                f2 = -f2;
            }
            view.setTranslationX(f2);
            return;
        }
        view.setTranslationY(f2);
    }
}
