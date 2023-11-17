package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.n2 */
public final class C27373n2 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f69363d;

    /* renamed from: e */
    public final Button f69364e;

    /* renamed from: f */
    public final Barrier f69365f;

    /* renamed from: g */
    public final InlineFeedback f69366g;

    /* renamed from: h */
    public final Input f69367h;

    /* renamed from: i */
    public final Group f69368i;

    /* renamed from: j */
    public final PageState f69369j;

    private C27373n2(ConstraintLayout constraintLayout, Button button, Barrier barrier, InlineFeedback inlineFeedback, Input input, Group group, PageState pageState) {
        this.f69363d = constraintLayout;
        this.f69364e = button;
        this.f69365f = barrier;
        this.f69366g = inlineFeedback;
        this.f69367h = input;
        this.f69368i = group;
        this.f69369j = pageState;
    }

    /* renamed from: a */
    public static C27373n2 m84799a(View view) {
        int i = C10322k.f28854k0;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10322k.button_barrier;
            Barrier barrier = (Barrier) C6202b.m24689a(view, i);
            if (barrier != null) {
                i = C10322k.card_activation_warning_text;
                InlineFeedback inlineFeedback = (InlineFeedback) C6202b.m24689a(view, i);
                if (inlineFeedback != null) {
                    i = C10322k.card_digits;
                    Input input = (Input) C6202b.m24689a(view, i);
                    if (input != null) {
                        i = C10322k.four_digits_group;
                        Group group = (Group) C6202b.m24689a(view, i);
                        if (group != null) {
                            i = C10322k.f28877oo;
                            PageState pageState = (PageState) C6202b.m24689a(view, i);
                            if (pageState != null) {
                                return new C27373n2((ConstraintLayout) view, button, barrier, inlineFeedback, input, group, pageState);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27373n2 m84800d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.card_activation_action_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84799a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f69363d;
    }
}
