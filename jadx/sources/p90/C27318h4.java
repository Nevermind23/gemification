package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.biginput.BigInputView;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.h4 */
public final class C27318h4 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f68877d;

    /* renamed from: e */
    public final BigInputView f68878e;

    /* renamed from: f */
    public final LinearLayout f68879f;

    /* renamed from: g */
    public final Button f68880g;

    /* renamed from: h */
    public final TextView f68881h;

    /* renamed from: i */
    public final TextView f68882i;

    /* renamed from: j */
    public final PageState f68883j;

    /* renamed from: k */
    public final LinearLayout f68884k;

    private C27318h4(ConstraintLayout constraintLayout, BigInputView bigInputView, LinearLayout linearLayout, Button button, TextView textView, TextView textView2, PageState pageState, LinearLayout linearLayout2) {
        this.f68877d = constraintLayout;
        this.f68878e = bigInputView;
        this.f68879f = linearLayout;
        this.f68880g = button;
        this.f68881h = textView;
        this.f68882i = textView2;
        this.f68883j = pageState;
        this.f68884k = linearLayout2;
    }

    /* renamed from: a */
    public static C27318h4 m84580a(View view) {
        int i = C10322k.f28876oh;
        BigInputView bigInputView = (BigInputView) C6202b.m24689a(view, i);
        if (bigInputView != null) {
            i = C10322k.input_layout;
            LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
            if (linearLayout != null) {
                i = C10322k.promo_code_passive_activation_btn;
                Button button = (Button) C6202b.m24689a(view, i);
                if (button != null) {
                    i = C10322k.promo_code_passive_promise_text;
                    TextView textView = (TextView) C6202b.m24689a(view, i);
                    if (textView != null) {
                        i = C10322k.promo_code_passive_title;
                        TextView textView2 = (TextView) C6202b.m24689a(view, i);
                        if (textView2 != null) {
                            i = C10322k.f28901uw;
                            PageState pageState = (PageState) C6202b.m24689a(view, i);
                            if (pageState != null) {
                                i = C10322k.texts_layout;
                                LinearLayout linearLayout2 = (LinearLayout) C6202b.m24689a(view, i);
                                if (linearLayout2 != null) {
                                    return new C27318h4((ConstraintLayout) view, bigInputView, linearLayout, button, textView, textView2, pageState, linearLayout2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27318h4 m84581d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.fragment_referals_passive, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84580a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f68877d;
    }
}
