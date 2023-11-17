package p541oc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import p086g1.C6201a;
import p485kc.C16347e;
import p485kc.C16348f;

/* renamed from: oc.k */
public final class C17157k implements C6201a {

    /* renamed from: d */
    private final RelativeLayout f48070d;

    /* renamed from: e */
    public final ImageView f48071e;

    /* renamed from: f */
    public final TextView f48072f;

    private C17157k(RelativeLayout relativeLayout, ImageView imageView, TextView textView) {
        this.f48070d = relativeLayout;
        this.f48071e = imageView;
        this.f48072f = textView;
    }

    /* renamed from: a */
    public static C17157k m60273a(View view) {
        int i = C16347e.f46184T;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = C16347e.f46187c1;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                return new C17157k((RelativeLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C17157k m60274d(LayoutInflater layoutInflater) {
        return m60275e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C17157k m60275e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16348f.fragment_instruction_identomat, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m60273a(inflate);
    }

    /* renamed from: c */
    public RelativeLayout mo3946b() {
        return this.f48070d;
    }
}
