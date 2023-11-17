package rw0;

import android.app.Activity;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.google.gson.Gson;
import g91.C32289b0;
import g91.C32297d;
import g91.C32315k0;
import g91.C32359z0;
import iu0.C36546y;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.KeyValue;
import p341ge.bog.mobilebank.model.PensionStatusResult;
import p341ge.bog.mobilebank.model.payment.PaymentDebtResponse;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;
import p341ge.bog.mobilebank.model.payment.PaymentServiceConfigInput;
import p341ge.bog.mobilebank.model.payment.PaymentServiceConfigParameter;
import p341ge.bog.mobilebank.model.payment.PaymentsServiceConfigInputOption;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import p341ge.bog.mobilebank.model.template.TemplateBasketParameter;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.payment.model.ConfigParamStyle;
import p341ge.bog.mobilebank.payment.model.ParameterType;
import p341ge.bog.mobilebank.payment.model.PaymentCustomConfiguration;
import p341ge.bog.mobilebank.payment.model.PaymentCustomParameter;
import p366bk.C10328q;
import p380ck.C10463g;
import r90.C27950a;

/* renamed from: rw0.b */
public abstract class C38375b {
    /* renamed from: a */
    public static boolean m112705a(String str, String str2, Activity activity) {
        try {
            if (Integer.parseInt(str) <= Integer.parseInt(str2)) {
                return true;
            }
            C32297d.m95154b(activity, C32359z0.m95557a0(C10328q.bonus_exchange_not_enaough_points));
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static void m112706b(PaymentCustomConfiguration paymentCustomConfiguration, PaymentDebtResponse paymentDebtResponse, boolean z) {
        PaymentCustomParameter customParamByKey;
        String str;
        for (KeyValue keyValue : paymentDebtResponse.getParameter()) {
            PaymentCustomParameter customParamByKey2 = paymentCustomConfiguration.getCustomParamByKey(keyValue.getKey());
            if (customParamByKey2 != null) {
                boolean z2 = !TextUtils.isEmpty(customParamByKey2.getValueToDisplay());
                if (!z2) {
                    str = keyValue.getValue();
                } else {
                    str = customParamByKey2.getValueToDisplay();
                }
                if (paymentCustomConfiguration.getCustomParamCountByKey(keyValue.getKey()) == 1 && !TextUtils.isEmpty(str) && !"amount".equals(customParamByKey2.getId())) {
                    if (customParamByKey2.getStyle().getParameterType() == ParameterType.AMOUNT) {
                        str = C32359z0.m95544O(keyValue.getValue());
                    } else if (customParamByKey2.getStyle().getParameterType() == ParameterType.SELECT) {
                        if (!z2) {
                            str = m112713i(str, customParamByKey2);
                        }
                    } else if (customParamByKey2.getStyle().getMask() != null) {
                        str = C32315k0.m95264m(str, customParamByKey2.getStyle().getMask(), false);
                    }
                    customParamByKey2.setValue(keyValue.getValue());
                    customParamByKey2.setValueToDisplay(str);
                    customParamByKey2.setVisibleInForm(true);
                }
            }
        }
        if (z) {
            Integer valueOf = Integer.valueOf(C32315k0.m95260i(paymentCustomConfiguration.getBaseConfiguration().getServiceConfigJson(), paymentDebtResponse));
            if (valueOf.intValue() > 0 && (customParamByKey = paymentCustomConfiguration.getCustomParamByKey("amount")) != null) {
                m112721q(paymentCustomConfiguration.getBaseConfiguration(), false, customParamByKey, valueOf.toString());
            }
        }
    }

    /* renamed from: c */
    public static PaymentCustomConfiguration m112707c(Client client, PaymentProviderConfiguration paymentProviderConfiguration, PaymentCustomConfiguration paymentCustomConfiguration) {
        return m112708d(client, paymentProviderConfiguration, paymentCustomConfiguration, (ArrayMap) null, (TemplateBasketItem) null);
    }

    /* renamed from: d */
    public static PaymentCustomConfiguration m112708d(Client client, PaymentProviderConfiguration paymentProviderConfiguration, PaymentCustomConfiguration paymentCustomConfiguration, ArrayMap arrayMap, TemplateBasketItem templateBasketItem) {
        int i;
        int i2;
        int i3;
        PaymentCustomParameter paymentCustomParameter;
        PaymentProviderConfiguration paymentProviderConfiguration2 = paymentProviderConfiguration;
        PaymentCustomConfiguration paymentCustomConfiguration2 = new PaymentCustomConfiguration();
        PaymentServiceConfigParameter[] parameter = paymentProviderConfiguration.getServiceConfigJson().getParameter();
        ArrayList arrayList = new ArrayList();
        int isCompany = paymentCustomConfiguration.isCompany();
        if (paymentCustomConfiguration.isTemplate()) {
            isCompany++;
        }
        int i4 = -1;
        for (PaymentServiceConfigParameter paymentServiceConfigParameter : parameter) {
            if (!"commission".equals(paymentServiceConfigParameter.getId()) && paymentServiceConfigParameter.getInput() != null && paymentServiceConfigParameter.getInput().length > 0) {
                int i5 = i4;
                int i6 = 0;
                while (i6 < paymentServiceConfigParameter.getInput().length) {
                    if (!m112720p(paymentServiceConfigParameter.getInput()[i6].getType()) || !(paymentServiceConfigParameter.getParamMask() == null || i6 == 0)) {
                        i = i6;
                        if ("debtButton".equals(paymentServiceConfigParameter.getId()) && i5 != -1) {
                            ((PaymentCustomParameter) arrayList.get(i5)).setDebtVerifiable(true);
                        }
                    } else {
                        if ("amount".equals(paymentServiceConfigParameter.getId()) || "amount_to_pay_with_point".equals(paymentServiceConfigParameter.getId())) {
                            arrayList.add(m112715k(isCompany));
                            i2 = isCompany + 1;
                        } else {
                            i2 = isCompany;
                        }
                        PaymentCustomParameter f = m112710f(i2, paymentServiceConfigParameter, i6);
                        String g = m112711g(paymentServiceConfigParameter, i6, arrayMap);
                        if (!TextUtils.isEmpty(paymentCustomConfiguration.getDefaultCarNumber()) && "carNo".equals(paymentServiceConfigParameter.getId())) {
                            g = paymentCustomConfiguration.getDefaultCarNumber();
                        } else if (!TextUtils.isEmpty(paymentCustomConfiguration.getDefaultPersonalNumber()) && "ownerCode".equals(paymentServiceConfigParameter.getId())) {
                            g = paymentCustomConfiguration.getDefaultPersonalNumber();
                        }
                        if (!TextUtils.isEmpty(paymentCustomConfiguration.getDefaultTicketNumber()) && "ticketNo".equals(paymentServiceConfigParameter.getId())) {
                            g = paymentCustomConfiguration.getDefaultTicketNumber();
                        }
                        String str = g;
                        if (paymentCustomConfiguration.isTemplate()) {
                            i3 = i2;
                            m112723s(paymentProviderConfiguration, paymentServiceConfigParameter, i6, f, str, templateBasketItem);
                            i = i6;
                            paymentCustomParameter = f;
                        } else {
                            paymentCustomParameter = f;
                            i3 = i2;
                            i = i6;
                            m112722r(paymentProviderConfiguration2, paymentServiceConfigParameter, i, paymentCustomParameter, str);
                        }
                        paymentCustomParameter.setId(paymentServiceConfigParameter.getId());
                        if (paymentProviderConfiguration.getServiceConfigJson().isMobileServiceConfig() && "phone".equals(paymentServiceConfigParameter.getId())) {
                            arrayList.add(m112714j(i3));
                            paymentCustomParameter.getStyle().setParameterType(ParameterType.MOBILE);
                            paymentCustomParameter.getStyle().setWeight(0.7f);
                            paymentCustomConfiguration2.setMobile(true);
                        }
                        arrayList.add(paymentCustomParameter);
                        if (paymentCustomParameter.isVisibleInWizard()) {
                            i5 = arrayList.size() - 1;
                        }
                        isCompany = i3 + 1;
                    }
                    i6 = i + 1;
                }
                i4 = i5;
            }
        }
        paymentCustomConfiguration2.setName(C27950a.m86286c(paymentProviderConfiguration.getServiceName(), true));
        paymentCustomConfiguration2.setLogoUrl(C32289b0.m95093e(paymentProviderConfiguration.getLogo()));
        paymentCustomConfiguration2.setParameters(arrayList);
        paymentCustomConfiguration2.setIsCompany(paymentCustomConfiguration.isCompany());
        paymentCustomConfiguration2.setIsTemplate(paymentCustomConfiguration.isTemplate());
        paymentCustomConfiguration2.setDefaultCarNumber(paymentCustomConfiguration.getDefaultCarNumber());
        paymentCustomConfiguration2.setDefaultPersonalNumber(paymentCustomConfiguration.getDefaultPersonalNumber());
        paymentCustomConfiguration2.setDefaultTicketNumber(paymentCustomConfiguration.getDefaultTicketNumber());
        paymentCustomConfiguration2.setBonusType(paymentCustomConfiguration.getBonusType());
        if (paymentCustomConfiguration.isTemplate()) {
            if (paymentCustomConfiguration.getParameters() == null || paymentCustomConfiguration.getParameters().size() <= 0) {
                paymentCustomConfiguration2.getParameters().add(0, m112719o(templateBasketItem, paymentProviderConfiguration2));
            } else {
                paymentCustomConfiguration2.getParameters().add(0, paymentCustomConfiguration.getParameters().get(0));
            }
            paymentCustomConfiguration2.setIsTemplate(true);
        }
        if (paymentCustomConfiguration.isCompany()) {
            if (paymentCustomConfiguration.isCompany()) {
                paymentCustomConfiguration2.setCompanyId(paymentProviderConfiguration.getId());
            }
            int isTemplate = paymentCustomConfiguration2.isTemplate();
            if (paymentCustomConfiguration.getParameters() != null && paymentCustomConfiguration.getParameters().size() > isTemplate && paymentCustomConfiguration2.getParameters() != null && paymentCustomConfiguration.isCompany()) {
                paymentCustomConfiguration2.getParameters().add(isTemplate, paymentCustomConfiguration.getParameters().get(isTemplate));
            }
        }
        paymentCustomConfiguration2.setDebtServiceId(paymentProviderConfiguration.getDebtServiceId());
        paymentCustomConfiguration2.setBaseConfiguration(paymentProviderConfiguration2);
        return paymentCustomConfiguration2;
    }

    /* renamed from: e */
    public static ConfigParamStyle m112709e(PaymentServiceConfigParameter paymentServiceConfigParameter, int i) {
        ParameterType parameterType;
        ConfigParamStyle configParamStyle = new ConfigParamStyle();
        ParameterType parameterType2 = ParameterType.TEXT;
        if ("select".equals(paymentServiceConfigParameter.getInput()[i].getType())) {
            parameterType = ParameterType.SELECT;
        } else {
            parameterType = parameterType2;
        }
        if ("D".equals(paymentServiceConfigParameter.getParamType())) {
            parameterType = ParameterType.AMOUNT;
            configParamStyle.setNeedsDebtFormatting(true);
        }
        if ("text".equals(paymentServiceConfigParameter.getInput()[i].getType()) || !TextUtils.isEmpty(paymentServiceConfigParameter.getParamMask())) {
            configParamStyle.setInputType(BogInputLayout.INPUT_TYPE_TEXT_NO_SUGGESTIONS);
        } else if ("amount".equals(paymentServiceConfigParameter.getInput()[i].getType()) || "amount".equals(paymentServiceConfigParameter.getId())) {
            parameterType2 = ParameterType.AMOUNT;
        } else {
            parameterType2 = parameterType;
        }
        configParamStyle.setMask(paymentServiceConfigParameter.getParamMask());
        configParamStyle.setEditable(paymentServiceConfigParameter.getInput()[i].getEnable().booleanValue());
        configParamStyle.setParameterType(parameterType2);
        return configParamStyle;
    }

    /* renamed from: f */
    public static PaymentCustomParameter m112710f(int i, PaymentServiceConfigParameter paymentServiceConfigParameter, int i2) {
        boolean z;
        boolean z2;
        PaymentServiceConfigInput paymentServiceConfigInput = paymentServiceConfigParameter.getInput()[i2];
        String id = paymentServiceConfigParameter.getId();
        String c = C27950a.m86286c(paymentServiceConfigParameter.getName(), true);
        if (paymentServiceConfigParameter.getInput().length > 1 && paymentServiceConfigParameter.getParamMask() == null) {
            c = C27950a.m86286c(paymentServiceConfigInput.getInputName(), true);
        }
        String str = c;
        ConfigParamStyle e = m112709e(paymentServiceConfigParameter, i2);
        boolean booleanValue = paymentServiceConfigParameter.isMandatory().booleanValue();
        if (!paymentServiceConfigInput.getEnable().booleanValue() || !paymentServiceConfigParameter.isMandatory().booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        PaymentCustomParameter paymentCustomParameter = new PaymentCustomParameter(id, str, e, booleanValue, z, i);
        ConfigParamStyle style = paymentCustomParameter.getStyle();
        if (paymentCustomParameter.isVisibleInWizard() || !"C".equals(paymentServiceConfigParameter.getParamType())) {
            z2 = false;
        } else {
            z2 = true;
        }
        style.setPackages(z2);
        paymentCustomParameter.setInputIndexInRawConfig(i2);
        paymentCustomParameter.setVisibleInForm(paymentServiceConfigParameter.isMandatory().booleanValue());
        if (paymentCustomParameter.getStyle().getParameterType() == ParameterType.SELECT) {
            int length = paymentServiceConfigParameter.getInput()[i2].getInputOption().length;
            PaymentsServiceConfigInputOption[] paymentsServiceConfigInputOptionArr = new PaymentsServiceConfigInputOption[length];
            for (int i3 = 0; i3 < length; i3++) {
                PaymentsServiceConfigInputOption copy = paymentServiceConfigParameter.getInput()[i2].getInputOption()[i3].copy();
                if (paymentServiceConfigInput.getInputOptionBundle()) {
                    copy.setValue(C27950a.m86286c(paymentServiceConfigParameter.getInput()[i2].getInputOption()[i3].getValue(), true));
                }
                paymentsServiceConfigInputOptionArr[i3] = copy;
            }
            paymentCustomParameter.setInputOptions(paymentsServiceConfigInputOptionArr);
        }
        return paymentCustomParameter;
    }

    /* renamed from: g */
    public static String m112711g(PaymentServiceConfigParameter paymentServiceConfigParameter, int i, ArrayMap arrayMap) {
        String[] strArr;
        String value = paymentServiceConfigParameter.getInput()[i].getValue();
        if (arrayMap == null || arrayMap.size() <= 0 || (strArr = (String[]) arrayMap.get(paymentServiceConfigParameter.getId())) == null || strArr.length <= i) {
            return value;
        }
        return strArr[i];
    }

    /* renamed from: h */
    public static String m112712h(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        KeyValue keyValue = new KeyValue("amount", str);
        KeyValue keyValue2 = new KeyValue("essServiceId", "bog-voucher-convert-amt");
        KeyValue keyValue3 = new KeyValue("productType", "PLUS");
        KeyValue keyValue4 = new KeyValue("serviceProviderId", str2);
        arrayList.add(keyValue);
        arrayList.add(keyValue2);
        arrayList.add(keyValue3);
        arrayList.add(keyValue4);
        return new Gson().mo18181w(arrayList);
    }

    /* renamed from: i */
    public static String m112713i(String str, PaymentCustomParameter paymentCustomParameter) {
        String str2 = null;
        if (!(paymentCustomParameter == null || paymentCustomParameter.getInputOptions() == null)) {
            for (PaymentsServiceConfigInputOption paymentsServiceConfigInputOption : paymentCustomParameter.getInputOptions()) {
                if (str.equals(paymentsServiceConfigInputOption.getId())) {
                    str2 = paymentsServiceConfigInputOption.getValue();
                }
            }
        }
        return str2;
    }

    /* renamed from: j */
    private static PaymentCustomParameter m112714j(int i) {
        ConfigParamStyle configParamStyle = new ConfigParamStyle();
        configParamStyle.setParameterType(ParameterType.TEXT);
        configParamStyle.setWeight(0.3f);
        PaymentCustomParameter paymentCustomParameter = new PaymentCustomParameter("PHONE_INDEX_ID", C36546y.m108285N().getString(C10328q.payments_details_title_index), configParamStyle, true, false, i, false);
        C36546y N = C36546y.m108285N();
        int i2 = C10328q.payments_details_text_mobile_index;
        paymentCustomParameter.setValue(N.getString(i2));
        paymentCustomParameter.setValueToDisplay(C36546y.m108285N().getString(i2));
        paymentCustomParameter.setVisibleInForm(true);
        return paymentCustomParameter;
    }

    /* renamed from: k */
    private static PaymentCustomParameter m112715k(int i) {
        ConfigParamStyle configParamStyle = new ConfigParamStyle();
        configParamStyle.setParameterType(ParameterType.SELECT);
        configParamStyle.setEditable(true);
        return new PaymentCustomParameter("bog_package_id", C36546y.m108285N().getString(C10328q.payments_selected_package), configParamStyle, true, false, i);
    }

    /* renamed from: l */
    public static void m112716l(ArrayList arrayList, Client client, String str, Object obj) {
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                KeyValue keyValue = (KeyValue) it.next();
                if (!(keyValue == null || keyValue.getKey() == null || keyValue.getKey().equals("") || keyValue.getValue() == null || keyValue.getValue().equals(""))) {
                    keyValue.setValue(keyValue.getValue().trim());
                    arrayList2.add(keyValue);
                }
            }
            client.requestPaymentDebt(str, new Gson().mo18181w(arrayList2), obj);
        }
    }

    /* renamed from: m */
    public static String m112717m(TemplateBasketItem templateBasketItem) {
        if (templateBasketItem.getTemplateImage() != null) {
            return C32289b0.m95093e(templateBasketItem.getTemplateImage());
        }
        if (templateBasketItem.getLogo() != null) {
            C32289b0.m95093e(templateBasketItem.getLogo());
        }
        return null;
    }

    /* renamed from: n */
    public static String m112718n(TemplateBasketItem templateBasketItem, PaymentProviderConfiguration paymentProviderConfiguration) {
        if (!TextUtils.isEmpty(templateBasketItem.getTemplateName())) {
            return templateBasketItem.getTemplateName();
        }
        if (paymentProviderConfiguration != null) {
            return C27950a.m86286c(paymentProviderConfiguration.getServiceName(), true);
        }
        return "";
    }

    /* renamed from: o */
    public static PaymentCustomParameter m112719o(TemplateBasketItem templateBasketItem, PaymentProviderConfiguration paymentProviderConfiguration) {
        ConfigParamStyle configParamStyle = new ConfigParamStyle();
        configParamStyle.setParameterType(ParameterType.TEXT);
        configParamStyle.setEditable(true);
        PaymentCustomParameter paymentCustomParameter = new PaymentCustomParameter("TEMPLATE_NAME_ID", C36546y.m108285N().getString(C10328q.common_text_template_name), configParamStyle, true, true, 0, false);
        if (!(templateBasketItem == null || paymentProviderConfiguration == null)) {
            String n = m112718n(templateBasketItem, paymentProviderConfiguration);
            paymentCustomParameter.setValue(n);
            paymentCustomParameter.setValueToDisplay(n);
            paymentCustomParameter.setLogoUrl(m112717m(templateBasketItem));
        }
        return paymentCustomParameter;
    }

    /* renamed from: p */
    public static boolean m112720p(String str) {
        if ("text".equals(str) || "amount".equals(str) || "select".equals(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public static void m112721q(PaymentProviderConfiguration paymentProviderConfiguration, boolean z, PaymentCustomParameter paymentCustomParameter, String str) {
        String str2;
        try {
            BigDecimal bigDecimal = new BigDecimal(str);
            if (z) {
                str2 = C32359z0.m95540K(str, true);
            } else {
                bigDecimal = bigDecimal.divide(new BigDecimal(100));
                str2 = C32359z0.m95545P(str, true);
            }
            paymentCustomParameter.setValue(String.valueOf(bigDecimal));
            paymentCustomParameter.setValueToDisplay(String.valueOf(bigDecimal));
            paymentCustomParameter.setValueToDisplayInForm(str2);
        } catch (Exception unused) {
            C10463g.m37989C(String.format(Locale.getDefault(), "%s: %s) ", new Object[]{"amount_or_commission_error_serviceId", paymentProviderConfiguration.getServiceId()}));
        }
    }

    /* renamed from: r */
    public static void m112722r(PaymentProviderConfiguration paymentProviderConfiguration, PaymentServiceConfigParameter paymentServiceConfigParameter, int i, PaymentCustomParameter paymentCustomParameter, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if ("amount".equals(paymentServiceConfigParameter.getId())) {
            m112721q(paymentProviderConfiguration, !"amount".equals(paymentServiceConfigParameter.getInput()[i].getType()), paymentCustomParameter, str);
            return;
        }
        if (paymentCustomParameter.getStyle().getParameterType() == ParameterType.SELECT) {
            str2 = m112713i(str, paymentCustomParameter);
        } else if (paymentCustomParameter.getStyle().getMask() != null) {
            str2 = C32315k0.m95264m(str, paymentCustomParameter.getStyle().getMask(), false);
        } else {
            str2 = str;
        }
        paymentCustomParameter.setValueToDisplay(str2);
        paymentCustomParameter.setValue(str);
    }

    /* renamed from: s */
    private static void m112723s(PaymentProviderConfiguration paymentProviderConfiguration, PaymentServiceConfigParameter paymentServiceConfigParameter, int i, PaymentCustomParameter paymentCustomParameter, String str, TemplateBasketItem templateBasketItem) {
        int i2;
        if (!(templateBasketItem == null || templateBasketItem.getTemplateParameters() == null || templateBasketItem.getTemplateParameters().size() <= 0)) {
            int i3 = i + 1;
            if (paymentServiceConfigParameter.getParamMask() != null) {
                i3 = paymentServiceConfigParameter.getInput().length + i;
            }
            String str2 = null;
            String str3 = null;
            for (int i4 = i; i4 < i3; i4++) {
                for (TemplateBasketParameter next : templateBasketItem.getTemplateParameters()) {
                    if (!TextUtils.isEmpty(next.getParameterValue()) && !TextUtils.isEmpty(next.getParameterKey())) {
                        if ((PensionStatusResult.STATUS_ACTIVE.equals(next.getParameterType()) || "amount".equals(next.getParameterKey())) && next.getParameterKey().equals(paymentServiceConfigParameter.getId())) {
                            int parameterIndex = next.getParameterIndex();
                            if (i3 - i == 1) {
                                i2 = i4;
                            } else {
                                i2 = i4 - i;
                            }
                            if (parameterIndex == i2) {
                                if ("amount".equals(next.getParameterKey())) {
                                    if (PensionStatusResult.STATUS_ACTIVE.equals(next.getParameterType())) {
                                        str3 = next.getParameterValue();
                                    }
                                    if (str3 == null) {
                                        str2 = next.getParameterValue();
                                    } else {
                                        str2 = str3;
                                    }
                                } else if (str2 == null) {
                                    str2 = next.getParameterValue();
                                } else {
                                    str2 = str2.concat(next.getParameterValue());
                                }
                            }
                        }
                    }
                }
            }
            str = str2;
        }
        m112722r(paymentProviderConfiguration, paymentServiceConfigParameter, i, paymentCustomParameter, str);
    }
}
