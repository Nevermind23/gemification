package com.threatmetrix.TrustDefender;

import android.content.Context;
import com.threatmetrix.TrustDefender.C11969r1;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import p585re.C17603t;

/* renamed from: com.threatmetrix.TrustDefender.o1 */
public abstract class C11942o1 {

    /* renamed from: a */
    private static final TreeMap f35057a;

    static {
        TreeMap treeMap = new TreeMap();
        f35057a = treeMap;
        treeMap.put(Integer.valueOf(C11969r1.C11983n.C11985b.f35250b), "533.1");
        treeMap.put(Integer.valueOf(C11969r1.C11983n.C11985b.f35251c), "533.1");
        treeMap.put(Integer.valueOf(C11969r1.C11983n.C11985b.f35252d), "533.1");
        treeMap.put(Integer.valueOf(C11969r1.C11983n.C11985b.f35253e), "533.1");
        treeMap.put(Integer.valueOf(C11969r1.C11983n.C11985b.f35254f), "534.13");
        treeMap.put(Integer.valueOf(C11969r1.C11983n.C11985b.f35255g), "534.30");
        treeMap.put(Integer.valueOf(C11969r1.C11983n.C11985b.f35256h), "534.30");
        treeMap.put(Integer.valueOf(C11969r1.C11983n.C11985b.f35257i), "534.30");
        treeMap.put(Integer.valueOf(C11969r1.C11983n.C11985b.f35258j), "534.30");
        treeMap.put(Integer.valueOf(C11969r1.C11983n.C11985b.f35259k), "534.30");
        treeMap.put(Integer.valueOf(C11969r1.C11983n.C11985b.f35260l), "537.36");
        treeMap.put(Integer.valueOf(C11969r1.C11983n.C11985b.f35261m), "537.36");
        treeMap.put(Integer.valueOf(C11969r1.C11983n.C11985b.f35262n), "537.36");
        treeMap.put(Integer.valueOf(C11969r1.C11983n.C11985b.f35263o), "537.36");
        treeMap.put(Integer.valueOf(C11969r1.C11983n.C11985b.f35264p), "537.36");
        treeMap.put(Integer.valueOf(C11969r1.C11983n.C11985b.f35265q), "537.36");
        treeMap.put(Integer.valueOf(C11969r1.C11983n.C11985b.f35266r), "537.36");
        treeMap.put(Integer.valueOf(C11969r1.C11983n.C11985b.f35269u), "537.36");
        treeMap.put(Integer.valueOf(C11969r1.C11983n.C11985b.f35270v), "537.36");
        treeMap.put(Integer.valueOf(C11969r1.C11983n.C11985b.f35271w), "537.36");
        treeMap.put(Integer.valueOf(C11969r1.C11983n.C11985b.f35272x), "537.36");
    }

    /* renamed from: a */
    public static String m43842a(C17603t tVar) {
        String str;
        String str2;
        String str3;
        String str4;
        Context context;
        TreeMap treeMap = f35057a;
        int i = C11969r1.C11983n.C11984a.f35247c;
        String str5 = "";
        if (treeMap.containsKey(Integer.valueOf(i))) {
            str = (String) treeMap.get(Integer.valueOf(i));
        } else {
            Map.Entry lastEntry = treeMap.lastEntry();
            str = lastEntry != null ? ((String) lastEntry.getValue()).concat("+") : str5;
        }
        String language = Locale.getDefault().getLanguage();
        String country = Locale.getDefault().getCountry();
        if (!country.isEmpty()) {
            str2 = language + "-" + country + "; ";
        } else {
            str2 = language + "; ";
        }
        if (i >= C11969r1.C11983n.C11985b.f35262n) {
            str4 = "Mozilla/5.0 (Linux; Android ";
            str3 = "; wv) AppleWebKit/";
            str2 = str5;
        } else {
            str4 = "Mozilla/5.0 (Linux; U; Android ";
            str3 = ") AppleWebKit/";
        }
        if (!(tVar == null || (context = tVar.f49314a) == null)) {
            str5 = m43843b(context);
        }
        return str4 + C11969r1.C11983n.C11984a.f35245a + "; " + str2.toLowerCase(Locale.US) + C11969r1.C11983n.f35234j + " Build/" + C11969r1.C11983n.f35231g + str3 + str + " (KHTML, like Gecko) Version/4.0" + str5 + " Mobile Safari/" + str + " " + "6.3-81";
    }

    /* renamed from: b */
    private static String m43843b(Context context) {
        String b = new C11969r1.C11978i(context, "com.google.android.webview", 128).mo32049b();
        if (C11921k0.m43732o(b)) {
            return " Chrome/".concat(b);
        }
        String b2 = new C11969r1.C11978i(context, "com.android.webview", 128).mo32049b();
        return C11921k0.m43732o(b2) ? " Chrome/".concat(b2) : "";
    }
}
