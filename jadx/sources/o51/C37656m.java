package o51;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import n51.C37356b;
import n51.C37357c;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;

/* renamed from: o51.m */
public final class C37656m implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f90504d;

    /* renamed from: e */
    public final Button f90505e;

    /* renamed from: f */
    public final TextView f90506f;

    private C37656m(ConstraintLayout constraintLayout, Button button, TextView textView) {
        this.f90504d = constraintLayout;
        this.f90505e = button;
        this.f90506f = textView;
    }

    /* renamed from: a */
    public static C37656m m110715a(View view) {
        int i = C37356b.f89828l0;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C37356b.f89813C0;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                return new C37656m((ConstraintLayout) view, button, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C37656m m110716d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37357c.item_statements_more_loading_error, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m110715a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f90504d;
    }
}
