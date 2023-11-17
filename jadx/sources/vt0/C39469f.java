package vt0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;
import rt0.C38341c;
import rt0.C38342d;

/* renamed from: vt0.f */
public final class C39469f implements C6201a {

    /* renamed from: d */
    private final ListItem f93899d;

    /* renamed from: e */
    public final ListItem f93900e;

    /* renamed from: f */
    public final AppCompatImageView f93901f;

    /* renamed from: g */
    public final TwoLineReverseTextItem f93902g;

    /* renamed from: h */
    public final AppCompatImageView f93903h;

    /* renamed from: i */
    public final AppCompatTextView f93904i;

    /* renamed from: j */
    public final LinearLayout f93905j;

    private C39469f(ListItem listItem, ListItem listItem2, AppCompatImageView appCompatImageView, TwoLineReverseTextItem twoLineReverseTextItem, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView, LinearLayout linearLayout) {
        this.f93899d = listItem;
        this.f93900e = listItem2;
        this.f93901f = appCompatImageView;
        this.f93902g = twoLineReverseTextItem;
        this.f93903h = appCompatImageView2;
        this.f93904i = appCompatTextView;
        this.f93905j = linearLayout;
    }

    /* renamed from: a */
    public static C39469f m114732a(View view) {
        ListItem listItem = (ListItem) view;
        int i = C38341c.f91929I;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C38341c.product_texts;
            TwoLineReverseTextItem twoLineReverseTextItem = (TwoLineReverseTextItem) C6202b.m24689a(view, i);
            if (twoLineReverseTextItem != null) {
                i = C38341c.stars_icon_main;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) C6202b.m24689a(view, i);
                if (appCompatImageView2 != null) {
                    i = C38341c.stars_text_main;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                    if (appCompatTextView != null) {
                        i = C38341c.total_stars;
                        LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
                        if (linearLayout != null) {
                            return new C39469f(listItem, listItem, appCompatImageView, twoLineReverseTextItem, appCompatImageView2, appCompatTextView, linearLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C39469f m114733d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C38342d.item_stars_guide_product_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m114732a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f93899d;
    }
}
