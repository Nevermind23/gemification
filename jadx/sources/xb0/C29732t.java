package xb0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import rb0.C27985d;
import rb0.C27986e;

/* renamed from: xb0.t */
public final class C29732t implements C6201a {

    /* renamed from: d */
    private final ListItem f75141d;

    /* renamed from: e */
    public final AppCompatImageView f75142e;

    /* renamed from: f */
    public final SingleLineTextItem f75143f;

    /* renamed from: g */
    public final TwoLineTextItem f75144g;

    private C29732t(ListItem listItem, AppCompatImageView appCompatImageView, SingleLineTextItem singleLineTextItem, TwoLineTextItem twoLineTextItem) {
        this.f75141d = listItem;
        this.f75142e = appCompatImageView;
        this.f75143f = singleLineTextItem;
        this.f75144g = twoLineTextItem;
    }

    /* renamed from: a */
    public static C29732t m90293a(View view) {
        int i = C27985d.f71286l0;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C27985d.single_text;
            SingleLineTextItem singleLineTextItem = (SingleLineTextItem) C6202b.m24689a(view, i);
            if (singleLineTextItem != null) {
                i = C27985d.f71299x1;
                TwoLineTextItem twoLineTextItem = (TwoLineTextItem) C6202b.m24689a(view, i);
                if (twoLineTextItem != null) {
                    return new C29732t((ListItem) view, appCompatImageView, singleLineTextItem, twoLineTextItem);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C29732t m90294d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27986e.item_deposit_details_section, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m90293a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f75141d;
    }
}
