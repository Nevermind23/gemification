package p341ge.bog.mobilebank.p975ui.components.passwordrules;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import he1.C41217g;
import java.util.HashMap;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;
import p366bk.C10324m;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.ui.components.passwordrules.PasswordRulesView */
public final class PasswordRulesView extends FrameLayout {

    /* renamed from: d */
    private final C41217g f85919d;

    /* renamed from: e */
    private final C41217g f85920e;

    /* renamed from: f */
    private final C41217g f85921f;

    /* renamed from: g */
    private final C41217g f85922g;

    /* renamed from: h */
    private HashMap f85923h;

    /* renamed from: ge.bog.mobilebank.ui.components.passwordrules.PasswordRulesView$a */
    static final class C35556a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PasswordRulesView f85924d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35556a(PasswordRulesView passwordRulesView) {
            super(0);
            this.f85924d = passwordRulesView;
        }

        /* renamed from: b */
        public final LinearLayout invoke() {
            return (LinearLayout) this.f85924d.findViewById(C10322k.layout_password_rules);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.components.passwordrules.PasswordRulesView$b */
    static final class C35557b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PasswordRulesView f85925d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35557b(PasswordRulesView passwordRulesView) {
            super(0);
            this.f85925d = passwordRulesView;
        }

        /* renamed from: b */
        public final LinearLayout invoke() {
            return (LinearLayout) this.f85925d.findViewById(C10322k.layout_password_strength);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.components.passwordrules.PasswordRulesView$c */
    static final class C35558c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PasswordRulesView f85926d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35558c(PasswordRulesView passwordRulesView) {
            super(0);
            this.f85926d = passwordRulesView;
        }

        /* renamed from: b */
        public final BogTextView invoke() {
            return (BogTextView) this.f85926d.findViewById(C10322k.tv_level_name);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.components.passwordrules.PasswordRulesView$d */
    static final class C35559d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PasswordRulesView f85927d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35559d(PasswordRulesView passwordRulesView) {
            super(0);
            this.f85927d = passwordRulesView;
        }

        /* renamed from: b */
        public final BogTextView invoke() {
            return (BogTextView) this.f85927d.findViewById(C10322k.tv_password_policy_prompt);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PasswordRulesView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    private final LinearLayout getLayoutStrength() {
        Object value = this.f85920e.getValue();
        C41536l.m120488h(value, "<get-layoutStrength>(...)");
        return (LinearLayout) value;
    }

    private final BogTextView getTvLevelName() {
        Object value = this.f85921f.getValue();
        C41536l.m120488h(value, "<get-tvLevelName>(...)");
        return (BogTextView) value;
    }

    private final BogTextView getTvPasswordPolicyPrompt() {
        Object value = this.f85922g.getValue();
        C41536l.m120488h(value, "<get-tvPasswordPolicyPrompt>(...)");
        return (BogTextView) value;
    }

    public final LinearLayout getLayoutRules() {
        Object value = this.f85919d.getValue();
        C41536l.m120488h(value, "<get-layoutRules>(...)");
        return (LinearLayout) value;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PasswordRulesView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PasswordRulesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        this.f85919d = C41219i.m119470b(new C35556a(this));
        this.f85920e = C41219i.m119470b(new C35557b(this));
        this.f85921f = C41219i.m119470b(new C35558c(this));
        this.f85922g = C41219i.m119470b(new C35559d(this));
        this.f85923h = new HashMap();
        View.inflate(context, C10324m.container_password_rules, this);
    }
}
