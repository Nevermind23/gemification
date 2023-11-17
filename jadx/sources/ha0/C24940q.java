package ha0;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import da0.C19951e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.carousel.monthcarousel.MonthCarouselView;

/* renamed from: ha0.q */
public final class C24940q implements C6201a {

    /* renamed from: d */
    private final LinearLayoutCompat f64233d;

    /* renamed from: e */
    public final TextView f64234e;

    /* renamed from: f */
    public final MonthCarouselView f64235f;

    private C24940q(LinearLayoutCompat linearLayoutCompat, TextView textView, MonthCarouselView monthCarouselView) {
        this.f64233d = linearLayoutCompat;
        this.f64234e = textView;
        this.f64235f = monthCarouselView;
    }

    /* renamed from: a */
    public static C24940q m79744a(View view) {
        int i = C19951e.month_carousel_header_text;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C19951e.month_carousel_view;
            MonthCarouselView monthCarouselView = (MonthCarouselView) C6202b.m24689a(view, i);
            if (monthCarouselView != null) {
                return new C24940q((LinearLayoutCompat) view, textView, monthCarouselView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public LinearLayoutCompat mo3946b() {
        return this.f64233d;
    }
}
