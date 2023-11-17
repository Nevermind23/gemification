package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.input.BogEditText;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.q3 */
public final class C9998q3 implements C6201a {

    /* renamed from: d */
    private final View f27429d;

    /* renamed from: e */
    public final AppCompatTextView f27430e;

    /* renamed from: f */
    public final AppCompatTextView f27431f;

    /* renamed from: g */
    public final BogEditText f27432g;

    private C9998q3(View view, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, BogEditText bogEditText) {
        this.f27429d = view;
        this.f27430e = appCompatTextView;
        this.f27431f = appCompatTextView2;
        this.f27432g = bogEditText;
    }

    /* renamed from: a */
    public static C9998q3 m36670a(View view) {
        int i = C17782g.f49682E2;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C17782g.f49716O4;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView2 != null) {
                i = C17782g.text_input;
                BogEditText bogEditText = (BogEditText) C6202b.m24689a(view, i);
                if (bogEditText != null) {
                    return new C9998q3(view, appCompatTextView, appCompatTextView2, bogEditText);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9998q3 m36671c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_input_big, viewGroup);
            return m36670a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27429d;
    }
}
