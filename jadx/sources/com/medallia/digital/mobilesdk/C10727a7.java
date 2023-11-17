package com.medallia.digital.mobilesdk;

import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.a7 */
class C10727a7 implements C10756c1 {

    /* renamed from: a */
    private C11155v7<Boolean> f30657a;

    /* renamed from: b */
    private ArrayList<C11236z1<Boolean>> f30658b;

    /* renamed from: c */
    private ArrayList<C11236z1<Long>> f30659c;

    public C10727a7(JSONObject jSONObject) {
        try {
            if (jSONObject.has("preEvaluation") && !jSONObject.isNull("preEvaluation")) {
                this.f30657a = new C11155v7<>(jSONObject.getJSONObject("preEvaluation"));
            }
            Class<C11236z1> cls = C11236z1.class;
            if (jSONObject.has("triggerRules")) {
                if (!jSONObject.isNull("triggerRules")) {
                    this.f30658b = ModelFactory.getInstance().getContractArray(cls.getName(), jSONObject.getJSONArray("triggerRules"));
                }
            }
            if (jSONObject.has("nextEvaluationTime") && !jSONObject.isNull("nextEvaluationTime")) {
                this.f30659c = ModelFactory.getInstance().getContractArray(cls.getName(), jSONObject.getJSONArray("nextEvaluationTime"));
            }
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ArrayList<C11236z1<Long>> mo28088a() {
        return this.f30659c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C11155v7<Boolean> mo28089b() {
        return this.f30657a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public ArrayList<C11236z1<Boolean>> mo28090c() {
        return this.f30658b;
    }

    public String toJsonString() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("{\"preEvaluation\":");
            C11155v7<Boolean> v7Var = this.f30657a;
            sb.append(v7Var == null ? "null" : v7Var.toJsonString());
            sb.append(",\"triggerRules\":");
            sb.append(ModelFactory.getInstance().getContractsAsJsonString(this.f30658b));
            sb.append(",\"nextEvaluationTime\":");
            sb.append(ModelFactory.getInstance().getContractsAsJsonString(this.f30659c));
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }
}
