package com.threatmetrix.TrustDefender;

import android.os.Process;
import com.threatmetrix.TrustDefender.C11927l1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* renamed from: com.threatmetrix.TrustDefender.p */
public abstract class C11943p {
    /* renamed from: a */
    public static C11927l1.C11929b m43844a() {
        String concat = "lib".concat("TMXProfiling-6.3-81-jni").concat(".so");
        char[] cArr = new char[8192];
        try {
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            FileReader fileReader = new FileReader("/proc/" + Process.myPid() + "/maps");
            int i4 = 0;
            boolean z = false;
            boolean z2 = false;
            int i5 = 0;
            int i6 = 0;
            int i7 = -1;
            while (true) {
                if (fileReader == null && i4 < 0) {
                    break;
                }
                if (z) {
                    while (true) {
                        try {
                            char c = cArr[i5];
                            i5++;
                            if (c == 10) {
                                break;
                            }
                        } catch (ArrayIndexOutOfBoundsException | SecurityException unused) {
                        }
                    }
                }
                i4 -= i5 - i6;
                i6 = i5;
                while (fileReader != null && i4 < 1024) {
                    int c2 = m43846c(cArr, i6, i4, fileReader);
                    if (c2 < 0) {
                        fileReader = null;
                    } else {
                        i4 += c2;
                    }
                    i6 = 0;
                }
                int b = m43845b(cArr, i6);
                boolean z3 = false;
                while (true) {
                    char c3 = cArr[b];
                    if (c3 == ' ') {
                        break;
                    }
                    if (c3 == 'x') {
                        z3 = true;
                    }
                    b++;
                }
                int i8 = b + 1;
                if (!z3) {
                    i5 = i8;
                } else {
                    i5 = m43845b(cArr, m43845b(cArr, i8));
                    if (cArr[i5] != '0' || cArr[i5 + 1] != ' ') {
                        int b2 = m43845b(cArr, i5);
                        while (cArr[b2] == ' ') {
                            b2++;
                        }
                        int i9 = b2;
                        while (cArr[i9] != 10) {
                            i9++;
                        }
                        int i12 = i9 + 1;
                        String str = new String(cArr, b2, i9 - b2);
                        if (str.startsWith("/system")) {
                            i++;
                            i2 = (int) (((long) i2) + new File(str).length());
                        } else if (str.startsWith("/dev")) {
                            i7++;
                        } else if (str.endsWith(concat)) {
                            z2 = true;
                        } else {
                            i7++;
                            i3 = (int) (((long) i3) + new File(str).length());
                        }
                        z = false;
                        i5 = i12;
                    }
                }
                z = true;
            }
            return new C11927l1.C11929b(i, i2, i7, i3, z2);
        } catch (FileNotFoundException unused2) {
            return new C11927l1.C11929b(-1, -1, -1, -1, false);
        }
    }

    /* renamed from: b */
    private static int m43845b(char[] cArr, int i) {
        char c;
        do {
            c = cArr[i];
            i++;
        } while (c != ' ');
        return i;
    }

    /* renamed from: c */
    private static int m43846c(char[] cArr, int i, int i2, FileReader fileReader) {
        if (i > 0) {
            System.arraycopy(cArr, i, cArr, 0, i2);
        }
        try {
            int read = fileReader.read(cArr, i2, 8192 - i2);
            if (read > 0) {
                return read;
            }
            fileReader.close();
            return -1;
        } catch (IOException unused) {
            return -1;
        }
    }
}
