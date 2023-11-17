package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.ClearFocusEditText;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.c4 */
public final class C9888c4 implements C6201a {

    /* renamed from: d */
    private final View f26856d;

    /* renamed from: e */
    public final View f26857e;

    /* renamed from: f */
    public final LinearLayout f26858f;

    /* renamed from: g */
    public final AppCompatImageView f26859g;

    /* renamed from: h */
    public final Button f26860h;

    /* renamed from: i */
    public final ClearFocusEditText f26861i;

    private C9888c4(View view, View view2, LinearLayout linearLayout, AppCompatImageView appCompatImageView, Button button, ClearFocusEditText clearFocusEditText) {
        this.f26856d = view;
        this.f26857e = view2;
        this.f26858f = linearLayout;
        this.f26859g = appCompatImageView;
        this.f26860h = button;
        this.f26861i = clearFocusEditText;
    }

    /* renamed from: a */
    public static C9888c4 m36268a(View view) {
        int i = C17782g.bottom_line;
        View a = C6202b.m24689a(view, i);
        if (a != null) {
            i = C17782g.f49731U1;
            LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
            if (linearLayout != null) {
                i = C17782g.icon_clear;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
                if (appCompatImageView != null) {
                    i = C17782g.f49732U5;
                    Button button = (Button) C6202b.m24689a(view, i);
                    if (button != null) {
                        i = C17782g.search_input_text;
                        ClearFocusEditText clearFocusEditText = (ClearFocusEditText) C6202b.m24689a(view, i);
                        if (clearFocusEditText != null) {
                            return new C9888c4(view, a, linearLayout, appCompatImageView, button, clearFocusEditText);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9888c4 m36269c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_navigation_search, viewGroup);
            return m36268a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f26856d;
    }
}
