package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogViewPager;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.d0 */
public final class C27274d0 implements C6201a {

    /* renamed from: d */
    private final FrameLayout f68499d;

    /* renamed from: e */
    public final ImageView f68500e;

    /* renamed from: f */
    public final AppCompatTextView f68501f;

    /* renamed from: g */
    public final AppCompatTextView f68502g;

    /* renamed from: h */
    public final AppCompatTextView f68503h;

    /* renamed from: i */
    public final SwipeRefreshLayout f68504i;

    /* renamed from: j */
    public final LinearLayout f68505j;

    /* renamed from: k */
    public final BogViewPager f68506k;

    /* renamed from: l */
    public final FrameLayout f68507l;

    /* renamed from: m */
    public final C27272c8 f68508m;

    private C27274d0(FrameLayout frameLayout, ImageView imageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, SwipeRefreshLayout swipeRefreshLayout, LinearLayout linearLayout, BogViewPager bogViewPager, FrameLayout frameLayout2, C27272c8 c8Var) {
        this.f68499d = frameLayout;
        this.f68500e = imageView;
        this.f68501f = appCompatTextView;
        this.f68502g = appCompatTextView2;
        this.f68503h = appCompatTextView3;
        this.f68504i = swipeRefreshLayout;
        this.f68505j = linearLayout;
        this.f68506k = bogViewPager;
        this.f68507l = frameLayout2;
        this.f68508m = c8Var;
    }

    /* renamed from: a */
    public static C27274d0 m84395a(View view) {
        int i = C10322k.exchange_activity_chart_imageview;
        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
        if (imageView != null) {
            i = C10322k.exchange_calculator_tab;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView != null) {
                i = C10322k.exchange_currencies_tab;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView2 != null) {
                    i = C10322k.exchange_date_text_view;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) C6202b.m24689a(view, i);
                    if (appCompatTextView3 != null) {
                        i = C10322k.exchange_swipe_to_refresh;
                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) C6202b.m24689a(view, i);
                        if (swipeRefreshLayout != null) {
                            i = C10322k.exchange_tab_holder;
                            LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
                            if (linearLayout != null) {
                                i = C10322k.exchange_viewpager;
                                BogViewPager bogViewPager = (BogViewPager) C6202b.m24689a(view, i);
                                if (bogViewPager != null) {
                                    FrameLayout frameLayout = (FrameLayout) view;
                                    i = C10322k.f28730Ex;
                                    View a = C6202b.m24689a(view, i);
                                    if (a != null) {
                                        return new C27274d0(frameLayout, imageView, appCompatTextView, appCompatTextView2, appCompatTextView3, swipeRefreshLayout, linearLayout, bogViewPager, frameLayout, C27272c8.m84388a(a));
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
    public static C27274d0 m84396d(LayoutInflater layoutInflater) {
        return m84397e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27274d0 m84397e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.activity_exchange, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84395a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f68499d;
    }
}
