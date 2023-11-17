package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.biginput.BigInputView;
import p341ge.bog.designsystem.components.buttons.Button;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.g4 */
public final class C27308g4 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f68814d;

    /* renamed from: e */
    public final TextView f68815e;

    /* renamed from: f */
    public final BigInputView f68816f;

    /* renamed from: g */
    public final Button f68817g;

    /* renamed from: h */
    public final TextView f68818h;

    private C27308g4(ConstraintLayout constraintLayout, TextView textView, BigInputView bigInputView, Button button, TextView textView2) {
        this.f68814d = constraintLayout;
        this.f68815e = textView;
        this.f68816f = bigInputView;
        this.f68817g = button;
        this.f68818h = textView2;
    }

    /* renamed from: a */
    public static C27308g4 m84541a(View view) {
        int i = C10322k.f28813Za;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C10322k.f28876oh;
            BigInputView bigInputView = (BigInputView) C6202b.m24689a(view, i);
            if (bigInputView != null) {
                i = C10322k.f28794Tu;
                Button button = (Button) C6202b.m24689a(view, i);
                if (button != null) {
                    i = C10322k.f28721Dx;
                    TextView textView2 = (TextView) C6202b.m24689a(view, i);
                    if (textView2 != null) {
                        return new C27308g4((ConstraintLayout) view, textView, bigInputView, button, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27308g4 m84542d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.fragment_referals_active, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84541a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f68814d;
    }
}
