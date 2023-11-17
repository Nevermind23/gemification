package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.f1 */
public final class C27295f1 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f68692d;

    /* renamed from: e */
    public final Button f68693e;

    /* renamed from: f */
    public final AppCompatImageView f68694f;

    /* renamed from: g */
    public final AppCompatTextView f68695g;

    /* renamed from: h */
    public final AppCompatTextView f68696h;

    private C27295f1(LinearLayout linearLayout, Button button, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f68692d = linearLayout;
        this.f68693e = button;
        this.f68694f = appCompatImageView;
        this.f68695g = appCompatTextView;
        this.f68696h = appCompatTextView2;
    }

    /* renamed from: a */
    public static C27295f1 m84481a(View view) {
        int i = C10322k.dialog_main_action_button;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10322k.dialog_picture;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
            if (appCompatImageView != null) {
                i = C10322k.f28791Tc;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView != null) {
                    i = C10322k.error_title;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                    if (appCompatTextView2 != null) {
                        return new C27295f1((LinearLayout) view, button, appCompatImageView, appCompatTextView, appCompatTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27295f1 m84482d(LayoutInflater layoutInflater) {
        return m84483e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27295f1 m84483e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.activity_out_of_service, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84481a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f68692d;
    }
}
