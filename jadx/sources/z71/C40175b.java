package z71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import y71.C40030d;
import y71.C40031e;

/* renamed from: z71.b */
public final class C40175b implements C6201a {

    /* renamed from: d */
    private final FrameLayout f95453d;

    /* renamed from: e */
    public final RecyclerView f95454e;

    private C40175b(FrameLayout frameLayout, RecyclerView recyclerView) {
        this.f95453d = frameLayout;
        this.f95454e = recyclerView;
    }

    /* renamed from: a */
    public static C40175b m116406a(View view) {
        int i = C40030d.f95106k0;
        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
        if (recyclerView != null) {
            return new C40175b((FrameLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C40175b m116407d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C40031e.action_sheet_select_insurance_person, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m116406a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f95453d;
    }
}
