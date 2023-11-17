package p482jn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p426fn.C12929c;
import p426fn.C12930d;

/* renamed from: jn.b */
public final class C16249b implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f46019d;

    /* renamed from: e */
    public final Input f46020e;

    /* renamed from: f */
    public final Input f46021f;

    /* renamed from: g */
    public final PageDescriptionView f46022g;

    /* renamed from: h */
    public final Input f46023h;

    /* renamed from: i */
    public final Button f46024i;

    private C16249b(ConstraintLayout constraintLayout, Input input, Input input2, PageDescriptionView pageDescriptionView, Input input3, Button button) {
        this.f46019d = constraintLayout;
        this.f46020e = input;
        this.f46021f = input2;
        this.f46022g = pageDescriptionView;
        this.f46023h = input3;
        this.f46024i = button;
    }

    /* renamed from: a */
    public static C16249b m57930a(View view) {
        int i = C12929c.card_cvv;
        Input input = (Input) C6202b.m24689a(view, i);
        if (input != null) {
            i = C12929c.card_date;
            Input input2 = (Input) C6202b.m24689a(view, i);
            if (input2 != null) {
                i = C12929c.card_description;
                PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
                if (pageDescriptionView != null) {
                    i = C12929c.card_number_tt;
                    Input input3 = (Input) C6202b.m24689a(view, i);
                    if (input3 != null) {
                        i = C12929c.f38183o;
                        Button button = (Button) C6202b.m24689a(view, i);
                        if (button != null) {
                            return new C16249b((ConstraintLayout) view, input, input2, pageDescriptionView, input3, button);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C16249b m57931d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C12930d.action_sheet_card_full_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57930a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f46019d;
    }
}
