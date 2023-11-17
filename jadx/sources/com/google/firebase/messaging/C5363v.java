package com.google.firebase.messaging;

import com.google.firebase.messaging.C5349p0;
import com.google.firebase.messaging.C5358t0;
import p337z7.Task;

/* renamed from: com.google.firebase.messaging.v */
public final /* synthetic */ class C5363v implements C5349p0.C5350a {

    /* renamed from: a */
    public final /* synthetic */ FirebaseMessaging f17110a;

    /* renamed from: b */
    public final /* synthetic */ String f17111b;

    /* renamed from: c */
    public final /* synthetic */ C5358t0.C5359a f17112c;

    public /* synthetic */ C5363v(FirebaseMessaging firebaseMessaging, String str, C5358t0.C5359a aVar) {
        this.f17110a = firebaseMessaging;
        this.f17111b = str;
        this.f17112c = aVar;
    }

    public final Task start() {
        return this.f17110a.m20935u(this.f17111b, this.f17112c);
    }
}
