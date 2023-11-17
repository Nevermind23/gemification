package p865py;

import com.google.gson.Gson;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p316xa.C8982a;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.BonusAccountEntity;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.BonusAmexEntity;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.BonusCasServiceEntity;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.BonusCashbackEntity;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.BonusDepositAccountEntity;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.BonusPlusEntity;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.BonusScoolEntity;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.BonusWrapperEntity;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.CasTotalEntity;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.prlo.BonusPrloEntity;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.prlo.PrloTicketEntity;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.prlo.PrloTicketWrapperEntity;
import p906ty.C28523a;
import p906ty.C28524b;
import p906ty.C28525c;
import p906ty.C28526d;
import p906ty.C28527e;
import p906ty.C28528f;
import p906ty.C28529g;
import p906ty.C28530h;
import p906ty.C28531i;
import p917uy.C28951a;
import p917uy.C28952b;
import p917uy.C28953c;

/* renamed from: py.a */
public final class C27640a {

    /* renamed from: a */
    private final Gson f70723a;

    /* renamed from: py.a$a */
    public static final class C27641a extends C8982a<List<? extends BonusCashbackEntity>> {
        C27641a() {
        }
    }

    public C27640a(Gson gson) {
        C41536l.m120489i(gson, "gson");
        this.f70723a = gson;
    }

    /* renamed from: a */
    public final List mo67177a(BonusWrapperEntity bonusWrapperEntity) {
        C41536l.m120489i(bonusWrapperEntity, "bonusWrapperEntity");
        try {
            return (List) this.f70723a.mo18166h(bonusWrapperEntity.getCashBack(), new C27641a().getType());
        } catch (Exception unused) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f70723a.mo18165g(bonusWrapperEntity.getCashBack(), BonusCashbackEntity.class));
            return arrayList;
        }
    }

    /* renamed from: b */
    public final List mo67178b(List list) {
        C41536l.m120489i(list, "account");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo67179c((BonusAccountEntity) it.next()));
        }
        return arrayList;
    }

    /* renamed from: c */
    public final C28523a mo67179c(BonusAccountEntity bonusAccountEntity) {
        Double d;
        C41536l.m120489i(bonusAccountEntity, "bonusAccountEntity");
        Long valueOf = Long.valueOf(bonusAccountEntity.getAcctKey());
        String acctName = bonusAccountEntity.getAcctName();
        BigDecimal availableAmount = bonusAccountEntity.getAvailableAmount();
        if (availableAmount != null) {
            d = Double.valueOf(availableAmount.doubleValue());
        } else {
            d = null;
        }
        return new C28523a(valueOf, acctName, d, bonusAccountEntity.getCcy(), bonusAccountEntity.getAcctNo());
    }

    /* renamed from: d */
    public final C28524b mo67180d(BonusAmexEntity bonusAmexEntity) {
        Double d;
        Double d2;
        Double d3;
        C41536l.m120489i(bonusAmexEntity, "bonusAmexEntity");
        Long regDate = bonusAmexEntity.getRegDate();
        BigDecimal collected = bonusAmexEntity.getCollected();
        if (collected != null) {
            d = Double.valueOf(collected.doubleValue());
        } else {
            d = null;
        }
        BigDecimal spent = bonusAmexEntity.getSpent();
        if (spent != null) {
            d2 = Double.valueOf(spent.doubleValue());
        } else {
            d2 = null;
        }
        BigDecimal available = bonusAmexEntity.getAvailable();
        if (available != null) {
            d3 = Double.valueOf(available.doubleValue());
        } else {
            d3 = null;
        }
        return new C28524b(regDate, d, d2, d3, Integer.valueOf(bonusAmexEntity.getPrizeCount()), bonusAmexEntity.getAmountInGel());
    }

    /* renamed from: e */
    public final C28525c mo67181e(BonusCasServiceEntity bonusCasServiceEntity) {
        Double d;
        Double d2;
        Double d3;
        ArrayList arrayList;
        ArrayList arrayList2;
        Double d4;
        C41536l.m120489i(bonusCasServiceEntity, "bonusCasServiceEntity");
        Long valueOf = Long.valueOf(bonusCasServiceEntity.getClientServiceId());
        Long valueOf2 = Long.valueOf(bonusCasServiceEntity.getClientKey());
        String scheme = bonusCasServiceEntity.getScheme();
        Long valueOf3 = Long.valueOf(bonusCasServiceEntity.getSchemeTariffId());
        BigDecimal schemeTariffValue = bonusCasServiceEntity.getSchemeTariffValue();
        if (schemeTariffValue != null) {
            d = Double.valueOf(schemeTariffValue.doubleValue());
        } else {
            d = null;
        }
        String schemeTariffCcy = bonusCasServiceEntity.getSchemeTariffCcy();
        Long valueOf4 = Long.valueOf(bonusCasServiceEntity.getAgreeKey());
        String agreeType = bonusCasServiceEntity.getAgreeType();
        String status = bonusCasServiceEntity.getStatus();
        String name = bonusCasServiceEntity.getName();
        String agreeNo = bonusCasServiceEntity.getAgreeNo();
        String prodType = bonusCasServiceEntity.getProdType();
        String agreeCcy = bonusCasServiceEntity.getAgreeCcy();
        BigDecimal totalAmount = bonusCasServiceEntity.getTotalAmount();
        if (totalAmount != null) {
            d2 = Double.valueOf(totalAmount.doubleValue());
        } else {
            d2 = null;
        }
        BigDecimal agreeBalance = bonusCasServiceEntity.getAgreeBalance();
        if (agreeBalance != null) {
            d3 = Double.valueOf(agreeBalance.doubleValue());
        } else {
            d3 = null;
        }
        String agreeTypeDictionaryKey = bonusCasServiceEntity.getAgreeTypeDictionaryKey();
        ArrayList<BonusAccountEntity> accounts = bonusCasServiceEntity.getAccounts();
        if (accounts != null) {
            ArrayList arrayList3 = new ArrayList(C41343r.m119925u(accounts, 10));
            for (BonusAccountEntity c : accounts) {
                arrayList3.add(mo67179c(c));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        ArrayList<BonusDepositAccountEntity> depositAccounts = bonusCasServiceEntity.getDepositAccounts();
        if (depositAccounts != null) {
            ArrayList arrayList4 = new ArrayList(C41343r.m119925u(depositAccounts, 10));
            for (BonusDepositAccountEntity g : depositAccounts) {
                arrayList4.add(mo67183g(g));
            }
            arrayList2 = arrayList4;
        } else {
            arrayList2 = null;
        }
        BigDecimal currentMonthTotalAmount = bonusCasServiceEntity.getCurrentMonthTotalAmount();
        if (currentMonthTotalAmount != null) {
            d4 = Double.valueOf(currentMonthTotalAmount.doubleValue());
        } else {
            d4 = null;
        }
        return new C28525c(valueOf, valueOf2, scheme, valueOf3, d, schemeTariffCcy, valueOf4, agreeType, status, name, agreeNo, prodType, agreeCcy, d2, d3, agreeTypeDictionaryKey, arrayList, arrayList2, d4, bonusCasServiceEntity.getDepositTypeDictionaryKey(), bonusCasServiceEntity.getImageUrl());
    }

    /* renamed from: f */
    public final C28526d mo67182f(BonusCashbackEntity bonusCashbackEntity) {
        Double d;
        C41536l.m120489i(bonusCashbackEntity, "bonusCashbackEntity");
        long id = bonusCashbackEntity.getId();
        long clientKey = bonusCashbackEntity.getClientKey();
        long productKey = bonusCashbackEntity.getProductKey();
        BigDecimal cashbackCalcAmount = bonusCashbackEntity.getCashbackCalcAmount();
        Double d2 = null;
        if (cashbackCalcAmount != null) {
            d = Double.valueOf(cashbackCalcAmount.doubleValue());
        } else {
            d = null;
        }
        Long cashbackStartDate = bonusCashbackEntity.getCashbackStartDate();
        Long cashbackAccrualDate = bonusCashbackEntity.getCashbackAccrualDate();
        BigDecimal cashbackAccrualAmount = bonusCashbackEntity.getCashbackAccrualAmount();
        if (cashbackAccrualAmount != null) {
            d2 = Double.valueOf(cashbackAccrualAmount.doubleValue());
        }
        return new C28526d(id, clientKey, productKey, d, cashbackStartDate, cashbackAccrualDate, d2, bonusCashbackEntity.getLastTransferDate(), Long.valueOf(bonusCashbackEntity.getAcctKey()), bonusCashbackEntity.getAcctNo(), bonusCashbackEntity.getCcy());
    }

    /* renamed from: g */
    public final C28527e mo67183g(BonusDepositAccountEntity bonusDepositAccountEntity) {
        C41536l.m120489i(bonusDepositAccountEntity, "bonusDepositAccountEntity");
        return new C28527e(bonusDepositAccountEntity.getClientKey(), bonusDepositAccountEntity.getAgreeType(), Long.valueOf(bonusDepositAccountEntity.getAgreeKey()), bonusDepositAccountEntity.getAgreeCcy(), Long.valueOf(bonusDepositAccountEntity.getAcctKey()), bonusDepositAccountEntity.getName(), bonusDepositAccountEntity.getAcctNo(), bonusDepositAccountEntity.getAcctDesc(), bonusDepositAccountEntity.getDepositAgreeType(), bonusDepositAccountEntity.getAgreeBalance(), bonusDepositAccountEntity.getDepositTypeDictionaryKey(), bonusDepositAccountEntity.getAgreeNo());
    }

    /* renamed from: h */
    public final C28528f mo67184h(BonusPlusEntity bonusPlusEntity) {
        Double d;
        Double d2;
        Double d3;
        C41536l.m120489i(bonusPlusEntity, "bonusPlusEntity");
        Long regDate = bonusPlusEntity.getRegDate();
        BigDecimal collected = bonusPlusEntity.getCollected();
        Double d4 = null;
        if (collected != null) {
            d = Double.valueOf(collected.doubleValue());
        } else {
            d = null;
        }
        BigDecimal spent = bonusPlusEntity.getSpent();
        if (spent != null) {
            d2 = Double.valueOf(spent.doubleValue());
        } else {
            d2 = null;
        }
        BigDecimal available = bonusPlusEntity.getAvailable();
        if (available != null) {
            d3 = Double.valueOf(available.doubleValue());
        } else {
            d3 = null;
        }
        Integer valueOf = Integer.valueOf(bonusPlusEntity.getPrizeCount());
        String plusCategory = bonusPlusEntity.getPlusCategory();
        String plusCategoryLabel = bonusPlusEntity.getPlusCategoryLabel();
        String plusStatus = bonusPlusEntity.getPlusStatus();
        Long plusExpDateMillis = bonusPlusEntity.getPlusExpDateMillis();
        BigDecimal expiredBonus = bonusPlusEntity.getExpiredBonus();
        if (expiredBonus != null) {
            d4 = Double.valueOf(expiredBonus.doubleValue());
        }
        return new C28528f(regDate, d, d2, d3, valueOf, plusCategory, plusCategoryLabel, plusStatus, plusExpDateMillis, d4, Long.valueOf(bonusPlusEntity.getExpirationDate()), bonusPlusEntity.getAmountInGel());
    }

    /* renamed from: i */
    public final C28529g mo67185i(BonusScoolEntity bonusScoolEntity) {
        C41536l.m120489i(bonusScoolEntity, "bonusScoolEntity");
        return new C28529g(Long.valueOf(bonusScoolEntity.getCardId()), Long.valueOf(bonusScoolEntity.getAcctKey()), Long.valueOf(bonusScoolEntity.getChildClientKey()), Integer.valueOf(bonusScoolEntity.getSclPoints()), bonusScoolEntity.getCardName(), bonusScoolEntity.getProductCode(), bonusScoolEntity.getSubProductCode(), bonusScoolEntity.getCardHolder(), Long.valueOf(bonusScoolEntity.getExpDate()), bonusScoolEntity.getLastFour(), bonusScoolEntity.getMainCcy(), bonusScoolEntity.getDictionaryKey());
    }

    /* renamed from: j */
    public final C28530h mo67186j(BonusWrapperEntity bonusWrapperEntity) {
        C28524b bVar;
        C28528f fVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        C41536l.m120489i(bonusWrapperEntity, "bonusWrapperEntity");
        BonusAmexEntity amex = bonusWrapperEntity.getAmex();
        C28951a aVar = null;
        if (amex != null) {
            bVar = mo67180d(amex);
        } else {
            bVar = null;
        }
        BonusPlusEntity plus = bonusWrapperEntity.getPlus();
        if (plus != null) {
            fVar = mo67184h(plus);
        } else {
            fVar = null;
        }
        List<BonusCashbackEntity> a = mo67177a(bonusWrapperEntity);
        if (a != null) {
            arrayList = new ArrayList(C41343r.m119925u(a, 10));
            for (BonusCashbackEntity f : a) {
                arrayList.add(mo67182f(f));
            }
        } else {
            arrayList = null;
        }
        ArrayList<BonusCasServiceEntity> casServices = bonusWrapperEntity.getCasServices();
        if (casServices != null) {
            arrayList2 = new ArrayList(C41343r.m119925u(casServices, 10));
            for (BonusCasServiceEntity e : casServices) {
                arrayList2.add(mo67181e(e));
            }
        } else {
            arrayList2 = null;
        }
        ArrayList<CasTotalEntity> casServicesTotal = bonusWrapperEntity.getCasServicesTotal();
        if (casServicesTotal != null) {
            arrayList3 = new ArrayList(C41343r.m119925u(casServicesTotal, 10));
            for (CasTotalEntity k : casServicesTotal) {
                arrayList3.add(mo67187k(k));
            }
        } else {
            arrayList3 = null;
        }
        ArrayList<BonusScoolEntity> schoolCards = bonusWrapperEntity.getSchoolCards();
        if (schoolCards != null) {
            arrayList4 = new ArrayList(C41343r.m119925u(schoolCards, 10));
            for (BonusScoolEntity i : schoolCards) {
                arrayList4.add(mo67185i(i));
            }
        } else {
            arrayList4 = null;
        }
        int totalSclPoints = bonusWrapperEntity.getTotalSclPoints();
        BonusPrloEntity bonusPrlo = bonusWrapperEntity.getBonusPrlo();
        if (bonusPrlo != null) {
            aVar = mo67188l(bonusPrlo);
        }
        return new C28530h(bVar, fVar, arrayList, arrayList2, arrayList3, arrayList4, totalSclPoints, aVar);
    }

    /* renamed from: k */
    public final C28531i mo67187k(CasTotalEntity casTotalEntity) {
        Double d;
        C41536l.m120489i(casTotalEntity, "casTotalEntity");
        long clientKey = casTotalEntity.getClientKey();
        String ccy = casTotalEntity.getCcy();
        BigDecimal totalAmount = casTotalEntity.getTotalAmount();
        if (totalAmount != null) {
            d = Double.valueOf(totalAmount.doubleValue());
        } else {
            d = null;
        }
        return new C28531i(clientKey, ccy, d);
    }

    /* renamed from: l */
    public final C28951a mo67188l(BonusPrloEntity bonusPrloEntity) {
        List list;
        C41536l.m120489i(bonusPrloEntity, "bonusPrloEntity");
        long j = bonusPrloEntity.nextDrawDate;
        ArrayList<PrloTicketWrapperEntity> arrayList = bonusPrloEntity.tickets;
        if (arrayList != null) {
            list = new ArrayList(C41343r.m119925u(arrayList, 10));
            for (PrloTicketWrapperEntity n : arrayList) {
                list.add(mo67190n(n));
            }
        } else {
            list = C41341q.m119907j();
        }
        return new C28951a(j, list);
    }

    /* renamed from: m */
    public final C28952b mo67189m(PrloTicketEntity prloTicketEntity) {
        C41536l.m120489i(prloTicketEntity, "prloTicketEntity");
        return new C28952b(Long.valueOf(prloTicketEntity.getId()), Long.valueOf(prloTicketEntity.getClientKey()), prloTicketEntity.ticketNo, prloTicketEntity.getStatus(), prloTicketEntity.getRunDate());
    }

    /* renamed from: n */
    public final C28953c mo67190n(PrloTicketWrapperEntity prloTicketWrapperEntity) {
        List list;
        C41536l.m120489i(prloTicketWrapperEntity, "prloTicketWrapperEntity");
        long j = prloTicketWrapperEntity.month;
        int i = prloTicketWrapperEntity.ticketCount;
        ArrayList<PrloTicketEntity> arrayList = prloTicketWrapperEntity.tickets;
        if (arrayList != null) {
            list = new ArrayList(C41343r.m119925u(arrayList, 10));
            for (PrloTicketEntity m : arrayList) {
                list.add(mo67189m(m));
            }
        } else {
            list = C41341q.m119907j();
        }
        return new C28953c(j, i, list);
    }

    /* renamed from: o */
    public final List mo67191o(List list) {
        C41536l.m120489i(list, "accounts");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo67183g((BonusDepositAccountEntity) it.next()));
        }
        return arrayList;
    }
}
