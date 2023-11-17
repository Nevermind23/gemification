package ap0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.strength.StrengthView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import wo0.C18652b;
import wo0.C18653c;

/* renamed from: ap0.d */
public final class C10131d implements C6201a {

    /* renamed from: d */
    private final StateView f28061d;

    /* renamed from: e */
    public final Button f28062e;

    /* renamed from: f */
    public final CreditCardSmallPickerView f28063f;

    /* renamed from: g */
    public final CheckboxView f28064g;

    /* renamed from: h */
    public final NestedScrollView f28065h;

    /* renamed from: i */
    public final EmptyWidget f28066i;

    /* renamed from: j */
    public final EmptyWidget f28067j;

    /* renamed from: k */
    public final Input f28068k;

    /* renamed from: l */
    public final LinearLayout f28069l;

    /* renamed from: m */
    public final StateView f28070m;

    /* renamed from: n */
    public final StrengthView f28071n;

    private C10131d(StateView stateView, Button button, CreditCardSmallPickerView creditCardSmallPickerView, CheckboxView checkboxView, NestedScrollView nestedScrollView, EmptyWidget emptyWidget, EmptyWidget emptyWidget2, Input input, LinearLayout linearLayout, StateView stateView2, StrengthView strengthView) {
        this.f28061d = stateView;
        this.f28062e = button;
        this.f28063f = creditCardSmallPickerView;
        this.f28064g = checkboxView;
        this.f28065h = nestedScrollView;
        this.f28066i = emptyWidget;
        this.f28067j = emptyWidget2;
        this.f28068k = input;
        this.f28069l = linearLayout;
        this.f28070m = stateView2;
        this.f28071n = strengthView;
    }

    /* renamed from: a */
    public static C10131d m37052a(View view) {
        int i = C18652b.btn_generate;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C18652b.card_picker_account;
            CreditCardSmallPickerView creditCardSmallPickerView = (CreditCardSmallPickerView) C6202b.m24689a(view, i);
            if (creditCardSmallPickerView != null) {
                i = C18652b.check_box_conditions;
                CheckboxView checkboxView = (CheckboxView) C6202b.m24689a(view, i);
                if (checkboxView != null) {
                    i = C18652b.f52256s;
                    NestedScrollView nestedScrollView = (NestedScrollView) C6202b.m24689a(view, i);
                    if (nestedScrollView != null) {
                        i = C18652b.empty_widget_accounts;
                        EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
                        if (emptyWidget != null) {
                            i = C18652b.empty_widget_nickname;
                            EmptyWidget emptyWidget2 = (EmptyWidget) C6202b.m24689a(view, i);
                            if (emptyWidget2 != null) {
                                i = C18652b.input_nickname;
                                Input input = (Input) C6202b.m24689a(view, i);
                                if (input != null) {
                                    i = C18652b.loading_content;
                                    LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
                                    if (linearLayout != null) {
                                        StateView stateView = (StateView) view;
                                        i = C18652b.strength_nickname;
                                        StrengthView strengthView = (StrengthView) C6202b.m24689a(view, i);
                                        if (strengthView != null) {
                                            return new C10131d(stateView, button, creditCardSmallPickerView, checkboxView, nestedScrollView, emptyWidget, emptyWidget2, input, linearLayout, stateView, strengthView);
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
    public static C10131d m37053d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C18653c.fragment_p2p_link_generation, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m37052a(inflate);
    }

    /* renamed from: c */
    public StateView mo3946b() {
        return this.f28061d;
    }
}
