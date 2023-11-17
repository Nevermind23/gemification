package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.v2 */
public final class C27445v2 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f70060d;

    /* renamed from: e */
    public final LinearLayout f70061e;

    /* renamed from: f */
    public final BogTextView f70062f;

    /* renamed from: g */
    public final BogTextView f70063g;

    /* renamed from: h */
    public final BogTextView f70064h;

    /* renamed from: i */
    public final LinearLayout f70065i;

    /* renamed from: j */
    public final BogTextView f70066j;

    /* renamed from: k */
    public final LinearLayout f70067k;

    private C27445v2(LinearLayout linearLayout, LinearLayout linearLayout2, BogTextView bogTextView, BogTextView bogTextView2, BogTextView bogTextView3, LinearLayout linearLayout3, BogTextView bogTextView4, LinearLayout linearLayout4) {
        this.f70060d = linearLayout;
        this.f70061e = linearLayout2;
        this.f70062f = bogTextView;
        this.f70063g = bogTextView2;
        this.f70064h = bogTextView3;
        this.f70065i = linearLayout3;
        this.f70066j = bogTextView4;
        this.f70067k = linearLayout4;
    }

    /* renamed from: a */
    public static C27445v2 m85087a(View view) {
        int i = C10322k.dialog_choose_new_photo_layout;
        LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
        if (linearLayout != null) {
            i = C10322k.dialog_choose_photo_from_gallery;
            BogTextView bogTextView = (BogTextView) C6202b.m24689a(view, i);
            if (bogTextView != null) {
                i = C10322k.dialog_choose_photo_new_photo;
                BogTextView bogTextView2 = (BogTextView) C6202b.m24689a(view, i);
                if (bogTextView2 != null) {
                    i = C10322k.dialog_choose_photo_remove_photo;
                    BogTextView bogTextView3 = (BogTextView) C6202b.m24689a(view, i);
                    if (bogTextView3 != null) {
                        i = C10322k.dialog_choose_remove_photo_layout;
                        LinearLayout linearLayout2 = (LinearLayout) C6202b.m24689a(view, i);
                        if (linearLayout2 != null) {
                            i = C10322k.dialog_choose_rename;
                            BogTextView bogTextView4 = (BogTextView) C6202b.m24689a(view, i);
                            if (bogTextView4 != null) {
                                i = C10322k.dialog_choose_rename_layout;
                                LinearLayout linearLayout3 = (LinearLayout) C6202b.m24689a(view, i);
                                if (linearLayout3 != null) {
                                    return new C27445v2((LinearLayout) view, linearLayout, bogTextView, bogTextView2, bogTextView3, linearLayout2, bogTextView4, linearLayout3);
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
    public static C27445v2 m85088d(LayoutInflater layoutInflater) {
        return m85089e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27445v2 m85089e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.dialog_choose_photo, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m85087a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f70060d;
    }
}
