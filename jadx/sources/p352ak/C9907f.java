package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.slider.InfinitePagerIndicator;
import p601sg.C17783h;

/* renamed from: ak.f */
public final class C9907f implements C6201a {

    /* renamed from: d */
    private final InfinitePagerIndicator f26970d;

    private C9907f(InfinitePagerIndicator infinitePagerIndicator) {
        this.f26970d = infinitePagerIndicator;
    }

    /* renamed from: a */
    public static C9907f m36339a(View view) {
        if (view != null) {
            return new C9907f((InfinitePagerIndicator) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C9907f m36340d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.infinite_indicator, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36339a(inflate);
    }

    /* renamed from: c */
    public InfinitePagerIndicator mo3946b() {
        return this.f26970d;
    }
}
