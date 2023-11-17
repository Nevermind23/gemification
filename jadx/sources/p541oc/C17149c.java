package p541oc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import p086g1.C6201a;
import p485kc.C16347e;
import p485kc.C16348f;

/* renamed from: oc.c */
public final class C17149c implements C6201a {

    /* renamed from: d */
    private final RelativeLayout f47981d;

    /* renamed from: e */
    public final RelativeLayout f47982e;

    /* renamed from: f */
    public final TextView f47983f;

    /* renamed from: g */
    public final LinearLayout f47984g;

    /* renamed from: h */
    public final TextView f47985h;

    /* renamed from: i */
    public final ImageView f47986i;

    /* renamed from: j */
    public final TextView f47987j;

    /* renamed from: k */
    public final NestedScrollView f47988k;

    /* renamed from: l */
    public final RelativeLayout f47989l;

    /* renamed from: m */
    public final TextView f47990m;

    /* renamed from: n */
    public final TextView f47991n;

    private C17149c(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, TextView textView, LinearLayout linearLayout, TextView textView2, ImageView imageView, TextView textView3, NestedScrollView nestedScrollView, RelativeLayout relativeLayout3, TextView textView4, TextView textView5) {
        this.f47981d = relativeLayout;
        this.f47982e = relativeLayout2;
        this.f47983f = textView;
        this.f47984g = linearLayout;
        this.f47985h = textView2;
        this.f47986i = imageView;
        this.f47987j = textView3;
        this.f47988k = nestedScrollView;
        this.f47989l = relativeLayout3;
        this.f47990m = textView4;
        this.f47991n = textView5;
    }

    /* renamed from: a */
    public static C17149c m60234a(View view) {
        int i = C16347e.f46188e;
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(i);
        if (relativeLayout != null) {
            i = C16347e.agree_text_view;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                i = C16347e.agreement_panel;
                LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
                if (linearLayout != null) {
                    i = C16347e.f46190i;
                    TextView textView2 = (TextView) view.findViewById(i);
                    if (textView2 != null) {
                        i = C16347e.f46191l;
                        ImageView imageView = (ImageView) view.findViewById(i);
                        if (imageView != null) {
                            i = C16347e.back_button_title_view;
                            TextView textView3 = (TextView) view.findViewById(i);
                            if (textView3 != null) {
                                i = C16347e.consent_scrollview;
                                NestedScrollView nestedScrollView = (NestedScrollView) view.findViewById(i);
                                if (nestedScrollView != null) {
                                    i = C16347e.disagree_button;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(i);
                                    if (relativeLayout2 != null) {
                                        i = C16347e.disagree_text_view;
                                        TextView textView4 = (TextView) view.findViewById(i);
                                        if (textView4 != null) {
                                            i = C16347e.title_text_view;
                                            TextView textView5 = (TextView) view.findViewById(i);
                                            if (textView5 != null) {
                                                return new C17149c((RelativeLayout) view, relativeLayout, textView, linearLayout, textView2, imageView, textView3, nestedScrollView, relativeLayout2, textView4, textView5);
                                            }
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

    /* renamed from: d */
    public static C17149c m60235d(LayoutInflater layoutInflater) {
        return m60236e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C17149c m60236e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16348f.fragment_agreement_identomat, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m60234a(inflate);
    }

    /* renamed from: c */
    public RelativeLayout mo3946b() {
        return this.f47981d;
    }
}
