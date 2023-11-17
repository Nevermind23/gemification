package ev0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bv0.C31204d;
import bv0.C31205e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;

/* renamed from: ev0.w */
public final class C31842w implements C6201a {

    /* renamed from: d */
    private final ListItem f78546d;

    /* renamed from: e */
    public final TextView f78547e;

    /* renamed from: f */
    public final TwoLineTextItem f78548f;

    private C31842w(ListItem listItem, TextView textView, TwoLineTextItem twoLineTextItem) {
        this.f78546d = listItem;
        this.f78547e = textView;
        this.f78548f = twoLineTextItem;
    }

    /* renamed from: a */
    public static C31842w m94157a(View view) {
        int i = C31204d.f77514N;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C31204d.operation_text_item;
            TwoLineTextItem twoLineTextItem = (TwoLineTextItem) C6202b.m24689a(view, i);
            if (twoLineTextItem != null) {
                return new C31842w((ListItem) view, textView, twoLineTextItem);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C31842w m94158d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31205e.item_operation, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94157a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f78546d;
    }
}
