package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.l2 */
public final class C27355l2 implements C6201a {

    /* renamed from: d */
    private final CardView f69212d;

    /* renamed from: e */
    public final ImageView f69213e;

    /* renamed from: f */
    public final BogTextView f69214f;

    /* renamed from: g */
    public final BogTextView f69215g;

    /* renamed from: h */
    public final ImageView f69216h;

    private C27355l2(CardView cardView, ImageView imageView, BogTextView bogTextView, BogTextView bogTextView2, ImageView imageView2) {
        this.f69212d = cardView;
        this.f69213e = imageView;
        this.f69214f = bogTextView;
        this.f69215g = bogTextView2;
        this.f69216h = imageView2;
    }

    /* renamed from: a */
    public static C27355l2 m84728a(View view) {
        int i = C10322k.dismiss_banner_image;
        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
        if (imageView != null) {
            i = C10322k.f28847im;
            BogTextView bogTextView = (BogTextView) C6202b.m24689a(view, i);
            if (bogTextView != null) {
                i = C10322k.pending_product_confirmation_item_title_text;
                BogTextView bogTextView2 = (BogTextView) C6202b.m24689a(view, i);
                if (bogTextView2 != null) {
                    i = C10322k.product_confirmation_logo_IV;
                    ImageView imageView2 = (ImageView) C6202b.m24689a(view, i);
                    if (imageView2 != null) {
                        return new C27355l2((CardView) view, imageView, bogTextView, bogTextView2, imageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27355l2 m84729d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.banner_pending_product_confirmation, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84728a(inflate);
    }

    /* renamed from: c */
    public CardView mo3946b() {
        return this.f69212d;
    }
}
