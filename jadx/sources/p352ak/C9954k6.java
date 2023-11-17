package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.k6 */
public final class C9954k6 implements C6201a {

    /* renamed from: d */
    private final View f27216d;

    /* renamed from: e */
    public final AppCompatImageView f27217e;

    /* renamed from: f */
    public final TextView f27218f;

    private C9954k6(View view, AppCompatImageView appCompatImageView, TextView textView) {
        this.f27216d = view;
        this.f27217e = appCompatImageView;
        this.f27218f = textView;
    }

    /* renamed from: a */
    public static C9954k6 m36507a(View view) {
        int i = C17782g.f49741W8;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C17782g.timer_text_view;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                return new C9954k6(view, appCompatImageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9954k6 m36508c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_timer, viewGroup);
            return m36507a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27216d;
    }
}
