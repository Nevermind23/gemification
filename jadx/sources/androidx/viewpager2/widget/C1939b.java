package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/* renamed from: androidx.viewpager2.widget.b */
final class C1939b extends ViewPager2.C1928i {

    /* renamed from: a */
    private final List f5838a;

    C1939b(int i) {
        this.f5838a = new ArrayList(i);
    }

    /* renamed from: c */
    private void m7614c(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6659a(ViewPager2.C1928i iVar) {
        this.f5838a.add(iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo6660b(ViewPager2.C1928i iVar) {
        this.f5838a.remove(iVar);
    }

    public void onPageScrollStateChanged(int i) {
        try {
            for (ViewPager2.C1928i onPageScrollStateChanged : this.f5838a) {
                onPageScrollStateChanged.onPageScrollStateChanged(i);
            }
        } catch (ConcurrentModificationException e) {
            m7614c(e);
        }
    }

    public void onPageScrolled(int i, float f, int i2) {
        try {
            for (ViewPager2.C1928i onPageScrolled : this.f5838a) {
                onPageScrolled.onPageScrolled(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            m7614c(e);
        }
    }

    public void onPageSelected(int i) {
        try {
            for (ViewPager2.C1928i onPageSelected : this.f5838a) {
                onPageSelected.onPageSelected(i);
            }
        } catch (ConcurrentModificationException e) {
            m7614c(e);
        }
    }
}
