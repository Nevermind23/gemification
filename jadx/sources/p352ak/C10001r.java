package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.r */
public final class C10001r implements C6201a {

    /* renamed from: d */
    private final View f27438d;

    /* renamed from: e */
    public final AppCompatImageView f27439e;

    /* renamed from: f */
    public final AppCompatTextView f27440f;

    private C10001r(View view, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView) {
        this.f27438d = view;
        this.f27439e = appCompatImageView;
        this.f27440f = appCompatTextView;
    }

    /* renamed from: a */
    public static C10001r m36681a(View view) {
        int i = C17782g.status_list_item_image;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C17782g.status_list_item_text;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView != null) {
                return new C10001r(view, appCompatImageView, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C10001r m36682c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.item_status_list, viewGroup);
            return m36681a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27438d;
    }
}
