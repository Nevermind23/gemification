package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import hy0.C36271e;
import hy0.C36272f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;

/* renamed from: iy0.y1 */
public final class C36652y1 implements C6201a {

    /* renamed from: d */
    private final View f88465d;

    /* renamed from: e */
    public final AppCompatImageView f88466e;

    /* renamed from: f */
    public final Button f88467f;

    /* renamed from: g */
    public final LinearLayout f88468g;

    /* renamed from: h */
    public final LinearLayout f88469h;

    /* renamed from: i */
    public final FrameLayout f88470i;

    /* renamed from: j */
    public final AppCompatTextView f88471j;

    /* renamed from: k */
    public final AppCompatTextView f88472k;

    private C36652y1(View view, AppCompatImageView appCompatImageView, Button button, LinearLayout linearLayout, LinearLayout linearLayout2, FrameLayout frameLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f88465d = view;
        this.f88466e = appCompatImageView;
        this.f88467f = button;
        this.f88468g = linearLayout;
        this.f88469h = linearLayout2;
        this.f88470i = frameLayout;
        this.f88471j = appCompatTextView;
        this.f88472k = appCompatTextView2;
    }

    /* renamed from: a */
    public static C36652y1 m108743a(View view) {
        int i = C36271e.f87535n;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C36271e.f87550v;
            Button button = (Button) C6202b.m24689a(view, i);
            if (button != null) {
                i = C36271e.f87497S;
                LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
                if (linearLayout != null) {
                    i = C36271e.f87539p0;
                    LinearLayout linearLayout2 = (LinearLayout) C6202b.m24689a(view, i);
                    if (linearLayout2 != null) {
                        i = C36271e.item_below_container;
                        FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
                        if (frameLayout != null) {
                            i = C36271e.title_label_text;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                            if (appCompatTextView != null) {
                                i = C36271e.title_value_text;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                                if (appCompatTextView2 != null) {
                                    return new C36652y1(view, appCompatImageView, button, linearLayout, linearLayout2, frameLayout, appCompatTextView, appCompatTextView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C36652y1 m108744c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36272f.view_accordion, viewGroup);
            return m108743a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f88465d;
    }
}
