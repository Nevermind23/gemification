package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.p975ui.components.ripplepulse.ScrollViewExt;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.n3 */
public final class C27374n3 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f69370d;

    /* renamed from: e */
    public final LayerView f69371e;

    /* renamed from: f */
    public final Button f69372f;

    /* renamed from: g */
    public final TextView f69373g;

    /* renamed from: h */
    public final Button f69374h;

    /* renamed from: i */
    public final LayerView f69375i;

    /* renamed from: j */
    public final PageDescriptionView f69376j;

    /* renamed from: k */
    public final ScrollViewExt f69377k;

    /* renamed from: l */
    public final LayerView f69378l;

    private C27374n3(ConstraintLayout constraintLayout, LayerView layerView, Button button, TextView textView, Button button2, LayerView layerView2, PageDescriptionView pageDescriptionView, ScrollViewExt scrollViewExt, LayerView layerView3) {
        this.f69370d = constraintLayout;
        this.f69371e = layerView;
        this.f69372f = button;
        this.f69373g = textView;
        this.f69374h = button2;
        this.f69375i = layerView2;
        this.f69376j = pageDescriptionView;
        this.f69377k = scrollViewExt;
        this.f69378l = layerView3;
    }

    /* renamed from: a */
    public static C27374n3 m84803a(View view) {
        int i = C10322k.arrow_container;
        LayerView layerView = (LayerView) C6202b.m24689a(view, i);
        if (layerView != null) {
            i = C10322k.confirm;
            Button button = (Button) C6202b.m24689a(view, i);
            if (button != null) {
                i = C10322k.confirmation_text;
                TextView textView = (TextView) C6202b.m24689a(view, i);
                if (textView != null) {
                    i = C10322k.deny;
                    Button button2 = (Button) C6202b.m24689a(view, i);
                    if (button2 != null) {
                        i = C10322k.f28828eb;
                        LayerView layerView2 = (LayerView) C6202b.m24689a(view, i);
                        if (layerView2 != null) {
                            i = C10322k.f28874no;
                            PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
                            if (pageDescriptionView != null) {
                                i = C10322k.f28754It;
                                ScrollViewExt scrollViewExt = (ScrollViewExt) C6202b.m24689a(view, i);
                                if (scrollViewExt != null) {
                                    i = C10322k.web_layer;
                                    LayerView layerView3 = (LayerView) C6202b.m24689a(view, i);
                                    if (layerView3 != null) {
                                        return new C27374n3((ConstraintLayout) view, layerView, button, textView, button2, layerView2, pageDescriptionView, scrollViewExt, layerView3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27374n3 m84804d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.fragment_confirmation_contract, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84803a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f69370d;
    }
}
