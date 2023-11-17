package p90;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p366bk.C10322k;

/* renamed from: p90.y6 */
public final class C27476y6 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f70272d;

    /* renamed from: e */
    public final ImageView f70273e;

    /* renamed from: f */
    public final FrameLayout f70274f;

    /* renamed from: g */
    public final AppCompatTextView f70275g;

    /* renamed from: h */
    public final FrameLayout f70276h;

    /* renamed from: i */
    public final AppCompatTextView f70277i;

    /* renamed from: j */
    public final AppCompatImageView f70278j;

    /* renamed from: k */
    public final RecyclerView f70279k;

    private C27476y6(LinearLayout linearLayout, ImageView imageView, FrameLayout frameLayout, AppCompatTextView appCompatTextView, FrameLayout frameLayout2, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView, RecyclerView recyclerView) {
        this.f70272d = linearLayout;
        this.f70273e = imageView;
        this.f70274f = frameLayout;
        this.f70275g = appCompatTextView;
        this.f70276h = frameLayout2;
        this.f70277i = appCompatTextView2;
        this.f70278j = appCompatImageView;
        this.f70279k = recyclerView;
    }

    /* renamed from: a */
    public static C27476y6 m85212a(View view) {
        int i = C10322k.euro_atm_check_image;
        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
        if (imageView != null) {
            i = C10322k.euro_atm_check_layout;
            FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
            if (frameLayout != null) {
                i = C10322k.euro_atm_check_title;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView != null) {
                    i = C10322k.filtration_city_layout;
                    FrameLayout frameLayout2 = (FrameLayout) C6202b.m24689a(view, i);
                    if (frameLayout2 != null) {
                        i = C10322k.filtration_city_tv;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                        if (appCompatTextView2 != null) {
                            i = C10322k.filtration_close_button;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
                            if (appCompatImageView != null) {
                                i = C10322k.filtration_recycler_view;
                                RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
                                if (recyclerView != null) {
                                    return new C27476y6((LinearLayout) view, imageView, frameLayout, appCompatTextView, frameLayout2, appCompatTextView2, appCompatImageView, recyclerView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f70272d;
    }
}
