package p154l4;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: l4.b */
public final class C6883b {

    /* renamed from: a */
    public final String f20620a;

    /* renamed from: b */
    public final String f20621b;

    /* renamed from: c */
    public final List f20622c;

    /* renamed from: d */
    public final String f20623d;

    public C6883b(JSONObject jSONObject) {
        this.f20620a = jSONObject.getString("name");
        this.f20621b = jSONObject.optString(C11755a.C11756a.f34100b);
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("path");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(new C6884c(optJSONArray.getJSONObject(i)));
            }
        }
        this.f20622c = arrayList;
        this.f20623d = jSONObject.optString("path_type", "absolute");
    }
}
