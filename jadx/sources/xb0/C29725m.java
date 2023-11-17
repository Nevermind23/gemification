package xb0;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import rb0.C27985d;

/* renamed from: xb0.m */
public final class C29725m implements C6201a {

    /* renamed from: d */
    private final FrameLayout f75118d;

    /* renamed from: e */
    public final FrameLayout f75119e;

    /* renamed from: f */
    public final TwoLineTextItem f75120f;

    /* renamed from: g */
    public final AppCompatTextView f75121g;

    private C29725m(FrameLayout frameLayout, FrameLayout frameLayout2, TwoLineTextItem twoLineTextItem, AppCompatTextView appCompatTextView) {
        this.f75118d = frameLayout;
        this.f75119e = frameLayout2;
        this.f75120f = twoLineTextItem;
        this.f75121g = appCompatTextView;
    }

    /* renamed from: a */
    public static C29725m m90266a(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i = C27985d.f71290q1;
        TwoLineTextItem twoLineTextItem = (TwoLineTextItem) C6202b.m24689a(view, i);
        if (twoLineTextItem != null) {
            i = C27985d.f71301y1;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView != null) {
                return new C29725m(frameLayout, frameLayout, twoLineTextItem, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f75118d;
    }
}
