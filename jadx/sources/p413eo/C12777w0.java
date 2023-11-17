package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p356ao.C10114f;
import p356ao.C10115g;

/* renamed from: eo.w0 */
public final class C12777w0 implements C6201a {

    /* renamed from: d */
    private final LayerView f37884d;

    /* renamed from: e */
    public final PageState f37885e;

    /* renamed from: f */
    public final Button f37886f;

    private C12777w0(LayerView layerView, PageState pageState, Button button) {
        this.f37884d = layerView;
        this.f37885e = pageState;
        this.f37886f = button;
    }

    /* renamed from: a */
    public static C12777w0 m48507a(View view) {
        int i = C10114f.f27933O0;
        PageState pageState = (PageState) C6202b.m24689a(view, i);
        if (pageState != null) {
            i = C10114f.f27954f1;
            Button button = (Button) C6202b.m24689a(view, i);
            if (button != null) {
                return new C12777w0((LayerView) view, pageState, button);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12777w0 m48508d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.list_item_application_result_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48507a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f37884d;
    }
}
