package gb1;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.C41536l;

/* renamed from: gb1.y */
public abstract class C32395y {
    /* renamed from: b */
    public static final void m95667b(ViewPager2 viewPager2, int i, int i2) {
        C41536l.m120489i(viewPager2, "<this>");
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(3);
        viewPager2.setPageTransformer(new C32394x(i2, i, viewPager2));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final void m95668c(int i, int i2, ViewPager2 viewPager2, View view, float f) {
        C41536l.m120489i(viewPager2, "$this_setShowSideItems");
        C41536l.m120489i(view, "page");
        float f2 = f * ((float) (-((i * 2) + i2)));
        if (viewPager2.getOrientation() != 0) {
            view.setTranslationY(f2);
        } else if (ViewCompat.m3541B(viewPager2) == 1) {
            view.setTranslationX(-f2);
        } else {
            view.setTranslationX(f2);
        }
    }
}
