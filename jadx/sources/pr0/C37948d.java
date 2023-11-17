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
import p341ge.bog.designsystem.components.input.Input;

/* renamed from: pr0.d */
public final class C37948d implements C6201a {

    /* renamed from: d */
    private final LinearLayout f91103d;

    /* renamed from: e */
    public final Input f91104e;

    /* renamed from: f */
    public final Button f91105f;

    private C37948d(LinearLayout linearLayout, Input input, Button button) {
        this.f91103d = linearLayout;
        this.f91104e = input;
        this.f91105f = button;
    }

    /* renamed from: a */
    public static C37948d m111535a(View view) {
        int i = C37130e.loan_name_input;
        Input input = (Input) C6202b.m24689a(view, i);
        if (input != null) {
            i = C37130e.f89441p1;
            Button button = (Button) C6202b.m24689a(view, i);
            if (button != null) {
                return new C37948d((LinearLayout) view, input, button);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C37948d m111536d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37131f.action_sheet_rename_loan_name, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111535a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f91103d;
    }
}
