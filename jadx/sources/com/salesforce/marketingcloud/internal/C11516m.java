package com.salesforce.marketingcloud.internal;

import af1.C40296c;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import he1.C41224m;
import he1.C41233s;
import ie1.C41330k0;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import org.json.JSONArray;
import org.json.JSONObject;
import p342j$.util.DesugarTimeZone;
import ue1.C43064a;
import ze1.C43420e;

/* renamed from: com.salesforce.marketingcloud.internal.m */
public final class C11516m {

    /* renamed from: a */
    private static final String f33433a = C11461g.m41875a("GeneralUtils");

    /* renamed from: b */
    private static final String f33434b = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

    /* renamed from: c */
    private static final TimeZone f33435c;

    /* renamed from: d */
    private static final Charset f33436d;

    /* renamed from: com.salesforce.marketingcloud.internal.m$a */
    static final class C11517a extends C41537m implements C43064a {

        /* renamed from: a */
        final /* synthetic */ String f33437a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11517a(String str) {
            super(0);
            this.f33437a = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Unable to parse " + this.f33437a + " as a Date.";
        }
    }

    static {
        TimeZone timeZone = DesugarTimeZone.getTimeZone("UTC");
        C41536l.m120488h(timeZone, "getTimeZone(\"UTC\")");
        f33435c = timeZone;
        Charset forName = Charset.forName("UTF-8");
        C41536l.m120488h(forName, "forName(\"UTF-8\")");
        f33436d = forName;
    }

    /* renamed from: a */
    public static final /* synthetic */ <T extends Enum<T>> T m42080a(JSONObject jSONObject, String str) {
        C41536l.m120489i(jSONObject, "<this>");
        C41536l.m120489i(str, "name");
        String string = jSONObject.getString(str);
        C41536l.m120488h(string, "getString(name)");
        C41536l.m120494n(5, "T");
        return Enum.valueOf((Class) null, string);
    }

    /* renamed from: b */
    public static final String m42087b(String str) {
        C41536l.m120489i(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        return str;
    }

    /* renamed from: a */
    public static final /* synthetic */ <T extends Enum<T>> T m42081a(JSONObject jSONObject, String str, T t) {
        C41536l.m120489i(jSONObject, "<this>");
        C41536l.m120489i(str, "name");
        C41536l.m120489i(t, "default");
        String optString = jSONObject.optString(str);
        C41536l.m120488h(optString, "optString(name)");
        String b = m42087b(optString);
        if (b == null) {
            return t;
        }
        C41536l.m120494n(5, "T");
        return Enum.valueOf((Class) null, b);
    }

    /* renamed from: b */
    public static final Charset m42088b() {
        return f33436d;
    }

    /* renamed from: a */
    public static final String m42082a(Date date) {
        C41536l.m120489i(date, "<this>");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(f33434b, Locale.US);
        simpleDateFormat.setTimeZone(m42085a());
        String format = simpleDateFormat.format(date);
        C41536l.m120488h(format, "SimpleDateFormat(DATE_FO…ne = UTC\n  }.format(this)");
        return format;
    }

    /* renamed from: b */
    public static final Map<String, String> m42089b(JSONArray jSONArray) {
        JSONObject jSONObject;
        Object obj;
        C41536l.m120489i(jSONArray, "<this>");
        C43420e o = C43429k.m124596o(0, jSONArray.length());
        ArrayList<JSONObject> arrayList = new ArrayList<>(C41343r.m119925u(o, 10));
        Iterator it = o.iterator();
        while (it.hasNext()) {
            int nextInt = ((C41330k0) it).nextInt();
            Class<JSONObject> cls = JSONObject.class;
            C40296c b = C41520a0.m120436b(cls);
            if (C41536l.m120484d(b, C41520a0.m120436b(cls))) {
                jSONObject = jSONArray.getJSONObject(nextInt);
                if (jSONObject == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
            } else {
                if (C41536l.m120484d(b, C41520a0.m120436b(Integer.TYPE))) {
                    obj = Integer.valueOf(jSONArray.getInt(nextInt));
                } else if (C41536l.m120484d(b, C41520a0.m120436b(Double.TYPE))) {
                    obj = Double.valueOf(jSONArray.getDouble(nextInt));
                } else if (C41536l.m120484d(b, C41520a0.m120436b(Long.TYPE))) {
                    obj = Long.valueOf(jSONArray.getLong(nextInt));
                } else if (C41536l.m120484d(b, C41520a0.m120436b(Boolean.TYPE))) {
                    obj = Boolean.valueOf(jSONArray.getBoolean(nextInt));
                } else if (C41536l.m120484d(b, C41520a0.m120436b(String.class))) {
                    obj = jSONArray.getString(nextInt);
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                } else {
                    obj = jSONArray.get(nextInt);
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                }
                jSONObject = (JSONObject) obj;
            }
            arrayList.add(jSONObject);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C43429k.m124585d(C41342q0.m119921f(C41343r.m119925u(arrayList, 10)), 16));
        for (JSONObject jSONObject2 : arrayList) {
            C41224m a = C41233s.m119492a(jSONObject2.optString("key"), jSONObject2.optString(C11755a.C11756a.f34100b));
            linkedHashMap.put(a.mo95678e(), a.mo95680f());
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public static final Date m42083a(String str) {
        C41536l.m120489i(str, "<this>");
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(f33434b, Locale.US);
            simpleDateFormat.setTimeZone(m42085a());
            return simpleDateFormat.parse(str);
        } catch (ParseException e) {
            C11461g.f33306a.mo29962b(f33433a, (Throwable) e, (C43064a) new C11517a(str));
            return null;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ <T> List<T> m42084a(JSONArray jSONArray) {
        C41536l.m120489i(jSONArray, "<this>");
        C43420e o = C43429k.m124596o(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(C41343r.m119925u(o, 10));
        Iterator it = o.iterator();
        while (it.hasNext()) {
            int nextInt = ((C41330k0) it).nextInt();
            C41536l.m120494n(4, "T");
            C40296c b = C41520a0.m120436b(Object.class);
            Object jSONObject = C41536l.m120484d(b, C41520a0.m120436b(JSONObject.class)) ? jSONArray.getJSONObject(nextInt) : C41536l.m120484d(b, C41520a0.m120436b(Integer.TYPE)) ? Integer.valueOf(jSONArray.getInt(nextInt)) : C41536l.m120484d(b, C41520a0.m120436b(Double.TYPE)) ? Double.valueOf(jSONArray.getDouble(nextInt)) : C41536l.m120484d(b, C41520a0.m120436b(Long.TYPE)) ? Long.valueOf(jSONArray.getLong(nextInt)) : C41536l.m120484d(b, C41520a0.m120436b(Boolean.TYPE)) ? Boolean.valueOf(jSONArray.getBoolean(nextInt)) : C41536l.m120484d(b, C41520a0.m120436b(String.class)) ? jSONArray.getString(nextInt) : jSONArray.get(nextInt);
            C41536l.m120494n(1, "T");
            arrayList.add(jSONObject);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final TimeZone m42085a() {
        return f33435c;
    }

    /* renamed from: a */
    public static final JSONArray m42086a(Map<String, String> map) {
        C41536l.m120489i(map, "<this>");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", (String) next.getKey());
            jSONObject.put(C11755a.C11756a.f34100b, (String) next.getValue());
            arrayList.add(jSONObject);
        }
        return new JSONArray(arrayList);
    }
}
