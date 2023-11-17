package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import ie0.C25187g;
import ie0.C25188h;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;

/* renamed from: ue0.y0 */
public final class C28763y0 implements C6201a {

    /* renamed from: d */
    private final RelativeLayout f73541d;

    /* renamed from: e */
    public final AppCompatImageView f73542e;

    /* renamed from: f */
    public final AppCompatImageView f73543f;

    /* renamed from: g */
    public final TwoLineReverseTextItem f73544g;

    /* renamed from: h */
    public final TwoLineReverseTextItem f73545h;

    private C28763y0(RelativeLayout relativeLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, TwoLineReverseTextItem twoLineReverseTextItem, TwoLineReverseTextItem twoLineReverseTextItem2) {
        this.f73541d = relativeLayout;
        this.f73542e = appCompatImageView;
        this.f73543f = appCompatImageView2;
        this.f73544g = twoLineReverseTextItem;
        this.f73545h = twoLineReverseTextItem2;
    }

    /* renamed from: a */
    public static C28763y0 m88186a(View view) {
        int i = C25187g.company_image;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C25187g.image_star;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) C6202b.m24689a(view, i);
            if (appCompatImageView2 != null) {
                i = C25187g.price_two_line_item;
                TwoLineReverseTextItem twoLineReverseTextItem = (TwoLineReverseTextItem) C6202b.m24689a(view, i);
                if (twoLineReverseTextItem != null) {
                    i = C25187g.symbol_two_line_item;
                    TwoLineReverseTextItem twoLineReverseTextItem2 = (TwoLineReverseTextItem) C6202b.m24689a(view, i);
                    if (twoLineReverseTextItem2 != null) {
                        return new C28763y0((RelativeLayout) view, appCompatImageView, appCompatImageView2, twoLineReverseTextItem, twoLineReverseTextItem2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28763y0 m88187d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.item_watchlist_symbol, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88186a(inflate);
    }

    /* renamed from: c */
    public RelativeLayout mo3946b() {
        return this.f73541d;
    }
}
