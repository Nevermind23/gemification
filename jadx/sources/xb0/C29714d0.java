package xb0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.biginput.BigInputView;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import rb0.C27985d;
import rb0.C27986e;

/* renamed from: xb0.d0 */
public final class C29714d0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f74994d;

    /* renamed from: e */
    public final BigInputView f74995e;

    /* renamed from: f */
    public final Button f74996f;

    /* renamed from: g */
    public final Button f74997g;

    /* renamed from: h */
    public final Input f74998h;

    /* renamed from: i */
    public final Input f74999i;

    /* renamed from: j */
    public final LayerView f75000j;

    /* renamed from: k */
    public final Input f75001k;

    /* renamed from: l */
    public final AppCompatTextView f75002l;

    private C29714d0(ConstraintLayout constraintLayout, BigInputView bigInputView, Button button, Button button2, Input input, Input input2, LayerView layerView, Input input3, AppCompatTextView appCompatTextView) {
        this.f74994d = constraintLayout;
        this.f74995e = bigInputView;
        this.f74996f = button;
        this.f74997g = button2;
        this.f74998h = input;
        this.f74999i = input2;
        this.f75000j = layerView;
        this.f75001k = input3;
        this.f75002l = appCompatTextView;
    }

    /* renamed from: a */
    public static C29714d0 m90221a(View view) {
        int i = C27985d.f71287m;
        BigInputView bigInputView = (BigInputView) C6202b.m24689a(view, i);
        if (bigInputView != null) {
            i = C27985d.button_delete;
            Button button = (Button) C6202b.m24689a(view, i);
            if (button != null) {
                i = C27985d.f71253C;
                Button button2 = (Button) C6202b.m24689a(view, i);
                if (button2 != null) {
                    i = C27985d.deposit_goal_input;
                    Input input = (Input) C6202b.m24689a(view, i);
                    if (input != null) {
                        i = C27985d.deposit_monthly_contribution;
                        Input input2 = (Input) C6202b.m24689a(view, i);
                        if (input2 != null) {
                            i = C27985d.input_layer;
                            LayerView layerView = (LayerView) C6202b.m24689a(view, i);
                            if (layerView != null) {
                                i = C27985d.target_date_input;
                                Input input3 = (Input) C6202b.m24689a(view, i);
                                if (input3 != null) {
                                    i = C27985d.text_goal_can_be_cancelled;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                                    if (appCompatTextView != null) {
                                        return new C29714d0((ConstraintLayout) view, bigInputView, button, button2, input, input2, layerView, input3, appCompatTextView);
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
    public static C29714d0 m90222d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27986e.layout_deposit_saving_goal, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m90221a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f74994d;
    }
}
