package en0;

import an0.C10106b;
import an0.C10107c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;

/* renamed from: en0.c */
public final class C12717c implements C6201a {

    /* renamed from: d */
    private final StateView f37610d;

    /* renamed from: e */
    public final Input f37611e;

    /* renamed from: f */
    public final Input f37612f;

    /* renamed from: g */
    public final Input f37613g;

    /* renamed from: h */
    public final Input f37614h;

    /* renamed from: i */
    public final Input f37615i;

    /* renamed from: j */
    public final LinearLayout f37616j;

    /* renamed from: k */
    public final Input f37617k;

    /* renamed from: l */
    public final CheckboxView f37618l;

    /* renamed from: m */
    public final LinearLayout f37619m;

    /* renamed from: n */
    public final FixedButtonView f37620n;

    /* renamed from: o */
    public final CheckboxView f37621o;

    /* renamed from: p */
    public final LinearLayout f37622p;

    /* renamed from: q */
    public final Input f37623q;

    /* renamed from: r */
    public final FrameLayout f37624r;

    /* renamed from: s */
    public final Button f37625s;

    /* renamed from: t */
    public final Input f37626t;

    private C12717c(StateView stateView, Input input, Input input2, Input input3, Input input4, Input input5, LinearLayout linearLayout, Input input6, CheckboxView checkboxView, LinearLayout linearLayout2, FixedButtonView fixedButtonView, CheckboxView checkboxView2, LinearLayout linearLayout3, Input input7, FrameLayout frameLayout, Button button, Input input8) {
        this.f37610d = stateView;
        this.f37611e = input;
        this.f37612f = input2;
        this.f37613g = input3;
        this.f37614h = input4;
        this.f37615i = input5;
        this.f37616j = linearLayout;
        this.f37617k = input6;
        this.f37618l = checkboxView;
        this.f37619m = linearLayout2;
        this.f37620n = fixedButtonView;
        this.f37621o = checkboxView2;
        this.f37622p = linearLayout3;
        this.f37623q = input7;
        this.f37624r = frameLayout;
        this.f37625s = button;
        this.f37626t = input8;
    }

    /* renamed from: a */
    public static C12717c m48261a(View view) {
        View view2 = view;
        int i = C10106b.actual_address_line_input;
        Input input = (Input) C6202b.m24689a(view2, i);
        if (input != null) {
            i = C10106b.actual_city_input;
            Input input2 = (Input) C6202b.m24689a(view2, i);
            if (input2 != null) {
                i = C10106b.actual_country_input;
                Input input3 = (Input) C6202b.m24689a(view2, i);
                if (input3 != null) {
                    i = C10106b.citizenship_input;
                    Input input4 = (Input) C6202b.m24689a(view2, i);
                    if (input4 != null) {
                        i = C10106b.city_legal_input;
                        Input input5 = (Input) C6202b.m24689a(view2, i);
                        if (input5 != null) {
                            i = C10106b.f27885p;
                            LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view2, i);
                            if (linearLayout != null) {
                                i = C10106b.country_legal_input;
                                Input input6 = (Input) C6202b.m24689a(view2, i);
                                if (input6 != null) {
                                    i = C10106b.dual_nationality_checkbox;
                                    CheckboxView checkboxView = (CheckboxView) C6202b.m24689a(view2, i);
                                    if (checkboxView != null) {
                                        i = C10106b.f27888v;
                                        LinearLayout linearLayout2 = (LinearLayout) C6202b.m24689a(view2, i);
                                        if (linearLayout2 != null) {
                                            i = C10106b.f27889w;
                                            FixedButtonView fixedButtonView = (FixedButtonView) C6202b.m24689a(view2, i);
                                            if (fixedButtonView != null) {
                                                i = C10106b.legal_address_checkbox;
                                                CheckboxView checkboxView2 = (CheckboxView) C6202b.m24689a(view2, i);
                                                if (checkboxView2 != null) {
                                                    i = C10106b.legal_address_container;
                                                    LinearLayout linearLayout3 = (LinearLayout) C6202b.m24689a(view2, i);
                                                    if (linearLayout3 != null) {
                                                        i = C10106b.legal_address_line_input;
                                                        Input input7 = (Input) C6202b.m24689a(view2, i);
                                                        if (input7 != null) {
                                                            i = C10106b.f27872D;
                                                            FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view2, i);
                                                            if (frameLayout != null) {
                                                                i = C10106b.f27878L;
                                                                Button button = (Button) C6202b.m24689a(view2, i);
                                                                if (button != null) {
                                                                    i = C10106b.second_citizenship_input;
                                                                    Input input8 = (Input) C6202b.m24689a(view2, i);
                                                                    if (input8 != null) {
                                                                        return new C12717c((StateView) view2, input, input2, input3, input4, input5, linearLayout, input6, checkboxView, linearLayout2, fixedButtonView, checkboxView2, linearLayout3, input7, frameLayout, button, input8);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
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
    public static C12717c m48262d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10107c.fragment_identity_data_input, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48261a(inflate);
    }

    /* renamed from: c */
    public StateView mo3946b() {
        return this.f37610d;
    }
}
