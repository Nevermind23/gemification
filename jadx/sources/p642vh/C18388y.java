package p642vh;

import androidx.viewpager2.widget.ViewPager2;

/* renamed from: vh.y */
public abstract class C18388y extends ViewPager2.C1928i {

    /* renamed from: a */
    private int f51845a;

    /* renamed from: b */
    private boolean f51846b;

    /* renamed from: a */
    public abstract void mo46187a(int i);

    public void onPageScrollStateChanged(int i) {
        if (1 != i && i == 0 && this.f51846b) {
            this.f51846b = false;
            mo46187a(this.f51845a);
        }
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
        this.f51845a = i;
        this.f51846b = true;
    }
}
