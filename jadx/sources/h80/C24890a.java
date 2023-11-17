package h80;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;
import u70.C28606b;
import u70.C28607c;

/* renamed from: h80.a */
public final class C24890a implements C6201a {

    /* renamed from: d */
    private final LinearLayout f63873d;

    /* renamed from: e */
    public final ListItem f63874e;

    /* renamed from: f */
    public final SingleLineTextItem f63875f;

    /* renamed from: g */
    public final ListItem f63876g;

    /* renamed from: h */
    public final SingleLineTextItem f63877h;

    private C24890a(LinearLayout linearLayout, ListItem listItem, SingleLineTextItem singleLineTextItem, ListItem listItem2, SingleLineTextItem singleLineTextItem2) {
        this.f63873d = linearLayout;
        this.f63874e = listItem;
        this.f63875f = singleLineTextItem;
        this.f63876g = listItem2;
        this.f63877h = singleLineTextItem2;
    }

    /* renamed from: a */
    public static C24890a m79541a(View view) {
        int i = C28606b.f72614y;
        ListItem listItem = (ListItem) C6202b.m24689a(view, i);
        if (listItem != null) {
            i = C28606b.delete_text_view;
            SingleLineTextItem singleLineTextItem = (SingleLineTextItem) C6202b.m24689a(view, i);
            if (singleLineTextItem != null) {
                i = C28606b.f72574G;
                ListItem listItem2 = (ListItem) C6202b.m24689a(view, i);
                if (listItem2 != null) {
                    i = C28606b.edit_text_view;
                    SingleLineTextItem singleLineTextItem2 = (SingleLineTextItem) C6202b.m24689a(view, i);
                    if (singleLineTextItem2 != null) {
                        return new C24890a((LinearLayout) view, listItem, singleLineTextItem, listItem2, singleLineTextItem2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C24890a m79542d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28607c.action_sheet_income_actions, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79541a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f63873d;
    }
}
