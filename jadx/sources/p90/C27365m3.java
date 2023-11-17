package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.m3 */
public final class C27365m3 implements C6201a {

    /* renamed from: d */
    private final NestedScrollView f69285d;

    /* renamed from: e */
    public final TextView f69286e;

    /* renamed from: f */
    public final BogTextView f69287f;

    /* renamed from: g */
    public final LinearLayout f69288g;

    /* renamed from: h */
    public final TextView f69289h;

    /* renamed from: i */
    public final BogTextView f69290i;

    /* renamed from: j */
    public final LinearLayout f69291j;

    /* renamed from: k */
    public final TextView f69292k;

    /* renamed from: l */
    public final BogTextView f69293l;

    /* renamed from: m */
    public final LinearLayout f69294m;

    /* renamed from: n */
    public final TextView f69295n;

    /* renamed from: o */
    public final BogTextView f69296o;

    /* renamed from: p */
    public final LinearLayout f69297p;

    /* renamed from: q */
    public final TextView f69298q;

    /* renamed from: r */
    public final BogTextView f69299r;

    /* renamed from: s */
    public final LinearLayout f69300s;

    private C27365m3(NestedScrollView nestedScrollView, TextView textView, BogTextView bogTextView, LinearLayout linearLayout, TextView textView2, BogTextView bogTextView2, LinearLayout linearLayout2, TextView textView3, BogTextView bogTextView3, LinearLayout linearLayout3, TextView textView4, BogTextView bogTextView4, LinearLayout linearLayout4, TextView textView5, BogTextView bogTextView5, LinearLayout linearLayout5) {
        this.f69285d = nestedScrollView;
        this.f69286e = textView;
        this.f69287f = bogTextView;
        this.f69288g = linearLayout;
        this.f69289h = textView2;
        this.f69290i = bogTextView2;
        this.f69291j = linearLayout2;
        this.f69292k = textView3;
        this.f69293l = bogTextView3;
        this.f69294m = linearLayout3;
        this.f69295n = textView4;
        this.f69296o = bogTextView4;
        this.f69297p = linearLayout4;
        this.f69298q = textView5;
        this.f69299r = bogTextView5;
        this.f69300s = linearLayout5;
    }

    /* renamed from: a */
    public static C27365m3 m84769a(View view) {
        View view2 = view;
        int i = C10322k.f28740H;
        TextView textView = (TextView) C6202b.m24689a(view2, i);
        if (textView != null) {
            i = C10322k.account_name_label;
            BogTextView bogTextView = (BogTextView) C6202b.m24689a(view2, i);
            if (bogTextView != null) {
                i = C10322k.account_name_layout;
                LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view2, i);
                if (linearLayout != null) {
                    i = C10322k.account_number;
                    TextView textView2 = (TextView) C6202b.m24689a(view2, i);
                    if (textView2 != null) {
                        i = C10322k.account_number_label;
                        BogTextView bogTextView2 = (BogTextView) C6202b.m24689a(view2, i);
                        if (bogTextView2 != null) {
                            i = C10322k.account_number_layout;
                            LinearLayout linearLayout2 = (LinearLayout) C6202b.m24689a(view2, i);
                            if (linearLayout2 != null) {
                                i = C10322k.accrual_date;
                                TextView textView3 = (TextView) C6202b.m24689a(view2, i);
                                if (textView3 != null) {
                                    i = C10322k.accrual_date_label;
                                    BogTextView bogTextView3 = (BogTextView) C6202b.m24689a(view2, i);
                                    if (bogTextView3 != null) {
                                        i = C10322k.accrual_date_layout;
                                        LinearLayout linearLayout3 = (LinearLayout) C6202b.m24689a(view2, i);
                                        if (linearLayout3 != null) {
                                            i = C10322k.activation_date;
                                            TextView textView4 = (TextView) C6202b.m24689a(view2, i);
                                            if (textView4 != null) {
                                                i = C10322k.activation_date_label;
                                                BogTextView bogTextView4 = (BogTextView) C6202b.m24689a(view2, i);
                                                if (bogTextView4 != null) {
                                                    i = C10322k.activation_date_layout;
                                                    LinearLayout linearLayout4 = (LinearLayout) C6202b.m24689a(view2, i);
                                                    if (linearLayout4 != null) {
                                                        i = C10322k.last_transfer_date;
                                                        TextView textView5 = (TextView) C6202b.m24689a(view2, i);
                                                        if (textView5 != null) {
                                                            i = C10322k.last_transfer_date_label;
                                                            BogTextView bogTextView5 = (BogTextView) C6202b.m24689a(view2, i);
                                                            if (bogTextView5 != null) {
                                                                i = C10322k.last_transfer_date_layout;
                                                                LinearLayout linearLayout5 = (LinearLayout) C6202b.m24689a(view2, i);
                                                                if (linearLayout5 != null) {
                                                                    return new C27365m3((NestedScrollView) view2, textView, bogTextView, linearLayout, textView2, bogTextView2, linearLayout2, textView3, bogTextView3, linearLayout3, textView4, bogTextView4, linearLayout4, textView5, bogTextView5, linearLayout5);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27365m3 m84770d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.fragment_cashback_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84769a(inflate);
    }

    /* renamed from: c */
    public NestedScrollView mo3946b() {
        return this.f69285d;
    }
}
