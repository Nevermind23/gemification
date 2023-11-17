package p439gm;

import ed1.C40734b;
import ed1.C40749p;
import ed1.C40762x;
import g91.C32359z0;
import hd0.C24978b;
import he1.C41238w;
import i31.C36345b;
import j51.C36735g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ld0.C25950a;
import m00.C26116a;
import m51.C37228a;
import nd0.C26453c;
import od0.C26940a;
import od0.C26941b;
import p341ge.bog.mobilebank.cardapplications.data.entity.CardClientCountryInfoEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.DebitCardAppAccountEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.DebitCardCommissionEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.DebitCardCurrencyEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.DebitCardFeeEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.DebitCardNicknameEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.DebitCardPayrollInfoEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.DebitCardPinDeliveryTypeEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.DebitCardRegTypeEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.DebitCardRegisterResultEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.ScoolCardInfoEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.delivery.CardDeliveryAddressesEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.delivery.DeliveryFeeEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.instantcards.InstantCardActivationResultEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.instantcards.InstantDeliveryPointEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.instantcards.ValidatedInstantCardEntity;
import p341ge.bog.mobilebank.cardapplications.data.entity.insurance.DebitCardInsuranceInfoEntity;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;
import p341ge.bog.mobilebank.cleanarch.lookup.data.entity.LookupEntity;
import p341ge.bog.mobilebank.cleanarch.precontract.data.entity.PreContractEntity;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p425fm.C12925a;
import p453hm.C15534a;
import p467im.C15700a;
import p509lm.C16586a;
import p537nm.C17075c0;
import p537nm.C17082f;
import p537nm.C17085g0;
import p537nm.C17090i0;
import p537nm.C17099p;
import p537nm.C17102s;
import p537nm.C17104u;
import p537nm.C17109z;
import p551om.C17267c;
import p565pm.C17387b;
import p565pm.C17391f;
import p707as.C19273c;
import p845ny.C26639a;
import pd0.C27503h;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: gm.d0 */
public final class C15309d0 implements C16586a, C26941b {

    /* renamed from: k */
    public static final C15310a f43701k = new C15310a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final IRetrofitService f43702d;

    /* renamed from: e */
    private final C12925a f43703e;

    /* renamed from: f */
    private final C36735g f43704f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C26116a f43705g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C15700a f43706h;

    /* renamed from: i */
    private final /* synthetic */ C26940a f43707i = new C26940a();

    /* renamed from: j */
    private final C27503h f43708j = mo42395H4(new C27503h());

    /* renamed from: gm.d0$a */
    public static final class C15310a {
        private C15310a() {
        }

        public /* synthetic */ C15310a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: gm.d0$a0 */
    /* synthetic */ class C15311a0 extends C41535k implements C43075l {
        C15311a0(Object obj) {
            super(1, obj, C15700a.class, "transform", "transform(Lge/bog/mobilebank/cardapplications/data/entity/instantcards/InstantCardActivationResultEntity;)Lge/bog/mobilebank/cardapplications/domain/model/intantcards/InstantCardActivationResult;", 0);
        }

        /* renamed from: b */
        public final C17387b invoke(InstantCardActivationResultEntity instantCardActivationResultEntity) {
            C41536l.m120489i(instantCardActivationResultEntity, "p0");
            return ((C15700a) this.receiver).mo43015F(instantCardActivationResultEntity);
        }
    }

    /* renamed from: gm.d0$b */
    static final class C15312b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C15312b f43709d = new C15312b();

        C15312b() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(YesNoApiEntity yesNoApiEntity) {
            boolean z;
            C41536l.m120489i(yesNoApiEntity, "it");
            if (yesNoApiEntity == YesNoApiEntity.YES) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: gm.d0$b0 */
    static final class C15313b0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15309d0 f43710d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15313b0(C15309d0 d0Var) {
            super(1);
            this.f43710d = d0Var;
        }

        /* renamed from: a */
        public final void mo42426a(C17387b bVar) {
            this.f43710d.m55744i5(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42426a((C17387b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: gm.d0$c */
    static final class C15314c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15309d0 f43711d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15314c(C15309d0 d0Var) {
            super(1);
            this.f43711d = d0Var;
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "it");
            C15700a E4 = this.f43711d.f43706h;
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(E4.mo43036p((DebitCardAppAccountEntity) it.next()));
            }
            return arrayList;
        }
    }

    /* renamed from: gm.d0$c0 */
    /* synthetic */ class C15315c0 extends C41535k implements C43075l {
        C15315c0(Object obj) {
            super(1, obj, C15700a.class, "transform", "transform(Lge/bog/mobilebank/cardapplications/data/entity/ScoolCardInfoEntity;)Lge/bog/mobilebank/cardapplications/domain/model/ScoolCardInfo;", 0);
        }

        /* renamed from: b */
        public final C17090i0 invoke(ScoolCardInfoEntity scoolCardInfoEntity) {
            C41536l.m120489i(scoolCardInfoEntity, "p0");
            return ((C15700a) this.receiver).mo43011B(scoolCardInfoEntity);
        }
    }

    /* renamed from: gm.d0$d */
    static final class C15316d extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C15316d f43712d = new C15316d();

        C15316d() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(YesNoApiEntity yesNoApiEntity) {
            C41536l.m120489i(yesNoApiEntity, "it");
            return Boolean.valueOf(C24978b.valueOf(yesNoApiEntity.name()).mo63390c());
        }
    }

    /* renamed from: gm.d0$d0 */
    /* synthetic */ class C15317d0 extends C41535k implements C43075l {
        C15317d0(Object obj) {
            super(1, obj, C15700a.class, "transform", "transform(Lge/bog/mobilebank/cardapplications/data/entity/instantcards/ValidatedInstantCardEntity;)Lge/bog/mobilebank/cardapplications/domain/model/intantcards/ValidatedInstantCard;", 0);
        }

        /* renamed from: b */
        public final C17391f invoke(ValidatedInstantCardEntity validatedInstantCardEntity) {
            C41536l.m120489i(validatedInstantCardEntity, "p0");
            return ((C15700a) this.receiver).mo43018I(validatedInstantCardEntity);
        }
    }

    /* renamed from: gm.d0$e */
    /* synthetic */ class C15318e extends C41535k implements C43075l {
        C15318e(Object obj) {
            super(1, obj, C15700a.class, "transformApplicationTypes", "transformApplicationTypes(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C15700a) this.receiver).mo43019K(list);
        }
    }

    /* renamed from: gm.d0$f */
    /* synthetic */ class C15319f extends C41535k implements C43075l {
        C15319f(Object obj) {
            super(1, obj, C15700a.class, "transform", "transform(Lge/bog/mobilebank/cardapplications/data/entity/delivery/CardDeliveryAddressesEntity;)Ljava/util/List;", 0);
        }

        /* renamed from: b */
        public final List invoke(CardDeliveryAddressesEntity cardDeliveryAddressesEntity) {
            C41536l.m120489i(cardDeliveryAddressesEntity, "p0");
            return ((C15700a) this.receiver).mo43027e(cardDeliveryAddressesEntity);
        }
    }

    /* renamed from: gm.d0$g */
    /* synthetic */ class C15320g extends C41535k implements C43075l {
        C15320g(Object obj) {
            super(1, obj, C15700a.class, "transform", "transform(Lge/bog/mobilebank/cardapplications/data/entity/delivery/DeliveryFeeEntity;)Lge/bog/mobilebank/cardapplications/domain/model/delivery/DebitCardDeliveryFee;", 0);
        }

        /* renamed from: b */
        public final C17267c invoke(DeliveryFeeEntity deliveryFeeEntity) {
            C41536l.m120489i(deliveryFeeEntity, "p0");
            return ((C15700a) this.receiver).mo43014E(deliveryFeeEntity);
        }
    }

    /* renamed from: gm.d0$h */
    /* synthetic */ class C15321h extends C41535k implements C43075l {
        C15321h(Object obj) {
            super(1, obj, C15700a.class, "transform", "transform(Lge/bog/mobilebank/cardapplications/data/entity/DebitCardFeeEntity;)Lge/bog/mobilebank/cardapplications/domain/model/DebitCardFee;", 0);
        }

        /* renamed from: b */
        public final C17102s invoke(DebitCardFeeEntity debitCardFeeEntity) {
            return ((C15700a) this.receiver).mo43039s(debitCardFeeEntity);
        }
    }

    /* renamed from: gm.d0$i */
    /* synthetic */ class C15322i extends C41535k implements C43075l {
        C15322i(Object obj) {
            super(1, obj, C15700a.class, "transform", "transform(Lge/bog/mobilebank/cardapplications/data/entity/DebitCardNicknameEntity;)Lge/bog/mobilebank/cardapplications/domain/model/DebitCardNickname;", 0);
        }

        /* renamed from: b */
        public final C17104u invoke(DebitCardNicknameEntity debitCardNicknameEntity) {
            C41536l.m120489i(debitCardNicknameEntity, "p0");
            return ((C15700a) this.receiver).mo43040t(debitCardNicknameEntity);
        }
    }

    /* renamed from: gm.d0$j */
    static final class C15323j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15309d0 f43713d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15323j(C15309d0 d0Var) {
            super(1);
            this.f43713d = d0Var;
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "it");
            C15700a E4 = this.f43713d.f43706h;
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(E4.mo43041u((DebitCardPayrollInfoEntity) it.next()));
            }
            return arrayList;
        }
    }

    /* renamed from: gm.d0$k */
    /* synthetic */ class C15324k extends C41535k implements C43075l {
        C15324k(Object obj) {
            super(1, obj, C15700a.class, "transform", "transform(Lge/bog/mobilebank/cardapplications/data/entity/CardClientCountryInfoEntity;)Lge/bog/mobilebank/cardapplications/domain/model/CardClientCountryInfo;", 0);
        }

        /* renamed from: b */
        public final C17082f invoke(CardClientCountryInfoEntity cardClientCountryInfoEntity) {
            C41536l.m120489i(cardClientCountryInfoEntity, "p0");
            return ((C15700a) this.receiver).mo43031j(cardClientCountryInfoEntity);
        }
    }

    /* renamed from: gm.d0$l */
    /* synthetic */ class C15325l extends C41535k implements C43075l {
        C15325l(Object obj) {
            super(1, obj, C15700a.class, "transformDefaultDepartments", "transformDefaultDepartments(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C15700a) this.receiver).mo43020L(list);
        }
    }

    /* renamed from: gm.d0$m */
    static final class C15326m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15309d0 f43714d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15326m(C15309d0 d0Var) {
            super(1);
            this.f43714d = d0Var;
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "it");
            C15309d0 d0Var = this.f43714d;
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(d0Var.f43706h.mo43038r((DebitCardCurrencyEntity) it.next()));
            }
            return arrayList;
        }
    }

    /* renamed from: gm.d0$n */
    /* synthetic */ class C15327n extends C41535k implements C43075l {
        C15327n(Object obj) {
            super(1, obj, C15700a.class, "transform", "transform(Lge/bog/mobilebank/cardapplications/data/entity/insurance/DebitCardInsuranceInfoEntity;)Lge/bog/mobilebank/shared/domain/cards/model/insurance/CardInsuranceInfo;", 0);
        }

        /* renamed from: b */
        public final C36345b invoke(DebitCardInsuranceInfoEntity debitCardInsuranceInfoEntity) {
            C41536l.m120489i(debitCardInsuranceInfoEntity, "p0");
            return ((C15700a) this.receiver).mo43025c(debitCardInsuranceInfoEntity);
        }
    }

    /* renamed from: gm.d0$o */
    static final class C15328o extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C15328o f43715d = new C15328o();

        C15328o() {
            super(1);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "entities");
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                LookupEntity lookupEntity = (LookupEntity) it.next();
                C41536l.m120488h(lookupEntity, "it");
                arrayList.add(C26639a.m83111a(lookupEntity));
            }
            return arrayList;
        }
    }

    /* renamed from: gm.d0$p */
    /* synthetic */ class C15329p extends C41535k implements C43075l {
        C15329p(Object obj) {
            super(1, obj, C15700a.class, "transform", "transform(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C15700a) this.receiver).mo43028f(list);
        }
    }

    /* renamed from: gm.d0$q */
    static final class C15330q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15309d0 f43716d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15330q(C15309d0 d0Var) {
            super(1);
            this.f43716d = d0Var;
        }

        /* renamed from: a */
        public final C17099p invoke(DebitCardCommissionEntity debitCardCommissionEntity) {
            C41536l.m120489i(debitCardCommissionEntity, "it");
            return this.f43716d.f43706h.mo43037q(debitCardCommissionEntity);
        }
    }

    /* renamed from: gm.d0$r */
    static final class C15331r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15309d0 f43717d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15331r(C15309d0 d0Var) {
            super(1);
            this.f43717d = d0Var;
        }

        /* renamed from: a */
        public final C25950a invoke(PreContractEntity preContractEntity) {
            C41536l.m120489i(preContractEntity, "it");
            return this.f43717d.f43705g.mo65027a(preContractEntity);
        }
    }

    /* renamed from: gm.d0$s */
    /* synthetic */ class C15332s extends C41535k implements C43075l {
        C15332s(Object obj) {
            super(1, obj, C26116a.class, "transform", "transform(Lge/bog/mobilebank/cleanarch/precontract/data/entity/PreContractEntity;)Lge/bog/mobilebank/domain/precontract/model/PreContract;", 0);
        }

        /* renamed from: b */
        public final C25950a invoke(PreContractEntity preContractEntity) {
            C41536l.m120489i(preContractEntity, "p0");
            return ((C26116a) this.receiver).mo65027a(preContractEntity);
        }
    }

    /* renamed from: gm.d0$t */
    static final class C15333t extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15309d0 f43718d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15333t(C15309d0 d0Var) {
            super(1);
            this.f43718d = d0Var;
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "it");
            C15309d0 d0Var = this.f43718d;
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(d0Var.f43706h.mo43016G((InstantDeliveryPointEntity) it.next()));
            }
            return arrayList;
        }
    }

    /* renamed from: gm.d0$u */
    static final class C15334u extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15309d0 f43719d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15334u(C15309d0 d0Var) {
            super(1);
            this.f43719d = d0Var;
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "it");
            C15309d0 d0Var = this.f43719d;
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(d0Var.f43706h.mo43042v((DebitCardPinDeliveryTypeEntity) it.next()));
            }
            return arrayList;
        }
    }

    /* renamed from: gm.d0$v */
    /* synthetic */ class C15335v extends C41535k implements C43075l {
        C15335v(Object obj) {
            super(1, obj, C15700a.class, "transform", "transformRecoverCards(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C15700a) this.receiver).mo43021N(list);
        }
    }

    /* renamed from: gm.d0$w */
    static final class C15336w extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15309d0 f43720d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15336w(C15309d0 d0Var) {
            super(1);
            this.f43720d = d0Var;
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "it");
            C15309d0 d0Var = this.f43720d;
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(d0Var.f43706h.mo43043w((DebitCardRegTypeEntity) it.next()));
            }
            return arrayList;
        }
    }

    /* renamed from: gm.d0$x */
    /* synthetic */ class C15337x extends C41535k implements C43075l {
        C15337x(Object obj) {
            super(1, obj, C15700a.class, "transform", "transformSchoolCardLimits(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C15700a) this.receiver).mo43022O(list);
        }
    }

    /* renamed from: gm.d0$y */
    /* synthetic */ class C15338y extends C41535k implements C43064a {
        C15338y(Object obj) {
            super(0, obj, C15309d0.class, "getCountryInfoObservable", "getCountryInfoObservable()Lio/reactivex/Observable;", 0);
        }

        public final C40749p invoke() {
            return ((C15309d0) this.receiver).m55719T4();
        }
    }

    /* renamed from: gm.d0$z */
    /* synthetic */ class C15339z extends C41535k implements C43075l {

        /* renamed from: d */
        public static final C15339z f43721d = new C15339z();

        C15339z() {
            super(1, C15534a.class, "toDomainModel", "toDomainModel(Lge/bog/mobilebank/cardapplications/data/entity/DebitCardRegisterResultEntity;)Lge/bog/mobilebank/cardapplications/domain/model/DebitCardRegisterResult;", 1);
        }

        /* renamed from: b */
        public final C17109z invoke(DebitCardRegisterResultEntity debitCardRegisterResultEntity) {
            C41536l.m120489i(debitCardRegisterResultEntity, "p0");
            return C15534a.m56110a(debitCardRegisterResultEntity);
        }
    }

    public C15309d0(IRetrofitService iRetrofitService, C12925a aVar, C36735g gVar, C26116a aVar2, C15700a aVar3) {
        C41536l.m120489i(iRetrofitService, "service");
        C41536l.m120489i(aVar, "debitCardsService");
        C41536l.m120489i(gVar, "getLoginInfo");
        C41536l.m120489i(aVar2, "preContractEntityMapper");
        C41536l.m120489i(aVar3, "mapper");
        this.f43702d = iRetrofitService;
        this.f43703e = aVar;
        this.f43704f = gVar;
        this.f43705g = aVar2;
        this.f43706h = aVar3;
    }

    /* access modifiers changed from: private */
    /* renamed from: I4 */
    public static final Boolean m55709I4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Boolean) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: J4 */
    public static final Boolean m55710J4(Throwable th) {
        C41536l.m120489i(th, "it");
        return Boolean.FALSE;
    }

    /* access modifiers changed from: private */
    /* renamed from: L4 */
    public static final List m55711L4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: M4 */
    public static final Boolean m55712M4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Boolean) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: N4 */
    public static final List m55713N4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: O4 */
    public static final List m55714O4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: P4 */
    public static final C17267c m55715P4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C17267c) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q4 */
    public static final C17102s m55716Q4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C17102s) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: R4 */
    public static final C17104u m55717R4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C17104u) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: S4 */
    public static final List m55718S4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: T4 */
    public final C40749p m55719T4() {
        Long l;
        C12925a aVar = this.f43703e;
        C37228a a = this.f43704f.mo89562a();
        if (a != null) {
            l = Long.valueOf(a.mo90305b());
        } else {
            l = null;
        }
        C40749p k0 = aVar.mo33689I3(String.valueOf(l)).mo95026k0(new C15356u(new C15324k(this.f43706h)));
        C41536l.m120488h(k0, "debitCardsService.getCar…  .map(mapper::transform)");
        return k0;
    }

    /* access modifiers changed from: private */
    /* renamed from: U4 */
    public static final C17082f m55720U4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C17082f) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: V4 */
    public static final List m55721V4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: W4 */
    public static final List m55722W4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: X4 */
    public static final C36345b m55723X4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C36345b) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y4 */
    public static final List m55724Y4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z4 */
    public static final List m55726Z4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: a5 */
    public static final C17099p m55728a5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C17099p) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: b5 */
    public static final C25950a m55730b5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C25950a) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: c5 */
    public static final C25950a m55732c5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C25950a) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: d5 */
    public static final List m55734d5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: e5 */
    public static final List m55736e5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: f5 */
    public static final List m55738f5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: g5 */
    public static final List m55740g5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: h5 */
    public static final List m55742h5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: i5 */
    public final void m55744i5(boolean z) {
        this.f43708j.mo66814o(z, new C15338y(this)).mo94979E0();
    }

    /* access modifiers changed from: private */
    /* renamed from: j5 */
    public static final C17109z m55746j5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C17109z) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: k5 */
    public static final C17387b m55748k5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C17387b) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: l5 */
    public static final void m55750l5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: m5 */
    public static final C17090i0 m55752m5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C17090i0) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: n5 */
    public static final C17391f m55754n5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C17391f) lVar.invoke(obj);
    }

    /* renamed from: A1 */
    public C40762x mo42390A1() {
        C40762x A = this.f43703e.mo33678A1().mo95062A(new C15361z(new C15335v(this.f43706h)));
        C41536l.m120488h(A, "debitCardsService.getRec…().map(mapper::transform)");
        return A;
    }

    /* renamed from: Ca */
    public C40762x mo42391Ca(List list, boolean z, Long l, Long l2, Boolean bool, Boolean bool2, boolean z2) {
        String str;
        String str2;
        String str3;
        C24978b b;
        C24978b b2;
        C12925a aVar = this.f43703e;
        String str4 = null;
        if (list != null) {
            str = C41358y.m120017g0(list, C11110u2.f31950c, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C43075l) null, 62, (Object) null);
        } else {
            str = null;
        }
        String e = C24978b.m79846b(Boolean.valueOf(z)).mo63391e();
        C41536l.m120488h(e, "fromBoolean(isPayroll).value");
        if (l2 != null) {
            str2 = l2.toString();
        } else {
            str2 = null;
        }
        if (bool == null || (b2 = C24978b.m79846b(bool)) == null) {
            str3 = null;
        } else {
            str3 = b2.mo63391e();
        }
        if (!(bool2 == null || (b = C24978b.m79846b(bool2)) == null)) {
            str4 = b.mo63391e();
        }
        C40762x A = C12925a.C12926a.m48859a(aVar, str, e, (String) null, l, str2, str3, str4, C24978b.m79846b(Boolean.valueOf(z2)).mo63391e(), 4, (Object) null).mo95062A(new C15360y(new C15329p(this.f43706h)));
        C41536l.m120488h(A, "debitCardsService.getDeb… ).map(mapper::transform)");
        return A;
    }

    /* renamed from: Cc */
    public C40762x mo42392Cc(long j) {
        C40762x A = C19273c.m64722h(this.f43703e.mo33700t3(j)).mo95062A(new C15344i(new C15326m(this)));
        C41536l.m120488h(A, "override fun getCurrenci…sform(currency) } }\n    }");
        return A;
    }

    /* renamed from: D1 */
    public C40762x mo42393D1(String str) {
        C41536l.m120489i(str, "name");
        C40762x A = this.f43703e.mo33682D1(str).mo95062A(new C15305b0(new C15333t(this)));
        C41536l.m120488h(A, "override fun getInstantC…          }\n            }");
        return A;
    }

    /* renamed from: E0 */
    public C40762x mo42394E0() {
        C40762x A = C19273c.m64722h(this.f43703e.mo33684E0()).mo95062A(new C15355t(new C15325l(this.f43706h)));
        C41536l.m120488h(A, "debitCardsService.getCsD…nsformDefaultDepartments)");
        return A;
    }

    /* renamed from: H4 */
    public C27503h mo42395H4(C27503h hVar) {
        C41536l.m120489i(hVar, "<this>");
        return this.f43707i.mo66226a(hVar);
    }

    /* renamed from: Ie */
    public C40762x mo42396Ie(HashMap hashMap) {
        C41536l.m120489i(hashMap, "params");
        C40762x A = C19273c.m64722h(this.f43703e.mo33683D3(hashMap)).mo95062A(new C15306c(C15339z.f43721d));
        C41536l.m120488h(A, "debitCardsService.orderD…ultEntity::toDomainModel)");
        return A;
    }

    /* renamed from: Jd */
    public C40762x mo42397Jd(String str) {
        Long l;
        C41536l.m120489i(str, "addressPointValue");
        C12925a aVar = this.f43703e;
        C37228a a = this.f43704f.mo89562a();
        if (a != null) {
            l = Long.valueOf(a.mo90305b());
        } else {
            l = null;
        }
        return aVar.mo33690J3(String.valueOf(l), str);
    }

    /* renamed from: K1 */
    public C40762x mo42398K1(String str, String str2, String str3) {
        C41536l.m120489i(str, "pan2");
        C41536l.m120489i(str2, "cvv");
        C41536l.m120489i(str3, "expDate");
        C12925a aVar = this.f43703e;
        String b0 = C32359z0.m95559b0(str);
        C41536l.m120488h(b0, "getStringMD5(pan2)");
        C40762x A = aVar.mo33691K1(b0, str2, str3).mo95062A(new C15342g(new C15317d0(this.f43706h)));
        C41536l.m120488h(A, "debitCardsService.valida…  .map(mapper::transform)");
        return A;
    }

    /* renamed from: K4 */
    public void mo42399K4() {
        this.f43707i.mo66227b();
    }

    /* renamed from: N5 */
    public C40749p mo42400N5() {
        C40749p e = C26453c.m82747e(this.f43708j.mo66812m());
        m55744i5(false);
        return e;
    }

    /* renamed from: Nk */
    public C40762x mo42401Nk(HashMap hashMap) {
        C41536l.m120489i(hashMap, "params");
        C40762x A = C19273c.m64722h(this.f43703e.mo33685E3(hashMap)).mo95062A(new C15302a(new C15331r(this)));
        C41536l.m120488h(A, "override fun getDigitalC…ityMapper.transform(it) }");
        return A;
    }

    /* renamed from: O3 */
    public C40762x mo42402O3(String str, String str2, boolean z) {
        C41536l.m120489i(str, "plcType");
        C41536l.m120489i(str2, "plcClass");
        C12925a aVar = this.f43703e;
        String e = C24978b.m79846b(Boolean.valueOf(z)).mo63391e();
        C41536l.m120488h(e, "fromBoolean(isPayroll).value");
        C40762x A = C19273c.m64722h(aVar.mo33702u3(str, str2, e)).mo95062A(new C15343h(new C15314c(this)));
        C41536l.m120488h(A, "override fun getAccounts…apper::transform) }\n    }");
        return A;
    }

    /* renamed from: Pa */
    public C40762x mo42403Pa(String str, String str2) {
        C41536l.m120489i(str, "plcClass");
        C41536l.m120489i(str2, "plcType");
        C40762x A = C19273c.m64722h(this.f43703e.mo33706y3(str, str2)).mo95062A(new C15346k(new C15334u(this)));
        C41536l.m120488h(A, "override fun getPinDeliv…m(deliveryType) } }\n    }");
        return A;
    }

    /* renamed from: Pc */
    public C40762x mo42404Pc(String str, long j) {
        C41536l.m120489i(str, "customerId");
        C40762x A = this.f43703e.mo33686F3(str, String.valueOf(j)).mo95062A(new C15303a0(new C15315c0(this.f43706h)));
        C41536l.m120488h(A, "debitCardsService.valida… ).map(mapper::transform)");
        return A;
    }

    /* renamed from: V0 */
    public C40762x mo42405V0() {
        C40762x A = this.f43703e.mo33692V0().mo95062A(new C15347l(new C15323j(this)));
        C41536l.m120488h(A, "override fun getClientPa….map(mapper::transform) }");
        return A;
    }

    /* renamed from: W1 */
    public C40734b mo42406W1(HashMap hashMap) {
        C41536l.m120489i(hashMap, "params");
        return this.f43703e.mo33693W1(hashMap);
    }

    /* renamed from: Xm */
    public C40762x mo42407Xm() {
        C40762x A = C19273c.m64722h(this.f43703e.mo33703v3()).mo95062A(new C15348m(new C15336w(this)));
        C41536l.m120488h(A, "override fun getRegTypes…nsform(regType) } }\n    }");
        return A;
    }

    /* renamed from: a9 */
    public C40762x mo42408a9(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C41536l.m120489i(str, "customerId");
        C41536l.m120489i(str2, "accRegType");
        C41536l.m120489i(str3, "accountsPackage");
        C41536l.m120489i(str4, "cardClass");
        String str8 = str5;
        C41536l.m120489i(str8, "cardType");
        C40762x A = this.f43703e.mo33679A3(str, "INSTANT_CARD_APPLICATION_FORM", str2, str3, str4, str8, str6, str7).mo95062A(new C15349n(new C15332s(this.f43705g)));
        C41536l.m120488h(A, "debitCardsService.getIns…tEntityMapper::transform)");
        return A;
    }

    /* renamed from: ab */
    public C40762x mo42409ab(String str) {
        Long l;
        C41536l.m120489i(str, "product");
        C12925a aVar = this.f43703e;
        C37228a a = this.f43704f.mo89562a();
        if (a != null) {
            l = Long.valueOf(a.mo90305b());
        } else {
            l = null;
        }
        C40762x D = aVar.mo33687G3(String.valueOf(l), str).mo95062A(new C15357v(C15312b.f43709d)).mo95065D(new C15358w());
        C41536l.m120488h(D, "debitCardsService.checkI… .onErrorReturn { false }");
        return D;
    }

    public void addStore(C27503h hVar) {
        C41536l.m120489i(hVar, "store");
        this.f43707i.addStore(hVar);
    }

    /* renamed from: b0 */
    public C40762x mo42411b0(String str, String str2, String str3, String str4, Long l, String str5, String str6) {
        C41536l.m120489i(str, "customerId");
        String str7 = str2;
        C41536l.m120489i(str2, "pan2");
        C41536l.m120489i(str3, "cvv");
        C41536l.m120489i(str4, "expDate");
        C12925a aVar = this.f43703e;
        String b0 = C32359z0.m95559b0(str2);
        C41536l.m120488h(b0, "getStringMD5(pan2)");
        C40762x m = aVar.mo33694b0(str, b0, str3, str4, l, str5, str6).mo95062A(new C15350o(new C15311a0(this.f43706h))).mo95084m(new C15351p(new C15313b0(this)));
        C41536l.m120488h(m, "override fun registerIns…yInfo(true)\n            }");
        return m;
    }

    public void clean() {
        mo42399K4();
    }

    /* renamed from: g2 */
    public C40762x mo42412g2(String str, String str2, String str3, String str4, String str5, String str6) {
        C41536l.m120489i(str, "customerId");
        C41536l.m120489i(str2, "plcClass");
        C41536l.m120489i(str3, "plcType");
        C41536l.m120489i(str4, "subProductCode");
        C40762x A = this.f43703e.mo33695g2(str, str2, str3, str4, str5, str6).mo95062A(new C15307c0(new C15327n(this.f43706h)));
        C41536l.m120488h(A, "debitCardsService.getDeb… ).map(mapper::transform)");
        return A;
    }

    /* renamed from: ip */
    public C40762x mo42413ip(String str, String str2, C17085g0 g0Var) {
        C41536l.m120489i(str, "cardClass");
        C41536l.m120489i(str2, "cardType");
        C41536l.m120489i(g0Var, "cardForType");
        C40762x A = C19273c.m64722h(this.f43703e.mo33705x3(str, str2, g0Var.mo44353b())).mo95062A(new C15304b(new C15320g(this.f43706h)));
        C41536l.m120488h(A, "debitCardsService.getDel…  .map(mapper::transform)");
        return A;
    }

    /* renamed from: m2 */
    public C40762x mo42414m2(String str, String str2) {
        C41536l.m120489i(str, "customerId");
        C41536l.m120489i(str2, "pointValue");
        return this.f43703e.mo33696m2(str, str2);
    }

    /* renamed from: o4 */
    public C40734b mo42415o4(String str, String str2, String str3, String str4, String str5) {
        Long l;
        C41536l.m120489i(str, "cardDeliveryAddress");
        C41536l.m120489i(str3, "pointValue");
        C12925a aVar = this.f43703e;
        C37228a a = this.f43704f.mo89562a();
        if (a != null) {
            l = Long.valueOf(a.mo90305b());
        } else {
            l = null;
        }
        return aVar.mo33688H3(String.valueOf(l), str, str2, str3, str4, str4, str5);
    }

    /* renamed from: q3 */
    public C40762x mo42416q3() {
        C40762x A = C19273c.m64722h(this.f43703e.mo33697q3()).mo95062A(new C15354s(new C15319f(this.f43706h)));
        C41536l.m120488h(A, "debitCardsService.getCar…().map(mapper::transform)");
        return A;
    }

    /* renamed from: qd */
    public C40762x mo42417qd() {
        C40762x A = this.f43703e.mo33704w3().mo95062A(new C15359x(new C15318e(this.f43706h)));
        C41536l.m120488h(A, "debitCardsService.getCus…ransformApplicationTypes)");
        return A;
    }

    /* renamed from: qp */
    public C40762x mo42418qp(C17075c0 c0Var, String str, String str2) {
        String str3;
        C41536l.m120489i(str, "product");
        C41536l.m120489i(str2, "regType");
        C12925a aVar = this.f43703e;
        if (c0Var == null || (str3 = c0Var.mo44292b()) == null) {
            str3 = C17075c0.PLASTIC.mo44292b();
        }
        C40762x A = aVar.mo33707z3(str3, str2, str).mo95062A(new C15340e(new C15330q(this)));
        C41536l.m120488h(A, "override fun getDigitalC…per.transform(it) }\n    }");
        return A;
    }

    /* renamed from: s3 */
    public C40762x mo42419s3() {
        C40762x A = this.f43703e.mo33698s3().mo95062A(new C15308d(new C15337x(this.f43706h)));
        C41536l.m120488h(A, "debitCardsService.getSch…().map(mapper::transform)");
        return A;
    }

    /* renamed from: t0 */
    public C40762x mo42420t0() {
        C40762x A = C19273c.m64722h(this.f43703e.mo33699t0()).mo95062A(new C15353r(new C15322i(this.f43706h)));
        C41536l.m120488h(A, "debitCardsService.getCar…().map(mapper::transform)");
        return A;
    }

    /* renamed from: u2 */
    public C40762x mo42421u2() {
        C40762x A = C19273c.m64722h(this.f43703e.mo33701u2()).mo95062A(new C15352q(C15316d.f43712d));
        C41536l.m120488h(A, "debitCardsService.getCan…f(it.name).booleanValue }");
        return A;
    }

    /* renamed from: y5 */
    public C40762x mo42422y5() {
        C40762x<BankApiResponse<List<LookupEntity>>> lookup = this.f43702d.lookup(BankApi.COMMON_GET_LOOKUP_DATA, "CARD_APP_CARD_TYPE");
        C41536l.m120488h(lookup, "service.lookup(COMMON_GE…DATA, CARD_APP_CARD_TYPE)");
        C40762x A = C19273c.m64722h(lookup).mo95062A(new C15345j(C15328o.f43715d));
        C41536l.m120488h(A, "service.lookup(COMMON_GE…s.map { it.toLookup() } }");
        return A;
    }

    /* renamed from: zl */
    public C40762x mo42423zl(HashMap hashMap) {
        C41536l.m120489i(hashMap, "params");
        C40762x A = C19273c.m64722h(this.f43703e.mo33680B3(hashMap)).mo95062A(new C15341f(new C15321h(this.f43706h)));
        C41536l.m120488h(A, "debitCardsService.getDeb…  .map(mapper::transform)");
        return A;
    }
}
