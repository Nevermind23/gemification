package z71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import y71.C40031e;

/* renamed from: z71.h */
public final class C40181h implements C6201a {

    /* renamed from: d */
    private final RecyclerView f95520d;

    /* renamed from: e */
    public final RecyclerView f95521e;

    private C40181h(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f95520d = recyclerView;
        this.f95521e = recyclerView2;
    }

    /* renamed from: a */
    public static C40181h m116431a(View view) {
        if (view != null) {
            RecyclerView recyclerView = (RecyclerView) view;
            return new C40181h(recyclerView, recyclerView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C40181h m116432d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C40031e.fragment_travel_insurance_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m116431a(inflate);
    }

    /* renamed from: c */
    public RecyclerView mo3946b() {
        return this.f95520d;
    }
}
