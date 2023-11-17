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

/* renamed from: ak.e2 */
public final class C9902e2 implements C6201a {

    /* renamed from: d */
    private final View f26929d;

    /* renamed from: e */
    public final AppCompatImageView f26930e;

    /* renamed from: f */
    public final TextView f26931f;

    private C9902e2(View view, AppCompatImageView appCompatImageView, TextView textView) {
        this.f26929d = view;
        this.f26930e = appCompatImageView;
        this.f26931f = textView;
    }

    /* renamed from: a */
    public static C9902e2 m36321a(View view) {
        int i = C17782g.change_indicator_image;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C17782g.change_text;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                return new C9902e2(view, appCompatImageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9902e2 m36322c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_change_badge, viewGroup);
            return m36321a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f26929d;
    }
}
