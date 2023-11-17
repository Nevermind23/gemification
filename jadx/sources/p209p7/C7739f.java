package p209p7;

/* renamed from: p7.f */
public abstract class C7739f {
    /* renamed from: a */
    public static byte m29386a(Boolean bool) {
        if (bool != null) {
            return !bool.booleanValue() ? (byte) 0 : 1;
        }
        return -1;
    }

    /* renamed from: b */
    public static Boolean m29387b(byte b) {
        if (b == 0) {
            return Boolean.FALSE;
        }
        if (b != 1) {
            return null;
        }
        return Boolean.TRUE;
    }
}
