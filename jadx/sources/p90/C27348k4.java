package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogImageView;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.k4 */
public final class C27348k4 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f69158d;

    /* renamed from: e */
    public final View f69159e;

    /* renamed from: f */
    public final RelativeLayout f69160f;

    /* renamed from: g */
    public final RelativeLayout f69161g;

    /* renamed from: h */
    public final BogImageView f69162h;

    /* renamed from: i */
    public final BogImageView f69163i;

    private C27348k4(LinearLayout linearLayout, View view, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, BogImageView bogImageView, BogImageView bogImageView2) {
        this.f69158d = linearLayout;
        this.f69159e = view;
        this.f69160f = relativeLayout;
        this.f69161g = relativeLayout2;
        this.f69162h = bogImageView;
        this.f69163i = bogImageView2;
    }

    /* renamed from: a */
    public static C27348k4 m84700a(View view) {
        int i = C10322k.f28850jc;
        View a = C6202b.m24689a(view, i);
        if (a != null) {
            i = C10322k.english_container;
            RelativeLayout relativeLayout = (RelativeLayout) C6202b.m24689a(view, i);
            if (relativeLayout != null) {
                i = C10322k.georgian_container;
                RelativeLayout relativeLayout2 = (RelativeLayout) C6202b.m24689a(view, i);
                if (relativeLayout2 != null) {
                    i = C10322k.icon_en;
                    BogImageView bogImageView = (BogImageView) C6202b.m24689a(view, i);
                    if (bogImageView != null) {
                        i = C10322k.icon_ge;
                        BogImageView bogImageView2 = (BogImageView) C6202b.m24689a(view, i);
                        if (bogImageView2 != null) {
                            return new C27348k4((LinearLayout) view, a, relativeLayout, relativeLayout2, bogImageView, bogImageView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27348k4 m84701d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.fragment_sms_language, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84700a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f69158d;
    }
}
