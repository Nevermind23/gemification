package org.java_websocket.exceptions;

import com.facetec.sdk.FaceTecSDK;

public class InvalidFrameException extends InvalidDataException {
    private static final long serialVersionUID = -9016496369828887591L;

    public InvalidFrameException() {
        super(FaceTecSDK.REQUEST_CODE_SESSION);
    }

    public InvalidFrameException(String str) {
        super((int) FaceTecSDK.REQUEST_CODE_SESSION, str);
    }
}
