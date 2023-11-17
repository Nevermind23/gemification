package g20;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.bannercard.BannerCard;
import p90.C27393p4;
import ue1.C43064a;

/* renamed from: g20.o */
public final class C20626o extends RecyclerView.C1734f0 {

    /* renamed from: g */
    public static final C20627a f55710g = new C20627a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C27393p4 f55711d;

    /* renamed from: e */
    private final C43064a f55712e;

    /* renamed from: f */
    private final C43064a f55713f;

    /* renamed from: g20.o$a */
    public static final class C20627a {
        private C20627a() {
        }

        public /* synthetic */ C20627a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20626o(C27393p4 p4Var, C43064a aVar, C43064a aVar2) {
        super(p4Var.mo3946b());
        C41536l.m120489i(p4Var, "binding");
        C41536l.m120489i(aVar, "onBannerClick");
        C41536l.m120489i(aVar2, "onBannerDismiss");
        this.f55711d = p4Var;
        this.f55712e = aVar;
        this.f55713f = aVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m66924l(C20626o oVar, View view) {
        C41536l.m120489i(oVar, "this$0");
        oVar.f55713f.invoke();
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m66925m(C20626o oVar, View view) {
        C41536l.m120489i(oVar, "this$0");
        oVar.f55712e.invoke();
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m66926n(C20626o oVar, View view) {
        C41536l.m120489i(oVar, "this$0");
        oVar.f55712e.invoke();
    }

    /* renamed from: k */
    public final void mo49175k(boolean z) {
        BannerCard bannerCard = this.f55711d.f69533e;
        bannerCard.setInfoText(C32343x.m95388F("google.pay.banner.description", new Object[0]));
        bannerCard.setShowMoreText(C32343x.m95388F("google.pay.banner.button", new Object[0]));
        bannerCard.setCloseButtonVisible(z);
        bannerCard.setCloseButtonClickListener(new C20621l(this));
        bannerCard.setImageClickListener(new C20624m(this));
        bannerCard.setOnClickListener(new C20625n(this));
    }
}
