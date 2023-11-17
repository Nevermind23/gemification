package p522ml;

import android.graphics.drawable.Drawable;
import g91.C32289b0;
import hd0.C24977a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.mobilebank.bnpl.data.entity.BnplCategoryWithMerchantsApiEntity;
import p341ge.bog.mobilebank.bnpl.data.entity.BnplDetailApiEntity;
import p341ge.bog.mobilebank.bnpl.data.entity.BnplDetailsApiEntity;
import p341ge.bog.mobilebank.bnpl.data.entity.BnplDetailsRepaymentAccountApiEntity;
import p341ge.bog.mobilebank.bnpl.data.entity.BnplDetailsScheduleApiEntity;
import p341ge.bog.mobilebank.bnpl.data.entity.BnplInvoiceApiEntity;
import p341ge.bog.mobilebank.bnpl.data.entity.BnplInvoiceItemApiEntity;
import p341ge.bog.mobilebank.bnpl.data.entity.BnplItemApiEntity;
import p341ge.bog.mobilebank.bnpl.data.entity.BnplMerchantApiEntity;
import p341ge.bog.mobilebank.bnpl.data.entity.BnplMerchantStoreApiEntity;
import p341ge.bog.mobilebank.bnpl.data.entity.BnplObjectApiEntity;
import p341ge.bog.mobilebank.bnpl.data.entity.BplCategopriesWithMerchantsApiEntity;
import p341ge.bog.mobilebank.bnpl.data.entity.MmmsDetailsApiEntity;
import p341ge.bog.mobilebank.bnpl.data.entity.PlnDetailsApiEntity;
import p606sl.C17835b;
import p606sl.C17837c;
import p606sl.C17838d;
import p606sl.C17839e;
import p606sl.C17840f;
import p606sl.C17841g;
import p606sl.C17842h;
import p606sl.C17843i;
import p606sl.C17844j;
import p606sl.C17846l;
import p606sl.C17847m;
import p606sl.C17851q;
import p606sl.C17852r;
import p606sl.C17853s;

/* renamed from: ml.a */
public final class C16720a {
    /* renamed from: m */
    private final C17835b m59126m(BnplCategoryWithMerchantsApiEntity bnplCategoryWithMerchantsApiEntity) {
        long j;
        String str;
        String str2;
        String str3;
        ArrayList arrayList;
        Long categoryId = bnplCategoryWithMerchantsApiEntity.getCategoryId();
        if (categoryId != null) {
            j = categoryId.longValue();
        } else {
            j = 0;
        }
        long j2 = j;
        String categoryDescGe = bnplCategoryWithMerchantsApiEntity.getCategoryDescGe();
        if (categoryDescGe == null) {
            str = "";
        } else {
            str = categoryDescGe;
        }
        String categoryDescEn = bnplCategoryWithMerchantsApiEntity.getCategoryDescEn();
        if (categoryDescEn == null) {
            str2 = "";
        } else {
            str2 = categoryDescEn;
        }
        String dictionaryKey = bnplCategoryWithMerchantsApiEntity.getDictionaryKey();
        if (dictionaryKey == null) {
            str3 = "";
        } else {
            str3 = dictionaryKey;
        }
        List<BnplMerchantApiEntity> merchants = bnplCategoryWithMerchantsApiEntity.getMerchants();
        if (merchants != null) {
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(merchants, 10));
            for (BnplMerchantApiEntity n : merchants) {
                arrayList2.add(m59127n(n));
            }
            arrayList = arrayList2;
        } else {
            arrayList = C41341q.m119907j();
        }
        return new C17835b(j2, str, str2, str3, arrayList);
    }

    /* renamed from: n */
    private final C17844j m59127n(BnplMerchantApiEntity bnplMerchantApiEntity) {
        long j;
        String str;
        String str2;
        String str3;
        Image.Url url;
        int i;
        Long merchantClientId = bnplMerchantApiEntity.getMerchantClientId();
        long j2 = 0;
        if (merchantClientId != null) {
            j = merchantClientId.longValue();
        } else {
            j = 0;
        }
        String clientKey = bnplMerchantApiEntity.getClientKey();
        if (clientKey == null) {
            str = "";
        } else {
            str = clientKey;
        }
        String brandNameGe = bnplMerchantApiEntity.getBrandNameGe();
        if (brandNameGe == null) {
            str2 = "";
        } else {
            str2 = brandNameGe;
        }
        String brandNameEn = bnplMerchantApiEntity.getBrandNameEn();
        if (brandNameEn == null) {
            str3 = "";
        } else {
            str3 = brandNameEn;
        }
        String logoFileUrl = bnplMerchantApiEntity.getLogoFileUrl();
        if (logoFileUrl != null) {
            String c = C32289b0.m95091c(logoFileUrl);
            C41536l.m120488h(c, "generateImageUrl(it)");
            url = new Image.Url(c, (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null);
        } else {
            url = null;
        }
        Long ofrCategoryId = bnplMerchantApiEntity.getOfrCategoryId();
        if (ofrCategoryId != null) {
            j2 = ofrCategoryId.longValue();
        }
        long j3 = j2;
        Integer merchantCount = bnplMerchantApiEntity.getMerchantCount();
        if (merchantCount != null) {
            i = merchantCount.intValue();
        } else {
            i = 0;
        }
        return new C17844j(j, str, str2, str3, url, j3, i);
    }

    /* renamed from: a */
    public final List mo43838a(List list) {
        C41536l.m120489i(list, "bnplRepaymentAccountApiEntity");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BnplDetailsRepaymentAccountApiEntity bnplDetailsRepaymentAccountApiEntity = (BnplDetailsRepaymentAccountApiEntity) it.next();
            arrayList.add(new C17839e(bnplDetailsRepaymentAccountApiEntity.getAcctKey(), bnplDetailsRepaymentAccountApiEntity.getAcctNo(), bnplDetailsRepaymentAccountApiEntity.getAcctName(), bnplDetailsRepaymentAccountApiEntity.getCcy(), bnplDetailsRepaymentAccountApiEntity.getAvailableAmount(), bnplDetailsRepaymentAccountApiEntity.getMainAcctKey(), bnplDetailsRepaymentAccountApiEntity.getRealAmount()));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final C17837c mo43839b(BnplDetailApiEntity bnplDetailApiEntity) {
        C17853s sVar;
        C41536l.m120489i(bnplDetailApiEntity, "bnplDetailApiEntity");
        long loanKey = bnplDetailApiEntity.getLoanKey();
        Long signedDate = bnplDetailApiEntity.getSignedDate();
        Long firstDdDate = bnplDetailApiEntity.getFirstDdDate();
        Long matureDate = bnplDetailApiEntity.getMatureDate();
        Long linkAcctKey = bnplDetailApiEntity.getLinkAcctKey();
        Double initialPrincipal = bnplDetailApiEntity.getInitialPrincipal();
        Double remainingInterest = bnplDetailApiEntity.getRemainingInterest();
        Double offsetIntSaved = bnplDetailApiEntity.getOffsetIntSaved();
        Double interestRate = bnplDetailApiEntity.getInterestRate();
        Long clientKey = bnplDetailApiEntity.getClientKey();
        Boolean hasInsFlag = bnplDetailApiEntity.getHasInsFlag();
        Double insAmount = bnplDetailApiEntity.getInsAmount();
        String loanSubType = bnplDetailApiEntity.getLoanSubType();
        Double nextInterest = bnplDetailApiEntity.getNextInterest();
        Double nextPayment = bnplDetailApiEntity.getNextPayment();
        String subTypeGroup = bnplDetailApiEntity.getSubTypeGroup();
        Boolean hasSmsScheme = bnplDetailApiEntity.getHasSmsScheme();
        Boolean isLoanReverseAllowed = bnplDetailApiEntity.isLoanReverseAllowed();
        String linkAcctNo = bnplDetailApiEntity.getLinkAcctNo();
        Double restAmount = bnplDetailApiEntity.getRestAmount();
        Double prePaymentCom = bnplDetailApiEntity.getPrePaymentCom();
        if (bnplDetailApiEntity.getRepaymentFlag() != null) {
            sVar = C17853s.valueOf(bnplDetailApiEntity.getRepaymentFlag().toString());
        } else {
            sVar = null;
        }
        return new C17837c(loanKey, signedDate, firstDdDate, matureDate, linkAcctKey, initialPrincipal, remainingInterest, offsetIntSaved, interestRate, clientKey, hasInsFlag, insAmount, loanSubType, nextInterest, nextPayment, subTypeGroup, hasSmsScheme, isLoanReverseAllowed, linkAcctNo, restAmount, prePaymentCom, sVar, bnplDetailApiEntity.isReversible(), bnplDetailApiEntity.getLoanDebt(), bnplDetailApiEntity.getFileUrl(), bnplDetailApiEntity.isOnlineInstallment(), bnplDetailApiEntity.getReversalStatus(), bnplDetailApiEntity.getReversalStatusDictionaryKey(), bnplDetailApiEntity.getReversalStatusDictionaryValue());
    }

    /* renamed from: c */
    public final C17838d mo43840c(BnplDetailsApiEntity bnplDetailsApiEntity) {
        C17837c cVar;
        C17852r rVar;
        C17840f fVar;
        C17841g gVar;
        List list;
        C17851q qVar;
        C41536l.m120489i(bnplDetailsApiEntity, "bnplDetailsApiEntity");
        Long valueOf = Long.valueOf(bnplDetailsApiEntity.getLoanKey());
        if (bnplDetailsApiEntity.getLndDetails() != null) {
            cVar = mo43839b(bnplDetailsApiEntity.getLndDetails());
        } else {
            cVar = null;
        }
        if (bnplDetailsApiEntity.getPlnDetails() != null) {
            rVar = mo43848k(bnplDetailsApiEntity.getPlnDetails());
        } else {
            rVar = null;
        }
        if (bnplDetailsApiEntity.getSchedule() != null) {
            fVar = mo43841d(bnplDetailsApiEntity.getSchedule());
        } else {
            fVar = null;
        }
        if (bnplDetailsApiEntity.getInvoice() != null) {
            gVar = mo43842e(bnplDetailsApiEntity.getInvoice());
        } else {
            gVar = null;
        }
        if (bnplDetailsApiEntity.getRepaymentAccounts() != null) {
            list = mo43838a(bnplDetailsApiEntity.getRepaymentAccounts());
        } else {
            list = null;
        }
        if (bnplDetailsApiEntity.getMmsDetails() != null) {
            qVar = mo43847j(bnplDetailsApiEntity.getMmsDetails());
        } else {
            qVar = null;
        }
        return new C17838d(valueOf, cVar, rVar, fVar, gVar, list, qVar);
    }

    /* renamed from: d */
    public final C17840f mo43841d(BnplDetailsScheduleApiEntity bnplDetailsScheduleApiEntity) {
        C41536l.m120489i(bnplDetailsScheduleApiEntity, "bnplScheduleApiEntity");
        return new C17840f(bnplDetailsScheduleApiEntity.getPrimaryKey(), Long.valueOf(bnplDetailsScheduleApiEntity.getLoanKey()), bnplDetailsScheduleApiEntity.getLoanNo(), bnplDetailsScheduleApiEntity.getPayDate(), bnplDetailsScheduleApiEntity.getCcy(), bnplDetailsScheduleApiEntity.getPriAmt(), bnplDetailsScheduleApiEntity.getIntAmt(), bnplDetailsScheduleApiEntity.getFeeAmt(), bnplDetailsScheduleApiEntity.getFeeType(), bnplDetailsScheduleApiEntity.getExAmt(), bnplDetailsScheduleApiEntity.getTotalAmt(), bnplDetailsScheduleApiEntity.getNextPayAmt(), bnplDetailsScheduleApiEntity.getIntAmtWithoutOffset(), bnplDetailsScheduleApiEntity.getFeeTypeDictionaryKey(), bnplDetailsScheduleApiEntity.getFeeTypeDictionaryValue());
    }

    /* renamed from: e */
    public final C17841g mo43842e(BnplInvoiceApiEntity bnplInvoiceApiEntity) {
        ArrayList arrayList;
        C41536l.m120489i(bnplInvoiceApiEntity, "bnplInvoiceApiEntity");
        Long paymentDate = bnplInvoiceApiEntity.getPaymentDate();
        Double amount = bnplInvoiceApiEntity.getAmount();
        List<BnplInvoiceItemApiEntity> list = bnplInvoiceApiEntity.getList();
        if (list != null) {
            arrayList = new ArrayList(C41343r.m119925u(list, 10));
            for (BnplInvoiceItemApiEntity f : list) {
                arrayList.add(mo43843f(f));
            }
        } else {
            arrayList = null;
        }
        return new C17841g(paymentDate, amount, arrayList);
    }

    /* renamed from: f */
    public final C17842h mo43843f(BnplInvoiceItemApiEntity bnplInvoiceItemApiEntity) {
        C41536l.m120489i(bnplInvoiceItemApiEntity, "bnplInvoiceItemApiEntity");
        return new C17842h(bnplInvoiceItemApiEntity.getLoanKey(), bnplInvoiceItemApiEntity.getPaymentDate(), bnplInvoiceItemApiEntity.getInvoiceType(), bnplInvoiceItemApiEntity.getFeeType(), bnplInvoiceItemApiEntity.getCcy(), bnplInvoiceItemApiEntity.getAmount(), bnplInvoiceItemApiEntity.getInvoiceTypeDictionaryKey());
    }

    /* renamed from: g */
    public final C17843i mo43844g(BnplItemApiEntity bnplItemApiEntity) {
        C41536l.m120489i(bnplItemApiEntity, "bnplItems");
        return new C17843i(bnplItemApiEntity.getLoanKey(), bnplItemApiEntity.getProdType(), bnplItemApiEntity.getAmount(), bnplItemApiEntity.getLoanName(), bnplItemApiEntity.getCcy(), bnplItemApiEntity.getBcAmount(), bnplItemApiEntity.getLoanType(), bnplItemApiEntity.getProductDictionaryKey(), bnplItemApiEntity.getInstallmentFlag(), bnplItemApiEntity.getProductFunctions(), bnplItemApiEntity.getAttachmentUrl(), bnplItemApiEntity.getProductId(), bnplItemApiEntity.getAcctRef());
    }

    /* renamed from: h */
    public final C17846l mo43845h(BnplMerchantStoreApiEntity bnplMerchantStoreApiEntity) {
        C41536l.m120489i(bnplMerchantStoreApiEntity, "bnplMerchantStore");
        return new C17846l(bnplMerchantStoreApiEntity.getMerchantId(), bnplMerchantStoreApiEntity.getClientId(), bnplMerchantStoreApiEntity.getAddressGE(), bnplMerchantStoreApiEntity.getAddressEN(), bnplMerchantStoreApiEntity.getQrCode(), bnplMerchantStoreApiEntity.getQrSource());
    }

    /* renamed from: i */
    public final C17847m mo43846i(BnplObjectApiEntity bnplObjectApiEntity) {
        C41536l.m120489i(bnplObjectApiEntity, "bnplObjectApiEntity");
        C24977a aVar = new C24977a(bnplObjectApiEntity.getSummary().getBcAmount(), bnplObjectApiEntity.getSummary().getCcy());
        C24977a aVar2 = new C24977a(bnplObjectApiEntity.getCosignerSummary().getBcAmount(), bnplObjectApiEntity.getCosignerSummary().getCcy());
        List<BnplItemApiEntity> loans = bnplObjectApiEntity.getLoans();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(loans, 10));
        for (BnplItemApiEntity g : loans) {
            arrayList.add(mo43844g(g));
        }
        List<BnplDetailsApiEntity> details = bnplObjectApiEntity.getDetails();
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(details, 10));
        for (BnplDetailsApiEntity c : details) {
            arrayList2.add(mo43840c(c));
        }
        return new C17847m(aVar, aVar2, arrayList, arrayList2);
    }

    /* renamed from: j */
    public final C17851q mo43847j(MmmsDetailsApiEntity mmmsDetailsApiEntity) {
        C41536l.m120489i(mmmsDetailsApiEntity, "mmmsDetailsApiEntity");
        return new C17851q(mmmsDetailsApiEntity.getClientKey(), mmmsDetailsApiEntity.getMerchantName(), mmmsDetailsApiEntity.getMerchantId(), mmmsDetailsApiEntity.getMerchantPhoneNumber(), mmmsDetailsApiEntity.getReversalExpireDays(), mmmsDetailsApiEntity.getMerchantLogoStorageId(), mmmsDetailsApiEntity.getMerChantSourceType(), mmmsDetailsApiEntity.getMerchantLogoURL());
    }

    /* renamed from: k */
    public final C17852r mo43848k(PlnDetailsApiEntity plnDetailsApiEntity) {
        C41536l.m120489i(plnDetailsApiEntity, "plnDetailsApiEntity");
        return new C17852r(plnDetailsApiEntity.getAmount(), plnDetailsApiEntity.getStartDate(), plnDetailsApiEntity.getMaturityDate(), plnDetailsApiEntity.getInterestRate(), plnDetailsApiEntity.getIntAmount(), plnDetailsApiEntity.getPenalty(), plnDetailsApiEntity.getInitialPrincipal(), plnDetailsApiEntity.getAcctNo(), plnDetailsApiEntity.getProductDictionaryKey(), plnDetailsApiEntity.getAvailableAmount());
    }

    /* renamed from: l */
    public final List mo43849l(BplCategopriesWithMerchantsApiEntity bplCategopriesWithMerchantsApiEntity) {
        C41536l.m120489i(bplCategopriesWithMerchantsApiEntity, "categories");
        List<BnplCategoryWithMerchantsApiEntity> categoriesWithMerchants = bplCategopriesWithMerchantsApiEntity.getCategoriesWithMerchants();
        if (categoriesWithMerchants == null) {
            return C41341q.m119907j();
        }
        ArrayList arrayList = new ArrayList(C41343r.m119925u(categoriesWithMerchants, 10));
        for (BnplCategoryWithMerchantsApiEntity m : categoriesWithMerchants) {
            arrayList.add(m59126m(m));
        }
        return arrayList;
    }
}
