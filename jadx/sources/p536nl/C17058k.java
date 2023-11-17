package p536nl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p480jl.C16213d;
import p480jl.C16214e;

/* renamed from: nl.k */
public final class C17058k implements C6201a {

    /* renamed from: d */
    private final LayerView f47644d;

    /* renamed from: e */
    public final TwoLineTextItem f47645e;

    /* renamed from: f */
    public final TwoLineTextItem f47646f;

    /* renamed from: g */
    public final TwoLineTextItem f47647g;

    /* renamed from: h */
    public final TwoLineTextItem f47648h;

    /* renamed from: i */
    public final Button f47649i;

    /* renamed from: j */
    public final ActionSheetTitle f47650j;

    private C17058k(LayerView layerView, TwoLineTextItem twoLineTextItem, TwoLineTextItem twoLineTextItem2, TwoLineTextItem twoLineTextItem3, TwoLineTextItem twoLineTextItem4, Button button, ActionSheetTitle actionSheetTitle) {
        this.f47644d = layerView;
        this.f47645e = twoLineTextItem;
        this.f47646f = twoLineTextItem2;
        this.f47647g = twoLineTextItem3;
        this.f47648h = twoLineTextItem4;
        this.f47649i = button;
        this.f47650j = actionSheetTitle;
    }

    /* renamed from: a */
    public static C17058k m59938a(View view) {
        int i = C16213d.bnpl_name;
        TwoLineTextItem twoLineTextItem = (TwoLineTextItem) C6202b.m24689a(view, i);
        if (twoLineTextItem != null) {
            i = C16213d.bnpl_next_pay;
            TwoLineTextItem twoLineTextItem2 = (TwoLineTextItem) C6202b.m24689a(view, i);
            if (twoLineTextItem2 != null) {
                i = C16213d.bnpl_total;
                TwoLineTextItem twoLineTextItem3 = (TwoLineTextItem) C6202b.m24689a(view, i);
                if (twoLineTextItem3 != null) {
                    i = C16213d.bnpl_type;
                    TwoLineTextItem twoLineTextItem4 = (TwoLineTextItem) C6202b.m24689a(view, i);
                    if (twoLineTextItem4 != null) {
                        i = C16213d.edit_name;
                        Button button = (Button) C6202b.m24689a(view, i);
                        if (button != null) {
                            i = C16213d.f45722C0;
                            ActionSheetTitle actionSheetTitle = (ActionSheetTitle) C6202b.m24689a(view, i);
                            if (actionSheetTitle != null) {
                                return new C17058k((LayerView) view, twoLineTextItem, twoLineTextItem2, twoLineTextItem3, twoLineTextItem4, button, actionSheetTitle);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C17058k m59939d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16214e.item_bnpl_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m59938a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f47644d;
    }
}
