package p481jm;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p411em.C12488e;

/* renamed from: jm.e0 */
public final class C16225e0 implements C6201a {

    /* renamed from: d */
    private final LayerView f45794d;

    /* renamed from: e */
    public final EmptyWidget f45795e;

    /* renamed from: f */
    public final RecyclerView f45796f;

    /* renamed from: g */
    public final InlineFeedback f45797g;

    private C16225e0(LayerView layerView, EmptyWidget emptyWidget, RecyclerView recyclerView, InlineFeedback inlineFeedback) {
        this.f45794d = layerView;
        this.f45795e = emptyWidget;
        this.f45796f = recyclerView;
        this.f45797g = inlineFeedback;
    }

    /* renamed from: a */
    public static C16225e0 m57828a(View view) {
        int i = C12488e.f37208l0;
        EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
        if (emptyWidget != null) {
            i = C12488e.f37211m0;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
            if (recyclerView != null) {
                i = C12488e.f37224w0;
                InlineFeedback inlineFeedback = (InlineFeedback) C6202b.m24689a(view, i);
                if (inlineFeedback != null) {
                    return new C16225e0((LayerView) view, emptyWidget, recyclerView, inlineFeedback);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f45794d;
    }
}
