package p90;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p366bk.C10322k;

/* renamed from: p90.q7 */
public final class C27405q7 implements C6201a {

    /* renamed from: d */
    private final HorizontalScrollView f69620d;

    /* renamed from: e */
    public final AppCompatTextView f69621e;

    /* renamed from: f */
    public final RelativeLayout f69622f;

    /* renamed from: g */
    public final RelativeLayout f69623g;

    /* renamed from: h */
    public final RelativeLayout f69624h;

    /* renamed from: i */
    public final HorizontalScrollView f69625i;

    private C27405q7(HorizontalScrollView horizontalScrollView, AppCompatTextView appCompatTextView, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, HorizontalScrollView horizontalScrollView2) {
        this.f69620d = horizontalScrollView;
        this.f69621e = appCompatTextView;
        this.f69622f = relativeLayout;
        this.f69623g = relativeLayout2;
        this.f69624h = relativeLayout3;
        this.f69625i = horizontalScrollView2;
    }

    /* renamed from: a */
    public static C27405q7 m84923a(View view) {
        int i = C10322k.tab_label_service_center;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C10322k.top_menu_left_text_container;
            RelativeLayout relativeLayout = (RelativeLayout) C6202b.m24689a(view, i);
            if (relativeLayout != null) {
                i = C10322k.top_menu_middle_text_container;
                RelativeLayout relativeLayout2 = (RelativeLayout) C6202b.m24689a(view, i);
                if (relativeLayout2 != null) {
                    i = C10322k.top_menu_right_text_container;
                    RelativeLayout relativeLayout3 = (RelativeLayout) C6202b.m24689a(view, i);
                    if (relativeLayout3 != null) {
                        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) view;
                        return new C27405q7(horizontalScrollView, appCompatTextView, relativeLayout, relativeLayout2, relativeLayout3, horizontalScrollView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public HorizontalScrollView mo3946b() {
        return this.f69620d;
    }
}
