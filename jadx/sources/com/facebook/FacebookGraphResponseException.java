package com.facebook;

public class FacebookGraphResponseException extends FacebookException {

    /* renamed from: d */
    private final C2642h f8119d;

    public FacebookGraphResponseException(C2642h hVar, String str) {
        super(str);
        this.f8119d = hVar;
    }

    public final String toString() {
        FacebookRequestError facebookRequestError;
        C2642h hVar = this.f8119d;
        if (hVar != null) {
            facebookRequestError = hVar.mo8279g();
        } else {
            facebookRequestError = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(" ");
        }
        if (facebookRequestError != null) {
            sb.append("httpResponseCode: ");
            sb.append(facebookRequestError.mo8165h());
            sb.append(", facebookErrorCode: ");
            sb.append(facebookRequestError.mo8160d());
            sb.append(", facebookErrorType: ");
            sb.append(facebookRequestError.mo8163f());
            sb.append(", message: ");
            sb.append(facebookRequestError.mo8162e());
            sb.append("}");
        }
        return sb.toString();
    }
}
