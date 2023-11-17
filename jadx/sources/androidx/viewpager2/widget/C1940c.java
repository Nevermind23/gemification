package androidx.viewpager2.widget;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.viewpager2.widget.c */
public final class C1940c implements ViewPager2.C1933k {

    /* renamed from: a */
    private final List f5839a = new ArrayList();

    /* renamed from: a */
    public void mo6653a(View view, float f) {
        for (ViewPager2.C1933k a : this.f5839a) {
            a.mo6653a(view, f);
        }
    }

    /* renamed from: b */
    public void mo6661b(ViewPager2.C1933k kVar) {
        this.f5839a.add(kVar);
    }
}
