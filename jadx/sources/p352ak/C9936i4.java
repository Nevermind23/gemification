package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.radiobutton.RadioButtonView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.i4 */
public final class C9936i4 implements C6201a {

    /* renamed from: d */
    private final View f27106d;

    /* renamed from: e */
    public final Input f27107e;

    /* renamed from: f */
    public final RadioButtonView f27108f;

    /* renamed from: g */
    public final AppCompatTextView f27109g;

    /* renamed from: h */
    public final AppCompatTextView f27110h;

    /* renamed from: i */
    public final AppCompatTextView f27111i;

    /* renamed from: j */
    public final LinearLayout f27112j;

    /* renamed from: k */
    public final RadioGroup f27113k;

    /* renamed from: l */
    public final Button f27114l;

    /* renamed from: m */
    public final RadioButtonView f27115m;

    private C9936i4(View view, Input input, RadioButtonView radioButtonView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, LinearLayout linearLayout, RadioGroup radioGroup, Button button, RadioButtonView radioButtonView2) {
        this.f27106d = view;
        this.f27107e = input;
        this.f27108f = radioButtonView;
        this.f27109g = appCompatTextView;
        this.f27110h = appCompatTextView2;
        this.f27111i = appCompatTextView3;
        this.f27112j = linearLayout;
        this.f27113k = radioGroup;
        this.f27114l = button;
        this.f27115m = radioButtonView2;
    }

    /* renamed from: a */
    public static C9936i4 m36445a(View view) {
        int i = C17782g.code_input;
        Input input = (Input) C6202b.m24689a(view, i);
        if (input != null) {
            i = C17782g.email_radio;
            RadioButtonView radioButtonView = (RadioButtonView) C6202b.m24689a(view, i);
            if (radioButtonView != null) {
                i = C17782g.otp_digipass_param1;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView != null) {
                    i = C17782g.otp_digipass_param2;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                    if (appCompatTextView2 != null) {
                        i = C17782g.otp_info_text;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) C6202b.m24689a(view, i);
                        if (appCompatTextView3 != null) {
                            i = C17782g.otp_layout_digipass_params;
                            LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
                            if (linearLayout != null) {
                                i = C17782g.radio_otp_type;
                                RadioGroup radioGroup = (RadioGroup) C6202b.m24689a(view, i);
                                if (radioGroup != null) {
                                    i = C17782g.resend_button;
                                    Button button = (Button) C6202b.m24689a(view, i);
                                    if (button != null) {
                                        i = C17782g.sms_radio;
                                        RadioButtonView radioButtonView2 = (RadioButtonView) C6202b.m24689a(view, i);
                                        if (radioButtonView2 != null) {
                                            return new C9936i4(view, input, radioButtonView, appCompatTextView, appCompatTextView2, appCompatTextView3, linearLayout, radioGroup, button, radioButtonView2);
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

    /* renamed from: c */
    public static C9936i4 m36446c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_one_time_password, viewGroup);
            return m36445a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27106d;
    }
}
