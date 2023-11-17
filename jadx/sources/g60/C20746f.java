package g60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.C0767a;
import f60.C20439a;
import g91.C32289b0;
import g91.C32343x;
import he1.C41217g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.p975ui.views.widgets.FlipImageViewContainer;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10324m;
import p90.C27377n6;
import r90.C27950a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: g60.f */
public final class C20746f extends C20742c {

    /* renamed from: g */
    public static final C20747a f55939g = new C20747a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C41217g f55940d;

    /* renamed from: e */
    private C43075l f55941e;

    /* renamed from: f */
    private C20439a f55942f;

    /* renamed from: g60.f$a */
    public static final class C20747a {
        private C20747a() {
        }

        public /* synthetic */ C20747a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C20746f mo49289a(ViewGroup viewGroup) {
            C41536l.m120489i(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.item_template_provider_provider_swipable, viewGroup, false);
            C41536l.m120488h(inflate, "v");
            return new C20746f(inflate);
        }
    }

    /* renamed from: g60.f$b */
    static final class C20748b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ View f55943d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20748b(View view) {
            super(0);
            this.f55943d = view;
        }

        /* renamed from: b */
        public final C27377n6 invoke() {
            return C27377n6.m84815a(this.f55943d);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20746f(View view) {
        super(view);
        C41536l.m120489i(view, "itemView");
        this.f55940d = C41219i.m119470b(new C20748b(view));
    }

    /* renamed from: i */
    private final C27377n6 m67165i() {
        return (C27377n6) this.f55940d.getValue();
    }

    /* renamed from: j */
    private final PaymentProviderConfiguration m67166j() {
        C20439a aVar = this.f55942f;
        if (aVar != null) {
            return aVar.mo48944b();
        }
        return null;
    }

    /* renamed from: k */
    private final void m67167k() {
        String str;
        m67165i().f69392n.setBackgroundColor(C0767a.m2893c(this.itemView.getContext(), C10318g.f28625J0));
        FlipImageViewContainer flipImageViewContainer = m67165i().f69386h;
        PaymentProviderConfiguration j = m67166j();
        String str2 = null;
        if (j != null) {
            str = j.logo;
        } else {
            str = null;
        }
        flipImageViewContainer.setFrontImageUrl(C32289b0.m95093e(str), C10320i.f28688dc, C10320i.ic_payment_template_default);
        BogTextView bogTextView = m67165i().f69395q;
        PaymentProviderConfiguration j2 = m67166j();
        if (j2 != null) {
            str2 = j2.serviceName;
        }
        bogTextView.setText(C27950a.m86286c(str2, true));
        LinearLayout linearLayout = m67165i().f69383e;
        C41536l.m120488h(linearLayout, "binding.amountWrapper");
        C32343x.m95401L0(linearLayout);
        BogTextView bogTextView2 = m67165i().f69394p;
        C41536l.m120488h(bogTextView2, "binding.templateItemMidDesc");
        C32343x.m95401L0(bogTextView2);
        BogTextView bogTextView3 = m67165i().f69393o;
        C41536l.m120488h(bogTextView3, "binding.templateItemBottomDesc");
        C32343x.m95401L0(bogTextView3);
        BogTextView bogTextView4 = m67165i().f69385g;
        C41536l.m120488h(bogTextView4, "binding.errorTv");
        C32343x.m95401L0(bogTextView4);
        LinearLayout c = m67165i().f69389k.mo3946b();
        C41536l.m120488h(c, "binding.retryGetDebt.root");
        C32343x.m95401L0(c);
        View view = m67165i().f69384f;
        C41536l.m120488h(view, "binding.blurView");
        C32343x.m95401L0(view);
    }

    /* renamed from: n */
    private final void m67168n() {
        this.itemView.setOnClickListener(new C20745e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final void m67169o(C20746f fVar, View view) {
        C43075l lVar;
        C41536l.m120489i(fVar, "this$0");
        C20439a aVar = fVar.f55942f;
        if (aVar != null && (lVar = fVar.f55941e) != null) {
            lVar.invoke(aVar);
        }
    }

    /* renamed from: l */
    public void onBind(C20439a aVar) {
        C41536l.m120489i(aVar, "data");
        this.f55942f = aVar;
        m67167k();
        m67168n();
    }

    /* renamed from: m */
    public final void mo49288m(C43075l lVar) {
        this.f55941e = lVar;
    }
}
