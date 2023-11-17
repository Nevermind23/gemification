package xb0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;
import rb0.C27985d;
import rb0.C27986e;

/* renamed from: xb0.u */
public final class C29733u implements C6201a {

    /* renamed from: d */
    private final ListItem f75145d;

    /* renamed from: e */
    public final AppCompatImageView f75146e;

    /* renamed from: f */
    public final AppCompatTextView f75147f;

    /* renamed from: g */
    public final SingleLineTextItem f75148g;

    /* renamed from: h */
    public final TwoLineReverseTextItem f75149h;

    private C29733u(ListItem listItem, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, SingleLineTextItem singleLineTextItem, TwoLineReverseTextItem twoLineReverseTextItem) {
        this.f75145d = listItem;
        this.f75146e = appCompatImageView;
        this.f75147f = appCompatTextView;
        this.f75148g = singleLineTextItem;
        this.f75149h = twoLineReverseTextItem;
    }

    /* renamed from: a */
    public static C29733u m90297a(View view) {
        int i = C27985d.f71286l0;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C27985d.f71268R0;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView != null) {
                i = C27985d.single_text;
                SingleLineTextItem singleLineTextItem = (SingleLineTextItem) C6202b.m24689a(view, i);
                if (singleLineTextItem != null) {
                    i = C27985d.f71299x1;
                    TwoLineReverseTextItem twoLineReverseTextItem = (TwoLineReverseTextItem) C6202b.m24689a(view, i);
                    if (twoLineReverseTextItem != null) {
                        return new C29733u((ListItem) view, appCompatImageView, appCompatTextView, singleLineTextItem, twoLineReverseTextItem);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C29733u m90298d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27986e.item_deposit_interest_section, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m90297a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f75145d;
    }
}
