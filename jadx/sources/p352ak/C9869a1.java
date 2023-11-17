package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.a1 */
public final class C9869a1 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f26736d;

    /* renamed from: e */
    public final LayerView f26737e;

    /* renamed from: f */
    public final AppCompatTextView f26738f;

    /* renamed from: g */
    public final AppCompatTextView f26739g;

    private C9869a1(LinearLayout linearLayout, LayerView layerView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f26736d = linearLayout;
        this.f26737e = layerView;
        this.f26738f = appCompatTextView;
        this.f26739g = appCompatTextView2;
    }

    /* renamed from: a */
    public static C9869a1 m36200a(View view) {
        int i = C17782g.amount_layer;
        LayerView layerView = (LayerView) C6202b.m24689a(view, i);
        if (layerView != null) {
            i = C17782g.f49703L;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView != null) {
                i = C17782g.f49709N0;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView2 != null) {
                    return new C9869a1((LinearLayout) view, layerView, appCompatTextView, appCompatTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9869a1 m36201d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_button_action_digit, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36200a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f26736d;
    }
}
