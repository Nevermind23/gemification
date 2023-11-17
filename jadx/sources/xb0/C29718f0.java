package xb0;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import rb0.C27985d;

/* renamed from: xb0.f0 */
public final class C29718f0 implements C6201a {

    /* renamed from: d */
    private final LinearLayoutCompat f75034d;

    /* renamed from: e */
    public final TwoLineTextItem f75035e;

    /* renamed from: f */
    public final AppCompatTextView f75036f;

    /* renamed from: g */
    public final TwoLineTextItem f75037g;

    /* renamed from: h */
    public final AppCompatTextView f75038h;

    /* renamed from: i */
    public final LinearLayoutCompat f75039i;

    private C29718f0(LinearLayoutCompat linearLayoutCompat, TwoLineTextItem twoLineTextItem, AppCompatTextView appCompatTextView, TwoLineTextItem twoLineTextItem2, AppCompatTextView appCompatTextView2, LinearLayoutCompat linearLayoutCompat2) {
        this.f75034d = linearLayoutCompat;
        this.f75035e = twoLineTextItem;
        this.f75036f = appCompatTextView;
        this.f75037g = twoLineTextItem2;
        this.f75038h = appCompatTextView2;
        this.f75039i = linearLayoutCompat2;
    }

    /* renamed from: a */
    public static C29718f0 m90237a(View view) {
        int i = C27985d.accrued_interest_title;
        TwoLineTextItem twoLineTextItem = (TwoLineTextItem) C6202b.m24689a(view, i);
        if (twoLineTextItem != null) {
            i = C27985d.accrued_interest_value;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView != null) {
                i = C27985d.f71291r;
                TwoLineTextItem twoLineTextItem2 = (TwoLineTextItem) C6202b.m24689a(view, i);
                if (twoLineTextItem2 != null) {
                    i = C27985d.f71293s;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                    if (appCompatTextView2 != null) {
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
                        return new C29718f0(linearLayoutCompat, twoLineTextItem, appCompatTextView, twoLineTextItem2, appCompatTextView2, linearLayoutCompat);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public LinearLayoutCompat mo3946b() {
        return this.f75034d;
    }
}
