package p352ak;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p601sg.C17782g;

/* renamed from: ak.y */
public final class C10050y implements C6201a {

    /* renamed from: d */
    private final LinearLayout f27760d;

    /* renamed from: e */
    public final Button f27761e;

    /* renamed from: f */
    public final AppCompatTextView f27762f;

    private C10050y(LinearLayout linearLayout, Button button, AppCompatTextView appCompatTextView) {
        this.f27760d = linearLayout;
        this.f27761e = button;
        this.f27762f = appCompatTextView;
    }

    /* renamed from: a */
    public static C10050y m36862a(View view) {
        int i = C17782g.navigateButton;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C17782g.titleView;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView != null) {
                return new C10050y((LinearLayout) view, button, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f27760d;
    }
}
