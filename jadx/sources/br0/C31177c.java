package br0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagestate.PageState;
import xq0.C39835a;
import xq0.C39836b;

/* renamed from: br0.c */
public final class C31177c implements C6201a {

    /* renamed from: d */
    private final LinearLayout f77445d;

    /* renamed from: e */
    public final Button f77446e;

    /* renamed from: f */
    public final PageState f77447f;

    private C31177c(LinearLayout linearLayout, Button button, PageState pageState) {
        this.f77445d = linearLayout;
        this.f77446e = button;
        this.f77447f = pageState;
    }

    /* renamed from: a */
    public static C31177c m92713a(View view) {
        int i = C39835a.f94552q;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C39835a.f94548D;
            PageState pageState = (PageState) C6202b.m24689a(view, i);
            if (pageState != null) {
                return new C31177c((LinearLayout) view, button, pageState);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C31177c m92714d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39836b.action_sheet_secured_loan_success, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m92713a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f77445d;
    }
}
