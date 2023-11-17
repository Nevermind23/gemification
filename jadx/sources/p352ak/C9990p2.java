package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextSwitcher;
import android.widget.TextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.p2 */
public final class C9990p2 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f27388d;

    /* renamed from: e */
    public final TextView f27389e;

    /* renamed from: f */
    public final TextView f27390f;

    /* renamed from: g */
    public final TextSwitcher f27391g;

    /* renamed from: h */
    public final TextView f27392h;

    /* renamed from: i */
    public final ProgressBar f27393i;

    /* renamed from: j */
    public final TextView f27394j;

    /* renamed from: k */
    public final TextSwitcher f27395k;

    /* renamed from: l */
    public final TextView f27396l;

    private C9990p2(LinearLayout linearLayout, TextView textView, TextView textView2, TextSwitcher textSwitcher, TextView textView3, ProgressBar progressBar, TextView textView4, TextSwitcher textSwitcher2, TextView textView5) {
        this.f27388d = linearLayout;
        this.f27389e = textView;
        this.f27390f = textView2;
        this.f27391g = textSwitcher;
        this.f27392h = textView3;
        this.f27393i = progressBar;
        this.f27394j = textView4;
        this.f27395k = textSwitcher2;
        this.f27396l = textView5;
    }

    /* renamed from: a */
    public static C9990p2 m36640a(View view) {
        int i = C17782g.colon;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C17782g.minutes_one;
            TextView textView2 = (TextView) C6202b.m24689a(view, i);
            if (textView2 != null) {
                i = C17782g.minutes_ts;
                TextSwitcher textSwitcher = (TextSwitcher) C6202b.m24689a(view, i);
                if (textSwitcher != null) {
                    i = C17782g.minutes_two;
                    TextView textView3 = (TextView) C6202b.m24689a(view, i);
                    if (textView3 != null) {
                        i = C17782g.f49722R6;
                        ProgressBar progressBar = (ProgressBar) C6202b.m24689a(view, i);
                        if (progressBar != null) {
                            i = C17782g.seconds_one;
                            TextView textView4 = (TextView) C6202b.m24689a(view, i);
                            if (textView4 != null) {
                                i = C17782g.seconds_ts;
                                TextSwitcher textSwitcher2 = (TextSwitcher) C6202b.m24689a(view, i);
                                if (textSwitcher2 != null) {
                                    i = C17782g.seconds_two;
                                    TextView textView5 = (TextView) C6202b.m24689a(view, i);
                                    if (textView5 != null) {
                                        return new C9990p2((LinearLayout) view, textView, textView2, textSwitcher, textView3, progressBar, textView4, textSwitcher2, textView5);
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
    public static C9990p2 m36641d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_countdown_timer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36640a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f27388d;
    }
}
