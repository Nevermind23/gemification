package ub0;

import com.github.mikephil.charting.utils.Utils;
import j31.C36725a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import ny0.C37499a;
import ny0.C37500b;
import ny0.C37501c;
import ny0.C37502d;
import ny0.C37503e;
import ny0.C37505g;
import ny0.C37506h;
import ny0.C37508i;
import ny0.C37510k;
import oy0.C37835a;
import oy0.C37836b;
import oy0.C37837c;
import oy0.C37841g;
import oy0.C37842h;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;
import p341ge.bog.mobilebank.deposits.data.entity.CdsDetailsEntity;
import p341ge.bog.mobilebank.deposits.data.entity.DepositBondEntity;
import p341ge.bog.mobilebank.deposits.data.entity.DepositSavingGoalPurposeEntity;
import p341ge.bog.mobilebank.deposits.data.entity.DepositSavingGoalPurposeWrapperEntity;
import p341ge.bog.mobilebank.deposits.data.entity.DepositsAndBondsEntity;
import p341ge.bog.mobilebank.deposits.data.entity.DepositsAndBondsSummaryEntity;
import p341ge.bog.mobilebank.deposits.data.entity.SavingGoalEntity;
import p341ge.bog.mobilebank.deposits.data.entity.depositbreak.DepositBreakDestinationAccountEntity;
import p341ge.bog.mobilebank.deposits.data.entity.depositbreak.DepositBreakErrorTypeEntity;
import p341ge.bog.mobilebank.deposits.data.entity.depositbreak.DepositBreakInfoEntity;
import p341ge.bog.mobilebank.deposits.data.entity.depositbreak.DepositBreakValidationEntity;
import p341ge.bog.mobilebank.deposits.data.entity.depositbreak.DepositLoanAgreementEntity;
import p341ge.bog.mobilebank.shared.data.ExternalFileEntity;

/* renamed from: ub0.b */
public final class C28698b {

    /* renamed from: a */
    private final SimpleDateFormat f73083a = new SimpleDateFormat("yyyy-MM-dd");

    /* renamed from: ub0.b$a */
    public /* synthetic */ class C28699a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f73084a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f73085b;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0032 */
        static {
            /*
                ge.bog.mobilebank.deposits.data.entity.CollectionTypeEntity[] r0 = p341ge.bog.mobilebank.deposits.data.entity.CollectionTypeEntity.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                ge.bog.mobilebank.deposits.data.entity.CollectionTypeEntity r2 = p341ge.bog.mobilebank.deposits.data.entity.CollectionTypeEntity.DEPOSIT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                ge.bog.mobilebank.deposits.data.entity.CollectionTypeEntity r3 = p341ge.bog.mobilebank.deposits.data.entity.CollectionTypeEntity.BOND     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f73084a = r0
                ge.bog.mobilebank.deposits.data.entity.depositbreak.DepositBreakErrorTypeEntity[] r0 = p341ge.bog.mobilebank.deposits.data.entity.depositbreak.DepositBreakErrorTypeEntity.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ge.bog.mobilebank.deposits.data.entity.depositbreak.DepositBreakErrorTypeEntity r3 = p341ge.bog.mobilebank.deposits.data.entity.depositbreak.DepositBreakErrorTypeEntity.WARNING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                ge.bog.mobilebank.deposits.data.entity.depositbreak.DepositBreakErrorTypeEntity r1 = p341ge.bog.mobilebank.deposits.data.entity.depositbreak.DepositBreakErrorTypeEntity.ERROR     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                ge.bog.mobilebank.deposits.data.entity.depositbreak.DepositBreakErrorTypeEntity r1 = p341ge.bog.mobilebank.deposits.data.entity.depositbreak.DepositBreakErrorTypeEntity.SUCCESS     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                f73085b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ub0.C28698b.C28699a.<clinit>():void");
        }
    }

    /* renamed from: c */
    private final C37502d m87915c(CdsDetailsEntity cdsDetailsEntity) {
        long j;
        long j2;
        Number clientKey = cdsDetailsEntity.getClientKey();
        if (clientKey != null) {
            j = clientKey.longValue();
        } else {
            j = -1;
        }
        Number cdGroupId = cdsDetailsEntity.getCdGroupId();
        if (cdGroupId != null) {
            j2 = cdGroupId.longValue();
        } else {
            j2 = -1;
        }
        return new C37502d(j, j2, cdsDetailsEntity.getAgreeNo());
    }

    /* renamed from: e */
    private final C37505g m87916e(SavingGoalEntity savingGoalEntity, String str) {
        Long l;
        double doubleValue = savingGoalEntity.getAmount().doubleValue();
        double doubleValue2 = savingGoalEntity.getCurrentAmount().doubleValue();
        String sgcKey = savingGoalEntity.getSgcKey();
        double monthlyAmount = savingGoalEntity.getMonthlyAmount();
        Date parse = this.f73083a.parse(savingGoalEntity.getEndDate());
        if (parse != null) {
            l = Long.valueOf(parse.getTime() + TimeUnit.HOURS.toMillis(4));
        } else {
            l = null;
        }
        return new C37505g(doubleValue, doubleValue2, sgcKey, monthlyAmount, l, str, savingGoalEntity.getId(), savingGoalEntity.getSgcId());
    }

    /* renamed from: i */
    private final C37836b m87917i(DepositBreakErrorTypeEntity depositBreakErrorTypeEntity) {
        int i;
        if (depositBreakErrorTypeEntity == null) {
            i = -1;
        } else {
            i = C28699a.f73085b[depositBreakErrorTypeEntity.ordinal()];
        }
        if (i == 1) {
            return C37836b.WARNING;
        }
        if (i == 2) {
            return C37836b.ERROR;
        }
        if (i != 3) {
            return null;
        }
        return C37836b.SUCCESS;
    }

    /* renamed from: m */
    private final List m87918m(List list) {
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m87915c((CdsDetailsEntity) it.next()));
        }
        return arrayList;
    }

    /* renamed from: q */
    private final List m87919q(List list, String str) {
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m87916e((SavingGoalEntity) it.next(), str));
        }
        return arrayList;
    }

    /* renamed from: s */
    private final C37499a m87920s(DepositBondEntity depositBondEntity) {
        long j;
        long j2;
        long j3;
        long j4;
        double d;
        C36725a aVar;
        Double d2;
        Long clientKey = depositBondEntity.getClientKey();
        long j5 = -1;
        if (clientKey != null) {
            j = clientKey.longValue();
        } else {
            j = -1;
        }
        Long cdGroupId = depositBondEntity.getCdGroupId();
        if (cdGroupId != null) {
            j2 = cdGroupId.longValue();
        } else {
            j2 = -1;
        }
        String cdType = depositBondEntity.getCdType();
        Long issueDate = depositBondEntity.getIssueDate();
        if (issueDate != null) {
            j3 = issueDate.longValue();
        } else {
            j3 = -1;
        }
        Long maturityDate = depositBondEntity.getMaturityDate();
        if (maturityDate != null) {
            j4 = maturityDate.longValue();
        } else {
            j4 = -1;
        }
        Number interestRate = depositBondEntity.getInterestRate();
        Number nominalValue = depositBondEntity.getNominalValue();
        String currencyCode = depositBondEntity.getCurrencyCode();
        if (currencyCode == null) {
            currencyCode = "GEL";
        }
        String str = currencyCode;
        String prodType = depositBondEntity.getProdType();
        Number discount = depositBondEntity.getDiscount();
        Number interestAccrued = depositBondEntity.getInterestAccrued();
        double d3 = Utils.DOUBLE_EPSILON;
        if (interestAccrued != null) {
            d = interestAccrued.doubleValue();
        } else {
            d = 0.0d;
        }
        Number marketValue = depositBondEntity.getMarketValue();
        if (marketValue != null) {
            d3 = marketValue.doubleValue();
        }
        double d4 = d3;
        Number principalValueTotal = depositBondEntity.getPrincipalValueTotal();
        Number marketValueBase = depositBondEntity.getMarketValueBase();
        Number cdAmount = depositBondEntity.getCdAmount();
        String issuer = depositBondEntity.getIssuer();
        String dataSource = depositBondEntity.getDataSource();
        String ccy = depositBondEntity.getCcy();
        String dictionaryKey = depositBondEntity.getDictionaryKey();
        String cdTypeDictionaryKey = depositBondEntity.getCdTypeDictionaryKey();
        Long acctKey = depositBondEntity.getAcctKey();
        if (acctKey != null) {
            j5 = acctKey.longValue();
        }
        List<CdsDetailsEntity> cdsDetails = depositBondEntity.getCdsDetails();
        if (cdsDetails == null) {
            cdsDetails = C41341q.m119907j();
        }
        List m = m87918m(cdsDetails);
        String bondPdfUrl = depositBondEntity.getBondPdfUrl();
        ExternalFileEntity externalFile = depositBondEntity.getExternalFile();
        if (externalFile != null) {
            aVar = externalFile.asDomainModel();
        } else {
            aVar = null;
        }
        String interestWithdrawnTotal = depositBondEntity.getInterestWithdrawnTotal();
        if (interestWithdrawnTotal != null) {
            d2 = C40437u.m117096h(interestWithdrawnTotal);
        } else {
            d2 = null;
        }
        return new C37499a(j, j2, cdType, j3, j4, interestRate, nominalValue, str, prodType, discount, d, d4, principalValueTotal, marketValueBase, cdAmount, issuer, dataSource, ccy, dictionaryKey, cdTypeDictionaryKey, Long.valueOf(j5), m, bondPdfUrl, d2, depositBondEntity.getIntWithPeriodTypeKey(), depositBondEntity.getIntWithPeriodTypeValue(), depositBondEntity.getAcctNo(), aVar);
    }

    /* renamed from: t */
    private final C37500b m87921t(DepositBondEntity depositBondEntity) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        double d;
        long j6;
        long j7;
        boolean z;
        boolean z2;
        C36725a aVar;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Long agreeKey = depositBondEntity.getAgreeKey();
        long j8 = -1;
        if (agreeKey != null) {
            j = agreeKey.longValue();
        } else {
            j = -1;
        }
        Long clientKey = depositBondEntity.getClientKey();
        if (clientKey != null) {
            j2 = clientKey.longValue();
        } else {
            j2 = -1;
        }
        Long applicationId = depositBondEntity.getApplicationId();
        Long techAcctKey = depositBondEntity.getTechAcctKey();
        if (techAcctKey != null) {
            j3 = techAcctKey.longValue();
        } else {
            j3 = -1;
        }
        C37506h a = C37506h.f90200e.mo90719a(depositBondEntity.getProdType());
        String name = depositBondEntity.getName();
        String ccy = depositBondEntity.getCcy();
        Long accountKey = depositBondEntity.getAccountKey();
        if (accountKey != null) {
            j4 = accountKey.longValue();
        } else {
            j4 = -1;
        }
        Long mainAccountKey = depositBondEntity.getMainAccountKey();
        if (mainAccountKey != null) {
            j5 = mainAccountKey.longValue();
        } else {
            j5 = -1;
        }
        String acctNo = depositBondEntity.getAcctNo();
        Number currentBalance = depositBondEntity.getCurrentBalance();
        double d2 = Utils.DOUBLE_EPSILON;
        if (currentBalance != null) {
            d = currentBalance.doubleValue();
        } else {
            d = 0.0d;
        }
        Number bcBalance = depositBondEntity.getBcBalance();
        Number availableAmount = depositBondEntity.getAvailableAmount();
        if (availableAmount != null) {
            d2 = availableAmount.doubleValue();
        }
        double d3 = d2;
        String subType = depositBondEntity.getSubType();
        String dictionaryKey = depositBondEntity.getDictionaryKey();
        Long nextWithdrawalDate = depositBondEntity.getNextWithdrawalDate();
        if (nextWithdrawalDate != null) {
            j6 = nextWithdrawalDate.longValue();
        } else {
            j6 = -1;
        }
        Number minAccrualBalance = depositBondEntity.getMinAccrualBalance();
        List<String> productFunctions = depositBondEntity.getProductFunctions();
        if (productFunctions == null) {
            productFunctions = C41341q.m119907j();
        }
        List<String> list = productFunctions;
        String depositPdfUrl = depositBondEntity.getDepositPdfUrl();
        String attachmentUrl = depositBondEntity.getAttachmentUrl();
        Long productId = depositBondEntity.getProductId();
        if (productId != null) {
            j7 = productId.longValue();
        } else {
            j7 = -1;
        }
        Long pfmAcctId = depositBondEntity.getPfmAcctId();
        if (pfmAcctId != null) {
            j8 = pfmAcctId.longValue();
        }
        YesNoApiEntity isBreakable = depositBondEntity.isBreakable();
        YesNoApiEntity yesNoApiEntity = YesNoApiEntity.YES;
        if (isBreakable == yesNoApiEntity) {
            z = true;
        } else {
            z = false;
        }
        List<SavingGoalEntity> savingGoals = depositBondEntity.getSavingGoals();
        if (savingGoals == null) {
            savingGoals = C41341q.m119907j();
        }
        String str = ccy;
        List q = m87919q(savingGoals, depositBondEntity.getCcy());
        Long maturityDate = depositBondEntity.getMaturityDate();
        Long startDate = depositBondEntity.getStartDate();
        Number intAccrued = depositBondEntity.getIntAccrued();
        Long closeDate = depositBondEntity.getCloseDate();
        String depositType = depositBondEntity.getDepositType();
        String agreeNo = depositBondEntity.getAgreeNo();
        Number interestRate = depositBondEntity.getInterestRate();
        Number totalBalance = depositBondEntity.getTotalBalance();
        Number casAmount = depositBondEntity.getCasAmount();
        if (depositBondEntity.getShowCasAmount() == yesNoApiEntity) {
            z2 = true;
        } else {
            z2 = false;
        }
        String agrPurpose = depositBondEntity.getAgrPurpose();
        String purposeDictionaryKey = depositBondEntity.getPurposeDictionaryKey();
        Long agrPurposeId = depositBondEntity.getAgrPurposeId();
        String periodTypeNameDctKey = depositBondEntity.getPeriodTypeNameDctKey();
        Number pfmAcctBalance = depositBondEntity.getPfmAcctBalance();
        ExternalFileEntity externalFile = depositBondEntity.getExternalFile();
        Double d4 = null;
        if (externalFile != null) {
            aVar = externalFile.asDomainModel();
        } else {
            aVar = null;
        }
        if (depositBondEntity.getStoExists() == yesNoApiEntity) {
            z3 = true;
        } else {
            z3 = false;
        }
        String interestWithdrawnTotal = depositBondEntity.getInterestWithdrawnTotal();
        if (interestWithdrawnTotal != null) {
            d4 = C40437u.m117096h(interestWithdrawnTotal);
        }
        Double d5 = d4;
        String firstName = depositBondEntity.getFirstName();
        String lastName = depositBondEntity.getLastName();
        if (depositBondEntity.getProlongable() == yesNoApiEntity) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (depositBondEntity.getHasClientProlAgreement() == yesNoApiEntity) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (depositBondEntity.isProlongAllowed() == yesNoApiEntity) {
            z6 = true;
        } else {
            z6 = false;
        }
        return new C37500b(j, j2, applicationId, j3, a, name, str, j4, j5, acctNo, d, bcBalance, d3, subType, dictionaryKey, j6, minAccrualBalance, list, depositPdfUrl, attachmentUrl, j7, Long.valueOf(j8), z, q, maturityDate, startDate, intAccrued, closeDate, depositType, agreeNo, interestRate, totalBalance, casAmount, z2, agrPurpose, purposeDictionaryKey, agrPurposeId, periodTypeNameDctKey, pfmAcctBalance, z3, d5, firstName, lastName, aVar, z4, z5, z6);
    }

    /* renamed from: a */
    public final List mo68423a(DepositSavingGoalPurposeWrapperEntity depositSavingGoalPurposeWrapperEntity) {
        C41536l.m120489i(depositSavingGoalPurposeWrapperEntity, "wrapper");
        List<DepositSavingGoalPurposeEntity> purposes = depositSavingGoalPurposeWrapperEntity.getPurposes();
        if (purposes == null) {
            return C41341q.m119907j();
        }
        ArrayList arrayList = new ArrayList(C41343r.m119925u(purposes, 10));
        for (DepositSavingGoalPurposeEntity g : purposes) {
            arrayList.add(mo68427g(g));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final C37501c mo68424b(DepositBondEntity depositBondEntity) {
        C41536l.m120489i(depositBondEntity, "entity");
        int i = C28699a.f73084a[depositBondEntity.getCollectionType().ordinal()];
        if (i == 1) {
            return m87921t(depositBondEntity);
        }
        if (i == 2) {
            return m87920s(depositBondEntity);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: d */
    public final C37503e mo68425d(DepositsAndBondsSummaryEntity depositsAndBondsSummaryEntity) {
        double d;
        C41536l.m120489i(depositsAndBondsSummaryEntity, "entity");
        Number amount = depositsAndBondsSummaryEntity.getAmount();
        if (amount != null) {
            d = amount.doubleValue();
        } else {
            d = Utils.DOUBLE_EPSILON;
        }
        String currency = depositsAndBondsSummaryEntity.getCurrency();
        if (currency == null) {
            currency = "GEL";
        }
        return new C37503e(d, currency);
    }

    /* renamed from: f */
    public final C37508i mo68426f(DepositsAndBondsEntity depositsAndBondsEntity) {
        C41536l.m120489i(depositsAndBondsEntity, "entity");
        C37503e d = mo68425d(depositsAndBondsEntity.getSummary());
        List<DepositsAndBondsSummaryEntity> amountSums = depositsAndBondsEntity.getAmountSums();
        if (amountSums == null) {
            amountSums = C41341q.m119907j();
        }
        List r = mo68435r(amountSums);
        C37503e d2 = mo68425d(depositsAndBondsEntity.getDeposits().getSummary());
        List<DepositBondEntity> deposits = depositsAndBondsEntity.getDeposits().getDeposits();
        if (deposits == null) {
            deposits = C41341q.m119907j();
        }
        return new C37508i(d, r, d2, mo68434p(deposits));
    }

    /* renamed from: g */
    public final C37510k mo68427g(DepositSavingGoalPurposeEntity depositSavingGoalPurposeEntity) {
        C41536l.m120489i(depositSavingGoalPurposeEntity, "entity");
        return new C37510k(depositSavingGoalPurposeEntity.getIconUrl(), depositSavingGoalPurposeEntity.getSavingGoalId(), depositSavingGoalPurposeEntity.getId(), depositSavingGoalPurposeEntity.getLookupName(), depositSavingGoalPurposeEntity.getLookupValue(), depositSavingGoalPurposeEntity.getDictionaryKeyId(), depositSavingGoalPurposeEntity.getDictionaryKey(), depositSavingGoalPurposeEntity.getDictionaryValue(), depositSavingGoalPurposeEntity.getDictionaryValueEn());
    }

    /* renamed from: h */
    public final C37835a mo68428h(DepositBreakDestinationAccountEntity depositBreakDestinationAccountEntity) {
        C41536l.m120489i(depositBreakDestinationAccountEntity, "entity");
        return new C37835a(depositBreakDestinationAccountEntity.getClientKey(), depositBreakDestinationAccountEntity.getAcctKey(), depositBreakDestinationAccountEntity.getCcy(), depositBreakDestinationAccountEntity.getAcctNo(), depositBreakDestinationAccountEntity.getAcctDesc());
    }

    /* renamed from: j */
    public final C37837c mo68429j(DepositBreakInfoEntity depositBreakInfoEntity) {
        C41536l.m120489i(depositBreakInfoEntity, "entity");
        return new C37837c(depositBreakInfoEntity.getBreakInterest(), depositBreakInfoEntity.getBreakAmount(), mo68432n(depositBreakInfoEntity.getBreakDestinationAccounts()));
    }

    /* renamed from: k */
    public final C37841g mo68430k(DepositBreakValidationEntity depositBreakValidationEntity) {
        C41536l.m120489i(depositBreakValidationEntity, "entity");
        return new C37841g(m87917i(depositBreakValidationEntity.getErrorType()), depositBreakValidationEntity.getKey());
    }

    /* renamed from: l */
    public final C37842h mo68431l(DepositLoanAgreementEntity depositLoanAgreementEntity) {
        C41536l.m120489i(depositLoanAgreementEntity, "entity");
        return new C37842h(depositLoanAgreementEntity.getAgreeKey(), depositLoanAgreementEntity.getProdType(), depositLoanAgreementEntity.getClientKeyMain(), depositLoanAgreementEntity.getAgreeNo(), depositLoanAgreementEntity.getCcy(), depositLoanAgreementEntity.getAgreeRate(), depositLoanAgreementEntity.getAgreeBalance(), depositLoanAgreementEntity.getRealAmount(), depositLoanAgreementEntity.getAvailableAmount(), depositLoanAgreementEntity.getProvAmount(), depositLoanAgreementEntity.getName(), depositLoanAgreementEntity.getIntAccrued(), depositLoanAgreementEntity.getDictionaryKey());
    }

    /* renamed from: n */
    public final List mo68432n(List list) {
        C41536l.m120489i(list, "list");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo68428h((DepositBreakDestinationAccountEntity) it.next()));
        }
        return arrayList;
    }

    /* renamed from: o */
    public final List mo68433o(List list) {
        C41536l.m120489i(list, "list");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo68431l((DepositLoanAgreementEntity) it.next()));
        }
        return arrayList;
    }

    /* renamed from: p */
    public final List mo68434p(List list) {
        C41536l.m120489i(list, "entities");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo68424b((DepositBondEntity) it.next()));
        }
        return arrayList;
    }

    /* renamed from: r */
    public final List mo68435r(List list) {
        C41536l.m120489i(list, "entities");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo68425d((DepositsAndBondsSummaryEntity) it.next()));
        }
        return arrayList;
    }
}
