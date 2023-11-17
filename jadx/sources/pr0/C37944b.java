package pr0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import lr0.C37130e;
import lr0.C37131f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagestate.PageState;

/* renamed from: pr0.b */
public final class C37944b implements C6201a {

    /* renamed from: d */
    private final LinearLayout f91089d;

    /* renamed from: e */
    public final Button f91090e;

    /* renamed from: f */
    public final PageState f91091f;

    private C37944b(LinearLayout linearLayout, Button button, PageState pageState) {
        this.f91089d = linearLayout;
        this.f91090e = button;
        this.f91091f = pageState;
    }

    /* renamed from: a */
    public static C37944b m111519a(View view) {
        int i = C37130e.contact_button;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C37130e.f89415B0;
            PageState pageState = (PageState) C6202b.m24689a(view, i);
            if (pageState != null) {
                return new C37944b((LinearLayout) view, button, pageState);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C37944b m111520d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37131f.action_sheet_loan_installment_status, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111519a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f91089d;
    }
}
