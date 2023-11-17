package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;

public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {

    /* renamed from: e */
    private final int f17325e;

    public FirebaseRemoteConfigServerException(int i, String str) {
        super(str);
        this.f17325e = i;
    }

    /* renamed from: a */
    public int mo18057a() {
        return this.f17325e;
    }

    public FirebaseRemoteConfigServerException(int i, String str, Throwable th) {
        super(str, th);
        this.f17325e = i;
    }

    public FirebaseRemoteConfigServerException(String str, FirebaseRemoteConfigException.C5433a aVar) {
        super(str, aVar);
        this.f17325e = -1;
    }

    public FirebaseRemoteConfigServerException(int i, String str, FirebaseRemoteConfigException.C5433a aVar) {
        super(str, aVar);
        this.f17325e = i;
    }
}
