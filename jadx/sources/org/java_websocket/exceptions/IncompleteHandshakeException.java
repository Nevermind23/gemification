package org.java_websocket.exceptions;

public class IncompleteHandshakeException extends RuntimeException {
    private static final long serialVersionUID = 7906596804233893092L;

    /* renamed from: d */
    private final int f98748d;

    public IncompleteHandshakeException(int i) {
        this.f98748d = i;
    }

    /* renamed from: a */
    public int mo97332a() {
        return this.f98748d;
    }

    public IncompleteHandshakeException() {
        this.f98748d = 0;
    }
}
