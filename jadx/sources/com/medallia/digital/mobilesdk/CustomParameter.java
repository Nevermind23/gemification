package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import org.json.JSONException;
import org.json.JSONObject;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

public class CustomParameter implements Comparable {

    /* renamed from: d */
    private static final int f30562d = 89;

    /* renamed from: a */
    private String f30563a;

    /* renamed from: b */
    private Object f30564b;

    /* renamed from: c */
    private CustomParameterType f30565c;

    public enum CustomParameterType {
        TypeString,
        TypeInteger,
        TypeLong,
        TypeDouble,
        TypeFloat,
        TypeBoolean,
        TypeNull;

        protected static CustomParameterType fromString(String str) {
            CustomParameterType customParameterType = TypeString;
            if (customParameterType.name().equals(str)) {
                return customParameterType;
            }
            CustomParameterType customParameterType2 = TypeInteger;
            if (customParameterType2.name().equals(str)) {
                return customParameterType2;
            }
            CustomParameterType customParameterType3 = TypeLong;
            if (customParameterType3.name().equals(str)) {
                return customParameterType3;
            }
            CustomParameterType customParameterType4 = TypeDouble;
            if (customParameterType4.name().equals(str)) {
                return customParameterType4;
            }
            CustomParameterType customParameterType5 = TypeFloat;
            if (customParameterType5.name().equals(str)) {
                return customParameterType5;
            }
            CustomParameterType customParameterType6 = TypeBoolean;
            if (customParameterType6.name().equals(str)) {
                return customParameterType6;
            }
            CustomParameterType customParameterType7 = TypeNull;
            if (customParameterType7.name().equals(str)) {
                return customParameterType7;
            }
            return null;
        }

        protected static CustomParameterType parseType(Object obj) {
            if (obj == null) {
                return TypeNull;
            }
            if (obj instanceof String) {
                return TypeString;
            }
            if (obj instanceof Integer) {
                return TypeInteger;
            }
            if (obj instanceof Long) {
                return TypeLong;
            }
            if (obj instanceof Double) {
                return TypeDouble;
            }
            if (obj instanceof Float) {
                return TypeFloat;
            }
            if (obj instanceof Boolean) {
                return TypeBoolean;
            }
            return null;
        }

        public Object validateValueFromType(Object obj) {
            if (this == TypeNull) {
                return obj;
            }
            if (this == TypeString) {
                return obj.toString();
            }
            if (this == TypeInteger) {
                return Integer.valueOf((int) Double.valueOf(String.valueOf(obj)).longValue());
            }
            if (this == TypeLong) {
                return Long.valueOf(Double.valueOf(String.valueOf(obj)).longValue());
            }
            if (this == TypeDouble) {
                return Double.valueOf(String.valueOf(obj));
            }
            if (this == TypeFloat) {
                return Float.valueOf(String.valueOf(obj));
            }
            if (this != TypeBoolean) {
                return null;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.equalsIgnoreCase("true") || valueOf.equalsIgnoreCase("1")) {
                return Boolean.TRUE;
            }
            if (valueOf.equalsIgnoreCase("false") || valueOf.equalsIgnoreCase(BankApiResponse.SUCCESSFUL_RESPONSE_CODE)) {
                return Boolean.FALSE;
            }
            return null;
        }
    }

    public CustomParameter() {
    }

    public CustomParameter(JSONObject jSONObject) {
        try {
            if (jSONObject.has("name") && !jSONObject.isNull("name")) {
                this.f30563a = jSONObject.getString("name");
            }
            if (jSONObject.has(C11089s6.f31873c) && !jSONObject.isNull(C11089s6.f31873c)) {
                this.f30565c = CustomParameterType.fromString(jSONObject.getString(C11089s6.f31873c));
            }
            if (jSONObject.has(C11755a.C11756a.f34100b) && !jSONObject.isNull(C11755a.C11756a.f34100b)) {
                this.f30564b = jSONObject.get(C11755a.C11756a.f34100b);
            }
        } catch (JSONException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public CustomParameterType mo27771a() {
        return this.f30565c;
    }

    /* renamed from: b */
    public String mo27774b() {
        return this.f30563a;
    }

    /* renamed from: c */
    public Object mo27775c() {
        return this.f30564b;
    }

    public int compareTo(Object obj) {
        if (!(obj instanceof CustomParameter)) {
            return 1;
        }
        CustomParameter customParameter = (CustomParameter) obj;
        String str = this.f30563a;
        if (str == null) {
            return -1;
        }
        String str2 = customParameter.f30563a;
        if (str2 == null) {
            return 1;
        }
        return str.compareTo(str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public JSONObject mo27777d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", C11051p3.m40514a((Object) this.f30563a));
            jSONObject.put(C11089s6.f31873c, C11051p3.m40514a((Object) this.f30565c));
            jSONObject.put(C11755a.C11756a.f34100b, C11051p3.m40514a(this.f30564b));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo27778e() {
        return "Name: " + this.f30563a + " Value: " + this.f30564b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r2 = r5.f30563a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.medallia.digital.mobilesdk.CustomParameter
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            com.medallia.digital.mobilesdk.CustomParameter r5 = (com.medallia.digital.mobilesdk.CustomParameter) r5
            java.lang.String r0 = r4.f30563a
            if (r0 != 0) goto L_0x000d
            return r1
        L_0x000d:
            java.lang.String r2 = r5.f30563a
            if (r2 != 0) goto L_0x0012
            return r1
        L_0x0012:
            java.lang.Object r3 = r4.f30564b
            if (r3 != 0) goto L_0x0017
            return r1
        L_0x0017:
            java.lang.Object r3 = r5.f30564b
            if (r3 == 0) goto L_0x002c
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x002c
            java.lang.Object r0 = r4.f30564b
            java.lang.Object r5 = r5.f30564b
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x002c
            r1 = 1
        L_0x002c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.CustomParameter.equals(java.lang.Object):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public CustomParameter mo27780f() {
        this.f30564b = this.f30565c.validateValueFromType(this.f30564b);
        return this;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 89;
        String str = this.f30563a;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 89;
        Object obj = this.f30564b;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "Name: " + this.f30563a + " Value: " + this.f30564b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo27772a(Object obj) {
        CustomParameterType parseType = CustomParameterType.parseType(obj);
        if (parseType == null) {
            return false;
        }
        this.f30565c = parseType;
        this.f30564b = obj;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo27773a(String str) {
        if (str == null || TextUtils.isEmpty(str.trim())) {
            return false;
        }
        this.f30563a = str;
        return true;
    }
}
