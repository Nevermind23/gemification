package q81;

import android.content.Context;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import com.bumptech.glide.C2379b;
import g91.C32355x0;
import he1.C41217g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogImageView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.rest.model.RestCallback;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import ue1.C43064a;

/* renamed from: q81.t */
public final class C38207t extends C38160a {

    /* renamed from: h */
    private final long f91671h;

    /* renamed from: i */
    private final int f91672i;

    /* renamed from: j */
    private final String f91673j;

    /* renamed from: k */
    private final C41217g f91674k = C41219i.m119470b(new C38208a(this));

    /* renamed from: l */
    private final C41217g f91675l = C41219i.m119470b(new C38209b(this));

    /* renamed from: q81.t$a */
    static final class C38208a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C38207t f91676d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38208a(C38207t tVar) {
            super(0);
            this.f91676d = tVar;
        }

        /* renamed from: b */
        public final BogImageView invoke() {
            return (BogImageView) this.f91676d.findViewById(C10322k.iconIV);
        }
    }

    /* renamed from: q81.t$b */
    static final class C38209b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C38207t f91677d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38209b(C38207t tVar) {
            super(0);
            this.f91677d = tVar;
        }

        /* renamed from: b */
        public final BogTextView invoke() {
            return (BogTextView) this.f91677d.findViewById(C10322k.messageTV);
        }
    }

    /* renamed from: q81.t$c */
    public static final class C38210c extends RestCallback {
        C38210c() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38207t(Context context, long j, int i, String str) {
        super(context);
        WindowManager.LayoutParams layoutParams;
        C41536l.m120489i(context, "context");
        C41536l.m120489i(str, "comment");
        this.f91671h = j;
        this.f91672i = i;
        this.f91673j = str;
        Window window = getWindow();
        if (window != null) {
            layoutParams = window.getAttributes();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.width = C32355x0.m95521l(context) - C32355x0.m95510a(80.0f);
        }
        m112399g();
        m112398f();
    }

    /* renamed from: d */
    private final BogImageView m112396d() {
        Object value = this.f91674k.getValue();
        C41536l.m120488h(value, "<get-iconIV>(...)");
        return (BogImageView) value;
    }

    /* renamed from: e */
    private final BogTextView m112397e() {
        Object value = this.f91675l.getValue();
        C41536l.m120488h(value, "<get-messageTV>(...)");
        return (BogTextView) value;
    }

    /* renamed from: f */
    private final void m112398f() {
        this.f91573e.setFeatureFeedback(this.f91671h, "RATE", Integer.valueOf(this.f91672i), this.f91673j, new C38210c());
    }

    /* renamed from: g */
    private final void m112399g() {
        C2379b.m9210t(getContext()).mo7755w(Integer.valueOf(C10320i.ic_result_success)).mo7718L0(m112396d());
        new Handler().postDelayed(new C38206s(this), 5000);
        m112397e().setText(getContext().getString(C10328q.feedback_success_message));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final void m112400h(C38207t tVar) {
        C41536l.m120489i(tVar, "this$0");
        tVar.dismiss();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo91682b() {
        return C10324m.dialog_success_feedback;
    }
}
