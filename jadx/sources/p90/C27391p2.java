package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.p2 */
public final class C27391p2 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f69523d;

    /* renamed from: e */
    public final Button f69524e;

    /* renamed from: f */
    public final Input f69525f;

    /* renamed from: g */
    public final Input f69526g;

    private C27391p2(ConstraintLayout constraintLayout, Button button, Input input, Input input2) {
        this.f69523d = constraintLayout;
        this.f69524e = button;
        this.f69525f = input;
        this.f69526g = input2;
    }

    /* renamed from: a */
    public static C27391p2 m84868a(View view) {
        int i = C10322k.f28902v0;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10322k.cash_amount_input;
            Input input = (Input) C6202b.m24689a(view, i);
            if (input != null) {
                i = C10322k.cash_nomination_input;
                Input input2 = (Input) C6202b.m24689a(view, i);
                if (input2 != null) {
                    return new C27391p2((ConstraintLayout) view, button, input, input2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27391p2 m84869d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.cash_operation_bottom_sheet_dialog_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84868a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f69523d;
    }
}
