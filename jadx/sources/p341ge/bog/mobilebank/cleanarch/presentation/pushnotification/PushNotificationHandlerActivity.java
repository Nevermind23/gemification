package p341ge.bog.mobilebank.cleanarch.presentation.pushnotification;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.activity.ComponentActivity;
import androidx.activity.result.C0173b;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b00.C19305k;
import b41.C31128a;
import b41.C31132b;
import com.google.gson.Gson;
import g91.C32286a1;
import g91.C32335t0;
import g91.C32343x;
import gd1.C40992a;
import h00.C24849e;
import hd0.C24978b;
import hd1.C41205b;
import he1.C41212c;
import he1.C41217g;
import he1.C41225n;
import he1.C41228o;
import he1.C41238w;
import ih0.C25212e;
import iu0.C36546y;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jg1.C41438c;
import jg1.C41452l;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l50.C25836p;
import l50.C25841u;
import m41.C37224b;
import m50.C26144b;
import ml0.C26252e;
import n20.C26360b;
import n50.C26371b;
import ny0.C37500b;
import ny0.C37508i;
import o50.C26722a;
import o50.C26724b;
import o50.C26726c;
import o50.C26727c0;
import o50.C26735d;
import o50.C26737e;
import o50.C26739f;
import o50.C26740g;
import o50.C26741h;
import o50.C26742i;
import o50.C26743j;
import o50.C26744k;
import o50.C26745l;
import o50.C26746m;
import o50.C26747n;
import o50.C26748o;
import o50.C26749p;
import o50.C26750q;
import o50.C26751r;
import o50.C26754u;
import o50.C26756w;
import org.parceler.C42035e;
import p163m0.C7047a;
import p341ge.bog.chat.data.ChatUser;
import p341ge.bog.mobilebank.cleanarch.banner.presentation.activity.BannerDetailsActivity;
import p341ge.bog.mobilebank.cleanarch.banner.presentation.model.BannerDeepLinkData;
import p341ge.bog.mobilebank.cleanarch.banner.presentation.model.BannerParameterData;
import p341ge.bog.mobilebank.cleanarch.becomesolo.presentation.BecomeSoloDescriptionActivity;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo;
import p341ge.bog.mobilebank.cleanarch.junior.presentation.JuniorRequestDataUiModel;
import p341ge.bog.mobilebank.cleanarch.moremenu.presentation.PackageType;
import p341ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.OffersAndApplicationsActivity;
import p341ge.bog.mobilebank.cleanarch.openbanking.OpenBankingAuthActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.SelectBillSplitMoneyRequestActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.MoneyRequestDetailsActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.financemanagement.FinanceManagementActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.pushnotification.C22340b;
import p341ge.bog.mobilebank.cleanarch.presentation.referals.ReferalsActivity;
import p341ge.bog.mobilebank.cleanarch.qrscanner.presentation.QrScannerActivity;
import p341ge.bog.mobilebank.cleanarch.settings.presentation.SecuritySettingsActivity;
import p341ge.bog.mobilebank.eventbus.events.LoansEvent;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.KeyValue;
import p341ge.bog.mobilebank.model.credit.CardsContainer;
import p341ge.bog.mobilebank.model.credit.CreditCardAccount;
import p341ge.bog.mobilebank.model.credit.CreditCardsWrapper;
import p341ge.bog.mobilebank.model.loans.LoansWrapper;
import p341ge.bog.mobilebank.model.notification.NotificationActionCode;
import p341ge.bog.mobilebank.model.usrinfo.ClientInfoWrapper;
import p341ge.bog.mobilebank.model.usrinfo.UserRestrictions;
import p341ge.bog.mobilebank.p975ui.activities.CarTemplateGroupActivity;
import p341ge.bog.mobilebank.p975ui.activities.ContactUsActivity;
import p341ge.bog.mobilebank.p975ui.activities.DDSTOListActivity;
import p341ge.bog.mobilebank.p975ui.activities.ExchangeActivity;
import p341ge.bog.mobilebank.p975ui.activities.MainActivity;
import p341ge.bog.mobilebank.p975ui.activities.NotificationListActivity;
import p341ge.bog.mobilebank.p975ui.activities.OperationDetailsActivity;
import p341ge.bog.mobilebank.p975ui.activities.PaymentsTemplateListActivity;
import p341ge.bog.mobilebank.p975ui.activities.ProductDetailedActivity;
import p341ge.bog.mobilebank.p975ui.activities.ProviderListActivity;
import p341ge.bog.mobilebank.p975ui.activities.ThreeDSecurityActivity;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.model.GooglePayState;
import p341ge.bog.mobilebank.rest.model.RestCallback;
import p341ge.bog.mobilebank.shared.OtherTransferTypeState;
import p341ge.bog.mobilebank.shared.P2PFlowType;
import p341ge.bog.mobilebank.shared.navigation.NavigatorConstants$JuniorFlow;
import p341ge.bog.mobilebank.transfers.model.TransferForm;
import p341ge.bog.sso_client.onboarding.OnBoardingActivity;
import p341ge.bog.sso_client.passwordrecovery.PasswordRecoveryActivity;
import p366bk.C10322k;
import p366bk.C10324m;
import p380ck.C10457a;
import p380ck.C10464h;
import p653wf.C18569a;
import p738du.C20101a;
import p748eu.C20292b;
import p758fu.C20557a;
import p842nv.C26615g;
import p843nw.C26628j;
import p843nw.C26633o;
import p863pw.C27633k;
import p863pw.C27635m;
import p863pw.C27636n;
import p863pw.C27637o;
import p90.C27399q1;
import p951xz.C29879c;
import q31.C38122f;
import q31.C38125h;
import q70.C27685a;
import r31.C38281a;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity */
public final class PushNotificationHandlerActivity extends C22338a {

    /* renamed from: a0 */
    public static final C22291a f59140a0 = new C22291a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public Client f59141G;

    /* renamed from: H */
    public C18569a f59142H;

    /* renamed from: I */
    public PreferencesApiManager f59143I;

    /* renamed from: J */
    public C20292b f59144J;

    /* renamed from: K */
    public C26615g f59145K;

    /* renamed from: L */
    public C26628j f59146L;

    /* renamed from: M */
    public C26633o f59147M;

    /* renamed from: N */
    public C29879c f59148N;

    /* renamed from: O */
    public C26754u f59149O;

    /* renamed from: P */
    public C20292b f59150P;

    /* renamed from: Q */
    public BankApi f59151Q;

    /* renamed from: R */
    public C41438c f59152R;

    /* renamed from: S */
    public C26144b f59153S;

    /* renamed from: T */
    private final C41217g f59154T = new C1617p0(C41520a0.m120436b(C26727c0.class), new C22326r0(this), new C22330t0(this), new C22328s0((C43064a) null, this));

    /* renamed from: U */
    private C27399q1 f59155U;

    /* renamed from: V */
    private final C41217g f59156V = C41219i.m119470b(new C22333v(this));

    /* renamed from: W */
    private final C41217g f59157W = C41219i.m119470b(new C22322p0(this));

    /* renamed from: X */
    private final C41217g f59158X = C41219i.m119470b(new C22318n0(this));

    /* renamed from: Y */
    private final C41217g f59159Y = C41219i.m119470b(new C22320o0(this));

    /* renamed from: Z */
    private final C41217g f59160Z = C41219i.m119470b(new C22334w(this));

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$a */
    public static final class C22291a {
        private C22291a() {
        }

        public /* synthetic */ C22291a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo55229a(Activity activity, Intent intent) {
            C41536l.m120489i(activity, "activity");
            C41536l.m120489i(intent, "receivedIntent");
            Intent intent2 = new Intent(activity, PushNotificationHandlerActivity.class);
            intent2.putExtra("RECEIVED_INTENT", intent.getExtras());
            intent2.putExtra("INITIATED_FROM_MAINACTIVITY", activity instanceof MainActivity);
            activity.startActivity(intent2);
            activity.overridePendingTransition(0, 0);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$a0 */
    static final class C22292a0 extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ PushNotificationHandlerActivity f59161d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22292a0(PushNotificationHandlerActivity pushNotificationHandlerActivity) {
            super(2);
            this.f59161d = pushNotificationHandlerActivity;
        }

        /* renamed from: a */
        public final void mo55230a(Throwable th, CreditCardsWrapper creditCardsWrapper) {
            C41536l.m120489i(th, "<anonymous parameter 0>");
            this.f59161d.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo55230a((Throwable) obj, (CreditCardsWrapper) obj2);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$b */
    static final class C22293b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PushNotificationHandlerActivity f59162d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22293b(PushNotificationHandlerActivity pushNotificationHandlerActivity) {
            super(1);
            this.f59162d = pushNotificationHandlerActivity;
        }

        /* renamed from: a */
        public final void mo55231a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f59162d.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55231a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$b0 */
    static final class C22294b0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PushNotificationHandlerActivity f59163d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22294b0(PushNotificationHandlerActivity pushNotificationHandlerActivity) {
            super(1);
            this.f59163d = pushNotificationHandlerActivity;
        }

        /* renamed from: a */
        public final void mo55232a(C37508i iVar) {
            this.f59163d.m72283N5();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55232a((C37508i) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$c */
    /* synthetic */ class C22295c extends C41535k implements C43075l {
        C22295c(Object obj) {
            super(1, obj, PushNotificationHandlerActivity.class, "onDepositBondsResult", "onDepositBondsResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo55233b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((PushNotificationHandlerActivity) this.receiver).m72235B5(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55233b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$c0 */
    static final class C22296c0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PushNotificationHandlerActivity f59164d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22296c0(PushNotificationHandlerActivity pushNotificationHandlerActivity) {
            super(1);
            this.f59164d = pushNotificationHandlerActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f59164d.finish();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$d */
    /* synthetic */ class C22297d extends C41535k implements C43075l {
        C22297d(Object obj) {
            super(1, obj, PushNotificationHandlerActivity.class, "onJuniorResult", "onJuniorResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo55235b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((PushNotificationHandlerActivity) this.receiver).m72243D5(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55235b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$d0 */
    static final class C22298d0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PushNotificationHandlerActivity f59165d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22298d0(PushNotificationHandlerActivity pushNotificationHandlerActivity) {
            super(1);
            this.f59165d = pushNotificationHandlerActivity;
        }

        /* renamed from: a */
        public final void mo55236a(C37508i iVar) {
            Long l;
            C41536l.m120489i(iVar, "depositsAndBonds");
            PushNotificationHandlerActivity pushNotificationHandlerActivity = this.f59165d;
            String D1 = pushNotificationHandlerActivity.mo55213D1("AGREE_KEY", pushNotificationHandlerActivity.m72372t3());
            if (D1 != null) {
                l = C40438v.m117100l(D1);
            } else {
                l = null;
            }
            if (l != null && (iVar.mo90721b(l.longValue()) != null || iVar.mo90720a(l.longValue()) != null)) {
                C38125h.m112238c(this.f59165d).mo91606h(this.f59165d, l.longValue());
            } else if (iVar.mo90723d().size() == 1) {
                C38125h.m112238c(this.f59165d).mo91606h(this.f59165d, ((C37500b) C41358y.m120007W(iVar.mo90723d())).mo90668d());
            } else if (!iVar.mo90723d().isEmpty()) {
                C38125h.m112238c(this.f59165d).mo91588Z(this.f59165d, C27685a.ACC_TYPE_DEPOSIT);
            }
            this.f59165d.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55236a((C37508i) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$e */
    /* synthetic */ class C22299e extends C41535k implements C43075l {
        C22299e(Object obj) {
            super(1, obj, PushNotificationHandlerActivity.class, "onCreditCardsResult", "onCreditCardsResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo55237b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((PushNotificationHandlerActivity) this.receiver).m72231A5(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55237b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$e0 */
    static final class C22300e0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PushNotificationHandlerActivity f59166d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22300e0(PushNotificationHandlerActivity pushNotificationHandlerActivity) {
            super(1);
            this.f59166d = pushNotificationHandlerActivity;
        }

        /* renamed from: a */
        public final void mo55238a(C25212e eVar) {
            this.f59166d.m72283N5();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55238a((C25212e) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$f */
    /* synthetic */ class C22301f extends C41535k implements C43075l {
        C22301f(Object obj) {
            super(1, obj, PushNotificationHandlerActivity.class, "onLoanDetailsResult", "onLoanDetailsResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo55239b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((PushNotificationHandlerActivity) this.receiver).m72247E5(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55239b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$f0 */
    static final class C22302f0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PushNotificationHandlerActivity f59167d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22302f0(PushNotificationHandlerActivity pushNotificationHandlerActivity) {
            super(1);
            this.f59167d = pushNotificationHandlerActivity;
        }

        /* renamed from: a */
        public final void mo55240a(C25212e eVar) {
            C41536l.m120489i(eVar, "it");
            if (eVar.mo63731b()) {
                this.f59167d.m72251F5();
            } else {
                this.f59167d.finish();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55240a((C25212e) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$g */
    static final class C22303g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PushNotificationHandlerActivity f59168d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22303g(PushNotificationHandlerActivity pushNotificationHandlerActivity) {
            super(1);
            this.f59168d = pushNotificationHandlerActivity;
        }

        /* renamed from: a */
        public final void mo55241a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f59168d.m72279M5();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55241a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$g0 */
    static final class C22304g0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PushNotificationHandlerActivity f59169d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22304g0(PushNotificationHandlerActivity pushNotificationHandlerActivity) {
            super(1);
            this.f59169d = pushNotificationHandlerActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f59169d.finish();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$h */
    /* synthetic */ class C22305h extends C41535k implements C43075l {
        C22305h(Object obj) {
            super(1, obj, PushNotificationHandlerActivity.class, "onGamificationResult", "onGamificationResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo55243b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((PushNotificationHandlerActivity) this.receiver).m72239C5(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55243b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$h0 */
    static final class C22306h0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PushNotificationHandlerActivity f59170d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22306h0(PushNotificationHandlerActivity pushNotificationHandlerActivity) {
            super(1);
            this.f59170d = pushNotificationHandlerActivity;
        }

        /* renamed from: a */
        public final void mo55244a(List list) {
            this.f59170d.m72283N5();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55244a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$i */
    static final class C22307i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PushNotificationHandlerActivity f59171d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22307i(PushNotificationHandlerActivity pushNotificationHandlerActivity) {
            super(1);
            this.f59171d = pushNotificationHandlerActivity;
        }

        /* renamed from: a */
        public final void mo55245a(C41205b bVar) {
            this.f59171d.m72283N5();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55245a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$i0 */
    static final class C22308i0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PushNotificationHandlerActivity f59172d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22308i0(PushNotificationHandlerActivity pushNotificationHandlerActivity) {
            super(1);
            this.f59172d = pushNotificationHandlerActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            C38122f.C38123a.m112228x(C38125h.m112238c(this.f59172d), this.f59172d, (JuniorRequestDataUiModel) null, NavigatorConstants$JuniorFlow.ACTIVATION, false, 8, (Object) null);
            this.f59172d.finish();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$j */
    static final class C22309j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PushNotificationHandlerActivity f59173d;

        /* renamed from: e */
        final /* synthetic */ long f59174e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22309j(PushNotificationHandlerActivity pushNotificationHandlerActivity, long j) {
            super(1);
            this.f59173d = pushNotificationHandlerActivity;
            this.f59174e = j;
        }

        /* renamed from: a */
        public final void mo55247a(C27637o oVar) {
            Object obj;
            C27636n v;
            List w = C41343r.m119927w(oVar.mo67167a().values());
            long j = this.f59174e;
            Iterator it = w.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                C27636n v2 = ((C27635m) obj).mo67139v();
                boolean z = false;
                if (v2 != null && v2.mo67146c() == j) {
                    z = true;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            C27635m mVar = (C27635m) obj;
            if (!(mVar == null || (v = mVar.mo67139v()) == null)) {
                C25841u uVar = r2;
                C25841u uVar2 = new C25841u(v.mo67146c(), v.mo67144a(), v.mo67147d(), v.mo67164s(), v.mo67159n(), v.mo67150f(), v.mo67155j(), (Long) null, v.mo67157l(), v.mo67158m(), v.mo67154i(), v.mo67162q(), v.mo67160o(), v.mo67148e(), v.mo67163r(), (C24978b) null, (String) null, v.mo67152h(), v.mo67145b());
                ThreeDSecurityActivity.m104877T2(this.f59173d.m72350j3(), uVar);
            }
            this.f59173d.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55247a((C27637o) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$j0 */
    static final class C22310j0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PushNotificationHandlerActivity f59175d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22310j0(PushNotificationHandlerActivity pushNotificationHandlerActivity) {
            super(1);
            this.f59175d = pushNotificationHandlerActivity;
        }

        /* renamed from: a */
        public final void mo55248a(List list) {
            C41536l.m120489i(list, "it");
            C38122f.C38123a.m112228x(C38125h.m112238c(this.f59175d), this.f59175d, (JuniorRequestDataUiModel) C41358y.m120009Y(list), NavigatorConstants$JuniorFlow.ACTIVATION, false, 8, (Object) null);
            this.f59175d.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55248a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$k */
    static final class C22311k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PushNotificationHandlerActivity f59176d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22311k(PushNotificationHandlerActivity pushNotificationHandlerActivity) {
            super(1);
            this.f59176d = pushNotificationHandlerActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f59176d.finish();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$k0 */
    static final class C22312k0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PushNotificationHandlerActivity f59177d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22312k0(PushNotificationHandlerActivity pushNotificationHandlerActivity) {
            super(1);
            this.f59177d = pushNotificationHandlerActivity;
        }

        /* renamed from: a */
        public final void mo55250a(LoansWrapper loansWrapper) {
            this.f59177d.m72283N5();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55250a((LoansWrapper) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$l */
    static final class C22313l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PushNotificationHandlerActivity f59178d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22313l(PushNotificationHandlerActivity pushNotificationHandlerActivity) {
            super(1);
            this.f59178d = pushNotificationHandlerActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C41536l.m120488h(bool, "isAllowed");
            if (bool.booleanValue()) {
                C38125h.m112238c(this.f59178d.m72350j3()).mo91590a(this.f59178d.m72350j3());
                this.f59178d.finish();
                return;
            }
            C19305k.f53530L.mo47528a().mo4576A1(this.f59178d.getSupportFragmentManager(), (String) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$l0 */
    static final class C22314l0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PushNotificationHandlerActivity f59179d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22314l0(PushNotificationHandlerActivity pushNotificationHandlerActivity) {
            super(1);
            this.f59179d = pushNotificationHandlerActivity;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x006e  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0085  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x004e A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo55252a(p341ge.bog.mobilebank.model.loans.LoansWrapper r12) {
            /*
                r11 = this;
                java.lang.String r0 = "loans"
                kotlin.jvm.internal.C41536l.m120489i(r12, r0)
                r0 = 0
                ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity r1 = r11.f59179d     // Catch:{ Exception -> 0x001d }
                java.lang.String r2 = "LOAN_KEY"
                java.util.ArrayList r3 = r1.m72372t3()     // Catch:{ Exception -> 0x001d }
                java.lang.String r1 = r1.mo55213D1(r2, r3)     // Catch:{ Exception -> 0x001d }
                if (r1 == 0) goto L_0x001d
                long r1 = java.lang.Long.parseLong(r1)     // Catch:{ Exception -> 0x001d }
                java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ Exception -> 0x001d }
                goto L_0x001e
            L_0x001d:
                r1 = r0
            L_0x001e:
                java.util.ArrayList r2 = r12.getLoans()
                java.lang.String r3 = "loans.loans"
                kotlin.jvm.internal.C41536l.m120488h(r2, r3)
                java.util.Iterator r2 = r2.iterator()
            L_0x002b:
                boolean r4 = r2.hasNext()
                r5 = 0
                r6 = 1
                if (r4 == 0) goto L_0x004e
                java.lang.Object r4 = r2.next()
                r7 = r4
                ge.bog.mobilebank.model.loans.Loan r7 = (p341ge.bog.mobilebank.model.loans.Loan) r7
                if (r1 == 0) goto L_0x004a
                long r7 = r7.getLoanKey()
                long r9 = r1.longValue()
                int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r7 != 0) goto L_0x004a
                r7 = r6
                goto L_0x004b
            L_0x004a:
                r7 = r5
            L_0x004b:
                if (r7 == 0) goto L_0x002b
                goto L_0x004f
            L_0x004e:
                r4 = r0
            L_0x004f:
                ge.bog.mobilebank.model.loans.Loan r4 = (p341ge.bog.mobilebank.model.loans.Loan) r4
                if (r4 != 0) goto L_0x006b
                java.util.ArrayList r1 = r12.getLoans()
                int r1 = r1.size()
                if (r1 != r6) goto L_0x006c
                java.util.ArrayList r0 = r12.getLoans()
                kotlin.jvm.internal.C41536l.m120488h(r0, r3)
                java.lang.Object r0 = ie1.C41358y.m120007W(r0)
                ge.bog.mobilebank.model.loans.Loan r0 = (p341ge.bog.mobilebank.model.loans.Loan) r0
                goto L_0x006c
            L_0x006b:
                r0 = r4
            L_0x006c:
                if (r0 == 0) goto L_0x0085
                ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity r12 = r11.f59179d
                q31.f r1 = q31.C38125h.m112238c(r12)
                ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity r2 = r11.f59179d
                long r3 = r0.getLoanKey()
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                r4 = 0
                r5 = 4
                r6 = 0
                q31.C38122f.C38123a.m112229y(r1, r2, r3, r4, r5, r6)
                goto L_0x009f
            L_0x0085:
                java.util.ArrayList r12 = r12.getLoans()
                if (r12 == 0) goto L_0x0091
                boolean r12 = r12.isEmpty()
                if (r12 == 0) goto L_0x0092
            L_0x0091:
                r5 = r6
            L_0x0092:
                if (r5 != 0) goto L_0x009f
                ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity r12 = r11.f59179d
                q31.f r12 = q31.C38125h.m112238c(r12)
                ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity r0 = r11.f59179d
                r12.mo91630t(r0)
            L_0x009f:
                ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity r12 = r11.f59179d
                r12.finish()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity.C22314l0.mo55252a(ge.bog.mobilebank.model.loans.LoansWrapper):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55252a((LoansWrapper) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$m */
    static final class C22315m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PushNotificationHandlerActivity f59180d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22315m(PushNotificationHandlerActivity pushNotificationHandlerActivity) {
            super(1);
            this.f59180d = pushNotificationHandlerActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f59180d.finish();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$m0 */
    static final class C22316m0 extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ PushNotificationHandlerActivity f59181d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22316m0(PushNotificationHandlerActivity pushNotificationHandlerActivity) {
            super(2);
            this.f59181d = pushNotificationHandlerActivity;
        }

        /* renamed from: a */
        public final void mo55254a(Throwable th, LoansWrapper loansWrapper) {
            C41536l.m120489i(th, "<anonymous parameter 0>");
            this.f59181d.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo55254a((Throwable) obj, (LoansWrapper) obj2);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$n */
    static final class C22317n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PushNotificationHandlerActivity f59182d;

        /* renamed from: e */
        final /* synthetic */ String f59183e;

        /* renamed from: f */
        final /* synthetic */ String f59184f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22317n(PushNotificationHandlerActivity pushNotificationHandlerActivity, String str, String str2) {
            super(1);
            this.f59182d = pushNotificationHandlerActivity;
            this.f59183e = str;
            this.f59184f = str2;
        }

        /* renamed from: a */
        public final void mo55255a(List list) {
            Object obj;
            boolean z;
            C41536l.m120489i(list, "offers");
            String str = this.f59183e;
            String str2 = this.f59184f;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                OfferInfo offerInfo = (OfferInfo) obj;
                if (!C41536l.m120484d(offerInfo.getOfferNo(), str) || !C41536l.m120484d(offerInfo.getOperType(), str2)) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            OfferInfo offerInfo2 = (OfferInfo) obj;
            if (offerInfo2 != null) {
                OfferNavigatorActivity.f58469H.mo54606a(this.f59182d, offerInfo2);
            }
            this.f59182d.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55255a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$n0 */
    static final class C22318n0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PushNotificationHandlerActivity f59185d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22318n0(PushNotificationHandlerActivity pushNotificationHandlerActivity) {
            super(0);
            this.f59185d = pushNotificationHandlerActivity;
        }

        public final String invoke() {
            Bundle V2 = this.f59185d.m72384y3();
            if (V2 != null) {
                return V2.getString("messageId");
            }
            return null;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$o */
    static final class C22319o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PushNotificationHandlerActivity f59186d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22319o(PushNotificationHandlerActivity pushNotificationHandlerActivity) {
            super(1);
            this.f59186d = pushNotificationHandlerActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f59186d.finish();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$o0 */
    static final class C22320o0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PushNotificationHandlerActivity f59187d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22320o0(PushNotificationHandlerActivity pushNotificationHandlerActivity) {
            super(0);
            this.f59187d = pushNotificationHandlerActivity;
        }

        public final String invoke() {
            Bundle V2 = this.f59187d.m72384y3();
            if (V2 != null) {
                return V2.getString("type");
            }
            return null;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$p */
    static final class C22321p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PushNotificationHandlerActivity f59188d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22321p(PushNotificationHandlerActivity pushNotificationHandlerActivity) {
            super(1);
            this.f59188d = pushNotificationHandlerActivity;
        }

        /* renamed from: a */
        public final void mo55257a(C41205b bVar) {
            this.f59188d.m72283N5();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55257a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$p0 */
    static final class C22322p0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PushNotificationHandlerActivity f59189d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22322p0(PushNotificationHandlerActivity pushNotificationHandlerActivity) {
            super(0);
            this.f59189d = pushNotificationHandlerActivity;
        }

        /* renamed from: b */
        public final Bundle invoke() {
            return this.f59189d.getIntent().getBundleExtra("RECEIVED_INTENT");
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$q */
    static final class C22323q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PushNotificationHandlerActivity f59190d;

        /* renamed from: e */
        final /* synthetic */ String f59191e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22323q(PushNotificationHandlerActivity pushNotificationHandlerActivity, String str) {
            super(1);
            this.f59190d = pushNotificationHandlerActivity;
            this.f59191e = str;
        }

        /* renamed from: a */
        public final void mo55259a(List list) {
            PushNotificationHandlerActivity pushNotificationHandlerActivity = this.f59190d;
            pushNotificationHandlerActivity.m72259H5(this.f59191e, list, pushNotificationHandlerActivity.m72372t3());
            this.f59190d.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55259a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$q0 */
    static final class C22324q0 implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f59192a;

        C22324q0(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f59192a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f59192a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f59192a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$r */
    static final class C22325r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PushNotificationHandlerActivity f59193d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22325r(PushNotificationHandlerActivity pushNotificationHandlerActivity) {
            super(1);
            this.f59193d = pushNotificationHandlerActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f59193d.finish();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$r0 */
    public static final class C22326r0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f59194d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22326r0(ComponentActivity componentActivity) {
            super(0);
            this.f59194d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f59194d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$s */
    static final class C22327s extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PushNotificationHandlerActivity f59195d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22327s(PushNotificationHandlerActivity pushNotificationHandlerActivity) {
            super(1);
            this.f59195d = pushNotificationHandlerActivity;
        }

        /* renamed from: a */
        public final void mo55263a(C41205b bVar) {
            this.f59195d.m72283N5();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55263a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$s0 */
    public static final class C22328s0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f59196d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f59197e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22328s0(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f59196d = aVar;
            this.f59197e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f59196d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f59197e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$t */
    static final class C22329t extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PushNotificationHandlerActivity f59198d;

        /* renamed from: e */
        final /* synthetic */ String f59199e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22329t(PushNotificationHandlerActivity pushNotificationHandlerActivity, String str) {
            super(1);
            this.f59198d = pushNotificationHandlerActivity;
            this.f59199e = str;
        }

        /* renamed from: a */
        public final void mo55264a(C27633k kVar) {
            C41536l.m120489i(kVar, "accountsWithCards");
            try {
                C25836p i = this.f59198d.mo55215i3().mo65068i(kVar);
                long c = C26371b.m82433c(i, Long.parseLong(this.f59199e));
                if (c < 0) {
                    c = this.f59198d.mo55217l3().getProductKeyByCardId(Long.parseLong(this.f59199e));
                }
                if (c > 0) {
                    Intent intent = new Intent(this.f59198d.m72350j3(), ProductDetailedActivity.class);
                    int f = C26371b.m82436f(i, Long.parseLong(this.f59199e));
                    if (f < 0) {
                        f = this.f59198d.mo55217l3().getCardPositionByCardId(Long.parseLong(this.f59199e));
                    }
                    if (f < -1) {
                        f = 0;
                    }
                    intent.putExtra("PRODUCT_INDEX", f);
                    intent.putExtra("PRODUCT_TYPE_KEY", 6);
                    intent.putExtra("PRODUCT_KEY", c);
                    this.f59198d.startActivity(intent);
                }
            } catch (Exception unused) {
                this.f59198d.finish();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55264a((C27633k) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$t0 */
    static final class C22330t0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PushNotificationHandlerActivity f59200d;

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$t0$a */
        static final class C22331a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ PushNotificationHandlerActivity f59201d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C22331a(PushNotificationHandlerActivity pushNotificationHandlerActivity) {
                super(0);
                this.f59201d = pushNotificationHandlerActivity;
            }

            /* renamed from: b */
            public final C26727c0 invoke() {
                return this.f59201d.mo55219n3().create();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22330t0(PushNotificationHandlerActivity pushNotificationHandlerActivity) {
            super(0);
            this.f59200d = pushNotificationHandlerActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C32286a1.f79687a.mo72809a(new C22331a(this.f59200d));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$u */
    static final class C22332u extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PushNotificationHandlerActivity f59202d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22332u(PushNotificationHandlerActivity pushNotificationHandlerActivity) {
            super(1);
            this.f59202d = pushNotificationHandlerActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f59202d.finish();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$v */
    static final class C22333v extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PushNotificationHandlerActivity f59203d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22333v(PushNotificationHandlerActivity pushNotificationHandlerActivity) {
            super(0);
            this.f59203d = pushNotificationHandlerActivity;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            return Boolean.valueOf(this.f59203d.getIntent().getBooleanExtra("INITIATED_FROM_MAINACTIVITY", false));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$w */
    static final class C22334w extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PushNotificationHandlerActivity f59204d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22334w(PushNotificationHandlerActivity pushNotificationHandlerActivity) {
            super(0);
            this.f59204d = pushNotificationHandlerActivity;
        }

        /* renamed from: b */
        public final ArrayList invoke() {
            Bundle V2 = this.f59204d.m72384y3();
            ArrayList arrayList = (ArrayList) C42035e.m122119a(V2 != null ? V2.getParcelable("parameters") : null);
            return arrayList == null ? new ArrayList() : arrayList;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$x */
    public static final class C22335x extends RestCallback {
        C22335x() {
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$y */
    static final class C22336y extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PushNotificationHandlerActivity f59205d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22336y(PushNotificationHandlerActivity pushNotificationHandlerActivity) {
            super(1);
            this.f59205d = pushNotificationHandlerActivity;
        }

        /* renamed from: a */
        public final void mo55269a(CreditCardsWrapper creditCardsWrapper) {
            this.f59205d.m72283N5();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55269a((CreditCardsWrapper) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity$z */
    static final class C22337z extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31128a f59206d;

        /* renamed from: e */
        final /* synthetic */ PushNotificationHandlerActivity f59207e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22337z(C31128a aVar, PushNotificationHandlerActivity pushNotificationHandlerActivity) {
            super(1);
            this.f59206d = aVar;
            this.f59207e = pushNotificationHandlerActivity;
        }

        /* renamed from: a */
        public final void mo55270a(CreditCardsWrapper creditCardsWrapper) {
            ArrayList<CreditCardAccount> arrayList;
            boolean z;
            CardsContainer cardsContainer;
            C41536l.m120489i(creditCardsWrapper, "it");
            CreditCardsWrapper creditCardsWrapper2 = (CreditCardsWrapper) this.f59206d.mo71340a();
            CreditCardAccount creditCardAccount = null;
            if (creditCardsWrapper2 == null || (cardsContainer = creditCardsWrapper2.getCardsContainer()) == null) {
                arrayList = null;
            } else {
                arrayList = cardsContainer.getAccounts();
            }
            boolean z2 = true;
            if (arrayList == null || arrayList.size() != 1) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                creditCardAccount = (CreditCardAccount) C41358y.m120007W(arrayList);
            }
            if (creditCardAccount != null) {
                C38125h.m112238c(this.f59207e).mo91546E(this.f59207e, creditCardAccount.acctKey);
            } else {
                if (arrayList != null && !arrayList.isEmpty()) {
                    z2 = false;
                }
                if (!z2) {
                    C38125h.m112238c(this.f59207e).mo91588Z(this.f59207e, C27685a.ACC_TYPE_CREDIT_CARD);
                }
            }
            this.f59207e.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55270a((CreditCardsWrapper) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: A3 */
    private final C26727c0 m72229A3() {
        return (C26727c0) this.f59154T.getValue();
    }

    /* renamed from: A4 */
    private final void m72230A4() {
        Integer num;
        String D1 = mo55213D1("offerId", m72372t3());
        if (D1 != null) {
            num = C40438v.m117098j(D1);
        } else {
            num = null;
        }
        if (num != null) {
            C38125h.m112238c(this).mo91567O0(this, num.intValue());
        } else {
            C38125h.m112238c(this).mo91615l0(this);
        }
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: A5 */
    public final void m72231A5(C31128a aVar) {
        if (C41536l.m120484d(m72381x3(), "CREDIT_CARD_PRODUCTS")) {
            C31132b.m92646h(aVar, (int[]) null, new C22336y(this), 1, (Object) null);
            C31132b.m92648j(aVar, (int[]) null, new C22337z(aVar, this), 1, (Object) null);
            C31132b.m92644f(aVar, (int[]) null, new C22292a0(this), 1, (Object) null);
        }
    }

    /* renamed from: B3 */
    private final void m72233B3(String str, String str2) {
        C36546y.m108282F().mo27137H(str, str2, (String) null, (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
    }

    /* renamed from: B4 */
    private final void m72234B4() {
        m72386y5(this, "ACTION_OPEN_LIFESTYLE_OFFERS_TAB", (Bundle) null, 2, (Object) null);
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: B5 */
    public final void m72235B5(C31128a aVar) {
        if (C41358y.m119999O(C41341q.m119910m("CDS_AGREE", "PRODUCTS_DEPOSITS"), m72381x3())) {
            C31132b.m92646h(aVar, (int[]) null, new C22294b0(this), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C22296c0(this), 1, (Object) null);
            C31132b.m92648j(aVar, (int[]) null, new C22298d0(this), 1, (Object) null);
        }
    }

    /* renamed from: C3 */
    private final void m72237C3() {
        m72229A3().mo65944ow().mo55276v7();
    }

    /* renamed from: C4 */
    private final void m72238C4() {
        boolean z;
        String D1 = mo55213D1("LOAN_KEY", m72372t3());
        if (D1 == null || C40439w.m117118v(D1)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            finish();
            return;
        }
        C32343x.m95423W0(mo55218m3(), this);
        mo55217l3().requestLoans(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: C5 */
    public final void m72239C5(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C22300e0(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C22302f0(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C22304g0(this), 1, (Object) null);
    }

    /* renamed from: D3 */
    private final void m72241D3() {
        String D1 = mo55213D1("CARD_ID", m72372t3());
        if (D1 != null) {
            C41205b G0 = C26633o.m83102d(mo55224r3(), false, 1, (Object) null).mo95027o0(C40992a.m118827a()).mo94980F(new C26743j(new C22307i(this))).mo94983G0(new C26744k(new C22309j(this, Long.parseLong(D1))), new C26745l(new C22311k(this)));
            C41536l.m120488h(G0, "private fun handle3dSecu…mpositeDisposable()\n    }");
            m72345h3(G0);
            return;
        }
        finish();
    }

    /* renamed from: D4 */
    private final void m72242D4() {
        long j;
        Long l;
        String D1 = mo55213D1("messageId", m72372t3());
        if (D1 == null) {
            Bundle y3 = m72384y3();
            if (y3 != null) {
                D1 = y3.getString("messageId");
            } else {
                D1 = null;
            }
        }
        Activity j3 = m72350j3();
        if (D1 == null || (l = C40438v.m117100l(D1)) == null) {
            j = -1;
        } else {
            j = l.longValue();
        }
        NotificationListActivity.m104383P2(j3, j);
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: D5 */
    public final void m72243D5(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C22306h0(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C22308i0(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C22310j0(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public static final void m72245E3(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: E4 */
    private final void m72246E4() {
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: E5 */
    public final void m72247E5(C31128a aVar) {
        if (C41536l.m120484d(m72381x3(), "LOAN_PRODUCTS")) {
            C31132b.m92646h(aVar, (int[]) null, new C22312k0(this), 1, (Object) null);
            C31132b.m92648j(aVar, (int[]) null, new C22314l0(this), 1, (Object) null);
            C31132b.m92644f(aVar, (int[]) null, new C22316m0(this), 1, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F3 */
    public static final void m72249F3(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: F4 */
    private final void m72250F4() {
        Long l;
        String D1 = mo55213D1("REQUEST_ID", m72372t3());
        if (D1 != null) {
            l = C40438v.m117100l(D1);
        } else {
            l = null;
        }
        if (l == null) {
            m72371s5();
        } else if (C41536l.m120484d(m72381x3(), "REJECT_REQUEST")) {
            MoneyRequestDetailsActivity.f58221M.mo54420a(this, l.longValue());
            finish();
        } else {
            C36546y.m108282F().mo27137H("money_request", "money_request_receiver_push_click", "", (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
            Bundle bundle = new Bundle();
            bundle.putLong("PARAM_MONEY_REQUEST_ID", l.longValue());
            C41238w wVar = C41238w.f97225a;
            m72383x5("ACTION_OPEN_MONEY_REQUEST", bundle);
            finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F5 */
    public final void m72251F5() {
        C38281a.C38282a.m112545a(C38125h.m112236a(this), this, (String) null, 2, (Object) null);
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public static final void m72253G3(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: G4 */
    private final void m72254G4() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        BigDecimal bigDecimal;
        Long l;
        Long l2;
        Long l3;
        Integer num;
        Integer num2;
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        String D1 = mo55213D1("ccy", m72372t3());
        String D12 = mo55213D1("prodType", m72372t3());
        String D13 = mo55213D1("acctNo", m72372t3());
        String D14 = mo55213D1("reasoning", m72372t3());
        String D15 = mo55213D1("intWithPeriodType", m72372t3());
        BigDecimal bigDecimal5 = null;
        try {
            C41225n.C41226a aVar = C41225n.f97210d;
            String D16 = mo55213D1("stoAmount", m72372t3());
            if (D16 != null) {
                bigDecimal4 = new BigDecimal(D16);
            } else {
                bigDecimal4 = null;
            }
            obj = C41225n.m119478a(bigDecimal4);
        } catch (Throwable th) {
            C41225n.C41226a aVar2 = C41225n.f97210d;
            obj = C41225n.m119478a(C41228o.m119482a(th));
        }
        if (C41225n.m119480c(obj)) {
            obj = null;
        }
        BigDecimal bigDecimal6 = (BigDecimal) obj;
        try {
            String D17 = mo55213D1("amount", m72372t3());
            if (D17 != null) {
                bigDecimal3 = new BigDecimal(D17);
            } else {
                bigDecimal3 = null;
            }
            obj2 = C41225n.m119478a(bigDecimal3);
        } catch (Throwable th2) {
            C41225n.C41226a aVar3 = C41225n.f97210d;
            obj2 = C41225n.m119478a(C41228o.m119482a(th2));
        }
        if (C41225n.m119480c(obj2)) {
            obj2 = null;
        }
        BigDecimal bigDecimal7 = (BigDecimal) obj2;
        try {
            String D18 = mo55213D1("casAmount", m72372t3());
            if (D18 != null) {
                bigDecimal2 = new BigDecimal(D18);
            } else {
                bigDecimal2 = null;
            }
            obj3 = C41225n.m119478a(bigDecimal2);
        } catch (Throwable th3) {
            C41225n.C41226a aVar4 = C41225n.f97210d;
            obj3 = C41225n.m119478a(C41228o.m119482a(th3));
        }
        if (C41225n.m119480c(obj3)) {
            obj3 = null;
        }
        BigDecimal bigDecimal8 = (BigDecimal) obj3;
        try {
            String D19 = mo55213D1("term", m72372t3());
            if (D19 != null) {
                num2 = Integer.valueOf(Integer.parseInt(D19));
            } else {
                num2 = null;
            }
            obj4 = C41225n.m119478a(num2);
        } catch (Throwable th4) {
            C41225n.C41226a aVar5 = C41225n.f97210d;
            obj4 = C41225n.m119478a(C41228o.m119482a(th4));
        }
        if (C41225n.m119480c(obj4)) {
            obj4 = null;
        }
        Integer num3 = (Integer) obj4;
        try {
            String D110 = mo55213D1("stoTransferDay", m72372t3());
            if (D110 != null) {
                num = Integer.valueOf(Integer.parseInt(D110));
            } else {
                num = null;
            }
            obj5 = C41225n.m119478a(num);
        } catch (Throwable th5) {
            C41225n.C41226a aVar6 = C41225n.f97210d;
            obj5 = C41225n.m119478a(C41228o.m119482a(th5));
        }
        if (C41225n.m119480c(obj5)) {
            obj5 = null;
        }
        Integer num4 = (Integer) obj5;
        if (num4 != null) {
            i = num4.intValue();
        } else {
            i = 1;
        }
        int i2 = i;
        try {
            String D111 = mo55213D1("acctKeys", m72372t3());
            if (D111 != null) {
                l3 = Long.valueOf(Long.parseLong(D111));
            } else {
                l3 = null;
            }
            obj6 = C41225n.m119478a(l3);
        } catch (Throwable th6) {
            C41225n.C41226a aVar7 = C41225n.f97210d;
            obj6 = C41225n.m119478a(C41228o.m119482a(th6));
        }
        if (C41225n.m119480c(obj6)) {
            obj6 = null;
        }
        Long l4 = (Long) obj6;
        try {
            String D112 = mo55213D1("srcAcctKey", m72372t3());
            if (D112 != null) {
                l2 = Long.valueOf(Long.parseLong(D112));
            } else {
                l2 = null;
            }
            obj7 = C41225n.m119478a(l2);
        } catch (Throwable th7) {
            C41225n.C41226a aVar8 = C41225n.f97210d;
            obj7 = C41225n.m119478a(C41228o.m119482a(th7));
        }
        if (C41225n.m119480c(obj7)) {
            obj7 = null;
        }
        Long l5 = (Long) obj7;
        boolean d = C41536l.m120484d(mo55213D1("openCAS", m72372t3()), "Y");
        boolean d2 = C41536l.m120484d(mo55213D1("openSTO", m72372t3()), "Y");
        try {
            String D113 = mo55213D1("stoSrcAcctKey", m72372t3());
            if (D113 != null) {
                l = Long.valueOf(Long.parseLong(D113));
            } else {
                l = null;
            }
            obj8 = C41225n.m119478a(l);
        } catch (Throwable th8) {
            C41225n.C41226a aVar9 = C41225n.f97210d;
            obj8 = C41225n.m119478a(C41228o.m119482a(th8));
        }
        if (C41225n.m119480c(obj8)) {
            obj8 = null;
        }
        Long l6 = (Long) obj8;
        try {
            String D114 = mo55213D1("totalAmount", m72372t3());
            if (D114 != null) {
                bigDecimal = new BigDecimal(D114);
            } else {
                bigDecimal = null;
            }
            obj9 = C41225n.m119478a(bigDecimal);
        } catch (Throwable th9) {
            C41225n.C41226a aVar10 = C41225n.f97210d;
            obj9 = C41225n.m119478a(C41228o.m119482a(th9));
        }
        if (!C41225n.m119480c(obj9)) {
            bigDecimal5 = obj9;
        }
        C38125h.m112238c(this).mo91603f0(this, bigDecimal7, D1, D12, num3, l5, d, l4, bigDecimal8, d2, D13, l6, bigDecimal6, bigDecimal5, D14, D15, i2);
        finish();
    }

    /* renamed from: G5 */
    private final void m72255G5() {
        BannerParameterData bannerParameterData;
        String str;
        boolean z;
        T t;
        String str2;
        boolean z2;
        if (!m72372t3().isEmpty()) {
            ArrayList<KeyValue> t3 = m72372t3();
            ArrayList<String> arrayList = new ArrayList<>(C41343r.m119925u(t3, 10));
            for (KeyValue value : t3) {
                arrayList.add(value.getValue());
            }
            for (String l : arrayList) {
                BannerDeepLinkData bannerDeepLinkData = (BannerDeepLinkData) new Gson().mo18170l(l, BannerDeepLinkData.class);
                if (C41536l.m120484d(bannerDeepLinkData.getType(), "RECEIVE")) {
                    List<BannerParameterData> parameters = bannerDeepLinkData.getParameters();
                    T t2 = null;
                    if (parameters != null) {
                        Iterator<T> it = parameters.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it.next();
                            BannerParameterData bannerParameterData2 = (BannerParameterData) t;
                            if (bannerParameterData2 != null) {
                                str2 = bannerParameterData2.getKey();
                            } else {
                                str2 = null;
                            }
                            if (!C41536l.m120484d(str2, "CLICK_BANNER") || !C41536l.m120484d(bannerParameterData2.getValue(), "UMTS_RATES_ACTION_SHEET")) {
                                z2 = false;
                                continue;
                            } else {
                                z2 = true;
                                continue;
                            }
                            if (z2) {
                                break;
                            }
                        }
                        bannerParameterData = (BannerParameterData) t;
                    } else {
                        bannerParameterData = null;
                    }
                    if (bannerParameterData != null) {
                        Iterator<T> it2 = bannerDeepLinkData.getParameters().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            T next = it2.next();
                            BannerParameterData bannerParameterData3 = (BannerParameterData) next;
                            if (bannerParameterData3 != null) {
                                str = bannerParameterData3.getKey();
                            } else {
                                str = null;
                            }
                            if (!C41536l.m120484d(str, "CLICK_ACTION") || !C41536l.m120484d(bannerParameterData3.getValue(), "OPEN_ACTION_SHEET")) {
                                z = false;
                                continue;
                            } else {
                                z = true;
                                continue;
                            }
                            if (z) {
                                t2 = next;
                                break;
                            }
                        }
                        if (((BannerParameterData) t2) != null) {
                            C38122f.C38123a.m112202C(C38125h.m112238c(m72350j3()), m72350j3(), (String) null, true, 2, (Object) null);
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    /* renamed from: H3 */
    private final void m72257H3() {
        Long l;
        String D1 = mo55213D1("ACCT_KEY", m72372t3());
        if (D1 != null && (l = C40438v.m117100l(D1)) != null) {
            C38125h.m112238c(this).mo91593b(this, l.longValue());
        }
    }

    /* renamed from: H4 */
    private final void m72258H4(String str, ArrayList arrayList) {
        C41238w wVar = null;
        if (C41536l.m120484d(str, "PAY_PROVIDER")) {
            String D1 = mo55213D1("essServiceId", arrayList);
            if (D1 != null) {
                C38125h.m112238c(this).mo91578U(this, D1);
                wVar = C41238w.f97225a;
            }
            if (wVar == null) {
                m72262I4(this);
            }
        } else if (C41536l.m120484d(str, "PAY_PROVIDER_CATEGORY")) {
            String D12 = mo55213D1("categoryId", arrayList);
            if (D12 != null) {
                C38122f.C38123a.m112201B(C38125h.m112238c(this), this, "deep_link", D12, false, 8, (Object) null);
                wVar = C41238w.f97225a;
            }
            if (wVar == null) {
                m72262I4(this);
            }
        }
        finish();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* renamed from: H5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m72259H5(java.lang.String r3, java.util.List r4, java.util.ArrayList r5) {
        /*
            r2 = this;
            java.lang.String r0 = "OFFER_TYPE"
            java.lang.String r5 = r2.mo55213D1(r0, r5)
            if (r5 == 0) goto L_0x003d
            int r0 = r5.hashCode()
            r1 = 77
            if (r0 == r1) goto L_0x0031
            r1 = 80
            if (r0 == r1) goto L_0x0025
            r1 = 82
            if (r0 == r1) goto L_0x0019
            goto L_0x003d
        L_0x0019:
            java.lang.String r0 = "R"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0022
            goto L_0x003d
        L_0x0022:
            ov.c r0 = p852ov.C27088c.BOG_REFINANCING_LOAN
            goto L_0x003e
        L_0x0025:
            java.lang.String r0 = "P"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x002e
            goto L_0x003d
        L_0x002e:
            ov.c r0 = p852ov.C27088c.PARALLEL_LOAN
            goto L_0x003e
        L_0x0031:
            java.lang.String r0 = "M"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x003a
            goto L_0x003d
        L_0x003a:
            ov.c r0 = p852ov.C27088c.BOG_AND_OTHER_BANK_REFINANCING_LOAN
            goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            int r1 = r3.hashCode()
            switch(r1) {
                case -1287784866: goto L_0x00cf;
                case 1545721468: goto L_0x00ac;
                case 1696840214: goto L_0x0089;
                case 1957107676: goto L_0x0069;
                case 2126804124: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x00e5
        L_0x0047:
            java.lang.String r0 = "EXPRESS_CARD_OFFER"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0051
            goto L_0x00e5
        L_0x0051:
            ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$EC r3 = p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode.C21010EC.f56472f
            ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo r3 = r2.m72387z3(r3, r4)
            if (r3 == 0) goto L_0x00e5
            if (r5 != 0) goto L_0x0062
            ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity$a r4 = p341ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity.f58469H
            r4.mo54606a(r2, r3)
            goto L_0x00e5
        L_0x0062:
            ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity$a r4 = p341ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity.f58469H
            r4.mo54607b(r2, r3, r5)
            goto L_0x00e5
        L_0x0069:
            java.lang.String r0 = "AMEX_OFFER"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0073
            goto L_0x00e5
        L_0x0073:
            ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$AC r3 = p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode.C21000AC.f56467f
            ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo r3 = r2.m72387z3(r3, r4)
            if (r3 == 0) goto L_0x00e5
            if (r5 != 0) goto L_0x0083
            ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity$a r4 = p341ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity.f58469H
            r4.mo54606a(r2, r3)
            goto L_0x00e5
        L_0x0083:
            ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity$a r4 = p341ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity.f58469H
            r4.mo54607b(r2, r3, r5)
            goto L_0x00e5
        L_0x0089:
            java.lang.String r5 = "CONSUMER_LOAN_OFFER"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0092
            goto L_0x00e5
        L_0x0092:
            ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$CL r3 = p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode.C21008CL.f56471f
            ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo r3 = r2.m72387z3(r3, r4)
            if (r3 == 0) goto L_0x00e5
            if (r0 != 0) goto L_0x00a2
            ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity$a r4 = p341ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity.f58469H
            r4.mo54606a(r2, r3)
            goto L_0x00e5
        L_0x00a2:
            ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity$a r4 = p341ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity.f58469H
            java.lang.String r5 = r0.mo66359b()
            r4.mo54607b(r2, r3, r5)
            goto L_0x00e5
        L_0x00ac:
            java.lang.String r5 = "EXPRESS_LOAN_OFFER"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x00b5
            goto L_0x00e5
        L_0x00b5:
            ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$EL r3 = p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode.C21012EL.f56473f
            ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo r3 = r2.m72387z3(r3, r4)
            if (r3 == 0) goto L_0x00e5
            if (r0 != 0) goto L_0x00c5
            ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity$a r4 = p341ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity.f58469H
            r4.mo54606a(r2, r3)
            goto L_0x00e5
        L_0x00c5:
            ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity$a r4 = p341ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity.f58469H
            java.lang.String r5 = r0.mo66359b()
            r4.mo54607b(r2, r3, r5)
            goto L_0x00e5
        L_0x00cf:
            java.lang.String r5 = "RL_OFFER_ACTIVATION"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x00d8
            goto L_0x00e5
        L_0x00d8:
            ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$RL r3 = p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode.C21023RL.f56479f
            ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo r3 = r2.m72387z3(r3, r4)
            if (r3 == 0) goto L_0x00e5
            ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity$a r4 = p341ge.bog.mobilebank.cleanarch.presentation.offer.activity.OfferNavigatorActivity.f58469H
            r4.mo54606a(r2, r3)
        L_0x00e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity.m72259H5(java.lang.String, java.util.List, java.util.ArrayList):void");
    }

    /* renamed from: I3 */
    private final void m72261I3() {
        String D1 = mo55213D1("ACCT_KEY", m72372t3());
        if (D1 == null) {
            finish();
            return;
        }
        C38125h.m112238c(this).mo91555I0(this, Long.parseLong(D1), true);
        finish();
    }

    /* renamed from: I4 */
    private static final void m72262I4(PushNotificationHandlerActivity pushNotificationHandlerActivity) {
        C38122f.C38123a.m112201B(C38125h.m112238c(pushNotificationHandlerActivity), pushNotificationHandlerActivity, "deep_link", (String) null, false, 12, (Object) null);
    }

    /* renamed from: I5 */
    private final void m72263I5() {
        boolean z;
        String D1 = mo55213D1("tickerCode", m72372t3());
        if (mo55217l3().hasProduct("G&T")) {
            if (D1 == null || C40439w.m117118v(D1)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                m72291P5("GT_STOCK_PAGE", D1);
            }
        }
        finish();
    }

    /* renamed from: J3 */
    private final void m72265J3(String str) {
        if (mo55217l3().getUserRestrictions().contains(UserRestrictions.MORE_OFFERS_AND_APPLICATIONS)) {
            finish();
            return;
        }
        if (C41536l.m120484d(str, "CHECK_MY_LIMIT_RESUME_BANNER")) {
            C32343x.m95381B0(this, "check_my_limit", (String) null, "click_check_my_limit_banner_applications", 2, (Object) null);
        }
        OffersAndApplicationsActivity.C21371b.m69137b(OffersAndApplicationsActivity.f57206M, m72350j3(), false, 2, (Object) null);
        finish();
    }

    /* renamed from: J4 */
    private final void m72266J4() {
        C38125h.m112238c(this).mo91579U0(this);
        finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x021c, code lost:
        if (r0.equals("CDS_AGREE") == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0253, code lost:
        if (r0.equals("CHECK_MY_LIMIT") == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0257, code lost:
        r0 = m72381x3();
        kotlin.jvm.internal.C41536l.m120486f(r0);
        m72319Y3(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0269, code lost:
        if (r0.equals("PAY_PROVIDER") == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02af, code lost:
        if (r0.equals("SWIFT") == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02e6, code lost:
        if (r0.equals("PFM") == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02ea, code lost:
        m72317X4();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x034f, code lost:
        if (r0.equals("CHECK_MY_LIMIT_RESUME_BANNER") == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x037b, code lost:
        if (r0.equals("RBS_APPLICATIONS") == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        if (r0.equals("EXPRESS_CARD_OFFER") == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0385, code lost:
        if (r0.equals("GT_WACHLISTS_TAB") == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x038f, code lost:
        if (r0.equals("PAY_PROVIDER_CATEGORY") == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0393, code lost:
        m72258H4(r0, m72372t3());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03b1, code lost:
        if (r0.equals("PRODUCTS_DEPOSITS") == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03b5, code lost:
        m72313W3();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x03ed, code lost:
        if (r0.equals("CL-APPL-APPROVED-OFFER") == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0415, code lost:
        if (r0.equals("GT_HOME_PAGE") == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0488, code lost:
        if (r0.equals("QR_INSTALLMENT") == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x048c, code lost:
        r0 = m72381x3();
        kotlin.jvm.internal.C41536l.m120486f(r0);
        m72366q4(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x049e, code lost:
        if (r0.equals("GT_ACCOUNT_OPENED_SUCCESSFULLY") == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x04a8, code lost:
        if (r0.equals("RL_OFFER_ACTIVATION") == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x04ac, code lost:
        m72274L4();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x04d5, code lost:
        if (r0.equals("CREDIT_APPLICATION_CNS_STF_APPROVED") == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x04ee, code lost:
        if (r0.equals("GT_ACCOUNT_OPENING_REJECTED") == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x04f2, code lost:
        m72353k4(m72381x3());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x055b, code lost:
        if (r0.equals("SADEBETO") == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0565, code lost:
        if (r0.equals("CREDIT_APPLICATION_CNS_STF_WAITING") == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0569, code lost:
        r0 = m72381x3();
        kotlin.jvm.internal.C41536l.m120486f(r0);
        m72265J3(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x058a, code lost:
        if (r0.equals("CARD_NOTIF") == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x058e, code lost:
        m72298R4();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0599, code lost:
        if (r0.equals("REJECT_REQUEST") == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x059c, code lost:
        m72250F4();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007d, code lost:
        if (r0.equals("CREATE_REQUEST") == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x05c0, code lost:
        if (r0.equals("PROMO_CODE_ENTER") == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x05c3, code lost:
        m72338e5(m72381x3());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a5, code lost:
        if (r0.equals("AMEX_OFFER") == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00be, code lost:
        if (r0.equals("REFERRALS") == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e6, code lost:
        if (r0.equals("CONSUMER_LOAN_OFFER") == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f0, code lost:
        if (r0.equals("CHECK_MY_LIMIT_BANNER") == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0109, code lost:
        if (r0.equals("EXPRESS_LOAN_OFFER") == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0122, code lost:
        if (r0.equals("PROMO_CODE") == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x014a, code lost:
        if (r0.equals("GT_MARKET_ORDER_COMPLETED") == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0154, code lost:
        if (r0.equals("CDS_OVD") == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x015e, code lost:
        if (r0.equals("CDS_CAP") == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0168, code lost:
        if (r0.equals("CDS_ADD") == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0190, code lost:
        if (r0.equals("QR_AUTH") == false) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01c7, code lost:
        if (r0.equals("PFM_STATS_TAB") == false) goto L_0x05f2;
     */
    /* renamed from: J5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m72267J5() {
        /*
            r2 = this;
            android.os.Bundle r0 = r2.m72384y3()
            if (r0 == 0) goto L_0x05f6
            android.os.Bundle r0 = r2.m72384y3()
            kotlin.jvm.internal.C41536l.m120486f(r0)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0015
            goto L_0x05f6
        L_0x0015:
            java.lang.String r0 = r2.m72378w3()
            if (r0 == 0) goto L_0x0024
            boolean r0 = cf1.C40439w.m117118v(r0)
            if (r0 == 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r0 = 0
            goto L_0x0025
        L_0x0024:
            r0 = 1
        L_0x0025:
            if (r0 != 0) goto L_0x0031
            java.lang.String r0 = r2.m72378w3()
            kotlin.jvm.internal.C41536l.m120486f(r0)
            r2.m72389z5(r0)
        L_0x0031:
            java.lang.String r0 = r2.m72381x3()
            if (r0 == 0) goto L_0x05f2
            int r1 = r0.hashCode()
            switch(r1) {
                case -2145413063: goto L_0x05e5;
                case -2129658067: goto L_0x05d8;
                case -2127501824: goto L_0x05cb;
                case -2018895050: goto L_0x05ba;
                case -1956542602: goto L_0x05ad;
                case -1955735456: goto L_0x05a0;
                case -1951367729: goto L_0x0593;
                case -1905417951: goto L_0x0584;
                case -1897368214: goto L_0x0575;
                case -1876355033: goto L_0x055f;
                case -1804892723: goto L_0x0555;
                case -1766501697: goto L_0x0546;
                case -1544323722: goto L_0x0537;
                case -1534166343: goto L_0x0528;
                case -1514519657: goto L_0x0519;
                case -1445721208: goto L_0x050a;
                case -1435322694: goto L_0x04fb;
                case -1399047511: goto L_0x04e8;
                case -1398051596: goto L_0x04d9;
                case -1393156099: goto L_0x04cf;
                case -1341532434: goto L_0x04c0;
                case -1311521688: goto L_0x04b1;
                case -1287784866: goto L_0x04a2;
                case -1284658119: goto L_0x0498;
                case -1204565957: goto L_0x0482;
                case -1195907073: goto L_0x0473;
                case -1173843262: goto L_0x0464;
                case -1058131611: goto L_0x0455;
                case -1048776318: goto L_0x0446;
                case -1023923754: goto L_0x0437;
                case -962772664: goto L_0x0428;
                case -908719937: goto L_0x0419;
                case -894772963: goto L_0x040f;
                case -825077709: goto L_0x0400;
                case -799064437: goto L_0x03f1;
                case -764069916: goto L_0x03e7;
                case -732095979: goto L_0x03d8;
                case -685134384: goto L_0x03c9;
                case -670723017: goto L_0x03ba;
                case -544313840: goto L_0x03ab;
                case -455715384: goto L_0x039c;
                case -368176235: goto L_0x0389;
                case -366534646: goto L_0x037f;
                case -355611713: goto L_0x0375;
                case -352139885: goto L_0x0362;
                case -280809178: goto L_0x0353;
                case -274249730: goto L_0x0349;
                case -223540345: goto L_0x033a;
                case -219099921: goto L_0x032b;
                case -105954994: goto L_0x031c;
                case 66553: goto L_0x030d;
                case 67539: goto L_0x02fe;
                case 78510: goto L_0x02ef;
                case 79127: goto L_0x02e0;
                case 84303: goto L_0x02d1;
                case 2555909: goto L_0x02c2;
                case 27955275: goto L_0x02b3;
                case 79316467: goto L_0x02a9;
                case 229276956: goto L_0x029a;
                case 298259562: goto L_0x028b;
                case 316337768: goto L_0x027c;
                case 320532812: goto L_0x026d;
                case 474778568: goto L_0x0263;
                case 482220223: goto L_0x024d;
                case 510594974: goto L_0x023e;
                case 518986922: goto L_0x022f;
                case 602016673: goto L_0x0220;
                case 842009631: goto L_0x0216;
                case 848677268: goto L_0x0207;
                case 870147274: goto L_0x01f8;
                case 963853516: goto L_0x01e9;
                case 1029571307: goto L_0x01da;
                case 1036400569: goto L_0x01cb;
                case 1043129997: goto L_0x01c1;
                case 1070616973: goto L_0x01b2;
                case 1234728083: goto L_0x01a3;
                case 1280121839: goto L_0x0194;
                case 1310699782: goto L_0x018a;
                case 1347410593: goto L_0x017b;
                case 1355920964: goto L_0x016c;
                case 1359533780: goto L_0x0162;
                case 1359535621: goto L_0x0158;
                case 1359547792: goto L_0x014e;
                case 1388048361: goto L_0x0144;
                case 1389813232: goto L_0x0135;
                case 1429300933: goto L_0x0126;
                case 1489292093: goto L_0x011c;
                case 1527549685: goto L_0x010d;
                case 1545721468: goto L_0x0103;
                case 1667285971: goto L_0x00f4;
                case 1686098604: goto L_0x00ea;
                case 1696840214: goto L_0x00e0;
                case 1782942220: goto L_0x00d1;
                case 1808729774: goto L_0x00c2;
                case 1861814358: goto L_0x00b8;
                case 1909428946: goto L_0x00a9;
                case 1957107676: goto L_0x009f;
                case 1973697261: goto L_0x0090;
                case 2029864183: goto L_0x0081;
                case 2066480684: goto L_0x0077;
                case 2067206586: goto L_0x0068;
                case 2102661261: goto L_0x0059;
                case 2115494078: goto L_0x004a;
                case 2126804124: goto L_0x0040;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x05f2
        L_0x0040:
            java.lang.String r1 = "EXPRESS_CARD_OFFER"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04ac
            goto L_0x05f2
        L_0x004a:
            java.lang.String r1 = "LIFE_STYLE_PROGRESS"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0054
            goto L_0x05f2
        L_0x0054:
            r2.m72230A4()
            goto L_0x05f5
        L_0x0059:
            java.lang.String r1 = "KYC_SETTINGS"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0063
            goto L_0x05f2
        L_0x0063:
            r2.m72379w4()
            goto L_0x05f5
        L_0x0068:
            java.lang.String r1 = "ACTIVATE_CHILD_MBANK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0072
            goto L_0x05f2
        L_0x0072:
            r2.m72261I3()
            goto L_0x05f5
        L_0x0077:
            java.lang.String r1 = "CREATE_REQUEST"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x059c
            goto L_0x05f2
        L_0x0081:
            java.lang.String r1 = "NOTIFICATION_SETTINGS"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x008b
            goto L_0x05f2
        L_0x008b:
            r2.m72266J4()
            goto L_0x05f5
        L_0x0090:
            java.lang.String r1 = "CREDIT_CARD_PRODUCTS"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x009a
            goto L_0x05f2
        L_0x009a:
            r2.m72334d4()
            goto L_0x05f5
        L_0x009f:
            java.lang.String r1 = "AMEX_OFFER"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04ac
            goto L_0x05f2
        L_0x00a9:
            java.lang.String r1 = "INTERSTITIAL_PROMO_PAGE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00b3
            goto L_0x05f2
        L_0x00b3:
            r2.m72269K3()
            goto L_0x05f5
        L_0x00b8:
            java.lang.String r1 = "REFERRALS"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05c3
            goto L_0x05f2
        L_0x00c2:
            java.lang.String r1 = "MERCHANT_GIFT_CARD_OFFERS"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00cc
            goto L_0x05f2
        L_0x00cc:
            r2.m72360n4()
            goto L_0x05f5
        L_0x00d1:
            java.lang.String r1 = "PRODUCTS_OPEN_BANKING"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00db
            goto L_0x05f2
        L_0x00db:
            r2.m72294Q4()
            goto L_0x05f5
        L_0x00e0:
            java.lang.String r1 = "CONSUMER_LOAN_OFFER"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04ac
            goto L_0x05f2
        L_0x00ea:
            java.lang.String r1 = "CHECK_MY_LIMIT_BANNER"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0257
            goto L_0x05f2
        L_0x00f4:
            java.lang.String r1 = "LOAN_PRODUCTS"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00fe
            goto L_0x05f2
        L_0x00fe:
            r2.m72237C3()
            goto L_0x05f5
        L_0x0103:
            java.lang.String r1 = "EXPRESS_LOAN_OFFER"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04ac
            goto L_0x05f2
        L_0x010d:
            java.lang.String r1 = "LIFE_STYLE_OFFERS_CATEGORY"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0117
            goto L_0x05f2
        L_0x0117:
            r2.m72385y4()
            goto L_0x05f5
        L_0x011c:
            java.lang.String r1 = "PROMO_CODE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05c3
            goto L_0x05f2
        L_0x0126:
            java.lang.String r1 = "TCC_NOTIF"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0130
            goto L_0x05f2
        L_0x0130:
            r2.m72354k5()
            goto L_0x05f5
        L_0x0135:
            java.lang.String r1 = "ACCOUNT_DETAILS"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x013f
            goto L_0x05f2
        L_0x013f:
            r2.m72257H3()
            goto L_0x05f5
        L_0x0144:
            java.lang.String r1 = "GT_MARKET_ORDER_COMPLETED"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04f2
            goto L_0x05f2
        L_0x014e:
            java.lang.String r1 = "CDS_OVD"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x058e
            goto L_0x05f2
        L_0x0158:
            java.lang.String r1 = "CDS_CAP"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x058e
            goto L_0x05f2
        L_0x0162:
            java.lang.String r1 = "CDS_ADD"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x058e
            goto L_0x05f2
        L_0x016c:
            java.lang.String r1 = "INSURANCE_MBANK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0176
            goto L_0x05f2
        L_0x0176:
            r2.m72369r5()
            goto L_0x05f5
        L_0x017b:
            java.lang.String r1 = "PACKAGES_PAGE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0185
            goto L_0x05f2
        L_0x0185:
            r2.m72311V4()
            goto L_0x05f5
        L_0x018a:
            java.lang.String r1 = "QR_AUTH"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x048c
            goto L_0x05f2
        L_0x0194:
            java.lang.String r1 = "CAR_TEMPLATE_PROFILE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x019e
            goto L_0x05f2
        L_0x019e:
            r2.m72301S3()
            goto L_0x05f5
        L_0x01a3:
            java.lang.String r1 = "MY_SPACE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01ad
            goto L_0x05f2
        L_0x01ad:
            r2.m72326a5()
            goto L_0x05f5
        L_0x01b2:
            java.lang.String r1 = "NEW_MONEY_BOX"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01bc
            goto L_0x05f2
        L_0x01bc:
            r2.m72246E4()
            goto L_0x05f5
        L_0x01c1:
            java.lang.String r1 = "PFM_STATS_TAB"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02ea
            goto L_0x05f2
        L_0x01cb:
            java.lang.String r1 = "HUB_PAGE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01d5
            goto L_0x05f2
        L_0x01d5:
            r2.m72364p4()
            goto L_0x05f5
        L_0x01da:
            java.lang.String r1 = "LND_AMT"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01e4
            goto L_0x05f2
        L_0x01e4:
            r2.m72238C4()
            goto L_0x05f5
        L_0x01e9:
            java.lang.String r1 = "DARK_MODE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01f3
            goto L_0x05f2
        L_0x01f3:
            r2.m72340f4()
            goto L_0x05f5
        L_0x01f8:
            java.lang.String r1 = "GT_STOCK_PAGE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0202
            goto L_0x05f2
        L_0x0202:
            r2.m72349i5()
            goto L_0x05f5
        L_0x0207:
            java.lang.String r1 = "DEBIT_CARD_APPLICATION"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0211
            goto L_0x05f2
        L_0x0211:
            r2.m72346h4()
            goto L_0x05f5
        L_0x0216:
            java.lang.String r1 = "CDS_AGREE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03b5
            goto L_0x05f2
        L_0x0220:
            java.lang.String r1 = "ACTIVE_PACKAGE_PAGE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x022a
            goto L_0x05f2
        L_0x022a:
            r2.m72308U4()
            goto L_0x05f5
        L_0x022f:
            java.lang.String r1 = "INSTALLMENT_NOTIF"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0239
            goto L_0x05f2
        L_0x0239:
            r2.m72368r4()
            goto L_0x05f5
        L_0x023e:
            java.lang.String r1 = "REMITTANCE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0248
            goto L_0x05f2
        L_0x0248:
            r2.m72344g5()
            goto L_0x05f5
        L_0x024d:
            java.lang.String r1 = "CHECK_MY_LIMIT"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0257
            goto L_0x05f2
        L_0x0257:
            java.lang.String r0 = r2.m72381x3()
            kotlin.jvm.internal.C41536l.m120486f(r0)
            r2.m72319Y3(r0)
            goto L_0x05f5
        L_0x0263:
            java.lang.String r1 = "PAY_PROVIDER"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0393
            goto L_0x05f2
        L_0x026d:
            java.lang.String r1 = "MESSAGES"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0277
            goto L_0x05f2
        L_0x0277:
            r2.m72242D4()
            goto L_0x05f5
        L_0x027c:
            java.lang.String r1 = "BNPL_OFFER_DETAILS"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0286
            goto L_0x05f2
        L_0x0286:
            r2.m72285O3()
            goto L_0x05f5
        L_0x028b:
            java.lang.String r1 = "LIFE_STYLE_CHOOSER"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0295
            goto L_0x05f2
        L_0x0295:
            r2.m72382x4()
            goto L_0x05f5
        L_0x029a:
            java.lang.String r1 = "CCY_CONVERSION"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02a4
            goto L_0x05f2
        L_0x02a4:
            r2.m72310V3()
            goto L_0x05f5
        L_0x02a9:
            java.lang.String r1 = "SWIFT"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x058e
            goto L_0x05f2
        L_0x02b3:
            java.lang.String r1 = "CARD_INSURANCE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02bd
            goto L_0x05f2
        L_0x02bd:
            r2.m72307U3()
            goto L_0x05f5
        L_0x02c2:
            java.lang.String r1 = "STOS"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02cc
            goto L_0x05f2
        L_0x02cc:
            r2.m72347h5()
            goto L_0x05f5
        L_0x02d1:
            java.lang.String r1 = "URL"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02db
            goto L_0x05f2
        L_0x02db:
            r2.m72374t5()
            goto L_0x05f5
        L_0x02e0:
            java.lang.String r1 = "PFM"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02ea
            goto L_0x05f2
        L_0x02ea:
            r2.m72317X4()
            goto L_0x05f5
        L_0x02ef:
            java.lang.String r1 = "P2P"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02f9
            goto L_0x05f2
        L_0x02f9:
            r2.m72305T4()
            goto L_0x05f5
        L_0x02fe:
            java.lang.String r1 = "DDS"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0308
            goto L_0x05f2
        L_0x0308:
            r2.m72343g4()
            goto L_0x05f5
        L_0x030d:
            java.lang.String r1 = "CCY"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0317
            goto L_0x05f2
        L_0x0317:
            r2.m72337e4()
            goto L_0x05f5
        L_0x031c:
            java.lang.String r1 = "3D_SECURITY"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0326
            goto L_0x05f2
        L_0x0326:
            r2.m72241D3()
            goto L_0x05f5
        L_0x032b:
            java.lang.String r1 = "DEPOSIT_APPLICATION"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0335
            goto L_0x05f2
        L_0x0335:
            r2.m72351j4()
            goto L_0x05f5
        L_0x033a:
            java.lang.String r1 = "TRANSPORT_PASS"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0344
            goto L_0x05f2
        L_0x0344:
            r2.m72367q5()
            goto L_0x05f5
        L_0x0349:
            java.lang.String r1 = "CHECK_MY_LIMIT_RESUME_BANNER"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0569
            goto L_0x05f2
        L_0x0353:
            java.lang.String r1 = "BNPL_PAGE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x035d
            goto L_0x05f2
        L_0x035d:
            r2.m72289P3()
            goto L_0x05f5
        L_0x0362:
            java.lang.String r1 = "QR_WITHDRAWAL"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x036c
            goto L_0x05f2
        L_0x036c:
            java.util.ArrayList r0 = r2.m72372t3()
            r2.m72332c5(r0)
            goto L_0x05f5
        L_0x0375:
            java.lang.String r1 = "RBS_APPLICATIONS"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0569
            goto L_0x05f2
        L_0x037f:
            java.lang.String r1 = "GT_WACHLISTS_TAB"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04f2
            goto L_0x05f2
        L_0x0389:
            java.lang.String r1 = "PAY_PROVIDER_CATEGORY"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0393
            goto L_0x05f2
        L_0x0393:
            java.util.ArrayList r1 = r2.m72372t3()
            r2.m72258H4(r0, r1)
            goto L_0x05f5
        L_0x039c:
            java.lang.String r1 = "TRANSFERS"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03a6
            goto L_0x05f2
        L_0x03a6:
            r2.m72365p5()
            goto L_0x05f5
        L_0x03ab:
            java.lang.String r1 = "PRODUCTS_DEPOSITS"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03b5
            goto L_0x05f2
        L_0x03b5:
            r2.m72313W3()
            goto L_0x05f5
        L_0x03ba:
            java.lang.String r1 = "CONTACT_CHAT"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03c4
            goto L_0x05f2
        L_0x03c4:
            r2.m72331c4()
            goto L_0x05f5
        L_0x03c9:
            java.lang.String r1 = "MONEY_REQUEST"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03d3
            goto L_0x05f2
        L_0x03d3:
            r2.m72277M3()
            goto L_0x05f5
        L_0x03d8:
            java.lang.String r1 = "UNKNOWN_DEVICE_LOGIN"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03e2
            goto L_0x05f2
        L_0x03e2:
            r2.m72376u5()
            goto L_0x05f5
        L_0x03e7:
            java.lang.String r1 = "CL-APPL-APPROVED-OFFER"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0569
            goto L_0x05f2
        L_0x03f1:
            java.lang.String r1 = "RESTORE_CREDENTIALS"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03fb
            goto L_0x05f2
        L_0x03fb:
            r2.m72335d5()
            goto L_0x05f5
        L_0x0400:
            java.lang.String r1 = "TAMASHI"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x040a
            goto L_0x05f2
        L_0x040a:
            r2.m72356l4()
            goto L_0x05f5
        L_0x040f:
            java.lang.String r1 = "GT_HOME_PAGE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04f2
            goto L_0x05f2
        L_0x0419:
            java.lang.String r1 = "GIFT_CARD"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0423
            goto L_0x05f2
        L_0x0423:
            r2.m72358m4()
            goto L_0x05f5
        L_0x0428:
            java.lang.String r1 = "Become_solo_application"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0432
            goto L_0x05f2
        L_0x0432:
            r2.m72273L3()
            goto L_0x05f5
        L_0x0437:
            java.lang.String r1 = "CAR_TEMPLATE_CREATE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0441
            goto L_0x05f2
        L_0x0441:
            r2.m72293Q3()
            goto L_0x05f5
        L_0x0446:
            java.lang.String r1 = "GOOGLE_PAY"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0450
            goto L_0x05f2
        L_0x0450:
            r2.m72362o4()
            goto L_0x05f5
        L_0x0455:
            java.lang.String r1 = "PUSH_NOTIF_TYPE_OPEN_BANKING_AUTH"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x045f
            goto L_0x05f2
        L_0x045f:
            r2.m72270K4()
            goto L_0x05f5
        L_0x0464:
            java.lang.String r1 = "DIGITAL_ONBOARDING"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x046e
            goto L_0x05f2
        L_0x046e:
            r2.m72290P4()
            goto L_0x05f5
        L_0x0473:
            java.lang.String r1 = "P2P_Public_Link"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x047d
            goto L_0x05f2
        L_0x047d:
            r2.m72302S4()
            goto L_0x05f5
        L_0x0482:
            java.lang.String r1 = "QR_INSTALLMENT"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x048c
            goto L_0x05f2
        L_0x048c:
            java.lang.String r0 = r2.m72381x3()
            kotlin.jvm.internal.C41536l.m120486f(r0)
            r2.m72366q4(r0)
            goto L_0x05f5
        L_0x0498:
            java.lang.String r1 = "GT_ACCOUNT_OPENED_SUCCESSFULLY"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04f2
            goto L_0x05f2
        L_0x04a2:
            java.lang.String r1 = "RL_OFFER_ACTIVATION"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04ac
            goto L_0x05f2
        L_0x04ac:
            r2.m72274L4()
            goto L_0x05f5
        L_0x04b1:
            java.lang.String r1 = "LIFE_STYLE_OFFERS"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04bb
            goto L_0x05f2
        L_0x04bb:
            r2.m72234B4()
            goto L_0x05f5
        L_0x04c0:
            java.lang.String r1 = "BOG_JUNIOR"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04ca
            goto L_0x05f2
        L_0x04ca:
            r2.m72377v4()
            goto L_0x05f5
        L_0x04cf:
            java.lang.String r1 = "CREDIT_APPLICATION_CNS_STF_APPROVED"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0569
            goto L_0x05f2
        L_0x04d9:
            java.lang.String r1 = "REGISTRATION_FLOW"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04e3
            goto L_0x05f2
        L_0x04e3:
            r2.m72341f5()
            goto L_0x05f5
        L_0x04e8:
            java.lang.String r1 = "GT_ACCOUNT_OPENING_REJECTED"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04f2
            goto L_0x05f2
        L_0x04f2:
            java.lang.String r0 = r2.m72381x3()
            r2.m72353k4(r0)
            goto L_0x05f5
        L_0x04fb:
            java.lang.String r1 = "INSURANCE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0505
            goto L_0x05f2
        L_0x0505:
            r2.m72375u4()
            goto L_0x05f5
        L_0x050a:
            java.lang.String r1 = "LIFE_STYLE_OFFERS_OFFER_DETAILS"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0514
            goto L_0x05f2
        L_0x0514:
            r2.m72388z4()
            goto L_0x05f5
        L_0x0519:
            java.lang.String r1 = "PLUS_STATUS_PAGE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0523
            goto L_0x05f2
        L_0x0523:
            r2.m72323Z4()
            goto L_0x05f5
        L_0x0528:
            java.lang.String r1 = "BNPL_APPLICATION"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0532
            goto L_0x05f2
        L_0x0532:
            r2.m72281N3()
            goto L_0x05f5
        L_0x0537:
            java.lang.String r1 = "DEPOSIT_APPLICATION_NBO_BUNDLE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0541
            goto L_0x05f2
        L_0x0541:
            r2.m72254G4()
            goto L_0x05f5
        L_0x0546:
            java.lang.String r1 = "DEBITCARD_DETAILS"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0550
            goto L_0x05f2
        L_0x0550:
            r2.m72348i4()
            goto L_0x05f5
        L_0x0555:
            java.lang.String r1 = "SADEBETO"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x058e
            goto L_0x05f2
        L_0x055f:
            java.lang.String r1 = "CREDIT_APPLICATION_CNS_STF_WAITING"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0569
            goto L_0x05f2
        L_0x0569:
            java.lang.String r0 = r2.m72381x3()
            kotlin.jvm.internal.C41536l.m120486f(r0)
            r2.m72265J3(r0)
            goto L_0x05f5
        L_0x0575:
            java.lang.String r1 = "QR_PAY"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x057f
            goto L_0x05f2
        L_0x057f:
            r2.m72329b5()
            goto L_0x05f5
        L_0x0584:
            java.lang.String r1 = "CARD_NOTIF"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x058e
            goto L_0x05f2
        L_0x058e:
            r2.m72298R4()
            goto L_0x05f5
        L_0x0593:
            java.lang.String r1 = "REJECT_REQUEST"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x059c
            goto L_0x05f2
        L_0x059c:
            r2.m72250F4()
            goto L_0x05f5
        L_0x05a0:
            java.lang.String r1 = "ACCT_MONEY_BOX"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05a9
            goto L_0x05f2
        L_0x05a9:
            r2.m72320Y4()
            goto L_0x05f5
        L_0x05ad:
            java.lang.String r1 = "TRANSFER_TO_SOMEONE_ELSE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05b6
            goto L_0x05f2
        L_0x05b6:
            r2.m72363o5()
            goto L_0x05f5
        L_0x05ba:
            java.lang.String r1 = "PROMO_CODE_ENTER"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05c3
            goto L_0x05f2
        L_0x05c3:
            java.lang.String r0 = r2.m72381x3()
            r2.m72338e5(r0)
            goto L_0x05f5
        L_0x05cb:
            java.lang.String r1 = "CHAT_MESSAGE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05d4
            goto L_0x05f2
        L_0x05d4:
            r2.m72316X3()
            goto L_0x05f5
        L_0x05d8:
            java.lang.String r1 = "PAYMENTS"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05e1
            goto L_0x05f2
        L_0x05e1:
            r2.m72314W4()
            goto L_0x05f5
        L_0x05e5:
            java.lang.String r1 = "CREDIT_APPLICATION_CNS_STF"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05ee
            goto L_0x05f2
        L_0x05ee:
            r2.m72322Z3()
            goto L_0x05f5
        L_0x05f2:
            r2.m72371s5()
        L_0x05f5:
            return
        L_0x05f6:
            r2.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity.m72267J5():void");
    }

    /* renamed from: K3 */
    private final void m72269K3() {
        String D1 = mo55213D1("BANNER_NAME", m72372t3());
        if (D1 != null) {
            BannerDetailsActivity.f56071H.mo49481a(m72350j3(), D1);
            finish();
        }
    }

    /* renamed from: K4 */
    private final void m72270K4() {
        String D1 = mo55213D1("PARAM_OPEN_BANKING_URI", m72372t3());
        OpenBankingAuthActivity.C21422a aVar = OpenBankingAuthActivity.f57284K;
        C41536l.m120486f(D1);
        aVar.mo53479a(this, D1);
        finish();
    }

    /* renamed from: K5 */
    private final void m72271K5() {
        getSupportFragmentManager().mo4367F1("WebViewActionSheet.REQUEST_KEY", this, new C26726c(this));
    }

    /* renamed from: L3 */
    private final void m72273L3() {
        BecomeSoloDescriptionActivity.f56100I.mo49590a(this, BecomeSoloDescriptionActivity.C20837a.PUSH);
        finish();
    }

    /* renamed from: L4 */
    private final void m72274L4() {
        String string;
        Bundle y3 = m72384y3();
        if (y3 == null || (string = y3.getString("type")) == null) {
            finish();
            return;
        }
        C41205b G0 = C26615g.m83078c(mo55225s3(), true, false, 2, (Object) null).mo95027o0(C40992a.m118827a()).mo94980F(new C26735d(new C22321p(this))).mo94983G0(new C26737e(new C22323q(this, string)), new C26739f(new C22325r(this)));
        C41536l.m120488h(G0, "private fun handleOfferP…mpositeDisposable()\n    }");
        m72345h3(G0);
    }

    /* access modifiers changed from: private */
    /* renamed from: L5 */
    public static final void m72275L5(PushNotificationHandlerActivity pushNotificationHandlerActivity, String str, Bundle bundle) {
        C41536l.m120489i(pushNotificationHandlerActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "data");
        if (bundle.getBoolean("WebViewActionSheet.REQUEST_KEY")) {
            pushNotificationHandlerActivity.finish();
            pushNotificationHandlerActivity.overridePendingTransition(0, 0);
        }
    }

    /* renamed from: M3 */
    private final void m72277M3() {
        String D1 = mo55213D1("REQUEST_TYPE", m72372t3());
        if (C41536l.m120484d(D1, "SPLIT")) {
            C26360b.f66777a.mo65554f(m72350j3());
        } else if (C41536l.m120484d(D1, "SPECIFIED")) {
            C26360b.f66777a.mo65556h(m72350j3());
        } else {
            startActivity(new Intent(m72350j3(), SelectBillSplitMoneyRequestActivity.class));
        }
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: M4 */
    public static final void m72278M4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: M5 */
    public final void m72279M5() {
        m72386y5(this, "ACTION_OPEN_DARK_MODE_ACTION_SHEET", (Bundle) null, 2, (Object) null);
    }

    /* renamed from: N3 */
    private final void m72281N3() {
        C38125h.m112238c(this).mo91637w0(C24849e.BNPL_LIMIT, this);
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: N4 */
    public static final void m72282N4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: N5 */
    public final void m72283N5() {
        C27399q1 q1Var = this.f59155U;
        if (q1Var == null) {
            C41536l.m120506z("binding");
            q1Var = null;
        }
        q1Var.f69585e.setVisibility(0);
    }

    /* renamed from: O3 */
    private final void m72285O3() {
        Long l;
        String D1 = mo55213D1("merchantClientId", m72372t3());
        if (D1 != null && (l = C40438v.m117100l(D1)) != null) {
            long longValue = l.longValue();
            String D12 = mo55213D1("brandName", m72372t3());
            if (D12 != null) {
                C38125h.m112238c(this).mo91561L0(longValue, D12, this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O4 */
    public static final void m72286O4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: O5 */
    public static final void m72287O5(Activity activity, Intent intent) {
        f59140a0.mo55229a(activity, intent);
    }

    /* renamed from: P3 */
    private final void m72289P3() {
        C38125h.m112238c(this).mo91558K(this);
        finish();
    }

    /* renamed from: P4 */
    private final void m72290P4() {
        if (!mo55217l3().isAuthorized() && m72380w5()) {
            startActivity(OnBoardingActivity.f87024y.mo88591a(this, false));
        }
        finish();
    }

    /* renamed from: P5 */
    private final void m72291P5(String str, String str2) {
        C38122f.C38123a.m112226v(C38125h.m112238c(this), this, str, str2, false, 8, (Object) null);
    }

    /* renamed from: Q3 */
    private final void m72293Q3() {
        Intent intent = new Intent(m72350j3(), CarTemplateGroupActivity.class);
        String D1 = mo55213D1("GROUP_ID", m72372t3());
        String D12 = mo55213D1("CAR_NO", m72372t3());
        String D13 = mo55213D1("PIN", m72372t3());
        intent.putExtra("CAR_NO", D12);
        intent.putExtra("PIN", D13);
        if (D1 != null) {
            intent.putExtra("TEMPLATE_GROUP_ITEM_ID", Long.parseLong(D1));
            new Handler().postDelayed(new C26749p(this, intent), 400);
            return;
        }
        startActivity(intent);
        finish();
    }

    /* renamed from: Q4 */
    private final void m72294Q4() {
        m72386y5(this, "ACTION_OPEN_OPEN_BANKING", (Bundle) null, 2, (Object) null);
        finish();
    }

    /* renamed from: Q5 */
    static /* synthetic */ void m72295Q5(PushNotificationHandlerActivity pushNotificationHandlerActivity, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        pushNotificationHandlerActivity.m72291P5(str, str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: R3 */
    public static final void m72297R3(PushNotificationHandlerActivity pushNotificationHandlerActivity, Intent intent) {
        C41536l.m120489i(pushNotificationHandlerActivity, "this$0");
        C41536l.m120489i(intent, "$intent");
        if (!pushNotificationHandlerActivity.isFinishing() && !pushNotificationHandlerActivity.isDestroyed()) {
            pushNotificationHandlerActivity.startActivity(intent);
            pushNotificationHandlerActivity.finish();
        }
    }

    /* renamed from: R4 */
    private final void m72298R4() {
        boolean z;
        String D1 = mo55213D1("DOC_KEY", m72372t3());
        if (D1 == null || C40439w.m117118v(D1)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            finish();
            return;
        }
        try {
            Intent intent = new Intent(m72350j3(), OperationDetailsActivity.class);
            intent.putExtra("PAYMENT_DETAILS_ITEM_DOC_KEY", Long.parseLong(D1));
            startActivity(intent);
        } catch (Exception unused) {
        } catch (Throwable th) {
            finish();
            throw th;
        }
        finish();
    }

    /* renamed from: R5 */
    private final void m72299R5() {
        C32343x.m95489t1(mo55218m3(), this);
    }

    /* renamed from: S3 */
    private final void m72301S3() {
        String D1 = mo55213D1("GROUP_ID", m72372t3());
        if (D1 == null) {
            finish();
            return;
        }
        Intent intent = new Intent(m72350j3(), PaymentsTemplateListActivity.class);
        intent.putExtra("PAYMENT_TEMPLATE_LIST_TYPE_KEY", 30);
        intent.putExtra("PAYMENT_TEMPLATE_LIST_GROUP_KEY", Long.parseLong(D1));
        intent.putExtra("PRODUCT_TYPE_KEY", -1);
        intent.putExtra("PRODUCT_ACCT_KEY", -1);
        new Handler(Looper.getMainLooper()).postDelayed(new C26746m(this, intent), 400);
    }

    /* renamed from: S4 */
    private final void m72302S4() {
        C38125h.m112238c(this).mo91613k0(this);
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: T3 */
    public static final void m72304T3(PushNotificationHandlerActivity pushNotificationHandlerActivity, Intent intent) {
        C41536l.m120489i(pushNotificationHandlerActivity, "this$0");
        C41536l.m120489i(intent, "$intent");
        if (!pushNotificationHandlerActivity.isFinishing() && !pushNotificationHandlerActivity.isDestroyed()) {
            pushNotificationHandlerActivity.startActivity(intent);
            pushNotificationHandlerActivity.finish();
        }
    }

    /* renamed from: T4 */
    private final void m72305T4() {
        String D1 = mo55213D1("OP_TYPE", m72372t3());
        if (C41536l.m120484d(D1, "P2P_PAYMENT_O")) {
            C38125h.m112238c(this).mo91605g0(this, new P2PFlowType.P2PSend(true));
        } else if (C41536l.m120484d(D1, "P2P_PAYMENT_TOPUP_I")) {
            C38125h.m112238c(this).mo91605g0(this, new P2PFlowType.P2PTopUp((String) null, 1, (DefaultConstructorMarker) null));
        }
        finish();
    }

    /* renamed from: U3 */
    private final void m72307U3() {
        Long l;
        String D1 = mo55213D1("CARD_ID", m72372t3());
        if (D1 == null || (l = C40438v.m117100l(D1)) == null) {
            C38125h.m112238c(this).mo91618n(this);
        } else {
            C38125h.m112238c(this).mo91624q(l.longValue(), this);
            l.longValue();
        }
        finish();
    }

    /* renamed from: U4 */
    private final void m72308U4() {
        C38122f.C38123a.m112223s(C38125h.m112238c(this), PackageType.Companion.getPackageTypeByBadge(mo55217l3().getUserInfo().getPackageBadge()), false, (String) null, this, (C0173b) null, 22, (Object) null);
    }

    /* renamed from: V3 */
    private final void m72310V3() {
        TransferForm.startWith(m72350j3(), "TRANSFER", TransferForm.OPERATION_VIEW).setTransferForm(TransferForm.TRANSFER_FORM_CONVERSION).start();
        finish();
    }

    /* renamed from: V4 */
    private final void m72311V4() {
        boolean z;
        String D1 = mo55213D1("packageGroup", m72372t3());
        String D12 = mo55213D1("packageName", m72372t3());
        ClientInfoWrapper userInfo = mo55217l3().getUserInfo();
        boolean z2 = true;
        boolean z3 = false;
        if (userInfo == null || !userInfo.isSolo()) {
            z = false;
        } else {
            z = true;
        }
        ClientInfoWrapper userInfo2 = mo55217l3().getUserInfo();
        if (userInfo2 == null || !userInfo2.isRBClient()) {
            z2 = false;
        }
        C20557a b = mo55222p3().mo48775b("SHOW_SOLO_CARD_IN_PACKAGES");
        if (b != null) {
            z3 = C41536l.m120484d(b.mo49084a(), Boolean.TRUE);
        }
        if ((z && C41536l.m120484d(D1, "SOLO")) || (z2 && (C41536l.m120484d(D1, "RB") || z3))) {
            C38122f.C38123a.m112223s(C38125h.m112238c(this), (PackageType) null, C41536l.m120484d(D1, "SOLO"), D12, this, (C0173b) null, 17, (Object) null);
        }
        finish();
    }

    /* renamed from: W3 */
    private final void m72313W3() {
        m72229A3().mo65944ow().mo55272Hm();
    }

    /* renamed from: W4 */
    private final void m72314W4() {
        String D1 = mo55213D1("PAYMENT_CATEGORY", m72372t3());
        if (D1 != null) {
            Intent intent = new Intent(this, ProviderListActivity.class);
            intent.putExtra("PAYMENT_CONFIGURATION_KEY", Long.parseLong(D1));
            startActivity(intent);
        } else if (m72380w5()) {
            m72386y5(this, "ACTION_OPEN_PAYMENTS_TAB", (Bundle) null, 2, (Object) null);
        }
        finish();
    }

    /* renamed from: X3 */
    private final void m72316X3() {
        C18569a k3 = mo55216k3();
        boolean z = true;
        ChatUser J = mo86443t1().mo89312J(true, (String) null, (String) null, (String) null);
        C41536l.m120488h(J, "app.getChatProperties(true, null, null, null)");
        if (C32335t0.m95361f() != 1) {
            z = false;
        }
        k3.mo33789c(this, J, z, mo55217l3().isAuthorized(), false);
    }

    /* renamed from: X4 */
    private final void m72317X4() {
        FinanceManagementActivity.f58918L.mo54998a(this);
        finish();
    }

    /* renamed from: Y3 */
    private final void m72319Y3(String str) {
        if (C41536l.m120484d(str, "CHECK_MY_LIMIT_RESUME_BANNER")) {
            C32343x.m95381B0(this, "check_my_limit", (String) null, "click_check_my_limit_banner_home", 2, (Object) null);
        }
        C38125h.m112238c(this).mo91637w0(C24849e.CLIENT_LIMIT, this);
        finish();
    }

    /* renamed from: Y4 */
    private final void m72320Y4() {
        C38125h.m112238c(this).mo91642z(this);
        finish();
    }

    /* renamed from: Z3 */
    private final void m72322Z3() {
        C36546y.m108282F().mo27137H("applications_CL_E2E", "CONSUMER_LOAN_E2E_CLICK_HOME_BANNER", (String) null, (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
        C41205b I = mo55228v5().mo70151a().mo95063B(C40992a.m118827a()).mo95070I(new C26741h(new C22313l(this)), new C26742i(new C22315m(this)));
        C41536l.m120488h(I, "private fun handleConsum…mpositeDisposable()\n    }");
        m72345h3(I);
    }

    /* renamed from: Z4 */
    private final void m72323Z4() {
        if (mo55217l3().getUserInfo().isRBClient()) {
            C38125h.m112238c(this).mo91626r(this);
        }
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: a4 */
    public static final void m72325a4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: a5 */
    private final void m72326a5() {
        m72386y5(this, "ACTION_OPEN_MY_PRODUCTS", (Bundle) null, 2, (Object) null);
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: b4 */
    public static final void m72328b4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: b5 */
    private final void m72329b5() {
        mo86447x2(QrScannerActivity.class);
        finish();
    }

    /* renamed from: c4 */
    private final void m72331c4() {
        ContactUsActivity.m103436P3(this);
        finish();
    }

    /* renamed from: c5 */
    private final void m72332c5(ArrayList arrayList) {
        finish();
    }

    /* renamed from: d4 */
    private final void m72334d4() {
        m72229A3().mo65944ow().mo55271F3();
    }

    /* renamed from: d5 */
    private final void m72335d5() {
        if (!mo55217l3().isAuthorized() && m72380w5()) {
            startActivity(PasswordRecoveryActivity.C40999a.m118883b(PasswordRecoveryActivity.f96810x, this, (String) null, true, 2, (Object) null));
        }
        finish();
    }

    /* renamed from: e4 */
    private final void m72337e4() {
        ExchangeActivity.m103556b3(m72350j3(), mo55213D1("CCY_ID", m72372t3()));
        finish();
    }

    /* renamed from: e5 */
    private final void m72338e5(String str) {
        Intent intent = new Intent(m72350j3(), ReferalsActivity.class);
        intent.putExtra("KEY_TAB", C41536l.m120484d(str, "PROMO_CODE_ENTER") ^ true ? 1 : 0);
        startActivity(intent);
        finish();
    }

    /* renamed from: f3 */
    private final void m72339f3() {
        getSupportFragmentManager().mo4367F1("REQUEST_KEY_GOOGLE_PAY_DISMISSED", this, new C26722a(this));
    }

    /* renamed from: f4 */
    private final void m72340f4() {
        m72229A3().mo65944ow().mo55275og();
    }

    /* renamed from: f5 */
    private final void m72341f5() {
        if (!mo55217l3().isAuthorized() && m72380w5()) {
            m72386y5(this, "ACTION_OPEN_REGISTRATION_FLOW", (Bundle) null, 2, (Object) null);
        }
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public static final void m72342g3(PushNotificationHandlerActivity pushNotificationHandlerActivity, String str, Bundle bundle) {
        C41536l.m120489i(pushNotificationHandlerActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        if (bundle.getBoolean("RESULT_KEY_GOOGLE_PAY_DISMISSED", false)) {
            pushNotificationHandlerActivity.finish();
        }
    }

    /* renamed from: g4 */
    private final void m72343g4() {
        DDSTOListActivity.m103490M2(m72350j3(), false);
        finish();
    }

    /* renamed from: g5 */
    private final void m72344g5() {
        String D1 = mo55213D1("ACTION_TYPE", m72372t3());
        if (C41536l.m120484d("RECEIVE", D1)) {
            C38125h.m112238c(m72350j3()).mo91564N(m72350j3(), mo55213D1("MT_SYSTEM", m72372t3()), false);
        } else if (D1 == null) {
            m72255G5();
        } else {
            C41536l.m120484d("SEND", D1);
        }
        finish();
    }

    /* renamed from: h3 */
    private final void m72345h3(C41205b bVar) {
        mo86438k1(bVar);
    }

    /* renamed from: h4 */
    private final void m72346h4() {
        if (mo55217l3().getUserRestrictions().contains(UserRestrictions.CARDS_APPLICATIONS_REGISTER)) {
            finish();
            return;
        }
        C38122f.C38123a.m112219o(C38125h.m112238c(m72350j3()), this, mo55213D1("appType", m72372t3()), mo55213D1("subProductCode", m72372t3()), false, 8, (Object) null);
        finish();
    }

    /* renamed from: h5 */
    private final void m72347h5() {
        DDSTOListActivity.m103490M2(m72350j3(), true);
        finish();
    }

    /* renamed from: i4 */
    private final void m72348i4() {
        Long l;
        String D1 = mo55213D1("CARD_ID", m72372t3());
        if (D1 != null && (l = C40438v.m117100l(D1)) != null) {
            C38122f.C38123a.m112211g(C38125h.m112238c(this), this, l.longValue(), (C0173b) null, 4, (Object) null);
        }
    }

    /* renamed from: i5 */
    private final void m72349i5() {
        if (mo55217l3().hasProducts()) {
            m72263I5();
        } else {
            new Handler().postDelayed(new C26740g(this), 400);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public final Activity m72350j3() {
        return this;
    }

    /* renamed from: j4 */
    private final void m72351j4() {
        if (!mo55217l3().getUserRestrictions().contains(UserRestrictions.DEPOSITS_APPLICATIONS_OPEN_NEW_DEPOSIT)) {
            C38125h.m112238c(this).mo91611j0(this, mo55213D1("DEPOSIT_TYPE", m72372t3()));
        }
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: j5 */
    public static final void m72352j5(PushNotificationHandlerActivity pushNotificationHandlerActivity) {
        C41536l.m120489i(pushNotificationHandlerActivity, "this$0");
        pushNotificationHandlerActivity.m72263I5();
    }

    /* renamed from: k4 */
    private final void m72353k4(String str) {
        m72295Q5(this, str, (String) null, 2, (Object) null);
        finish();
    }

    /* renamed from: k5 */
    private final void m72354k5() {
        boolean z;
        String D1 = mo55213D1("CARD_ID", m72372t3());
        if (D1 == null || C40439w.m117118v(D1)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            finish();
        } else if (!mo55217l3().hasProduct("ACCOUNT") || !mo55217l3().isAuthorized()) {
            finish();
        } else {
            C41205b G0 = C26628j.m83095d(mo55220o3(), false, 1, (Object) null).mo95027o0(C40992a.m118827a()).mo94980F(new C26750q(new C22327s(this))).mo94983G0(new C26751r(new C22329t(this, D1)), new C26724b(new C22332u(this)));
            C41536l.m120488h(G0, "private fun handleTccPus… finish()\n        }\n    }");
            m72345h3(G0);
        }
    }

    /* renamed from: l1 */
    private final void m72355l1() {
        C26756w pw = m72229A3().mo65945pw();
        C37224b.m109963b(pw.mo65938F(), this, new C22293b(this));
        pw.mo65940Oj().mo4819k(this, new C22324q0(new C22295c(this)));
        pw.mo65939Ne().mo4819k(this, new C22324q0(new C22297d(this)));
        pw.mo65942Sh().mo4819k(this, new C22324q0(new C22299e(this)));
        pw.mo65941Rk().mo4819k(this, new C22324q0(new C22301f(this)));
        C37224b.m109963b(pw.mo65937A7(), this, new C22303g(this));
        pw.mo65943kk().mo4819k(this, new C22324q0(new C22305h(this)));
    }

    /* renamed from: l4 */
    private final void m72356l4() {
        m72229A3().mo65944ow().mo55277ya();
    }

    /* access modifiers changed from: private */
    /* renamed from: l5 */
    public static final void m72357l5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: m4 */
    private final void m72358m4() {
        String D1 = mo55213D1("id", m72372t3());
        if (D1 == null) {
            finish();
            return;
        }
        C38125h.m112237b(this).mo91647b(this, true, Long.parseLong(D1));
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: m5 */
    public static final void m72359m5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: n4 */
    private final void m72360n4() {
        m72386y5(this, "ACTION_OPEN_GIFT_CARDS_TAB", (Bundle) null, 2, (Object) null);
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: n5 */
    public static final void m72361n5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: o4 */
    private final void m72362o4() {
        boolean z;
        if (!mo55227v3().deviceCanSupportGooglePay() || !C20101a.f54724a.mo48497a(mo55223q3())) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            finish();
        } else if (mo55227v3().getGooglePayState() == GooglePayState.WALLET_NEEDS_CREATION) {
            C38125h.m112238c(this).mo91619n0(this);
        } else {
            C38122f.C38123a.m112205a(C38125h.m112238c(this), (Long) null, 1, (Object) null).mo4576A1(getSupportFragmentManager(), (String) null);
        }
    }

    /* renamed from: o5 */
    private final void m72363o5() {
        C38125h.m112238c(this).mo91632u(this, new OtherTransferTypeState(0, false, true, 3, (DefaultConstructorMarker) null));
        finish();
    }

    /* renamed from: p4 */
    private final void m72364p4() {
        m72386y5(this, "ACTION_OPEN_HUB", (Bundle) null, 2, (Object) null);
        finish();
    }

    /* renamed from: p5 */
    private final void m72365p5() {
        m72386y5(this, "ACTION_OPEN_TRANSFERS_TAB", (Bundle) null, 2, (Object) null);
        finish();
    }

    /* renamed from: q4 */
    private final void m72366q4(String str) {
        String D1 = mo55213D1("REDIRECT_PROCESS_REF", m72372t3());
        String D12 = mo55213D1("REDIRECT_PROCESS_URL", m72372t3());
        String D13 = mo55213D1("QR_AUTH_TYPE", m72372t3());
        Bundle bundle = new Bundle();
        bundle.putString("REDIRECT_PUSH_TYPE", str);
        bundle.putString("REDIRECT_PROCESS_REF", D1);
        bundle.putString("REDIRECT_PROCESS_URL", D12);
        bundle.putString("REDIRECT_PROCESS_TYPE", D13);
        C41238w wVar = C41238w.f97225a;
        m72383x5("ACTION_OPEN_INSTALLMENT_POP_UP", bundle);
        finish();
    }

    /* renamed from: q5 */
    private final void m72367q5() {
        String D1 = mo55213D1("PASS_TYPE", m72372t3());
        if (D1 == null) {
            D1 = "";
        }
        C38125h.m112238c(m72350j3()).mo91602f(m72350j3(), D1);
        finish();
    }

    /* renamed from: r4 */
    private final void m72368r4() {
        String D1 = mo55213D1("OFFER_NO", m72372t3());
        String D12 = mo55213D1("OPER_TYPE", m72372t3());
        if (TextUtils.isEmpty(D1) || TextUtils.isEmpty(D12)) {
            finish();
            return;
        }
        C41205b G0 = C26615g.m83078c(mo55225s3(), false, false, 3, (Object) null).mo95027o0(C40992a.m118827a()).mo94983G0(new C26747n(new C22317n(this, D1, D12)), new C26748o(new C22319o(this)));
        C41536l.m120488h(G0, "private fun handleInstal…mpositeDisposable()\n    }");
        m72345h3(G0);
    }

    /* renamed from: r5 */
    private final void m72369r5() {
        C38125h.m112238c(m72350j3()).mo91552H(m72350j3(), mo55213D1("INSURANCE_TYPE", m72372t3()));
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: s4 */
    public static final void m72370s4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: s5 */
    private final void m72371s5() {
        NotificationListActivity.m104383P2(m72350j3(), -1);
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public final ArrayList m72372t3() {
        return (ArrayList) this.f59160Z.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: t4 */
    public static final void m72373t4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: t5 */
    private final void m72374t5() {
        String D1 = mo55213D1("CLICK_WEB_URL", m72372t3());
        C38122f c = C38125h.m112238c(this);
        if (D1 == null) {
            D1 = "";
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        c.mo91636w(D1, supportFragmentManager, (String) null);
    }

    /* renamed from: u4 */
    private final void m72375u4() {
        C38122f.C38123a.m112217m(C38125h.m112238c(m72350j3()), m72350j3(), (C26252e) null, (C0173b) null, 6, (Object) null);
        finish();
    }

    /* renamed from: u5 */
    private final void m72376u5() {
        SecuritySettingsActivity.f59609G.mo55703a(m72350j3(), mo55213D1("DEVICE_ID", m72372t3()));
        finish();
    }

    /* renamed from: v4 */
    private final void m72377v4() {
        C22340b.C22341a.m72447a(m72229A3().mo65944ow(), (Long) null, 1, (Object) null);
    }

    /* renamed from: w3 */
    private final String m72378w3() {
        return (String) this.f59158X.getValue();
    }

    /* renamed from: w4 */
    private final void m72379w4() {
        C38125h.m112238c(m72350j3()).mo91547E0(m72350j3());
        finish();
    }

    /* renamed from: w5 */
    private final boolean m72380w5() {
        return ((Boolean) this.f59156V.getValue()).booleanValue();
    }

    /* renamed from: x3 */
    private final String m72381x3() {
        return (String) this.f59159Y.getValue();
    }

    /* renamed from: x4 */
    private final void m72382x4() {
        C38125h.m112238c(this).mo91596c(this);
        finish();
    }

    /* renamed from: x5 */
    private final void m72383x5(String str, Bundle bundle) {
        Intent flags = new Intent(this, MainActivity.class).setAction(str).putExtras(bundle).setFlags(872415232);
        C41536l.m120488h(flags, "Intent(this, MainActivit…VITY_SINGLE_TOP\n        )");
        startActivity(flags);
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public final Bundle m72384y3() {
        return (Bundle) this.f59157W.getValue();
    }

    /* renamed from: y4 */
    private final void m72385y4() {
        String D1 = mo55213D1("categoryId", m72372t3());
        if (D1 == null) {
            finish();
            return;
        }
        C38125h.m112238c(this).mo91622p(this, Long.parseLong(D1));
        finish();
    }

    /* renamed from: y5 */
    static /* synthetic */ void m72386y5(PushNotificationHandlerActivity pushNotificationHandlerActivity, String str, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = new Bundle();
        }
        pushNotificationHandlerActivity.m72383x5(str, bundle);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: z3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo m72387z3(p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode r4, java.util.List r5) {
        /*
            r3 = this;
            r0 = 0
            if (r5 == 0) goto L_0x0021
            java.util.Iterator r5 = r5.iterator()
        L_0x0007:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x001f
            java.lang.Object r1 = r5.next()
            r2 = r1
            ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo r2 = (p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo) r2
            ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode r2 = r2.getProductCode()
            boolean r2 = kotlin.jvm.internal.C41536l.m120484d(r2, r4)
            if (r2 == 0) goto L_0x0007
            r0 = r1
        L_0x001f:
            ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo r0 = (p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo) r0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity.m72387z3(ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode, java.util.List):ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo");
    }

    /* renamed from: z4 */
    private final void m72388z4() {
        String D1 = mo55213D1("OFR_ID", m72372t3());
        if (D1 == null) {
            finish();
            return;
        }
        C38125h.m112238c(this).mo91545D0(this, Long.parseLong(D1));
        finish();
    }

    /* renamed from: z5 */
    private final void m72389z5(String str) {
        mo55226u3().makePushNotificationAction(new C22335x(), str, NotificationActionCode.ACTION_CODE_READ.getCode());
    }

    /* access modifiers changed from: protected */
    /* renamed from: D1 */
    public String mo55213D1(String str, List list) {
        boolean z;
        Object obj;
        if (list == null) {
            return null;
        }
        if (str == null || C40439w.m117118v(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C41536l.m120484d(((KeyValue) obj).getKey(), str)) {
                break;
            }
        }
        KeyValue keyValue = (KeyValue) obj;
        if (keyValue != null) {
            return keyValue.getValue();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_push_notification_handler;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        C27399q1 a = C27399q1.m84899a(findViewById(C10322k.f28864lt));
        C41536l.m120488h(a, "bind(findViewById(R.id.root))");
        this.f59155U = a;
        m72355l1();
        m72339f3();
        m72267J5();
        m72271K5();
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* renamed from: i3 */
    public final C26144b mo55215i3() {
        C26144b bVar = this.f59153S;
        if (bVar != null) {
            return bVar;
        }
        C41536l.m120506z("accountsWithCardUiMapper");
        return null;
    }

    /* renamed from: k3 */
    public final C18569a mo55216k3() {
        C18569a aVar = this.f59142H;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("chat");
        return null;
    }

    /* renamed from: l3 */
    public final Client mo55217l3() {
        Client client = this.f59141G;
        if (client != null) {
            return client;
        }
        C41536l.m120506z("client");
        return null;
    }

    /* renamed from: m3 */
    public final C41438c mo55218m3() {
        C41438c cVar = this.f59152R;
        if (cVar != null) {
            return cVar;
        }
        C41536l.m120506z("eventBus");
        return null;
    }

    /* renamed from: n3 */
    public final C26754u mo55219n3() {
        C26754u uVar = this.f59149O;
        if (uVar != null) {
            return uVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    /* renamed from: o3 */
    public final C26628j mo55220o3() {
        C26628j jVar = this.f59146L;
        if (jVar != null) {
            return jVar;
        }
        C41536l.m120506z("getAccountsWithCardDetailsUseCase");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 10036) {
            if (i == 10037) {
                mo55227v3().setGooglePayState(GooglePayState.ACTIVE);
                if (i2 == -1) {
                    C38122f.C38123a.m112205a(C38125h.m112238c(this), (Long) null, 1, (Object) null).mo4576A1(getSupportFragmentManager(), (String) null);
                }
            }
        } else if (i2 == -1) {
            m72233B3("Conversion_Google_Pay", C10457a.f29785f);
            m72229A3().mo65944ow().mo55273Oc();
            finish();
        }
    }

    @C41452l
    public final void onLoanEvent(LoansEvent loansEvent) {
        C41536l.m120489i(loansEvent, "loansEvent");
        if (C41536l.m120484d(m72381x3(), "LND_AMT")) {
            int state = loansEvent.getState();
            if (state == 10) {
                m72283N5();
            } else if (state == 20) {
                String D1 = mo55213D1("LOAN_KEY", m72372t3());
                if (D1 != null) {
                    try {
                        int loanPositionByLoanKey = loansEvent.getLoansWrapper().getLoanPositionByLoanKey(Long.parseLong(D1));
                        if (loanPositionByLoanKey >= 0) {
                            C38122f.C38123a.m112229y(C38125h.m112238c(this), m72350j3(), (Long) null, Integer.valueOf(loanPositionByLoanKey), 2, (Object) null);
                        }
                    } catch (Exception unused) {
                        m72299R5();
                        finish();
                    }
                } else {
                    finish();
                }
            } else if (state == 30 || state == 40) {
                finish();
            }
        }
    }

    /* renamed from: p3 */
    public final C20292b mo55222p3() {
        C20292b bVar = this.f59150P;
        if (bVar != null) {
            return bVar;
        }
        C41536l.m120506z("getAppSettingByName");
        return null;
    }

    /* renamed from: q3 */
    public final C20292b mo55223q3() {
        C20292b bVar = this.f59144J;
        if (bVar != null) {
            return bVar;
        }
        C41536l.m120506z("getAppSettingByNameUseCase");
        return null;
    }

    /* renamed from: r3 */
    public final C26633o mo55224r3() {
        C26633o oVar = this.f59147M;
        if (oVar != null) {
            return oVar;
        }
        C41536l.m120506z("getCardDetailsUseCase");
        return null;
    }

    /* renamed from: s3 */
    public final C26615g mo55225s3() {
        C26615g gVar = this.f59145K;
        if (gVar != null) {
            return gVar;
        }
        C41536l.m120506z("getOffersInfoUseCase");
        return null;
    }

    /* renamed from: u3 */
    public final BankApi mo55226u3() {
        BankApi bankApi = this.f59151Q;
        if (bankApi != null) {
            return bankApi;
        }
        C41536l.m120506z("mBankApi");
        return null;
    }

    /* renamed from: v3 */
    public final PreferencesApiManager mo55227v3() {
        PreferencesApiManager preferencesApiManager = this.f59143I;
        if (preferencesApiManager != null) {
            return preferencesApiManager;
        }
        C41536l.m120506z("preferencesApiManager");
        return null;
    }

    /* renamed from: v5 */
    public final C29879c mo55228v5() {
        C29879c cVar = this.f59148N;
        if (cVar != null) {
            return cVar;
        }
        C41536l.m120506z("isCreditLoanAllowedUseCase");
        return null;
    }
}
