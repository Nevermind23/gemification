package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* renamed from: androidx.viewpager2.widget.f */
final class C1943f extends ViewPager2.C1928i {

    /* renamed from: a */
    private final LinearLayoutManager f5844a;

    /* renamed from: b */
    private ViewPager2.C1933k f5845b;

    C1943f(LinearLayoutManager linearLayoutManager) {
        this.f5844a = linearLayoutManager;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ViewPager2.C1933k mo6663a() {
        return this.f5845b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo6664b(ViewPager2.C1933k kVar) {
        this.f5845b = kVar;
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
        if (this.f5845b != null) {
            float f2 = -f;
            int i3 = 0;
            while (i3 < this.f5844a.mo5660V()) {
                View U = this.f5844a.mo5658U(i3);
                if (U != null) {
                    this.f5845b.mo6653a(U, ((float) (this.f5844a.mo5700q0(U) - i)) + f2);
                    i3++;
                } else {
                    throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", new Object[]{Integer.valueOf(i3), Integer.valueOf(this.f5844a.mo5660V())}));
                }
            }
        }
    }

    public void onPageSelected(int i) {
    }
}
