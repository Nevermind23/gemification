package g91;

import android.content.Context;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.github.mikephil.charting.utils.Utils;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import iu0.C36546y;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p341ge.bog.mobilebank.model.KeyValue;
import p341ge.bog.mobilebank.model.PaymentExecuteEssObject;
import p341ge.bog.mobilebank.model.payment.PaymentDebtResponse;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;
import p341ge.bog.mobilebank.model.payment.PaymentServiceConfig;
import p341ge.bog.mobilebank.model.payment.PaymentServiceConfigInput;
import p341ge.bog.mobilebank.model.payment.PaymentServiceConfigParameter;
import p341ge.bog.mobilebank.model.payment.PaymentsServiceConfigInputOption;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import p341ge.bog.mobilebank.model.template.TemplateBasketItemsWithPaymentConfig;
import p341ge.bog.mobilebank.model.template.TemplateBasketParameter;
import p341ge.bog.mobilebank.payment.model.ParameterType;
import p341ge.bog.mobilebank.payment.model.PaymentCustomConfiguration;
import p341ge.bog.mobilebank.payment.model.PaymentCustomParameter;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p366bk.C10328q;
import r90.C27950a;

/* renamed from: g91.k0 */
public abstract class C32315k0 {
    /* renamed from: A */
    public static String m95246A(ArrayList arrayList, boolean z) {
        if (arrayList != null && arrayList.size() > 0) {
            try {
                return C32359z0.m95539J(String.valueOf(new BigDecimal(m95248C("amount", arrayList)).divide(new BigDecimal(100)).add(m95247B(arrayList, z)).setScale(2, 1)));
            } catch (Exception unused) {
            }
        }
        return "";
    }

    /* renamed from: B */
    public static BigDecimal m95247B(ArrayList arrayList, boolean z) {
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        try {
            BigDecimal divide = new BigDecimal(m95248C("commission", arrayList)).divide(new BigDecimal(100));
            if (z) {
                divide = new BigDecimal(m95248C("amount", arrayList)).divide(new BigDecimal(100)).add(divide).multiply(new BigDecimal(0.02d)).add(divide);
            }
            return divide.setScale(2, 1);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: C */
    public static String m95248C(String str, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        String str2 = null;
        while (it.hasNext()) {
            KeyValue keyValue = (KeyValue) it.next();
            if (keyValue.getKey() != null && keyValue.getKey().equals(str)) {
                str2 = keyValue.getValue();
            }
        }
        return str2;
    }

    /* renamed from: D */
    public static boolean m95249D(String str) {
        if (str == null || (!str.equals("text") && !str.equals("amount") && !str.equals("select"))) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    public static boolean m95250E(String str) {
        return !TextUtils.isEmpty(str) && !str.contains("?");
    }

    /* renamed from: F */
    public static void m95251F(PaymentProviderConfiguration paymentProviderConfiguration, TemplateBasketItem templateBasketItem) {
        for (PaymentServiceConfigParameter paymentServiceConfigParameter : paymentProviderConfiguration.getServiceConfigJson().getParameter()) {
            if (paymentServiceConfigParameter.getId().equals("amount")) {
                for (PaymentServiceConfigInput enable : paymentServiceConfigParameter.getInput()) {
                    templateBasketItem.setEditable(enable.getEnable().booleanValue());
                }
            }
        }
    }

    /* renamed from: a */
    public static ArrayList m95252a(PaymentDebtResponse paymentDebtResponse, PaymentProviderConfiguration paymentProviderConfiguration) {
        JSONArray jSONArray;
        try {
            jSONArray = new JSONArray(paymentDebtResponse.getValueByKey(PaymentServiceConfig.TYPE_DEBT_LIST));
        } catch (Exception unused) {
            jSONArray = null;
        }
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                    KeyValue[] keyValueArr = new KeyValue[jSONArray2.length()];
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        KeyValue keyValue = new KeyValue();
                        JSONObject jSONObject = jSONArray2.getJSONObject(i2);
                        if (jSONObject.has("key")) {
                            keyValue.setKey(jSONObject.getString("key"));
                            if (jSONObject.has(C11755a.C11756a.f34100b)) {
                                keyValue.setValue(jSONObject.getString(C11755a.C11756a.f34100b));
                            } else {
                                keyValue.setValue("");
                            }
                            keyValueArr[i2] = keyValue;
                        }
                    }
                    arrayList.add(keyValueArr);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(m95253b(paymentProviderConfiguration, (KeyValue[]) it.next(), true, true));
        }
        return arrayList2;
    }

    /* renamed from: b */
    public static TemplateBasketItem m95253b(PaymentProviderConfiguration paymentProviderConfiguration, KeyValue[] keyValueArr, boolean z, boolean z2) {
        TemplateBasketItem templateBasketItem = new TemplateBasketItem(keyValueArr, paymentProviderConfiguration, false, z, z2);
        templateBasketItem.setDebtAmount(m95260i(paymentProviderConfiguration.getServiceConfigJson(), templateBasketItem.getTemplateDebtEvent().getPaymentDebt()));
        m95251F(paymentProviderConfiguration, templateBasketItem);
        return templateBasketItem;
    }

    /* renamed from: c */
    public static ArrayList m95254c(ArrayList arrayList, PaymentServiceConfig paymentServiceConfig) {
        ArrayList arrayList2 = new ArrayList();
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                KeyValue keyValue = (KeyValue) it.next();
                PaymentServiceConfigParameter[] parameter = paymentServiceConfig.getParameter();
                int length = parameter.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    PaymentServiceConfigParameter paymentServiceConfigParameter = parameter[i];
                    if (!TextUtils.isEmpty(paymentServiceConfigParameter.getId()) && paymentServiceConfigParameter.getId().equals(keyValue.getKey())) {
                        arrayList2.add(keyValue);
                        break;
                    }
                    i++;
                }
            }
        }
        return arrayList2;
    }

    /* renamed from: d */
    public static KeyValue m95255d(String str) {
        return new KeyValue("TEMPLATE_ID", str);
    }

    /* renamed from: e */
    public static KeyValue m95256e(String str) {
        return new KeyValue("TEMPLATE_NAME", str);
    }

    /* renamed from: f */
    public static ArrayList m95257f(PaymentCustomConfiguration paymentCustomConfiguration) {
        String str;
        ArrayMap arrayMap = new ArrayMap();
        if (!(paymentCustomConfiguration == null || paymentCustomConfiguration.getParameters() == null || paymentCustomConfiguration.getParameters().size() <= 0)) {
            for (PaymentCustomParameter next : paymentCustomConfiguration.getParameters()) {
                String id = next.getId();
                if (!TextUtils.isEmpty(next.getId()) && !TextUtils.isEmpty(next.getValue()) && !next.getId().equals("amount") && !next.getId().equals("amount_to_pay_with_point") && !next.getId().equals("point_value_param_id") && next.getStyle().getParameterType() != ParameterType.CALENDAR && next.getStyle().getParameterType() != ParameterType.SELECT_MULTIPLE) {
                    if (next.getStyle().getMask() != null) {
                        arrayMap.put(id, next.getValue());
                    } else {
                        String str2 = (String) arrayMap.get(id);
                        if (str2 != null) {
                            str = str2.concat(next.getValue());
                        } else {
                            str = next.getValue();
                        }
                        arrayMap.put(id, str);
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        if (arrayMap.size() > 0) {
            for (Map.Entry entry : arrayMap.entrySet()) {
                arrayList.add(new KeyValue((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static String m95258g(String str, String str2) {
        String k = m95262k(str2);
        if (!k.equals("")) {
            return str.replace(k, "");
        }
        return str;
    }

    /* renamed from: h */
    public static ArrayList m95259h(TemplateBasketItem templateBasketItem) {
        ArrayList arrayList = new ArrayList();
        ArrayMap arrayMap = new ArrayMap();
        for (TemplateBasketParameter next : templateBasketItem.getTemplateParameters()) {
            if (!"commission".equals(next.getParameterKey())) {
                String str = "";
                if (next.getParameterIndex() == 0 || arrayMap.get(next.getParameterKey()) == null) {
                    String parameterKey = next.getParameterKey();
                    if (next.getParameterValue() != null) {
                        str = next.getParameterValue();
                    }
                    arrayMap.put(parameterKey, str);
                } else {
                    String parameterKey2 = next.getParameterKey();
                    String str2 = (String) arrayMap.get(next.getParameterKey());
                    if (next.getParameterValue() != null) {
                        str = next.getParameterValue();
                    }
                    arrayMap.put(parameterKey2, str2.concat(str));
                }
            }
        }
        for (String str3 : arrayMap.keySet()) {
            String str4 = (String) arrayMap.get(str3);
            if (str4 != null && str4.length() > 0) {
                arrayList.add(new KeyValue(str3, str4));
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0072 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0073 A[SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m95260i(p341ge.bog.mobilebank.model.payment.PaymentServiceConfig r9, p341ge.bog.mobilebank.model.payment.PaymentDebtResponse r10) {
        /*
            r0 = 0
            if (r10 == 0) goto L_0x0094
            ge.bog.mobilebank.model.KeyValue[] r1 = r10.getParameter()
            if (r1 == 0) goto L_0x0094
            if (r9 == 0) goto L_0x0094
            ge.bog.mobilebank.model.payment.PaymentServiceConfigParameter[] r1 = r9.getParameter()
            if (r1 == 0) goto L_0x0094
            ge.bog.mobilebank.model.payment.PaymentServiceConfigParameter[] r9 = r9.getParameter()
            int r1 = r9.length
            r2 = r0
        L_0x0017:
            java.lang.String r3 = "amount"
            if (r2 >= r1) goto L_0x0076
            r4 = r9[r2]
            java.lang.String r5 = r4.getParamType()
            if (r5 == 0) goto L_0x0073
            java.lang.String r5 = r4.getParamType()
            java.lang.String r6 = "D"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0073
            java.lang.String r5 = r4.getId()
            r6 = 1
            if (r5 == 0) goto L_0x006f
            java.lang.String r5 = r10.getValueByKey(r5)     // Catch:{ Exception -> 0x006f }
            double r7 = java.lang.Double.parseDouble(r5)     // Catch:{ Exception -> 0x006f }
            ge.bog.mobilebank.model.payment.PaymentServiceConfigInput[] r5 = r4.getInput()     // Catch:{ Exception -> 0x006f }
            int r5 = r5.length     // Catch:{ Exception -> 0x006f }
            if (r5 <= 0) goto L_0x006c
            ge.bog.mobilebank.model.payment.PaymentServiceConfigInput[] r5 = r4.getInput()     // Catch:{ Exception -> 0x006f }
            r5 = r5[r0]     // Catch:{ Exception -> 0x006f }
            if (r5 == 0) goto L_0x006c
            ge.bog.mobilebank.model.payment.PaymentServiceConfigInput[] r5 = r4.getInput()     // Catch:{ Exception -> 0x006f }
            r5 = r5[r0]     // Catch:{ Exception -> 0x006f }
            java.lang.String r5 = r5.getType()     // Catch:{ Exception -> 0x006f }
            if (r5 == 0) goto L_0x006c
            ge.bog.mobilebank.model.payment.PaymentServiceConfigInput[] r4 = r4.getInput()     // Catch:{ Exception -> 0x006f }
            r4 = r4[r0]     // Catch:{ Exception -> 0x006f }
            java.lang.String r4 = r4.getType()     // Catch:{ Exception -> 0x006f }
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x006f }
            if (r3 != 0) goto L_0x006c
            r3 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r7 = r7 * r3
        L_0x006c:
            int r3 = (int) r7
            r6 = r0
            goto L_0x0070
        L_0x006f:
            r3 = r0
        L_0x0070:
            if (r6 != 0) goto L_0x0073
            return r3
        L_0x0073:
            int r2 = r2 + 1
            goto L_0x0017
        L_0x0076:
            boolean r9 = r10.containsKey(r3)
            if (r9 == 0) goto L_0x0094
            java.lang.String r9 = r10.getValueByKey(r3)
            if (r9 == 0) goto L_0x0094
            java.lang.String r9 = r10.getValueByKey(r3)
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x0094
            java.lang.String r9 = r10.getValueByKey(r3)     // Catch:{ Exception -> 0x0094 }
            int r0 = java.lang.Integer.parseInt(r9)     // Catch:{ Exception -> 0x0094 }
        L_0x0094:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g91.C32315k0.m95260i(ge.bog.mobilebank.model.payment.PaymentServiceConfig, ge.bog.mobilebank.model.payment.PaymentDebtResponse):int");
    }

    /* renamed from: j */
    public static int m95261j(PaymentCustomConfiguration paymentCustomConfiguration, PaymentDebtResponse paymentDebtResponse) {
        int i;
        if (!(paymentDebtResponse == null || paymentDebtResponse.getParameter() == null || paymentCustomConfiguration == null || paymentCustomConfiguration.getParameters() == null)) {
            for (PaymentCustomParameter next : paymentCustomConfiguration.getParameters()) {
                if (next.getStyle().needsDebtFormatting()) {
                    String id = next.getId();
                    boolean z = true;
                    double d = Utils.DOUBLE_EPSILON;
                    if (id != null) {
                        try {
                            d = Double.parseDouble(paymentDebtResponse.getValueByKey(id));
                            if (next.getStyle().getParameterType() != ParameterType.AMOUNT) {
                                d *= 100.0d;
                            }
                            z = false;
                        } catch (Exception unused) {
                        }
                    }
                    if (!z) {
                        return (int) d;
                    }
                }
            }
            if (paymentDebtResponse.containsKey("amount") && paymentDebtResponse.getValueByKey("amount") != null && !paymentDebtResponse.getValueByKey("amount").isEmpty()) {
                try {
                    i = Integer.parseInt(paymentDebtResponse.getValueByKey("amount"));
                } catch (Exception unused2) {
                    i = 0;
                }
                if (i > 0) {
                    return i;
                }
            }
        }
        return 0;
    }

    /* renamed from: k */
    public static String m95262k(String str) {
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'x') {
                str2 = String.valueOf(str.charAt(i));
            }
        }
        return str2;
    }

    /* renamed from: l */
    public static String m95263l(ArrayList arrayList, boolean z) {
        if (arrayList == null || arrayList.size() <= 0) {
            return "";
        }
        try {
            String C = m95248C("commission", arrayList);
            String O = C32359z0.m95544O(C);
            if (!z) {
                return O;
            }
            BigDecimal bigDecimal = new BigDecimal(m95248C("amount", arrayList));
            BigDecimal bigDecimal2 = new BigDecimal(C);
            return C32359z0.m95539J(bigDecimal.add(bigDecimal2).multiply(new BigDecimal(0.02d)).add(bigDecimal2).divide(new BigDecimal(100)).setScale(2, 1).toString());
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: m */
    public static String m95264m(String str, String str2, boolean z) {
        String k = m95262k(str2);
        if (k.equals("")) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.replace(k, ""));
        if (k.length() > 0 && (z || !k.equals("?"))) {
            int indexOf = str2.indexOf(k);
            while (indexOf >= 0) {
                if (sb.length() > indexOf) {
                    sb.insert(indexOf, k);
                }
                indexOf = str2.indexOf(k, indexOf + 1);
            }
        }
        return sb.toString();
    }

    /* renamed from: n */
    public static PaymentsServiceConfigInputOption m95265n(PaymentServiceConfig paymentServiceConfig, int i) {
        PaymentServiceConfigInput[] input;
        PaymentsServiceConfigInputOption paymentsServiceConfigInputOption = null;
        if (!(paymentServiceConfig == null || paymentServiceConfig.getParameter() == null || paymentServiceConfig.getParameter().length <= 0)) {
            for (PaymentServiceConfigParameter paymentServiceConfigParameter : paymentServiceConfig.getParameter()) {
                if ("C".equals(paymentServiceConfigParameter.getParamType()) && (input = paymentServiceConfigParameter.getInput()) != null && input.length > 0 && input[0].getType().equals("select") && input[0].getInputOption() != null && input[0].getInputOption().length > i) {
                    paymentsServiceConfigInputOption = input[0].getInputOption()[i];
                }
            }
        }
        return paymentsServiceConfigInputOption;
    }

    /* renamed from: o */
    public static int m95266o(PaymentServiceConfig paymentServiceConfig, String str) {
        PaymentServiceConfigInput[] input;
        int i = -1;
        if (!(paymentServiceConfig == null || paymentServiceConfig.getParameter() == null || paymentServiceConfig.getParameter().length <= 0)) {
            for (PaymentServiceConfigParameter paymentServiceConfigParameter : paymentServiceConfig.getParameter()) {
                if ("C".equals(paymentServiceConfigParameter.getParamType()) && (input = paymentServiceConfigParameter.getInput()) != null && input.length > 0) {
                    PaymentServiceConfigInput paymentServiceConfigInput = input[0];
                    if (paymentServiceConfigInput.getType().equals("select") && paymentServiceConfigInput.getInputOption() != null && paymentServiceConfigInput.getInputOption().length > 0) {
                        for (int i2 = 0; i2 < paymentServiceConfigInput.getInputOption().length; i2++) {
                            if (!(paymentServiceConfigInput.getInputOption()[i2] == null || paymentServiceConfigInput.getInputOption()[i2].getId() == null || !paymentServiceConfigInput.getInputOption()[i2].getId().equals(str))) {
                                i = i2;
                            }
                        }
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: p */
    public static int m95267p(PaymentServiceConfig paymentServiceConfig, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TemplateBasketParameter templateBasketParameter = (TemplateBasketParameter) it.next();
            if ("bog_package_id".equals(templateBasketParameter.getParameterKey())) {
                return m95266o(paymentServiceConfig, templateBasketParameter.getParameterValue());
            }
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0124  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList m95268q(p341ge.bog.mobilebank.model.template.TemplateBasketItemWrapperForSelection r8, p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration r9, boolean r10) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.math.BigDecimal r1 = java.math.BigDecimal.ZERO
            java.math.BigDecimal r2 = new java.math.BigDecimal     // Catch:{ Exception -> 0x0037 }
            java.lang.String r3 = r8.getNewValue()     // Catch:{ Exception -> 0x0037 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ Exception -> 0x0037 }
            double r3 = (double) r3     // Catch:{ Exception -> 0x0037 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0037 }
            if (r10 == 0) goto L_0x003a
            java.math.BigDecimal r10 = new java.math.BigDecimal     // Catch:{ Exception -> 0x0034 }
            r3 = 100
            r10.<init>(r3)     // Catch:{ Exception -> 0x0034 }
            java.math.BigDecimal r10 = r2.divide(r10)     // Catch:{ Exception -> 0x0034 }
            java.lang.String r4 = r9.getCommission()     // Catch:{ Exception -> 0x0034 }
            java.math.BigDecimal r1 = g91.C32359z0.m95592t(r10, r4)     // Catch:{ Exception -> 0x0034 }
            java.math.BigDecimal r10 = new java.math.BigDecimal     // Catch:{ Exception -> 0x0034 }
            r10.<init>(r3)     // Catch:{ Exception -> 0x0034 }
            java.math.BigDecimal r1 = r1.multiply(r10)     // Catch:{ Exception -> 0x0034 }
            goto L_0x003a
        L_0x0034:
            r10 = r1
            r1 = r2
            goto L_0x0038
        L_0x0037:
            r10 = r1
        L_0x0038:
            r2 = r1
            r1 = r10
        L_0x003a:
            ge.bog.mobilebank.model.KeyValue r10 = new ge.bog.mobilebank.model.KeyValue
            int r2 = r2.intValue()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "amount"
            r10.<init>(r3, r2)
            r0.add(r10)
            ge.bog.mobilebank.model.KeyValue r10 = new ge.bog.mobilebank.model.KeyValue
            int r1 = r1.intValue()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "commission"
            r10.<init>(r2, r1)
            r0.add(r10)
            androidx.collection.ArrayMap r10 = new androidx.collection.ArrayMap
            r10.<init>()
            ge.bog.mobilebank.model.template.TemplateBasketItem r8 = r8.getTemplateBasketItem()
            java.util.List r8 = r8.getTemplateParameters()
            java.util.Iterator r8 = r8.iterator()
        L_0x006f:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0116
            java.lang.Object r1 = r8.next()
            ge.bog.mobilebank.model.template.TemplateBasketParameter r1 = (p341ge.bog.mobilebank.model.template.TemplateBasketParameter) r1
            java.lang.String r4 = r1.getParameterKey()
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x006f
            java.lang.String r4 = r1.getParameterKey()
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x006f
            if (r9 == 0) goto L_0x006f
            ge.bog.mobilebank.model.payment.PaymentServiceConfig r4 = r9.getServiceConfigJson()
            if (r4 == 0) goto L_0x006f
            ge.bog.mobilebank.model.payment.PaymentServiceConfig r4 = r9.getServiceConfigJson()
            java.lang.String r4 = r4.getType()
            java.lang.String r5 = "byList"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x00cf
            ge.bog.mobilebank.model.payment.PaymentServiceConfig r4 = r9.getServiceConfigJson()
            java.lang.String r4 = r4.getType()
            java.lang.String r5 = "debtList"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x00cf
            ge.bog.mobilebank.model.payment.PaymentServiceConfig r4 = r9.getServiceConfigJson()
            ge.bog.mobilebank.model.payment.PaymentServiceConfigParameter[] r4 = r4.getParameter()
            if (r4 == 0) goto L_0x006f
            ge.bog.mobilebank.model.payment.PaymentServiceConfig r4 = r9.getServiceConfigJson()
            java.lang.String r5 = r1.getParameterKey()
            ge.bog.mobilebank.model.payment.PaymentServiceConfigParameter r4 = r4.getParameterByID(r5)
            if (r4 == 0) goto L_0x006f
        L_0x00cf:
            int r4 = r1.getParameterIndex()
            java.lang.String r5 = ""
            if (r4 == 0) goto L_0x0103
            java.lang.String r4 = r1.getParameterKey()
            java.lang.Object r4 = r10.get(r4)
            if (r4 != 0) goto L_0x00e2
            goto L_0x0103
        L_0x00e2:
            java.lang.String r4 = r1.getParameterKey()
            java.lang.String r6 = r1.getParameterKey()
            java.lang.Object r6 = r10.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = r1.getParameterValue()
            if (r7 == 0) goto L_0x00fa
            java.lang.String r5 = r1.getParameterValue()
        L_0x00fa:
            java.lang.String r1 = r6.concat(r5)
            r10.put(r4, r1)
            goto L_0x006f
        L_0x0103:
            java.lang.String r4 = r1.getParameterKey()
            java.lang.String r6 = r1.getParameterValue()
            if (r6 == 0) goto L_0x0111
            java.lang.String r5 = r1.getParameterValue()
        L_0x0111:
            r10.put(r4, r5)
            goto L_0x006f
        L_0x0116:
            java.util.Set r8 = r10.keySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x011e:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0141
            java.lang.Object r9 = r8.next()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r1 = r10.get(r9)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x011e
            int r2 = r1.length()
            if (r2 <= 0) goto L_0x011e
            ge.bog.mobilebank.model.KeyValue r2 = new ge.bog.mobilebank.model.KeyValue
            r2.<init>(r9, r1)
            r0.add(r2)
            goto L_0x011e
        L_0x0141:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g91.C32315k0.m95268q(ge.bog.mobilebank.model.template.TemplateBasketItemWrapperForSelection, ge.bog.mobilebank.model.payment.PaymentProviderConfiguration, boolean):java.util.ArrayList");
    }

    /* renamed from: r */
    public static ArrayList m95269r(Context context, PaymentServiceConfig paymentServiceConfig, ArrayList arrayList, boolean z, boolean z2) {
        String C;
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList();
        if (paymentServiceConfig.getParameter().length > 0) {
            for (PaymentServiceConfigParameter paymentServiceConfigParameter : paymentServiceConfig.getParameter()) {
                if (paymentServiceConfigParameter.getInput() != null && paymentServiceConfigParameter.getInput().length > 0) {
                    String id = paymentServiceConfigParameter.getId();
                    if (!id.equals("commission") && !"point_value_param_id".equals(id) && !"amount_to_pay_with_point".equals(id) && (C = m95248C(id, arrayList2)) != null && !C.equals("") && m95249D(paymentServiceConfigParameter.getInput()[0].getType())) {
                        if (paymentServiceConfigParameter.getInput().length == 1 && paymentServiceConfigParameter.getInput()[0] != null && paymentServiceConfigParameter.getInput()[0].getType() != null) {
                            if (paymentServiceConfigParameter.getInput()[0].getType().equals("select")) {
                                PaymentsServiceConfigInputOption[] inputOption = paymentServiceConfigParameter.getInput()[0].getInputOption();
                                int length = inputOption.length;
                                int i = 0;
                                while (true) {
                                    if (i >= length) {
                                        break;
                                    }
                                    PaymentsServiceConfigInputOption paymentsServiceConfigInputOption = inputOption[i];
                                    if (paymentsServiceConfigInputOption.getId().equals(C)) {
                                        C = paymentServiceConfigParameter.getInput()[0].getInputOptionBundle() ? C27950a.m86286c(paymentsServiceConfigInputOption.getValue(), true) : paymentsServiceConfigInputOption.getValue();
                                    } else {
                                        i++;
                                    }
                                }
                            } else if (paymentServiceConfigParameter.getInput()[0].getType().equals("amount")) {
                                if (!C.equals("")) {
                                    C = C32359z0.m95544O(C);
                                }
                            } else if ("D".equals(paymentServiceConfigParameter.getParamType()) && !C.equals("")) {
                                C = C32359z0.m95539J(C);
                            }
                        }
                        if (C != null && !C.equals("")) {
                            String c = C27950a.m86286c(paymentServiceConfigParameter.getName(), true);
                            if (!z || (!id.equals("amount") && !id.equals("amount_to_pay_with_point"))) {
                                arrayList3.add(new KeyValue(c, C));
                            }
                        }
                    }
                }
            }
            String l = m95263l(arrayList2, z2);
            String C2 = m95248C("amount", arrayList2);
            if (!z && l != null && !l.equals("") && C2 != null && !C2.equals("")) {
                arrayList3.add(new KeyValue(context.getString(C10328q.common_text_commission), l));
            }
        }
        return arrayList3;
    }

    /* renamed from: s */
    public static String m95270s(PaymentExecuteEssObject paymentExecuteEssObject) {
        boolean z;
        if (paymentExecuteEssObject.getError() == null || paymentExecuteEssObject.getError().length() <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z && (paymentExecuteEssObject.getStatus() == null || paymentExecuteEssObject.getStatus().equals("P"))) {
            return "P";
        }
        if (paymentExecuteEssObject.getStatus() != null && paymentExecuteEssObject.getStatus().equals("N")) {
            return "N";
        }
        if (BankApiResponse.CODE_STATUS_WARNING.equals(paymentExecuteEssObject.getStatus())) {
            return BankApiResponse.CODE_STATUS_WARNING;
        }
        return "R";
    }

    /* renamed from: t */
    public static String m95271t(ArrayList arrayList) {
        return m95248C("point_value_param_id", arrayList);
    }

    /* renamed from: u */
    public static PaymentProviderConfiguration m95272u(PaymentProviderConfiguration paymentProviderConfiguration) {
        if (!(paymentProviderConfiguration == null || paymentProviderConfiguration.getServiceConfigJson() == null || paymentProviderConfiguration.getServiceConfigJson().getParameter() == null || paymentProviderConfiguration.getServiceConfigJson().getParameter().length <= 0)) {
            PaymentServiceConfigParameter[] parameter = paymentProviderConfiguration.getServiceConfigJson().getParameter();
            int length = parameter.length + 1;
            PaymentServiceConfigParameter[] paymentServiceConfigParameterArr = new PaymentServiceConfigParameter[length];
            int i = 0;
            for (PaymentServiceConfigParameter paymentServiceConfigParameter : parameter) {
                if (!paymentServiceConfigParameter.getId().equals("amount")) {
                    paymentServiceConfigParameterArr[i] = paymentServiceConfigParameter;
                    i++;
                }
            }
            int i2 = length - 1;
            int i3 = i2 - 1;
            if (paymentServiceConfigParameterArr[i3] == null) {
                PaymentServiceConfigParameter paymentServiceConfigParameter2 = new PaymentServiceConfigParameter();
                paymentServiceConfigParameter2.setId("amount_to_pay_with_point");
                paymentServiceConfigParameter2.setMandatory(Boolean.TRUE);
                paymentServiceConfigParameter2.setName(C36546y.m108285N().getResources().getString(C10328q.common_text_amount));
                PaymentServiceConfigInput paymentServiceConfigInput = new PaymentServiceConfigInput();
                paymentServiceConfigInput.setType("amount");
                paymentServiceConfigParameter2.setInput(new PaymentServiceConfigInput[]{paymentServiceConfigInput});
                paymentServiceConfigParameterArr[i3] = paymentServiceConfigParameter2;
            }
            if (paymentServiceConfigParameterArr[i2] == null) {
                PaymentServiceConfigParameter paymentServiceConfigParameter3 = new PaymentServiceConfigParameter();
                paymentServiceConfigParameter3.setId("point_value_param_id");
                paymentServiceConfigParameter3.setMandatory(Boolean.FALSE);
                paymentServiceConfigParameter3.setName(C36546y.m108285N().getResources().getString(C10328q.payments_plus_points));
                PaymentServiceConfigInput paymentServiceConfigInput2 = new PaymentServiceConfigInput();
                paymentServiceConfigInput2.setType("text");
                paymentServiceConfigParameter3.setInput(new PaymentServiceConfigInput[]{paymentServiceConfigInput2});
                paymentServiceConfigParameterArr[i2] = paymentServiceConfigParameter3;
            }
            paymentProviderConfiguration.getServiceConfigJson().setParameter(paymentServiceConfigParameterArr);
        }
        return paymentProviderConfiguration;
    }

    /* renamed from: v */
    public static ArrayMap m95273v(ArrayList arrayList, PaymentServiceConfig paymentServiceConfig, boolean z) {
        ArrayMap arrayMap = new ArrayMap();
        if (!(paymentServiceConfig == null || paymentServiceConfig.getParameter() == null || paymentServiceConfig.getParameter().length <= 0)) {
            for (PaymentServiceConfigParameter paymentServiceConfigParameter : paymentServiceConfig.getParameter()) {
                String id = paymentServiceConfigParameter.getId();
                PaymentServiceConfigInput[] input = paymentServiceConfigParameter.getInput();
                String C = m95248C(id, arrayList);
                if (input != null && C != null && C.length() > 0 && m95249D(input[0].getType())) {
                    if (input.length != 1) {
                        String paramMask = paymentServiceConfigParameter.getParamMask();
                        if (paramMask == null || paramMask.length() <= 0) {
                            arrayMap.put(id, m95274w(C, paymentServiceConfigParameter));
                        } else {
                            arrayMap.put(id, new String[]{m95258g(C, paramMask)});
                        }
                    } else if (!id.equals("amount") || !z) {
                        arrayMap.put(id, new String[]{C});
                    }
                }
            }
        }
        return arrayMap;
    }

    /* renamed from: w */
    private static String[] m95274w(String str, PaymentServiceConfigParameter paymentServiceConfigParameter) {
        PaymentServiceConfigInput paymentServiceConfigInput;
        PaymentsServiceConfigInputOption[] inputOption;
        PaymentServiceConfigInput[] input = paymentServiceConfigParameter.getInput();
        String[] strArr = null;
        if (!(input == null || input.length != 2 || (paymentServiceConfigInput = input[0]) == null || paymentServiceConfigInput.getType() == null || !paymentServiceConfigInput.getType().equals("select") || (inputOption = paymentServiceConfigInput.getInputOption()) == null)) {
            for (PaymentsServiceConfigInputOption paymentsServiceConfigInputOption : inputOption) {
                if (paymentsServiceConfigInputOption.getId() != null && str.length() >= paymentsServiceConfigInputOption.getId().length() && str.startsWith(paymentsServiceConfigInputOption.getId())) {
                    String id = paymentsServiceConfigInputOption.getId();
                    strArr = new String[]{id, str.substring(id.length(), str.length())};
                }
            }
        }
        return strArr;
    }

    /* renamed from: x */
    public static String m95275x(TemplateBasketItemsWithPaymentConfig templateBasketItemsWithPaymentConfig, TemplateBasketItem templateBasketItem, boolean z) {
        String str;
        PaymentServiceConfig paymentServiceConfigOfItem = templateBasketItemsWithPaymentConfig.getPaymentServiceConfigOfItem(templateBasketItem);
        String str2 = "M";
        String str3 = "";
        int i = 0;
        while (i < 2) {
            if (paymentServiceConfigOfItem != null) {
                Iterator<String> it = paymentServiceConfigOfItem.getAllParameterIdsByParamType(str2).iterator();
                boolean z2 = false;
                while (it.hasNext()) {
                    String next = it.next();
                    if (paymentServiceConfigOfItem.getParameterByParamType(str2) != null) {
                        if (paymentServiceConfigOfItem.getParameterByParamType(str2).getParamMask() == null) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                    }
                    if (templateBasketItem.canGetDebt()) {
                        str = templateBasketItem.getTemplateDebtEvent().getPaymentDebt().getValueByKey(next);
                    } else if (paymentServiceConfigOfItem.getParameterInputByParamType(str2) != null) {
                        String str4 = "";
                        for (int i2 = 0; i2 < paymentServiceConfigOfItem.getParameterInputByParamType(str2).length; i2++) {
                            String parameterValue = templateBasketItem.getParameterValue(next, i2);
                            if (parameterValue != null) {
                                str4 = str4 + parameterValue;
                                if (!z2) {
                                    str4 = str4 + " ";
                                }
                            }
                        }
                        str = str4;
                    } else {
                        str = "";
                    }
                    if (z2 && str != null) {
                        str = m95264m(str, paymentServiceConfigOfItem.getParameterByParamType(str2).getParamMask(), false);
                    }
                    str3 = str3 + str;
                }
            }
            if (!z) {
                break;
            }
            i++;
            str2 = "S";
        }
        return str3;
    }

    /* renamed from: y */
    public static String m95276y(ArrayList arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        return m95248C("TEMPLATE_ID", arrayList);
    }

    /* renamed from: z */
    public static String m95277z(ArrayList arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        return m95248C("TEMPLATE_NAME", arrayList);
    }
}
