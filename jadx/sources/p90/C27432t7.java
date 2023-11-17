package p90;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import p086g1.C6201a;
import p086g1.C6202b;
import p366bk.C10322k;

/* renamed from: p90.t7 */
public final class C27432t7 implements C6201a {

    /* renamed from: d */
    private final CardView f69853d;

    /* renamed from: e */
    public final AppCompatTextView f69854e;

    /* renamed from: f */
    public final FrameLayout f69855f;

    /* renamed from: g */
    public final AppCompatTextView f69856g;

    /* renamed from: h */
    public final ImageView f69857h;

    /* renamed from: i */
    public final ImageView f69858i;

    /* renamed from: j */
    public final LinearLayout f69859j;

    /* renamed from: k */
    public final AppCompatTextView f69860k;

    /* renamed from: l */
    public final AppCompatTextView f69861l;

    /* renamed from: m */
    public final AppCompatTextView f69862m;

    private C27432t7(CardView cardView, AppCompatTextView appCompatTextView, FrameLayout frameLayout, AppCompatTextView appCompatTextView2, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5) {
        this.f69853d = cardView;
        this.f69854e = appCompatTextView;
        this.f69855f = frameLayout;
        this.f69856g = appCompatTextView2;
        this.f69857h = imageView;
        this.f69858i = imageView2;
        this.f69859j = linearLayout;
        this.f69860k = appCompatTextView3;
        this.f69861l = appCompatTextView4;
        this.f69862m = appCompatTextView5;
    }

    /* renamed from: a */
    public static C27432t7 m85036a(View view) {
        int i = C10322k.effective_rate;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C10322k.icons;
            FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
            if (frameLayout != null) {
                i = C10322k.offer_description;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView2 != null) {
                    i = C10322k.offer_icon;
                    ImageView imageView = (ImageView) C6202b.m24689a(view, i);
                    if (imageView != null) {
                        i = C10322k.offer_icon_bnpl;
                        ImageView imageView2 = (ImageView) C6202b.m24689a(view, i);
                        if (imageView2 != null) {
                            i = C10322k.oval_container;
                            LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
                            if (linearLayout != null) {
                                i = C10322k.percent_pre_text;
                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) C6202b.m24689a(view, i);
                                if (appCompatTextView3 != null) {
                                    i = C10322k.product_name;
                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) C6202b.m24689a(view, i);
                                    if (appCompatTextView4 != null) {
                                        i = C10322k.text_from;
                                        AppCompatTextView appCompatTextView5 = (AppCompatTextView) C6202b.m24689a(view, i);
                                        if (appCompatTextView5 != null) {
                                            return new C27432t7((CardView) view, appCompatTextView, frameLayout, appCompatTextView2, imageView, imageView2, linearLayout, appCompatTextView3, appCompatTextView4, appCompatTextView5);
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

    /* renamed from: c */
    public CardView mo3946b() {
        return this.f69853d;
    }
}
