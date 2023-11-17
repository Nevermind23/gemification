package com.salesforce.marketingcloud.messages.iam;

import af1.C40296c;
import com.salesforce.marketingcloud.internal.C11516m;
import com.salesforce.marketingcloud.messages.iam.InAppMessage;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import ie1.C41330k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import org.json.JSONArray;
import org.json.JSONObject;
import ze1.C43420e;

/* renamed from: com.salesforce.marketingcloud.messages.iam.h */
public final class C11649h {
    /* renamed from: a */
    public static final InAppMessage.CloseButton m42519a(JSONObject jSONObject) {
        C41536l.m120489i(jSONObject, "<this>");
        InAppMessage.Alignment alignment = InAppMessage.Alignment.end;
        String optString = jSONObject.optString("alignment");
        C41536l.m120488h(optString, "optString(name)");
        String b = C11516m.m42087b(optString);
        if (b != null) {
            alignment = InAppMessage.Alignment.valueOf(b);
        }
        return new InAppMessage.CloseButton(alignment);
    }

    /* renamed from: b */
    public static final InAppMessage.Media m42521b(JSONObject jSONObject) {
        C41536l.m120489i(jSONObject, "<this>");
        String string = jSONObject.getString(C11769i.C11770a.f34149l);
        C41536l.m120488h(string, "getString(\"url\")");
        InAppMessage.Media.ImageSize imageSize = InAppMessage.Media.ImageSize.e2e;
        String optString = jSONObject.optString("size");
        C41536l.m120488h(optString, "optString(name)");
        String b = C11516m.m42087b(optString);
        if (b != null) {
            imageSize = InAppMessage.Media.ImageSize.valueOf(b);
        }
        InAppMessage.Media.ImageSize imageSize2 = imageSize;
        String optString2 = jSONObject.optString("altText");
        C41536l.m120488h(optString2, "optString(\"altText\")");
        String b2 = C11516m.m42087b(optString2);
        InAppMessage.Size size = InAppMessage.Size.s;
        String optString3 = jSONObject.optString("borderWidth");
        C41536l.m120488h(optString3, "optString(name)");
        String b3 = C11516m.m42087b(optString3);
        InAppMessage.Size valueOf = b3 != null ? InAppMessage.Size.valueOf(b3) : size;
        String optString4 = jSONObject.optString("borderColor");
        C41536l.m120488h(optString4, "optString(\"borderColor\")");
        String b4 = C11516m.m42087b(optString4);
        String optString5 = jSONObject.optString("cornerRadius");
        C41536l.m120488h(optString5, "optString(name)");
        String b5 = C11516m.m42087b(optString5);
        return new InAppMessage.Media(string, imageSize2, b2, valueOf, b4, b5 != null ? InAppMessage.Size.valueOf(b5) : size);
    }

    /* renamed from: c */
    public static final InAppMessage.TextField m42522c(JSONObject jSONObject) {
        C41536l.m120489i(jSONObject, "<this>");
        String string = jSONObject.getString("text");
        C41536l.m120488h(string, "getString(\"text\")");
        InAppMessage.Size size = InAppMessage.Size.s;
        String optString = jSONObject.optString("fontSize");
        C41536l.m120488h(optString, "optString(name)");
        String b = C11516m.m42087b(optString);
        if (b != null) {
            size = InAppMessage.Size.valueOf(b);
        }
        String optString2 = jSONObject.optString("fontColor");
        C41536l.m120488h(optString2, "optString(\"fontColor\")");
        String b2 = C11516m.m42087b(optString2);
        InAppMessage.Alignment alignment = InAppMessage.Alignment.center;
        String optString3 = jSONObject.optString("alignment");
        C41536l.m120488h(optString3, "optString(name)");
        String b3 = C11516m.m42087b(optString3);
        if (b3 != null) {
            alignment = InAppMessage.Alignment.valueOf(b3);
        }
        return new InAppMessage.TextField(string, size, b2, alignment);
    }

    /* renamed from: a */
    public static final List<InAppMessage.Button> m42520a(JSONArray jSONArray) {
        InAppMessage.Button button;
        JSONObject jSONObject;
        Object obj;
        JSONArray jSONArray2 = jSONArray;
        C41536l.m120489i(jSONArray2, "<this>");
        C43420e o = C43429k.m124596o(0, jSONArray.length());
        ArrayList<JSONObject> arrayList = new ArrayList<>(C41343r.m119925u(o, 10));
        Iterator it = o.iterator();
        while (it.hasNext()) {
            int nextInt = ((C41330k0) it).nextInt();
            Class<JSONObject> cls = JSONObject.class;
            C40296c b = C41520a0.m120436b(cls);
            if (C41536l.m120484d(b, C41520a0.m120436b(cls))) {
                jSONObject = jSONArray2.getJSONObject(nextInt);
                if (jSONObject == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
            } else {
                if (C41536l.m120484d(b, C41520a0.m120436b(Integer.TYPE))) {
                    obj = Integer.valueOf(jSONArray2.getInt(nextInt));
                } else if (C41536l.m120484d(b, C41520a0.m120436b(Double.TYPE))) {
                    obj = Double.valueOf(jSONArray2.getDouble(nextInt));
                } else if (C41536l.m120484d(b, C41520a0.m120436b(Long.TYPE))) {
                    obj = Long.valueOf(jSONArray2.getLong(nextInt));
                } else if (C41536l.m120484d(b, C41520a0.m120436b(Boolean.TYPE))) {
                    obj = Boolean.valueOf(jSONArray2.getBoolean(nextInt));
                } else if (C41536l.m120484d(b, C41520a0.m120436b(String.class))) {
                    obj = jSONArray2.getString(nextInt);
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                } else {
                    obj = jSONArray2.get(nextInt);
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                }
                jSONObject = (JSONObject) obj;
            }
            arrayList.add(jSONObject);
        }
        ArrayList arrayList2 = new ArrayList();
        for (JSONObject jSONObject2 : arrayList) {
            try {
                String string = jSONObject2.getString("id");
                C41536l.m120488h(string, "btnJson.getString(\"id\")");
                int optInt = jSONObject2.optInt("index", 0);
                String string2 = jSONObject2.getString("text");
                C41536l.m120488h(string2, "btnJson.getString(\"text\")");
                InAppMessage.Button.ActionType actionType = InAppMessage.Button.ActionType.close;
                String optString = jSONObject2.optString("actionType");
                C41536l.m120488h(optString, "optString(name)");
                String b2 = C11516m.m42087b(optString);
                if (b2 != null) {
                    actionType = InAppMessage.Button.ActionType.valueOf(b2);
                }
                String optString2 = jSONObject2.optString("actionAndroid");
                C41536l.m120488h(optString2, "btnJson.optString(\"actionAndroid\")");
                String b3 = C11516m.m42087b(optString2);
                String optString3 = jSONObject2.optString("fontColor");
                C41536l.m120488h(optString3, "btnJson.optString(\"fontColor\")");
                String b4 = C11516m.m42087b(optString3);
                InAppMessage.Size size = InAppMessage.Size.s;
                String optString4 = jSONObject2.optString("fontSize");
                C41536l.m120488h(optString4, "optString(name)");
                String b5 = C11516m.m42087b(optString4);
                InAppMessage.Size valueOf = b5 != null ? InAppMessage.Size.valueOf(b5) : size;
                String optString5 = jSONObject2.optString("backgroundColor");
                C41536l.m120488h(optString5, "btnJson.optString(\"backgroundColor\")");
                String b6 = C11516m.m42087b(optString5);
                String optString6 = jSONObject2.optString("borderColor");
                C41536l.m120488h(optString6, "btnJson.optString(\"borderColor\")");
                String b7 = C11516m.m42087b(optString6);
                String optString7 = jSONObject2.optString("borderWidth");
                C41536l.m120488h(optString7, "optString(name)");
                String b8 = C11516m.m42087b(optString7);
                InAppMessage.Size valueOf2 = b8 != null ? InAppMessage.Size.valueOf(b8) : size;
                String optString8 = jSONObject2.optString("cornerRadius");
                C41536l.m120488h(optString8, "optString(name)");
                String b9 = C11516m.m42087b(optString8);
                button = new InAppMessage.Button(string, optInt, string2, actionType, b3, b4, valueOf, b6, b7, valueOf2, b9 != null ? InAppMessage.Size.valueOf(b9) : size);
            } catch (Exception unused) {
                button = null;
            }
            InAppMessage.Button button2 = button;
            if (button2 != null) {
                arrayList2.add(button2);
            }
        }
        return arrayList2;
    }
}
