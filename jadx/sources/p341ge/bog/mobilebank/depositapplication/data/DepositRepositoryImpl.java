package p341ge.bog.mobilebank.depositapplication.data;

import androidx.annotation.Keep;
import com.google.gson.Gson;
import ea0.C20186a;
import ea0.C20187b;
import ea0.C20188c;
import ea0.C20189d;
import ea0.C20190e;
import ea0.C20191f;
import ea0.C20192g;
import ea0.C20193h;
import ed1.C40762x;
import fa0.C20456a;
import ga0.C20787a;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ka0.C25698g;
import ka0.C25699h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import la0.C25865a;
import ld0.C25950a;
import m00.C26116a;
import p341ge.bog.mobilebank.cleanarch.precontract.data.entity.PreContractEntity;
import p341ge.bog.mobilebank.depositapplication.data.entity.InterestRateEntity;
import p341ge.bog.mobilebank.depositapplication.data.entity.OpenDepositEntity;
import p341ge.bog.mobilebank.depositapplication.data.entity.PurposeEntity;
import p341ge.bog.mobilebank.depositapplication.data.entity.WithdrawalTypeEntity;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.depositapplication.data.DepositRepositoryImpl */
public final class DepositRepositoryImpl implements C25865a {

    /* renamed from: a */
    private final IRetrofitService f60086a;

    /* renamed from: b */
    private final C20456a f60087b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C20787a f60088c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C26116a f60089d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Gson f60090e;

    @Keep
    /* renamed from: ge.bog.mobilebank.depositapplication.data.DepositRepositoryImpl$DepositApplicationParamsObject */
    public static final class DepositApplicationParamsObject extends OtpParams {
        private final String UTMCampaign;
        private final String UTMMedium;
        private final String UTMSource;
        private final Long acctKeys;
        private final String acctNo;
        private final String amount;
        private final BigDecimal casAmount;
        private final String casCcy;
        private final String ccy;
        private final String depositName;
        private final String docType;
        private final String documentName;
        private final Long endDate;
        private final String intWithPeriodType;
        private final String minInstallment;
        private final String openCAS;
        private final String openSTO;
        private final String operationId;
        private final String operationReference;
        private final String periodType;
        private final String preContractText;
        private final String prodType;
        private final String purpose;
        private final String scaAuthCode;
        private final String serviceId;
        private final long srcAcctKey;
        private final BigDecimal stoAmount;
        private final String stoCcy;
        private final String stoEndDate;
        private final String stoSrcAcctCcy;
        private final Long stoSrcAcctKey;
        private final Long stoStartDate;
        private final String termDocumentId;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ DepositApplicationParamsObject(String str, String str2, String str3, String str4, String str5, String str6, Long l, String str7, long j, String str8, String str9, String str10, String str11, String str12, Long l2, BigDecimal bigDecimal, String str13, String str14, String str15, String str16, Long l3, BigDecimal bigDecimal2, String str17, Long l4, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, str6, l, str7, j, str8, str9, str10, str11, str12, l2, bigDecimal, str13, str14, str15, str16, l3, bigDecimal2, str17, l4, str18, str19, (i & 67108864) != 0 ? "" : str20, (i & 134217728) != 0 ? "" : str21, (i & 268435456) != 0 ? "" : str22, str23, (i & 1073741824) != 0 ? null : str24, (i & Integer.MIN_VALUE) != 0 ? null : str25, (i2 & 1) != 0 ? null : str26);
        }

        public final Long getAcctKeys() {
            return this.acctKeys;
        }

        public final String getAcctNo() {
            return this.acctNo;
        }

        public final String getAmount() {
            return this.amount;
        }

        public final BigDecimal getCasAmount() {
            return this.casAmount;
        }

        public final String getCasCcy() {
            return this.casCcy;
        }

        public final String getCcy() {
            return this.ccy;
        }

        public final String getDepositName() {
            return this.depositName;
        }

        public final String getDocType() {
            return this.docType;
        }

        public final String getDocumentName() {
            return this.documentName;
        }

        public final Long getEndDate() {
            return this.endDate;
        }

        public final String getIntWithPeriodType() {
            return this.intWithPeriodType;
        }

        public final String getMinInstallment() {
            return this.minInstallment;
        }

        public final String getOpenCAS() {
            return this.openCAS;
        }

        public final String getOpenSTO() {
            return this.openSTO;
        }

        public String getOperationId() {
            return this.operationId;
        }

        public String getOperationReference() {
            return this.operationReference;
        }

        public final String getPeriodType() {
            return this.periodType;
        }

        public final String getPreContractText() {
            return this.preContractText;
        }

        public final String getProdType() {
            return this.prodType;
        }

        public final String getPurpose() {
            return this.purpose;
        }

        public String getScaAuthCode() {
            return this.scaAuthCode;
        }

        public String getServiceId() {
            return this.serviceId;
        }

        public final long getSrcAcctKey() {
            return this.srcAcctKey;
        }

        public final BigDecimal getStoAmount() {
            return this.stoAmount;
        }

        public final String getStoCcy() {
            return this.stoCcy;
        }

        public final String getStoEndDate() {
            return this.stoEndDate;
        }

        public final String getStoSrcAcctCcy() {
            return this.stoSrcAcctCcy;
        }

        public final Long getStoSrcAcctKey() {
            return this.stoSrcAcctKey;
        }

        public final Long getStoStartDate() {
            return this.stoStartDate;
        }

        public final String getTermDocumentId() {
            return this.termDocumentId;
        }

        public final String getUTMCampaign() {
            return this.UTMCampaign;
        }

        public final String getUTMMedium() {
            return this.UTMMedium;
        }

        public final String getUTMSource() {
            return this.UTMSource;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DepositApplicationParamsObject(String str, String str2, String str3, String str4, String str5, String str6, Long l, String str7, long j, String str8, String str9, String str10, String str11, String str12, Long l2, BigDecimal bigDecimal, String str13, String str14, String str15, String str16, Long l3, BigDecimal bigDecimal2, String str17, Long l4, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26) {
            super(str23, str25, str26, (String) null, 8, (DefaultConstructorMarker) null);
            String str27 = str;
            String str28 = str2;
            String str29 = str3;
            String str30 = str4;
            String str31 = str5;
            String str32 = str6;
            String str33 = str7;
            String str34 = str12;
            C41536l.m120489i(str27, "prodType");
            C41536l.m120489i(str28, "minInstallment");
            C41536l.m120489i(str29, "depositName");
            C41536l.m120489i(str30, "purpose");
            C41536l.m120489i(str31, "amount");
            C41536l.m120489i(str32, "ccy");
            C41536l.m120489i(str33, "intWithPeriodType");
            C41536l.m120489i(str34, "openCAS");
            C41536l.m120489i(str14, "openSTO");
            C41536l.m120489i(str20, "stoEndDate");
            C41536l.m120489i(str21, "termDocumentId");
            C41536l.m120489i(str22, "documentName");
            C41536l.m120489i(str23, IRetrofitService.SERVICE_ID);
            this.prodType = str27;
            this.minInstallment = str28;
            this.depositName = str29;
            this.purpose = str30;
            this.amount = str31;
            this.ccy = str32;
            this.endDate = l;
            this.intWithPeriodType = str33;
            this.srcAcctKey = j;
            this.UTMMedium = str8;
            this.UTMSource = str9;
            this.UTMCampaign = str10;
            this.preContractText = str11;
            this.openCAS = str34;
            this.acctKeys = l2;
            this.casAmount = bigDecimal;
            this.casCcy = str13;
            this.openSTO = str14;
            this.docType = str15;
            this.acctNo = str16;
            this.stoSrcAcctKey = l3;
            this.stoAmount = bigDecimal2;
            this.stoCcy = str17;
            this.stoStartDate = l4;
            this.periodType = str18;
            this.stoSrcAcctCcy = str19;
            this.stoEndDate = str20;
            this.termDocumentId = str21;
            this.documentName = str22;
            this.serviceId = str23;
            this.operationId = str24;
            this.operationReference = str25;
            this.scaAuthCode = str26;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.data.DepositRepositoryImpl$a */
    static final class C22786a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositRepositoryImpl f60091d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22786a(DepositRepositoryImpl depositRepositoryImpl) {
            super(1);
            this.f60091d = depositRepositoryImpl;
        }

        /* renamed from: a */
        public final OpenDepositEntity invoke(BankApiResponse bankApiResponse) {
            C41536l.m120489i(bankApiResponse, "result");
            return (OpenDepositEntity) this.f60091d.f60090e.mo18170l(this.f60091d.f60090e.mo18181w(bankApiResponse.getResult()), OpenDepositEntity.class);
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.data.DepositRepositoryImpl$b */
    /* synthetic */ class C22787b extends C41535k implements C43075l {
        C22787b(Object obj) {
            super(1, obj, C20787a.class, "transform", "transform(Lge/bog/mobilebank/depositapplication/data/entity/OpenDepositEntity;)Lge/bog/mobilebank/depositapplication/domain/model/OpenDeposit;", 0);
        }

        /* renamed from: b */
        public final C25699h invoke(OpenDepositEntity openDepositEntity) {
            C41536l.m120489i(openDepositEntity, "p0");
            return ((C20787a) this.receiver).mo49375i(openDepositEntity);
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.data.DepositRepositoryImpl$c */
    static final class C22788c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositRepositoryImpl f60092d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22788c(DepositRepositoryImpl depositRepositoryImpl) {
            super(1);
            this.f60092d = depositRepositoryImpl;
        }

        /* renamed from: a */
        public final C25698g invoke(InterestRateEntity interestRateEntity) {
            C41536l.m120489i(interestRateEntity, "it");
            return this.f60092d.f60088c.mo49374h(interestRateEntity);
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.data.DepositRepositoryImpl$d */
    static final class C22789d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositRepositoryImpl f60093d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22789d(DepositRepositoryImpl depositRepositoryImpl) {
            super(1);
            this.f60093d = depositRepositoryImpl;
        }

        /* renamed from: a */
        public final C25698g invoke(InterestRateEntity interestRateEntity) {
            C41536l.m120489i(interestRateEntity, "it");
            return this.f60093d.f60088c.mo49374h(interestRateEntity);
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.data.DepositRepositoryImpl$e */
    static final class C22790e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositRepositoryImpl f60094d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22790e(DepositRepositoryImpl depositRepositoryImpl) {
            super(1);
            this.f60094d = depositRepositoryImpl;
        }

        /* renamed from: a */
        public final C25950a invoke(PreContractEntity preContractEntity) {
            C41536l.m120489i(preContractEntity, "it");
            return this.f60094d.f60089d.mo65027a(preContractEntity);
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.data.DepositRepositoryImpl$f */
    static final class C22791f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositRepositoryImpl f60095d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22791f(DepositRepositoryImpl depositRepositoryImpl) {
            super(1);
            this.f60095d = depositRepositoryImpl;
        }

        /* renamed from: a */
        public final List invoke(PurposeEntity purposeEntity) {
            C41536l.m120489i(purposeEntity, "it");
            return this.f60095d.f60088c.mo49369a(purposeEntity);
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.data.DepositRepositoryImpl$g */
    /* synthetic */ class C22792g extends C41535k implements C43075l {
        C22792g(Object obj) {
            super(1, obj, C20787a.class, "transform", "transform(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C20787a) this.receiver).mo49370b(list);
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.data.DepositRepositoryImpl$h */
    static final class C22793h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositRepositoryImpl f60096d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22793h(DepositRepositoryImpl depositRepositoryImpl) {
            super(1);
            this.f60096d = depositRepositoryImpl;
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "periodTypes");
            C20787a r = this.f60096d.f60088c;
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(r.mo49376k((WithdrawalTypeEntity) it.next()));
            }
            return arrayList;
        }
    }

    public DepositRepositoryImpl(IRetrofitService iRetrofitService, C20456a aVar, C20787a aVar2, C26116a aVar3, Gson gson) {
        C41536l.m120489i(iRetrofitService, "retrofitService");
        C41536l.m120489i(aVar, "appService");
        C41536l.m120489i(aVar2, "mapper");
        C41536l.m120489i(aVar3, "preContractMapper");
        C41536l.m120489i(gson, "gson");
        this.f60086a = iRetrofitService;
        this.f60087b = aVar;
        this.f60088c = aVar2;
        this.f60089d = aVar3;
        this.f60090e = gson;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public static final List m73904A(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static final OpenDepositEntity m73916t(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (OpenDepositEntity) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static final C25699h m73917u(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C25699h) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static final C25698g m73918v(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C25698g) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static final C25698g m73919w(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C25698g) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static final C25950a m73920x(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C25950a) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static final List m73921y(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public static final List m73922z(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40762x mo56595a() {
        C40762x A = this.f60087b.mo48975a().mo95062A(new C20193h(new C22792g(this.f60088c)));
        C41536l.m120488h(A, "appService.getDepositTyp…  .map(mapper::transform)");
        return A;
    }

    /* renamed from: b */
    public C40762x mo56596b(String str, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(str, "prodType");
        C41536l.m120489i(str2, "amount");
        C41536l.m120489i(str3, "ccy");
        C41536l.m120489i(str4, "depositTerm");
        C41536l.m120489i(str5, "intWithPeriodType");
        C40762x A = this.f60087b.mo48976b(str, str2, str3, str5, str4).mo95062A(new C20192g(new C22788c(this)));
        C41536l.m120488h(A, "override fun getDepositI…per.transform(it) }\n    }");
        return A;
    }

    /* renamed from: c */
    public C40762x mo56597c(String str, String str2, String str3, String str4, String str5, String str6) {
        C41536l.m120489i(str, "prodType");
        C41536l.m120489i(str2, "amount");
        C41536l.m120489i(str3, "ccy");
        C41536l.m120489i(str4, "depositTerm");
        C41536l.m120489i(str5, "endDate");
        C41536l.m120489i(str6, "intWithPeriodType");
        C40762x A = this.f60087b.mo48977c(str, str2, str3, str6, str4, str5).mo95062A(new C20191f(new C22789d(this)));
        C41536l.m120488h(A, "override fun getDepositI…per.transform(it) }\n    }");
        return A;
    }

    /* renamed from: d */
    public C40762x mo56598d(String str) {
        C41536l.m120489i(str, "prodType");
        C40762x A = this.f60087b.mo48978d(str).mo95062A(new C20189d(new C22791f(this)));
        C41536l.m120488h(A, "override fun getDepositP…per.transform(it) }\n    }");
        return A;
    }

    /* renamed from: e */
    public C40762x mo56599e(String str) {
        C41536l.m120489i(str, "prodType");
        return this.f60087b.mo48979e(str);
    }

    /* renamed from: f */
    public C40762x mo56600f(HashMap hashMap) {
        C41536l.m120489i(hashMap, "params");
        C40762x A = this.f60086a.useOtpForActionSinglePost(hashMap).mo95062A(new C20186a(new C22786a(this))).mo95062A(new C20187b(new C22787b(this.f60088c)));
        C41536l.m120488h(A, "override fun createNewDe…(mapper::transform)\n    }");
        return A;
    }

    /* renamed from: g */
    public C40762x mo56601g(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "prodType");
        C41536l.m120489i(str2, "minInstallment");
        C41536l.m120489i(str3, "ccy");
        C40762x A = this.f60087b.mo48980f(str, str2, str3, str4).mo95062A(new C20190e(new C22793h(this)));
        C41536l.m120488h(A, "override fun getDepositW…apper::transform) }\n    }");
        return A;
    }

    /* renamed from: h */
    public C40762x mo56602h(String str, String str2, String str3, String str4, String str5, long j, Long l, String str6, String str7, String str8, String str9, double d, Double d2, double d3, String str10, String str11) {
        C41536l.m120489i(str, "depositName");
        C41536l.m120489i(str2, "purpose");
        C41536l.m120489i(str3, "amount");
        C41536l.m120489i(str4, "ccy");
        C41536l.m120489i(str6, "withdrawalType");
        C41536l.m120489i(str7, "withdrawalTypeKey");
        C41536l.m120489i(str8, "depositAccountNo");
        C41536l.m120489i(str9, "availableAmount");
        C41536l.m120489i(str10, "depositType");
        C41536l.m120489i(str11, "prodType");
        C40762x A = this.f60087b.mo48981g(str, str2, str3, str4, str5, Long.valueOf(j), l, str6, str7, str8, str9, Double.valueOf(d), d2, Double.valueOf(d3), str10, str11).mo95062A(new C20188c(new C22790e(this)));
        C41536l.m120488h(A, "override fun getDepositP…per.transform(it) }\n    }");
        return A;
    }
}
