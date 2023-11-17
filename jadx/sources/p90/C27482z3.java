package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.z3 */
public final class C27482z3 implements C6201a {

    /* renamed from: d */
    private final NestedScrollView f70343d;

    /* renamed from: e */
    public final BogTextView f70344e;

    /* renamed from: f */
    public final BogTextView f70345f;

    /* renamed from: g */
    public final BogTextView f70346g;

    /* renamed from: h */
    public final BogTextView f70347h;

    /* renamed from: i */
    public final BogTextView f70348i;

    private C27482z3(NestedScrollView nestedScrollView, BogTextView bogTextView, BogTextView bogTextView2, BogTextView bogTextView3, BogTextView bogTextView4, BogTextView bogTextView5) {
        this.f70343d = nestedScrollView;
        this.f70344e = bogTextView;
        this.f70345f = bogTextView2;
        this.f70346g = bogTextView3;
        this.f70347h = bogTextView4;
        this.f70348i = bogTextView5;
    }

    /* renamed from: a */
    public static C27482z3 m85234a(View view) {
        int i = C10322k.activation_date;
        BogTextView bogTextView = (BogTextView) C6202b.m24689a(view, i);
        if (bogTextView != null) {
            i = C10322k.f28805Y1;
            BogTextView bogTextView2 = (BogTextView) C6202b.m24689a(view, i);
            if (bogTextView2 != null) {
                i = C10322k.collected_points;
                BogTextView bogTextView3 = (BogTextView) C6202b.m24689a(view, i);
                if (bogTextView3 != null) {
                    i = C10322k.ordered_prize_count;
                    BogTextView bogTextView4 = (BogTextView) C6202b.m24689a(view, i);
                    if (bogTextView4 != null) {
                        i = C10322k.spent_points;
                        BogTextView bogTextView5 = (BogTextView) C6202b.m24689a(view, i);
                        if (bogTextView5 != null) {
                            return new C27482z3((NestedScrollView) view, bogTextView, bogTextView2, bogTextView3, bogTextView4, bogTextView5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27482z3 m85235d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.fragment_mr_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m85234a(inflate);
    }

    /* renamed from: c */
    public NestedScrollView mo3946b() {
        return this.f70343d;
    }
}
