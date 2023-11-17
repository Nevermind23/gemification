package qi0;

import android.view.View;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mj0.C26238b;
import oi0.C27019e;
import p341ge.bog.designsystem.components.bannercard.BannerCard;
import pi0.C27534a;
import th0.C28423r0;

/* renamed from: qi0.t */
public final class C27834t extends C26238b {

    /* renamed from: g */
    public static final C27835a f70963g = new C27835a((DefaultConstructorMarker) null);

    /* renamed from: f */
    private final C27019e f70964f;

    /* renamed from: qi0.t$a */
    public static final class C27835a {
        private C27835a() {
        }

        public /* synthetic */ C27835a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27834t(C28423r0 r0Var, C27019e eVar) {
        super(r0Var);
        C41536l.m120489i(r0Var, "binding");
        C41536l.m120489i(eVar, "listener");
        this.f70964f = eVar;
        BannerCard bannerCard = r0Var.f72198e;
        bannerCard.setInfoText(C32343x.m95388F("giftcard.owner.wallet.info.android", new Object[0]));
        bannerCard.setShowMoreText(C32343x.m95388F("google.pay.banner.button", new Object[0]));
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static final void m86022q(C27834t tVar, View view) {
        C41536l.m120489i(tVar, "this$0");
        tVar.f70964f.mo61791b();
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static final void m86023r(C27834t tVar, View view) {
        C41536l.m120489i(tVar, "this$0");
        tVar.f70964f.mo61796x0();
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static final void m86024s(C27834t tVar, View view) {
        C41536l.m120489i(tVar, "this$0");
        tVar.f70964f.mo61796x0();
    }

    /* renamed from: p */
    public void mo48397j(C27534a.C27544i iVar) {
        C41536l.m120489i(iVar, "item");
        BannerCard bannerCard = ((C28423r0) mo65241h()).f72198e;
        super.mo48397j(iVar);
        bannerCard.setCloseButtonVisible(iVar.mo66903a());
        bannerCard.setCloseButtonClickListener(new C27831q(this));
        bannerCard.setImageClickListener(new C27832r(this));
        bannerCard.setOnClickListener(new C27833s(this));
    }
}
