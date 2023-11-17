package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewpager2.widget.ViewPager2;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.c3 */
public final class C9887c3 implements C6201a {

    /* renamed from: d */
    private final View f26845d;

    /* renamed from: e */
    public final TextView f26846e;

    /* renamed from: f */
    public final TextView f26847f;

    /* renamed from: g */
    public final Guideline f26848g;

    /* renamed from: h */
    public final TextView f26849h;

    /* renamed from: i */
    public final TextView f26850i;

    /* renamed from: j */
    public final Barrier f26851j;

    /* renamed from: k */
    public final ConstraintLayout f26852k;

    /* renamed from: l */
    public final Button f26853l;

    /* renamed from: m */
    public final FrameLayout f26854m;

    /* renamed from: n */
    public final ViewPager2 f26855n;

    private C9887c3(View view, TextView textView, TextView textView2, Guideline guideline, TextView textView3, TextView textView4, Barrier barrier, ConstraintLayout constraintLayout, Button button, FrameLayout frameLayout, ViewPager2 viewPager2) {
        this.f26845d = view;
        this.f26846e = textView;
        this.f26847f = textView2;
        this.f26848g = guideline;
        this.f26849h = textView3;
        this.f26850i = textView4;
        this.f26851j = barrier;
        this.f26852k = constraintLayout;
        this.f26853l = button;
        this.f26854m = frameLayout;
        this.f26855n = viewPager2;
    }

    /* renamed from: a */
    public static C9887c3 m36265a(View view) {
        int i = C17782g.annual_interest_rate_text;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C17782g.f49717P;
            TextView textView2 = (TextView) C6202b.m24689a(view, i);
            if (textView2 != null) {
                i = C17782g.f49775o1;
                Guideline guideline = (Guideline) C6202b.m24689a(view, i);
                if (guideline != null) {
                    i = C17782g.effective_interest_rate_text;
                    TextView textView3 = (TextView) C6202b.m24689a(view, i);
                    if (textView3 != null) {
                        i = C17782g.f49738W2;
                        TextView textView4 = (TextView) C6202b.m24689a(view, i);
                        if (textView4 != null) {
                            i = C17782g.interest_rate_bottom_barrier;
                            Barrier barrier = (Barrier) C6202b.m24689a(view, i);
                            if (barrier != null) {
                                i = C17782g.f49753d5;
                                ConstraintLayout constraintLayout = (ConstraintLayout) C6202b.m24689a(view, i);
                                if (constraintLayout != null) {
                                    i = C17782g.f49700K5;
                                    Button button = (Button) C6202b.m24689a(view, i);
                                    if (button != null) {
                                        i = C17782g.f49679C6;
                                        FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
                                        if (frameLayout != null) {
                                            i = C17782g.f49707M9;
                                            ViewPager2 viewPager2 = (ViewPager2) C6202b.m24689a(view, i);
                                            if (viewPager2 != null) {
                                                return new C9887c3(view, textView, textView2, guideline, textView3, textView4, barrier, constraintLayout, button, frameLayout, viewPager2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9887c3 m36266c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_deposit_header, viewGroup);
            return m36265a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f26845d;
    }
}
