package g71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import c71.C31284d;
import c71.C31285e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.header.statementheader.StatementHeaderView;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;

/* renamed from: g71.j */
public final class C32117j implements C6201a {

    /* renamed from: d */
    private final ScrollView f79013d;

    /* renamed from: e */
    public final TwoLineTextItem f79014e;

    /* renamed from: f */
    public final EmptyWidget f79015f;

    /* renamed from: g */
    public final TwoLineTextItem f79016g;

    /* renamed from: h */
    public final TwoLineTextItem f79017h;

    /* renamed from: i */
    public final StatementHeaderView f79018i;

    /* renamed from: j */
    public final TextView f79019j;

    /* renamed from: k */
    public final TwoLineTextItem f79020k;

    /* renamed from: l */
    public final TwoLineTextItem f79021l;

    private C32117j(ScrollView scrollView, TwoLineTextItem twoLineTextItem, EmptyWidget emptyWidget, TwoLineTextItem twoLineTextItem2, TwoLineTextItem twoLineTextItem3, StatementHeaderView statementHeaderView, TextView textView, TwoLineTextItem twoLineTextItem4, TwoLineTextItem twoLineTextItem5) {
        this.f79013d = scrollView;
        this.f79014e = twoLineTextItem;
        this.f79015f = emptyWidget;
        this.f79016g = twoLineTextItem2;
        this.f79017h = twoLineTextItem3;
        this.f79018i = statementHeaderView;
        this.f79019j = textView;
        this.f79020k = twoLineTextItem4;
        this.f79021l = twoLineTextItem5;
    }

    /* renamed from: a */
    public static C32117j m94601a(View view) {
        int i = C31284d.tc_activation_date;
        TwoLineTextItem twoLineTextItem = (TwoLineTextItem) C6202b.m24689a(view, i);
        if (twoLineTextItem != null) {
            i = C31284d.tc_emptyWidget_2;
            EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
            if (emptyWidget != null) {
                i = C31284d.tc_end_date;
                TwoLineTextItem twoLineTextItem2 = (TwoLineTextItem) C6202b.m24689a(view, i);
                if (twoLineTextItem2 != null) {
                    i = C31284d.tc_pass_type;
                    TwoLineTextItem twoLineTextItem3 = (TwoLineTextItem) C6202b.m24689a(view, i);
                    if (twoLineTextItem3 != null) {
                        i = C31284d.tc_success_header;
                        StatementHeaderView statementHeaderView = (StatementHeaderView) C6202b.m24689a(view, i);
                        if (statementHeaderView != null) {
                            i = C31284d.transport_card_last_four_digit;
                            TextView textView = (TextView) C6202b.m24689a(view, i);
                            if (textView != null) {
                                i = C31284d.transport_card_pass_type;
                                TwoLineTextItem twoLineTextItem4 = (TwoLineTextItem) C6202b.m24689a(view, i);
                                if (twoLineTextItem4 != null) {
                                    i = C31284d.transport_card_price;
                                    TwoLineTextItem twoLineTextItem5 = (TwoLineTextItem) C6202b.m24689a(view, i);
                                    if (twoLineTextItem5 != null) {
                                        return new C32117j((ScrollView) view, twoLineTextItem, emptyWidget, twoLineTextItem2, twoLineTextItem3, statementHeaderView, textView, twoLineTextItem4, twoLineTextItem5);
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
    public static C32117j m94602d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31285e.fragment_success_transport_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94601a(inflate);
    }

    /* renamed from: c */
    public ScrollView mo3946b() {
        return this.f79013d;
    }
}
