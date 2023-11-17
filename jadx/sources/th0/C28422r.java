package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import oh0.C27010e;
import oh0.C27011f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;

/* renamed from: th0.r */
public final class C28422r implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f72193d;

    /* renamed from: e */
    public final ConstraintLayout f72194e;

    /* renamed from: f */
    public final EmptyWidget f72195f;

    /* renamed from: g */
    public final Button f72196g;

    private C28422r(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, EmptyWidget emptyWidget, Button button) {
        this.f72193d = constraintLayout;
        this.f72194e = constraintLayout2;
        this.f72195f = emptyWidget;
        this.f72196g = button;
    }

    /* renamed from: a */
    public static C28422r m87209a(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = C27010e.categories_header_title;
        EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
        if (emptyWidget != null) {
            i = C27010e.f67822g0;
            Button button = (Button) C6202b.m24689a(view, i);
            if (button != null) {
                return new C28422r(constraintLayout, constraintLayout, emptyWidget, button);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28422r m87210d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.item_categories, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87209a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f72193d;
    }
}
