package pr0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import lr0.C37131f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.header.statementheader.StatementHeaderView;

/* renamed from: pr0.u */
public final class C37970u implements C6201a {

    /* renamed from: d */
    private final StatementHeaderView f91265d;

    /* renamed from: e */
    public final StatementHeaderView f91266e;

    private C37970u(StatementHeaderView statementHeaderView, StatementHeaderView statementHeaderView2) {
        this.f91265d = statementHeaderView;
        this.f91266e = statementHeaderView2;
    }

    /* renamed from: a */
    public static C37970u m111625a(View view) {
        if (view != null) {
            StatementHeaderView statementHeaderView = (StatementHeaderView) view;
            return new C37970u(statementHeaderView, statementHeaderView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C37970u m111626d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37131f.item_loan_schedule_history_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111625a(inflate);
    }

    /* renamed from: c */
    public StatementHeaderView mo3946b() {
        return this.f91265d;
    }
}
