package com.threatmetrix.TrustDefender;

import com.threatmetrix.TrustDefender.C11907h;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.threatmetrix.TrustDefender.k0 */
public abstract class C11921k0 {

    /* renamed from: a */
    private static final String f34870a;

    /* renamed from: b */
    private static final char[] f34871b = "0123456789abcdef".toCharArray();

    /* renamed from: c */
    private static final MessageDigest f34872c;

    /* renamed from: d */
    private static final MessageDigest f34873d;

    /* renamed from: e */
    private static final MessageDigest f34874e;

    /* renamed from: f */
    private static final Pattern f34875f = Pattern.compile("^[a-fA-F0-9]{64}$");

    /* renamed from: g */
    private static final Pattern f34876g = Pattern.compile("^([0-9A-Fa-f]{2}[:])*([0-9A-Fa-f]{2})$");

    /* renamed from: h */
    private static final Pattern f34877h = Pattern.compile("^([0]{1,2}[:])*([0]{1,2})$");

    /* renamed from: i */
    private static final Pattern f34878i = Pattern.compile("^[0-]+$");

    /* renamed from: j */
    private static final SecureRandom f34879j = new SecureRandom();

    /* renamed from: k */
    private static final char[] f34880k = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '2', '3', '4', '5', '6', '7', '='};

    /* JADX WARNING: Removed duplicated region for block: B:15:0x007c  */
    static {
        /*
            java.lang.Class<com.threatmetrix.TrustDefender.k0> r0 = com.threatmetrix.TrustDefender.C11921k0.class
            java.lang.String r0 = com.threatmetrix.TrustDefender.C11907h.m43615j(r0)
            f34870a = r0
            java.lang.String r1 = "0123456789abcdef"
            char[] r1 = r1.toCharArray()
            f34871b = r1
            java.lang.String r1 = "^[a-fA-F0-9]{64}$"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            f34875f = r1
            java.lang.String r1 = "^([0-9A-Fa-f]{2}[:])*([0-9A-Fa-f]{2})$"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            f34876g = r1
            java.lang.String r1 = "^([0]{1,2}[:])*([0]{1,2})$"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            f34877h = r1
            java.lang.String r1 = "^[0-]+$"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            f34878i = r1
            java.security.SecureRandom r1 = new java.security.SecureRandom
            r1.<init>()
            f34879j = r1
            java.lang.String r1 = "Getting SHA1 digest"
            com.threatmetrix.TrustDefender.C11907h.m43607b(r0, r1)
            r0 = 0
            java.lang.String r1 = "SHA1"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch:{ NoSuchAlgorithmException -> 0x0044 }
            goto L_0x004d
        L_0x0044:
            r1 = move-exception
            java.lang.String r2 = f34870a
            java.lang.String r3 = "SHA1 digest failed"
            com.threatmetrix.TrustDefender.C11907h.C11908a.m43629g(r2, r3, r1)
            r1 = r0
        L_0x004d:
            f34873d = r1
            com.threatmetrix.TrustDefender.u0 r1 = com.threatmetrix.TrustDefender.C11996u0.m44036s()
            boolean r1 = r1.mo32072e()
            if (r1 != 0) goto L_0x006f
            java.lang.String r1 = f34870a
            java.lang.String r2 = "Getting MD5 digest"
            com.threatmetrix.TrustDefender.C11907h.m43607b(r1, r2)
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch:{ NoSuchAlgorithmException -> 0x0067 }
            goto L_0x0070
        L_0x0067:
            r1 = move-exception
            java.lang.String r2 = f34870a
            java.lang.String r3 = "MD5 digest failed"
            com.threatmetrix.TrustDefender.C11907h.C11908a.m43629g(r2, r3, r1)
        L_0x006f:
            r1 = r0
        L_0x0070:
            f34872c = r1
            com.threatmetrix.TrustDefender.u0 r1 = com.threatmetrix.TrustDefender.C11996u0.m44036s()
            boolean r1 = r1.mo32072e()
            if (r1 != 0) goto L_0x0092
            java.lang.String r1 = f34870a
            java.lang.String r2 = "Getting SHA256 digest"
            com.threatmetrix.TrustDefender.C11907h.m43607b(r1, r2)
            java.lang.String r1 = "SHA-256"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r1)     // Catch:{ NoSuchAlgorithmException -> 0x008a }
            goto L_0x0092
        L_0x008a:
            r1 = move-exception
            java.lang.String r2 = f34870a
            java.lang.String r3 = "SHA256 digest failed"
            com.threatmetrix.TrustDefender.C11907h.C11908a.m43629g(r2, r3, r1)
        L_0x0092:
            f34874e = r0
            r0 = 33
            char[] r0 = new char[r0]
            r0 = {97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 50, 51, 52, 53, 54, 55, 61} // fill-array
            f34880k = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.threatmetrix.TrustDefender.C11921k0.<clinit>():void");
    }

    /* renamed from: A */
    public static String m43716A(String str, int i) {
        return (str == null || i < 0 || str.length() <= i) ? str : str.substring(0, i);
    }

    /* renamed from: B */
    public static boolean m43717B(String str) {
        return m43732o(str) && !"02:00:00:00:00:00".equals(str) && f34876g.matcher(str).find() && !f34877h.matcher(str).find();
    }

    /* renamed from: a */
    public static boolean m43718a(String str) {
        return m43732o(str) && !str.equals("special promotion") && !f34878i.matcher(str).find();
    }

    /* renamed from: b */
    public static String m43719b(String str) {
        return str != null ? str.toLowerCase(Locale.US) : str;
    }

    /* renamed from: c */
    public static String m43720c(Map map, boolean z, int i) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return "";
        }
        if (i > 262144) {
            i = 262144;
        }
        StringBuilder sb = new StringBuilder(i <= 0 ? 128 : i);
        int i2 = 1;
        for (Map.Entry entry : map.entrySet()) {
            if (i != -1 && i2 >= i) {
                break;
            }
            String str = ",\"" + ((String) entry.getKey()) + "\":";
            Object value = entry.getValue();
            if (z) {
                value = m43723f(String.valueOf(value).getBytes());
            }
            if (!(value instanceof Number)) {
                value = "\"" + value + "\"";
            }
            String str2 = str + String.valueOf(value);
            if (i != -1 && str2.length() + i2 > i) {
                break;
            }
            sb.append(str2);
            i2 += str2.length();
        }
        sb.replace(0, 1, "{").append("}");
        return sb.toString();
    }

    /* renamed from: d */
    public static String m43721d(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int i2 = 0; i2 < str.length() && i < 128; i2++) {
            char charAt = str.charAt(i2);
            if ((charAt < '0' || charAt > '9') && !((charAt >= 'a' && charAt <= 'z') || charAt == '_' || charAt == '/' || charAt == '-')) {
                if (charAt >= 'A' && charAt <= 'Z') {
                    charAt = Character.toLowerCase(charAt);
                }
            }
            sb.append(charAt);
            i++;
        }
        return sb.toString();
    }

    /* renamed from: e */
    public static String m43722e(String str, String str2, String str3, boolean z) {
        String str4;
        if (m43739v(str) || m43739v(str3)) {
            return null;
        }
        if (m43739v(str2)) {
            return str;
        }
        if (z) {
            str4 = str.toLowerCase();
            str2 = str2.toLowerCase();
        } else {
            str4 = str;
        }
        int indexOf = str4.indexOf(str2);
        if (indexOf == -1) {
            return null;
        }
        int indexOf2 = str4.indexOf(str3, indexOf + 1);
        return indexOf2 != -1 ? str.substring(indexOf, indexOf2) : str.substring(indexOf);
    }

    /* renamed from: f */
    public static String m43723f(byte[] bArr) {
        String g;
        if (!(bArr == null || bArr.length == 0)) {
            if (C11996u0.m44036s().mo32072e()) {
                return C11996u0.m44036s().mo32064D(bArr);
            }
            MessageDigest messageDigest = f34873d;
            if (messageDigest != null) {
                synchronized (messageDigest) {
                    messageDigest.update(bArr);
                    byte[] digest = messageDigest.digest();
                    messageDigest.reset();
                    g = m43724g(digest);
                }
                return g;
            }
        }
        return null;
    }

    /* renamed from: g */
    public static String m43724g(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = f34871b;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: h */
    public static String m43725h(List list, String str) {
        return m43743z(list, str, false);
    }

    /* renamed from: i */
    public static String m43726i(byte[] bArr) {
        String g;
        if (!(bArr == null || bArr.length == 0)) {
            if (C11996u0.m44036s().mo32072e()) {
                return C11996u0.m44036s().mo32079l(bArr);
            }
            MessageDigest messageDigest = f34874e;
            if (messageDigest != null) {
                synchronized (messageDigest) {
                    messageDigest.update(bArr);
                    byte[] digest = messageDigest.digest();
                    messageDigest.reset();
                    g = m43724g(digest);
                }
                return g;
            }
        }
        return null;
    }

    /* renamed from: j */
    public static String m43727j(Map map) {
        return m43734q(map, false);
    }

    /* renamed from: k */
    public static String m43728k(String str) {
        String g;
        if (m43739v(str)) {
            return null;
        }
        if (C11996u0.m44036s().mo32072e()) {
            return C11996u0.m44036s().mo32085r(str);
        }
        MessageDigest messageDigest = f34872c;
        if (messageDigest == null) {
            return null;
        }
        synchronized (messageDigest) {
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            messageDigest.reset();
            g = m43724g(digest);
        }
        return g;
    }

    /* renamed from: l */
    public static String m43729l(int i) {
        String g;
        C11907h.C11908a.m43628f(f34870a, "getting a random string with length of {} ", Integer.valueOf(i));
        if (C11996u0.m44036s().mo32072e() && (g = C11996u0.m44036s().mo32074g(i)) != null) {
            return g;
        }
        byte[] bArr = new byte[((i + 1) / 2)];
        f34879j.nextBytes(bArr);
        String g2 = m43724g(bArr);
        return g2.length() <= i ? g2 : g2.substring(0, i);
    }

    /* renamed from: m */
    public static String m43730m(String str) {
        if (m43739v(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : str.getBytes(StandardCharsets.UTF_8)) {
            if (b < 32) {
                sb.append("\\x");
                sb.append(String.format("%02x", new Object[]{Byte.valueOf(b)}));
            } else {
                sb.append((char) b);
            }
        }
        return sb.toString();
    }

    /* renamed from: n */
    public static String m43731n(String str) {
        if (m43739v(str)) {
            return null;
        }
        if (C11996u0.m44036s().mo32072e()) {
            return C11996u0.m44036s().mo32087u(str);
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            C11907h.C11908a.m43629g(f34870a, "Failed url encoding", e);
            return null;
        }
    }

    /* renamed from: o */
    public static boolean m43732o(String str) {
        return str != null && !str.isEmpty();
    }

    /* renamed from: p */
    public static List m43733p(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            int indexOf = str.indexOf(str2);
            if (indexOf == -1) {
                break;
            }
            if (indexOf >= 1) {
                arrayList.add(str.substring(0, indexOf));
            }
            str = str.substring(indexOf + str2.length());
        }
        if (!str.isEmpty()) {
            arrayList.add(str);
        }
        return arrayList;
    }

    /* renamed from: q */
    public static String m43734q(Map map, boolean z) {
        return m43720c(map, z, C11051p3.f31759c);
    }

    /* renamed from: r */
    public static String m43735r() {
        C11907h.C11908a.m43624b(f34870a, "getting UUID");
        return m43729l(32);
    }

    /* renamed from: s */
    public static int m43736s(String str) {
        if (str == null) {
            return 0;
        }
        int i = 0;
        for (byte b : str.getBytes(StandardCharsets.UTF_8)) {
            i += b;
        }
        return i;
    }

    /* renamed from: t */
    public static String m43737t(byte[] bArr) {
        String u;
        if (!(bArr == null || bArr.length == 0)) {
            if (C11996u0.m44036s().mo32072e()) {
                return C11996u0.m44036s().mo32075h(bArr);
            }
            MessageDigest messageDigest = f34873d;
            if (messageDigest != null) {
                synchronized (messageDigest) {
                    messageDigest.update(bArr);
                    byte[] digest = messageDigest.digest();
                    messageDigest.reset();
                    u = m43738u(digest);
                }
                return u;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009d  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m43738u(byte[] r18) {
        /*
            r0 = r18
            if (r0 == 0) goto L_0x00da
            int r1 = r0.length
            if (r1 != 0) goto L_0x0009
            goto L_0x00da
        L_0x0009:
            int r1 = r0.length
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r1 + 5
            r4 = 1
            int r3 = r3 - r4
            r5 = 5
            int r3 = r3 / r5
            int r3 = r3 * 8
            int r3 = r3 + r4
            r2.<init>(r3)
            r6 = 0
        L_0x0019:
            if (r1 < r4) goto L_0x00d5
            if (r1 >= r5) goto L_0x001f
            r7 = r1
            goto L_0x0020
        L_0x001f:
            r7 = r5
        L_0x0020:
            r8 = 4
            r9 = 2
            r10 = 3
            if (r7 == r4) goto L_0x007d
            if (r7 == r9) goto L_0x0065
            if (r7 == r10) goto L_0x0053
            if (r7 == r8) goto L_0x0041
            if (r7 == r5) goto L_0x0037
            r3 = 0
            r5 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            goto L_0x0090
        L_0x0037:
            int r11 = r6 + 4
            byte r11 = r0[r11]
            r12 = r11 & 31
            r11 = r11 & 224(0xe0, float:3.14E-43)
            int r11 = r11 >> r5
            goto L_0x0043
        L_0x0041:
            r11 = 0
            r12 = 0
        L_0x0043:
            int r13 = r6 + 3
            byte r13 = r0[r13]
            r14 = r13 & 3
            int r14 = r14 << r10
            r11 = r11 | r14
            r14 = r13 & 124(0x7c, float:1.74E-43)
            int r14 = r14 >> r9
            r13 = r13 & 128(0x80, float:1.794E-43)
            int r13 = r13 >> 7
            goto L_0x0057
        L_0x0053:
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x0057:
            int r15 = r6 + 2
            byte r15 = r0[r15]
            r16 = r15 & 15
            int r16 = r16 << 1
            r13 = r13 | r16
            r15 = r15 & 240(0xf0, float:3.36E-43)
            int r15 = r15 >> r8
            goto L_0x006a
        L_0x0065:
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x006a:
            int r16 = r6 + 1
            byte r3 = r0[r16]
            r16 = r3 & 1
            int r16 = r16 << 4
            r15 = r15 | r16
            r16 = r3 & 62
            int r16 = r16 >> 1
            r3 = r3 & 192(0xc0, float:2.69E-43)
            int r3 = r3 >> 6
            goto L_0x0085
        L_0x007d:
            r3 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x0085:
            byte r5 = r0[r6]
            r17 = r5 & 7
            int r17 = r17 << 2
            r3 = r3 | r17
            r5 = r5 & 248(0xf8, float:3.48E-43)
            int r5 = r5 >> r10
        L_0x0090:
            int r6 = r6 + r7
            int r1 = r1 - r7
            r17 = 32
            if (r7 == r4) goto L_0x009d
            if (r7 == r9) goto L_0x00a1
            if (r7 == r10) goto L_0x00a3
            if (r7 == r8) goto L_0x00a6
            goto L_0x00a8
        L_0x009d:
            r15 = r17
            r16 = r15
        L_0x00a1:
            r13 = r17
        L_0x00a3:
            r11 = r17
            r14 = r11
        L_0x00a6:
            r12 = r17
        L_0x00a8:
            char[] r7 = f34880k
            char r5 = r7[r5]
            r2.append(r5)
            char r3 = r7[r3]
            r2.append(r3)
            char r3 = r7[r16]
            r2.append(r3)
            char r3 = r7[r15]
            r2.append(r3)
            char r3 = r7[r13]
            r2.append(r3)
            char r3 = r7[r14]
            r2.append(r3)
            char r3 = r7[r11]
            r2.append(r3)
            char r3 = r7[r12]
            r2.append(r3)
            r5 = 5
            goto L_0x0019
        L_0x00d5:
            java.lang.String r0 = r2.toString()
            return r0
        L_0x00da:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.threatmetrix.TrustDefender.C11921k0.m43738u(byte[]):java.lang.String");
    }

    /* renamed from: v */
    public static boolean m43739v(String str) {
        return str == null || str.isEmpty();
    }

    /* renamed from: w */
    public static byte[] m43740w(byte[] bArr) {
        MessageDigest messageDigest;
        byte[] digest;
        if (bArr == null || bArr.length == 0 || (messageDigest = f34874e) == null) {
            return null;
        }
        synchronized (messageDigest) {
            messageDigest.update(bArr);
            digest = messageDigest.digest();
            messageDigest.reset();
        }
        return digest;
    }

    /* renamed from: x */
    public static String m43741x(String str, String str2) {
        if (str == null || str.length() > 262144 || str2 == null) {
            return null;
        }
        if (C11996u0.m44036s().mo32072e()) {
            return C11996u0.m44036s().mo32081n(str, str2);
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        byte[] bytes2 = str2.getBytes(StandardCharsets.UTF_8);
        byte[] bytes3 = (bytes.length + "&").getBytes(StandardCharsets.UTF_8);
        byte[] bArr = new byte[(bytes.length + bytes3.length)];
        int length = bytes2.length;
        int length2 = bytes3.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length2) {
            int i4 = i2 + 1;
            int i5 = i3 + 1;
            bArr[i2] = (byte) ((bytes2[i3] & 10) ^ bytes3[i]);
            i3 = i5 >= length ? 0 : i5;
            i++;
            i2 = i4;
        }
        int length3 = bytes.length;
        int i6 = 0;
        while (i6 < length3) {
            int i7 = i2 + 1;
            int i8 = i3 + 1;
            bArr[i2] = (byte) (bytes[i6] ^ (bytes2[i3] & 10));
            i3 = i8 >= length ? 0 : i8;
            i6++;
            i2 = i7;
        }
        return m43724g(bArr);
    }

    /* renamed from: y */
    public static String m43742y(byte[] bArr) {
        char[] cArr = new char[((bArr.length * 3) - 1)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 3;
            char[] cArr2 = f34871b;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
            if (i < bArr.length - 1) {
                cArr[i2 + 2] = ':';
            }
        }
        return new String(cArr);
    }

    /* renamed from: z */
    public static String m43743z(List list, String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!str2.isEmpty()) {
                if (sb.length() > 0) {
                    sb.append(str);
                }
                sb.append(str2);
            }
        }
        if (z && sb.length() > 0) {
            sb.append(str);
        }
        return sb.toString();
    }
}
