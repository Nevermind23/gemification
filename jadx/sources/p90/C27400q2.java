package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.q2 */
public final class C27400q2 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f69586d;

    /* renamed from: e */
    public final Button f69587e;

    /* renamed from: f */
    public final TextView f69588f;

    /* renamed from: g */
    public final ImageView f69589g;

    private C27400q2(ConstraintLayout constraintLayout, Button button, TextView textView, ImageView imageView) {
        this.f69586d = constraintLayout;
        this.f69587e = button;
        this.f69588f = textView;
        this.f69589g = imageView;
    }

    /* renamed from: a */
    public static C27400q2 m84902a(View view) {
        int i = C10322k.f28837gc;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10322k.reject_information;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                i = C10322k.result_icon;
                ImageView imageView = (ImageView) C6202b.m24689a(view, i);
                if (imageView != null) {
                    return new C27400q2((ConstraintLayout) view, button, textView, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27400q2 m84903d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.cla_rejected_application_action_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84902a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f69586d;
    }
}
