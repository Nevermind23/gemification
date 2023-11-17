package ap0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import wo0.C18652b;
import wo0.C18653c;

/* renamed from: ap0.c */
public final class C10130c implements C6201a {

    /* renamed from: d */
    private final LinearLayout f28055d;

    /* renamed from: e */
    public final Button f28056e;

    /* renamed from: f */
    public final PageDescriptionView f28057f;

    /* renamed from: g */
    public final TextView f28058g;

    /* renamed from: h */
    public final TextView f28059h;

    /* renamed from: i */
    public final TextView f28060i;

    private C10130c(LinearLayout linearLayout, Button button, PageDescriptionView pageDescriptionView, TextView textView, TextView textView2, TextView textView3) {
        this.f28055d = linearLayout;
        this.f28056e = button;
        this.f28057f = pageDescriptionView;
        this.f28058g = textView;
        this.f28059h = textView2;
        this.f28060i = textView3;
    }

    /* renamed from: a */
    public static C10130c m37048a(View view) {
        int i = C18652b.btn_close;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C18652b.f52246T;
            PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
            if (pageDescriptionView != null) {
                i = C18652b.text_bullets_description_1;
                TextView textView = (TextView) C6202b.m24689a(view, i);
                if (textView != null) {
                    i = C18652b.text_bullets_description_2;
                    TextView textView2 = (TextView) C6202b.m24689a(view, i);
                    if (textView2 != null) {
                        i = C18652b.text_bullets_description_3;
                        TextView textView3 = (TextView) C6202b.m24689a(view, i);
                        if (textView3 != null) {
                            return new C10130c((LinearLayout) view, button, pageDescriptionView, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C10130c m37049d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C18653c.fragment_p2p_help, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m37048a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f28055d;
    }
}
