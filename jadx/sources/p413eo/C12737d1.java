package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p356ao.C10114f;
import p356ao.C10115g;

/* renamed from: eo.d1 */
public final class C12737d1 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f37696d;

    /* renamed from: e */
    public final EmptyWidget f37697e;

    /* renamed from: f */
    public final ViewPager2 f37698f;

    /* renamed from: g */
    public final FrameLayout f37699g;

    private C12737d1(LinearLayout linearLayout, EmptyWidget emptyWidget, ViewPager2 viewPager2, FrameLayout frameLayout) {
        this.f37696d = linearLayout;
        this.f37697e = emptyWidget;
        this.f37698f = viewPager2;
        this.f37699g = frameLayout;
    }

    /* renamed from: a */
    public static C12737d1 m48341a(View view) {
        int i = C10114f.f27962l0;
        EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
        if (emptyWidget != null) {
            i = C10114f.f27935P0;
            ViewPager2 viewPager2 = (ViewPager2) C6202b.m24689a(view, i);
            if (viewPager2 != null) {
                i = C10114f.f27959j1;
                FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
                if (frameLayout != null) {
                    return new C12737d1((LinearLayout) view, emptyWidget, viewPager2, frameLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12737d1 m48342d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.list_item_recommended_package_slider, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48341a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f37696d;
    }
}
