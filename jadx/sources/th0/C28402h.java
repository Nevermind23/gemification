package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import oh0.C27010e;
import oh0.C27011f;
import p086g1.C6201a;
import p086g1.C6202b;

/* renamed from: th0.h */
public final class C28402h implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f72028d;

    /* renamed from: e */
    public final ConstraintLayout f72029e;

    /* renamed from: f */
    public final FrameLayout f72030f;

    /* renamed from: g */
    public final RecyclerView f72031g;

    private C28402h(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, FrameLayout frameLayout, RecyclerView recyclerView) {
        this.f72028d = constraintLayout;
        this.f72029e = constraintLayout2;
        this.f72030f = frameLayout;
        this.f72031g = recyclerView;
    }

    /* renamed from: a */
    public static C28402h m87129a(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = C27010e.progress_bar_view;
        FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
        if (frameLayout != null) {
            i = C27010e.rv_offer_details;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
            if (recyclerView != null) {
                return new C28402h(constraintLayout, constraintLayout, frameLayout, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28402h m87130d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.fragment_gift_card_offers_and_applications, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87129a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f72028d;
    }
}
