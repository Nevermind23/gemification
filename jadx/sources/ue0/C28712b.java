package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ie0.C25187g;
import ie0.C25188h;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;

/* renamed from: ue0.b */
public final class C28712b implements C6201a {

    /* renamed from: d */
    private final LinearLayout f73132d;

    /* renamed from: e */
    public final Button f73133e;

    /* renamed from: f */
    public final Input f73134f;

    private C28712b(LinearLayout linearLayout, Button button, Input input) {
        this.f73132d = linearLayout;
        this.f73133e = button;
        this.f73134f = input;
    }

    /* renamed from: a */
    public static C28712b m87964a(View view) {
        int i = C25187g.button_change;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C25187g.input_name;
            Input input = (Input) C6202b.m24689a(view, i);
            if (input != null) {
                return new C28712b((LinearLayout) view, button, input);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28712b m87965d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.action_sheet_change_watchlist_name, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87964a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f73132d;
    }
}
