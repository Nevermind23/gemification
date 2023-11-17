package ha0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import da0.C19951e;
import da0.C19952f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.biginput.BigInputView;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.carousel.daycarousel.DayCarouselView;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonCardSelectorView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: ha0.b */
public final class C24925b implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f64093d;

    /* renamed from: e */
    public final FixedButtonCardSelectorView f64094e;

    /* renamed from: f */
    public final DayCarouselView f64095f;

    /* renamed from: g */
    public final Button f64096g;

    /* renamed from: h */
    public final TextView f64097h;

    /* renamed from: i */
    public final BigInputView f64098i;

    /* renamed from: j */
    public final PageDescriptionView f64099j;

    /* renamed from: k */
    public final FrameLayout f64100k;

    private C24925b(ConstraintLayout constraintLayout, FixedButtonCardSelectorView fixedButtonCardSelectorView, DayCarouselView dayCarouselView, Button button, TextView textView, BigInputView bigInputView, PageDescriptionView pageDescriptionView, FrameLayout frameLayout) {
        this.f64093d = constraintLayout;
        this.f64094e = fixedButtonCardSelectorView;
        this.f64095f = dayCarouselView;
        this.f64096g = button;
        this.f64097h = textView;
        this.f64098i = bigInputView;
        this.f64099j = pageDescriptionView;
        this.f64100k = frameLayout;
    }

    /* renamed from: a */
    public static C24925b m79677a(View view) {
        int i = C19951e.card_selector;
        FixedButtonCardSelectorView fixedButtonCardSelectorView = (FixedButtonCardSelectorView) C6202b.m24689a(view, i);
        if (fixedButtonCardSelectorView != null) {
            i = C19951e.day_carousel;
            DayCarouselView dayCarouselView = (DayCarouselView) C6202b.m24689a(view, i);
            if (dayCarouselView != null) {
                i = C19951e.deactivation_button;
                Button button = (Button) C6202b.m24689a(view, i);
                if (button != null) {
                    i = C19951e.main_text;
                    TextView textView = (TextView) C6202b.m24689a(view, i);
                    if (textView != null) {
                        i = C19951e.monthly_added_amount_input;
                        BigInputView bigInputView = (BigInputView) C6202b.m24689a(view, i);
                        if (bigInputView != null) {
                            i = C19951e.f54530k0;
                            PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
                            if (pageDescriptionView != null) {
                                i = C19951e.f54534p0;
                                FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
                                if (frameLayout != null) {
                                    return new C24925b((ConstraintLayout) view, fixedButtonCardSelectorView, dayCarouselView, button, textView, bigInputView, pageDescriptionView, frameLayout);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C24925b m79678d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C19952f.accumulate_on_specific_date_action_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79677a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f64093d;
    }
}
