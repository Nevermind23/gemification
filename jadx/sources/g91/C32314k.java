package g91;

import androidx.collection.ArrayMap;

/* renamed from: g91.k */
public abstract class C32314k {

    /* renamed from: a */
    private static ArrayMap f79743a;

    static {
        ArrayMap arrayMap = new ArrayMap();
        f79743a = arrayMap;
        arrayMap.put("GEL", "₾");
        f79743a.put("USD", "$");
        f79743a.put("EUR", "€");
        f79743a.put("GBP", "£");
        f79743a.put("BGN", "BGN");
        f79743a.put("CAD", "CAD");
        f79743a.put("CHF", "₣");
        f79743a.put("CNY", "¥");
        f79743a.put("CZK", "Kč");
        f79743a.put("AED", "AED");
        f79743a.put("DKK", "kr");
        f79743a.put("HKD", "HKD");
        f79743a.put("HUF", "Ft");
        f79743a.put("ILS", "₪");
        f79743a.put("JPY", "¥");
        f79743a.put("KWD", "KWD");
        f79743a.put("KZT", "KZT");
        f79743a.put("LTL", "LTL");
        f79743a.put("LVL", "LVL");
        f79743a.put("AMD", "AMD");
        f79743a.put("MDL", "MDL");
        f79743a.put("NOK", "NOK");
        f79743a.put("PLN", "zł");
        f79743a.put("RUR", "₽");
        f79743a.put("SEK", "SEK");
        f79743a.put("SGD", "SGD");
        f79743a.put("TRY", "₺");
        f79743a.put("UAH", "₴");
        f79743a.put("AUD", "AUD");
        f79743a.put("AZN", "AZN");
    }

    /* renamed from: a */
    public static String m95245a(String str) {
        if (!(str == null || f79743a.get(str) == null)) {
            str = (String) f79743a.get(str);
        }
        if (str != null) {
            return str;
        }
        return "";
    }
}
