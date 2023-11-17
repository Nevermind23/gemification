package org.java_websocket.exceptions;

public class LimitExceededException extends InvalidDataException {
    private static final long serialVersionUID = 6908339749836826785L;

    /* renamed from: e */
    private final int f98750e;

    public LimitExceededException() {
        this(Integer.MAX_VALUE);
    }

    /* renamed from: b */
    public int mo97334b() {
        return this.f98750e;
    }

    public LimitExceededException(int i) {
        super(1009);
        this.f98750e = i;
    }

    public LimitExceededException(String str, int i) {
        super(1009, str);
        this.f98750e = i;
    }

    public LimitExceededException(String str) {
        this(str, Integer.MAX_VALUE);
    }
}
