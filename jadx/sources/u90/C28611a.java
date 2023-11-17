package u90;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.ddsto.data.sto.Details;
import p341ge.bog.mobilebank.ddsto.data.sto.StoApiModel;
import p341ge.bog.mobilebank.ddsto.data.sto.StoDetailsApiModel;
import x90.C29662b;
import x90.C29663c;

/* renamed from: u90.a */
public final class C28611a {

    /* renamed from: a */
    public static final C28612a f72628a = new C28612a((DefaultConstructorMarker) null);

    /* renamed from: u90.a$a */
    public static final class C28612a {
        private C28612a() {
        }

        public /* synthetic */ C28612a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final List mo68333a(List list) {
        String str;
        String str2;
        StoDetailsApiModel stoDetailsApiModel;
        Long l;
        Long l2;
        String str3;
        Long l3;
        Long l4;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        Long l5;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        Long l6;
        Long l7;
        String str17;
        Long l8;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String endDate;
        String cdsAgreeKey;
        Double amount;
        StoDetailsApiModel stoDetails;
        StoDetailsApiModel stoDetails2;
        C41536l.m120489i(list, "data");
        ArrayList<StoApiModel> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (C41536l.m120484d(((StoApiModel) next).getProductCode(), "STO")) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
        for (StoApiModel stoApiModel : arrayList) {
            Long paymentId = stoApiModel.getPaymentId();
            C41536l.m120486f(paymentId);
            long longValue = paymentId.longValue();
            Details details = stoApiModel.getDetails();
            if (details == null || (stoDetails2 = details.getStoDetails()) == null || (str = stoDetails2.getBenefName()) == null) {
                str = stoApiModel.getName();
            }
            String str26 = str;
            Details details2 = stoApiModel.getDetails();
            String str27 = null;
            if (details2 == null || (stoDetails = details2.getStoDetails()) == null) {
                str2 = null;
            } else {
                str2 = stoDetails.getBenefAcctNo();
            }
            C41536l.m120486f(str2);
            Double amount2 = stoApiModel.getAmount();
            C41536l.m120486f(amount2);
            double doubleValue = amount2.doubleValue();
            String ccy = stoApiModel.getCcy();
            C41536l.m120486f(ccy);
            String serviceCode = stoApiModel.getServiceCode();
            String periodType = stoApiModel.getPeriodType();
            String periodTypeDictionaryKey = stoApiModel.getPeriodTypeDictionaryKey();
            Long nextSentDate = stoApiModel.getNextSentDate();
            String debitType = stoApiModel.getDebitType();
            String status = stoApiModel.getStatus();
            String productCode = stoApiModel.getProductCode();
            String dictionaryKey = stoApiModel.getDictionaryKey();
            Details details3 = stoApiModel.getDetails();
            if (details3 != null) {
                stoDetailsApiModel = details3.getStoDetails();
            } else {
                stoDetailsApiModel = null;
            }
            Long paymentId2 = stoApiModel.getPaymentId();
            if (stoDetailsApiModel != null) {
                l = stoDetailsApiModel.getDocumentId();
            } else {
                l = null;
            }
            if (stoDetailsApiModel != null) {
                l2 = stoDetailsApiModel.getClientKey();
            } else {
                l2 = null;
            }
            if (stoDetailsApiModel != null) {
                str3 = stoDetailsApiModel.getSentModule();
            } else {
                str3 = null;
            }
            if (stoDetailsApiModel != null) {
                l3 = stoDetailsApiModel.getSrcAcctKey();
            } else {
                l3 = null;
            }
            if (stoDetailsApiModel != null) {
                l4 = stoDetailsApiModel.getDstAcctKey();
            } else {
                l4 = null;
            }
            if (stoDetailsApiModel != null) {
                str4 = stoDetailsApiModel.getDocumentName();
            } else {
                str4 = null;
            }
            if (stoDetailsApiModel == null || (amount = stoDetailsApiModel.getAmount()) == null) {
                str5 = null;
            } else {
                str5 = amount.toString();
            }
            if (stoDetailsApiModel != null) {
                str6 = stoDetailsApiModel.getCurrency();
            } else {
                str6 = null;
            }
            if (stoDetailsApiModel != null) {
                str7 = stoDetailsApiModel.getDescription();
            } else {
                str7 = null;
            }
            if (stoDetailsApiModel != null) {
                str8 = stoDetailsApiModel.getBenefAcctNo();
            } else {
                str8 = null;
            }
            if (stoDetailsApiModel != null) {
                str9 = stoDetailsApiModel.getBenefBankCode();
            } else {
                str9 = null;
            }
            if (stoDetailsApiModel != null) {
                str10 = stoDetailsApiModel.getBenefName();
            } else {
                str10 = null;
            }
            if (stoDetailsApiModel != null) {
                str11 = stoDetailsApiModel.getBenefBankName();
            } else {
                str11 = null;
            }
            if (stoDetailsApiModel == null || (cdsAgreeKey = stoDetailsApiModel.getCdsAgreeKey()) == null) {
                l5 = null;
            } else {
                l5 = Long.valueOf(Long.parseLong(cdsAgreeKey));
            }
            if (stoDetailsApiModel != null) {
                str12 = stoDetailsApiModel.getIntBankName();
            } else {
                str12 = null;
            }
            if (stoDetailsApiModel != null) {
                str13 = stoDetailsApiModel.getIntBankCode();
            } else {
                str13 = null;
            }
            if (stoDetailsApiModel != null) {
                str14 = stoDetailsApiModel.getPaymentdetail();
            } else {
                str14 = null;
            }
            if (stoDetailsApiModel != null) {
                str15 = stoDetailsApiModel.getCharges();
            } else {
                str15 = null;
            }
            if (stoDetailsApiModel != null) {
                str16 = stoDetailsApiModel.getAdditionalInfo();
            } else {
                str16 = null;
            }
            if (stoDetailsApiModel != null) {
                l6 = stoDetailsApiModel.getStartDate();
            } else {
                l6 = null;
            }
            if (stoDetailsApiModel == null || (endDate = stoDetailsApiModel.getEndDate()) == null) {
                l7 = null;
            } else {
                l7 = Long.valueOf(Long.parseLong(endDate));
            }
            if (stoDetailsApiModel != null) {
                str17 = stoDetailsApiModel.getPeriodType();
            } else {
                str17 = null;
            }
            if (stoDetailsApiModel != null) {
                l8 = stoDetailsApiModel.getNextSentDate();
            } else {
                l8 = null;
            }
            if (stoDetailsApiModel != null) {
                str18 = stoDetailsApiModel.getAgreeNo();
            } else {
                str18 = null;
            }
            if (stoDetailsApiModel != null) {
                str19 = stoDetailsApiModel.getStatus();
            } else {
                str19 = null;
            }
            if (stoDetailsApiModel != null) {
                str20 = stoDetailsApiModel.getSenderInn();
            } else {
                str20 = null;
            }
            if (stoDetailsApiModel != null) {
                str21 = stoDetailsApiModel.getAcctNo();
            } else {
                str21 = null;
            }
            if (stoDetailsApiModel != null) {
                str22 = stoDetailsApiModel.getAcctDesc();
            } else {
                str22 = null;
            }
            if (stoDetailsApiModel != null) {
                str23 = stoDetailsApiModel.getBenefAcctDesc();
            } else {
                str23 = null;
            }
            if (stoDetailsApiModel != null) {
                str24 = stoDetailsApiModel.getPayerName();
            } else {
                str24 = null;
            }
            if (stoDetailsApiModel != null) {
                str25 = stoDetailsApiModel.getDictionaryKey();
            } else {
                str25 = null;
            }
            if (stoDetailsApiModel != null) {
                str27 = stoDetailsApiModel.getSubProductCode();
            }
            arrayList2.add(new C29662b(longValue, str26, str2, doubleValue, ccy, serviceCode, periodType, periodTypeDictionaryKey, nextSentDate, debitType, status, productCode, dictionaryKey, new C29663c(paymentId2, l, l2, str3, l3, l4, str4, str5, str6, str7, str8, str9, str10, str11, l5, str12, str13, str14, str15, str16, l6, l7, str17, l8, str18, str19, str20, str21, str22, str23, str24, str25, str27)));
        }
        return arrayList2;
    }
}
