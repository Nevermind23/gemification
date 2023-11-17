package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.input.BogEditText;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.t3 */
public final class C10019t3 implements C6201a {

    /* renamed from: d */
    private final View f27583d;

    /* renamed from: e */
    public final TextView f27584e;

    /* renamed from: f */
    public final LayerView f27585f;

    /* renamed from: g */
    public final BogEditText f27586g;

    private C10019t3(View view, TextView textView, LayerView layerView, BogEditText bogEditText) {
        this.f27583d = view;
        this.f27584e = textView;
        this.f27585f = layerView;
        this.f27586g = bogEditText;
    }

    /* renamed from: a */
    public static C10019t3 m36748a(View view) {
        int i = C17782g.f49716O4;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C17782g.f49765i5;
            LayerView layerView = (LayerView) C6202b.m24689a(view, i);
            if (layerView != null) {
                i = C17782g.text_input;
                BogEditText bogEditText = (BogEditText) C6202b.m24689a(view, i);
                if (bogEditText != null) {
                    return new C10019t3(view, textView, layerView, bogEditText);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C10019t3 m36749c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_input_small, viewGroup);
            return m36748a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27583d;
    }
}
