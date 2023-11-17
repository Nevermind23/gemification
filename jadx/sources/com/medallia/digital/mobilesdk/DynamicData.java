package com.medallia.digital.mobilesdk;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

class DynamicData {
    private ArrayList<C10917j5> pages = new ArrayList<>();

    protected DynamicData(JSONObject jSONObject) {
        try {
            if (jSONObject.has("pages") && !jSONObject.isNull("pages")) {
                this.pages = ModelFactory.getInstance().getPageArray(jSONObject.getJSONArray("pages"));
            }
        } catch (JSONException e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public ArrayList<C10917j5> getPages() {
        return this.pages;
    }
}
