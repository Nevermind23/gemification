package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import ie0.C25187g;
import ie0.C25188h;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: ue0.l */
public final class C28736l implements C6201a {

    /* renamed from: d */
    private final LinearLayout f73341d;

    /* renamed from: e */
    public final LinearLayout f73342e;

    /* renamed from: f */
    public final CheckboxView f73343f;

    /* renamed from: g */
    public final TextView f73344g;

    /* renamed from: h */
    public final Button f73345h;

    /* renamed from: i */
    public final LayerView f73346i;

    /* renamed from: j */
    public final TextView f73347j;

    /* renamed from: k */
    public final TextView f73348k;

    /* renamed from: l */
    public final LinearLayout f73349l;

    /* renamed from: m */
    public final CheckboxView f73350m;

    /* renamed from: n */
    public final TextView f73351n;

    /* renamed from: o */
    public final Button f73352o;

    /* renamed from: p */
    public final LinearLayout f73353p;

    /* renamed from: q */
    public final CheckboxView f73354q;

    /* renamed from: r */
    public final TextView f73355r;

    /* renamed from: s */
    public final LinearLayout f73356s;

    /* renamed from: t */
    public final CheckboxView f73357t;

    /* renamed from: u */
    public final TextView f73358u;

    /* renamed from: v */
    public final LinearLayout f73359v;

    /* renamed from: w */
    public final CheckboxView f73360w;

    /* renamed from: x */
    public final TextView f73361x;

    private C28736l(LinearLayout linearLayout, LinearLayout linearLayout2, CheckboxView checkboxView, TextView textView, Button button, LayerView layerView, TextView textView2, TextView textView3, LinearLayout linearLayout3, CheckboxView checkboxView2, TextView textView4, Button button2, LinearLayout linearLayout4, CheckboxView checkboxView3, TextView textView5, LinearLayout linearLayout5, CheckboxView checkboxView4, TextView textView6, LinearLayout linearLayout6, CheckboxView checkboxView5, TextView textView7) {
        this.f73341d = linearLayout;
        this.f73342e = linearLayout2;
        this.f73343f = checkboxView;
        this.f73344g = textView;
        this.f73345h = button;
        this.f73346i = layerView;
        this.f73347j = textView2;
        this.f73348k = textView3;
        this.f73349l = linearLayout3;
        this.f73350m = checkboxView2;
        this.f73351n = textView4;
        this.f73352o = button2;
        this.f73353p = linearLayout4;
        this.f73354q = checkboxView3;
        this.f73355r = textView5;
        this.f73356s = linearLayout5;
        this.f73357t = checkboxView4;
        this.f73358u = textView6;
        this.f73359v = linearLayout6;
        this.f73360w = checkboxView5;
        this.f73361x = textView7;
    }

    /* renamed from: a */
    public static C28736l m88069a(View view) {
        View view2 = view;
        int i = C25187g.buy_button;
        LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view2, i);
        if (linearLayout != null) {
            i = C25187g.buy_check;
            CheckboxView checkboxView = (CheckboxView) C6202b.m24689a(view2, i);
            if (checkboxView != null) {
                i = C25187g.f64682T;
                TextView textView = (TextView) C6202b.m24689a(view2, i);
                if (textView != null) {
                    i = C25187g.clear_filter_button;
                    Button button = (Button) C6202b.m24689a(view2, i);
                    if (button != null) {
                        i = C25187g.date_button;
                        LayerView layerView = (LayerView) C6202b.m24689a(view2, i);
                        if (layerView != null) {
                            i = C25187g.date_hint;
                            TextView textView2 = (TextView) C6202b.m24689a(view2, i);
                            if (textView2 != null) {
                                i = C25187g.f64677N0;
                                TextView textView3 = (TextView) C6202b.m24689a(view2, i);
                                if (textView3 != null) {
                                    i = C25187g.deposit_button;
                                    LinearLayout linearLayout2 = (LinearLayout) C6202b.m24689a(view2, i);
                                    if (linearLayout2 != null) {
                                        i = C25187g.deposit_check;
                                        CheckboxView checkboxView2 = (CheckboxView) C6202b.m24689a(view2, i);
                                        if (checkboxView2 != null) {
                                            i = C25187g.deposit_text;
                                            TextView textView4 = (TextView) C6202b.m24689a(view2, i);
                                            if (textView4 != null) {
                                                i = C25187g.f64714p1;
                                                Button button2 = (Button) C6202b.m24689a(view2, i);
                                                if (button2 != null) {
                                                    i = C25187g.other_button;
                                                    LinearLayout linearLayout3 = (LinearLayout) C6202b.m24689a(view2, i);
                                                    if (linearLayout3 != null) {
                                                        i = C25187g.other_check;
                                                        CheckboxView checkboxView3 = (CheckboxView) C6202b.m24689a(view2, i);
                                                        if (checkboxView3 != null) {
                                                            i = C25187g.other_text;
                                                            TextView textView5 = (TextView) C6202b.m24689a(view2, i);
                                                            if (textView5 != null) {
                                                                i = C25187g.sell_button;
                                                                LinearLayout linearLayout4 = (LinearLayout) C6202b.m24689a(view2, i);
                                                                if (linearLayout4 != null) {
                                                                    i = C25187g.sell_check;
                                                                    CheckboxView checkboxView4 = (CheckboxView) C6202b.m24689a(view2, i);
                                                                    if (checkboxView4 != null) {
                                                                        i = C25187g.sell_text;
                                                                        TextView textView6 = (TextView) C6202b.m24689a(view2, i);
                                                                        if (textView6 != null) {
                                                                            i = C25187g.withdraw_button;
                                                                            LinearLayout linearLayout5 = (LinearLayout) C6202b.m24689a(view2, i);
                                                                            if (linearLayout5 != null) {
                                                                                i = C25187g.withdraw_check;
                                                                                CheckboxView checkboxView5 = (CheckboxView) C6202b.m24689a(view2, i);
                                                                                if (checkboxView5 != null) {
                                                                                    i = C25187g.withdraw_text;
                                                                                    TextView textView7 = (TextView) C6202b.m24689a(view2, i);
                                                                                    if (textView7 != null) {
                                                                                        return new C28736l((LinearLayout) view2, linearLayout, checkboxView, textView, button, layerView, textView2, textView3, linearLayout2, checkboxView2, textView4, button2, linearLayout3, checkboxView3, textView5, linearLayout4, checkboxView4, textView6, linearLayout5, checkboxView5, textView7);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28736l m88070d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.action_sheet_gt_transactions_filter, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88069a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f73341d;
    }
}
