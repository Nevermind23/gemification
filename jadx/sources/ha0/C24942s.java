package ha0;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import da0.C19951e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;

/* renamed from: ha0.s */
public final class C24942s implements C6201a {

    /* renamed from: d */
    private final LinearLayout f64239d;

    /* renamed from: e */
    public final Button f64240e;

    /* renamed from: f */
    public final TextView f64241f;

    private C24942s(LinearLayout linearLayout, Button button, TextView textView) {
        this.f64239d = linearLayout;
        this.f64240e = button;
        this.f64241f = textView;
    }

    /* renamed from: a */
    public static C24942s m79750a(View view) {
        int i = C19951e.error_retry_button;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C19951e.error_title_text;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                return new C24942s((LinearLayout) view, button, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f64239d;
    }
}
