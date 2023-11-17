package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import ie0.C25187g;
import ie0.C25188h;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;

/* renamed from: ue0.m */
public final class C28738m implements C6201a {

    /* renamed from: d */
    private final LinearLayout f73373d;

    /* renamed from: e */
    public final Button f73374e;

    /* renamed from: f */
    public final RecyclerView f73375f;

    private C28738m(LinearLayout linearLayout, Button button, RecyclerView recyclerView) {
        this.f73373d = linearLayout;
        this.f73374e = button;
        this.f73375f = recyclerView;
    }

    /* renamed from: a */
    public static C28738m m88077a(View view) {
        int i = C25187g.buttonSave;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C25187g.watchListRecycler;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
            if (recyclerView != null) {
                return new C28738m((LinearLayout) view, button, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28738m m88078d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.action_sheet_gt_watch_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88077a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f73373d;
    }
}
