package xn0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import p086g1.C6201a;
import p086g1.C6202b;
import sn0.C17901e;
import sn0.C17902f;

/* renamed from: xn0.x */
public final class C18866x implements C6201a {

    /* renamed from: d */
    private final LinearLayout f52793d;

    /* renamed from: e */
    public final FrameLayout f52794e;

    /* renamed from: f */
    public final ViewPager2 f52795f;

    private C18866x(LinearLayout linearLayout, FrameLayout frameLayout, ViewPager2 viewPager2) {
        this.f52793d = linearLayout;
        this.f52794e = frameLayout;
        this.f52795f = viewPager2;
    }

    /* renamed from: a */
    public static C18866x m63834a(View view) {
        int i = C17901e.f50971i0;
        FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
        if (frameLayout != null) {
            i = C17901e.f50981p0;
            ViewPager2 viewPager2 = (ViewPager2) C6202b.m24689a(view, i);
            if (viewPager2 != null) {
                return new C18866x((LinearLayout) view, frameLayout, viewPager2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C18866x m63835d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17902f.section_home_slider, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m63834a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f52793d;
    }
}
