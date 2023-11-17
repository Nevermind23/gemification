package vs0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;
import rs0.C38336c;
import rs0.C38337d;

/* renamed from: vs0.s */
public final class C39460s implements C6201a {

    /* renamed from: d */
    private final ListItem f93842d;

    /* renamed from: e */
    public final AppCompatImageView f93843e;

    /* renamed from: f */
    public final AppCompatTextView f93844f;

    private C39460s(ListItem listItem, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView) {
        this.f93842d = listItem;
        this.f93843e = appCompatImageView;
        this.f93844f = appCompatTextView;
    }

    /* renamed from: a */
    public static C39460s m114695a(View view) {
        int i = C38336c.icon_img;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C38336c.f91878k0;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView != null) {
                return new C39460s((ListItem) view, appCompatImageView, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C39460s m114696d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C38337d.item_piggy_bank_news, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m114695a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f93842d;
    }
}
