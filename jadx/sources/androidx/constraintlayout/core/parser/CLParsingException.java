package androidx.constraintlayout.core.parser;

public class CLParsingException extends Exception {

    /* renamed from: d */
    private final String f2483d;

    /* renamed from: e */
    private final int f2484e;

    /* renamed from: f */
    private final String f2485f;

    /* renamed from: a */
    public String mo2844a() {
        return this.f2483d + " (" + this.f2485f + " at line " + this.f2484e + ")";
    }

    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + mo2844a();
    }
}
