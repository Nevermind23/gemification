package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.g8 */
public final class C27312g8 implements C6201a {

    /* renamed from: d */
    private final View f68834d;

    /* renamed from: e */
    public final View f68835e;

    /* renamed from: f */
    public final ImageView f68836f;

    /* renamed from: g */
    public final BogTextView f68837g;

    /* renamed from: h */
    public final BogTextView f68838h;

    /* renamed from: i */
    public final BogTextView f68839i;

    private C27312g8(View view, View view2, ImageView imageView, BogTextView bogTextView, BogTextView bogTextView2, BogTextView bogTextView3) {
        this.f68834d = view;
        this.f68835e = view2;
        this.f68836f = imageView;
        this.f68837g = bogTextView;
        this.f68838h = bogTextView2;
        this.f68839i = bogTextView3;
    }

    /* renamed from: a */
    public static C27312g8 m84555a(View view) {
        int i = C10322k.f28891s4;
        View a = C6202b.m24689a(view, i);
        if (a != null) {
            i = C10322k.ivCheckbox;
            ImageView imageView = (ImageView) C6202b.m24689a(view, i);
            if (imageView != null) {
                i = C10322k.tv_detail_name;
                BogTextView bogTextView = (BogTextView) C6202b.m24689a(view, i);
                if (bogTextView != null) {
                    i = C10322k.tv_details_amount;
                    BogTextView bogTextView2 = (BogTextView) C6202b.m24689a(view, i);
                    if (bogTextView2 != null) {
                        i = C10322k.tv_sub_details;
                        BogTextView bogTextView3 = (BogTextView) C6202b.m24689a(view, i);
                        if (bogTextView3 != null) {
                            return new C27312g8(view, a, imageView, bogTextView, bogTextView2, bogTextView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C27312g8 m84556c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C10324m.view_details_with_checkbox, viewGroup);
            return m84555a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f68834d;
    }
}
