package lf1;

import mf1.C41759a;
import mf1.C41760b;
import mf1.C41761c;
import mf1.C41762d;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

/* renamed from: lf1.b */
abstract class C41698b {
    /* renamed from: a */
    private static String m120945a(String str) {
        String lowerCase = str.toLowerCase();
        if (!lowerCase.matches("[a-z]*[1-5]?")) {
            return lowerCase;
        }
        if (!lowerCase.matches("[a-z]*[1-5]")) {
            return lowerCase.replaceAll("v", "ü");
        }
        int numericValue = Character.getNumericValue(lowerCase.charAt(lowerCase.length() - 1));
        char c = 'a';
        int indexOf = lowerCase.indexOf(97);
        int indexOf2 = lowerCase.indexOf(101);
        int indexOf3 = lowerCase.indexOf("ou");
        if (-1 == indexOf) {
            if (-1 == indexOf2) {
                if (-1 == indexOf3) {
                    indexOf = lowerCase.length() - 1;
                    while (true) {
                        if (indexOf < 0) {
                            c = '$';
                            indexOf = -1;
                            break;
                        } else if (String.valueOf(lowerCase.charAt(indexOf)).matches("[aeiouv]")) {
                            c = lowerCase.charAt(indexOf);
                            break;
                        } else {
                            indexOf--;
                        }
                    }
                } else {
                    c = "ou".charAt(0);
                    indexOf = indexOf3;
                }
            } else {
                c = 'e';
                indexOf = indexOf2;
            }
        }
        if ('$' == c || -1 == indexOf) {
            return lowerCase;
        }
        char charAt = "āáăàaēéĕèeīíĭìiōóŏòoūúŭùuǖǘǚǜü".charAt(("aeiouv".indexOf(c) * 5) + (numericValue - 1));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(lowerCase.substring(0, indexOf).replaceAll("v", "ü"));
        stringBuffer.append(charAt);
        stringBuffer.append(lowerCase.substring(indexOf + 1, lowerCase.length() - 1).replaceAll("v", "ü"));
        return stringBuffer.toString();
    }

    /* renamed from: b */
    static String m120946b(String str, C41760b bVar) {
        C41761c cVar = C41761c.f98038d;
        if (cVar == bVar.mo96541b() && (C41762d.f98041c == bVar.mo96542c() || C41762d.f98040b == bVar.mo96542c())) {
            throw new BadHanyuPinyinOutputFormatCombination("tone marks cannot be added to v or u:");
        }
        if (C41761c.f98037c == bVar.mo96541b()) {
            str = str.replaceAll("[1-5]", "");
        } else if (cVar == bVar.mo96541b()) {
            str = m120945a(str.replaceAll("u:", "v"));
        }
        if (C41762d.f98041c == bVar.mo96542c()) {
            str = str.replaceAll("u:", "v");
        } else if (C41762d.f98042d == bVar.mo96542c()) {
            str = str.replaceAll("u:", "ü");
        }
        if (C41759a.f98030b == bVar.mo96540a()) {
            return str.toUpperCase();
        }
        return str;
    }
}
