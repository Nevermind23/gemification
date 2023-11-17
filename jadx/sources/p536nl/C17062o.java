package p536nl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p480jl.C16213d;
import p480jl.C16214e;

/* renamed from: nl.o */
public final class C17062o implements C6201a {

    /* renamed from: d */
    private final LayerView f47661d;

    /* renamed from: e */
    public final Button f47662e;

    /* renamed from: f */
    public final Button f47663f;

    /* renamed from: g */
    public final Button f47664g;

    /* renamed from: h */
    public final Button f47665h;

    private C17062o(LayerView layerView, Button button, Button button2, Button button3, Button button4) {
        this.f47661d = layerView;
        this.f47662e = button;
        this.f47663f = button2;
        this.f47664g = button3;
        this.f47665h = button4;
    }

    /* renamed from: a */
    public static C17062o m59954a(View view) {
        int i = C16213d.f45747m;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C16213d.payment;
            Button button2 = (Button) C6202b.m24689a(view, i);
            if (button2 != null) {
                i = C16213d.pre_payment;
                Button button3 = (Button) C6202b.m24689a(view, i);
                if (button3 != null) {
                    i = C16213d.statement;
                    Button button4 = (Button) C6202b.m24689a(view, i);
                    if (button4 != null) {
                        return new C17062o((LayerView) view, button, button2, button3, button4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C17062o m59955d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16214e.item_bnpl_operation_buttons, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m59954a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f47661d;
    }
}
