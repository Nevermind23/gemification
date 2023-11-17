package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.radiobutton.RadioButtonView;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.b0 */
public final class C27254b0 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f68342d;

    /* renamed from: e */
    public final CheckBox f68343e;

    /* renamed from: f */
    public final Button f68344f;

    /* renamed from: g */
    public final TextView f68345g;

    /* renamed from: h */
    public final RadioButtonView f68346h;

    /* renamed from: i */
    public final RadioButtonView f68347i;

    /* renamed from: j */
    public final RadioButtonView f68348j;

    /* renamed from: k */
    public final RadioButtonView f68349k;

    /* renamed from: l */
    public final RadioButtonView f68350l;

    /* renamed from: m */
    public final RadioButtonView f68351m;

    /* renamed from: n */
    public final RadioGroup f68352n;

    /* renamed from: o */
    public final RadioButtonView f68353o;

    /* renamed from: p */
    public final Toolbar f68354p;

    /* renamed from: q */
    public final Button f68355q;

    /* renamed from: r */
    public final CheckBox f68356r;

    /* renamed from: s */
    public final Button f68357s;

    /* renamed from: t */
    public final Button f68358t;

    /* renamed from: u */
    public final Button f68359u;

    /* renamed from: v */
    public final Spinner f68360v;

    /* renamed from: w */
    public final Button f68361w;

    /* renamed from: x */
    public final TextView f68362x;

    private C27254b0(LinearLayout linearLayout, CheckBox checkBox, Button button, TextView textView, RadioButtonView radioButtonView, RadioButtonView radioButtonView2, RadioButtonView radioButtonView3, RadioButtonView radioButtonView4, RadioButtonView radioButtonView5, RadioButtonView radioButtonView6, RadioGroup radioGroup, RadioButtonView radioButtonView7, Toolbar toolbar, Button button2, CheckBox checkBox2, Button button3, Button button4, Button button5, Spinner spinner, Button button6, TextView textView2) {
        this.f68342d = linearLayout;
        this.f68343e = checkBox;
        this.f68344f = button;
        this.f68345g = textView;
        this.f68346h = radioButtonView;
        this.f68347i = radioButtonView2;
        this.f68348j = radioButtonView3;
        this.f68349k = radioButtonView4;
        this.f68350l = radioButtonView5;
        this.f68351m = radioButtonView6;
        this.f68352n = radioGroup;
        this.f68353o = radioButtonView7;
        this.f68354p = toolbar;
        this.f68355q = button2;
        this.f68356r = checkBox2;
        this.f68357s = button3;
        this.f68358t = button4;
        this.f68359u = button5;
        this.f68360v = spinner;
        this.f68361w = button6;
        this.f68362x = textView2;
    }

    /* renamed from: a */
    public static C27254b0 m84313a(View view) {
        View view2 = view;
        int i = C10322k.analytics_logging_checkbox;
        CheckBox checkBox = (CheckBox) C6202b.m24689a(view2, i);
        if (checkBox != null) {
            i = C10322k.btnSaveTheme;
            Button button = (Button) C6202b.m24689a(view2, i);
            if (button != null) {
                i = C10322k.build_type;
                TextView textView = (TextView) C6202b.m24689a(view2, i);
                if (textView != null) {
                    i = C10322k.cb_theme_none;
                    RadioButtonView radioButtonView = (RadioButtonView) C6202b.m24689a(view2, i);
                    if (radioButtonView != null) {
                        i = C10322k.cb_theme_retail;
                        RadioButtonView radioButtonView2 = (RadioButtonView) C6202b.m24689a(view2, i);
                        if (radioButtonView2 != null) {
                            i = C10322k.cb_theme_solo;
                            RadioButtonView radioButtonView3 = (RadioButtonView) C6202b.m24689a(view2, i);
                            if (radioButtonView3 != null) {
                                i = C10322k.cb_theme_wm;
                                RadioButtonView radioButtonView4 = (RadioButtonView) C6202b.m24689a(view2, i);
                                if (radioButtonView4 != null) {
                                    i = C10322k.f28807Y9;
                                    RadioButtonView radioButtonView5 = (RadioButtonView) C6202b.m24689a(view2, i);
                                    if (radioButtonView5 != null) {
                                        i = C10322k.f28811Z9;
                                        RadioButtonView radioButtonView6 = (RadioButtonView) C6202b.m24689a(view2, i);
                                        if (radioButtonView6 != null) {
                                            i = C10322k.dark_mode_group;
                                            RadioGroup radioGroup = (RadioGroup) C6202b.m24689a(view2, i);
                                            if (radioGroup != null) {
                                                i = C10322k.f28824ca;
                                                RadioButtonView radioButtonView7 = (RadioButtonView) C6202b.m24689a(view2, i);
                                                if (radioButtonView7 != null) {
                                                    i = C10322k.debug_settings_toolbar;
                                                    Toolbar toolbar = (Toolbar) C6202b.m24689a(view2, i);
                                                    if (toolbar != null) {
                                                        i = C10322k.force_update_dictionary;
                                                        Button button2 = (Button) C6202b.m24689a(view2, i);
                                                        if (button2 != null) {
                                                            i = C10322k.logging_checkbox;
                                                            CheckBox checkBox2 = (CheckBox) C6202b.m24689a(view2, i);
                                                            if (checkBox2 != null) {
                                                                i = C10322k.reset_btn;
                                                                Button button3 = (Button) C6202b.m24689a(view2, i);
                                                                if (button3 != null) {
                                                                    i = C10322k.reset_preferences;
                                                                    Button button4 = (Button) C6202b.m24689a(view2, i);
                                                                    if (button4 != null) {
                                                                        i = C10322k.reset_release_notes;
                                                                        Button button5 = (Button) C6202b.m24689a(view2, i);
                                                                        if (button5 != null) {
                                                                            i = C10322k.server_sp;
                                                                            Spinner spinner = (Spinner) C6202b.m24689a(view2, i);
                                                                            if (spinner != null) {
                                                                                i = C10322k.show_hidden_offers;
                                                                                Button button6 = (Button) C6202b.m24689a(view2, i);
                                                                                if (button6 != null) {
                                                                                    i = C10322k.version_name;
                                                                                    TextView textView2 = (TextView) C6202b.m24689a(view2, i);
                                                                                    if (textView2 != null) {
                                                                                        return new C27254b0((LinearLayout) view2, checkBox, button, textView, radioButtonView, radioButtonView2, radioButtonView3, radioButtonView4, radioButtonView5, radioButtonView6, radioGroup, radioButtonView7, toolbar, button2, checkBox2, button3, button4, button5, spinner, button6, textView2);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
    public static C27254b0 m84314d(LayoutInflater layoutInflater) {
        return m84315e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27254b0 m84315e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.activity_debug_settings, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84313a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f68342d;
    }
}
