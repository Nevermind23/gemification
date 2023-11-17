package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogButton;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.x1 */
public final class C27462x1 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f70196d;

    /* renamed from: e */
    public final ImageView f70197e;

    /* renamed from: f */
    public final BogInputLayout f70198f;

    /* renamed from: g */
    public final BogButton f70199g;

    private C27462x1(LinearLayout linearLayout, ImageView imageView, BogInputLayout bogInputLayout, BogButton bogButton) {
        this.f70196d = linearLayout;
        this.f70197e = imageView;
        this.f70198f = bogInputLayout;
        this.f70199g = bogButton;
    }

    /* renamed from: a */
    public static C27462x1 m85154a(View view) {
        int i = C10322k.rename_wizard_close_button;
        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
        if (imageView != null) {
            i = C10322k.rename_wizard_input_layout;
            BogInputLayout bogInputLayout = (BogInputLayout) C6202b.m24689a(view, i);
            if (bogInputLayout != null) {
                i = C10322k.rename_wizard_save_button;
                BogButton bogButton = (BogButton) C6202b.m24689a(view, i);
                if (bogButton != null) {
                    return new C27462x1((LinearLayout) view, imageView, bogInputLayout, bogButton);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27462x1 m85155d(LayoutInflater layoutInflater) {
        return m85156e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27462x1 m85156e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.activity_rename_account, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m85154a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f70196d;
    }
}
