package p90;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p366bk.C10322k;

/* renamed from: p90.l0 */
public final class C27353l0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f69193d;

    /* renamed from: e */
    public final View f69194e;

    /* renamed from: f */
    public final Button f69195f;

    /* renamed from: g */
    public final ImageView f69196g;

    /* renamed from: h */
    public final TextView f69197h;

    /* renamed from: i */
    public final ConstraintLayout f69198i;

    /* renamed from: j */
    public final C27272c8 f69199j;

    private C27353l0(ConstraintLayout constraintLayout, View view, Button button, ImageView imageView, TextView textView, ConstraintLayout constraintLayout2, C27272c8 c8Var) {
        this.f69193d = constraintLayout;
        this.f69194e = view;
        this.f69195f = button;
        this.f69196g = imageView;
        this.f69197h = textView;
        this.f69198i = constraintLayout2;
        this.f69199j = c8Var;
    }

    /* renamed from: a */
    public static C27353l0 m84720a(View view) {
        int i = C10322k.f28850jc;
        View a = C6202b.m24689a(view, i);
        if (a != null) {
            i = C10322k.f28881pg;
            Button button = (Button) C6202b.m24689a(view, i);
            if (button != null) {
                i = C10322k.result_image;
                ImageView imageView = (ImageView) C6202b.m24689a(view, i);
                if (imageView != null) {
                    i = C10322k.result_title;
                    TextView textView = (TextView) C6202b.m24689a(view, i);
                    if (textView != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i = C10322k.f28730Ex;
                        View a2 = C6202b.m24689a(view, i);
                        if (a2 != null) {
                            return new C27353l0(constraintLayout, a, button, imageView, textView, constraintLayout, C27272c8.m84388a(a2));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f69193d;
    }
}
