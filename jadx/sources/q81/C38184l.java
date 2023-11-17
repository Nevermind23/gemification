package q81;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import g91.C32355x0;
import he1.C41217g;
import iu0.C36546y;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.eventbus.events.FeatureFeedBackEvent;
import p341ge.bog.mobilebank.model.FeatureFeedback;
import p341ge.bog.mobilebank.model.FeedbackType;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogButton;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.rest.model.RestCallback;
import p366bk.C10322k;
import p366bk.C10324m;
import p380ck.C10463g;
import ue1.C43064a;

/* renamed from: q81.l */
public final class C38184l extends C38160a {

    /* renamed from: h */
    private final FeatureFeedback f91636h;

    /* renamed from: i */
    private final int f91637i;

    /* renamed from: j */
    private final FeatureFeedBackEvent.Location f91638j;

    /* renamed from: k */
    private final C41217g f91639k = C41219i.m119470b(new C38186b(this));

    /* renamed from: l */
    private final C41217g f91640l = C41219i.m119470b(new C38187c(this));

    /* renamed from: m */
    private final C41217g f91641m = C41219i.m119470b(new C38185a(this));

    /* renamed from: q81.l$a */
    static final class C38185a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C38184l f91642d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38185a(C38184l lVar) {
            super(0);
            this.f91642d = lVar;
        }

        /* renamed from: b */
        public final BogButton invoke() {
            return (BogButton) this.f91642d.findViewById(C10322k.f28804X7);
        }
    }

    /* renamed from: q81.l$b */
    static final class C38186b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C38184l f91643d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38186b(C38184l lVar) {
            super(0);
            this.f91643d = lVar;
        }

        /* renamed from: b */
        public final BogInputLayout invoke() {
            return (BogInputLayout) this.f91643d.findViewById(C10322k.feedback_dialog_description_input);
        }
    }

    /* renamed from: q81.l$c */
    static final class C38187c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C38184l f91644d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38187c(C38184l lVar) {
            super(0);
            this.f91644d = lVar;
        }

        /* renamed from: b */
        public final BogButton invoke() {
            return (BogButton) this.f91644d.findViewById(C10322k.rate_button);
        }
    }

    /* renamed from: q81.l$d */
    public static final class C38188d extends RestCallback {
        C38188d() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38184l(Context context, FeatureFeedback featureFeedback, int i, FeatureFeedBackEvent.Location location) {
        super(context);
        WindowManager.LayoutParams layoutParams;
        C41536l.m120489i(context, "context");
        C41536l.m120489i(featureFeedback, "featureFeedback");
        C41536l.m120489i(location, "location");
        this.f91636h = featureFeedback;
        this.f91637i = i;
        this.f91638j = location;
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
        m112352i().setOnClickListener(new C38182j(this));
        m112350g().setOnClickListener(new C38183k(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m112348e(C38184l lVar, View view) {
        C41536l.m120489i(lVar, "this$0");
        lVar.m112354k();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final void m112349f(C38184l lVar, View view) {
        C41536l.m120489i(lVar, "this$0");
        lVar.m112353j();
    }

    /* renamed from: g */
    private final BogButton m112350g() {
        Object value = this.f91641m.getValue();
        C41536l.m120488h(value, "<get-closeButton>(...)");
        return (BogButton) value;
    }

    /* renamed from: h */
    private final BogInputLayout m112351h() {
        Object value = this.f91639k.getValue();
        C41536l.m120488h(value, "<get-input>(...)");
        return (BogInputLayout) value;
    }

    /* renamed from: i */
    private final BogButton m112352i() {
        Object value = this.f91640l.getValue();
        C41536l.m120488h(value, "<get-rateButton>(...)");
        return (BogButton) value;
    }

    /* renamed from: j */
    private final void m112353j() {
        C10463g F = C36546y.m108282F();
        FeedbackType feedbackType = this.f91636h.getFeedbackType();
        String feedbackVersion = this.f91636h.getFeedbackVersion();
        FeatureFeedBackEvent.Location location = this.f91638j;
        F.mo27152s("feedback", feedbackType + "_" + feedbackVersion + "_" + location, "close_after_review");
        m112355l();
        dismiss();
    }

    /* renamed from: k */
    private final void m112354k() {
        dismiss();
        Context context = getContext();
        C41536l.m120488h(context, "context");
        long feedbackId = this.f91636h.getFeedbackId();
        int i = this.f91637i;
        String text = m112351h().getText();
        C41536l.m120488h(text, "input.text");
        new C38207t(context, feedbackId, i, text).show();
    }

    /* renamed from: l */
    private final void m112355l() {
        this.f91573e.setFeatureFeedback(this.f91636h.getFeedbackId(), "CLOSE", Integer.valueOf(this.f91637i), "", new C38188d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo91682b() {
        return C10324m.dialog_describe_feedback;
    }
}
