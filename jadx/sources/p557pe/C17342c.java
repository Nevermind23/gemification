package p557pe;

import java.util.List;
import p543oe.C17180a;
import p543oe.C17181b;
import p543oe.C17182c;

/* renamed from: pe.c */
public abstract class C17342c {
    /* renamed from: a */
    private static boolean m60704a(List list, int i, int i2, String str, StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        int i3;
        int i4;
        int i5 = i;
        int i6 = i2;
        String str2 = str;
        StringBuffer stringBuffer3 = stringBuffer;
        StringBuffer stringBuffer4 = stringBuffer2;
        int i7 = 0;
        if (list == null || str2 == null || stringBuffer3 == null || stringBuffer4 == null) {
            return false;
        }
        String stringBuffer5 = stringBuffer.toString();
        if (stringBuffer5.length() <= 0) {
            return true;
        }
        if (i5 >= list.size()) {
            return false;
        }
        C17182c cVar = (C17182c) list.get(i);
        if (i6 >= cVar.mo44604a().size()) {
            return false;
        }
        C17180a aVar = (C17180a) cVar.mo44604a().get(i6);
        if (cVar.mo44606c()) {
            if (stringBuffer5.startsWith(String.valueOf(aVar.mo44594a().charAt(0)))) {
                stringBuffer3.delete(0, 1);
                stringBuffer4.append(str2.charAt(cVar.mo44605b()));
                if (true == m60704a(list, i5 + 1, 0, str, stringBuffer, stringBuffer2)) {
                    return true;
                }
                stringBuffer3.insert(0, aVar.mo44594a().charAt(0));
                stringBuffer4.deleteCharAt(stringBuffer2.length() - 1);
            }
            if (aVar.mo44594a().startsWith(stringBuffer5)) {
                stringBuffer4.append(str2.charAt(cVar.mo44605b()));
                stringBuffer3.delete(0, stringBuffer.length());
                return true;
            } else if (stringBuffer5.startsWith(aVar.mo44594a())) {
                stringBuffer3.delete(0, aVar.mo44594a().length());
                stringBuffer4.append(str2.charAt(cVar.mo44605b()));
                if (true == m60704a(list, i5 + 1, 0, str, stringBuffer, stringBuffer2)) {
                    return true;
                }
                stringBuffer3.insert(0, aVar.mo44594a());
                stringBuffer4.deleteCharAt(stringBuffer2.length() - 1);
            } else {
                if (m60704a(list, i, i6 + 1, str, stringBuffer, stringBuffer2)) {
                    return true;
                }
            }
        } else if (aVar.mo44594a().startsWith(stringBuffer5)) {
            stringBuffer4.append(str2.substring(cVar.mo44605b() + 0, cVar.mo44605b() + 0 + stringBuffer5.length()));
            stringBuffer3.delete(0, stringBuffer.length());
            return true;
        } else if (stringBuffer5.startsWith(aVar.mo44594a())) {
            stringBuffer3.delete(0, aVar.mo44594a().length());
            stringBuffer4.append(str2.substring(cVar.mo44605b() + 0, cVar.mo44605b() + 0 + aVar.mo44594a().length()));
            if (true == m60704a(list, i5 + 1, 0, str, stringBuffer, stringBuffer2)) {
                return true;
            }
            stringBuffer3.insert(0, aVar.mo44594a());
            stringBuffer4.delete(stringBuffer2.length() - aVar.mo44594a().length(), stringBuffer2.length());
        } else {
            if (stringBuffer2.length() > 0) {
                try {
                    if (true == m60704a(list, i, i6 + 1, str, stringBuffer, stringBuffer2)) {
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else if (aVar.mo44594a().contains(stringBuffer5)) {
                int indexOf = aVar.mo44594a().indexOf(stringBuffer5);
                stringBuffer4.append(str2.substring(cVar.mo44605b() + indexOf, indexOf + cVar.mo44605b() + stringBuffer5.length()));
                stringBuffer3.delete(0, stringBuffer.length());
                return true;
            } else {
                int length = aVar.mo44594a().length();
                int i8 = 0;
                while (i8 < length) {
                    String substring = aVar.mo44594a().substring(i8);
                    if (stringBuffer5.startsWith(substring)) {
                        stringBuffer3.delete(i7, substring.length());
                        stringBuffer4.append(str2.substring(cVar.mo44605b() + i8, cVar.mo44605b() + i8 + substring.length()));
                        String str3 = substring;
                        i4 = i8;
                        i3 = length;
                        if (true == m60704a(list, i5 + 1, 0, str, stringBuffer, stringBuffer2)) {
                            return true;
                        }
                        stringBuffer3.insert(0, aVar.mo44594a().substring(i4));
                        stringBuffer4.delete(stringBuffer2.length() - str3.length(), stringBuffer2.length());
                    } else {
                        i4 = i8;
                        i3 = length;
                    }
                    i8 = i4 + 1;
                    length = i3;
                    i7 = 0;
                }
                if (true == m60704a(list, i, i6 + 1, str, stringBuffer, stringBuffer2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        return '9';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        return '8';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        return '7';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        return '6';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        return '5';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        return '4';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        return '3';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        return '2';
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static char m60705b(char r0) {
        /*
            switch(r0) {
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x0019;
                case 69: goto L_0x0019;
                case 70: goto L_0x0019;
                case 71: goto L_0x0016;
                case 72: goto L_0x0016;
                case 73: goto L_0x0016;
                case 74: goto L_0x0013;
                case 75: goto L_0x0013;
                case 76: goto L_0x0013;
                case 77: goto L_0x0010;
                case 78: goto L_0x0010;
                case 79: goto L_0x0010;
                case 80: goto L_0x000d;
                case 81: goto L_0x000d;
                case 82: goto L_0x000d;
                case 83: goto L_0x000d;
                case 84: goto L_0x000a;
                case 85: goto L_0x000a;
                case 86: goto L_0x000a;
                case 87: goto L_0x0007;
                case 88: goto L_0x0007;
                case 89: goto L_0x0007;
                case 90: goto L_0x0007;
                default: goto L_0x0003;
            }
        L_0x0003:
            switch(r0) {
                case 97: goto L_0x001c;
                case 98: goto L_0x001c;
                case 99: goto L_0x001c;
                case 100: goto L_0x0019;
                case 101: goto L_0x0019;
                case 102: goto L_0x0019;
                case 103: goto L_0x0016;
                case 104: goto L_0x0016;
                case 105: goto L_0x0016;
                case 106: goto L_0x0013;
                case 107: goto L_0x0013;
                case 108: goto L_0x0013;
                case 109: goto L_0x0010;
                case 110: goto L_0x0010;
                case 111: goto L_0x0010;
                case 112: goto L_0x000d;
                case 113: goto L_0x000d;
                case 114: goto L_0x000d;
                case 115: goto L_0x000d;
                case 116: goto L_0x000a;
                case 117: goto L_0x000a;
                case 118: goto L_0x000a;
                case 119: goto L_0x0007;
                case 120: goto L_0x0007;
                case 121: goto L_0x0007;
                case 122: goto L_0x0007;
                default: goto L_0x0006;
            }
        L_0x0006:
            goto L_0x001e
        L_0x0007:
            r0 = 57
            goto L_0x001e
        L_0x000a:
            r0 = 56
            goto L_0x001e
        L_0x000d:
            r0 = 55
            goto L_0x001e
        L_0x0010:
            r0 = 54
            goto L_0x001e
        L_0x0013:
            r0 = 53
            goto L_0x001e
        L_0x0016:
            r0 = 52
            goto L_0x001e
        L_0x0019:
            r0 = 51
            goto L_0x001e
        L_0x001c:
            r0 = 50
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p557pe.C17342c.m60705b(char):char");
    }

    /* renamed from: c */
    public static boolean m60706c(C17181b bVar, String str) {
        if (!(bVar == null || str == null || bVar.mo44600a() == null || bVar.mo44601b() == null)) {
            bVar.mo44601b().delete(0, bVar.mo44601b().length());
            int size = bVar.mo44602c().size();
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < size; i++) {
                bVar.mo44601b().delete(0, bVar.mo44601b().length());
                stringBuffer.delete(0, stringBuffer.length());
                stringBuffer.append(str);
                if (true == m60704a(bVar.mo44602c(), i, 0, bVar.mo44600a(), stringBuffer, bVar.mo44601b())) {
                    return true;
                }
            }
        }
        return false;
    }
}
