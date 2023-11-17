package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.o2 */
public final class C27382o2 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f69448d;

    /* renamed from: e */
    public final ImageView f69449e;

    /* renamed from: f */
    public final ImageView f69450f;

    /* renamed from: g */
    public final ConstraintLayout f69451g;

    /* renamed from: h */
    public final BogTextView f69452h;

    /* renamed from: i */
    public final LinearLayout f69453i;

    /* renamed from: j */
    public final BogTextView f69454j;

    /* renamed from: k */
    public final BogTextView f69455k;

    private C27382o2(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout2, BogTextView bogTextView, LinearLayout linearLayout, BogTextView bogTextView2, BogTextView bogTextView3) {
        this.f69448d = constraintLayout;
        this.f69449e = imageView;
        this.f69450f = imageView2;
        this.f69451g = constraintLayout2;
        this.f69452h = bogTextView;
        this.f69453i = linearLayout;
        this.f69454j = bogTextView2;
        this.f69455k = bogTextView3;
    }

    /* renamed from: a */
    public static C27382o2 m84832a(View view) {
        int i = C10322k.bannerArrow;
        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
        if (imageView != null) {
            i = C10322k.bannerImage;
            ImageView imageView2 = (ImageView) C6202b.m24689a(view, i);
            if (imageView2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = C10322k.descriptionTV;
                BogTextView bogTextView = (BogTextView) C6202b.m24689a(view, i);
                if (bogTextView != null) {
                    i = C10322k.expandableDetailsLayout;
                    LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
                    if (linearLayout != null) {
                        i = C10322k.headerTV;
                        BogTextView bogTextView2 = (BogTextView) C6202b.m24689a(view, i);
                        if (bogTextView2 != null) {
                            i = C10322k.smallDescriptionTV;
                            BogTextView bogTextView3 = (BogTextView) C6202b.m24689a(view, i);
                            if (bogTextView3 != null) {
                                return new C27382o2(constraintLayout, imageView, imageView2, constraintLayout, bogTextView, linearLayout, bogTextView2, bogTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27382o2 m84833d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.cash_cover_loan_expandable_view_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84832a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f69448d;
    }
}
