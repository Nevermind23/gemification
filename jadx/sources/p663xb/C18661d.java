package p663xb;

import com.google.zxing.C5751a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: xb.d */
public final class C18661d extends C18677s {

    /* renamed from: xb.d$a */
    private enum C18662a {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    /* renamed from: h */
    private static int m63231h(CharSequence charSequence, int i, int i2) {
        C18662a i3;
        C18662a i4;
        char charAt;
        C18662a i5 = m63232i(charSequence, i);
        C18662a aVar = C18662a.ONE_DIGIT;
        if (i5 != aVar) {
            C18662a aVar2 = C18662a.UNCODABLE;
            if (i5 == aVar2) {
                if (i >= charSequence.length() || ((charAt = charSequence.charAt(i)) >= ' ' && (i2 != 101 || (charAt >= '`' && (charAt < 241 || charAt > 244))))) {
                    return 100;
                }
                return 101;
            } else if (i2 == 101 && i5 == C18662a.FNC_1) {
                return 101;
            } else {
                if (i2 == 99) {
                    return 99;
                }
                if (i2 == 100) {
                    C18662a aVar3 = C18662a.FNC_1;
                    if (i5 == aVar3 || (i3 = m63232i(charSequence, i + 2)) == aVar2 || i3 == aVar) {
                        return 100;
                    }
                    if (i3 != aVar3) {
                        int i6 = i + 4;
                        while (true) {
                            i4 = m63232i(charSequence, i6);
                            if (i4 != C18662a.TWO_DIGITS) {
                                break;
                            }
                            i6 += 2;
                        }
                        if (i4 == C18662a.ONE_DIGIT) {
                            return 100;
                        }
                        return 99;
                    } else if (m63232i(charSequence, i + 3) == C18662a.TWO_DIGITS) {
                        return 99;
                    } else {
                        return 100;
                    }
                } else {
                    if (i5 == C18662a.FNC_1) {
                        i5 = m63232i(charSequence, i + 1);
                    }
                    if (i5 == C18662a.TWO_DIGITS) {
                        return 99;
                    }
                    return 100;
                }
            }
        } else if (i2 == 101) {
            return 101;
        } else {
            return 100;
        }
    }

    /* renamed from: i */
    private static C18662a m63232i(CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i >= length) {
            return C18662a.UNCODABLE;
        }
        char charAt = charSequence.charAt(i);
        if (charAt == 241) {
            return C18662a.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return C18662a.UNCODABLE;
        }
        int i2 = i + 1;
        if (i2 >= length) {
            return C18662a.ONE_DIGIT;
        }
        char charAt2 = charSequence.charAt(i2);
        if (charAt2 < '0' || charAt2 > '9') {
            return C18662a.ONE_DIGIT;
        }
        return C18662a.TWO_DIGITS;
    }

    /* renamed from: d */
    public boolean[] mo46492d(String str) {
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            switch (charAt) {
                case 241:
                case 242:
                case 243:
                case 244:
                    break;
                default:
                    if (charAt <= 127) {
                        break;
                    } else {
                        throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(charAt)));
                    }
            }
        }
        ArrayList<int[]> arrayList = new ArrayList<>();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (true) {
            int i7 = 103;
            if (i3 < length) {
                int h = m63231h(str, i3, i5);
                int i8 = 100;
                if (h == i5) {
                    switch (str.charAt(i3)) {
                        case 241:
                            i8 = 102;
                            break;
                        case 242:
                            i8 = 97;
                            break;
                        case 243:
                            i8 = 96;
                            break;
                        case 244:
                            if (i5 == 101) {
                                i8 = 101;
                                break;
                            }
                            break;
                        default:
                            if (i5 != 100) {
                                if (i5 == 101) {
                                    i8 = str.charAt(i3) - ' ';
                                    if (i8 < 0) {
                                        i8 += 96;
                                        break;
                                    }
                                } else {
                                    i8 = Integer.parseInt(str.substring(i3, i3 + 2));
                                    i3++;
                                    break;
                                }
                            } else {
                                i8 = str.charAt(i3) - ' ';
                                break;
                            }
                            break;
                    }
                    i3++;
                } else {
                    if (i5 != 0) {
                        i7 = h;
                    } else if (h == 100) {
                        i7 = 104;
                    } else if (h != 101) {
                        i7 = 105;
                    }
                    i8 = i7;
                    i5 = h;
                }
                arrayList.add(C18660c.f52271a[i8]);
                i4 += i8 * i6;
                if (i3 != 0) {
                    i6++;
                }
            } else {
                int[][] iArr = C18660c.f52271a;
                arrayList.add(iArr[i4 % 103]);
                arrayList.add(iArr[106]);
                int i9 = 0;
                for (int[] iArr2 : arrayList) {
                    for (int i12 : (int[]) r13.next()) {
                        i9 += i12;
                    }
                }
                boolean[] zArr = new boolean[i9];
                for (int[] b : arrayList) {
                    i += C18677s.m63290b(zArr, i, b, true);
                }
                return zArr;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Collection mo46493f() {
        return Collections.singleton(C5751a.CODE_128);
    }
}
