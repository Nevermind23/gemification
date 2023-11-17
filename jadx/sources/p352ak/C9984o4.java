package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.o4 */
public final class C9984o4 implements C6201a {

    /* renamed from: d */
    private final View f27367d;

    /* renamed from: e */
    public final Button f27368e;

    /* renamed from: f */
    public final EditText f27369f;

    /* renamed from: g */
    public final LinearLayout f27370g;

    /* renamed from: h */
    public final AppCompatTextView f27371h;

    private C9984o4(View view, Button button, EditText editText, LinearLayout linearLayout, AppCompatTextView appCompatTextView) {
        this.f27367d = view;
        this.f27368e = button;
        this.f27369f = editText;
        this.f27370g = linearLayout;
        this.f27371h = appCompatTextView;
    }

    /* renamed from: a */
    public static C9984o4 m36618a(View view) {
        int i = C17782g.forgot_passcode_button;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C17782g.hidden_input;
            EditText editText = (EditText) C6202b.m24689a(view, i);
            if (editText != null) {
                i = C17782g.passcode_progress;
                LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
                if (linearLayout != null) {
                    i = C17782g.f49751c9;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                    if (appCompatTextView != null) {
                        return new C9984o4(view, button, editText, linearLayout, appCompatTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9984o4 m36619c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_passcode_compact, viewGroup);
            return m36618a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27367d;
    }
}
