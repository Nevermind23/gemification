package rw0;

import android.text.TextUtils;
import g91.C32289b0;
import g91.C32303f;
import iu0.C36546y;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.KeyValue;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;
import p341ge.bog.mobilebank.model.payment.PaymentsServiceConfigInputOption;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import p341ge.bog.mobilebank.model.template.TemplateBasketParameter;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.p975ui.wizard.controllers.BaseWizardPlugin;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardSubTemplateObject;
import p341ge.bog.mobilebank.payment.controllers.wizard.DDPaymentWizardPlugin;
import p341ge.bog.mobilebank.payment.model.ParameterType;
import p341ge.bog.mobilebank.payment.model.PaymentCustomConfiguration;
import p341ge.bog.mobilebank.payment.model.PaymentCustomParameter;
import p366bk.C10328q;
import r90.C27950a;

/* renamed from: rw0.g */
public abstract class C38380g {
    /* renamed from: a */
    public static void m112734a(PaymentCustomParameter paymentCustomParameter, WizardObject wizardObject) {
        ArrayList arrayList = new ArrayList();
        for (PaymentsServiceConfigInputOption paymentsServiceConfigInputOption : paymentCustomParameter.getInputOptions()) {
            WizardSubTemplateObject wizardSubTemplateObject = new WizardSubTemplateObject();
            wizardSubTemplateObject.title = C27950a.m86286c(paymentsServiceConfigInputOption.getValue(), true);
            wizardSubTemplateObject.imageUrl = C32289b0.m95092d(paymentsServiceConfigInputOption.getService());
            wizardSubTemplateObject.preview = C32303f.m95204o(paymentsServiceConfigInputOption.getAmount() / 100.0d);
            wizardSubTemplateObject.subTitle = wizardSubTemplateObject.preview + " ₾";
            wizardSubTemplateObject.value = paymentsServiceConfigInputOption.getId();
            arrayList.add(wizardSubTemplateObject);
        }
        wizardObject.setSubTemplateObjects(arrayList);
    }

    /* renamed from: b */
    public static BigDecimal m112735b(String str) {
        String[] split;
        if (TextUtils.isEmpty(str) || (str.contains(".") && (split = str.split("\\.")) != null && split.length > 1 && split[1].length() > 2)) {
            return null;
        }
        try {
            BigDecimal scale = new BigDecimal(str).multiply(new BigDecimal(100)).setScale(0, 1);
            if (scale.compareTo(new BigDecimal(0)) == 1) {
                return scale;
            }
            return null;
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public static int m112736c(PaymentCustomConfiguration paymentCustomConfiguration, BaseWizardPlugin baseWizardPlugin) {
        int i = 0;
        if (paymentCustomConfiguration.isTemplate() && paymentCustomConfiguration.getParameters().get(0).isVisibleInWizard()) {
            i = 1;
        }
        if (baseWizardPlugin instanceof DDPaymentWizardPlugin) {
            return i + 1;
        }
        return i;
    }

    /* renamed from: d */
    public static ArrayList m112737d(Client client) {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator<TemplateBasketItem> it = client.getTemplateBasketItemsWithConfig().getTemplates().iterator();
            while (it.hasNext()) {
                TemplateBasketItem next = it.next();
                PaymentProviderConfiguration paymentProviderConfiguration = client.getTemplateBasketItemsWithConfig().getConfig().get(next.getServiceId());
                if (paymentProviderConfiguration != null && paymentProviderConfiguration.getServiceConfigJson().isMobileServiceConfig()) {
                    arrayList.add(next);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: e */
    public static ArrayList m112738e(Client client, String str) {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator<TemplateBasketItem> it = client.getTemplateBasketItemsWithConfig().getTemplates().iterator();
            while (it.hasNext()) {
                TemplateBasketItem next = it.next();
                if (next.getServiceId().equals(str)) {
                    arrayList.add(next);
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    /* renamed from: f */
    public static ArrayList m112739f(PaymentsServiceConfigInputOption[] paymentsServiceConfigInputOptionArr, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (PaymentsServiceConfigInputOption paymentsServiceConfigInputOption : paymentsServiceConfigInputOptionArr) {
            if (z) {
                arrayList.add(C27950a.m86286c(paymentsServiceConfigInputOption.getValue(), true));
            } else {
                arrayList.add(paymentsServiceConfigInputOption.getValue());
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static ArrayList m112740g(PaymentsServiceConfigInputOption[] paymentsServiceConfigInputOptionArr) {
        ArrayList arrayList = new ArrayList();
        for (PaymentsServiceConfigInputOption id : paymentsServiceConfigInputOptionArr) {
            arrayList.add(id.getId());
        }
        return arrayList;
    }

    /* renamed from: h */
    public static WizardObject m112741h(PaymentCustomParameter paymentCustomParameter, String str, ArrayList arrayList, boolean z) {
        int i;
        WizardObject wizardObject = new WizardObject();
        int inputType = paymentCustomParameter.getStyle().getInputType();
        if (paymentCustomParameter.getStyle().getParameterType().equals(ParameterType.CALENDAR)) {
            wizardObject.setValue(paymentCustomParameter.getValue());
            wizardObject.setVisibleInput(paymentCustomParameter.getValueToDisplay());
            wizardObject.setMinDate(Calendar.getInstance().getTimeInMillis());
            i = 2;
        } else if (paymentCustomParameter.getStyle().getParameterType().equals(ParameterType.MOBILE)) {
            if (arrayList != null && arrayList.size() > 0) {
                wizardObject.setSubTemplateObjects(arrayList);
                wizardObject.setSubTemplateObjectsTitle(C36546y.m108285N().getString(C10328q.header_text_templates));
            }
            wizardObject.setValue(paymentCustomParameter.getValueToDisplay());
            wizardObject.setVisibleInput(paymentCustomParameter.getValue());
            i = 3;
        } else {
            if (paymentCustomParameter.getStyle().getParameterType().equals(ParameterType.AMOUNT)) {
                wizardObject.setAmountObject(true);
                wizardObject.setNonSelectableString(" ₾");
                wizardObject.setSubTemplateObjectsTitle(C36546y.m108285N().getString(C10328q.payments_wizard_choose_pack));
                String valueToDisplay = paymentCustomParameter.getValueToDisplay();
                if (!TextUtils.isEmpty(valueToDisplay) && valueToDisplay.contains(wizardObject.getNonSelectableString())) {
                    valueToDisplay = valueToDisplay.replace(wizardObject.getNonSelectableString(), "");
                }
                String value = paymentCustomParameter.getValue();
                if (!TextUtils.isEmpty(value) && value.contains(wizardObject.getNonSelectableString())) {
                    value = value.replace(wizardObject.getNonSelectableString(), "");
                }
                wizardObject.setValue(valueToDisplay);
                wizardObject.setVisibleInput(value);
                inputType = BogInputLayout.INPUT_TYPE_NUM_REAL;
            } else {
                ParameterType parameterType = paymentCustomParameter.getStyle().getParameterType();
                ParameterType parameterType2 = ParameterType.SELECT;
                if (parameterType.equals(parameterType2) || paymentCustomParameter.getStyle().getParameterType().equals(ParameterType.SELECT_MULTIPLE)) {
                    if (paymentCustomParameter.getStyle().getParameterType().equals(parameterType2)) {
                        wizardObject.setSelectorType(10);
                    } else if (paymentCustomParameter.getStyle().getParameterType().equals(ParameterType.SELECT_MULTIPLE)) {
                        wizardObject.setSelectorType(20);
                        wizardObject.setMaxSelectableItems(paymentCustomParameter.getStyle().getMaxSelectableItems());
                    }
                    if (paymentCustomParameter.getInputOptions() == null) {
                        return null;
                    }
                    wizardObject.setSelectorOptionPreviews(m112739f(paymentCustomParameter.getInputOptions(), !"amount_to_pay_with_point".equals(paymentCustomParameter.getId())));
                    wizardObject.setSelectorOptionValues(m112740g(paymentCustomParameter.getInputOptions()));
                    if (paymentCustomParameter.getStyle().getParameterType().equals(ParameterType.SELECT_MULTIPLE)) {
                        wizardObject.setValue(paymentCustomParameter.getValue());
                        wizardObject.setVisibleInput(paymentCustomParameter.getValueToDisplay());
                    } else if (paymentCustomParameter.getValue() != null) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= paymentCustomParameter.getInputOptions().length) {
                                break;
                            } else if (paymentCustomParameter.getInputOptions()[i2].getId().equals(paymentCustomParameter.getValue())) {
                                wizardObject.setValue(String.valueOf(i2));
                                wizardObject.setVisibleInput(wizardObject.getSelectorOptionPreviews().get(i2));
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                    i = 0;
                } else {
                    if (arrayList != null && arrayList.size() > 0 && z) {
                        wizardObject.setSubTemplateObjects(arrayList);
                        wizardObject.setSubTemplateObjectsTitle(C36546y.m108285N().getString(C10328q.header_text_templates));
                    }
                    wizardObject.setValue(paymentCustomParameter.getValue());
                    wizardObject.setVisibleInput(paymentCustomParameter.getValueToDisplay());
                }
            }
            i = 1;
        }
        if (!TextUtils.isEmpty(paymentCustomParameter.getStyle().getMask()) && !paymentCustomParameter.getStyle().getMask().contains("?")) {
            wizardObject.setMask(paymentCustomParameter.getStyle().getMask());
            wizardObject.setMaskChar("x");
        }
        wizardObject.setInputTitle(C27950a.m86286c(paymentCustomParameter.getName(), true));
        wizardObject.setInputType(inputType);
        wizardObject.setInputStyle(i);
        wizardObject.setId(str);
        return wizardObject;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList m112742i(p341ge.bog.mobilebank.payment.model.PaymentCustomConfiguration r13, p341ge.bog.mobilebank.model.Client r14, p341ge.bog.mobilebank.p975ui.wizard.controllers.BaseWizardPlugin r15) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = r13.getParameters()
            r2 = 0
            if (r14 == 0) goto L_0x0032
            boolean r3 = r13.isMobile()
            if (r3 == 0) goto L_0x001b
            java.util.ArrayList r3 = m112737d(r14)
            java.util.ArrayList r14 = m112744k(r3, r14)
            goto L_0x0033
        L_0x001b:
            boolean r3 = r13.isCompany()
            if (r3 != 0) goto L_0x0032
            ge.bog.mobilebank.model.payment.PaymentProviderConfiguration r3 = r13.getBaseConfiguration()
            java.lang.String r3 = r3.toString()
            java.util.ArrayList r3 = m112738e(r14, r3)
            java.util.ArrayList r14 = m112745l(r3, r14)
            goto L_0x0033
        L_0x0032:
            r14 = r2
        L_0x0033:
            r3 = 0
            r4 = r2
            r5 = r4
            r6 = r3
        L_0x0037:
            int r7 = r1.size()
            if (r6 >= r7) goto L_0x00cc
            java.lang.Object r7 = r1.get(r6)
            ge.bog.mobilebank.payment.model.PaymentCustomParameter r7 = (p341ge.bog.mobilebank.payment.model.PaymentCustomParameter) r7
            boolean r8 = r7.isVisibleInWizard()
            if (r8 == 0) goto L_0x00bd
            java.lang.String r8 = r7.getId()
            int r9 = m112736c(r13, r15)
            r10 = 1
            if (r6 != r9) goto L_0x0056
            r9 = r10
            goto L_0x0057
        L_0x0056:
            r9 = r3
        L_0x0057:
            ge.bog.mobilebank.ui.wizard.model.WizardObject r8 = m112741h(r7, r8, r14, r9)
            if (r8 != 0) goto L_0x005e
            goto L_0x00c8
        L_0x005e:
            int r9 = r8.getInputStyle()
            r11 = 2
            if (r9 != r11) goto L_0x00ac
            if (r5 != 0) goto L_0x0068
            r5 = r8
        L_0x0068:
            java.lang.String r9 = r7.getId()
            java.lang.String r11 = "DD_START_DATE_ID"
            boolean r11 = r9.equalsIgnoreCase(r11)
            if (r11 == 0) goto L_0x0083
            java.util.Calendar r11 = java.util.Calendar.getInstance()
            r12 = 5
            r11.add(r12, r10)
            long r10 = r11.getTimeInMillis()
            r5.setMinDate(r10)
        L_0x0083:
            java.lang.String r10 = "DD_END_DATE_ID"
            boolean r9 = r9.equalsIgnoreCase(r10)
            if (r9 == 0) goto L_0x00ac
            java.util.Calendar r9 = java.util.Calendar.getInstance()
            java.lang.String r10 = r5.getValue()
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L_0x009e
            long r10 = java.lang.Long.parseLong(r10)
            goto L_0x00a2
        L_0x009e:
            long r10 = r8.getMinDate()
        L_0x00a2:
            r9.setTimeInMillis(r10)
            long r9 = r9.getTimeInMillis()
            r8.setMinDate(r9)
        L_0x00ac:
            r0.add(r8)
            ge.bog.mobilebank.payment.model.ConfigParamStyle r7 = r7.getStyle()
            ge.bog.mobilebank.payment.model.ParameterType r7 = r7.getParameterType()
            ge.bog.mobilebank.payment.model.ParameterType r9 = p341ge.bog.mobilebank.payment.model.ParameterType.AMOUNT
            if (r7 != r9) goto L_0x00c8
            r2 = r8
            goto L_0x00c8
        L_0x00bd:
            ge.bog.mobilebank.payment.model.ConfigParamStyle r8 = r7.getStyle()
            boolean r8 = r8.isPackages()
            if (r8 == 0) goto L_0x00c8
            r4 = r7
        L_0x00c8:
            int r6 = r6 + 1
            goto L_0x0037
        L_0x00cc:
            int r14 = m112736c(r13, r15)
            java.lang.Object r14 = r0.get(r14)
            ge.bog.mobilebank.ui.wizard.model.WizardObject r14 = (p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject) r14
            java.lang.String r15 = r13.getLogoUrl()
            r14.setIconUrl(r15)
            if (r2 == 0) goto L_0x00eb
            if (r4 == 0) goto L_0x00eb
            m112734a(r4, r2)
            int r13 = r13.getSelectedPackageIndex()
            r2.setSelectedSubTemplateItem(r13)
        L_0x00eb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rw0.C38380g.m112742i(ge.bog.mobilebank.payment.model.PaymentCustomConfiguration, ge.bog.mobilebank.model.Client, ge.bog.mobilebank.ui.wizard.controllers.BaseWizardPlugin):java.util.ArrayList");
    }

    /* renamed from: j */
    public static ArrayList m112743j(PaymentCustomConfiguration paymentCustomConfiguration, BaseWizardPlugin baseWizardPlugin) {
        return m112742i(paymentCustomConfiguration, C36546y.m108285N().mo89313K(), baseWizardPlugin);
    }

    /* renamed from: k */
    public static ArrayList m112744k(ArrayList arrayList, Client client) {
        String str;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TemplateBasketItem templateBasketItem = (TemplateBasketItem) it.next();
            if (templateBasketItem.getTemplateImage() != null) {
                str = templateBasketItem.getTemplateImage();
            } else {
                str = templateBasketItem.getLogo();
            }
            String e = C32289b0.m95093e(str);
            String templateNameOrServiceName = templateBasketItem.getTemplateNameOrServiceName(client);
            StringBuilder sb = new StringBuilder();
            for (TemplateBasketParameter next : templateBasketItem.getTemplateParameters()) {
                if (next.getParameterKey().equals("phone") && !next.getParameterValue().equals("+995") && !next.getParameterValue().equals("995")) {
                    sb.append(next.getParameterValue());
                }
            }
            arrayList2.add(new WizardSubTemplateObject(e, templateNameOrServiceName, (String) null, sb.toString(), sb.toString()));
        }
        return arrayList2;
    }

    /* renamed from: l */
    public static ArrayList m112745l(ArrayList arrayList, Client client) {
        String str;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TemplateBasketItem templateBasketItem = (TemplateBasketItem) it.next();
            if (templateBasketItem.getTemplateImage() != null) {
                str = templateBasketItem.getTemplateImage();
            } else {
                str = templateBasketItem.getLogo();
            }
            String e = C32289b0.m95093e(str);
            String templateNameOrServiceName = templateBasketItem.getTemplateNameOrServiceName(client);
            ArrayList arrayList3 = new ArrayList();
            for (TemplateBasketParameter next : templateBasketItem.getTemplateParameters()) {
                arrayList3.add(new KeyValue(next.getParameterKey(), next.getParameterValue()));
            }
            arrayList2.add(new WizardSubTemplateObject(e, templateNameOrServiceName, (String) null, arrayList3));
        }
        return arrayList2;
    }
}
