package p341ge.bog.mobilebank.products.data.mapper;

import com.github.mikephil.charting.utils.Utils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.products.data.model.AgreementClientInfoApiModel;
import p341ge.bog.mobilebank.products.data.model.BondApiModel;
import p341ge.bog.mobilebank.products.data.model.BondsWrapperApiModel;
import p341ge.bog.mobilebank.products.data.model.CashAgreementApiModel;
import xy0.C39939c;
import xy0.C39940d;
import xy0.C39941e;

/* renamed from: ge.bog.mobilebank.products.data.mapper.BondsWrapperApiModelMapper */
public final class BondsWrapperApiModelMapper {
    public final C39941e convert(BondsWrapperApiModel bondsWrapperApiModel) {
        List list;
        C41536l.m120489i(bondsWrapperApiModel, "bondsWrapperApiModel");
        C39939c convert = convert(bondsWrapperApiModel.getClientInfo());
        List<BondApiModel> bonds = bondsWrapperApiModel.getBonds();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(bonds, 10));
        for (BondApiModel convert2 : bonds) {
            arrayList.add(convert(convert2));
        }
        List<CashAgreementApiModel> cashAgreements = bondsWrapperApiModel.getCashAgreements();
        if (cashAgreements != null) {
            list = new ArrayList(C41343r.m119925u(cashAgreements, 10));
            for (CashAgreementApiModel convert3 : cashAgreements) {
                list.add(convert(convert3));
            }
        } else {
            list = C41341q.m119907j();
        }
        return new C39941e(convert, arrayList, list);
    }

    private final C39939c convert(AgreementClientInfoApiModel agreementClientInfoApiModel) {
        BigDecimal bondsValue = agreementClientInfoApiModel.getBondsValue();
        BigDecimal cashValue = agreementClientInfoApiModel.getCashValue();
        String ccy = agreementClientInfoApiModel.getCcy();
        if (ccy == null) {
            ccy = "GEL";
        }
        String str = ccy;
        Long clientKey = agreementClientInfoApiModel.getClientKey();
        long longValue = clientKey != null ? clientKey.longValue() : 0;
        Long insertDate = agreementClientInfoApiModel.getInsertDate();
        BigDecimal sharesValue = agreementClientInfoApiModel.getSharesValue();
        BigDecimal totalValue = agreementClientInfoApiModel.getTotalValue();
        return new C39939c(bondsValue, cashValue, str, longValue, insertDate, sharesValue, totalValue != null ? totalValue.doubleValue() : Utils.DOUBLE_EPSILON);
    }

    private final C39940d convert(BondApiModel bondApiModel) {
        String str;
        String str2;
        String str3;
        String agreementNameEn = bondApiModel.getAgreementNameEn();
        String str4 = agreementNameEn == null ? "" : agreementNameEn;
        String agreementNameGe = bondApiModel.getAgreementNameGe();
        if (agreementNameGe == null) {
            str = "";
        } else {
            str = agreementNameGe;
        }
        String agreementType = bondApiModel.getAgreementType();
        Object attachmentFileBase64 = bondApiModel.getAttachmentFileBase64();
        String ccy = bondApiModel.getCcy();
        if (ccy == null) {
            ccy = "GEL";
        }
        String str5 = ccy;
        long id = bondApiModel.getId();
        String isinCode = bondApiModel.getIsinCode();
        BigDecimal marketPrice = bondApiModel.getMarketPrice();
        double doubleValue = marketPrice != null ? marketPrice.doubleValue() : 0.0d;
        BigDecimal purchasePrice = bondApiModel.getPurchasePrice();
        long quantity = bondApiModel.getQuantity();
        String securityNameEn = bondApiModel.getSecurityNameEn();
        if (securityNameEn == null) {
            str2 = "";
        } else {
            str2 = securityNameEn;
        }
        String securityNameGe = bondApiModel.getSecurityNameGe();
        if (securityNameGe == null) {
            str3 = "";
        } else {
            str3 = securityNameGe;
        }
        String tickerCode = bondApiModel.getTickerCode();
        String tickerNameEn = bondApiModel.getTickerNameEn();
        String tickerNameGe = bondApiModel.getTickerNameGe();
        BigDecimal marketValue = bondApiModel.getMarketValue();
        return new C39940d(str4, str, agreementType, attachmentFileBase64, str5, id, isinCode, doubleValue, purchasePrice, quantity, str2, str3, tickerCode, tickerNameEn, tickerNameGe, marketValue != null ? marketValue.doubleValue() : 0.0d, bondApiModel.getUnrealisedProfitLoss(), bondApiModel.getNote(), bondApiModel.getCoupon(), bondApiModel.getCashValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r0 == null) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final xy0.C39943g convert(p341ge.bog.mobilebank.products.data.model.CashAgreementApiModel r9) {
        /*
            r8 = this;
            xy0.g r7 = new xy0.g
            long r1 = r9.getId()
            java.lang.String r0 = r9.getCcy()
            if (r0 == 0) goto L_0x0019
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r3)
            java.lang.String r3 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            kotlin.jvm.internal.C41536l.m120488h(r0, r3)
            if (r0 != 0) goto L_0x001b
        L_0x0019:
            java.lang.String r0 = "GEL"
        L_0x001b:
            r3 = r0
            java.lang.String r4 = r9.getNote()
            java.math.BigDecimal r9 = r9.getQuantity()
            if (r9 == 0) goto L_0x002b
            double r5 = r9.doubleValue()
            goto L_0x002d
        L_0x002b:
            r5 = 0
        L_0x002d:
            r0 = r7
            r0.<init>(r1, r3, r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.products.data.mapper.BondsWrapperApiModelMapper.convert(ge.bog.mobilebank.products.data.model.CashAgreementApiModel):xy0.g");
    }
}
