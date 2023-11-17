package p341ge.bog.mobilebank.cardproducts.presentation.carddetail;

import a81.C30722p;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.activity.result.C0173b;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.viewpager2.widget.ViewPager2;
import b41.C31128a;
import b41.C31132b;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.issuer.ViewTokenRequest;
import com.salesforce.marketingcloud.C11398b;
import ek0.C20262b;
import g91.C32312j;
import g91.C32343x;
import hc1.C41143c;
import hc1.C41185v;
import he1.C41212c;
import he1.C41217g;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import hy0.C36270d;
import iu0.C36546y;
import j21.C36699b;
import java.util.List;
import jg1.C41438c;
import jg1.C41452l;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import m41.C37224b;
import o31.C37588a0;
import o31.C37613p;
import p163m0.C7047a;
import p313x7.C8973b;
import p341ge.bog.designsystem.components.bannercard.BannerCard;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.mobilebank.cardproducts.presentation.carddetail.C14335a;
import p341ge.bog.mobilebank.cardproducts.presentation.carddetail.C14337b;
import p341ge.bog.mobilebank.cardproducts.presentation.carddetail.model.AdditionalFunctionType;
import p341ge.bog.mobilebank.cardproducts.presentation.carddetail.model.C14391a;
import p341ge.bog.mobilebank.cleanarch.junior.presentation.JuniorRequestDataUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ScrollingPagerIndicator;
import p341ge.bog.mobilebank.cleanarch.shareddomain.model.cards.CardInsSecCardModel;
import p341ge.bog.mobilebank.eventbus.events.CardSecurityUpdateEvent;
import p341ge.bog.mobilebank.model.cards.DigitalCardInfo;
import p341ge.bog.mobilebank.p975ui.activities.ThreeDSecurityActivity;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.model.GooglePayState;
import p341ge.bog.mobilebank.shared.cards.presentation.scoolcardlimitchooser.model.CardDailyLimitUiModel;
import p341ge.bog.mobilebank.shared.navigation.NavigatorConstants$JuniorFlow;
import p341ge.bog.mobilebank.shared2.network.ApiError;
import p380ck.C10457a;
import p380ck.C10464h;
import p420fh.C12902d;
import p420fh.C12910e;
import p426fn.C12928b;
import p426fn.C12929c;
import p426fn.C12931e;
import p426fn.C12932f;
import p482jn.C16250c;
import p524mn.C16800a;
import p566pn.C17393a0;
import p566pn.C17395b0;
import p566pn.C17397c0;
import p566pn.C17399d0;
import p566pn.C17401e0;
import p566pn.C17403f0;
import p566pn.C17405g0;
import p566pn.C17407h0;
import p566pn.C17409i0;
import p566pn.C17411j0;
import p566pn.C17424v;
import p566pn.C17425w;
import p566pn.C17426x;
import p566pn.C17427y;
import p566pn.C17428z;
import p580qn.C17540a;
import p608sn.C17887b;
import p608sn.C17893d;
import p622tn.C18030a;
import p622tn.C18031b;
import p622tn.C18035c;
import p648vn.C18443d;
import p674xm.C18795c;
import p689yn.C18961d;
import p745er.C20288a;
import p920vq.C29133c;
import q31.C38122f;
import q31.C38125h;
import tz0.C38903a;
import ue1.C43064a;
import ue1.C43075l;
import xy0.C39938b0;
import y60.C29932d;

/* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity */
public final class CardsDetailActivity extends C14378m implements C41185v.C41186a {

    /* renamed from: V */
    public static final C14281a f41939V = new C14281a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: G */
    public C16250c f41940G;

    /* renamed from: H */
    public C8973b f41941H;

    /* renamed from: I */
    public C14337b.C14342d f41942I;

    /* renamed from: J */
    public C41438c f41943J;

    /* renamed from: K */
    public PreferencesApiManager f41944K;

    /* renamed from: L */
    private final C41217g f41945L = new C1617p0(C41520a0.m120436b(C14337b.class), new C14319p0(this), new C14323r0(this), new C14321q0((C43064a) null, this));
    /* access modifiers changed from: private */

    /* renamed from: M */
    public C18030a f41946M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public String f41947N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public long f41948O = -1;

    /* renamed from: P */
    private boolean f41949P = true;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public final C17893d f41950Q = new C17893d(new C14285b(this));

    /* renamed from: R */
    private final C17887b f41951R = new C17887b();

    /* renamed from: S */
    private final C17887b f41952S = new C17887b();

    /* renamed from: T */
    private final C14309l0 f41953T = new C14309l0(this);

    /* renamed from: U */
    private final C30722p f41954U = C30722p.CARD_DETAILS;

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$a */
    public static final class C14281a {

        /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$a$a */
        /* synthetic */ class C14282a extends C41535k implements C43075l {
            C14282a(Object obj) {
                super(1, obj, Context.class, "startActivity", "startActivity(Landroid/content/Intent;)V", 0);
            }

            /* renamed from: b */
            public final void mo40040b(Intent intent) {
                ((Context) this.receiver).startActivity(intent);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo40040b((Intent) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$a$b */
        /* synthetic */ class C14283b extends C41535k implements C43075l {
            C14283b(Object obj) {
                super(1, obj, C0173b.class, "launch", "launch(Ljava/lang/Object;)V", 0);
            }

            /* renamed from: b */
            public final void mo40041b(Intent intent) {
                ((C0173b) this.receiver).mo404a(intent);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo40041b((Intent) obj);
                return C41238w.f97225a;
            }
        }

        private C14281a() {
        }

        public /* synthetic */ C14281a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo40039a(Context context, long j, C0173b bVar) {
            C43075l lVar;
            C41536l.m120489i(context, "context");
            Intent a = C37613p.m110614a(new Intent(context, CardsDetailActivity.class), C41233s.m119492a("CARD_ID", Long.valueOf(j)));
            if (bVar == null) {
                lVar = new C14282a(context);
            } else {
                lVar = new C14283b(bVar);
            }
            lVar.invoke(a);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$a0 */
    static final class C14284a0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardsDetailActivity f41955d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14284a0(CardsDetailActivity cardsDetailActivity) {
            super(1);
            this.f41955d = cardsDetailActivity;
        }

        /* renamed from: a */
        public final void mo40042a(String str) {
            this.f41955d.f41947N = str;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40042a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$b */
    static final class C14285b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CardsDetailActivity f41956d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14285b(CardsDetailActivity cardsDetailActivity) {
            super(0);
            this.f41956d = cardsDetailActivity;
        }

        public final void invoke() {
            this.f41956d.m52899C3().mo40114Bx().mo40100bm();
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$b0 */
    static final class C14286b0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardsDetailActivity f41957d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14286b0(CardsDetailActivity cardsDetailActivity) {
            super(1);
            this.f41957d = cardsDetailActivity;
        }

        /* renamed from: a */
        public final void mo40043a(C31128a aVar) {
            if (aVar instanceof C31128a.C31131c) {
                C31128a.C31131c cVar = (C31128a.C31131c) aVar;
                this.f41957d.m52947b4((List) ((C41224m) cVar.mo71340a()).mo95678e(), ((Number) ((C41224m) cVar.mo71340a()).mo95680f()).intValue());
                this.f41957d.m52933U3(false);
                this.f41957d.m52899C3().mo40114Bx().mo40089Ej();
                C16250c T2 = this.f41957d.f41940G;
                if (T2 == null) {
                    C41536l.m120506z("binding");
                    T2 = null;
                }
                LayerView layerView = T2.f46026e;
                C41536l.m120488h(layerView, "binding.actionsContainer");
                C32343x.m95447f1(layerView);
            } else if (aVar instanceof C31128a.C31129a) {
                this.f41957d.mo74709H1(((C31128a.C31129a) aVar).mo71342c());
            } else if (aVar instanceof C31128a.C31130b) {
                this.f41957d.m52933U3(true);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40043a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$c */
    static final class C14287c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardsDetailActivity f41958d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14287c(CardsDetailActivity cardsDetailActivity) {
            super(1);
            this.f41958d = cardsDetailActivity;
        }

        /* renamed from: a */
        public final void mo40044a(C37223a aVar) {
            CardInsSecCardModel cardInsSecCardModel = (CardInsSecCardModel) aVar.mo90296a();
            if (cardInsSecCardModel != null) {
                CardsDetailActivity cardsDetailActivity = this.f41958d;
                C38125h.m112238c(cardsDetailActivity).mo91624q(cardInsSecCardModel.mo55706d(), cardsDetailActivity);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40044a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$c0 */
    static final class C14288c0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardsDetailActivity f41959d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14288c0(CardsDetailActivity cardsDetailActivity) {
            super(1);
            this.f41959d = cardsDetailActivity;
        }

        /* renamed from: a */
        public final void mo40045a(List list) {
            CardsDetailActivity cardsDetailActivity = this.f41959d;
            C41536l.m120488h(list, "result");
            cardsDetailActivity.m52927R3(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40045a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$d */
    static final class C14289d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardsDetailActivity f41960d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14289d(CardsDetailActivity cardsDetailActivity) {
            super(1);
            this.f41960d = cardsDetailActivity;
        }

        /* renamed from: a */
        public final void mo40046a(C37223a aVar) {
            CardInsSecCardModel cardInsSecCardModel = (CardInsSecCardModel) aVar.mo90296a();
            if (cardInsSecCardModel != null) {
                ThreeDSecurityActivity.m104876S2(this.f41960d, Long.valueOf(cardInsSecCardModel.mo55706d()), cardInsSecCardModel.mo55723t(), cardInsSecCardModel.mo55721r(), cardInsSecCardModel.mo55710f(), cardInsSecCardModel.mo55714i());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40046a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$d0 */
    static final class C14290d0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardsDetailActivity f41961d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14290d0(CardsDetailActivity cardsDetailActivity) {
            super(1);
            this.f41961d = cardsDetailActivity;
        }

        /* renamed from: a */
        public final void mo40047a(List list) {
            CardsDetailActivity cardsDetailActivity = this.f41961d;
            C41536l.m120488h(list, "list");
            cardsDetailActivity.m52945a4(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40047a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$e */
    static final class C14291e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardsDetailActivity f41962d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14291e(CardsDetailActivity cardsDetailActivity) {
            super(1);
            this.f41962d = cardsDetailActivity;
        }

        /* renamed from: a */
        public final void mo40048a(C37223a aVar) {
            Long l = (Long) aVar.mo90296a();
            if (l != null) {
                CardsDetailActivity cardsDetailActivity = this.f41962d;
                C29932d.C29933a.m90820b(C29932d.f75725P, l.longValue(), false, 2, (Object) null).mo4576A1(cardsDetailActivity.getSupportFragmentManager(), (String) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40048a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$e0 */
    static final class C14292e0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardsDetailActivity f41963d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14292e0(CardsDetailActivity cardsDetailActivity) {
            super(1);
            this.f41963d = cardsDetailActivity;
        }

        /* renamed from: a */
        public final void mo40049a(C37223a aVar) {
            C39938b0 b0Var = (C39938b0) aVar.mo90296a();
            if (b0Var != null) {
                CardsDetailActivity cardsDetailActivity = this.f41963d;
                C41185v e = C41185v.C41187b.m119423e(C41185v.f97155C, b0Var.mo93674b(), b0Var.mo93673a(), (C41143c) null, 4, (Object) null);
                FragmentManager supportFragmentManager = cardsDetailActivity.getSupportFragmentManager();
                C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
                e.mo4576A1(supportFragmentManager, "SCA_CARD_BLOCK_TAG");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40049a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$f */
    static final class C14293f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardsDetailActivity f41964d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14293f(CardsDetailActivity cardsDetailActivity) {
            super(1);
            this.f41964d = cardsDetailActivity;
        }

        /* renamed from: a */
        public final void mo40050a(C37223a aVar) {
            C41224m mVar = (C41224m) aVar.mo90296a();
            if (mVar != null) {
                CardsDetailActivity cardsDetailActivity = this.f41964d;
                long longValue = ((Number) mVar.mo95675a()).longValue();
                C38903a.f92981K.mo92600a(((Number) mVar.mo95676b()).longValue(), longValue).mo4576A1(cardsDetailActivity.getSupportFragmentManager(), (String) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40050a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$f0 */
    static final class C14294f0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardsDetailActivity f41965d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14294f0(CardsDetailActivity cardsDetailActivity) {
            super(1);
            this.f41965d = cardsDetailActivity;
        }

        /* renamed from: a */
        public final void mo40051a(C37223a aVar) {
            C39938b0 b0Var = (C39938b0) aVar.mo90296a();
            if (b0Var != null) {
                CardsDetailActivity cardsDetailActivity = this.f41965d;
                C41185v e = C41185v.C41187b.m119423e(C41185v.f97155C, b0Var.mo93674b(), b0Var.mo93673a(), (C41143c) null, 4, (Object) null);
                FragmentManager supportFragmentManager = cardsDetailActivity.getSupportFragmentManager();
                C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
                e.mo4576A1(supportFragmentManager, "SCA_CARD_DETAILS_TAG");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40051a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$g */
    static final class C14295g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardsDetailActivity f41966d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14295g(CardsDetailActivity cardsDetailActivity) {
            super(1);
            this.f41966d = cardsDetailActivity;
        }

        /* renamed from: a */
        public final void mo40052a(C37223a aVar) {
            C41224m mVar = (C41224m) aVar.mo90296a();
            if (mVar != null) {
                CardsDetailActivity cardsDetailActivity = this.f41966d;
                C18443d.f51902O.mo46229a(((Number) mVar.mo95675a()).longValue(), (String) mVar.mo95676b()).mo4576A1(cardsDetailActivity.getSupportFragmentManager(), (String) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40052a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$g0 */
    static final class C14296g0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardsDetailActivity f41967d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14296g0(CardsDetailActivity cardsDetailActivity) {
            super(1);
            this.f41967d = cardsDetailActivity;
        }

        /* renamed from: a */
        public final void mo40053a(C41238w wVar) {
            this.f41967d.m52933U3(true);
            C41185v Z2 = this.f41967d.m52985z3();
            if (Z2 != null) {
                Z2.mo4577k1();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40053a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$h */
    static final class C14297h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardsDetailActivity f41968d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14297h(CardsDetailActivity cardsDetailActivity) {
            super(1);
            this.f41968d = cardsDetailActivity;
        }

        /* renamed from: a */
        public final void mo40054a(C37223a aVar) {
            C41224m mVar = (C41224m) aVar.mo90296a();
            if (mVar != null) {
                CardsDetailActivity cardsDetailActivity = this.f41968d;
                C18961d.f52968O.mo47016a(((Number) mVar.mo95675a()).longValue(), ((Boolean) mVar.mo95676b()).booleanValue()).mo4576A1(cardsDetailActivity.getSupportFragmentManager(), (String) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40054a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$h0 */
    static final class C14298h0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardsDetailActivity f41969d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14298h0(CardsDetailActivity cardsDetailActivity) {
            super(1);
            this.f41969d = cardsDetailActivity;
        }

        /* renamed from: a */
        public final void mo40055a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f41969d.m52933U3(false);
            C41185v Z2 = this.f41969d.m52985z3();
            if (Z2 != null) {
                Z2.mo4577k1();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40055a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$i */
    static final class C14299i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardsDetailActivity f41970d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14299i(CardsDetailActivity cardsDetailActivity) {
            super(1);
            this.f41970d = cardsDetailActivity;
        }

        /* renamed from: a */
        public final void mo40056a(C31128a aVar) {
            if (aVar instanceof C31128a.C31131c) {
                CardsDetailActivity cardsDetailActivity = this.f41970d;
                String string = cardsDetailActivity.getString(C12932f.f38196q);
                C41536l.m120488h(string, "getString(R.string.opera…n_fulfilled_successfully)");
                C12910e.m48797o(cardsDetailActivity, string, (C12902d.C12905b) null, false, 6, (Object) null);
                this.f41970d.m52933U3(false);
                C41185v U2 = this.f41970d.m52982v3();
                if (U2 != null) {
                    U2.mo4577k1();
                }
            } else if (aVar instanceof C31128a.C31129a) {
                this.f41970d.m52933U3(false);
                C41185v U22 = this.f41970d.m52982v3();
                if (U22 != null) {
                    U22.mo95635L2(false);
                }
                Throwable c = ((C31128a.C31129a) aVar).mo71342c();
                if (c instanceof ApiError) {
                    ApiError apiError = (ApiError) c;
                    if (apiError.mo84685a().isScaError()) {
                        C41185v U23 = this.f41970d.m52982v3();
                        if (U23 != null) {
                            U23.mo95634K2(C32343x.m95388F(apiError.mo84685a().getKey(), new Object[0]));
                            return;
                        }
                        return;
                    }
                    C41185v U24 = this.f41970d.m52982v3();
                    if (U24 != null) {
                        U24.mo4577k1();
                    }
                    this.f41970d.mo74709H1(c);
                    return;
                }
                C41185v U25 = this.f41970d.m52982v3();
                if (U25 != null) {
                    U25.mo4577k1();
                }
                this.f41970d.mo74709H1(c);
            } else if (aVar instanceof C31128a.C31130b) {
                C41185v U26 = this.f41970d.m52982v3();
                if (U26 != null) {
                    U26.mo95635L2(true);
                }
                this.f41970d.m52933U3(true);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40056a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$i0 */
    static final class C14300i0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardsDetailActivity f41971d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14300i0(CardsDetailActivity cardsDetailActivity) {
            super(1);
            this.f41971d = cardsDetailActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f41971d.m52933U3(false);
            C41185v Z2 = this.f41971d.m52985z3();
            if (Z2 != null) {
                Z2.mo4577k1();
            }
            this.f41971d.mo74709H1(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$j */
    static final class C14301j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardsDetailActivity f41972d;

        /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$j$a */
        static final class C14302a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ CardsDetailActivity f41973d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14302a(CardsDetailActivity cardsDetailActivity) {
                super(1);
                this.f41973d = cardsDetailActivity;
            }

            /* renamed from: a */
            public final void mo40059a(DigitalCardInfo digitalCardInfo) {
                C41536l.m120489i(digitalCardInfo, "it");
                C41185v V2 = this.f41973d.m52983w3();
                if (V2 != null) {
                    V2.mo4577k1();
                }
                this.f41973d.m52933U3(false);
                C38125h.m112238c(this.f41973d).mo91582W(digitalCardInfo).mo4576A1(this.f41973d.getSupportFragmentManager(), (String) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo40059a((DigitalCardInfo) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$j$b */
        static final class C14303b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ CardsDetailActivity f41974d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14303b(CardsDetailActivity cardsDetailActivity) {
                super(1);
                this.f41974d = cardsDetailActivity;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "error");
                this.f41974d.m52933U3(false);
                C41185v V2 = this.f41974d.m52983w3();
                if (V2 != null) {
                    V2.mo95635L2(false);
                }
                if (th instanceof ApiError) {
                    ApiError apiError = (ApiError) th;
                    if (apiError.mo84685a().isScaError()) {
                        C41185v V22 = this.f41974d.m52983w3();
                        if (V22 != null) {
                            V22.mo95634K2(C32343x.m95388F(apiError.mo84685a().getKey(), new Object[0]));
                            return;
                        }
                        return;
                    }
                    C41185v V23 = this.f41974d.m52983w3();
                    if (V23 != null) {
                        V23.mo4577k1();
                    }
                    this.f41974d.mo74709H1(th);
                    return;
                }
                C41185v V24 = this.f41974d.m52983w3();
                if (V24 != null) {
                    V24.mo4577k1();
                }
                this.f41974d.mo74709H1(th);
            }
        }

        /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$j$c */
        static final class C14304c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ CardsDetailActivity f41975d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14304c(CardsDetailActivity cardsDetailActivity) {
                super(1);
                this.f41975d = cardsDetailActivity;
            }

            /* renamed from: a */
            public final void mo40061a(DigitalCardInfo digitalCardInfo) {
                C41185v V2 = this.f41975d.m52983w3();
                if (V2 != null) {
                    V2.mo95635L2(true);
                }
                this.f41975d.m52933U3(true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo40061a((DigitalCardInfo) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14301j(CardsDetailActivity cardsDetailActivity) {
            super(1);
            this.f41972d = cardsDetailActivity;
        }

        /* renamed from: a */
        public final void mo40058a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C14302a(this.f41972d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C14303b(this.f41972d), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C14304c(this.f41972d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40058a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$j0 */
    static final class C14305j0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardsDetailActivity f41976d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14305j0(CardsDetailActivity cardsDetailActivity) {
            super(1);
            this.f41976d = cardsDetailActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C41536l.m120488h(bool, "isScoolCard");
            if (bool.booleanValue()) {
                this.f41976d.m52955f4();
                this.f41976d.m52899C3().mo40114Bx().mo40094Ng();
                return;
            }
            this.f41976d.m52951d4();
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$k */
    static final class C14306k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardsDetailActivity f41977d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14306k(CardsDetailActivity cardsDetailActivity) {
            super(1);
            this.f41977d = cardsDetailActivity;
        }

        /* renamed from: a */
        public final void mo40063a(long j) {
            C38125h.m112238c(this.f41977d).mo91553H0(this.f41977d, Long.valueOf(j));
            this.f41977d.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40063a(((Number) obj).longValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$k0 */
    static final class C14307k0 extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C14307k0 f41978d = new C14307k0();

        C14307k0() {
            super(1);
        }

        /* renamed from: a */
        public final void mo40064a(PendingIntent pendingIntent) {
            try {
                pendingIntent.send();
            } catch (Exception e) {
                Log.e("vaimeee", "openGooglePayDetails: ", e);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40064a((PendingIntent) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$l */
    /* synthetic */ class C14308l extends C41535k implements C43075l {
        C14308l(Object obj) {
            super(1, obj, CardsDetailActivity.class, "openScaForGooglePay", "openScaForGooglePay(Lge/bog/mobilebank/products/domain/model/ScaParamPair;)V", 0);
        }

        /* renamed from: b */
        public final void mo40065b(C39938b0 b0Var) {
            C41536l.m120489i(b0Var, "p0");
            ((CardsDetailActivity) this.receiver).m52919N3(b0Var);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40065b((C39938b0) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$l0 */
    public static final class C14309l0 extends ViewPager2.C1928i {

        /* renamed from: a */
        final /* synthetic */ CardsDetailActivity f41979a;

        C14309l0(CardsDetailActivity cardsDetailActivity) {
            this.f41979a = cardsDetailActivity;
        }

        public void onPageSelected(int i) {
            boolean z;
            List f = this.f41979a.f41950Q.mo6026f();
            if (f == null || f.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                CardsDetailActivity cardsDetailActivity = this.f41979a;
                cardsDetailActivity.f41948O = ((C16800a) cardsDetailActivity.f41950Q.mo6026f().get(i)).mo43920a().mo66030j();
                this.f41979a.m52899C3().mo40114Bx().mo40105fu(this.f41979a.f41948O);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$m */
    static final class C14310m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardsDetailActivity f41980d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14310m(CardsDetailActivity cardsDetailActivity) {
            super(1);
            this.f41980d = cardsDetailActivity;
        }

        /* renamed from: a */
        public final void mo40066a(C18035c cVar) {
            C41536l.m120489i(cVar, "data");
            this.f41980d.m52917M3(cVar.mo45737b(), cVar.mo45736a());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40066a((C18035c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$m0 */
    static final class C14311m0 implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f41981a;

        C14311m0(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f41981a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f41981a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f41981a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$n */
    static final class C14312n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardsDetailActivity f41982d;

        /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$n$a */
        static final class C14313a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ CardsDetailActivity f41983d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14313a(CardsDetailActivity cardsDetailActivity) {
                super(0);
                this.f41983d = cardsDetailActivity;
            }

            public final void invoke() {
                this.f41983d.m52899C3().mo40114Bx().mo40088Ds(false);
            }
        }

        /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$n$b */
        static final class C14314b extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ CardsDetailActivity f41984d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14314b(CardsDetailActivity cardsDetailActivity) {
                super(0);
                this.f41984d = cardsDetailActivity;
            }

            public final void invoke() {
                this.f41984d.m52899C3().mo40114Bx().mo40088Ds(true);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14312n(CardsDetailActivity cardsDetailActivity) {
            super(1);
            this.f41982d = cardsDetailActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m53024c(CardsDetailActivity cardsDetailActivity, View view) {
            C41536l.m120489i(cardsDetailActivity, "this$0");
            cardsDetailActivity.m52971n4(C32343x.m95388F("cards.details.unblock", new Object[0]), C32343x.m95388F("rbc.card.unblock.info", new Object[0]), new C14313a(cardsDetailActivity));
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final void m53025d(CardsDetailActivity cardsDetailActivity, View view) {
            C41536l.m120489i(cardsDetailActivity, "this$0");
            cardsDetailActivity.m52971n4(C32343x.m95388F("cards.details.block", new Object[0]), C32343x.m95388F("rbc.card.block.info", new Object[0]), new C14314b(cardsDetailActivity));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C41536l.m120488h(bool, "cardIsBlocked");
            C16250c cVar = null;
            if (bool.booleanValue()) {
                C16250c T2 = this.f41982d.f41940G;
                if (T2 == null) {
                    C41536l.m120506z("binding");
                } else {
                    cVar = T2;
                }
                Button button = cVar.f46029h;
                CardsDetailActivity cardsDetailActivity = this.f41982d;
                button.setButtonText(C32343x.m95388F("cards.details.unblock", new Object[0]));
                button.setOnClickListener(new C14375j(cardsDetailActivity));
                return;
            }
            C16250c T22 = this.f41982d.f41940G;
            if (T22 == null) {
                C41536l.m120506z("binding");
            } else {
                cVar = T22;
            }
            Button button2 = cVar.f46029h;
            CardsDetailActivity cardsDetailActivity2 = this.f41982d;
            button2.setButtonText(C32343x.m95388F("cards.details.block", new Object[0]));
            button2.setOnClickListener(new C14376k(cardsDetailActivity2));
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$n0 */
    static final class C14315n0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardsDetailActivity f41985d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14315n0(CardsDetailActivity cardsDetailActivity) {
            super(1);
            this.f41985d = cardsDetailActivity;
        }

        /* renamed from: a */
        public final void mo40070a(C14391a aVar) {
            boolean z;
            C41536l.m120489i(aVar, "additionalFunction");
            AdditionalFunctionType g = aVar.mo40254g();
            if (C41536l.m120484d(g, AdditionalFunctionType.Insurance.f42126k)) {
                this.f41985d.m52899C3().mo40114Bx().mo40095Q9();
            } else if (C41536l.m120484d(g, AdditionalFunctionType.PaymentsControl.f42127k)) {
                this.f41985d.m52899C3().mo40114Bx().mo40102c7();
            } else if (C41536l.m120484d(g, AdditionalFunctionType.Security.f42130k)) {
                this.f41985d.m52899C3().mo40114Bx().mo40109r5();
            } else if (C41536l.m120484d(g, AdditionalFunctionType.CloseCard.f42123k)) {
                this.f41985d.m52899C3().mo40114Bx().mo40108jt();
            } else {
                if (C41536l.m120484d(g, AdditionalFunctionType.RecoverCard.f42128k)) {
                    z = true;
                } else {
                    z = C41536l.m120484d(g, AdditionalFunctionType.RecoverExpiringCard.f42129k);
                }
                if (z) {
                    this.f41985d.m52899C3().mo40114Bx().mo40096Tc();
                } else if (C41536l.m120484d(g, AdditionalFunctionType.GooglePay.f42125k)) {
                    this.f41985d.m52899C3().mo40114Bx().mo40098Zr();
                } else if (C41536l.m120484d(g, AdditionalFunctionType.CardAdvantages.f42122k)) {
                    this.f41985d.m52899C3().mo40114Bx().mo40092La();
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40070a((C14391a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$o */
    /* synthetic */ class C14316o extends C41535k implements C43075l {
        C14316o(Object obj) {
            super(1, obj, CardsDetailActivity.class, "onPushTokenizeResult", "onPushTokenizeResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo40071b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((CardsDetailActivity) this.receiver).m52907H3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40071b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$o0 */
    static final class C14317o0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardsDetailActivity f41986d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14317o0(CardsDetailActivity cardsDetailActivity) {
            super(1);
            this.f41986d = cardsDetailActivity;
        }

        /* renamed from: a */
        public final void mo40072a(C14391a aVar) {
            C41536l.m120489i(aVar, "item");
            AdditionalFunctionType g = aVar.mo40254g();
            if (g instanceof AdditionalFunctionType.ActivateScoolApp) {
                this.f41986d.m52899C3().mo40114Bx().mo40107he();
            } else if ((g instanceof AdditionalFunctionType.FinancialNumber) && this.f41986d.f41946M != null) {
                this.f41986d.m52899C3().mo40114Bx().mo40087Bi();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40072a((C14391a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$p */
    /* synthetic */ class C14318p extends C41535k implements C43075l {
        C14318p(Object obj) {
            super(1, obj, CardsDetailActivity.class, "openGooglePay", "openGooglePay(Lcom/google/android/gms/tapandpay/issuer/PushTokenizeRequest;)V", 0);
        }

        /* renamed from: b */
        public final void mo40073b(PushTokenizeRequest pushTokenizeRequest) {
            C41536l.m120489i(pushTokenizeRequest, "p0");
            ((CardsDetailActivity) this.receiver).m52911J3(pushTokenizeRequest);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40073b((PushTokenizeRequest) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$p0 */
    public static final class C14319p0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f41987d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14319p0(ComponentActivity componentActivity) {
            super(0);
            this.f41987d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f41987d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$q */
    static final class C14320q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardsDetailActivity f41988d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14320q(CardsDetailActivity cardsDetailActivity) {
            super(1);
            this.f41988d = cardsDetailActivity;
        }

        /* renamed from: a */
        public final void mo40074a(C18031b bVar) {
            C18031b.C18034c cVar;
            boolean z = bVar instanceof C18031b.C18034c;
            if (z) {
                cVar = (C18031b.C18034c) bVar;
            } else {
                cVar = null;
            }
            if (cVar != null) {
                this.f41988d.m52969m4(cVar.mo45732a());
            }
            C16250c T2 = this.f41988d.f41940G;
            if (T2 == null) {
                C41536l.m120506z("binding");
                T2 = null;
            }
            LinearLayout linearLayout = T2.f46035n;
            C41536l.m120488h(linearLayout, "binding.googlePayBannerContainer");
            C32343x.m95483r1(linearLayout, z, false, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40074a((C18031b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$q0 */
    public static final class C14321q0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f41989d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f41990e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14321q0(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f41989d = aVar;
            this.f41990e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f41989d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f41990e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$r */
    /* synthetic */ class C14322r extends C41535k implements C43075l {
        C14322r(Object obj) {
            super(1, obj, CardsDetailActivity.class, "openGooglePayDetails", "openGooglePayDetails(Lcom/google/android/gms/tapandpay/issuer/ViewTokenRequest;)V", 0);
        }

        /* renamed from: b */
        public final void mo40075b(ViewTokenRequest viewTokenRequest) {
            C41536l.m120489i(viewTokenRequest, "p0");
            ((CardsDetailActivity) this.receiver).m52913K3(viewTokenRequest);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40075b((ViewTokenRequest) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$r0 */
    static final class C14323r0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CardsDetailActivity f41991d;

        /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$r0$a */
        static final class C14324a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ CardsDetailActivity f41992d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14324a(CardsDetailActivity cardsDetailActivity) {
                super(0);
                this.f41992d = cardsDetailActivity;
            }

            /* renamed from: b */
            public final C14337b invoke() {
                return this.f41992d.mo40033D3().mo32530a(this.f41992d.getIntent().getLongExtra("CARD_ID", -1));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14323r0(CardsDetailActivity cardsDetailActivity) {
            super(0);
            this.f41991d = cardsDetailActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C14324a(this.f41991d));
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$s */
    /* synthetic */ class C14325s extends C41535k implements C43075l {
        C14325s(Object obj) {
            super(1, obj, CardsDetailActivity.class, "resumeGooglePayTokenize", "resumeGooglePayTokenize(Lge/bog/mobilebank/googlepay/domain/model/token/ResumeTokenizeData;)V", 0);
        }

        /* renamed from: b */
        public final void mo40077b(C20262b bVar) {
            C41536l.m120489i(bVar, "p0");
            ((CardsDetailActivity) this.receiver).m52925Q3(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40077b((C20262b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$t */
    static final class C14326t extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardsDetailActivity f41993d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14326t(CardsDetailActivity cardsDetailActivity) {
            super(1);
            this.f41993d = cardsDetailActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            CardsDetailActivity cardsDetailActivity = this.f41993d;
            C41536l.m120488h(bool, "it");
            cardsDetailActivity.m52933U3(bool.booleanValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$u */
    static final class C14327u extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardsDetailActivity f41994d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14327u(CardsDetailActivity cardsDetailActivity) {
            super(1);
            this.f41994d = cardsDetailActivity;
        }

        /* renamed from: a */
        public final void mo40079a(C37223a aVar) {
            C18795c cVar = (C18795c) aVar.mo90296a();
            if (cVar != null) {
                this.f41994d.m52909I3(cVar);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40079a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$v */
    static final class C14328v extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardsDetailActivity f41995d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14328v(CardsDetailActivity cardsDetailActivity) {
            super(1);
            this.f41995d = cardsDetailActivity;
        }

        /* renamed from: a */
        public final void mo40080a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C38122f c = C38125h.m112238c(this.f41995d);
            CardsDetailActivity cardsDetailActivity = this.f41995d;
            c.mo91540B(cardsDetailActivity, cardsDetailActivity.m52984x3(), NavigatorConstants$JuniorFlow.ACTIVATION, true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40080a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$w */
    static final class C14329w extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardsDetailActivity f41996d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14329w(CardsDetailActivity cardsDetailActivity) {
            super(1);
            this.f41996d = cardsDetailActivity;
        }

        /* renamed from: a */
        public final void mo40081a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C38122f c = C38125h.m112238c(this.f41996d);
            CardsDetailActivity cardsDetailActivity = this.f41996d;
            C38122f.C38123a.m112228x(c, cardsDetailActivity, cardsDetailActivity.m52984x3(), NavigatorConstants$JuniorFlow.FINANCIAL_NUMBER, false, 8, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40081a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$x */
    static final class C14330x extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardsDetailActivity f41997d;

        /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$x$a */
        static final class C14331a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ CardsDetailActivity f41998d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14331a(CardsDetailActivity cardsDetailActivity) {
                super(1);
                this.f41998d = cardsDetailActivity;
            }

            /* renamed from: a */
            public final void mo40083a(List list) {
                C41536l.m120489i(list, "list");
                boolean z = true;
                if (!list.isEmpty()) {
                    this.f41998d.f41946M = (C18030a) C41358y.m120007W(list);
                    C16250c T2 = this.f41998d.f41940G;
                    if (T2 == null) {
                        C41536l.m120506z("binding");
                        T2 = null;
                    }
                    LayerView layerView = T2.f46039r;
                    C41536l.m120488h(layerView, "binding.scoolActivationSection");
                    C32343x.m95447f1(layerView);
                    C16250c T22 = this.f41998d.f41940G;
                    if (T22 == null) {
                        C41536l.m120506z("binding");
                        T22 = null;
                    }
                    T22.f46027f.setText(C32343x.m95388F("cards.details.child.functions", new Object[0]));
                    C14335a Bx = this.f41998d.m52899C3().mo40114Bx();
                    C18030a Y2 = this.f41998d.f41946M;
                    if (Y2 == null) {
                        C41536l.m120506z("childInfoUiModel");
                        Y2 = null;
                    }
                    Bx.mo40093Lu(Y2);
                    C16250c T23 = this.f41998d.f41940G;
                    if (T23 == null) {
                        C41536l.m120506z("binding");
                        T23 = null;
                    }
                    LinearLayout linearLayout = T23.f46033l;
                    C41536l.m120488h(linearLayout, "binding.contactApprovalBannerContainer");
                    String c = ((C18030a) C41358y.m120007W(list)).mo45725c();
                    if (!(c == null || c.length() == 0)) {
                        z = false;
                    }
                    C32343x.m95483r1(linearLayout, z, false, 2, (Object) null);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo40083a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$x$b */
        static final class C14332b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ CardsDetailActivity f41999d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14332b(CardsDetailActivity cardsDetailActivity) {
                super(1);
                this.f41999d = cardsDetailActivity;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                C16250c T2 = this.f41999d.f41940G;
                if (T2 == null) {
                    C41536l.m120506z("binding");
                    T2 = null;
                }
                LayerView layerView = T2.f46039r;
                C41536l.m120488h(layerView, "binding.scoolActivationSection");
                C32343x.m95455i0(layerView);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14330x(CardsDetailActivity cardsDetailActivity) {
            super(1);
            this.f41997d = cardsDetailActivity;
        }

        /* renamed from: a */
        public final void mo40082a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C14331a(this.f41997d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C14332b(this.f41997d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40082a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$y */
    static final class C14333y extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardsDetailActivity f42000d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14333y(CardsDetailActivity cardsDetailActivity) {
            super(1);
            this.f42000d = cardsDetailActivity;
        }

        /* renamed from: a */
        public final void mo40085a(List list) {
            C41536l.m120489i(list, "benefits");
            C17540a.f49092F.mo45087a(list).mo4576A1(this.f42000d.getSupportFragmentManager(), (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo40085a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity$z */
    static final class C14334z extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardsDetailActivity f42001d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14334z(CardsDetailActivity cardsDetailActivity) {
            super(1);
            this.f42001d = cardsDetailActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C16250c T2 = this.f42001d.f41940G;
            if (T2 == null) {
                C41536l.m120506z("binding");
                T2 = null;
            }
            Button button = T2.f46031j;
            C41536l.m120488h(button, "binding.cardDetailsOrScoolcardLimit");
            C32343x.m95483r1(button, !bool.booleanValue(), false, 2, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public final C14337b m52899C3() {
        return (C14337b) this.f41945L.getValue();
    }

    /* renamed from: E3 */
    private final void m52901E3(String str, String str2) {
        C36546y.m108282F().mo27137H(str, str2, (String) null, (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
    }

    /* renamed from: F3 */
    private final void m52903F3() {
        C16250c cVar = this.f41940G;
        C16250c cVar2 = null;
        if (cVar == null) {
            C41536l.m120506z("binding");
            cVar = null;
        }
        cVar.f46036o.setAdapter(this.f41950Q);
        C16250c cVar3 = this.f41940G;
        if (cVar3 == null) {
            C41536l.m120506z("binding");
            cVar3 = null;
        }
        cVar3.f46036o.setOffscreenPageLimit(2);
        C16250c cVar4 = this.f41940G;
        if (cVar4 == null) {
            C41536l.m120506z("binding");
            cVar4 = null;
        }
        ScrollingPagerIndicator scrollingPagerIndicator = cVar4.f46041t;
        C16250c cVar5 = this.f41940G;
        if (cVar5 == null) {
            C41536l.m120506z("binding");
        } else {
            cVar2 = cVar5;
        }
        ViewPager2 viewPager2 = cVar2.f46036o;
        C41536l.m120488h(viewPager2, "binding.headerPager");
        scrollingPagerIndicator.mo53672c(viewPager2);
    }

    /* renamed from: G3 */
    private final void m52905G3() {
        C37224b.m109963b(m52899C3().mo40118Fx().mo40126Zl(), this, new C14310m(this));
        m52899C3().mo40118Fx().mo40146y1().mo4819k(this, new C14311m0(new C14312n(this)));
        m52899C3().mo40118Fx().mo40144vn().mo4819k(this, new C14311m0(new C14334z(this)));
        m52899C3().mo40118Fx().mo40134jl().mo4819k(this, new C14311m0(new C14284a0(this)));
        m52899C3().mo40118Fx().mo40130e5().mo4819k(this, new C14311m0(new C14286b0(this)));
        m52899C3().mo40118Fx().mo40142oe().mo4819k(this, new C14311m0(new C14288c0(this)));
        m52899C3().mo40118Fx().mo40135kd().mo4819k(this, new C14311m0(new C14290d0(this)));
        m52899C3().mo40116Cx().mo4819k(this, new C14311m0(new C14292e0(this)));
        m52899C3().mo40117Dx().mo4819k(this, new C14311m0(new C14294f0(this)));
        m52899C3().mo40118Fx().mo40141o().mo4819k(this, new C14311m0(new C14287c(this)));
        m52899C3().mo40118Fx().mo40133f9().mo4819k(this, new C14311m0(new C14289d(this)));
        m52899C3().mo40118Fx().mo40119Kv().mo4819k(this, new C14311m0(new C14291e(this)));
        m52899C3().mo40118Fx().mo40136kf().mo4819k(this, new C14311m0(new C14293f(this)));
        m52899C3().mo40118Fx().mo40143v5().mo4819k(this, new C14311m0(new C14295g(this)));
        m52899C3().mo40118Fx().mo40147yv().mo4819k(this, new C14311m0(new C14297h(this)));
        m52899C3().mo40118Fx().mo40140ms().mo4819k(this, new C14311m0(new C14299i(this)));
        m52899C3().mo40118Fx().mo40122Of().mo4819k(this, new C14311m0(new C14301j(this)));
        C37224b.m109963b(m52899C3().mo40118Fx().mo40131ef(), this, new C14306k(this));
        C37224b.m109963b(m52899C3().mo40118Fx().mo40139m7(), this, new C14308l(this));
        m52899C3().mo40118Fx().mo40125X8().mo4819k(this, new C14311m0(new C14316o(this)));
        C37224b.m109963b(m52899C3().mo40118Fx().mo40149zd(), this, new C14318p(this));
        m52899C3().mo40118Fx().mo40138ls().mo4819k(this, new C14311m0(new C14320q(this)));
        C37224b.m109963b(m52899C3().mo40118Fx().mo40128c9(), this, new C14322r(this));
        C37224b.m109963b(m52899C3().mo40118Fx().mo40123V2(), this, new C14325s(this));
        m52899C3().mo40118Fx().mo40132f6().mo4819k(this, new C14311m0(new C14326t(this)));
        m52899C3().mo40115C4().mo4819k(this, new C14311m0(new C14327u(this)));
        C37224b.m109963b(m52899C3().mo40118Fx().mo40137le(), this, new C14328v(this));
        C37224b.m109963b(m52899C3().mo40118Fx().mo40127Zn(), this, new C14329w(this));
        m52899C3().mo40118Fx().mo40129cv().mo4819k(this, new C14311m0(new C14330x(this)));
        C37224b.m109963b(m52899C3().mo40118Fx().mo40148z7(), this, new C14333y(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: H3 */
    public final void m52907H3(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C14296g0(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C14298h0(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C14300i0(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: I3 */
    public final void m52909I3(C18795c cVar) {
        C36699b.C36700a.m108859b(C36699b.f88582P, cVar.mo46609a(), this.f41947N, true, Long.valueOf(this.f41948O), C32343x.m95388F("cards.details.change.daily.limit.actionsheet.title", new Object[0]), (String) null, 32, (Object) null).mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: J3 */
    public final void m52911J3(PushTokenizeRequest pushTokenizeRequest) {
        mo40032B3().mo21126d(this, pushTokenizeRequest, 10036);
    }

    /* access modifiers changed from: private */
    /* renamed from: K3 */
    public final void m52913K3(ViewTokenRequest viewTokenRequest) {
        mo40032B3().mo21130h(viewTokenRequest).mo24864i(new C17407h0(C14307k0.f41978d));
    }

    /* access modifiers changed from: private */
    /* renamed from: L3 */
    public static final void m52915L3(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: M3 */
    public final void m52917M3(String str, long j) {
        C29133c.f74150P.mo68988a(str, j).mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: N3 */
    public final void m52919N3(C39938b0 b0Var) {
        C41185v e = C41185v.C41187b.m119423e(C41185v.f97155C, b0Var.mo93674b(), b0Var.mo93673a(), (C41143c) null, 4, (Object) null);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        e.mo4576A1(supportFragmentManager, "SCA_GOOGLE_PAY_TAG");
    }

    /* renamed from: O3 */
    private final void m52921O3() {
        C16250c cVar = this.f41940G;
        if (cVar == null) {
            C41536l.m120506z("binding");
            cVar = null;
        }
        cVar.f46036o.post(new C17393a0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: P3 */
    public static final void m52923P3(CardsDetailActivity cardsDetailActivity) {
        C41536l.m120489i(cardsDetailActivity, "this$0");
        C16250c cVar = cardsDetailActivity.f41940G;
        if (cVar == null) {
            C41536l.m120506z("binding");
            cVar = null;
        }
        cVar.f46036o.mo6603h(cardsDetailActivity.f41953T);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q3 */
    public final void m52925Q3(C20262b bVar) {
        mo40032B3().mo21127e(this, bVar.mo48734c(), bVar.mo48735d(), bVar.mo48733b(), bVar.mo48732a(), 10036);
    }

    /* access modifiers changed from: private */
    /* renamed from: R3 */
    public final void m52927R3(List list) {
        this.f41951R.mo6029i(list);
    }

    /* renamed from: S3 */
    private final void m52929S3() {
        C16250c cVar = this.f41940G;
        C16250c cVar2 = null;
        if (cVar == null) {
            C41536l.m120506z("binding");
            cVar = null;
        }
        cVar.f46036o.mo6603h(this.f41953T);
        this.f41951R.mo45568n(new C14315n0(this));
        this.f41952S.mo45568n(new C14317o0(this));
        C16250c cVar3 = this.f41940G;
        if (cVar3 == null) {
            C41536l.m120506z("binding");
        } else {
            cVar2 = cVar3;
        }
        cVar2.f46037p.setOnClickListener(new C17399d0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: T3 */
    public static final void m52931T3(CardsDetailActivity cardsDetailActivity, View view) {
        C41536l.m120489i(cardsDetailActivity, "this$0");
        cardsDetailActivity.m52899C3().mo40120Kx();
    }

    /* access modifiers changed from: private */
    /* renamed from: U3 */
    public final void m52933U3(boolean z) {
        C16250c cVar = this.f41940G;
        if (cVar == null) {
            C41536l.m120506z("binding");
            cVar = null;
        }
        FrameLayout frameLayout = cVar.f46038q;
        C41536l.m120488h(frameLayout, "binding.progressBar");
        C32343x.m95483r1(frameLayout, z, false, 2, (Object) null);
    }

    /* renamed from: V3 */
    private final void m52935V3() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.mo4367F1("REQUEST_POSITIVE_FEEDBACK_KEY", this, new C17409i0(this));
        supportFragmentManager.mo4367F1("REQUEST_KEY_CLOSE_CARD", this, new C17411j0(this));
        supportFragmentManager.mo4367F1("REQUEST_KEY_CARD_LIMIT", this, new C17425w(this));
        supportFragmentManager.mo4367F1("REQUEST_KEY_CARD_ACTIVATED", this, new C17426x(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: W3 */
    public static final void m52937W3(CardsDetailActivity cardsDetailActivity, String str, Bundle bundle) {
        C41536l.m120489i(cardsDetailActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "data");
        if (bundle.getBoolean("RESULT_POSITIVE_FEEDBACK_KEY")) {
            C12910e.m48797o(cardsDetailActivity, C32343x.m95388F("cards.details.change.daily.limit.success.message", new Object[0]), (C12902d.C12905b) null, false, 6, (Object) null);
            return;
        }
        String string = cardsDetailActivity.getString(C12932f.f38193n);
        C41536l.m120488h(string, "getString(R.string.common_text_operation_error)");
        C12910e.m48790h(cardsDetailActivity, string, (C12902d.C12905b) null, false, 6, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: X3 */
    public static final void m52939X3(CardsDetailActivity cardsDetailActivity, String str, Bundle bundle) {
        C41536l.m120489i(cardsDetailActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "data");
        if (bundle.getBoolean("RESULT_KEY_CLOSE_CARD", false)) {
            cardsDetailActivity.m52899C3().mo40114Bx().mo40097Tj();
            cardsDetailActivity.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y3 */
    public static final void m52941Y3(CardsDetailActivity cardsDetailActivity, String str, Bundle bundle) {
        C41536l.m120489i(cardsDetailActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        CardDailyLimitUiModel cardDailyLimitUiModel = (CardDailyLimitUiModel) bundle.getParcelable("RESULT_KEY_CHOSEN_CARD_LIMIT");
        if (cardDailyLimitUiModel != null) {
            cardsDetailActivity.m52899C3().mo40114Bx().mo40104e1(cardDailyLimitUiModel);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z3 */
    public static final void m52943Z3(CardsDetailActivity cardsDetailActivity, String str, Bundle bundle) {
        C41536l.m120489i(cardsDetailActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        if (bundle.getBoolean("RESULT_KEY_CARD_ACTIVATED", false)) {
            C21481a.onRefresh$default(cardsDetailActivity.m52899C3(), 0, 1, (Object) null);
            cardsDetailActivity.setResult(3);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a4 */
    public final void m52945a4(List list) {
        this.f41952S.mo6029i(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: b4 */
    public final void m52947b4(List list, int i) {
        m52977q4();
        C16250c cVar = this.f41940G;
        C16250c cVar2 = null;
        if (cVar == null) {
            C41536l.m120506z("binding");
            cVar = null;
        }
        ScrollingPagerIndicator scrollingPagerIndicator = cVar.f46041t;
        C41536l.m120488h(scrollingPagerIndicator, "binding.scrollingIndicator");
        boolean z = true;
        if (list.size() <= 1) {
            z = false;
        }
        C32343x.m95483r1(scrollingPagerIndicator, z, false, 2, (Object) null);
        this.f41950Q.mo6029i(list);
        if (this.f41949P) {
            this.f41949P = false;
            m52967l4(i);
            m52921O3();
            return;
        }
        C16250c cVar3 = this.f41940G;
        if (cVar3 == null) {
            C41536l.m120506z("binding");
        } else {
            cVar2 = cVar3;
        }
        cVar2.f46036o.post(new C17397c0(this, i));
    }

    /* access modifiers changed from: private */
    /* renamed from: c4 */
    public static final void m52949c4(CardsDetailActivity cardsDetailActivity, int i) {
        C41536l.m120489i(cardsDetailActivity, "this$0");
        cardsDetailActivity.m52967l4(i);
        cardsDetailActivity.m52921O3();
    }

    /* access modifiers changed from: private */
    /* renamed from: d4 */
    public final void m52951d4() {
        C16250c cVar = this.f41940G;
        if (cVar == null) {
            C41536l.m120506z("binding");
            cVar = null;
        }
        Button button = cVar.f46031j;
        button.setOnClickListener(new C17424v(this));
        ImageView buttonIconImageView = button.getButtonIconImageView();
        if (buttonIconImageView != null) {
            buttonIconImageView.setImageResource(C12928b.f38167e);
        }
        button.setButtonText(C32343x.m95388F("cards.details.see.details", new Object[0]));
    }

    /* access modifiers changed from: private */
    /* renamed from: e4 */
    public static final void m52953e4(CardsDetailActivity cardsDetailActivity, View view) {
        C41536l.m120489i(cardsDetailActivity, "this$0");
        cardsDetailActivity.m52899C3().mo40114Bx().mo40090Gk();
    }

    /* access modifiers changed from: private */
    /* renamed from: f4 */
    public final void m52955f4() {
        C16250c cVar = this.f41940G;
        if (cVar == null) {
            C41536l.m120506z("binding");
            cVar = null;
        }
        Button button = cVar.f46031j;
        ImageView buttonIconImageView = button.getButtonIconImageView();
        if (buttonIconImageView != null) {
            buttonIconImageView.setImageResource(C12928b.icons_24_general_withdraw);
        }
        button.setButtonText(C32343x.m95388F("cards.details.change.daily.limit", new Object[0]));
        button.setOnClickListener(new C17395b0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: g4 */
    public static final void m52957g4(CardsDetailActivity cardsDetailActivity, View view) {
        C41536l.m120489i(cardsDetailActivity, "this$0");
        cardsDetailActivity.m52899C3().mo40121Nx();
    }

    /* renamed from: h4 */
    private final void m52959h4() {
        C16250c cVar = this.f41940G;
        if (cVar == null) {
            C41536l.m120506z("binding");
            cVar = null;
        }
        cVar.f46037p.setButtonText(C32343x.m95388F("card.details.change.pin", new Object[0]));
        C16250c cVar2 = this.f41940G;
        if (cVar2 == null) {
            C41536l.m120506z("binding");
            cVar2 = null;
        }
        BannerCard bannerCard = cVar2.f46034m;
        bannerCard.setInfoText(C32343x.m95388F("google.pay.banner.description", new Object[0]));
        bannerCard.setShowMoreText(C32343x.m95388F("google.pay.banner.button", new Object[0]));
        bannerCard.setOnClickListener(new C17401e0(this));
        bannerCard.setImageClickListener(new C17403f0(this));
        C16250c cVar3 = this.f41940G;
        if (cVar3 == null) {
            C41536l.m120506z("binding");
            cVar3 = null;
        }
        BannerCard bannerCard2 = cVar3.f46032k;
        bannerCard2.setButtonVisible(true);
        bannerCard2.setBannerImage(new Image.Resource(C36270d.icon_onboarding_mobile, (Boolean) null, 2, (DefaultConstructorMarker) null));
        bannerCard2.setInfoText(C32343x.m95388F("cards.details.financial.phone.bunner.text", new Object[0]));
        bannerCard2.setShowMoreText(C32343x.m95388F("cards.details.financial.phone.bunner.button", new Object[0]));
        bannerCard2.setOnClickListener(new C17405g0(this, bannerCard2));
    }

    /* access modifiers changed from: private */
    /* renamed from: i4 */
    public static final void m52961i4(CardsDetailActivity cardsDetailActivity, View view) {
        C41536l.m120489i(cardsDetailActivity, "this$0");
        cardsDetailActivity.m52981u3();
    }

    /* access modifiers changed from: private */
    /* renamed from: j4 */
    public static final void m52963j4(CardsDetailActivity cardsDetailActivity, View view) {
        C41536l.m120489i(cardsDetailActivity, "this$0");
        cardsDetailActivity.m52981u3();
    }

    /* access modifiers changed from: private */
    /* renamed from: k4 */
    public static final void m52965k4(CardsDetailActivity cardsDetailActivity, BannerCard bannerCard, View view) {
        C41536l.m120489i(cardsDetailActivity, "this$0");
        C41536l.m120489i(bannerCard, "$this_apply");
        if (cardsDetailActivity.f41946M != null) {
            C38122f c = C38125h.m112238c(cardsDetailActivity);
            Context context = bannerCard.getContext();
            C41536l.m120488h(context, "context");
            C38122f.C38123a.m112228x(c, context, cardsDetailActivity.m52984x3(), NavigatorConstants$JuniorFlow.FINANCIAL_NUMBER, false, 8, (Object) null);
        }
        C32343x.m95393H0(cardsDetailActivity, "sCool_number", (String) null, "click_banner", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
    }

    /* renamed from: l4 */
    private final void m52967l4(int i) {
        C16250c cVar = this.f41940G;
        if (cVar == null) {
            C41536l.m120506z("binding");
            cVar = null;
        }
        cVar.f46036o.mo6606l(i, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: m4 */
    public final void m52969m4(boolean z) {
        C16250c cVar = this.f41940G;
        if (cVar == null) {
            C41536l.m120506z("binding");
            cVar = null;
        }
        cVar.f46034m.setInfoText(C32343x.m95388F("google.pay.banner.description", new Object[0]));
    }

    /* access modifiers changed from: private */
    /* renamed from: n4 */
    public final void m52971n4(String str, String str2, C43064a aVar) {
        C13310d dVar = new C13310d();
        dVar.mo35648c2(str);
        dVar.mo35639Q1(str2);
        dVar.mo35642U1(getString(C12932f.f38192m));
        dVar.mo35646Z1(getString(C12932f.f38194o));
        dVar.mo35645Y1(new C17427y(dVar, aVar));
        dVar.mo35641T1(new C17428z(dVar));
        dVar.mo35647a2(C13310d.C13312b.TITLE_TWO_BUTTON);
        dVar.mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: o4 */
    public static final void m52973o4(C13310d dVar, C43064a aVar, Button button) {
        C41536l.m120489i(dVar, "$builder");
        C41536l.m120489i(aVar, "$yesAction");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    /* renamed from: p4 */
    public static final void m52975p4(C13310d dVar, Button button) {
        C41536l.m120489i(dVar, "$builder");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
    }

    /* renamed from: q4 */
    private final void m52977q4() {
        C16250c cVar = this.f41940G;
        if (cVar == null) {
            C41536l.m120506z("binding");
            cVar = null;
        }
        cVar.f46036o.mo6614p(this.f41953T);
    }

    /* renamed from: u3 */
    private final void m52981u3() {
        m52901E3("Google_Pay", C10457a.f29781b);
        if (mo40031A3().getGooglePayState() == GooglePayState.WALLET_NEEDS_CREATION) {
            C38125h.m112238c(this).mo91619n0(this);
        } else {
            C14335a.C14336a.m53063a(m52899C3().mo40114Bx(), (String) null, (String) null, (String) null, 7, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public final C41185v m52982v3() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        return C20288a.m66330e(supportFragmentManager, "SCA_CARD_BLOCK_TAG");
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public final C41185v m52983w3() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        return C20288a.m66330e(supportFragmentManager, "SCA_CARD_DETAILS_TAG");
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public final JuniorRequestDataUiModel m52984x3() {
        C18030a aVar = this.f41946M;
        if (aVar == null) {
            C41536l.m120506z("childInfoUiModel");
            aVar = null;
        }
        long a = aVar.mo45723a();
        long b = aVar.mo45724b();
        return new JuniorRequestDataUiModel((Long) null, aVar.mo45729f(), Long.valueOf(b), aVar.mo45726d(), aVar.mo45727e(), Long.valueOf(a), "", (Long) null, "", false, (Long) null, C11398b.f33141t, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public final C41185v m52985z3() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        return C20288a.m66330e(supportFragmentManager, "SCA_GOOGLE_PAY_TAG");
    }

    /* renamed from: A3 */
    public final PreferencesApiManager mo40031A3() {
        PreferencesApiManager preferencesApiManager = this.f41944K;
        if (preferencesApiManager != null) {
            return preferencesApiManager;
        }
        C41536l.m120506z("preferencesApiManager");
        return null;
    }

    /* renamed from: B3 */
    public final C8973b mo40032B3() {
        C8973b bVar = this.f41941H;
        if (bVar != null) {
            return bVar;
        }
        C41536l.m120506z("tapAndPayClient");
        return null;
    }

    /* renamed from: D3 */
    public final C14337b.C14342d mo40033D3() {
        C14337b.C14342d dVar = this.f41942I;
        if (dVar != null) {
            return dVar;
        }
        C41536l.m120506z("viewModelAssistedFactory");
        return null;
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        if (str4 != null) {
            int hashCode = str4.hashCode();
            if (hashCode != -1482995641) {
                if (hashCode != 890022844) {
                    if (hashCode == 1697120587 && str4.equals("SCA_GOOGLE_PAY_TAG")) {
                        m52899C3().mo40114Bx().mo40106gj(str, str2, str3);
                    }
                } else if (str4.equals("SCA_CARD_DETAILS_TAG")) {
                    m52899C3().mo40114Bx().mo40099ap(str, str2, str3);
                }
            } else if (str4.equals("SCA_CARD_BLOCK_TAG")) {
                m52899C3().mo40114Bx().mo40091In(str, str2, str3);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C16250c d = C16250c.m57935d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f41940G = d;
        C16250c cVar = null;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        super.mo37451O1(bundle);
        this.f41948O = getIntent().getLongExtra("CARD_ID", 0);
        if (!mo40038y3().mo96183k(this)) {
            C32343x.m95423W0(mo40038y3(), this);
        }
        C16250c cVar2 = this.f41940G;
        if (cVar2 == null) {
            C41536l.m120506z("binding");
            cVar2 = null;
        }
        cVar2.f46028g.setAdapter(this.f41951R);
        C16250c cVar3 = this.f41940G;
        if (cVar3 == null) {
            C41536l.m120506z("binding");
        } else {
            cVar = cVar3;
        }
        cVar.f46040s.setAdapter(this.f41952S);
        m52903F3();
        m52929S3();
        m52905G3();
        m52935V3();
        m52959h4();
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        C12910e.m48790h(this, str, (C12902d.C12905b) null, false, 6, (Object) null);
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
        C16250c cVar = this.f41940G;
        if (cVar == null) {
            C41536l.m120506z("binding");
            cVar = null;
        }
        FrameLayout frameLayout = cVar.f46038q;
        C41536l.m120488h(frameLayout, "binding.progressBar");
        C32343x.m95483r1(frameLayout, z, false, 2, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: W1 */
    public int mo40034W1() {
        return C12931e.menu_card_detail_toolbar;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 10036) {
            if (i == 10037 && i2 == -1) {
                C14335a.C14336a.m53063a(m52899C3().mo40114Bx(), (String) null, (String) null, (String) null, 7, (Object) null);
            }
        } else if (i2 == -1) {
            C21481a.onRefresh$default(m52899C3(), 0, 1, (Object) null);
            C12910e.m48797o(this, C32343x.m95388F(C32312j.f79736f, new Object[0]), C12902d.C12905b.C12907b.f38104a, false, 4, (Object) null);
            m52901E3("Conversion_Google_Pay", C10457a.f29785f);
        }
    }

    @C41452l
    public final void onCardSecurityUpdateEvent(CardSecurityUpdateEvent cardSecurityUpdateEvent) {
        C41536l.m120489i(cardSecurityUpdateEvent, "event");
        m52899C3().mo40114Bx().mo40101c();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C32343x.m95489t1(mo40038y3(), this);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C41536l.m120489i(menuItem, "item");
        if (menuItem.getItemId() != C12929c.f38174B) {
            return super.onOptionsItemSelected(menuItem);
        }
        m52899C3().mo40114Bx().mo40103d1();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m52899C3().mo40118Fx().mo40124Vr().mo4819k(this, new C14311m0(new C14305j0(this)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: w1 */
    public C30722p mo40037w1() {
        return this.f41954U;
    }

    /* renamed from: y3 */
    public final C41438c mo40038y3() {
        C41438c cVar = this.f41943J;
        if (cVar != null) {
            return cVar;
        }
        C41536l.m120506z("eventBus");
        return null;
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C12932f.card_header);
        C41536l.m120488h(string, "getString(R.string.card_header)");
        return string;
    }
}
