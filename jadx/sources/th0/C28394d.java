package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import oh0.C27010e;
import oh0.C27011f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ScrollingPagerIndicator;

/* renamed from: th0.d */
public final class C28394d implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f71993d;

    /* renamed from: e */
    public final PageDescriptionView f71994e;

    /* renamed from: f */
    public final Button f71995f;

    /* renamed from: g */
    public final ViewPager2 f71996g;

    /* renamed from: h */
    public final ScrollingPagerIndicator f71997h;

    private C28394d(ConstraintLayout constraintLayout, PageDescriptionView pageDescriptionView, Button button, ViewPager2 viewPager2, ScrollingPagerIndicator scrollingPagerIndicator) {
        this.f71993d = constraintLayout;
        this.f71994e = pageDescriptionView;
        this.f71995f = button;
        this.f71996g = viewPager2;
        this.f71997h = scrollingPagerIndicator;
    }

    /* renamed from: a */
    public static C28394d m87096a(View view) {
        int i = C27010e.f67808R;
        PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
        if (pageDescriptionView != null) {
            i = C27010e.f67809S;
            Button button = (Button) C6202b.m24689a(view, i);
            if (button != null) {
                i = C27010e.f67837y1;
                ViewPager2 viewPager2 = (ViewPager2) C6202b.m24689a(view, i);
                if (viewPager2 != null) {
                    i = C27010e.f67802J1;
                    ScrollingPagerIndicator scrollingPagerIndicator = (ScrollingPagerIndicator) C6202b.m24689a(view, i);
                    if (scrollingPagerIndicator != null) {
                        return new C28394d((ConstraintLayout) view, pageDescriptionView, button, viewPager2, scrollingPagerIndicator);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28394d m87097d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.action_sheet_received_gift_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87096a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f71993d;
    }
}
