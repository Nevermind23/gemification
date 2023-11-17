package p341ge.bog.mobilebank.model.template;

import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import com.google.gson.Gson;
import g91.C32315k0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p277ua.C8664c;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.KeyValue;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;
import p341ge.bog.mobilebank.model.payment.PaymentServiceConfig;
import p341ge.bog.mobilebank.model.payment.PaymentServiceConfigParameter;
import p341ge.bog.mobilebank.payment.controllers.wizard.PaymentWizardPlugin;
import p341ge.bog.mobilebank.payment.model.ParameterType;
import p341ge.bog.mobilebank.payment.model.PaymentCustomConfiguration;
import p341ge.bog.mobilebank.payment.model.PaymentCustomParameter;
import rw0.C38375b;
import rw0.C38379f;

/* renamed from: ge.bog.mobilebank.model.template.TemplateBasketItemsWithPaymentConfig */
public class TemplateBasketItemsWithPaymentConfig {
    @C8664c("config")
    private HashMap<String, PaymentProviderConfiguration> config;
    @C8664c("recentProvidersConfig")
    private Map<String, PaymentProviderConfiguration> recentPayments;
    @C8664c("groups")
    private ArrayList<TemplateGroup> templateGroups;
    private ArrayMap<String, ArraySet<String>> templateIdentifiers = new ArrayMap<>();
    @C8664c("templates")
    private ArrayList<TemplateBasketItem> templates;
    @C8664c("transportPass")
    private TransportPassItem transportPass;

    public static PaymentCustomConfiguration getCustomConfigFromProviderConfig(PaymentProviderConfiguration paymentProviderConfiguration, TemplateBasketItem templateBasketItem, ArrayMap<String, String[]> arrayMap) {
        PaymentCustomConfiguration paymentCustomConfiguration = new PaymentCustomConfiguration();
        paymentCustomConfiguration.setBaseConfiguration(paymentProviderConfiguration);
        return C38375b.m112708d((Client) null, paymentProviderConfiguration, paymentCustomConfiguration, arrayMap, templateBasketItem);
    }

    public static ArrayList<KeyValue> getPaymentParams(PaymentCustomConfiguration paymentCustomConfiguration, PaymentWizardPlugin paymentWizardPlugin, TemplateBasketItem templateBasketItem) {
        String str;
        ArrayList<KeyValue> arrayList = new ArrayList<>();
        C38379f fVar = paymentWizardPlugin != null ? new C38379f(paymentWizardPlugin) : null;
        List<PaymentCustomParameter> parameters = paymentCustomConfiguration.getParameters();
        int i = 0;
        while (i < parameters.size()) {
            if (!paymentCustomConfiguration.isCompany() || i != 0) {
                PaymentCustomParameter paymentCustomParameter = parameters.get(i);
                if (!paymentCustomParameter.isNotNeededForDebtVerify()) {
                    KeyValue keyValue = new KeyValue();
                    if (paymentCustomParameter.isMandatory()) {
                        keyValue.setKey(paymentCustomParameter.getId());
                        if (paymentCustomParameter.getStyle().getParameterType().equals(ParameterType.AMOUNT)) {
                            keyValue.setValue("");
                        } else if (fVar == null || !paymentCustomParameter.isVisibleInWizard()) {
                            keyValue.setValue(paymentCustomParameter.getValue());
                        } else {
                            keyValue.setValue(fVar.mo91903b(paymentCustomParameter.getId()));
                        }
                        if (!paymentCustomConfiguration.isMobile() && fVar != null) {
                            while (true) {
                                int i2 = i + 1;
                                if (i2 >= parameters.size() || paymentCustomParameter.getId() == null || parameters.get(i2).getId() == null || !paymentCustomParameter.getId().equals(parameters.get(i2).getId())) {
                                    break;
                                }
                                keyValue.setValue(keyValue.getValue() + fVar.mo91903b(keyValue.getKey()));
                                i = i2;
                            }
                        }
                    } else {
                        keyValue = new KeyValue();
                        keyValue.setKey(paymentCustomParameter.getId());
                        keyValue.setValue("");
                    }
                    if (keyValue.getValue() != null) {
                        str = keyValue.getValue();
                    } else {
                        str = "";
                    }
                    keyValue.setValue(str);
                    if (templateBasketItem != null) {
                        String parameterValue = templateBasketItem.getParameterValue(paymentCustomParameter.getId(), 0);
                        if (parameterValue != null && parameterValue.length() > 0) {
                            int i3 = 1;
                            while (true) {
                                String parameterValue2 = templateBasketItem.getParameterValue(paymentCustomParameter.getId(), i3);
                                if (parameterValue2 == null) {
                                    break;
                                }
                                parameterValue = parameterValue.concat(parameterValue2);
                                i3++;
                            }
                        }
                        if (parameterValue == null) {
                            parameterValue = "";
                        }
                        keyValue.setValue(parameterValue);
                    }
                    if (C32315k0.m95250E(paymentCustomParameter.getStyle().getMask()) && keyValue.getValue() != null) {
                        keyValue.setValue(keyValue.getValue().replaceAll(C32315k0.m95262k(paymentCustomParameter.getStyle().getMask()), ""));
                    }
                    if (keyValue.getKey() != null) {
                        arrayList.add(keyValue);
                    }
                }
            }
            i++;
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getPaymentParamsForCar(p341ge.bog.mobilebank.model.payment.PaymentServiceConfig r8, p341ge.bog.mobilebank.model.template.TemplateGroup r9, p748eu.C20292b r10) {
        /*
            java.util.List r0 = r9.getComments()
            r1 = 0
            if (r0 == 0) goto L_0x0092
            java.util.List r0 = r9.getComments()
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0013
            goto L_0x0092
        L_0x0013:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            ge.bog.mobilebank.model.payment.PaymentServiceConfigParameter[] r8 = r8.getParameter()
            int r2 = r8.length
            r3 = 0
            r4 = r3
        L_0x001f:
            if (r3 >= r2) goto L_0x0088
            r5 = r8[r3]
            java.lang.String r6 = r5.getParamType()
            if (r6 == 0) goto L_0x0085
            java.lang.String r6 = r5.getParamType()
            java.lang.String r7 = "M"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0085
            ge.bog.mobilebank.model.KeyValue r6 = new ge.bog.mobilebank.model.KeyValue
            r6.<init>()
            java.lang.String r5 = r5.getId()
            r6.setKey(r5)
            java.lang.String r5 = "carOrigin"
            java.lang.String r7 = r6.getKey()
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x005f
            if (r10 == 0) goto L_0x005c
            java.lang.String r5 = "CAR_TEMPLATE_ORIGIN_ID"
            fu.a r5 = r10.mo48775b(r5)
            if (r5 == 0) goto L_0x0078
            java.lang.String r5 = r5.mo49087d()
            goto L_0x0079
        L_0x005c:
            java.lang.String r5 = "0"
            goto L_0x0079
        L_0x005f:
            java.util.List r5 = r9.getComments()
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0078
            java.util.List r5 = r9.getComments()
            java.lang.Object r5 = r5.get(r4)
            ge.bog.mobilebank.model.template.TemplateGroupComment r5 = (p341ge.bog.mobilebank.model.template.TemplateGroupComment) r5
            java.lang.String r5 = r5.getComment()
            goto L_0x0079
        L_0x0078:
            r5 = r1
        L_0x0079:
            int r4 = r4 + 1
            if (r5 != 0) goto L_0x007f
            java.lang.String r5 = ""
        L_0x007f:
            r6.setValue(r5)
            r0.add(r6)
        L_0x0085:
            int r3 = r3 + 1
            goto L_0x001f
        L_0x0088:
            com.google.gson.Gson r8 = new com.google.gson.Gson
            r8.<init>()
            java.lang.String r8 = r8.mo18181w(r0)
            return r8
        L_0x0092:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.model.template.TemplateBasketItemsWithPaymentConfig.getPaymentParamsForCar(ge.bog.mobilebank.model.payment.PaymentServiceConfig, ge.bog.mobilebank.model.template.TemplateGroup, eu.b):java.lang.String");
    }

    public Map<String, PaymentProviderConfiguration> getConfig() {
        return this.config;
    }

    public TemplateDebtInfo getDownloadedDebtTemplatesCount() {
        PaymentProviderConfiguration paymentProviderConfiguration;
        PaymentProviderConfiguration paymentProviderConfiguration2;
        TemplateDebtInfo templateDebtInfo = new TemplateDebtInfo();
        this.templateIdentifiers.clear();
        if (getTemplates() != null) {
            Iterator<TemplateBasketItem> it = getTemplates().iterator();
            while (it.hasNext()) {
                TemplateBasketItem next = it.next();
                if (next.canGetDebt() && (paymentProviderConfiguration2 = getPaymentProviderConfiguration(next)) != null && paymentProviderConfiguration2.isHasDebt()) {
                    new ArraySet().add(C32315k0.m95275x(this, next, true));
                    templateDebtInfo.setDebtToDownload(templateDebtInfo.getDebtToDownload() + 1);
                    if (next.getTemplateDebtEvent().getState() != 10) {
                        templateDebtInfo.setDownloadedDebts(templateDebtInfo.getDownloadedDebts() + 1);
                        if (next.getTemplateDebtEvent().getState() == 20 && next.getDebtAmount() > 0) {
                            templateDebtInfo.setTotalDebt(templateDebtInfo.getTotalDebt() + next.getDebtAmount());
                            templateDebtInfo.setActualDebts(templateDebtInfo.getActualDebts() + 1);
                        }
                    }
                }
            }
        }
        if (getTemplateGroups() != null) {
            Iterator<TemplateGroup> it2 = getTemplateGroups().iterator();
            while (it2.hasNext()) {
                TemplateGroup next2 = it2.next();
                if (!(next2.getCtParkPenaltiesEvent() == null || next2.getCtParkPenaltiesEvent().getCTParkPenalties() == null)) {
                    Iterator<TemplateBasketItem> it3 = next2.getCtParkPenaltiesEvent().getCTParkPenalties().iterator();
                    while (it3.hasNext()) {
                        TemplateBasketItem next3 = it3.next();
                        if (next3.canGetDebt() && (paymentProviderConfiguration = getPaymentProviderConfiguration(next3)) != null && paymentProviderConfiguration.isHasDebt()) {
                            new ArraySet().add(C32315k0.m95275x(this, next3, true));
                            templateDebtInfo.setDebtToDownload(templateDebtInfo.getDebtToDownload() + 1);
                            if (next3.getTemplateDebtEvent().getState() != 10) {
                                templateDebtInfo.setDownloadedDebts(templateDebtInfo.getDownloadedDebts() + 1);
                                if (next3.getTemplateDebtEvent().getState() == 20 && next3.getDebtAmount() > 0) {
                                    templateDebtInfo.setTotalDebt(templateDebtInfo.getTotalDebt() + next3.getDebtAmount());
                                    templateDebtInfo.setActualDebts(templateDebtInfo.getActualDebts() + 1);
                                }
                            }
                        }
                    }
                }
            }
        }
        return templateDebtInfo;
    }

    public PaymentProviderConfiguration getPaymentProviderConfiguration(TemplateBasketItem templateBasketItem) {
        if (getConfig() == null || templateBasketItem == null || templateBasketItem.getServiceId() == null || !getConfig().containsKey(templateBasketItem.getServiceId())) {
            return null;
        }
        return getConfig().get(templateBasketItem.getServiceId());
    }

    public PaymentServiceConfig getPaymentServiceConfigOfItem(TemplateBasketItem templateBasketItem) {
        if (getConfig() == null || templateBasketItem == null || templateBasketItem.getServiceId() == null || !getConfig().containsKey(templateBasketItem.getServiceId())) {
            return null;
        }
        return getConfig().get(templateBasketItem.getServiceId()).getServiceConfigJson();
    }

    public Map<String, PaymentProviderConfiguration> getRecentPayments() {
        return this.recentPayments;
    }

    public TemplateBasketItem getTemplateBasketItemByTemplateId(long j) {
        if (getTemplates() == null) {
            return null;
        }
        Iterator<TemplateBasketItem> it = getTemplates().iterator();
        while (it.hasNext()) {
            TemplateBasketItem next = it.next();
            if (next.getId() == j) {
                return next;
            }
        }
        return null;
    }

    public TemplateGroup getTemplateGroupByTemplateId(long j) {
        if (getTemplateGroups() == null) {
            return null;
        }
        Iterator<TemplateGroup> it = getTemplateGroups().iterator();
        while (it.hasNext()) {
            TemplateGroup next = it.next();
            if (next.getTemplates() != null) {
                for (TemplateBasketItem id : next.getTemplates()) {
                    if (id.getId() == j) {
                        return next;
                    }
                }
                continue;
            }
        }
        return null;
    }

    public ArrayList<TemplateGroup> getTemplateGroups() {
        return this.templateGroups;
    }

    public ArrayList<TemplateBasketItem> getTemplates() {
        return this.templates;
    }

    public TransportPassItem getTransportPass() {
        return this.transportPass;
    }

    public void setConfig(HashMap<String, PaymentProviderConfiguration> hashMap) {
        this.config = hashMap;
    }

    public void setTemplates(ArrayList<TemplateBasketItem> arrayList) {
        this.templates = arrayList;
    }

    public void setTransportPass(TransportPassItem transportPassItem) {
        this.transportPass = transportPassItem;
    }

    public static String getPaymentParams(PaymentServiceConfig paymentServiceConfig, TemplateBasketItem templateBasketItem) {
        Gson gson = new Gson();
        ArrayList arrayList = new ArrayList();
        for (PaymentServiceConfigParameter paymentServiceConfigParameter : paymentServiceConfig.getParameter()) {
            KeyValue keyValue = new KeyValue();
            keyValue.setKey(paymentServiceConfigParameter.getId());
            String parameterValue = templateBasketItem.getParameterValue(paymentServiceConfigParameter.getId(), 0);
            if (paymentServiceConfigParameter.getInput() != null && paymentServiceConfigParameter.getInput().length > 0) {
                for (int i = 1; i < paymentServiceConfigParameter.getInput().length; i++) {
                    String parameterValue2 = templateBasketItem.getParameterValue(paymentServiceConfigParameter.getId(), i);
                    if (parameterValue2 != null) {
                        parameterValue = parameterValue.concat(parameterValue2);
                    }
                }
            }
            if (parameterValue == null) {
                parameterValue = "";
            }
            keyValue.setValue(parameterValue);
            arrayList.add(keyValue);
        }
        return gson.mo18181w(arrayList);
    }
}
