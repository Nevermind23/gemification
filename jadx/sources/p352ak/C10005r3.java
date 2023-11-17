package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.input.BogEditText;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.r3 */
public final class C10005r3 implements C6201a {

    /* renamed from: d */
    private final View f27463d;

    /* renamed from: e */
    public final TextView f27464e;

    /* renamed from: f */
    public final Space f27465f;

    /* renamed from: g */
    public final TextView f27466g;

    /* renamed from: h */
    public final LayerView f27467h;

    /* renamed from: i */
    public final BogEditText f27468i;

    /* renamed from: j */
    public final FrameLayout f27469j;

    private C10005r3(View view, TextView textView, Space space, TextView textView2, LayerView layerView, BogEditText bogEditText, FrameLayout frameLayout) {
        this.f27463d = view;
        this.f27464e = textView;
        this.f27465f = space;
        this.f27466g = textView2;
        this.f27467h = layerView;
        this.f27468i = bogEditText;
        this.f27469j = frameLayout;
    }

    /* renamed from: a */
    public static C10005r3 m36696a(View view) {
        int i = C17782g.f49729T3;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C17782g.info_space;
            Space space = (Space) C6202b.m24689a(view, i);
            if (space != null) {
                i = C17782g.f49716O4;
                TextView textView2 = (TextView) C6202b.m24689a(view, i);
                if (textView2 != null) {
                    i = C17782g.f49765i5;
                    LayerView layerView = (LayerView) C6202b.m24689a(view, i);
                    if (layerView != null) {
                        i = C17782g.text_input;
                        BogEditText bogEditText = (BogEditText) C6202b.m24689a(view, i);
                        if (bogEditText != null) {
                            i = C17782g.text_input_layout;
                            FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
                            if (frameLayout != null) {
                                return new C10005r3(view, textView, space, textView2, layerView, bogEditText, frameLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C10005r3 m36697c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_input_dynamic, viewGroup);
            return m36696a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27463d;
    }
}
