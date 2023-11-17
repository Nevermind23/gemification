package com.google.firebase.remoteconfig;

import com.google.firebase.FirebaseException;

public class FirebaseRemoteConfigException extends FirebaseException {

    /* renamed from: d */
    private final C5433a f17316d;

    /* renamed from: com.google.firebase.remoteconfig.FirebaseRemoteConfigException$a */
    public enum C5433a {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);
        

        /* renamed from: d */
        private final int f17323d;

        private C5433a(int i) {
            this.f17323d = i;
        }
    }

    public FirebaseRemoteConfigException(String str) {
        super(str);
        this.f17316d = C5433a.UNKNOWN;
    }

    public FirebaseRemoteConfigException(String str, Throwable th) {
        super(str, th);
        this.f17316d = C5433a.UNKNOWN;
    }

    public FirebaseRemoteConfigException(String str, C5433a aVar) {
        super(str);
        this.f17316d = aVar;
    }

    public FirebaseRemoteConfigException(String str, Throwable th, C5433a aVar) {
        super(str, th);
        this.f17316d = aVar;
    }
}
