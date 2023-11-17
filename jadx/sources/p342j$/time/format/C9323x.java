package p342j$.time.format;

import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;
import p342j$.time.temporal.C9333a;
import p342j$.time.temporal.TemporalField;
import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.format.x */
class C9323x {

    /* renamed from: a */
    private static final ConcurrentHashMap f25838a = new ConcurrentHashMap(16, 0.75f, 2);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Comparator f25839b = new C9302c();

    /* renamed from: c */
    public static final /* synthetic */ int f25840c = 0;

    C9323x() {
    }

    /* renamed from: b */
    private static String m34396b(String str) {
        return str.substring(0, Character.charCount(str.codePointAt(0)));
    }

    /* renamed from: c */
    public String mo25037c(TemporalField temporalField, long j, TextStyle textStyle, Locale locale) {
        Object obj;
        TemporalField temporalField2 = temporalField;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(temporalField2, locale);
        ConcurrentHashMap concurrentHashMap = f25838a;
        Object obj2 = concurrentHashMap.get(simpleImmutableEntry);
        if (obj2 == null) {
            HashMap hashMap = new HashMap();
            int i = 0;
            if (temporalField2 == C9333a.ERA) {
                DateFormatSymbols instance = DateFormatSymbols.getInstance(locale);
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = new HashMap();
                String[] eras = instance.getEras();
                while (i < eras.length) {
                    if (!eras[i].isEmpty()) {
                        long j2 = (long) i;
                        hashMap2.put(Long.valueOf(j2), eras[i]);
                        hashMap3.put(Long.valueOf(j2), m34396b(eras[i]));
                    }
                    i++;
                }
                if (!hashMap2.isEmpty()) {
                    hashMap.put(TextStyle.FULL, hashMap2);
                    hashMap.put(TextStyle.SHORT, hashMap2);
                    hashMap.put(TextStyle.NARROW, hashMap3);
                }
                obj = new C9322w(hashMap);
            } else if (temporalField2 == C9333a.MONTH_OF_YEAR) {
                DateFormatSymbols instance2 = DateFormatSymbols.getInstance(locale);
                HashMap hashMap4 = new HashMap();
                HashMap hashMap5 = new HashMap();
                String[] months = instance2.getMonths();
                for (int i2 = 0; i2 < months.length; i2++) {
                    if (!months[i2].isEmpty()) {
                        long j3 = ((long) i2) + 1;
                        hashMap4.put(Long.valueOf(j3), months[i2]);
                        hashMap5.put(Long.valueOf(j3), m34396b(months[i2]));
                    }
                }
                if (!hashMap4.isEmpty()) {
                    hashMap.put(TextStyle.FULL, hashMap4);
                    hashMap.put(TextStyle.NARROW, hashMap5);
                }
                HashMap hashMap6 = new HashMap();
                String[] shortMonths = instance2.getShortMonths();
                while (i < shortMonths.length) {
                    if (!shortMonths[i].isEmpty()) {
                        hashMap6.put(Long.valueOf(((long) i) + 1), shortMonths[i]);
                    }
                    i++;
                }
                if (!hashMap6.isEmpty()) {
                    hashMap.put(TextStyle.SHORT, hashMap6);
                }
                obj = new C9322w(hashMap);
            } else if (temporalField2 == C9333a.DAY_OF_WEEK) {
                DateFormatSymbols instance3 = DateFormatSymbols.getInstance(locale);
                HashMap hashMap7 = new HashMap();
                String[] weekdays = instance3.getWeekdays();
                hashMap7.put(1L, weekdays[2]);
                hashMap7.put(2L, weekdays[3]);
                hashMap7.put(3L, weekdays[4]);
                hashMap7.put(4L, weekdays[5]);
                hashMap7.put(5L, weekdays[6]);
                hashMap7.put(6L, weekdays[7]);
                hashMap7.put(7L, weekdays[1]);
                hashMap.put(TextStyle.FULL, hashMap7);
                HashMap hashMap8 = new HashMap();
                hashMap8.put(1L, m34396b(weekdays[2]));
                hashMap8.put(2L, m34396b(weekdays[3]));
                hashMap8.put(3L, m34396b(weekdays[4]));
                hashMap8.put(4L, m34396b(weekdays[5]));
                hashMap8.put(5L, m34396b(weekdays[6]));
                hashMap8.put(6L, m34396b(weekdays[7]));
                hashMap8.put(7L, m34396b(weekdays[1]));
                hashMap.put(TextStyle.NARROW, hashMap8);
                HashMap hashMap9 = new HashMap();
                String[] shortWeekdays = instance3.getShortWeekdays();
                hashMap9.put(1L, shortWeekdays[2]);
                hashMap9.put(2L, shortWeekdays[3]);
                hashMap9.put(3L, shortWeekdays[4]);
                hashMap9.put(4L, shortWeekdays[5]);
                hashMap9.put(5L, shortWeekdays[6]);
                hashMap9.put(6L, shortWeekdays[7]);
                hashMap9.put(7L, shortWeekdays[1]);
                hashMap.put(TextStyle.SHORT, hashMap9);
                obj = new C9322w(hashMap);
            } else if (temporalField2 == C9333a.AMPM_OF_DAY) {
                DateFormatSymbols instance4 = DateFormatSymbols.getInstance(locale);
                HashMap hashMap10 = new HashMap();
                HashMap hashMap11 = new HashMap();
                String[] amPmStrings = instance4.getAmPmStrings();
                while (i < amPmStrings.length) {
                    if (!amPmStrings[i].isEmpty()) {
                        long j4 = (long) i;
                        hashMap10.put(Long.valueOf(j4), amPmStrings[i]);
                        hashMap11.put(Long.valueOf(j4), m34396b(amPmStrings[i]));
                    }
                    i++;
                }
                if (!hashMap10.isEmpty()) {
                    hashMap.put(TextStyle.FULL, hashMap10);
                    hashMap.put(TextStyle.SHORT, hashMap10);
                    hashMap.put(TextStyle.NARROW, hashMap11);
                }
                obj = new C9322w(hashMap);
            } else {
                obj = "";
            }
            concurrentHashMap.putIfAbsent(simpleImmutableEntry, obj);
            obj2 = concurrentHashMap.get(simpleImmutableEntry);
        }
        if (obj2 instanceof C9322w) {
            return ((C9322w) obj2).mo25084a(j, textStyle);
        }
        return null;
    }
}
