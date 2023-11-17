package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.c3 */
public final class C27267c3 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f68466d;

    /* renamed from: e */
    public final Button f68467e;

    /* renamed from: f */
    public final TextView f68468f;

    private C27267c3(LinearLayout linearLayout, Button button, TextView textView) {
        this.f68466d = linearLayout;
        this.f68467e = button;
        this.f68468f = textView;
    }

    /* renamed from: a */
    public static C27267c3 m84368a(View view) {
        int i = C10322k.activateBtn;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10322k.subTitle;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                return new C27267c3((LinearLayout) view, button, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27267c3 m84369d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.dialog_verify_contacts, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84368a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f68466d;
    }
}
