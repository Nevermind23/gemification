package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.l6 */
public final class C27359l6 implements C6201a {

    /* renamed from: d */
    private final LinearLayoutCompat f69250d;

    /* renamed from: e */
    public final Button f69251e;

    /* renamed from: f */
    public final TwoLineTextItem f69252f;

    private C27359l6(LinearLayoutCompat linearLayoutCompat, Button button, TwoLineTextItem twoLineTextItem) {
        this.f69250d = linearLayoutCompat;
        this.f69251e = button;
        this.f69252f = twoLineTextItem;
    }

    /* renamed from: a */
    public static C27359l6 m84745a(View view) {
        int i = C10322k.f28794Tu;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10322k.f28910xA;
            TwoLineTextItem twoLineTextItem = (TwoLineTextItem) C6202b.m24689a(view, i);
            if (twoLineTextItem != null) {
                return new C27359l6((LinearLayoutCompat) view, button, twoLineTextItem);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27359l6 m84746d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_statement_details_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84745a(inflate);
    }

    /* renamed from: c */
    public LinearLayoutCompat mo3946b() {
        return this.f69250d;
    }
}
