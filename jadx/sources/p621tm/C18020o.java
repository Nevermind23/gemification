package p621tm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.creditcard.CreditCardView;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardRenewalListItem;
import p481jm.C16217a0;
import p481jm.C16219b0;
import p615tg.C17963d;
import p660wm.C18637a;

/* renamed from: tm.o */
public final class C18020o extends C1819o {

    /* renamed from: f */
    private final C18637a f51241f;

    /* renamed from: tm.o$a */
    public static abstract class C18021a extends RecyclerView.C1734f0 {

        /* renamed from: tm.o$a$a */
        public static final class C18022a extends C18021a {

            /* renamed from: d */
            private final C16217a0 f51242d;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C18022a(p481jm.C16217a0 r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "binding"
                    kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                    ge.bog.designsystem.components.creditcard.CreditCardView r0 = r3.mo3946b()
                    java.lang.String r1 = "binding.root"
                    kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                    r2.<init>(r0)
                    r2.f51242d = r3
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p621tm.C18020o.C18021a.C18022a.<init>(jm.a0):void");
            }

            /* access modifiers changed from: private */
            /* renamed from: k */
            public static final void m62014k(C18637a aVar, CardRenewalListItem.CardRenewalCardItem cardRenewalCardItem, View view) {
                C41536l.m120489i(aVar, "$listener");
                C41536l.m120489i(cardRenewalCardItem, "$data");
                aVar.mo39055a(cardRenewalCardItem);
            }

            /* renamed from: j */
            public void mo45713h(CardRenewalListItem.CardRenewalCardItem cardRenewalCardItem, C18637a aVar) {
                CardRenewalListItem.CardRenewalCardItem cardRenewalCardItem2 = cardRenewalCardItem;
                C18637a aVar2 = aVar;
                C41536l.m120489i(cardRenewalCardItem2, "data");
                C41536l.m120489i(aVar2, "listener");
                this.f51242d.mo3946b().setOnClickListener(new C18019n(aVar2, cardRenewalCardItem2));
                this.f51242d.mo3946b().setCreditCard(new CreditCardView.C13270b(String.valueOf(cardRenewalCardItem.mo39426d()), cardRenewalCardItem.mo39434i(), (String) null, (String) null, cardRenewalCardItem.mo39430f(), cardRenewalCardItem.mo39428e(), cardRenewalCardItem.mo39424a(), cardRenewalCardItem.mo39425b(), false, false, cardRenewalCardItem.mo39432h(), cardRenewalCardItem.mo39431g(), 268, (DefaultConstructorMarker) null));
            }
        }

        /* renamed from: tm.o$a$b */
        public static final class C18023b extends C18021a {

            /* renamed from: d */
            private final C16219b0 f51243d;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C18023b(p481jm.C16219b0 r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "binding"
                    kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                    ge.bog.designsystem.components.list.ListItem r0 = r3.mo3946b()
                    java.lang.String r1 = "binding.root"
                    kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                    r2.<init>(r0)
                    r2.f51243d = r3
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p621tm.C18020o.C18021a.C18023b.<init>(jm.b0):void");
            }

            /* renamed from: i */
            public void mo45713h(CardRenewalListItem.CardRenewalHeader cardRenewalHeader, C18637a aVar) {
                C41536l.m120489i(cardRenewalHeader, "data");
                C41536l.m120489i(aVar, "listener");
                this.f51243d.f45778f.setText(cardRenewalHeader.mo39442b());
                C16219b0 b0Var = this.f51243d;
                b0Var.f45778f.setTextColor(C0767a.m2893c(b0Var.mo3946b().getContext(), cardRenewalHeader.mo39443d()));
                C16219b0 b0Var2 = this.f51243d;
                b0Var2.f45777e.setButtonIconTint(C0767a.m2894d(b0Var2.mo3946b().getContext(), cardRenewalHeader.mo39443d()));
                C16219b0 b0Var3 = this.f51243d;
                b0Var3.f45777e.setButtonIcon(C0767a.m2895e(b0Var3.mo3946b().getContext(), cardRenewalHeader.mo39441a()));
            }
        }

        /* renamed from: tm.o$a$c */
        public enum C18024c {
            HEADER,
            CARD
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18021a(View view) {
            super(view);
            C41536l.m120489i(view, "root");
        }

        /* renamed from: h */
        public abstract void mo45713h(CardRenewalListItem cardRenewalListItem, C18637a aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18020o(C18637a aVar) {
        super(C17963d.f51158a.mo45633d());
        C41536l.m120489i(aVar, "listener");
        this.f51241f = aVar;
    }

    public int getItemViewType(int i) {
        CardRenewalListItem cardRenewalListItem = (CardRenewalListItem) mo6027g(i);
        if (cardRenewalListItem instanceof CardRenewalListItem.CardRenewalCardItem) {
            return C18021a.C18024c.CARD.ordinal();
        }
        if (cardRenewalListItem instanceof CardRenewalListItem.CardRenewalHeader) {
            return C18021a.C18024c.HEADER.ordinal();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: k */
    public void onBindViewHolder(C18021a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo45713h((CardRenewalListItem) g, this.f51241f);
    }

    /* renamed from: l */
    public C18021a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == C18021a.C18024c.HEADER.ordinal()) {
            C16219b0 d = C16219b0.m57805d(from, viewGroup, false);
            C41536l.m120488h(d, "inflate(inflater, parent, false)");
            return new C18021a.C18023b(d);
        } else if (i == C18021a.C18024c.CARD.ordinal()) {
            C16217a0 d2 = C16217a0.m57797d(from, viewGroup, false);
            C41536l.m120488h(d2, "inflate(inflater, parent, false)");
            return new C18021a.C18022a(d2);
        } else {
            throw new IllegalStateException("Unknown ViewType");
        }
    }
}
