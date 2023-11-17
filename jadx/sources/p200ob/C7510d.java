package p200ob;

import com.google.zxing.FormatException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ob.d */
public enum C7510d {
    Cp437((String) new int[]{0, 2}, (int) new String[0]),
    ISO8859_1((String) new int[]{1, 3}, (int) new String[]{"ISO-8859-1"}),
    ISO8859_2((String) 4, (int) new String[]{"ISO-8859-2"}),
    ISO8859_3((String) 5, (int) new String[]{"ISO-8859-3"}),
    ISO8859_4((String) 6, (int) new String[]{"ISO-8859-4"}),
    ISO8859_5((String) 7, (int) new String[]{"ISO-8859-5"}),
    ISO8859_6((String) 8, (int) new String[]{"ISO-8859-6"}),
    ISO8859_7((String) 9, (int) new String[]{"ISO-8859-7"}),
    ISO8859_8((String) 10, (int) new String[]{"ISO-8859-8"}),
    ISO8859_9((String) 11, (int) new String[]{"ISO-8859-9"}),
    ISO8859_10((String) 12, (int) new String[]{"ISO-8859-10"}),
    ISO8859_11((String) 13, (int) new String[]{"ISO-8859-11"}),
    ISO8859_13((String) 15, (int) new String[]{"ISO-8859-13"}),
    ISO8859_14((String) 16, (int) new String[]{"ISO-8859-14"}),
    ISO8859_15((String) 17, (int) new String[]{"ISO-8859-15"}),
    ISO8859_16((String) 18, (int) new String[]{"ISO-8859-16"}),
    SJIS((String) 20, (int) new String[]{"Shift_JIS"}),
    Cp1250((String) 21, (int) new String[]{"windows-1250"}),
    Cp1251((String) 22, (int) new String[]{"windows-1251"}),
    Cp1252((String) 23, (int) new String[]{"windows-1252"}),
    Cp1256((String) 24, (int) new String[]{"windows-1256"}),
    UnicodeBigUnmarked((String) 25, (int) new String[]{"UTF-16BE", "UnicodeBig"}),
    UTF8((String) 26, (int) new String[]{"UTF-8"}),
    ASCII((String) new int[]{27, 170}, (int) new String[]{"US-ASCII"}),
    Big5(28),
    GB18030((String) 29, (int) new String[]{"GB2312", "EUC_CN", "GBK"}),
    EUC_KR((String) 30, (int) new String[]{"EUC-KR"});
    

    /* renamed from: G */
    private static final Map f21886G = null;

    /* renamed from: H */
    private static final Map f21887H = null;

    /* renamed from: d */
    private final int[] f21910d;

    /* renamed from: e */
    private final String[] f21911e;

    static {
        f21886G = new HashMap();
        f21887H = new HashMap();
        for (C7510d dVar : values()) {
            for (int valueOf : dVar.f21910d) {
                f21886G.put(Integer.valueOf(valueOf), dVar);
            }
            f21887H.put(dVar.name(), dVar);
            for (String put : dVar.f21911e) {
                f21887H.put(put, dVar);
            }
        }
    }

    private C7510d(int i) {
        this(r3, r4, new int[]{i}, new String[0]);
    }

    /* renamed from: a */
    public static C7510d m28556a(String str) {
        return (C7510d) f21887H.get(str);
    }

    /* renamed from: b */
    public static C7510d m28557b(int i) {
        if (i >= 0 && i < 900) {
            return (C7510d) f21886G.get(Integer.valueOf(i));
        }
        throw FormatException.m23153a();
    }

    /* renamed from: c */
    public int mo21993c() {
        return this.f21910d[0];
    }

    private C7510d(int i, String... strArr) {
        this.f21910d = new int[]{i};
        this.f21911e = strArr;
    }

    private C7510d(int[] iArr, String... strArr) {
        this.f21910d = iArr;
        this.f21911e = strArr;
    }
}
