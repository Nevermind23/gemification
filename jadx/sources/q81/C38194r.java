package q81;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.cardview.widget.CardView;
import androidx.core.content.C0767a;
import g91.C32290b1;
import g91.C32355x0;
import he1.C41217g;
import iu0.C36546y;
import java.util.Arrays;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n41.C37353c;
import p341ge.bog.mobilebank.eventbus.events.FeatureFeedBackEvent;
import p341ge.bog.mobilebank.model.FeatureFeedback;
import p341ge.bog.mobilebank.model.FeedbackType;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogButton;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogImageView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.rest.model.RestCallback;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p380ck.C10463g;
import r90.C27950a;
import ue1.C43064a;

/* renamed from: q81.r */
public final class C38194r extends C38160a {

    /* renamed from: s */
    public static final C38195a f91650s = new C38195a((DefaultConstructorMarker) null);

    /* renamed from: h */
    private final FeatureFeedback f91651h;

    /* renamed from: i */
    private final FeatureFeedBackEvent.Location f91652i;

    /* renamed from: j */
    private final C41217g f91653j = C41219i.m119470b(new C38205k(this));

    /* renamed from: k */
    private final C41217g f91654k = C41219i.m119470b(new C38198d(this));

    /* renamed from: l */
    private final C41217g f91655l = C41219i.m119470b(new C38197c(this));

    /* renamed from: m */
    private final C41217g f91656m = C41219i.m119470b(new C38199e(this));

    /* renamed from: n */
    private final C41217g f91657n = C41219i.m119470b(new C38196b(this));

    /* renamed from: o */
    private final C41217g f91658o = C41219i.m119470b(new C38200f(this));

    /* renamed from: p */
    private final C41217g f91659p = C41219i.m119470b(new C38204j(this));

    /* renamed from: q */
    private final C41217g f91660q = C41219i.m119470b(new C38201g(this));

    /* renamed from: r */
    private int f91661r;

    /* renamed from: q81.r$a */
    public static final class C38195a {
        private C38195a() {
        }

        public /* synthetic */ C38195a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo91728a(C35388f2 f2Var, FeatureFeedBackEvent featureFeedBackEvent, FeatureFeedBackEvent.Location location) {
            C41536l.m120489i(f2Var, "activity");
            C41536l.m120489i(featureFeedBackEvent, "event");
            C41536l.m120489i(location, "location");
            FeatureFeedback feedbackId = featureFeedBackEvent.getFeedbackId(location);
            if (!featureFeedBackEvent.isShown() && feedbackId != null) {
                featureFeedBackEvent.setShown(true);
                new C38194r(f2Var, feedbackId, location).show();
            }
        }
    }

    /* renamed from: q81.r$b */
    static final class C38196b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C38194r f91662d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38196b(C38194r rVar) {
            super(0);
            this.f91662d = rVar;
        }

        /* renamed from: b */
        public final CardView invoke() {
            return (CardView) this.f91662d.findViewById(C10322k.buttonContainer);
        }
    }

    /* renamed from: q81.r$c */
    static final class C38197c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C38194r f91663d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38197c(C38194r rVar) {
            super(0);
            this.f91663d = rVar;
        }

        /* renamed from: b */
        public final BogButton invoke() {
            return (BogButton) this.f91663d.findViewById(C10322k.f28804X7);
        }
    }

    /* renamed from: q81.r$d */
    static final class C38198d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C38194r f91664d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38198d(C38194r rVar) {
            super(0);
            this.f91664d = rVar;
        }

        /* renamed from: b */
        public final BogTextView invoke() {
            return (BogTextView) this.f91664d.findViewById(C10322k.questionTV);
        }
    }

    /* renamed from: q81.r$e */
    static final class C38199e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C38194r f91665d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38199e(C38194r rVar) {
            super(0);
            this.f91665d = rVar;
        }

        /* renamed from: b */
        public final BogButton invoke() {
            return (BogButton) this.f91665d.findViewById(C10322k.rate_button);
        }
    }

    /* renamed from: q81.r$f */
    static final class C38200f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C38194r f91666d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38200f(C38194r rVar) {
            super(0);
            this.f91666d = rVar;
        }

        /* renamed from: b */
        public final View invoke() {
            return this.f91666d.findViewById(C10322k.rateClickableArea);
        }
    }

    /* renamed from: q81.r$g */
    static final class C38201g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C38194r f91667d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38201g(C38194r rVar) {
            super(0);
            this.f91667d = rVar;
        }

        /* renamed from: b */
        public final BogTextView invoke() {
            return (BogTextView) this.f91667d.findViewById(C10322k.rating_tv);
        }
    }

    /* renamed from: q81.r$h */
    public static final class C38202h extends RestCallback {
        C38202h() {
        }
    }

    /* renamed from: q81.r$i */
    public static final class C38203i extends RestCallback {
        C38203i() {
        }
    }

    /* renamed from: q81.r$j */
    static final class C38204j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C38194r f91668d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38204j(C38194r rVar) {
            super(0);
            this.f91668d = rVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: ge.bog.mobilebank.ui.views.widgets.BogImageView[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p341ge.bog.mobilebank.p975ui.views.widgets.BogImageView[] invoke() {
            /*
                r3 = this;
                r0 = 5
                ge.bog.mobilebank.ui.views.widgets.BogImageView[] r0 = new p341ge.bog.mobilebank.p975ui.views.widgets.BogImageView[r0]
                q81.r r1 = r3.f91668d
                int r2 = p366bk.C10322k.star_1
                android.view.View r1 = r1.findViewById(r2)
                java.lang.String r2 = "findViewById(R.id.star_1)"
                kotlin.jvm.internal.C41536l.m120488h(r1, r2)
                r2 = 0
                r0[r2] = r1
                q81.r r1 = r3.f91668d
                int r2 = p366bk.C10322k.star_2
                android.view.View r1 = r1.findViewById(r2)
                java.lang.String r2 = "findViewById(R.id.star_2)"
                kotlin.jvm.internal.C41536l.m120488h(r1, r2)
                r2 = 1
                r0[r2] = r1
                q81.r r1 = r3.f91668d
                int r2 = p366bk.C10322k.star_3
                android.view.View r1 = r1.findViewById(r2)
                java.lang.String r2 = "findViewById(R.id.star_3)"
                kotlin.jvm.internal.C41536l.m120488h(r1, r2)
                r2 = 2
                r0[r2] = r1
                q81.r r1 = r3.f91668d
                int r2 = p366bk.C10322k.star_4
                android.view.View r1 = r1.findViewById(r2)
                java.lang.String r2 = "findViewById(R.id.star_4)"
                kotlin.jvm.internal.C41536l.m120488h(r1, r2)
                r2 = 3
                r0[r2] = r1
                q81.r r1 = r3.f91668d
                int r2 = p366bk.C10322k.star_5
                android.view.View r1 = r1.findViewById(r2)
                java.lang.String r2 = "findViewById(R.id.star_5)"
                kotlin.jvm.internal.C41536l.m120488h(r1, r2)
                r2 = 4
                r0[r2] = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: q81.C38194r.C38204j.invoke():ge.bog.mobilebank.ui.views.widgets.BogImageView[]");
        }
    }

    /* renamed from: q81.r$k */
    static final class C38205k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C38194r f91669d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38205k(C38194r rVar) {
            super(0);
            this.f91669d = rVar;
        }

        /* renamed from: b */
        public final BogTextView invoke() {
            return (BogTextView) this.f91669d.findViewById(C10322k.titleTV);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38194r(Context context, FeatureFeedback featureFeedback, FeatureFeedBackEvent.Location location) {
        super(context);
        WindowManager.LayoutParams layoutParams;
        String str;
        C41536l.m120489i(context, "context");
        C41536l.m120489i(featureFeedback, "featureFeedback");
        C41536l.m120489i(location, "location");
        this.f91651h = featureFeedback;
        this.f91652i = location;
        setCancelable(false);
        Window window = getWindow();
        if (window != null) {
            layoutParams = window.getAttributes();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.width = C32355x0.m95521l(context) - C32355x0.m95510a(80.0f);
        }
        m112368j().setBackgroundResource(C10320i.bog_button_activated_selector);
        if (this.f91575g.getLanguage() == C37353c.KA) {
            str = this.f91574f.getUserInfo().getVocativeNames().f81383ge;
        } else {
            str = this.f91574f.getUserInfo().getVocativeNames().f81382en;
        }
        m112375q().setText(str);
        m112370l().setText(C27950a.m86287d(featureFeedback.getFeedbackType().getQuestionKey(), false, 2, (Object) null));
        m112369k().setOnClickListener(new C38189m(this));
        m112372n().setOnClickListener(new C38190n(this));
        m112376r();
        C36546y.m108282F().mo27152s("feedback", featureFeedback.getFeedbackType() + "_" + featureFeedback.getFeedbackVersion() + "_" + location, "appear");
    }

    /* renamed from: A */
    public static final void m112360A(C35388f2 f2Var, FeatureFeedBackEvent featureFeedBackEvent, FeatureFeedBackEvent.Location location) {
        f91650s.mo91728a(f2Var, featureFeedBackEvent, location);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final void m112366h(C38194r rVar, View view) {
        C41536l.m120489i(rVar, "this$0");
        C10463g F = C36546y.m108282F();
        FeedbackType feedbackType = rVar.f91651h.getFeedbackType();
        String feedbackVersion = rVar.f91651h.getFeedbackVersion();
        FeatureFeedBackEvent.Location location = rVar.f91652i;
        F.mo27152s("feedback", feedbackType + "_" + feedbackVersion + "_" + location, "close_before_review");
        rVar.m112383y(true);
        rVar.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final void m112367i(C38194r rVar, View view) {
        C41536l.m120489i(rVar, "this$0");
        rVar.m112378t();
    }

    /* renamed from: j */
    private final CardView m112368j() {
        Object value = this.f91657n.getValue();
        C41536l.m120488h(value, "<get-buttonContainer>(...)");
        return (CardView) value;
    }

    /* renamed from: k */
    private final BogButton m112369k() {
        Object value = this.f91655l.getValue();
        C41536l.m120488h(value, "<get-closeButton>(...)");
        return (BogButton) value;
    }

    /* renamed from: l */
    private final BogTextView m112370l() {
        Object value = this.f91654k.getValue();
        C41536l.m120488h(value, "<get-questionTV>(...)");
        return (BogTextView) value;
    }

    /* renamed from: m */
    private final BogButton m112371m() {
        Object value = this.f91656m.getValue();
        C41536l.m120488h(value, "<get-rateButton>(...)");
        return (BogButton) value;
    }

    /* renamed from: n */
    private final View m112372n() {
        Object value = this.f91658o.getValue();
        C41536l.m120488h(value, "<get-rateClickableArea>(...)");
        return (View) value;
    }

    /* renamed from: o */
    private final BogTextView m112373o() {
        Object value = this.f91660q.getValue();
        C41536l.m120488h(value, "<get-ratingTV>(...)");
        return (BogTextView) value;
    }

    /* renamed from: p */
    private final BogImageView[] m112374p() {
        return (BogImageView[]) this.f91659p.getValue();
    }

    /* renamed from: q */
    private final BogTextView m112375q() {
        Object value = this.f91653j.getValue();
        C41536l.m120488h(value, "<get-titleTV>(...)");
        return (BogTextView) value;
    }

    /* renamed from: r */
    private final void m112376r() {
        int length = m112374p().length;
        for (int i = 0; i < length; i++) {
            BogImageView bogImageView = m112374p()[i];
            bogImageView.setTag(Integer.valueOf(i));
            bogImageView.setImageDrawable(C32290b1.m95123m(C32290b1.m95117g(C10320i.ic_star_normal), C0767a.m2893c(getContext(), C10318g.feedback_star_color_filled)));
            bogImageView.setOnClickListener(new C38193q(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static final void m112377s(C38194r rVar, View view) {
        C41536l.m120489i(rVar, "this$0");
        C41536l.m120488h(view, "it");
        rVar.m112381w(view);
    }

    /* renamed from: t */
    private final void m112378t() {
        int i = this.f91661r;
        if (i <= 0) {
            return;
        }
        if (i == 5) {
            for (BogImageView onClickListener : m112374p()) {
                onClickListener.setOnClickListener((View.OnClickListener) null);
            }
            m112375q().setText(getContext().getString(C10328q.feedback_success_title));
            m112370l().setText(getContext().getString(C10328q.feedback_success_message_with_play_store));
            m112371m().setCompoundDrawablesWithIntrinsicBounds(C32290b1.m95123m(C0767a.m2895e(getContext(), C10320i.agreement_button_icon), C0767a.m2893c(getContext(), C10318g.f28616A)), (Drawable) null, (Drawable) null, (Drawable) null);
            m112371m().setText(getContext().getString(C10328q.common_text_rate_caps));
            m112369k().setText(getContext().getString(C10328q.button_text_close));
            m112372n().setOnClickListener(new C38191o(this));
            m112369k().setOnClickListener(new C38192p(this));
            m112383y(false);
            return;
        }
        dismiss();
        Context context = getContext();
        C41536l.m120488h(context, "context");
        new C38184l(context, this.f91651h, this.f91661r, this.f91652i).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static final void m112379u(C38194r rVar, View view) {
        C41536l.m120489i(rVar, "this$0");
        rVar.dismiss();
        rVar.m112382x();
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static final void m112380v(C38194r rVar, View view) {
        C41536l.m120489i(rVar, "this$0");
        C10463g F = C36546y.m108282F();
        FeedbackType feedbackType = rVar.f91651h.getFeedbackType();
        String feedbackVersion = rVar.f91651h.getFeedbackVersion();
        FeatureFeedBackEvent.Location location = rVar.f91652i;
        F.mo27152s("feedback", feedbackType + "_" + feedbackVersion + "_" + location, "close_after_review");
        rVar.dismiss();
    }

    /* renamed from: w */
    private final void m112381w(View view) {
        Object tag = view.getTag();
        C41536l.m120487g(tag, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) tag).intValue();
        int length = m112374p().length;
        for (int i = 0; i < length; i++) {
            BogImageView bogImageView = m112374p()[i];
            if (i <= intValue) {
                bogImageView.setImageDrawable(C32290b1.m95123m(C32290b1.m95117g(C10320i.ic_star_filled), C0767a.m2893c(getContext(), C10318g.feedback_star_color_filled)));
            } else {
                bogImageView.setImageDrawable(C32290b1.m95123m(C32290b1.m95117g(C10320i.ic_star_normal), C0767a.m2893c(getContext(), C10318g.feedback_star_color_filled)));
            }
        }
        m112384z(intValue + 1);
        m112371m().setOrange(true);
    }

    /* renamed from: x */
    private final void m112382x() {
        C10463g F = C36546y.m108282F();
        FeedbackType feedbackType = this.f91651h.getFeedbackType();
        String feedbackVersion = this.f91651h.getFeedbackVersion();
        FeatureFeedBackEvent.Location location = this.f91652i;
        F.mo27152s("feedback", feedbackType + "_" + feedbackVersion + "_" + location, "go_to_store");
        String packageName = getContext().getPackageName();
        Context context = getContext();
        StringBuilder sb = new StringBuilder();
        sb.append("https://play.google.com/store/apps/details?id=");
        sb.append(packageName);
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(sb.toString())));
    }

    /* renamed from: y */
    private final void m112383y(boolean z) {
        if (z) {
            this.f91573e.setFeatureFeedback(this.f91651h.getFeedbackId(), "CLOSE", (Integer) null, "", new C38202h());
        } else {
            this.f91573e.setFeatureFeedback(this.f91651h.getFeedbackId(), "RATE", Integer.valueOf(this.f91661r), "", new C38203i());
        }
    }

    /* renamed from: z */
    private final void m112384z(int i) {
        this.f91661r = i;
        BogTextView o = m112373o();
        C41524c0 c0Var = C41524c0.f97701a;
        String format = String.format("%d/%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.f91661r), 5}, 2));
        C41536l.m120488h(format, "format(format, *args)");
        o.setText(format);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo91682b() {
        return C10324m.dialog_feedback;
    }
}
