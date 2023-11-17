package rw0;

import android.text.TextUtils;
import androidx.collection.ArrayMap;
import f91.C31972b;
import g91.C32315k0;
import g91.C32319m;
import g91.C32359z0;
import iu0.C36546y;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.KeyValue;
import p341ge.bog.mobilebank.model.ddsto.DDDebitService;
import p341ge.bog.mobilebank.model.ddsto.DDPaymentAccount;
import p341ge.bog.mobilebank.model.ddsto.DDPaymentDetails;
import p341ge.bog.mobilebank.model.ddsto.DDProviderItem;
import p341ge.bog.mobilebank.model.ddsto.STOPeriodType;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;
import p341ge.bog.mobilebank.model.payment.PaymentServiceConfigParameter;
import p341ge.bog.mobilebank.model.payment.PaymentsServiceConfigInputOption;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import p341ge.bog.mobilebank.payment.model.ConfigParamStyle;
import p341ge.bog.mobilebank.payment.model.ParameterType;
import p341ge.bog.mobilebank.payment.model.PaymentCustomConfiguration;
import p341ge.bog.mobilebank.payment.model.PaymentCustomParameter;
import p366bk.C10328q;
import r90.C27950a;

/* renamed from: rw0.a */
public abstract class C38374a {
    /* renamed from: a */
    private static void m112679a(PaymentCustomConfiguration paymentCustomConfiguration, String str) {
        PaymentCustomParameter k = m112689k("DD_NAME_ID", C36546y.m108285N().getString(C10328q.sto_title_name), 0, ParameterType.TEXT);
        if (!TextUtils.isEmpty(str)) {
            k.setValue(str);
            k.setValueToDisplay(str);
        }
        paymentCustomConfiguration.getParameters().add(0, k);
        k.setVisibleInWizardAndForm(true);
        for (int i = 1; i < paymentCustomConfiguration.getParameters().size(); i++) {
            PaymentCustomParameter paymentCustomParameter = paymentCustomConfiguration.getParameters().get(i);
            paymentCustomParameter.setRowNum(paymentCustomParameter.getRowNum() + 1);
        }
    }

    /* renamed from: b */
    private static void m112680b(PaymentCustomParameter paymentCustomParameter, ArrayList arrayList) {
        String str;
        boolean z;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            if (paymentCustomParameter.getInputOptions() != null && paymentCustomParameter.getInputOptions().length > 0) {
                for (PaymentsServiceConfigInputOption paymentsServiceConfigInputOption : paymentCustomParameter.getInputOptions()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = true;
                            break;
                        }
                        if (((DDPaymentAccount) it.next()).acctKey == Long.valueOf(paymentsServiceConfigInputOption.getId()).longValue()) {
                            arrayList2.add(paymentsServiceConfigInputOption);
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        arrayList3.add(paymentsServiceConfigInputOption);
                    }
                }
            }
            paymentCustomParameter.setValue(String.valueOf(arrayList2.size()));
            String str2 = "";
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                DDPaymentAccount dDPaymentAccount = (DDPaymentAccount) arrayList.get(size);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    PaymentsServiceConfigInputOption paymentsServiceConfigInputOption2 = (PaymentsServiceConfigInputOption) it2.next();
                    if (dDPaymentAccount.acctKey == Long.valueOf(paymentsServiceConfigInputOption2.getId()).longValue()) {
                        arrayList3.add(0, paymentsServiceConfigInputOption2);
                        if (!TextUtils.isEmpty(paymentsServiceConfigInputOption2.getValue())) {
                            String value = paymentsServiceConfigInputOption2.getValue();
                            if (str2.equals("")) {
                                str = "";
                            } else {
                                str = "\n";
                            }
                            str2 = value.concat(str).concat(str2);
                        }
                    }
                }
            }
            paymentCustomParameter.setValueToDisplay(str2);
            paymentCustomParameter.setInputOptions((PaymentsServiceConfigInputOption[]) arrayList3.toArray(new PaymentsServiceConfigInputOption[arrayList3.size()]));
        }
    }

    /* renamed from: c */
    public static void m112681c(PaymentCustomConfiguration paymentCustomConfiguration, DDPaymentDetails dDPaymentDetails) {
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        Long l;
        boolean isTopup = dDPaymentDetails.isTopup();
        PaymentCustomParameter customParamByKey = paymentCustomConfiguration.getCustomParamByKey("DD_NAME_ID");
        if (customParamByKey != null) {
            customParamByKey.setValue(dDPaymentDetails.orderName);
            customParamByKey.setValueToDisplay(dDPaymentDetails.orderName);
        }
        PaymentCustomParameter customParamByKey2 = paymentCustomConfiguration.getCustomParamByKey("DD_END_DATE_ID");
        if (!(customParamByKey2 == null || (l = dDPaymentDetails.endDate) == null)) {
            customParamByKey2.setValue(String.valueOf(l));
            customParamByKey2.setValueToDisplay(C32319m.m95297d(dDPaymentDetails.endDate.longValue(), "dd.MM.yyyy"));
        }
        PaymentCustomParameter customParamByKey3 = paymentCustomConfiguration.getCustomParamByKey("DD_ACCTS_ID");
        if (customParamByKey3 != null) {
            m112680b(customParamByKey3, dDPaymentDetails.paymentAccounts);
        }
        PaymentCustomParameter customParamByKey4 = paymentCustomConfiguration.getCustomParamByKey("amount");
        if (!(customParamByKey4 == null || (bigDecimal2 = dDPaymentDetails.amount) == null)) {
            customParamByKey4.setValue(bigDecimal2.toString());
            customParamByKey4.setValueToDisplay(dDPaymentDetails.amount.toString());
            customParamByKey4.setValueToDisplayInForm(C32359z0.m95540K(dDPaymentDetails.amount.toString(), true));
        }
        if (isTopup) {
            PaymentCustomParameter customParamByKey5 = paymentCustomConfiguration.getCustomParamByKey("DD_MIN_LIMIT_ID");
            if (customParamByKey5 != null && (bigDecimal = dDPaymentDetails.thresholdAmount) != null) {
                customParamByKey5.setValue(bigDecimal.toString());
                customParamByKey5.setValueToDisplay(dDPaymentDetails.thresholdAmount.toString());
                customParamByKey5.setValueToDisplayInForm(C32359z0.m95540K(dDPaymentDetails.thresholdAmount.toString(), true));
                return;
            }
            return;
        }
        PaymentCustomParameter customParamByKey6 = paymentCustomConfiguration.getCustomParamByKey("DD_START_DATE_ID");
        if (customParamByKey6 != null) {
            customParamByKey6.setValue(String.valueOf(dDPaymentDetails.nextSentDate));
            customParamByKey6.setValueToDisplay(C32319m.m95297d(dDPaymentDetails.nextSentDate.longValue(), "dd.MM.yyyy"));
        }
        PaymentCustomParameter customParamByKey7 = paymentCustomConfiguration.getCustomParamByKey("DD_PERIOD_ID");
        if (customParamByKey7 != null) {
            customParamByKey7.setValue(String.valueOf(dDPaymentDetails.periodType));
            customParamByKey7.setValueToDisplay(C38375b.m112713i(dDPaymentDetails.periodType, customParamByKey7));
        }
        PaymentCustomParameter customParamByKey8 = paymentCustomConfiguration.getCustomParamByKey("DD_TYPES_SELECTOR_ID");
        if (customParamByKey8 != null) {
            customParamByKey8.setValue(String.valueOf(dDPaymentDetails.type));
            customParamByKey8.setValueToDisplay(C38375b.m112713i(dDPaymentDetails.type, customParamByKey8));
        }
    }

    /* renamed from: d */
    private static void m112682d(PaymentCustomConfiguration paymentCustomConfiguration, Client client, DDProviderItem dDProviderItem) {
        ArrayList<DDDebitService> arrayList;
        if (dDProviderItem != null && (arrayList = dDProviderItem.debitService) != null && arrayList.size() > 1) {
            String u = m112699u(paymentCustomConfiguration.getBaseConfiguration());
            if (!TextUtils.isEmpty(u)) {
                PaymentCustomParameter customParamByKey = paymentCustomConfiguration.getCustomParamByKey(u);
                if (customParamByKey.getInputOptions() != null && customParamByKey.getInputOptions().length > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    for (PaymentsServiceConfigInputOption paymentsServiceConfigInputOption : customParamByKey.getInputOptions()) {
                        Iterator<DDDebitService> it = dDProviderItem.debitService.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            DDDebitService next = it.next();
                            if (!TextUtils.isEmpty(paymentsServiceConfigInputOption.getId()) && paymentsServiceConfigInputOption.getId().equals(next.subServiceId)) {
                                arrayList2.add(paymentsServiceConfigInputOption);
                                break;
                            }
                        }
                    }
                    customParamByKey.setInputOptions((PaymentsServiceConfigInputOption[]) arrayList2.toArray(new PaymentsServiceConfigInputOption[arrayList2.size()]));
                }
            }
        }
    }

    /* renamed from: e */
    public static void m112683e(PaymentCustomConfiguration paymentCustomConfiguration) {
        PaymentCustomParameter customParamByKey = paymentCustomConfiguration.getCustomParamByKey("DD_TYPES_SELECTOR_ID");
        if (customParamByKey != null) {
            PaymentCustomParameter customParamByKey2 = paymentCustomConfiguration.getCustomParamByKey("amount");
            PaymentCustomParameter customParamByKey3 = paymentCustomConfiguration.getCustomParamByKey("DD_START_DATE_ID");
            PaymentCustomParameter customParamByKey4 = paymentCustomConfiguration.getCustomParamByKey("DD_END_DATE_ID");
            PaymentCustomParameter customParamByKey5 = paymentCustomConfiguration.getCustomParamByKey("DD_PERIOD_ID");
            PaymentCustomParameter customParamByKey6 = paymentCustomConfiguration.getCustomParamByKey("DD_ACCTS_ID");
            String value = customParamByKey.getValue();
            if ("F".equals(value) || "V".equals(value) || "M".equals(value)) {
                customParamByKey3.setVisibleInWizardAndForm(true);
                customParamByKey4.setVisibleInWizardAndForm(true);
                customParamByKey5.setVisibleInWizardAndForm(true);
                customParamByKey6.setVisibleInWizardAndForm(true);
                customParamByKey2.setVisibleInWizardAndForm("F".equals(value));
            }
        }
    }

    /* renamed from: f */
    public static void m112684f(String str, PaymentCustomConfiguration paymentCustomConfiguration) {
        PaymentCustomParameter customParamByKey = paymentCustomConfiguration.getCustomParamByKey(str);
        if (customParamByKey != null && !TextUtils.isEmpty(customParamByKey.getValue())) {
            customParamByKey.setValueToDisplayInForm(C32359z0.m95540K(String.valueOf(new BigDecimal(customParamByKey.getValue()).setScale(2, 1)), true));
        }
    }

    /* renamed from: g */
    public static PaymentCustomConfiguration m112685g(Client client, PaymentProviderConfiguration paymentProviderConfiguration, PaymentCustomConfiguration paymentCustomConfiguration, ArrayMap arrayMap, TemplateBasketItem templateBasketItem, boolean z, DDProviderItem dDProviderItem, String str) {
        PaymentCustomConfiguration d = C38375b.m112708d(client, paymentProviderConfiguration, paymentCustomConfiguration, arrayMap, templateBasketItem);
        if (dDProviderItem == null) {
            dDProviderItem = m112693o(d.getServiceId(), client.getDDProviders());
        }
        m112704z(d);
        m112703y(client, d, z, dDProviderItem, str);
        m112682d(d, client, dDProviderItem);
        return d;
    }

    /* renamed from: h */
    public static PaymentCustomConfiguration m112686h(Client client, PaymentProviderConfiguration paymentProviderConfiguration, PaymentCustomConfiguration paymentCustomConfiguration, boolean z) {
        return m112685g(client, paymentProviderConfiguration, paymentCustomConfiguration, (ArrayMap) null, (TemplateBasketItem) null, z, (DDProviderItem) null, (String) null);
    }

    /* renamed from: i */
    public static String m112687i(PaymentCustomConfiguration paymentCustomConfiguration) {
        String str;
        String str2;
        String t = m112698t(paymentCustomConfiguration.getBaseConfiguration());
        PaymentServiceConfigParameter s = m112697s(paymentCustomConfiguration.getBaseConfiguration());
        if (s != null) {
            str = s.getId();
        } else {
            str = null;
        }
        String str3 = "";
        if (t == null && str == null) {
            str2 = str3;
        } else {
            String str4 = str3;
            for (PaymentCustomParameter next : paymentCustomConfiguration.getParameters()) {
                if (next.getId() != null && !TextUtils.isEmpty(next.getValue())) {
                    if (next.getId().equals(t)) {
                        str3 = str3.concat(next.getValue());
                    } else if (next.getId().equals(str)) {
                        str4 = next.getValue();
                    }
                }
            }
            str2 = str3;
            str3 = str4;
        }
        return str3.concat(str2);
    }

    /* renamed from: j */
    private static PaymentCustomParameter m112688j(ArrayList arrayList, int i) {
        ArrayList r = m112696r(arrayList);
        PaymentsServiceConfigInputOption[] paymentsServiceConfigInputOptionArr = new PaymentsServiceConfigInputOption[r.size()];
        for (int i2 = 0; i2 < r.size(); i2++) {
            paymentsServiceConfigInputOptionArr[i2] = new PaymentsServiceConfigInputOption(C31972b.m94383h((DDPaymentAccount) r.get(i2)), String.valueOf(((DDPaymentAccount) r.get(i2)).acctKey));
        }
        return m112690l("DD_ACCTS_ID", C36546y.m108285N().getString(C10328q.sto_title_from), i, ParameterType.SELECT_MULTIPLE, paymentsServiceConfigInputOptionArr);
    }

    /* renamed from: k */
    public static PaymentCustomParameter m112689k(String str, String str2, int i, ParameterType parameterType) {
        return m112690l(str, str2, i, parameterType, (PaymentsServiceConfigInputOption[]) null);
    }

    /* renamed from: l */
    public static PaymentCustomParameter m112690l(String str, String str2, int i, ParameterType parameterType, PaymentsServiceConfigInputOption[] paymentsServiceConfigInputOptionArr) {
        ConfigParamStyle configParamStyle = new ConfigParamStyle();
        configParamStyle.setEditable(true);
        configParamStyle.setParameterType(parameterType);
        PaymentCustomParameter paymentCustomParameter = new PaymentCustomParameter(str, str2, configParamStyle, true, false, i);
        paymentCustomParameter.setVisibleInWizardAndForm(false);
        if (paymentCustomParameter.getStyle().getParameterType() == ParameterType.SELECT || paymentCustomParameter.getStyle().getParameterType() == ParameterType.SELECT_MULTIPLE) {
            paymentCustomParameter.setInputOptions(paymentsServiceConfigInputOptionArr);
        }
        paymentCustomParameter.setNotNeededForDebtVerify(true);
        paymentCustomParameter.setMandatory(true);
        return paymentCustomParameter;
    }

    /* renamed from: m */
    public static DDPaymentDetails m112691m(PaymentCustomConfiguration paymentCustomConfiguration, DDProviderItem dDProviderItem, boolean z) {
        DDPaymentDetails dDPaymentDetails = new DDPaymentDetails();
        PaymentCustomParameter customParamByKey = paymentCustomConfiguration.getCustomParamByKey("DD_NAME_ID");
        if (customParamByKey != null && customParamByKey.isVisibleInForm()) {
            dDPaymentDetails.orderName = customParamByKey.getValueToDisplay();
        }
        PaymentCustomParameter customParamByKey2 = paymentCustomConfiguration.getCustomParamByKey("DD_END_DATE_ID");
        if (customParamByKey2 != null && customParamByKey2.isVisibleInForm() && !TextUtils.isEmpty(customParamByKey2.getValue())) {
            dDPaymentDetails.endDate = Long.valueOf(customParamByKey2.getValue());
        }
        PaymentCustomParameter customParamByKey3 = paymentCustomConfiguration.getCustomParamByKey("DD_ACCTS_ID");
        if (customParamByKey3 != null && customParamByKey3.isVisibleInForm()) {
            dDPaymentDetails.paymentAccounts = m112700v(paymentCustomConfiguration);
        }
        PaymentCustomParameter customParamByKey4 = paymentCustomConfiguration.getCustomParamByKey("amount");
        if (customParamByKey4 != null && customParamByKey4.isVisibleInForm() && !TextUtils.isEmpty(customParamByKey4.getValue())) {
            dDPaymentDetails.amount = new BigDecimal(customParamByKey4.getValue());
        }
        dDPaymentDetails.customerIdentification = m112687i(paymentCustomConfiguration);
        dDPaymentDetails.subServiceId = m112701w(paymentCustomConfiguration, dDProviderItem);
        dDPaymentDetails.providerId = Long.valueOf(dDProviderItem.idProvider);
        if (z) {
            PaymentCustomParameter customParamByKey5 = paymentCustomConfiguration.getCustomParamByKey("DD_MIN_LIMIT_ID");
            if (customParamByKey5 != null && customParamByKey5.isVisibleInForm() && !TextUtils.isEmpty(customParamByKey5.getValue())) {
                dDPaymentDetails.thresholdAmount = new BigDecimal(customParamByKey5.getValue());
            }
        } else {
            PaymentCustomParameter customParamByKey6 = paymentCustomConfiguration.getCustomParamByKey("DD_PERIOD_ID");
            if (customParamByKey6 != null && customParamByKey6.isVisibleInForm()) {
                dDPaymentDetails.periodType = customParamByKey6.getValue();
            }
            PaymentCustomParameter customParamByKey7 = paymentCustomConfiguration.getCustomParamByKey("DD_TYPES_SELECTOR_ID");
            if (customParamByKey7 == null || !customParamByKey7.isVisibleInForm()) {
                dDPaymentDetails.type = "F";
            } else {
                dDPaymentDetails.type = customParamByKey7.getValue();
            }
            PaymentCustomParameter customParamByKey8 = paymentCustomConfiguration.getCustomParamByKey("DD_START_DATE_ID");
            if (customParamByKey8 != null && customParamByKey8.isVisibleInForm() && !TextUtils.isEmpty(customParamByKey8.getValue())) {
                dDPaymentDetails.nextSentDate = Long.valueOf(customParamByKey8.getValue());
            }
        }
        return dDPaymentDetails;
    }

    /* renamed from: n */
    private static PaymentCustomParameter m112692n(ArrayList arrayList, int i) {
        PaymentsServiceConfigInputOption[] paymentsServiceConfigInputOptionArr = new PaymentsServiceConfigInputOption[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            paymentsServiceConfigInputOptionArr[i2] = new PaymentsServiceConfigInputOption(C27950a.m86284a(((STOPeriodType) arrayList.get(i2)).dictionaryKey), ((STOPeriodType) arrayList.get(i2)).periodType);
        }
        return m112690l("DD_PERIOD_ID", C36546y.m108285N().getString(C10328q.dd_title_period), i, ParameterType.SELECT, paymentsServiceConfigInputOptionArr);
    }

    /* renamed from: o */
    public static DDProviderItem m112693o(String str, ArrayList arrayList) {
        if (!TextUtils.isEmpty(str)) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                DDProviderItem dDProviderItem = (DDProviderItem) it.next();
                if (str.equals(dDProviderItem.providerServiceId)) {
                    return dDProviderItem;
                }
            }
        }
        return null;
    }

    /* renamed from: p */
    public static DDProviderItem m112694p(String str, ArrayList arrayList, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                DDProviderItem dDProviderItem = (DDProviderItem) it.next();
                if (str.equals(dDProviderItem.providerServiceId) && str2.equals(dDProviderItem.providerOptionId)) {
                    return dDProviderItem;
                }
            }
        }
        return null;
    }

    /* renamed from: q */
    public static ArrayMap m112695q(PaymentProviderConfiguration paymentProviderConfiguration, DDPaymentDetails dDPaymentDetails, DDProviderItem dDProviderItem) {
        if (dDPaymentDetails == null) {
            return null;
        }
        String str = dDPaymentDetails.customerIdentification;
        ArrayList arrayList = new ArrayList();
        PaymentServiceConfigParameter s = m112697s(paymentProviderConfiguration);
        if (s != null) {
            int i = 0;
            PaymentsServiceConfigInputOption[] inputOption = s.getInput()[0].getInputOption();
            int length = inputOption.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                PaymentsServiceConfigInputOption paymentsServiceConfigInputOption = inputOption[i];
                if (paymentsServiceConfigInputOption.getId() != null && str.length() >= paymentsServiceConfigInputOption.getId().length() && str.startsWith(paymentsServiceConfigInputOption.getId())) {
                    String id = paymentsServiceConfigInputOption.getId();
                    arrayList.add(new KeyValue(s.getId(), id));
                    str = str.substring(id.length(), str.length());
                    break;
                }
                i++;
            }
        }
        String t = m112698t(paymentProviderConfiguration);
        if (t != null) {
            arrayList.add(new KeyValue(t, str));
        }
        String u = m112699u(paymentProviderConfiguration);
        if (!TextUtils.isEmpty(u)) {
            String str2 = dDProviderItem.providerOptionId;
            if (str2 != null) {
                arrayList.add(new KeyValue(u, str2));
            } else if (!TextUtils.isEmpty(dDPaymentDetails.subServiceId)) {
                arrayList.add(new KeyValue(u, dDPaymentDetails.subServiceId));
            }
        }
        BigDecimal bigDecimal = dDPaymentDetails.amount;
        if (bigDecimal != null) {
            arrayList.add(new KeyValue("amount", bigDecimal.toString()));
        }
        return C32315k0.m95273v(arrayList, paymentProviderConfiguration.getServiceConfigJson(), paymentProviderConfiguration.isHasDebt());
    }

    /* renamed from: r */
    private static ArrayList m112696r(ArrayList arrayList) {
        ArrayMap arrayMap = new ArrayMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            DDPaymentAccount dDPaymentAccount = (DDPaymentAccount) it.next();
            arrayMap.put(Long.valueOf(dDPaymentAccount.acctKey), dDPaymentAccount);
        }
        return new ArrayList(arrayMap.values());
    }

    /* renamed from: s */
    private static PaymentServiceConfigParameter m112697s(PaymentProviderConfiguration paymentProviderConfiguration) {
        for (PaymentServiceConfigParameter paymentServiceConfigParameter : paymentProviderConfiguration.getServiceConfigJson().getParameter()) {
            if (paymentServiceConfigParameter.isMandatory().booleanValue() && !"S".equals(paymentServiceConfigParameter.getParamType()) && !TextUtils.isEmpty(paymentServiceConfigParameter.getId()) && paymentServiceConfigParameter.getInput() != null && paymentServiceConfigParameter.getInput().length == 1 && "select".equals(paymentServiceConfigParameter.getInput()[0].getType())) {
                return paymentServiceConfigParameter;
            }
        }
        return null;
    }

    /* renamed from: t */
    private static String m112698t(PaymentProviderConfiguration paymentProviderConfiguration) {
        for (PaymentServiceConfigParameter paymentServiceConfigParameter : paymentProviderConfiguration.getServiceConfigJson().getParameter()) {
            if (paymentServiceConfigParameter != null && paymentServiceConfigParameter.isMandatory().booleanValue() && !TextUtils.isEmpty(paymentServiceConfigParameter.getId()) && !"amount".equals(paymentServiceConfigParameter.getId()) && paymentServiceConfigParameter.getInput() != null && paymentServiceConfigParameter.getInput().length > 0 && (paymentServiceConfigParameter.getInput().length != 1 || !"select".equals(paymentServiceConfigParameter.getInput()[0].getType()))) {
                return paymentServiceConfigParameter.getId();
            }
        }
        return null;
    }

    /* renamed from: u */
    public static String m112699u(PaymentProviderConfiguration paymentProviderConfiguration) {
        for (PaymentServiceConfigParameter paymentServiceConfigParameter : paymentProviderConfiguration.getServiceConfigJson().getParameter()) {
            if (paymentServiceConfigParameter != null && !TextUtils.isEmpty(paymentServiceConfigParameter.getId()) && "S".equals(paymentServiceConfigParameter.getParamType())) {
                return paymentServiceConfigParameter.getId();
            }
        }
        return null;
    }

    /* renamed from: v */
    private static ArrayList m112700v(PaymentCustomConfiguration paymentCustomConfiguration) {
        ArrayList arrayList = new ArrayList();
        PaymentCustomParameter customParamByKey = paymentCustomConfiguration.getCustomParamByKey("DD_ACCTS_ID");
        if (customParamByKey != null && !TextUtils.isEmpty(customParamByKey.getValue())) {
            int intValue = Integer.valueOf(customParamByKey.getValue()).intValue();
            for (int i = 0; i < intValue; i++) {
                DDPaymentAccount dDPaymentAccount = new DDPaymentAccount();
                dDPaymentAccount.acctKey = Long.valueOf(customParamByKey.getInputOptions()[i].getId()).longValue();
                arrayList.add(dDPaymentAccount);
            }
        }
        return arrayList;
    }

    /* renamed from: w */
    private static String m112701w(PaymentCustomConfiguration paymentCustomConfiguration, DDProviderItem dDProviderItem) {
        PaymentCustomParameter customParamByKey;
        ArrayList<DDDebitService> arrayList = dDProviderItem.debitService;
        if (arrayList != null && arrayList.size() == 1) {
            return dDProviderItem.debitService.get(0).subServiceId;
        }
        String u = m112699u(paymentCustomConfiguration.getBaseConfiguration());
        if (u == null || (customParamByKey = paymentCustomConfiguration.getCustomParamByKey(u)) == null) {
            return null;
        }
        return customParamByKey.getValue();
    }

    /* renamed from: x */
    public static PaymentCustomParameter m112702x(int i, DDProviderItem dDProviderItem) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new PaymentsServiceConfigInputOption(C36546y.m108285N().getString(C10328q.dd_fixed), "F"));
        if (dDProviderItem.areBothDDTypesAllowed()) {
            arrayList.add(new PaymentsServiceConfigInputOption(C36546y.m108285N().getString(C10328q.dd_automatic), "V"));
        }
        if (dDProviderItem.isMinPaymentAllowed()) {
            arrayList.add(new PaymentsServiceConfigInputOption(C36546y.m108285N().getString(C10328q.dd_min_payment), "M"));
        }
        PaymentCustomParameter l = m112690l("DD_TYPES_SELECTOR_ID", C36546y.m108285N().getString(C10328q.dd_select_payment_type), i, ParameterType.SELECT, (PaymentsServiceConfigInputOption[]) arrayList.toArray(new PaymentsServiceConfigInputOption[arrayList.size()]));
        l.setVisibleInWizardAndForm(true);
        return l;
    }

    /* renamed from: y */
    private static void m112703y(Client client, PaymentCustomConfiguration paymentCustomConfiguration, boolean z, DDProviderItem dDProviderItem, String str) {
        boolean z2;
        int i;
        boolean z3;
        if (paymentCustomConfiguration.getParameters() != null && paymentCustomConfiguration.getParameters().size() > 0) {
            boolean z4 = false;
            if (dDProviderItem.areBothDDTypesAllowed() || dDProviderItem.isMinPaymentAllowed()) {
                z2 = true;
            } else {
                z2 = false;
            }
            m112679a(paymentCustomConfiguration, str);
            PaymentCustomParameter remove = paymentCustomConfiguration.getParameters().remove(paymentCustomConfiguration.getParameters().size() - 1);
            remove.setVisibleInWizardAndForm(!z2);
            int rowNum = remove.getRowNum();
            if (z) {
                int i2 = rowNum + 1;
                PaymentCustomParameter k = m112689k("DD_MIN_LIMIT_ID", C36546y.m108285N().getString(C10328q.dd_minimal_limit), rowNum, ParameterType.AMOUNT);
                k.setVisibleInWizardAndForm(true);
                paymentCustomConfiguration.getParameters().add(k);
                i = i2 + 1;
                remove.setRowNum(i2);
                paymentCustomConfiguration.getParameters().add(remove);
                remove.setVisibleInWizardAndForm(true);
            } else {
                if (z2) {
                    paymentCustomConfiguration.getParameters().add(m112702x(rowNum, dDProviderItem));
                    rowNum++;
                }
                int i3 = rowNum + 1;
                remove.setRowNum(rowNum);
                paymentCustomConfiguration.getParameters().add(remove);
                int i4 = i3 + 1;
                PaymentCustomParameter n = m112692n(client.getDDPeriodTypes(), i3);
                n.setVisibleInWizardAndForm(!z2);
                paymentCustomConfiguration.getParameters().add(n);
                PaymentCustomParameter k2 = m112689k("DD_START_DATE_ID", C36546y.m108285N().getString(C10328q.sto_title_start_date), i4, ParameterType.CALENDAR);
                k2.setVisibleInWizardAndForm(!z2);
                paymentCustomConfiguration.getParameters().add(k2);
                i = i4 + 1;
            }
            int i5 = i + 1;
            PaymentCustomParameter k3 = m112689k("DD_END_DATE_ID", C36546y.m108285N().getString(C10328q.sto_title_service_end), i, ParameterType.CALENDAR);
            paymentCustomConfiguration.getParameters().add(k3);
            if (!z2 || z) {
                z3 = true;
            } else {
                z3 = false;
            }
            k3.setVisibleInWizardAndForm(z3);
            PaymentCustomParameter j = m112688j(client.getDDPaymentAccounts(), i5);
            if (!z2 || z) {
                z4 = true;
            }
            j.setVisibleInWizardAndForm(z4);
            paymentCustomConfiguration.getParameters().add(j);
        }
    }

    /* renamed from: z */
    private static void m112704z(PaymentCustomConfiguration paymentCustomConfiguration) {
        if (paymentCustomConfiguration != null && paymentCustomConfiguration.getParameters() != null && paymentCustomConfiguration.getParameters().size() > 0) {
            for (PaymentCustomParameter next : paymentCustomConfiguration.getParameters()) {
                if (next.getStyle() != null) {
                    next.getStyle().setPackages(false);
                }
            }
        }
    }
}
