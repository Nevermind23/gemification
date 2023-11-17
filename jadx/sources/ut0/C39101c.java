package ut0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.loyaltyprogress.data.model.BenefitApiModel;
import p341ge.bog.mobilebank.loyaltyprogress.data.model.StatusBenefitsApiModel;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import yt0.C40060a;
import yt0.C40062c;

/* renamed from: ut0.c */
public final class C39101c {
    /* renamed from: a */
    public final List mo92772a(List list) {
        String str;
        String str2;
        int i;
        int i2;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        List list2 = list;
        C41536l.m120489i(list2, "statusBenefits");
        int i3 = 10;
        ArrayList arrayList3 = new ArrayList(C41343r.m119925u(list2, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StatusBenefitsApiModel statusBenefitsApiModel = (StatusBenefitsApiModel) it.next();
            String labelType = statusBenefitsApiModel.getLabelType();
            if (labelType == null) {
                str = "";
            } else {
                str = labelType;
            }
            String labelDesc = statusBenefitsApiModel.getLabelDesc();
            if (labelDesc == null) {
                str2 = "";
            } else {
                str2 = labelDesc;
            }
            Integer labelEntryScore = statusBenefitsApiModel.getLabelEntryScore();
            if (labelEntryScore != null) {
                i = labelEntryScore.intValue();
            } else {
                i = 0;
            }
            Integer orderId = statusBenefitsApiModel.getOrderId();
            if (orderId != null) {
                i2 = orderId.intValue();
            } else {
                i2 = 0;
            }
            List<BenefitApiModel> plusBenefitList = statusBenefitsApiModel.getPlusBenefitList();
            if (plusBenefitList != null) {
                arrayList = new ArrayList(C41343r.m119925u(plusBenefitList, i3));
                for (BenefitApiModel benefitApiModel : plusBenefitList) {
                    String clientKey = benefitApiModel.getClientKey();
                    if (clientKey == null) {
                        str3 = "";
                    } else {
                        str3 = clientKey;
                    }
                    String labelType2 = benefitApiModel.getLabelType();
                    if (labelType2 == null) {
                        str4 = "";
                    } else {
                        str4 = labelType2;
                    }
                    String labelDesc2 = benefitApiModel.getLabelDesc();
                    if (labelDesc2 == null) {
                        str5 = "";
                    } else {
                        str5 = labelDesc2;
                    }
                    String benefitValue = benefitApiModel.getBenefitValue();
                    if (benefitValue == null) {
                        str6 = "";
                    } else {
                        str6 = benefitValue;
                    }
                    String benefitStatus = benefitApiModel.getBenefitStatus();
                    if (benefitStatus == null) {
                        str7 = "";
                    } else {
                        str7 = benefitStatus;
                    }
                    String orderValue = benefitApiModel.getOrderValue();
                    if (orderValue == null) {
                        orderValue = BankApiResponse.SUCCESSFUL_RESPONSE_CODE;
                    }
                    String str8 = orderValue;
                    String benefitDesc = benefitApiModel.getBenefitDesc();
                    if (benefitDesc == null) {
                        benefitDesc = "";
                    }
                    C40060a aVar = r11;
                    C40060a aVar2 = new C40060a(str3, str4, str5, str6, str7, str8, benefitDesc);
                    arrayList.add(aVar);
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null) {
                arrayList2 = C41341q.m119907j();
            } else {
                arrayList2 = arrayList;
            }
            arrayList3.add(new C40062c(str, str2, i, i2, arrayList2));
            i3 = 10;
        }
        return arrayList3;
    }
}
