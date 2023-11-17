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

/* renamed from: xb0.v */
public final class C29734v implements C6201a {

    /* renamed from: d */
    private final ListItem f75150d;

    /* renamed from: e */
    public final AppCompatImageView f75151e;

    /* renamed from: f */
    public final AppCompatTextView f75152f;

    /* renamed from: g */
    public final SingleLineTextItem f75153g;

    /* renamed from: h */
    public final TwoLineReverseTextItem f75154h;

    private C29734v(ListItem listItem, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, SingleLineTextItem singleLineTextItem, TwoLineReverseTextItem twoLineReverseTextItem) {
        this.f75150d = listItem;
        this.f75151e = appCompatImageView;
        this.f75152f = appCompatTextView;
        this.f75153g = singleLineTextItem;
        this.f75154h = twoLineReverseTextItem;
    }

    /* renamed from: a */
    public static C29734v m90301a(View view) {
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
                        return new C29734v((ListItem) view, appCompatImageView, appCompatTextView, singleLineTextItem, twoLineReverseTextItem);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C29734v m90302d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27986e.item_deposit_operation, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m90301a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f75150d;
    }
}
