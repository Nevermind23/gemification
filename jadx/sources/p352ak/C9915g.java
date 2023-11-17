package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p601sg.C17783h;
import p881ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

/* renamed from: ak.g */
public final class C9915g implements C6201a {

    /* renamed from: d */
    private final ScrollingPagerIndicator f27013d;

    private C9915g(ScrollingPagerIndicator scrollingPagerIndicator) {
        this.f27013d = scrollingPagerIndicator;
    }

    /* renamed from: a */
    public static C9915g m36369a(View view) {
        if (view != null) {
            return new C9915g((ScrollingPagerIndicator) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C9915g m36370d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.instagram_slider_indicator, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36369a(inflate);
    }

    /* renamed from: c */
    public ScrollingPagerIndicator mo3946b() {
        return this.f27013d;
    }
}
