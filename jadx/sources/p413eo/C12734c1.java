package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.statisticswidget.StatisticsWidget;
import p356ao.C10115g;

/* renamed from: eo.c1 */
public final class C12734c1 implements C6201a {

    /* renamed from: d */
    private final StatisticsWidget f37689d;

    /* renamed from: e */
    public final StatisticsWidget f37690e;

    private C12734c1(StatisticsWidget statisticsWidget, StatisticsWidget statisticsWidget2) {
        this.f37689d = statisticsWidget;
        this.f37690e = statisticsWidget2;
    }

    /* renamed from: a */
    public static C12734c1 m48329a(View view) {
        if (view != null) {
            StatisticsWidget statisticsWidget = (StatisticsWidget) view;
            return new C12734c1(statisticsWidget, statisticsWidget);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C12734c1 m48330d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.list_item_package_commission, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48329a(inflate);
    }

    /* renamed from: c */
    public StatisticsWidget mo3946b() {
        return this.f37689d;
    }
}
