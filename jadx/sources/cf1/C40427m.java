package cf1;

/* renamed from: cf1.m */
final class C40427m {

    /* renamed from: a */
    public static final C40427m f96036a = new C40427m();

    /* renamed from: b */
    public static final C40419j f96037b;

    static {
        String str = "[eE][+-]?" + "(\\p{Digit}+)";
        f96037b = new C40419j("[\\x00-\\x20]*[+-]?(NaN|Infinity|((" + ('(' + "(\\p{Digit}+)" + "(\\.)?(" + "(\\p{Digit}+)" + "?)(" + str + ")?)|(\\.(" + "(\\p{Digit}+)" + ")(" + str + ")?)|((" + ("(0[xX]" + "(\\p{XDigit}+)" + "(\\.)?)|(0[xX]" + "(\\p{XDigit}+)" + "?(\\.)" + "(\\p{XDigit}+)" + ')') + ")[pP][+-]?" + "(\\p{Digit}+)" + ')') + ")[fFdD]?))[\\x00-\\x20]*");
    }

    private C40427m() {
    }
}
