package org.java_websocket.exceptions;

public class IncompleteException extends Exception {
    private static final long serialVersionUID = 7330519489840500997L;

    /* renamed from: d */
    private final int f98747d;

    public IncompleteException(int i) {
        this.f98747d = i;
    }

    /* renamed from: a */
    public int mo97331a() {
        return this.f98747d;
    }
}
