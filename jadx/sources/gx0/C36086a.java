package gx0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.shared.payments.data.model.PaymentConfigDetailsApiModel;
import p341ge.bog.mobilebank.shared.payments.data.model.PaymentServiceConfigInputApiModel;
import p341ge.bog.mobilebank.shared.payments.data.model.PaymentServiceConfigInputOptionApiModel;
import p341ge.bog.mobilebank.shared.payments.data.model.PaymentServiceConfigJsonApiModel;
import p341ge.bog.mobilebank.shared.payments.data.model.PaymentServiceConfigParameterApiModel;
import s31.C38421a;
import s31.C38422b;
import s31.C38423c;
import s31.C38424d;
import s31.C38425e;

/* renamed from: gx0.a */
public final class C36086a {
    /* renamed from: b */
    private final C38422b m107356b(PaymentServiceConfigInputApiModel paymentServiceConfigInputApiModel) {
        boolean z;
        ArrayList arrayList;
        String str;
        String str2;
        String str3;
        String type = paymentServiceConfigInputApiModel.getType();
        Boolean enable = paymentServiceConfigInputApiModel.getEnable();
        String value = paymentServiceConfigInputApiModel.getValue();
        Integer width = paymentServiceConfigInputApiModel.getWidth();
        Boolean submit = paymentServiceConfigInputApiModel.getSubmit();
        if (submit != null) {
            z = submit.booleanValue();
        } else {
            z = true;
        }
        boolean z2 = z;
        Boolean inputOptionBundle = paymentServiceConfigInputApiModel.getInputOptionBundle();
        Boolean isNumeric = paymentServiceConfigInputApiModel.isNumeric();
        String inputName = paymentServiceConfigInputApiModel.getInputName();
        String hint = paymentServiceConfigInputApiModel.getHint();
        String prefix = paymentServiceConfigInputApiModel.getPrefix();
        String errorDesc = paymentServiceConfigInputApiModel.getErrorDesc();
        String validationRegex = paymentServiceConfigInputApiModel.getValidationRegex();
        String dependedInputId = paymentServiceConfigInputApiModel.getDependedInputId();
        String id = paymentServiceConfigInputApiModel.getId();
        String mask = paymentServiceConfigInputApiModel.getMask();
        String name = paymentServiceConfigInputApiModel.getName();
        List<PaymentServiceConfigInputOptionApiModel> inputOption = paymentServiceConfigInputApiModel.getInputOption();
        if (inputOption != null) {
            str3 = id;
            str2 = dependedInputId;
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(inputOption, 10));
            for (PaymentServiceConfigInputOptionApiModel c : inputOption) {
                arrayList2.add(m107357c(c));
                validationRegex = validationRegex;
            }
            str = validationRegex;
            arrayList = arrayList2;
        } else {
            str = validationRegex;
            str2 = dependedInputId;
            str3 = id;
            arrayList = null;
        }
        return new C38422b(type, enable, value, width, z2, inputOptionBundle, isNumeric, inputName, mask, hint, prefix, errorDesc, str, str2, str3, name, arrayList, false, 131072, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    private final C38423c m107357c(PaymentServiceConfigInputOptionApiModel paymentServiceConfigInputOptionApiModel) {
        return new C38423c(paymentServiceConfigInputOptionApiModel.getId(), paymentServiceConfigInputOptionApiModel.getValue(), paymentServiceConfigInputOptionApiModel.getService(), paymentServiceConfigInputOptionApiModel.getAmount(), paymentServiceConfigInputOptionApiModel.isJnr());
    }

    /* renamed from: d */
    private final C38424d m107358d(PaymentServiceConfigJsonApiModel paymentServiceConfigJsonApiModel) {
        ArrayList arrayList;
        String id = paymentServiceConfigJsonApiModel.getId();
        String name = paymentServiceConfigJsonApiModel.getName();
        String description = paymentServiceConfigJsonApiModel.getDescription();
        String logo = paymentServiceConfigJsonApiModel.getLogo();
        String logoSmall = paymentServiceConfigJsonApiModel.getLogoSmall();
        String type = paymentServiceConfigJsonApiModel.getType();
        List<PaymentServiceConfigParameterApiModel> parameter = paymentServiceConfigJsonApiModel.getParameter();
        if (parameter != null) {
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(parameter, 10));
            for (PaymentServiceConfigParameterApiModel e : parameter) {
                arrayList2.add(m107359e(e));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new C38424d(id, name, description, logo, logoSmall, type, arrayList);
    }

    /* renamed from: e */
    private final C38425e m107359e(PaymentServiceConfigParameterApiModel paymentServiceConfigParameterApiModel) {
        ArrayList arrayList;
        String id = paymentServiceConfigParameterApiModel.getId();
        String paramType = paymentServiceConfigParameterApiModel.getParamType();
        String name = paymentServiceConfigParameterApiModel.getName();
        String description = paymentServiceConfigParameterApiModel.getDescription();
        Boolean mandatory = paymentServiceConfigParameterApiModel.getMandatory();
        Boolean successParam = paymentServiceConfigParameterApiModel.getSuccessParam();
        Boolean hidden = paymentServiceConfigParameterApiModel.getHidden();
        List<PaymentServiceConfigInputApiModel> input = paymentServiceConfigParameterApiModel.getInput();
        if (input != null) {
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(input, 10));
            for (PaymentServiceConfigInputApiModel b : input) {
                arrayList2.add(m107356b(b));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new C38425e(id, paramType, name, description, mandatory, successParam, hidden, arrayList);
    }

    /* renamed from: a */
    public final C38421a mo88822a(PaymentConfigDetailsApiModel paymentConfigDetailsApiModel) {
        C41536l.m120489i(paymentConfigDetailsApiModel, "detailsApiModel");
        C38421a aVar = r2;
        C38421a aVar2 = new C38421a(paymentConfigDetailsApiModel.getId(), paymentConfigDetailsApiModel.getServiceId(), paymentConfigDetailsApiModel.getPaymentServiceId(), paymentConfigDetailsApiModel.getServiceType(), paymentConfigDetailsApiModel.getServiceConfig(), paymentConfigDetailsApiModel.getDebtServiceId(), paymentConfigDetailsApiModel.getCommission(), paymentConfigDetailsApiModel.getServiceCategory(), paymentConfigDetailsApiModel.getServiceName(), paymentConfigDetailsApiModel.getChannel(), paymentConfigDetailsApiModel.getOrderingNumber(), paymentConfigDetailsApiModel.getLogo(), paymentConfigDetailsApiModel.getAdditionalData(), paymentConfigDetailsApiModel.getBonusProductTypes(), paymentConfigDetailsApiModel.getPayAmountLimit(), paymentConfigDetailsApiModel.isTemplateAccessAllowed(), paymentConfigDetailsApiModel.isCarTemplateAllowed(), paymentConfigDetailsApiModel.getHasDebt(), paymentConfigDetailsApiModel.getOrderId(), paymentConfigDetailsApiModel.getCategoryColor(), paymentConfigDetailsApiModel.getCategoryIconColor(), paymentConfigDetailsApiModel.getCategoryType(), m107358d(paymentConfigDetailsApiModel.getServiceConfigJson()));
        return aVar;
    }
}
