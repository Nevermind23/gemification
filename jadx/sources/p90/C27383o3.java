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

/* renamed from: p90.o3 */
public final class C27383o3 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f69456d;

    /* renamed from: e */
    public final LayerView f69457e;

    /* renamed from: f */
    public final TextView f69458f;

    /* renamed from: g */
    public final LayerView f69459g;

    /* renamed from: h */
    public final PageDescriptionView f69460h;

    /* renamed from: i */
    public final Button f69461i;

    /* renamed from: j */
    public final ScrollViewExt f69462j;

    private C27383o3(ConstraintLayout constraintLayout, LayerView layerView, TextView textView, LayerView layerView2, PageDescriptionView pageDescriptionView, Button button, ScrollViewExt scrollViewExt) {
        this.f69456d = constraintLayout;
        this.f69457e = layerView;
        this.f69458f = textView;
        this.f69459g = layerView2;
        this.f69460h = pageDescriptionView;
        this.f69461i = button;
        this.f69462j = scrollViewExt;
    }

    /* renamed from: a */
    public static C27383o3 m84836a(View view) {
        int i = C10322k.arrow_container;
        LayerView layerView = (LayerView) C6202b.m24689a(view, i);
        if (layerView != null) {
            i = C10322k.deny_text;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                i = C10322k.f28828eb;
                LayerView layerView2 = (LayerView) C6202b.m24689a(view, i);
                if (layerView2 != null) {
                    i = C10322k.f28874no;
                    PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
                    if (pageDescriptionView != null) {
                        i = C10322k.receive_remittance;
                        Button button = (Button) C6202b.m24689a(view, i);
                        if (button != null) {
                            i = C10322k.f28754It;
                            ScrollViewExt scrollViewExt = (ScrollViewExt) C6202b.m24689a(view, i);
                            if (scrollViewExt != null) {
                                return new C27383o3((ConstraintLayout) view, layerView, textView, layerView2, pageDescriptionView, button, scrollViewExt);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27383o3 m84837d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.fragment_deny_contract, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84836a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f69456d;
    }
}
