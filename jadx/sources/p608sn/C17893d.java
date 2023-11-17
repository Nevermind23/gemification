package p608sn;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1796h;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32289b0;
import g91.C32343x;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o70.C26763b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.cardheader.CardHeaderView;
import p341ge.bog.designsystem.components.common.Image;
import p426fn.C12932f;
import p482jn.C16252e;
import p518mh.C16684a;
import p524mn.C16800a;
import ue1.C43064a;

/* renamed from: sn.d */
public final class C17893d extends C1819o {

    /* renamed from: g */
    public static final C17896c f50919g = new C17896c((DefaultConstructorMarker) null);

    /* renamed from: h */
    private static final C17895b f50920h = new C17895b();

    /* renamed from: f */
    private final C43064a f50921f;

    /* renamed from: sn.d$a */
    public static final class C17894a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C16252e f50922d;

        /* renamed from: e */
        private final C43064a f50923e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17894a(C16252e eVar, C43064a aVar) {
            super(eVar.mo3946b());
            C41536l.m120489i(eVar, "binding");
            C41536l.m120489i(aVar, "openActionSheet");
            this.f50922d = eVar;
            this.f50923e = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m61704j(C17894a aVar, View view) {
            C41536l.m120489i(aVar, "this$0");
            aVar.f50923e.invoke();
        }

        /* renamed from: i */
        public final void mo45576i(C16800a aVar) {
            boolean z;
            String str;
            String c;
            C41536l.m120489i(aVar, "data");
            Context context = this.itemView.getContext();
            this.f50922d.f46052e.setCardAccountNumber("**** " + aVar.mo43920a().mo66047z());
            CardHeaderView cardHeaderView = this.f50922d.f46052e;
            String l = aVar.mo43920a().mo66032l();
            if (l == null || l.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = C32343x.m95388F(aVar.mo43920a().mo65996A(), new Object[0]);
            } else {
                str = aVar.mo43920a().mo66032l();
            }
            cardHeaderView.setCardTitle(str);
            this.f50922d.f46052e.getCardInfoButton().setVisibility(8);
            this.f50922d.f46052e.setShowFavoriteIcon(aVar.mo43920a().mo66013R());
            this.f50922d.f46052e.setShowCardImageBadge(aVar.mo43920a().mo66014S());
            this.f50922d.f46052e.setCardImageBadgeTitle(context.getString(C12932f.card_digital));
            C26763b f = aVar.mo43920a().mo66025f();
            if (!(f == null || (c = f.mo65986c()) == null)) {
                CardHeaderView cardHeaderView2 = this.f50922d.f46052e;
                String c2 = C32289b0.m95091c(c);
                C41536l.m120488h(c2, "generateImageUrl(url)");
                Image.Url url = r6;
                Image.Url url2 = new Image.Url(c2, (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null);
                cardHeaderView2.setCardImage(url);
            }
            this.f50922d.f46052e.setShowCardNotification(false);
            if (aVar.mo43921b()) {
                this.f50922d.f46052e.setSubtitleState(C16684a.NEGATIVE);
                this.f50922d.f46052e.setSubtitleText(context.getString(C12932f.card_blocked));
            } else if (aVar.mo43920a().mo66015T()) {
                this.f50922d.f46052e.setSubtitleState(C16684a.NEGATIVE);
                this.f50922d.f46052e.setSubtitleText(context.getString(C12932f.f38195p));
            } else if (aVar.mo43920a().mo66011P()) {
                this.f50922d.f46052e.setSubtitleState(C16684a.NEGATIVE);
                this.f50922d.f46052e.setSubtitleText(context.getString(C12932f.card_expires_in_prefix) + " " + aVar.mo43920a().mo66039s() + " " + context.getString(C12932f.card_expires_in_suffix));
            } else if (C41536l.m120484d(aVar.mo43920a().mo66010O(), "E")) {
                Button cardInfoButton = this.f50922d.f46052e.getCardInfoButton();
                C32343x.m95447f1(cardInfoButton);
                cardInfoButton.setButtonText(C32343x.m95388F("cards.details.activate.plastic.card", new Object[0]));
                cardInfoButton.setOnClickListener(new C17892c(this));
            } else {
                this.f50922d.f46052e.setSubtitleState(C16684a.INFO);
                this.f50922d.f46052e.setSubtitleText(aVar.mo43920a().mo66008M());
            }
        }
    }

    /* renamed from: sn.d$b */
    public static final class C17895b extends C1796h.C1802f {
        C17895b() {
        }

        /* renamed from: d */
        public boolean mo5976a(C16800a aVar, C16800a aVar2) {
            C41536l.m120489i(aVar, "oldItem");
            C41536l.m120489i(aVar2, "newItem");
            return C41536l.m120484d(aVar, aVar2);
        }

        /* renamed from: e */
        public boolean mo5977b(C16800a aVar, C16800a aVar2) {
            C41536l.m120489i(aVar, "oldItem");
            C41536l.m120489i(aVar2, "newItem");
            if (aVar.mo43920a().mo66030j() == aVar2.mo43920a().mo66030j()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: sn.d$c */
    public static final class C17896c {
        private C17896c() {
        }

        public /* synthetic */ C17896c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17893d(C43064a aVar) {
        super(f50920h);
        C41536l.m120489i(aVar, "openActionSheet");
        this.f50921f = aVar;
    }

    /* renamed from: k */
    public void onBindViewHolder(C17894a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo45576i((C16800a) g);
    }

    /* renamed from: l */
    public C17894a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C16252e d = C16252e.m57944d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …      false\n            )");
        return new C17894a(d, this.f50921f);
    }
}
