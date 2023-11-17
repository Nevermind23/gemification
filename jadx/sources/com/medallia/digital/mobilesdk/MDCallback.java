package com.medallia.digital.mobilesdk;

public interface MDCallback {
    void onError(MDExternalError mDExternalError);

    void onSuccess(String str);
}
