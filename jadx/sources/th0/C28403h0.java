package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import oh0.C27010e;
import oh0.C27011f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: th0.h0 */
public final class C28403h0 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f72032d;

    /* renamed from: e */
    public final PageDescriptionView f72033e;

    /* renamed from: f */
    public final LinearLayout f72034f;

    /* renamed from: g */
    public final Button f72035g;

    private C28403h0(LinearLayout linearLayout, PageDescriptionView pageDescriptionView, LinearLayout linearLayout2, Button button) {
        this.f72032d = linearLayout;
        this.f72033e = pageDescriptionView;
        this.f72034f = linearLayout2;
        this.f72035g = button;
    }

    /* renamed from: a */
    public static C28403h0 m87133a(View view) {
        int i = C27010e.f67818d0;
        PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
        if (pageDescriptionView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            int i2 = C27010e.f67794D1;
            Button button = (Button) C6202b.m24689a(view, i2);
            if (button != null) {
                return new C28403h0(linearLayout, pageDescriptionView, linearLayout, button);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28403h0 m87134d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.item_gift_card_error, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87133a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f72032d;
    }
}
