package jo0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37599g;
import p341ge.bog.designsystem.components.categorycard.CategoryCardView;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.offer.model.OfferProgressCardUiModel;
import sn0.C17897a;
import so0.C17908d;
import xn0.C18859q;

/* renamed from: jo0.d */
public final class C16307d extends C1819o {

    /* renamed from: f */
    private final C17908d f46133f;

    /* renamed from: jo0.d$a */
    public static final class C16308a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C18859q f46134d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16308a(C18859q qVar) {
            super(qVar.mo3946b());
            C41536l.m120489i(qVar, "binding");
            this.f46134d = qVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m58110j(C17908d dVar, OfferProgressCardUiModel offerProgressCardUiModel, View view) {
            C41536l.m120489i(offerProgressCardUiModel, "$data");
            if (dVar != null) {
                dVar.mo42500a(offerProgressCardUiModel.mo42019b());
            }
        }

        /* renamed from: i */
        public final void mo43292i(OfferProgressCardUiModel offerProgressCardUiModel, C17908d dVar) {
            C41536l.m120489i(offerProgressCardUiModel, "data");
            CategoryCardView categoryCardView = this.f46134d.f52772e;
            categoryCardView.setBackgroundColor(offerProgressCardUiModel.mo42019b().mo43674b());
            categoryCardView.setImageBackgroundColor(new Color.Attribute(C17897a.f50924a));
            categoryCardView.setText(offerProgressCardUiModel.mo42018a());
            categoryCardView.setImage(new Image.Resource(offerProgressCardUiModel.mo42019b().mo43677f(), (Boolean) null, 2, (DefaultConstructorMarker) null));
            Integer h = offerProgressCardUiModel.mo42019b().mo43679h();
            if (h != null) {
                categoryCardView.setImageTint(new Color.Resource(h.intValue()));
            }
            categoryCardView.setOnClickListener(new C16306c(dVar, offerProgressCardUiModel));
        }
    }

    public C16307d(C17908d dVar) {
        super(C37599g.f90345a.mo90787d());
        this.f46133f = dVar;
    }

    /* renamed from: k */
    public void onBindViewHolder(C16308a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object obj = mo6026f().get(i);
        C41536l.m120488h(obj, "currentList[position]");
        aVar.mo43292i((OfferProgressCardUiModel) obj, this.f46133f);
    }

    /* renamed from: l */
    public C16308a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C18859q d = C18859q.m63807d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n            Lay…          false\n        )");
        return new C16308a(d);
    }
}
