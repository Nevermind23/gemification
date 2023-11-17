package vs0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;
import rs0.C38336c;
import rs0.C38337d;

/* renamed from: vs0.r */
public final class C39459r implements C6201a {

    /* renamed from: d */
    private final ListItem f93839d;

    /* renamed from: e */
    public final AppCompatTextView f93840e;

    /* renamed from: f */
    public final AppCompatTextView f93841f;

    private C39459r(ListItem listItem, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f93839d = listItem;
        this.f93840e = appCompatTextView;
        this.f93841f = appCompatTextView2;
    }

    /* renamed from: a */
    public static C39459r m114691a(View view) {
        int i = C38336c.f91890s;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C38336c.month_label;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView2 != null) {
                return new C39459r((ListItem) view, appCompatTextView, appCompatTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C39459r m114692d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C38337d.item_piggy_bank_history, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m114691a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f93839d;
    }
}
