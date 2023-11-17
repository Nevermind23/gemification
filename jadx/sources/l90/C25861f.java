package l90;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import h80.C24915v;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m90.C26160a;
import o31.C37599g;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.textimagecard.TextImageCardView;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo;
import ue1.C43075l;

/* renamed from: l90.f */
public final class C25861f extends C1819o {

    /* renamed from: f */
    private final C43075l f65841f;

    /* renamed from: l90.f$a */
    public final class C25862a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C24915v f65842d;

        /* renamed from: e */
        final /* synthetic */ C25861f f65843e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25862a(C25861f fVar, C24915v vVar) {
            super(vVar.mo3946b());
            C41536l.m120489i(vVar, "binding");
            this.f65843e = fVar;
            this.f65842d = vVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m81274j(C25861f fVar, OfferInfo offerInfo, View view) {
            C41536l.m120489i(fVar, "this$0");
            C41536l.m120489i(offerInfo, "$offer");
            fVar.mo64648k().invoke(offerInfo);
        }

        /* renamed from: i */
        public final TextImageCardView mo64651i(OfferInfo offerInfo) {
            C41536l.m120489i(offerInfo, "offer");
            TextImageCardView textImageCardView = this.f65842d.f64067e;
            C25861f fVar = this.f65843e;
            textImageCardView.setImage(new Image.Resource(C26160a.m81961a(offerInfo), (Boolean) null, 2, (DefaultConstructorMarker) null));
            textImageCardView.setText(offerInfo.getOfferText());
            Context context = this.itemView.getContext();
            C41536l.m120488h(context, "itemView.context");
            textImageCardView.setCaption(C26160a.m81962b(offerInfo, context));
            textImageCardView.setDescription(offerInfo.getProductName());
            textImageCardView.setOnClickListener(new C25860e(fVar, offerInfo));
            C41536l.m120488h(textImageCardView, "binding.offerItem.apply …          }\n            }");
            return textImageCardView;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25861f(C43075l lVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(lVar, "onOfferClick");
        this.f65841f = lVar;
    }

    /* renamed from: k */
    public final C43075l mo64648k() {
        return this.f65841f;
    }

    /* renamed from: l */
    public void onBindViewHolder(C25862a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object obj = mo6026f().get(i);
        C41536l.m120488h(obj, "currentList[position]");
        aVar.mo64651i((OfferInfo) obj);
    }

    /* renamed from: m */
    public C25862a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C24915v d = C24915v.m79646d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C25862a(this, d);
    }
}
