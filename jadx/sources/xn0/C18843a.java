package xn0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.pagestate.PageState;
import sn0.C17901e;
import sn0.C17902f;

/* renamed from: xn0.a */
public final class C18843a implements C6201a {

    /* renamed from: d */
    private final LinearLayout f52657d;

    /* renamed from: e */
    public final InlineFeedback f52658e;

    /* renamed from: f */
    public final Button f52659f;

    /* renamed from: g */
    public final PageState f52660g;

    private C18843a(LinearLayout linearLayout, InlineFeedback inlineFeedback, Button button, PageState pageState) {
        this.f52657d = linearLayout;
        this.f52658e = inlineFeedback;
        this.f52659f = button;
        this.f52660g = pageState;
    }

    /* renamed from: a */
    public static C18843a m63735a(View view) {
        int i = C17901e.f50987x;
        InlineFeedback inlineFeedback = (InlineFeedback) C6202b.m24689a(view, i);
        if (inlineFeedback != null) {
            i = C17901e.offers_btn;
            Button button = (Button) C6202b.m24689a(view, i);
            if (button != null) {
                i = C17901e.f50956T;
                PageState pageState = (PageState) C6202b.m24689a(view, i);
                if (pageState != null) {
                    return new C18843a((LinearLayout) view, inlineFeedback, button, pageState);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C18843a m63736d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17902f.action_sheet_chooser_success, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m63735a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f52657d;
    }
}
