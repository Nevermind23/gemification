package yv0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.designsystem.components.pagestate.PageState;
import uv0.C39106c;
import uv0.C39107d;

/* renamed from: yv0.d */
public final class C40079d implements C6201a {

    /* renamed from: d */
    private final LinearLayout f95274d;

    /* renamed from: e */
    public final TwoLineTextItem f95275e;

    /* renamed from: f */
    public final TwoLineTextItem f95276f;

    /* renamed from: g */
    public final TwoLineTextItem f95277g;

    /* renamed from: h */
    public final TwoLineTextItem f95278h;

    /* renamed from: i */
    public final TextView f95279i;

    /* renamed from: j */
    public final PageState f95280j;

    private C40079d(LinearLayout linearLayout, TwoLineTextItem twoLineTextItem, TwoLineTextItem twoLineTextItem2, TwoLineTextItem twoLineTextItem3, TwoLineTextItem twoLineTextItem4, TextView textView, PageState pageState) {
        this.f95274d = linearLayout;
        this.f95275e = twoLineTextItem;
        this.f95276f = twoLineTextItem2;
        this.f95277g = twoLineTextItem3;
        this.f95278h = twoLineTextItem4;
        this.f95279i = textView;
        this.f95280j = pageState;
    }

    /* renamed from: a */
    public static C40079d m116121a(View view) {
        int i = C39106c.p2p_amount_info;
        TwoLineTextItem twoLineTextItem = (TwoLineTextItem) C6202b.m24689a(view, i);
        if (twoLineTextItem != null) {
            i = C39106c.p2p_commission_info;
            TwoLineTextItem twoLineTextItem2 = (TwoLineTextItem) C6202b.m24689a(view, i);
            if (twoLineTextItem2 != null) {
                i = C39106c.p2p_nomination_info;
                TwoLineTextItem twoLineTextItem3 = (TwoLineTextItem) C6202b.m24689a(view, i);
                if (twoLineTextItem3 != null) {
                    i = C39106c.p2p_receiver_phone_number_info;
                    TwoLineTextItem twoLineTextItem4 = (TwoLineTextItem) C6202b.m24689a(view, i);
                    if (twoLineTextItem4 != null) {
                        i = C39106c.p2p_success_info;
                        TextView textView = (TextView) C6202b.m24689a(view, i);
                        if (textView != null) {
                            i = C39106c.p2p_success_page_state;
                            PageState pageState = (PageState) C6202b.m24689a(view, i);
                            if (pageState != null) {
                                return new C40079d((LinearLayout) view, twoLineTextItem, twoLineTextItem2, twoLineTextItem3, twoLineTextItem4, textView, pageState);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C40079d m116122d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39107d.fragment_p2p_success, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m116121a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f95274d;
    }
}
