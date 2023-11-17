package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.digitalkeyboard.NumericKeyboardView;
import p341ge.bog.designsystem.components.passcode.PasscodeView;

/* renamed from: ua1.s */
public final class C28678s implements C6201a {

    /* renamed from: d */
    private final LinearLayout f72917d;

    /* renamed from: e */
    public final NumericKeyboardView f72918e;

    /* renamed from: f */
    public final PasscodeView f72919f;

    /* renamed from: g */
    public final NestedScrollView f72920g;

    private C28678s(LinearLayout linearLayout, NumericKeyboardView numericKeyboardView, PasscodeView passcodeView, NestedScrollView nestedScrollView) {
        this.f72917d = linearLayout;
        this.f72918e = numericKeyboardView;
        this.f72919f = passcodeView;
        this.f72920g = nestedScrollView;
    }

    /* renamed from: a */
    public static C28678s m87827a(View view) {
        int i = C10216u.passcode_keyboard_view;
        NumericKeyboardView numericKeyboardView = (NumericKeyboardView) C6202b.m24689a(view, i);
        if (numericKeyboardView != null) {
            i = C10216u.passcode_view;
            PasscodeView passcodeView = (PasscodeView) C6202b.m24689a(view, i);
            if (passcodeView != null) {
                i = C10216u.f28344w2;
                NestedScrollView nestedScrollView = (NestedScrollView) C6202b.m24689a(view, i);
                if (nestedScrollView != null) {
                    return new C28678s((LinearLayout) view, numericKeyboardView, passcodeView, nestedScrollView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28678s m87828d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.fragment_create_pass_code, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87827a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f72917d;
    }
}
