package com.medallia.digital.mobilesdk;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.w5 */
public class C11174w5 implements C10756c1 {

    /* renamed from: a */
    private ArrayList<C11204x5> f32106a;

    /* renamed from: b */
    private String f32107b;

    /* renamed from: c */
    private boolean f32108c;

    /* renamed from: d */
    private String f32109d;

    public C11174w5() {
    }

    protected C11174w5(JSONObject jSONObject) {
        try {
            if (jSONObject.has("rulesStatus") && !jSONObject.isNull("rulesStatus") && (jSONObject.get("rulesStatus") instanceof JSONArray)) {
                this.f32106a = ModelFactory.getInstance().getRulesArray(jSONObject.getJSONArray("rulesStatus"));
            }
            if (jSONObject.has("cuuidPath") && !jSONObject.isNull("cuuidPath")) {
                this.f32107b = jSONObject.getString("cuuidPath");
            }
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* renamed from: a */
    public String mo29148a() {
        return this.f32109d;
    }

    /* renamed from: b */
    public String mo29151b() {
        return this.f32107b;
    }

    /* renamed from: c */
    public ArrayList<C11204x5> mo29152c() {
        return this.f32106a;
    }

    /* renamed from: d */
    public boolean mo29153d() {
        return this.f32108c;
    }

    public String toJsonString() {
        try {
            return "{\"rulesStatus\":" + ModelFactory.getInstance().rulesAsJsoString(this.f32106a) + ",\"cuuidPath\":" + C11051p3.m40518c(this.f32107b) + "}";
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }

    /* renamed from: a */
    public void mo29149a(String str) {
        this.f32109d = str;
    }

    /* renamed from: a */
    public void mo29150a(boolean z) {
        this.f32108c = z;
    }
}
