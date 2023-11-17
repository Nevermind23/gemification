package en0;

import an0.C10106b;
import an0.C10107c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;

/* renamed from: en0.g */
public final class C12721g implements C6201a {

    /* renamed from: d */
    private final LinearLayout f37640d;

    /* renamed from: e */
    public final CheckboxView f37641e;

    /* renamed from: f */
    public final SingleLineTextItem f37642f;

    /* renamed from: g */
    public final ListItem f37643g;

    /* renamed from: h */
    public final Input f37644h;

    private C12721g(LinearLayout linearLayout, CheckboxView checkboxView, SingleLineTextItem singleLineTextItem, ListItem listItem, Input input) {
        this.f37640d = linearLayout;
        this.f37641e = checkboxView;
        this.f37642f = singleLineTextItem;
        this.f37643g = listItem;
        this.f37644h = input;
    }

    /* renamed from: a */
    public static C12721g m48277a(View view) {
        int i = C10106b.f27883l;
        CheckboxView checkboxView = (CheckboxView) C6202b.m24689a(view, i);
        if (checkboxView != null) {
            i = C10106b.f27886r;
            SingleLineTextItem singleLineTextItem = (SingleLineTextItem) C6202b.m24689a(view, i);
            if (singleLineTextItem != null) {
                i = C10106b.f27871C;
                ListItem listItem = (ListItem) C6202b.m24689a(view, i);
                if (listItem != null) {
                    i = C10106b.note_input;
                    Input input = (Input) C6202b.m24689a(view, i);
                    if (input != null) {
                        return new C12721g((LinearLayout) view, checkboxView, singleLineTextItem, listItem, input);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12721g m48278d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10107c.item_income_source_with_note, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48277a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f37640d;
    }
}
