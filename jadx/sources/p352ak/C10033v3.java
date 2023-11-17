package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.v3 */
public final class C10033v3 implements C6201a {

    /* renamed from: d */
    private final View f27660d;

    /* renamed from: e */
    public final Barrier f27661e;

    /* renamed from: f */
    public final TextView f27662f;

    /* renamed from: g */
    public final LayerView f27663g;

    /* renamed from: h */
    public final AppCompatImageView f27664h;

    /* renamed from: i */
    public final LayerView f27665i;

    /* renamed from: j */
    public final TextView f27666j;

    private C10033v3(View view, Barrier barrier, TextView textView, LayerView layerView, AppCompatImageView appCompatImageView, LayerView layerView2, TextView textView2) {
        this.f27660d = view;
        this.f27661e = barrier;
        this.f27662f = textView;
        this.f27663g = layerView;
        this.f27664h = appCompatImageView;
        this.f27665i = layerView2;
        this.f27666j = textView2;
    }

    /* renamed from: a */
    public static C10033v3 m36800a(View view) {
        int i = C17782g.bottomBarrier;
        Barrier barrier = (Barrier) C6202b.m24689a(view, i);
        if (barrier != null) {
            i = C17782g.f49709N0;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                i = C17782g.f49714O1;
                LayerView layerView = (LayerView) C6202b.m24689a(view, i);
                if (layerView != null) {
                    i = C17782g.inline_feedback_image;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
                    if (appCompatImageView != null) {
                        i = C17782g.interactive_button;
                        LayerView layerView2 = (LayerView) C6202b.m24689a(view, i);
                        if (layerView2 != null) {
                            i = C17782g.interactive_text;
                            TextView textView2 = (TextView) C6202b.m24689a(view, i);
                            if (textView2 != null) {
                                return new C10033v3(view, barrier, textView, layerView, appCompatImageView, layerView2, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C10033v3 m36801c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_interactive_inline_feedback, viewGroup);
            return m36800a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27660d;
    }
}
