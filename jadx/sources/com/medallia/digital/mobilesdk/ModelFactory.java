package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.C10859h4;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class ModelFactory {
    private static ModelFactory modelFactory;

    ModelFactory() {
    }

    public static ModelFactory getInstance() {
        if (modelFactory == null) {
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

    private boolean validate(C10730b bVar) {
        C10859h4.C10860a aVar;
        if (bVar.mo28094c() == null) {
            aVar = C10859h4.C10860a.GET_CONFIG_EMPTY_ENDPOINT;
        } else if (bVar.mo28095d() == -1) {
            aVar = C10859h4.C10860a.ACCESS_PROPERTY_ID_NO_DATA;
        } else if (bVar.mo28093b() == -1) {
            aVar = C10859h4.C10860a.CREATION_DATE_NO_DATA;
        } else if (bVar.mo28096e() == -1) {
            aVar = C10859h4.C10860a.TTL_NO_DATA;
        } else if (bVar.mo28827a() != null) {
            return true;
        } else {
            aVar = C10859h4.C10860a.ACCESS_TOKEN_TOKEN_FIELD_NO_DATA;
        }
        C10735b4.m39114f(aVar.toString());
        return false;
    }

    private void validateConfiguration(ConfigurationContract configurationContract) {
        if (configurationContract != null) {
            configurationContract.validateFields();
        } else {
            C10735b4.m39114f(C10859h4.C10860a.CONFIGURATION.toString());
        }
    }

    private void validateFeedback(C10789e2 e2Var) {
        if (e2Var == null || e2Var.mo28258a() == null) {
            C10735b4.m39114f(C10859h4.C10860a.FEEDBACK_PARSE_ERROR.toString());
        }
    }

    private void validatePropertyConfiguration(PropertyConfigurationContract propertyConfigurationContract) {
        if (propertyConfigurationContract != null) {
            propertyConfigurationContract.validateFields();
        } else {
            C10735b4.m39114f(C10859h4.C10860a.CONFIGURATION.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.medallia.digital.mobilesdk.C10730b createAccessToken(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "accessToken"
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            r2 = 0
            if (r1 == 0) goto L_0x0013
        L_0x0009:
            com.medallia.digital.mobilesdk.h4$a r5 = com.medallia.digital.mobilesdk.C10859h4.C10860a.ACCESS_TOKEN_PARSE
            java.lang.String r5 = r5.toString()
            com.medallia.digital.mobilesdk.C10735b4.m39111c(r5)
            return r2
        L_0x0013:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0041, Exception -> 0x0027 }
            r1.<init>(r5)     // Catch:{ JSONException -> 0x0041, Exception -> 0x0027 }
            boolean r3 = r1.has(r0)     // Catch:{ JSONException -> 0x0041, Exception -> 0x0027 }
            if (r3 == 0) goto L_0x0040
            java.lang.Object r0 = r1.get(r0)     // Catch:{ JSONException -> 0x0041, Exception -> 0x0027 }
            java.lang.String r5 = r0.toString()     // Catch:{ JSONException -> 0x0041, Exception -> 0x0027 }
            goto L_0x0041
        L_0x0027:
            r5 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.medallia.digital.mobilesdk.h4$a r1 = com.medallia.digital.mobilesdk.C10859h4.C10860a.ACCESS_TOKEN_PARSE
            r0.append(r1)
            java.lang.String r5 = r5.getMessage()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            com.medallia.digital.mobilesdk.C10735b4.m39111c(r5)
        L_0x0040:
            r5 = r2
        L_0x0041:
            com.medallia.digital.mobilesdk.b r0 = new com.medallia.digital.mobilesdk.b
            r0.<init>(r5)
            r0.mo28828a(r5)
            boolean r5 = r4.validate((com.medallia.digital.mobilesdk.C10730b) r0)
            if (r5 != 0) goto L_0x0050
            goto L_0x0009
        L_0x0050:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.ModelFactory.createAccessToken(java.lang.String):com.medallia.digital.mobilesdk.b");
    }

    /* access modifiers changed from: protected */
    public C11009n createApiToken(String str) {
        if (TextUtils.isEmpty(str)) {
            C10735b4.m39114f(C10859h4.C10860a.API_TOKEN_PARSE_ERROR.toString());
        } else {
            try {
                C11009n nVar = new C11009n(str);
                nVar.mo28828a(str);
                if (validate(nVar)) {
                    return nVar;
                }
                return null;
            } catch (Exception e) {
                C10735b4.m39111c(C10859h4.C10860a.API_TOKEN_PARSE_ERROR + e.getMessage());
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public ConfigurationContract createConfiguration(String str) {
        try {
            ConfigurationContract configurationContract = new ConfigurationContract(new JSONObject(str));
            validateConfiguration(configurationContract);
            return configurationContract;
        } catch (Exception e) {
            C10735b4.m39111c(C10859h4.C10860a.CONFIGURATION + e.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public EvaluationResult createEvaluationResult(String str) {
        if (str != null && !str.equals("null")) {
            try {
                return new EvaluationResult(new JSONObject(str));
            } catch (Exception e) {
                C10735b4.m39114f(e.getMessage());
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public C10789e2 createFeedback(String str) {
        try {
            C10789e2 e2Var = new C10789e2(new JSONObject(str));
            validateFeedback(e2Var);
            return e2Var;
        } catch (Exception e) {
            C10735b4.m39111c(C10859h4.C10860a.FEEDBACK_PARSE_ERROR + e.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public C10804f2 createFeedbackContract(String str) {
        try {
            return new C10804f2(new JSONObject(str));
        } catch (Exception e) {
            C10735b4.m39111c(C10859h4.C10860a.DESERIALIZE_FEEDBACK_PAYLOAD + e.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public PropertyConfigurationContract createPropertyConfiguration(String str) {
        try {
            PropertyConfigurationContract propertyConfigurationContract = new PropertyConfigurationContract(new JSONObject(str));
            validatePropertyConfiguration(propertyConfigurationContract);
            return propertyConfigurationContract;
        } catch (Exception e) {
            C10735b4.m39111c(C10859h4.C10860a.CONFIGURATION + e.getMessage());
            return null;
        }
    }

    public C11174w5 createQuarantineValidation(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new C11174w5(new JSONObject(str));
        } catch (JSONException e) {
            C10735b4.m39111c(e.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public TargetRuleEngineContract createTargetRuleEngine(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new TargetRuleEngineContract(new JSONObject(str));
        } catch (Exception e) {
            C10735b4.m39114f(e.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public C10841g7 createThankYouDataObject(String str) {
        C10841g7 g7Var = new C10841g7();
        if (str == null) {
            return g7Var;
        }
        try {
            return new C10841g7(new JSONObject(str).getJSONObject("settings").getJSONObject("formMobileThankYouPromptSettingsContract"));
        } catch (Exception e) {
            C10735b4.m39114f(e.getMessage());
            return g7Var;
        }
    }

    /* access modifiers changed from: protected */
    public C11080r7 createTransitionType(String str) {
        String str2;
        if (str != null) {
            try {
                str2 = new JSONObject(str).getJSONObject("settings").getJSONObject("formBasicSettings").getString("transitionType");
            } catch (Exception e) {
                C10735b4.m39111c(e.getMessage());
            }
            return C11080r7.m40646a(str2);
        }
        str2 = null;
        return C11080r7.m40646a(str2);
    }

    /* access modifiers changed from: protected */
    public ConfigurationUUID createUUID(String str) {
        try {
            return new ConfigurationUUID(new JSONObject(str));
        } catch (Exception e) {
            C10735b4.m39111c(C10859h4.C10860a.UUID_EMPTY + e.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public JSONArray customParametersToJsonArray(ArrayList<CustomParameter> arrayList) {
        JSONArray jSONArray = new JSONArray();
        Iterator<CustomParameter> it = arrayList.iterator();
        while (it.hasNext()) {
            JSONObject d = it.next().mo27777d();
            if (d != null) {
                jSONArray.put(d);
            }
        }
        return jSONArray;
    }

    /* access modifiers changed from: protected */
    public String getAnalyticsAsJsonString(List<C10874i> list) {
        if (list == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).toJsonString());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(']');
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public List<AppRatingContract> getAppRatingContractsArray(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                arrayList.add(new AppRatingContract(jSONArray.getJSONObject(i)));
                i++;
            } catch (JSONException e) {
                C10735b4.m39111c(e.getMessage());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public String getAppRatingsAsJsonString(List<AppRatingContract> list) {
        if (list == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).toJsonString());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public String getCUuid(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("uuid") || jSONObject.isNull("uuid")) {
                return null;
            }
            return jSONObject.getString("uuid");
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public ArrayList<Component> getComponentsArray(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList<Component> arrayList = new ArrayList<>();
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                arrayList.add(new Component(jSONArray.getJSONObject(i)));
                i++;
            } catch (JSONException e) {
                C10735b4.m39111c(e.getMessage());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public <T> ArrayList<T> getContractArray(String str, JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList<T> arrayList = new ArrayList<>();
        try {
            Constructor<?> constructor = Class.forName(str).getConstructor(new Class[]{JSONObject.class});
            int i = 0;
            while (i < jSONArray.length()) {
                try {
                    arrayList.add(constructor.newInstance(new Object[]{jSONArray.getJSONObject(i)}));
                    i++;
                } catch (JSONException e) {
                    C10735b4.m39111c(e.getMessage());
                    return arrayList;
                }
            }
        } catch (Exception e2) {
            C10735b4.m39111c(e2.getMessage());
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public <K> String getContractsAsJsonString(List<K> list) {
        if (list == null) {
            return "null";
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (int i = 0; i < list.size(); i++) {
                sb.append(((C10756c1) list.get(i)).toJsonString());
                if (i < list.size() - 1) {
                    sb.append(',');
                }
            }
            sb.append(']');
            return sb.toString();
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "null";
        }
    }

    /* access modifiers changed from: protected */
    public ArrayList<CustomParameter> getCustomParameterArray(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList<CustomParameter> arrayList = new ArrayList<>();
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                arrayList.add(new CustomParameter(jSONArray.getJSONObject(i)));
                i++;
            } catch (JSONException e) {
                C10735b4.m39111c(e.getMessage());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public List<SDKConfigurationFormContract> getFormContractsArray(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                arrayList.add(new SDKConfigurationFormContract(jSONArray.getJSONObject(i)));
                i++;
            } catch (JSONException e) {
                C10735b4.m39111c(e.getMessage());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public String getFormsAsJsonString(List<SDKConfigurationFormContract> list) {
        if (list == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).toJsonString());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(']');
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public ArrayList<C10917j5> getPageArray(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList<C10917j5> arrayList = new ArrayList<>();
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                arrayList.add(new C10917j5(jSONArray.getJSONObject(i)));
                i++;
            } catch (JSONException e) {
                C10735b4.m39111c(e.getMessage());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public String getProvisionsAsJsonString(HashMap<String, Boolean> hashMap) {
        if (hashMap == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        ArrayList arrayList = new ArrayList(hashMap.keySet());
        int i = 0;
        while (i < arrayList.size()) {
            try {
                sb.append("\"");
                sb.append((String) arrayList.get(i));
                sb.append("\":");
                sb.append(hashMap.get(arrayList.get(i)));
                if (i < arrayList.size() - 1) {
                    sb.append(',');
                }
                i++;
            } catch (Exception e) {
                C10735b4.m39111c(e.getMessage());
                return "{}";
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public List<ResourceContract> getResourcesArray(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                arrayList.add(new ResourceContract(jSONArray.getJSONObject(i)));
                i++;
            } catch (JSONException e) {
                C10735b4.m39111c(e.getMessage());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public String getResourcesAsJsonString(List<ResourceContract> list) {
        if (list == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).toJsonString());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(']');
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public ArrayList<C10840g6> getRuleConversionContract(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList<C10840g6> arrayList = new ArrayList<>();
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                arrayList.add(new C10840g6(jSONArray.getJSONObject(i)));
                i++;
            } catch (JSONException e) {
                C10735b4.m39111c(e.getMessage());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public String getRuleConversionsAsJsonString(List<C10840g6> list) {
        if (list == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).toJsonString());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public ArrayList<C11204x5> getRulesArray(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList<C11204x5> arrayList = new ArrayList<>();
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                arrayList.add(new C11204x5(jSONArray.getJSONObject(i)));
                i++;
            } catch (JSONException e) {
                C10735b4.m39111c(e.getMessage());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public ArrayList<String> getStringArray(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                arrayList.add(jSONArray.getString(i));
                i++;
            } catch (JSONException e) {
                C10735b4.m39111c(e.getMessage());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public String getStringArrayAsJsonString(ArrayList<String> arrayList) {
        if (arrayList == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == null) {
                sb.append("null");
            } else {
                sb.append("\"");
                sb.append(arrayList.get(i));
                sb.append("\"");
            }
            if (i < arrayList.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(']');
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public HashMap<String, Boolean> getStringBooleanMap(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap<String, Boolean> hashMap = new HashMap<>();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                hashMap.put(next, jSONObject.isNull(next) ? null : Boolean.valueOf(jSONObject.getBoolean(next)));
            } catch (JSONException e) {
                C10735b4.m39111c(e.getMessage());
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public HashMap<String, String> getStringMap(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                hashMap.put(next, jSONObject.isNull(next) ? null : jSONObject.getString(next));
            } catch (JSONException e) {
                C10735b4.m39111c(e.getMessage());
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public String getStringMapAsJsonString(HashMap<String, String> hashMap) {
        if (hashMap == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        ArrayList arrayList = new ArrayList(hashMap.keySet());
        int i = 0;
        while (i < arrayList.size()) {
            try {
                sb.append("\"");
                sb.append((String) arrayList.get(i));
                sb.append("\":\"");
                sb.append(hashMap.get(arrayList.get(i)));
                sb.append("\"");
                if (i < arrayList.size() - 1) {
                    sb.append(',');
                }
                i++;
            } catch (Exception e) {
                C10735b4.m39111c(e.getMessage());
                return "{}";
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public HashMap<String, C10919j7> getStringThemeMap(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap<String, C10919j7> hashMap = new HashMap<>();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                hashMap.put(next, jSONObject.isNull(next) ? null : new C10919j7(jSONObject.getJSONObject(next)));
            } catch (JSONException e) {
                C10735b4.m39111c(e.getMessage());
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public String getThemesMapAsJsonString(HashMap<String, C10919j7> hashMap) {
        if (hashMap == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        ArrayList arrayList = new ArrayList(hashMap.keySet());
        int i = 0;
        while (i < arrayList.size()) {
            try {
                sb.append("\"");
                sb.append((String) arrayList.get(i));
                sb.append("\":");
                sb.append(hashMap.get(arrayList.get(i)).mo28549b());
                if (i < arrayList.size() - 1) {
                    sb.append(',');
                }
                i++;
            } catch (Exception e) {
                C10735b4.m39111c(e.getMessage());
                return "{}";
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public <T> C11133u7<T> getTriggerChildContract(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.has("left") ? new C11182w7(jSONObject) : new C11155v7(jSONObject);
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public <T> ArrayList<C11133u7<T>> getTriggerChildesContract(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList<C11133u7<T>> arrayList = new ArrayList<>();
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                arrayList.add(jSONArray.getJSONObject(i).has("left") ? new C11182w7(jSONArray.getJSONObject(i)) : new C11155v7(jSONArray.getJSONObject(i)));
                i++;
            } catch (JSONException e) {
                C10735b4.m39111c(e.getMessage());
            }
        }
        return arrayList;
    }

    public String rulesAsJsoString(List<C11204x5> list) {
        if (list == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).toJsonString());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(']');
        return sb.toString();
    }

    private boolean validate(C11009n nVar) {
        C10859h4.C10860a aVar;
        if (TextUtils.isEmpty(nVar.mo28776b())) {
            aVar = C10859h4.C10860a.EMPTY_AUTH_GW;
        } else if (nVar.mo28777c() == -1) {
            aVar = C10859h4.C10860a.API_TOKEN_PROPERTY_ID_NO_DATA;
        } else if (!TextUtils.isEmpty(nVar.mo28827a())) {
            return true;
        } else {
            aVar = C10859h4.C10860a.API_TOKEN_TOKEN_FIELD_NO_DATA;
        }
        C10735b4.m39114f(aVar.toString());
        return false;
    }
}
