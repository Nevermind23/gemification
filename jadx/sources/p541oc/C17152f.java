package p541oc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import p086g1.C6201a;
import p485kc.C16347e;
import p485kc.C16348f;

/* renamed from: oc.f */
public final class C17152f implements C6201a {

    /* renamed from: d */
    private final RelativeLayout f48010d;

    /* renamed from: e */
    public final ImageView f48011e;

    /* renamed from: f */
    public final RelativeLayout f48012f;

    /* renamed from: g */
    public final ImageView f48013g;

    /* renamed from: h */
    public final TextView f48014h;

    private C17152f(RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2, ImageView imageView2, TextView textView) {
        this.f48010d = relativeLayout;
        this.f48011e = imageView;
        this.f48012f = relativeLayout2;
        this.f48013g = imageView2;
        this.f48014h = textView;
    }

    /* renamed from: a */
    public static C17152f m60249a(View view) {
        int i = C16347e.arrow_view;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = C16347e.icon_panel;
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(i);
            if (relativeLayout != null) {
                i = C16347e.f46186V;
                ImageView imageView2 = (ImageView) view.findViewById(i);
                if (imageView2 != null) {
                    i = C16347e.name_view;
                    TextView textView = (TextView) view.findViewById(i);
                    if (textView != null) {
                        return new C17152f((RelativeLayout) view, imageView, relativeLayout, imageView2, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C17152f m60250d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16348f.fragment_card_button_identomat, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m60249a(inflate);
    }

    /* renamed from: c */
    public RelativeLayout mo3946b() {
        return this.f48010d;
    }
}
