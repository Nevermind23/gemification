package p341ge.bog.mobilebank.cleanarch.moneytransfers.data.repository;

import androidx.annotation.Keep;
import ed1.C40749p;
import ed1.C40762x;
import ee1.C40765a;
import he1.C41238w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferAccountItemApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferAccountsAndCurrenciesApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferCurrencyItemApiEntity;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountsAndCurrencies;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.data.entity.MoneyTransferApiEntity;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.data.entity.RemittanceCreditInfoContractApiModel;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.domain.TransferNotFoundException;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.domain.model.RemittanceCreditInfoContract;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import p723bz.C19415a;
import p723bz.C19416b;
import p733cz.C19811a;
import p743dz.C20110a;
import p743dz.C20111b;
import p743dz.C20112c;
import p743dz.C20113d;
import p743dz.C20114e;
import p743dz.C20115f;
import p743dz.C20116g;
import p743dz.C20117h;
import p743dz.C20118i;
import p777gz.C24838a;
import p777gz.C24840c;
import p787hz.C25080a;
import p945xt.C29858a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.data.repository.MoneyTransferRepositoryImpl */
public final class MoneyTransferRepositoryImpl implements C25080a {

    /* renamed from: g */
    public static final C21157a f56835g = new C21157a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C19811a f56836a;

    /* renamed from: b */
    private final IRetrofitService f56837b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C19416b f56838c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C19415a f56839d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C29858a f56840e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C40765a f56841f;

    @Keep
    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.data.repository.MoneyTransferRepositoryImpl$MoneyTransferParams */
    public static final class MoneyTransferParams extends OtpParams {
        private final String amount;
        private final Integer creditInfoStatus;
        private final String destAccount;
        private final String exchangeRate;
        private final String mtSystemName;
        private final String operationId;
        private final String operationReference;
        private final String scaAuthCode;
        private final String senderCountry;
        private final String senderName;
        private final String serviceId;
        private final String transferCurrency;
        private final String transferNumber;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ MoneyTransferParams(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.Integer r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
            /*
                r17 = this;
                r0 = r31
                r1 = r0 & 2048(0x800, float:2.87E-42)
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r15 = r2
                goto L_0x000b
            L_0x0009:
                r15 = r29
            L_0x000b:
                r0 = r0 & 4096(0x1000, float:5.74E-42)
                if (r0 == 0) goto L_0x0012
                r16 = r2
                goto L_0x0014
            L_0x0012:
                r16 = r30
            L_0x0014:
                r3 = r17
                r4 = r18
                r5 = r19
                r6 = r20
                r7 = r21
                r8 = r22
                r9 = r23
                r10 = r24
                r11 = r25
                r12 = r26
                r13 = r27
                r14 = r28
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.moneytransfers.data.repository.MoneyTransferRepositoryImpl.MoneyTransferParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final String getAmount() {
            return this.amount;
        }

        public final Integer getCreditInfoStatus() {
            return this.creditInfoStatus;
        }

        public final String getDestAccount() {
            return this.destAccount;
        }

        public final String getExchangeRate() {
            return this.exchangeRate;
        }

        public final String getMtSystemName() {
            return this.mtSystemName;
        }

        public String getOperationId() {
            return this.operationId;
        }

        public String getOperationReference() {
            return this.operationReference;
        }

        public String getScaAuthCode() {
            return this.scaAuthCode;
        }

        public final String getSenderCountry() {
            return this.senderCountry;
        }

        public final String getSenderName() {
            return this.senderName;
        }

        public String getServiceId() {
            return this.serviceId;
        }

        public final String getTransferCurrency() {
            return this.transferCurrency;
        }

        public final String getTransferNumber() {
            return this.transferNumber;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MoneyTransferParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, String str10, String str11, String str12) {
            super(str9, str11, str12, (String) null, 8, (DefaultConstructorMarker) null);
            String str13 = str;
            String str14 = str2;
            String str15 = str4;
            String str16 = str5;
            String str17 = str6;
            String str18 = str7;
            String str19 = str9;
            C41536l.m120489i(str13, "mtSystemName");
            C41536l.m120489i(str14, "transferNumber");
            C41536l.m120489i(str15, "senderName");
            C41536l.m120489i(str16, "senderCountry");
            C41536l.m120489i(str17, "amount");
            C41536l.m120489i(str18, "destAccount");
            C41536l.m120489i(str19, IRetrofitService.SERVICE_ID);
            this.mtSystemName = str13;
            this.transferNumber = str14;
            this.transferCurrency = str3;
            this.senderName = str15;
            this.senderCountry = str16;
            this.amount = str17;
            this.destAccount = str18;
            this.exchangeRate = str8;
            this.creditInfoStatus = num;
            this.serviceId = str19;
            this.operationId = str10;
            this.operationReference = str11;
            this.scaAuthCode = str12;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.data.repository.MoneyTransferRepositoryImpl$a */
    public static final class C21157a {
        private C21157a() {
        }

        public /* synthetic */ C21157a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.data.repository.MoneyTransferRepositoryImpl$b */
    static final class C21158b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferRepositoryImpl f56842d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21158b(MoneyTransferRepositoryImpl moneyTransferRepositoryImpl) {
            super(1);
            this.f56842d = moneyTransferRepositoryImpl;
        }

        /* renamed from: a */
        public final C24838a invoke(List list) {
            C41536l.m120489i(list, "result");
            MoneyTransferRepositoryImpl moneyTransferRepositoryImpl = this.f56842d;
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(moneyTransferRepositoryImpl.f56839d.mo47648a((MoneyTransferApiEntity) it.next()));
            }
            if (!arrayList.isEmpty()) {
                return (C24838a) arrayList.get(0);
            }
            throw new TransferNotFoundException();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.data.repository.MoneyTransferRepositoryImpl$c */
    static final class C21159c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferRepositoryImpl f56843d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21159c(MoneyTransferRepositoryImpl moneyTransferRepositoryImpl) {
            super(1);
            this.f56843d = moneyTransferRepositoryImpl;
        }

        /* renamed from: a */
        public final C24838a invoke(List list) {
            C41536l.m120489i(list, "result");
            MoneyTransferRepositoryImpl moneyTransferRepositoryImpl = this.f56843d;
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(moneyTransferRepositoryImpl.f56839d.mo47648a((MoneyTransferApiEntity) it.next()));
            }
            if (!arrayList.isEmpty()) {
                return (C24838a) arrayList.get(0);
            }
            throw new TransferNotFoundException();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.data.repository.MoneyTransferRepositoryImpl$d */
    static final class C21160d extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21160d f56844d = new C21160d();

        C21160d() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(List list) {
            C41536l.m120489i(list, "it");
            return Boolean.valueOf(!list.isEmpty());
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.data.repository.MoneyTransferRepositoryImpl$e */
    static final class C21161e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferRepositoryImpl f56845d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21161e(MoneyTransferRepositoryImpl moneyTransferRepositoryImpl) {
            super(1);
            this.f56845d = moneyTransferRepositoryImpl;
        }

        /* renamed from: a */
        public final TransferAccountsAndCurrencies invoke(TransferAccountsAndCurrenciesApiEntity transferAccountsAndCurrenciesApiEntity) {
            C41536l.m120489i(transferAccountsAndCurrenciesApiEntity, "response");
            List<TransferAccountItemApiEntity> accounts = transferAccountsAndCurrenciesApiEntity.getAccounts();
            MoneyTransferRepositoryImpl moneyTransferRepositoryImpl = this.f56845d;
            ArrayList arrayList = new ArrayList(C41343r.m119925u(accounts, 10));
            for (TransferAccountItemApiEntity b : accounts) {
                arrayList.add(moneyTransferRepositoryImpl.f56840e.mo70111b(b));
            }
            List<TransferCurrencyItemApiEntity> currencies = transferAccountsAndCurrenciesApiEntity.getCurrencies();
            MoneyTransferRepositoryImpl moneyTransferRepositoryImpl2 = this.f56845d;
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(currencies, 10));
            for (TransferCurrencyItemApiEntity d : currencies) {
                arrayList2.add(moneyTransferRepositoryImpl2.f56840e.mo70113d(d));
            }
            return new TransferAccountsAndCurrencies(arrayList, arrayList2, transferAccountsAndCurrenciesApiEntity.getConversionDescriptionKey(), transferAccountsAndCurrenciesApiEntity.isRateCampaignActive());
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.data.repository.MoneyTransferRepositoryImpl$f */
    static final class C21162f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferRepositoryImpl f56846d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21162f(MoneyTransferRepositoryImpl moneyTransferRepositoryImpl) {
            super(1);
            this.f56846d = moneyTransferRepositoryImpl;
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "it");
            return this.f56846d.f56838c.mo47649a(list);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.data.repository.MoneyTransferRepositoryImpl$g */
    static final class C21163g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferRepositoryImpl f56847d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21163g(MoneyTransferRepositoryImpl moneyTransferRepositoryImpl) {
            super(1);
            this.f56847d = moneyTransferRepositoryImpl;
        }

        /* renamed from: a */
        public final void mo53043a(List list) {
            this.f56847d.f56841f.onNext(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53043a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.data.repository.MoneyTransferRepositoryImpl$h */
    static final class C21164h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferRepositoryImpl f56848d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21164h(MoneyTransferRepositoryImpl moneyTransferRepositoryImpl) {
            super(1);
            this.f56848d = moneyTransferRepositoryImpl;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f56848d.f56841f.onNext(C41341q.m119907j());
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.data.repository.MoneyTransferRepositoryImpl$i */
    static final class C21165i extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21165i f56849d = new C21165i();

        C21165i() {
            super(1);
        }

        /* renamed from: a */
        public final RemittanceCreditInfoContract invoke(RemittanceCreditInfoContractApiModel remittanceCreditInfoContractApiModel) {
            String str;
            String str2;
            String str3;
            C41536l.m120489i(remittanceCreditInfoContractApiModel, "it");
            boolean d = C41536l.m120484d(remittanceCreditInfoContractApiModel.getShowContract(), "Y");
            String confirmationContractLogo = remittanceCreditInfoContractApiModel.getConfirmationContractLogo();
            if (confirmationContractLogo == null) {
                str = "";
            } else {
                str = confirmationContractLogo;
            }
            String denyContractLogo = remittanceCreditInfoContractApiModel.getDenyContractLogo();
            if (denyContractLogo == null) {
                str2 = "";
            } else {
                str2 = denyContractLogo;
            }
            String confirmationContractText = remittanceCreditInfoContractApiModel.getConfirmationContractText();
            if (confirmationContractText == null) {
                str3 = "";
            } else {
                str3 = confirmationContractText;
            }
            String denyContractText = remittanceCreditInfoContractApiModel.getDenyContractText();
            if (denyContractText == null) {
                denyContractText = "";
            }
            return new RemittanceCreditInfoContract(d, str, str2, str3, denyContractText);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.data.repository.MoneyTransferRepositoryImpl$j */
    static final class C21166j extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21166j f56850d = new C21166j();

        C21166j() {
            super(1);
        }

        /* renamed from: a */
        public final C24840c invoke(HashMap hashMap) {
            C41536l.m120489i(hashMap, "it");
            return new C24840c((String) hashMap.get("convertedAmount"), (String) hashMap.get("rate"), (String) hashMap.get("principalAmount"));
        }
    }

    public MoneyTransferRepositoryImpl(C19811a aVar, IRetrofitService iRetrofitService, C19416b bVar, C19415a aVar2, C29858a aVar3) {
        C41536l.m120489i(aVar, "service");
        C41536l.m120489i(iRetrofitService, "legacyService");
        C41536l.m120489i(bVar, "transferTypeMapper");
        C41536l.m120489i(aVar2, "transferMapper");
        C41536l.m120489i(aVar3, "transferAccountsMapper");
        this.f56836a = aVar;
        this.f56837b = iRetrofitService;
        this.f56838c = bVar;
        this.f56839d = aVar2;
        this.f56840e = aVar3;
        C40765a i1 = C40765a.m118199i1(C41341q.m119907j());
        C41536l.m120488h(i1, "createDefault<List<Money…ansferType>>(emptyList())");
        this.f56841f = i1;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public static final void m68497A(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public static final void m68498B(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public static final RemittanceCreditInfoContract m68499C(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (RemittanceCreditInfoContract) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public static final C24840c m68500D(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C24840c) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static final C24838a m68514v(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C24838a) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static final C24838a m68515w(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C24838a) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static final boolean m68516x(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static final TransferAccountsAndCurrencies m68517y(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (TransferAccountsAndCurrencies) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public static final List m68518z(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40762x mo53021a(String str, String str2, String str3) {
        C41536l.m120489i(str, "systemName");
        C41536l.m120489i(str2, "transferNumber");
        C40762x A = this.f56836a.mo48105a(str, str2, str3).mo95062A(new C20112c(new C21158b(this)));
        C41536l.m120488h(A, "override fun findMoneyTr…    }\n            }\n    }");
        return A;
    }

    /* renamed from: b */
    public C40762x mo53022b(String str) {
        C41536l.m120489i(str, "transferNumber");
        C40762x A = this.f56836a.mo48106b(str).mo95062A(new C20115f(new C21159c(this)));
        C41536l.m120488h(A, "override fun findUnivers…    }\n            }\n    }");
        return A;
    }

    /* renamed from: e */
    public C40749p mo53023e() {
        C40749p M = this.f56841f.mo94990M(new C20114e(C21160d.f56844d));
        C41536l.m120488h(M, "loadedProviders.filter { it.isNotEmpty() }");
        return M;
    }

    /* renamed from: f */
    public C40762x mo53024f(String str, String str2) {
        C41536l.m120489i(str, "mtSystemName");
        C40762x A = this.f56836a.getCreditInfoContract(str, str2).mo95062A(new C20111b(C21165i.f56849d));
        C41536l.m120488h(A, "service.getCreditInfoCon…\"\n            )\n        }");
        return A;
    }

    /* renamed from: g */
    public C40762x mo53025g(HashMap hashMap) {
        C41536l.m120489i(hashMap, "params");
        C40762x<BankApiResponse<HashMap<String, String>>> useOtpForActionSingle = this.f56837b.useOtpForActionSingle(hashMap);
        C41536l.m120488h(useOtpForActionSingle, "legacyService.useOtpForA…         params\n        )");
        C40762x A = C19273c.m64722h(useOtpForActionSingle).mo95062A(new C20110a(C21166j.f56850d));
        C41536l.m120488h(A, "legacyService.useOtpForA…]\n            )\n        }");
        return A;
    }

    /* renamed from: h */
    public C40762x mo53026h(double d, String str, String str2) {
        C41536l.m120489i(str, "ccy");
        C41536l.m120489i(str2, "countryCode");
        C40762x A = C19273c.m64722h(this.f56836a.mo48108d(d, str, str2)).mo95062A(new C20113d(new C21161e(this)));
        C41536l.m120488h(A, "override fun getMoneyTra…    )\n            }\n    }");
        return A;
    }

    /* renamed from: i */
    public C40762x mo53027i() {
        C40762x k = this.f56836a.mo48109e().mo95062A(new C20116g(new C21162f(this))).mo95084m(new C20117h(new C21163g(this))).mo95082k(new C20118i(new C21164h(this)));
        C41536l.m120488h(k, "override fun getMoneyTra…st())\n            }\n    }");
        return k;
    }

    /* renamed from: j */
    public C40762x mo53028j() {
        return C19273c.m64722h(this.f56836a.mo48107c(0, 1));
    }
}
