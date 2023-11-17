package p493kk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p451hk.C15526d;
import p451hk.C15527e;

/* renamed from: kk.i */
public final class C16455i implements C6201a {

    /* renamed from: d */
    private final LinearLayout f46493d;

    /* renamed from: e */
    public final PageDescriptionView f46494e;

    /* renamed from: f */
    public final FixedButtonView f46495f;

    /* renamed from: g */
    public final Input f46496g;

    /* renamed from: h */
    public final Input f46497h;

    /* renamed from: i */
    public final Input f46498i;

    /* renamed from: j */
    public final Input f46499j;

    /* renamed from: k */
    public final Input f46500k;

    private C16455i(LinearLayout linearLayout, PageDescriptionView pageDescriptionView, FixedButtonView fixedButtonView, Input input, Input input2, Input input3, Input input4, Input input5) {
        this.f46493d = linearLayout;
        this.f46494e = pageDescriptionView;
        this.f46495f = fixedButtonView;
        this.f46496g = input;
        this.f46497h = input2;
        this.f46498i = input3;
        this.f46499j = input4;
        this.f46500k = input5;
    }

    /* renamed from: a */
    public static C16455i m58624a(View view) {
        int i = C15526d.car_owner_pager_desc;
        PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
        if (pageDescriptionView != null) {
            i = C15526d.f44068e0;
            FixedButtonView fixedButtonView = (FixedButtonView) C6202b.m24689a(view, i);
            if (fixedButtonView != null) {
                i = C15526d.owner_birthday_input;
                Input input = (Input) C6202b.m24689a(view, i);
                if (input != null) {
                    i = C15526d.owner_firstname_input;
                    Input input2 = (Input) C6202b.m24689a(view, i);
                    if (input2 != null) {
                        i = C15526d.owner_gender;
                        Input input3 = (Input) C6202b.m24689a(view, i);
                        if (input3 != null) {
                            i = C15526d.owner_id_number_input;
                            Input input4 = (Input) C6202b.m24689a(view, i);
                            if (input4 != null) {
                                i = C15526d.owner_lastname_input;
                                Input input5 = (Input) C6202b.m24689a(view, i);
                                if (input5 != null) {
                                    return new C16455i((LinearLayout) view, pageDescriptionView, fixedButtonView, input, input2, input3, input4, input5);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C16455i m58625d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C15527e.fragment_car_owner_input, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m58624a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f46493d;
    }
}
