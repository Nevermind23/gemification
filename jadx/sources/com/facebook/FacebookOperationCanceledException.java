package com.facebook;

public class FacebookOperationCanceledException extends FacebookException {
    static final long serialVersionUID = 1;

    public FacebookOperationCanceledException() {
    }

    public FacebookOperationCanceledException(String str) {
        super(str);
    }
}
