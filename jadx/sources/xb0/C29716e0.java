package xb0;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.input.Input;
import rb0.C27985d;

/* renamed from: xb0.e0 */
public final class C29716e0 implements C6201a {

    /* renamed from: d */
    private final LinearLayoutCompat f75006d;

    /* renamed from: e */
    public final Input f75007e;

    /* renamed from: f */
    public final AppCompatTextView f75008f;

    /* renamed from: g */
    public final AppCompatTextView f75009g;

    /* renamed from: h */
    public final AppCompatTextView f75010h;

    /* renamed from: i */
    public final AppCompatTextView f75011i;

    /* renamed from: j */
    public final AppCompatTextView f75012j;

    /* renamed from: k */
    public final AppCompatTextView f75013k;

    /* renamed from: l */
    public final LinearLayoutCompat f75014l;

    private C29716e0(LinearLayoutCompat linearLayoutCompat, Input input, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, LinearLayoutCompat linearLayoutCompat2) {
        this.f75006d = linearLayoutCompat;
        this.f75007e = input;
        this.f75008f = appCompatTextView;
        this.f75009g = appCompatTextView2;
        this.f75010h = appCompatTextView3;
        this.f75011i = appCompatTextView4;
        this.f75012j = appCompatTextView5;
        this.f75013k = appCompatTextView6;
        this.f75014l = linearLayoutCompat2;
    }

    /* renamed from: a */
    public static C29716e0 m90229a(View view) {
        int i = C27985d.f71287m;
        Input input = (Input) C6202b.m24689a(view, i);
        if (input != null) {
            i = C27985d.amount_new_title;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView != null) {
                i = C27985d.amount_new_value;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView2 != null) {
                    i = C27985d.amount_old_title;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) C6202b.m24689a(view, i);
                    if (appCompatTextView3 != null) {
                        i = C27985d.amount_old_value;
                        AppCompatTextView appCompatTextView4 = (AppCompatTextView) C6202b.m24689a(view, i);
                        if (appCompatTextView4 != null) {
                            i = C27985d.f71296t0;
                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) C6202b.m24689a(view, i);
                            if (appCompatTextView5 != null) {
                                i = C27985d.interest_value;
                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) C6202b.m24689a(view, i);
                                if (appCompatTextView6 != null) {
                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
                                    return new C29716e0(linearLayoutCompat, input, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, linearLayoutCompat);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public LinearLayoutCompat mo3946b() {
        return this.f75006d;
    }
}
