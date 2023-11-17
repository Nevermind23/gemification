package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.z6 */
public final class C27485z6 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f70358d;

    /* renamed from: e */
    public final BogTextView f70359e;

    /* renamed from: f */
    public final BogTextView f70360f;

    /* renamed from: g */
    public final BogTextView f70361g;

    /* renamed from: h */
    public final ImageView f70362h;

    private C27485z6(LinearLayout linearLayout, BogTextView bogTextView, BogTextView bogTextView2, BogTextView bogTextView3, ImageView imageView) {
        this.f70358d = linearLayout;
        this.f70359e = bogTextView;
        this.f70360f = bogTextView2;
        this.f70361g = bogTextView3;
        this.f70362h = imageView;
    }

    /* renamed from: a */
    public static C27485z6 m85246a(View view) {
        int i = C10322k.bank_address_tv;
        BogTextView bogTextView = (BogTextView) C6202b.m24689a(view, i);
        if (bogTextView != null) {
            i = C10322k.bank_name_tv;
            BogTextView bogTextView2 = (BogTextView) C6202b.m24689a(view, i);
            if (bogTextView2 != null) {
                i = C10322k.bank_swift_tv;
                BogTextView bogTextView3 = (BogTextView) C6202b.m24689a(view, i);
                if (bogTextView3 != null) {
                    i = C10322k.tick_img;
                    ImageView imageView = (ImageView) C6202b.m24689a(view, i);
                    if (imageView != null) {
                        return new C27485z6((LinearLayout) view, bogTextView, bogTextView2, bogTextView3, imageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27485z6 m85247d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.layout_foreign_bank_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m85246a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f70358d;
    }
}
