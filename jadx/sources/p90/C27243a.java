package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.a */
public final class C27243a implements C6201a {

    /* renamed from: d */
    private final LinearLayoutCompat f68259d;

    /* renamed from: e */
    public final Button f68260e;

    /* renamed from: f */
    public final PageDescriptionView f68261f;

    private C27243a(LinearLayoutCompat linearLayoutCompat, Button button, PageDescriptionView pageDescriptionView) {
        this.f68259d = linearLayoutCompat;
        this.f68260e = button;
        this.f68261f = pageDescriptionView;
    }

    /* renamed from: a */
    public static C27243a m84276a(View view) {
        int i = C10322k.dictionary_update_button;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10322k.dictionary_update_description;
            PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
            if (pageDescriptionView != null) {
                return new C27243a((LinearLayoutCompat) view, button, pageDescriptionView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27243a m84277d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.action_sheet_forced_dictionary_update, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84276a(inflate);
    }

    /* renamed from: c */
    public LinearLayoutCompat mo3946b() {
        return this.f68259d;
    }
}
