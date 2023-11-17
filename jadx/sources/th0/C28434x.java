package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import oh0.C27010e;
import oh0.C27011f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;

/* renamed from: th0.x */
public final class C28434x implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f72228d;

    /* renamed from: e */
    public final ConstraintLayout f72229e;

    /* renamed from: f */
    public final Button f72230f;

    /* renamed from: g */
    public final TextView f72231g;

    private C28434x(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, Button button, TextView textView) {
        this.f72228d = constraintLayout;
        this.f72229e = constraintLayout2;
        this.f72230f = button;
        this.f72231g = textView;
    }

    /* renamed from: a */
    public static C28434x m87259a(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = C27010e.f67822g0;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C27010e.f67826j2;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                return new C28434x(constraintLayout, constraintLayout, button, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28434x m87260d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.item_filter_section, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87259a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f72228d;
    }
}
