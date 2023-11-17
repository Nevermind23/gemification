package p193o4;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import com.facebook.C2626d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o4.i */
abstract class C7453i {

    /* renamed from: a */
    private static final HashMap f21730a = new HashMap();

    /* renamed from: b */
    private static final HashMap f21731b = new HashMap();

    /* renamed from: c */
    private static final String f21732c = C2626d.m10134e().getPackageName();

    /* renamed from: d */
    private static final SharedPreferences f21733d = C2626d.m10134e().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);

    /* renamed from: e */
    private static final SharedPreferences f21734e = C2626d.m10134e().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    /* renamed from: a */
    static Object m28320a(Context context, IBinder iBinder) {
        return m28333n(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", (Object) null, new Object[]{iBinder});
    }

    /* renamed from: b */
    static void m28321b() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        SharedPreferences sharedPreferences = f21733d;
        long j = sharedPreferences.getLong("LAST_CLEARED_TIME", 0);
        if (j == 0) {
            sharedPreferences.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
        } else if (currentTimeMillis - j > 604800) {
            sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
        }
    }

    /* renamed from: c */
    private static ArrayList m28322c(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        SharedPreferences.Editor edit = f21734e.edit();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("productId");
                long j = jSONObject.getLong("purchaseTime");
                String string2 = jSONObject.getString("purchaseToken");
                if (currentTimeMillis - (j / 1000) <= 86400) {
                    if (!f21734e.getString(string, "").equals(string2)) {
                        edit.putString(string, string2);
                        arrayList2.add(str);
                    }
                }
            } catch (JSONException unused) {
            }
        }
        edit.apply();
        return arrayList2;
    }

    /* renamed from: d */
    private static Class m28323d(Context context, String str) {
        HashMap hashMap = f21731b;
        Class<?> cls = (Class) hashMap.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            cls = context.getClassLoader().loadClass(str);
            hashMap.put(str, cls);
            return cls;
        } catch (ClassNotFoundException unused) {
            return cls;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Method m28324e(java.lang.Class r11, java.lang.String r12) {
        /*
            java.util.HashMap r0 = f21730a
            java.lang.Object r1 = r0.get(r12)
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 == 0) goto L_0x000b
            return r1
        L_0x000b:
            int r2 = r12.hashCode()     // Catch:{ NoSuchMethodException -> 0x009d }
            r3 = 4
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            switch(r2) {
                case -1801122596: goto L_0x0040;
                case -1450694211: goto L_0x0036;
                case -1123215065: goto L_0x002c;
                case -594356707: goto L_0x0022;
                case -573310373: goto L_0x0018;
                default: goto L_0x0017;
            }     // Catch:{ NoSuchMethodException -> 0x009d }
        L_0x0017:
            goto L_0x004a
        L_0x0018:
            java.lang.String r2 = "getSkuDetails"
            boolean r2 = r12.equals(r2)     // Catch:{ NoSuchMethodException -> 0x009d }
            if (r2 == 0) goto L_0x004a
            r2 = r7
            goto L_0x004b
        L_0x0022:
            java.lang.String r2 = "getPurchaseHistory"
            boolean r2 = r12.equals(r2)     // Catch:{ NoSuchMethodException -> 0x009d }
            if (r2 == 0) goto L_0x004a
            r2 = r3
            goto L_0x004b
        L_0x002c:
            java.lang.String r2 = "asInterface"
            boolean r2 = r12.equals(r2)     // Catch:{ NoSuchMethodException -> 0x009d }
            if (r2 == 0) goto L_0x004a
            r2 = r4
            goto L_0x004b
        L_0x0036:
            java.lang.String r2 = "isBillingSupported"
            boolean r2 = r12.equals(r2)     // Catch:{ NoSuchMethodException -> 0x009d }
            if (r2 == 0) goto L_0x004a
            r2 = r6
            goto L_0x004b
        L_0x0040:
            java.lang.String r2 = "getPurchases"
            boolean r2 = r12.equals(r2)     // Catch:{ NoSuchMethodException -> 0x009d }
            if (r2 == 0) goto L_0x004a
            r2 = r5
            goto L_0x004b
        L_0x004a:
            r2 = -1
        L_0x004b:
            if (r2 == 0) goto L_0x0090
            java.lang.Class<android.os.Bundle> r8 = android.os.Bundle.class
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            if (r2 == r7) goto L_0x0083
            if (r2 == r6) goto L_0x0078
            if (r2 == r5) goto L_0x006b
            if (r2 == r3) goto L_0x005b
            r2 = 0
            goto L_0x0096
        L_0x005b:
            r2 = 5
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x009d }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x009d }
            r2[r4] = r10     // Catch:{ NoSuchMethodException -> 0x009d }
            r2[r7] = r9     // Catch:{ NoSuchMethodException -> 0x009d }
            r2[r6] = r9     // Catch:{ NoSuchMethodException -> 0x009d }
            r2[r5] = r9     // Catch:{ NoSuchMethodException -> 0x009d }
            r2[r3] = r8     // Catch:{ NoSuchMethodException -> 0x009d }
            goto L_0x0096
        L_0x006b:
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x009d }
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x009d }
            r2[r4] = r3     // Catch:{ NoSuchMethodException -> 0x009d }
            r2[r7] = r9     // Catch:{ NoSuchMethodException -> 0x009d }
            r2[r6] = r9     // Catch:{ NoSuchMethodException -> 0x009d }
            r2[r5] = r9     // Catch:{ NoSuchMethodException -> 0x009d }
            goto L_0x0096
        L_0x0078:
            java.lang.Class[] r2 = new java.lang.Class[r5]     // Catch:{ NoSuchMethodException -> 0x009d }
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x009d }
            r2[r4] = r3     // Catch:{ NoSuchMethodException -> 0x009d }
            r2[r7] = r9     // Catch:{ NoSuchMethodException -> 0x009d }
            r2[r6] = r9     // Catch:{ NoSuchMethodException -> 0x009d }
            goto L_0x0096
        L_0x0083:
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x009d }
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x009d }
            r2[r4] = r3     // Catch:{ NoSuchMethodException -> 0x009d }
            r2[r7] = r9     // Catch:{ NoSuchMethodException -> 0x009d }
            r2[r6] = r9     // Catch:{ NoSuchMethodException -> 0x009d }
            r2[r5] = r8     // Catch:{ NoSuchMethodException -> 0x009d }
            goto L_0x0096
        L_0x0090:
            java.lang.Class[] r2 = new java.lang.Class[r7]     // Catch:{ NoSuchMethodException -> 0x009d }
            java.lang.Class<android.os.IBinder> r3 = android.os.IBinder.class
            r2[r4] = r3     // Catch:{ NoSuchMethodException -> 0x009d }
        L_0x0096:
            java.lang.reflect.Method r1 = r11.getDeclaredMethod(r12, r2)     // Catch:{ NoSuchMethodException -> 0x009d }
            r0.put(r12, r1)     // Catch:{ NoSuchMethodException -> 0x009d }
        L_0x009d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p193o4.C7453i.m28324e(java.lang.Class, java.lang.String):java.lang.reflect.Method");
    }

    /* renamed from: f */
    private static ArrayList m28325f(Context context, Object obj, String str) {
        ArrayList<String> stringArrayList;
        ArrayList arrayList = new ArrayList();
        if (m28334o(context, obj, str).booleanValue()) {
            int i = 0;
            boolean z = false;
            String str2 = null;
            do {
                Object n = m28333n(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, new Object[]{6, f21732c, str, str2, new Bundle()});
                if (n != null) {
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    Bundle bundle = (Bundle) n;
                    if (bundle.getInt("RESPONSE_CODE") == 0 && (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) != null) {
                        Iterator<String> it = stringArrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            String next = it.next();
                            try {
                                if (currentTimeMillis - (new JSONObject(next).getLong("purchaseTime") / 1000) > 1200) {
                                    z = true;
                                    break;
                                }
                                arrayList.add(next);
                                i++;
                            } catch (JSONException unused) {
                            }
                        }
                        str2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                        if (i >= 30 || str2 == null) {
                            break;
                        }
                    }
                }
                str2 = null;
            } while (!z);
        }
        return arrayList;
    }

    /* renamed from: g */
    static ArrayList m28326g(Context context, Object obj) {
        Class d;
        ArrayList arrayList = new ArrayList();
        if (obj == null || (d = m28323d(context, "com.android.vending.billing.IInAppBillingService")) == null || m28324e(d, "getPurchaseHistory") == null) {
            return arrayList;
        }
        return m28322c(m28325f(context, obj, "inapp"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c A[EDGE_INSN: B:19:0x005c->B:17:0x005c ?: BREAK  , SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList m28327h(android.content.Context r9, java.lang.Object r10, java.lang.String r11) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r10 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.lang.Boolean r1 = m28334o(r9, r10, r11)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x005c
            r1 = 0
            r2 = 0
            r4 = r1
            r3 = r2
        L_0x0016:
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r5[r1] = r7
            r7 = 1
            java.lang.String r8 = f21732c
            r5[r7] = r8
            r7 = 2
            r5[r7] = r11
            r5[r6] = r3
            java.lang.String r3 = "com.android.vending.billing.IInAppBillingService"
            java.lang.String r6 = "getPurchases"
            java.lang.Object r3 = m28333n(r9, r3, r6, r10, r5)
            if (r3 == 0) goto L_0x0055
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.lang.String r5 = "RESPONSE_CODE"
            int r5 = r3.getInt(r5)
            if (r5 != 0) goto L_0x0055
            java.lang.String r5 = "INAPP_PURCHASE_DATA_LIST"
            java.util.ArrayList r5 = r3.getStringArrayList(r5)
            if (r5 == 0) goto L_0x005c
            int r6 = r5.size()
            int r4 = r4 + r6
            r0.addAll(r5)
            java.lang.String r5 = "INAPP_CONTINUATION_TOKEN"
            java.lang.String r3 = r3.getString(r5)
            goto L_0x0056
        L_0x0055:
            r3 = r2
        L_0x0056:
            r5 = 30
            if (r4 >= r5) goto L_0x005c
            if (r3 != 0) goto L_0x0016
        L_0x005c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p193o4.C7453i.m28327h(android.content.Context, java.lang.Object, java.lang.String):java.util.ArrayList");
    }

    /* renamed from: i */
    static ArrayList m28328i(Context context, Object obj) {
        return m28322c(m28327h(context, obj, "inapp"));
    }

    /* renamed from: j */
    static ArrayList m28329j(Context context, Object obj) {
        return m28322c(m28327h(context, obj, "subs"));
    }

    /* renamed from: k */
    static Map m28330k(Context context, ArrayList arrayList, Object obj, boolean z) {
        Map p = m28335p(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!p.containsKey(str)) {
                arrayList2.add(str);
            }
        }
        p.putAll(m28331l(context, arrayList2, obj, z));
        return p;
    }

    /* renamed from: l */
    private static Map m28331l(Context context, ArrayList arrayList, Object obj, boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        if (obj != null && !arrayList.isEmpty()) {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            Object[] objArr = new Object[4];
            objArr[0] = 3;
            objArr[1] = f21732c;
            if (z) {
                str = "subs";
            } else {
                str = "inapp";
            }
            objArr[2] = str;
            objArr[3] = bundle;
            Object n = m28333n(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, objArr);
            if (n != null) {
                Bundle bundle2 = (Bundle) n;
                if (bundle2.getInt("RESPONSE_CODE") == 0) {
                    ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList != null && arrayList.size() == stringArrayList.size()) {
                        for (int i = 0; i < arrayList.size(); i++) {
                            hashMap.put(arrayList.get(i), stringArrayList.get(i));
                        }
                    }
                    m28336q(hashMap);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: m */
    static boolean m28332m(String str) {
        try {
            String optString = new JSONObject(str).optString("freeTrialPeriod");
            if (optString == null || optString.isEmpty()) {
                return false;
            }
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: n */
    private static Object m28333n(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method e;
        Class d = m28323d(context, str);
        if (d == null || (e = m28324e(d, str2)) == null) {
            return null;
        }
        if (obj != null) {
            obj = d.cast(obj);
        }
        try {
            return e.invoke(obj, objArr);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: o */
    private static Boolean m28334o(Context context, Object obj, String str) {
        if (obj == null) {
            return Boolean.FALSE;
        }
        boolean z = false;
        Object n = m28333n(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, f21732c, str});
        if (n != null && ((Integer) n).intValue() == 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: p */
    private static Map m28335p(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String string = f21733d.getString(str, (String) null);
            if (string != null) {
                String[] split = string.split(";", 2);
                if (currentTimeMillis - Long.parseLong(split[0]) < 43200) {
                    hashMap.put(str, split[1]);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: q */
    private static void m28336q(Map map) {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        SharedPreferences.Editor edit = f21733d.edit();
        for (Map.Entry entry : map.entrySet()) {
            edit.putString((String) entry.getKey(), currentTimeMillis + ";" + ((String) entry.getValue()));
        }
        edit.apply();
    }
}
