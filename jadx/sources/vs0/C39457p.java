package vs0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;
import rs0.C38336c;
import rs0.C38337d;

/* renamed from: vs0.p */
public final class C39457p implements C6201a {

    /* renamed from: d */
    private final ListItem f93834d;

    /* renamed from: e */
    public final SingleLineTextItem f93835e;

    private C39457p(ListItem listItem, SingleLineTextItem singleLineTextItem) {
        this.f93834d = listItem;
        this.f93835e = singleLineTextItem;
    }

    /* renamed from: a */
    public static C39457p m114683a(View view) {
        int i = C38336c.f91868c;
        SingleLineTextItem singleLineTextItem = (SingleLineTextItem) C6202b.m24689a(view, i);
        if (singleLineTextItem != null) {
            return new C39457p((ListItem) view, singleLineTextItem);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C39457p m114684d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C38337d.item_piggy_bank_details_accounts, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m114683a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f93834d;
    }
}
