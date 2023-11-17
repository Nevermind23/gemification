package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import oh0.C27010e;
import oh0.C27011f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: th0.m */
public final class C28412m implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f72137d;

    /* renamed from: e */
    public final CardView f72138e;

    /* renamed from: f */
    public final FlexboxLayout f72139f;

    /* renamed from: g */
    public final LayerView f72140g;

    /* renamed from: h */
    public final EmptyWidget f72141h;

    /* renamed from: i */
    public final Button f72142i;

    /* renamed from: j */
    public final Button f72143j;

    private C28412m(ConstraintLayout constraintLayout, CardView cardView, FlexboxLayout flexboxLayout, LayerView layerView, EmptyWidget emptyWidget, Button button, Button button2) {
        this.f72137d = constraintLayout;
        this.f72138e = cardView;
        this.f72139f = flexboxLayout;
        this.f72140g = layerView;
        this.f72141h = emptyWidget;
        this.f72142i = button;
        this.f72143j = button2;
    }

    /* renamed from: a */
    public static C28412m m87169a(View view) {
        int i = C27010e.f67833t;
        CardView cardView = (CardView) C6202b.m24689a(view, i);
        if (cardView != null) {
            i = C27010e.f67797G;
            FlexboxLayout flexboxLayout = (FlexboxLayout) C6202b.m24689a(view, i);
            if (flexboxLayout != null) {
                i = C27010e.f67799H;
                LayerView layerView = (LayerView) C6202b.m24689a(view, i);
                if (layerView != null) {
                    i = C27010e.f67801I;
                    EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
                    if (emptyWidget != null) {
                        i = C27010e.f67822g0;
                        Button button = (Button) C6202b.m24689a(view, i);
                        if (button != null) {
                            i = C27010e.f67795E1;
                            Button button2 = (Button) C6202b.m24689a(view, i);
                            if (button2 != null) {
                                return new C28412m((ConstraintLayout) view, cardView, flexboxLayout, layerView, emptyWidget, button, button2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28412m m87170d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.fragment_gift_cards_filter, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87169a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f72137d;
    }
}
