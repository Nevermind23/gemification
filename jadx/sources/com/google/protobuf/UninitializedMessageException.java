package com.google.protobuf;

import java.util.List;

public class UninitializedMessageException extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    /* renamed from: d */
    private final List f17826d = null;

    public UninitializedMessageException(C5677h0 h0Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
