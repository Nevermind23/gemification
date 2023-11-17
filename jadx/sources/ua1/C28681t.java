package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;

/* renamed from: ua1.t */
public final class C28681t implements C6201a {

    /* renamed from: d */
    private final CoordinatorLayout f72934d;

    /* renamed from: e */
    public final LinearLayout f72935e;

    /* renamed from: f */
    public final Button f72936f;

    /* renamed from: g */
    public final Button f72937g;

    /* renamed from: h */
    public final RecyclerView f72938h;

    /* renamed from: i */
    public final CheckboxView f72939i;

    private C28681t(CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, Button button, Button button2, RecyclerView recyclerView, CheckboxView checkboxView) {
        this.f72934d = coordinatorLayout;
        this.f72935e = linearLayout;
        this.f72936f = button;
        this.f72937g = button2;
        this.f72938h = recyclerView;
        this.f72939i = checkboxView;
    }

    /* renamed from: a */
    public static C28681t m87839a(View view) {
        int i = C10216u.f28317b;
        LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
        if (linearLayout != null) {
            i = C10216u.f28339t0;
            Button button = (Button) C6202b.m24689a(view, i);
            if (button != null) {
                i = C10216u.f28297H0;
                Button button2 = (Button) C6202b.m24689a(view, i);
                if (button2 != null) {
                    i = C10216u.f28332j2;
                    RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
                    if (recyclerView != null) {
                        i = C10216u.select_all_checkbox;
                        CheckboxView checkboxView = (CheckboxView) C6202b.m24689a(view, i);
                        if (checkboxView != null) {
                            return new C28681t((CoordinatorLayout) view, linearLayout, button, button2, recyclerView, checkboxView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28681t m87840d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.fragment_edit_my_devices, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87839a(inflate);
    }

    /* renamed from: c */
    public CoordinatorLayout mo3946b() {
        return this.f72934d;
    }
}
