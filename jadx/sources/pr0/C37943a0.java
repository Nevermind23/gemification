package pr0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import lr0.C37130e;
import lr0.C37131f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;

/* renamed from: pr0.a0 */
public final class C37943a0 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f91086d;

    /* renamed from: e */
    public final TextView f91087e;

    /* renamed from: f */
    public final SingleLineTextItem f91088f;

    private C37943a0(LinearLayout linearLayout, TextView textView, SingleLineTextItem singleLineTextItem) {
        this.f91086d = linearLayout;
        this.f91087e = textView;
        this.f91088f = singleLineTextItem;
    }

    /* renamed from: a */
    public static C37943a0 m111515a(View view) {
        int i = C37130e.f89433j;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C37130e.f89449v1;
            SingleLineTextItem singleLineTextItem = (SingleLineTextItem) C6202b.m24689a(view, i);
            if (singleLineTextItem != null) {
                return new C37943a0((LinearLayout) view, textView, singleLineTextItem);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C37943a0 m111516d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37131f.item_repayment_details_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111515a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f91086d;
    }
}
