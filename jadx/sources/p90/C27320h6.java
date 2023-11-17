package p90;

import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogImageView;
import p366bk.C10322k;

/* renamed from: p90.h6 */
public final class C27320h6 implements C6201a {

    /* renamed from: d */
    private final ListItem f68886d;

    /* renamed from: e */
    public final CheckboxView f68887e;

    /* renamed from: f */
    public final BogImageView f68888f;

    /* renamed from: g */
    public final ListItem f68889g;

    /* renamed from: h */
    public final ImageButton f68890h;

    /* renamed from: i */
    public final LinearLayout f68891i;

    /* renamed from: j */
    public final BogImageView f68892j;

    private C27320h6(ListItem listItem, CheckboxView checkboxView, BogImageView bogImageView, ListItem listItem2, ImageButton imageButton, LinearLayout linearLayout, BogImageView bogImageView2) {
        this.f68886d = listItem;
        this.f68887e = checkboxView;
        this.f68888f = bogImageView;
        this.f68889g = listItem2;
        this.f68890h = imageButton;
        this.f68891i = linearLayout;
        this.f68892j = bogImageView2;
    }

    /* renamed from: a */
    public static C27320h6 m84588a(View view) {
        int i = C10322k.f28735G7;
        CheckboxView checkboxView = (CheckboxView) C6202b.m24689a(view, i);
        if (checkboxView != null) {
            i = C10322k.contactImage;
            BogImageView bogImageView = (BogImageView) C6202b.m24689a(view, i);
            if (bogImageView != null) {
                ListItem listItem = (ListItem) view;
                i = C10322k.f28882py;
                ImageButton imageButton = (ImageButton) C6202b.m24689a(view, i);
                if (imageButton != null) {
                    i = C10322k.transfer_button_layout;
                    LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
                    if (linearLayout != null) {
                        i = C10322k.verifiedBadge;
                        BogImageView bogImageView2 = (BogImageView) C6202b.m24689a(view, i);
                        if (bogImageView2 != null) {
                            return new C27320h6(listItem, checkboxView, bogImageView, listItem, imageButton, linearLayout, bogImageView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public ListItem mo3946b() {
        return this.f68886d;
    }
}
