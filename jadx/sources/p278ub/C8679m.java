package p278ub;

/* renamed from: ub.m */
final class C8679m extends C8669c {
    C8679m() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo24024c(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append(3);
            return 1;
        } else if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
            return 1;
        } else if (c >= 'a' && c <= 'z') {
            sb.append((char) ((c - 'a') + 14));
            return 1;
        } else if (c < ' ') {
            sb.append(0);
            sb.append(c);
            return 2;
        } else if (c <= '/') {
            sb.append(1);
            sb.append((char) (c - '!'));
            return 2;
        } else if (c <= '@') {
            sb.append(1);
            sb.append((char) ((c - ':') + 15));
            return 2;
        } else if (c >= '[' && c <= '_') {
            sb.append(1);
            sb.append((char) ((c - '[') + 22));
            return 2;
        } else if (c == '`') {
            sb.append(2);
            sb.append((char) (c - '`'));
            return 2;
        } else if (c <= 'Z') {
            sb.append(2);
            sb.append((char) ((c - 'A') + 1));
            return 2;
        } else if (c <= 127) {
            sb.append(2);
            sb.append((char) ((c - '{') + 27));
            return 2;
        } else {
            sb.append("\u0001\u001e");
            return mo24024c((char) (c - 128), sb) + 2;
        }
    }

    /* renamed from: e */
    public int mo24025e() {
        return 2;
    }
}
