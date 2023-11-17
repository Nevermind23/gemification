package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.s0 */
public final class C10009s0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f27489d;

    /* renamed from: e */
    public final TextView f27490e;

    /* renamed from: f */
    public final FrameLayout f27491f;

    /* renamed from: g */
    public final TextView f27492g;

    private C10009s0(ConstraintLayout constraintLayout, TextView textView, FrameLayout frameLayout, TextView textView2) {
        this.f27489d = constraintLayout;
        this.f27490e = textView;
        this.f27491f = frameLayout;
        this.f27492g = textView2;
    }

    /* renamed from: a */
    public static C10009s0 m36711a(View view) {
        int i = C17782g.caption_text;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C17782g.f49731U1;
            FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
            if (frameLayout != null) {
                i = C17782g.f49751c9;
                TextView textView2 = (TextView) C6202b.m24689a(view, i);
                if (textView2 != null) {
                    return new C10009s0((ConstraintLayout) view, textView, frameLayout, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C10009s0 m36712d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_action_sheet_title, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36711a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f27489d;
    }
}
