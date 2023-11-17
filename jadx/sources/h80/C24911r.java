package h80;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import u70.C28606b;
import u70.C28607c;

/* renamed from: h80.r */
public final class C24911r implements C6201a {

    /* renamed from: d */
    private final ListItem f64050d;

    /* renamed from: e */
    public final Button f64051e;

    /* renamed from: f */
    public final BogTextView f64052f;

    private C24911r(ListItem listItem, Button button, BogTextView bogTextView) {
        this.f64050d = listItem;
        this.f64051e = button;
        this.f64052f = bogTextView;
    }

    /* renamed from: a */
    public static C24911r m79629a(View view) {
        int i = C28606b.f72584P;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C28606b.f72597g0;
            BogTextView bogTextView = (BogTextView) C6202b.m24689a(view, i);
            if (bogTextView != null) {
                return new C24911r((ListItem) view, button, bogTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C24911r m79630d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28607c.income_types_list_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79629a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f64050d;
    }
}
