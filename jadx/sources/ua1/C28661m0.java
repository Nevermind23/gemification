package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttonlist.ButtonListView;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: ua1.m0 */
public final class C28661m0 implements C6201a {

    /* renamed from: d */
    private final ScrollView f72823d;

    /* renamed from: e */
    public final Guideline f72824e;

    /* renamed from: f */
    public final TextView f72825f;

    /* renamed from: g */
    public final LayerView f72826g;

    /* renamed from: h */
    public final Guideline f72827h;

    /* renamed from: i */
    public final Input f72828i;

    /* renamed from: j */
    public final Guideline f72829j;

    /* renamed from: k */
    public final ButtonListView f72830k;

    /* renamed from: l */
    public final Button f72831l;

    /* renamed from: m */
    public final Guideline f72832m;

    private C28661m0(ScrollView scrollView, Guideline guideline, TextView textView, LayerView layerView, Guideline guideline2, Input input, Guideline guideline3, ButtonListView buttonListView, Button button, Guideline guideline4) {
        this.f72823d = scrollView;
        this.f72824e = guideline;
        this.f72825f = textView;
        this.f72826g = layerView;
        this.f72827h = guideline2;
        this.f72828i = input;
        this.f72829j = guideline3;
        this.f72830k = buttonListView;
        this.f72831l = button;
        this.f72832m = guideline4;
    }

    /* renamed from: a */
    public static C28661m0 m87754a(View view) {
        int i = C10216u.bottom_guideLine;
        Guideline guideline = (Guideline) C6202b.m24689a(view, i);
        if (guideline != null) {
            i = C10216u.forgot_credentials;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                i = C10216u.f28325g1;
                LayerView layerView = (LayerView) C6202b.m24689a(view, i);
                if (layerView != null) {
                    i = C10216u.left_guideline;
                    Guideline guideline2 = (Guideline) C6202b.m24689a(view, i);
                    if (guideline2 != null) {
                        i = C10216u.password_text;
                        Input input = (Input) C6202b.m24689a(view, i);
                        if (input != null) {
                            i = C10216u.right_guideline;
                            Guideline guideline3 = (Guideline) C6202b.m24689a(view, i);
                            if (guideline3 != null) {
                                i = C10216u.statement_category_view;
                                ButtonListView buttonListView = (ButtonListView) C6202b.m24689a(view, i);
                                if (buttonListView != null) {
                                    i = C10216u.submit;
                                    Button button = (Button) C6202b.m24689a(view, i);
                                    if (button != null) {
                                        i = C10216u.f28330h3;
                                        Guideline guideline4 = (Guideline) C6202b.m24689a(view, i);
                                        if (guideline4 != null) {
                                            return new C28661m0((ScrollView) view, guideline, textView, layerView, guideline2, input, guideline3, buttonListView, button, guideline4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28661m0 m87755d(LayoutInflater layoutInflater) {
        return m87756e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28661m0 m87756e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.fragment_password_sign_in, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87754a(inflate);
    }

    /* renamed from: c */
    public ScrollView mo3946b() {
        return this.f72823d;
    }
}
