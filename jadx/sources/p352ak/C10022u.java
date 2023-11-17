package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.u */
public final class C10022u implements C6201a {

    /* renamed from: d */
    private final LinearLayoutCompat f27600d;

    /* renamed from: e */
    public final AppCompatTextView f27601e;

    /* renamed from: f */
    public final AppCompatTextView f27602f;

    private C10022u(LinearLayoutCompat linearLayoutCompat, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f27600d = linearLayoutCompat;
        this.f27601e = appCompatTextView;
        this.f27602f = appCompatTextView2;
    }

    /* renamed from: a */
    public static C10022u m36758a(View view) {
        int i = C17782g.f49745Y8;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C17782g.f49702K9;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView2 != null) {
                return new C10022u((LinearLayoutCompat) view, appCompatTextView, appCompatTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C10022u m36759d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.item_thumbnail_badge_card_regular_price, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36758a(inflate);
    }

    /* renamed from: c */
    public LinearLayoutCompat mo3946b() {
        return this.f27600d;
    }
}
