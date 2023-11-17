package o51;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import n51.C37356b;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;

/* renamed from: o51.i */
public final class C37652i implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f90496d;

    /* renamed from: e */
    public final ImageView f90497e;

    /* renamed from: f */
    public final Button f90498f;

    /* renamed from: g */
    public final TextView f90499g;

    private C37652i(ConstraintLayout constraintLayout, ImageView imageView, Button button, TextView textView) {
        this.f90496d = constraintLayout;
        this.f90497e = imageView;
        this.f90498f = button;
        this.f90499g = textView;
    }

    /* renamed from: a */
    public static C37652i m110700a(View view) {
        int i = C37356b.f89821X;
        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
        if (imageView != null) {
            i = C37356b.remove_filter_button;
            Button button = (Button) C6202b.m24689a(view, i);
            if (button != null) {
                i = C37356b.f89813C0;
                TextView textView = (TextView) C6202b.m24689a(view, i);
                if (textView != null) {
                    return new C37652i((ConstraintLayout) view, imageView, button, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f90496d;
    }
}
