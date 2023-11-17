package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.list.ListItem;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.i */
public final class C9931i implements C6201a {

    /* renamed from: d */
    private final ListItem f27084d;

    /* renamed from: e */
    public final Button f27085e;

    /* renamed from: f */
    public final AppCompatTextView f27086f;

    private C9931i(ListItem listItem, Button button, AppCompatTextView appCompatTextView) {
        this.f27084d = listItem;
        this.f27085e = button;
        this.f27086f = appCompatTextView;
    }

    /* renamed from: a */
    public static C9931i m36427a(View view) {
        int i = C17782g.f49744Y3;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C17782g.f49816z8;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView != null) {
                return new C9931i((ListItem) view, button, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9931i m36428d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.item_additional_action, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36427a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f27084d;
    }
}
