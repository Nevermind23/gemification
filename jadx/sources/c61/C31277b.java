package c61;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewpager2.widget.ViewPager2;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.mobilebank.stories.presentation.customview.PageIndicatorView;
import x51.C39792d;
import x51.C39793e;

/* renamed from: c61.b */
public final class C31277b implements C6201a {

    /* renamed from: d */
    private final LayerView f77660d;

    /* renamed from: e */
    public final Button f77661e;

    /* renamed from: f */
    public final Guideline f77662f;

    /* renamed from: g */
    public final Guideline f77663g;

    /* renamed from: h */
    public final Guideline f77664h;

    /* renamed from: i */
    public final PageIndicatorView f77665i;

    /* renamed from: j */
    public final ViewPager2 f77666j;

    private C31277b(LayerView layerView, Button button, Guideline guideline, Guideline guideline2, Guideline guideline3, PageIndicatorView pageIndicatorView, ViewPager2 viewPager2) {
        this.f77660d = layerView;
        this.f77661e = button;
        this.f77662f = guideline;
        this.f77663g = guideline2;
        this.f77664h = guideline3;
        this.f77665i = pageIndicatorView;
        this.f77666j = viewPager2;
    }

    /* renamed from: a */
    public static C31277b m92898a(View view) {
        int i = C39792d.f94499f;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C39792d.f94504k;
            Guideline guideline = (Guideline) C6202b.m24689a(view, i);
            if (guideline != null) {
                i = C39792d.f94505m;
                Guideline guideline2 = (Guideline) C6202b.m24689a(view, i);
                if (guideline2 != null) {
                    i = C39792d.f94506o;
                    Guideline guideline3 = (Guideline) C6202b.m24689a(view, i);
                    if (guideline3 != null) {
                        i = C39792d.f94508t;
                        PageIndicatorView pageIndicatorView = (PageIndicatorView) C6202b.m24689a(view, i);
                        if (pageIndicatorView != null) {
                            i = C39792d.story_details_container;
                            ViewPager2 viewPager2 = (ViewPager2) C6202b.m24689a(view, i);
                            if (viewPager2 != null) {
                                return new C31277b((LayerView) view, button, guideline, guideline2, guideline3, pageIndicatorView, viewPager2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C31277b m92899d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39793e.fragment_story_group, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m92898a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f77660d;
    }
}
