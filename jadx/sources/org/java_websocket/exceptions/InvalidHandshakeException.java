package org.java_websocket.exceptions;

import com.facetec.sdk.FaceTecSDK;

public class InvalidHandshakeException extends InvalidDataException {
    private static final long serialVersionUID = -1426533877490484964L;

    public InvalidHandshakeException() {
        super(FaceTecSDK.REQUEST_CODE_SESSION);
    }

    public InvalidHandshakeException(String str) {
        super((int) FaceTecSDK.REQUEST_CODE_SESSION, str);
    }
}
