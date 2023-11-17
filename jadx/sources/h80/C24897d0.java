package h80;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.mobilebank.p975ui.views.widgets.BigDividerView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import u70.C28606b;
import u70.C28607c;

/* renamed from: h80.d0 */
public final class C24897d0 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f63917d;

    /* renamed from: e */
    public final BigDividerView f63918e;

    /* renamed from: f */
    public final BogTextView f63919f;

    /* renamed from: g */
    public final Button f63920g;

    private C24897d0(LinearLayout linearLayout, BigDividerView bigDividerView, BogTextView bogTextView, Button button) {
        this.f63917d = linearLayout;
        this.f63918e = bigDividerView;
        this.f63919f = bogTextView;
        this.f63920g = button;
    }

    /* renamed from: a */
    public static C24897d0 m79569a(View view) {
        int i = C28606b.f72568B;
        BigDividerView bigDividerView = (BigDividerView) C6202b.m24689a(view, i);
        if (bigDividerView != null) {
            i = C28606b.f72597g0;
            BogTextView bogTextView = (BogTextView) C6202b.m24689a(view, i);
            if (bogTextView != null) {
                i = C28606b.remove;
                Button button = (Button) C6202b.m24689a(view, i);
                if (button != null) {
                    return new C24897d0((LinearLayout) view, bigDividerView, bogTextView, button);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C24897d0 m79570d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28607c.uploaded_documents_recycler_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79569a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f63917d;
    }
}
