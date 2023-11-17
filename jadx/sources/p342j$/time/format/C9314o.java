package p342j$.time.format;

/* renamed from: j$.time.format.o */
enum C9314o implements C9306g {
    SENSITIVE,
    INSENSITIVE,
    STRICT,
    LENIENT;

    /* renamed from: a */
    public final boolean mo25039a(C9321v vVar, StringBuilder sb) {
        return true;
    }

    public final String toString() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return "ParseCaseSensitive(true)";
        }
        if (ordinal == 1) {
            return "ParseCaseSensitive(false)";
        }
        if (ordinal == 2) {
            return "ParseStrict(true)";
        }
        if (ordinal == 3) {
            return "ParseStrict(false)";
        }
        throw new IllegalStateException("Unreachable");
    }
}
