package androidx.profileinstaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: androidx.profileinstaller.n */
abstract class C1704n {

    /* renamed from: a */
    static final byte[] f4955a = {112, 114, 111, 0};

    /* renamed from: b */
    static final byte[] f4956b = {112, 114, 109, 0};

    /* renamed from: A */
    private static void m5958A(InputStream inputStream) {
        C1692e.m5927h(inputStream);
        int j = C1692e.m5929j(inputStream);
        if (j != 6 && j != 7) {
            while (j > 0) {
                C1692e.m5929j(inputStream);
                for (int j2 = C1692e.m5929j(inputStream); j2 > 0; j2--) {
                    C1692e.m5927h(inputStream);
                }
                j--;
            }
        }
    }

    /* renamed from: B */
    static boolean m5959B(OutputStream outputStream, byte[] bArr, C1691d[] dVarArr) {
        if (Arrays.equals(bArr, C1711r.f4967a)) {
            m5971N(outputStream, dVarArr);
            return true;
        } else if (Arrays.equals(bArr, C1711r.f4968b)) {
            m5970M(outputStream, dVarArr);
            return true;
        } else if (Arrays.equals(bArr, C1711r.f4970d)) {
            m5968K(outputStream, dVarArr);
            return true;
        } else if (Arrays.equals(bArr, C1711r.f4969c)) {
            m5969L(outputStream, dVarArr);
            return true;
        } else if (!Arrays.equals(bArr, C1711r.f4971e)) {
            return false;
        } else {
            m5967J(outputStream, dVarArr);
            return true;
        }
    }

    /* renamed from: C */
    private static void m5960C(OutputStream outputStream, C1691d dVar) {
        int i = 0;
        for (int valueOf : dVar.f4936h) {
            Integer valueOf2 = Integer.valueOf(valueOf);
            C1692e.m5935p(outputStream, valueOf2.intValue() - i);
            i = valueOf2.intValue();
        }
    }

    /* renamed from: D */
    private static C1712s m5961D(C1691d[] dVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C1692e.m5935p(byteArrayOutputStream, dVarArr.length);
            int i = 2;
            for (C1691d dVar : dVarArr) {
                C1692e.m5936q(byteArrayOutputStream, dVar.f4931c);
                C1692e.m5936q(byteArrayOutputStream, dVar.f4932d);
                C1692e.m5936q(byteArrayOutputStream, (long) dVar.f4935g);
                String j = m5982j(dVar.f4929a, dVar.f4930b, C1711r.f4967a);
                int k = C1692e.m5930k(j);
                C1692e.m5935p(byteArrayOutputStream, k);
                i = i + 4 + 4 + 4 + 2 + (k * 1);
                C1692e.m5933n(byteArrayOutputStream, j);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i == byteArray.length) {
                C1712s sVar = new C1712s(C1693f.DEX_FILES, i, byteArray, false);
                byteArrayOutputStream.close();
                return sVar;
            }
            throw C1692e.m5922c("Expected size " + i + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: E */
    static void m5962E(OutputStream outputStream, byte[] bArr) {
        outputStream.write(f4955a);
        outputStream.write(bArr);
    }

    /* renamed from: F */
    private static void m5963F(OutputStream outputStream, C1691d dVar) {
        m5966I(outputStream, dVar);
        m5960C(outputStream, dVar);
        m5965H(outputStream, dVar);
    }

    /* renamed from: G */
    private static void m5964G(OutputStream outputStream, C1691d dVar, String str) {
        C1692e.m5935p(outputStream, C1692e.m5930k(str));
        C1692e.m5935p(outputStream, dVar.f4933e);
        C1692e.m5936q(outputStream, (long) dVar.f4934f);
        C1692e.m5936q(outputStream, dVar.f4931c);
        C1692e.m5936q(outputStream, (long) dVar.f4935g);
        C1692e.m5933n(outputStream, str);
    }

    /* renamed from: H */
    private static void m5965H(OutputStream outputStream, C1691d dVar) {
        byte[] bArr = new byte[m5983k(dVar.f4935g)];
        for (Map.Entry entry : dVar.f4937i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                m5998z(bArr, 2, intValue, dVar);
            }
            if ((intValue2 & 4) != 0) {
                m5998z(bArr, 4, intValue, dVar);
            }
        }
        outputStream.write(bArr);
    }

    /* renamed from: I */
    private static void m5966I(OutputStream outputStream, C1691d dVar) {
        int i = 0;
        for (Map.Entry entry : dVar.f4937i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                C1692e.m5935p(outputStream, intValue - i);
                C1692e.m5935p(outputStream, 0);
                i = intValue;
            }
        }
    }

    /* renamed from: J */
    private static void m5967J(OutputStream outputStream, C1691d[] dVarArr) {
        C1692e.m5935p(outputStream, dVarArr.length);
        for (C1691d dVar : dVarArr) {
            String j = m5982j(dVar.f4929a, dVar.f4930b, C1711r.f4971e);
            C1692e.m5935p(outputStream, C1692e.m5930k(j));
            C1692e.m5935p(outputStream, dVar.f4937i.size());
            C1692e.m5935p(outputStream, dVar.f4936h.length);
            C1692e.m5936q(outputStream, dVar.f4931c);
            C1692e.m5933n(outputStream, j);
            for (Integer intValue : dVar.f4937i.keySet()) {
                C1692e.m5935p(outputStream, intValue.intValue());
            }
            for (int p : dVar.f4936h) {
                C1692e.m5935p(outputStream, p);
            }
        }
    }

    /* renamed from: K */
    private static void m5968K(OutputStream outputStream, C1691d[] dVarArr) {
        C1692e.m5937r(outputStream, dVarArr.length);
        for (C1691d dVar : dVarArr) {
            String j = m5982j(dVar.f4929a, dVar.f4930b, C1711r.f4970d);
            C1692e.m5935p(outputStream, C1692e.m5930k(j));
            C1692e.m5935p(outputStream, dVar.f4936h.length);
            C1692e.m5936q(outputStream, (long) (dVar.f4937i.size() * 4));
            C1692e.m5936q(outputStream, dVar.f4931c);
            C1692e.m5933n(outputStream, j);
            for (Integer intValue : dVar.f4937i.keySet()) {
                C1692e.m5935p(outputStream, intValue.intValue());
                C1692e.m5935p(outputStream, 0);
            }
            for (int p : dVar.f4936h) {
                C1692e.m5935p(outputStream, p);
            }
        }
    }

    /* renamed from: L */
    private static void m5969L(OutputStream outputStream, C1691d[] dVarArr) {
        byte[] b = m5974b(dVarArr, C1711r.f4969c);
        C1692e.m5937r(outputStream, dVarArr.length);
        C1692e.m5932m(outputStream, b);
    }

    /* renamed from: M */
    private static void m5970M(OutputStream outputStream, C1691d[] dVarArr) {
        byte[] b = m5974b(dVarArr, C1711r.f4968b);
        C1692e.m5937r(outputStream, dVarArr.length);
        C1692e.m5932m(outputStream, b);
    }

    /* renamed from: N */
    private static void m5971N(OutputStream outputStream, C1691d[] dVarArr) {
        m5972O(outputStream, dVarArr);
    }

    /* renamed from: O */
    private static void m5972O(OutputStream outputStream, C1691d[] dVarArr) {
        int i;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(m5961D(dVarArr));
        arrayList.add(m5975c(dVarArr));
        arrayList.add(m5976d(dVarArr));
        long length = ((long) C1711r.f4967a.length) + ((long) f4955a.length) + 4 + ((long) (arrayList.size() * 16));
        C1692e.m5936q(outputStream, (long) arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C1712s sVar = (C1712s) arrayList.get(i2);
            C1692e.m5936q(outputStream, sVar.f4974a.mo5136b());
            C1692e.m5936q(outputStream, length);
            if (sVar.f4977d) {
                byte[] bArr = sVar.f4976c;
                byte[] b = C1692e.m5921b(bArr);
                arrayList2.add(b);
                C1692e.m5936q(outputStream, (long) b.length);
                C1692e.m5936q(outputStream, (long) bArr.length);
                i = b.length;
            } else {
                arrayList2.add(sVar.f4976c);
                C1692e.m5936q(outputStream, (long) sVar.f4976c.length);
                C1692e.m5936q(outputStream, 0);
                i = sVar.f4976c.length;
            }
            length += (long) i;
        }
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            outputStream.write((byte[]) arrayList2.get(i3));
        }
    }

    /* renamed from: a */
    private static int m5973a(C1691d dVar) {
        int i = 0;
        for (Map.Entry value : dVar.f4937i.entrySet()) {
            i |= ((Integer) value.getValue()).intValue();
        }
        return i;
    }

    /* renamed from: b */
    private static byte[] m5974b(C1691d[] dVarArr, byte[] bArr) {
        int i = 0;
        int i2 = 0;
        for (C1691d dVar : dVarArr) {
            i2 += C1692e.m5930k(m5982j(dVar.f4929a, dVar.f4930b, bArr)) + 16 + (dVar.f4933e * 2) + dVar.f4934f + m5983k(dVar.f4935g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, C1711r.f4969c)) {
            int length = dVarArr.length;
            while (i < length) {
                C1691d dVar2 = dVarArr[i];
                m5964G(byteArrayOutputStream, dVar2, m5982j(dVar2.f4929a, dVar2.f4930b, bArr));
                m5963F(byteArrayOutputStream, dVar2);
                i++;
            }
        } else {
            for (C1691d dVar3 : dVarArr) {
                m5964G(byteArrayOutputStream, dVar3, m5982j(dVar3.f4929a, dVar3.f4930b, bArr));
            }
            int length2 = dVarArr.length;
            while (i < length2) {
                m5963F(byteArrayOutputStream, dVarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        throw C1692e.m5922c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
    }

    /* renamed from: c */
    private static C1712s m5975c(C1691d[] dVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        int i2 = 0;
        while (i < dVarArr.length) {
            try {
                C1691d dVar = dVarArr[i];
                C1692e.m5935p(byteArrayOutputStream, i);
                C1692e.m5935p(byteArrayOutputStream, dVar.f4933e);
                i2 = i2 + 2 + 2 + (dVar.f4933e * 2);
                m5960C(byteArrayOutputStream, dVar);
                i++;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i2 == byteArray.length) {
            C1712s sVar = new C1712s(C1693f.CLASSES, i2, byteArray, true);
            byteArrayOutputStream.close();
            return sVar;
        }
        throw C1692e.m5922c("Expected size " + i2 + ", does not match actual size " + byteArray.length);
        throw th;
    }

    /* renamed from: d */
    private static C1712s m5976d(C1691d[] dVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        int i2 = 0;
        while (i < dVarArr.length) {
            try {
                C1691d dVar = dVarArr[i];
                int a = m5973a(dVar);
                byte[] e = m5977e(dVar);
                byte[] f = m5978f(dVar);
                C1692e.m5935p(byteArrayOutputStream, i);
                int length = e.length + 2 + f.length;
                C1692e.m5936q(byteArrayOutputStream, (long) length);
                C1692e.m5935p(byteArrayOutputStream, a);
                byteArrayOutputStream.write(e);
                byteArrayOutputStream.write(f);
                i2 = i2 + 2 + 4 + length;
                i++;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i2 == byteArray.length) {
            C1712s sVar = new C1712s(C1693f.METHODS, i2, byteArray, true);
            byteArrayOutputStream.close();
            return sVar;
        }
        throw C1692e.m5922c("Expected size " + i2 + ", does not match actual size " + byteArray.length);
        throw th;
    }

    /* renamed from: e */
    private static byte[] m5977e(C1691d dVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m5965H(byteArrayOutputStream, dVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: f */
    private static byte[] m5978f(C1691d dVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m5966I(byteArrayOutputStream, dVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: g */
    private static String m5979g(String str, String str2) {
        if ("!".equals(str2)) {
            return str.replace(":", "!");
        }
        if (":".equals(str2)) {
            return str.replace("!", ":");
        }
        return str;
    }

    /* renamed from: h */
    private static String m5980h(String str) {
        int indexOf = str.indexOf("!");
        if (indexOf < 0) {
            indexOf = str.indexOf(":");
        }
        if (indexOf > 0) {
            return str.substring(indexOf + 1);
        }
        return str;
    }

    /* renamed from: i */
    private static C1691d m5981i(C1691d[] dVarArr, String str) {
        if (dVarArr.length <= 0) {
            return null;
        }
        String h = m5980h(str);
        for (int i = 0; i < dVarArr.length; i++) {
            if (dVarArr[i].f4930b.equals(h)) {
                return dVarArr[i];
            }
        }
        return null;
    }

    /* renamed from: j */
    private static String m5982j(String str, String str2, byte[] bArr) {
        String a = C1711r.m6007a(bArr);
        if (str.length() <= 0) {
            return m5979g(str2, a);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return m5979g(str2, a);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + C1711r.m6007a(bArr) + str2;
    }

    /* renamed from: k */
    private static int m5983k(int i) {
        return m5997y(i * 2) / 8;
    }

    /* renamed from: l */
    private static int m5984l(int i, int i2, int i3) {
        if (i == 1) {
            throw C1692e.m5922c("HOT methods are not stored in the bitmap");
        } else if (i == 2) {
            return i2;
        } else {
            if (i == 4) {
                return i2 + i3;
            }
            throw C1692e.m5922c("Unexpected flag: " + i);
        }
    }

    /* renamed from: m */
    private static int[] m5985m(InputStream inputStream, int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += C1692e.m5927h(inputStream);
            iArr[i3] = i2;
        }
        return iArr;
    }

    /* renamed from: n */
    private static int m5986n(BitSet bitSet, int i, int i2) {
        int i3 = 2;
        if (!bitSet.get(m5984l(2, i, i2))) {
            i3 = 0;
        }
        if (bitSet.get(m5984l(4, i, i2))) {
            return i3 | 4;
        }
        return i3;
    }

    /* renamed from: o */
    static byte[] m5987o(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, C1692e.m5923d(inputStream, bArr.length))) {
            return C1692e.m5923d(inputStream, C1711r.f4968b.length);
        }
        throw C1692e.m5922c("Invalid magic");
    }

    /* renamed from: p */
    private static void m5988p(InputStream inputStream, C1691d dVar) {
        int available = inputStream.available() - dVar.f4934f;
        int i = 0;
        while (inputStream.available() > available) {
            i += C1692e.m5927h(inputStream);
            dVar.f4937i.put(Integer.valueOf(i), 1);
            for (int h = C1692e.m5927h(inputStream); h > 0; h--) {
                m5958A(inputStream);
            }
        }
        if (inputStream.available() != available) {
            throw C1692e.m5922c("Read too much data during profile line parse");
        }
    }

    /* renamed from: q */
    static C1691d[] m5989q(InputStream inputStream, byte[] bArr, byte[] bArr2, C1691d[] dVarArr) {
        if (Arrays.equals(bArr, C1711r.f4972f)) {
            if (!Arrays.equals(C1711r.f4967a, bArr2)) {
                return m5990r(inputStream, bArr, dVarArr);
            }
            throw C1692e.m5922c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        } else if (Arrays.equals(bArr, C1711r.f4973g)) {
            return m5992t(inputStream, bArr2, dVarArr);
        } else {
            throw C1692e.m5922c("Unsupported meta version");
        }
    }

    /* renamed from: r */
    static C1691d[] m5990r(InputStream inputStream, byte[] bArr, C1691d[] dVarArr) {
        if (Arrays.equals(bArr, C1711r.f4972f)) {
            int j = C1692e.m5929j(inputStream);
            byte[] e = C1692e.m5924e(inputStream, (int) C1692e.m5928i(inputStream), (int) C1692e.m5928i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e);
                try {
                    C1691d[] s = m5991s(byteArrayInputStream, j, dVarArr);
                    byteArrayInputStream.close();
                    return s;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                throw C1692e.m5922c("Content found after the end of file");
            }
        } else {
            throw C1692e.m5922c("Unsupported meta version");
        }
        throw th;
    }

    /* renamed from: s */
    private static C1691d[] m5991s(InputStream inputStream, int i, C1691d[] dVarArr) {
        int i2 = 0;
        if (inputStream.available() == 0) {
            return new C1691d[0];
        }
        if (i == dVarArr.length) {
            String[] strArr = new String[i];
            int[] iArr = new int[i];
            for (int i3 = 0; i3 < i; i3++) {
                int h = C1692e.m5927h(inputStream);
                iArr[i3] = C1692e.m5927h(inputStream);
                strArr[i3] = C1692e.m5925f(inputStream, h);
            }
            while (i2 < i) {
                C1691d dVar = dVarArr[i2];
                if (dVar.f4930b.equals(strArr[i2])) {
                    int i4 = iArr[i2];
                    dVar.f4933e = i4;
                    dVar.f4936h = m5985m(inputStream, i4);
                    i2++;
                } else {
                    throw C1692e.m5922c("Order of dexfiles in metadata did not match baseline");
                }
            }
            return dVarArr;
        }
        throw C1692e.m5922c("Mismatched number of dex files found in metadata");
    }

    /* renamed from: t */
    static C1691d[] m5992t(InputStream inputStream, byte[] bArr, C1691d[] dVarArr) {
        int h = C1692e.m5927h(inputStream);
        byte[] e = C1692e.m5924e(inputStream, (int) C1692e.m5928i(inputStream), (int) C1692e.m5928i(inputStream));
        if (inputStream.read() <= 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e);
            try {
                C1691d[] u = m5993u(byteArrayInputStream, bArr, h, dVarArr);
                byteArrayInputStream.close();
                return u;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            throw C1692e.m5922c("Content found after the end of file");
        }
        throw th;
    }

    /* renamed from: u */
    private static C1691d[] m5993u(InputStream inputStream, byte[] bArr, int i, C1691d[] dVarArr) {
        int i2 = 0;
        if (inputStream.available() == 0) {
            return new C1691d[0];
        }
        if (i == dVarArr.length) {
            while (i2 < i) {
                C1692e.m5927h(inputStream);
                String f = C1692e.m5925f(inputStream, C1692e.m5927h(inputStream));
                long i3 = C1692e.m5928i(inputStream);
                int h = C1692e.m5927h(inputStream);
                C1691d i4 = m5981i(dVarArr, f);
                if (i4 != null) {
                    i4.f4932d = i3;
                    int[] m = m5985m(inputStream, h);
                    if (Arrays.equals(bArr, C1711r.f4971e)) {
                        i4.f4933e = h;
                        i4.f4936h = m;
                    }
                    i2++;
                } else {
                    throw C1692e.m5922c("Missing profile key: " + f);
                }
            }
            return dVarArr;
        }
        throw C1692e.m5922c("Mismatched number of dex files found in metadata");
    }

    /* renamed from: v */
    private static void m5994v(InputStream inputStream, C1691d dVar) {
        BitSet valueOf = BitSet.valueOf(C1692e.m5923d(inputStream, C1692e.m5920a(dVar.f4935g * 2)));
        int i = 0;
        while (true) {
            int i2 = dVar.f4935g;
            if (i < i2) {
                int n = m5986n(valueOf, i, i2);
                if (n != 0) {
                    Integer num = (Integer) dVar.f4937i.get(Integer.valueOf(i));
                    if (num == null) {
                        num = 0;
                    }
                    dVar.f4937i.put(Integer.valueOf(i), Integer.valueOf(n | num.intValue()));
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: w */
    static C1691d[] m5995w(InputStream inputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, C1711r.f4968b)) {
            int j = C1692e.m5929j(inputStream);
            byte[] e = C1692e.m5924e(inputStream, (int) C1692e.m5928i(inputStream), (int) C1692e.m5928i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e);
                try {
                    C1691d[] x = m5996x(byteArrayInputStream, str, j);
                    byteArrayInputStream.close();
                    return x;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                throw C1692e.m5922c("Content found after the end of file");
            }
        } else {
            throw C1692e.m5922c("Unsupported version");
        }
        throw th;
    }

    /* renamed from: x */
    private static C1691d[] m5996x(InputStream inputStream, String str, int i) {
        InputStream inputStream2 = inputStream;
        int i2 = i;
        if (inputStream.available() == 0) {
            return new C1691d[0];
        }
        C1691d[] dVarArr = new C1691d[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int h = C1692e.m5927h(inputStream);
            int h2 = C1692e.m5927h(inputStream);
            long i4 = C1692e.m5928i(inputStream);
            String str2 = str;
            dVarArr[i3] = new C1691d(str2, C1692e.m5925f(inputStream2, h), C1692e.m5928i(inputStream), 0, h2, (int) i4, (int) C1692e.m5928i(inputStream), new int[h2], new TreeMap());
        }
        for (int i5 = 0; i5 < i2; i5++) {
            C1691d dVar = dVarArr[i5];
            m5988p(inputStream2, dVar);
            dVar.f4936h = m5985m(inputStream2, dVar.f4933e);
            m5994v(inputStream2, dVar);
        }
        return dVarArr;
    }

    /* renamed from: y */
    private static int m5997y(int i) {
        return ((i + 8) - 1) & -8;
    }

    /* renamed from: z */
    private static void m5998z(byte[] bArr, int i, int i2, C1691d dVar) {
        int l = m5984l(i, i2, dVar.f4935g);
        int i3 = l / 8;
        bArr[i3] = (byte) ((1 << (l % 8)) | bArr[i3]);
    }
}
