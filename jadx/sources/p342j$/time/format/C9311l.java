package p342j$.time.format;

import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p342j$.time.temporal.C9333a;

/* renamed from: j$.time.format.l */
final class C9311l implements C9306g {

    /* renamed from: c */
    static final String[] f25799c = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};

    /* renamed from: d */
    static final C9311l f25800d = new C9311l("+HH:MM:ss", "Z");

    /* renamed from: a */
    private final String f25801a;

    /* renamed from: b */
    private final int f25802b;

    static {
        new C9311l("+HH:MM:ss", BankApiResponse.SUCCESSFUL_RESPONSE_CODE);
    }

    C9311l(String str, String str2) {
        if (str != null) {
            int i = 0;
            while (true) {
                String[] strArr = f25799c;
                if (i >= 9) {
                    throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str));
                } else if (strArr[i].equals(str)) {
                    this.f25802b = i;
                    this.f25801a = str2;
                    return;
                } else {
                    i++;
                }
            }
        } else {
            throw new NullPointerException("pattern");
        }
    }

    /* renamed from: a */
    public final boolean mo25039a(C9321v vVar, StringBuilder sb) {
        Long e = vVar.mo25080e(C9333a.OFFSET_SECONDS);
        if (e == null) {
            return false;
        }
        long longValue = e.longValue();
        int i = (int) longValue;
        if (longValue == ((long) i)) {
            if (i != 0) {
                int abs = Math.abs((i / 3600) % 100);
                int abs2 = Math.abs((i / 60) % 60);
                int abs3 = Math.abs(i % 60);
                int length = sb.length();
                sb.append(i < 0 ? "-" : "+");
                sb.append((char) ((abs / 10) + 48));
                sb.append((char) ((abs % 10) + 48));
                int i2 = this.f25802b;
                if (i2 >= 3 || (i2 >= 1 && abs2 > 0)) {
                    int i3 = i2 % 2;
                    String str = ":";
                    sb.append(i3 == 0 ? str : "");
                    sb.append((char) ((abs2 / 10) + 48));
                    sb.append((char) ((abs2 % 10) + 48));
                    abs += abs2;
                    if (i2 >= 7 || (i2 >= 5 && abs3 > 0)) {
                        if (i3 != 0) {
                            str = "";
                        }
                        sb.append(str);
                        sb.append((char) ((abs3 / 10) + 48));
                        sb.append((char) ((abs3 % 10) + 48));
                        abs += abs3;
                    }
                }
                if (abs == 0) {
                    sb.setLength(length);
                }
                return true;
            }
            sb.append(this.f25801a);
            return true;
        }
        throw new ArithmeticException();
    }

    public final String toString() {
        String replace = this.f25801a.replace("'", "''");
        return "Offset(" + f25799c[this.f25802b] + ",'" + replace + "')";
    }
}
