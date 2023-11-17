package com.facetec.sdk;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.facetec.sdk.z */
final class C3711z {
    C3711z() {
    }

    /* renamed from: a */
    static JSONArray m13948a(List<List<List<C2769ac>>> list) {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            JSONArray jSONArray2 = new JSONArray();
            for (int i2 = 0; i2 < list.get(i).size(); i2++) {
                JSONArray jSONArray3 = new JSONArray();
                for (int i3 = 0; i3 < list.get(i).size(); i3++) {
                    jSONArray3.put(((C2769ac) ((List) list.get(i).get(i2)).get(i3)).mo8808a());
                }
                jSONArray2.put(jSONArray3);
            }
            jSONArray.put(jSONArray2);
        }
        return jSONArray;
    }

    /* renamed from: b */
    static boolean m13949b(List<Integer> list) {
        return m13952d(list).length >= 3;
    }

    /* renamed from: c */
    static C3534r m13951c(List<C3534r> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.addAll(list.get(i).f11432d);
            arrayList2.addAll(list.get(i).f11430b);
        }
        C3534r rVar = new C3534r();
        rVar.f11432d = arrayList;
        rVar.f11430b = arrayList2;
        return rVar;
    }

    /* renamed from: d */
    static Integer[] m13952d(List<Integer> list) {
        return (Integer[]) new HashSet(list).toArray(new Integer[0]);
    }

    /* renamed from: e */
    static JSONArray m13953e(List<List<C2769ac>> list) {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            JSONArray jSONArray2 = new JSONArray();
            for (int i2 = 0; i2 < list.get(i).size(); i2++) {
                jSONArray2.put(((C2769ac) list.get(i).get(i2)).mo8808a());
            }
            jSONArray.put(jSONArray2);
        }
        return jSONArray;
    }

    /* renamed from: f */
    static List m13955f(List list) {
        ArrayList arrayList = list;
        int i = 0;
        while (i <= 0) {
            try {
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (arrayList.get(i2) instanceof List) {
                        arrayList2.addAll((Collection) arrayList.get(i2));
                    } else {
                        arrayList2.add(arrayList.get(i2));
                    }
                }
                i++;
                arrayList = arrayList2;
            } catch (Exception unused) {
                return list;
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    static byte[] m13954e(byte[] bArr, int i, int i2) {
        if (i <= 25 && i2 <= 25) {
            return bArr;
        }
        int floor = (int) Math.floor(((double) bArr.length) / ((double) (i * i2)));
        byte[] bArr2 = new byte[(floor * 625)];
        int floor2 = (((int) Math.floor(((double) i) * (((double) (i2 - 25)) / 2.0d))) * floor) + (((int) Math.floor(((double) (i - 25)) / 2.0d)) * floor);
        for (int i3 = 0; i3 < 25; i3++) {
            System.arraycopy(bArr, (i * i3 * floor) + floor2, bArr2, i3 * 25 * floor, floor * 25);
        }
        return bArr2;
    }

    /* renamed from: c */
    static int m13950c(String str) {
        return Math.round(((float) str.getBytes(StandardCharsets.UTF_8).length) / 1000.0f);
    }
}
