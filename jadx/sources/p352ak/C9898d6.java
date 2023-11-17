package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.d6 */
public final class C9898d6 implements C6201a {

    /* renamed from: d */
    private final LayerView f26915d;

    /* renamed from: e */
    public final TextView f26916e;

    /* renamed from: f */
    public final AppCompatTextView f26917f;

    /* renamed from: g */
    public final TextView f26918g;

    /* renamed from: h */
    public final TextView f26919h;

    /* renamed from: i */
    public final TextView f26920i;

    private C9898d6(LayerView layerView, TextView textView, AppCompatTextView appCompatTextView, TextView textView2, TextView textView3, TextView textView4) {
        this.f26915d = layerView;
        this.f26916e = textView;
        this.f26917f = appCompatTextView;
        this.f26918g = textView2;
        this.f26919h = textView3;
        this.f26920i = textView4;
    }

    /* renamed from: a */
    public static C9898d6 m36305a(View view) {
        int i = C17782g.line1_text;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C17782g.line2_text;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView != null) {
                i = C17782g.line3_text1;
                TextView textView2 = (TextView) C6202b.m24689a(view, i);
                if (textView2 != null) {
                    i = C17782g.line3_text2;
                    TextView textView3 = (TextView) C6202b.m24689a(view, i);
                    if (textView3 != null) {
                        i = C17782g.line4_text;
                        TextView textView4 = (TextView) C6202b.m24689a(view, i);
                        if (textView4 != null) {
                            return new C9898d6((LayerView) view, textView, appCompatTextView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9898d6 m36306d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_text_selector_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36305a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f26915d;
    }
}
