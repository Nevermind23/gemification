package xb0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import p086g1.C6201a;
import p086g1.C6202b;
import rb0.C27985d;
import rb0.C27986e;

/* renamed from: xb0.y */
public final class C29737y implements C6201a {

    /* renamed from: d */
    private final LinearLayoutCompat f75158d;

    /* renamed from: e */
    public final AppCompatTextView f75159e;

    /* renamed from: f */
    public final AppCompatTextView f75160f;

    private C29737y(LinearLayoutCompat linearLayoutCompat, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f75158d = linearLayoutCompat;
        this.f75159e = appCompatTextView;
        this.f75160f = appCompatTextView2;
    }

    /* renamed from: a */
    public static C29737y m90313a(View view) {
        int i = C27985d.f71290q1;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C27985d.f71301y1;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView2 != null) {
                return new C29737y((LinearLayoutCompat) view, appCompatTextView, appCompatTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C29737y m90314d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27986e.item_deposit_prolongation_result, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m90313a(inflate);
    }

    /* renamed from: c */
    public LinearLayoutCompat mo3946b() {
        return this.f75158d;
    }
}
