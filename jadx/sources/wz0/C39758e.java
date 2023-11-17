package wz0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import hy0.C36268b;
import hy0.C36270d;
import hy0.C36274h;
import iy0.C36594f0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.bannercard.BannerCard;
import p341ge.bog.designsystem.components.common.Image;
import ue1.C43064a;

/* renamed from: wz0.e */
public final class C39758e extends RecyclerView.C1734f0 {

    /* renamed from: d */
    private C43064a f94449d;

    /* renamed from: e */
    private C43064a f94450e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39758e(C36594f0 f0Var, boolean z) {
        super(f0Var.mo3946b());
        String str;
        C41536l.m120489i(f0Var, "binding");
        BannerCard c = f0Var.mo3946b();
        if (z) {
            str = f0Var.mo3946b().getContext().getString(C36274h.see_more_solo);
        } else {
            str = f0Var.mo3946b().getContext().getString(C36274h.see_more);
        }
        c.setShowMoreText(str);
        f0Var.mo3946b().setInfoText(C32343x.m95388F("rb.card.protection.desc", new Object[0]));
        f0Var.mo3946b().setShowMoreText(f0Var.mo3946b().getContext().getString(C36274h.product_details_title_card_insurence));
        f0Var.mo3946b().setTintColor(Integer.valueOf(C36268b.f87456h));
        f0Var.mo3946b().setBannerImage(new Image.Resource(C36270d.icons_48_general_insurance_fill, (Boolean) null, 2, (DefaultConstructorMarker) null));
        f0Var.mo3946b().setOnClickListener(new C39756c(this));
        f0Var.mo3946b().setCloseButtonClickListener(new C39757d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m115532j(C39758e eVar, View view) {
        C41536l.m120489i(eVar, "this$0");
        C43064a aVar = eVar.f94449d;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final void m115533k(C39758e eVar, View view) {
        C41536l.m120489i(eVar, "this$0");
        C43064a aVar = eVar.f94450e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: l */
    public final void mo93499l(C43064a aVar) {
        this.f94449d = aVar;
    }

    /* renamed from: m */
    public final void mo93500m(C43064a aVar) {
        this.f94450e = aVar;
    }
}
