package org.java_websocket.exceptions;

public class InvalidDataException extends Exception {
    private static final long serialVersionUID = 3731842424390998726L;

    /* renamed from: d */
    private final int f98749d;

    public InvalidDataException(int i) {
        this.f98749d = i;
    }

    /* renamed from: a */
    public int mo97333a() {
        return this.f98749d;
    }

    public InvalidDataException(int i, String str) {
        super(str);
        this.f98749d = i;
    }

    public InvalidDataException(int i, Throwable th) {
        super(th);
        this.f98749d = i;
    }
}
