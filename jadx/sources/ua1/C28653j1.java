package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.list.ThreeLineTextItem;

/* renamed from: ua1.j1 */
public final class C28653j1 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f72779d;

    /* renamed from: e */
    public final TextView f72780e;

    /* renamed from: f */
    public final CheckboxView f72781f;

    /* renamed from: g */
    public final AppCompatImageView f72782g;

    /* renamed from: h */
    public final ThreeLineTextItem f72783h;

    private C28653j1(LinearLayout linearLayout, TextView textView, CheckboxView checkboxView, AppCompatImageView appCompatImageView, ThreeLineTextItem threeLineTextItem) {
        this.f72779d = linearLayout;
        this.f72780e = textView;
        this.f72781f = checkboxView;
        this.f72782g = appCompatImageView;
        this.f72783h = threeLineTextItem;
    }

    /* renamed from: a */
    public static C28653j1 m87718a(View view) {
        int i = C10216u.f28337s;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C10216u.f28305T;
            CheckboxView checkboxView = (CheckboxView) C6202b.m24689a(view, i);
            if (checkboxView != null) {
                i = C10216u.f28312Y0;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
                if (appCompatImageView != null) {
                    i = C10216u.texts;
                    ThreeLineTextItem threeLineTextItem = (ThreeLineTextItem) C6202b.m24689a(view, i);
                    if (threeLineTextItem != null) {
                        return new C28653j1((LinearLayout) view, textView, checkboxView, appCompatImageView, threeLineTextItem);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28653j1 m87719d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.item_select_transaction, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87718a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f72779d;
    }
}
