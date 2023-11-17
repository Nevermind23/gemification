package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.v */
public final class C10029v implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f27630d;

    /* renamed from: e */
    public final View f27631e;

    /* renamed from: f */
    public final AppCompatTextView f27632f;

    /* renamed from: g */
    public final AppCompatTextView f27633g;

    private C10029v(ConstraintLayout constraintLayout, View view, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f27630d = constraintLayout;
        this.f27631e = view;
        this.f27632f = appCompatTextView;
        this.f27633g = appCompatTextView2;
    }

    /* renamed from: a */
    public static C10029v m36784a(View view) {
        int i = C17782g.f49699K2;
        View a = C6202b.m24689a(view, i);
        if (a != null) {
            i = C17782g.f49745Y8;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView != null) {
                i = C17782g.f49702K9;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView2 != null) {
                    return new C10029v((ConstraintLayout) view, a, appCompatTextView, appCompatTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C10029v m36785d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.item_thumbnail_badge_card_total_price, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36784a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f27630d;
    }
}
