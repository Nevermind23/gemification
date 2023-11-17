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
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: pr0.r */
public final class C37967r implements C6201a {

    /* renamed from: d */
    private final LinearLayout f91248d;

    /* renamed from: e */
    public final PageDescriptionView f91249e;

    /* renamed from: f */
    public final LinearLayout f91250f;

    /* renamed from: g */
    public final Button f91251g;

    private C37967r(LinearLayout linearLayout, PageDescriptionView pageDescriptionView, LinearLayout linearLayout2, Button button) {
        this.f91248d = linearLayout;
        this.f91249e = pageDescriptionView;
        this.f91250f = linearLayout2;
        this.f91251g = button;
    }

    /* renamed from: a */
    public static C37967r m111613a(View view) {
        int i = C37130e.f89422G;
        PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
        if (pageDescriptionView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            int i2 = C37130e.f89432f1;
            Button button = (Button) C6202b.m24689a(view, i2);
            if (button != null) {
                return new C37967r(linearLayout, pageDescriptionView, linearLayout, button);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C37967r m111614d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37131f.item_loan_history_scheduler_error, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111613a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f91248d;
    }
}
