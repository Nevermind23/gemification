package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import ie0.C25187g;
import ie0.C25188h;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;
import p341ge.bog.designsystem.components.list.ThreeLineTextItem;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;

/* renamed from: ue0.p0 */
public final class C28745p0 implements C6201a {

    /* renamed from: d */
    private final ListItem f73407d;

    /* renamed from: e */
    public final AppCompatImageView f73408e;

    /* renamed from: f */
    public final SingleLineTextItem f73409f;

    /* renamed from: g */
    public final ThreeLineTextItem f73410g;

    /* renamed from: h */
    public final TwoLineReverseTextItem f73411h;

    private C28745p0(ListItem listItem, AppCompatImageView appCompatImageView, SingleLineTextItem singleLineTextItem, ThreeLineTextItem threeLineTextItem, TwoLineReverseTextItem twoLineReverseTextItem) {
        this.f73407d = listItem;
        this.f73408e = appCompatImageView;
        this.f73409f = singleLineTextItem;
        this.f73410g = threeLineTextItem;
        this.f73411h = twoLineReverseTextItem;
    }

    /* renamed from: a */
    public static C28745p0 m88105a(View view) {
        int i = C25187g.f64678O1;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C25187g.single_line_text;
            SingleLineTextItem singleLineTextItem = (SingleLineTextItem) C6202b.m24689a(view, i);
            if (singleLineTextItem != null) {
                i = C25187g.three_line_text;
                ThreeLineTextItem threeLineTextItem = (ThreeLineTextItem) C6202b.m24689a(view, i);
                if (threeLineTextItem != null) {
                    i = C25187g.f64671F4;
                    TwoLineReverseTextItem twoLineReverseTextItem = (TwoLineReverseTextItem) C6202b.m24689a(view, i);
                    if (twoLineReverseTextItem != null) {
                        return new C28745p0((ListItem) view, appCompatImageView, singleLineTextItem, threeLineTextItem, twoLineReverseTextItem);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28745p0 m88106d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.item_gt_start_investing_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88105a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f73407d;
    }
}
