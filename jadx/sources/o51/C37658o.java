package o51;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import n51.C37356b;
import n51.C37357c;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;

/* renamed from: o51.o */
public final class C37658o implements C6201a {

    /* renamed from: d */
    private final ListItem f90511d;

    /* renamed from: e */
    public final AppCompatImageView f90512e;

    /* renamed from: f */
    public final TwoLineReverseTextItem f90513f;

    /* renamed from: g */
    public final CheckboxView f90514g;

    private C37658o(ListItem listItem, AppCompatImageView appCompatImageView, TwoLineReverseTextItem twoLineReverseTextItem, CheckboxView checkboxView) {
        this.f90511d = listItem;
        this.f90512e = appCompatImageView;
        this.f90513f = twoLineReverseTextItem;
        this.f90514g = checkboxView;
    }

    /* renamed from: a */
    public static C37658o m110723a(View view) {
        int i = C37356b.f89829m;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C37356b.card_texts;
            TwoLineReverseTextItem twoLineReverseTextItem = (TwoLineReverseTextItem) C6202b.m24689a(view, i);
            if (twoLineReverseTextItem != null) {
                i = C37356b.select_check_boxx;
                CheckboxView checkboxView = (CheckboxView) C6202b.m24689a(view, i);
                if (checkboxView != null) {
                    return new C37658o((ListItem) view, appCompatImageView, twoLineReverseTextItem, checkboxView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C37658o m110724d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37357c.item_statements_select_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m110723a(inflate);
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f90511d;
    }
}
