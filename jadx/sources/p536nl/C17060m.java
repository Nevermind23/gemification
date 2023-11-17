package p536nl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p480jl.C16213d;
import p480jl.C16214e;

/* renamed from: nl.m */
public final class C17060m implements C6201a {

    /* renamed from: d */
    private final LinearLayout f47655d;

    /* renamed from: e */
    public final Button f47656e;

    /* renamed from: f */
    public final RecyclerView f47657f;

    /* renamed from: g */
    public final TextView f47658g;

    private C17060m(LinearLayout linearLayout, Button button, RecyclerView recyclerView, TextView textView) {
        this.f47655d = linearLayout;
        this.f47656e = button;
        this.f47657f = recyclerView;
        this.f47658g = textView;
    }

    /* renamed from: a */
    public static C17060m m59946a(View view) {
        int i = C16213d.f45745l;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C16213d.f45743j0;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
            if (recyclerView != null) {
                i = C16213d.f45721B0;
                TextView textView = (TextView) C6202b.m24689a(view, i);
                if (textView != null) {
                    return new C17060m((LinearLayout) view, button, recyclerView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C17060m m59947d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16214e.item_bnpl_offers_category, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m59946a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f47655d;
    }
}
