package p481jm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p411em.C12488e;
import p411em.C12489f;

/* renamed from: jm.c */
public final class C16220c implements C6201a {

    /* renamed from: d */
    private final LinearLayoutCompat f45779d;

    /* renamed from: e */
    public final PageState f45780e;

    /* renamed from: f */
    public final Button f45781f;

    private C16220c(LinearLayoutCompat linearLayoutCompat, PageState pageState, Button button) {
        this.f45779d = linearLayoutCompat;
        this.f45780e = pageState;
        this.f45781f = button;
    }

    /* renamed from: a */
    public static C16220c m57808a(View view) {
        int i = C12488e.card_activation_state;
        PageState pageState = (PageState) C6202b.m24689a(view, i);
        if (pageState != null) {
            i = C12488e.open_card_details_button;
            Button button = (Button) C6202b.m24689a(view, i);
            if (button != null) {
                return new C16220c((LinearLayoutCompat) view, pageState, button);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C16220c m57809d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C12489f.action_sheet_instant_card_activation_success, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57808a(inflate);
    }

    /* renamed from: c */
    public LinearLayoutCompat mo3946b() {
        return this.f45779d;
    }
}
