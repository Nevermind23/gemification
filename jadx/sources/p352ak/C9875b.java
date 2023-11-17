package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.b */
public final class C9875b implements C6201a {

    /* renamed from: d */
    private final LinearLayout f26782d;

    /* renamed from: e */
    public final ActionSheetTitle f26783e;

    /* renamed from: f */
    public final Button f26784f;

    /* renamed from: g */
    public final Button f26785g;

    /* renamed from: h */
    public final FrameLayout f26786h;

    /* renamed from: i */
    public final LayerView f26787i;

    /* renamed from: j */
    public final LinearLayout f26788j;

    /* renamed from: k */
    public final LinearLayout f26789k;

    private C9875b(LinearLayout linearLayout, ActionSheetTitle actionSheetTitle, Button button, Button button2, FrameLayout frameLayout, LayerView layerView, LinearLayout linearLayout2, LinearLayout linearLayout3) {
        this.f26782d = linearLayout;
        this.f26783e = actionSheetTitle;
        this.f26784f = button;
        this.f26785g = button2;
        this.f26786h = frameLayout;
        this.f26787i = layerView;
        this.f26788j = linearLayout2;
        this.f26789k = linearLayout3;
    }

    /* renamed from: a */
    public static C9875b m36220a(View view) {
        int i = C17782g.f49780q;
        ActionSheetTitle actionSheetTitle = (ActionSheetTitle) C6202b.m24689a(view, i);
        if (actionSheetTitle != null) {
            i = C17782g.f49726T;
            Button button = (Button) C6202b.m24689a(view, i);
            if (button != null) {
                i = C17782g.f49714O1;
                Button button2 = (Button) C6202b.m24689a(view, i);
                if (button2 != null) {
                    i = C17782g.f49737W1;
                    FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
                    if (frameLayout != null) {
                        i = C17782g.drag_button;
                        LayerView layerView = (LayerView) C6202b.m24689a(view, i);
                        if (layerView != null) {
                            LinearLayout linearLayout = (LinearLayout) view;
                            i = C17782g.title_layout;
                            LinearLayout linearLayout2 = (LinearLayout) C6202b.m24689a(view, i);
                            if (linearLayout2 != null) {
                                return new C9875b(linearLayout, actionSheetTitle, button, button2, frameLayout, layerView, linearLayout, linearLayout2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9875b m36221d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.action_sheet_layout_container, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36220a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f26782d;
    }
}
