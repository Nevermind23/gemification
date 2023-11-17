package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p356ao.C10114f;
import p356ao.C10115g;

/* renamed from: eo.d */
public final class C12735d implements C6201a {

    /* renamed from: d */
    private final LinearLayout f37691d;

    /* renamed from: e */
    public final Button f37692e;

    /* renamed from: f */
    public final RecyclerView f37693f;

    private C12735d(LinearLayout linearLayout, Button button, RecyclerView recyclerView) {
        this.f37691d = linearLayout;
        this.f37692e = button;
        this.f37693f = recyclerView;
    }

    /* renamed from: a */
    public static C12735d m48333a(View view) {
        int i = C10114f.new_email_button;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10114f.f27950c1;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
            if (recyclerView != null) {
                return new C12735d((LinearLayout) view, button, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12735d m48334d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.action_sheet_email_selector, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48333a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f37691d;
    }
}
