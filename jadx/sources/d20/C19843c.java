package d20;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import iu0.C36546y;
import java.util.List;
import k20.C25571a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.loyaltycard.LoyaltyCardView;
import p341ge.bog.mobilebank.cleanarch.domain.home.model.ProductType;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.LoyaltyListActivity;
import p341ge.bog.mobilebank.p975ui.activities.ProductDetailedActivity;
import p366bk.C10322k;
import p366bk.C10324m;
import p642vh.C18368l;
import ue1.C43075l;

/* renamed from: d20.c */
public final class C19843c extends RecyclerView.C1736h {

    /* renamed from: f */
    public static final C19844a f54267f = new C19844a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private List f54268d;

    /* renamed from: e */
    private C43075l f54269e;

    /* renamed from: d20.c$a */
    public static final class C19844a {
        private C19844a() {
        }

        public /* synthetic */ C19844a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: d20.c$b */
    public static final class C19845b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final LoyaltyCardView f54270d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19845b(View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            View findViewById = view.findViewById(C10322k.loyalty_card);
            C41536l.m120488h(findViewById, "itemView.findViewById(R.id.loyalty_card)");
            this.f54270d = (LoyaltyCardView) findViewById;
        }

        /* renamed from: j */
        private final void m65642j(C25571a.C25572a aVar) {
            this.f54270d.setOnClickListener(new C19846d(this, aVar));
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m65643k(C19845b bVar, C25571a.C25572a aVar, View view) {
            C41536l.m120489i(bVar, "this$0");
            C41536l.m120489i(aVar, "$data");
            Intent intent = new Intent(bVar.itemView.getContext(), ProductDetailedActivity.class);
            C36546y.m108282F().mo27152s("home", aVar.mo64148f(), "click_bonus_program_widget");
            if (C41536l.m120484d(aVar.mo64148f(), ProductType.BONUS_PROD_TYPE_SCOOL)) {
                bVar.itemView.getContext().startActivity(new Intent(bVar.itemView.getContext(), LoyaltyListActivity.class));
                return;
            }
            intent.putExtra("PRODUCT_TYPE_KEY", aVar.mo64144b());
            bVar.itemView.getContext().startActivity(intent);
        }

        /* renamed from: i */
        public final void mo48147i(C25571a.C25572a aVar, LoyaltyCardView.C13379b bVar) {
            C41536l.m120489i(aVar, "data");
            C41536l.m120489i(bVar, "cardType");
            LoyaltyCardView loyaltyCardView = this.f54270d;
            loyaltyCardView.setTitle(aVar.mo64147e());
            loyaltyCardView.setText(aVar.mo64146d());
            loyaltyCardView.setDescription(aVar.mo64143a());
            LoyaltyCardView.C13378a aVar2 = null;
            if (aVar.mo64145c() != null) {
                aVar2 = new LoyaltyCardView.C13378a(new Image.Drawable(aVar.mo64145c(), (Boolean) null, 2, (DefaultConstructorMarker) null), Integer.valueOf(C18368l.m62762k(44)));
            }
            loyaltyCardView.setLogo(aVar2);
            loyaltyCardView.setType(bVar);
            m65642j(aVar);
        }
    }

    public C19843c(List list) {
        C41536l.m120489i(list, "simpleBonusProgramList");
        mo48146i(list);
    }

    /* renamed from: f */
    public final C43075l mo48143f() {
        return this.f54269e;
    }

    /* renamed from: g */
    public void onBindViewHolder(C19845b bVar, int i) {
        LoyaltyCardView.C13379b bVar2;
        C41536l.m120489i(bVar, "holder");
        if (this.f54268d != null) {
            if (getItemCount() == 1) {
                bVar2 = LoyaltyCardView.C13379b.SINGLE;
            } else {
                bVar2 = LoyaltyCardView.C13379b.MULTIPLE;
            }
            List list = this.f54268d;
            if (list == null) {
                C41536l.m120506z("bonusProgramList");
                list = null;
            }
            bVar.mo48147i((C25571a.C25572a) list.get(i), bVar2);
        }
    }

    public int getItemCount() {
        List list = this.f54268d;
        if (list == null) {
            C41536l.m120506z("bonusProgramList");
            list = null;
        }
        return list.size();
    }

    /* renamed from: h */
    public C19845b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.home_bonus_points_single_view, viewGroup, false);
        int measuredWidth = viewGroup.getMeasuredWidth() - C32343x.m95394I(32);
        C41536l.m120488h(inflate, "view");
        ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        if (layoutParams != null) {
            List list = this.f54268d;
            if (list == null) {
                C41536l.m120506z("bonusProgramList");
                list = null;
            }
            int size = list.size();
            if (size != 1) {
                if (size != 2) {
                    measuredWidth = (measuredWidth - C32343x.m95394I(20)) / 2;
                } else {
                    measuredWidth = (measuredWidth - C32343x.m95394I(8)) / 2;
                }
            }
            layoutParams.width = measuredWidth;
            inflate.setLayoutParams(layoutParams);
            return new C19845b(inflate);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* renamed from: i */
    public final void mo48146i(List list) {
        C41536l.m120489i(list, "data");
        this.f54268d = list;
    }
}
