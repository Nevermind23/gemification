package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p356ao.C10114f;
import p356ao.C10115g;

/* renamed from: eo.s */
public final class C12768s implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f37845d;

    /* renamed from: e */
    public final Button f37846e;

    /* renamed from: f */
    public final Button f37847f;

    /* renamed from: g */
    public final ViewPager2 f37848g;

    /* renamed from: h */
    public final LayerView f37849h;

    /* renamed from: i */
    public final CoordinatorLayout f37850i;

    /* renamed from: j */
    public final Button f37851j;

    /* renamed from: k */
    public final LinearLayout f37852k;

    /* renamed from: l */
    public final ConstraintLayout f37853l;

    /* renamed from: m */
    public final PageDescriptionView f37854m;

    /* renamed from: n */
    public final ViewPager2 f37855n;

    /* renamed from: o */
    public final Button f37856o;

    /* renamed from: p */
    public final FrameLayout f37857p;

    /* renamed from: q */
    public final LoadingView f37858q;

    private C12768s(ConstraintLayout constraintLayout, Button button, Button button2, ViewPager2 viewPager2, LayerView layerView, CoordinatorLayout coordinatorLayout, Button button3, LinearLayout linearLayout, ConstraintLayout constraintLayout2, PageDescriptionView pageDescriptionView, ViewPager2 viewPager22, Button button4, FrameLayout frameLayout, LoadingView loadingView) {
        this.f37845d = constraintLayout;
        this.f37846e = button;
        this.f37847f = button2;
        this.f37848g = viewPager2;
        this.f37849h = layerView;
        this.f37850i = coordinatorLayout;
        this.f37851j = button3;
        this.f37852k = linearLayout;
        this.f37853l = constraintLayout2;
        this.f37854m = pageDescriptionView;
        this.f37855n = viewPager22;
        this.f37856o = button4;
        this.f37857p = frameLayout;
        this.f37858q = loadingView;
    }

    /* renamed from: a */
    public static C12768s m48470a(View view) {
        View view2 = view;
        int i = C10114f.f27966o;
        Button button = (Button) C6202b.m24689a(view2, i);
        if (button != null) {
            i = C10114f.become_solo_button;
            Button button2 = (Button) C6202b.m24689a(view2, i);
            if (button2 != null) {
                i = C10114f.benef_pager;
                ViewPager2 viewPager2 = (ViewPager2) C6202b.m24689a(view2, i);
                if (viewPager2 != null) {
                    i = C10114f.f27927F;
                    LayerView layerView = (LayerView) C6202b.m24689a(view2, i);
                    if (layerView != null) {
                        i = C10114f.f27936Q;
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) C6202b.m24689a(view2, i);
                        if (coordinatorLayout != null) {
                            i = C10114f.details_button;
                            Button button3 = (Button) C6202b.m24689a(view2, i);
                            if (button3 != null) {
                                i = C10114f.f27953e0;
                                LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view2, i);
                                if (linearLayout != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) view2;
                                    i = C10114f.f27931M0;
                                    PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view2, i);
                                    if (pageDescriptionView != null) {
                                        i = C10114f.f27935P0;
                                        ViewPager2 viewPager22 = (ViewPager2) C6202b.m24689a(view2, i);
                                        if (viewPager22 != null) {
                                            i = C10114f.f27952d1;
                                            Button button4 = (Button) C6202b.m24689a(view2, i);
                                            if (button4 != null) {
                                                i = C10114f.f27959j1;
                                                FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view2, i);
                                                if (frameLayout != null) {
                                                    i = C10114f.f27963l1;
                                                    LoadingView loadingView = (LoadingView) C6202b.m24689a(view2, i);
                                                    if (loadingView != null) {
                                                        return new C12768s(constraintLayout, button, button2, viewPager2, layerView, coordinatorLayout, button3, linearLayout, constraintLayout, pageDescriptionView, viewPager22, button4, frameLayout, loadingView);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12768s m48471d(LayoutInflater layoutInflater) {
        return m48472e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C12768s m48472e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.fragment_package_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48470a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f37845d;
    }
}
