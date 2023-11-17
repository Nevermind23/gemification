package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;

public class FirebaseRemoteConfigClientException extends FirebaseRemoteConfigException {
    public FirebaseRemoteConfigClientException(String str) {
        super(str);
    }

    public FirebaseRemoteConfigClientException(String str, Throwable th) {
        super(str, th);
    }

    public FirebaseRemoteConfigClientException(String str, FirebaseRemoteConfigException.C5433a aVar) {
        super(str, aVar);
    }

    public FirebaseRemoteConfigClientException(String str, Throwable th, FirebaseRemoteConfigException.C5433a aVar) {
        super(str, th, aVar);
    }
}
