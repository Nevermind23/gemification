package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttonlist.ButtonListView;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.digitalkeyboard.NumericKeyboardView;
import p341ge.bog.designsystem.components.passcode.PasscodeView;

/* renamed from: ua1.j0 */
public final class C28652j0 implements C6201a {

    /* renamed from: d */
    private final ScrollView f72774d;

    /* renamed from: e */
    public final Button f72775e;

    /* renamed from: f */
    public final NumericKeyboardView f72776f;

    /* renamed from: g */
    public final PasscodeView f72777g;

    /* renamed from: h */
    public final ButtonListView f72778h;

    private C28652j0(ScrollView scrollView, Button button, NumericKeyboardView numericKeyboardView, PasscodeView passcodeView, ButtonListView buttonListView) {
        this.f72774d = scrollView;
        this.f72775e = button;
        this.f72776f = numericKeyboardView;
        this.f72777g = passcodeView;
        this.f72778h = buttonListView;
    }

    /* renamed from: a */
    public static C28652j0 m87713a(View view) {
        int i = C10216u.forgot_passcode;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10216u.passcode_keyboard_view;
            NumericKeyboardView numericKeyboardView = (NumericKeyboardView) C6202b.m24689a(view, i);
            if (numericKeyboardView != null) {
                i = C10216u.passcode_view;
                PasscodeView passcodeView = (PasscodeView) C6202b.m24689a(view, i);
                if (passcodeView != null) {
                    i = C10216u.statement_category_view;
                    ButtonListView buttonListView = (ButtonListView) C6202b.m24689a(view, i);
                    if (buttonListView != null) {
                        return new C28652j0((ScrollView) view, button, numericKeyboardView, passcodeView, buttonListView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28652j0 m87714d(LayoutInflater layoutInflater) {
        return m87715e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28652j0 m87715e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.fragment_pass_code_sign_in, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87713a(inflate);
    }

    /* renamed from: c */
    public ScrollView mo3946b() {
        return this.f72774d;
    }
}
