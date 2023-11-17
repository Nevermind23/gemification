package p541oc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import p086g1.C6201a;
import p485kc.C16347e;
import p485kc.C16348f;

/* renamed from: oc.v */
public final class C17168v implements C6201a {

    /* renamed from: d */
    private final RelativeLayout f48174d;

    /* renamed from: e */
    public final LinearLayout f48175e;

    /* renamed from: f */
    public final TextView f48176f;

    /* renamed from: g */
    public final TextView f48177g;

    /* renamed from: h */
    public final TextView f48178h;

    /* renamed from: i */
    public final RelativeLayout f48179i;

    /* renamed from: j */
    public final TextView f48180j;

    /* renamed from: k */
    public final TextView f48181k;

    /* renamed from: l */
    public final TextView f48182l;

    /* renamed from: m */
    public final TextView f48183m;

    /* renamed from: n */
    public final TextView f48184n;

    private C17168v(RelativeLayout relativeLayout, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, RelativeLayout relativeLayout2, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.f48174d = relativeLayout;
        this.f48175e = linearLayout;
        this.f48176f = textView;
        this.f48177g = textView2;
        this.f48178h = textView3;
        this.f48179i = relativeLayout2;
        this.f48180j = textView4;
        this.f48181k = textView5;
        this.f48182l = textView6;
        this.f48183m = textView7;
        this.f48184n = textView8;
    }

    /* renamed from: a */
    public static C17168v m60328a(View view) {
        int i = C16347e.main_panel;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(i);
        if (linearLayout != null) {
            i = C16347e.numeration_card_1;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                i = C16347e.numeration_card_2;
                TextView textView2 = (TextView) view.findViewById(i);
                if (textView2 != null) {
                    i = C16347e.numeration_card_3;
                    TextView textView3 = (TextView) view.findViewById(i);
                    if (textView3 != null) {
                        i = C16347e.f46192l1;
                        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(i);
                        if (relativeLayout != null) {
                            i = C16347e.upload_button_text_view;
                            TextView textView4 = (TextView) view.findViewById(i);
                            if (textView4 != null) {
                                i = C16347e.upload_instructions_1;
                                TextView textView5 = (TextView) view.findViewById(i);
                                if (textView5 != null) {
                                    i = C16347e.upload_instructions_2;
                                    TextView textView6 = (TextView) view.findViewById(i);
                                    if (textView6 != null) {
                                        i = C16347e.upload_instructions_3;
                                        TextView textView7 = (TextView) view.findViewById(i);
                                        if (textView7 != null) {
                                            i = C16347e.upload_title;
                                            TextView textView8 = (TextView) view.findViewById(i);
                                            if (textView8 != null) {
                                                return new C17168v((RelativeLayout) view, linearLayout, textView, textView2, textView3, relativeLayout, textView4, textView5, textView6, textView7, textView8);
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
    public static C17168v m60329d(LayoutInflater layoutInflater) {
        return m60330e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C17168v m60330e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16348f.fragment_upload_step, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m60328a(inflate);
    }

    /* renamed from: c */
    public RelativeLayout mo3946b() {
        return this.f48174d;
    }
}
