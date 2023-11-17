package g20;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.bannercard.BannerCard;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.mobilebank.cleanarch.junior.presentation.JuniorRequestDataUiModel;
import p366bk.C10320i;
import p90.C27402q4;
import ue1.C43075l;

/* renamed from: g20.t */
public final class C20635t extends RecyclerView.C1734f0 {

    /* renamed from: f */
    public static final C20636a f55728f = new C20636a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C27402q4 f55729d;

    /* renamed from: e */
    private final Context f55730e;

    /* renamed from: g20.t$a */
    public static final class C20636a {
        private C20636a() {
        }

        public /* synthetic */ C20636a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20635t(C27402q4 q4Var, Context context) {
        super(q4Var.mo3946b());
        C41536l.m120489i(q4Var, "binding");
        C41536l.m120489i(context, "context");
        this.f55729d = q4Var;
        this.f55730e = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m66946j(C43075l lVar, JuniorRequestDataUiModel juniorRequestDataUiModel, View view) {
        C41536l.m120489i(lVar, "$openJunior");
        C41536l.m120489i(juniorRequestDataUiModel, "$data");
        lVar.invoke(juniorRequestDataUiModel);
    }

    /* renamed from: i */
    public final void mo49178i(JuniorRequestDataUiModel juniorRequestDataUiModel, C43075l lVar) {
        C41536l.m120489i(juniorRequestDataUiModel, "data");
        C41536l.m120489i(lVar, "openJunior");
        BannerCard c = this.f55729d.mo3946b();
        c.setInfoText(C32343x.m95388F("text.junior.banner.description", new Object[0]));
        c.setShowMoreText(C32343x.m95388F("text.junior.banner.button", new Object[0]));
        c.setBannerImage(new Image.Resource(C10320i.f28700v7, (Boolean) null, 2, (DefaultConstructorMarker) null));
        c.setOnClickListener(new C20634s(lVar, juniorRequestDataUiModel));
    }
}
