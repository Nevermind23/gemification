package z71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.header.statementheader.StatementHeaderView;
import y71.C40031e;

/* renamed from: z71.q */
public final class C40190q implements C6201a {

    /* renamed from: d */
    private final StatementHeaderView f95556d;

    /* renamed from: e */
    public final StatementHeaderView f95557e;

    private C40190q(StatementHeaderView statementHeaderView, StatementHeaderView statementHeaderView2) {
        this.f95556d = statementHeaderView;
        this.f95557e = statementHeaderView2;
    }

    /* renamed from: a */
    public static C40190q m116467a(View view) {
        if (view != null) {
            StatementHeaderView statementHeaderView = (StatementHeaderView) view;
            return new C40190q(statementHeaderView, statementHeaderView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C40190q m116468d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C40031e.item_insurance_details_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m116467a(inflate);
    }

    /* renamed from: c */
    public StatementHeaderView mo3946b() {
        return this.f95556d;
    }
}
