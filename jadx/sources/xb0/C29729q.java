package xb0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import rb0.C27985d;
import rb0.C27986e;

/* renamed from: xb0.q */
public final class C29729q implements C6201a {

    /* renamed from: d */
    private final ListItem f75133d;

    /* renamed from: e */
    public final TwoLineTextItem f75134e;

    /* renamed from: f */
    public final TwoLineReverseTextItem f75135f;

    /* renamed from: g */
    public final AppCompatTextView f75136g;

    /* renamed from: h */
    public final SingleLineTextItem f75137h;

    private C29729q(ListItem listItem, TwoLineTextItem twoLineTextItem, TwoLineReverseTextItem twoLineReverseTextItem, AppCompatTextView appCompatTextView, SingleLineTextItem singleLineTextItem) {
        this.f75133d = listItem;
        this.f75134e = twoLineTextItem;
        this.f75135f = twoLineReverseTextItem;
        this.f75136g = appCompatTextView;
        this.f75137h = singleLineTextItem;
    }

    /* renamed from: a */
    public static C29729q m90281a(View view) {
        int i = C27985d.double_text;
        TwoLineTextItem twoLineTextItem = (TwoLineTextItem) C6202b.m24689a(view, i);
        if (twoLineTextItem != null) {
            i = C27985d.double_text_reversed;
            TwoLineReverseTextItem twoLineReverseTextItem = (TwoLineReverseTextItem) C6202b.m24689a(view, i);
            if (twoLineReverseTextItem != null) {
                i = C27985d.f71268R0;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView != null) {
                    i = C27985d.single_text;
                    SingleLineTextItem singleLineTextItem = (SingleLineTextItem) C6202b.m24689a(view, i);
                    if (singleLineTextItem != null) {
                        return new C29729q((ListItem) view, twoLineTextItem, twoLineReverseTextItem, appCompatTextView, singleLineTextItem);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C29729q m90282d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27986e.item_deposit_break_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m90281a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f75133d;
    }
}
