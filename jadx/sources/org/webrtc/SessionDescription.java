package org.webrtc;

public class SessionDescription {

    /* renamed from: a */
    public final C42060a f98894a;

    /* renamed from: b */
    public final String f98895b;

    /* renamed from: org.webrtc.SessionDescription$a */
    public enum C42060a {
        OFFER,
        PRANSWER,
        ANSWER,
        ROLLBACK
    }

    public SessionDescription(C42060a aVar, String str) {
        this.f98894a = aVar;
        this.f98895b = str;
    }
}
