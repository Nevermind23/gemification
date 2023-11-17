package p481jm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.list.ListItem;
import p411em.C12488e;
import p411em.C12489f;

/* renamed from: jm.b0 */
public final class C16219b0 implements C6201a {

    /* renamed from: d */
    private final ListItem f45776d;

    /* renamed from: e */
    public final Button f45777e;

    /* renamed from: f */
    public final AppCompatTextView f45778f;

    private C16219b0(ListItem listItem, Button button, AppCompatTextView appCompatTextView) {
        this.f45776d = listItem;
        this.f45777e = button;
        this.f45778f = appCompatTextView;
    }

    /* renamed from: a */
    public static C16219b0 m57804a(View view) {
        int i = C12488e.f37181I0;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C12488e.f37197c2;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView != null) {
                return new C16219b0((ListItem) view, button, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C16219b0 m57805d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C12489f.item_renewal_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57804a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f45776d;
    }
}
