package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.countdowntimer.CountDownTimerView;

/* renamed from: ua1.p0 */
public final class C28670p0 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f72880d;

    /* renamed from: e */
    public final Button f72881e;

    /* renamed from: f */
    public final RecyclerView f72882f;

    /* renamed from: g */
    public final CountDownTimerView f72883g;

    /* renamed from: h */
    public final TextView f72884h;

    private C28670p0(LinearLayout linearLayout, Button button, RecyclerView recyclerView, CountDownTimerView countDownTimerView, TextView textView) {
        this.f72880d = linearLayout;
        this.f72881e = button;
        this.f72882f = recyclerView;
        this.f72883g = countDownTimerView;
        this.f72884h = textView;
    }

    /* renamed from: a */
    public static C28670p0 m87792a(View view) {
        int i = C10216u.f28295F;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10216u.f28329h2;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
            if (recyclerView != null) {
                i = C10216u.f28321c3;
                CountDownTimerView countDownTimerView = (CountDownTimerView) C6202b.m24689a(view, i);
                if (countDownTimerView != null) {
                    i = C10216u.f28323d3;
                    TextView textView = (TextView) C6202b.m24689a(view, i);
                    if (textView != null) {
                        return new C28670p0((LinearLayout) view, button, recyclerView, countDownTimerView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28670p0 m87793d(LayoutInflater layoutInflater) {
        return m87794e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28670p0 m87794e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.fragment_select, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87792a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f72880d;
    }
}
