package ha0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import da0.C19951e;
import da0.C19952f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;

/* renamed from: ha0.c */
public final class C24926c implements C6201a {

    /* renamed from: d */
    private final LinearLayout f64101d;

    /* renamed from: e */
    public final Input f64102e;

    /* renamed from: f */
    public final Button f64103f;

    private C24926c(LinearLayout linearLayout, Input input, Button button) {
        this.f64101d = linearLayout;
        this.f64102e = input;
        this.f64103f = button;
    }

    /* renamed from: a */
    public static C24926c m79681a(View view) {
        int i = C19951e.deposit_name_input;
        Input input = (Input) C6202b.m24689a(view, i);
        if (input != null) {
            i = C19951e.f54540v0;
            Button button = (Button) C6202b.m24689a(view, i);
            if (button != null) {
                return new C24926c((LinearLayout) view, input, button);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C24926c m79682d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C19952f.action_sheet_deposit_name, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79681a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f64101d;
    }
}
