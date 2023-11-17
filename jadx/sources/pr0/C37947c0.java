package pr0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import lr0.C37130e;
import lr0.C37131f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttonlist.ButtonListView;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: pr0.c0 */
public final class C37947c0 implements C6201a {

    /* renamed from: d */
    private final LayerView f91096d;

    /* renamed from: e */
    public final View f91097e;

    /* renamed from: f */
    public final ButtonListView f91098f;

    /* renamed from: g */
    public final RecyclerView f91099g;

    /* renamed from: h */
    public final RecyclerView f91100h;

    /* renamed from: i */
    public final ButtonListView f91101i;

    /* renamed from: j */
    public final EmptyWidget f91102j;

    private C37947c0(LayerView layerView, View view, ButtonListView buttonListView, RecyclerView recyclerView, RecyclerView recyclerView2, ButtonListView buttonListView2, EmptyWidget emptyWidget) {
        this.f91096d = layerView;
        this.f91097e = view;
        this.f91098f = buttonListView;
        this.f91099g = recyclerView;
        this.f91100h = recyclerView2;
        this.f91101i = buttonListView2;
        this.f91102j = emptyWidget;
    }

    /* renamed from: a */
    public static C37947c0 m111531a(View view) {
        int i = C37130e.f89420E;
        View a = C6202b.m24689a(view, i);
        if (a != null) {
            i = C37130e.next_payment;
            ButtonListView buttonListView = (ButtonListView) C6202b.m24689a(view, i);
            if (buttonListView != null) {
                i = C37130e.next_payment_details;
                RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
                if (recyclerView != null) {
                    i = C37130e.prev_payment_details;
                    RecyclerView recyclerView2 = (RecyclerView) C6202b.m24689a(view, i);
                    if (recyclerView2 != null) {
                        i = C37130e.previous_payment;
                        ButtonListView buttonListView2 = (ButtonListView) C6202b.m24689a(view, i);
                        if (buttonListView2 != null) {
                            i = C37130e.f89449v1;
                            EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
                            if (emptyWidget != null) {
                                return new C37947c0((LayerView) view, a, buttonListView, recyclerView, recyclerView2, buttonListView2, emptyWidget);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C37947c0 m111532d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37131f.item_schedule_and_history, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111531a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f91096d;
    }
}
