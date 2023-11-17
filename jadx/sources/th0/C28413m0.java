package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import oh0.C27011f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.header.statementheader.StatementHeaderView;

/* renamed from: th0.m0 */
public final class C28413m0 implements C6201a {

    /* renamed from: d */
    private final StatementHeaderView f72144d;

    /* renamed from: e */
    public final StatementHeaderView f72145e;

    private C28413m0(StatementHeaderView statementHeaderView, StatementHeaderView statementHeaderView2) {
        this.f72144d = statementHeaderView;
        this.f72145e = statementHeaderView2;
    }

    /* renamed from: a */
    public static C28413m0 m87173a(View view) {
        if (view != null) {
            StatementHeaderView statementHeaderView = (StatementHeaderView) view;
            return new C28413m0(statementHeaderView, statementHeaderView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C28413m0 m87174d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.item_gift_card_statement_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87173a(inflate);
    }

    /* renamed from: c */
    public StatementHeaderView mo3946b() {
        return this.f72144d;
    }
}
