package b31;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import x11.C39771d;
import x11.C39772e;

/* renamed from: b31.b */
public final class C31113b implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f77319d;

    /* renamed from: e */
    public final RecyclerView f77320e;

    /* renamed from: f */
    public final Button f77321f;

    private C31113b(ConstraintLayout constraintLayout, RecyclerView recyclerView, Button button) {
        this.f77319d = constraintLayout;
        this.f77320e = recyclerView;
        this.f77321f = button;
    }

    /* renamed from: a */
    public static C31113b m92570a(View view) {
        int i = C39771d.limit_list;
        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
        if (recyclerView != null) {
            i = C39771d.f94475p;
            Button button = (Button) C6202b.m24689a(view, i);
            if (button != null) {
                return new C31113b((ConstraintLayout) view, recyclerView, button);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C31113b m92571d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39772e.action_sheet_card_limit_chooser, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m92570a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f77319d;
    }
}
