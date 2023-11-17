package ho0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import go0.C15412q;
import go0.C15413r;
import go0.C15414s;
import he1.C41238w;
import iu0.C36546y;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jo0.C16307d;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nc1.C41772a;
import o31.C37599g;
import o31.C37608o;
import o31.C37621w;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.categorycard.CategoryCardView;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.dynamicthumbnailcard.DynamicThumbnailCardView;
import p341ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.offer.model.OfferProgressCardUiModel;
import p380ck.C10464h;
import ro0.C17708g;
import ro0.C17709h;
import sn0.C17898b;
import sn0.C17899c;
import sn0.C17900d;
import so0.C17905a;
import so0.C17906b;
import so0.C17907c;
import so0.C17908d;
import uo0.C18269a;
import uo0.C18274f;
import xn0.C18862t;
import xn0.C18863u;
import xn0.C18864v;
import xn0.C18865w;
import xn0.C18866x;
import xn0.C18867y;

/* renamed from: ho0.i */
public final class C15569i extends C1819o {

    /* renamed from: p */
    public static final C15573d f44220p = new C15573d((DefaultConstructorMarker) null);

    /* renamed from: f */
    private final Map f44221f = new LinkedHashMap();

    /* renamed from: g */
    private final RecyclerView.C1757v f44222g = new RecyclerView.C1757v();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C15413r f44223h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C15414s f44224i;

    /* renamed from: j */
    private C17906b f44225j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C15412q f44226k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C17905a f44227l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C15583q f44228m;

    /* renamed from: n */
    private C17908d f44229n;

    /* renamed from: o */
    private C17907c f44230o;

    /* renamed from: ho0.i$a */
    public final class C15570a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C18862t f44231d;

        /* renamed from: e */
        final /* synthetic */ C15569i f44232e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15570a(C15569i iVar, C18862t tVar) {
            super(tVar.mo3946b());
            C41536l.m120489i(tVar, "binding");
            this.f44232e = iVar;
            this.f44231d = tVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public static final void m56246l(C15569i iVar, View view) {
            C41536l.m120489i(iVar, "this$0");
            C15583q o = iVar.f44228m;
            if (o != null) {
                o.mo42499a();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public static final void m56247m(C15569i iVar) {
            C41536l.m120489i(iVar, "this$0");
            C15583q o = iVar.f44228m;
            if (o != null) {
                o.mo42499a();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public static final void m56248n(C15569i iVar, View view) {
            C41536l.m120489i(iVar, "this$0");
            C15583q o = iVar.f44228m;
            if (o != null) {
                o.mo42499a();
            }
        }

        /* renamed from: k */
        public final void mo42816k(C18274f.C18275a aVar) {
            C41536l.m120489i(aVar, "data");
            DynamicThumbnailCardView dynamicThumbnailCardView = this.f44231d.f52778e;
            C15569i iVar = this.f44232e;
            dynamicThumbnailCardView.mo35702n();
            String str = null;
            dynamicThumbnailCardView.setLogo(new Image.Resource(C17900d.f50938c, (Boolean) null, 2, (DefaultConstructorMarker) null));
            dynamicThumbnailCardView.setBottomText(C32343x.m95388F("BNPL.button.label.catalog", new Object[0]));
            if (aVar.mo45972d()) {
                String c = aVar.mo45971c();
                if (c != null) {
                    C41772a aVar2 = C41772a.f98076a;
                    String e = aVar.mo45973e();
                    if (e == null) {
                        e = "GEL";
                    }
                    str = aVar2.mo96594a(c, e);
                }
                dynamicThumbnailCardView.setTitle(str);
                dynamicThumbnailCardView.setDescription(C32343x.m95388F("text.bnpl.limit.banner.text", new Object[0]));
                dynamicThumbnailCardView.setTitleColor(new Color.Resource(C17898b.f50926c));
                dynamicThumbnailCardView.setTitleSize(DynamicThumbnailCardView.C13325c.REGULAR);
            } else {
                dynamicThumbnailCardView.setTitle(C32343x.m95388F("text.bnpl.no.limit.banner.header", new Object[0]));
                dynamicThumbnailCardView.setDescription(C32343x.m95388F("text.bnpl.no.limit.banner.text", new Object[0]));
                dynamicThumbnailCardView.setTitleColor(new Color.Resource(C17898b.f50928e));
                dynamicThumbnailCardView.setTitleSize(DynamicThumbnailCardView.C13325c.SMALL);
            }
            dynamicThumbnailCardView.setImagesTop(aVar.mo45976g());
            dynamicThumbnailCardView.setImagesBottom(aVar.mo45975f());
            dynamicThumbnailCardView.setOnClickListener(new C15566f(iVar));
            dynamicThumbnailCardView.setOnBottomTextClickListener(new C15567g(iVar));
            dynamicThumbnailCardView.setOnClickListener(new C15568h(iVar));
            dynamicThumbnailCardView.mo35701m();
        }

        /* renamed from: o */
        public final void mo42817o() {
            this.f44231d.f52778e.mo35701m();
        }
    }

    /* renamed from: ho0.i$b */
    public final class C15571b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C18863u f44233d;

        /* renamed from: e */
        private final Context f44234e;

        /* renamed from: f */
        private final int f44235f;

        /* renamed from: g */
        private final C15561b f44236g;

        /* renamed from: h */
        private final C37621w f44237h;

        /* renamed from: i */
        private final C37608o f44238i;

        /* renamed from: j */
        private final LinearLayoutManager f44239j;

        /* renamed from: k */
        final /* synthetic */ C15569i f44240k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15571b(C15569i iVar, C18863u uVar) {
            super(uVar.mo3946b());
            LinearLayoutManager linearLayoutManager;
            C15569i iVar2 = iVar;
            C18863u uVar2 = uVar;
            C41536l.m120489i(uVar2, "binding");
            this.f44240k = iVar2;
            this.f44233d = uVar2;
            Context context = this.itemView.getContext();
            this.f44234e = context;
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(C17899c.f50936a);
            this.f44235f = dimensionPixelOffset;
            C15561b bVar = new C15561b();
            this.f44236g = bVar;
            C37621w wVar = new C37621w(dimensionPixelOffset, 0, 0, 2, (DefaultConstructorMarker) null);
            this.f44237h = wVar;
            C37608o oVar = new C37608o(8388611, false, (C37608o.C37610b) null, 6, (DefaultConstructorMarker) null);
            this.f44238i = oVar;
            RecyclerView.C1747p layoutManager = uVar2.f52784i.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                linearLayoutManager = (LinearLayoutManager) layoutManager;
            } else {
                linearLayoutManager = null;
            }
            this.f44239j = linearLayoutManager;
            Button button = uVar2.f52780e;
            button.setOnClickListener(new C15575j(iVar2));
            button.setButtonText(C32343x.m95388F("life.style.offers.main.page.recommended.offers.all.button.label", new Object[0]));
            bVar.mo42804n(new C15576k(iVar2));
            if (linearLayoutManager != null) {
                linearLayoutManager.mo5202Q2(5);
            }
            RecyclerView recyclerView = uVar2.f52784i;
            recyclerView.setHasFixedSize(true);
            recyclerView.mo5351j(wVar);
            recyclerView.setAdapter(bVar);
            oVar.mo6073b(uVar2.f52784i);
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m56253j(C15569i iVar, Long l, Integer num) {
            C41536l.m120489i(iVar, "this$0");
            C17905a p = iVar.f44227l;
            if (p != null) {
                p.mo32993a(l, num);
            }
        }

        /* renamed from: l */
        private final int m56254l(Context context, int i) {
            return C0767a.m2893c(context, i);
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public static final void m56255m(C15569i iVar, View view) {
            C41536l.m120489i(iVar, "this$0");
            C15412q n = iVar.f44226k;
            if (n != null) {
                n.mo42496a();
            }
            C36546y.m108282F().mo27137H("life_style_offers", "CLICK_LIFESTYLE_OFFERS_ALL_CATEGORIES", "LIFESTYLE_OFFERS_ALL_CATEGORIES", (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
        }

        /* renamed from: k */
        public final void mo42818k(C18274f.C18276b bVar) {
            C41536l.m120489i(bVar, "data");
            this.f44233d.f52781f.setTitle(C32343x.m95388F("life.style.offers.main.page.categories.block.header", new Object[0]));
            this.f44236g.mo6029i(bVar.mo45979c());
            C18269a d = bVar.mo45980d();
            LayerView layerView = this.f44233d.f52782g;
            Context context = this.f44234e;
            C41536l.m120488h(context, "context");
            layerView.setBackgroundColor(m56254l(context, d.mo45919a()));
            ImageView imageView = this.f44233d.f52783h;
            Context context2 = this.f44234e;
            C41536l.m120488h(context2, "context");
            imageView.setColorFilter(m56254l(context2, d.mo45920b()), PorterDuff.Mode.SRC_IN);
            this.f44233d.f52781f.setTitleTextColor(new Color.Resource(d.mo45921c()));
        }
    }

    /* renamed from: ho0.i$c */
    public final class C15572c extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C18864v f44241d;

        /* renamed from: e */
        final /* synthetic */ C15569i f44242e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15572c(C15569i iVar, C18864v vVar) {
            super(vVar.mo3946b());
            C41536l.m120489i(vVar, "binding");
            this.f44242e = iVar;
            this.f44241d = vVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m56259k(C15569i iVar, View view) {
            C41536l.m120489i(iVar, "this$0");
            C15413r q = iVar.f44223h;
            if (q != null) {
                q.mo42497a();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public static final void m56260l(C15569i iVar, C15572c cVar, View view) {
            C41536l.m120489i(iVar, "this$0");
            C41536l.m120489i(cVar, "this$1");
            List f = iVar.mo6026f();
            C41536l.m120488h(f, "currentList");
            List B0 = C41358y.m119991B0(f);
            B0.remove((C18274f) iVar.mo6026f().get(cVar.getLayoutPosition()));
            iVar.mo6029i(new ArrayList(B0));
            C15414s r = iVar.f44224i;
            if (r != null) {
                r.mo42498a();
            }
        }

        /* renamed from: j */
        public final void mo42819j() {
            InlineFeedback2 inlineFeedback2 = this.f44241d.f52786e;
            C15569i iVar = this.f44242e;
            inlineFeedback2.setTitle(C32343x.m95388F("life.style.chooser.main.text", new Object[0]));
            inlineFeedback2.setButtonText(C32343x.m95388F("life.style.chooser.main.button.label", new Object[0]));
            inlineFeedback2.setButtonVisible(true);
            inlineFeedback2.setCloseVisible(true);
            inlineFeedback2.setStatus(InlineFeedback2.C13350a.POSITIVE);
            inlineFeedback2.setOnButtonClicked(new C15577l(iVar));
            inlineFeedback2.setOnCloseClicked(new C15578m(iVar, this));
        }
    }

    /* renamed from: ho0.i$d */
    public static final class C15573d {
        private C15573d() {
        }

        public /* synthetic */ C15573d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ho0.i$e */
    public static final class C15574e extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C18867y f44243d;

        /* renamed from: e */
        private final C17908d f44244e;

        /* renamed from: f */
        private final C16307d f44245f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15574e(C18867y yVar, C17908d dVar) {
            super(yVar.mo3946b());
            C41536l.m120489i(yVar, "binding");
            this.f44243d = yVar;
            this.f44244e = dVar;
            C16307d dVar2 = new C16307d(dVar);
            this.f44245f = dVar2;
            RecyclerView recyclerView = yVar.f52798f;
            Resources resources = this.itemView.getResources();
            int i = C17899c.f50936a;
            recyclerView.mo5351j(new C37621w(resources.getDimensionPixelSize(i), this.itemView.getResources().getDimensionPixelSize(i), 0));
            recyclerView.setAdapter(dVar2);
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m56263j(C15574e eVar, OfferProgressCardUiModel offerProgressCardUiModel, View view) {
            C41536l.m120489i(eVar, "this$0");
            C41536l.m120489i(offerProgressCardUiModel, "$offer");
            C17908d dVar = eVar.f44244e;
            if (dVar != null) {
                dVar.mo42500a(offerProgressCardUiModel.mo42019b());
            }
        }

        /* renamed from: i */
        public final Object mo42820i(C18274f.C18279e eVar) {
            C41536l.m120489i(eVar, "data");
            C18867y yVar = this.f44243d;
            boolean z = true;
            if (eVar.mo45995c().size() != 1) {
                z = false;
            }
            yVar.f52800h.setTitle(C32343x.m95388F("life.style.campaign.block.header", new Object[0]));
            yVar.f52797e.setText(C32343x.m95388F("life.style.campaign.block.explanatory.text", new Object[0]));
            RecyclerView recyclerView = yVar.f52798f;
            C41536l.m120488h(recyclerView, "recyclerView");
            C32343x.m95483r1(recyclerView, !z, false, 2, (Object) null);
            CategoryCardView categoryCardView = yVar.f52799g;
            C41536l.m120488h(categoryCardView, "singleCard");
            C32343x.m95483r1(categoryCardView, z, false, 2, (Object) null);
            if (z) {
                OfferProgressCardUiModel offerProgressCardUiModel = (OfferProgressCardUiModel) C41358y.m120007W(eVar.mo45995c());
                CategoryCardView categoryCardView2 = yVar.f52799g;
                categoryCardView2.setBackgroundColor(offerProgressCardUiModel.mo42019b().mo43674b());
                categoryCardView2.setText(offerProgressCardUiModel.mo42018a());
                categoryCardView2.setImage(new Image.Resource(offerProgressCardUiModel.mo42019b().mo43677f(), (Boolean) null, 2, (DefaultConstructorMarker) null));
                Integer h = offerProgressCardUiModel.mo42019b().mo43679h();
                if (h != null) {
                    categoryCardView2.setImageTint(new Color.Resource(h.intValue()));
                }
                categoryCardView2.setOnClickListener(new C15579n(this, offerProgressCardUiModel));
                C41536l.m120488h(categoryCardView2, "{\n                val of…          }\n            }");
                return categoryCardView2;
            }
            this.f44245f.mo6029i(eVar.mo45995c());
            return C41238w.f97225a;
        }
    }

    public C15569i() {
        super(C37599g.f90345a.mo90787d());
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static final void m56232s(C15569i iVar, long j, String str, boolean z) {
        C41536l.m120489i(iVar, "this$0");
        C17906b bVar = iVar.f44225j;
        if (bVar != null) {
            bVar.mo32992a(j, str, z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static final void m56233t(C15569i iVar, Long l, Integer num) {
        C41536l.m120489i(iVar, "this$0");
        C17905a aVar = iVar.f44227l;
        if (aVar != null) {
            aVar.mo32993a(l, num);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static final void m56234u(C15569i iVar, long j, Integer num) {
        C41536l.m120489i(iVar, "this$0");
        C17907c cVar = iVar.f44230o;
        if (cVar != null) {
            cVar.mo33005a(j, num);
        }
    }

    /* renamed from: A */
    public final void mo42808A(C17906b bVar) {
        this.f44225j = bVar;
    }

    /* renamed from: B */
    public final void mo42809B(C17907c cVar) {
        this.f44230o = cVar;
    }

    /* renamed from: C */
    public final void mo42810C(C17908d dVar) {
        this.f44229n = dVar;
    }

    public int getItemViewType(int i) {
        return ((C18274f) mo6027g(i)).mo45969a();
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        C41536l.m120489i(f0Var, "holder");
        C18274f fVar = (C18274f) mo6027g(i);
        if (f0Var instanceof C15572c) {
            if (fVar instanceof C18274f.C18277c) {
                ((C15572c) f0Var).mo42819j();
            }
        } else if (f0Var instanceof C17709h) {
            if (fVar instanceof C18274f.C18280f) {
                ((C17709h) f0Var).mo45275h(((C18274f.C18280f) fVar).mo45999c());
            }
        } else if (f0Var instanceof C17708g) {
            if (fVar instanceof C18274f.C18278d) {
                ((C17708g) f0Var).mo45272i((C18274f.C18278d) fVar, (Parcelable) this.f44221f.get(fVar.mo45970b()));
            }
        } else if (f0Var instanceof C15571b) {
            if (fVar instanceof C18274f.C18276b) {
                ((C15571b) f0Var).mo42818k((C18274f.C18276b) fVar);
            }
        } else if (f0Var instanceof C15570a) {
            if (fVar instanceof C18274f.C18275a) {
                ((C15570a) f0Var).mo42816k((C18274f.C18275a) fVar);
            }
        } else if ((f0Var instanceof C15574e) && (fVar instanceof C18274f.C18279e)) {
            ((C15574e) f0Var).mo42820i((C18274f.C18279e) fVar);
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == C18274f.C18281g.CHOOSER_POPUP.ordinal()) {
            C18864v d = C18864v.m63827d(from, viewGroup, false);
            C41536l.m120488h(d, "inflate(inflater, parent, false)");
            return new C15572c(this, d);
        } else if (i == C18274f.C18281g.SLIDER.ordinal()) {
            C18866x d2 = C18866x.m63835d(from, viewGroup, false);
            C41536l.m120488h(d2, "inflate(inflater, parent, false)");
            return new C17709h(d2, this.f44225j);
        } else if (i == C18274f.C18281g.OFFERS.ordinal()) {
            C18865w d3 = C18865w.m63831d(from, viewGroup, false);
            RecyclerView.C1757v vVar = this.f44222g;
            C15563c cVar = new C15563c(this);
            C15564d dVar = new C15564d(this);
            C15565e eVar = new C15565e(this);
            C41536l.m120488h(d3, "inflate(inflater, parent, false)");
            return new C17708g(d3, vVar, cVar, eVar, dVar);
        } else if (i == C18274f.C18281g.CATEGORIES.ordinal()) {
            C18863u d4 = C18863u.m63823d(from, viewGroup, false);
            C41536l.m120488h(d4, "inflate(inflater, parent, false)");
            return new C15571b(this, d4);
        } else if (i == C18274f.C18281g.BNPL.ordinal()) {
            C18862t d5 = C18862t.m63819d(from, viewGroup, false);
            C41536l.m120488h(d5, "inflate(inflater, parent, false)");
            return new C15570a(this, d5);
        } else if (i == C18274f.C18281g.PROGRESS_OFFERS.ordinal()) {
            C18867y d6 = C18867y.m63839d(from, viewGroup, false);
            C41536l.m120488h(d6, "inflate(inflater, parent, false)");
            return new C15574e(d6, this.f44229n);
        } else {
            throw new IllegalStateException("Unknown View Type: " + i);
        }
    }

    public void onViewAttachedToWindow(RecyclerView.C1734f0 f0Var) {
        C41536l.m120489i(f0Var, "holder");
        super.onViewAttachedToWindow(f0Var);
        if (f0Var instanceof C15570a) {
            ((C15570a) f0Var).mo42817o();
        }
    }

    public void onViewRecycled(RecyclerView.C1734f0 f0Var) {
        Parcelable parcelable;
        C41536l.m120489i(f0Var, "holder");
        super.onViewRecycled(f0Var);
        if (f0Var instanceof C17708g) {
            try {
                String b = ((C18274f) mo6027g(((C17708g) f0Var).getBindingAdapterPosition())).mo45970b();
                Map map = this.f44221f;
                RecyclerView.C1747p layoutManager = ((C17708g) f0Var).mo45273k().f52792i.getLayoutManager();
                if (layoutManager != null) {
                    parcelable = layoutManager.mo5220o1();
                } else {
                    parcelable = null;
                }
                map.put(b, parcelable);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: v */
    public final void mo42811v(C15412q qVar) {
        this.f44226k = qVar;
    }

    /* renamed from: w */
    public final void mo42812w(C15583q qVar) {
        this.f44228m = qVar;
    }

    /* renamed from: x */
    public final void mo42813x(C17905a aVar) {
        this.f44227l = aVar;
    }

    /* renamed from: y */
    public final void mo42814y(C15413r rVar) {
        this.f44223h = rVar;
    }

    /* renamed from: z */
    public final void mo42815z(C15414s sVar) {
        this.f44224i = sVar;
    }
}
